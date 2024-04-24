// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Detailed information about conditions, problems or diagnoses
 * Based on [FHIR Condition](https://www.hl7.org/fhir/R4/condition.html).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "resourceType",
    defaultImpl = FhirR4Condition.class,
    visible = true)
@JsonTypeName("Condition")
@Fluent
public final class FhirR4Condition extends FhirR4DomainResource {

    /*
     * resourceType
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "resourceType")
    private String resourceType = "Condition";

    /*
     * External Ids for this condition
     */
    @Generated
    @JsonProperty(value = "identifier")
    private List<FhirR4Identifier> identifier;

    /*
     * active | recurrence | relapse | inactive | remission | resolved
     */
    @Generated
    @JsonProperty(value = "clinicalStatus")
    private FhirR4CodeableConcept clinicalStatus;

    /*
     * unconfirmed | provisional | differential | confirmed | refuted | entered-in-error
     */
    @Generated
    @JsonProperty(value = "verificationStatus")
    private FhirR4CodeableConcept verificationStatus;

    /*
     * problem-list-item | encounter-diagnosis
     */
    @Generated
    @JsonProperty(value = "category")
    private List<FhirR4CodeableConcept> category;

    /*
     * Subjective severity of condition
     */
    @Generated
    @JsonProperty(value = "severity")
    private FhirR4CodeableConcept severity;

    /*
     * Identification of the condition, problem or diagnosis
     */
    @Generated
    @JsonProperty(value = "code")
    private FhirR4CodeableConcept code;

    /*
     * Anatomical location, if relevant
     */
    @Generated
    @JsonProperty(value = "bodySite")
    private List<FhirR4CodeableConcept> bodySite;

    /*
     * Encounter created as part of
     */
    @Generated
    @JsonProperty(value = "encounter")
    private FhirR4Reference encounter;

    /*
     * Estimated or actual date,  date-time, or age
     */
    @Generated
    @JsonProperty(value = "onsetDateTime")
    private String onsetDateTime;

    /*
     * Estimated or actual date,  date-time, or age
     */
    @Generated
    @JsonProperty(value = "onsetAge")
    private FhirR4Quantity onsetAge;

    /*
     * Estimated or actual date,  date-time, or age
     */
    @Generated
    @JsonProperty(value = "onsetPeriod")
    private FhirR4Period onsetPeriod;

    /*
     * Estimated or actual date,  date-time, or age
     */
    @Generated
    @JsonProperty(value = "onsetRange")
    private FhirR4Range onsetRange;

    /*
     * Estimated or actual date,  date-time, or age
     */
    @Generated
    @JsonProperty(value = "onsetString")
    private String onsetString;

    /*
     * When in resolution/remission
     */
    @Generated
    @JsonProperty(value = "abatementDateTime")
    private String abatementDateTime;

    /*
     * When in resolution/remission
     */
    @Generated
    @JsonProperty(value = "abatementAge")
    private FhirR4Quantity abatementAge;

    /*
     * When in resolution/remission
     */
    @Generated
    @JsonProperty(value = "abatementPeriod")
    private FhirR4Period abatementPeriod;

    /*
     * When in resolution/remission
     */
    @Generated
    @JsonProperty(value = "abatementRange")
    private FhirR4Range abatementRange;

    /*
     * When in resolution/remission
     */
    @Generated
    @JsonProperty(value = "abatementString")
    private String abatementString;

    /*
     * Date record was first recorded
     */
    @Generated
    @JsonProperty(value = "recordedDate")
    private String recordedDate;

    /*
     * stge/grade, usually assessed formally
     */
    @Generated
    @JsonProperty(value = "stage")
    private List<FhirR4ConditionStage> stage;

    /*
     * Additional information about the Condition
     */
    @Generated
    @JsonProperty(value = "note")
    private List<FhirR4Annotation> note;

    /**
     * Creates an instance of FhirR4Condition class.
     *
     * @param resourceType the resourceType value to set.
     */
    @Generated
    @JsonCreator
    public FhirR4Condition(@JsonProperty(value = "resourceType") String resourceType) {
        super(resourceType);
    }

    /**
     * Get the resourceType property: resourceType.
     *
     * @return the resourceType value.
     */
    @Generated
    @Override
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Get the identifier property: External Ids for this condition.
     *
     * @return the identifier value.
     */
    @Generated
    public List<FhirR4Identifier> getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: External Ids for this condition.
     *
     * @param identifier the identifier value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setIdentifier(List<FhirR4Identifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the clinicalStatus property: active | recurrence | relapse | inactive | remission | resolved.
     *
     * @return the clinicalStatus value.
     */
    @Generated
    public FhirR4CodeableConcept getClinicalStatus() {
        return this.clinicalStatus;
    }

    /**
     * Set the clinicalStatus property: active | recurrence | relapse | inactive | remission | resolved.
     *
     * @param clinicalStatus the clinicalStatus value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setClinicalStatus(FhirR4CodeableConcept clinicalStatus) {
        this.clinicalStatus = clinicalStatus;
        return this;
    }

    /**
     * Get the verificationStatus property: unconfirmed | provisional | differential | confirmed | refuted |
     * entered-in-error.
     *
     * @return the verificationStatus value.
     */
    @Generated
    public FhirR4CodeableConcept getVerificationStatus() {
        return this.verificationStatus;
    }

    /**
     * Set the verificationStatus property: unconfirmed | provisional | differential | confirmed | refuted |
     * entered-in-error.
     *
     * @param verificationStatus the verificationStatus value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setVerificationStatus(FhirR4CodeableConcept verificationStatus) {
        this.verificationStatus = verificationStatus;
        return this;
    }

    /**
     * Get the category property: problem-list-item | encounter-diagnosis.
     *
     * @return the category value.
     */
    @Generated
    public List<FhirR4CodeableConcept> getCategory() {
        return this.category;
    }

    /**
     * Set the category property: problem-list-item | encounter-diagnosis.
     *
     * @param category the category value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setCategory(List<FhirR4CodeableConcept> category) {
        this.category = category;
        return this;
    }

    /**
     * Get the severity property: Subjective severity of condition.
     *
     * @return the severity value.
     */
    @Generated
    public FhirR4CodeableConcept getSeverity() {
        return this.severity;
    }

    /**
     * Set the severity property: Subjective severity of condition.
     *
     * @param severity the severity value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setSeverity(FhirR4CodeableConcept severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the code property: Identification of the condition, problem or diagnosis.
     *
     * @return the code value.
     */
    @Generated
    public FhirR4CodeableConcept getCode() {
        return this.code;
    }

    /**
     * Set the code property: Identification of the condition, problem or diagnosis.
     *
     * @param code the code value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setCode(FhirR4CodeableConcept code) {
        this.code = code;
        return this;
    }

    /**
     * Get the bodySite property: Anatomical location, if relevant.
     *
     * @return the bodySite value.
     */
    @Generated
    public List<FhirR4CodeableConcept> getBodySite() {
        return this.bodySite;
    }

    /**
     * Set the bodySite property: Anatomical location, if relevant.
     *
     * @param bodySite the bodySite value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setBodySite(List<FhirR4CodeableConcept> bodySite) {
        this.bodySite = bodySite;
        return this;
    }

    /**
     * Get the encounter property: Encounter created as part of.
     *
     * @return the encounter value.
     */
    @Generated
    public FhirR4Reference getEncounter() {
        return this.encounter;
    }

    /**
     * Set the encounter property: Encounter created as part of.
     *
     * @param encounter the encounter value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setEncounter(FhirR4Reference encounter) {
        this.encounter = encounter;
        return this;
    }

    /**
     * Get the onsetDateTime property: Estimated or actual date, date-time, or age.
     *
     * @return the onsetDateTime value.
     */
    @Generated
    public String getOnsetDateTime() {
        return this.onsetDateTime;
    }

    /**
     * Set the onsetDateTime property: Estimated or actual date, date-time, or age.
     *
     * @param onsetDateTime the onsetDateTime value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setOnsetDateTime(String onsetDateTime) {
        this.onsetDateTime = onsetDateTime;
        return this;
    }

    /**
     * Get the onsetAge property: Estimated or actual date, date-time, or age.
     *
     * @return the onsetAge value.
     */
    @Generated
    public FhirR4Quantity getOnsetAge() {
        return this.onsetAge;
    }

    /**
     * Set the onsetAge property: Estimated or actual date, date-time, or age.
     *
     * @param onsetAge the onsetAge value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setOnsetAge(FhirR4Quantity onsetAge) {
        this.onsetAge = onsetAge;
        return this;
    }

    /**
     * Get the onsetPeriod property: Estimated or actual date, date-time, or age.
     *
     * @return the onsetPeriod value.
     */
    @Generated
    public FhirR4Period getOnsetPeriod() {
        return this.onsetPeriod;
    }

    /**
     * Set the onsetPeriod property: Estimated or actual date, date-time, or age.
     *
     * @param onsetPeriod the onsetPeriod value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setOnsetPeriod(FhirR4Period onsetPeriod) {
        this.onsetPeriod = onsetPeriod;
        return this;
    }

    /**
     * Get the onsetRange property: Estimated or actual date, date-time, or age.
     *
     * @return the onsetRange value.
     */
    @Generated
    public FhirR4Range getOnsetRange() {
        return this.onsetRange;
    }

    /**
     * Set the onsetRange property: Estimated or actual date, date-time, or age.
     *
     * @param onsetRange the onsetRange value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setOnsetRange(FhirR4Range onsetRange) {
        this.onsetRange = onsetRange;
        return this;
    }

    /**
     * Get the onsetString property: Estimated or actual date, date-time, or age.
     *
     * @return the onsetString value.
     */
    @Generated
    public String getOnsetString() {
        return this.onsetString;
    }

    /**
     * Set the onsetString property: Estimated or actual date, date-time, or age.
     *
     * @param onsetString the onsetString value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setOnsetString(String onsetString) {
        this.onsetString = onsetString;
        return this;
    }

    /**
     * Get the abatementDateTime property: When in resolution/remission.
     *
     * @return the abatementDateTime value.
     */
    @Generated
    public String getAbatementDateTime() {
        return this.abatementDateTime;
    }

    /**
     * Set the abatementDateTime property: When in resolution/remission.
     *
     * @param abatementDateTime the abatementDateTime value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setAbatementDateTime(String abatementDateTime) {
        this.abatementDateTime = abatementDateTime;
        return this;
    }

    /**
     * Get the abatementAge property: When in resolution/remission.
     *
     * @return the abatementAge value.
     */
    @Generated
    public FhirR4Quantity getAbatementAge() {
        return this.abatementAge;
    }

    /**
     * Set the abatementAge property: When in resolution/remission.
     *
     * @param abatementAge the abatementAge value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setAbatementAge(FhirR4Quantity abatementAge) {
        this.abatementAge = abatementAge;
        return this;
    }

    /**
     * Get the abatementPeriod property: When in resolution/remission.
     *
     * @return the abatementPeriod value.
     */
    @Generated
    public FhirR4Period getAbatementPeriod() {
        return this.abatementPeriod;
    }

    /**
     * Set the abatementPeriod property: When in resolution/remission.
     *
     * @param abatementPeriod the abatementPeriod value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setAbatementPeriod(FhirR4Period abatementPeriod) {
        this.abatementPeriod = abatementPeriod;
        return this;
    }

    /**
     * Get the abatementRange property: When in resolution/remission.
     *
     * @return the abatementRange value.
     */
    @Generated
    public FhirR4Range getAbatementRange() {
        return this.abatementRange;
    }

    /**
     * Set the abatementRange property: When in resolution/remission.
     *
     * @param abatementRange the abatementRange value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setAbatementRange(FhirR4Range abatementRange) {
        this.abatementRange = abatementRange;
        return this;
    }

    /**
     * Get the abatementString property: When in resolution/remission.
     *
     * @return the abatementString value.
     */
    @Generated
    public String getAbatementString() {
        return this.abatementString;
    }

    /**
     * Set the abatementString property: When in resolution/remission.
     *
     * @param abatementString the abatementString value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setAbatementString(String abatementString) {
        this.abatementString = abatementString;
        return this;
    }

    /**
     * Get the recordedDate property: Date record was first recorded.
     *
     * @return the recordedDate value.
     */
    @Generated
    public String getRecordedDate() {
        return this.recordedDate;
    }

    /**
     * Set the recordedDate property: Date record was first recorded.
     *
     * @param recordedDate the recordedDate value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setRecordedDate(String recordedDate) {
        this.recordedDate = recordedDate;
        return this;
    }

    /**
     * Get the stage property: stge/grade, usually assessed formally.
     *
     * @return the stage value.
     */
    @Generated
    public List<FhirR4ConditionStage> getStage() {
        return this.stage;
    }

    /**
     * Set the stage property: stge/grade, usually assessed formally.
     *
     * @param stage the stage value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setStage(List<FhirR4ConditionStage> stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Get the note property: Additional information about the Condition.
     *
     * @return the note value.
     */
    @Generated
    public List<FhirR4Annotation> getNote() {
        return this.note;
    }

    /**
     * Set the note property: Additional information about the Condition.
     *
     * @param note the note value to set.
     * @return the FhirR4Condition object itself.
     */
    @Generated
    public FhirR4Condition setNote(List<FhirR4Annotation> note) {
        this.note = note;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Condition setText(FhirR4Narrative text) {
        super.setText(text);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Condition setContained(List<FhirR4Resource> contained) {
        super.setContained(contained);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Condition setExtension(List<FhirR4Extension> extension) {
        super.setExtension(extension);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Condition setModifierExtension(List<FhirR4Extension> modifierExtension) {
        super.setModifierExtension(modifierExtension);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Condition setId(String id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Condition setMeta(FhirR4Meta meta) {
        super.setMeta(meta);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Condition setImplicitRules(String implicitRules) {
        super.setImplicitRules(implicitRules);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public FhirR4Condition setLanguage(String language) {
        super.setLanguage(language);
        return this;
    }
}
