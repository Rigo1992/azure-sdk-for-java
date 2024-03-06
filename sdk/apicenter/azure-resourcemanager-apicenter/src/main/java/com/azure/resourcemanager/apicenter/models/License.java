// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The license information for the API.
 */
@Fluent
public final class License {
    /*
     * Name of the license.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * URL pointing to the license details. The URL field is mutually exclusive of the
     * identifier field.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * SPDX license information for the API. The identifier field is mutually
     * exclusive of the URL field.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /**
     * Creates an instance of License class.
     */
    public License() {
    }

    /**
     * Get the name property: Name of the license.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the license.
     * 
     * @param name the name value to set.
     * @return the License object itself.
     */
    public License withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the url property: URL pointing to the license details. The URL field is mutually exclusive of the
     * identifier field.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: URL pointing to the license details. The URL field is mutually exclusive of the
     * identifier field.
     * 
     * @param url the url value to set.
     * @return the License object itself.
     */
    public License withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the identifier property: SPDX license information for the API. The identifier field is mutually
     * exclusive of the URL field.
     * 
     * @return the identifier value.
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: SPDX license information for the API. The identifier field is mutually
     * exclusive of the URL field.
     * 
     * @param identifier the identifier value to set.
     * @return the License object itself.
     */
    public License withIdentifier(String identifier) {
        this.identifier = identifier;
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
