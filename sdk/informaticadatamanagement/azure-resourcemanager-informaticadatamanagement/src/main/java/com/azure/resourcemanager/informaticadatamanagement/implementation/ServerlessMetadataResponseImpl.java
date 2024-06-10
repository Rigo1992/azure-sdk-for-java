// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.implementation;

import com.azure.resourcemanager.informaticadatamanagement.fluent.models.ServerlessMetadataResponseInner;
import com.azure.resourcemanager.informaticadatamanagement.models.RuntimeType;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessConfigProperties;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessMetadataResponse;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeConfigProperties;

public final class ServerlessMetadataResponseImpl implements ServerlessMetadataResponse {
    private ServerlessMetadataResponseInner innerObject;

    private final com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager serviceManager;

    ServerlessMetadataResponseImpl(ServerlessMetadataResponseInner innerObject,
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public RuntimeType type() {
        return this.innerModel().type();
    }

    public ServerlessConfigProperties serverlessConfigProperties() {
        return this.innerModel().serverlessConfigProperties();
    }

    public ServerlessRuntimeConfigProperties serverlessRuntimeConfigProperties() {
        return this.innerModel().serverlessRuntimeConfigProperties();
    }

    public ServerlessMetadataResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager() {
        return this.serviceManager;
    }
}
