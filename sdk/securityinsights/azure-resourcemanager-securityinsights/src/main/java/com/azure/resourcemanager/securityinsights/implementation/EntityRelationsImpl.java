// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.EntityRelationsClient;
import com.azure.resourcemanager.securityinsights.fluent.models.RelationInner;
import com.azure.resourcemanager.securityinsights.models.EntityRelations;
import com.azure.resourcemanager.securityinsights.models.Relation;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EntityRelationsImpl implements EntityRelations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EntityRelationsImpl.class);

    private final EntityRelationsClient innerClient;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public EntityRelationsImpl(
        EntityRelationsClient innerClient,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Relation getRelation(String resourceGroupName, String workspaceName, String entityId, String relationName) {
        RelationInner inner =
            this.serviceClient().getRelation(resourceGroupName, workspaceName, entityId, relationName);
        if (inner != null) {
            return new RelationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Relation> getRelationWithResponse(
        String resourceGroupName, String workspaceName, String entityId, String relationName, Context context) {
        Response<RelationInner> inner =
            this
                .serviceClient()
                .getRelationWithResponse(resourceGroupName, workspaceName, entityId, relationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RelationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private EntityRelationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}
