// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CertificatesGetHeaders model. */
@Fluent
public final class CertificatesGetHeaders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificatesGetHeaders.class);

    /*
     * The Etag property.
     */
    @JsonProperty(value = "Etag")
    private String etag;

    /**
     * Get the etag property: The Etag property.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The Etag property.
     *
     * @param etag the etag value to set.
     * @return the CertificatesGetHeaders object itself.
     */
    public CertificatesGetHeaders withEtag(String etag) {
        this.etag = etag;
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
