// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.resourcemanager.iothub.models.CertificateProperties;

/** Samples for Certificates CreateOrUpdate. */
public final class CertificatesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/stable/2021-07-02/examples/iothub_certificatescreateorupdate.json
     */
    /**
     * Sample code: Certificates_CreateOrUpdate.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void certificatesCreateOrUpdate(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager
            .certificates()
            .define("cert")
            .withExistingIotHub("myResourceGroup", "iothub")
            .withProperties(new CertificateProperties().withCertificate("############################################"))
            .create();
    }
}
