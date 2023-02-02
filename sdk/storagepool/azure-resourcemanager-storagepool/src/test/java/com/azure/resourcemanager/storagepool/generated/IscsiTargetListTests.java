// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagepool.fluent.models.IscsiTargetInner;
import com.azure.resourcemanager.storagepool.models.IscsiTargetAclMode;
import com.azure.resourcemanager.storagepool.models.IscsiTargetList;
import com.azure.resourcemanager.storagepool.models.OperationalStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IscsiTargetListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IscsiTargetList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"aclMode\":\"Static\",\"staticAcls\":[],\"luns\":[],\"targetIqn\":\"cxgod\",\"provisioningState\":\"Failed\",\"status\":\"Healthy\",\"endpoints\":[],\"port\":898595537,\"sessions\":[]},\"systemData\":{\"createdBy\":\"pukgriwflzlfb\",\"createdByType\":\"User\",\"createdAt\":\"2021-01-25T03:22:02Z\",\"lastModifiedBy\":\"cispnqzahmgkbr\",\"lastModifiedByType\":\"User\",\"lastModifiedAt\":\"2021-09-12T06:35:13Z\"},\"managedBy\":\"bnuqqkpik\",\"managedByExtended\":[\"gvtqagnbuynh\",\"jggmebfsiarbu\"],\"id\":\"rcvpnazzmhjrunmp\",\"name\":\"ttdbhrbnl\",\"type\":\"nkxmyskpbhenbtk\"},{\"properties\":{\"aclMode\":\"Static\",\"staticAcls\":[],\"luns\":[],\"targetIqn\":\"ny\",\"provisioningState\":\"Succeeded\",\"status\":\"Unknown\",\"endpoints\":[],\"port\":815551540,\"sessions\":[]},\"systemData\":{\"createdBy\":\"dybyxczfclhaa\",\"createdByType\":\"ManagedIdentity\",\"createdAt\":\"2021-10-14T00:40:36Z\",\"lastModifiedBy\":\"hlwrqlfkts\",\"lastModifiedByType\":\"Key\",\"lastModifiedAt\":\"2021-11-18T02:17:24Z\"},\"managedBy\":\"cmnyyazttb\",\"managedByExtended\":[\"rq\",\"uedck\"],\"id\":\"ywbiexzfeyueax\",\"name\":\"bxu\",\"type\":\"wbhqwal\"},{\"properties\":{\"aclMode\":\"Dynamic\",\"staticAcls\":[],\"luns\":[],\"targetIqn\":\"oxaepd\",\"provisioningState\":\"Canceled\",\"status\":\"Healthy\",\"endpoints\":[],\"port\":539118010,\"sessions\":[]},\"systemData\":{\"createdBy\":\"hdwbavxbniwdjs\",\"createdByType\":\"Application\",\"createdAt\":\"2021-10-04T13:18:18Z\",\"lastModifiedBy\":\"pgn\",\"lastModifiedByType\":\"User\",\"lastModifiedAt\":\"2021-01-12T15:14:05Z\"},\"managedBy\":\"zxbzpfzabglc\",\"managedByExtended\":[\"wtctyqi\",\"lbbovplw\",\"bhvgy\",\"gu\"],\"id\":\"svmkfssxquk\",\"name\":\"fpl\",\"type\":\"mg\"},{\"properties\":{\"aclMode\":\"Static\",\"staticAcls\":[],\"luns\":[],\"targetIqn\":\"jzkdeslpvlopwi\",\"provisioningState\":\"Failed\",\"status\":\"Unhealthy\",\"endpoints\":[],\"port\":2017228559,\"sessions\":[]},\"systemData\":{\"createdBy\":\"zb\",\"createdByType\":\"ManagedIdentity\",\"createdAt\":\"2021-05-16T00:27:54Z\",\"lastModifiedBy\":\"a\",\"lastModifiedByType\":\"Key\",\"lastModifiedAt\":\"2021-03-15T03:03:20Z\"},\"managedBy\":\"ped\",\"managedByExtended\":[\"nabckhsmtx\"],\"id\":\"siebtfhvpesapskr\",\"name\":\"qmhjjdhtld\",\"type\":\"kyzxuutk\"}],\"nextLink\":\"ws\"}")
                .toObject(IscsiTargetList.class);
        Assertions.assertEquals(IscsiTargetAclMode.STATIC, model.value().get(0).aclMode());
        Assertions.assertEquals("cxgod", model.value().get(0).targetIqn());
        Assertions.assertEquals(OperationalStatus.HEALTHY, model.value().get(0).status());
        Assertions.assertEquals(898595537, model.value().get(0).port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IscsiTargetList model =
            new IscsiTargetList()
                .withValue(
                    Arrays
                        .asList(
                            new IscsiTargetInner()
                                .withAclMode(IscsiTargetAclMode.STATIC)
                                .withStaticAcls(Arrays.asList())
                                .withLuns(Arrays.asList())
                                .withTargetIqn("cxgod")
                                .withStatus(OperationalStatus.HEALTHY)
                                .withEndpoints(Arrays.asList())
                                .withPort(898595537),
                            new IscsiTargetInner()
                                .withAclMode(IscsiTargetAclMode.STATIC)
                                .withStaticAcls(Arrays.asList())
                                .withLuns(Arrays.asList())
                                .withTargetIqn("ny")
                                .withStatus(OperationalStatus.UNKNOWN)
                                .withEndpoints(Arrays.asList())
                                .withPort(815551540),
                            new IscsiTargetInner()
                                .withAclMode(IscsiTargetAclMode.DYNAMIC)
                                .withStaticAcls(Arrays.asList())
                                .withLuns(Arrays.asList())
                                .withTargetIqn("oxaepd")
                                .withStatus(OperationalStatus.HEALTHY)
                                .withEndpoints(Arrays.asList())
                                .withPort(539118010),
                            new IscsiTargetInner()
                                .withAclMode(IscsiTargetAclMode.STATIC)
                                .withStaticAcls(Arrays.asList())
                                .withLuns(Arrays.asList())
                                .withTargetIqn("jzkdeslpvlopwi")
                                .withStatus(OperationalStatus.UNHEALTHY)
                                .withEndpoints(Arrays.asList())
                                .withPort(2017228559)));
        model = BinaryData.fromObject(model).toObject(IscsiTargetList.class);
        Assertions.assertEquals(IscsiTargetAclMode.STATIC, model.value().get(0).aclMode());
        Assertions.assertEquals("cxgod", model.value().get(0).targetIqn());
        Assertions.assertEquals(OperationalStatus.HEALTHY, model.value().get(0).status());
        Assertions.assertEquals(898595537, model.value().get(0).port());
    }
}
