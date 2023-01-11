// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a resource type that has been onboarded to private link service. */
@Fluent
public final class ShareablePrivateLinkResourceProperties {
    /*
     * The description of the resource type that has been onboarded to private link service
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The resource provider group id for the resource that has been onboarded to private link service
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * The resource provider type for the resource that has been onboarded to private link service
     */
    @JsonProperty(value = "type")
    private String type;

    /** Creates an instance of ShareablePrivateLinkResourceProperties class. */
    public ShareablePrivateLinkResourceProperties() {
    }

    /**
     * Get the description property: The description of the resource type that has been onboarded to private link
     * service.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the resource type that has been onboarded to private link
     * service.
     *
     * @param description the description value to set.
     * @return the ShareablePrivateLinkResourceProperties object itself.
     */
    public ShareablePrivateLinkResourceProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the groupId property: The resource provider group id for the resource that has been onboarded to private link
     * service.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The resource provider group id for the resource that has been onboarded to private link
     * service.
     *
     * @param groupId the groupId value to set.
     * @return the ShareablePrivateLinkResourceProperties object itself.
     */
    public ShareablePrivateLinkResourceProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the type property: The resource provider type for the resource that has been onboarded to private link
     * service.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource provider type for the resource that has been onboarded to private link
     * service.
     *
     * @param type the type value to set.
     * @return the ShareablePrivateLinkResourceProperties object itself.
     */
    public ShareablePrivateLinkResourceProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
