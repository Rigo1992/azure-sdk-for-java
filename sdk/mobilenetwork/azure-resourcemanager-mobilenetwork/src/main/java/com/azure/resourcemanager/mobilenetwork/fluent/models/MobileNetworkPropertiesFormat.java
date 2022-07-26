// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.PlmnId;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Mobile network properties. */
@Fluent
public final class MobileNetworkPropertiesFormat {
    /*
     * The provisioning state of the mobile network resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The unique public land mobile network identifier for the network. This
     * is made up of the mobile country code and mobile network code, as
     * defined in https://www.itu.int/rec/T-REC-E.212. The values 001-01 and
     * 001-001 can be used for testing and the values 999-99 and 999-999 can be
     * used on internal private networks.
     */
    @JsonProperty(value = "publicLandMobileNetworkIdentifier", required = true)
    private PlmnId publicLandMobileNetworkIdentifier;

    /*
     * The mobile network resource identifier
     */
    @JsonProperty(value = "serviceKey", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceKey;

    /**
     * Get the provisioningState property: The provisioning state of the mobile network resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the publicLandMobileNetworkIdentifier property: The unique public land mobile network identifier for the
     * network. This is made up of the mobile country code and mobile network code, as defined in
     * https://www.itu.int/rec/T-REC-E.212. The values 001-01 and 001-001 can be used for testing and the values 999-99
     * and 999-999 can be used on internal private networks.
     *
     * @return the publicLandMobileNetworkIdentifier value.
     */
    public PlmnId publicLandMobileNetworkIdentifier() {
        return this.publicLandMobileNetworkIdentifier;
    }

    /**
     * Set the publicLandMobileNetworkIdentifier property: The unique public land mobile network identifier for the
     * network. This is made up of the mobile country code and mobile network code, as defined in
     * https://www.itu.int/rec/T-REC-E.212. The values 001-01 and 001-001 can be used for testing and the values 999-99
     * and 999-999 can be used on internal private networks.
     *
     * @param publicLandMobileNetworkIdentifier the publicLandMobileNetworkIdentifier value to set.
     * @return the MobileNetworkPropertiesFormat object itself.
     */
    public MobileNetworkPropertiesFormat withPublicLandMobileNetworkIdentifier(
        PlmnId publicLandMobileNetworkIdentifier) {
        this.publicLandMobileNetworkIdentifier = publicLandMobileNetworkIdentifier;
        return this;
    }

    /**
     * Get the serviceKey property: The mobile network resource identifier.
     *
     * @return the serviceKey value.
     */
    public String serviceKey() {
        return this.serviceKey;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicLandMobileNetworkIdentifier() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property publicLandMobileNetworkIdentifier in model"
                            + " MobileNetworkPropertiesFormat"));
        } else {
            publicLandMobileNetworkIdentifier().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MobileNetworkPropertiesFormat.class);
}
