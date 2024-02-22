// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PossibleOperationsDirections;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanProviderSpecificFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanUnplannedFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanUnplannedFailoverInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SourceSiteOperations;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanUnplannedFailoverInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanUnplannedFailoverInput model = BinaryData.fromString(
            "{\"properties\":{\"failoverDirection\":\"RecoveryToPrimary\",\"sourceSiteOperations\":\"Required\",\"providerSpecificDetails\":[{\"instanceType\":\"RecoveryPlanProviderSpecificFailoverInput\"}]}}")
            .toObject(RecoveryPlanUnplannedFailoverInput.class);
        Assertions.assertEquals(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
            model.properties().failoverDirection());
        Assertions.assertEquals(SourceSiteOperations.REQUIRED, model.properties().sourceSiteOperations());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanUnplannedFailoverInput model
            = new RecoveryPlanUnplannedFailoverInput().withProperties(new RecoveryPlanUnplannedFailoverInputProperties()
                .withFailoverDirection(PossibleOperationsDirections.RECOVERY_TO_PRIMARY)
                .withSourceSiteOperations(SourceSiteOperations.REQUIRED)
                .withProviderSpecificDetails(Arrays.asList(new RecoveryPlanProviderSpecificFailoverInput())));
        model = BinaryData.fromObject(model).toObject(RecoveryPlanUnplannedFailoverInput.class);
        Assertions.assertEquals(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
            model.properties().failoverDirection());
        Assertions.assertEquals(SourceSiteOperations.REQUIRED, model.properties().sourceSiteOperations());
    }
}
