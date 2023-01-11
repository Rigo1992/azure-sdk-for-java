// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import java.util.HashMap;
import java.util.Map;

/** Samples for EnvironmentTypes CreateOrUpdate. */
public final class EnvironmentTypesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-11-11-preview/examples/EnvironmentTypes_Put.json
     */
    /**
     * Sample code: EnvironmentTypes_CreateOrUpdate.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void environmentTypesCreateOrUpdate(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager
            .environmentTypes()
            .define("DevTest")
            .withExistingDevcenter("rg1", "Contoso")
            .withTags(mapOf("Owner", "superuser"))
            .create();
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
