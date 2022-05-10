// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** workbookIcon. */
@Fluent
public final class MicrosoftGraphWorkbookIcon {
    /*
     * Represents the index of the icon in the given set.
     */
    @JsonProperty(value = "index")
    private Integer index;

    /*
     * Represents the set that the icon is part of. The possible values are:
     * Invalid, ThreeArrows, ThreeArrowsGray, ThreeFlags, ThreeTrafficLights1,
     * ThreeTrafficLights2, ThreeSigns, ThreeSymbols, ThreeSymbols2,
     * FourArrows, FourArrowsGray, FourRedToBlack, FourRating,
     * FourTrafficLights, FiveArrows, FiveArrowsGray, FiveRating, FiveQuarters,
     * ThreeStars, ThreeTriangles, FiveBoxes.
     */
    @JsonProperty(value = "set")
    private String set;

    /*
     * workbookIcon
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the index property: Represents the index of the icon in the given set.
     *
     * @return the index value.
     */
    public Integer index() {
        return this.index;
    }

    /**
     * Set the index property: Represents the index of the icon in the given set.
     *
     * @param index the index value to set.
     * @return the MicrosoftGraphWorkbookIcon object itself.
     */
    public MicrosoftGraphWorkbookIcon withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * Get the set property: Represents the set that the icon is part of. The possible values are: Invalid, ThreeArrows,
     * ThreeArrowsGray, ThreeFlags, ThreeTrafficLights1, ThreeTrafficLights2, ThreeSigns, ThreeSymbols, ThreeSymbols2,
     * FourArrows, FourArrowsGray, FourRedToBlack, FourRating, FourTrafficLights, FiveArrows, FiveArrowsGray,
     * FiveRating, FiveQuarters, ThreeStars, ThreeTriangles, FiveBoxes.
     *
     * @return the set value.
     */
    public String set() {
        return this.set;
    }

    /**
     * Set the set property: Represents the set that the icon is part of. The possible values are: Invalid, ThreeArrows,
     * ThreeArrowsGray, ThreeFlags, ThreeTrafficLights1, ThreeTrafficLights2, ThreeSigns, ThreeSymbols, ThreeSymbols2,
     * FourArrows, FourArrowsGray, FourRedToBlack, FourRating, FourTrafficLights, FiveArrows, FiveArrowsGray,
     * FiveRating, FiveQuarters, ThreeStars, ThreeTriangles, FiveBoxes.
     *
     * @param set the set value to set.
     * @return the MicrosoftGraphWorkbookIcon object itself.
     */
    public MicrosoftGraphWorkbookIcon withSet(String set) {
        this.set = set;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookIcon.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookIcon.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookIcon object itself.
     */
    public MicrosoftGraphWorkbookIcon withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
