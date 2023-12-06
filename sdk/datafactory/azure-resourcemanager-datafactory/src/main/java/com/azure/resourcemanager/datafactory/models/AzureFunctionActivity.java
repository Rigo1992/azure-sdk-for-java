// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AzureFunctionActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Azure Function activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFunctionActivity")
@Fluent
public final class AzureFunctionActivity extends ExecutionActivity {
    /*
     * Azure Function activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AzureFunctionActivityTypeProperties innerTypeProperties = new AzureFunctionActivityTypeProperties();

    /**
     * Creates an instance of AzureFunctionActivity class.
     */
    public AzureFunctionActivity() {
    }

    /**
     * Get the innerTypeProperties property: Azure Function activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    private AzureFunctionActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the method property: Rest API method for target endpoint.
     * 
     * @return the method value.
     */
    public AzureFunctionActivityMethod method() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().method();
    }

    /**
     * Set the method property: Rest API method for target endpoint.
     * 
     * @param method the method value to set.
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withMethod(AzureFunctionActivityMethod method) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureFunctionActivityTypeProperties();
        }
        this.innerTypeProperties().withMethod(method);
        return this;
    }

    /**
     * Get the functionName property: Name of the Function that the Azure Function Activity will call. Type: string (or
     * Expression with resultType string).
     * 
     * @return the functionName value.
     */
    public Object functionName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().functionName();
    }

    /**
     * Set the functionName property: Name of the Function that the Azure Function Activity will call. Type: string (or
     * Expression with resultType string).
     * 
     * @param functionName the functionName value to set.
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withFunctionName(Object functionName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureFunctionActivityTypeProperties();
        }
        this.innerTypeProperties().withFunctionName(functionName);
        return this;
    }

    /**
     * Get the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     * 
     * @return the headers value.
     */
    public Object headers() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().headers();
    }

    /**
     * Set the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     * 
     * @param headers the headers value to set.
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withHeaders(Object headers) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureFunctionActivityTypeProperties();
        }
        this.innerTypeProperties().withHeaders(headers);
        return this;
    }

    /**
     * Get the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     * 
     * @return the body value.
     */
    public Object body() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().body();
    }

    /**
     * Set the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     * 
     * @param body the body value to set.
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withBody(Object body) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureFunctionActivityTypeProperties();
        }
        this.innerTypeProperties().withBody(body);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerTypeProperties in model AzureFunctionActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureFunctionActivity.class);
}
