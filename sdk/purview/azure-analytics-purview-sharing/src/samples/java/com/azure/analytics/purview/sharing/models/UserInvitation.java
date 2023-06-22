// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import java.time.OffsetDateTime;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A user invitation kind.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "invitationKind")
@JsonTypeName("User")
@JsonFlatten
@Fluent
public class UserInvitation extends SentShareInvitation {
    /*
     * The time at which the invitation will expire. Represented in the standard date-time format as defined by [RFC
     * 3339](https://www.rfc-editor.org/rfc/rfc3339)
     */
    @JsonProperty(value = "properties.expirationDate")
    private OffsetDateTime expirationDate;

    /*
     * Whether or not the recipient was notified via email.
     */
    @JsonProperty(value = "properties.notify")
    private Boolean notify;

    /*
     * Email address of the sender.
     */
    @JsonProperty(value = "properties.senderEmail", access = JsonProperty.Access.WRITE_ONLY)
    private String senderEmail;

    /*
     * Name of the sender
     */
    @JsonProperty(value = "properties.senderName", access = JsonProperty.Access.WRITE_ONLY)
    private String senderName;

    /*
     * Tenant name of the sender
     */
    @JsonProperty(value = "properties.senderTenantName", access = JsonProperty.Access.WRITE_ONLY)
    private String senderTenantName;

    /*
     * Gets the time at which the invitation was sent. Represented in the standard date-time format as defined by [RFC
     * 3339](https://www.rfc-editor.org/rfc/rfc3339)
     */
    @JsonProperty(value = "properties.sentAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime sentAt;

    /*
     * Share status.
     */
    @JsonProperty(value = "properties.shareStatus")
    private ShareStatus shareStatus;

    /*
     * State of the resource
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private State state;

    /*
     * The receiver email for the invitation is being sent.
     */
    @JsonProperty(value = "properties.targetEmail", required = true)
    private String targetEmail;

    /**
     * Creates an instance of UserInvitation class.
     */
    public UserInvitation() {
    }

    /**
     * Get the expirationDate property: The time at which the invitation will expire. Represented in the standard
     * date-time format as defined by [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339).
     * 
     * @return the expirationDate value.
     */
    public OffsetDateTime getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate property: The time at which the invitation will expire. Represented in the standard
     * date-time format as defined by [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339).
     * 
     * @param expirationDate the expirationDate value to set.
     * @return the UserInvitation object itself.
     */
    public UserInvitation setExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get the notify property: Whether or not the recipient was notified via email.
     * 
     * @return the notify value.
     */
    public Boolean isNotify() {
        return this.notify;
    }

    /**
     * Set the notify property: Whether or not the recipient was notified via email.
     * 
     * @param notify the notify value to set.
     * @return the UserInvitation object itself.
     */
    public UserInvitation setNotify(Boolean notify) {
        this.notify = notify;
        return this;
    }

    /**
     * Get the senderEmail property: Email address of the sender.
     * 
     * @return the senderEmail value.
     */
    public String getSenderEmail() {
        return this.senderEmail;
    }

    /**
     * Get the senderName property: Name of the sender.
     * 
     * @return the senderName value.
     */
    public String getSenderName() {
        return this.senderName;
    }

    /**
     * Get the senderTenantName property: Tenant name of the sender.
     * 
     * @return the senderTenantName value.
     */
    public String getSenderTenantName() {
        return this.senderTenantName;
    }

    /**
     * Get the sentAt property: Gets the time at which the invitation was sent. Represented in the standard date-time
     * format as defined by [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339).
     * 
     * @return the sentAt value.
     */
    public OffsetDateTime getSentAt() {
        return this.sentAt;
    }

    /**
     * Get the shareStatus property: Share status.
     * 
     * @return the shareStatus value.
     */
    public ShareStatus getShareStatus() {
        return this.shareStatus;
    }

    /**
     * Set the shareStatus property: Share status.
     * 
     * @param shareStatus the shareStatus value to set.
     * @return the UserInvitation object itself.
     */
    public UserInvitation setShareStatus(ShareStatus shareStatus) {
        this.shareStatus = shareStatus;
        return this;
    }

    /**
     * Get the state property: State of the resource.
     * 
     * @return the state value.
     */
    public State getState() {
        return this.state;
    }

    /**
     * Get the targetEmail property: The receiver email for the invitation is being sent.
     * 
     * @return the targetEmail value.
     */
    public String getTargetEmail() {
        return this.targetEmail;
    }

    /**
     * Set the targetEmail property: The receiver email for the invitation is being sent.
     * 
     * @param targetEmail the targetEmail value to set.
     * @return the UserInvitation object itself.
     */
    public UserInvitation setTargetEmail(String targetEmail) {
        this.targetEmail = targetEmail;
        return this;
    }
}
