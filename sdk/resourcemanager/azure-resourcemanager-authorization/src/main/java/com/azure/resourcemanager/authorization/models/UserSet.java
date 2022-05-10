// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The detail of a user. */
@Fluent
public final class UserSet {
    /*
     * The type of user.
     */
    @JsonProperty(value = "userType")
    private UserType userType;

    /*
     * The value indicating whether the user is a backup fallback approver
     */
    @JsonProperty(value = "isBackup")
    private Boolean isBackup;

    /*
     * The object id of the user.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The description of the user.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the userType property: The type of user.
     *
     * @return the userType value.
     */
    public UserType userType() {
        return this.userType;
    }

    /**
     * Set the userType property: The type of user.
     *
     * @param userType the userType value to set.
     * @return the UserSet object itself.
     */
    public UserSet withUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

    /**
     * Get the isBackup property: The value indicating whether the user is a backup fallback approver.
     *
     * @return the isBackup value.
     */
    public Boolean isBackup() {
        return this.isBackup;
    }

    /**
     * Set the isBackup property: The value indicating whether the user is a backup fallback approver.
     *
     * @param isBackup the isBackup value to set.
     * @return the UserSet object itself.
     */
    public UserSet withIsBackup(Boolean isBackup) {
        this.isBackup = isBackup;
        return this;
    }

    /**
     * Get the id property: The object id of the user.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The object id of the user.
     *
     * @param id the id value to set.
     * @return the UserSet object itself.
     */
    public UserSet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the description property: The description of the user.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the user.
     *
     * @param description the description value to set.
     * @return the UserSet object itself.
     */
    public UserSet withDescription(String description) {
        this.description = description;
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
