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
import org.hl7.fhir.instance.model.annotations.ResourceDef;
import org.hl7.fhir.instance.model.annotations.SearchParamDefinition;
import org.hl7.fhir.instance.model.annotations.Child;
import org.hl7.fhir.instance.model.annotations.Description;
import org.hl7.fhir.instance.model.annotations.Block;
import org.hl7.fhir.instance.model.api.*;
/**
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 */
@ResourceDef(name="ClinicalImpression", profile="http://hl7.org/fhir/Profile/ClinicalImpression")
public class ClinicalImpression extends DomainResource {

    public enum ClinicalImpressionStatus {
        /**
         * The assessment is still on-going and results are not yet final.
         */
        INPROGRESS, 
        /**
         * The assessment is done and the results are final
         */
        COMPLETED, 
        /**
         * This assessment was never actually done and the record is erroneous (e.g. Wrong patient)
         */
        ENTEREDINERROR, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ClinicalImpressionStatus fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
          return INPROGRESS;
        if ("completed".equals(codeString))
          return COMPLETED;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        throw new Exception("Unknown ClinicalImpressionStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case INPROGRESS: return "in-progress";
            case COMPLETED: return "completed";
            case ENTEREDINERROR: return "entered-in-error";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case INPROGRESS: return "http://hl7.org/fhir/clinical-impression-status";
            case COMPLETED: return "http://hl7.org/fhir/clinical-impression-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/clinical-impression-status";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case INPROGRESS: return "The assessment is still on-going and results are not yet final.";
            case COMPLETED: return "The assessment is done and the results are final";
            case ENTEREDINERROR: return "This assessment was never actually done and the record is erroneous (e.g. Wrong patient)";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case INPROGRESS: return "In progress";
            case COMPLETED: return "Completed";
            case ENTEREDINERROR: return "Entered in Error";
            default: return "?";
          }
        }
    }

  public static class ClinicalImpressionStatusEnumFactory implements EnumFactory<ClinicalImpressionStatus> {
    public ClinicalImpressionStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
          return ClinicalImpressionStatus.INPROGRESS;
        if ("completed".equals(codeString))
          return ClinicalImpressionStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
          return ClinicalImpressionStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown ClinicalImpressionStatus code '"+codeString+"'");
        }
    public String toCode(ClinicalImpressionStatus code) {
      if (code == ClinicalImpressionStatus.INPROGRESS)
        return "in-progress";
      if (code == ClinicalImpressionStatus.COMPLETED)
        return "completed";
      if (code == ClinicalImpressionStatus.ENTEREDINERROR)
        return "entered-in-error";
      return "?";
      }
    }

    @Block()
    public static class ClinicalImpressionInvestigationsComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A name/code for the group ("set") of investigations. Typically, this will be something like "signs", "symptoms", "clinical", "diagnostic", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=1)
        @Description(shortDefinition="A name/code for the set", formalDefinition="A name/code for the group ('set') of investigations. Typically, this will be something like 'signs', 'symptoms', 'clinical', 'diagnostic', but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used." )
        protected CodeableConcept code;

        /**
         * A record of a specific investigation that was undertaken.
         */
        @Child(name = "item", type = {Observation.class, QuestionnaireAnswers.class, FamilyMemberHistory.class, DiagnosticReport.class}, order=2, min=0, max=Child.MAX_UNLIMITED)
        @Description(shortDefinition="Record of a specific investigation", formalDefinition="A record of a specific investigation that was undertaken." )
        protected List<Reference> item;
        /**
         * The actual objects that are the target of the reference (A record of a specific investigation that was undertaken.)
         */
        protected List<Resource> itemTarget;


        private static final long serialVersionUID = -301363326L;

    /*
     * Constructor
     */
      public ClinicalImpressionInvestigationsComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ClinicalImpressionInvestigationsComponent(CodeableConcept code) {
        super();
        this.code = code;
      }

        /**
         * @return {@link #code} (A name/code for the group ("set") of investigations. Typically, this will be something like "signs", "symptoms", "clinical", "diagnostic", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.)
         */
        public CodeableConcept getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalImpressionInvestigationsComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new CodeableConcept(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (A name/code for the group ("set") of investigations. Typically, this will be something like "signs", "symptoms", "clinical", "diagnostic", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.)
         */
        public ClinicalImpressionInvestigationsComponent setCode(CodeableConcept value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #item} (A record of a specific investigation that was undertaken.)
         */
        public List<Reference> getItem() { 
          if (this.item == null)
            this.item = new ArrayList<Reference>();
          return this.item;
        }

        public boolean hasItem() { 
          if (this.item == null)
            return false;
          for (Reference item : this.item)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #item} (A record of a specific investigation that was undertaken.)
         */
    // syntactic sugar
        public Reference addItem() { //3
          Reference t = new Reference();
          if (this.item == null)
            this.item = new ArrayList<Reference>();
          this.item.add(t);
          return t;
        }

    // syntactic sugar
        public ClinicalImpressionInvestigationsComponent addItem(Reference t) { //3
          if (t == null)
            return this;
          if (this.item == null)
            this.item = new ArrayList<Reference>();
          this.item.add(t);
          return this;
        }

        /**
         * @return {@link #item} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. A record of a specific investigation that was undertaken.)
         */
        public List<Resource> getItemTarget() { 
          if (this.itemTarget == null)
            this.itemTarget = new ArrayList<Resource>();
          return this.itemTarget;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("code", "CodeableConcept", "A name/code for the group ('set') of investigations. Typically, this will be something like 'signs', 'symptoms', 'clinical', 'diagnostic', but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.", 0, java.lang.Integer.MAX_VALUE, code));
          childrenList.add(new Property("item", "Reference(Observation|QuestionnaireAnswers|FamilyMemberHistory|DiagnosticReport)", "A record of a specific investigation that was undertaken.", 0, java.lang.Integer.MAX_VALUE, item));
        }

      public ClinicalImpressionInvestigationsComponent copy() {
        ClinicalImpressionInvestigationsComponent dst = new ClinicalImpressionInvestigationsComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        if (item != null) {
          dst.item = new ArrayList<Reference>();
          for (Reference i : item)
            dst.item.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ClinicalImpressionInvestigationsComponent))
          return false;
        ClinicalImpressionInvestigationsComponent o = (ClinicalImpressionInvestigationsComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(item, o.item, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ClinicalImpressionInvestigationsComponent))
          return false;
        ClinicalImpressionInvestigationsComponent o = (ClinicalImpressionInvestigationsComponent) other;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (item == null || item.isEmpty())
          ;
      }

  }

    @Block()
    public static class ClinicalImpressionFindingComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Specific text of code for finding or diagnosis.
         */
        @Child(name = "item", type = {CodeableConcept.class}, order=1, min=1, max=1)
        @Description(shortDefinition="Specific text or code for finding", formalDefinition="Specific text of code for finding or diagnosis." )
        protected CodeableConcept item;

        /**
         * Which investigations support finding or diagnosis.
         */
        @Child(name = "cause", type = {StringType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Which investigations support finding", formalDefinition="Which investigations support finding or diagnosis." )
        protected StringType cause;

        private static final long serialVersionUID = -888590978L;

    /*
     * Constructor
     */
      public ClinicalImpressionFindingComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ClinicalImpressionFindingComponent(CodeableConcept item) {
        super();
        this.item = item;
      }

        /**
         * @return {@link #item} (Specific text of code for finding or diagnosis.)
         */
        public CodeableConcept getItem() { 
          if (this.item == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalImpressionFindingComponent.item");
            else if (Configuration.doAutoCreate())
              this.item = new CodeableConcept(); // cc
          return this.item;
        }

        public boolean hasItem() { 
          return this.item != null && !this.item.isEmpty();
        }

        /**
         * @param value {@link #item} (Specific text of code for finding or diagnosis.)
         */
        public ClinicalImpressionFindingComponent setItem(CodeableConcept value) { 
          this.item = value;
          return this;
        }

        /**
         * @return {@link #cause} (Which investigations support finding or diagnosis.). This is the underlying object with id, value and extensions. The accessor "getCause" gives direct access to the value
         */
        public StringType getCauseElement() { 
          if (this.cause == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalImpressionFindingComponent.cause");
            else if (Configuration.doAutoCreate())
              this.cause = new StringType(); // bb
          return this.cause;
        }

        public boolean hasCauseElement() { 
          return this.cause != null && !this.cause.isEmpty();
        }

        public boolean hasCause() { 
          return this.cause != null && !this.cause.isEmpty();
        }

        /**
         * @param value {@link #cause} (Which investigations support finding or diagnosis.). This is the underlying object with id, value and extensions. The accessor "getCause" gives direct access to the value
         */
        public ClinicalImpressionFindingComponent setCauseElement(StringType value) { 
          this.cause = value;
          return this;
        }

        /**
         * @return Which investigations support finding or diagnosis.
         */
        public String getCause() { 
          return this.cause == null ? null : this.cause.getValue();
        }

        /**
         * @param value Which investigations support finding or diagnosis.
         */
        public ClinicalImpressionFindingComponent setCause(String value) { 
          if (Utilities.noString(value))
            this.cause = null;
          else {
            if (this.cause == null)
              this.cause = new StringType();
            this.cause.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("item", "CodeableConcept", "Specific text of code for finding or diagnosis.", 0, java.lang.Integer.MAX_VALUE, item));
          childrenList.add(new Property("cause", "string", "Which investigations support finding or diagnosis.", 0, java.lang.Integer.MAX_VALUE, cause));
        }

      public ClinicalImpressionFindingComponent copy() {
        ClinicalImpressionFindingComponent dst = new ClinicalImpressionFindingComponent();
        copyValues(dst);
        dst.item = item == null ? null : item.copy();
        dst.cause = cause == null ? null : cause.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ClinicalImpressionFindingComponent))
          return false;
        ClinicalImpressionFindingComponent o = (ClinicalImpressionFindingComponent) other;
        return compareDeep(item, o.item, true) && compareDeep(cause, o.cause, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ClinicalImpressionFindingComponent))
          return false;
        ClinicalImpressionFindingComponent o = (ClinicalImpressionFindingComponent) other;
        return compareValues(cause, o.cause, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (item == null || item.isEmpty()) && (cause == null || cause.isEmpty())
          ;
      }

  }

    @Block()
    public static class ClinicalImpressionRuledOutComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Specific text of code for diagnosis.
         */
        @Child(name = "item", type = {CodeableConcept.class}, order=1, min=1, max=1)
        @Description(shortDefinition="Specific text of code for diagnosis", formalDefinition="Specific text of code for diagnosis." )
        protected CodeableConcept item;

        /**
         * Grounds for elimination.
         */
        @Child(name = "reason", type = {StringType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="Grounds for elimination", formalDefinition="Grounds for elimination." )
        protected StringType reason;

        private static final long serialVersionUID = -1001661243L;

    /*
     * Constructor
     */
      public ClinicalImpressionRuledOutComponent() {
        super();
      }

    /*
     * Constructor
     */
      public ClinicalImpressionRuledOutComponent(CodeableConcept item) {
        super();
        this.item = item;
      }

        /**
         * @return {@link #item} (Specific text of code for diagnosis.)
         */
        public CodeableConcept getItem() { 
          if (this.item == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalImpressionRuledOutComponent.item");
            else if (Configuration.doAutoCreate())
              this.item = new CodeableConcept(); // cc
          return this.item;
        }

        public boolean hasItem() { 
          return this.item != null && !this.item.isEmpty();
        }

        /**
         * @param value {@link #item} (Specific text of code for diagnosis.)
         */
        public ClinicalImpressionRuledOutComponent setItem(CodeableConcept value) { 
          this.item = value;
          return this;
        }

        /**
         * @return {@link #reason} (Grounds for elimination.). This is the underlying object with id, value and extensions. The accessor "getReason" gives direct access to the value
         */
        public StringType getReasonElement() { 
          if (this.reason == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalImpressionRuledOutComponent.reason");
            else if (Configuration.doAutoCreate())
              this.reason = new StringType(); // bb
          return this.reason;
        }

        public boolean hasReasonElement() { 
          return this.reason != null && !this.reason.isEmpty();
        }

        public boolean hasReason() { 
          return this.reason != null && !this.reason.isEmpty();
        }

        /**
         * @param value {@link #reason} (Grounds for elimination.). This is the underlying object with id, value and extensions. The accessor "getReason" gives direct access to the value
         */
        public ClinicalImpressionRuledOutComponent setReasonElement(StringType value) { 
          this.reason = value;
          return this;
        }

        /**
         * @return Grounds for elimination.
         */
        public String getReason() { 
          return this.reason == null ? null : this.reason.getValue();
        }

        /**
         * @param value Grounds for elimination.
         */
        public ClinicalImpressionRuledOutComponent setReason(String value) { 
          if (Utilities.noString(value))
            this.reason = null;
          else {
            if (this.reason == null)
              this.reason = new StringType();
            this.reason.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("item", "CodeableConcept", "Specific text of code for diagnosis.", 0, java.lang.Integer.MAX_VALUE, item));
          childrenList.add(new Property("reason", "string", "Grounds for elimination.", 0, java.lang.Integer.MAX_VALUE, reason));
        }

      public ClinicalImpressionRuledOutComponent copy() {
        ClinicalImpressionRuledOutComponent dst = new ClinicalImpressionRuledOutComponent();
        copyValues(dst);
        dst.item = item == null ? null : item.copy();
        dst.reason = reason == null ? null : reason.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ClinicalImpressionRuledOutComponent))
          return false;
        ClinicalImpressionRuledOutComponent o = (ClinicalImpressionRuledOutComponent) other;
        return compareDeep(item, o.item, true) && compareDeep(reason, o.reason, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ClinicalImpressionRuledOutComponent))
          return false;
        ClinicalImpressionRuledOutComponent o = (ClinicalImpressionRuledOutComponent) other;
        return compareValues(reason, o.reason, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (item == null || item.isEmpty()) && (reason == null || reason.isEmpty())
          ;
      }

  }

    /**
     * The patient being assessed.
     */
    @Child(name = "patient", type = {Patient.class}, order=0, min=1, max=1)
    @Description(shortDefinition="The patient being assessed", formalDefinition="The patient being assessed." )
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient being assessed.)
     */
    protected Patient patientTarget;

    /**
     * The clinician performing the assessment.
     */
    @Child(name = "assessor", type = {Practitioner.class}, order=1, min=0, max=1)
    @Description(shortDefinition="The clinician performing the assessment", formalDefinition="The clinician performing the assessment." )
    protected Reference assessor;

    /**
     * The actual object that is the target of the reference (The clinician performing the assessment.)
     */
    protected Practitioner assessorTarget;

    /**
     * Identifies the workflow status of the assessment.
     */
    @Child(name = "status", type = {CodeType.class}, order=2, min=1, max=1)
    @Description(shortDefinition="in-progress | completed | entered-in-error", formalDefinition="Identifies the workflow status of the assessment." )
    protected Enumeration<ClinicalImpressionStatus> status;

    /**
     * The point in time at which the assessment was concluded (not when it was recorded).
     */
    @Child(name = "date", type = {DateTimeType.class}, order=3, min=0, max=1)
    @Description(shortDefinition="When the assessment occurred", formalDefinition="The point in time at which the assessment was concluded (not when it was recorded)." )
    protected DateTimeType date;

    /**
     * A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.
     */
    @Child(name = "description", type = {StringType.class}, order=4, min=0, max=1)
    @Description(shortDefinition="Why/how the assessment was performed", formalDefinition="A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it." )
    protected StringType description;

    /**
     * A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.
     */
    @Child(name = "previous", type = {ClinicalImpression.class}, order=5, min=0, max=1)
    @Description(shortDefinition="Reference to last assessment", formalDefinition="A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes." )
    protected Reference previous;

    /**
     * The actual object that is the target of the reference (A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.)
     */
    protected ClinicalImpression previousTarget;

    /**
     * This a list of the general problems/conditions for a patient.
     */
    @Child(name = "problem", type = {Condition.class, AllergyIntolerance.class}, order=6, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="General assessment of patient state", formalDefinition="This a list of the general problems/conditions for a patient." )
    protected List<Reference> problem;
    /**
     * The actual objects that are the target of the reference (This a list of the general problems/conditions for a patient.)
     */
    protected List<Resource> problemTarget;


    /**
     * The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.
     */
    @Child(name = "trigger", type = {CodeableConcept.class}, order=7, min=0, max=1)
    @Description(shortDefinition="Request or event that necessitated this assessment", formalDefinition="The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource." )
    protected Type trigger;

    /**
     * One or more sets of investigations (signs, symptions, etc). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
     */
    @Child(name = "investigations", type = {}, order=8, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="One or more sets of investigations (signs, symptions, etc)", formalDefinition="One or more sets of investigations (signs, symptions, etc). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes." )
    protected List<ClinicalImpressionInvestigationsComponent> investigations;

    /**
     * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
     */
    @Child(name = "protocol", type = {UriType.class}, order=9, min=0, max=1)
    @Description(shortDefinition="Clinical Protocol followed", formalDefinition="Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis." )
    protected UriType protocol;

    /**
     * A text summary of the investigations and the diagnosis.
     */
    @Child(name = "summary", type = {StringType.class}, order=10, min=0, max=1)
    @Description(shortDefinition="Summary of the assessment", formalDefinition="A text summary of the investigations and the diagnosis." )
    protected StringType summary;

    /**
     * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.
     */
    @Child(name = "finding", type = {}, order=11, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Possible or likely findings and diagnoses", formalDefinition="Specific findings or diagnoses that was considered likely or relevant to ongoing treatment." )
    protected List<ClinicalImpressionFindingComponent> finding;

    /**
     * Diagnoses/conditions resolved since the last assessment.
     */
    @Child(name = "resolved", type = {CodeableConcept.class}, order=12, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Diagnosies/conditions resolved since previous assessment", formalDefinition="Diagnoses/conditions resolved since the last assessment." )
    protected List<CodeableConcept> resolved;

    /**
     * Diagnosis considered not possible.
     */
    @Child(name = "ruledOut", type = {}, order=13, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Diagnosis considered not possible", formalDefinition="Diagnosis considered not possible." )
    protected List<ClinicalImpressionRuledOutComponent> ruledOut;

    /**
     * Estimate of likely outcome.
     */
    @Child(name = "prognosis", type = {StringType.class}, order=14, min=0, max=1)
    @Description(shortDefinition="Estimate of likely outcome", formalDefinition="Estimate of likely outcome." )
    protected StringType prognosis;

    /**
     * Plan of action after assessment.
     */
    @Child(name = "plan", type = {CarePlan.class, Appointment.class, CommunicationRequest.class, DeviceUseRequest.class, DiagnosticOrder.class, MedicationPrescription.class, NutritionOrder.class, Order.class, ProcedureRequest.class, ProcessRequest.class, ReferralRequest.class, Supply.class, VisionPrescription.class}, order=15, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Plan of action after assessment", formalDefinition="Plan of action after assessment." )
    protected List<Reference> plan;
    /**
     * The actual objects that are the target of the reference (Plan of action after assessment.)
     */
    protected List<Resource> planTarget;


    /**
     * Actions taken during assessment.
     */
    @Child(name = "action", type = {ReferralRequest.class, ProcedureRequest.class, Procedure.class, MedicationPrescription.class, DiagnosticOrder.class, NutritionOrder.class, Supply.class, Appointment.class}, order=16, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Actions taken during assessment", formalDefinition="Actions taken during assessment." )
    protected List<Reference> action;
    /**
     * The actual objects that are the target of the reference (Actions taken during assessment.)
     */
    protected List<Resource> actionTarget;


    private static final long serialVersionUID = 1650458630L;

  /*
   * Constructor
   */
    public ClinicalImpression() {
      super();
    }

  /*
   * Constructor
   */
    public ClinicalImpression(Reference patient, Enumeration<ClinicalImpressionStatus> status) {
      super();
      this.patient = patient;
      this.status = status;
    }

    /**
     * @return {@link #patient} (The patient being assessed.)
     */
    public Reference getPatient() { 
      if (this.patient == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.patient");
        else if (Configuration.doAutoCreate())
          this.patient = new Reference(); // cc
      return this.patient;
    }

    public boolean hasPatient() { 
      return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient being assessed.)
     */
    public ClinicalImpression setPatient(Reference value) { 
      this.patient = value;
      return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient being assessed.)
     */
    public Patient getPatientTarget() { 
      if (this.patientTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.patient");
        else if (Configuration.doAutoCreate())
          this.patientTarget = new Patient(); // aa
      return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient being assessed.)
     */
    public ClinicalImpression setPatientTarget(Patient value) { 
      this.patientTarget = value;
      return this;
    }

    /**
     * @return {@link #assessor} (The clinician performing the assessment.)
     */
    public Reference getAssessor() { 
      if (this.assessor == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.assessor");
        else if (Configuration.doAutoCreate())
          this.assessor = new Reference(); // cc
      return this.assessor;
    }

    public boolean hasAssessor() { 
      return this.assessor != null && !this.assessor.isEmpty();
    }

    /**
     * @param value {@link #assessor} (The clinician performing the assessment.)
     */
    public ClinicalImpression setAssessor(Reference value) { 
      this.assessor = value;
      return this;
    }

    /**
     * @return {@link #assessor} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The clinician performing the assessment.)
     */
    public Practitioner getAssessorTarget() { 
      if (this.assessorTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.assessor");
        else if (Configuration.doAutoCreate())
          this.assessorTarget = new Practitioner(); // aa
      return this.assessorTarget;
    }

    /**
     * @param value {@link #assessor} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The clinician performing the assessment.)
     */
    public ClinicalImpression setAssessorTarget(Practitioner value) { 
      this.assessorTarget = value;
      return this;
    }

    /**
     * @return {@link #status} (Identifies the workflow status of the assessment.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ClinicalImpressionStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<ClinicalImpressionStatus>(new ClinicalImpressionStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Identifies the workflow status of the assessment.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ClinicalImpression setStatusElement(Enumeration<ClinicalImpressionStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return Identifies the workflow status of the assessment.
     */
    public ClinicalImpressionStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Identifies the workflow status of the assessment.
     */
    public ClinicalImpression setStatus(ClinicalImpressionStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<ClinicalImpressionStatus>(new ClinicalImpressionStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #date} (The point in time at which the assessment was concluded (not when it was recorded).). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.date");
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
     * @param value {@link #date} (The point in time at which the assessment was concluded (not when it was recorded).). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ClinicalImpression setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The point in time at which the assessment was concluded (not when it was recorded).
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The point in time at which the assessment was concluded (not when it was recorded).
     */
    public ClinicalImpression setDate(Date value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #description} (A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.description");
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
     * @param value {@link #description} (A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ClinicalImpression setDescriptionElement(StringType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.
     */
    public ClinicalImpression setDescription(String value) { 
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
     * @return {@link #previous} (A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.)
     */
    public Reference getPrevious() { 
      if (this.previous == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.previous");
        else if (Configuration.doAutoCreate())
          this.previous = new Reference(); // cc
      return this.previous;
    }

    public boolean hasPrevious() { 
      return this.previous != null && !this.previous.isEmpty();
    }

    /**
     * @param value {@link #previous} (A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.)
     */
    public ClinicalImpression setPrevious(Reference value) { 
      this.previous = value;
      return this;
    }

    /**
     * @return {@link #previous} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.)
     */
    public ClinicalImpression getPreviousTarget() { 
      if (this.previousTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.previous");
        else if (Configuration.doAutoCreate())
          this.previousTarget = new ClinicalImpression(); // aa
      return this.previousTarget;
    }

    /**
     * @param value {@link #previous} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.)
     */
    public ClinicalImpression setPreviousTarget(ClinicalImpression value) { 
      this.previousTarget = value;
      return this;
    }

    /**
     * @return {@link #problem} (This a list of the general problems/conditions for a patient.)
     */
    public List<Reference> getProblem() { 
      if (this.problem == null)
        this.problem = new ArrayList<Reference>();
      return this.problem;
    }

    public boolean hasProblem() { 
      if (this.problem == null)
        return false;
      for (Reference item : this.problem)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #problem} (This a list of the general problems/conditions for a patient.)
     */
    // syntactic sugar
    public Reference addProblem() { //3
      Reference t = new Reference();
      if (this.problem == null)
        this.problem = new ArrayList<Reference>();
      this.problem.add(t);
      return t;
    }

    // syntactic sugar
    public ClinicalImpression addProblem(Reference t) { //3
      if (t == null)
        return this;
      if (this.problem == null)
        this.problem = new ArrayList<Reference>();
      this.problem.add(t);
      return this;
    }

    /**
     * @return {@link #problem} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. This a list of the general problems/conditions for a patient.)
     */
    public List<Resource> getProblemTarget() { 
      if (this.problemTarget == null)
        this.problemTarget = new ArrayList<Resource>();
      return this.problemTarget;
    }

    /**
     * @return {@link #trigger} (The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.)
     */
    public Type getTrigger() { 
      return this.trigger;
    }

    /**
     * @return {@link #trigger} (The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.)
     */
    public CodeableConcept getTriggerCodeableConcept() throws Exception { 
      if (!(this.trigger instanceof CodeableConcept))
        throw new Exception("Type mismatch: the type CodeableConcept was expected, but "+this.trigger.getClass().getName()+" was encountered");
      return (CodeableConcept) this.trigger;
    }

    public boolean hasTriggerCodeableConcept() throws Exception { 
      return this.trigger instanceof CodeableConcept;
    }

    /**
     * @return {@link #trigger} (The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.)
     */
    public Reference getTriggerReference() throws Exception { 
      if (!(this.trigger instanceof Reference))
        throw new Exception("Type mismatch: the type Reference was expected, but "+this.trigger.getClass().getName()+" was encountered");
      return (Reference) this.trigger;
    }

    public boolean hasTriggerReference() throws Exception { 
      return this.trigger instanceof Reference;
    }

    public boolean hasTrigger() { 
      return this.trigger != null && !this.trigger.isEmpty();
    }

    /**
     * @param value {@link #trigger} (The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.)
     */
    public ClinicalImpression setTrigger(Type value) { 
      this.trigger = value;
      return this;
    }

    /**
     * @return {@link #investigations} (One or more sets of investigations (signs, symptions, etc). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.)
     */
    public List<ClinicalImpressionInvestigationsComponent> getInvestigations() { 
      if (this.investigations == null)
        this.investigations = new ArrayList<ClinicalImpressionInvestigationsComponent>();
      return this.investigations;
    }

    public boolean hasInvestigations() { 
      if (this.investigations == null)
        return false;
      for (ClinicalImpressionInvestigationsComponent item : this.investigations)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #investigations} (One or more sets of investigations (signs, symptions, etc). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.)
     */
    // syntactic sugar
    public ClinicalImpressionInvestigationsComponent addInvestigations() { //3
      ClinicalImpressionInvestigationsComponent t = new ClinicalImpressionInvestigationsComponent();
      if (this.investigations == null)
        this.investigations = new ArrayList<ClinicalImpressionInvestigationsComponent>();
      this.investigations.add(t);
      return t;
    }

    // syntactic sugar
    public ClinicalImpression addInvestigations(ClinicalImpressionInvestigationsComponent t) { //3
      if (t == null)
        return this;
      if (this.investigations == null)
        this.investigations = new ArrayList<ClinicalImpressionInvestigationsComponent>();
      this.investigations.add(t);
      return this;
    }

    /**
     * @return {@link #protocol} (Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.). This is the underlying object with id, value and extensions. The accessor "getProtocol" gives direct access to the value
     */
    public UriType getProtocolElement() { 
      if (this.protocol == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.protocol");
        else if (Configuration.doAutoCreate())
          this.protocol = new UriType(); // bb
      return this.protocol;
    }

    public boolean hasProtocolElement() { 
      return this.protocol != null && !this.protocol.isEmpty();
    }

    public boolean hasProtocol() { 
      return this.protocol != null && !this.protocol.isEmpty();
    }

    /**
     * @param value {@link #protocol} (Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.). This is the underlying object with id, value and extensions. The accessor "getProtocol" gives direct access to the value
     */
    public ClinicalImpression setProtocolElement(UriType value) { 
      this.protocol = value;
      return this;
    }

    /**
     * @return Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
     */
    public String getProtocol() { 
      return this.protocol == null ? null : this.protocol.getValue();
    }

    /**
     * @param value Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
     */
    public ClinicalImpression setProtocol(String value) { 
      if (Utilities.noString(value))
        this.protocol = null;
      else {
        if (this.protocol == null)
          this.protocol = new UriType();
        this.protocol.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #summary} (A text summary of the investigations and the diagnosis.). This is the underlying object with id, value and extensions. The accessor "getSummary" gives direct access to the value
     */
    public StringType getSummaryElement() { 
      if (this.summary == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.summary");
        else if (Configuration.doAutoCreate())
          this.summary = new StringType(); // bb
      return this.summary;
    }

    public boolean hasSummaryElement() { 
      return this.summary != null && !this.summary.isEmpty();
    }

    public boolean hasSummary() { 
      return this.summary != null && !this.summary.isEmpty();
    }

    /**
     * @param value {@link #summary} (A text summary of the investigations and the diagnosis.). This is the underlying object with id, value and extensions. The accessor "getSummary" gives direct access to the value
     */
    public ClinicalImpression setSummaryElement(StringType value) { 
      this.summary = value;
      return this;
    }

    /**
     * @return A text summary of the investigations and the diagnosis.
     */
    public String getSummary() { 
      return this.summary == null ? null : this.summary.getValue();
    }

    /**
     * @param value A text summary of the investigations and the diagnosis.
     */
    public ClinicalImpression setSummary(String value) { 
      if (Utilities.noString(value))
        this.summary = null;
      else {
        if (this.summary == null)
          this.summary = new StringType();
        this.summary.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #finding} (Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.)
     */
    public List<ClinicalImpressionFindingComponent> getFinding() { 
      if (this.finding == null)
        this.finding = new ArrayList<ClinicalImpressionFindingComponent>();
      return this.finding;
    }

    public boolean hasFinding() { 
      if (this.finding == null)
        return false;
      for (ClinicalImpressionFindingComponent item : this.finding)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #finding} (Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.)
     */
    // syntactic sugar
    public ClinicalImpressionFindingComponent addFinding() { //3
      ClinicalImpressionFindingComponent t = new ClinicalImpressionFindingComponent();
      if (this.finding == null)
        this.finding = new ArrayList<ClinicalImpressionFindingComponent>();
      this.finding.add(t);
      return t;
    }

    // syntactic sugar
    public ClinicalImpression addFinding(ClinicalImpressionFindingComponent t) { //3
      if (t == null)
        return this;
      if (this.finding == null)
        this.finding = new ArrayList<ClinicalImpressionFindingComponent>();
      this.finding.add(t);
      return this;
    }

    /**
     * @return {@link #resolved} (Diagnoses/conditions resolved since the last assessment.)
     */
    public List<CodeableConcept> getResolved() { 
      if (this.resolved == null)
        this.resolved = new ArrayList<CodeableConcept>();
      return this.resolved;
    }

    public boolean hasResolved() { 
      if (this.resolved == null)
        return false;
      for (CodeableConcept item : this.resolved)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #resolved} (Diagnoses/conditions resolved since the last assessment.)
     */
    // syntactic sugar
    public CodeableConcept addResolved() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.resolved == null)
        this.resolved = new ArrayList<CodeableConcept>();
      this.resolved.add(t);
      return t;
    }

    // syntactic sugar
    public ClinicalImpression addResolved(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.resolved == null)
        this.resolved = new ArrayList<CodeableConcept>();
      this.resolved.add(t);
      return this;
    }

    /**
     * @return {@link #ruledOut} (Diagnosis considered not possible.)
     */
    public List<ClinicalImpressionRuledOutComponent> getRuledOut() { 
      if (this.ruledOut == null)
        this.ruledOut = new ArrayList<ClinicalImpressionRuledOutComponent>();
      return this.ruledOut;
    }

    public boolean hasRuledOut() { 
      if (this.ruledOut == null)
        return false;
      for (ClinicalImpressionRuledOutComponent item : this.ruledOut)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #ruledOut} (Diagnosis considered not possible.)
     */
    // syntactic sugar
    public ClinicalImpressionRuledOutComponent addRuledOut() { //3
      ClinicalImpressionRuledOutComponent t = new ClinicalImpressionRuledOutComponent();
      if (this.ruledOut == null)
        this.ruledOut = new ArrayList<ClinicalImpressionRuledOutComponent>();
      this.ruledOut.add(t);
      return t;
    }

    // syntactic sugar
    public ClinicalImpression addRuledOut(ClinicalImpressionRuledOutComponent t) { //3
      if (t == null)
        return this;
      if (this.ruledOut == null)
        this.ruledOut = new ArrayList<ClinicalImpressionRuledOutComponent>();
      this.ruledOut.add(t);
      return this;
    }

    /**
     * @return {@link #prognosis} (Estimate of likely outcome.). This is the underlying object with id, value and extensions. The accessor "getPrognosis" gives direct access to the value
     */
    public StringType getPrognosisElement() { 
      if (this.prognosis == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalImpression.prognosis");
        else if (Configuration.doAutoCreate())
          this.prognosis = new StringType(); // bb
      return this.prognosis;
    }

    public boolean hasPrognosisElement() { 
      return this.prognosis != null && !this.prognosis.isEmpty();
    }

    public boolean hasPrognosis() { 
      return this.prognosis != null && !this.prognosis.isEmpty();
    }

    /**
     * @param value {@link #prognosis} (Estimate of likely outcome.). This is the underlying object with id, value and extensions. The accessor "getPrognosis" gives direct access to the value
     */
    public ClinicalImpression setPrognosisElement(StringType value) { 
      this.prognosis = value;
      return this;
    }

    /**
     * @return Estimate of likely outcome.
     */
    public String getPrognosis() { 
      return this.prognosis == null ? null : this.prognosis.getValue();
    }

    /**
     * @param value Estimate of likely outcome.
     */
    public ClinicalImpression setPrognosis(String value) { 
      if (Utilities.noString(value))
        this.prognosis = null;
      else {
        if (this.prognosis == null)
          this.prognosis = new StringType();
        this.prognosis.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #plan} (Plan of action after assessment.)
     */
    public List<Reference> getPlan() { 
      if (this.plan == null)
        this.plan = new ArrayList<Reference>();
      return this.plan;
    }

    public boolean hasPlan() { 
      if (this.plan == null)
        return false;
      for (Reference item : this.plan)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #plan} (Plan of action after assessment.)
     */
    // syntactic sugar
    public Reference addPlan() { //3
      Reference t = new Reference();
      if (this.plan == null)
        this.plan = new ArrayList<Reference>();
      this.plan.add(t);
      return t;
    }

    // syntactic sugar
    public ClinicalImpression addPlan(Reference t) { //3
      if (t == null)
        return this;
      if (this.plan == null)
        this.plan = new ArrayList<Reference>();
      this.plan.add(t);
      return this;
    }

    /**
     * @return {@link #plan} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Plan of action after assessment.)
     */
    public List<Resource> getPlanTarget() { 
      if (this.planTarget == null)
        this.planTarget = new ArrayList<Resource>();
      return this.planTarget;
    }

    /**
     * @return {@link #action} (Actions taken during assessment.)
     */
    public List<Reference> getAction() { 
      if (this.action == null)
        this.action = new ArrayList<Reference>();
      return this.action;
    }

    public boolean hasAction() { 
      if (this.action == null)
        return false;
      for (Reference item : this.action)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #action} (Actions taken during assessment.)
     */
    // syntactic sugar
    public Reference addAction() { //3
      Reference t = new Reference();
      if (this.action == null)
        this.action = new ArrayList<Reference>();
      this.action.add(t);
      return t;
    }

    // syntactic sugar
    public ClinicalImpression addAction(Reference t) { //3
      if (t == null)
        return this;
      if (this.action == null)
        this.action = new ArrayList<Reference>();
      this.action.add(t);
      return this;
    }

    /**
     * @return {@link #action} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Actions taken during assessment.)
     */
    public List<Resource> getActionTarget() { 
      if (this.actionTarget == null)
        this.actionTarget = new ArrayList<Resource>();
      return this.actionTarget;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient being assessed.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("assessor", "Reference(Practitioner)", "The clinician performing the assessment.", 0, java.lang.Integer.MAX_VALUE, assessor));
        childrenList.add(new Property("status", "code", "Identifies the workflow status of the assessment.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("date", "dateTime", "The point in time at which the assessment was concluded (not when it was recorded).", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("description", "string", "A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("previous", "Reference(ClinicalImpression)", "A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.", 0, java.lang.Integer.MAX_VALUE, previous));
        childrenList.add(new Property("problem", "Reference(Condition|AllergyIntolerance)", "This a list of the general problems/conditions for a patient.", 0, java.lang.Integer.MAX_VALUE, problem));
        childrenList.add(new Property("trigger[x]", "CodeableConcept|Reference(Any)", "The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.", 0, java.lang.Integer.MAX_VALUE, trigger));
        childrenList.add(new Property("investigations", "", "One or more sets of investigations (signs, symptions, etc). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.", 0, java.lang.Integer.MAX_VALUE, investigations));
        childrenList.add(new Property("protocol", "uri", "Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.", 0, java.lang.Integer.MAX_VALUE, protocol));
        childrenList.add(new Property("summary", "string", "A text summary of the investigations and the diagnosis.", 0, java.lang.Integer.MAX_VALUE, summary));
        childrenList.add(new Property("finding", "", "Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.", 0, java.lang.Integer.MAX_VALUE, finding));
        childrenList.add(new Property("resolved", "CodeableConcept", "Diagnoses/conditions resolved since the last assessment.", 0, java.lang.Integer.MAX_VALUE, resolved));
        childrenList.add(new Property("ruledOut", "", "Diagnosis considered not possible.", 0, java.lang.Integer.MAX_VALUE, ruledOut));
        childrenList.add(new Property("prognosis", "string", "Estimate of likely outcome.", 0, java.lang.Integer.MAX_VALUE, prognosis));
        childrenList.add(new Property("plan", "Reference(CarePlan|Appointment|CommunicationRequest|DeviceUseRequest|DiagnosticOrder|MedicationPrescription|NutritionOrder|Order|ProcedureRequest|ProcessRequest|ReferralRequest|Supply|VisionPrescription)", "Plan of action after assessment.", 0, java.lang.Integer.MAX_VALUE, plan));
        childrenList.add(new Property("action", "Reference(ReferralRequest|ProcedureRequest|Procedure|MedicationPrescription|DiagnosticOrder|NutritionOrder|Supply|Appointment)", "Actions taken during assessment.", 0, java.lang.Integer.MAX_VALUE, action));
      }

      public ClinicalImpression copy() {
        ClinicalImpression dst = new ClinicalImpression();
        copyValues(dst);
        dst.patient = patient == null ? null : patient.copy();
        dst.assessor = assessor == null ? null : assessor.copy();
        dst.status = status == null ? null : status.copy();
        dst.date = date == null ? null : date.copy();
        dst.description = description == null ? null : description.copy();
        dst.previous = previous == null ? null : previous.copy();
        if (problem != null) {
          dst.problem = new ArrayList<Reference>();
          for (Reference i : problem)
            dst.problem.add(i.copy());
        };
        dst.trigger = trigger == null ? null : trigger.copy();
        if (investigations != null) {
          dst.investigations = new ArrayList<ClinicalImpressionInvestigationsComponent>();
          for (ClinicalImpressionInvestigationsComponent i : investigations)
            dst.investigations.add(i.copy());
        };
        dst.protocol = protocol == null ? null : protocol.copy();
        dst.summary = summary == null ? null : summary.copy();
        if (finding != null) {
          dst.finding = new ArrayList<ClinicalImpressionFindingComponent>();
          for (ClinicalImpressionFindingComponent i : finding)
            dst.finding.add(i.copy());
        };
        if (resolved != null) {
          dst.resolved = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : resolved)
            dst.resolved.add(i.copy());
        };
        if (ruledOut != null) {
          dst.ruledOut = new ArrayList<ClinicalImpressionRuledOutComponent>();
          for (ClinicalImpressionRuledOutComponent i : ruledOut)
            dst.ruledOut.add(i.copy());
        };
        dst.prognosis = prognosis == null ? null : prognosis.copy();
        if (plan != null) {
          dst.plan = new ArrayList<Reference>();
          for (Reference i : plan)
            dst.plan.add(i.copy());
        };
        if (action != null) {
          dst.action = new ArrayList<Reference>();
          for (Reference i : action)
            dst.action.add(i.copy());
        };
        return dst;
      }

      protected ClinicalImpression typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ClinicalImpression))
          return false;
        ClinicalImpression o = (ClinicalImpression) other;
        return compareDeep(patient, o.patient, true) && compareDeep(assessor, o.assessor, true) && compareDeep(status, o.status, true)
           && compareDeep(date, o.date, true) && compareDeep(description, o.description, true) && compareDeep(previous, o.previous, true)
           && compareDeep(problem, o.problem, true) && compareDeep(trigger, o.trigger, true) && compareDeep(investigations, o.investigations, true)
           && compareDeep(protocol, o.protocol, true) && compareDeep(summary, o.summary, true) && compareDeep(finding, o.finding, true)
           && compareDeep(resolved, o.resolved, true) && compareDeep(ruledOut, o.ruledOut, true) && compareDeep(prognosis, o.prognosis, true)
           && compareDeep(plan, o.plan, true) && compareDeep(action, o.action, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ClinicalImpression))
          return false;
        ClinicalImpression o = (ClinicalImpression) other;
        return compareValues(status, o.status, true) && compareValues(date, o.date, true) && compareValues(description, o.description, true)
           && compareValues(protocol, o.protocol, true) && compareValues(summary, o.summary, true) && compareValues(prognosis, o.prognosis, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && (patient == null || patient.isEmpty()) && (assessor == null || assessor.isEmpty())
           && (status == null || status.isEmpty()) && (date == null || date.isEmpty()) && (description == null || description.isEmpty())
           && (previous == null || previous.isEmpty()) && (problem == null || problem.isEmpty()) && (trigger == null || trigger.isEmpty())
           && (investigations == null || investigations.isEmpty()) && (protocol == null || protocol.isEmpty())
           && (summary == null || summary.isEmpty()) && (finding == null || finding.isEmpty()) && (resolved == null || resolved.isEmpty())
           && (ruledOut == null || ruledOut.isEmpty()) && (prognosis == null || prognosis.isEmpty())
           && (plan == null || plan.isEmpty()) && (action == null || action.isEmpty());
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.ClinicalImpression;
   }

  @SearchParamDefinition(name="assessor", path="ClinicalImpression.assessor", description="The clinician performing the assessment", type="reference" )
  public static final String SP_ASSESSOR = "assessor";
  @SearchParamDefinition(name="trigger", path="ClinicalImpression.triggerReference", description="Request or event that necessitated this assessment", type="reference" )
  public static final String SP_TRIGGER = "trigger";
  @SearchParamDefinition(name="patient", path="ClinicalImpression.patient", description="The patient being assessed", type="reference" )
  public static final String SP_PATIENT = "patient";
  @SearchParamDefinition(name="plan", path="ClinicalImpression.plan", description="Plan of action after assessment", type="reference" )
  public static final String SP_PLAN = "plan";
  @SearchParamDefinition(name="resolved", path="ClinicalImpression.resolved", description="Diagnosies/conditions resolved since previous assessment", type="token" )
  public static final String SP_RESOLVED = "resolved";
  @SearchParamDefinition(name="trigger-code", path="ClinicalImpression.triggerCodeableConcept", description="Request or event that necessitated this assessment", type="token" )
  public static final String SP_TRIGGERCODE = "trigger-code";
  @SearchParamDefinition(name="previous", path="ClinicalImpression.previous", description="Reference to last assessment", type="reference" )
  public static final String SP_PREVIOUS = "previous";
  @SearchParamDefinition(name="status", path="ClinicalImpression.status", description="in-progress | completed | entered-in-error", type="token" )
  public static final String SP_STATUS = "status";
  @SearchParamDefinition(name="action", path="ClinicalImpression.action", description="Actions taken during assessment", type="reference" )
  public static final String SP_ACTION = "action";
  @SearchParamDefinition(name="finding", path="ClinicalImpression.finding.item", description="Specific text or code for finding", type="token" )
  public static final String SP_FINDING = "finding";
  @SearchParamDefinition(name="investigation", path="ClinicalImpression.investigations.item", description="Record of a specific investigation", type="reference" )
  public static final String SP_INVESTIGATION = "investigation";
  @SearchParamDefinition(name="problem", path="ClinicalImpression.problem", description="General assessment of patient state", type="reference" )
  public static final String SP_PROBLEM = "problem";
  @SearchParamDefinition(name="date", path="ClinicalImpression.date", description="When the assessment occurred", type="date" )
  public static final String SP_DATE = "date";
  @SearchParamDefinition(name="ruledout", path="ClinicalImpression.ruledOut.item", description="Specific text of code for diagnosis", type="token" )
  public static final String SP_RULEDOUT = "ruledout";

}

