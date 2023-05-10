// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A rule providing a binding to an HTTP Triggered Azure Function. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("azure-function-rule")
@Fluent
public final class FunctionRuleInternal extends RouterRuleInternal {
    /*
     * URL for Azure Function
     */
    @JsonProperty(value = "functionUri", required = true)
    private String functionUri;

    /*
     * Credentials used to access Azure function rule
     */
    @JsonProperty(value = "credential")
    private FunctionRuleCredentialInternal credential;

    /**
     * Get the functionUri property: URL for Azure Function.
     *
     * @return the functionUri value.
     */
    public String getFunctionUri() {
        return this.functionUri;
    }

    /**
     * Set the functionUri property: URL for Azure Function.
     *
     * @param functionUri the functionUri value to set.
     * @return the FunctionRuleInternal object itself.
     */
    public FunctionRuleInternal setFunctionUri(String functionUri) {
        this.functionUri = functionUri;
        return this;
    }

    /**
     * Get the credential property: Credentials used to access Azure function rule.
     *
     * @return the credential value.
     */
    public FunctionRuleCredentialInternal getCredential() {
        return this.credential;
    }

    /**
     * Set the credential property: Credentials used to access Azure function rule.
     *
     * @param credential the credential value to set.
     * @return the FunctionRuleInternal object itself.
     */
    public FunctionRuleInternal setCredential(FunctionRuleCredentialInternal credential) {
        this.credential = credential;
        return this;
    }
}
