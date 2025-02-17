package org.hl7.fhir.definitions.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hl7.fhir.instance.model.OperationOutcome.IssueSeverity;
import org.hl7.fhir.definitions.validation.ValueSetValidator.VSDuplicateList;
import org.hl7.fhir.instance.model.ValueSet;
import org.hl7.fhir.instance.model.ValueSet.ConceptDefinitionComponent;
import org.hl7.fhir.instance.model.ValueSet.ConceptReferenceComponent;
import org.hl7.fhir.instance.model.ValueSet.ConceptSetComponent;
import org.hl7.fhir.instance.model.valuesets.IssueType;
import org.hl7.fhir.instance.utils.WorkerContext;
import org.hl7.fhir.instance.validation.BaseValidator;
import org.hl7.fhir.instance.validation.ValidationMessage;
import org.hl7.fhir.utilities.Utilities;

public class ValueSetValidator extends BaseValidator {

  public class VSDuplicateList {
    private ValueSet vs;
    private String id;
    private String url;
    private Set<String> name = new HashSet<String>();
    private Set<String> description = new HashSet<String>();
    
    public VSDuplicateList(ValueSet vs) {
      super();
      this.vs = vs;
      id = vs.getId();
      url = vs.getUrl();
      for (String w : stripPunctuation(splitByCamelCase(vs.getName()), true).split(" ")) {
        String wl = w.toLowerCase();
        if (!Utilities.noString(w) && !grammarWord(wl) && !nullVSWord(wl)) {
          String wp = Utilities.pluralizeMe(wl);
          if (!name.contains(wp))
            name.add(wp);
        }
      }
      for (String w : stripPunctuation(splitByCamelCase(vs.getDescription()), true).split(" ")) {
        String wl = w.toLowerCase();
        if (!Utilities.noString(w) && !grammarWord(wl) && !nullVSWord(wl)) {
          String wp = Utilities.pluralizeMe(wl);
          if (!description.contains(wp))
            description.add(wp);
        }
      }
    }
  }

  private WorkerContext context;
  private List<String> fixups;
  private Set<ValueSet> handled = new HashSet<ValueSet>();
  private List<VSDuplicateList> duplicateList = new ArrayList<ValueSetValidator.VSDuplicateList>();
  private Set<String> styleExemptions;

  public ValueSetValidator(WorkerContext context, List<String> fixups, Set<String> styleExemptions) {
    this.context = context;
    this.fixups = fixups;
    this.styleExemptions = styleExemptions;
  }

  public boolean nullVSWord(String wp) {
    return 
        wp.equals("vs") ||
        wp.equals("valueset") ||
        wp.equals("value") ||
        wp.equals("set") ||
        wp.equals("includes") ||
        wp.equals("code") ||
        wp.equals("system") ||
        wp.equals("contents") ||
        wp.equals("definition") ||
        wp.equals("hl7") ||
        wp.equals("v2") ||
        wp.equals("v3") ||
        wp.equals("table") ||
        wp.equals("codes");
  }
 
  
  public void validate(List<ValidationMessage> errors, String nameForErrors, ValueSet vs, boolean internal, boolean exemptFromCopyrightRule) {
    int o_warnings = 0;
    for (ValidationMessage em : errors) {
      if (em.getLevel() == IssueSeverity.WARNING)
        o_warnings++;
    }
    if (!handled.contains(vs)) {
      handled.add(vs);
      duplicateList.add(new VSDuplicateList(vs));
    }
    if (Utilities.noString(vs.getCopyright()) && !exemptFromCopyrightRule) {
      Set<String> sources = getListOfSources(vs);
      for (String s : sources) {
        rule(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].copyright", !s.equals("http://snomed.info/sct") && !s.equals("http://loinc.org"), 
           "Value set "+nameForErrors+" ("+vs.getName()+"): A copyright statement is required for any value set that includes Snomed or Loinc codes",
           "<a href=\""+vs.getUserString("path")+"\">Value set "+nameForErrors+" ("+vs.getName()+")</a>: A copyright statement is required for any value set that includes Snomed or Loinc codes");
        warning(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].copyright", s.startsWith("http://hl7.org") || s.startsWith("urn:iso") || s.startsWith("urn:ietf") || s.startsWith("http://need.a.uri.org")
            || s.contains("cdc.gov") || s.startsWith("urn:oid:"),
           "Value set "+nameForErrors+" ("+vs.getName()+"): A copyright statement should be present for any value set that includes non-HL7 sourced codes ("+s+")",
           "<a href=\""+vs.getUserString("path")+"\">Value set "+nameForErrors+" ("+vs.getName()+")</a>: A copyright statement should be present for any value set that includes non-HL7 sourced codes ("+s+")");
      }
    }
    if (fixups.contains(vs.getId()))
      fixup(vs);

    if (vs.hasCodeSystem()) {
      Set<String> codes = new HashSet<String>();
      if (rule(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].define", vs.getCodeSystem().hasSystem(), "If a value set has a define, it must have a system")) {
        rule(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].define", vs.getCodeSystem().hasCaseSensitiveElement() && vs.getCodeSystem().getCaseSensitive(), 
            "Value set "+nameForErrors+" ("+vs.getName()+"): All value sets that define codes must mark them as case sensitive",
            "<a href=\""+vs.getUserString("path")+"\">Value set "+nameForErrors+" ("+vs.getName()+")</a>: All value sets that define codes must mark them as case sensitive");
        checkCodeCaseDuplicates(errors, nameForErrors, vs, codes, vs.getCodeSystem().getConcept());
        if (!vs.getCodeSystem().getSystem().startsWith("http://hl7.org/fhir/v2/") && 
            !vs.getCodeSystem().getSystem().startsWith("urn:uuid:") && 
            !vs.getCodeSystem().getSystem().startsWith("http://hl7.org/fhir/v3/") && 
            !exemptFromCodeRules(vs.getCodeSystem().getSystem())) {
          checkCodesForDisplayAndDefinition(errors, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].define", vs.getCodeSystem().getConcept(), vs, nameForErrors);
          checkCodesForSpaces(errors, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].define", vs, vs.getCodeSystem().getConcept());
          if (!exemptFromStyleChecking(vs.getCodeSystem().getSystem())) {
            checkDisplayIsTitleCase(errors, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].define", vs, vs.getCodeSystem().getConcept());
            checkCodeIslowerCaseDash(errors, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].define", vs, vs.getCodeSystem().getConcept());
          }
        }
      }
    }
    if (vs.hasCompose()) {
      int i = 0;
      for (ConceptSetComponent inc : vs.getCompose().getInclude()) {
        i++;
        rule(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].compose.include["+Integer.toString(i)+"]", context.getCodeSystems().containsKey(inc.getSystem()) || isKnownCodeSystem(inc.getSystem()), 
            "The system '"+inc.getSystem()+"' is not valid");
        
        if (canValidate(inc.getSystem())) {
          for (ConceptReferenceComponent cc : inc.getConcept()) {
            if (inc.getSystem().equals("http://nema.org/dicom/dicm"))
              warning(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].compose.include["+Integer.toString(i)+"]", isValidCode(cc.getCode(), inc.getSystem()), 
                  "The code '"+cc.getCode()+"' is not valid in the system "+inc.getSystem(),
                  "<a href=\""+vs.getUserString("path")+"\">Value set "+nameForErrors+" ("+vs.getName()+")</a>: The code '"+cc.getCode()+"' is not valid in the system "+inc.getSystem());             
            else
              rule(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].compose.include["+Integer.toString(i)+"]", isValidCode(cc.getCode(), inc.getSystem()), 
                "The code '"+cc.getCode()+"' is not valid in the system "+inc.getSystem());
            
          }
        }
      }
    }
    int warnings = 0;
    for (ValidationMessage em : errors) {
      if (em.getLevel() == IssueSeverity.WARNING)
        warnings++;
    }
    vs.setUserData("warnings", o_warnings - warnings);
  }

  private boolean exemptFromStyleChecking(String system) {
    return styleExemptions.contains(system);
  }

  private boolean exemptFromCodeRules(String system) {
    if (system.equals("http://www.abs.gov.au/ausstats/abs@.nsf/mf/1220.0"))
      return true;
    if (system.equals("http://nema.org/dicom/dicm"))
      return true;
    return false;
    
  }

  private void checkCodeIslowerCaseDash(List<ValidationMessage> errors, String nameForErrors, ValueSet vs, List<ConceptDefinitionComponent> concept) {
    for (ConceptDefinitionComponent cc : concept) {
      if (!warning(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].define", !cc.hasCode() || isLowerCaseDash(cc.getCode()), 
         "Value set "+nameForErrors+" ("+vs.getName()+"/"+vs.getCodeSystem().getSystem()+"): Defined codes must be lowercase-dash: "+cc.getCode()))
        return;
      checkDisplayIsTitleCase(errors, nameForErrors, vs, cc.getConcept());  
    }
  }

  private boolean isLowerCaseDash(String code) {
    for (char c : code.toCharArray()) {
      if (Character.isAlphabetic(c) && Character.isUpperCase(c))
        return false;
      if (c != '-' && c != '.' && !Character.isAlphabetic(c) && !Character.isDigit(c))
        return false;
    }
    return true;
  }

  private void checkDisplayIsTitleCase(List<ValidationMessage> errors, String nameForErrors, ValueSet vs, List<ConceptDefinitionComponent> concept) {
    for (ConceptDefinitionComponent cc : concept) {
      if (!warning(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].define", !cc.hasDisplay() || isTitleCase(cc.getDisplay()), 
         "Value set "+nameForErrors+" ("+vs.getName()+"/"+vs.getCodeSystem().getSystem()+"): Display Names must be TitleCase: "+cc.getDisplay()))
        return;
      checkDisplayIsTitleCase(errors, nameForErrors, vs, cc.getConcept());  
    }
  }

  private boolean isTitleCase(String code) {
    char c = code.charAt(0);
    return !Character.isAlphabetic(c) || Character.isUpperCase(c);
  }

  private boolean isKnownCodeSystem(String system) {
    if (system.equals("http://snomed.info/sct"))
      return true;
    if (system.equals("http://www.nlm.nih.gov/research/umls/rxnorm"))
      return true;
    if (system.equals("http://loinc.org"))
      return true;
    if (system.equals("http://unitsofmeasure.org"))
      return true;
    if (system.equals("http://ncimeta.nci.nih.gov"))
      return true;
    if (system.equals("http://www.ama-assn.org/go/cpt"))
      return true;
    if (system.equals("http://hl7.org/fhir/ndfrt"))
      return true;
    if (system.equals("http://fdasis.nlm.nih.gov"))
      return true;
    if (system.equals("http://hl7.org/fhir/sid/ndc"))
      return true;
    if (system.equals("http://www2a.cdc.gov/vaccines/iis/iisstandards/vaccines.asp?rpt=cvx"))
      return true;
    if (system.equals("urn:iso:std:iso:3166"))
      return true;
    if (system.equals("http://www.nubc.org/patient-discharge"))
      return true;
    if (system.equals("http://www.radlex.org"))
      return true;
    if (system.equals("http://hl7.org/fhir/sid/icd-10"))
      return true;
    if (system.equals("http://hl7.org/fhir/sid/icpc2"))
      return true;
    if (system.equals("http://www.icd10data.com/icd10pcs"))
      return true;
    if (system.equals("http://hl7.org/fhir/sid/icd-9"))
      return true;
    if (system.equals("http://www.whocc.no/atc"))
      return true;
    if (system.equals("urn:ietf:bcp:47"))
      return true;
    if (system.equals("urn:iso:std:iso:11073:10101"))
      return true;
    if (system.equals("http://www.genenames.org"))
      return true;
    if (system.equals("http://www.ensembl.org"))
      return true;
    if (system.equals("http://www.ncbi.nlm.nih.gov/nuccore"))
      return true;
    if (system.equals("http://www.ncbi.nlm.nih.gov/clinvar"))
      return true;
    if (system.equals("http://sequenceontology.org"))
      return true;
    if (system.equals("http://www.hgvs.org/mutnomen"))
      return true;
    if (system.equals("http://www.ncbi.nlm.nih.gov/projects/SNP"))
      return true;
    if (system.equals("http://cancer.sanger.ac.uk/cancergenome/projects/cosmic"))
      return true;
    if (system.equals("http://www.lrg-sequence.org"))
      return true;
    if (system.equals("http://www.omim.org"))
      return true;
    if (system.equals("http://www.ncbi.nlm.nih.gov/pubmed"))
      return true;
    if (system.equals("http://www.pharmgkb.org"))
      return true;
    if (system.equals("http://clinicaltrials.gov"))
      return true;
    if (system.startsWith("http://example.com"))
      return true;
    if (system.startsWith("http://www.example.com"))
      return true;
    
    // todo: why do these need to be listed here?
    if (system.equals("https://www.usps.com/"))
      return true;
    if (system.equals("http://nema.org/dicom/dicm"))
      return true;    
    if ("http://hl7.org/fhir/restful-interaction".equals(system))
      return true;
    if ("http://hl7.org/fhir/data-types".equals(system))
      return true;  
    if (system.startsWith("http://hl7.org/fhir/ValueSet/v3"))
      return true;
    
    if ("http://unstats.un.org/unsd/methods/m49/m49.htm".equals(system))
      return true;
    if ("https://www.census.gov/geo/reference/".equals(system))
      return true;
    if (system.startsWith("urn:oid:"))
      return true;
    if (system.startsWith("http://cimi.org"))
      return true;
    if (system.startsWith("http://ihc.org"))
      return true;
    if ("http://ihc.org".equals(system))
      return true;
    if ("http://www.nucc.org".equals(system))
      return true;
    if ("http://www.cms.gov/Medicare/Coding/ICD9ProviderDiagnosticCodes/codes.html".equals(system))
      return true;
    if ("http://www.cms.gov/Medicare/Coding/ICD10/index.html".equals(system))
      return true;
    if ("http://www.iana.org/assignments/language-subtag-registry".equals(system))
      return true;
    
    return false; // todo: change this back to false
  }

  private boolean isValidCode(String code, String system) {
    ValueSet cs = context.getCodeSystems().get(system);
    if (cs == null) 
      return context.getTerminologyServices().validateCode(system, code, null) == null;
    else {
      if (hasCode(code, cs.getCodeSystem().getConcept()))
        return true;
      return false;
    }
  }

  private boolean hasCode(String code, List<ConceptDefinitionComponent> list) {
    for (ConceptDefinitionComponent cc : list) {
      if (cc.getCode().equals(code))
        return true;
      if (hasCode(code, cc.getConcept()))
        return true;
    }
    return false;
  }

  private boolean canValidate(String system) {
    return context.getCodeSystems().containsKey(system) || context.getTerminologyServices().supportsSystem(system);
  }

  private void fixup(ValueSet vs) {
    if (vs.hasCodeSystem()) {
      for (ConceptDefinitionComponent cc: vs.getCodeSystem().getConcept())
        fixup(cc);
    }
  }

  private void fixup(ConceptDefinitionComponent cc) {
    if (cc.hasDisplay() && !cc.hasDefinition())
      cc.setDefinition(cc.getDisplay());
    if (!cc.hasDisplay() && cc.hasDefinition())
      cc.setDisplay(cc.getDefinition());
    for (ConceptDefinitionComponent gc: cc.getConcept())
      fixup(gc);
  }

  private void checkCodesForSpaces(List<ValidationMessage> errors, String nameForErrors, ValueSet vs, List<ConceptDefinitionComponent> concept) {
    for (ConceptDefinitionComponent cc : concept) {
      if (!rule(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].define", !cc.hasCode() || !cc.getCode().contains(" "), 
         "Value set "+nameForErrors+" ("+vs.getName()+"/"+vs.getCodeSystem().getSystem()+"): Defined codes cannot include spaces ("+cc.getCode()+")"))
        return;
      checkCodesForSpaces(errors, nameForErrors, vs, cc.getConcept());  
    }
  }

  private void checkCodesForDisplayAndDefinition(List<ValidationMessage> errors, String path, List<ConceptDefinitionComponent> concept, ValueSet vs, String nameForErrors) {
    int i = 0;
    for (ConceptDefinitionComponent cc : concept) {
      String p = path +"["+Integer.toString(i)+"]";
      if (!warning(errors, IssueType.BUSINESSRULE, p, !cc.getAbstract() || !cc.hasCode() || cc.hasDisplay(), "Code System '"+vs.getCodeSystem().getSystem()+"' has a code without a display ('"+cc.getCode()+"')",
        "<a href=\""+vs.getUserString("path")+"\">Value set "+nameForErrors+" ("+vs.getName()+")</a>: Code System '"+vs.getCodeSystem().getSystem()+"' has a code without a display ('"+cc.getCode()+"')"))
        return;
      if (!warning(errors, IssueType.BUSINESSRULE, p, cc.hasDefinition() && (!cc.getDefinition().toLowerCase().equals("todo") || cc.getDefinition().toLowerCase().equals("to do")), "Code System '"+vs.getCodeSystem().getSystem()+"' has a code without a definition ('"+cc.getCode()+"')",
        "<a href=\""+vs.getUserString("path")+"\">Value set "+nameForErrors+" ("+vs.getName()+")</a>: Code System '"+vs.getCodeSystem().getSystem()+"' has a code without a definition ('"+cc.getCode()+"')"))
        return;
      checkCodesForDisplayAndDefinition(errors, p+".concept", cc.getConcept(), vs, nameForErrors);
      i++;
    }
  }

  private void checkCodeCaseDuplicates(List<ValidationMessage> errors, String nameForErrors, ValueSet vs, Set<String> codes, List<ConceptDefinitionComponent> concepts) {
    for (ConceptDefinitionComponent c : concepts) {
      String cc = c.getCode().toLowerCase();
        rule(errors, IssueType.BUSINESSRULE, vs.getUserString("committee")+":ValueSet["+vs.getId()+"].define", !codes.contains(cc), 
          "Value set "+nameForErrors+" ("+vs.getName()+"): Code '"+cc+"' is defined twice, different by case - this is not allowed in a FHIR definition");
      if (c.hasConcept())
        checkCodeCaseDuplicates(errors, nameForErrors, vs, codes, c.getConcept());
    }
  }

  private Set<String> getListOfSources(ValueSet vs) {
    Set<String> sources = new HashSet<String>();
    if (vs.hasCodeSystem())
      sources.add(vs.getCodeSystem().getSystem());
    if (vs.hasCompose()) {
      for (ConceptSetComponent imp : vs.getCompose().getInclude()) 
        sources.add(imp.getSystem());
      for (ConceptSetComponent imp : vs.getCompose().getExclude()) 
        sources.add(imp.getSystem());
    }
    return sources;
  }

  public void checkDuplicates(List<ValidationMessage> errors) {
    for (int i = 0; i < duplicateList.size()-1; i++) {
      for (int j = i+1; j < duplicateList.size(); j++) {
        VSDuplicateList vd1 = duplicateList.get(i);
        VSDuplicateList vd2 = duplicateList.get(j);
        String committee = pickCommittee(vd1, vd2);
        if (committee != null) {
          if (rule(errors, IssueType.BUSINESSRULE, committee+":ValueSetComparison", !vd1.id.equals(vd2.id), "Duplicate Value Set ids : "+vd1.id+"("+vd1.vs.getName()+") & "+vd2.id+"("+vd2.vs.getName()+") (id)") &&
              rule(errors, IssueType.BUSINESSRULE, committee+":ValueSetComparison", !vd1.url.equals(vd2.url), "Duplicate Value Set URLs: "+vd1.id+"("+vd1.vs.getName()+") & "+vd2.id+"("+vd2.vs.getName()+") (url)")) {
            if (isInternal(vd1.url) || isInternal(vd2.url)) {
              warning(errors, IssueType.BUSINESSRULE, committee+":ValueSetComparison", areDisjoint(vd1.name, vd2.name), "Duplicate Valueset Names: "+vd1.vs.getUserString("path")+" ("+vd1.vs.getName()+") & "+vd2.vs.getUserString("path")+" ("+vd2.vs.getName()+") (name: "+vd1.name.toString()+" / "+vd2.name.toString()+"))", 
                  "Duplicate Valueset Names: <a href=\""+vd1.vs.getUserString("path")+"\">"+vd1.id+"</a> ("+vd1.vs.getName()+") &amp; <a href=\""+vd2.vs.getUserString("path")+"\">"+vd2.id+"</a> ("+vd2.vs.getName()+") (name: "+vd1.name.toString()+" / "+vd2.name.toString()+"))");
              warning(errors, IssueType.BUSINESSRULE, committee+":ValueSetComparison", areDisjoint(vd1.description, vd2.description), "Duplicate Valueset Definitions: "+vd1.vs.getUserString("path")+" ("+vd1.vs.getName()+") & "+vd2.vs.getUserString("path")+" ("+vd2.vs.getName()+") (description: "+vd1.description.toString()+" / "+vd2.description.toString()+")",
                  "Duplicate Valueset descriptions: <a href=\""+vd1.vs.getUserString("path")+"\">"+vd1.id+"</a> ("+vd1.vs.getName()+") &amp; <a href=\""+vd2.vs.getUserString("path")+"\">"+vd2.id+"</a> ("+vd2.vs.getName()+") (description: "+vd1.description.toString()+" / "+vd2.description.toString()+"))");
            }
          }
        }
      }
    }
  }

  private String pickCommittee(VSDuplicateList vd1, VSDuplicateList vd2) {
    String c1 = vd1.vs.getUserString("committee");
    String c2 = vd2.vs.getUserString("committee");
    if (c1 == null)
      return c2;
    else if (c2 == null)
      return c1;
    else if (c1.equals("fhir"))
      return c2;
    else if (c2.equals("fhir"))
      return c1;
    else
      return c1;
  }

  private boolean isInternal(String url) {
    return url.startsWith("http://hl7.org/fhir") && !url.startsWith("http://hl7.org/fhir/ValueSet/v2-") && !url.startsWith("http://hl7.org/fhir/ValueSet/v3-");
  }

  private boolean areDisjoint(Set<String> set1, Set<String> set2) {
    if (set1.isEmpty() || set2.isEmpty())
      return true;
    
    Set<String> set = new HashSet<String>();
    for (String s : set1) 
      if (!set2.contains(s))
        set.add(s);
    for (String s : set2) 
      if (!set1.contains(s))
        set.add(s);
    return !set.isEmpty();
  }

}
