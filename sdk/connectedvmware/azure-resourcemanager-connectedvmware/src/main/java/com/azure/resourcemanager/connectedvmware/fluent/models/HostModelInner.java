// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;
import com.azure.resourcemanager.connectedvmware.models.ResourceStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Define the host. */
@Fluent
public final class HostModelInner extends Resource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private HostProperties innerProperties = new HostProperties();

    /*
     * Gets or sets the extended location.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * The system data.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g.
     * ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist
     * this value.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private HostProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the extendedLocation property: Gets or sets the extended location.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: Gets or sets the extended location.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the HostModelInner object itself.
     */
    public HostModelInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the systemData property: The system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider must
     * validate and persist this value.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider must
     * validate and persist this value.
     *
     * @param kind the kind value to set.
     * @return the HostModelInner object itself.
     */
    public HostModelInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostModelInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostModelInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the uuid property: Gets or sets a unique identifier for this resource.
     *
     * @return the uuid value.
     */
    public String uuid() {
        return this.innerProperties() == null ? null : this.innerProperties().uuid();
    }

    /**
     * Get the vCenterId property: Gets or sets the ARM Id of the vCenter resource in which this host resides.
     *
     * @return the vCenterId value.
     */
    public String vCenterId() {
        return this.innerProperties() == null ? null : this.innerProperties().vCenterId();
    }

    /**
     * Set the vCenterId property: Gets or sets the ARM Id of the vCenter resource in which this host resides.
     *
     * @param vCenterId the vCenterId value to set.
     * @return the HostModelInner object itself.
     */
    public HostModelInner withVCenterId(String vCenterId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostProperties();
        }
        this.innerProperties().withVCenterId(vCenterId);
        return this;
    }

    /**
     * Get the moRefId property: Gets or sets the vCenter MoRef (Managed Object Reference) ID for the host.
     *
     * @return the moRefId value.
     */
    public String moRefId() {
        return this.innerProperties() == null ? null : this.innerProperties().moRefId();
    }

    /**
     * Set the moRefId property: Gets or sets the vCenter MoRef (Managed Object Reference) ID for the host.
     *
     * @param moRefId the moRefId value to set.
     * @return the HostModelInner object itself.
     */
    public HostModelInner withMoRefId(String moRefId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostProperties();
        }
        this.innerProperties().withMoRefId(moRefId);
        return this;
    }

    /**
     * Get the inventoryItemId property: Gets or sets the inventory Item ID for the host.
     *
     * @return the inventoryItemId value.
     */
    public String inventoryItemId() {
        return this.innerProperties() == null ? null : this.innerProperties().inventoryItemId();
    }

    /**
     * Set the inventoryItemId property: Gets or sets the inventory Item ID for the host.
     *
     * @param inventoryItemId the inventoryItemId value to set.
     * @return the HostModelInner object itself.
     */
    public HostModelInner withInventoryItemId(String inventoryItemId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostProperties();
        }
        this.innerProperties().withInventoryItemId(inventoryItemId);
        return this;
    }

    /**
     * Get the moName property: Gets or sets the vCenter Managed Object name for the host.
     *
     * @return the moName value.
     */
    public String moName() {
        return this.innerProperties() == null ? null : this.innerProperties().moName();
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<ResourceStatus> statuses() {
        return this.innerProperties() == null ? null : this.innerProperties().statuses();
    }

    /**
     * Get the customResourceName property: Gets the name of the corresponding resource in Kubernetes.
     *
     * @return the customResourceName value.
     */
    public String customResourceName() {
        return this.innerProperties() == null ? null : this.innerProperties().customResourceName();
    }

    /**
     * Get the provisioningState property: Gets or sets the provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model HostModelInner"));
        } else {
            innerProperties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HostModelInner.class);
}
