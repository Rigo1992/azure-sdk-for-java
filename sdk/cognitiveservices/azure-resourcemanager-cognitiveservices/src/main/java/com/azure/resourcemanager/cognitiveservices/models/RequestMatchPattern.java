// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RequestMatchPattern model. */
@Fluent
public final class RequestMatchPattern {
    /*
     * The path property.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * The method property.
     */
    @JsonProperty(value = "method")
    private String method;

    /**
     * Get the path property: The path property.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path property.
     *
     * @param path the path value to set.
     * @return the RequestMatchPattern object itself.
     */
    public RequestMatchPattern withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the method property: The method property.
     *
     * @return the method value.
     */
    public String method() {
        return this.method;
    }

    /**
     * Set the method property: The method property.
     *
     * @param method the method value to set.
     * @return the RequestMatchPattern object itself.
     */
    public RequestMatchPattern withMethod(String method) {
        this.method = method;
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
