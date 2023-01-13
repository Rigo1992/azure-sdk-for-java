// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Data Lake Store account properties. */
@Immutable
public final class DataLakeStoreAccountInformationProperties {
    /*
     * The optional suffix for the Data Lake Store account.
     */
    @JsonProperty(value = "suffix", access = JsonProperty.Access.WRITE_ONLY)
    private String suffix;

    /** Creates an instance of DataLakeStoreAccountInformationProperties class. */
    public DataLakeStoreAccountInformationProperties() {
    }

    /**
     * Get the suffix property: The optional suffix for the Data Lake Store account.
     *
     * @return the suffix value.
     */
    public String suffix() {
        return this.suffix;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
