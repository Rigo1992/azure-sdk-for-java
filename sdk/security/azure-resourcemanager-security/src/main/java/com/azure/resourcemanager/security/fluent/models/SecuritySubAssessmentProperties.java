// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.AdditionalData;
import com.azure.resourcemanager.security.models.ResourceDetails;
import com.azure.resourcemanager.security.models.SubAssessmentStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Describes properties of an sub-assessment. */
@Fluent
public final class SecuritySubAssessmentProperties {
    /*
     * Vulnerability ID
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * User friendly display name of the sub-assessment
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Status of the sub-assessment
     */
    @JsonProperty(value = "status")
    private SubAssessmentStatus status;

    /*
     * Information on how to remediate this sub-assessment
     */
    @JsonProperty(value = "remediation", access = JsonProperty.Access.WRITE_ONLY)
    private String remediation;

    /*
     * Description of the impact of this sub-assessment
     */
    @JsonProperty(value = "impact", access = JsonProperty.Access.WRITE_ONLY)
    private String impact;

    /*
     * Category of the sub-assessment
     */
    @JsonProperty(value = "category", access = JsonProperty.Access.WRITE_ONLY)
    private String category;

    /*
     * Human readable description of the assessment status
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The date and time the sub-assessment was generated
     */
    @JsonProperty(value = "timeGenerated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeGenerated;

    /*
     * Details of the resource that was assessed
     */
    @JsonProperty(value = "resourceDetails")
    private ResourceDetails resourceDetails;

    /*
     * Details of the sub-assessment
     */
    @JsonProperty(value = "additionalData")
    private AdditionalData additionalData;

    /** Creates an instance of SecuritySubAssessmentProperties class. */
    public SecuritySubAssessmentProperties() {
    }

    /**
     * Get the id property: Vulnerability ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the displayName property: User friendly display name of the sub-assessment.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the status property: Status of the sub-assessment.
     *
     * @return the status value.
     */
    public SubAssessmentStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the sub-assessment.
     *
     * @param status the status value to set.
     * @return the SecuritySubAssessmentProperties object itself.
     */
    public SecuritySubAssessmentProperties withStatus(SubAssessmentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the remediation property: Information on how to remediate this sub-assessment.
     *
     * @return the remediation value.
     */
    public String remediation() {
        return this.remediation;
    }

    /**
     * Get the impact property: Description of the impact of this sub-assessment.
     *
     * @return the impact value.
     */
    public String impact() {
        return this.impact;
    }

    /**
     * Get the category property: Category of the sub-assessment.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Get the description property: Human readable description of the assessment status.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the timeGenerated property: The date and time the sub-assessment was generated.
     *
     * @return the timeGenerated value.
     */
    public OffsetDateTime timeGenerated() {
        return this.timeGenerated;
    }

    /**
     * Get the resourceDetails property: Details of the resource that was assessed.
     *
     * @return the resourceDetails value.
     */
    public ResourceDetails resourceDetails() {
        return this.resourceDetails;
    }

    /**
     * Set the resourceDetails property: Details of the resource that was assessed.
     *
     * @param resourceDetails the resourceDetails value to set.
     * @return the SecuritySubAssessmentProperties object itself.
     */
    public SecuritySubAssessmentProperties withResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    /**
     * Get the additionalData property: Details of the sub-assessment.
     *
     * @return the additionalData value.
     */
    public AdditionalData additionalData() {
        return this.additionalData;
    }

    /**
     * Set the additionalData property: Details of the sub-assessment.
     *
     * @param additionalData the additionalData value to set.
     * @return the SecuritySubAssessmentProperties object itself.
     */
    public SecuritySubAssessmentProperties withAdditionalData(AdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
        if (resourceDetails() != null) {
            resourceDetails().validate();
        }
        if (additionalData() != null) {
            additionalData().validate();
        }
    }
}
