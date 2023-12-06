// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.DynamicsAXLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Dynamics AX linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DynamicsAX")
@Fluent
public final class DynamicsAXLinkedService extends LinkedService {
    /*
     * Dynamics AX linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private DynamicsAXLinkedServiceTypeProperties innerTypeProperties = new DynamicsAXLinkedServiceTypeProperties();

    /**
     * Creates an instance of DynamicsAXLinkedService class.
     */
    public DynamicsAXLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Dynamics AX linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private DynamicsAXLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicsAXLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicsAXLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicsAXLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicsAXLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the url property: The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     * 
     * @return the url value.
     */
    public Object url() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().url();
    }

    /**
     * Set the url property: The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     * 
     * @param url the url value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withUrl(Object url) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsAXLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUrl(url);
        return this;
    }

    /**
     * Get the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalId();
    }

    /**
     * Set the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withServicePrincipalId(Object servicePrincipalId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsAXLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalId(servicePrincipalId);
        return this;
    }

    /**
     * Get the servicePrincipalKey property: Specify the application's key. Mark this field as a SecureString to store
     * it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with
     * resultType string).
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalKey();
    }

    /**
     * Set the servicePrincipalKey property: Specify the application's key. Mark this field as a SecureString to store
     * it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with
     * resultType string).
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsAXLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalKey(servicePrincipalKey);
        return this;
    }

    /**
     * Get the tenant property: Specify the tenant information (domain name or tenant ID) under which your application
     * resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object tenant() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tenant();
    }

    /**
     * Set the tenant property: Specify the tenant information (domain name or tenant ID) under which your application
     * resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withTenant(Object tenant) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsAXLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTenant(tenant);
        return this;
    }

    /**
     * Get the aadResourceId property: Specify the resource you are requesting authorization. Type: string (or
     * Expression with resultType string).
     * 
     * @return the aadResourceId value.
     */
    public Object aadResourceId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().aadResourceId();
    }

    /**
     * Set the aadResourceId property: Specify the resource you are requesting authorization. Type: string (or
     * Expression with resultType string).
     * 
     * @param aadResourceId the aadResourceId value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withAadResourceId(Object aadResourceId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsAXLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAadResourceId(aadResourceId);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsAXLinkedServiceTypeProperties();
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
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerTypeProperties in model DynamicsAXLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DynamicsAXLinkedService.class);
}
