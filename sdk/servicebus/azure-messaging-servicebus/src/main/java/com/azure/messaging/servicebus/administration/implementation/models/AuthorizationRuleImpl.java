// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.servicebus.administration.models.AccessRights;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/** Authorization rule of an entity. */
@JacksonXmlRootElement(
        localName = "AuthorizationRule",
        namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
@Fluent
public final class AuthorizationRuleImpl {

    /*
     * The authorization type.
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true, namespace = "http://www.w3.org/2001/XMLSchema-instance")
    private String type;

    /*
     * The claim type.
     */
    @JacksonXmlProperty(
            localName = "ClaimType",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String claimType;

    /*
     * The claim value.
     */
    @JacksonXmlProperty(
            localName = "ClaimValue",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String claimValue;

    private static final class RightsWrapper {

        @JacksonXmlProperty(
                localName = "AccessRights",
                namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
        private final List<AccessRights> items;

        @JsonCreator
        private RightsWrapper(
                @JacksonXmlProperty(
                                localName = "AccessRights",
                                namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
                        List<AccessRights> items) {
            this.items = items;
        }
    }

    /*
     * Access rights of the entity. Values are 'Send', 'Listen', or 'Manage'
     */
    @JacksonXmlProperty(
            localName = "Rights",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private RightsWrapper rights;

    /*
     * The date and time when the authorization rule was created.
     */
    @JacksonXmlProperty(
            localName = "CreatedTime",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime createdTime;

    /*
     * The date and time when the authorization rule was modified.
     */
    @JacksonXmlProperty(
            localName = "ModifiedTime",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime modifiedTime;

    /*
     * The authorization rule key name
     */
    @JacksonXmlProperty(
            localName = "KeyName",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String keyName;

    /*
     * The primary key of the authorization rule
     */
    @JacksonXmlProperty(
            localName = "PrimaryKey",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String primaryKey;

    /*
     * The primary key of the authorization rule
     */
    @JacksonXmlProperty(
            localName = "SecondaryKey",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String secondaryKey;

    /** Creates an instance of AuthorizationRule class. */
    public AuthorizationRuleImpl() {}

    /**
     * Get the type property: The authorization type.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The authorization type.
     *
     * @param type the type value to set.
     * @return the AuthorizationRule object itself.
     */
    public AuthorizationRuleImpl setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the claimType property: The claim type.
     *
     * @return the claimType value.
     */
    public String getClaimType() {
        return this.claimType;
    }

    /**
     * Set the claimType property: The claim type.
     *
     * @param claimType the claimType value to set.
     * @return the AuthorizationRule object itself.
     */
    public AuthorizationRuleImpl setClaimType(String claimType) {
        this.claimType = claimType;
        return this;
    }

    /**
     * Get the claimValue property: The claim value.
     *
     * @return the claimValue value.
     */
    public String getClaimValue() {
        return this.claimValue;
    }

    /**
     * Set the claimValue property: The claim value.
     *
     * @param claimValue the claimValue value to set.
     * @return the AuthorizationRule object itself.
     */
    public AuthorizationRuleImpl setClaimValue(String claimValue) {
        this.claimValue = claimValue;
        return this;
    }

    /**
     * Get the rights property: Access rights of the entity. Values are 'Send', 'Listen', or 'Manage'.
     *
     * @return the rights value.
     */
    public List<AccessRights> getRights() {
        if (this.rights == null) {
            this.rights = new RightsWrapper(new ArrayList<AccessRights>());
        }
        return this.rights.items;
    }

    /**
     * Set the rights property: Access rights of the entity. Values are 'Send', 'Listen', or 'Manage'.
     *
     * @param rights the rights value to set.
     * @return the AuthorizationRule object itself.
     */
    public AuthorizationRuleImpl setRights(List<AccessRights> rights) {
        this.rights = new RightsWrapper(rights);
        return this;
    }

    /**
     * Get the createdTime property: The date and time when the authorization rule was created.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: The date and time when the authorization rule was created.
     *
     * @param createdTime the createdTime value to set.
     * @return the AuthorizationRule object itself.
     */
    public AuthorizationRuleImpl setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the modifiedTime property: The date and time when the authorization rule was modified.
     *
     * @return the modifiedTime value.
     */
    public OffsetDateTime getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * Set the modifiedTime property: The date and time when the authorization rule was modified.
     *
     * @param modifiedTime the modifiedTime value to set.
     * @return the AuthorizationRule object itself.
     */
    public AuthorizationRuleImpl setModifiedTime(OffsetDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * Get the keyName property: The authorization rule key name.
     *
     * @return the keyName value.
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The authorization rule key name.
     *
     * @param keyName the keyName value to set.
     * @return the AuthorizationRule object itself.
     */
    public AuthorizationRuleImpl setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the primaryKey property: The primary key of the authorization rule.
     *
     * @return the primaryKey value.
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: The primary key of the authorization rule.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the AuthorizationRule object itself.
     */
    public AuthorizationRuleImpl setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey property: The primary key of the authorization rule.
     *
     * @return the secondaryKey value.
     */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey property: The primary key of the authorization rule.
     *
     * @param secondaryKey the secondaryKey value to set.
     * @return the AuthorizationRule object itself.
     */
    public AuthorizationRuleImpl setSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }
}
