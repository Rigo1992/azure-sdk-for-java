// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.DatasetResourceInner;
import com.azure.resourcemanager.datafactory.models.Dataset;
import com.azure.resourcemanager.datafactory.models.DatasetResource;

public final class DatasetResourceImpl implements DatasetResource, DatasetResource.Definition, DatasetResource.Update {
    private DatasetResourceInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public Dataset properties() {
        return this.innerModel().properties();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DatasetResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String factoryName;

    private String datasetName;

    private String createIfMatch;

    private String updateIfMatch;

    public DatasetResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    public DatasetResource create() {
        this.innerObject = serviceManager.serviceClient().getDatasets().createOrUpdateWithResponse(resourceGroupName,
            factoryName, datasetName, this.innerModel(), createIfMatch, Context.NONE).getValue();
        return this;
    }

    public DatasetResource create(Context context) {
        this.innerObject = serviceManager.serviceClient().getDatasets().createOrUpdateWithResponse(resourceGroupName,
            factoryName, datasetName, this.innerModel(), createIfMatch, context).getValue();
        return this;
    }

    DatasetResourceImpl(String name, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = new DatasetResourceInner();
        this.serviceManager = serviceManager;
        this.datasetName = name;
        this.createIfMatch = null;
    }

    public DatasetResourceImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public DatasetResource apply() {
        this.innerObject = serviceManager.serviceClient().getDatasets().createOrUpdateWithResponse(resourceGroupName,
            factoryName, datasetName, this.innerModel(), updateIfMatch, Context.NONE).getValue();
        return this;
    }

    public DatasetResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getDatasets().createOrUpdateWithResponse(resourceGroupName,
            factoryName, datasetName, this.innerModel(), updateIfMatch, context).getValue();
        return this;
    }

    DatasetResourceImpl(DatasetResourceInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.factoryName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "factories");
        this.datasetName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "datasets");
    }

    public DatasetResource refresh() {
        String localIfNoneMatch = null;
        this.innerObject = serviceManager.serviceClient().getDatasets()
            .getWithResponse(resourceGroupName, factoryName, datasetName, localIfNoneMatch, Context.NONE).getValue();
        return this;
    }

    public DatasetResource refresh(Context context) {
        String localIfNoneMatch = null;
        this.innerObject = serviceManager.serviceClient().getDatasets()
            .getWithResponse(resourceGroupName, factoryName, datasetName, localIfNoneMatch, context).getValue();
        return this;
    }

    public DatasetResourceImpl withProperties(Dataset properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public DatasetResourceImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
