// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.core.factory;

import com.azure.core.util.Configuration;

/**
 * Azure SDK service client builder factory of all modules.
 *
 * @param <T> Type of the service client builder
 */
public interface AzureServiceClientBuilderFactory<T> {

    /**
     * Build an Azure SDK service client builder.
     * @return the service client builder.
     */
    T build(Configuration configuration);
}



