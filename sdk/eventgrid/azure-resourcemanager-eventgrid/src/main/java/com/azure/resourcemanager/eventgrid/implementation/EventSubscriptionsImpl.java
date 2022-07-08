// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.EventSubscriptionsClient;
import com.azure.resourcemanager.eventgrid.fluent.models.DeliveryAttributeListResultInner;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionInner;
import com.azure.resourcemanager.eventgrid.models.DeliveryAttributeListResult;
import com.azure.resourcemanager.eventgrid.models.EventSubscription;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionFullUrl;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionUpdateParameters;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptions;

public final class EventSubscriptionsImpl implements EventSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(EventSubscriptionsImpl.class);

    private final EventSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public EventSubscriptionsImpl(
        EventSubscriptionsClient innerClient, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public EventSubscription get(String scope, String eventSubscriptionName) {
        EventSubscriptionInner inner = this.serviceClient().get(scope, eventSubscriptionName);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventSubscription> getWithResponse(String scope, String eventSubscriptionName, Context context) {
        Response<EventSubscriptionInner> inner =
            this.serviceClient().getWithResponse(scope, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EventSubscription createOrUpdate(
        String scope, String eventSubscriptionName, EventSubscriptionInner eventSubscriptionInfo) {
        EventSubscriptionInner inner =
            this.serviceClient().createOrUpdate(scope, eventSubscriptionName, eventSubscriptionInfo);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscription createOrUpdate(
        String scope, String eventSubscriptionName, EventSubscriptionInner eventSubscriptionInfo, Context context) {
        EventSubscriptionInner inner =
            this.serviceClient().createOrUpdate(scope, eventSubscriptionName, eventSubscriptionInfo, context);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String scope, String eventSubscriptionName) {
        this.serviceClient().delete(scope, eventSubscriptionName);
    }

    public void delete(String scope, String eventSubscriptionName, Context context) {
        this.serviceClient().delete(scope, eventSubscriptionName, context);
    }

    public EventSubscription update(
        String scope,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters) {
        EventSubscriptionInner inner =
            this.serviceClient().update(scope, eventSubscriptionName, eventSubscriptionUpdateParameters);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscription update(
        String scope,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters,
        Context context) {
        EventSubscriptionInner inner =
            this.serviceClient().update(scope, eventSubscriptionName, eventSubscriptionUpdateParameters, context);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EventSubscriptionFullUrl getFullUrl(String scope, String eventSubscriptionName) {
        EventSubscriptionFullUrlInner inner = this.serviceClient().getFullUrl(scope, eventSubscriptionName);
        if (inner != null) {
            return new EventSubscriptionFullUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventSubscriptionFullUrl> getFullUrlWithResponse(
        String scope, String eventSubscriptionName, Context context) {
        Response<EventSubscriptionFullUrlInner> inner =
            this.serviceClient().getFullUrlWithResponse(scope, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventSubscriptionFullUrlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<EventSubscription> list() {
        PagedIterable<EventSubscriptionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> list(String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner = this.serviceClient().list(filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listGlobalBySubscriptionForTopicType(String topicTypeName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listGlobalBySubscriptionForTopicType(topicTypeName);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listGlobalBySubscriptionForTopicType(
        String topicTypeName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listGlobalBySubscriptionForTopicType(topicTypeName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByResourceGroup(String resourceGroupName) {
        PagedIterable<EventSubscriptionInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listGlobalByResourceGroupForTopicType(
        String resourceGroupName, String topicTypeName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listGlobalByResourceGroupForTopicType(resourceGroupName, topicTypeName);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listGlobalByResourceGroupForTopicType(
        String resourceGroupName, String topicTypeName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this
                .serviceClient()
                .listGlobalByResourceGroupForTopicType(resourceGroupName, topicTypeName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalBySubscription(String location) {
        PagedIterable<EventSubscriptionInner> inner = this.serviceClient().listRegionalBySubscription(location);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalBySubscription(
        String location, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalBySubscription(location, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalByResourceGroup(String resourceGroupName, String location) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalByResourceGroup(resourceGroupName, location);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalByResourceGroup(
        String resourceGroupName, String location, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalByResourceGroup(resourceGroupName, location, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalBySubscriptionForTopicType(
        String location, String topicTypeName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalBySubscriptionForTopicType(location, topicTypeName);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalBySubscriptionForTopicType(
        String location, String topicTypeName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalBySubscriptionForTopicType(location, topicTypeName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalByResourceGroupForTopicType(
        String resourceGroupName, String location, String topicTypeName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalByResourceGroupForTopicType(resourceGroupName, location, topicTypeName);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalByResourceGroupForTopicType(
        String resourceGroupName, String location, String topicTypeName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this
                .serviceClient()
                .listRegionalByResourceGroupForTopicType(
                    resourceGroupName, location, topicTypeName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByResource(
        String resourceGroupName, String providerNamespace, String resourceTypeName, String resourceName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listByResource(resourceGroupName, providerNamespace, resourceTypeName, resourceName);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByResource(
        String resourceGroupName,
        String providerNamespace,
        String resourceTypeName,
        String resourceName,
        String filter,
        Integer top,
        Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this
                .serviceClient()
                .listByResource(
                    resourceGroupName, providerNamespace, resourceTypeName, resourceName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByDomainTopic(
        String resourceGroupName, String domainName, String topicName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listByDomainTopic(resourceGroupName, domainName, topicName);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByDomainTopic(
        String resourceGroupName, String domainName, String topicName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listByDomainTopic(resourceGroupName, domainName, topicName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public DeliveryAttributeListResult getDeliveryAttributes(String scope, String eventSubscriptionName) {
        DeliveryAttributeListResultInner inner =
            this.serviceClient().getDeliveryAttributes(scope, eventSubscriptionName);
        if (inner != null) {
            return new DeliveryAttributeListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeliveryAttributeListResult> getDeliveryAttributesWithResponse(
        String scope, String eventSubscriptionName, Context context) {
        Response<DeliveryAttributeListResultInner> inner =
            this.serviceClient().getDeliveryAttributesWithResponse(scope, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeliveryAttributeListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private EventSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }
}
