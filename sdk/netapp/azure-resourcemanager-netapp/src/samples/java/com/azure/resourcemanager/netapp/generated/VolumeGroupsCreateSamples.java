// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.ApplicationType;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.VolumeGroupMetadata;
import com.azure.resourcemanager.netapp.models.VolumeGroupVolumeProperties;
import com.azure.resourcemanager.netapp.models.VolumePropertiesExportPolicy;
import java.util.Arrays;

/**
 * Samples for VolumeGroups Create.
 */
public final class VolumeGroupsCreateSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/VolumeGroups_Create_SapHana.json
     */
    /**
     * Sample code: VolumeGroups_Create_SapHana.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumeGroupsCreateSapHana(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumeGroups()
            .define("group1")
            .withExistingNetAppAccount("myRG", "account1")
            .withRegion("westus")
            .withGroupMetadata(new VolumeGroupMetadata().withGroupDescription("Volume group")
                .withApplicationType(ApplicationType.SAP_HANA)
                .withApplicationIdentifier("SH9"))
            .withVolumes(Arrays.asList(
                new VolumeGroupVolumeProperties().withName("test-data-mnt00001")
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withProximityPlacementGroup(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg")
                    .withVolumeSpecName("data"),
                new VolumeGroupVolumeProperties().withName("test-log-mnt00001")
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withProximityPlacementGroup(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg")
                    .withVolumeSpecName("log"),
                new VolumeGroupVolumeProperties().withName("test-shared")
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withProximityPlacementGroup(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg")
                    .withVolumeSpecName("shared"),
                new VolumeGroupVolumeProperties().withName("test-data-backup")
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withProximityPlacementGroup(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg")
                    .withVolumeSpecName("data-backup"),
                new VolumeGroupVolumeProperties().withName("test-log-backup")
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withProximityPlacementGroup(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg")
                    .withVolumeSpecName("log-backup")))
            .create();
    }

    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/VolumeGroups_Create_Oracle.json
     */
    /**
     * Sample code: VolumeGroups_Create_Oracle.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumeGroupsCreateOracle(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumeGroups()
            .define("group1")
            .withExistingNetAppAccount("myRG", "account1")
            .withRegion("westus")
            .withGroupMetadata(new VolumeGroupMetadata().withGroupDescription("Volume group")
                .withApplicationType(ApplicationType.ORACLE)
                .withApplicationIdentifier("OR2"))
            .withVolumes(Arrays.asList(
                new VolumeGroupVolumeProperties().withName("test-ora-data1")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-data1"),
                new VolumeGroupVolumeProperties().withName("test-ora-data2")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-data2"),
                new VolumeGroupVolumeProperties().withName("test-ora-data3")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-data3"),
                new VolumeGroupVolumeProperties().withName("test-ora-data4")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-data4"),
                new VolumeGroupVolumeProperties().withName("test-ora-data5")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-data5"),
                new VolumeGroupVolumeProperties().withName("test-ora-data6")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-data6"),
                new VolumeGroupVolumeProperties().withName("test-ora-data7")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-data7"),
                new VolumeGroupVolumeProperties().withName("test-ora-data8")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-data8"),
                new VolumeGroupVolumeProperties().withName("test-ora-log")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-log"),
                new VolumeGroupVolumeProperties().withName("test-ora-log-mirror")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-log-mirror"),
                new VolumeGroupVolumeProperties().withName("test-ora-binary")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-binary"),
                new VolumeGroupVolumeProperties().withName("test-ora-backup")
                    .withZones(Arrays.asList("1"))
                    .withCreationToken("fakeTokenPlaceholder")
                    .withServiceLevel(ServiceLevel.PREMIUM)
                    .withUsageThreshold(107374182400L)
                    .withExportPolicy(new VolumePropertiesExportPolicy()
                        .withRules(Arrays.asList(new ExportPolicyRule().withRuleIndex(1)
                            .withUnixReadOnly(true)
                            .withUnixReadWrite(true)
                            .withKerberos5ReadOnly(false)
                            .withKerberos5ReadWrite(false)
                            .withKerberos5IReadOnly(false)
                            .withKerberos5IReadWrite(false)
                            .withKerberos5PReadOnly(false)
                            .withKerberos5PReadWrite(false)
                            .withCifs(false)
                            .withNfsv3(false)
                            .withNfsv41(true)
                            .withAllowedClients("0.0.0.0/0")
                            .withHasRootAccess(true))))
                    .withProtocolTypes(Arrays.asList("NFSv4.1"))
                    .withSubnetId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                    .withThroughputMibps(10.0F)
                    .withCapacityPoolResourceId(
                        "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                    .withVolumeSpecName("ora-backup")))
            .create();
    }
}
