// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Post request for Delete Bastion Shareable Link By Token endpoint.
 */
@Fluent
public final class BastionShareableLinkTokenListRequest {
    /*
     * List of Bastion Shareable Link Token.
     */
    @JsonProperty(value = "tokens")
    private List<String> tokens;

    /**
     * Creates an instance of BastionShareableLinkTokenListRequest class.
     */
    public BastionShareableLinkTokenListRequest() {
    }

    /**
     * Get the tokens property: List of Bastion Shareable Link Token.
     * 
     * @return the tokens value.
     */
    public List<String> tokens() {
        return this.tokens;
    }

    /**
     * Set the tokens property: List of Bastion Shareable Link Token.
     * 
     * @param tokens the tokens value to set.
     * @return the BastionShareableLinkTokenListRequest object itself.
     */
    public BastionShareableLinkTokenListRequest withTokens(List<String> tokens) {
        this.tokens = tokens;
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
