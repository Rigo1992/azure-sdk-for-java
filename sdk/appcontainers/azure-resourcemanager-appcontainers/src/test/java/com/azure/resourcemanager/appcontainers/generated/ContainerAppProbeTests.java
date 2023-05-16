// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbe;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGet;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGetHttpHeadersItem;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeTcpSocket;
import com.azure.resourcemanager.appcontainers.models.Scheme;
import com.azure.resourcemanager.appcontainers.models.Type;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ContainerAppProbeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerAppProbe model =
            BinaryData
                .fromString(
                    "{\"failureThreshold\":1997229408,\"httpGet\":{\"host\":\"jlfltkacjvefkdlf\",\"httpHeaders\":[{\"name\":\"ggkfpagaowpul\",\"value\":\"qblylsyxkqj\"},{\"name\":\"sjervti\",\"value\":\"gxsds\"}],\"path\":\"e\",\"port\":1182322128,\"scheme\":\"HTTPS\"},\"initialDelaySeconds\":1594763587,\"periodSeconds\":71389459,\"successThreshold\":1389741266,\"tcpSocket\":{\"host\":\"pnqi\",\"port\":1460158080},\"terminationGracePeriodSeconds\":8477504172478535951,\"timeoutSeconds\":887231612,\"type\":\"Startup\"}")
                .toObject(ContainerAppProbe.class);
        Assertions.assertEquals(1997229408, model.failureThreshold());
        Assertions.assertEquals("jlfltkacjvefkdlf", model.httpGet().host());
        Assertions.assertEquals("ggkfpagaowpul", model.httpGet().httpHeaders().get(0).name());
        Assertions.assertEquals("qblylsyxkqj", model.httpGet().httpHeaders().get(0).value());
        Assertions.assertEquals("e", model.httpGet().path());
        Assertions.assertEquals(1182322128, model.httpGet().port());
        Assertions.assertEquals(Scheme.HTTPS, model.httpGet().scheme());
        Assertions.assertEquals(1594763587, model.initialDelaySeconds());
        Assertions.assertEquals(71389459, model.periodSeconds());
        Assertions.assertEquals(1389741266, model.successThreshold());
        Assertions.assertEquals("pnqi", model.tcpSocket().host());
        Assertions.assertEquals(1460158080, model.tcpSocket().port());
        Assertions.assertEquals(8477504172478535951L, model.terminationGracePeriodSeconds());
        Assertions.assertEquals(887231612, model.timeoutSeconds());
        Assertions.assertEquals(Type.STARTUP, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerAppProbe model =
            new ContainerAppProbe()
                .withFailureThreshold(1997229408)
                .withHttpGet(
                    new ContainerAppProbeHttpGet()
                        .withHost("jlfltkacjvefkdlf")
                        .withHttpHeaders(
                            Arrays
                                .asList(
                                    new ContainerAppProbeHttpGetHttpHeadersItem()
                                        .withName("ggkfpagaowpul")
                                        .withValue("qblylsyxkqj"),
                                    new ContainerAppProbeHttpGetHttpHeadersItem()
                                        .withName("sjervti")
                                        .withValue("gxsds")))
                        .withPath("e")
                        .withPort(1182322128)
                        .withScheme(Scheme.HTTPS))
                .withInitialDelaySeconds(1594763587)
                .withPeriodSeconds(71389459)
                .withSuccessThreshold(1389741266)
                .withTcpSocket(new ContainerAppProbeTcpSocket().withHost("pnqi").withPort(1460158080))
                .withTerminationGracePeriodSeconds(8477504172478535951L)
                .withTimeoutSeconds(887231612)
                .withType(Type.STARTUP);
        model = BinaryData.fromObject(model).toObject(ContainerAppProbe.class);
        Assertions.assertEquals(1997229408, model.failureThreshold());
        Assertions.assertEquals("jlfltkacjvefkdlf", model.httpGet().host());
        Assertions.assertEquals("ggkfpagaowpul", model.httpGet().httpHeaders().get(0).name());
        Assertions.assertEquals("qblylsyxkqj", model.httpGet().httpHeaders().get(0).value());
        Assertions.assertEquals("e", model.httpGet().path());
        Assertions.assertEquals(1182322128, model.httpGet().port());
        Assertions.assertEquals(Scheme.HTTPS, model.httpGet().scheme());
        Assertions.assertEquals(1594763587, model.initialDelaySeconds());
        Assertions.assertEquals(71389459, model.periodSeconds());
        Assertions.assertEquals(1389741266, model.successThreshold());
        Assertions.assertEquals("pnqi", model.tcpSocket().host());
        Assertions.assertEquals(1460158080, model.tcpSocket().port());
        Assertions.assertEquals(8477504172478535951L, model.terminationGracePeriodSeconds());
        Assertions.assertEquals(887231612, model.timeoutSeconds());
        Assertions.assertEquals(Type.STARTUP, model.type());
    }
}
