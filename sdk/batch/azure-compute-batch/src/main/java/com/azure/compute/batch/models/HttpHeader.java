// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An HTTP header name-value pair. */
@Fluent
public final class HttpHeader {

    /*
     * The case-insensitive name of the header to be used while uploading output files.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value of the header to be used while uploading output files.
     */
    @Generated
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of HttpHeader class.
     *
     * @param name the name value to set.
     */
    @Generated
    @JsonCreator
    public HttpHeader(@JsonProperty(value = "name") String name) {
        this.name = name;
    }

    /**
     * Get the name property: The case-insensitive name of the header to be used while uploading output files.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the value property: The value of the header to be used while uploading output files.
     *
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the header to be used while uploading output files.
     *
     * @param value the value value to set.
     * @return the HttpHeader object itself.
     */
    @Generated
    public HttpHeader setValue(String value) {
        this.value = value;
        return this;
    }
}
