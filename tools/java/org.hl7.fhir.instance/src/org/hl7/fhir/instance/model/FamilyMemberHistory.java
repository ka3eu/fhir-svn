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
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 */
@ResourceDef(name="FamilyMemberHistory", profile="http://hl7.org/fhir/Profile/FamilyMemberHistory")
public class FamilyMemberHistory extends DomainResource {

    @Block()
    public static class FamilyMemberHistoryConditionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1)
        @Description(shortDefinition="Condition suffered by relation", formalDefinition="The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system." )
        protected CodeableConcept type;

        /**
         * Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.
         */
        @Child(name = "outcome", type = {CodeableConcept.class}, order=2, min=0, max=1)
        @Description(shortDefinition="deceased | permanent disability | etc.", formalDefinition="Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation." )
        protected CodeableConcept outcome;

        /**
         * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
         */
        @Child(name = "onset", type = {Age.class, Range.class, StringType.class}, order=3, min=0, max=1)
        @Description(shortDefinition="When condition first manifested", formalDefinition="Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence." )
        protected Type onset;

        /**
         * An area where general notes can be placed about this specific condition.
         */
        @Child(name = "note", type = {StringType.class}, order=4, min=0, max=1)
        @Description(shortDefinition="Extra information about condition", formalDefinition="An area where general notes can be placed about this specific condition." )
        protected StringType note;

        private static final long serialVersionUID = -1664709272L;

    /*
     * Constructor
     */
      public FamilyMemberHistoryConditionComponent() {
        super();
      }

    /*
     * Constructor
     */
      public FamilyMemberHistoryConditionComponent(CodeableConcept type) {
        super();
        this.type = type;
      }

        /**
         * @return {@link #type} (The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create FamilyMemberHistoryConditionComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.)
         */
        public FamilyMemberHistoryConditionComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #outcome} (Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.)
         */
        public CodeableConcept getOutcome() { 
          if (this.outcome == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create FamilyMemberHistoryConditionComponent.outcome");
            else if (Configuration.doAutoCreate())
              this.outcome = new CodeableConcept(); // cc
          return this.outcome;
        }

        public boolean hasOutcome() { 
          return this.outcome != null && !this.outcome.isEmpty();
        }

        /**
         * @param value {@link #outcome} (Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.)
         */
        public FamilyMemberHistoryConditionComponent setOutcome(CodeableConcept value) { 
          this.outcome = value;
          return this;
        }

        /**
         * @return {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
         */
        public Type getOnset() { 
          return this.onset;
        }

        /**
         * @return {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
         */
        public Age getOnsetAge() throws Exception { 
          if (!(this.onset instanceof Age))
            throw new Exception("Type mismatch: the type Age was expected, but "+this.onset.getClass().getName()+" was encountered");
          return (Age) this.onset;
        }

        public boolean hasOnsetAge() throws Exception { 
          return this.onset instanceof Age;
        }

        /**
         * @return {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
         */
        public Range getOnsetRange() throws Exception { 
          if (!(this.onset instanceof Range))
            throw new Exception("Type mismatch: the type Range was expected, but "+this.onset.getClass().getName()+" was encountered");
          return (Range) this.onset;
        }

        public boolean hasOnsetRange() throws Exception { 
          return this.onset instanceof Range;
        }

        /**
         * @return {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
         */
        public StringType getOnsetStringType() throws Exception { 
          if (!(this.onset instanceof StringType))
            throw new Exception("Type mismatch: the type StringType was expected, but "+this.onset.getClass().getName()+" was encountered");
          return (StringType) this.onset;
        }

        public boolean hasOnsetStringType() throws Exception { 
          return this.onset instanceof StringType;
        }

        public boolean hasOnset() { 
          return this.onset != null && !this.onset.isEmpty();
        }

        /**
         * @param value {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
         */
        public FamilyMemberHistoryConditionComponent setOnset(Type value) { 
          this.onset = value;
          return this;
        }

        /**
         * @return {@link #note} (An area where general notes can be placed about this specific condition.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
         */
        public StringType getNoteElement() { 
          if (this.note == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create FamilyMemberHistoryConditionComponent.note");
            else if (Configuration.doAutoCreate())
              this.note = new StringType(); // bb
          return this.note;
        }

        public boolean hasNoteElement() { 
          return this.note != null && !this.note.isEmpty();
        }

        public boolean hasNote() { 
          return this.note != null && !this.note.isEmpty();
        }

        /**
         * @param value {@link #note} (An area where general notes can be placed about this specific condition.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
         */
        public FamilyMemberHistoryConditionComponent setNoteElement(StringType value) { 
          this.note = value;
          return this;
        }

        /**
         * @return An area where general notes can be placed about this specific condition.
         */
        public String getNote() { 
          return this.note == null ? null : this.note.getValue();
        }

        /**
         * @param value An area where general notes can be placed about this specific condition.
         */
        public FamilyMemberHistoryConditionComponent setNote(String value) { 
          if (Utilities.noString(value))
            this.note = null;
          else {
            if (this.note == null)
              this.note = new StringType();
            this.note.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("type", "CodeableConcept", "The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("outcome", "CodeableConcept", "Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.", 0, java.lang.Integer.MAX_VALUE, outcome));
          childrenList.add(new Property("onset[x]", "Age|Range|string", "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.", 0, java.lang.Integer.MAX_VALUE, onset));
          childrenList.add(new Property("note", "string", "An area where general notes can be placed about this specific condition.", 0, java.lang.Integer.MAX_VALUE, note));
        }

      public FamilyMemberHistoryConditionComponent copy() {
        FamilyMemberHistoryConditionComponent dst = new FamilyMemberHistoryConditionComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.onset = onset == null ? null : onset.copy();
        dst.note = note == null ? null : note.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof FamilyMemberHistoryConditionComponent))
          return false;
        FamilyMemberHistoryConditionComponent o = (FamilyMemberHistoryConditionComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(outcome, o.outcome, true) && compareDeep(onset, o.onset, true)
           && compareDeep(note, o.note, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof FamilyMemberHistoryConditionComponent))
          return false;
        FamilyMemberHistoryConditionComponent o = (FamilyMemberHistoryConditionComponent) other;
        return compareValues(note, o.note, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (outcome == null || outcome.isEmpty())
           && (onset == null || onset.isEmpty()) && (note == null || note.isEmpty());
      }

  }

    /**
     * This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="External Id(s) for this record", formalDefinition="This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)." )
    protected List<Identifier> identifier;

    /**
     * The person who this history concerns.
     */
    @Child(name = "patient", type = {Patient.class}, order=1, min=1, max=1)
    @Description(shortDefinition="Patient history is about", formalDefinition="The person who this history concerns." )
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The person who this history concerns.)
     */
    protected Patient patientTarget;

    /**
     * The date (and possibly time) when the family member history was taken.
     */
    @Child(name = "date", type = {DateTimeType.class}, order=2, min=0, max=1)
    @Description(shortDefinition="When history was captured/updated", formalDefinition="The date (and possibly time) when the family member history was taken." )
    protected DateTimeType date;

    /**
     * This will either be a name or a description.  E.g. "Aunt Susan", "my cousin with the red hair".
     */
    @Child(name = "name", type = {StringType.class}, order=3, min=0, max=1)
    @Description(shortDefinition="The family member described", formalDefinition="This will either be a name or a description.  E.g. 'Aunt Susan', 'my cousin with the red hair'." )
    protected StringType name;

    /**
     * The type of relationship this person has to the patient (father, mother, brother etc.).
     */
    @Child(name = "relationship", type = {CodeableConcept.class}, order=4, min=1, max=1)
    @Description(shortDefinition="Relationship to the subject", formalDefinition="The type of relationship this person has to the patient (father, mother, brother etc.)." )
    protected CodeableConcept relationship;

    /**
     * Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
     */
    @Child(name = "gender", type = {CodeType.class}, order=5, min=0, max=1)
    @Description(shortDefinition="male | female | other | unknown", formalDefinition="Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes." )
    protected Enumeration<AdministrativeGender> gender;

    /**
     * The actual or approximate date of birth of the relative.
     */
    @Child(name = "born", type = {Period.class, DateType.class, StringType.class}, order=6, min=0, max=1)
    @Description(shortDefinition="(approximate) date of birth", formalDefinition="The actual or approximate date of birth of the relative." )
    protected Type born;

    /**
     * The actual or approximate age of the relative at the time the family member history is recorded.
     */
    @Child(name = "age", type = {Age.class, Range.class, StringType.class}, order=7, min=0, max=1)
    @Description(shortDefinition="(approximate) age", formalDefinition="The actual or approximate age of the relative at the time the family member history is recorded." )
    protected Type age;

    /**
     * The actual or approximate age of the relative at the time the family member history is recorded.
     */
    @Child(name = "deceased", type = {BooleanType.class, Age.class, Range.class, DateType.class, StringType.class}, order=8, min=0, max=1)
    @Description(shortDefinition="Dead? How old/when?", formalDefinition="The actual or approximate age of the relative at the time the family member history is recorded." )
    protected Type deceased;

    /**
     * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
     */
    @Child(name = "note", type = {StringType.class}, order=9, min=0, max=1)
    @Description(shortDefinition="General note about related person", formalDefinition="This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible." )
    protected StringType note;

    /**
     * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
     */
    @Child(name = "condition", type = {}, order=10, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Condition that the related person had", formalDefinition="The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition." )
    protected List<FamilyMemberHistoryConditionComponent> condition;

    private static final long serialVersionUID = 1785160836L;

  /*
   * Constructor
   */
    public FamilyMemberHistory() {
      super();
    }

  /*
   * Constructor
   */
    public FamilyMemberHistory(Reference patient, CodeableConcept relationship) {
      super();
      this.patient = patient;
      this.relationship = relationship;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
     */
    // syntactic sugar
    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    // syntactic sugar
    public FamilyMemberHistory addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return {@link #patient} (The person who this history concerns.)
     */
    public Reference getPatient() { 
      if (this.patient == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create FamilyMemberHistory.patient");
        else if (Configuration.doAutoCreate())
          this.patient = new Reference(); // cc
      return this.patient;
    }

    public boolean hasPatient() { 
      return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The person who this history concerns.)
     */
    public FamilyMemberHistory setPatient(Reference value) { 
      this.patient = value;
      return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person who this history concerns.)
     */
    public Patient getPatientTarget() { 
      if (this.patientTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create FamilyMemberHistory.patient");
        else if (Configuration.doAutoCreate())
          this.patientTarget = new Patient(); // aa
      return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person who this history concerns.)
     */
    public FamilyMemberHistory setPatientTarget(Patient value) { 
      this.patientTarget = value;
      return this;
    }

    /**
     * @return {@link #date} (The date (and possibly time) when the family member history was taken.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create FamilyMemberHistory.date");
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
     * @param value {@link #date} (The date (and possibly time) when the family member history was taken.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public FamilyMemberHistory setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date (and possibly time) when the family member history was taken.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date (and possibly time) when the family member history was taken.
     */
    public FamilyMemberHistory setDate(Date value) { 
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
     * @return {@link #name} (This will either be a name or a description.  E.g. "Aunt Susan", "my cousin with the red hair".). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() { 
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create FamilyMemberHistory.name");
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
     * @param value {@link #name} (This will either be a name or a description.  E.g. "Aunt Susan", "my cousin with the red hair".). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public FamilyMemberHistory setNameElement(StringType value) { 
      this.name = value;
      return this;
    }

    /**
     * @return This will either be a name or a description.  E.g. "Aunt Susan", "my cousin with the red hair".
     */
    public String getName() { 
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value This will either be a name or a description.  E.g. "Aunt Susan", "my cousin with the red hair".
     */
    public FamilyMemberHistory setName(String value) { 
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
     * @return {@link #relationship} (The type of relationship this person has to the patient (father, mother, brother etc.).)
     */
    public CodeableConcept getRelationship() { 
      if (this.relationship == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create FamilyMemberHistory.relationship");
        else if (Configuration.doAutoCreate())
          this.relationship = new CodeableConcept(); // cc
      return this.relationship;
    }

    public boolean hasRelationship() { 
      return this.relationship != null && !this.relationship.isEmpty();
    }

    /**
     * @param value {@link #relationship} (The type of relationship this person has to the patient (father, mother, brother etc.).)
     */
    public FamilyMemberHistory setRelationship(CodeableConcept value) { 
      this.relationship = value;
      return this;
    }

    /**
     * @return {@link #gender} (Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Enumeration<AdministrativeGender> getGenderElement() { 
      if (this.gender == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create FamilyMemberHistory.gender");
        else if (Configuration.doAutoCreate())
          this.gender = new Enumeration<AdministrativeGender>(new AdministrativeGenderEnumFactory()); // bb
      return this.gender;
    }

    public boolean hasGenderElement() { 
      return this.gender != null && !this.gender.isEmpty();
    }

    public boolean hasGender() { 
      return this.gender != null && !this.gender.isEmpty();
    }

    /**
     * @param value {@link #gender} (Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public FamilyMemberHistory setGenderElement(Enumeration<AdministrativeGender> value) { 
      this.gender = value;
      return this;
    }

    /**
     * @return Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
     */
    public AdministrativeGender getGender() { 
      return this.gender == null ? null : this.gender.getValue();
    }

    /**
     * @param value Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
     */
    public FamilyMemberHistory setGender(AdministrativeGender value) { 
      if (value == null)
        this.gender = null;
      else {
        if (this.gender == null)
          this.gender = new Enumeration<AdministrativeGender>(new AdministrativeGenderEnumFactory());
        this.gender.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #born} (The actual or approximate date of birth of the relative.)
     */
    public Type getBorn() { 
      return this.born;
    }

    /**
     * @return {@link #born} (The actual or approximate date of birth of the relative.)
     */
    public Period getBornPeriod() throws Exception { 
      if (!(this.born instanceof Period))
        throw new Exception("Type mismatch: the type Period was expected, but "+this.born.getClass().getName()+" was encountered");
      return (Period) this.born;
    }

    public boolean hasBornPeriod() throws Exception { 
      return this.born instanceof Period;
    }

    /**
     * @return {@link #born} (The actual or approximate date of birth of the relative.)
     */
    public DateType getBornDateType() throws Exception { 
      if (!(this.born instanceof DateType))
        throw new Exception("Type mismatch: the type DateType was expected, but "+this.born.getClass().getName()+" was encountered");
      return (DateType) this.born;
    }

    public boolean hasBornDateType() throws Exception { 
      return this.born instanceof DateType;
    }

    /**
     * @return {@link #born} (The actual or approximate date of birth of the relative.)
     */
    public StringType getBornStringType() throws Exception { 
      if (!(this.born instanceof StringType))
        throw new Exception("Type mismatch: the type StringType was expected, but "+this.born.getClass().getName()+" was encountered");
      return (StringType) this.born;
    }

    public boolean hasBornStringType() throws Exception { 
      return this.born instanceof StringType;
    }

    public boolean hasBorn() { 
      return this.born != null && !this.born.isEmpty();
    }

    /**
     * @param value {@link #born} (The actual or approximate date of birth of the relative.)
     */
    public FamilyMemberHistory setBorn(Type value) { 
      this.born = value;
      return this;
    }

    /**
     * @return {@link #age} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public Type getAge() { 
      return this.age;
    }

    /**
     * @return {@link #age} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public Age getAgeAge() throws Exception { 
      if (!(this.age instanceof Age))
        throw new Exception("Type mismatch: the type Age was expected, but "+this.age.getClass().getName()+" was encountered");
      return (Age) this.age;
    }

    public boolean hasAgeAge() throws Exception { 
      return this.age instanceof Age;
    }

    /**
     * @return {@link #age} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public Range getAgeRange() throws Exception { 
      if (!(this.age instanceof Range))
        throw new Exception("Type mismatch: the type Range was expected, but "+this.age.getClass().getName()+" was encountered");
      return (Range) this.age;
    }

    public boolean hasAgeRange() throws Exception { 
      return this.age instanceof Range;
    }

    /**
     * @return {@link #age} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public StringType getAgeStringType() throws Exception { 
      if (!(this.age instanceof StringType))
        throw new Exception("Type mismatch: the type StringType was expected, but "+this.age.getClass().getName()+" was encountered");
      return (StringType) this.age;
    }

    public boolean hasAgeStringType() throws Exception { 
      return this.age instanceof StringType;
    }

    public boolean hasAge() { 
      return this.age != null && !this.age.isEmpty();
    }

    /**
     * @param value {@link #age} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public FamilyMemberHistory setAge(Type value) { 
      this.age = value;
      return this;
    }

    /**
     * @return {@link #deceased} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public Type getDeceased() { 
      return this.deceased;
    }

    /**
     * @return {@link #deceased} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public BooleanType getDeceasedBooleanType() throws Exception { 
      if (!(this.deceased instanceof BooleanType))
        throw new Exception("Type mismatch: the type BooleanType was expected, but "+this.deceased.getClass().getName()+" was encountered");
      return (BooleanType) this.deceased;
    }

    public boolean hasDeceasedBooleanType() throws Exception { 
      return this.deceased instanceof BooleanType;
    }

    /**
     * @return {@link #deceased} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public Age getDeceasedAge() throws Exception { 
      if (!(this.deceased instanceof Age))
        throw new Exception("Type mismatch: the type Age was expected, but "+this.deceased.getClass().getName()+" was encountered");
      return (Age) this.deceased;
    }

    public boolean hasDeceasedAge() throws Exception { 
      return this.deceased instanceof Age;
    }

    /**
     * @return {@link #deceased} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public Range getDeceasedRange() throws Exception { 
      if (!(this.deceased instanceof Range))
        throw new Exception("Type mismatch: the type Range was expected, but "+this.deceased.getClass().getName()+" was encountered");
      return (Range) this.deceased;
    }

    public boolean hasDeceasedRange() throws Exception { 
      return this.deceased instanceof Range;
    }

    /**
     * @return {@link #deceased} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public DateType getDeceasedDateType() throws Exception { 
      if (!(this.deceased instanceof DateType))
        throw new Exception("Type mismatch: the type DateType was expected, but "+this.deceased.getClass().getName()+" was encountered");
      return (DateType) this.deceased;
    }

    public boolean hasDeceasedDateType() throws Exception { 
      return this.deceased instanceof DateType;
    }

    /**
     * @return {@link #deceased} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public StringType getDeceasedStringType() throws Exception { 
      if (!(this.deceased instanceof StringType))
        throw new Exception("Type mismatch: the type StringType was expected, but "+this.deceased.getClass().getName()+" was encountered");
      return (StringType) this.deceased;
    }

    public boolean hasDeceasedStringType() throws Exception { 
      return this.deceased instanceof StringType;
    }

    public boolean hasDeceased() { 
      return this.deceased != null && !this.deceased.isEmpty();
    }

    /**
     * @param value {@link #deceased} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public FamilyMemberHistory setDeceased(Type value) { 
      this.deceased = value;
      return this;
    }

    /**
     * @return {@link #note} (This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public StringType getNoteElement() { 
      if (this.note == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create FamilyMemberHistory.note");
        else if (Configuration.doAutoCreate())
          this.note = new StringType(); // bb
      return this.note;
    }

    public boolean hasNoteElement() { 
      return this.note != null && !this.note.isEmpty();
    }

    public boolean hasNote() { 
      return this.note != null && !this.note.isEmpty();
    }

    /**
     * @param value {@link #note} (This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public FamilyMemberHistory setNoteElement(StringType value) { 
      this.note = value;
      return this;
    }

    /**
     * @return This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
     */
    public String getNote() { 
      return this.note == null ? null : this.note.getValue();
    }

    /**
     * @param value This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
     */
    public FamilyMemberHistory setNote(String value) { 
      if (Utilities.noString(value))
        this.note = null;
      else {
        if (this.note == null)
          this.note = new StringType();
        this.note.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #condition} (The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.)
     */
    public List<FamilyMemberHistoryConditionComponent> getCondition() { 
      if (this.condition == null)
        this.condition = new ArrayList<FamilyMemberHistoryConditionComponent>();
      return this.condition;
    }

    public boolean hasCondition() { 
      if (this.condition == null)
        return false;
      for (FamilyMemberHistoryConditionComponent item : this.condition)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #condition} (The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.)
     */
    // syntactic sugar
    public FamilyMemberHistoryConditionComponent addCondition() { //3
      FamilyMemberHistoryConditionComponent t = new FamilyMemberHistoryConditionComponent();
      if (this.condition == null)
        this.condition = new ArrayList<FamilyMemberHistoryConditionComponent>();
      this.condition.add(t);
      return t;
    }

    // syntactic sugar
    public FamilyMemberHistory addCondition(FamilyMemberHistoryConditionComponent t) { //3
      if (t == null)
        return this;
      if (this.condition == null)
        this.condition = new ArrayList<FamilyMemberHistoryConditionComponent>();
      this.condition.add(t);
      return this;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("patient", "Reference(Patient)", "The person who this history concerns.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("date", "dateTime", "The date (and possibly time) when the family member history was taken.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("name", "string", "This will either be a name or a description.  E.g. 'Aunt Susan', 'my cousin with the red hair'.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("relationship", "CodeableConcept", "The type of relationship this person has to the patient (father, mother, brother etc.).", 0, java.lang.Integer.MAX_VALUE, relationship));
        childrenList.add(new Property("gender", "code", "Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.", 0, java.lang.Integer.MAX_VALUE, gender));
        childrenList.add(new Property("born[x]", "Period|date|string", "The actual or approximate date of birth of the relative.", 0, java.lang.Integer.MAX_VALUE, born));
        childrenList.add(new Property("age[x]", "Age|Range|string", "The actual or approximate age of the relative at the time the family member history is recorded.", 0, java.lang.Integer.MAX_VALUE, age));
        childrenList.add(new Property("deceased[x]", "boolean|Age|Range|date|string", "The actual or approximate age of the relative at the time the family member history is recorded.", 0, java.lang.Integer.MAX_VALUE, deceased));
        childrenList.add(new Property("note", "string", "This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("condition", "", "The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.", 0, java.lang.Integer.MAX_VALUE, condition));
      }

      public FamilyMemberHistory copy() {
        FamilyMemberHistory dst = new FamilyMemberHistory();
        copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.patient = patient == null ? null : patient.copy();
        dst.date = date == null ? null : date.copy();
        dst.name = name == null ? null : name.copy();
        dst.relationship = relationship == null ? null : relationship.copy();
        dst.gender = gender == null ? null : gender.copy();
        dst.born = born == null ? null : born.copy();
        dst.age = age == null ? null : age.copy();
        dst.deceased = deceased == null ? null : deceased.copy();
        dst.note = note == null ? null : note.copy();
        if (condition != null) {
          dst.condition = new ArrayList<FamilyMemberHistoryConditionComponent>();
          for (FamilyMemberHistoryConditionComponent i : condition)
            dst.condition.add(i.copy());
        };
        return dst;
      }

      protected FamilyMemberHistory typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof FamilyMemberHistory))
          return false;
        FamilyMemberHistory o = (FamilyMemberHistory) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(patient, o.patient, true) && compareDeep(date, o.date, true)
           && compareDeep(name, o.name, true) && compareDeep(relationship, o.relationship, true) && compareDeep(gender, o.gender, true)
           && compareDeep(born, o.born, true) && compareDeep(age, o.age, true) && compareDeep(deceased, o.deceased, true)
           && compareDeep(note, o.note, true) && compareDeep(condition, o.condition, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof FamilyMemberHistory))
          return false;
        FamilyMemberHistory o = (FamilyMemberHistory) other;
        return compareValues(date, o.date, true) && compareValues(name, o.name, true) && compareValues(gender, o.gender, true)
           && compareValues(note, o.note, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (patient == null || patient.isEmpty())
           && (date == null || date.isEmpty()) && (name == null || name.isEmpty()) && (relationship == null || relationship.isEmpty())
           && (gender == null || gender.isEmpty()) && (born == null || born.isEmpty()) && (age == null || age.isEmpty())
           && (deceased == null || deceased.isEmpty()) && (note == null || note.isEmpty()) && (condition == null || condition.isEmpty())
          ;
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.FamilyMemberHistory;
   }

  @SearchParamDefinition(name="patient", path="FamilyMemberHistory.patient", description="The identity of a subject to list family member history items for", type="reference" )
  public static final String SP_PATIENT = "patient";
  @SearchParamDefinition(name="date", path="FamilyMemberHistory.date", description="When history was captured/updated", type="date" )
  public static final String SP_DATE = "date";

}

