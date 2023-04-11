// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information regarding Subscription Quota Item. */
@Immutable
public final class SubscriptionQuotaItemInner extends ProxyResource {
    /*
     * SubscriptionQuotaItem properties
     */
    @JsonProperty(value = "properties")
    private SubscriptionQuotaItemProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of SubscriptionQuotaItemInner class. */
    public SubscriptionQuotaItemInner() {
    }

    /**
     * Get the innerProperties property: SubscriptionQuotaItem properties.
     *
     * @return the innerProperties value.
     */
    private SubscriptionQuotaItemProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the current property: The current quota value.
     *
     * @return the current value.
     */
    public Integer current() {
        return this.innerProperties() == null ? null : this.innerProperties().current();
    }

    /**
     * Get the defaultProperty property: The default quota value.
     *
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultProperty();
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
