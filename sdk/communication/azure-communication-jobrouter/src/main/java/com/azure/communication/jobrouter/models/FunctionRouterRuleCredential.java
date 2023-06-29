// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Credentials used to access Azure function rule. */
@Fluent
public final class FunctionRouterRuleCredential {
    /*
     * (Optional) Access key scoped to a particular function
     */
    @JsonProperty(value = "functionKey")
    private String functionKey;

    /*
     * (Optional) Access key scoped to a Azure Function app.
     * This key grants access to all functions under the app.
     */
    @JsonProperty(value = "appKey")
    private String appKey;

    /*
     * (Optional) Client id, when AppKey is provided
     * In context of Azure function, this is usually the name of the key
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /**
     * Get the functionKey property: (Optional) Access key scoped to a particular function.
     *
     * @return the functionKey value.
     */
    public String getFunctionKey() {
        return this.functionKey;
    }

    /**
     * Set the functionKey property: (Optional) Access key scoped to a particular function.
     *
     * @param functionKey the functionKey value to set.
     * @return the FunctionRuleCredential object itself.
     */
    public FunctionRouterRuleCredential setFunctionKey(String functionKey) {
        this.functionKey = functionKey;
        return this;
    }

    /**
     * Get the appKey property: (Optional) Access key scoped to a Azure Function app. This key grants access to all
     * functions under the app.
     *
     * @return the appKey value.
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * Set the appKey property: (Optional) Access key scoped to a Azure Function app. This key grants access to all
     * functions under the app.
     *
     * @param appKey the appKey value to set.
     * @return the FunctionRuleCredential object itself.
     */
    public FunctionRouterRuleCredential setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * Get the clientId property: (Optional) Client id, when AppKey is provided In context of Azure function, this is
     * usually the name of the key.
     *
     * @return the clientId value.
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: (Optional) Client id, when AppKey is provided In context of Azure function, this is
     * usually the name of the key.
     *
     * @param clientId the clientId value to set.
     * @return the FunctionRuleCredential object itself.
     */
    public FunctionRouterRuleCredential setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
}