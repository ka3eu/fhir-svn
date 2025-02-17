package org.hl7.fhir.instance.model;

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

// Generated on Thu, Jul 23, 2015 11:36+1000 for FHIR v0.5.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.instance.model.Enumerations.*;
import org.hl7.fhir.instance.model.annotations.ResourceDef;
import org.hl7.fhir.instance.model.annotations.SearchParamDefinition;
import org.hl7.fhir.instance.model.annotations.Child;
import org.hl7.fhir.instance.model.annotations.Description;
import org.hl7.fhir.instance.model.annotations.Block;
import org.hl7.fhir.instance.model.api.*;
/**
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 */
@ResourceDef(name="Conformance", profile="http://hl7.org/fhir/Profile/Conformance")
public class Conformance extends DomainResource implements IBaseConformance {

    public enum RestfulConformanceMode {
        /**
         * The application acts as a client for this resource
         */
        CLIENT, 
        /**
         * The application acts as a server for this resource
         */
        SERVER, 
        /**
         * added to help the parsers
         */
        NULL;
        public static RestfulConformanceMode fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("client".equals(codeString))
          return CLIENT;
        if ("server".equals(codeString))
          return SERVER;
        throw new Exception("Unknown RestfulConformanceMode code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case CLIENT: return "client";
            case SERVER: return "server";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case CLIENT: return "http://hl7.org/fhir/restful-conformance-mode";
            case SERVER: return "http://hl7.org/fhir/restful-conformance-mode";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case CLIENT: return "The application acts as a client for this resource";
            case SERVER: return "The application acts as a server for this resource";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case CLIENT: return "Client";
            case SERVER: return "Server";
            default: return "?";
          }
        }
    }

  public static class RestfulConformanceModeEnumFactory implements EnumFactory<RestfulConformanceMode> {
    public RestfulConformanceMode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("client".equals(codeString))
          return RestfulConformanceMode.CLIENT;
        if ("server".equals(codeString))
          return RestfulConformanceMode.SERVER;
        throw new IllegalArgumentException("Unknown RestfulConformanceMode code '"+codeString+"'");
        }
    public String toCode(RestfulConformanceMode code) {
      if (code == RestfulConformanceMode.CLIENT)
        return "client";
      if (code == RestfulConformanceMode.SERVER)
        return "server";
      return "?";
      }
    }

    public enum TypeRestfulInteraction {
        /**
         * null
         */
        READ, 
        /**
         * null
         */
        VREAD, 
        /**
         * null
         */
        UPDATE, 
        /**
         * null
         */
        DELETE, 
        /**
         * null
         */
        HISTORYINSTANCE, 
        /**
         * null
         */
        VALIDATE, 
        /**
         * null
         */
        HISTORYTYPE, 
        /**
         * null
         */
        CREATE, 
        /**
         * null
         */
        SEARCHTYPE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static TypeRestfulInteraction fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("read".equals(codeString))
          return READ;
        if ("vread".equals(codeString))
          return VREAD;
        if ("update".equals(codeString))
          return UPDATE;
        if ("delete".equals(codeString))
          return DELETE;
        if ("history-instance".equals(codeString))
          return HISTORYINSTANCE;
        if ("validate".equals(codeString))
          return VALIDATE;
        if ("history-type".equals(codeString))
          return HISTORYTYPE;
        if ("create".equals(codeString))
          return CREATE;
        if ("search-type".equals(codeString))
          return SEARCHTYPE;
        throw new Exception("Unknown TypeRestfulInteraction code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case READ: return "read";
            case VREAD: return "vread";
            case UPDATE: return "update";
            case DELETE: return "delete";
            case HISTORYINSTANCE: return "history-instance";
            case VALIDATE: return "validate";
            case HISTORYTYPE: return "history-type";
            case CREATE: return "create";
            case SEARCHTYPE: return "search-type";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case READ: return "http://hl7.org/fhir/restful-interaction";
            case VREAD: return "http://hl7.org/fhir/restful-interaction";
            case UPDATE: return "http://hl7.org/fhir/restful-interaction";
            case DELETE: return "http://hl7.org/fhir/restful-interaction";
            case HISTORYINSTANCE: return "http://hl7.org/fhir/restful-interaction";
            case VALIDATE: return "http://hl7.org/fhir/restful-interaction";
            case HISTORYTYPE: return "http://hl7.org/fhir/restful-interaction";
            case CREATE: return "http://hl7.org/fhir/restful-interaction";
            case SEARCHTYPE: return "http://hl7.org/fhir/restful-interaction";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case READ: return "";
            case VREAD: return "";
            case UPDATE: return "";
            case DELETE: return "";
            case HISTORYINSTANCE: return "";
            case VALIDATE: return "";
            case HISTORYTYPE: return "";
            case CREATE: return "";
            case SEARCHTYPE: return "";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case READ: return "read";
            case VREAD: return "vread";
            case UPDATE: return "update";
            case DELETE: return "delete";
            case HISTORYINSTANCE: return "history-instance";
            case VALIDATE: return "validate";
            case HISTORYTYPE: return "history-type";
            case CREATE: return "create";
            case SEARCHTYPE: return "search-type";
            default: return "?";
          }
        }
    }

  public static class TypeRestfulInteractionEnumFactory implements EnumFactory<TypeRestfulInteraction> {
    public TypeRestfulInteraction fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("read".equals(codeString))
          return TypeRestfulInteraction.READ;
        if ("vread".equals(codeString))
          return TypeRestfulInteraction.VREAD;
        if ("update".equals(codeString))
          return TypeRestfulInteraction.UPDATE;
        if ("delete".equals(codeString))
          return TypeRestfulInteraction.DELETE;
        if ("history-instance".equals(codeString))
          return TypeRestfulInteraction.HISTORYINSTANCE;
        if ("validate".equals(codeString))
          return TypeRestfulInteraction.VALIDATE;
        if ("history-type".equals(codeString))
          return TypeRestfulInteraction.HISTORYTYPE;
        if ("create".equals(codeString))
          return TypeRestfulInteraction.CREATE;
        if ("search-type".equals(codeString))
          return TypeRestfulInteraction.SEARCHTYPE;
        throw new IllegalArgumentException("Unknown TypeRestfulInteraction code '"+codeString+"'");
        }
    public String toCode(TypeRestfulInteraction code) {
      if (code == TypeRestfulInteraction.READ)
        return "read";
      if (code == TypeRestfulInteraction.VREAD)
        return "vread";
      if (code == TypeRestfulInteraction.UPDATE)
        return "update";
      if (code == TypeRestfulInteraction.DELETE)
        return "delete";
      if (code == TypeRestfulInteraction.HISTORYINSTANCE)
        return "history-instance";
      if (code == TypeRestfulInteraction.VALIDATE)
        return "validate";
      if (code == TypeRestfulInteraction.HISTORYTYPE)
        return "history-type";
      if (code == TypeRestfulInteraction.CREATE)
        return "create";
      if (code == TypeRestfulInteraction.SEARCHTYPE)
        return "search-type";
      return "?";
      }
    }

    public enum ResourceVersionPolicy {
        /**
         * VersionId meta-property is not suppoerted (server) or used (client)
         */
        NOVERSION, 
        /**
         * VersionId meta-property is suppoerted (server) or used (client)
         */
        VERSIONED, 
        /**
         * VersionId is must be correct for updates (server) or will be specified (If-match header) for updates (client)
         */
        VERSIONEDUPDATE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ResourceVersionPolicy fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("no-version".equals(codeString))
          return NOVERSION;
        if ("versioned".equals(codeString))
          return VERSIONED;
        if ("versioned-update".equals(codeString))
          return VERSIONEDUPDATE;
        throw new Exception("Unknown ResourceVersionPolicy code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case NOVERSION: return "no-version";
            case VERSIONED: return "versioned";
            case VERSIONEDUPDATE: return "versioned-update";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case NOVERSION: return "http://hl7.org/fhir/versioning-policy";
            case VERSIONED: return "http://hl7.org/fhir/versioning-policy";
            case VERSIONEDUPDATE: return "http://hl7.org/fhir/versioning-policy";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case NOVERSION: return "VersionId meta-property is not suppoerted (server) or used (client)";
            case VERSIONED: return "VersionId meta-property is suppoerted (server) or used (client)";
            case VERSIONEDUPDATE: return "VersionId is must be correct for updates (server) or will be specified (If-match header) for updates (client)";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case NOVERSION: return "No VersionId Support";
            case VERSIONED: return "Versioned";
            case VERSIONEDUPDATE: return "VersionId tracked fully";
            default: return "?";
          }
        }
    }

  public static class ResourceVersionPolicyEnumFactory implements EnumFactory<ResourceVersionPolicy> {
    public ResourceVersionPolicy fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("no-version".equals(codeString))
          return ResourceVersionPolicy.NOVERSION;
        if ("versioned".equals(codeString))
          return ResourceVersionPolicy.VERSIONED;
        if ("versioned-update".equals(codeString))
          return ResourceVersionPolicy.VERSIONEDUPDATE;
        throw new IllegalArgumentException("Unknown ResourceVersionPolicy code '"+codeString+"'");
        }
    public String toCode(ResourceVersionPolicy code) {
      if (code == ResourceVersionPolicy.NOVERSION)
        return "no-version";
      if (code == ResourceVersionPolicy.VERSIONED)
        return "versioned";
      if (code == ResourceVersionPolicy.VERSIONEDUPDATE)
        return "versioned-update";
      return "?";
      }
    }

    public enum ConditionalDeleteStatus {
        /**
         * No support for conditional deletes
         */
        NOTSUPPORTED, 
        /**
         * Conditional deletes are supported, but only single resources at a time
         */
        SINGLE, 
        /**
         * Conditional deletes are supported, and multiple resources can be deleted in a single interaction
         */
        MULTIPLE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ConditionalDeleteStatus fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-supported".equals(codeString))
          return NOTSUPPORTED;
        if ("single".equals(codeString))
          return SINGLE;
        if ("multiple".equals(codeString))
          return MULTIPLE;
        throw new Exception("Unknown ConditionalDeleteStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case NOTSUPPORTED: return "not-supported";
            case SINGLE: return "single";
            case MULTIPLE: return "multiple";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case NOTSUPPORTED: return "http://hl7.org/fhir/conditional-delete-status";
            case SINGLE: return "http://hl7.org/fhir/conditional-delete-status";
            case MULTIPLE: return "http://hl7.org/fhir/conditional-delete-status";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case NOTSUPPORTED: return "No support for conditional deletes";
            case SINGLE: return "Conditional deletes are supported, but only single resources at a time";
            case MULTIPLE: return "Conditional deletes are supported, and multiple resources can be deleted in a single interaction";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case NOTSUPPORTED: return "Not Supported";
            case SINGLE: return "Single Deletes Supported";
            case MULTIPLE: return "Multiple Deletes Supported";
            default: return "?";
          }
        }
    }

  public static class ConditionalDeleteStatusEnumFactory implements EnumFactory<ConditionalDeleteStatus> {
    public ConditionalDeleteStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-supported".equals(codeString))
          return ConditionalDeleteStatus.NOTSUPPORTED;
        if ("single".equals(codeString))
          return ConditionalDeleteStatus.SINGLE;
        if ("multiple".equals(codeString))
          return ConditionalDeleteStatus.MULTIPLE;
        throw new IllegalArgumentException("Unknown ConditionalDeleteStatus code '"+codeString+"'");
        }
    public String toCode(ConditionalDeleteStatus code) {
      if (code == ConditionalDeleteStatus.NOTSUPPORTED)
        return "not-supported";
      if (code == ConditionalDeleteStatus.SINGLE)
        return "single";
      if (code == ConditionalDeleteStatus.MULTIPLE)
        return "multiple";
      return "?";
      }
    }

    public enum SearchModifierCode {
        /**
         * The search parameter returns resources that have a value or not
         */
        MISSING, 
        /**
         * The search parameter returns resources that have a value that exactly matches the supplied parameter (the whole string, including casing and accents)
         */
        EXACT, 
        /**
         * The search parameter returns resources that include the supplied parameter value anywhere within the field being searched
         */
        CONTAINS, 
        /**
         * The search parameter returns resources that do not contain a match
         */
        NOT, 
        /**
         * The search parameter is processed as a string that searches text associated with the code/value - either CodeableConcept.text, Coding.display, or Identifier.type.text
         */
        TEXT, 
        /**
         * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is in the specified value set.
         */
        IN, 
        /**
         * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is not in the specified value set
         */
        NOTIN, 
        /**
         * The search parameter tests whether the value in a resource is subsumed by the specified value (is-a, or heirarchical relationships)
         */
        BELOW, 
        /**
         * The search parameter tests whether the value in a resource subsumes the specified value (is-a, or heirarchical relationships)
         */
        ABOVE, 
        /**
         * The search parameter only applies to the Resource Type specified as a modifier (e.g. the modifier is not actually :type, but :Patient etc)
         */
        TYPE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static SearchModifierCode fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("missing".equals(codeString))
          return MISSING;
        if ("exact".equals(codeString))
          return EXACT;
        if ("contains".equals(codeString))
          return CONTAINS;
        if ("not".equals(codeString))
          return NOT;
        if ("text".equals(codeString))
          return TEXT;
        if ("in".equals(codeString))
          return IN;
        if ("not-in".equals(codeString))
          return NOTIN;
        if ("below".equals(codeString))
          return BELOW;
        if ("above".equals(codeString))
          return ABOVE;
        if ("type".equals(codeString))
          return TYPE;
        throw new Exception("Unknown SearchModifierCode code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case MISSING: return "missing";
            case EXACT: return "exact";
            case CONTAINS: return "contains";
            case NOT: return "not";
            case TEXT: return "text";
            case IN: return "in";
            case NOTIN: return "not-in";
            case BELOW: return "below";
            case ABOVE: return "above";
            case TYPE: return "type";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case MISSING: return "http://hl7.org/fhir/search-modifier-code";
            case EXACT: return "http://hl7.org/fhir/search-modifier-code";
            case CONTAINS: return "http://hl7.org/fhir/search-modifier-code";
            case NOT: return "http://hl7.org/fhir/search-modifier-code";
            case TEXT: return "http://hl7.org/fhir/search-modifier-code";
            case IN: return "http://hl7.org/fhir/search-modifier-code";
            case NOTIN: return "http://hl7.org/fhir/search-modifier-code";
            case BELOW: return "http://hl7.org/fhir/search-modifier-code";
            case ABOVE: return "http://hl7.org/fhir/search-modifier-code";
            case TYPE: return "http://hl7.org/fhir/search-modifier-code";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case MISSING: return "The search parameter returns resources that have a value or not";
            case EXACT: return "The search parameter returns resources that have a value that exactly matches the supplied parameter (the whole string, including casing and accents)";
            case CONTAINS: return "The search parameter returns resources that include the supplied parameter value anywhere within the field being searched";
            case NOT: return "The search parameter returns resources that do not contain a match";
            case TEXT: return "The search parameter is processed as a string that searches text associated with the code/value - either CodeableConcept.text, Coding.display, or Identifier.type.text";
            case IN: return "The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is in the specified value set.";
            case NOTIN: return "The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is not in the specified value set";
            case BELOW: return "The search parameter tests whether the value in a resource is subsumed by the specified value (is-a, or heirarchical relationships)";
            case ABOVE: return "The search parameter tests whether the value in a resource subsumes the specified value (is-a, or heirarchical relationships)";
            case TYPE: return "The search parameter only applies to the Resource Type specified as a modifier (e.g. the modifier is not actually :type, but :Patient etc)";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case MISSING: return "Missing";
            case EXACT: return "Exact";
            case CONTAINS: return "Contains";
            case NOT: return "Not";
            case TEXT: return "Text";
            case IN: return "In";
            case NOTIN: return "Not In";
            case BELOW: return "Below";
            case ABOVE: return "Above";
            case TYPE: return "Type";
            default: return "?";
          }
        }
    }

  public static class SearchModifierCodeEnumFactory implements EnumFactory<SearchModifierCode> {
    public SearchModifierCode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("missing".equals(codeString))
          return SearchModifierCode.MISSING;
        if ("exact".equals(codeString))
          return SearchModifierCode.EXACT;
        if ("contains".equals(codeString))
          return SearchModifierCode.CONTAINS;
        if ("not".equals(codeString))
          return SearchModifierCode.NOT;
        if ("text".equals(codeString))
          return SearchModifierCode.TEXT;
        if ("in".equals(codeString))
          return SearchModifierCode.IN;
        if ("not-in".equals(codeString))
          return SearchModifierCode.NOTIN;
        if ("below".equals(codeString))
          return SearchModifierCode.BELOW;
        if ("above".equals(codeString))
          return SearchModifierCode.ABOVE;
        if ("type".equals(codeString))
          return SearchModifierCode.TYPE;
        throw new IllegalArgumentException("Unknown SearchModifierCode code '"+codeString+"'");
        }
    public String toCode(SearchModifierCode code) {
      if (code == SearchModifierCode.MISSING)
        return "missing";
      if (code == SearchModifierCode.EXACT)
        return "exact";
      if (code == SearchModifierCode.CONTAINS)
        return "contains";
      if (code == SearchModifierCode.NOT)
        return "not";
      if (code == SearchModifierCode.TEXT)
        return "text";
      if (code == SearchModifierCode.IN)
        return "in";
      if (code == SearchModifierCode.NOTIN)
        return "not-in";
      if (code == SearchModifierCode.BELOW)
        return "below";
      if (code == SearchModifierCode.ABOVE)
        return "above";
      if (code == SearchModifierCode.TYPE)
        return "type";
      return "?";
      }
    }

    public enum SystemRestfulInteraction {
        /**
         * null
         */
        TRANSACTION, 
        /**
         * null
         */
        SEARCHSYSTEM, 
        /**
         * null
         */
        HISTORYSYSTEM, 
        /**
         * added to help the parsers
         */
        NULL;
        public static SystemRestfulInteraction fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("transaction".equals(codeString))
          return TRANSACTION;
        if ("search-system".equals(codeString))
          return SEARCHSYSTEM;
        if ("history-system".equals(codeString))
          return HISTORYSYSTEM;
        throw new Exception("Unknown SystemRestfulInteraction code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case TRANSACTION: return "transaction";
            case SEARCHSYSTEM: return "search-system";
            case HISTORYSYSTEM: return "history-system";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case TRANSACTION: return "http://hl7.org/fhir/restful-interaction";
            case SEARCHSYSTEM: return "http://hl7.org/fhir/restful-interaction";
            case HISTORYSYSTEM: return "http://hl7.org/fhir/restful-interaction";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case TRANSACTION: return "";
            case SEARCHSYSTEM: return "";
            case HISTORYSYSTEM: return "";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case TRANSACTION: return "transaction";
            case SEARCHSYSTEM: return "search-system";
            case HISTORYSYSTEM: return "history-system";
            default: return "?";
          }
        }
    }

  public static class SystemRestfulInteractionEnumFactory implements EnumFactory<SystemRestfulInteraction> {
    public SystemRestfulInteraction fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("transaction".equals(codeString))
          return SystemRestfulInteraction.TRANSACTION;
        if ("search-system".equals(codeString))
          return SystemRestfulInteraction.SEARCHSYSTEM;
        if ("history-system".equals(codeString))
          return SystemRestfulInteraction.HISTORYSYSTEM;
        throw new IllegalArgumentException("Unknown SystemRestfulInteraction code '"+codeString+"'");
        }
    public String toCode(SystemRestfulInteraction code) {
      if (code == SystemRestfulInteraction.TRANSACTION)
        return "transaction";
      if (code == SystemRestfulInteraction.SEARCHSYSTEM)
        return "search-system";
      if (code == SystemRestfulInteraction.HISTORYSYSTEM)
        return "history-system";
      return "?";
      }
    }

    public enum TransactionMode {
        /**
         * Neither Batch or Transaction supported
         */
        NOTSUPPORTED, 
        /**
         * Batches supported
         */
        BATCH, 
        /**
         * Transactions Supported
         */
        TRANSACTION, 
        /**
         * Both Batches and Transactions Supported
         */
        BOTH, 
        /**
         * added to help the parsers
         */
        NULL;
        public static TransactionMode fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-supported".equals(codeString))
          return NOTSUPPORTED;
        if ("batch".equals(codeString))
          return BATCH;
        if ("transaction".equals(codeString))
          return TRANSACTION;
        if ("both".equals(codeString))
          return BOTH;
        throw new Exception("Unknown TransactionMode code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case NOTSUPPORTED: return "not-supported";
            case BATCH: return "batch";
            case TRANSACTION: return "transaction";
            case BOTH: return "both";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case NOTSUPPORTED: return "http://hl7.org/fhir/transaction-mode";
            case BATCH: return "http://hl7.org/fhir/transaction-mode";
            case TRANSACTION: return "http://hl7.org/fhir/transaction-mode";
            case BOTH: return "http://hl7.org/fhir/transaction-mode";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case NOTSUPPORTED: return "Neither Batch or Transaction supported";
            case BATCH: return "Batches supported";
            case TRANSACTION: return "Transactions Supported";
            case BOTH: return "Both Batches and Transactions Supported";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case NOTSUPPORTED: return "None";
            case BATCH: return "Batches supported";
            case TRANSACTION: return "Transactions Supported";
            case BOTH: return "Batches & Transactions";
            default: return "?";
          }
        }
    }

  public static class TransactionModeEnumFactory implements EnumFactory<TransactionMode> {
    public TransactionMode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-supported".equals(codeString))
          return TransactionMode.NOTSUPPORTED;
        if ("batch".equals(codeString))
          return TransactionMode.BATCH;
        if ("transaction".equals(codeString))
          return TransactionMode.TRANSACTION;
        if ("both".equals(codeString))
          return TransactionMode.BOTH;
        throw new IllegalArgumentException("Unknown TransactionMode code '"+codeString+"'");
        }
    public String toCode(TransactionMode code) {
      if (code == TransactionMode.NOTSUPPORTED)
        return "not-supported";
      if (code == TransactionMode.BATCH)
        return "batch";
      if (code == TransactionMode.TRANSACTION)
        return "transaction";
      if (code == TransactionMode.BOTH)
        return "both";
      return "?";
      }
    }

    public enum MessageSignificanceCategory {
        /**
         * The message represents/requests a change that should not be processed more than once. E.g. Making a booking for an appointment
         */
        CONSEQUENCE, 
        /**
         * The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful
         */
        CURRENCY, 
        /**
         * The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications
         */
        NOTIFICATION, 
        /**
         * added to help the parsers
         */
        NULL;
        public static MessageSignificanceCategory fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Consequence".equals(codeString))
          return CONSEQUENCE;
        if ("Currency".equals(codeString))
          return CURRENCY;
        if ("Notification".equals(codeString))
          return NOTIFICATION;
        throw new Exception("Unknown MessageSignificanceCategory code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case CONSEQUENCE: return "Consequence";
            case CURRENCY: return "Currency";
            case NOTIFICATION: return "Notification";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case CONSEQUENCE: return "http://hl7.org/fhir/message-significance-category";
            case CURRENCY: return "http://hl7.org/fhir/message-significance-category";
            case NOTIFICATION: return "http://hl7.org/fhir/message-significance-category";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case CONSEQUENCE: return "The message represents/requests a change that should not be processed more than once. E.g. Making a booking for an appointment";
            case CURRENCY: return "The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful";
            case NOTIFICATION: return "The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case CONSEQUENCE: return "Consequence";
            case CURRENCY: return "Currency";
            case NOTIFICATION: return "Notification";
            default: return "?";
          }
        }
    }

  public static class MessageSignificanceCategoryEnumFactory implements EnumFactory<MessageSignificanceCategory> {
    public MessageSignificanceCategory fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Consequence".equals(codeString))
          return MessageSignificanceCategory.CONSEQUENCE;
        if ("Currency".equals(codeString))
          return MessageSignificanceCategory.CURRENCY;
        if ("Notification".equals(codeString))
          return MessageSignificanceCategory.NOTIFICATION;
        throw new IllegalArgumentException("Unknown MessageSignificanceCategory code '"+codeString+"'");
        }
    public String toCode(MessageSignificanceCategory code) {
      if (code == MessageSignificanceCategory.CONSEQUENCE)
        return "Consequence";
      if (code == MessageSignificanceCategory.CURRENCY)
        return "Currency";
      if (code == MessageSignificanceCategory.NOTIFICATION)
        return "Notification";
      return "?";
      }
    }

    public enum ConformanceEventMode {
        /**
         * The application sends requests and receives responses
         */
        SENDER, 
        /**
         * The application receives requests and sends responses
         */
        RECEIVER, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ConformanceEventMode fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("sender".equals(codeString))
          return SENDER;
        if ("receiver".equals(codeString))
          return RECEIVER;
        throw new Exception("Unknown ConformanceEventMode code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case SENDER: return "sender";
            case RECEIVER: return "receiver";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case SENDER: return "http://hl7.org/fhir/message-conformance-event-mode";
            case RECEIVER: return "http://hl7.org/fhir/message-conformance-event-mode";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case SENDER: return "The application sends requests and receives responses";
            case RECEIVER: return "The application receives requests and sends responses";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case SENDER: return "Sender";
            case RECEIVER: return "Receiver";
            default: return "?";
          }
        }
    }

  public static class ConformanceEventModeEnumFactory implements EnumFactory<ConformanceEventMode> {
    public ConformanceEventMode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("sender".equals(codeString))
          return ConformanceEventMode.SENDER;
        if ("receiver".equals(codeString))
          return ConformanceEventMode.RECEIVER;
        throw new IllegalArgumentException("Unknown ConformanceEventMode code '"+codeString+"'");
        }
    public String toCode(ConformanceEventMode code) {
      if (code == ConformanceEventMode.SENDER)
        return "sender";
      if (code == ConformanceEventMode.RECEIVER)
        return "receiver";
      return "?";
      }
    }

    public enum DocumentMode {
        /**
         * The application produces documents of the specified type
         */
        PRODUCER, 
        /**
         * The application consumes documents of the specified type
         */
        CONSUMER, 
        /**
         * added to help the parsers
         */
        NULL;
        public static DocumentMode fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("producer".equals(codeString))
          return PRODUCER;
        if ("consumer".equals(codeString))
          return CONSUMER;
        throw new Exception("Unknown DocumentMode code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case PRODUCER: return "producer";
            case CONSUMER: return "consumer";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case PRODUCER: return "http://hl7.org/fhir/document-mode";
            case CONSUMER: return "http://hl7.org/fhir/document-mode";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case PRODUCER: return "The application produces documents of the specified type";
            case CONSUMER: return "The application consumes documents of the specified type";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case PRODUCER: return "Producer";
            case CONSUMER: return "Consumer";
            default: return "?";
          }
        }
    }

  public static class DocumentModeEnumFactory implements EnumFactory<DocumentMode> {
    public DocumentMode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("producer".equals(codeString))
          return DocumentMode.PRODUCER;
        if ("consumer".equals(codeString))
          return DocumentMode.CONSUMER;
        throw new IllegalArgumentException("Unknown DocumentMode code '"+codeString+"'");
        }
    public String toCode(DocumentMode code) {
      if (code == DocumentMode.PRODUCER)
        return "producer";
      if (code == DocumentMode.CONSUMER)
        return "consumer";
      return "?";
      }
    }

    @Block()
    public static class ConformanceContactComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The name of an individual to contact regarding the conformance.
         */
        @Child(name = "name", type = {StringType.class}, order=1, min=0, max=1)
        @Description(shortDefinition="Name of a individual to contact", formalDefinition="The name of an individual to contact regarding the conformance." )
        protected StringType name;

        /**
         * Contact details for individual (if a name was provided) or the publisher.
         */
        @Child(name = "telecom", type = {ContactPoint.class}, order=2, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Contact details for individual or publisher", formalDefinition="Contact details for individual (if a name was provided) or the publisher." )
        protected List<ContactPoint> telecom;

        private static final long serialVersionUID = -1179697803L;

    /*
     * Constructor
     */
      public ConformanceContactComponent() {
        super();
      }

        /**
         * @return {@link #name} (The name of an individual to contact regarding the conformance.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceContactComponent.name");
            else if (Configuration.doAutoCreate())
              this.name = new StringType(); // bb
          return this.name;
        }

        public boolean hasNameElement() { 
          return this.name != null && !this.name.isEmpty();
        }

        public boolean hasName() { 
          return this.name != null && !this.name.isEmpty();
        }

        /**
         * @param value {@link #name} (The name of an individual to contact regarding the conformance.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public ConformanceContactComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return The name of an individual to contact regarding the conformance.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value The name of an individual to contact regarding the conformance.
         */
        public ConformanceContactComponent setName(String value) { 
          if (Utilities.noString(value))
            this.name = null;
          else {
            if (this.name == null)
              this.name = new StringType();
            this.name.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #telecom} (Contact details for individual (if a name was provided) or the publisher.)
         */
        public List<ContactPoint> getTelecom() { 
          if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
          return this.telecom;
        }

        public boolean hasTelecom() { 
          if (this.telecom == null)
            return false;
          for (ContactPoint item : this.telecom)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #telecom} (Contact details for individual (if a name was provided) or the publisher.)
         */
    // syntactic sugar
        public ContactPoint addTelecom() { //3
          ContactPoint t = new ContactPoint();
          if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
          this.telecom.add(t);
          return t;
        }

    // syntactic sugar
        public ConformanceContactComponent addTelecom(ContactPoint t) { //3
          if (t == null)
            return this;
          if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
          this.telecom.add(t);
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("name", "string", "The name of an individual to contact regarding the conformance.", 0, java.lang.Integer.MAX_VALUE, name));
          childrenList.add(new Property("telecom", "ContactPoint", "Contact details for individual (if a name was provided) or the publisher.", 0, java.lang.Integer.MAX_VALUE, telecom));
        }

      public ConformanceContactComponent copy() {
        ConformanceContactComponent dst = new ConformanceContactComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        if (telecom != null) {
          dst.telecom = new ArrayList<ContactPoint>();
          for (ContactPoint i : telecom)
            dst.telecom.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceContactComponent))
          return false;
        ConformanceContactComponent o = (ConformanceContactComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(telecom, o.telecom, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceContactComponent))
          return false;
        ConformanceContactComponent o = (ConformanceContactComponent) other;
        return compareValues(name, o.name, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (telecom == null || telecom.isEmpty())
          ;
      }

  }

    @Block()
    public static class ConformanceSoftwareComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Name software is known by.
         */
        @Child(name = "name", type = {StringType.class}, order=1, min=1, max=1)
        @Description(shortDefinition="A name the software is known by", formalDefinition="Name software is known by." )
        protected StringType name;

        /**
         * The version identifier for the software covered by this statement.
         */
        @Child(name = "version", type = {StringType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Version covered by this statement", formalDefinition="The version identifier for the software covered by this statement." )
        protected StringType version;

        /**
         * Date this version of the software released.
         */
        @Child(name = "releaseDate", type = {DateTimeType.class}, order=3, min=0, max=1)
        @Description(shortDefinition="Date this version released", formalDefinition="Date this version of the software released." )
        protected DateTimeType releaseDate;

        private static final long serialVersionUID = 1819769027L;

    /*
     * Constructor
     */
      public ConformanceSoftwareComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ConformanceSoftwareComponent(StringType name) {
        super();
        this.name = name;
      }

        /**
         * @return {@link #name} (Name software is known by.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceSoftwareComponent.name");
            else if (Configuration.doAutoCreate())
              this.name = new StringType(); // bb
          return this.name;
        }

        public boolean hasNameElement() { 
          return this.name != null && !this.name.isEmpty();
        }

        public boolean hasName() { 
          return this.name != null && !this.name.isEmpty();
        }

        /**
         * @param value {@link #name} (Name software is known by.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public ConformanceSoftwareComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return Name software is known by.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value Name software is known by.
         */
        public ConformanceSoftwareComponent setName(String value) { 
            if (this.name == null)
              this.name = new StringType();
            this.name.setValue(value);
          return this;
        }

        /**
         * @return {@link #version} (The version identifier for the software covered by this statement.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
         */
        public StringType getVersionElement() { 
          if (this.version == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceSoftwareComponent.version");
            else if (Configuration.doAutoCreate())
              this.version = new StringType(); // bb
          return this.version;
        }

        public boolean hasVersionElement() { 
          return this.version != null && !this.version.isEmpty();
        }

        public boolean hasVersion() { 
          return this.version != null && !this.version.isEmpty();
        }

        /**
         * @param value {@link #version} (The version identifier for the software covered by this statement.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
         */
        public ConformanceSoftwareComponent setVersionElement(StringType value) { 
          this.version = value;
          return this;
        }

        /**
         * @return The version identifier for the software covered by this statement.
         */
        public String getVersion() { 
          return this.version == null ? null : this.version.getValue();
        }

        /**
         * @param value The version identifier for the software covered by this statement.
         */
        public ConformanceSoftwareComponent setVersion(String value) { 
          if (Utilities.noString(value))
            this.version = null;
          else {
            if (this.version == null)
              this.version = new StringType();
            this.version.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #releaseDate} (Date this version of the software released.). This is the underlying object with id, value and extensions. The accessor "getReleaseDate" gives direct access to the value
         */
        public DateTimeType getReleaseDateElement() { 
          if (this.releaseDate == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceSoftwareComponent.releaseDate");
            else if (Configuration.doAutoCreate())
              this.releaseDate = new DateTimeType(); // bb
          return this.releaseDate;
        }

        public boolean hasReleaseDateElement() { 
          return this.releaseDate != null && !this.releaseDate.isEmpty();
        }

        public boolean hasReleaseDate() { 
          return this.releaseDate != null && !this.releaseDate.isEmpty();
        }

        /**
         * @param value {@link #releaseDate} (Date this version of the software released.). This is the underlying object with id, value and extensions. The accessor "getReleaseDate" gives direct access to the value
         */
        public ConformanceSoftwareComponent setReleaseDateElement(DateTimeType value) { 
          this.releaseDate = value;
          return this;
        }

        /**
         * @return Date this version of the software released.
         */
        public Date getReleaseDate() { 
          return this.releaseDate == null ? null : this.releaseDate.getValue();
        }

        /**
         * @param value Date this version of the software released.
         */
        public ConformanceSoftwareComponent setReleaseDate(Date value) { 
          if (value == null)
            this.releaseDate = null;
          else {
            if (this.releaseDate == null)
              this.releaseDate = new DateTimeType();
            this.releaseDate.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("name", "string", "Name software is known by.", 0, java.lang.Integer.MAX_VALUE, name));
          childrenList.add(new Property("version", "string", "The version identifier for the software covered by this statement.", 0, java.lang.Integer.MAX_VALUE, version));
          childrenList.add(new Property("releaseDate", "dateTime", "Date this version of the software released.", 0, java.lang.Integer.MAX_VALUE, releaseDate));
        }

      public ConformanceSoftwareComponent copy() {
        ConformanceSoftwareComponent dst = new ConformanceSoftwareComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.version = version == null ? null : version.copy();
        dst.releaseDate = releaseDate == null ? null : releaseDate.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceSoftwareComponent))
          return false;
        ConformanceSoftwareComponent o = (ConformanceSoftwareComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(version, o.version, true) && compareDeep(releaseDate, o.releaseDate, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceSoftwareComponent))
          return false;
        ConformanceSoftwareComponent o = (ConformanceSoftwareComponent) other;
        return compareValues(name, o.name, true) && compareValues(version, o.version, true) && compareValues(releaseDate, o.releaseDate, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (version == null || version.isEmpty())
           && (releaseDate == null || releaseDate.isEmpty());
      }

  }

    @Block()
    public static class ConformanceImplementationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Information about the specific installation that this conformance statement relates to.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=1, max=1)
        @Description(shortDefinition="Describes this specific instance", formalDefinition="Information about the specific installation that this conformance statement relates to." )
        protected StringType description;

        /**
         * An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
         */
        @Child(name = "url", type = {UriType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Base URL for the installation", formalDefinition="An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces." )
        protected UriType url;

        private static final long serialVersionUID = -289238508L;

    /*
     * Constructor
     */
      public ConformanceImplementationComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ConformanceImplementationComponent(StringType description) {
        super();
        this.description = description;
      }

        /**
         * @return {@link #description} (Information about the specific installation that this conformance statement relates to.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceImplementationComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Information about the specific installation that this conformance statement relates to.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public ConformanceImplementationComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Information about the specific installation that this conformance statement relates to.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Information about the specific installation that this conformance statement relates to.
         */
        public ConformanceImplementationComponent setDescription(String value) { 
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          return this;
        }

        /**
         * @return {@link #url} (An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
         */
        public UriType getUrlElement() { 
          if (this.url == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceImplementationComponent.url");
            else if (Configuration.doAutoCreate())
              this.url = new UriType(); // bb
          return this.url;
        }

        public boolean hasUrlElement() { 
          return this.url != null && !this.url.isEmpty();
        }

        public boolean hasUrl() { 
          return this.url != null && !this.url.isEmpty();
        }

        /**
         * @param value {@link #url} (An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
         */
        public ConformanceImplementationComponent setUrlElement(UriType value) { 
          this.url = value;
          return this;
        }

        /**
         * @return An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
         */
        public String getUrl() { 
          return this.url == null ? null : this.url.getValue();
        }

        /**
         * @param value An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
         */
        public ConformanceImplementationComponent setUrl(String value) { 
          if (Utilities.noString(value))
            this.url = null;
          else {
            if (this.url == null)
              this.url = new UriType();
            this.url.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("description", "string", "Information about the specific installation that this conformance statement relates to.", 0, java.lang.Integer.MAX_VALUE, description));
          childrenList.add(new Property("url", "uri", "An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.", 0, java.lang.Integer.MAX_VALUE, url));
        }

      public ConformanceImplementationComponent copy() {
        ConformanceImplementationComponent dst = new ConformanceImplementationComponent();
        copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.url = url == null ? null : url.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceImplementationComponent))
          return false;
        ConformanceImplementationComponent o = (ConformanceImplementationComponent) other;
        return compareDeep(description, o.description, true) && compareDeep(url, o.url, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceImplementationComponent))
          return false;
        ConformanceImplementationComponent o = (ConformanceImplementationComponent) other;
        return compareValues(description, o.description, true) && compareValues(url, o.url, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (description == null || description.isEmpty()) && (url == null || url.isEmpty())
          ;
      }

  }

    @Block()
    public static class ConformanceRestComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.
         */
        @Child(name = "mode", type = {CodeType.class}, order=1, min=1, max=1)
        @Description(shortDefinition="client | server", formalDefinition="Identifies whether this portion of the statement is describing ability to initiate or receive restful operations." )
        protected Enumeration<RestfulConformanceMode> mode;

        /**
         * Information about the system's restful capabilities that apply across all applications, such as security.
         */
        @Child(name = "documentation", type = {StringType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="General description of implementation", formalDefinition="Information about the system's restful capabilities that apply across all applications, such as security." )
        protected StringType documentation;

        /**
         * Information about security implementation from an interface perspective - what a client needs to know.
         */
        @Child(name = "security", type = {}, order=3, min=0, max=1)
        @Description(shortDefinition="Information about security of implementation", formalDefinition="Information about security implementation from an interface perspective - what a client needs to know." )
        protected ConformanceRestSecurityComponent security;

        /**
         * A specification of the restful capabilities of the solution for a specific resource type.
         */
        @Child(name = "resource", type = {}, order=4, min=1, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Resource served on the REST interface", formalDefinition="A specification of the restful capabilities of the solution for a specific resource type." )
        protected List<ConformanceRestResourceComponent> resource;

        /**
         * A specification of restful operations supported by the system.
         */
        @Child(name = "interaction", type = {}, order=5, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="What operations are supported?", formalDefinition="A specification of restful operations supported by the system." )
        protected List<SystemInteractionComponent> interaction;

        /**
         * A code that indicates how transactions are supported.
         */
        @Child(name = "transactionMode", type = {CodeType.class}, order=6, min=0, max=1)
        @Description(shortDefinition="not-supported | batch | transaction | both", formalDefinition="A code that indicates how transactions are supported." )
        protected Enumeration<TransactionMode> transactionMode;

        /**
         * Definition of an operation or a named query and with its parameters and their meaning and type.
         */
        @Child(name = "operation", type = {}, order=7, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Definition of an operation or a custom query", formalDefinition="Definition of an operation or a named query and with its parameters and their meaning and type." )
        protected List<ConformanceRestOperationComponent> operation;

        /**
         * A list of absolute URIs that identify profiles that this server implements for accepting documents in the mailbox. If this list is empty, then documents are not accepted. The base specification has the profile identifier "http://hl7.org/fhir/documents/mailbox". Other specifications can declare their own identifier for this purpose.
         */
        @Child(name = "documentMailbox", type = {UriType.class}, order=8, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="How documents are accepted in /Mailbox", formalDefinition="A list of absolute URIs that identify profiles that this server implements for accepting documents in the mailbox. If this list is empty, then documents are not accepted. The base specification has the profile identifier 'http://hl7.org/fhir/documents/mailbox'. Other specifications can declare their own identifier for this purpose." )
        protected List<UriType> documentMailbox;

        /**
         * An absolute URI which is a reference to the definition of a compartment hosted by the system.
         */
        @Child(name = "compartment", type = {UriType.class}, order=9, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Compartments served/used by system", formalDefinition="An absolute URI which is a reference to the definition of a compartment hosted by the system." )
        protected List<UriType> compartment;

        private static final long serialVersionUID = 471286912L;

    /*
     * Constructor
     */
      public ConformanceRestComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ConformanceRestComponent(Enumeration<RestfulConformanceMode> mode) {
        super();
        this.mode = mode;
      }

        /**
         * @return {@link #mode} (Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public Enumeration<RestfulConformanceMode> getModeElement() { 
          if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestComponent.mode");
            else if (Configuration.doAutoCreate())
              this.mode = new Enumeration<RestfulConformanceMode>(new RestfulConformanceModeEnumFactory()); // bb
          return this.mode;
        }

        public boolean hasModeElement() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        public boolean hasMode() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        /**
         * @param value {@link #mode} (Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public ConformanceRestComponent setModeElement(Enumeration<RestfulConformanceMode> value) { 
          this.mode = value;
          return this;
        }

        /**
         * @return Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.
         */
        public RestfulConformanceMode getMode() { 
          return this.mode == null ? null : this.mode.getValue();
        }

        /**
         * @param value Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.
         */
        public ConformanceRestComponent setMode(RestfulConformanceMode value) { 
            if (this.mode == null)
              this.mode = new Enumeration<RestfulConformanceMode>(new RestfulConformanceModeEnumFactory());
            this.mode.setValue(value);
          return this;
        }

        /**
         * @return {@link #documentation} (Information about the system's restful capabilities that apply across all applications, such as security.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public StringType getDocumentationElement() { 
          if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestComponent.documentation");
            else if (Configuration.doAutoCreate())
              this.documentation = new StringType(); // bb
          return this.documentation;
        }

        public boolean hasDocumentationElement() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        public boolean hasDocumentation() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        /**
         * @param value {@link #documentation} (Information about the system's restful capabilities that apply across all applications, such as security.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public ConformanceRestComponent setDocumentationElement(StringType value) { 
          this.documentation = value;
          return this;
        }

        /**
         * @return Information about the system's restful capabilities that apply across all applications, such as security.
         */
        public String getDocumentation() { 
          return this.documentation == null ? null : this.documentation.getValue();
        }

        /**
         * @param value Information about the system's restful capabilities that apply across all applications, such as security.
         */
        public ConformanceRestComponent setDocumentation(String value) { 
          if (Utilities.noString(value))
            this.documentation = null;
          else {
            if (this.documentation == null)
              this.documentation = new StringType();
            this.documentation.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #security} (Information about security implementation from an interface perspective - what a client needs to know.)
         */
        public ConformanceRestSecurityComponent getSecurity() { 
          if (this.security == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestComponent.security");
            else if (Configuration.doAutoCreate())
              this.security = new ConformanceRestSecurityComponent(); // cc
          return this.security;
        }

        public boolean hasSecurity() { 
          return this.security != null && !this.security.isEmpty();
        }

        /**
         * @param value {@link #security} (Information about security implementation from an interface perspective - what a client needs to know.)
         */
        public ConformanceRestComponent setSecurity(ConformanceRestSecurityComponent value) { 
          this.security = value;
          return this;
        }

        /**
         * @return {@link #resource} (A specification of the restful capabilities of the solution for a specific resource type.)
         */
        public List<ConformanceRestResourceComponent> getResource() { 
          if (this.resource == null)
            this.resource = new ArrayList<ConformanceRestResourceComponent>();
          return this.resource;
        }

        public boolean hasResource() { 
          if (this.resource == null)
            return false;
          for (ConformanceRestResourceComponent item : this.resource)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #resource} (A specification of the restful capabilities of the solution for a specific resource type.)
         */
    // syntactic sugar
        public ConformanceRestResourceComponent addResource() { //3
          ConformanceRestResourceComponent t = new ConformanceRestResourceComponent();
          if (this.resource == null)
            this.resource = new ArrayList<ConformanceRestResourceComponent>();
          this.resource.add(t);
          return t;
        }

    // syntactic sugar
        public ConformanceRestComponent addResource(ConformanceRestResourceComponent t) { //3
          if (t == null)
            return this;
          if (this.resource == null)
            this.resource = new ArrayList<ConformanceRestResourceComponent>();
          this.resource.add(t);
          return this;
        }

        /**
         * @return {@link #interaction} (A specification of restful operations supported by the system.)
         */
        public List<SystemInteractionComponent> getInteraction() { 
          if (this.interaction == null)
            this.interaction = new ArrayList<SystemInteractionComponent>();
          return this.interaction;
        }

        public boolean hasInteraction() { 
          if (this.interaction == null)
            return false;
          for (SystemInteractionComponent item : this.interaction)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #interaction} (A specification of restful operations supported by the system.)
         */
    // syntactic sugar
        public SystemInteractionComponent addInteraction() { //3
          SystemInteractionComponent t = new SystemInteractionComponent();
          if (this.interaction == null)
            this.interaction = new ArrayList<SystemInteractionComponent>();
          this.interaction.add(t);
          return t;
        }

    // syntactic sugar
        public ConformanceRestComponent addInteraction(SystemInteractionComponent t) { //3
          if (t == null)
            return this;
          if (this.interaction == null)
            this.interaction = new ArrayList<SystemInteractionComponent>();
          this.interaction.add(t);
          return this;
        }

        /**
         * @return {@link #transactionMode} (A code that indicates how transactions are supported.). This is the underlying object with id, value and extensions. The accessor "getTransactionMode" gives direct access to the value
         */
        public Enumeration<TransactionMode> getTransactionModeElement() { 
          if (this.transactionMode == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestComponent.transactionMode");
            else if (Configuration.doAutoCreate())
              this.transactionMode = new Enumeration<TransactionMode>(new TransactionModeEnumFactory()); // bb
          return this.transactionMode;
        }

        public boolean hasTransactionModeElement() { 
          return this.transactionMode != null && !this.transactionMode.isEmpty();
        }

        public boolean hasTransactionMode() { 
          return this.transactionMode != null && !this.transactionMode.isEmpty();
        }

        /**
         * @param value {@link #transactionMode} (A code that indicates how transactions are supported.). This is the underlying object with id, value and extensions. The accessor "getTransactionMode" gives direct access to the value
         */
        public ConformanceRestComponent setTransactionModeElement(Enumeration<TransactionMode> value) { 
          this.transactionMode = value;
          return this;
        }

        /**
         * @return A code that indicates how transactions are supported.
         */
        public TransactionMode getTransactionMode() { 
          return this.transactionMode == null ? null : this.transactionMode.getValue();
        }

        /**
         * @param value A code that indicates how transactions are supported.
         */
        public ConformanceRestComponent setTransactionMode(TransactionMode value) { 
          if (value == null)
            this.transactionMode = null;
          else {
            if (this.transactionMode == null)
              this.transactionMode = new Enumeration<TransactionMode>(new TransactionModeEnumFactory());
            this.transactionMode.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #operation} (Definition of an operation or a named query and with its parameters and their meaning and type.)
         */
        public List<ConformanceRestOperationComponent> getOperation() { 
          if (this.operation == null)
            this.operation = new ArrayList<ConformanceRestOperationComponent>();
          return this.operation;
        }

        public boolean hasOperation() { 
          if (this.operation == null)
            return false;
          for (ConformanceRestOperationComponent item : this.operation)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #operation} (Definition of an operation or a named query and with its parameters and their meaning and type.)
         */
    // syntactic sugar
        public ConformanceRestOperationComponent addOperation() { //3
          ConformanceRestOperationComponent t = new ConformanceRestOperationComponent();
          if (this.operation == null)
            this.operation = new ArrayList<ConformanceRestOperationComponent>();
          this.operation.add(t);
          return t;
        }

    // syntactic sugar
        public ConformanceRestComponent addOperation(ConformanceRestOperationComponent t) { //3
          if (t == null)
            return this;
          if (this.operation == null)
            this.operation = new ArrayList<ConformanceRestOperationComponent>();
          this.operation.add(t);
          return this;
        }

        /**
         * @return {@link #documentMailbox} (A list of absolute URIs that identify profiles that this server implements for accepting documents in the mailbox. If this list is empty, then documents are not accepted. The base specification has the profile identifier "http://hl7.org/fhir/documents/mailbox". Other specifications can declare their own identifier for this purpose.)
         */
        public List<UriType> getDocumentMailbox() { 
          if (this.documentMailbox == null)
            this.documentMailbox = new ArrayList<UriType>();
          return this.documentMailbox;
        }

        public boolean hasDocumentMailbox() { 
          if (this.documentMailbox == null)
            return false;
          for (UriType item : this.documentMailbox)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #documentMailbox} (A list of absolute URIs that identify profiles that this server implements for accepting documents in the mailbox. If this list is empty, then documents are not accepted. The base specification has the profile identifier "http://hl7.org/fhir/documents/mailbox". Other specifications can declare their own identifier for this purpose.)
         */
    // syntactic sugar
        public UriType addDocumentMailboxElement() {//2 
          UriType t = new UriType();
          if (this.documentMailbox == null)
            this.documentMailbox = new ArrayList<UriType>();
          this.documentMailbox.add(t);
          return t;
        }

        /**
         * @param value {@link #documentMailbox} (A list of absolute URIs that identify profiles that this server implements for accepting documents in the mailbox. If this list is empty, then documents are not accepted. The base specification has the profile identifier "http://hl7.org/fhir/documents/mailbox". Other specifications can declare their own identifier for this purpose.)
         */
        public ConformanceRestComponent addDocumentMailbox(String value) { //1
          UriType t = new UriType();
          t.setValue(value);
          if (this.documentMailbox == null)
            this.documentMailbox = new ArrayList<UriType>();
          this.documentMailbox.add(t);
          return this;
        }

        /**
         * @param value {@link #documentMailbox} (A list of absolute URIs that identify profiles that this server implements for accepting documents in the mailbox. If this list is empty, then documents are not accepted. The base specification has the profile identifier "http://hl7.org/fhir/documents/mailbox". Other specifications can declare their own identifier for this purpose.)
         */
        public boolean hasDocumentMailbox(String value) { 
          if (this.documentMailbox == null)
            return false;
          for (UriType v : this.documentMailbox)
            if (v.equals(value)) // uri
              return true;
          return false;
        }

        /**
         * @return {@link #compartment} (An absolute URI which is a reference to the definition of a compartment hosted by the system.)
         */
        public List<UriType> getCompartment() { 
          if (this.compartment == null)
            this.compartment = new ArrayList<UriType>();
          return this.compartment;
        }

        public boolean hasCompartment() { 
          if (this.compartment == null)
            return false;
          for (UriType item : this.compartment)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #compartment} (An absolute URI which is a reference to the definition of a compartment hosted by the system.)
         */
    // syntactic sugar
        public UriType addCompartmentElement() {//2 
          UriType t = new UriType();
          if (this.compartment == null)
            this.compartment = new ArrayList<UriType>();
          this.compartment.add(t);
          return t;
        }

        /**
         * @param value {@link #compartment} (An absolute URI which is a reference to the definition of a compartment hosted by the system.)
         */
        public ConformanceRestComponent addCompartment(String value) { //1
          UriType t = new UriType();
          t.setValue(value);
          if (this.compartment == null)
            this.compartment = new ArrayList<UriType>();
          this.compartment.add(t);
          return this;
        }

        /**
         * @param value {@link #compartment} (An absolute URI which is a reference to the definition of a compartment hosted by the system.)
         */
        public boolean hasCompartment(String value) { 
          if (this.compartment == null)
            return false;
          for (UriType v : this.compartment)
            if (v.equals(value)) // uri
              return true;
          return false;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("mode", "code", "Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.", 0, java.lang.Integer.MAX_VALUE, mode));
          childrenList.add(new Property("documentation", "string", "Information about the system's restful capabilities that apply across all applications, such as security.", 0, java.lang.Integer.MAX_VALUE, documentation));
          childrenList.add(new Property("security", "", "Information about security implementation from an interface perspective - what a client needs to know.", 0, java.lang.Integer.MAX_VALUE, security));
          childrenList.add(new Property("resource", "", "A specification of the restful capabilities of the solution for a specific resource type.", 0, java.lang.Integer.MAX_VALUE, resource));
          childrenList.add(new Property("interaction", "", "A specification of restful operations supported by the system.", 0, java.lang.Integer.MAX_VALUE, interaction));
          childrenList.add(new Property("transactionMode", "code", "A code that indicates how transactions are supported.", 0, java.lang.Integer.MAX_VALUE, transactionMode));
          childrenList.add(new Property("operation", "", "Definition of an operation or a named query and with its parameters and their meaning and type.", 0, java.lang.Integer.MAX_VALUE, operation));
          childrenList.add(new Property("documentMailbox", "uri", "A list of absolute URIs that identify profiles that this server implements for accepting documents in the mailbox. If this list is empty, then documents are not accepted. The base specification has the profile identifier 'http://hl7.org/fhir/documents/mailbox'. Other specifications can declare their own identifier for this purpose.", 0, java.lang.Integer.MAX_VALUE, documentMailbox));
          childrenList.add(new Property("compartment", "uri", "An absolute URI which is a reference to the definition of a compartment hosted by the system.", 0, java.lang.Integer.MAX_VALUE, compartment));
        }

      public ConformanceRestComponent copy() {
        ConformanceRestComponent dst = new ConformanceRestComponent();
        copyValues(dst);
        dst.mode = mode == null ? null : mode.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        dst.security = security == null ? null : security.copy();
        if (resource != null) {
          dst.resource = new ArrayList<ConformanceRestResourceComponent>();
          for (ConformanceRestResourceComponent i : resource)
            dst.resource.add(i.copy());
        };
        if (interaction != null) {
          dst.interaction = new ArrayList<SystemInteractionComponent>();
          for (SystemInteractionComponent i : interaction)
            dst.interaction.add(i.copy());
        };
        dst.transactionMode = transactionMode == null ? null : transactionMode.copy();
        if (operation != null) {
          dst.operation = new ArrayList<ConformanceRestOperationComponent>();
          for (ConformanceRestOperationComponent i : operation)
            dst.operation.add(i.copy());
        };
        if (documentMailbox != null) {
          dst.documentMailbox = new ArrayList<UriType>();
          for (UriType i : documentMailbox)
            dst.documentMailbox.add(i.copy());
        };
        if (compartment != null) {
          dst.compartment = new ArrayList<UriType>();
          for (UriType i : compartment)
            dst.compartment.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceRestComponent))
          return false;
        ConformanceRestComponent o = (ConformanceRestComponent) other;
        return compareDeep(mode, o.mode, true) && compareDeep(documentation, o.documentation, true) && compareDeep(security, o.security, true)
           && compareDeep(resource, o.resource, true) && compareDeep(interaction, o.interaction, true) && compareDeep(transactionMode, o.transactionMode, true)
           && compareDeep(operation, o.operation, true) && compareDeep(documentMailbox, o.documentMailbox, true)
           && compareDeep(compartment, o.compartment, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceRestComponent))
          return false;
        ConformanceRestComponent o = (ConformanceRestComponent) other;
        return compareValues(mode, o.mode, true) && compareValues(documentation, o.documentation, true) && compareValues(transactionMode, o.transactionMode, true)
           && compareValues(documentMailbox, o.documentMailbox, true) && compareValues(compartment, o.compartment, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && (mode == null || mode.isEmpty()) && (documentation == null || documentation.isEmpty())
           && (security == null || security.isEmpty()) && (resource == null || resource.isEmpty()) && (interaction == null || interaction.isEmpty())
           && (transactionMode == null || transactionMode.isEmpty()) && (operation == null || operation.isEmpty())
           && (documentMailbox == null || documentMailbox.isEmpty()) && (compartment == null || compartment.isEmpty())
          ;
      }

  }

    @Block()
    public static class ConformanceRestSecurityComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
         */
        @Child(name = "cors", type = {BooleanType.class}, order=1, min=0, max=1)
        @Description(shortDefinition="Adds CORS Headers (http://enable-cors.org/)", formalDefinition="Server adds CORS headers when responding to requests - this enables javascript applications to use the server." )
        protected BooleanType cors;

        /**
         * Types of security services are supported/required by the system.
         */
        @Child(name = "service", type = {CodeableConcept.class}, order=2, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="OAuth | SMART-on-FHIR | NTLM | Basic | Kerberos | Certificates", formalDefinition="Types of security services are supported/required by the system." )
        protected List<CodeableConcept> service;

        /**
         * General description of how security works.
         */
        @Child(name = "description", type = {StringType.class}, order=3, min=0, max=1)
        @Description(shortDefinition="General description of how security works", formalDefinition="General description of how security works." )
        protected StringType description;

        /**
         * Certificates associated with security profiles.
         */
        @Child(name = "certificate", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Certificates associated with security profiles", formalDefinition="Certificates associated with security profiles." )
        protected List<ConformanceRestSecurityCertificateComponent> certificate;

        private static final long serialVersionUID = 391663952L;

    /*
     * Constructor
     */
      public ConformanceRestSecurityComponent() {
        super();
      }

        /**
         * @return {@link #cors} (Server adds CORS headers when responding to requests - this enables javascript applications to use the server.). This is the underlying object with id, value and extensions. The accessor "getCors" gives direct access to the value
         */
        public BooleanType getCorsElement() { 
          if (this.cors == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestSecurityComponent.cors");
            else if (Configuration.doAutoCreate())
              this.cors = new BooleanType(); // bb
          return this.cors;
        }

        public boolean hasCorsElement() { 
          return this.cors != null && !this.cors.isEmpty();
        }

        public boolean hasCors() { 
          return this.cors != null && !this.cors.isEmpty();
        }

        /**
         * @param value {@link #cors} (Server adds CORS headers when responding to requests - this enables javascript applications to use the server.). This is the underlying object with id, value and extensions. The accessor "getCors" gives direct access to the value
         */
        public ConformanceRestSecurityComponent setCorsElement(BooleanType value) { 
          this.cors = value;
          return this;
        }

        /**
         * @return Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
         */
        public boolean getCors() { 
          return this.cors == null || this.cors.isEmpty() ? false : this.cors.getValue();
        }

        /**
         * @param value Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
         */
        public ConformanceRestSecurityComponent setCors(boolean value) { 
            if (this.cors == null)
              this.cors = new BooleanType();
            this.cors.setValue(value);
          return this;
        }

        /**
         * @return {@link #service} (Types of security services are supported/required by the system.)
         */
        public List<CodeableConcept> getService() { 
          if (this.service == null)
            this.service = new ArrayList<CodeableConcept>();
          return this.service;
        }

        public boolean hasService() { 
          if (this.service == null)
            return false;
          for (CodeableConcept item : this.service)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #service} (Types of security services are supported/required by the system.)
         */
    // syntactic sugar
        public CodeableConcept addService() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.service == null)
            this.service = new ArrayList<CodeableConcept>();
          this.service.add(t);
          return t;
        }

    // syntactic sugar
        public ConformanceRestSecurityComponent addService(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.service == null)
            this.service = new ArrayList<CodeableConcept>();
          this.service.add(t);
          return this;
        }

        /**
         * @return {@link #description} (General description of how security works.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestSecurityComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (General description of how security works.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public ConformanceRestSecurityComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return General description of how security works.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value General description of how security works.
         */
        public ConformanceRestSecurityComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #certificate} (Certificates associated with security profiles.)
         */
        public List<ConformanceRestSecurityCertificateComponent> getCertificate() { 
          if (this.certificate == null)
            this.certificate = new ArrayList<ConformanceRestSecurityCertificateComponent>();
          return this.certificate;
        }

        public boolean hasCertificate() { 
          if (this.certificate == null)
            return false;
          for (ConformanceRestSecurityCertificateComponent item : this.certificate)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #certificate} (Certificates associated with security profiles.)
         */
    // syntactic sugar
        public ConformanceRestSecurityCertificateComponent addCertificate() { //3
          ConformanceRestSecurityCertificateComponent t = new ConformanceRestSecurityCertificateComponent();
          if (this.certificate == null)
            this.certificate = new ArrayList<ConformanceRestSecurityCertificateComponent>();
          this.certificate.add(t);
          return t;
        }

    // syntactic sugar
        public ConformanceRestSecurityComponent addCertificate(ConformanceRestSecurityCertificateComponent t) { //3
          if (t == null)
            return this;
          if (this.certificate == null)
            this.certificate = new ArrayList<ConformanceRestSecurityCertificateComponent>();
          this.certificate.add(t);
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("cors", "boolean", "Server adds CORS headers when responding to requests - this enables javascript applications to use the server.", 0, java.lang.Integer.MAX_VALUE, cors));
          childrenList.add(new Property("service", "CodeableConcept", "Types of security services are supported/required by the system.", 0, java.lang.Integer.MAX_VALUE, service));
          childrenList.add(new Property("description", "string", "General description of how security works.", 0, java.lang.Integer.MAX_VALUE, description));
          childrenList.add(new Property("certificate", "", "Certificates associated with security profiles.", 0, java.lang.Integer.MAX_VALUE, certificate));
        }

      public ConformanceRestSecurityComponent copy() {
        ConformanceRestSecurityComponent dst = new ConformanceRestSecurityComponent();
        copyValues(dst);
        dst.cors = cors == null ? null : cors.copy();
        if (service != null) {
          dst.service = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : service)
            dst.service.add(i.copy());
        };
        dst.description = description == null ? null : description.copy();
        if (certificate != null) {
          dst.certificate = new ArrayList<ConformanceRestSecurityCertificateComponent>();
          for (ConformanceRestSecurityCertificateComponent i : certificate)
            dst.certificate.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceRestSecurityComponent))
          return false;
        ConformanceRestSecurityComponent o = (ConformanceRestSecurityComponent) other;
        return compareDeep(cors, o.cors, true) && compareDeep(service, o.service, true) && compareDeep(description, o.description, true)
           && compareDeep(certificate, o.certificate, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceRestSecurityComponent))
          return false;
        ConformanceRestSecurityComponent o = (ConformanceRestSecurityComponent) other;
        return compareValues(cors, o.cors, true) && compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (cors == null || cors.isEmpty()) && (service == null || service.isEmpty())
           && (description == null || description.isEmpty()) && (certificate == null || certificate.isEmpty())
          ;
      }

  }

    @Block()
    public static class ConformanceRestSecurityCertificateComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Mime type for certificate.
         */
        @Child(name = "type", type = {CodeType.class}, order=1, min=0, max=1)
        @Description(shortDefinition="Mime type for certificate", formalDefinition="Mime type for certificate." )
        protected CodeType type;

        /**
         * Actual certificate.
         */
        @Child(name = "blob", type = {Base64BinaryType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Actual certificate", formalDefinition="Actual certificate." )
        protected Base64BinaryType blob;

        private static final long serialVersionUID = 2092655854L;

    /*
     * Constructor
     */
      public ConformanceRestSecurityCertificateComponent() {
        super();
      }

        /**
         * @return {@link #type} (Mime type for certificate.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public CodeType getTypeElement() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestSecurityCertificateComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeType(); // bb
          return this.type;
        }

        public boolean hasTypeElement() { 
          return this.type != null && !this.type.isEmpty();
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Mime type for certificate.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public ConformanceRestSecurityCertificateComponent setTypeElement(CodeType value) { 
          this.type = value;
          return this;
        }

        /**
         * @return Mime type for certificate.
         */
        public String getType() { 
          return this.type == null ? null : this.type.getValue();
        }

        /**
         * @param value Mime type for certificate.
         */
        public ConformanceRestSecurityCertificateComponent setType(String value) { 
          if (Utilities.noString(value))
            this.type = null;
          else {
            if (this.type == null)
              this.type = new CodeType();
            this.type.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #blob} (Actual certificate.). This is the underlying object with id, value and extensions. The accessor "getBlob" gives direct access to the value
         */
        public Base64BinaryType getBlobElement() { 
          if (this.blob == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestSecurityCertificateComponent.blob");
            else if (Configuration.doAutoCreate())
              this.blob = new Base64BinaryType(); // bb
          return this.blob;
        }

        public boolean hasBlobElement() { 
          return this.blob != null && !this.blob.isEmpty();
        }

        public boolean hasBlob() { 
          return this.blob != null && !this.blob.isEmpty();
        }

        /**
         * @param value {@link #blob} (Actual certificate.). This is the underlying object with id, value and extensions. The accessor "getBlob" gives direct access to the value
         */
        public ConformanceRestSecurityCertificateComponent setBlobElement(Base64BinaryType value) { 
          this.blob = value;
          return this;
        }

        /**
         * @return Actual certificate.
         */
        public byte[] getBlob() { 
          return this.blob == null ? null : this.blob.getValue();
        }

        /**
         * @param value Actual certificate.
         */
        public ConformanceRestSecurityCertificateComponent setBlob(byte[] value) { 
          if (value == null)
            this.blob = null;
          else {
            if (this.blob == null)
              this.blob = new Base64BinaryType();
            this.blob.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("type", "code", "Mime type for certificate.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("blob", "base64Binary", "Actual certificate.", 0, java.lang.Integer.MAX_VALUE, blob));
        }

      public ConformanceRestSecurityCertificateComponent copy() {
        ConformanceRestSecurityCertificateComponent dst = new ConformanceRestSecurityCertificateComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.blob = blob == null ? null : blob.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceRestSecurityCertificateComponent))
          return false;
        ConformanceRestSecurityCertificateComponent o = (ConformanceRestSecurityCertificateComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(blob, o.blob, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceRestSecurityCertificateComponent))
          return false;
        ConformanceRestSecurityCertificateComponent o = (ConformanceRestSecurityCertificateComponent) other;
        return compareValues(type, o.type, true) && compareValues(blob, o.blob, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (blob == null || blob.isEmpty())
          ;
      }

  }

    @Block()
    public static class ConformanceRestResourceComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A type of resource exposed via the restful interface.
         */
        @Child(name = "type", type = {CodeType.class}, order=1, min=1, max=1)
        @Description(shortDefinition="A resource type that is supported", formalDefinition="A type of resource exposed via the restful interface." )
        protected CodeType type;

        /**
         * A specification of the profile that describes the solution's support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses.
         */
        @Child(name = "profile", type = {StructureDefinition.class}, order=2, min=0, max=1)
        @Description(shortDefinition="What structural features are supported", formalDefinition="A specification of the profile that describes the solution's support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses." )
        protected Reference profile;

        /**
         * The actual object that is the target of the reference (A specification of the profile that describes the solution's support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses.)
         */
        protected StructureDefinition profileTarget;

        /**
         * Identifies a restful operation supported by the solution.
         */
        @Child(name = "interaction", type = {}, order=3, min=1, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="What operations are supported?", formalDefinition="Identifies a restful operation supported by the solution." )
        protected List<ResourceInteractionComponent> interaction;

        /**
         * Thi field is set to true to specify that the system does not support (server) or use (client) versioning for this resource type. If this is not set to true, the server must at least correctly track and populate the versionId meta-property on resources.
         */
        @Child(name = "versioning", type = {CodeType.class}, order=4, min=0, max=1)
        @Description(shortDefinition="no-version | versioned | versioned-update", formalDefinition="Thi field is set to true to specify that the system does not support (server) or use (client) versioning for this resource type. If this is not set to true, the server must at least correctly track and populate the versionId meta-property on resources." )
        protected Enumeration<ResourceVersionPolicy> versioning;

        /**
         * A flag for whether the server is able to return past versions as part of the vRead operation.
         */
        @Child(name = "readHistory", type = {BooleanType.class}, order=5, min=0, max=1)
        @Description(shortDefinition="Whether vRead can return past versions", formalDefinition="A flag for whether the server is able to return past versions as part of the vRead operation." )
        protected BooleanType readHistory;

        /**
         * A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
         */
        @Child(name = "updateCreate", type = {BooleanType.class}, order=6, min=0, max=1)
        @Description(shortDefinition="If update can commit to a new identity", formalDefinition="A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server." )
        protected BooleanType updateCreate;

        /**
         * A flag that indicates that the server supports conditional create.
         */
        @Child(name = "conditionalCreate", type = {BooleanType.class}, order=7, min=0, max=1)
        @Description(shortDefinition="If allows/uses conditional create", formalDefinition="A flag that indicates that the server supports conditional create." )
        protected BooleanType conditionalCreate;

        /**
         * A flag that indicates that the server supports conditional update.
         */
        @Child(name = "conditionalUpdate", type = {BooleanType.class}, order=8, min=0, max=1)
        @Description(shortDefinition="If allows/uses conditional update", formalDefinition="A flag that indicates that the server supports conditional update." )
        protected BooleanType conditionalUpdate;

        /**
         * A code that indicates how the server supports conditional delete.
         */
        @Child(name = "conditionalDelete", type = {CodeType.class}, order=9, min=0, max=1)
        @Description(shortDefinition="not-supported | single | multiple - how conditional delete is supported", formalDefinition="A code that indicates how the server supports conditional delete." )
        protected Enumeration<ConditionalDeleteStatus> conditionalDelete;

        /**
         * A list of _include values supported by the server.
         */
        @Child(name = "searchInclude", type = {StringType.class}, order=10, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="_include values supported by the server", formalDefinition="A list of _include values supported by the server." )
        protected List<StringType> searchInclude;

        /**
         * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
         */
        @Child(name = "searchParam", type = {}, order=11, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Search params supported by implementation", formalDefinition="Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation." )
        protected List<ConformanceRestResourceSearchParamComponent> searchParam;

        private static final long serialVersionUID = -921508401L;

    /*
     * Constructor
     */
      public ConformanceRestResourceComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ConformanceRestResourceComponent(CodeType type) {
        super();
        this.type = type;
      }

        /**
         * @return {@link #type} (A type of resource exposed via the restful interface.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public CodeType getTypeElement() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeType(); // bb
          return this.type;
        }

        public boolean hasTypeElement() { 
          return this.type != null && !this.type.isEmpty();
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (A type of resource exposed via the restful interface.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public ConformanceRestResourceComponent setTypeElement(CodeType value) { 
          this.type = value;
          return this;
        }

        /**
         * @return A type of resource exposed via the restful interface.
         */
        public String getType() { 
          return this.type == null ? null : this.type.getValue();
        }

        /**
         * @param value A type of resource exposed via the restful interface.
         */
        public ConformanceRestResourceComponent setType(String value) { 
            if (this.type == null)
              this.type = new CodeType();
            this.type.setValue(value);
          return this;
        }

        /**
         * @return {@link #profile} (A specification of the profile that describes the solution's support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses.)
         */
        public Reference getProfile() { 
          if (this.profile == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceComponent.profile");
            else if (Configuration.doAutoCreate())
              this.profile = new Reference(); // cc
          return this.profile;
        }

        public boolean hasProfile() { 
          return this.profile != null && !this.profile.isEmpty();
        }

        /**
         * @param value {@link #profile} (A specification of the profile that describes the solution's support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses.)
         */
        public ConformanceRestResourceComponent setProfile(Reference value) { 
          this.profile = value;
          return this;
        }

        /**
         * @return {@link #profile} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A specification of the profile that describes the solution's support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses.)
         */
        public StructureDefinition getProfileTarget() { 
          if (this.profileTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceComponent.profile");
            else if (Configuration.doAutoCreate())
              this.profileTarget = new StructureDefinition(); // aa
          return this.profileTarget;
        }

        /**
         * @param value {@link #profile} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A specification of the profile that describes the solution's support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses.)
         */
        public ConformanceRestResourceComponent setProfileTarget(StructureDefinition value) { 
          this.profileTarget = value;
          return this;
        }

        /**
         * @return {@link #interaction} (Identifies a restful operation supported by the solution.)
         */
        public List<ResourceInteractionComponent> getInteraction() { 
          if (this.interaction == null)
            this.interaction = new ArrayList<ResourceInteractionComponent>();
          return this.interaction;
        }

        public boolean hasInteraction() { 
          if (this.interaction == null)
            return false;
          for (ResourceInteractionComponent item : this.interaction)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #interaction} (Identifies a restful operation supported by the solution.)
         */
    // syntactic sugar
        public ResourceInteractionComponent addInteraction() { //3
          ResourceInteractionComponent t = new ResourceInteractionComponent();
          if (this.interaction == null)
            this.interaction = new ArrayList<ResourceInteractionComponent>();
          this.interaction.add(t);
          return t;
        }

    // syntactic sugar
        public ConformanceRestResourceComponent addInteraction(ResourceInteractionComponent t) { //3
          if (t == null)
            return this;
          if (this.interaction == null)
            this.interaction = new ArrayList<ResourceInteractionComponent>();
          this.interaction.add(t);
          return this;
        }

        /**
         * @return {@link #versioning} (Thi field is set to true to specify that the system does not support (server) or use (client) versioning for this resource type. If this is not set to true, the server must at least correctly track and populate the versionId meta-property on resources.). This is the underlying object with id, value and extensions. The accessor "getVersioning" gives direct access to the value
         */
        public Enumeration<ResourceVersionPolicy> getVersioningElement() { 
          if (this.versioning == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceComponent.versioning");
            else if (Configuration.doAutoCreate())
              this.versioning = new Enumeration<ResourceVersionPolicy>(new ResourceVersionPolicyEnumFactory()); // bb
          return this.versioning;
        }

        public boolean hasVersioningElement() { 
          return this.versioning != null && !this.versioning.isEmpty();
        }

        public boolean hasVersioning() { 
          return this.versioning != null && !this.versioning.isEmpty();
        }

        /**
         * @param value {@link #versioning} (Thi field is set to true to specify that the system does not support (server) or use (client) versioning for this resource type. If this is not set to true, the server must at least correctly track and populate the versionId meta-property on resources.). This is the underlying object with id, value and extensions. The accessor "getVersioning" gives direct access to the value
         */
        public ConformanceRestResourceComponent setVersioningElement(Enumeration<ResourceVersionPolicy> value) { 
          this.versioning = value;
          return this;
        }

        /**
         * @return Thi field is set to true to specify that the system does not support (server) or use (client) versioning for this resource type. If this is not set to true, the server must at least correctly track and populate the versionId meta-property on resources.
         */
        public ResourceVersionPolicy getVersioning() { 
          return this.versioning == null ? null : this.versioning.getValue();
        }

        /**
         * @param value Thi field is set to true to specify that the system does not support (server) or use (client) versioning for this resource type. If this is not set to true, the server must at least correctly track and populate the versionId meta-property on resources.
         */
        public ConformanceRestResourceComponent setVersioning(ResourceVersionPolicy value) { 
          if (value == null)
            this.versioning = null;
          else {
            if (this.versioning == null)
              this.versioning = new Enumeration<ResourceVersionPolicy>(new ResourceVersionPolicyEnumFactory());
            this.versioning.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #readHistory} (A flag for whether the server is able to return past versions as part of the vRead operation.). This is the underlying object with id, value and extensions. The accessor "getReadHistory" gives direct access to the value
         */
        public BooleanType getReadHistoryElement() { 
          if (this.readHistory == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceComponent.readHistory");
            else if (Configuration.doAutoCreate())
              this.readHistory = new BooleanType(); // bb
          return this.readHistory;
        }

        public boolean hasReadHistoryElement() { 
          return this.readHistory != null && !this.readHistory.isEmpty();
        }

        public boolean hasReadHistory() { 
          return this.readHistory != null && !this.readHistory.isEmpty();
        }

        /**
         * @param value {@link #readHistory} (A flag for whether the server is able to return past versions as part of the vRead operation.). This is the underlying object with id, value and extensions. The accessor "getReadHistory" gives direct access to the value
         */
        public ConformanceRestResourceComponent setReadHistoryElement(BooleanType value) { 
          this.readHistory = value;
          return this;
        }

        /**
         * @return A flag for whether the server is able to return past versions as part of the vRead operation.
         */
        public boolean getReadHistory() { 
          return this.readHistory == null || this.readHistory.isEmpty() ? false : this.readHistory.getValue();
        }

        /**
         * @param value A flag for whether the server is able to return past versions as part of the vRead operation.
         */
        public ConformanceRestResourceComponent setReadHistory(boolean value) { 
            if (this.readHistory == null)
              this.readHistory = new BooleanType();
            this.readHistory.setValue(value);
          return this;
        }

        /**
         * @return {@link #updateCreate} (A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.). This is the underlying object with id, value and extensions. The accessor "getUpdateCreate" gives direct access to the value
         */
        public BooleanType getUpdateCreateElement() { 
          if (this.updateCreate == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceComponent.updateCreate");
            else if (Configuration.doAutoCreate())
              this.updateCreate = new BooleanType(); // bb
          return this.updateCreate;
        }

        public boolean hasUpdateCreateElement() { 
          return this.updateCreate != null && !this.updateCreate.isEmpty();
        }

        public boolean hasUpdateCreate() { 
          return this.updateCreate != null && !this.updateCreate.isEmpty();
        }

        /**
         * @param value {@link #updateCreate} (A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.). This is the underlying object with id, value and extensions. The accessor "getUpdateCreate" gives direct access to the value
         */
        public ConformanceRestResourceComponent setUpdateCreateElement(BooleanType value) { 
          this.updateCreate = value;
          return this;
        }

        /**
         * @return A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
         */
        public boolean getUpdateCreate() { 
          return this.updateCreate == null || this.updateCreate.isEmpty() ? false : this.updateCreate.getValue();
        }

        /**
         * @param value A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
         */
        public ConformanceRestResourceComponent setUpdateCreate(boolean value) { 
            if (this.updateCreate == null)
              this.updateCreate = new BooleanType();
            this.updateCreate.setValue(value);
          return this;
        }

        /**
         * @return {@link #conditionalCreate} (A flag that indicates that the server supports conditional create.). This is the underlying object with id, value and extensions. The accessor "getConditionalCreate" gives direct access to the value
         */
        public BooleanType getConditionalCreateElement() { 
          if (this.conditionalCreate == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceComponent.conditionalCreate");
            else if (Configuration.doAutoCreate())
              this.conditionalCreate = new BooleanType(); // bb
          return this.conditionalCreate;
        }

        public boolean hasConditionalCreateElement() { 
          return this.conditionalCreate != null && !this.conditionalCreate.isEmpty();
        }

        public boolean hasConditionalCreate() { 
          return this.conditionalCreate != null && !this.conditionalCreate.isEmpty();
        }

        /**
         * @param value {@link #conditionalCreate} (A flag that indicates that the server supports conditional create.). This is the underlying object with id, value and extensions. The accessor "getConditionalCreate" gives direct access to the value
         */
        public ConformanceRestResourceComponent setConditionalCreateElement(BooleanType value) { 
          this.conditionalCreate = value;
          return this;
        }

        /**
         * @return A flag that indicates that the server supports conditional create.
         */
        public boolean getConditionalCreate() { 
          return this.conditionalCreate == null || this.conditionalCreate.isEmpty() ? false : this.conditionalCreate.getValue();
        }

        /**
         * @param value A flag that indicates that the server supports conditional create.
         */
        public ConformanceRestResourceComponent setConditionalCreate(boolean value) { 
            if (this.conditionalCreate == null)
              this.conditionalCreate = new BooleanType();
            this.conditionalCreate.setValue(value);
          return this;
        }

        /**
         * @return {@link #conditionalUpdate} (A flag that indicates that the server supports conditional update.). This is the underlying object with id, value and extensions. The accessor "getConditionalUpdate" gives direct access to the value
         */
        public BooleanType getConditionalUpdateElement() { 
          if (this.conditionalUpdate == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceComponent.conditionalUpdate");
            else if (Configuration.doAutoCreate())
              this.conditionalUpdate = new BooleanType(); // bb
          return this.conditionalUpdate;
        }

        public boolean hasConditionalUpdateElement() { 
          return this.conditionalUpdate != null && !this.conditionalUpdate.isEmpty();
        }

        public boolean hasConditionalUpdate() { 
          return this.conditionalUpdate != null && !this.conditionalUpdate.isEmpty();
        }

        /**
         * @param value {@link #conditionalUpdate} (A flag that indicates that the server supports conditional update.). This is the underlying object with id, value and extensions. The accessor "getConditionalUpdate" gives direct access to the value
         */
        public ConformanceRestResourceComponent setConditionalUpdateElement(BooleanType value) { 
          this.conditionalUpdate = value;
          return this;
        }

        /**
         * @return A flag that indicates that the server supports conditional update.
         */
        public boolean getConditionalUpdate() { 
          return this.conditionalUpdate == null || this.conditionalUpdate.isEmpty() ? false : this.conditionalUpdate.getValue();
        }

        /**
         * @param value A flag that indicates that the server supports conditional update.
         */
        public ConformanceRestResourceComponent setConditionalUpdate(boolean value) { 
            if (this.conditionalUpdate == null)
              this.conditionalUpdate = new BooleanType();
            this.conditionalUpdate.setValue(value);
          return this;
        }

        /**
         * @return {@link #conditionalDelete} (A code that indicates how the server supports conditional delete.). This is the underlying object with id, value and extensions. The accessor "getConditionalDelete" gives direct access to the value
         */
        public Enumeration<ConditionalDeleteStatus> getConditionalDeleteElement() { 
          if (this.conditionalDelete == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceComponent.conditionalDelete");
            else if (Configuration.doAutoCreate())
              this.conditionalDelete = new Enumeration<ConditionalDeleteStatus>(new ConditionalDeleteStatusEnumFactory()); // bb
          return this.conditionalDelete;
        }

        public boolean hasConditionalDeleteElement() { 
          return this.conditionalDelete != null && !this.conditionalDelete.isEmpty();
        }

        public boolean hasConditionalDelete() { 
          return this.conditionalDelete != null && !this.conditionalDelete.isEmpty();
        }

        /**
         * @param value {@link #conditionalDelete} (A code that indicates how the server supports conditional delete.). This is the underlying object with id, value and extensions. The accessor "getConditionalDelete" gives direct access to the value
         */
        public ConformanceRestResourceComponent setConditionalDeleteElement(Enumeration<ConditionalDeleteStatus> value) { 
          this.conditionalDelete = value;
          return this;
        }

        /**
         * @return A code that indicates how the server supports conditional delete.
         */
        public ConditionalDeleteStatus getConditionalDelete() { 
          return this.conditionalDelete == null ? null : this.conditionalDelete.getValue();
        }

        /**
         * @param value A code that indicates how the server supports conditional delete.
         */
        public ConformanceRestResourceComponent setConditionalDelete(ConditionalDeleteStatus value) { 
          if (value == null)
            this.conditionalDelete = null;
          else {
            if (this.conditionalDelete == null)
              this.conditionalDelete = new Enumeration<ConditionalDeleteStatus>(new ConditionalDeleteStatusEnumFactory());
            this.conditionalDelete.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #searchInclude} (A list of _include values supported by the server.)
         */
        public List<StringType> getSearchInclude() { 
          if (this.searchInclude == null)
            this.searchInclude = new ArrayList<StringType>();
          return this.searchInclude;
        }

        public boolean hasSearchInclude() { 
          if (this.searchInclude == null)
            return false;
          for (StringType item : this.searchInclude)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #searchInclude} (A list of _include values supported by the server.)
         */
    // syntactic sugar
        public StringType addSearchIncludeElement() {//2 
          StringType t = new StringType();
          if (this.searchInclude == null)
            this.searchInclude = new ArrayList<StringType>();
          this.searchInclude.add(t);
          return t;
        }

        /**
         * @param value {@link #searchInclude} (A list of _include values supported by the server.)
         */
        public ConformanceRestResourceComponent addSearchInclude(String value) { //1
          StringType t = new StringType();
          t.setValue(value);
          if (this.searchInclude == null)
            this.searchInclude = new ArrayList<StringType>();
          this.searchInclude.add(t);
          return this;
        }

        /**
         * @param value {@link #searchInclude} (A list of _include values supported by the server.)
         */
        public boolean hasSearchInclude(String value) { 
          if (this.searchInclude == null)
            return false;
          for (StringType v : this.searchInclude)
            if (v.equals(value)) // string
              return true;
          return false;
        }

        /**
         * @return {@link #searchParam} (Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.)
         */
        public List<ConformanceRestResourceSearchParamComponent> getSearchParam() { 
          if (this.searchParam == null)
            this.searchParam = new ArrayList<ConformanceRestResourceSearchParamComponent>();
          return this.searchParam;
        }

        public boolean hasSearchParam() { 
          if (this.searchParam == null)
            return false;
          for (ConformanceRestResourceSearchParamComponent item : this.searchParam)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #searchParam} (Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.)
         */
    // syntactic sugar
        public ConformanceRestResourceSearchParamComponent addSearchParam() { //3
          ConformanceRestResourceSearchParamComponent t = new ConformanceRestResourceSearchParamComponent();
          if (this.searchParam == null)
            this.searchParam = new ArrayList<ConformanceRestResourceSearchParamComponent>();
          this.searchParam.add(t);
          return t;
        }

    // syntactic sugar
        public ConformanceRestResourceComponent addSearchParam(ConformanceRestResourceSearchParamComponent t) { //3
          if (t == null)
            return this;
          if (this.searchParam == null)
            this.searchParam = new ArrayList<ConformanceRestResourceSearchParamComponent>();
          this.searchParam.add(t);
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("type", "code", "A type of resource exposed via the restful interface.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("profile", "Reference(StructureDefinition)", "A specification of the profile that describes the solution's support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses.", 0, java.lang.Integer.MAX_VALUE, profile));
          childrenList.add(new Property("interaction", "", "Identifies a restful operation supported by the solution.", 0, java.lang.Integer.MAX_VALUE, interaction));
          childrenList.add(new Property("versioning", "code", "Thi field is set to true to specify that the system does not support (server) or use (client) versioning for this resource type. If this is not set to true, the server must at least correctly track and populate the versionId meta-property on resources.", 0, java.lang.Integer.MAX_VALUE, versioning));
          childrenList.add(new Property("readHistory", "boolean", "A flag for whether the server is able to return past versions as part of the vRead operation.", 0, java.lang.Integer.MAX_VALUE, readHistory));
          childrenList.add(new Property("updateCreate", "boolean", "A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.", 0, java.lang.Integer.MAX_VALUE, updateCreate));
          childrenList.add(new Property("conditionalCreate", "boolean", "A flag that indicates that the server supports conditional create.", 0, java.lang.Integer.MAX_VALUE, conditionalCreate));
          childrenList.add(new Property("conditionalUpdate", "boolean", "A flag that indicates that the server supports conditional update.", 0, java.lang.Integer.MAX_VALUE, conditionalUpdate));
          childrenList.add(new Property("conditionalDelete", "code", "A code that indicates how the server supports conditional delete.", 0, java.lang.Integer.MAX_VALUE, conditionalDelete));
          childrenList.add(new Property("searchInclude", "string", "A list of _include values supported by the server.", 0, java.lang.Integer.MAX_VALUE, searchInclude));
          childrenList.add(new Property("searchParam", "", "Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.", 0, java.lang.Integer.MAX_VALUE, searchParam));
        }

      public ConformanceRestResourceComponent copy() {
        ConformanceRestResourceComponent dst = new ConformanceRestResourceComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.profile = profile == null ? null : profile.copy();
        if (interaction != null) {
          dst.interaction = new ArrayList<ResourceInteractionComponent>();
          for (ResourceInteractionComponent i : interaction)
            dst.interaction.add(i.copy());
        };
        dst.versioning = versioning == null ? null : versioning.copy();
        dst.readHistory = readHistory == null ? null : readHistory.copy();
        dst.updateCreate = updateCreate == null ? null : updateCreate.copy();
        dst.conditionalCreate = conditionalCreate == null ? null : conditionalCreate.copy();
        dst.conditionalUpdate = conditionalUpdate == null ? null : conditionalUpdate.copy();
        dst.conditionalDelete = conditionalDelete == null ? null : conditionalDelete.copy();
        if (searchInclude != null) {
          dst.searchInclude = new ArrayList<StringType>();
          for (StringType i : searchInclude)
            dst.searchInclude.add(i.copy());
        };
        if (searchParam != null) {
          dst.searchParam = new ArrayList<ConformanceRestResourceSearchParamComponent>();
          for (ConformanceRestResourceSearchParamComponent i : searchParam)
            dst.searchParam.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceRestResourceComponent))
          return false;
        ConformanceRestResourceComponent o = (ConformanceRestResourceComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(profile, o.profile, true) && compareDeep(interaction, o.interaction, true)
           && compareDeep(versioning, o.versioning, true) && compareDeep(readHistory, o.readHistory, true)
           && compareDeep(updateCreate, o.updateCreate, true) && compareDeep(conditionalCreate, o.conditionalCreate, true)
           && compareDeep(conditionalUpdate, o.conditionalUpdate, true) && compareDeep(conditionalDelete, o.conditionalDelete, true)
           && compareDeep(searchInclude, o.searchInclude, true) && compareDeep(searchParam, o.searchParam, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceRestResourceComponent))
          return false;
        ConformanceRestResourceComponent o = (ConformanceRestResourceComponent) other;
        return compareValues(type, o.type, true) && compareValues(versioning, o.versioning, true) && compareValues(readHistory, o.readHistory, true)
           && compareValues(updateCreate, o.updateCreate, true) && compareValues(conditionalCreate, o.conditionalCreate, true)
           && compareValues(conditionalUpdate, o.conditionalUpdate, true) && compareValues(conditionalDelete, o.conditionalDelete, true)
           && compareValues(searchInclude, o.searchInclude, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (profile == null || profile.isEmpty())
           && (interaction == null || interaction.isEmpty()) && (versioning == null || versioning.isEmpty())
           && (readHistory == null || readHistory.isEmpty()) && (updateCreate == null || updateCreate.isEmpty())
           && (conditionalCreate == null || conditionalCreate.isEmpty()) && (conditionalUpdate == null || conditionalUpdate.isEmpty())
           && (conditionalDelete == null || conditionalDelete.isEmpty()) && (searchInclude == null || searchInclude.isEmpty())
           && (searchParam == null || searchParam.isEmpty());
      }

  }

    @Block()
    public static class ResourceInteractionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Coded identifier of the operation, supported by the system resource.
         */
        @Child(name = "code", type = {CodeType.class}, order=1, min=1, max=1)
        @Description(shortDefinition="read | vread | update | delete | history-instance | validate | history-type | create | search-type", formalDefinition="Coded identifier of the operation, supported by the system resource." )
        protected Enumeration<TypeRestfulInteraction> code;

        /**
         * Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'.
         */
        @Child(name = "documentation", type = {StringType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Anything special about operation behavior", formalDefinition="Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'." )
        protected StringType documentation;

        private static final long serialVersionUID = -437507806L;

    /*
     * Constructor
     */
      public ResourceInteractionComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ResourceInteractionComponent(Enumeration<TypeRestfulInteraction> code) {
        super();
        this.code = code;
      }

        /**
         * @return {@link #code} (Coded identifier of the operation, supported by the system resource.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public Enumeration<TypeRestfulInteraction> getCodeElement() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResourceInteractionComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new Enumeration<TypeRestfulInteraction>(new TypeRestfulInteractionEnumFactory()); // bb
          return this.code;
        }

        public boolean hasCodeElement() { 
          return this.code != null && !this.code.isEmpty();
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (Coded identifier of the operation, supported by the system resource.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public ResourceInteractionComponent setCodeElement(Enumeration<TypeRestfulInteraction> value) { 
          this.code = value;
          return this;
        }

        /**
         * @return Coded identifier of the operation, supported by the system resource.
         */
        public TypeRestfulInteraction getCode() { 
          return this.code == null ? null : this.code.getValue();
        }

        /**
         * @param value Coded identifier of the operation, supported by the system resource.
         */
        public ResourceInteractionComponent setCode(TypeRestfulInteraction value) { 
            if (this.code == null)
              this.code = new Enumeration<TypeRestfulInteraction>(new TypeRestfulInteractionEnumFactory());
            this.code.setValue(value);
          return this;
        }

        /**
         * @return {@link #documentation} (Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public StringType getDocumentationElement() { 
          if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResourceInteractionComponent.documentation");
            else if (Configuration.doAutoCreate())
              this.documentation = new StringType(); // bb
          return this.documentation;
        }

        public boolean hasDocumentationElement() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        public boolean hasDocumentation() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        /**
         * @param value {@link #documentation} (Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public ResourceInteractionComponent setDocumentationElement(StringType value) { 
          this.documentation = value;
          return this;
        }

        /**
         * @return Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'.
         */
        public String getDocumentation() { 
          return this.documentation == null ? null : this.documentation.getValue();
        }

        /**
         * @param value Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'.
         */
        public ResourceInteractionComponent setDocumentation(String value) { 
          if (Utilities.noString(value))
            this.documentation = null;
          else {
            if (this.documentation == null)
              this.documentation = new StringType();
            this.documentation.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("code", "code", "Coded identifier of the operation, supported by the system resource.", 0, java.lang.Integer.MAX_VALUE, code));
          childrenList.add(new Property("documentation", "string", "Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'.", 0, java.lang.Integer.MAX_VALUE, documentation));
        }

      public ResourceInteractionComponent copy() {
        ResourceInteractionComponent dst = new ResourceInteractionComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ResourceInteractionComponent))
          return false;
        ResourceInteractionComponent o = (ResourceInteractionComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(documentation, o.documentation, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ResourceInteractionComponent))
          return false;
        ResourceInteractionComponent o = (ResourceInteractionComponent) other;
        return compareValues(code, o.code, true) && compareValues(documentation, o.documentation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (documentation == null || documentation.isEmpty())
          ;
      }

  }

    @Block()
    public static class ConformanceRestResourceSearchParamComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The name of the search parameter used in the interface.
         */
        @Child(name = "name", type = {StringType.class}, order=1, min=1, max=1)
        @Description(shortDefinition="Name of search parameter", formalDefinition="The name of the search parameter used in the interface." )
        protected StringType name;

        /**
         * An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).
         */
        @Child(name = "definition", type = {UriType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Source of definition for parameter", formalDefinition="An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]])." )
        protected UriType definition;

        /**
         * The type of value a search parameter refers to, and how the content is interpreted.
         */
        @Child(name = "type", type = {CodeType.class}, order=3, min=1, max=1)
        @Description(shortDefinition="number | date | string | token | reference | composite | quantity | uri", formalDefinition="The type of value a search parameter refers to, and how the content is interpreted." )
        protected Enumeration<SearchParamType> type;

        /**
         * This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
         */
        @Child(name = "documentation", type = {StringType.class}, order=4, min=0, max=1)
        @Description(shortDefinition="Server-specific usage", formalDefinition="This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms." )
        protected StringType documentation;

        /**
         * Types of resource (if a resource is referenced).
         */
        @Child(name = "target", type = {CodeType.class}, order=5, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Types of resource (if a resource reference)", formalDefinition="Types of resource (if a resource is referenced)." )
        protected List<CodeType> target;

        /**
         * A modifier supported for the search parameter.
         */
        @Child(name = "modifier", type = {CodeType.class}, order=6, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="missing | exact | contains | not | text | in | not-in | below | above | type", formalDefinition="A modifier supported for the search parameter." )
        protected List<Enumeration<SearchModifierCode>> modifier;

        /**
         * Chained names supported.
         */
        @Child(name = "chain", type = {StringType.class}, order=7, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Chained names supported", formalDefinition="Chained names supported." )
        protected List<StringType> chain;

        private static final long serialVersionUID = -1020405086L;

    /*
     * Constructor
     */
      public ConformanceRestResourceSearchParamComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ConformanceRestResourceSearchParamComponent(StringType name, Enumeration<SearchParamType> type) {
        super();
        this.name = name;
        this.type = type;
      }

        /**
         * @return {@link #name} (The name of the search parameter used in the interface.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceSearchParamComponent.name");
            else if (Configuration.doAutoCreate())
              this.name = new StringType(); // bb
          return this.name;
        }

        public boolean hasNameElement() { 
          return this.name != null && !this.name.isEmpty();
        }

        public boolean hasName() { 
          return this.name != null && !this.name.isEmpty();
        }

        /**
         * @param value {@link #name} (The name of the search parameter used in the interface.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public ConformanceRestResourceSearchParamComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return The name of the search parameter used in the interface.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value The name of the search parameter used in the interface.
         */
        public ConformanceRestResourceSearchParamComponent setName(String value) { 
            if (this.name == null)
              this.name = new StringType();
            this.name.setValue(value);
          return this;
        }

        /**
         * @return {@link #definition} (An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).). This is the underlying object with id, value and extensions. The accessor "getDefinition" gives direct access to the value
         */
        public UriType getDefinitionElement() { 
          if (this.definition == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceSearchParamComponent.definition");
            else if (Configuration.doAutoCreate())
              this.definition = new UriType(); // bb
          return this.definition;
        }

        public boolean hasDefinitionElement() { 
          return this.definition != null && !this.definition.isEmpty();
        }

        public boolean hasDefinition() { 
          return this.definition != null && !this.definition.isEmpty();
        }

        /**
         * @param value {@link #definition} (An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).). This is the underlying object with id, value and extensions. The accessor "getDefinition" gives direct access to the value
         */
        public ConformanceRestResourceSearchParamComponent setDefinitionElement(UriType value) { 
          this.definition = value;
          return this;
        }

        /**
         * @return An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).
         */
        public String getDefinition() { 
          return this.definition == null ? null : this.definition.getValue();
        }

        /**
         * @param value An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).
         */
        public ConformanceRestResourceSearchParamComponent setDefinition(String value) { 
          if (Utilities.noString(value))
            this.definition = null;
          else {
            if (this.definition == null)
              this.definition = new UriType();
            this.definition.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #type} (The type of value a search parameter refers to, and how the content is interpreted.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public Enumeration<SearchParamType> getTypeElement() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceSearchParamComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new Enumeration<SearchParamType>(new SearchParamTypeEnumFactory()); // bb
          return this.type;
        }

        public boolean hasTypeElement() { 
          return this.type != null && !this.type.isEmpty();
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (The type of value a search parameter refers to, and how the content is interpreted.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public ConformanceRestResourceSearchParamComponent setTypeElement(Enumeration<SearchParamType> value) { 
          this.type = value;
          return this;
        }

        /**
         * @return The type of value a search parameter refers to, and how the content is interpreted.
         */
        public SearchParamType getType() { 
          return this.type == null ? null : this.type.getValue();
        }

        /**
         * @param value The type of value a search parameter refers to, and how the content is interpreted.
         */
        public ConformanceRestResourceSearchParamComponent setType(SearchParamType value) { 
            if (this.type == null)
              this.type = new Enumeration<SearchParamType>(new SearchParamTypeEnumFactory());
            this.type.setValue(value);
          return this;
        }

        /**
         * @return {@link #documentation} (This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public StringType getDocumentationElement() { 
          if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestResourceSearchParamComponent.documentation");
            else if (Configuration.doAutoCreate())
              this.documentation = new StringType(); // bb
          return this.documentation;
        }

        public boolean hasDocumentationElement() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        public boolean hasDocumentation() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        /**
         * @param value {@link #documentation} (This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public ConformanceRestResourceSearchParamComponent setDocumentationElement(StringType value) { 
          this.documentation = value;
          return this;
        }

        /**
         * @return This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
         */
        public String getDocumentation() { 
          return this.documentation == null ? null : this.documentation.getValue();
        }

        /**
         * @param value This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
         */
        public ConformanceRestResourceSearchParamComponent setDocumentation(String value) { 
          if (Utilities.noString(value))
            this.documentation = null;
          else {
            if (this.documentation == null)
              this.documentation = new StringType();
            this.documentation.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #target} (Types of resource (if a resource is referenced).)
         */
        public List<CodeType> getTarget() { 
          if (this.target == null)
            this.target = new ArrayList<CodeType>();
          return this.target;
        }

        public boolean hasTarget() { 
          if (this.target == null)
            return false;
          for (CodeType item : this.target)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #target} (Types of resource (if a resource is referenced).)
         */
    // syntactic sugar
        public CodeType addTargetElement() {//2 
          CodeType t = new CodeType();
          if (this.target == null)
            this.target = new ArrayList<CodeType>();
          this.target.add(t);
          return t;
        }

        /**
         * @param value {@link #target} (Types of resource (if a resource is referenced).)
         */
        public ConformanceRestResourceSearchParamComponent addTarget(String value) { //1
          CodeType t = new CodeType();
          t.setValue(value);
          if (this.target == null)
            this.target = new ArrayList<CodeType>();
          this.target.add(t);
          return this;
        }

        /**
         * @param value {@link #target} (Types of resource (if a resource is referenced).)
         */
        public boolean hasTarget(String value) { 
          if (this.target == null)
            return false;
          for (CodeType v : this.target)
            if (v.equals(value)) // code
              return true;
          return false;
        }

        /**
         * @return {@link #modifier} (A modifier supported for the search parameter.)
         */
        public List<Enumeration<SearchModifierCode>> getModifier() { 
          if (this.modifier == null)
            this.modifier = new ArrayList<Enumeration<SearchModifierCode>>();
          return this.modifier;
        }

        public boolean hasModifier() { 
          if (this.modifier == null)
            return false;
          for (Enumeration<SearchModifierCode> item : this.modifier)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #modifier} (A modifier supported for the search parameter.)
         */
    // syntactic sugar
        public Enumeration<SearchModifierCode> addModifierElement() {//2 
          Enumeration<SearchModifierCode> t = new Enumeration<SearchModifierCode>(new SearchModifierCodeEnumFactory());
          if (this.modifier == null)
            this.modifier = new ArrayList<Enumeration<SearchModifierCode>>();
          this.modifier.add(t);
          return t;
        }

        /**
         * @param value {@link #modifier} (A modifier supported for the search parameter.)
         */
        public ConformanceRestResourceSearchParamComponent addModifier(SearchModifierCode value) { //1
          Enumeration<SearchModifierCode> t = new Enumeration<SearchModifierCode>(new SearchModifierCodeEnumFactory());
          t.setValue(value);
          if (this.modifier == null)
            this.modifier = new ArrayList<Enumeration<SearchModifierCode>>();
          this.modifier.add(t);
          return this;
        }

        /**
         * @param value {@link #modifier} (A modifier supported for the search parameter.)
         */
        public boolean hasModifier(SearchModifierCode value) { 
          if (this.modifier == null)
            return false;
          for (Enumeration<SearchModifierCode> v : this.modifier)
            if (v.equals(value)) // code
              return true;
          return false;
        }

        /**
         * @return {@link #chain} (Chained names supported.)
         */
        public List<StringType> getChain() { 
          if (this.chain == null)
            this.chain = new ArrayList<StringType>();
          return this.chain;
        }

        public boolean hasChain() { 
          if (this.chain == null)
            return false;
          for (StringType item : this.chain)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #chain} (Chained names supported.)
         */
    // syntactic sugar
        public StringType addChainElement() {//2 
          StringType t = new StringType();
          if (this.chain == null)
            this.chain = new ArrayList<StringType>();
          this.chain.add(t);
          return t;
        }

        /**
         * @param value {@link #chain} (Chained names supported.)
         */
        public ConformanceRestResourceSearchParamComponent addChain(String value) { //1
          StringType t = new StringType();
          t.setValue(value);
          if (this.chain == null)
            this.chain = new ArrayList<StringType>();
          this.chain.add(t);
          return this;
        }

        /**
         * @param value {@link #chain} (Chained names supported.)
         */
        public boolean hasChain(String value) { 
          if (this.chain == null)
            return false;
          for (StringType v : this.chain)
            if (v.equals(value)) // string
              return true;
          return false;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("name", "string", "The name of the search parameter used in the interface.", 0, java.lang.Integer.MAX_VALUE, name));
          childrenList.add(new Property("definition", "uri", "An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).", 0, java.lang.Integer.MAX_VALUE, definition));
          childrenList.add(new Property("type", "code", "The type of value a search parameter refers to, and how the content is interpreted.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("documentation", "string", "This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.", 0, java.lang.Integer.MAX_VALUE, documentation));
          childrenList.add(new Property("target", "code", "Types of resource (if a resource is referenced).", 0, java.lang.Integer.MAX_VALUE, target));
          childrenList.add(new Property("modifier", "code", "A modifier supported for the search parameter.", 0, java.lang.Integer.MAX_VALUE, modifier));
          childrenList.add(new Property("chain", "string", "Chained names supported.", 0, java.lang.Integer.MAX_VALUE, chain));
        }

      public ConformanceRestResourceSearchParamComponent copy() {
        ConformanceRestResourceSearchParamComponent dst = new ConformanceRestResourceSearchParamComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.definition = definition == null ? null : definition.copy();
        dst.type = type == null ? null : type.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        if (target != null) {
          dst.target = new ArrayList<CodeType>();
          for (CodeType i : target)
            dst.target.add(i.copy());
        };
        if (modifier != null) {
          dst.modifier = new ArrayList<Enumeration<SearchModifierCode>>();
          for (Enumeration<SearchModifierCode> i : modifier)
            dst.modifier.add(i.copy());
        };
        if (chain != null) {
          dst.chain = new ArrayList<StringType>();
          for (StringType i : chain)
            dst.chain.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceRestResourceSearchParamComponent))
          return false;
        ConformanceRestResourceSearchParamComponent o = (ConformanceRestResourceSearchParamComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(definition, o.definition, true) && compareDeep(type, o.type, true)
           && compareDeep(documentation, o.documentation, true) && compareDeep(target, o.target, true) && compareDeep(modifier, o.modifier, true)
           && compareDeep(chain, o.chain, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceRestResourceSearchParamComponent))
          return false;
        ConformanceRestResourceSearchParamComponent o = (ConformanceRestResourceSearchParamComponent) other;
        return compareValues(name, o.name, true) && compareValues(definition, o.definition, true) && compareValues(type, o.type, true)
           && compareValues(documentation, o.documentation, true) && compareValues(target, o.target, true) && compareValues(modifier, o.modifier, true)
           && compareValues(chain, o.chain, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (definition == null || definition.isEmpty())
           && (type == null || type.isEmpty()) && (documentation == null || documentation.isEmpty())
           && (target == null || target.isEmpty()) && (modifier == null || modifier.isEmpty()) && (chain == null || chain.isEmpty())
          ;
      }

  }

    @Block()
    public static class SystemInteractionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A coded identifier of the operation, supported by the system.
         */
        @Child(name = "code", type = {CodeType.class}, order=1, min=1, max=1)
        @Description(shortDefinition="transaction | search-system | history-system", formalDefinition="A coded identifier of the operation, supported by the system." )
        protected Enumeration<SystemRestfulInteraction> code;

        /**
         * Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.
         */
        @Child(name = "documentation", type = {StringType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Anything special about operation behavior", formalDefinition="Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented." )
        protected StringType documentation;

        private static final long serialVersionUID = 510675287L;

    /*
     * Constructor
     */
      public SystemInteractionComponent() {
        super();
      }

    /*
     * Constructor
     */
      public SystemInteractionComponent(Enumeration<SystemRestfulInteraction> code) {
        super();
        this.code = code;
      }

        /**
         * @return {@link #code} (A coded identifier of the operation, supported by the system.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public Enumeration<SystemRestfulInteraction> getCodeElement() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SystemInteractionComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new Enumeration<SystemRestfulInteraction>(new SystemRestfulInteractionEnumFactory()); // bb
          return this.code;
        }

        public boolean hasCodeElement() { 
          return this.code != null && !this.code.isEmpty();
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (A coded identifier of the operation, supported by the system.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public SystemInteractionComponent setCodeElement(Enumeration<SystemRestfulInteraction> value) { 
          this.code = value;
          return this;
        }

        /**
         * @return A coded identifier of the operation, supported by the system.
         */
        public SystemRestfulInteraction getCode() { 
          return this.code == null ? null : this.code.getValue();
        }

        /**
         * @param value A coded identifier of the operation, supported by the system.
         */
        public SystemInteractionComponent setCode(SystemRestfulInteraction value) { 
            if (this.code == null)
              this.code = new Enumeration<SystemRestfulInteraction>(new SystemRestfulInteractionEnumFactory());
            this.code.setValue(value);
          return this;
        }

        /**
         * @return {@link #documentation} (Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public StringType getDocumentationElement() { 
          if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SystemInteractionComponent.documentation");
            else if (Configuration.doAutoCreate())
              this.documentation = new StringType(); // bb
          return this.documentation;
        }

        public boolean hasDocumentationElement() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        public boolean hasDocumentation() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        /**
         * @param value {@link #documentation} (Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public SystemInteractionComponent setDocumentationElement(StringType value) { 
          this.documentation = value;
          return this;
        }

        /**
         * @return Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.
         */
        public String getDocumentation() { 
          return this.documentation == null ? null : this.documentation.getValue();
        }

        /**
         * @param value Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.
         */
        public SystemInteractionComponent setDocumentation(String value) { 
          if (Utilities.noString(value))
            this.documentation = null;
          else {
            if (this.documentation == null)
              this.documentation = new StringType();
            this.documentation.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("code", "code", "A coded identifier of the operation, supported by the system.", 0, java.lang.Integer.MAX_VALUE, code));
          childrenList.add(new Property("documentation", "string", "Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.", 0, java.lang.Integer.MAX_VALUE, documentation));
        }

      public SystemInteractionComponent copy() {
        SystemInteractionComponent dst = new SystemInteractionComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof SystemInteractionComponent))
          return false;
        SystemInteractionComponent o = (SystemInteractionComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(documentation, o.documentation, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof SystemInteractionComponent))
          return false;
        SystemInteractionComponent o = (SystemInteractionComponent) other;
        return compareValues(code, o.code, true) && compareValues(documentation, o.documentation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (documentation == null || documentation.isEmpty())
          ;
      }

  }

    @Block()
    public static class ConformanceRestOperationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The name of a query, which is used in the _query parameter when the query is called.
         */
        @Child(name = "name", type = {StringType.class}, order=1, min=1, max=1)
        @Description(shortDefinition="Name by which the operation/query is invoked", formalDefinition="The name of a query, which is used in the _query parameter when the query is called." )
        protected StringType name;

        /**
         * Where the formal definition can be found.
         */
        @Child(name = "definition", type = {OperationDefinition.class}, order=2, min=1, max=1)
        @Description(shortDefinition="The defined operation/query", formalDefinition="Where the formal definition can be found." )
        protected Reference definition;

        /**
         * The actual object that is the target of the reference (Where the formal definition can be found.)
         */
        protected OperationDefinition definitionTarget;

        private static final long serialVersionUID = 122107272L;

    /*
     * Constructor
     */
      public ConformanceRestOperationComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ConformanceRestOperationComponent(StringType name, Reference definition) {
        super();
        this.name = name;
        this.definition = definition;
      }

        /**
         * @return {@link #name} (The name of a query, which is used in the _query parameter when the query is called.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestOperationComponent.name");
            else if (Configuration.doAutoCreate())
              this.name = new StringType(); // bb
          return this.name;
        }

        public boolean hasNameElement() { 
          return this.name != null && !this.name.isEmpty();
        }

        public boolean hasName() { 
          return this.name != null && !this.name.isEmpty();
        }

        /**
         * @param value {@link #name} (The name of a query, which is used in the _query parameter when the query is called.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public ConformanceRestOperationComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return The name of a query, which is used in the _query parameter when the query is called.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value The name of a query, which is used in the _query parameter when the query is called.
         */
        public ConformanceRestOperationComponent setName(String value) { 
            if (this.name == null)
              this.name = new StringType();
            this.name.setValue(value);
          return this;
        }

        /**
         * @return {@link #definition} (Where the formal definition can be found.)
         */
        public Reference getDefinition() { 
          if (this.definition == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestOperationComponent.definition");
            else if (Configuration.doAutoCreate())
              this.definition = new Reference(); // cc
          return this.definition;
        }

        public boolean hasDefinition() { 
          return this.definition != null && !this.definition.isEmpty();
        }

        /**
         * @param value {@link #definition} (Where the formal definition can be found.)
         */
        public ConformanceRestOperationComponent setDefinition(Reference value) { 
          this.definition = value;
          return this;
        }

        /**
         * @return {@link #definition} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Where the formal definition can be found.)
         */
        public OperationDefinition getDefinitionTarget() { 
          if (this.definitionTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceRestOperationComponent.definition");
            else if (Configuration.doAutoCreate())
              this.definitionTarget = new OperationDefinition(); // aa
          return this.definitionTarget;
        }

        /**
         * @param value {@link #definition} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Where the formal definition can be found.)
         */
        public ConformanceRestOperationComponent setDefinitionTarget(OperationDefinition value) { 
          this.definitionTarget = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("name", "string", "The name of a query, which is used in the _query parameter when the query is called.", 0, java.lang.Integer.MAX_VALUE, name));
          childrenList.add(new Property("definition", "Reference(OperationDefinition)", "Where the formal definition can be found.", 0, java.lang.Integer.MAX_VALUE, definition));
        }

      public ConformanceRestOperationComponent copy() {
        ConformanceRestOperationComponent dst = new ConformanceRestOperationComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.definition = definition == null ? null : definition.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceRestOperationComponent))
          return false;
        ConformanceRestOperationComponent o = (ConformanceRestOperationComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(definition, o.definition, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceRestOperationComponent))
          return false;
        ConformanceRestOperationComponent o = (ConformanceRestOperationComponent) other;
        return compareValues(name, o.name, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (definition == null || definition.isEmpty())
          ;
      }

  }

    @Block()
    public static class ConformanceMessagingComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * An address to which messages and/or replies are to be sent.
         */
        @Child(name = "endpoint", type = {UriType.class}, order=1, min=0, max=1)
        @Description(shortDefinition="Actual endpoint being described", formalDefinition="An address to which messages and/or replies are to be sent." )
        protected UriType endpoint;

        /**
         * Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).
         */
        @Child(name = "reliableCache", type = {UnsignedIntType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Reliable Message Cache Length (min)", formalDefinition="Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender)." )
        protected UnsignedIntType reliableCache;

        /**
         * Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
         */
        @Child(name = "documentation", type = {StringType.class}, order=3, min=0, max=1)
        @Description(shortDefinition="Messaging interface behavior details", formalDefinition="Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner." )
        protected StringType documentation;

        /**
         * A description of the solution's support for an event at this end point.
         */
        @Child(name = "event", type = {}, order=4, min=1, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Declare support for this event", formalDefinition="A description of the solution's support for an event at this end point." )
        protected List<ConformanceMessagingEventComponent> event;

        private static final long serialVersionUID = -1356115534L;

    /*
     * Constructor
     */
      public ConformanceMessagingComponent() {
        super();
      }

        /**
         * @return {@link #endpoint} (An address to which messages and/or replies are to be sent.). This is the underlying object with id, value and extensions. The accessor "getEndpoint" gives direct access to the value
         */
        public UriType getEndpointElement() { 
          if (this.endpoint == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingComponent.endpoint");
            else if (Configuration.doAutoCreate())
              this.endpoint = new UriType(); // bb
          return this.endpoint;
        }

        public boolean hasEndpointElement() { 
          return this.endpoint != null && !this.endpoint.isEmpty();
        }

        public boolean hasEndpoint() { 
          return this.endpoint != null && !this.endpoint.isEmpty();
        }

        /**
         * @param value {@link #endpoint} (An address to which messages and/or replies are to be sent.). This is the underlying object with id, value and extensions. The accessor "getEndpoint" gives direct access to the value
         */
        public ConformanceMessagingComponent setEndpointElement(UriType value) { 
          this.endpoint = value;
          return this;
        }

        /**
         * @return An address to which messages and/or replies are to be sent.
         */
        public String getEndpoint() { 
          return this.endpoint == null ? null : this.endpoint.getValue();
        }

        /**
         * @param value An address to which messages and/or replies are to be sent.
         */
        public ConformanceMessagingComponent setEndpoint(String value) { 
          if (Utilities.noString(value))
            this.endpoint = null;
          else {
            if (this.endpoint == null)
              this.endpoint = new UriType();
            this.endpoint.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #reliableCache} (Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).). This is the underlying object with id, value and extensions. The accessor "getReliableCache" gives direct access to the value
         */
        public UnsignedIntType getReliableCacheElement() { 
          if (this.reliableCache == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingComponent.reliableCache");
            else if (Configuration.doAutoCreate())
              this.reliableCache = new UnsignedIntType(); // bb
          return this.reliableCache;
        }

        public boolean hasReliableCacheElement() { 
          return this.reliableCache != null && !this.reliableCache.isEmpty();
        }

        public boolean hasReliableCache() { 
          return this.reliableCache != null && !this.reliableCache.isEmpty();
        }

        /**
         * @param value {@link #reliableCache} (Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).). This is the underlying object with id, value and extensions. The accessor "getReliableCache" gives direct access to the value
         */
        public ConformanceMessagingComponent setReliableCacheElement(UnsignedIntType value) { 
          this.reliableCache = value;
          return this;
        }

        /**
         * @return Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).
         */
        public int getReliableCache() { 
          return this.reliableCache == null || this.reliableCache.isEmpty() ? 0 : this.reliableCache.getValue();
        }

        /**
         * @param value Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).
         */
        public ConformanceMessagingComponent setReliableCache(int value) { 
            if (this.reliableCache == null)
              this.reliableCache = new UnsignedIntType();
            this.reliableCache.setValue(value);
          return this;
        }

        /**
         * @return {@link #documentation} (Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public StringType getDocumentationElement() { 
          if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingComponent.documentation");
            else if (Configuration.doAutoCreate())
              this.documentation = new StringType(); // bb
          return this.documentation;
        }

        public boolean hasDocumentationElement() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        public boolean hasDocumentation() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        /**
         * @param value {@link #documentation} (Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public ConformanceMessagingComponent setDocumentationElement(StringType value) { 
          this.documentation = value;
          return this;
        }

        /**
         * @return Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
         */
        public String getDocumentation() { 
          return this.documentation == null ? null : this.documentation.getValue();
        }

        /**
         * @param value Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
         */
        public ConformanceMessagingComponent setDocumentation(String value) { 
          if (Utilities.noString(value))
            this.documentation = null;
          else {
            if (this.documentation == null)
              this.documentation = new StringType();
            this.documentation.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #event} (A description of the solution's support for an event at this end point.)
         */
        public List<ConformanceMessagingEventComponent> getEvent() { 
          if (this.event == null)
            this.event = new ArrayList<ConformanceMessagingEventComponent>();
          return this.event;
        }

        public boolean hasEvent() { 
          if (this.event == null)
            return false;
          for (ConformanceMessagingEventComponent item : this.event)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #event} (A description of the solution's support for an event at this end point.)
         */
    // syntactic sugar
        public ConformanceMessagingEventComponent addEvent() { //3
          ConformanceMessagingEventComponent t = new ConformanceMessagingEventComponent();
          if (this.event == null)
            this.event = new ArrayList<ConformanceMessagingEventComponent>();
          this.event.add(t);
          return t;
        }

    // syntactic sugar
        public ConformanceMessagingComponent addEvent(ConformanceMessagingEventComponent t) { //3
          if (t == null)
            return this;
          if (this.event == null)
            this.event = new ArrayList<ConformanceMessagingEventComponent>();
          this.event.add(t);
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("endpoint", "uri", "An address to which messages and/or replies are to be sent.", 0, java.lang.Integer.MAX_VALUE, endpoint));
          childrenList.add(new Property("reliableCache", "unsignedInt", "Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).", 0, java.lang.Integer.MAX_VALUE, reliableCache));
          childrenList.add(new Property("documentation", "string", "Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.", 0, java.lang.Integer.MAX_VALUE, documentation));
          childrenList.add(new Property("event", "", "A description of the solution's support for an event at this end point.", 0, java.lang.Integer.MAX_VALUE, event));
        }

      public ConformanceMessagingComponent copy() {
        ConformanceMessagingComponent dst = new ConformanceMessagingComponent();
        copyValues(dst);
        dst.endpoint = endpoint == null ? null : endpoint.copy();
        dst.reliableCache = reliableCache == null ? null : reliableCache.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        if (event != null) {
          dst.event = new ArrayList<ConformanceMessagingEventComponent>();
          for (ConformanceMessagingEventComponent i : event)
            dst.event.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceMessagingComponent))
          return false;
        ConformanceMessagingComponent o = (ConformanceMessagingComponent) other;
        return compareDeep(endpoint, o.endpoint, true) && compareDeep(reliableCache, o.reliableCache, true)
           && compareDeep(documentation, o.documentation, true) && compareDeep(event, o.event, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceMessagingComponent))
          return false;
        ConformanceMessagingComponent o = (ConformanceMessagingComponent) other;
        return compareValues(endpoint, o.endpoint, true) && compareValues(reliableCache, o.reliableCache, true)
           && compareValues(documentation, o.documentation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (endpoint == null || endpoint.isEmpty()) && (reliableCache == null || reliableCache.isEmpty())
           && (documentation == null || documentation.isEmpty()) && (event == null || event.isEmpty())
          ;
      }

  }

    @Block()
    public static class ConformanceMessagingEventComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A coded identifier of a supported messaging event.
         */
        @Child(name = "code", type = {Coding.class}, order=1, min=1, max=1)
        @Description(shortDefinition="Event type", formalDefinition="A coded identifier of a supported messaging event." )
        protected Coding code;

        /**
         * The impact of the content of the message.
         */
        @Child(name = "category", type = {CodeType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Consequence | Currency | Notification", formalDefinition="The impact of the content of the message." )
        protected Enumeration<MessageSignificanceCategory> category;

        /**
         * The mode of this event declaration - whether application is sender or receiver.
         */
        @Child(name = "mode", type = {CodeType.class}, order=3, min=1, max=1)
        @Description(shortDefinition="sender | receiver", formalDefinition="The mode of this event declaration - whether application is sender or receiver." )
        protected Enumeration<ConformanceEventMode> mode;

        /**
         * A list of the messaging transport protocol(s) identifiers, supported by this endpoint.
         */
        @Child(name = "protocol", type = {Coding.class}, order=4, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="http | ftp | mllp +", formalDefinition="A list of the messaging transport protocol(s) identifiers, supported by this endpoint." )
        protected List<Coding> protocol;

        /**
         * A resource associated with the event.  This is the resource that defines the event.
         */
        @Child(name = "focus", type = {CodeType.class}, order=5, min=1, max=1)
        @Description(shortDefinition="Resource that's focus of message", formalDefinition="A resource associated with the event.  This is the resource that defines the event." )
        protected CodeType focus;

        /**
         * Information about the request for this event.
         */
        @Child(name = "request", type = {StructureDefinition.class}, order=6, min=1, max=1)
        @Description(shortDefinition="Profile that describes the request", formalDefinition="Information about the request for this event." )
        protected Reference request;

        /**
         * The actual object that is the target of the reference (Information about the request for this event.)
         */
        protected StructureDefinition requestTarget;

        /**
         * Information about the response for this event.
         */
        @Child(name = "response", type = {StructureDefinition.class}, order=7, min=1, max=1)
        @Description(shortDefinition="Profile that describes the response", formalDefinition="Information about the response for this event." )
        protected Reference response;

        /**
         * The actual object that is the target of the reference (Information about the response for this event.)
         */
        protected StructureDefinition responseTarget;

        /**
         * Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
         */
        @Child(name = "documentation", type = {StringType.class}, order=8, min=0, max=1)
        @Description(shortDefinition="Endpoint-specific event documentation", formalDefinition="Guidance on how this event is handled, such as internal system trigger points, business rules, etc." )
        protected StringType documentation;

        private static final long serialVersionUID = 231905194L;

    /*
     * Constructor
     */
      public ConformanceMessagingEventComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ConformanceMessagingEventComponent(Coding code, Enumeration<ConformanceEventMode> mode, CodeType focus, Reference request, Reference response) {
        super();
        this.code = code;
        this.mode = mode;
        this.focus = focus;
        this.request = request;
        this.response = response;
      }

        /**
         * @return {@link #code} (A coded identifier of a supported messaging event.)
         */
        public Coding getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new Coding(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (A coded identifier of a supported messaging event.)
         */
        public ConformanceMessagingEventComponent setCode(Coding value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #category} (The impact of the content of the message.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
         */
        public Enumeration<MessageSignificanceCategory> getCategoryElement() { 
          if (this.category == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.category");
            else if (Configuration.doAutoCreate())
              this.category = new Enumeration<MessageSignificanceCategory>(new MessageSignificanceCategoryEnumFactory()); // bb
          return this.category;
        }

        public boolean hasCategoryElement() { 
          return this.category != null && !this.category.isEmpty();
        }

        public boolean hasCategory() { 
          return this.category != null && !this.category.isEmpty();
        }

        /**
         * @param value {@link #category} (The impact of the content of the message.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
         */
        public ConformanceMessagingEventComponent setCategoryElement(Enumeration<MessageSignificanceCategory> value) { 
          this.category = value;
          return this;
        }

        /**
         * @return The impact of the content of the message.
         */
        public MessageSignificanceCategory getCategory() { 
          return this.category == null ? null : this.category.getValue();
        }

        /**
         * @param value The impact of the content of the message.
         */
        public ConformanceMessagingEventComponent setCategory(MessageSignificanceCategory value) { 
          if (value == null)
            this.category = null;
          else {
            if (this.category == null)
              this.category = new Enumeration<MessageSignificanceCategory>(new MessageSignificanceCategoryEnumFactory());
            this.category.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #mode} (The mode of this event declaration - whether application is sender or receiver.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public Enumeration<ConformanceEventMode> getModeElement() { 
          if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.mode");
            else if (Configuration.doAutoCreate())
              this.mode = new Enumeration<ConformanceEventMode>(new ConformanceEventModeEnumFactory()); // bb
          return this.mode;
        }

        public boolean hasModeElement() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        public boolean hasMode() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        /**
         * @param value {@link #mode} (The mode of this event declaration - whether application is sender or receiver.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public ConformanceMessagingEventComponent setModeElement(Enumeration<ConformanceEventMode> value) { 
          this.mode = value;
          return this;
        }

        /**
         * @return The mode of this event declaration - whether application is sender or receiver.
         */
        public ConformanceEventMode getMode() { 
          return this.mode == null ? null : this.mode.getValue();
        }

        /**
         * @param value The mode of this event declaration - whether application is sender or receiver.
         */
        public ConformanceMessagingEventComponent setMode(ConformanceEventMode value) { 
            if (this.mode == null)
              this.mode = new Enumeration<ConformanceEventMode>(new ConformanceEventModeEnumFactory());
            this.mode.setValue(value);
          return this;
        }

        /**
         * @return {@link #protocol} (A list of the messaging transport protocol(s) identifiers, supported by this endpoint.)
         */
        public List<Coding> getProtocol() { 
          if (this.protocol == null)
            this.protocol = new ArrayList<Coding>();
          return this.protocol;
        }

        public boolean hasProtocol() { 
          if (this.protocol == null)
            return false;
          for (Coding item : this.protocol)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #protocol} (A list of the messaging transport protocol(s) identifiers, supported by this endpoint.)
         */
    // syntactic sugar
        public Coding addProtocol() { //3
          Coding t = new Coding();
          if (this.protocol == null)
            this.protocol = new ArrayList<Coding>();
          this.protocol.add(t);
          return t;
        }

    // syntactic sugar
        public ConformanceMessagingEventComponent addProtocol(Coding t) { //3
          if (t == null)
            return this;
          if (this.protocol == null)
            this.protocol = new ArrayList<Coding>();
          this.protocol.add(t);
          return this;
        }

        /**
         * @return {@link #focus} (A resource associated with the event.  This is the resource that defines the event.). This is the underlying object with id, value and extensions. The accessor "getFocus" gives direct access to the value
         */
        public CodeType getFocusElement() { 
          if (this.focus == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.focus");
            else if (Configuration.doAutoCreate())
              this.focus = new CodeType(); // bb
          return this.focus;
        }

        public boolean hasFocusElement() { 
          return this.focus != null && !this.focus.isEmpty();
        }

        public boolean hasFocus() { 
          return this.focus != null && !this.focus.isEmpty();
        }

        /**
         * @param value {@link #focus} (A resource associated with the event.  This is the resource that defines the event.). This is the underlying object with id, value and extensions. The accessor "getFocus" gives direct access to the value
         */
        public ConformanceMessagingEventComponent setFocusElement(CodeType value) { 
          this.focus = value;
          return this;
        }

        /**
         * @return A resource associated with the event.  This is the resource that defines the event.
         */
        public String getFocus() { 
          return this.focus == null ? null : this.focus.getValue();
        }

        /**
         * @param value A resource associated with the event.  This is the resource that defines the event.
         */
        public ConformanceMessagingEventComponent setFocus(String value) { 
            if (this.focus == null)
              this.focus = new CodeType();
            this.focus.setValue(value);
          return this;
        }

        /**
         * @return {@link #request} (Information about the request for this event.)
         */
        public Reference getRequest() { 
          if (this.request == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.request");
            else if (Configuration.doAutoCreate())
              this.request = new Reference(); // cc
          return this.request;
        }

        public boolean hasRequest() { 
          return this.request != null && !this.request.isEmpty();
        }

        /**
         * @param value {@link #request} (Information about the request for this event.)
         */
        public ConformanceMessagingEventComponent setRequest(Reference value) { 
          this.request = value;
          return this;
        }

        /**
         * @return {@link #request} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Information about the request for this event.)
         */
        public StructureDefinition getRequestTarget() { 
          if (this.requestTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.request");
            else if (Configuration.doAutoCreate())
              this.requestTarget = new StructureDefinition(); // aa
          return this.requestTarget;
        }

        /**
         * @param value {@link #request} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Information about the request for this event.)
         */
        public ConformanceMessagingEventComponent setRequestTarget(StructureDefinition value) { 
          this.requestTarget = value;
          return this;
        }

        /**
         * @return {@link #response} (Information about the response for this event.)
         */
        public Reference getResponse() { 
          if (this.response == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.response");
            else if (Configuration.doAutoCreate())
              this.response = new Reference(); // cc
          return this.response;
        }

        public boolean hasResponse() { 
          return this.response != null && !this.response.isEmpty();
        }

        /**
         * @param value {@link #response} (Information about the response for this event.)
         */
        public ConformanceMessagingEventComponent setResponse(Reference value) { 
          this.response = value;
          return this;
        }

        /**
         * @return {@link #response} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Information about the response for this event.)
         */
        public StructureDefinition getResponseTarget() { 
          if (this.responseTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.response");
            else if (Configuration.doAutoCreate())
              this.responseTarget = new StructureDefinition(); // aa
          return this.responseTarget;
        }

        /**
         * @param value {@link #response} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Information about the response for this event.)
         */
        public ConformanceMessagingEventComponent setResponseTarget(StructureDefinition value) { 
          this.responseTarget = value;
          return this;
        }

        /**
         * @return {@link #documentation} (Guidance on how this event is handled, such as internal system trigger points, business rules, etc.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public StringType getDocumentationElement() { 
          if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceMessagingEventComponent.documentation");
            else if (Configuration.doAutoCreate())
              this.documentation = new StringType(); // bb
          return this.documentation;
        }

        public boolean hasDocumentationElement() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        public boolean hasDocumentation() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        /**
         * @param value {@link #documentation} (Guidance on how this event is handled, such as internal system trigger points, business rules, etc.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public ConformanceMessagingEventComponent setDocumentationElement(StringType value) { 
          this.documentation = value;
          return this;
        }

        /**
         * @return Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
         */
        public String getDocumentation() { 
          return this.documentation == null ? null : this.documentation.getValue();
        }

        /**
         * @param value Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
         */
        public ConformanceMessagingEventComponent setDocumentation(String value) { 
          if (Utilities.noString(value))
            this.documentation = null;
          else {
            if (this.documentation == null)
              this.documentation = new StringType();
            this.documentation.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("code", "Coding", "A coded identifier of a supported messaging event.", 0, java.lang.Integer.MAX_VALUE, code));
          childrenList.add(new Property("category", "code", "The impact of the content of the message.", 0, java.lang.Integer.MAX_VALUE, category));
          childrenList.add(new Property("mode", "code", "The mode of this event declaration - whether application is sender or receiver.", 0, java.lang.Integer.MAX_VALUE, mode));
          childrenList.add(new Property("protocol", "Coding", "A list of the messaging transport protocol(s) identifiers, supported by this endpoint.", 0, java.lang.Integer.MAX_VALUE, protocol));
          childrenList.add(new Property("focus", "code", "A resource associated with the event.  This is the resource that defines the event.", 0, java.lang.Integer.MAX_VALUE, focus));
          childrenList.add(new Property("request", "Reference(StructureDefinition)", "Information about the request for this event.", 0, java.lang.Integer.MAX_VALUE, request));
          childrenList.add(new Property("response", "Reference(StructureDefinition)", "Information about the response for this event.", 0, java.lang.Integer.MAX_VALUE, response));
          childrenList.add(new Property("documentation", "string", "Guidance on how this event is handled, such as internal system trigger points, business rules, etc.", 0, java.lang.Integer.MAX_VALUE, documentation));
        }

      public ConformanceMessagingEventComponent copy() {
        ConformanceMessagingEventComponent dst = new ConformanceMessagingEventComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.category = category == null ? null : category.copy();
        dst.mode = mode == null ? null : mode.copy();
        if (protocol != null) {
          dst.protocol = new ArrayList<Coding>();
          for (Coding i : protocol)
            dst.protocol.add(i.copy());
        };
        dst.focus = focus == null ? null : focus.copy();
        dst.request = request == null ? null : request.copy();
        dst.response = response == null ? null : response.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceMessagingEventComponent))
          return false;
        ConformanceMessagingEventComponent o = (ConformanceMessagingEventComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(category, o.category, true) && compareDeep(mode, o.mode, true)
           && compareDeep(protocol, o.protocol, true) && compareDeep(focus, o.focus, true) && compareDeep(request, o.request, true)
           && compareDeep(response, o.response, true) && compareDeep(documentation, o.documentation, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceMessagingEventComponent))
          return false;
        ConformanceMessagingEventComponent o = (ConformanceMessagingEventComponent) other;
        return compareValues(category, o.category, true) && compareValues(mode, o.mode, true) && compareValues(focus, o.focus, true)
           && compareValues(documentation, o.documentation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (category == null || category.isEmpty())
           && (mode == null || mode.isEmpty()) && (protocol == null || protocol.isEmpty()) && (focus == null || focus.isEmpty())
           && (request == null || request.isEmpty()) && (response == null || response.isEmpty()) && (documentation == null || documentation.isEmpty())
          ;
      }

  }

    @Block()
    public static class ConformanceDocumentComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Mode of this document declaration - whether application is producer or consumer.
         */
        @Child(name = "mode", type = {CodeType.class}, order=1, min=1, max=1)
        @Description(shortDefinition="producer | consumer", formalDefinition="Mode of this document declaration - whether application is producer or consumer." )
        protected Enumeration<DocumentMode> mode;

        /**
         * A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.
         */
        @Child(name = "documentation", type = {StringType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Description of document support", formalDefinition="A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc." )
        protected StringType documentation;

        /**
         * A constraint on a resource used in the document.
         */
        @Child(name = "profile", type = {StructureDefinition.class}, order=3, min=1, max=1)
        @Description(shortDefinition="Constraint on a resource used in the document", formalDefinition="A constraint on a resource used in the document." )
        protected Reference profile;

        /**
         * The actual object that is the target of the reference (A constraint on a resource used in the document.)
         */
        protected StructureDefinition profileTarget;

        private static final long serialVersionUID = -1059555053L;

    /*
     * Constructor
     */
      public ConformanceDocumentComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ConformanceDocumentComponent(Enumeration<DocumentMode> mode, Reference profile) {
        super();
        this.mode = mode;
        this.profile = profile;
      }

        /**
         * @return {@link #mode} (Mode of this document declaration - whether application is producer or consumer.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public Enumeration<DocumentMode> getModeElement() { 
          if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceDocumentComponent.mode");
            else if (Configuration.doAutoCreate())
              this.mode = new Enumeration<DocumentMode>(new DocumentModeEnumFactory()); // bb
          return this.mode;
        }

        public boolean hasModeElement() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        public boolean hasMode() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        /**
         * @param value {@link #mode} (Mode of this document declaration - whether application is producer or consumer.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public ConformanceDocumentComponent setModeElement(Enumeration<DocumentMode> value) { 
          this.mode = value;
          return this;
        }

        /**
         * @return Mode of this document declaration - whether application is producer or consumer.
         */
        public DocumentMode getMode() { 
          return this.mode == null ? null : this.mode.getValue();
        }

        /**
         * @param value Mode of this document declaration - whether application is producer or consumer.
         */
        public ConformanceDocumentComponent setMode(DocumentMode value) { 
            if (this.mode == null)
              this.mode = new Enumeration<DocumentMode>(new DocumentModeEnumFactory());
            this.mode.setValue(value);
          return this;
        }

        /**
         * @return {@link #documentation} (A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public StringType getDocumentationElement() { 
          if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceDocumentComponent.documentation");
            else if (Configuration.doAutoCreate())
              this.documentation = new StringType(); // bb
          return this.documentation;
        }

        public boolean hasDocumentationElement() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        public boolean hasDocumentation() { 
          return this.documentation != null && !this.documentation.isEmpty();
        }

        /**
         * @param value {@link #documentation} (A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
         */
        public ConformanceDocumentComponent setDocumentationElement(StringType value) { 
          this.documentation = value;
          return this;
        }

        /**
         * @return A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.
         */
        public String getDocumentation() { 
          return this.documentation == null ? null : this.documentation.getValue();
        }

        /**
         * @param value A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.
         */
        public ConformanceDocumentComponent setDocumentation(String value) { 
          if (Utilities.noString(value))
            this.documentation = null;
          else {
            if (this.documentation == null)
              this.documentation = new StringType();
            this.documentation.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #profile} (A constraint on a resource used in the document.)
         */
        public Reference getProfile() { 
          if (this.profile == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceDocumentComponent.profile");
            else if (Configuration.doAutoCreate())
              this.profile = new Reference(); // cc
          return this.profile;
        }

        public boolean hasProfile() { 
          return this.profile != null && !this.profile.isEmpty();
        }

        /**
         * @param value {@link #profile} (A constraint on a resource used in the document.)
         */
        public ConformanceDocumentComponent setProfile(Reference value) { 
          this.profile = value;
          return this;
        }

        /**
         * @return {@link #profile} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A constraint on a resource used in the document.)
         */
        public StructureDefinition getProfileTarget() { 
          if (this.profileTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ConformanceDocumentComponent.profile");
            else if (Configuration.doAutoCreate())
              this.profileTarget = new StructureDefinition(); // aa
          return this.profileTarget;
        }

        /**
         * @param value {@link #profile} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A constraint on a resource used in the document.)
         */
        public ConformanceDocumentComponent setProfileTarget(StructureDefinition value) { 
          this.profileTarget = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("mode", "code", "Mode of this document declaration - whether application is producer or consumer.", 0, java.lang.Integer.MAX_VALUE, mode));
          childrenList.add(new Property("documentation", "string", "A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.", 0, java.lang.Integer.MAX_VALUE, documentation));
          childrenList.add(new Property("profile", "Reference(StructureDefinition)", "A constraint on a resource used in the document.", 0, java.lang.Integer.MAX_VALUE, profile));
        }

      public ConformanceDocumentComponent copy() {
        ConformanceDocumentComponent dst = new ConformanceDocumentComponent();
        copyValues(dst);
        dst.mode = mode == null ? null : mode.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        dst.profile = profile == null ? null : profile.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ConformanceDocumentComponent))
          return false;
        ConformanceDocumentComponent o = (ConformanceDocumentComponent) other;
        return compareDeep(mode, o.mode, true) && compareDeep(documentation, o.documentation, true) && compareDeep(profile, o.profile, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ConformanceDocumentComponent))
          return false;
        ConformanceDocumentComponent o = (ConformanceDocumentComponent) other;
        return compareValues(mode, o.mode, true) && compareValues(documentation, o.documentation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (mode == null || mode.isEmpty()) && (documentation == null || documentation.isEmpty())
           && (profile == null || profile.isEmpty());
      }

  }

    /**
     * An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.
     */
    @Child(name = "url", type = {UriType.class}, order=0, min=0, max=1)
    @Description(shortDefinition="Logical uri to reference this statement", formalDefinition="An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published." )
    protected UriType url;

    /**
     * The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    @Child(name = "version", type = {StringType.class}, order=1, min=0, max=1)
    @Description(shortDefinition="Logical id for this version of the statement", formalDefinition="The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp." )
    protected StringType version;

    /**
     * A free text natural language name identifying the conformance statement.
     */
    @Child(name = "name", type = {StringType.class}, order=2, min=0, max=1)
    @Description(shortDefinition="Informal name for this conformance statement", formalDefinition="A free text natural language name identifying the conformance statement." )
    protected StringType name;

    /**
     * The name of the individual or organization that published the conformance.
     */
    @Child(name = "publisher", type = {StringType.class}, order=3, min=0, max=1)
    @Description(shortDefinition="Name of the publisher (Organization or individual)", formalDefinition="The name of the individual or organization that published the conformance." )
    protected StringType publisher;

    /**
     * Contacts to assist a user in finding and communicating with the publisher.
     */
    @Child(name = "contact", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Contact details of the publisher", formalDefinition="Contacts to assist a user in finding and communicating with the publisher." )
    protected List<ConformanceContactComponent> contact;

    /**
     * A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
     */
    @Child(name = "description", type = {StringType.class}, order=5, min=0, max=1)
    @Description(shortDefinition="Human description of the conformance statement", formalDefinition="A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP." )
    protected StringType description;

    /**
     * Explains why this conformance statement is needed and why it's been constrained as it has.
     */
    @Child(name = "requirements", type = {StringType.class}, order=6, min=0, max=1)
    @Description(shortDefinition="Why is this needed?", formalDefinition="Explains why this conformance statement is needed and why it's been constrained as it has." )
    protected StringType requirements;

    /**
     * A copyright statement relating to the conformamce statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.
     */
    @Child(name = "copyright", type = {StringType.class}, order=7, min=0, max=1)
    @Description(shortDefinition="Use and/or Publishing restrictions", formalDefinition="A copyright statement relating to the conformamce statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement." )
    protected StringType copyright;

    /**
     * The status of this conformance statement.
     */
    @Child(name = "status", type = {CodeType.class}, order=8, min=0, max=1)
    @Description(shortDefinition="draft | active | retired", formalDefinition="The status of this conformance statement." )
    protected Enumeration<ConformanceResourceStatus> status;

    /**
     * A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    @Child(name = "experimental", type = {BooleanType.class}, order=9, min=0, max=1)
    @Description(shortDefinition="If for testing purposes, not real usage", formalDefinition="A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage." )
    protected BooleanType experimental;

    /**
     * The date  (and optionally time) when the conformance statement was published.
     */
    @Child(name = "date", type = {DateTimeType.class}, order=10, min=1, max=1)
    @Description(shortDefinition="Publication Date(/time)", formalDefinition="The date  (and optionally time) when the conformance statement was published." )
    protected DateTimeType date;

    /**
     * Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.
     */
    @Child(name = "software", type = {}, order=11, min=0, max=1)
    @Description(shortDefinition="Software that is covered by this conformance statement", formalDefinition="Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation." )
    protected ConformanceSoftwareComponent software;

    /**
     * Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program.
     */
    @Child(name = "implementation", type = {}, order=12, min=0, max=1)
    @Description(shortDefinition="If this describes a specific instance", formalDefinition="Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program." )
    protected ConformanceImplementationComponent implementation;

    /**
     * The version of the FHIR specification on which this conformance statement is based.
     */
    @Child(name = "fhirVersion", type = {IdType.class}, order=13, min=1, max=1)
    @Description(shortDefinition="FHIR Version", formalDefinition="The version of the FHIR specification on which this conformance statement is based." )
    protected IdType fhirVersion;

    /**
     * A flag that indicates whether the application accepts unknown elements as part of a resource.
     */
    @Child(name = "acceptUnknown", type = {BooleanType.class}, order=14, min=1, max=1)
    @Description(shortDefinition="True if application accepts unknown elements", formalDefinition="A flag that indicates whether the application accepts unknown elements as part of a resource." )
    protected BooleanType acceptUnknown;

    /**
     * A list of the formats supported by this implementation using their content types.
     */
    @Child(name = "format", type = {CodeType.class}, order=15, min=1, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="formats supported (xml | json | mime type)", formalDefinition="A list of the formats supported by this implementation using their content types." )
    protected List<CodeType> format;

    /**
     * A list of profiles supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources, conformant to a particular profile, and allows its clients to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.
     */
    @Child(name = "profile", type = {StructureDefinition.class}, order=16, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Profiles supported by the system", formalDefinition="A list of profiles supported by the system. For a server, 'supported by the system' means the system hosts/produces a set of resources, conformant to a particular profile, and allows its clients to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}." )
    protected List<Reference> profile;
    /**
     * The actual objects that are the target of the reference (A list of profiles supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources, conformant to a particular profile, and allows its clients to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    protected List<StructureDefinition> profileTarget;


    /**
     * A definition of the restful capabilities of the solution, if any.
     */
    @Child(name = "rest", type = {}, order=17, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="If the endpoint is a RESTful one", formalDefinition="A definition of the restful capabilities of the solution, if any." )
    protected List<ConformanceRestComponent> rest;

    /**
     * A description of the messaging capabilities of the solution.
     */
    @Child(name = "messaging", type = {}, order=18, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="If messaging is supported", formalDefinition="A description of the messaging capabilities of the solution." )
    protected List<ConformanceMessagingComponent> messaging;

    /**
     * A document definition.
     */
    @Child(name = "document", type = {}, order=19, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Document definition", formalDefinition="A document definition." )
    protected List<ConformanceDocumentComponent> document;

    private static final long serialVersionUID = 1631871430L;

  /*
   * Constructor
   */
    public Conformance() {
      super();
    }

  /*
   * Constructor
   */
    public Conformance(DateTimeType date, IdType fhirVersion, BooleanType acceptUnknown) {
      super();
      this.date = date;
      this.fhirVersion = fhirVersion;
      this.acceptUnknown = acceptUnknown;
    }

    /**
     * @return {@link #url} (An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() { 
      if (this.url == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.url");
        else if (Configuration.doAutoCreate())
          this.url = new UriType(); // bb
      return this.url;
    }

    public boolean hasUrlElement() { 
      return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() { 
      return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public Conformance setUrlElement(UriType value) { 
      this.url = value;
      return this;
    }

    /**
     * @return An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.
     */
    public String getUrl() { 
      return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.
     */
    public Conformance setUrl(String value) { 
      if (Utilities.noString(value))
        this.url = null;
      else {
        if (this.url == null)
          this.url = new UriType();
        this.url.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() { 
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.version");
        else if (Configuration.doAutoCreate())
          this.version = new StringType(); // bb
      return this.version;
    }

    public boolean hasVersionElement() { 
      return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() { 
      return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public Conformance setVersionElement(StringType value) { 
      this.version = value;
      return this;
    }

    /**
     * @return The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    public String getVersion() { 
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    public Conformance setVersion(String value) { 
      if (Utilities.noString(value))
        this.version = null;
      else {
        if (this.version == null)
          this.version = new StringType();
        this.version.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #name} (A free text natural language name identifying the conformance statement.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() { 
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() { 
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() { 
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A free text natural language name identifying the conformance statement.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public Conformance setNameElement(StringType value) { 
      this.name = value;
      return this;
    }

    /**
     * @return A free text natural language name identifying the conformance statement.
     */
    public String getName() { 
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A free text natural language name identifying the conformance statement.
     */
    public Conformance setName(String value) { 
      if (Utilities.noString(value))
        this.name = null;
      else {
        if (this.name == null)
          this.name = new StringType();
        this.name.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the conformance.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() { 
      if (this.publisher == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.publisher");
        else if (Configuration.doAutoCreate())
          this.publisher = new StringType(); // bb
      return this.publisher;
    }

    public boolean hasPublisherElement() { 
      return this.publisher != null && !this.publisher.isEmpty();
    }

    public boolean hasPublisher() { 
      return this.publisher != null && !this.publisher.isEmpty();
    }

    /**
     * @param value {@link #publisher} (The name of the individual or organization that published the conformance.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public Conformance setPublisherElement(StringType value) { 
      this.publisher = value;
      return this;
    }

    /**
     * @return The name of the individual or organization that published the conformance.
     */
    public String getPublisher() { 
      return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the conformance.
     */
    public Conformance setPublisher(String value) { 
      if (Utilities.noString(value))
        this.publisher = null;
      else {
        if (this.publisher == null)
          this.publisher = new StringType();
        this.publisher.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    public List<ConformanceContactComponent> getContact() { 
      if (this.contact == null)
        this.contact = new ArrayList<ConformanceContactComponent>();
      return this.contact;
    }

    public boolean hasContact() { 
      if (this.contact == null)
        return false;
      for (ConformanceContactComponent item : this.contact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public ConformanceContactComponent addContact() { //3
      ConformanceContactComponent t = new ConformanceContactComponent();
      if (this.contact == null)
        this.contact = new ArrayList<ConformanceContactComponent>();
      this.contact.add(t);
      return t;
    }

    // syntactic sugar
    public Conformance addContact(ConformanceContactComponent t) { //3
      if (t == null)
        return this;
      if (this.contact == null)
        this.contact = new ArrayList<ConformanceContactComponent>();
      this.contact.add(t);
      return this;
    }

    /**
     * @return {@link #description} (A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.description");
        else if (Configuration.doAutoCreate())
          this.description = new StringType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Conformance setDescriptionElement(StringType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
     */
    public Conformance setDescription(String value) { 
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new StringType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #requirements} (Explains why this conformance statement is needed and why it's been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public StringType getRequirementsElement() { 
      if (this.requirements == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.requirements");
        else if (Configuration.doAutoCreate())
          this.requirements = new StringType(); // bb
      return this.requirements;
    }

    public boolean hasRequirementsElement() { 
      return this.requirements != null && !this.requirements.isEmpty();
    }

    public boolean hasRequirements() { 
      return this.requirements != null && !this.requirements.isEmpty();
    }

    /**
     * @param value {@link #requirements} (Explains why this conformance statement is needed and why it's been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public Conformance setRequirementsElement(StringType value) { 
      this.requirements = value;
      return this;
    }

    /**
     * @return Explains why this conformance statement is needed and why it's been constrained as it has.
     */
    public String getRequirements() { 
      return this.requirements == null ? null : this.requirements.getValue();
    }

    /**
     * @param value Explains why this conformance statement is needed and why it's been constrained as it has.
     */
    public Conformance setRequirements(String value) { 
      if (Utilities.noString(value))
        this.requirements = null;
      else {
        if (this.requirements == null)
          this.requirements = new StringType();
        this.requirements.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #copyright} (A copyright statement relating to the conformamce statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public StringType getCopyrightElement() { 
      if (this.copyright == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.copyright");
        else if (Configuration.doAutoCreate())
          this.copyright = new StringType(); // bb
      return this.copyright;
    }

    public boolean hasCopyrightElement() { 
      return this.copyright != null && !this.copyright.isEmpty();
    }

    public boolean hasCopyright() { 
      return this.copyright != null && !this.copyright.isEmpty();
    }

    /**
     * @param value {@link #copyright} (A copyright statement relating to the conformamce statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public Conformance setCopyrightElement(StringType value) { 
      this.copyright = value;
      return this;
    }

    /**
     * @return A copyright statement relating to the conformamce statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.
     */
    public String getCopyright() { 
      return this.copyright == null ? null : this.copyright.getValue();
    }

    /**
     * @param value A copyright statement relating to the conformamce statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.
     */
    public Conformance setCopyright(String value) { 
      if (Utilities.noString(value))
        this.copyright = null;
      else {
        if (this.copyright == null)
          this.copyright = new StringType();
        this.copyright.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #status} (The status of this conformance statement.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ConformanceResourceStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this conformance statement.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Conformance setStatusElement(Enumeration<ConformanceResourceStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of this conformance statement.
     */
    public ConformanceResourceStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this conformance statement.
     */
    public Conformance setStatus(ConformanceResourceStatus value) { 
      if (value == null)
        this.status = null;
      else {
        if (this.status == null)
          this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
        this.status.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #experimental} (A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() { 
      if (this.experimental == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.experimental");
        else if (Configuration.doAutoCreate())
          this.experimental = new BooleanType(); // bb
      return this.experimental;
    }

    public boolean hasExperimentalElement() { 
      return this.experimental != null && !this.experimental.isEmpty();
    }

    public boolean hasExperimental() { 
      return this.experimental != null && !this.experimental.isEmpty();
    }

    /**
     * @param value {@link #experimental} (A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public Conformance setExperimentalElement(BooleanType value) { 
      this.experimental = value;
      return this;
    }

    /**
     * @return A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public boolean getExperimental() { 
      return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public Conformance setExperimental(boolean value) { 
        if (this.experimental == null)
          this.experimental = new BooleanType();
        this.experimental.setValue(value);
      return this;
    }

    /**
     * @return {@link #date} (The date  (and optionally time) when the conformance statement was published.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType(); // bb
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The date  (and optionally time) when the conformance statement was published.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Conformance setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date  (and optionally time) when the conformance statement was published.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date  (and optionally time) when the conformance statement was published.
     */
    public Conformance setDate(Date value) { 
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      return this;
    }

    /**
     * @return {@link #software} (Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.)
     */
    public ConformanceSoftwareComponent getSoftware() { 
      if (this.software == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.software");
        else if (Configuration.doAutoCreate())
          this.software = new ConformanceSoftwareComponent(); // cc
      return this.software;
    }

    public boolean hasSoftware() { 
      return this.software != null && !this.software.isEmpty();
    }

    /**
     * @param value {@link #software} (Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.)
     */
    public Conformance setSoftware(ConformanceSoftwareComponent value) { 
      this.software = value;
      return this;
    }

    /**
     * @return {@link #implementation} (Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program.)
     */
    public ConformanceImplementationComponent getImplementation() { 
      if (this.implementation == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.implementation");
        else if (Configuration.doAutoCreate())
          this.implementation = new ConformanceImplementationComponent(); // cc
      return this.implementation;
    }

    public boolean hasImplementation() { 
      return this.implementation != null && !this.implementation.isEmpty();
    }

    /**
     * @param value {@link #implementation} (Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program.)
     */
    public Conformance setImplementation(ConformanceImplementationComponent value) { 
      this.implementation = value;
      return this;
    }

    /**
     * @return {@link #fhirVersion} (The version of the FHIR specification on which this conformance statement is based.). This is the underlying object with id, value and extensions. The accessor "getFhirVersion" gives direct access to the value
     */
    public IdType getFhirVersionElement() { 
      if (this.fhirVersion == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.fhirVersion");
        else if (Configuration.doAutoCreate())
          this.fhirVersion = new IdType(); // bb
      return this.fhirVersion;
    }

    public boolean hasFhirVersionElement() { 
      return this.fhirVersion != null && !this.fhirVersion.isEmpty();
    }

    public boolean hasFhirVersion() { 
      return this.fhirVersion != null && !this.fhirVersion.isEmpty();
    }

    /**
     * @param value {@link #fhirVersion} (The version of the FHIR specification on which this conformance statement is based.). This is the underlying object with id, value and extensions. The accessor "getFhirVersion" gives direct access to the value
     */
    public Conformance setFhirVersionElement(IdType value) { 
      this.fhirVersion = value;
      return this;
    }

    /**
     * @return The version of the FHIR specification on which this conformance statement is based.
     */
    public String getFhirVersion() { 
      return this.fhirVersion == null ? null : this.fhirVersion.getValue();
    }

    /**
     * @param value The version of the FHIR specification on which this conformance statement is based.
     */
    public Conformance setFhirVersion(String value) { 
        if (this.fhirVersion == null)
          this.fhirVersion = new IdType();
        this.fhirVersion.setValue(value);
      return this;
    }

    /**
     * @return {@link #acceptUnknown} (A flag that indicates whether the application accepts unknown elements as part of a resource.). This is the underlying object with id, value and extensions. The accessor "getAcceptUnknown" gives direct access to the value
     */
    public BooleanType getAcceptUnknownElement() { 
      if (this.acceptUnknown == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Conformance.acceptUnknown");
        else if (Configuration.doAutoCreate())
          this.acceptUnknown = new BooleanType(); // bb
      return this.acceptUnknown;
    }

    public boolean hasAcceptUnknownElement() { 
      return this.acceptUnknown != null && !this.acceptUnknown.isEmpty();
    }

    public boolean hasAcceptUnknown() { 
      return this.acceptUnknown != null && !this.acceptUnknown.isEmpty();
    }

    /**
     * @param value {@link #acceptUnknown} (A flag that indicates whether the application accepts unknown elements as part of a resource.). This is the underlying object with id, value and extensions. The accessor "getAcceptUnknown" gives direct access to the value
     */
    public Conformance setAcceptUnknownElement(BooleanType value) { 
      this.acceptUnknown = value;
      return this;
    }

    /**
     * @return A flag that indicates whether the application accepts unknown elements as part of a resource.
     */
    public boolean getAcceptUnknown() { 
      return this.acceptUnknown == null || this.acceptUnknown.isEmpty() ? false : this.acceptUnknown.getValue();
    }

    /**
     * @param value A flag that indicates whether the application accepts unknown elements as part of a resource.
     */
    public Conformance setAcceptUnknown(boolean value) { 
        if (this.acceptUnknown == null)
          this.acceptUnknown = new BooleanType();
        this.acceptUnknown.setValue(value);
      return this;
    }

    /**
     * @return {@link #format} (A list of the formats supported by this implementation using their content types.)
     */
    public List<CodeType> getFormat() { 
      if (this.format == null)
        this.format = new ArrayList<CodeType>();
      return this.format;
    }

    public boolean hasFormat() { 
      if (this.format == null)
        return false;
      for (CodeType item : this.format)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #format} (A list of the formats supported by this implementation using their content types.)
     */
    // syntactic sugar
    public CodeType addFormatElement() {//2 
      CodeType t = new CodeType();
      if (this.format == null)
        this.format = new ArrayList<CodeType>();
      this.format.add(t);
      return t;
    }

    /**
     * @param value {@link #format} (A list of the formats supported by this implementation using their content types.)
     */
    public Conformance addFormat(String value) { //1
      CodeType t = new CodeType();
      t.setValue(value);
      if (this.format == null)
        this.format = new ArrayList<CodeType>();
      this.format.add(t);
      return this;
    }

    /**
     * @param value {@link #format} (A list of the formats supported by this implementation using their content types.)
     */
    public boolean hasFormat(String value) { 
      if (this.format == null)
        return false;
      for (CodeType v : this.format)
        if (v.equals(value)) // code
          return true;
      return false;
    }

    /**
     * @return {@link #profile} (A list of profiles supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources, conformant to a particular profile, and allows its clients to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    public List<Reference> getProfile() { 
      if (this.profile == null)
        this.profile = new ArrayList<Reference>();
      return this.profile;
    }

    public boolean hasProfile() { 
      if (this.profile == null)
        return false;
      for (Reference item : this.profile)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #profile} (A list of profiles supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources, conformant to a particular profile, and allows its clients to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    // syntactic sugar
    public Reference addProfile() { //3
      Reference t = new Reference();
      if (this.profile == null)
        this.profile = new ArrayList<Reference>();
      this.profile.add(t);
      return t;
    }

    // syntactic sugar
    public Conformance addProfile(Reference t) { //3
      if (t == null)
        return this;
      if (this.profile == null)
        this.profile = new ArrayList<Reference>();
      this.profile.add(t);
      return this;
    }

    /**
     * @return {@link #profile} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. A list of profiles supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources, conformant to a particular profile, and allows its clients to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    public List<StructureDefinition> getProfileTarget() { 
      if (this.profileTarget == null)
        this.profileTarget = new ArrayList<StructureDefinition>();
      return this.profileTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #profile} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. A list of profiles supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources, conformant to a particular profile, and allows its clients to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    public StructureDefinition addProfileTarget() { 
      StructureDefinition r = new StructureDefinition();
      if (this.profileTarget == null)
        this.profileTarget = new ArrayList<StructureDefinition>();
      this.profileTarget.add(r);
      return r;
    }

    /**
     * @return {@link #rest} (A definition of the restful capabilities of the solution, if any.)
     */
    public List<ConformanceRestComponent> getRest() { 
      if (this.rest == null)
        this.rest = new ArrayList<ConformanceRestComponent>();
      return this.rest;
    }

    public boolean hasRest() { 
      if (this.rest == null)
        return false;
      for (ConformanceRestComponent item : this.rest)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #rest} (A definition of the restful capabilities of the solution, if any.)
     */
    // syntactic sugar
    public ConformanceRestComponent addRest() { //3
      ConformanceRestComponent t = new ConformanceRestComponent();
      if (this.rest == null)
        this.rest = new ArrayList<ConformanceRestComponent>();
      this.rest.add(t);
      return t;
    }

    // syntactic sugar
    public Conformance addRest(ConformanceRestComponent t) { //3
      if (t == null)
        return this;
      if (this.rest == null)
        this.rest = new ArrayList<ConformanceRestComponent>();
      this.rest.add(t);
      return this;
    }

    /**
     * @return {@link #messaging} (A description of the messaging capabilities of the solution.)
     */
    public List<ConformanceMessagingComponent> getMessaging() { 
      if (this.messaging == null)
        this.messaging = new ArrayList<ConformanceMessagingComponent>();
      return this.messaging;
    }

    public boolean hasMessaging() { 
      if (this.messaging == null)
        return false;
      for (ConformanceMessagingComponent item : this.messaging)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #messaging} (A description of the messaging capabilities of the solution.)
     */
    // syntactic sugar
    public ConformanceMessagingComponent addMessaging() { //3
      ConformanceMessagingComponent t = new ConformanceMessagingComponent();
      if (this.messaging == null)
        this.messaging = new ArrayList<ConformanceMessagingComponent>();
      this.messaging.add(t);
      return t;
    }

    // syntactic sugar
    public Conformance addMessaging(ConformanceMessagingComponent t) { //3
      if (t == null)
        return this;
      if (this.messaging == null)
        this.messaging = new ArrayList<ConformanceMessagingComponent>();
      this.messaging.add(t);
      return this;
    }

    /**
     * @return {@link #document} (A document definition.)
     */
    public List<ConformanceDocumentComponent> getDocument() { 
      if (this.document == null)
        this.document = new ArrayList<ConformanceDocumentComponent>();
      return this.document;
    }

    public boolean hasDocument() { 
      if (this.document == null)
        return false;
      for (ConformanceDocumentComponent item : this.document)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #document} (A document definition.)
     */
    // syntactic sugar
    public ConformanceDocumentComponent addDocument() { //3
      ConformanceDocumentComponent t = new ConformanceDocumentComponent();
      if (this.document == null)
        this.document = new ArrayList<ConformanceDocumentComponent>();
      this.document.add(t);
      return t;
    }

    // syntactic sugar
    public Conformance addDocument(ConformanceDocumentComponent t) { //3
      if (t == null)
        return this;
      if (this.document == null)
        this.document = new ArrayList<ConformanceDocumentComponent>();
      this.document.add(t);
      return this;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("url", "uri", "An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("version", "string", "The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("name", "string", "A free text natural language name identifying the conformance statement.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the conformance.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "", "Contacts to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("description", "string", "A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("requirements", "string", "Explains why this conformance statement is needed and why it's been constrained as it has.", 0, java.lang.Integer.MAX_VALUE, requirements));
        childrenList.add(new Property("copyright", "string", "A copyright statement relating to the conformamce statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.", 0, java.lang.Integer.MAX_VALUE, copyright));
        childrenList.add(new Property("status", "code", "The status of this conformance statement.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("experimental", "boolean", "A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.", 0, java.lang.Integer.MAX_VALUE, experimental));
        childrenList.add(new Property("date", "dateTime", "The date  (and optionally time) when the conformance statement was published.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("software", "", "Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.", 0, java.lang.Integer.MAX_VALUE, software));
        childrenList.add(new Property("implementation", "", "Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program.", 0, java.lang.Integer.MAX_VALUE, implementation));
        childrenList.add(new Property("fhirVersion", "id", "The version of the FHIR specification on which this conformance statement is based.", 0, java.lang.Integer.MAX_VALUE, fhirVersion));
        childrenList.add(new Property("acceptUnknown", "boolean", "A flag that indicates whether the application accepts unknown elements as part of a resource.", 0, java.lang.Integer.MAX_VALUE, acceptUnknown));
        childrenList.add(new Property("format", "code", "A list of the formats supported by this implementation using their content types.", 0, java.lang.Integer.MAX_VALUE, format));
        childrenList.add(new Property("profile", "Reference(StructureDefinition)", "A list of profiles supported by the system. For a server, 'supported by the system' means the system hosts/produces a set of resources, conformant to a particular profile, and allows its clients to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.", 0, java.lang.Integer.MAX_VALUE, profile));
        childrenList.add(new Property("rest", "", "A definition of the restful capabilities of the solution, if any.", 0, java.lang.Integer.MAX_VALUE, rest));
        childrenList.add(new Property("messaging", "", "A description of the messaging capabilities of the solution.", 0, java.lang.Integer.MAX_VALUE, messaging));
        childrenList.add(new Property("document", "", "A document definition.", 0, java.lang.Integer.MAX_VALUE, document));
      }

      public Conformance copy() {
        Conformance dst = new Conformance();
        copyValues(dst);
        dst.url = url == null ? null : url.copy();
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
          dst.contact = new ArrayList<ConformanceContactComponent>();
          for (ConformanceContactComponent i : contact)
            dst.contact.add(i.copy());
        };
        dst.description = description == null ? null : description.copy();
        dst.requirements = requirements == null ? null : requirements.copy();
        dst.copyright = copyright == null ? null : copyright.copy();
        dst.status = status == null ? null : status.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.date = date == null ? null : date.copy();
        dst.software = software == null ? null : software.copy();
        dst.implementation = implementation == null ? null : implementation.copy();
        dst.fhirVersion = fhirVersion == null ? null : fhirVersion.copy();
        dst.acceptUnknown = acceptUnknown == null ? null : acceptUnknown.copy();
        if (format != null) {
          dst.format = new ArrayList<CodeType>();
          for (CodeType i : format)
            dst.format.add(i.copy());
        };
        if (profile != null) {
          dst.profile = new ArrayList<Reference>();
          for (Reference i : profile)
            dst.profile.add(i.copy());
        };
        if (rest != null) {
          dst.rest = new ArrayList<ConformanceRestComponent>();
          for (ConformanceRestComponent i : rest)
            dst.rest.add(i.copy());
        };
        if (messaging != null) {
          dst.messaging = new ArrayList<ConformanceMessagingComponent>();
          for (ConformanceMessagingComponent i : messaging)
            dst.messaging.add(i.copy());
        };
        if (document != null) {
          dst.document = new ArrayList<ConformanceDocumentComponent>();
          for (ConformanceDocumentComponent i : document)
            dst.document.add(i.copy());
        };
        return dst;
      }

      protected Conformance typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof Conformance))
          return false;
        Conformance o = (Conformance) other;
        return compareDeep(url, o.url, true) && compareDeep(version, o.version, true) && compareDeep(name, o.name, true)
           && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(description, o.description, true)
           && compareDeep(requirements, o.requirements, true) && compareDeep(copyright, o.copyright, true)
           && compareDeep(status, o.status, true) && compareDeep(experimental, o.experimental, true) && compareDeep(date, o.date, true)
           && compareDeep(software, o.software, true) && compareDeep(implementation, o.implementation, true)
           && compareDeep(fhirVersion, o.fhirVersion, true) && compareDeep(acceptUnknown, o.acceptUnknown, true)
           && compareDeep(format, o.format, true) && compareDeep(profile, o.profile, true) && compareDeep(rest, o.rest, true)
           && compareDeep(messaging, o.messaging, true) && compareDeep(document, o.document, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof Conformance))
          return false;
        Conformance o = (Conformance) other;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true)
           && compareValues(publisher, o.publisher, true) && compareValues(description, o.description, true) && compareValues(requirements, o.requirements, true)
           && compareValues(copyright, o.copyright, true) && compareValues(status, o.status, true) && compareValues(experimental, o.experimental, true)
           && compareValues(date, o.date, true) && compareValues(fhirVersion, o.fhirVersion, true) && compareValues(acceptUnknown, o.acceptUnknown, true)
           && compareValues(format, o.format, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (url == null || url.isEmpty()) && (version == null || version.isEmpty())
           && (name == null || name.isEmpty()) && (publisher == null || publisher.isEmpty()) && (contact == null || contact.isEmpty())
           && (description == null || description.isEmpty()) && (requirements == null || requirements.isEmpty())
           && (copyright == null || copyright.isEmpty()) && (status == null || status.isEmpty()) && (experimental == null || experimental.isEmpty())
           && (date == null || date.isEmpty()) && (software == null || software.isEmpty()) && (implementation == null || implementation.isEmpty())
           && (fhirVersion == null || fhirVersion.isEmpty()) && (acceptUnknown == null || acceptUnknown.isEmpty())
           && (format == null || format.isEmpty()) && (profile == null || profile.isEmpty()) && (rest == null || rest.isEmpty())
           && (messaging == null || messaging.isEmpty()) && (document == null || document.isEmpty())
          ;
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Conformance;
   }

  @SearchParamDefinition(name="status", path="Conformance.status", description="The current status of the conformance statement", type="token" )
  public static final String SP_STATUS = "status";
  @SearchParamDefinition(name="resource", path="Conformance.rest.resource.type", description="Name of a resource mentioned in a conformance statement", type="token" )
  public static final String SP_RESOURCE = "resource";
  @SearchParamDefinition(name="security", path="Conformance.rest.security", description="Information about security of implementation", type="token" )
  public static final String SP_SECURITY = "security";
  @SearchParamDefinition(name="format", path="Conformance.format", description="formats supported (xml | json | mime type)", type="token" )
  public static final String SP_FORMAT = "format";
  @SearchParamDefinition(name="date", path="Conformance.date", description="The conformance statement publication date", type="date" )
  public static final String SP_DATE = "date";
  @SearchParamDefinition(name="url", path="Conformance.url", description="The uri that identifies the conformance statement", type="uri" )
  public static final String SP_URL = "url";
  @SearchParamDefinition(name="version", path="Conformance.version", description="The version identifier of the conformance statement", type="token" )
  public static final String SP_VERSION = "version";
  @SearchParamDefinition(name="publisher", path="Conformance.publisher", description="Name of the publisher of the conformance statement", type="string" )
  public static final String SP_PUBLISHER = "publisher";
  @SearchParamDefinition(name="mode", path="Conformance.rest.mode", description="Mode - restful (server/client) or messaging (sender/receiver)", type="token" )
  public static final String SP_MODE = "mode";
  @SearchParamDefinition(name="software", path="Conformance.software.name", description="Part of a the name of a software application", type="string" )
  public static final String SP_SOFTWARE = "software";
  @SearchParamDefinition(name="description", path="Conformance.description", description="Text search in the description of the conformance statement", type="string" )
  public static final String SP_DESCRIPTION = "description";
  @SearchParamDefinition(name="event", path="Conformance.messaging.event.code", description="Event code in a conformance statement", type="token" )
  public static final String SP_EVENT = "event";
  @SearchParamDefinition(name="name", path="Conformance.name", description="Name of the conformance statement", type="string" )
  public static final String SP_NAME = "name";
  @SearchParamDefinition(name="supported-profile", path="Conformance.profile", description="Profiles supported by the system", type="reference" )
  public static final String SP_SUPPORTEDPROFILE = "supported-profile";
  @SearchParamDefinition(name="fhirversion", path="Conformance.version", description="The version of FHIR", type="token" )
  public static final String SP_FHIRVERSION = "fhirversion";
  @SearchParamDefinition(name="profile", path="Conformance.rest.resource.profile", description="A profile id invoked in a conformance statement", type="reference" )
  public static final String SP_PROFILE = "profile";

}

