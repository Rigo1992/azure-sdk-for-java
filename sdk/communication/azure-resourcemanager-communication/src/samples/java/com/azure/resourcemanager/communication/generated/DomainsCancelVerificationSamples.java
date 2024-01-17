// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.resourcemanager.communication.models.VerificationParameter;
import com.azure.resourcemanager.communication.models.VerificationType;

/**
 * Samples for Domains CancelVerification.
 */
public final class DomainsCancelVerificationSamples {
    /*
     * x-ms-original-file:
     * specification/communication/resource-manager/Microsoft.Communication/preview/2023-06-01-preview/examples/domains/
     * cancelVerification.json
     */
    /**
     * Sample code: Cancel verification.
     * 
     * @param manager Entry point to CommunicationManager.
     */
    public static void cancelVerification(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.domains().cancelVerification("MyResourceGroup", "MyEmailServiceResource", "mydomain.com",
            new VerificationParameter().withVerificationType(VerificationType.SPF), com.azure.core.util.Context.NONE);
    }
}
