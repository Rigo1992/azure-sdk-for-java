// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for CertificateObjectLocalRulestack ListByLocalRulestacks. */
public final class CertificateObjectLocalRulestackListByLocalRulestacksSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/CertificateObjectLocalRulestack_ListByLocalRulestacks_MaximumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectLocalRulestack_ListByLocalRulestacks_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void certificateObjectLocalRulestackListByLocalRulestacksMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .certificateObjectLocalRulestacks()
            .listByLocalRulestacks("rgopenapi", "lrs1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/CertificateObjectLocalRulestack_ListByLocalRulestacks_MinimumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectLocalRulestack_ListByLocalRulestacks_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void certificateObjectLocalRulestackListByLocalRulestacksMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .certificateObjectLocalRulestacks()
            .listByLocalRulestacks("rgopenapi", "lrs1", com.azure.core.util.Context.NONE);
    }
}
