// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.graphservices.generated;

import com.azure.resourcemanager.graphservices.models.AccountResource;
import java.util.HashMap;
import java.util.Map;

/** Samples for AccountOperation Update. */
public final class AccountOperationUpdateSamples {
    /*
     * x-ms-original-file: specification/graphservicesprod/resource-manager/Microsoft.GraphServices/preview/2022-09-22-preview/examples/Accounts_Update.json
     */
    /**
     * Sample code: Update account resource.
     *
     * @param manager Entry point to GraphServicesManager.
     */
    public static void updateAccountResource(com.azure.resourcemanager.graphservices.GraphServicesManager manager) {
        AccountResource resource =
            manager
                .accountOperations()
                .getByResourceGroupWithResponse(
                    "testResourceGroupGRAM", "11111111-aaaa-1111-bbbb-111111111111", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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
