// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response body for generating an upload URI. */
@Fluent
public final class GenerateUploadUriResponseInner {
    /*
     * The upload URI for the VHD.
     */
    @JsonProperty(value = "uploadUri")
    private String uploadUri;

    /** Creates an instance of GenerateUploadUriResponseInner class. */
    public GenerateUploadUriResponseInner() {
    }

    /**
     * Get the uploadUri property: The upload URI for the VHD.
     *
     * @return the uploadUri value.
     */
    public String uploadUri() {
        return this.uploadUri;
    }

    /**
     * Set the uploadUri property: The upload URI for the VHD.
     *
     * @param uploadUri the uploadUri value to set.
     * @return the GenerateUploadUriResponseInner object itself.
     */
    public GenerateUploadUriResponseInner withUploadUri(String uploadUri) {
        this.uploadUri = uploadUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
