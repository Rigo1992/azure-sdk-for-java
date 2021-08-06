// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.models.ScriptOutputStreamType;
import java.util.Arrays;

/** Samples for ScriptExecutions GetExecutionLogs. */
public final class ScriptExecutionsGetExecutionLogsSamples {
    /**
     * Sample code: ScriptExecutions_GetExecutionLogs.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void scriptExecutionsGetExecutionLogs(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager
            .scriptExecutions()
            .getExecutionLogsWithResponse(
                "group1",
                "cloud1",
                "addSsoServer",
                Arrays
                    .asList(
                        ScriptOutputStreamType.INFORMATION,
                        ScriptOutputStreamType.fromString("Warnings"),
                        ScriptOutputStreamType.fromString("Errors"),
                        ScriptOutputStreamType.OUTPUT),
                Context.NONE);
    }
}
