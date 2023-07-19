// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.authorization.models.AccessReviewHistoryDefinitionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Access Review History Definition Instance. */
@Fluent
public final class AccessReviewHistoryInstanceInner extends ProxyResource {
    /*
     * Access Review History Definition Instance properties.
     */
    @JsonProperty(value = "properties")
    private AccessReviewHistoryInstanceProperties innerProperties;

    /** Creates an instance of AccessReviewHistoryInstanceInner class. */
    public AccessReviewHistoryInstanceInner() {
    }

    /**
     * Get the innerProperties property: Access Review History Definition Instance properties.
     *
     * @return the innerProperties value.
     */
    private AccessReviewHistoryInstanceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the reviewHistoryPeriodStartDateTime property: Date time used when selecting review data, all reviews
     * included in data start on or after this date. For use only with one-time/non-recurring reports.
     *
     * @return the reviewHistoryPeriodStartDateTime value.
     */
    public OffsetDateTime reviewHistoryPeriodStartDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().reviewHistoryPeriodStartDateTime();
    }

    /**
     * Set the reviewHistoryPeriodStartDateTime property: Date time used when selecting review data, all reviews
     * included in data start on or after this date. For use only with one-time/non-recurring reports.
     *
     * @param reviewHistoryPeriodStartDateTime the reviewHistoryPeriodStartDateTime value to set.
     * @return the AccessReviewHistoryInstanceInner object itself.
     */
    public AccessReviewHistoryInstanceInner withReviewHistoryPeriodStartDateTime(
        OffsetDateTime reviewHistoryPeriodStartDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewHistoryInstanceProperties();
        }
        this.innerProperties().withReviewHistoryPeriodStartDateTime(reviewHistoryPeriodStartDateTime);
        return this;
    }

    /**
     * Get the reviewHistoryPeriodEndDateTime property: Date time used when selecting review data, all reviews included
     * in data end on or before this date. For use only with one-time/non-recurring reports.
     *
     * @return the reviewHistoryPeriodEndDateTime value.
     */
    public OffsetDateTime reviewHistoryPeriodEndDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().reviewHistoryPeriodEndDateTime();
    }

    /**
     * Set the reviewHistoryPeriodEndDateTime property: Date time used when selecting review data, all reviews included
     * in data end on or before this date. For use only with one-time/non-recurring reports.
     *
     * @param reviewHistoryPeriodEndDateTime the reviewHistoryPeriodEndDateTime value to set.
     * @return the AccessReviewHistoryInstanceInner object itself.
     */
    public AccessReviewHistoryInstanceInner withReviewHistoryPeriodEndDateTime(
        OffsetDateTime reviewHistoryPeriodEndDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewHistoryInstanceProperties();
        }
        this.innerProperties().withReviewHistoryPeriodEndDateTime(reviewHistoryPeriodEndDateTime);
        return this;
    }

    /**
     * Get the displayName property: The display name for the parent history definition.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name for the parent history definition.
     *
     * @param displayName the displayName value to set.
     * @return the AccessReviewHistoryInstanceInner object itself.
     */
    public AccessReviewHistoryInstanceInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewHistoryInstanceProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the status property: Status of the requested review history instance data. This is either requested,
     * in-progress, done or error. The state transitions are as follows - Requested -&gt; InProgress -&gt; Done -&gt;
     * Expired.
     *
     * @return the status value.
     */
    public AccessReviewHistoryDefinitionStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the runDateTime property: Date time when the history data report is scheduled to be generated.
     *
     * @return the runDateTime value.
     */
    public OffsetDateTime runDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().runDateTime();
    }

    /**
     * Set the runDateTime property: Date time when the history data report is scheduled to be generated.
     *
     * @param runDateTime the runDateTime value to set.
     * @return the AccessReviewHistoryInstanceInner object itself.
     */
    public AccessReviewHistoryInstanceInner withRunDateTime(OffsetDateTime runDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewHistoryInstanceProperties();
        }
        this.innerProperties().withRunDateTime(runDateTime);
        return this;
    }

    /**
     * Get the fulfilledDateTime property: Date time when the history data report is scheduled to be generated.
     *
     * @return the fulfilledDateTime value.
     */
    public OffsetDateTime fulfilledDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().fulfilledDateTime();
    }

    /**
     * Set the fulfilledDateTime property: Date time when the history data report is scheduled to be generated.
     *
     * @param fulfilledDateTime the fulfilledDateTime value to set.
     * @return the AccessReviewHistoryInstanceInner object itself.
     */
    public AccessReviewHistoryInstanceInner withFulfilledDateTime(OffsetDateTime fulfilledDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewHistoryInstanceProperties();
        }
        this.innerProperties().withFulfilledDateTime(fulfilledDateTime);
        return this;
    }

    /**
     * Get the downloadUri property: Uri which can be used to retrieve review history data. To generate this Uri,
     * generateDownloadUri() must be called for a specific accessReviewHistoryDefinitionInstance. The link expires after
     * a 24 hour period. Callers can see the expiration date time by looking at the 'se' parameter in the generated uri.
     *
     * @return the downloadUri value.
     */
    public String downloadUri() {
        return this.innerProperties() == null ? null : this.innerProperties().downloadUri();
    }

    /**
     * Get the expiration property: Date time when history data report expires and the associated data is deleted.
     *
     * @return the expiration value.
     */
    public OffsetDateTime expiration() {
        return this.innerProperties() == null ? null : this.innerProperties().expiration();
    }

    /**
     * Set the expiration property: Date time when history data report expires and the associated data is deleted.
     *
     * @param expiration the expiration value to set.
     * @return the AccessReviewHistoryInstanceInner object itself.
     */
    public AccessReviewHistoryInstanceInner withExpiration(OffsetDateTime expiration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessReviewHistoryInstanceProperties();
        }
        this.innerProperties().withExpiration(expiration);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
