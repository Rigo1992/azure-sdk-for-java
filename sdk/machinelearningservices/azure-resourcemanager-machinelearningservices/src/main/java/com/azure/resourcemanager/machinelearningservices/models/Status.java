// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Status. */
public final class Status extends ExpandableStringEnum<Status> {
    /** Static value Undefined for Status. */
    public static final Status UNDEFINED = fromString("Undefined");

    /** Static value Success for Status. */
    public static final Status SUCCESS = fromString("Success");

    /** Static value Failure for Status. */
    public static final Status FAILURE = fromString("Failure");

    /** Static value InvalidQuotaBelowClusterMinimum for Status. */
    public static final Status INVALID_QUOTA_BELOW_CLUSTER_MINIMUM = fromString("InvalidQuotaBelowClusterMinimum");

    /** Static value InvalidQuotaExceedsSubscriptionLimit for Status. */
    public static final Status INVALID_QUOTA_EXCEEDS_SUBSCRIPTION_LIMIT =
        fromString("InvalidQuotaExceedsSubscriptionLimit");

    /** Static value InvalidVMFamilyName for Status. */
    public static final Status INVALID_VMFAMILY_NAME = fromString("InvalidVMFamilyName");

    /** Static value OperationNotSupportedForSku for Status. */
    public static final Status OPERATION_NOT_SUPPORTED_FOR_SKU = fromString("OperationNotSupportedForSku");

    /** Static value OperationNotEnabledForRegion for Status. */
    public static final Status OPERATION_NOT_ENABLED_FOR_REGION = fromString("OperationNotEnabledForRegion");

    /**
     * Creates or finds a Status from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    @JsonCreator
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /** @return known Status values. */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
