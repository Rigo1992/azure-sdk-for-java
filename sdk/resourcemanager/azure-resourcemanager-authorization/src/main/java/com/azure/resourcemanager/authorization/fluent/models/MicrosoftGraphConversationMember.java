// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** conversationMember. */
@Fluent
public final class MicrosoftGraphConversationMember extends MicrosoftGraphEntity {
    /*
     * The display name of the user.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The roles for that user.
     */
    @JsonProperty(value = "roles")
    private List<String> roles;

    /*
     * conversationMember
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the displayName property: The display name of the user.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the user.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphConversationMember object itself.
     */
    public MicrosoftGraphConversationMember withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the roles property: The roles for that user.
     *
     * @return the roles value.
     */
    public List<String> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The roles for that user.
     *
     * @param roles the roles value to set.
     * @return the MicrosoftGraphConversationMember object itself.
     */
    public MicrosoftGraphConversationMember withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the additionalProperties property: conversationMember.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: conversationMember.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphConversationMember object itself.
     */
    public MicrosoftGraphConversationMember withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphConversationMember withId(String id) {
        super.withId(id);
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
    }
}
