// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.fluent.models.AppServiceCertificateInner;
import com.azure.resourcemanager.appservice.fluent.models.AppServiceCertificateOrderInner;
import com.azure.resourcemanager.appservice.models.CertificateProductType;
import java.util.HashMap;
import java.util.Map;

/** Samples for AppServiceCertificateOrders ValidatePurchaseInformation. */
public final class AppServiceCertificateOrdersValidatePurchaseInformationSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2022-03-01/examples/ValidateAppServiceCertificatePurchaseInformationBySubscription.json
     */
    /**
     * Sample code: Validate App Service Certificate purchase information by subscription.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void validateAppServiceCertificatePurchaseInformationBySubscription(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getAppServiceCertificateOrders()
            .validatePurchaseInformationWithResponse(
                new AppServiceCertificateOrderInner()
                    .withLocation("Global")
                    .withCertificates(
                        mapOf(
                            "SampleCertName1",
                            new AppServiceCertificateInner()
                                .withKeyVaultId(
                                    "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourcegroups/testrg123/providers/microsoft.keyvault/vaults/SamplevaultName")
                                .withKeyVaultSecretName("SampleSecretName1"),
                            "SampleCertName2",
                            new AppServiceCertificateInner()
                                .withKeyVaultId(
                                    "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourcegroups/testrg123/providers/microsoft.keyvault/vaults/SamplevaultName")
                                .withKeyVaultSecretName("SampleSecretName2")))
                    .withDistinguishedName("CN=SampleCustomDomain.com")
                    .withValidityInYears(2)
                    .withKeySize(2048)
                    .withProductType(CertificateProductType.STANDARD_DOMAIN_VALIDATED_SSL)
                    .withAutoRenew(true),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
