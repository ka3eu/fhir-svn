package org.hl7.fhir.instance.client;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.hl7.fhir.instance.formats.IParser;
import org.hl7.fhir.instance.formats.IParser.OutputStyle;
import org.hl7.fhir.instance.formats.JsonParser;
import org.hl7.fhir.instance.formats.XmlParser;
import org.hl7.fhir.instance.model.Bundle;
import org.hl7.fhir.instance.model.OperationOutcome;
import org.hl7.fhir.instance.model.OperationOutcome.IssueSeverity;
import org.hl7.fhir.instance.model.OperationOutcome.OperationOutcomeIssueComponent;
import org.hl7.fhir.instance.model.Resource;
import org.hl7.fhir.instance.model.ResourceType;
import org.hl7.fhir.instance.utils.ResourceUtilities;

/**
 * Helper class handling lower level HTTP transport concerns.
 * TODO Document methods.
 * @author Claude Nanjo
 */
public class ClientUtils {
	
	public static String DEFAULT_CHARSET = "UTF-8";
	public static final String HEADER_LOCATION = "location";
	
	public static <T extends Resource> ResourceRequest<T> issueOptionsRequest(URI optionsUri, String resourceFormat, HttpHost proxy) {
		HttpOptions options = new HttpOptions(optionsUri);
		return issueResourceRequest(resourceFormat, options, proxy);
	}
	
	public static <T extends Resource> ResourceRequest<T> issueGetResourceRequest(URI resourceUri, String resourceFormat, HttpHost proxy) {
		HttpGet httpget = new HttpGet(resourceUri);
		return issueResourceRequest(resourceFormat, httpget, proxy);
	}
	
	public static <T extends Resource> ResourceRequest<T> issuePutRequest(URI resourceUri, byte[] payload, String resourceFormat, List<Header> headers, HttpHost proxy) {
		HttpPut httpPut = new HttpPut(resourceUri);
		return issueResourceRequest(resourceFormat, httpPut, payload, headers, proxy);
	}
	
	public static <T extends Resource> ResourceRequest<T> issuePutRequest(URI resourceUri, byte[] payload, String resourceFormat, HttpHost proxy) {
		HttpPut httpPut = new HttpPut(resourceUri);
		return issueResourceRequest(resourceFormat, httpPut, payload, null, proxy);
	}
	
	public static <T extends Resource> ResourceRequest<T> issuePostRequest(URI resourceUri, byte[] payload, String resourceFormat, List<Header> headers, HttpHost proxy) {
		HttpPost httpPost = new HttpPost(resourceUri);
		return issueResourceRequest(resourceFormat, httpPost, payload, headers, proxy);
	}
	
	
	public static <T extends Resource> ResourceRequest<T> issuePostRequest(URI resourceUri, byte[] payload, String resourceFormat, HttpHost proxy) {
		return issuePostRequest(resourceUri, payload, resourceFormat, null, proxy);
	}
	
	public static Bundle issueGetFeedRequest(URI resourceUri, String feedFormat, HttpHost proxy) {
		HttpGet httpget = new HttpGet(resourceUri);
		configureFhirRequest(httpget, feedFormat);
		HttpResponse response = sendRequest(httpget, proxy);
		return unmarshalReference(response, feedFormat);
	}
	
	public static Bundle postBatchRequest(URI resourceUri, byte[] payload, String feedFormat, HttpHost proxy) {
		HttpPost httpPost = new HttpPost(resourceUri);
		configureFhirRequest(httpPost, feedFormat);
		HttpResponse response = sendPayload(httpPost, payload, proxy);
        return unmarshalFeed(response, feedFormat);
	}
	
	public static boolean issueDeleteRequest(URI resourceUri, HttpHost proxy) {
		HttpDelete deleteRequest = new HttpDelete(resourceUri);
		HttpResponse response = sendRequest(deleteRequest, proxy);
		int responseStatusCode = response.getStatusLine().getStatusCode();
		boolean deletionSuccessful = false;
		if(responseStatusCode == 204) {
			deletionSuccessful = true;
		}
		return deletionSuccessful;
	}
		
	/***********************************************************
	 * Request/Response Helper methods
	 ***********************************************************/
	
	protected static <T extends Resource> ResourceRequest<T> issueResourceRequest(String resourceFormat, HttpUriRequest request, HttpHost proxy) {
		return issueResourceRequest(resourceFormat, request, null, proxy);
	}
	
	/**
	 * @param resourceFormat
	 * @param options
	 * @return
	 */
	protected static <T extends Resource> ResourceRequest<T> issueResourceRequest(String resourceFormat, HttpUriRequest request, byte[] payload, HttpHost proxy) {
		return issueResourceRequest(resourceFormat, request, payload, null, proxy);
	}
	
	/**
	 * @param resourceFormat
	 * @param options
	 * @return
	 */
	protected static <T extends Resource> ResourceRequest<T> issueResourceRequest(String resourceFormat, HttpUriRequest request, byte[] payload, List<Header> headers, HttpHost proxy) {
		configureFhirRequest(request, resourceFormat, headers);
		HttpResponse response = null;
		if(request instanceof HttpEntityEnclosingRequest && payload != null) {
			response = sendPayload((HttpEntityEnclosingRequestBase)request, payload, proxy);
		} else if (request instanceof HttpEntityEnclosingRequest && payload == null){
			throw new EFhirClientException("PUT and POST requests require a non-null payload");
		} else {
			response = sendRequest(request, proxy);
		}
		T resource = unmarshalReference(response, resourceFormat);
		return new ResourceRequest<T>(resource, response.getStatusLine().getStatusCode(), ClientUtils.getLocationHeader(response));
	}
	
		
	/**
	 * Method adds required request headers.
	 * TODO handle JSON request as well.
	 * 
	 * @param request
	 */
	protected static void configureFhirRequest(HttpRequest request, String format) {
		configureFhirRequest(request, format, null);
	}
	
	/**
	 * Method adds required request headers.
	 * TODO handle JSON request as well.
	 * 
	 * @param request
	 */
		protected static void configureFhirRequest(HttpRequest request, String format, List<Header> headers) {
		request.addHeader("User-Agent", "Java FHIR Client for FHIR");

		if (format != null) {		
		request.addHeader("Accept",format);
		request.addHeader("Content-Type", format + ";charset=" + DEFAULT_CHARSET);
		}
		request.addHeader("Accept-Charset", DEFAULT_CHARSET);
		if(headers != null) {
			for(Header header : headers) {
				request.addHeader(header);
			}
		}
	}
	
	/**
	 * Method posts request payload
	 * 
	 * @param request
	 * @param payload
	 * @return
	 */
	protected static HttpResponse sendPayload(HttpEntityEnclosingRequestBase request, byte[] payload, HttpHost proxy) {
		HttpResponse response = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			if(proxy != null) {
				httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
			}
			request.setEntity(new ByteArrayEntity(payload));
			response = httpclient.execute(request);
		} catch(IOException ioe) {
			throw new EFhirClientException("Error sending HTTP Post/Put Payload", ioe);
		}
		return response;
	}
	
	/**
	 * 
	 * @param request
	 * @param payload
	 * @return
	 */
	protected static HttpResponse sendRequest(HttpUriRequest request, HttpHost proxy) {
		HttpResponse response = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			if(proxy != null) {
				httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
			}
			response = httpclient.execute(request);
		} catch(IOException ioe) {
			throw new EFhirClientException("Error sending Http Request", ioe);
		}
		return response;
	}
	
	/**
	 * Unmarshals a resource from the response stream.
	 * 
	 * @param response
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected static <T extends Resource> T unmarshalReference(HttpResponse response, String format) {
		T resource = null;
		OperationOutcome error = null;
		InputStream instream = null;
		HttpEntity entity = response.getEntity();
		if (entity != null && entity.getContentLength() > 0) {
			try {
			    instream = entity.getContent();
//			    System.out.println(writeInputStreamAsString(instream));
			    resource = (T)getParser(format).parse(instream);
	    		if (resource instanceof OperationOutcome && hasError((OperationOutcome)resource)) {
	    			error = (OperationOutcome) resource;
	    		}
			} catch(IOException ioe) {
				throw new EFhirClientException("Error unmarshalling entity from Http Response", ioe);
			} catch(Exception e) {
				throw new EFhirClientException("Error parsing response message", e);
			} finally {
				try{instream.close();}catch(IOException ioe){/* TODO log error */}
			}
		}
		if(error != null) {
			throw new EFhirClientException("Error unmarshalling resource: "+ResourceUtilities.getErrorDescription(error), error);
		}
		return resource;
	}
	
	/**
	 * Unmarshals Bundle from response stream.
	 * 
	 * @param response
	 * @return
	 */
	protected static Bundle unmarshalFeed(HttpResponse response, String format) {
		Bundle feed = null;
		InputStream instream = null;
		HttpEntity entity = response.getEntity();
		String contentType = response.getHeaders("Content-Type")[0].getValue();
		OperationOutcome error = null;
		try {
			if (entity != null) {
			    instream = entity.getContent();
			    if(contentType.contains(ResourceFormat.RESOURCE_XML.getHeader()) || contentType.contains("text/xml+fhir")) {
			    	error = (OperationOutcome)getParser(ResourceFormat.RESOURCE_XML.getHeader()).parse(instream);
			    } else {
			    	Resource rf = getParser(format).parse(instream);
			    	if (rf instanceof OperationOutcome && hasError((OperationOutcome) rf)) {
			    		error = (OperationOutcome) rf;
			    	} else {
			    		throw new EFhirClientException("Error unmarshalling feed from Http Response: a resource was returned instead");
			    	}
			    }
			    instream.close();
			}
		} catch(IOException ioe) {
			throw new EFhirClientException("Error unmarshalling feed from Http Response", ioe);
		} catch(Exception e) {
			throw new EFhirClientException("Error parsing response message", e);
		} finally {
			try{instream.close();}catch(IOException ioe){/* TODO log error */}
		}
		if(error != null) {
			throw new EFhirClientException("Error unmarshalling feed: "+ResourceUtilities.getErrorDescription(error), error);
		}
		return feed;
	}
	
	private static boolean hasError(OperationOutcome oo) {
		for (OperationOutcomeIssueComponent t : oo.getIssue())
			if (t.getSeverity() == IssueSeverity.ERROR || t.getSeverity() == IssueSeverity.FATAL)
				return true;
	  return false;
  }

	protected static String getLocationHeader(HttpResponse response) {
		String location = null;
		if(response.getHeaders("location").length > 0) {//TODO Distinguish between both cases if necessary
    		location = response.getHeaders("location")[0].getValue();
    	} else if(response.getHeaders("content-location").length > 0) {
    		location = response.getHeaders("content-location")[0].getValue();
    	}
		return location;
	}
	

	/*****************************************************************
	 * Client connection methods
	 * ***************************************************************/
	
	public static HttpURLConnection buildConnection(URI baseServiceUri, String tail) {
		try {
			HttpURLConnection client = (HttpURLConnection) baseServiceUri.resolve(tail).toURL().openConnection();
			return client;
		} catch(MalformedURLException mue) {
			throw new EFhirClientException("Invalid Service URL", mue);
		} catch(IOException ioe) {
			throw new EFhirClientException("Unable to establish connection to server: " + baseServiceUri.toString() + tail, ioe);
		}
	}
	
	public static HttpURLConnection buildConnection(URI baseServiceUri, ResourceType resourceType, String id) {
		return buildConnection(baseServiceUri, ResourceAddress.buildRelativePathFromResourceType(resourceType, id));
	}
	
	/******************************************************************
	 * Other general helper methods
	 * ****************************************************************/
	 

	public  static <T extends Resource>  byte[] getResourceAsByteArray(T resource, boolean pretty, boolean isJson) {
		ByteArrayOutputStream baos = null;
		byte[] byteArray = null;
		try {
			baos = new ByteArrayOutputStream();
			IParser parser = null;
			if(isJson) {
				parser = new JsonParser();
			} else {
				parser = new XmlParser();
			}
      parser.setOutputStyle(pretty ? OutputStyle.PRETTY : OutputStyle.NORMAL);
			parser.compose(baos, resource);
			baos.close();
			byteArray =  baos.toByteArray();
			baos.close();
		} catch (Exception e) {
			try{
				baos.close();
			}catch(Exception ex) {
				throw new EFhirClientException("Error closing output stream", ex);
			}
			throw new EFhirClientException("Error converting output stream to byte array", e);
		}
		return byteArray;
	}
	
	public  static byte[] getFeedAsByteArray(Bundle feed, boolean pretty, boolean isJson) {
		ByteArrayOutputStream baos = null;
		byte[] byteArray = null;
		try {
			baos = new ByteArrayOutputStream();
			IParser parser = null;
			if(isJson) {
				parser = new JsonParser();
			} else {
				parser = new XmlParser();
			}
      parser.setOutputStyle(pretty ? OutputStyle.PRETTY : OutputStyle.NORMAL);
			parser.compose(baos, feed);
			baos.close();
			byteArray =  baos.toByteArray();
			baos.close();
		} catch (Exception e) {
			try{
				baos.close();
			}catch(Exception ex) {
				throw new EFhirClientException("Error closing output stream", ex);
			}
			throw new EFhirClientException("Error converting output stream to byte array", e);
		}
		return byteArray;
	}
	
	public static Calendar getLastModifiedResponseHeaderAsCalendarObject(URLConnection serverConnection) {
		String dateTime = null;
		try {
			dateTime = serverConnection.getHeaderField("Last-Modified");
			SimpleDateFormat format = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
			Date lastModifiedTimestamp = format.parse(dateTime);
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(lastModifiedTimestamp);
			return calendar;
		} catch(ParseException pe) {
			throw new EFhirClientException("Error parsing Last-Modified response header " + dateTime, pe);
		}
	}
	
	protected static IParser getParser(String format) {
		if(StringUtils.isBlank(format)) {
			format = ResourceFormat.RESOURCE_XML.getHeader();
		}
		if(format.equalsIgnoreCase("json") || format.equalsIgnoreCase(ResourceFormat.RESOURCE_JSON.getHeader()) || format.equalsIgnoreCase(FeedFormat.FEED_JSON.getHeader())) {
			return new JsonParser();
		} else if(format.equalsIgnoreCase("xml") || format.equalsIgnoreCase(ResourceFormat.RESOURCE_XML.getHeader()) || format.equalsIgnoreCase(FeedFormat.FEED_XML.getHeader())) {
			return new XmlParser();
		} else {
			throw new EFhirClientException("Invalid format: " + format);
		}
	}
	
	/**
	 * Used for debugging
	 * 
	 * @param instream
	 * @return
	 */
	protected static String writeInputStreamAsString(InputStream instream) {
		String value = null;
		try {
			value = IOUtils.toString(instream, "UTF-8");
			System.out.println(value);
			
		} catch(IOException ioe) {
			//Do nothing
		}
		return value;
	}
	
  public static Bundle issuePostFeedRequest(URI resourceUri, Map<String, String> parameters, String resourceName, Resource resource, String feedFormat) throws Exception {
    HttpPost httppost = new HttpPost(resourceUri);
    String boundary = "----WebKitFormBoundarykbMUo6H8QaUnYtRy";
    httppost.addHeader("Content-Type", "multipart/form-data; boundary="+boundary);
    httppost.addHeader("Accept", feedFormat);
    configureFhirRequest(httppost, null);
    HttpResponse response = sendPayload(httppost, encodeFormSubmission(parameters, resourceName, resource, boundary));
    return unmarshalFeed(response, feedFormat);
  }
  
  private static byte[] encodeFormSubmission(Map<String, String> parameters, String resourceName, Resource resource, String boundary) throws Exception {
    ByteArrayOutputStream b = new ByteArrayOutputStream();
    OutputStreamWriter w = new OutputStreamWriter(b, "UTF-8");  
    for (String name : parameters.keySet()) {
      w.write("--");
      w.write(boundary);
      w.write("\r\nContent-Disposition: form-data; name=\""+name+"\"\r\n\r\n");
      w.write(parameters.get(name)+"\r\n");
    }
    w.write("--");
    w.write(boundary);
    w.write("\r\nContent-Disposition: form-data; name=\""+resourceName+"\"\r\n\r\n");
    w.close(); 
    JsonParser json = new JsonParser();
    json.setOutputStyle(OutputStyle.NORMAL);
    json.compose(b, resource);
    b.close();
    w = new OutputStreamWriter(b, "UTF-8");  
    w.write("\r\n--");
    w.write(boundary);
    w.write("--");
    w.close();
    return b.toByteArray();
  }

  /**
   * Method posts request payload
   * 
   * @param request
   * @param payload
   * @return
   */
  protected static HttpResponse sendPayload(HttpEntityEnclosingRequestBase request, byte[] payload) {
    HttpResponse response = null;
    try {
      HttpClient httpclient = new DefaultHttpClient();
      request.setEntity(new ByteArrayEntity(payload));
      response = httpclient.execute(request);
    } catch(IOException ioe) {
      throw new EFhirClientException("Error sending HTTP Post/Put Payload: "+ioe.getMessage(), ioe);
    }
    return response;
  }
  

}
