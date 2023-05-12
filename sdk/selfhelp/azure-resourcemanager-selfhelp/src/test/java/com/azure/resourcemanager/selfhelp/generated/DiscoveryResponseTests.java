// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.fluent.models.SolutionMetadataResourceInner;
import com.azure.resourcemanager.selfhelp.models.DiscoveryResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiscoveryResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiscoveryResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"solutionId\":\"plwckbas\",\"solutionType\":\"pnddhsgcbacphejk\",\"description\":\"ynqgoulzndlikwyq\",\"requiredParameterSets\":[]},\"id\":\"gibma\",\"name\":\"gakeqsr\",\"type\":\"yb\"},{\"properties\":{\"solutionId\":\"e\",\"solutionType\":\"ytb\",\"description\":\"qfou\",\"requiredParameterSets\":[]},\"id\":\"mnkzsmod\",\"name\":\"glougpbk\",\"type\":\"tmut\"},{\"properties\":{\"solutionId\":\"ktapspwgcuertu\",\"solutionType\":\"dosvqwhbmdgbbjf\",\"description\":\"gmbmbexppbh\",\"requiredParameterSets\":[]},\"id\":\"rolfpfp\",\"name\":\"algbquxigjyjg\",\"type\":\"jaoyfhrtx\"},{\"properties\":{\"solutionId\":\"erkujys\",\"solutionType\":\"eju\",\"description\":\"qawrlyxwj\",\"requiredParameterSets\":[]},\"id\":\"rbnwbxgjvtbvpy\",\"name\":\"szdnr\",\"type\":\"jq\"}],\"nextLink\":\"hmuouqfprwzwbn\"}")
                .toObject(DiscoveryResponse.class);
        Assertions.assertEquals("plwckbas", model.value().get(0).solutionId());
        Assertions.assertEquals("pnddhsgcbacphejk", model.value().get(0).solutionType());
        Assertions.assertEquals("ynqgoulzndlikwyq", model.value().get(0).description());
        Assertions.assertEquals("hmuouqfprwzwbn", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiscoveryResponse model =
            new DiscoveryResponse()
                .withValue(
                    Arrays
                        .asList(
                            new SolutionMetadataResourceInner()
                                .withSolutionId("plwckbas")
                                .withSolutionType("pnddhsgcbacphejk")
                                .withDescription("ynqgoulzndlikwyq")
                                .withRequiredParameterSets(Arrays.asList()),
                            new SolutionMetadataResourceInner()
                                .withSolutionId("e")
                                .withSolutionType("ytb")
                                .withDescription("qfou")
                                .withRequiredParameterSets(Arrays.asList()),
                            new SolutionMetadataResourceInner()
                                .withSolutionId("ktapspwgcuertu")
                                .withSolutionType("dosvqwhbmdgbbjf")
                                .withDescription("gmbmbexppbh")
                                .withRequiredParameterSets(Arrays.asList()),
                            new SolutionMetadataResourceInner()
                                .withSolutionId("erkujys")
                                .withSolutionType("eju")
                                .withDescription("qawrlyxwj")
                                .withRequiredParameterSets(Arrays.asList())))
                .withNextLink("hmuouqfprwzwbn");
        model = BinaryData.fromObject(model).toObject(DiscoveryResponse.class);
        Assertions.assertEquals("plwckbas", model.value().get(0).solutionId());
        Assertions.assertEquals("pnddhsgcbacphejk", model.value().get(0).solutionType());
        Assertions.assertEquals("ynqgoulzndlikwyq", model.value().get(0).description());
        Assertions.assertEquals("hmuouqfprwzwbn", model.nextLink());
    }
}
