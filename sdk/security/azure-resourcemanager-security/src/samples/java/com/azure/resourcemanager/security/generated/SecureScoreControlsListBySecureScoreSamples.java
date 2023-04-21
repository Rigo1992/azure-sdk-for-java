// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.resourcemanager.security.models.ExpandControlsEnum;

/** Samples for SecureScoreControls ListBySecureScore. */
public final class SecureScoreControlsListBySecureScoreSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/secureScores/ListSecureScoreControlsForNameWithExpand_builtin_example.json
     */
    /**
     * Sample code: Get security controls and their current score for the specified initiative with the expand
     * parameter.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getSecurityControlsAndTheirCurrentScoreForTheSpecifiedInitiativeWithTheExpandParameter(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .secureScoreControls()
            .listBySecureScore("ascScore", ExpandControlsEnum.DEFINITION, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/secureScores/ListSecureScoreControlsForName_builtin_example.json
     */
    /**
     * Sample code: Get security controls and their current score for the specified initiative.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getSecurityControlsAndTheirCurrentScoreForTheSpecifiedInitiative(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.secureScoreControls().listBySecureScore("ascScore", null, com.azure.core.util.Context.NONE);
    }
}
