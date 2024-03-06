// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.implementation;

import com.azure.resourcemanager.workloadssapvirtualinstance.fluent.models.SapAvailabilityZoneDetailsResultInner;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapAvailabilityZoneDetailsResult;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapAvailabilityZonePair;
import java.util.Collections;
import java.util.List;

public final class SapAvailabilityZoneDetailsResultImpl implements SapAvailabilityZoneDetailsResult {
    private SapAvailabilityZoneDetailsResultInner innerObject;

    private final com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager serviceManager;

    SapAvailabilityZoneDetailsResultImpl(SapAvailabilityZoneDetailsResultInner innerObject,
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SapAvailabilityZonePair> availabilityZonePairs() {
        List<SapAvailabilityZonePair> inner = this.innerModel().availabilityZonePairs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SapAvailabilityZoneDetailsResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager manager() {
        return this.serviceManager;
    }
}
