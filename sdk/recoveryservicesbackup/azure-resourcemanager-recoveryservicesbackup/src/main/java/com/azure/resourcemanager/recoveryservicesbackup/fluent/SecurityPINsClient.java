// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.TokenInformationInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.SecurityPinBase;

/** An instance of this class provides access to all the operations defined in SecurityPINsClient. */
public interface SecurityPINsClient {
    /**
     * Get the security PIN.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security PIN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TokenInformationInner get(String vaultName, String resourceGroupName);

    /**
     * Get the security PIN.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters security pin request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security PIN along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TokenInformationInner> getWithResponse(
        String vaultName, String resourceGroupName, SecurityPinBase parameters, Context context);
}
