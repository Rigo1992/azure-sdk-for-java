// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataTableResponseColumn;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataTableResponseObject;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticDataTableResponseObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticDataTableResponseObject model =
            BinaryData
                .fromString(
                    "{\"tableName\":\"gdufiqnd\",\"columns\":[{\"columnName\":\"ao\",\"dataType\":\"chvcyyysfgdo\",\"columnType\":\"ubiipuipwoqonma\"},{\"columnName\":\"ekni\",\"dataType\":\"hqvcimpevfgmblr\",\"columnType\":\"lbywdxsm\"},{\"columnName\":\"cwrwfs\",\"dataType\":\"fnynszqujizdvoqy\",\"columnType\":\"byowbblgyavutp\"},{\"columnName\":\"joxoism\",\"dataType\":\"sbpimlq\",\"columnType\":\"jxkcgxxlxsff\"}],\"rows\":[\"dataizqzdwlvwlyou\",\"datafgfb\"]}")
                .toObject(DiagnosticDataTableResponseObject.class);
        Assertions.assertEquals("gdufiqnd", model.tableName());
        Assertions.assertEquals("ao", model.columns().get(0).columnName());
        Assertions.assertEquals("chvcyyysfgdo", model.columns().get(0).dataType());
        Assertions.assertEquals("ubiipuipwoqonma", model.columns().get(0).columnType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticDataTableResponseObject model =
            new DiagnosticDataTableResponseObject()
                .withTableName("gdufiqnd")
                .withColumns(
                    Arrays
                        .asList(
                            new DiagnosticDataTableResponseColumn()
                                .withColumnName("ao")
                                .withDataType("chvcyyysfgdo")
                                .withColumnType("ubiipuipwoqonma"),
                            new DiagnosticDataTableResponseColumn()
                                .withColumnName("ekni")
                                .withDataType("hqvcimpevfgmblr")
                                .withColumnType("lbywdxsm"),
                            new DiagnosticDataTableResponseColumn()
                                .withColumnName("cwrwfs")
                                .withDataType("fnynszqujizdvoqy")
                                .withColumnType("byowbblgyavutp"),
                            new DiagnosticDataTableResponseColumn()
                                .withColumnName("joxoism")
                                .withDataType("sbpimlq")
                                .withColumnType("jxkcgxxlxsff")))
                .withRows(Arrays.asList("dataizqzdwlvwlyou", "datafgfb"));
        model = BinaryData.fromObject(model).toObject(DiagnosticDataTableResponseObject.class);
        Assertions.assertEquals("gdufiqnd", model.tableName());
        Assertions.assertEquals("ao", model.columns().get(0).columnName());
        Assertions.assertEquals("chvcyyysfgdo", model.columns().get(0).dataType());
        Assertions.assertEquals("ubiipuipwoqonma", model.columns().get(0).columnType());
    }
}
