// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.models.TopicSpaceProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties of topic space.
 */
@Fluent
public final class TopicSpaceProperties {
    /*
     * Description for the Topic Space resource.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The topic filters in the topic space.
     * Example: "topicTemplates": [ 
     *               "devices/foo/bar",
     *               "devices/topic1/+",
     *               "devices/${principal.name}/${principal.attributes.keyName}" ].
     */
    @JsonProperty(value = "topicTemplates")
    private List<String> topicTemplates;

    /*
     * Provisioning state of the TopicSpace resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private TopicSpaceProvisioningState provisioningState;

    /**
     * Creates an instance of TopicSpaceProperties class.
     */
    public TopicSpaceProperties() {
    }

    /**
     * Get the description property: Description for the Topic Space resource.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for the Topic Space resource.
     * 
     * @param description the description value to set.
     * @return the TopicSpaceProperties object itself.
     */
    public TopicSpaceProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the topicTemplates property: The topic filters in the topic space.
     * Example: "topicTemplates": [
     * "devices/foo/bar",
     * "devices/topic1/+",
     * "devices/${principal.name}/${principal.attributes.keyName}" ].
     * 
     * @return the topicTemplates value.
     */
    public List<String> topicTemplates() {
        return this.topicTemplates;
    }

    /**
     * Set the topicTemplates property: The topic filters in the topic space.
     * Example: "topicTemplates": [
     * "devices/foo/bar",
     * "devices/topic1/+",
     * "devices/${principal.name}/${principal.attributes.keyName}" ].
     * 
     * @param topicTemplates the topicTemplates value to set.
     * @return the TopicSpaceProperties object itself.
     */
    public TopicSpaceProperties withTopicTemplates(List<String> topicTemplates) {
        this.topicTemplates = topicTemplates;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the TopicSpace resource.
     * 
     * @return the provisioningState value.
     */
    public TopicSpaceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
