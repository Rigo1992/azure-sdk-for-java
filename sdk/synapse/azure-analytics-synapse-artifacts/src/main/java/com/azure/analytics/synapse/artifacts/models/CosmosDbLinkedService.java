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

/** Microsoft Azure Cosmos Database (CosmosDB) linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CosmosDb")
@JsonFlatten
@Fluent
public class CosmosDbLinkedService extends LinkedService {
    /*
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /*
     * The endpoint of the Azure CosmosDB account. Type: string (or Expression with resultType string)
     */
    @JsonProperty(value = "typeProperties.accountEndpoint")
    private Object accountEndpoint;

    /*
     * The name of the database. Type: string (or Expression with resultType string)
     */
    @JsonProperty(value = "typeProperties.database")
    private Object database;

    /*
     * The account key of the Azure CosmosDB account. Type: SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.accountKey")
    private SecretBase accountKey;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /** Creates an instance of CosmosDbLinkedService class. */
    public CosmosDbLinkedService() {}

    /**
     * Get the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the accountEndpoint property: The endpoint of the Azure CosmosDB account. Type: string (or Expression with
     * resultType string).
     *
     * @return the accountEndpoint value.
     */
    public Object getAccountEndpoint() {
        return this.accountEndpoint;
    }

    /**
     * Set the accountEndpoint property: The endpoint of the Azure CosmosDB account. Type: string (or Expression with
     * resultType string).
     *
     * @param accountEndpoint the accountEndpoint value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService setAccountEndpoint(Object accountEndpoint) {
        this.accountEndpoint = accountEndpoint;
        return this;
    }

    /**
     * Get the database property: The name of the database. Type: string (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: The name of the database. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService setDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the accountKey property: The account key of the Azure CosmosDB account. Type: SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the accountKey value.
     */
    public SecretBase getAccountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: The account key of the Azure CosmosDB account. Type: SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param accountKey the accountKey value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService setAccountKey(SecretBase accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the CosmosDbLinkedService object itself.
     */
    public CosmosDbLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
