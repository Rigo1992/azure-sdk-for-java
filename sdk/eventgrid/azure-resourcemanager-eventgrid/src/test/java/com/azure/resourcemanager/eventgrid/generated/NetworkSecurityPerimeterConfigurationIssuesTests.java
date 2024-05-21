// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationIssues;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationIssueSeverity;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationIssueType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkSecurityPerimeterConfigurationIssuesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkSecurityPerimeterConfigurationIssues model = BinaryData.fromString(
            "{\"name\":\"tvwkpqhjpenu\",\"properties\":{\"issueType\":\"Other\",\"severity\":\"Error\",\"description\":\"ekewvnqvcdlguauc\",\"suggestedResourceIds\":[\"jwnlax\",\"un\",\"qikczvvita\",\"gx\"],\"suggestedAccessRules\":[\"sserxhtvsoxhlwn\",\"sjgqrsxyp\"]}}")
            .toObject(NetworkSecurityPerimeterConfigurationIssues.class);
        Assertions.assertEquals("tvwkpqhjpenu", model.name());
        Assertions.assertEquals(NetworkSecurityPerimeterConfigurationIssueType.OTHER, model.issueType());
        Assertions.assertEquals(NetworkSecurityPerimeterConfigurationIssueSeverity.ERROR, model.severity());
        Assertions.assertEquals("ekewvnqvcdlguauc", model.description());
        Assertions.assertEquals("jwnlax", model.suggestedResourceIds().get(0));
        Assertions.assertEquals("sserxhtvsoxhlwn", model.suggestedAccessRules().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkSecurityPerimeterConfigurationIssues model
            = new NetworkSecurityPerimeterConfigurationIssues().withName("tvwkpqhjpenu")
                .withIssueType(NetworkSecurityPerimeterConfigurationIssueType.OTHER)
                .withSeverity(NetworkSecurityPerimeterConfigurationIssueSeverity.ERROR)
                .withDescription("ekewvnqvcdlguauc")
                .withSuggestedResourceIds(Arrays.asList("jwnlax", "un", "qikczvvita", "gx"))
                .withSuggestedAccessRules(Arrays.asList("sserxhtvsoxhlwn", "sjgqrsxyp"));
        model = BinaryData.fromObject(model).toObject(NetworkSecurityPerimeterConfigurationIssues.class);
        Assertions.assertEquals("tvwkpqhjpenu", model.name());
        Assertions.assertEquals(NetworkSecurityPerimeterConfigurationIssueType.OTHER, model.issueType());
        Assertions.assertEquals(NetworkSecurityPerimeterConfigurationIssueSeverity.ERROR, model.severity());
        Assertions.assertEquals("ekewvnqvcdlguauc", model.description());
        Assertions.assertEquals("jwnlax", model.suggestedResourceIds().get(0));
        Assertions.assertEquals("sserxhtvsoxhlwn", model.suggestedAccessRules().get(0));
    }
}
