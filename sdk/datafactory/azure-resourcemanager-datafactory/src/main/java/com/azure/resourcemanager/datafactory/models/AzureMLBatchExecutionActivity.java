// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLBatchExecutionActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Azure ML Batch Execution activity.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = AzureMLBatchExecutionActivity.class,
    visible = true)
@JsonTypeName("AzureMLBatchExecution")
@Fluent
public final class AzureMLBatchExecutionActivity extends ExecutionActivity {
    /*
     * Type of activity.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "AzureMLBatchExecution";

    /*
     * Azure ML Batch Execution activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AzureMLBatchExecutionActivityTypeProperties innerTypeProperties
        = new AzureMLBatchExecutionActivityTypeProperties();

    /**
     * Creates an instance of AzureMLBatchExecutionActivity class.
     */
    public AzureMLBatchExecutionActivity() {
    }

    /**
     * Get the type property: Type of activity.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Azure ML Batch Execution activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    private AzureMLBatchExecutionActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the globalParameters property: Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint.
     * Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be
     * passed in the GlobalParameters property of the Azure ML batch execution request.
     * 
     * @return the globalParameters value.
     */
    public Map<String, Object> globalParameters() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().globalParameters();
    }

    /**
     * Set the globalParameters property: Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint.
     * Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be
     * passed in the GlobalParameters property of the Azure ML batch execution request.
     * 
     * @param globalParameters the globalParameters value to set.
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity withGlobalParameters(Map<String, Object> globalParameters) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLBatchExecutionActivityTypeProperties();
        }
        this.innerTypeProperties().withGlobalParameters(globalParameters);
        return this;
    }

    /**
     * Get the webServiceOutputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs
     * to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the
     * WebServiceOutputs property of the Azure ML batch execution request.
     * 
     * @return the webServiceOutputs value.
     */
    public Map<String, AzureMLWebServiceFile> webServiceOutputs() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().webServiceOutputs();
    }

    /**
     * Set the webServiceOutputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs
     * to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the
     * WebServiceOutputs property of the Azure ML batch execution request.
     * 
     * @param webServiceOutputs the webServiceOutputs value to set.
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity withWebServiceOutputs(Map<String, AzureMLWebServiceFile> webServiceOutputs) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLBatchExecutionActivityTypeProperties();
        }
        this.innerTypeProperties().withWebServiceOutputs(webServiceOutputs);
        return this;
    }

    /**
     * Get the webServiceInputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs
     * to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the
     * WebServiceInputs property of the Azure ML batch execution request.
     * 
     * @return the webServiceInputs value.
     */
    public Map<String, AzureMLWebServiceFile> webServiceInputs() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().webServiceInputs();
    }

    /**
     * Set the webServiceInputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs
     * to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the
     * WebServiceInputs property of the Azure ML batch execution request.
     * 
     * @param webServiceInputs the webServiceInputs value to set.
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity withWebServiceInputs(Map<String, AzureMLWebServiceFile> webServiceInputs) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLBatchExecutionActivityTypeProperties();
        }
        this.innerTypeProperties().withWebServiceInputs(webServiceInputs);
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
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model AzureMLBatchExecutionActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureMLBatchExecutionActivity.class);
}
