// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.privatedns.models.RecordType;

/** Samples for RecordSets Delete. */
public final class RecordSetsDeleteSamples {
    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2018-09-01/examples/RecordSetTXTDelete.json
     */
    /**
     * Sample code: DELETE Private DNS Zone TXT Record Set.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dELETEPrivateDNSZoneTXTRecordSet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .privateDnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .deleteWithResponse("resourceGroup1", "privatezone1.com", RecordType.TXT, "recordTXT", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2018-09-01/examples/RecordSetMXDelete.json
     */
    /**
     * Sample code: DELETE Private DNS Zone MX Record Set.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dELETEPrivateDNSZoneMXRecordSet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .privateDnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .deleteWithResponse("resourceGroup1", "privatezone1.com", RecordType.MX, "recordMX", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2018-09-01/examples/RecordSetCNAMEDelete.json
     */
    /**
     * Sample code: DELETE Private DNS Zone CNAME Record Set.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dELETEPrivateDNSZoneCNAMERecordSet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .privateDnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .deleteWithResponse(
                "resourceGroup1", "privatezone1.com", RecordType.CNAME, "recordCNAME", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2018-09-01/examples/RecordSetAAAADelete.json
     */
    /**
     * Sample code: DELETE Private DNS Zone AAAA Record Set.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dELETEPrivateDNSZoneAAAARecordSet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .privateDnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .deleteWithResponse(
                "resourceGroup1", "privatezone1.com", RecordType.AAAA, "recordAAAA", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2018-09-01/examples/RecordSetSRVDelete.json
     */
    /**
     * Sample code: DELETE Private DNS Zone SRV Record Set.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dELETEPrivateDNSZoneSRVRecordSet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .privateDnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .deleteWithResponse("resourceGroup1", "privatezone1.com", RecordType.SRV, "recordSRV", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2018-09-01/examples/RecordSetADelete.json
     */
    /**
     * Sample code: DELETE Private DNS Zone A Record Set.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dELETEPrivateDNSZoneARecordSet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .privateDnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .deleteWithResponse("resourceGroup1", "privatezone1.com", RecordType.A, "recordA", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2018-09-01/examples/RecordSetPTRDelete.json
     */
    /**
     * Sample code: DELETE Private DNS Zone PTR Record Set.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dELETEPrivateDNSZonePTRRecordSet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .privateDnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .deleteWithResponse("resourceGroup1", "0.0.127.in-addr.arpa", RecordType.PTR, "1", null, Context.NONE);
    }
}
