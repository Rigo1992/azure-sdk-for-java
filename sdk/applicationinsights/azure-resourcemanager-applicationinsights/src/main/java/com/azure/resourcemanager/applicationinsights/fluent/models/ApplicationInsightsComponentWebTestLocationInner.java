// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties that define a web test location available to an Application Insights Component. */
@Immutable
public final class ApplicationInsightsComponentWebTestLocationInner {
    /*
     * The display name of the web test location.
     */
    @JsonProperty(value = "DisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Internally defined geographic location tag.
     */
    @JsonProperty(value = "Tag", access = JsonProperty.Access.WRITE_ONLY)
    private String tag;

    /** Creates an instance of ApplicationInsightsComponentWebTestLocationInner class. */
    public ApplicationInsightsComponentWebTestLocationInner() {
    }

    /**
     * Get the displayName property: The display name of the web test location.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the tag property: Internally defined geographic location tag.
     *
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
