// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingMdcContainersImageAssessment;
import org.junit.jupiter.api.Assertions;

public final class DefenderCspmAwsOfferingMdcContainersImageAssessmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderCspmAwsOfferingMdcContainersImageAssessment model
            = BinaryData.fromString("{\"enabled\":false,\"cloudRoleArn\":\"nbcpjstbhemhcucs\"}")
                .toObject(DefenderCspmAwsOfferingMdcContainersImageAssessment.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("nbcpjstbhemhcucs", model.cloudRoleArn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderCspmAwsOfferingMdcContainersImageAssessment model
            = new DefenderCspmAwsOfferingMdcContainersImageAssessment().withEnabled(false)
                .withCloudRoleArn("nbcpjstbhemhcucs");
        model = BinaryData.fromObject(model).toObject(DefenderCspmAwsOfferingMdcContainersImageAssessment.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("nbcpjstbhemhcucs", model.cloudRoleArn());
    }
}
