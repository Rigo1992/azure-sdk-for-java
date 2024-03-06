// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.servicefabric.models.ApplicationMetricDescription;
import com.azure.resourcemanager.servicefabric.models.ApplicationUpgradePolicy;
import com.azure.resourcemanager.servicefabric.models.ApplicationUserAssignedIdentity;
import com.azure.resourcemanager.servicefabric.models.ManagedIdentity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The application resource.
 */
@Fluent
public final class ApplicationResourceInner extends ProxyResource {
    /*
     * Describes the managed identities for an Azure resource.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /*
     * The application resource properties.
     */
    @JsonProperty(value = "properties")
    private ApplicationResourceProperties innerProperties;

    /*
     * It will be deprecated in New API, resource location depends on the parent resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Azure resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Azure resource etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ApplicationResourceInner class.
     */
    public ApplicationResourceInner() {
    }

    /**
     * Get the identity property: Describes the managed identities for an Azure resource.
     * 
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Describes the managed identities for an Azure resource.
     * 
     * @param identity the identity value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: The application resource properties.
     * 
     * @return the innerProperties value.
     */
    private ApplicationResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: It will be deprecated in New API, resource location depends on the parent resource.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: It will be deprecated in New API, resource location depends on the parent resource.
     * 
     * @param location the location value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Azure resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Azure resource tags.
     * 
     * @param tags the tags value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the etag property: Azure resource etag.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the typeName property: The application type name as defined in the application manifest.
     * 
     * @return the typeName value.
     */
    public String typeName() {
        return this.innerProperties() == null ? null : this.innerProperties().typeName();
    }

    /**
     * Set the typeName property: The application type name as defined in the application manifest.
     * 
     * @param typeName the typeName value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withTypeName(String typeName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationResourceProperties();
        }
        this.innerProperties().withTypeName(typeName);
        return this;
    }

    /**
     * Get the typeVersion property: The version of the application type as defined in the application manifest.
     * 
     * @return the typeVersion value.
     */
    public String typeVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().typeVersion();
    }

    /**
     * Set the typeVersion property: The version of the application type as defined in the application manifest.
     * 
     * @param typeVersion the typeVersion value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withTypeVersion(String typeVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationResourceProperties();
        }
        this.innerProperties().withTypeVersion(typeVersion);
        return this;
    }

    /**
     * Get the parameters property: List of application parameters with overridden values from their default values
     * specified in the application manifest.
     * 
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: List of application parameters with overridden values from their default values
     * specified in the application manifest.
     * 
     * @param parameters the parameters value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withParameters(Map<String, String> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationResourceProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the upgradePolicy property: Describes the policy for a monitored application upgrade.
     * 
     * @return the upgradePolicy value.
     */
    public ApplicationUpgradePolicy upgradePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradePolicy();
    }

    /**
     * Set the upgradePolicy property: Describes the policy for a monitored application upgrade.
     * 
     * @param upgradePolicy the upgradePolicy value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withUpgradePolicy(ApplicationUpgradePolicy upgradePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationResourceProperties();
        }
        this.innerProperties().withUpgradePolicy(upgradePolicy);
        return this;
    }

    /**
     * Get the minimumNodes property: The minimum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more
     * than the value of the MaximumNodes property.
     * 
     * @return the minimumNodes value.
     */
    public Long minimumNodes() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumNodes();
    }

    /**
     * Set the minimumNodes property: The minimum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more
     * than the value of the MaximumNodes property.
     * 
     * @param minimumNodes the minimumNodes value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withMinimumNodes(Long minimumNodes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationResourceProperties();
        }
        this.innerProperties().withMinimumNodes(minimumNodes);
        return this;
    }

    /**
     * Get the maximumNodes property: The maximum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     * 
     * @return the maximumNodes value.
     */
    public Long maximumNodes() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumNodes();
    }

    /**
     * Set the maximumNodes property: The maximum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     * 
     * @param maximumNodes the maximumNodes value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withMaximumNodes(Long maximumNodes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationResourceProperties();
        }
        this.innerProperties().withMaximumNodes(maximumNodes);
        return this;
    }

    /**
     * Get the removeApplicationCapacity property: Remove the current application capacity settings.
     * 
     * @return the removeApplicationCapacity value.
     */
    public Boolean removeApplicationCapacity() {
        return this.innerProperties() == null ? null : this.innerProperties().removeApplicationCapacity();
    }

    /**
     * Set the removeApplicationCapacity property: Remove the current application capacity settings.
     * 
     * @param removeApplicationCapacity the removeApplicationCapacity value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withRemoveApplicationCapacity(Boolean removeApplicationCapacity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationResourceProperties();
        }
        this.innerProperties().withRemoveApplicationCapacity(removeApplicationCapacity);
        return this;
    }

    /**
     * Get the metrics property: List of application capacity metric description.
     * 
     * @return the metrics value.
     */
    public List<ApplicationMetricDescription> metrics() {
        return this.innerProperties() == null ? null : this.innerProperties().metrics();
    }

    /**
     * Set the metrics property: List of application capacity metric description.
     * 
     * @param metrics the metrics value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withMetrics(List<ApplicationMetricDescription> metrics) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationResourceProperties();
        }
        this.innerProperties().withMetrics(metrics);
        return this;
    }

    /**
     * Get the managedIdentities property: List of user assigned identities for the application, each mapped to a
     * friendly name.
     * 
     * @return the managedIdentities value.
     */
    public List<ApplicationUserAssignedIdentity> managedIdentities() {
        return this.innerProperties() == null ? null : this.innerProperties().managedIdentities();
    }

    /**
     * Set the managedIdentities property: List of user assigned identities for the application, each mapped to a
     * friendly name.
     * 
     * @param managedIdentities the managedIdentities value to set.
     * @return the ApplicationResourceInner object itself.
     */
    public ApplicationResourceInner withManagedIdentities(List<ApplicationUserAssignedIdentity> managedIdentities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationResourceProperties();
        }
        this.innerProperties().withManagedIdentities(managedIdentities);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
