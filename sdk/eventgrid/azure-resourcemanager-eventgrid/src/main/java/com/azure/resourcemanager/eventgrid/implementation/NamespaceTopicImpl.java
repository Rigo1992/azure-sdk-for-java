// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.NamespaceTopicInner;
import com.azure.resourcemanager.eventgrid.models.EventInputSchema;
import com.azure.resourcemanager.eventgrid.models.NamespaceTopic;
import com.azure.resourcemanager.eventgrid.models.NamespaceTopicProvisioningState;
import com.azure.resourcemanager.eventgrid.models.NamespaceTopicUpdateParameters;
import com.azure.resourcemanager.eventgrid.models.PublisherType;
import com.azure.resourcemanager.eventgrid.models.TopicRegenerateKeyRequest;
import com.azure.resourcemanager.eventgrid.models.TopicSharedAccessKeys;

public final class NamespaceTopicImpl implements NamespaceTopic, NamespaceTopic.Definition, NamespaceTopic.Update {
    private NamespaceTopicInner innerObject;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public NamespaceTopicProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PublisherType publisherType() {
        return this.innerModel().publisherType();
    }

    public EventInputSchema inputSchema() {
        return this.innerModel().inputSchema();
    }

    public Integer eventRetentionInDays() {
        return this.innerModel().eventRetentionInDays();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public NamespaceTopicInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String topicName;

    private NamespaceTopicUpdateParameters updateNamespaceTopicUpdateParameters;

    public NamespaceTopicImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public NamespaceTopic create() {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaceTopics()
            .createOrUpdate(resourceGroupName, namespaceName, topicName, this.innerModel(), Context.NONE);
        return this;
    }

    public NamespaceTopic create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaceTopics()
            .createOrUpdate(resourceGroupName, namespaceName, topicName, this.innerModel(), context);
        return this;
    }

    NamespaceTopicImpl(String name, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = new NamespaceTopicInner();
        this.serviceManager = serviceManager;
        this.topicName = name;
    }

    public NamespaceTopicImpl update() {
        this.updateNamespaceTopicUpdateParameters = new NamespaceTopicUpdateParameters();
        return this;
    }

    public NamespaceTopic apply() {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaceTopics()
            .update(resourceGroupName, namespaceName, topicName, updateNamespaceTopicUpdateParameters, Context.NONE);
        return this;
    }

    public NamespaceTopic apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaceTopics()
            .update(resourceGroupName, namespaceName, topicName, updateNamespaceTopicUpdateParameters, context);
        return this;
    }

    NamespaceTopicImpl(NamespaceTopicInner innerObject,
        com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.topicName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "topics");
    }

    public NamespaceTopic refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaceTopics()
            .getWithResponse(resourceGroupName, namespaceName, topicName, Context.NONE)
            .getValue();
        return this;
    }

    public NamespaceTopic refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNamespaceTopics()
            .getWithResponse(resourceGroupName, namespaceName, topicName, context)
            .getValue();
        return this;
    }

    public Response<TopicSharedAccessKeys> listSharedAccessKeysWithResponse(Context context) {
        return serviceManager.namespaceTopics()
            .listSharedAccessKeysWithResponse(resourceGroupName, namespaceName, topicName, context);
    }

    public TopicSharedAccessKeys listSharedAccessKeys() {
        return serviceManager.namespaceTopics().listSharedAccessKeys(resourceGroupName, namespaceName, topicName);
    }

    public TopicSharedAccessKeys regenerateKey(TopicRegenerateKeyRequest regenerateKeyRequest) {
        return serviceManager.namespaceTopics()
            .regenerateKey(resourceGroupName, namespaceName, topicName, regenerateKeyRequest);
    }

    public TopicSharedAccessKeys regenerateKey(TopicRegenerateKeyRequest regenerateKeyRequest, Context context) {
        return serviceManager.namespaceTopics()
            .regenerateKey(resourceGroupName, namespaceName, topicName, regenerateKeyRequest, context);
    }

    public NamespaceTopicImpl withPublisherType(PublisherType publisherType) {
        this.innerModel().withPublisherType(publisherType);
        return this;
    }

    public NamespaceTopicImpl withInputSchema(EventInputSchema inputSchema) {
        this.innerModel().withInputSchema(inputSchema);
        return this;
    }

    public NamespaceTopicImpl withEventRetentionInDays(Integer eventRetentionInDays) {
        if (isInCreateMode()) {
            this.innerModel().withEventRetentionInDays(eventRetentionInDays);
            return this;
        } else {
            this.updateNamespaceTopicUpdateParameters.withEventRetentionInDays(eventRetentionInDays);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
