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

/** Azure File Storage linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFileStorage")
@JsonFlatten
@Fluent
public class AzureFileStorageLinkedService extends LinkedService {
    /*
     * Host name of the server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /*
     * User ID to logon the server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.userId")
    private Object userId;

    /*
     * Password to logon the server.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /*
     * The Azure key vault secret reference of accountKey in connection string.
     */
    @JsonProperty(value = "typeProperties.accountKey")
    private AzureKeyVaultSecretReference accountKey;

    /*
     * SAS URI of the Azure File resource. It is mutually exclusive with connectionString property. Type: string,
     * SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.sasUri")
    private Object sasUri;

    /*
     * The Azure key vault secret reference of sasToken in sas uri.
     */
    @JsonProperty(value = "typeProperties.sasToken")
    private AzureKeyVaultSecretReference sasToken;

    /*
     * The azure file share name. It is required when auth with accountKey/sasToken. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.fileShare")
    private Object fileShare;

    /*
     * The azure file share snapshot version. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.snapshot")
    private Object snapshot;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /** Creates an instance of AzureFileStorageLinkedService class. */
    public AzureFileStorageLinkedService() {}

    /**
     * Get the host property: Host name of the server. Type: string (or Expression with resultType string).
     *
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: Host name of the server. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the userId property: User ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @return the userId value.
     */
    public Object getUserId() {
        return this.userId;
    }

    /**
     * Set the userId property: User ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @param userId the userId value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the password property: Password to logon the server.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password to logon the server.
     *
     * @param password the password value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the connectionString property: The connection string. It is mutually exclusive with sasUri property. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. It is mutually exclusive with sasUri property. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @return the accountKey value.
     */
    public AzureKeyVaultSecretReference getAccountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setAccountKey(AzureKeyVaultSecretReference accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the sasUri property: SAS URI of the Azure File resource. It is mutually exclusive with connectionString
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the sasUri value.
     */
    public Object getSasUri() {
        return this.sasUri;
    }

    /**
     * Set the sasUri property: SAS URI of the Azure File resource. It is mutually exclusive with connectionString
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param sasUri the sasUri value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setSasUri(Object sasUri) {
        this.sasUri = sasUri;
        return this;
    }

    /**
     * Get the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @return the sasToken value.
     */
    public AzureKeyVaultSecretReference getSasToken() {
        return this.sasToken;
    }

    /**
     * Set the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @param sasToken the sasToken value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setSasToken(AzureKeyVaultSecretReference sasToken) {
        this.sasToken = sasToken;
        return this;
    }

    /**
     * Get the fileShare property: The azure file share name. It is required when auth with accountKey/sasToken. Type:
     * string (or Expression with resultType string).
     *
     * @return the fileShare value.
     */
    public Object getFileShare() {
        return this.fileShare;
    }

    /**
     * Set the fileShare property: The azure file share name. It is required when auth with accountKey/sasToken. Type:
     * string (or Expression with resultType string).
     *
     * @param fileShare the fileShare value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setFileShare(Object fileShare) {
        this.fileShare = fileShare;
        return this;
    }

    /**
     * Get the snapshot property: The azure file share snapshot version. Type: string (or Expression with resultType
     * string).
     *
     * @return the snapshot value.
     */
    public Object getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The azure file share snapshot version. Type: string (or Expression with resultType
     * string).
     *
     * @param snapshot the snapshot value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setSnapshot(Object snapshot) {
        this.snapshot = snapshot;
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
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileStorageLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileStorageLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileStorageLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileStorageLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
