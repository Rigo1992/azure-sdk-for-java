// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Supported operating systems properties.
 */
@Fluent
public final class SupportedOSProperties {
    /*
     * The supported operating systems property list.
     */
    @JsonProperty(value = "supportedOsList")
    private List<SupportedOSProperty> supportedOsList;

    /**
     * Creates an instance of SupportedOSProperties class.
     */
    public SupportedOSProperties() {
    }

    /**
     * Get the supportedOsList property: The supported operating systems property list.
     * 
     * @return the supportedOsList value.
     */
    public List<SupportedOSProperty> supportedOsList() {
        return this.supportedOsList;
    }

    /**
     * Set the supportedOsList property: The supported operating systems property list.
     * 
     * @param supportedOsList the supportedOsList value to set.
     * @return the SupportedOSProperties object itself.
     */
    public SupportedOSProperties withSupportedOsList(List<SupportedOSProperty> supportedOsList) {
        this.supportedOsList = supportedOsList;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedOsList() != null) {
            supportedOsList().forEach(e -> e.validate());
        }
    }
}
