// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiskAccountType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageAzureV2DiskInputDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageAzureV2EnableProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.LicenseType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SqlServerLicenseType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class InMageAzureV2EnableProtectionInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageAzureV2EnableProtectionInput model = BinaryData.fromString(
            "{\"instanceType\":\"InMageAzureV2\",\"masterTargetId\":\"uukppdixqb\",\"processServerId\":\"xvhhyqq\",\"storageAccountId\":\"at\",\"runAsAccountId\":\"rznmginmtsdixc\",\"multiVmGroupId\":\"kibmgjymn\",\"multiVmGroupName\":\"cag\",\"disksToInclude\":[{\"diskId\":\"cqzoofjnqjsve\",\"logStorageAccountId\":\"bhtleberpy\",\"diskType\":\"StandardSSD_LRS\",\"diskEncryptionSetId\":\"nfqnwj\"},{\"diskId\":\"xowkdnj\",\"logStorageAccountId\":\"gkr\",\"diskType\":\"StandardSSD_LRS\",\"diskEncryptionSetId\":\"hycpnowawonoe\"}],\"targetAzureNetworkId\":\"guqlhfwa\",\"targetAzureSubnetId\":\"jzmpy\",\"enableRdpOnTargetOption\":\"uyfazbkoc\",\"targetAzureVmName\":\"gvthrmxkbcjww\",\"logStorageAccountId\":\"omraw\",\"targetAzureV1ResourceGroupId\":\"keboo\",\"targetAzureV2ResourceGroupId\":\"l\",\"diskType\":\"StandardSSD_LRS\",\"targetAvailabilitySetId\":\"gaedaoiq\",\"targetAvailabilityZone\":\"mgd\",\"targetProximityPlacementGroupId\":\"gabdxfkuzbwjeco\",\"licenseType\":\"NoLicenseType\",\"sqlServerLicenseType\":\"NotSpecified\",\"targetVmSize\":\"qbpel\",\"diskEncryptionSetId\":\"ibncgagdvcd\",\"targetVmTags\":{\"df\":\"tzbpyfao\"},\"seedManagedDiskTags\":{\"rf\":\"ncwmhjob\",\"dc\":\"ri\",\"f\":\"h\",\"oorssatfy\":\"cvbzwgwhgkgsoa\"},\"targetManagedDiskTags\":{\"dqn\":\"ufdmxuq\",\"fqayopbtsix\":\"sttuxv\",\"jay\":\"gvbhxmndztgs\"},\"targetNicTags\":{\"q\":\"rxneibpgbrhbj\",\"nmotpuwnnoh\":\"nh\",\"wyiulaynosu\":\"mzngocfrjuy\"}}")
            .toObject(InMageAzureV2EnableProtectionInput.class);
        Assertions.assertEquals("uukppdixqb", model.masterTargetId());
        Assertions.assertEquals("xvhhyqq", model.processServerId());
        Assertions.assertEquals("at", model.storageAccountId());
        Assertions.assertEquals("rznmginmtsdixc", model.runAsAccountId());
        Assertions.assertEquals("kibmgjymn", model.multiVmGroupId());
        Assertions.assertEquals("cag", model.multiVmGroupName());
        Assertions.assertEquals("cqzoofjnqjsve", model.disksToInclude().get(0).diskId());
        Assertions.assertEquals("bhtleberpy", model.disksToInclude().get(0).logStorageAccountId());
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_LRS, model.disksToInclude().get(0).diskType());
        Assertions.assertEquals("nfqnwj", model.disksToInclude().get(0).diskEncryptionSetId());
        Assertions.assertEquals("guqlhfwa", model.targetAzureNetworkId());
        Assertions.assertEquals("jzmpy", model.targetAzureSubnetId());
        Assertions.assertEquals("uyfazbkoc", model.enableRdpOnTargetOption());
        Assertions.assertEquals("gvthrmxkbcjww", model.targetAzureVmName());
        Assertions.assertEquals("omraw", model.logStorageAccountId());
        Assertions.assertEquals("keboo", model.targetAzureV1ResourceGroupId());
        Assertions.assertEquals("l", model.targetAzureV2ResourceGroupId());
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_LRS, model.diskType());
        Assertions.assertEquals("gaedaoiq", model.targetAvailabilitySetId());
        Assertions.assertEquals("mgd", model.targetAvailabilityZone());
        Assertions.assertEquals("gabdxfkuzbwjeco", model.targetProximityPlacementGroupId());
        Assertions.assertEquals(LicenseType.NO_LICENSE_TYPE, model.licenseType());
        Assertions.assertEquals(SqlServerLicenseType.NOT_SPECIFIED, model.sqlServerLicenseType());
        Assertions.assertEquals("qbpel", model.targetVmSize());
        Assertions.assertEquals("ibncgagdvcd", model.diskEncryptionSetId());
        Assertions.assertEquals("tzbpyfao", model.targetVmTags().get("df"));
        Assertions.assertEquals("ncwmhjob", model.seedManagedDiskTags().get("rf"));
        Assertions.assertEquals("ufdmxuq", model.targetManagedDiskTags().get("dqn"));
        Assertions.assertEquals("rxneibpgbrhbj", model.targetNicTags().get("q"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageAzureV2EnableProtectionInput model = new InMageAzureV2EnableProtectionInput()
            .withMasterTargetId("uukppdixqb").withProcessServerId("xvhhyqq").withStorageAccountId("at")
            .withRunAsAccountId("rznmginmtsdixc").withMultiVmGroupId("kibmgjymn").withMultiVmGroupName("cag")
            .withDisksToInclude(Arrays.asList(
                new InMageAzureV2DiskInputDetails().withDiskId("cqzoofjnqjsve").withLogStorageAccountId("bhtleberpy")
                    .withDiskType(DiskAccountType.STANDARD_SSD_LRS).withDiskEncryptionSetId("nfqnwj"),
                new InMageAzureV2DiskInputDetails().withDiskId("xowkdnj").withLogStorageAccountId("gkr")
                    .withDiskType(DiskAccountType.STANDARD_SSD_LRS).withDiskEncryptionSetId("hycpnowawonoe")))
            .withTargetAzureNetworkId("guqlhfwa").withTargetAzureSubnetId("jzmpy")
            .withEnableRdpOnTargetOption("uyfazbkoc").withTargetAzureVmName("gvthrmxkbcjww")
            .withLogStorageAccountId("omraw").withTargetAzureV1ResourceGroupId("keboo")
            .withTargetAzureV2ResourceGroupId("l").withDiskType(DiskAccountType.STANDARD_SSD_LRS)
            .withTargetAvailabilitySetId("gaedaoiq").withTargetAvailabilityZone("mgd")
            .withTargetProximityPlacementGroupId("gabdxfkuzbwjeco").withLicenseType(LicenseType.NO_LICENSE_TYPE)
            .withSqlServerLicenseType(SqlServerLicenseType.NOT_SPECIFIED).withTargetVmSize("qbpel")
            .withDiskEncryptionSetId("ibncgagdvcd").withTargetVmTags(mapOf("df", "tzbpyfao"))
            .withSeedManagedDiskTags(mapOf("rf", "ncwmhjob", "dc", "ri", "f", "h", "oorssatfy", "cvbzwgwhgkgsoa"))
            .withTargetManagedDiskTags(mapOf("dqn", "ufdmxuq", "fqayopbtsix", "sttuxv", "jay", "gvbhxmndztgs"))
            .withTargetNicTags(mapOf("q", "rxneibpgbrhbj", "nmotpuwnnoh", "nh", "wyiulaynosu", "mzngocfrjuy"));
        model = BinaryData.fromObject(model).toObject(InMageAzureV2EnableProtectionInput.class);
        Assertions.assertEquals("uukppdixqb", model.masterTargetId());
        Assertions.assertEquals("xvhhyqq", model.processServerId());
        Assertions.assertEquals("at", model.storageAccountId());
        Assertions.assertEquals("rznmginmtsdixc", model.runAsAccountId());
        Assertions.assertEquals("kibmgjymn", model.multiVmGroupId());
        Assertions.assertEquals("cag", model.multiVmGroupName());
        Assertions.assertEquals("cqzoofjnqjsve", model.disksToInclude().get(0).diskId());
        Assertions.assertEquals("bhtleberpy", model.disksToInclude().get(0).logStorageAccountId());
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_LRS, model.disksToInclude().get(0).diskType());
        Assertions.assertEquals("nfqnwj", model.disksToInclude().get(0).diskEncryptionSetId());
        Assertions.assertEquals("guqlhfwa", model.targetAzureNetworkId());
        Assertions.assertEquals("jzmpy", model.targetAzureSubnetId());
        Assertions.assertEquals("uyfazbkoc", model.enableRdpOnTargetOption());
        Assertions.assertEquals("gvthrmxkbcjww", model.targetAzureVmName());
        Assertions.assertEquals("omraw", model.logStorageAccountId());
        Assertions.assertEquals("keboo", model.targetAzureV1ResourceGroupId());
        Assertions.assertEquals("l", model.targetAzureV2ResourceGroupId());
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_LRS, model.diskType());
        Assertions.assertEquals("gaedaoiq", model.targetAvailabilitySetId());
        Assertions.assertEquals("mgd", model.targetAvailabilityZone());
        Assertions.assertEquals("gabdxfkuzbwjeco", model.targetProximityPlacementGroupId());
        Assertions.assertEquals(LicenseType.NO_LICENSE_TYPE, model.licenseType());
        Assertions.assertEquals(SqlServerLicenseType.NOT_SPECIFIED, model.sqlServerLicenseType());
        Assertions.assertEquals("qbpel", model.targetVmSize());
        Assertions.assertEquals("ibncgagdvcd", model.diskEncryptionSetId());
        Assertions.assertEquals("tzbpyfao", model.targetVmTags().get("df"));
        Assertions.assertEquals("ncwmhjob", model.seedManagedDiskTags().get("rf"));
        Assertions.assertEquals("ufdmxuq", model.targetManagedDiskTags().get("dqn"));
        Assertions.assertEquals("rxneibpgbrhbj", model.targetNicTags().get("q"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
