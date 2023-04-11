// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelUpdatePropertiesInner;
import com.azure.resourcemanager.synapse.models.SensitivityLabelRank;
import com.azure.resourcemanager.synapse.models.SensitivityLabelUpdateKind;
import org.junit.jupiter.api.Assertions;

public final class SensitivityLabelUpdatePropertiesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SensitivityLabelUpdatePropertiesInner model =
            BinaryData
                .fromString(
                    "{\"op\":\"set\",\"schema\":\"ldsyuuximerqfob\",\"table\":\"yznkby\",\"column\":\"utwpfhp\",\"sensitivityLabel\":{\"properties\":{\"schemaName\":\"r\",\"tableName\":\"dsnfdsdoakgtdl\",\"columnName\":\"kzevdlhewpusds\",\"labelName\":\"wvogvbbejdc\",\"labelId\":\"qqmoaku\",\"informationType\":\"m\",\"informationTypeId\":\"rwr\",\"isDisabled\":true,\"rank\":\"Critical\"},\"managedBy\":\"enuuzkopbm\",\"id\":\"nrfdw\",\"name\":\"yuhhziu\",\"type\":\"efozbhdms\"}}")
                .toObject(SensitivityLabelUpdatePropertiesInner.class);
        Assertions.assertEquals(SensitivityLabelUpdateKind.SET, model.op());
        Assertions.assertEquals("ldsyuuximerqfob", model.schema());
        Assertions.assertEquals("yznkby", model.table());
        Assertions.assertEquals("utwpfhp", model.column());
        Assertions.assertEquals("wvogvbbejdc", model.sensitivityLabel().labelName());
        Assertions.assertEquals("qqmoaku", model.sensitivityLabel().labelId());
        Assertions.assertEquals("m", model.sensitivityLabel().informationType());
        Assertions.assertEquals("rwr", model.sensitivityLabel().informationTypeId());
        Assertions.assertEquals(SensitivityLabelRank.CRITICAL, model.sensitivityLabel().rank());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SensitivityLabelUpdatePropertiesInner model =
            new SensitivityLabelUpdatePropertiesInner()
                .withOp(SensitivityLabelUpdateKind.SET)
                .withSchema("ldsyuuximerqfob")
                .withTable("yznkby")
                .withColumn("utwpfhp")
                .withSensitivityLabel(
                    new SensitivityLabelInner()
                        .withLabelName("wvogvbbejdc")
                        .withLabelId("qqmoaku")
                        .withInformationType("m")
                        .withInformationTypeId("rwr")
                        .withRank(SensitivityLabelRank.CRITICAL));
        model = BinaryData.fromObject(model).toObject(SensitivityLabelUpdatePropertiesInner.class);
        Assertions.assertEquals(SensitivityLabelUpdateKind.SET, model.op());
        Assertions.assertEquals("ldsyuuximerqfob", model.schema());
        Assertions.assertEquals("yznkby", model.table());
        Assertions.assertEquals("utwpfhp", model.column());
        Assertions.assertEquals("wvogvbbejdc", model.sensitivityLabel().labelName());
        Assertions.assertEquals("qqmoaku", model.sensitivityLabel().labelId());
        Assertions.assertEquals("m", model.sensitivityLabel().informationType());
        Assertions.assertEquals("rwr", model.sensitivityLabel().informationTypeId());
        Assertions.assertEquals(SensitivityLabelRank.CRITICAL, model.sensitivityLabel().rank());
    }
}
