// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for a Microsoft.ContainerRegistry.ImageDeleted event. */
@Fluent
public final class ContainerRegistryImageDeletedEventData extends ContainerRegistryEventData {
    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImageDeletedEventData setId(String id) {
        super.setId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImageDeletedEventData setTimestamp(OffsetDateTime timestamp) {
        super.setTimestamp(timestamp);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImageDeletedEventData setAction(String action) {
        super.setAction(action);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImageDeletedEventData setLocation(String location) {
        super.setLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImageDeletedEventData setTarget(ContainerRegistryEventTarget target) {
        super.setTarget(target);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImageDeletedEventData setRequest(ContainerRegistryEventRequest request) {
        super.setRequest(request);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImageDeletedEventData setActor(ContainerRegistryEventActor actor) {
        super.setActor(actor);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImageDeletedEventData setSource(ContainerRegistryEventSource source) {
        super.setSource(source);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerRegistryImageDeletedEventData setConnectedRegistry(
            ContainerRegistryEventConnectedRegistry connectedRegistry) {
        super.setConnectedRegistry(connectedRegistry);
        return this;
    }
}
