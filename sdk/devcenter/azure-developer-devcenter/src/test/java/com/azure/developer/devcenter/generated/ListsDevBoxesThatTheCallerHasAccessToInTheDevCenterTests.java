// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.developer.devcenter.models.DevBox;
import com.azure.developer.devcenter.models.DevBoxHardwareProfile;
import com.azure.developer.devcenter.models.DevBoxImageReference;
import com.azure.developer.devcenter.models.DevBoxOsType;
import com.azure.developer.devcenter.models.DevBoxProvisioningState;
import com.azure.developer.devcenter.models.DevBoxStorageProfile;
import com.azure.developer.devcenter.models.HibernateSupport;
import com.azure.developer.devcenter.models.OsDisk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class ListsDevBoxesThatTheCallerHasAccessToInTheDevCenterTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testListsDevBoxesThatTheCallerHasAccessToInTheDevCenterTests() {
        // method invocation
        PagedIterable<DevBox> response = devBoxesClient.listAllDevBoxes();

        // response assertion
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        DevBox firstItem = response.iterator().next();
        Assertions.assertNotNull(firstItem);
        // verify property "name"
        Assertions.assertEquals("MyDevBox", firstItem.getName());
        // verify property "projectName"
        Assertions.assertEquals("ContosoProject", firstItem.getProjectName());
        // verify property "poolName"
        Assertions.assertEquals("LargeDevWorkStationPool", firstItem.getPoolName());
        // verify property "hibernateSupport"
        Assertions.assertEquals(HibernateSupport.ENABLED, firstItem.getHibernateSupport());
        // verify property "provisioningState"
        Assertions.assertEquals(DevBoxProvisioningState.SUCCEEDED, firstItem.getProvisioningState());
        // verify property "location"
        Assertions.assertEquals("centralus", firstItem.getLocation());
        // verify property "osType"
        Assertions.assertEquals(DevBoxOsType.WINDOWS, firstItem.getOsType());
        // verify property "userId"
        Assertions.assertEquals("b08e39b4-2ac6-4465-a35e-48322efb0f98", firstItem.getUserId());
        // verify property "hardwareProfile"
        DevBoxHardwareProfile firstItemHardwareProfile = firstItem.getHardwareProfile();
        Assertions.assertNotNull(firstItemHardwareProfile);
        Assertions.assertEquals(8, firstItemHardwareProfile.getVCpus());
        Assertions.assertEquals(32, firstItemHardwareProfile.getMemoryGb());
        // verify property "storageProfile"
        DevBoxStorageProfile firstItemStorageProfile = firstItem.getStorageProfile();
        Assertions.assertNotNull(firstItemStorageProfile);
        OsDisk firstItemStorageProfileOsDisk = firstItemStorageProfile.getOsDisk();
        Assertions.assertNotNull(firstItemStorageProfileOsDisk);
        Assertions.assertEquals(1024, firstItemStorageProfileOsDisk.getDiskSizeGb());
        // verify property "imageReference"
        DevBoxImageReference firstItemImageReference = firstItem.getImageReference();
        Assertions.assertNotNull(firstItemImageReference);
        Assertions.assertEquals("DevImage", firstItemImageReference.getName());
        Assertions.assertEquals("1.0.0", firstItemImageReference.getVersion());
        Assertions.assertNotNull(firstItemImageReference.getPublishedDate());
    }
}
