// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.communication.models.CommunicationServicesProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A class representing a CommunicationService resource. */
@Fluent
public final class CommunicationServiceResourceInner extends Resource {
    /*
     * The properties of the service.
     */
    @JsonProperty(value = "properties")
    private CommunicationServiceProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of the service.
     *
     * @return the innerProperties value.
     */
    private CommunicationServiceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public CommunicationServiceResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommunicationServiceResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public CommunicationServicesProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the hostname property: FQDN of the CommunicationService instance.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the dataLocation property: The location where the communication service stores its data at rest.
     *
     * @return the dataLocation value.
     */
    public String dataLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().dataLocation();
    }

    /**
     * Set the dataLocation property: The location where the communication service stores its data at rest.
     *
     * @param dataLocation the dataLocation value to set.
     * @return the CommunicationServiceResourceInner object itself.
     */
    public CommunicationServiceResourceInner withDataLocation(String dataLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationServiceProperties();
        }
        this.innerProperties().withDataLocation(dataLocation);
        return this;
    }

    /**
     * Get the notificationHubId property: Resource ID of an Azure Notification Hub linked to this resource.
     *
     * @return the notificationHubId value.
     */
    public String notificationHubId() {
        return this.innerProperties() == null ? null : this.innerProperties().notificationHubId();
    }

    /**
     * Get the version property: Version of the CommunicationService resource. Probably you need the same or higher
     * version of client SDKs.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the immutableResourceId property: The immutable resource Id of the communication service.
     *
     * @return the immutableResourceId value.
     */
    public String immutableResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().immutableResourceId();
    }

    /**
     * Get the linkedDomains property: List of email Domain resource Ids.
     *
     * @return the linkedDomains value.
     */
    public List<String> linkedDomains() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedDomains();
    }

    /**
     * Set the linkedDomains property: List of email Domain resource Ids.
     *
     * @param linkedDomains the linkedDomains value to set.
     * @return the CommunicationServiceResourceInner object itself.
     */
    public CommunicationServiceResourceInner withLinkedDomains(List<String> linkedDomains) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationServiceProperties();
        }
        this.innerProperties().withLinkedDomains(linkedDomains);
        return this;
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
