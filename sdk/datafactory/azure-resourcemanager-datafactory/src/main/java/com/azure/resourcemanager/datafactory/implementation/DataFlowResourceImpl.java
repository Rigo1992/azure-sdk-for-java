// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowResourceInner;
import com.azure.resourcemanager.datafactory.models.DataFlow;
import com.azure.resourcemanager.datafactory.models.DataFlowResource;

public final class DataFlowResourceImpl
    implements DataFlowResource, DataFlowResource.Definition, DataFlowResource.Update {
    private DataFlowResourceInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public DataFlow properties() {
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

    public DataFlowResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String factoryName;

    private String dataFlowName;

    private String createIfMatch;

    private String updateIfMatch;

    public DataFlowResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    public DataFlowResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getDataFlows()
            .createOrUpdateWithResponse(resourceGroupName, factoryName, dataFlowName, this.innerModel(), createIfMatch,
                Context.NONE)
            .getValue();
        return this;
    }

    public DataFlowResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDataFlows()
            .createOrUpdateWithResponse(resourceGroupName, factoryName, dataFlowName, this.innerModel(), createIfMatch,
                context)
            .getValue();
        return this;
    }

    DataFlowResourceImpl(String name, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = new DataFlowResourceInner();
        this.serviceManager = serviceManager;
        this.dataFlowName = name;
        this.createIfMatch = null;
    }

    public DataFlowResourceImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public DataFlowResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getDataFlows()
            .createOrUpdateWithResponse(resourceGroupName, factoryName, dataFlowName, this.innerModel(), updateIfMatch,
                Context.NONE)
            .getValue();
        return this;
    }

    public DataFlowResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDataFlows()
            .createOrUpdateWithResponse(resourceGroupName, factoryName, dataFlowName, this.innerModel(), updateIfMatch,
                context)
            .getValue();
        return this;
    }

    DataFlowResourceImpl(DataFlowResourceInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.factoryName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "factories");
        this.dataFlowName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "dataflows");
    }

    public DataFlowResource refresh() {
        String localIfNoneMatch = null;
        this.innerObject = serviceManager.serviceClient()
            .getDataFlows()
            .getWithResponse(resourceGroupName, factoryName, dataFlowName, localIfNoneMatch, Context.NONE)
            .getValue();
        return this;
    }

    public DataFlowResource refresh(Context context) {
        String localIfNoneMatch = null;
        this.innerObject = serviceManager.serviceClient()
            .getDataFlows()
            .getWithResponse(resourceGroupName, factoryName, dataFlowName, localIfNoneMatch, context)
            .getValue();
        return this;
    }

    public DataFlowResourceImpl withProperties(DataFlow properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public DataFlowResourceImpl withIfMatch(String ifMatch) {
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
