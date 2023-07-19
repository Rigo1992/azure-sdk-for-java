// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Rules for the InternetGateways. */
@Fluent
public final class RuleProperties {
    /*
     * Specify action.
     */
    @JsonProperty(value = "action", required = true)
    private Action action;

    /*
     * List of Addresses to be allowed or denied.
     */
    @JsonProperty(value = "addressList", required = true)
    private List<String> addressList;

    /** Creates an instance of RuleProperties class. */
    public RuleProperties() {
    }

    /**
     * Get the action property: Specify action.
     *
     * @return the action value.
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action property: Specify action.
     *
     * @param action the action value to set.
     * @return the RuleProperties object itself.
     */
    public RuleProperties withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Get the addressList property: List of Addresses to be allowed or denied.
     *
     * @return the addressList value.
     */
    public List<String> addressList() {
        return this.addressList;
    }

    /**
     * Set the addressList property: List of Addresses to be allowed or denied.
     *
     * @param addressList the addressList value to set.
     * @return the RuleProperties object itself.
     */
    public RuleProperties withAddressList(List<String> addressList) {
        this.addressList = addressList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (action() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property action in model RuleProperties"));
        }
        if (addressList() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property addressList in model RuleProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RuleProperties.class);
}
