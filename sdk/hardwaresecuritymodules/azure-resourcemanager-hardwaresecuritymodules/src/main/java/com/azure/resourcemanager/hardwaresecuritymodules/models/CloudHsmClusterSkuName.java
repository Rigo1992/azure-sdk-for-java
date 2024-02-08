// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Sku name of the Cloud HSM Cluster.
 */
public enum CloudHsmClusterSkuName {
    /**
     * Enum value Standard_B1.
     */
    STANDARD_B1("Standard_B1"),

    /**
     * Enum value Standard B10.
     */
    STANDARD_B10("Standard B10");

    /**
     * The actual serialized value for a CloudHsmClusterSkuName instance.
     */
    private final String value;

    CloudHsmClusterSkuName(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CloudHsmClusterSkuName instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CloudHsmClusterSkuName object, or null if unable to parse.
     */
    @JsonCreator
    public static CloudHsmClusterSkuName fromString(String value) {
        if (value == null) {
            return null;
        }
        CloudHsmClusterSkuName[] items = CloudHsmClusterSkuName.values();
        for (CloudHsmClusterSkuName item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
