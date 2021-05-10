// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties used to create a reference data set. */
@Fluent
public class ReferenceDataSetCreationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReferenceDataSetCreationProperties.class);

    /*
     * The list of key properties for the reference data set.
     */
    @JsonProperty(value = "keyProperties", required = true)
    private List<ReferenceDataSetKeyProperty> keyProperties;

    /*
     * The reference data set key comparison behavior can be set using this
     * property. By default, the value is 'Ordinal' - which means case
     * sensitive key comparison will be performed while joining reference data
     * with events or while adding new reference data. When 'OrdinalIgnoreCase'
     * is set, case insensitive comparison will be used.
     */
    @JsonProperty(value = "dataStringComparisonBehavior")
    private DataStringComparisonBehavior dataStringComparisonBehavior;

    /**
     * Get the keyProperties property: The list of key properties for the reference data set.
     *
     * @return the keyProperties value.
     */
    public List<ReferenceDataSetKeyProperty> keyProperties() {
        return this.keyProperties;
    }

    /**
     * Set the keyProperties property: The list of key properties for the reference data set.
     *
     * @param keyProperties the keyProperties value to set.
     * @return the ReferenceDataSetCreationProperties object itself.
     */
    public ReferenceDataSetCreationProperties withKeyProperties(List<ReferenceDataSetKeyProperty> keyProperties) {
        this.keyProperties = keyProperties;
        return this;
    }

    /**
     * Get the dataStringComparisonBehavior property: The reference data set key comparison behavior can be set using
     * this property. By default, the value is 'Ordinal' - which means case sensitive key comparison will be performed
     * while joining reference data with events or while adding new reference data. When 'OrdinalIgnoreCase' is set,
     * case insensitive comparison will be used.
     *
     * @return the dataStringComparisonBehavior value.
     */
    public DataStringComparisonBehavior dataStringComparisonBehavior() {
        return this.dataStringComparisonBehavior;
    }

    /**
     * Set the dataStringComparisonBehavior property: The reference data set key comparison behavior can be set using
     * this property. By default, the value is 'Ordinal' - which means case sensitive key comparison will be performed
     * while joining reference data with events or while adding new reference data. When 'OrdinalIgnoreCase' is set,
     * case insensitive comparison will be used.
     *
     * @param dataStringComparisonBehavior the dataStringComparisonBehavior value to set.
     * @return the ReferenceDataSetCreationProperties object itself.
     */
    public ReferenceDataSetCreationProperties withDataStringComparisonBehavior(
        DataStringComparisonBehavior dataStringComparisonBehavior) {
        this.dataStringComparisonBehavior = dataStringComparisonBehavior;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyProperties in model ReferenceDataSetCreationProperties"));
        } else {
            keyProperties().forEach(e -> e.validate());
        }
    }
}
