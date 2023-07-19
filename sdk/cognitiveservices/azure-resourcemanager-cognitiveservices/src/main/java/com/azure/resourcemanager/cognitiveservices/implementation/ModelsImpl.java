// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.fluent.ModelsClient;
import com.azure.resourcemanager.cognitiveservices.fluent.models.ModelInner;
import com.azure.resourcemanager.cognitiveservices.models.Model;
import com.azure.resourcemanager.cognitiveservices.models.Models;

public final class ModelsImpl implements Models {
    private static final ClientLogger LOGGER = new ClientLogger(ModelsImpl.class);

    private final ModelsClient innerClient;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

    public ModelsImpl(
        ModelsClient innerClient, com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Model> list(String location) {
        PagedIterable<ModelInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new ModelImpl(inner1, this.manager()));
    }

    public PagedIterable<Model> list(String location, Context context) {
        PagedIterable<ModelInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new ModelImpl(inner1, this.manager()));
    }

    private ModelsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }
}
