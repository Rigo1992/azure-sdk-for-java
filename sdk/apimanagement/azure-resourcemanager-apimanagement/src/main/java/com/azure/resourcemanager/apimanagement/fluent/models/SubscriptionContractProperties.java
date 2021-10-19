// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.SubscriptionState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Subscription details. */
@Fluent
public final class SubscriptionContractProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubscriptionContractProperties.class);

    /*
     * The user resource identifier of the subscription owner. The value is a
     * valid relative URL in the format of /users/{userId} where {userId} is a
     * user identifier.
     */
    @JsonProperty(value = "ownerId")
    private String ownerId;

    /*
     * Scope like /products/{productId} or /apis or /apis/{apiId}.
     */
    @JsonProperty(value = "scope", required = true)
    private String scope;

    /*
     * The name of the subscription, or null if the subscription has no name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Subscription state. Possible states are * active – the subscription is
     * active, * suspended – the subscription is blocked, and the subscriber
     * cannot call any APIs of the product, * submitted – the subscription
     * request has been made by the developer, but has not yet been approved or
     * rejected, * rejected – the subscription request has been denied by an
     * administrator, * cancelled – the subscription has been cancelled by the
     * developer or administrator, * expired – the subscription reached its
     * expiration date and was deactivated.
     */
    @JsonProperty(value = "state", required = true)
    private SubscriptionState state;

    /*
     * Subscription creation date. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     */
    @JsonProperty(value = "createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * Subscription activation date. The setting is for audit purposes only and
     * the subscription is not automatically activated. The subscription
     * lifecycle can be managed by using the `state` property. The date
     * conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by
     * the ISO 8601 standard.
     *
     */
    @JsonProperty(value = "startDate")
    private OffsetDateTime startDate;

    /*
     * Subscription expiration date. The setting is for audit purposes only and
     * the subscription is not automatically expired. The subscription
     * lifecycle can be managed by using the `state` property. The date
     * conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by
     * the ISO 8601 standard.
     *
     */
    @JsonProperty(value = "expirationDate")
    private OffsetDateTime expirationDate;

    /*
     * Date when subscription was cancelled or expired. The setting is for
     * audit purposes only and the subscription is not automatically cancelled.
     * The subscription lifecycle can be managed by using the `state` property.
     * The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as
     * specified by the ISO 8601 standard.
     *
     */
    @JsonProperty(value = "endDate")
    private OffsetDateTime endDate;

    /*
     * Upcoming subscription expiration notification date. The date conforms to
     * the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO
     * 8601 standard.
     *
     */
    @JsonProperty(value = "notificationDate")
    private OffsetDateTime notificationDate;

    /*
     * Subscription primary key. This property will not be filled on 'GET'
     * operations! Use '/listSecrets' POST request to get the value.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /*
     * Subscription secondary key. This property will not be filled on 'GET'
     * operations! Use '/listSecrets' POST request to get the value.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /*
     * Optional subscription comment added by an administrator when the state
     * is changed to the 'rejected'.
     */
    @JsonProperty(value = "stateComment")
    private String stateComment;

    /*
     * Determines whether tracing is enabled
     */
    @JsonProperty(value = "allowTracing")
    private Boolean allowTracing;

    /**
     * Get the ownerId property: The user resource identifier of the subscription owner. The value is a valid relative
     * URL in the format of /users/{userId} where {userId} is a user identifier.
     *
     * @return the ownerId value.
     */
    public String ownerId() {
        return this.ownerId;
    }

    /**
     * Set the ownerId property: The user resource identifier of the subscription owner. The value is a valid relative
     * URL in the format of /users/{userId} where {userId} is a user identifier.
     *
     * @param ownerId the ownerId value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Get the scope property: Scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @param scope the scope value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the displayName property: The name of the subscription, or null if the subscription has no name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the subscription, or null if the subscription has no name.
     *
     * @param displayName the displayName value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the state property: Subscription state. Possible states are * active – the subscription is active, *
     * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted –
     * the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected –
     * the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled
     * by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     *
     * @return the state value.
     */
    public SubscriptionState state() {
        return this.state;
    }

    /**
     * Set the state property: Subscription state. Possible states are * active – the subscription is active, *
     * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted –
     * the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected –
     * the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled
     * by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     *
     * @param state the state value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withState(SubscriptionState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the createdDate property: Subscription creation date. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the startDate property: Subscription activation date. The setting is for audit purposes only and the
     * subscription is not automatically activated. The subscription lifecycle can be managed by using the `state`
     * property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: Subscription activation date. The setting is for audit purposes only and the
     * subscription is not automatically activated. The subscription lifecycle can be managed by using the `state`
     * property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @param startDate the startDate value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the expirationDate property: Subscription expiration date. The setting is for audit purposes only and the
     * subscription is not automatically expired. The subscription lifecycle can be managed by using the `state`
     * property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate property: Subscription expiration date. The setting is for audit purposes only and the
     * subscription is not automatically expired. The subscription lifecycle can be managed by using the `state`
     * property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @param expirationDate the expirationDate value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get the endDate property: Date when subscription was cancelled or expired. The setting is for audit purposes only
     * and the subscription is not automatically cancelled. The subscription lifecycle can be managed by using the
     * `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: Date when subscription was cancelled or expired. The setting is for audit purposes only
     * and the subscription is not automatically cancelled. The subscription lifecycle can be managed by using the
     * `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @param endDate the endDate value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the notificationDate property: Upcoming subscription expiration notification date. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the notificationDate value.
     */
    public OffsetDateTime notificationDate() {
        return this.notificationDate;
    }

    /**
     * Set the notificationDate property: Upcoming subscription expiration notification date. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param notificationDate the notificationDate value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withNotificationDate(OffsetDateTime notificationDate) {
        this.notificationDate = notificationDate;
        return this;
    }

    /**
     * Get the primaryKey property: Subscription primary key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: Subscription primary key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey property: Subscription secondary key. This property will not be filled on 'GET' operations!
     * Use '/listSecrets' POST request to get the value.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey property: Subscription secondary key. This property will not be filled on 'GET' operations!
     * Use '/listSecrets' POST request to get the value.
     *
     * @param secondaryKey the secondaryKey value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Get the stateComment property: Optional subscription comment added by an administrator when the state is changed
     * to the 'rejected'.
     *
     * @return the stateComment value.
     */
    public String stateComment() {
        return this.stateComment;
    }

    /**
     * Set the stateComment property: Optional subscription comment added by an administrator when the state is changed
     * to the 'rejected'.
     *
     * @param stateComment the stateComment value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withStateComment(String stateComment) {
        this.stateComment = stateComment;
        return this;
    }

    /**
     * Get the allowTracing property: Determines whether tracing is enabled.
     *
     * @return the allowTracing value.
     */
    public Boolean allowTracing() {
        return this.allowTracing;
    }

    /**
     * Set the allowTracing property: Determines whether tracing is enabled.
     *
     * @param allowTracing the allowTracing value to set.
     * @return the SubscriptionContractProperties object itself.
     */
    public SubscriptionContractProperties withAllowTracing(Boolean allowTracing) {
        this.allowTracing = allowTracing;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scope() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property scope in model SubscriptionContractProperties"));
        }
        if (state() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property state in model SubscriptionContractProperties"));
        }
    }
}
