// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.models.ImportDevicesRequest;

/** Samples for IotHubResource ImportDevices. */
public final class IotHubResourceImportDevicesSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/stable/2021-07-02/examples/iothub_importdevices.json
     */
    /**
     * Sample code: IotHubResource_ImportDevices.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void iotHubResourceImportDevices(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager
            .iotHubResources()
            .importDevicesWithResponse(
                "myResourceGroup",
                "testHub",
                new ImportDevicesRequest().withInputBlobContainerUri("testBlob").withOutputBlobContainerUri("testBlob"),
                Context.NONE);
    }
}
