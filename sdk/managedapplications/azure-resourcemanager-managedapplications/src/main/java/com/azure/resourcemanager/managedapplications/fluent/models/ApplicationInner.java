// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managedapplications.models.GenericResource;
import com.azure.resourcemanager.managedapplications.models.Identity;
import com.azure.resourcemanager.managedapplications.models.Plan;
import com.azure.resourcemanager.managedapplications.models.ProvisioningState;
import com.azure.resourcemanager.managedapplications.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Information about managed application. */
@Fluent
public final class ApplicationInner extends GenericResource {
    /*
     * The managed application properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ApplicationProperties innerProperties = new ApplicationProperties();

    /*
     * The plan information.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /*
     * The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     */
    @JsonProperty(value = "kind", required = true)
    private String kind;

    /** Creates an instance of ApplicationInner class. */
    public ApplicationInner() {
    }

    /**
     * Get the innerProperties property: The managed application properties.
     *
     * @return the innerProperties value.
     */
    private ApplicationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the plan property: The plan information.
     *
     * @return the plan value.
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: The plan information.
     *
     * @param plan the plan value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the kind property: The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     *
     * @param kind the kind value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationInner withManagedBy(String managedBy) {
        super.withManagedBy(managedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationInner withSku(Sku sku) {
        super.withSku(sku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationInner withIdentity(Identity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the managedResourceGroupId property: The managed resource group Id.
     *
     * @return the managedResourceGroupId value.
     */
    public String managedResourceGroupId() {
        return this.innerProperties() == null ? null : this.innerProperties().managedResourceGroupId();
    }

    /**
     * Set the managedResourceGroupId property: The managed resource group Id.
     *
     * @param managedResourceGroupId the managedResourceGroupId value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withManagedResourceGroupId(String managedResourceGroupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationProperties();
        }
        this.innerProperties().withManagedResourceGroupId(managedResourceGroupId);
        return this;
    }

    /**
     * Get the applicationDefinitionId property: The fully qualified path of managed application definition Id.
     *
     * @return the applicationDefinitionId value.
     */
    public String applicationDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationDefinitionId();
    }

    /**
     * Set the applicationDefinitionId property: The fully qualified path of managed application definition Id.
     *
     * @param applicationDefinitionId the applicationDefinitionId value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withApplicationDefinitionId(String applicationDefinitionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationProperties();
        }
        this.innerProperties().withApplicationDefinitionId(applicationDefinitionId);
        return this;
    }

    /**
     * Get the parameters property: Name and value pairs that define the managed application parameters. It can be a
     * JObject or a well formed JSON string.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: Name and value pairs that define the managed application parameters. It can be a
     * JObject or a well formed JSON string.
     *
     * @param parameters the parameters value to set.
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withParameters(Object parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the outputs property: Name and value pairs that define the managed application outputs.
     *
     * @return the outputs value.
     */
    public Object outputs() {
        return this.innerProperties() == null ? null : this.innerProperties().outputs();
    }

    /**
     * Get the provisioningState property: The managed application provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ApplicationInner"));
        } else {
            innerProperties().validate();
        }
        if (plan() != null) {
            plan().validate();
        }
        if (kind() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property kind in model ApplicationInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationInner.class);
}
