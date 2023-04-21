// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.fluent.models.StorageMigrationOptionsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Options for app content migration. */
@Fluent
public final class StorageMigrationOptions extends ProxyOnlyResource {
    /*
     * StorageMigrationOptions resource specific properties
     */
    @JsonProperty(value = "properties")
    private StorageMigrationOptionsProperties innerProperties;

    /** Creates an instance of StorageMigrationOptions class. */
    public StorageMigrationOptions() {
    }

    /**
     * Get the innerProperties property: StorageMigrationOptions resource specific properties.
     *
     * @return the innerProperties value.
     */
    private StorageMigrationOptionsProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StorageMigrationOptions withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the azurefilesConnectionString property: AzureFiles connection string.
     *
     * @return the azurefilesConnectionString value.
     */
    public String azurefilesConnectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().azurefilesConnectionString();
    }

    /**
     * Set the azurefilesConnectionString property: AzureFiles connection string.
     *
     * @param azurefilesConnectionString the azurefilesConnectionString value to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withAzurefilesConnectionString(String azurefilesConnectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageMigrationOptionsProperties();
        }
        this.innerProperties().withAzurefilesConnectionString(azurefilesConnectionString);
        return this;
    }

    /**
     * Get the azurefilesShare property: AzureFiles share.
     *
     * @return the azurefilesShare value.
     */
    public String azurefilesShare() {
        return this.innerProperties() == null ? null : this.innerProperties().azurefilesShare();
    }

    /**
     * Set the azurefilesShare property: AzureFiles share.
     *
     * @param azurefilesShare the azurefilesShare value to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withAzurefilesShare(String azurefilesShare) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageMigrationOptionsProperties();
        }
        this.innerProperties().withAzurefilesShare(azurefilesShare);
        return this;
    }

    /**
     * Get the switchSiteAfterMigration property: &lt;code&gt;true&lt;/code&gt;if the app should be switched over;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the switchSiteAfterMigration value.
     */
    public Boolean switchSiteAfterMigration() {
        return this.innerProperties() == null ? null : this.innerProperties().switchSiteAfterMigration();
    }

    /**
     * Set the switchSiteAfterMigration property: &lt;code&gt;true&lt;/code&gt;if the app should be switched over;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param switchSiteAfterMigration the switchSiteAfterMigration value to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withSwitchSiteAfterMigration(Boolean switchSiteAfterMigration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageMigrationOptionsProperties();
        }
        this.innerProperties().withSwitchSiteAfterMigration(switchSiteAfterMigration);
        return this;
    }

    /**
     * Get the blockWriteAccessToSite property: &lt;code&gt;true&lt;/code&gt; if the app should be read only during copy
     * operation; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the blockWriteAccessToSite value.
     */
    public Boolean blockWriteAccessToSite() {
        return this.innerProperties() == null ? null : this.innerProperties().blockWriteAccessToSite();
    }

    /**
     * Set the blockWriteAccessToSite property: &lt;code&gt;true&lt;/code&gt; if the app should be read only during copy
     * operation; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param blockWriteAccessToSite the blockWriteAccessToSite value to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withBlockWriteAccessToSite(Boolean blockWriteAccessToSite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageMigrationOptionsProperties();
        }
        this.innerProperties().withBlockWriteAccessToSite(blockWriteAccessToSite);
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
    }
}
