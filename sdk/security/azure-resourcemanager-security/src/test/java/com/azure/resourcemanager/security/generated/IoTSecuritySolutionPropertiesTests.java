// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionProperties;
import com.azure.resourcemanager.security.models.AdditionalWorkspaceDataType;
import com.azure.resourcemanager.security.models.AdditionalWorkspacesProperties;
import com.azure.resourcemanager.security.models.AdditionalWorkspaceType;
import com.azure.resourcemanager.security.models.DataSource;
import com.azure.resourcemanager.security.models.ExportData;
import com.azure.resourcemanager.security.models.RecommendationConfigStatus;
import com.azure.resourcemanager.security.models.RecommendationConfigurationProperties;
import com.azure.resourcemanager.security.models.RecommendationType;
import com.azure.resourcemanager.security.models.SecuritySolutionStatus;
import com.azure.resourcemanager.security.models.UnmaskedIpLoggingStatus;
import com.azure.resourcemanager.security.models.UserDefinedResourcesProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IoTSecuritySolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecuritySolutionProperties model = BinaryData.fromString(
            "{\"workspace\":\"fiwzcxmjpbyep\",\"displayName\":\"mgtvlj\",\"status\":\"Disabled\",\"export\":[\"RawEvents\"],\"disabledDataSources\":[\"TwinData\"],\"iotHubs\":[\"xhnpo\",\"yqwcabvnuil\",\"ey\",\"swlpaugmrmfj\"],\"userDefinedResources\":{\"query\":\"xwtoaukhfkvc\",\"querySubscriptions\":[\"izmoaeds\",\"jwuive\"]},\"autoDiscoveredResources\":[\"gyeewxeiq\",\"psmgo\"],\"recommendationsConfiguration\":[{\"recommendationType\":\"IoT_VulnerableTLSCipherSuite\",\"name\":\"ljdlrgmspl\",\"status\":\"Disabled\"}],\"unmaskedIpLoggingStatus\":\"Enabled\",\"additionalWorkspaces\":[{\"workspace\":\"hhvnewgnxkymp\",\"type\":\"Sentinel\",\"dataTypes\":[\"Alerts\",\"RawEvents\"]},{\"workspace\":\"xtwbta\",\"type\":\"Sentinel\",\"dataTypes\":[\"RawEvents\"]}]}")
            .toObject(IoTSecuritySolutionProperties.class);
        Assertions.assertEquals("fiwzcxmjpbyep", model.workspace());
        Assertions.assertEquals("mgtvlj", model.displayName());
        Assertions.assertEquals(SecuritySolutionStatus.DISABLED, model.status());
        Assertions.assertEquals(ExportData.RAW_EVENTS, model.export().get(0));
        Assertions.assertEquals(DataSource.TWIN_DATA, model.disabledDataSources().get(0));
        Assertions.assertEquals("xhnpo", model.iotHubs().get(0));
        Assertions.assertEquals("xwtoaukhfkvc", model.userDefinedResources().query());
        Assertions.assertEquals("izmoaeds", model.userDefinedResources().querySubscriptions().get(0));
        Assertions.assertEquals(RecommendationType.IO_T_VULNERABLE_TLSCIPHER_SUITE,
            model.recommendationsConfiguration().get(0).recommendationType());
        Assertions.assertEquals(RecommendationConfigStatus.DISABLED,
            model.recommendationsConfiguration().get(0).status());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.ENABLED, model.unmaskedIpLoggingStatus());
        Assertions.assertEquals("hhvnewgnxkymp", model.additionalWorkspaces().get(0).workspace());
        Assertions.assertEquals(AdditionalWorkspaceType.SENTINEL, model.additionalWorkspaces().get(0).type());
        Assertions.assertEquals(AdditionalWorkspaceDataType.ALERTS,
            model.additionalWorkspaces().get(0).dataTypes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecuritySolutionProperties model
            = new IoTSecuritySolutionProperties().withWorkspace("fiwzcxmjpbyep")
                .withDisplayName("mgtvlj")
                .withStatus(SecuritySolutionStatus.DISABLED)
                .withExport(Arrays.asList(ExportData.RAW_EVENTS))
                .withDisabledDataSources(Arrays.asList(DataSource.TWIN_DATA))
                .withIotHubs(Arrays.asList("xhnpo", "yqwcabvnuil", "ey", "swlpaugmrmfj"))
                .withUserDefinedResources(new UserDefinedResourcesProperties().withQuery("xwtoaukhfkvc")
                    .withQuerySubscriptions(Arrays.asList("izmoaeds", "jwuive")))
                .withRecommendationsConfiguration(Arrays.asList(new RecommendationConfigurationProperties()
                    .withRecommendationType(RecommendationType.IO_T_VULNERABLE_TLSCIPHER_SUITE)
                    .withStatus(RecommendationConfigStatus.DISABLED)))
                .withUnmaskedIpLoggingStatus(UnmaskedIpLoggingStatus.ENABLED)
                .withAdditionalWorkspaces(
                    Arrays.asList(
                        new AdditionalWorkspacesProperties().withWorkspace("hhvnewgnxkymp")
                            .withType(AdditionalWorkspaceType.SENTINEL)
                            .withDataTypes(Arrays.asList(AdditionalWorkspaceDataType.ALERTS,
                                AdditionalWorkspaceDataType.RAW_EVENTS)),
                        new AdditionalWorkspacesProperties().withWorkspace("xtwbta")
                            .withType(AdditionalWorkspaceType.SENTINEL)
                            .withDataTypes(Arrays.asList(AdditionalWorkspaceDataType.RAW_EVENTS))));
        model = BinaryData.fromObject(model).toObject(IoTSecuritySolutionProperties.class);
        Assertions.assertEquals("fiwzcxmjpbyep", model.workspace());
        Assertions.assertEquals("mgtvlj", model.displayName());
        Assertions.assertEquals(SecuritySolutionStatus.DISABLED, model.status());
        Assertions.assertEquals(ExportData.RAW_EVENTS, model.export().get(0));
        Assertions.assertEquals(DataSource.TWIN_DATA, model.disabledDataSources().get(0));
        Assertions.assertEquals("xhnpo", model.iotHubs().get(0));
        Assertions.assertEquals("xwtoaukhfkvc", model.userDefinedResources().query());
        Assertions.assertEquals("izmoaeds", model.userDefinedResources().querySubscriptions().get(0));
        Assertions.assertEquals(RecommendationType.IO_T_VULNERABLE_TLSCIPHER_SUITE,
            model.recommendationsConfiguration().get(0).recommendationType());
        Assertions.assertEquals(RecommendationConfigStatus.DISABLED,
            model.recommendationsConfiguration().get(0).status());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.ENABLED, model.unmaskedIpLoggingStatus());
        Assertions.assertEquals("hhvnewgnxkymp", model.additionalWorkspaces().get(0).workspace());
        Assertions.assertEquals(AdditionalWorkspaceType.SENTINEL, model.additionalWorkspaces().get(0).type());
        Assertions.assertEquals(AdditionalWorkspaceDataType.ALERTS,
            model.additionalWorkspaces().get(0).dataTypes().get(0));
    }
}
