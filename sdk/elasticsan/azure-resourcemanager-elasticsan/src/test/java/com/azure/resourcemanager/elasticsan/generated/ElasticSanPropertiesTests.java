// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanProperties;
import com.azure.resourcemanager.elasticsan.models.PublicNetworkAccess;
import com.azure.resourcemanager.elasticsan.models.Sku;
import com.azure.resourcemanager.elasticsan.models.SkuName;
import com.azure.resourcemanager.elasticsan.models.SkuTier;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ElasticSanPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ElasticSanProperties model =
            BinaryData
                .fromString(
                    "{\"sku\":{\"name\":\"Premium_LRS\",\"tier\":\"Premium\"},\"availabilityZones\":[\"uigdtopbobjog\",\"m\",\"w\"],\"provisioningState\":\"Invalid\",\"baseSizeTiB\":1066773928950935617,\"extendedCapacitySizeTiB\":5337187329855698822,\"totalVolumeSizeGiB\":1825829126532867613,\"volumeGroupCount\":5532394837865502846,\"totalIops\":6153191727519206956,\"totalMBps\":1144092009173010962,\"totalSizeTiB\":5713676412276621836,\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"privateEndpoint\":{\"id\":\"xlngx\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"ugnxkrxdqmi\",\"actionsRequired\":\"thz\"},\"groupIds\":[\"drabhjybige\",\"oqfbowskanyk\",\"zlcuiywgqywgndrv\",\"nhzgpphrcgyn\"]},\"id\":\"cpecfvmmcoofs\",\"name\":\"lzevgbmqjqab\",\"type\":\"y\"},{\"properties\":{\"provisioningState\":\"Deleting\",\"privateEndpoint\":{\"id\":\"w\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"ccfwnfnbacfion\",\"actionsRequired\":\"bxetqgtzxdpn\"},\"groupIds\":[\"qwxrjfeallnw\"]},\"id\":\"bisnja\",\"name\":\"pmng\",\"type\":\"zscxaqwo\"},{\"properties\":{\"provisioningState\":\"Creating\",\"privateEndpoint\":{\"id\":\"onq\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"lrxnjeaseiphe\",\"actionsRequired\":\"lokeyy\"},\"groupIds\":[\"jbdlwtgrhpdjpju\"]},\"id\":\"sxazjpq\",\"name\":\"e\",\"type\":\"ualhbxxhejj\"},{\"properties\":{\"provisioningState\":\"Invalid\",\"privateEndpoint\":{\"id\":\"dgwdslfhot\"},\"privateLinkServiceConnectionState\":{\"status\":\"Failed\",\"description\":\"npwlbjnpg\",\"actionsRequired\":\"ftadehxnltyfs\"},\"groupIds\":[\"usue\",\"nzwdejba\"]},\"id\":\"rxzdmohctbqvudwx\",\"name\":\"ndnvo\",\"type\":\"gujjugwdkcglh\"}],\"publicNetworkAccess\":\"Enabled\"}")
                .toObject(ElasticSanProperties.class);
        Assertions.assertEquals(SkuName.PREMIUM_LRS, model.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals("uigdtopbobjog", model.availabilityZones().get(0));
        Assertions.assertEquals(1066773928950935617L, model.baseSizeTiB());
        Assertions.assertEquals(5337187329855698822L, model.extendedCapacitySizeTiB());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ElasticSanProperties model =
            new ElasticSanProperties()
                .withSku(new Sku().withName(SkuName.PREMIUM_LRS).withTier(SkuTier.PREMIUM))
                .withAvailabilityZones(Arrays.asList("uigdtopbobjog", "m", "w"))
                .withBaseSizeTiB(1066773928950935617L)
                .withExtendedCapacitySizeTiB(5337187329855698822L)
                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED);
        model = BinaryData.fromObject(model).toObject(ElasticSanProperties.class);
        Assertions.assertEquals(SkuName.PREMIUM_LRS, model.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals("uigdtopbobjog", model.availabilityZones().get(0));
        Assertions.assertEquals(1066773928950935617L, model.baseSizeTiB());
        Assertions.assertEquals(5337187329855698822L, model.extendedCapacitySizeTiB());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }
}
