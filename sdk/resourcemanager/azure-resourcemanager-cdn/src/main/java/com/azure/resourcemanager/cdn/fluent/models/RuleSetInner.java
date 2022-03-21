// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Friendly RuleSet name mapping to the any RuleSet or secret related information. */
@Fluent
public final class RuleSetInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleSetInner.class);

    /*
     * The JSON object that contains the properties of the Rule Set to create.
     */
    @JsonProperty(value = "properties")
    private RuleSetProperties innerProperties;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the Rule Set to create.
     *
     * @return the innerProperties value.
     */
    private RuleSetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the profileName property: The name of the profile which holds the rule set.
     *
     * @return the profileName value.
     */
    public String profileName() {
        return this.innerProperties() == null ? null : this.innerProperties().profileName();
    }

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentStatus();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
