// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/**
 * Specifies the action to post to service when the rule condition is evaluated. The discriminator is always
 * RuleWebhookAction in this case.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Microsoft.Azure.Management.Insights.Models.RuleWebhookAction")
@Fluent
public final class RuleWebhookAction extends RuleAction {
    /*
     * the service uri to Post the notification when the alert activates or resolves.
     */
    @JsonProperty(value = "serviceUri")
    private String serviceUri;

    /*
     * the dictionary of custom properties to include with the post operation. These data are appended to the webhook
     * payload.
     */
    @JsonProperty(value = "properties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> properties;

    /**
     * Creates an instance of RuleWebhookAction class.
     */
    public RuleWebhookAction() {
    }

    /**
     * Get the serviceUri property: the service uri to Post the notification when the alert activates or resolves.
     *
     * @return the serviceUri value.
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: the service uri to Post the notification when the alert activates or resolves.
     *
     * @param serviceUri the serviceUri value to set.
     * @return the RuleWebhookAction object itself.
     */
    public RuleWebhookAction withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the properties property: the dictionary of custom properties to include with the post operation. These data
     * are appended to the webhook payload.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: the dictionary of custom properties to include with the post operation. These data
     * are appended to the webhook payload.
     *
     * @param properties the properties value to set.
     * @return the RuleWebhookAction object itself.
     */
    public RuleWebhookAction withProperties(Map<String, String> properties) {
        this.properties = properties;
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
