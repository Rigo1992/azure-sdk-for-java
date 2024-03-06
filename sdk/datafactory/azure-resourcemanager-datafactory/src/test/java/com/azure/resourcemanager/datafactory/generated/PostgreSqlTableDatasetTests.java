// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.PostgreSqlTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PostgreSqlTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PostgreSqlTableDataset model = BinaryData.fromString(
            "{\"type\":\"PostgreSqlTable\",\"typeProperties\":{\"tableName\":\"databgwzhbhflj\",\"table\":\"dataod\",\"schema\":\"dataovnlhrwya\"},\"description\":\"uafapwxsvdeatjio\",\"structure\":\"datairgoextqdn\",\"schema\":\"datagntimz\",\"linkedServiceName\":{\"referenceName\":\"upbmtbsetkods\",\"parameters\":{\"jyvdhdgdiwmlg\":\"dataedaakghcrzmm\",\"fkakhgkrvtyycvy\":\"datatmfetqjisjmolzca\",\"ejqaw\":\"datav\",\"pbbimh\":\"datausqpfzxkczbd\"}},\"parameters\":{\"zl\":{\"type\":\"Float\",\"defaultValue\":\"dataoortclnhbjcy\"},\"lkv\":{\"type\":\"SecureString\",\"defaultValue\":\"datascibv\"}},\"annotations\":[\"dataafnwqh\"],\"folder\":{\"name\":\"cnviulby\"},\"\":{\"umwhmxpuck\":\"datajzrycwpb\"}}")
            .toObject(PostgreSqlTableDataset.class);
        Assertions.assertEquals("uafapwxsvdeatjio", model.description());
        Assertions.assertEquals("upbmtbsetkods", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("zl").type());
        Assertions.assertEquals("cnviulby", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PostgreSqlTableDataset model = new PostgreSqlTableDataset().withDescription("uafapwxsvdeatjio")
            .withStructure("datairgoextqdn").withSchema("datagntimz")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("upbmtbsetkods")
                .withParameters(mapOf("jyvdhdgdiwmlg", "dataedaakghcrzmm", "fkakhgkrvtyycvy", "datatmfetqjisjmolzca",
                    "ejqaw", "datav", "pbbimh", "datausqpfzxkczbd")))
            .withParameters(mapOf("zl",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("dataoortclnhbjcy"), "lkv",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datascibv")))
            .withAnnotations(Arrays.asList("dataafnwqh")).withFolder(new DatasetFolder().withName("cnviulby"))
            .withTableName("databgwzhbhflj").withTable("dataod").withSchemaTypePropertiesSchema("dataovnlhrwya");
        model = BinaryData.fromObject(model).toObject(PostgreSqlTableDataset.class);
        Assertions.assertEquals("uafapwxsvdeatjio", model.description());
        Assertions.assertEquals("upbmtbsetkods", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("zl").type());
        Assertions.assertEquals("cnviulby", model.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
