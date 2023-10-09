// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.containerregistry.models.ArchivePackageSourceProperties;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object that represents a archive for a container registry. */
@Fluent
public final class ArchiveInner extends ProxyResource {
    /*
     * The properties of the archive.
     */
    @JsonProperty(value = "properties")
    private ArchiveProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ArchiveInner class. */
    public ArchiveInner() {
    }

    /**
     * Get the innerProperties property: The properties of the archive.
     *
     * @return the innerProperties value.
     */
    private ArchiveProperties innerProperties() {
        return this.innerProperties;
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
     * Get the packageSource property: The package source of the archive.
     *
     * @return the packageSource value.
     */
    public ArchivePackageSourceProperties packageSource() {
        return this.innerProperties() == null ? null : this.innerProperties().packageSource();
    }

    /**
     * Set the packageSource property: The package source of the archive.
     *
     * @param packageSource the packageSource value to set.
     * @return the ArchiveInner object itself.
     */
    public ArchiveInner withPackageSource(ArchivePackageSourceProperties packageSource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArchiveProperties();
        }
        this.innerProperties().withPackageSource(packageSource);
        return this;
    }

    /**
     * Get the publishedVersion property: The published version of the archive.
     *
     * @return the publishedVersion value.
     */
    public String publishedVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().publishedVersion();
    }

    /**
     * Set the publishedVersion property: The published version of the archive.
     *
     * @param publishedVersion the publishedVersion value to set.
     * @return the ArchiveInner object itself.
     */
    public ArchiveInner withPublishedVersion(String publishedVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArchiveProperties();
        }
        this.innerProperties().withPublishedVersion(publishedVersion);
        return this;
    }

    /**
     * Get the repositoryEndpointPrefix property: The repositoryEndpointPrefix property.
     *
     * @return the repositoryEndpointPrefix value.
     */
    public String repositoryEndpointPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().repositoryEndpointPrefix();
    }

    /**
     * Set the repositoryEndpointPrefix property: The repositoryEndpointPrefix property.
     *
     * @param repositoryEndpointPrefix the repositoryEndpointPrefix value to set.
     * @return the ArchiveInner object itself.
     */
    public ArchiveInner withRepositoryEndpointPrefix(String repositoryEndpointPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArchiveProperties();
        }
        this.innerProperties().withRepositoryEndpointPrefix(repositoryEndpointPrefix);
        return this;
    }

    /**
     * Get the repositoryEndpoint property: The repositoryEndpoint property.
     *
     * @return the repositoryEndpoint value.
     */
    public String repositoryEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().repositoryEndpoint();
    }

    /**
     * Get the provisioningState property: The provisioning state of the archive at the time the operation was called.
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
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
