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

/** Vertica linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Vertica")
@JsonFlatten
@Fluent
public class VerticaLinkedService extends LinkedService {
    /*
     * An ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    @JsonProperty(value = "typeProperties.pwd")
    private AzureKeyVaultSecretReference pwd;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /** Creates an instance of VerticaLinkedService class. */
    public VerticaLinkedService() {}

    /**
     * Get the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the VerticaLinkedService object itself.
     */
    public VerticaLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the pwd property: The Azure key vault secret reference of password in connection string.
     *
     * @return the pwd value.
     */
    public AzureKeyVaultSecretReference getPwd() {
        return this.pwd;
    }

    /**
     * Set the pwd property: The Azure key vault secret reference of password in connection string.
     *
     * @param pwd the pwd value to set.
     * @return the VerticaLinkedService object itself.
     */
    public VerticaLinkedService setPwd(AzureKeyVaultSecretReference pwd) {
        this.pwd = pwd;
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
     * @return the VerticaLinkedService object itself.
     */
    public VerticaLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VerticaLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VerticaLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VerticaLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VerticaLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
