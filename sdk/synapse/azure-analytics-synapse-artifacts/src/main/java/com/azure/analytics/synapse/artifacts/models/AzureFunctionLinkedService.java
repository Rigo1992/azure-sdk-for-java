// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Azure Function linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFunction")
@JsonFlatten
@Fluent
public class AzureFunctionLinkedService extends LinkedService {
    /*
     * The endpoint of the Azure Function App. URL will be in the format https://<accountName>.azurewebsites.net.
     */
    @JsonProperty(value = "typeProperties.functionAppUrl", required = true)
    private Object functionAppUrl;

    /*
     * Function or Host key for Azure Function App.
     */
    @JsonProperty(value = "typeProperties.functionKey")
    private SecretBase functionKey;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "typeProperties.credential")
    private CredentialReference credential;

    /*
     * Allowed token audiences for azure function.
     */
    @JsonProperty(value = "typeProperties.resourceId")
    private Object resourceId;

    /*
     * Type of authentication (Required to specify MSI) used to connect to AzureFunction. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.authentication")
    private Object authentication;

    /**
     * Creates an instance of AzureFunctionLinkedService class.
     */
    public AzureFunctionLinkedService() {
    }

    /**
     * Get the functionAppUrl property: The endpoint of the Azure Function App. URL will be in the format
     * https://&lt;accountName&gt;.azurewebsites.net.
     * 
     * @return the functionAppUrl value.
     */
    public Object getFunctionAppUrl() {
        return this.functionAppUrl;
    }

    /**
     * Set the functionAppUrl property: The endpoint of the Azure Function App. URL will be in the format
     * https://&lt;accountName&gt;.azurewebsites.net.
     * 
     * @param functionAppUrl the functionAppUrl value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService setFunctionAppUrl(Object functionAppUrl) {
        this.functionAppUrl = functionAppUrl;
        return this;
    }

    /**
     * Get the functionKey property: Function or Host key for Azure Function App.
     * 
     * @return the functionKey value.
     */
    public SecretBase getFunctionKey() {
        return this.functionKey;
    }

    /**
     * Set the functionKey property: Function or Host key for Azure Function App.
     * 
     * @param functionKey the functionKey value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService setFunctionKey(SecretBase functionKey) {
        this.functionKey = functionKey;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    public CredentialReference getCredential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService setCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the resourceId property: Allowed token audiences for azure function.
     * 
     * @return the resourceId value.
     */
    public Object getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Allowed token audiences for azure function.
     * 
     * @param resourceId the resourceId value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService setResourceId(Object resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the authentication property: Type of authentication (Required to specify MSI) used to connect to
     * AzureFunction. Type: string (or Expression with resultType string).
     * 
     * @return the authentication value.
     */
    public Object getAuthentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Type of authentication (Required to specify MSI) used to connect to
     * AzureFunction. Type: string (or Expression with resultType string).
     * 
     * @param authentication the authentication value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService setAuthentication(Object authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
