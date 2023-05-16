// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Cross-Origin-Resource-Sharing policy. */
@Fluent
public final class CorsPolicy {
    /*
     * Specifies the content for the access-control-allow-origins header
     */
    @JsonProperty(value = "allowedOrigins", required = true)
    private List<String> allowedOrigins;

    /*
     * Specifies the content for the access-control-allow-methods header
     */
    @JsonProperty(value = "allowedMethods")
    private List<String> allowedMethods;

    /*
     * Specifies the content for the access-control-allow-headers header
     */
    @JsonProperty(value = "allowedHeaders")
    private List<String> allowedHeaders;

    /*
     * Specifies the content for the access-control-expose-headers header
     */
    @JsonProperty(value = "exposeHeaders")
    private List<String> exposeHeaders;

    /*
     * Specifies the content for the access-control-max-age header
     */
    @JsonProperty(value = "maxAge")
    private Integer maxAge;

    /*
     * Specifies whether the resource allows credentials
     */
    @JsonProperty(value = "allowCredentials")
    private Boolean allowCredentials;

    /** Creates an instance of CorsPolicy class. */
    public CorsPolicy() {
    }

    /**
     * Get the allowedOrigins property: Specifies the content for the access-control-allow-origins header.
     *
     * @return the allowedOrigins value.
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set the allowedOrigins property: Specifies the content for the access-control-allow-origins header.
     *
     * @param allowedOrigins the allowedOrigins value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     * Get the allowedMethods property: Specifies the content for the access-control-allow-methods header.
     *
     * @return the allowedMethods value.
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Set the allowedMethods property: Specifies the content for the access-control-allow-methods header.
     *
     * @param allowedMethods the allowedMethods value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowedMethods(List<String> allowedMethods) {
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * Get the allowedHeaders property: Specifies the content for the access-control-allow-headers header.
     *
     * @return the allowedHeaders value.
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Set the allowedHeaders property: Specifies the content for the access-control-allow-headers header.
     *
     * @param allowedHeaders the allowedHeaders value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowedHeaders(List<String> allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
        return this;
    }

    /**
     * Get the exposeHeaders property: Specifies the content for the access-control-expose-headers header.
     *
     * @return the exposeHeaders value.
     */
    public List<String> exposeHeaders() {
        return this.exposeHeaders;
    }

    /**
     * Set the exposeHeaders property: Specifies the content for the access-control-expose-headers header.
     *
     * @param exposeHeaders the exposeHeaders value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withExposeHeaders(List<String> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
        return this;
    }

    /**
     * Get the maxAge property: Specifies the content for the access-control-max-age header.
     *
     * @return the maxAge value.
     */
    public Integer maxAge() {
        return this.maxAge;
    }

    /**
     * Set the maxAge property: Specifies the content for the access-control-max-age header.
     *
     * @param maxAge the maxAge value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * Get the allowCredentials property: Specifies whether the resource allows credentials.
     *
     * @return the allowCredentials value.
     */
    public Boolean allowCredentials() {
        return this.allowCredentials;
    }

    /**
     * Set the allowCredentials property: Specifies whether the resource allows credentials.
     *
     * @param allowCredentials the allowCredentials value to set.
     * @return the CorsPolicy object itself.
     */
    public CorsPolicy withAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (allowedOrigins() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property allowedOrigins in model CorsPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CorsPolicy.class);
}
