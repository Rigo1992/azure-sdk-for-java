// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmNicInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmUpdateReplicationProtectedItemInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.LicenseType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InMageRcmUpdateReplicationProtectedItemInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmUpdateReplicationProtectedItemInput model = BinaryData.fromString(
            "{\"instanceType\":\"InMageRcm\",\"targetVmName\":\"tuxy\",\"targetVmSize\":\"hfcaeo\",\"targetResourceGroupId\":\"fqd\",\"targetAvailabilitySetId\":\"jflobhahqmomf\",\"targetAvailabilityZone\":\"o\",\"targetProximityPlacementGroupId\":\"fr\",\"targetBootDiagnosticsStorageAccountId\":\"gbmxldjmz\",\"targetNetworkId\":\"bjesylslur\",\"testNetworkId\":\"fygpnyhgd\",\"vmNics\":[{\"nicId\":\"sc\",\"isPrimaryNic\":\"gqyvouprsytqzss\",\"isSelectedForFailover\":\"mgw\",\"targetSubnetName\":\"ivrxpfduiol\",\"targetStaticIPAddress\":\"yqvpbfjpo\",\"testSubnetName\":\"ucfzluczdquu\",\"testStaticIPAddress\":\"ormvh\"},{\"nicId\":\"zielbprnq\",\"isPrimaryNic\":\"jywzcqyg\",\"isSelectedForFailover\":\"nwsvhbngqiwye\",\"targetSubnetName\":\"ob\",\"targetStaticIPAddress\":\"rpnrehkunsbfjh\",\"testSubnetName\":\"w\",\"testStaticIPAddress\":\"kvegeattbzkgtzq\"}],\"licenseType\":\"NoLicenseType\"}")
            .toObject(InMageRcmUpdateReplicationProtectedItemInput.class);
        Assertions.assertEquals("tuxy", model.targetVmName());
        Assertions.assertEquals("hfcaeo", model.targetVmSize());
        Assertions.assertEquals("fqd", model.targetResourceGroupId());
        Assertions.assertEquals("jflobhahqmomf", model.targetAvailabilitySetId());
        Assertions.assertEquals("o", model.targetAvailabilityZone());
        Assertions.assertEquals("fr", model.targetProximityPlacementGroupId());
        Assertions.assertEquals("gbmxldjmz", model.targetBootDiagnosticsStorageAccountId());
        Assertions.assertEquals("bjesylslur", model.targetNetworkId());
        Assertions.assertEquals("fygpnyhgd", model.testNetworkId());
        Assertions.assertEquals("sc", model.vmNics().get(0).nicId());
        Assertions.assertEquals("gqyvouprsytqzss", model.vmNics().get(0).isPrimaryNic());
        Assertions.assertEquals("mgw", model.vmNics().get(0).isSelectedForFailover());
        Assertions.assertEquals("ivrxpfduiol", model.vmNics().get(0).targetSubnetName());
        Assertions.assertEquals("yqvpbfjpo", model.vmNics().get(0).targetStaticIpAddress());
        Assertions.assertEquals("ucfzluczdquu", model.vmNics().get(0).testSubnetName());
        Assertions.assertEquals("ormvh", model.vmNics().get(0).testStaticIpAddress());
        Assertions.assertEquals(LicenseType.NO_LICENSE_TYPE, model.licenseType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmUpdateReplicationProtectedItemInput model = new InMageRcmUpdateReplicationProtectedItemInput()
            .withTargetVmName("tuxy").withTargetVmSize("hfcaeo").withTargetResourceGroupId("fqd")
            .withTargetAvailabilitySetId("jflobhahqmomf").withTargetAvailabilityZone("o")
            .withTargetProximityPlacementGroupId("fr").withTargetBootDiagnosticsStorageAccountId("gbmxldjmz")
            .withTargetNetworkId("bjesylslur").withTestNetworkId("fygpnyhgd")
            .withVmNics(Arrays.asList(
                new InMageRcmNicInput().withNicId("sc").withIsPrimaryNic("gqyvouprsytqzss")
                    .withIsSelectedForFailover("mgw").withTargetSubnetName("ivrxpfduiol")
                    .withTargetStaticIpAddress("yqvpbfjpo").withTestSubnetName("ucfzluczdquu")
                    .withTestStaticIpAddress("ormvh"),
                new InMageRcmNicInput().withNicId("zielbprnq").withIsPrimaryNic("jywzcqyg")
                    .withIsSelectedForFailover("nwsvhbngqiwye").withTargetSubnetName("ob")
                    .withTargetStaticIpAddress("rpnrehkunsbfjh").withTestSubnetName("w")
                    .withTestStaticIpAddress("kvegeattbzkgtzq")))
            .withLicenseType(LicenseType.NO_LICENSE_TYPE);
        model = BinaryData.fromObject(model).toObject(InMageRcmUpdateReplicationProtectedItemInput.class);
        Assertions.assertEquals("tuxy", model.targetVmName());
        Assertions.assertEquals("hfcaeo", model.targetVmSize());
        Assertions.assertEquals("fqd", model.targetResourceGroupId());
        Assertions.assertEquals("jflobhahqmomf", model.targetAvailabilitySetId());
        Assertions.assertEquals("o", model.targetAvailabilityZone());
        Assertions.assertEquals("fr", model.targetProximityPlacementGroupId());
        Assertions.assertEquals("gbmxldjmz", model.targetBootDiagnosticsStorageAccountId());
        Assertions.assertEquals("bjesylslur", model.targetNetworkId());
        Assertions.assertEquals("fygpnyhgd", model.testNetworkId());
        Assertions.assertEquals("sc", model.vmNics().get(0).nicId());
        Assertions.assertEquals("gqyvouprsytqzss", model.vmNics().get(0).isPrimaryNic());
        Assertions.assertEquals("mgw", model.vmNics().get(0).isSelectedForFailover());
        Assertions.assertEquals("ivrxpfduiol", model.vmNics().get(0).targetSubnetName());
        Assertions.assertEquals("yqvpbfjpo", model.vmNics().get(0).targetStaticIpAddress());
        Assertions.assertEquals("ucfzluczdquu", model.vmNics().get(0).testSubnetName());
        Assertions.assertEquals("ormvh", model.vmNics().get(0).testStaticIpAddress());
        Assertions.assertEquals(LicenseType.NO_LICENSE_TYPE, model.licenseType());
    }
}
