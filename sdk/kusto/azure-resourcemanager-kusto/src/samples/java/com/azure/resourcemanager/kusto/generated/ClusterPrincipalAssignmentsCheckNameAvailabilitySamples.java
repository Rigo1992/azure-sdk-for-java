// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.kusto.models.ClusterPrincipalAssignmentCheckNameRequest;

/** Samples for ClusterPrincipalAssignments CheckNameAvailability. */
public final class ClusterPrincipalAssignmentsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2022-02-01/examples/KustoClusterPrincipalAssignmentsCheckNameAvailability.json
     */
    /**
     * Sample code: KustoClusterPrincipalAssignmentsCheckNameAvailability.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoClusterPrincipalAssignmentsCheckNameAvailability(
        com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .clusterPrincipalAssignments()
            .checkNameAvailabilityWithResponse(
                "kustorptest",
                "kustoCluster",
                new ClusterPrincipalAssignmentCheckNameRequest().withName("kustoprincipal1"),
                Context.NONE);
    }
}
