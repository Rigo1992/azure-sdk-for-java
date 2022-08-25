// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Allow to exclude some variable satisfy the condition for the WAF check. */
@Fluent
public final class ApplicationGatewayFirewallExclusion {
    /*
     * The variable to be excluded.
     */
    @JsonProperty(value = "matchVariable", required = true)
    private String matchVariable;

    /*
     * When matchVariable is a collection, operate on the selector to specify which elements in the collection this
     * exclusion applies to.
     */
    @JsonProperty(value = "selectorMatchOperator", required = true)
    private String selectorMatchOperator;

    /*
     * When matchVariable is a collection, operator used to specify which elements in the collection this exclusion
     * applies to.
     */
    @JsonProperty(value = "selector", required = true)
    private String selector;

    /**
     * Get the matchVariable property: The variable to be excluded.
     *
     * @return the matchVariable value.
     */
    public String matchVariable() {
        return this.matchVariable;
    }

    /**
     * Set the matchVariable property: The variable to be excluded.
     *
     * @param matchVariable the matchVariable value to set.
     * @return the ApplicationGatewayFirewallExclusion object itself.
     */
    public ApplicationGatewayFirewallExclusion withMatchVariable(String matchVariable) {
        this.matchVariable = matchVariable;
        return this;
    }

    /**
     * Get the selectorMatchOperator property: When matchVariable is a collection, operate on the selector to specify
     * which elements in the collection this exclusion applies to.
     *
     * @return the selectorMatchOperator value.
     */
    public String selectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    /**
     * Set the selectorMatchOperator property: When matchVariable is a collection, operate on the selector to specify
     * which elements in the collection this exclusion applies to.
     *
     * @param selectorMatchOperator the selectorMatchOperator value to set.
     * @return the ApplicationGatewayFirewallExclusion object itself.
     */
    public ApplicationGatewayFirewallExclusion withSelectorMatchOperator(String selectorMatchOperator) {
        this.selectorMatchOperator = selectorMatchOperator;
        return this;
    }

    /**
     * Get the selector property: When matchVariable is a collection, operator used to specify which elements in the
     * collection this exclusion applies to.
     *
     * @return the selector value.
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector property: When matchVariable is a collection, operator used to specify which elements in the
     * collection this exclusion applies to.
     *
     * @param selector the selector value to set.
     * @return the ApplicationGatewayFirewallExclusion object itself.
     */
    public ApplicationGatewayFirewallExclusion withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (matchVariable() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property matchVariable in model ApplicationGatewayFirewallExclusion"));
        }
        if (selectorMatchOperator() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selectorMatchOperator in model"
                            + " ApplicationGatewayFirewallExclusion"));
        }
        if (selector() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selector in model ApplicationGatewayFirewallExclusion"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationGatewayFirewallExclusion.class);
}
