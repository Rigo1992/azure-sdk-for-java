// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** The DataConnection model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = DataConnection.class)
@JsonTypeName("DataConnection")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "logAnalytics", value = LogAnalyticsDataConnection.class),
    @JsonSubTypes.Type(name = "azureDataExplorer", value = AzureDataExplorerDataConnection.class)
})
@Immutable
public class DataConnection {
    /*
     * The system generated unique id for the resource.
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * The caller provided unique name for the resource.
     */
    @Generated
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The name that can be used for display purposes.
     */
    @Generated
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The type of data the data connection will transfer
     */
    @Generated
    @JsonProperty(value = "content")
    private DataConnectionContent content;

    /*
     * The date the data connection was created.
     */
    @Generated
    @JsonProperty(value = "createdDate")
    private OffsetDateTime createdDate;

    /*
     * The rate at which the data connection will receive updates.
     */
    @Generated
    @JsonProperty(value = "frequency")
    private DataConnectionFrequency frequency;

    /*
     * The day to update the data connection on.
     */
    @Generated
    @JsonProperty(value = "frequencyOffset")
    private Integer frequencyOffset;

    /*
     * The date the data connection was last updated.
     */
    @Generated
    @JsonProperty(value = "updatedDate")
    private OffsetDateTime updatedDate;

    /*
     * The date the data connection was last updated by user.
     */
    @Generated
    @JsonProperty(value = "userUpdatedAt")
    private OffsetDateTime userUpdatedAt;

    /*
     * An indicator of whether the data connection is active.
     */
    @Generated
    @JsonProperty(value = "active")
    private Boolean active;

    /*
     * A message that specifies details about data connection if inactive.
     */
    @Generated
    @JsonProperty(value = "inactiveMessage")
    private String inactiveMessage;

    /** Creates an instance of DataConnection class. */
    @Generated
    protected DataConnection() {}

    /**
     * Get the id property: The system generated unique id for the resource.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The caller provided unique name for the resource.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the displayName property: The name that can be used for display purposes.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the content property: The type of data the data connection will transfer.
     *
     * @return the content value.
     */
    @Generated
    public DataConnectionContent getContent() {
        return this.content;
    }

    /**
     * Get the createdDate property: The date the data connection was created.
     *
     * @return the createdDate value.
     */
    @Generated
    public OffsetDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Get the frequency property: The rate at which the data connection will receive updates.
     *
     * @return the frequency value.
     */
    @Generated
    public DataConnectionFrequency getFrequency() {
        return this.frequency;
    }

    /**
     * Get the frequencyOffset property: The day to update the data connection on.
     *
     * @return the frequencyOffset value.
     */
    @Generated
    public Integer getFrequencyOffset() {
        return this.frequencyOffset;
    }

    /**
     * Get the updatedDate property: The date the data connection was last updated.
     *
     * @return the updatedDate value.
     */
    @Generated
    public OffsetDateTime getUpdatedDate() {
        return this.updatedDate;
    }

    /**
     * Get the userUpdatedAt property: The date the data connection was last updated by user.
     *
     * @return the userUpdatedAt value.
     */
    @Generated
    public OffsetDateTime getUserUpdatedAt() {
        return this.userUpdatedAt;
    }

    /**
     * Get the active property: An indicator of whether the data connection is active.
     *
     * @return the active value.
     */
    @Generated
    public Boolean isActive() {
        return this.active;
    }

    /**
     * Get the inactiveMessage property: A message that specifies details about data connection if inactive.
     *
     * @return the inactiveMessage value.
     */
    @Generated
    public String getInactiveMessage() {
        return this.inactiveMessage;
    }
}
