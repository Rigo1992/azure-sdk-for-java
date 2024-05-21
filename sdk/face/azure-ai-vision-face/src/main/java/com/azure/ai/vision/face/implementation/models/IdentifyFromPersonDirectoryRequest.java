// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The IdentifyFromPersonDirectoryRequest model.
 */
@Fluent
public final class IdentifyFromPersonDirectoryRequest {

    /*
     * Array of query faces faceIds, created by the "Detect". Each of the faces are identified independently. The valid
     * number of faceIds is between [1, 10].
     */
    @Generated
    @JsonProperty(value = "faceIds")
    private final List<String> faceIds;

    /*
     * Array of personIds created in Person Directory "Create Person". The valid number of personIds is between [1,30].
     */
    @Generated
    @JsonProperty(value = "personIds")
    private final List<String> personIds;

    /*
     * The range of maxNumOfCandidatesReturned is between 1 and 100. Default value is 10.
     */
    @Generated
    @JsonProperty(value = "maxNumOfCandidatesReturned")
    private Integer maxNumOfCandidatesReturned;

    /*
     * Customized identification confidence threshold, in the range of [0, 1]. Advanced user can tweak this value to
     * override default internal threshold for better precision on their scenario data. Note there is no guarantee of
     * this threshold value working on other data and after algorithm updates.
     */
    @Generated
    @JsonProperty(value = "confidenceThreshold")
    private Double confidenceThreshold;

    /**
     * Creates an instance of IdentifyFromPersonDirectoryRequest class.
     *
     * @param faceIds the faceIds value to set.
     * @param personIds the personIds value to set.
     */
    @Generated
    @JsonCreator
    public IdentifyFromPersonDirectoryRequest(@JsonProperty(value = "faceIds") List<String> faceIds,
        @JsonProperty(value = "personIds") List<String> personIds) {
        this.faceIds = faceIds;
        this.personIds = personIds;
    }

    /**
     * Get the faceIds property: Array of query faces faceIds, created by the "Detect". Each of the faces are identified
     * independently. The valid number of faceIds is between [1, 10].
     *
     * @return the faceIds value.
     */
    @Generated
    public List<String> getFaceIds() {
        return this.faceIds;
    }

    /**
     * Get the personIds property: Array of personIds created in Person Directory "Create Person". The valid number of
     * personIds is between [1,30].
     *
     * @return the personIds value.
     */
    @Generated
    public List<String> getPersonIds() {
        return this.personIds;
    }

    /**
     * Get the maxNumOfCandidatesReturned property: The range of maxNumOfCandidatesReturned is between 1 and 100.
     * Default value is 10.
     *
     * @return the maxNumOfCandidatesReturned value.
     */
    @Generated
    public Integer getMaxNumOfCandidatesReturned() {
        return this.maxNumOfCandidatesReturned;
    }

    /**
     * Set the maxNumOfCandidatesReturned property: The range of maxNumOfCandidatesReturned is between 1 and 100.
     * Default value is 10.
     *
     * @param maxNumOfCandidatesReturned the maxNumOfCandidatesReturned value to set.
     * @return the IdentifyFromPersonDirectoryRequest object itself.
     */
    @Generated
    public IdentifyFromPersonDirectoryRequest setMaxNumOfCandidatesReturned(Integer maxNumOfCandidatesReturned) {
        this.maxNumOfCandidatesReturned = maxNumOfCandidatesReturned;
        return this;
    }

    /**
     * Get the confidenceThreshold property: Customized identification confidence threshold, in the range of [0, 1].
     * Advanced user can tweak this value to override default internal threshold for better precision on their scenario
     * data. Note there is no guarantee of this threshold value working on other data and after algorithm updates.
     *
     * @return the confidenceThreshold value.
     */
    @Generated
    public Double getConfidenceThreshold() {
        return this.confidenceThreshold;
    }

    /**
     * Set the confidenceThreshold property: Customized identification confidence threshold, in the range of [0, 1].
     * Advanced user can tweak this value to override default internal threshold for better precision on their scenario
     * data. Note there is no guarantee of this threshold value working on other data and after algorithm updates.
     *
     * @param confidenceThreshold the confidenceThreshold value to set.
     * @return the IdentifyFromPersonDirectoryRequest object itself.
     */
    @Generated
    public IdentifyFromPersonDirectoryRequest setConfidenceThreshold(Double confidenceThreshold) {
        this.confidenceThreshold = confidenceThreshold;
        return this;
    }
}
