// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.fluent.models.ProjectUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The project properties for partial update. Properties not provided in the update request will not be changed.
 */
@Fluent
public final class ProjectUpdate extends TrackedResourceUpdate {
    /*
     * Properties of a project to be updated.
     */
    @JsonProperty(value = "properties")
    private ProjectUpdateProperties innerProperties;

    /*
     * Managed identity properties
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /**
     * Creates an instance of ProjectUpdate class.
     */
    public ProjectUpdate() {
    }

    /**
     * Get the innerProperties property: Properties of a project to be updated.
     * 
     * @return the innerProperties value.
     */
    private ProjectUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: Managed identity properties.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity properties.
     * 
     * @param identity the identity value to set.
     * @return the ProjectUpdate object itself.
     */
    public ProjectUpdate withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectUpdate withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Get the devCenterId property: Resource Id of an associated DevCenter.
     * 
     * @return the devCenterId value.
     */
    public String devCenterId() {
        return this.innerProperties() == null ? null : this.innerProperties().devCenterId();
    }

    /**
     * Set the devCenterId property: Resource Id of an associated DevCenter.
     * 
     * @param devCenterId the devCenterId value to set.
     * @return the ProjectUpdate object itself.
     */
    public ProjectUpdate withDevCenterId(String devCenterId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProjectUpdateProperties();
        }
        this.innerProperties().withDevCenterId(devCenterId);
        return this;
    }

    /**
     * Get the description property: Description of the project.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the project.
     * 
     * @param description the description value to set.
     * @return the ProjectUpdate object itself.
     */
    public ProjectUpdate withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProjectUpdateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the maxDevBoxesPerUser property: When specified, limits the maximum number of Dev Boxes a single user can
     * create across all pools in the project. This will have no effect on existing Dev Boxes when reduced.
     * 
     * @return the maxDevBoxesPerUser value.
     */
    public Integer maxDevBoxesPerUser() {
        return this.innerProperties() == null ? null : this.innerProperties().maxDevBoxesPerUser();
    }

    /**
     * Set the maxDevBoxesPerUser property: When specified, limits the maximum number of Dev Boxes a single user can
     * create across all pools in the project. This will have no effect on existing Dev Boxes when reduced.
     * 
     * @param maxDevBoxesPerUser the maxDevBoxesPerUser value to set.
     * @return the ProjectUpdate object itself.
     */
    public ProjectUpdate withMaxDevBoxesPerUser(Integer maxDevBoxesPerUser) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProjectUpdateProperties();
        }
        this.innerProperties().withMaxDevBoxesPerUser(maxDevBoxesPerUser);
        return this;
    }

    /**
     * Get the displayName property: The display name of the project.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the project.
     * 
     * @param displayName the displayName value to set.
     * @return the ProjectUpdate object itself.
     */
    public ProjectUpdate withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProjectUpdateProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the catalogSettings property: Settings to be used when associating a project with a catalog.
     * 
     * @return the catalogSettings value.
     */
    public ProjectCatalogSettings catalogSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().catalogSettings();
    }

    /**
     * Set the catalogSettings property: Settings to be used when associating a project with a catalog.
     * 
     * @param catalogSettings the catalogSettings value to set.
     * @return the ProjectUpdate object itself.
     */
    public ProjectUpdate withCatalogSettings(ProjectCatalogSettings catalogSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProjectUpdateProperties();
        }
        this.innerProperties().withCatalogSettings(catalogSettings);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
