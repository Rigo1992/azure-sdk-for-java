// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.NameIdentifierInner;

/** Samples for AppServiceCertificateOrders ResendRequestEmails. */
public final class AppServiceCertificateOrdersResendRequestEmailsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2022-09-01/examples/ResendDomainOwnershipVerificationEmail.json
     */
    /**
     * Sample code: Resend Domain Ownership verification email.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void resendDomainOwnershipVerificationEmail(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getAppServiceCertificateOrders()
            .resendRequestEmailsWithResponse(
                "testrg123",
                "SampleCertificateOrderName",
                new NameIdentifierInner().withName("Domain name"),
                com.azure.core.util.Context.NONE);
    }
}
