// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Autoscale notification.
 */
@Fluent
public final class AutoscaleNotification {
    /*
     * the operation associated with the notification and its value must be "scale"
     */
    @JsonProperty(value = "operation", required = true)
    private String operation = "Scale";

    /*
     * the email notification.
     */
    @JsonProperty(value = "email")
    private EmailNotification email;

    /*
     * the collection of webhook notifications.
     */
    @JsonProperty(value = "webhooks")
    private List<WebhookNotification> webhooks;

    /**
     * Creates an instance of AutoscaleNotification class.
     */
    public AutoscaleNotification() {
        operation = "Scale";
    }

    /**
     * Get the operation property: the operation associated with the notification and its value must be "scale".
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: the operation associated with the notification and its value must be "scale".
     *
     * @param operation the operation value to set.
     * @return the AutoscaleNotification object itself.
     */
    public AutoscaleNotification withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the email property: the email notification.
     *
     * @return the email value.
     */
    public EmailNotification email() {
        return this.email;
    }

    /**
     * Set the email property: the email notification.
     *
     * @param email the email value to set.
     * @return the AutoscaleNotification object itself.
     */
    public AutoscaleNotification withEmail(EmailNotification email) {
        this.email = email;
        return this;
    }

    /**
     * Get the webhooks property: the collection of webhook notifications.
     *
     * @return the webhooks value.
     */
    public List<WebhookNotification> webhooks() {
        return this.webhooks;
    }

    /**
     * Set the webhooks property: the collection of webhook notifications.
     *
     * @param webhooks the webhooks value to set.
     * @return the AutoscaleNotification object itself.
     */
    public AutoscaleNotification withWebhooks(List<WebhookNotification> webhooks) {
        this.webhooks = webhooks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (email() != null) {
            email().validate();
        }
        if (webhooks() != null) {
            webhooks().forEach(e -> e.validate());
        }
    }
}
