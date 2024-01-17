// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for ResourceNotRenewableReason.
 */
public final class ResourceNotRenewableReason extends ExpandableStringEnum<ResourceNotRenewableReason> {
    /**
     * Static value RegistrationStatusNotSupportedForRenewal for ResourceNotRenewableReason.
     */
    public static final ResourceNotRenewableReason REGISTRATION_STATUS_NOT_SUPPORTED_FOR_RENEWAL
        = fromString("RegistrationStatusNotSupportedForRenewal");

    /**
     * Static value ExpirationNotInRenewalTimeRange for ResourceNotRenewableReason.
     */
    public static final ResourceNotRenewableReason EXPIRATION_NOT_IN_RENEWAL_TIME_RANGE
        = fromString("ExpirationNotInRenewalTimeRange");

    /**
     * Static value SubscriptionNotActive for ResourceNotRenewableReason.
     */
    public static final ResourceNotRenewableReason SUBSCRIPTION_NOT_ACTIVE = fromString("SubscriptionNotActive");

    /**
     * Creates a new instance of ResourceNotRenewableReason value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResourceNotRenewableReason() {
    }

    /**
     * Creates or finds a ResourceNotRenewableReason from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ResourceNotRenewableReason.
     */
    @JsonCreator
    public static ResourceNotRenewableReason fromString(String name) {
        return fromString(name, ResourceNotRenewableReason.class);
    }

    /**
     * Gets known ResourceNotRenewableReason values.
     * 
     * @return known ResourceNotRenewableReason values.
     */
    public static Collection<ResourceNotRenewableReason> values() {
        return values(ResourceNotRenewableReason.class);
    }
}
