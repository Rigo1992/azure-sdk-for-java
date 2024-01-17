// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Definition of Detector.
 */
@Immutable
public final class DetectorInfo {
    /*
     * Id of detector
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of detector
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Short description of the detector and its purpose.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Author of the detector.
     */
    @JsonProperty(value = "author", access = JsonProperty.Access.WRITE_ONLY)
    private String author;

    /*
     * Problem category. This serves for organizing group for detectors.
     */
    @JsonProperty(value = "category", access = JsonProperty.Access.WRITE_ONLY)
    private String category;

    /*
     * List of Support Topics for which this detector is enabled.
     */
    @JsonProperty(value = "supportTopicList", access = JsonProperty.Access.WRITE_ONLY)
    private List<SupportTopic> supportTopicList;

    /*
     * Analysis Types for which this detector should apply to.
     */
    @JsonProperty(value = "analysisType", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> analysisType;

    /*
     * Whether this detector is an Analysis Detector or not.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private DetectorType type;

    /*
     * Defines score of a detector to power ML based matching.
     */
    @JsonProperty(value = "score", access = JsonProperty.Access.WRITE_ONLY)
    private Float score;

    /**
     * Creates an instance of DetectorInfo class.
     */
    public DetectorInfo() {
    }

    /**
     * Get the id property: Id of detector.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Name of detector.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the description property: Short description of the detector and its purpose.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the author property: Author of the detector.
     * 
     * @return the author value.
     */
    public String author() {
        return this.author;
    }

    /**
     * Get the category property: Problem category. This serves for organizing group for detectors.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Get the supportTopicList property: List of Support Topics for which this detector is enabled.
     * 
     * @return the supportTopicList value.
     */
    public List<SupportTopic> supportTopicList() {
        return this.supportTopicList;
    }

    /**
     * Get the analysisType property: Analysis Types for which this detector should apply to.
     * 
     * @return the analysisType value.
     */
    public List<String> analysisType() {
        return this.analysisType;
    }

    /**
     * Get the type property: Whether this detector is an Analysis Detector or not.
     * 
     * @return the type value.
     */
    public DetectorType type() {
        return this.type;
    }

    /**
     * Get the score property: Defines score of a detector to power ML based matching.
     * 
     * @return the score value.
     */
    public Float score() {
        return this.score;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportTopicList() != null) {
            supportTopicList().forEach(e -> e.validate());
        }
    }
}
