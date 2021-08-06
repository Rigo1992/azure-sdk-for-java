// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.util.Context;

/** Samples for Certificates Get. */
public final class CertificatesGetSamples {
    /**
     * Sample code: Certificates_Get.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void certificatesGet(com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager.certificates().getWithResponse("myResourceGroup", "testhub", "cert", Context.NONE);
    }
}
