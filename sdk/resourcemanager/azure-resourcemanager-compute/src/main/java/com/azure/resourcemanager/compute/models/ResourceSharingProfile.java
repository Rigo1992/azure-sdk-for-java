// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ResourceSharingProfile model.
 */
@Fluent
public final class ResourceSharingProfile {
    /*
     * Specifies an array of subscription resource IDs that capacity reservation group is shared with. **Note:**
     * Minimum api-version: 2023-09-01. Please refer to https://aka.ms/computereservationsharing for more details.
     */
    @JsonProperty(value = "subscriptionIds")
    private List<SubResource> subscriptionIds;

    /**
     * Creates an instance of ResourceSharingProfile class.
     */
    public ResourceSharingProfile() {
    }

    /**
     * Get the subscriptionIds property: Specifies an array of subscription resource IDs that capacity reservation
     * group is shared with. **Note:** Minimum api-version: 2023-09-01. Please refer to
     * https://aka.ms/computereservationsharing for more details.
     * 
     * @return the subscriptionIds value.
     */
    public List<SubResource> subscriptionIds() {
        return this.subscriptionIds;
    }

    /**
     * Set the subscriptionIds property: Specifies an array of subscription resource IDs that capacity reservation
     * group is shared with. **Note:** Minimum api-version: 2023-09-01. Please refer to
     * https://aka.ms/computereservationsharing for more details.
     * 
     * @param subscriptionIds the subscriptionIds value to set.
     * @return the ResourceSharingProfile object itself.
     */
    public ResourceSharingProfile withSubscriptionIds(List<SubResource> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
