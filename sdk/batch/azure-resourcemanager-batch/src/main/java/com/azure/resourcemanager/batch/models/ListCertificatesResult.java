// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.batch.fluent.models.CertificateInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Values returned by the List operation.
 */
@Fluent
public final class ListCertificatesResult {
    /*
     * The collection of returned certificates.
     */
    @JsonProperty(value = "value")
    private List<CertificateInner> value;

    /*
     * The continuation token.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ListCertificatesResult class.
     */
    public ListCertificatesResult() {
    }

    /**
     * Get the value property: The collection of returned certificates.
     * 
     * @return the value value.
     */
    public List<CertificateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of returned certificates.
     * 
     * @param value the value value to set.
     * @return the ListCertificatesResult object itself.
     */
    public ListCertificatesResult withValue(List<CertificateInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The continuation token.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The continuation token.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListCertificatesResult object itself.
     */
    public ListCertificatesResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
