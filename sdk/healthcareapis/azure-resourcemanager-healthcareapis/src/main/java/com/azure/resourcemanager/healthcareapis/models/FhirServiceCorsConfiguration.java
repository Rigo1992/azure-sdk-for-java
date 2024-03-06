// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The settings for the CORS configuration of the service instance.
 */
@Fluent
public final class FhirServiceCorsConfiguration {
    /*
     * The origins to be allowed via CORS.
     */
    @JsonProperty(value = "origins")
    private List<String> origins;

    /*
     * The headers to be allowed via CORS.
     */
    @JsonProperty(value = "headers")
    private List<String> headers;

    /*
     * The methods to be allowed via CORS.
     */
    @JsonProperty(value = "methods")
    private List<String> methods;

    /*
     * The max age to be allowed via CORS.
     */
    @JsonProperty(value = "maxAge")
    private Integer maxAge;

    /*
     * If credentials are allowed via CORS.
     */
    @JsonProperty(value = "allowCredentials")
    private Boolean allowCredentials;

    /**
     * Creates an instance of FhirServiceCorsConfiguration class.
     */
    public FhirServiceCorsConfiguration() {
    }

    /**
     * Get the origins property: The origins to be allowed via CORS.
     * 
     * @return the origins value.
     */
    public List<String> origins() {
        return this.origins;
    }

    /**
     * Set the origins property: The origins to be allowed via CORS.
     * 
     * @param origins the origins value to set.
     * @return the FhirServiceCorsConfiguration object itself.
     */
    public FhirServiceCorsConfiguration withOrigins(List<String> origins) {
        this.origins = origins;
        return this;
    }

    /**
     * Get the headers property: The headers to be allowed via CORS.
     * 
     * @return the headers value.
     */
    public List<String> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: The headers to be allowed via CORS.
     * 
     * @param headers the headers value to set.
     * @return the FhirServiceCorsConfiguration object itself.
     */
    public FhirServiceCorsConfiguration withHeaders(List<String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the methods property: The methods to be allowed via CORS.
     * 
     * @return the methods value.
     */
    public List<String> methods() {
        return this.methods;
    }

    /**
     * Set the methods property: The methods to be allowed via CORS.
     * 
     * @param methods the methods value to set.
     * @return the FhirServiceCorsConfiguration object itself.
     */
    public FhirServiceCorsConfiguration withMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    /**
     * Get the maxAge property: The max age to be allowed via CORS.
     * 
     * @return the maxAge value.
     */
    public Integer maxAge() {
        return this.maxAge;
    }

    /**
     * Set the maxAge property: The max age to be allowed via CORS.
     * 
     * @param maxAge the maxAge value to set.
     * @return the FhirServiceCorsConfiguration object itself.
     */
    public FhirServiceCorsConfiguration withMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * Get the allowCredentials property: If credentials are allowed via CORS.
     * 
     * @return the allowCredentials value.
     */
    public Boolean allowCredentials() {
        return this.allowCredentials;
    }

    /**
     * Set the allowCredentials property: If credentials are allowed via CORS.
     * 
     * @param allowCredentials the allowCredentials value to set.
     * @return the FhirServiceCorsConfiguration object itself.
     */
    public FhirServiceCorsConfiguration withAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
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
