// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.SkuAvailabilityListResultInner;
import com.azure.resourcemanager.cognitiveservices.models.SkuAvailability;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SkuAvailabilityListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuAvailabilityListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"kind\":\"ljuahaquhcdh\",\"type\":\"ualaexqpvfadmw\",\"skuName\":\"crgvxpvgom\",\"skuAvailable\":false,\"reason\":\"isgwbnbbeldawkz\",\"message\":\"liourqhak\"},{\"kind\":\"hashsfwxosow\",\"type\":\"cugicjoox\",\"skuName\":\"ebwpucwwfvo\",\"skuAvailable\":false,\"reason\":\"euecivyhzceuoj\",\"message\":\"rw\"},{\"kind\":\"eiotwmcdytdx\",\"type\":\"txnrjaw\",\"skuName\":\"wgxhn\",\"skuAvailable\":true,\"reason\":\"fbkp\",\"message\":\"gklwn\"}]}")
                .toObject(SkuAvailabilityListResultInner.class);
        Assertions.assertEquals("ljuahaquhcdh", model.value().get(0).kind());
        Assertions.assertEquals("ualaexqpvfadmw", model.value().get(0).type());
        Assertions.assertEquals("crgvxpvgom", model.value().get(0).skuName());
        Assertions.assertEquals(false, model.value().get(0).skuAvailable());
        Assertions.assertEquals("isgwbnbbeldawkz", model.value().get(0).reason());
        Assertions.assertEquals("liourqhak", model.value().get(0).message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuAvailabilityListResultInner model =
            new SkuAvailabilityListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new SkuAvailability()
                                .withKind("ljuahaquhcdh")
                                .withType("ualaexqpvfadmw")
                                .withSkuName("crgvxpvgom")
                                .withSkuAvailable(false)
                                .withReason("isgwbnbbeldawkz")
                                .withMessage("liourqhak"),
                            new SkuAvailability()
                                .withKind("hashsfwxosow")
                                .withType("cugicjoox")
                                .withSkuName("ebwpucwwfvo")
                                .withSkuAvailable(false)
                                .withReason("euecivyhzceuoj")
                                .withMessage("rw"),
                            new SkuAvailability()
                                .withKind("eiotwmcdytdx")
                                .withType("txnrjaw")
                                .withSkuName("wgxhn")
                                .withSkuAvailable(true)
                                .withReason("fbkp")
                                .withMessage("gklwn")));
        model = BinaryData.fromObject(model).toObject(SkuAvailabilityListResultInner.class);
        Assertions.assertEquals("ljuahaquhcdh", model.value().get(0).kind());
        Assertions.assertEquals("ualaexqpvfadmw", model.value().get(0).type());
        Assertions.assertEquals("crgvxpvgom", model.value().get(0).skuName());
        Assertions.assertEquals(false, model.value().get(0).skuAvailable());
        Assertions.assertEquals("isgwbnbbeldawkz", model.value().get(0).reason());
        Assertions.assertEquals("liourqhak", model.value().get(0).message());
    }
}
