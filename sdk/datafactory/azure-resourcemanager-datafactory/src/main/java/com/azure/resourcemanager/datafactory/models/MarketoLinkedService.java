// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.MarketoLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Marketo server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = MarketoLinkedService.class, visible = true)
@JsonTypeName("Marketo")
@Fluent
public final class MarketoLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "Marketo";

    /*
     * Marketo server linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private MarketoLinkedServiceTypeProperties innerTypeProperties = new MarketoLinkedServiceTypeProperties();

    /**
     * Creates an instance of MarketoLinkedService class.
     */
    public MarketoLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Marketo server linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private MarketoLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketoLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketoLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketoLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketoLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the endpoint property: The endpoint of the Marketo server. (i.e. 123-ABC-321.mktorest.com).
     * 
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().endpoint();
    }

    /**
     * Set the endpoint property: The endpoint of the Marketo server. (i.e. 123-ABC-321.mktorest.com).
     * 
     * @param endpoint the endpoint value to set.
     * @return the MarketoLinkedService object itself.
     */
    public MarketoLinkedService withEndpoint(Object endpoint) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MarketoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEndpoint(endpoint);
        return this;
    }

    /**
     * Get the clientId property: The client Id of your Marketo service.
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientId();
    }

    /**
     * Set the clientId property: The client Id of your Marketo service.
     * 
     * @param clientId the clientId value to set.
     * @return the MarketoLinkedService object itself.
     */
    public MarketoLinkedService withClientId(Object clientId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MarketoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the clientSecret property: The client secret of your Marketo service.
     * 
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientSecret();
    }

    /**
     * Set the clientSecret property: The client secret of your Marketo service.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the MarketoLinkedService object itself.
     */
    public MarketoLinkedService withClientSecret(SecretBase clientSecret) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MarketoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientSecret(clientSecret);
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useEncryptedEndpoints();
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the MarketoLinkedService object itself.
     */
    public MarketoLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MarketoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseEncryptedEndpoints(useEncryptedEndpoints);
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useHostVerification();
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the MarketoLinkedService object itself.
     */
    public MarketoLinkedService withUseHostVerification(Object useHostVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MarketoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseHostVerification(useHostVerification);
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().usePeerVerification();
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the MarketoLinkedService object itself.
     */
    public MarketoLinkedService withUsePeerVerification(Object usePeerVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MarketoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsePeerVerification(usePeerVerification);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the MarketoLinkedService object itself.
     */
    public MarketoLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MarketoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
                    "Missing required property innerTypeProperties in model MarketoLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MarketoLinkedService.class);
}
