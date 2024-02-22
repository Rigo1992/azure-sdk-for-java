// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.LogSpecification;
import com.azure.resourcemanager.healthcareapis.models.MetricDimension;
import com.azure.resourcemanager.healthcareapis.models.MetricSpecification;
import com.azure.resourcemanager.healthcareapis.models.OperationProperties;
import com.azure.resourcemanager.healthcareapis.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationProperties model = BinaryData.fromString(
            "{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"areqna\",\"displayName\":\"qugjhkycube\",\"blobDuration\":\"gssofwq\"},{\"name\":\"qal\",\"displayName\":\"mnjijpxacqqudf\",\"blobDuration\":\"yxbaaabjyvayf\"},{\"name\":\"m\",\"displayName\":\"rtuzqogs\",\"blobDuration\":\"nevfdnw\"},{\"name\":\"mewzsyyc\",\"displayName\":\"zsoibjudpfrxtr\",\"blobDuration\":\"zvaytdwkqbr\"}],\"metricSpecifications\":[{\"name\":\"axhexiilivp\",\"displayName\":\"iirqtd\",\"displayDescription\":\"axoruzfgsquy\",\"unit\":\"rxxle\",\"category\":\"ramxjezwlwnw\",\"aggregationType\":\"qlcvydy\",\"supportedAggregationTypes\":[\"dooaojkniodko\",\"ebwnujhe\"],\"supportedTimeGrainTypes\":[\"bvdkcrodtjin\",\"wj\",\"fltkacjv\",\"f\"],\"fillGapWithZero\":false,\"metricFilterPattern\":\"oakggkfpag\",\"dimensions\":[{\"name\":\"ulpqblylsyxkqjn\",\"displayName\":\"ervtiagxs\",\"toBeExportedForShoebox\":true}],\"isInternal\":false,\"sourceMdmAccount\":\"psbzkfzbeyvpn\",\"sourceMdmNamespace\":\"cvinvkjjxdxrbuuk\",\"enableRegionalMdmAccount\":true,\"resourceIdDimensionNameOverride\":\"wyhmlw\"},{\"name\":\"ztzp\",\"displayName\":\"ncckw\",\"displayDescription\":\"zqwhxxbuyqaxzfeq\",\"unit\":\"ppriol\",\"category\":\"rjaltolmncw\",\"aggregationType\":\"bqwcsdbnwdcf\",\"supportedAggregationTypes\":[\"qdpfuvglsbjjca\",\"vxb\"],\"supportedTimeGrainTypes\":[\"udutnco\",\"mr\",\"xqtvcofu\"],\"fillGapWithZero\":false,\"metricFilterPattern\":\"kgjubgdknnqvsazn\",\"dimensions\":[{\"name\":\"rudsg\",\"displayName\":\"hmk\",\"toBeExportedForShoebox\":true}],\"isInternal\":true,\"sourceMdmAccount\":\"wjue\",\"sourceMdmNamespace\":\"eburu\",\"enableRegionalMdmAccount\":true,\"resourceIdDimensionNameOverride\":\"vsmzlxwab\"},{\"name\":\"oefki\",\"displayName\":\"vtpuqujmqlgk\",\"displayDescription\":\"tndoaongbjc\",\"unit\":\"ujitcjedftww\",\"category\":\"zkoj\",\"aggregationType\":\"c\",\"supportedAggregationTypes\":[\"oqouicybxarzgszu\",\"oxciqopidoamcio\",\"hkh\"],\"supportedTimeGrainTypes\":[\"khnzbonlw\",\"toego\",\"dwbwhkszzcmrvexz\",\"vbtqgsfraoyzk\"],\"fillGapWithZero\":false,\"metricFilterPattern\":\"lmnguxaw\",\"dimensions\":[{\"name\":\"syuuximerq\",\"displayName\":\"bw\",\"toBeExportedForShoebox\":true},{\"name\":\"bykutw\",\"displayName\":\"hpagm\",\"toBeExportedForShoebox\":true},{\"name\":\"dsnfdsdoakgtdl\",\"displayName\":\"kzevdlhewpusds\",\"toBeExportedForShoebox\":true},{\"name\":\"ogvbbejdcngq\",\"displayName\":\"oakufgm\",\"toBeExportedForShoebox\":false}],\"isInternal\":false,\"sourceMdmAccount\":\"grtwae\",\"sourceMdmNamespace\":\"uzkopbminrfd\",\"enableRegionalMdmAccount\":false,\"resourceIdDimensionNameOverride\":\"hhziuief\"},{\"name\":\"bhdmsmlmzqhof\",\"displayName\":\"maequiahxicslfa\",\"displayDescription\":\"z\",\"unit\":\"yylhalnswhccsp\",\"category\":\"aivwitqscywu\",\"aggregationType\":\"woluhczbwemhair\",\"supportedAggregationTypes\":[\"gzd\",\"msweypqwdxggicc\",\"n\"],\"supportedTimeGrainTypes\":[\"uexmkttlst\",\"lzywemhzrncsdtc\"],\"fillGapWithZero\":false,\"metricFilterPattern\":\"ypbsfgytguslfead\",\"dimensions\":[{\"name\":\"ukyhejhzis\",\"displayName\":\"fpel\",\"toBeExportedForShoebox\":false}],\"isInternal\":false,\"sourceMdmAccount\":\"srp\",\"sourceMdmNamespace\":\"ujzra\",\"enableRegionalMdmAccount\":false,\"resourceIdDimensionNameOverride\":\"dw\"}]}}")
            .toObject(OperationProperties.class);
        Assertions.assertEquals("areqna", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("qugjhkycube", model.serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("gssofwq", model.serviceSpecification().logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("axhexiilivp", model.serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("iirqtd", model.serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions.assertEquals("axoruzfgsquy",
            model.serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("rxxle", model.serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals("ramxjezwlwnw", model.serviceSpecification().metricSpecifications().get(0).category());
        Assertions.assertEquals("qlcvydy",
            model.serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("dooaojkniodko",
            model.serviceSpecification().metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("bvdkcrodtjin",
            model.serviceSpecification().metricSpecifications().get(0).supportedTimeGrainTypes().get(0));
        Assertions.assertEquals(false, model.serviceSpecification().metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("oakggkfpag",
            model.serviceSpecification().metricSpecifications().get(0).metricFilterPattern());
        Assertions.assertEquals("ulpqblylsyxkqjn",
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).name());
        Assertions.assertEquals("ervtiagxs",
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).displayName());
        Assertions.assertEquals(true,
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals(false, model.serviceSpecification().metricSpecifications().get(0).isInternal());
        Assertions.assertEquals("psbzkfzbeyvpn",
            model.serviceSpecification().metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("cvinvkjjxdxrbuuk",
            model.serviceSpecification().metricSpecifications().get(0).sourceMdmNamespace());
        Assertions.assertEquals(true,
            model.serviceSpecification().metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("wyhmlw",
            model.serviceSpecification().metricSpecifications().get(0).resourceIdDimensionNameOverride());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationProperties model
            = new OperationProperties()
                .withServiceSpecification(
                    new ServiceSpecification().withLogSpecifications(Arrays.asList(
                        new LogSpecification().withName("areqna").withDisplayName("qugjhkycube")
                            .withBlobDuration("gssofwq"),
                        new LogSpecification().withName("qal").withDisplayName("mnjijpxacqqudf")
                            .withBlobDuration("yxbaaabjyvayf"),
                        new LogSpecification().withName("m").withDisplayName("rtuzqogs").withBlobDuration("nevfdnw"),
                        new LogSpecification().withName("mewzsyyc").withDisplayName("zsoibjudpfrxtr")
                            .withBlobDuration("zvaytdwkqbr")))
                        .withMetricSpecifications(
                            Arrays
                                .asList(
                                    new MetricSpecification().withName("axhexiilivp").withDisplayName("iirqtd")
                                        .withDisplayDescription("axoruzfgsquy").withUnit("rxxle")
                                        .withCategory("ramxjezwlwnw").withAggregationType("qlcvydy")
                                        .withSupportedAggregationTypes(Arrays.asList("dooaojkniodko", "ebwnujhe"))
                                        .withSupportedTimeGrainTypes(
                                            Arrays.asList("bvdkcrodtjin", "wj", "fltkacjv", "f"))
                                        .withFillGapWithZero(false).withMetricFilterPattern("oakggkfpag")
                                        .withDimensions(Arrays.asList(new MetricDimension().withName("ulpqblylsyxkqjn")
                                            .withDisplayName("ervtiagxs").withToBeExportedForShoebox(true)))
                                        .withIsInternal(false).withSourceMdmAccount("psbzkfzbeyvpn")
                                        .withSourceMdmNamespace("cvinvkjjxdxrbuuk").withEnableRegionalMdmAccount(true)
                                        .withResourceIdDimensionNameOverride("wyhmlw"),
                                    new MetricSpecification().withName("ztzp").withDisplayName("ncckw")
                                        .withDisplayDescription("zqwhxxbuyqaxzfeq").withUnit("ppriol")
                                        .withCategory("rjaltolmncw").withAggregationType("bqwcsdbnwdcf")
                                        .withSupportedAggregationTypes(Arrays.asList("qdpfuvglsbjjca", "vxb"))
                                        .withSupportedTimeGrainTypes(Arrays.asList("udutnco", "mr", "xqtvcofu"))
                                        .withFillGapWithZero(false).withMetricFilterPattern("kgjubgdknnqvsazn")
                                        .withDimensions(Arrays.asList(new MetricDimension().withName("rudsg")
                                            .withDisplayName("hmk").withToBeExportedForShoebox(true)))
                                        .withIsInternal(true).withSourceMdmAccount("wjue")
                                        .withSourceMdmNamespace("eburu").withEnableRegionalMdmAccount(true)
                                        .withResourceIdDimensionNameOverride("vsmzlxwab"),
                                    new MetricSpecification().withName("oefki").withDisplayName("vtpuqujmqlgk")
                                        .withDisplayDescription("tndoaongbjc").withUnit("ujitcjedftww")
                                        .withCategory("zkoj").withAggregationType("c")
                                        .withSupportedAggregationTypes(
                                            Arrays.asList("oqouicybxarzgszu", "oxciqopidoamcio", "hkh"))
                                        .withSupportedTimeGrainTypes(
                                            Arrays.asList("khnzbonlw", "toego", "dwbwhkszzcmrvexz", "vbtqgsfraoyzk"))
                                        .withFillGapWithZero(false).withMetricFilterPattern("lmnguxaw")
                                        .withDimensions(Arrays.asList(
                                            new MetricDimension().withName("syuuximerq").withDisplayName("bw")
                                                .withToBeExportedForShoebox(true),
                                            new MetricDimension().withName("bykutw").withDisplayName("hpagm")
                                                .withToBeExportedForShoebox(true),
                                            new MetricDimension().withName("dsnfdsdoakgtdl")
                                                .withDisplayName("kzevdlhewpusds").withToBeExportedForShoebox(true),
                                            new MetricDimension().withName("ogvbbejdcngq").withDisplayName("oakufgm")
                                                .withToBeExportedForShoebox(false)))
                                        .withIsInternal(false).withSourceMdmAccount("grtwae")
                                        .withSourceMdmNamespace("uzkopbminrfd").withEnableRegionalMdmAccount(false)
                                        .withResourceIdDimensionNameOverride("hhziuief"),
                                    new MetricSpecification().withName("bhdmsmlmzqhof")
                                        .withDisplayName("maequiahxicslfa").withDisplayDescription("z")
                                        .withUnit("yylhalnswhccsp").withCategory("aivwitqscywu")
                                        .withAggregationType("woluhczbwemhair")
                                        .withSupportedAggregationTypes(Arrays.asList("gzd", "msweypqwdxggicc", "n"))
                                        .withSupportedTimeGrainTypes(Arrays.asList("uexmkttlst", "lzywemhzrncsdtc"))
                                        .withFillGapWithZero(false).withMetricFilterPattern("ypbsfgytguslfead")
                                        .withDimensions(Arrays.asList(new MetricDimension().withName("ukyhejhzis")
                                            .withDisplayName("fpel").withToBeExportedForShoebox(false)))
                                        .withIsInternal(false).withSourceMdmAccount("srp")
                                        .withSourceMdmNamespace("ujzra").withEnableRegionalMdmAccount(false)
                                        .withResourceIdDimensionNameOverride("dw"))));
        model = BinaryData.fromObject(model).toObject(OperationProperties.class);
        Assertions.assertEquals("areqna", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("qugjhkycube", model.serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("gssofwq", model.serviceSpecification().logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("axhexiilivp", model.serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("iirqtd", model.serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions.assertEquals("axoruzfgsquy",
            model.serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("rxxle", model.serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals("ramxjezwlwnw", model.serviceSpecification().metricSpecifications().get(0).category());
        Assertions.assertEquals("qlcvydy",
            model.serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("dooaojkniodko",
            model.serviceSpecification().metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("bvdkcrodtjin",
            model.serviceSpecification().metricSpecifications().get(0).supportedTimeGrainTypes().get(0));
        Assertions.assertEquals(false, model.serviceSpecification().metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("oakggkfpag",
            model.serviceSpecification().metricSpecifications().get(0).metricFilterPattern());
        Assertions.assertEquals("ulpqblylsyxkqjn",
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).name());
        Assertions.assertEquals("ervtiagxs",
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).displayName());
        Assertions.assertEquals(true,
            model.serviceSpecification().metricSpecifications().get(0).dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals(false, model.serviceSpecification().metricSpecifications().get(0).isInternal());
        Assertions.assertEquals("psbzkfzbeyvpn",
            model.serviceSpecification().metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("cvinvkjjxdxrbuuk",
            model.serviceSpecification().metricSpecifications().get(0).sourceMdmNamespace());
        Assertions.assertEquals(true,
            model.serviceSpecification().metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("wyhmlw",
            model.serviceSpecification().metricSpecifications().get(0).resourceIdDimensionNameOverride());
    }
}
