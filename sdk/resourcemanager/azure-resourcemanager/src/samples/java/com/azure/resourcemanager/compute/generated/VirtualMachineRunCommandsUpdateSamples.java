// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.RunCommandInputParameter;
import com.azure.resourcemanager.compute.models.RunCommandManagedIdentity;
import com.azure.resourcemanager.compute.models.VirtualMachineRunCommandScriptSource;
import com.azure.resourcemanager.compute.models.VirtualMachineRunCommandUpdate;
import java.util.Arrays;

/** Samples for VirtualMachineRunCommands Update. */
public final class VirtualMachineRunCommandsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-03-01/examples/runCommandExamples/VirtualMachineRunCommand_Update.json
     */
    /**
     * Sample code: Update a run command.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateARunCommand(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineRunCommands()
            .update(
                "myResourceGroup",
                "myVM",
                "myRunCommand",
                new VirtualMachineRunCommandUpdate()
                    .withSource(
                        new VirtualMachineRunCommandScriptSource()
                            .withScript("Write-Host Hello World! ; Remove-Item C:\test\testFile.txt"))
                    .withParameters(
                        Arrays
                            .asList(
                                new RunCommandInputParameter().withName("param1").withValue("value1"),
                                new RunCommandInputParameter().withName("param2").withValue("value2")))
                    .withAsyncExecution(false)
                    .withRunAsUser("user1")
                    .withRunAsPassword("fakeTokenPlaceholder")
                    .withTimeoutInSeconds(3600)
                    .withOutputBlobUri(
                        "https://mystorageaccount.blob.core.windows.net/myscriptoutputcontainer/MyScriptoutput.txt?sp=racw&st=2022-10-07T19:40:21Z&se=2022-10-08T03:40:21Z&spr=https&sv=2021-06-08&sr=b&sig=Yh7B%2Fy83olbYBdfsfbUREvd7ol8Dq5EVP3lAO4Kj4xDcN8%3D")
                    .withErrorBlobUri("https://mystorageaccount.blob.core.windows.net/mycontainer/MyScriptError.txt")
                    .withErrorBlobManagedIdentity(
                        new RunCommandManagedIdentity().withObjectId("4231e4d2-33e4-4e23-96b2-17888afa6072")),
                com.azure.core.util.Context.NONE);
    }
}
