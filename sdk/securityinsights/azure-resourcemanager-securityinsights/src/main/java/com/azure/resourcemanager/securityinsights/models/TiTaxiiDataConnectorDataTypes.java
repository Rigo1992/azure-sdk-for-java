// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The available data types for Threat Intelligence TAXII data connector. */
@Fluent
public final class TiTaxiiDataConnectorDataTypes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TiTaxiiDataConnectorDataTypes.class);

    /*
     * Data type for TAXII connector.
     */
    @JsonProperty(value = "taxiiClient", required = true)
    private TiTaxiiDataConnectorDataTypesTaxiiClient taxiiClient;

    /**
     * Get the taxiiClient property: Data type for TAXII connector.
     *
     * @return the taxiiClient value.
     */
    public TiTaxiiDataConnectorDataTypesTaxiiClient taxiiClient() {
        return this.taxiiClient;
    }

    /**
     * Set the taxiiClient property: Data type for TAXII connector.
     *
     * @param taxiiClient the taxiiClient value to set.
     * @return the TiTaxiiDataConnectorDataTypes object itself.
     */
    public TiTaxiiDataConnectorDataTypes withTaxiiClient(TiTaxiiDataConnectorDataTypesTaxiiClient taxiiClient) {
        this.taxiiClient = taxiiClient;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (taxiiClient() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property taxiiClient in model TiTaxiiDataConnectorDataTypes"));
        } else {
            taxiiClient().validate();
        }
    }
}
