// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/**
 * Samples for DataProducts ListRolesAssignments.
 */
public final class DataProductsListRolesAssignmentsSamples {
    /*
     * x-ms-original-file:
     * specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-11-15/examples/
     * DataProducts_ListRolesAssignments_MinimumSet_Gen.json
     */
    /**
     * Sample code: DataProducts_ListRolesAssignments_MaximumSet_Gen - generated by [MinimumSet] rule_MinimumSet_Gen.
     * 
     * @param manager Entry point to NetworkAnalyticsManager.
     */
    public static void dataProductsListRolesAssignmentsMaximumSetGenGeneratedByMinimumSetRuleMinimumSetGen(
        com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager manager) throws IOException {
        manager.dataProducts()
            .listRolesAssignmentsWithResponse("aoiresourceGroupName", "dataproduct01", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-11-15/examples/
     * DataProducts_ListRolesAssignments_MaximumSet_Gen.json
     */
    /**
     * Sample code: DataProducts_ListRolesAssignments_MaximumSet_Gen.
     * 
     * @param manager Entry point to NetworkAnalyticsManager.
     */
    public static void dataProductsListRolesAssignmentsMaximumSetGen(
        com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager manager) throws IOException {
        manager.dataProducts()
            .listRolesAssignmentsWithResponse("aoiresourceGroupName", "dataproduct01", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }
}
