// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.fluent.models.ManagedInstanceDtcInner;
import com.azure.resourcemanager.sql.models.DtcName;
import com.azure.resourcemanager.sql.models.ManagedInstanceDtcSecuritySettings;
import com.azure.resourcemanager.sql.models.ManagedInstanceDtcTransactionManagerCommunicationSettings;
import java.util.Arrays;

/** Samples for ManagedInstanceDtcs CreateOrUpdate. */
public final class ManagedInstanceDtcsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-05-01-preview/examples/ManagedInstanceDtcUpdateEnableDtc.json
     */
    /**
     * Sample code: Updates managed instance DTC settings by enabling DTC.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updatesManagedInstanceDTCSettingsByEnablingDTC(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstanceDtcs()
            .createOrUpdate(
                "testrg",
                "testinstance",
                DtcName.CURRENT,
                new ManagedInstanceDtcInner().withDtcEnabled(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-05-01-preview/examples/ManagedInstanceDtcUpdateMax.json
     */
    /**
     * Sample code: Updates managed instance DTC settings with all optional parameters specified.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updatesManagedInstanceDTCSettingsWithAllOptionalParametersSpecified(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstanceDtcs()
            .createOrUpdate(
                "testrg",
                "testinstance",
                DtcName.CURRENT,
                new ManagedInstanceDtcInner()
                    .withDtcEnabled(true)
                    .withSecuritySettings(
                        new ManagedInstanceDtcSecuritySettings()
                            .withTransactionManagerCommunicationSettings(
                                new ManagedInstanceDtcTransactionManagerCommunicationSettings()
                                    .withAllowInboundEnabled(false)
                                    .withAllowOutboundEnabled(true)
                                    .withAuthentication("NoAuth"))
                            .withXaTransactionsEnabled(false)
                            .withSnaLu6Point2TransactionsEnabled(false)
                            .withXaTransactionsDefaultTimeout(1000)
                            .withXaTransactionsMaximumTimeout(3000))
                    .withExternalDnsSuffixSearchList(Arrays.asList("dns.example1.com", "dns.example2.com")),
                com.azure.core.util.Context.NONE);
    }
}
