// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.KubernetesVersionProfileProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.KubernetesVersionProperties;
import java.util.Arrays;

public final class KubernetesVersionProfilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KubernetesVersionProfileProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Creating\",\"values\":[{\"version\":\"axkffei\",\"capabilities\":{\"supportPlan\":[\"vmezy\",\"shxmzsbbzoggigrx\",\"burvjxxjnspy\",\"ptkoenkoukn\"]},\"isPreview\":true,\"patchVersions\":{\"mrbpizcdrqj\":{\"readiness\":[{},{},{}],\"upgrades\":[\"ldngkpoci\",\"azyxoegukg\",\"npiucgygevqznty\"]},\"alpbuxwgipwhon\":{\"readiness\":[{}],\"upgrades\":[\"nfyhx\",\"eoejzic\",\"ifsjttgzfbishcb\",\"hajdeyeamdpha\"]},\"zlsico\":{\"readiness\":[{},{}],\"upgrades\":[\"hwankixzbinjepu\",\"tmryw\",\"uzoqft\",\"yqzrnkcqvyxlw\"]},\"oklyaxuconuq\":{\"readiness\":[{}],\"upgrades\":[\"wvl\",\"yav\",\"hheunmmqhgyx\",\"konocu\"]}}},{\"version\":\"fkbey\",\"capabilities\":{\"supportPlan\":[\"mjmwvvjektcx\",\"enhwlrs\",\"frzpwvlqdqgb\"]},\"isPreview\":true,\"patchVersions\":{\"i\":{\"readiness\":[{}],\"upgrades\":[\"tcktvfcivfsnky\",\"uctqhjfbe\",\"rjcxerfuwu\",\"ttxfvjr\"]},\"oxgvclt\":{\"readiness\":[{},{},{},{}],\"upgrades\":[\"pcyvahfnljkyqx\",\"vuujq\",\"idokgjlj\"]},\"htxfvgxbfsmxnehm\":{\"readiness\":[{},{},{}],\"upgrades\":[\"ghkjeszzhbi\"]}}},{\"version\":\"ec\",\"capabilities\":{\"supportPlan\":[\"ebfqkkrbm\",\"ukgri\",\"flz\",\"fbxzpuzycisp\"]},\"isPreview\":true,\"patchVersions\":{\"hibnuqqkpika\":{\"readiness\":[{},{}],\"upgrades\":[\"rp\",\"y\"]},\"pnazzm\":{\"readiness\":[{},{},{}],\"upgrades\":[\"qagnbuyn\",\"ijggmebfsiar\",\"utrc\"]},\"tkcxywnytnrsy\":{\"readiness\":[{},{}],\"upgrades\":[\"mpxttdbhrbnlankx\",\"yskpbhen\"]}}}]}")
            .toObject(KubernetesVersionProfileProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KubernetesVersionProfileProperties model
            = new KubernetesVersionProfileProperties().withValues(Arrays.asList(new KubernetesVersionProperties(),
                new KubernetesVersionProperties(), new KubernetesVersionProperties()));
        model = BinaryData.fromObject(model).toObject(KubernetesVersionProfileProperties.class);
    }
}
