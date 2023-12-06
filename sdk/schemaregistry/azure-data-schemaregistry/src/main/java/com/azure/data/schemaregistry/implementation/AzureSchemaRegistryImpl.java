// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.schemaregistry.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the AzureSchemaRegistry type.
 */
public final class AzureSchemaRegistryImpl {
    /**
     * The Schema Registry service endpoint, for example my-namespace.servicebus.windows.net.
     */
    private final String endpoint;

    /**
     * Gets The Schema Registry service endpoint, for example my-namespace.servicebus.windows.net.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The SchemaGroupsOperationsImpl object to access its operations.
     */
    private final SchemaGroupsOperationsImpl schemaGroupsOperations;

    /**
     * Gets the SchemaGroupsOperationsImpl object to access its operations.
     * 
     * @return the SchemaGroupsOperationsImpl object.
     */
    public SchemaGroupsOperationsImpl getSchemaGroupsOperations() {
        return this.schemaGroupsOperations;
    }

    /**
     * The SchemasImpl object to access its operations.
     */
    private final SchemasImpl schemas;

    /**
     * Gets the SchemasImpl object to access its operations.
     * 
     * @return the SchemasImpl object.
     */
    public SchemasImpl getSchemas() {
        return this.schemas;
    }

    /**
     * Initializes an instance of AzureSchemaRegistry client.
     * 
     * @param endpoint The Schema Registry service endpoint, for example my-namespace.servicebus.windows.net.
     * @param apiVersion Api Version.
     */
    public AzureSchemaRegistryImpl(String endpoint, String apiVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of AzureSchemaRegistry client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The Schema Registry service endpoint, for example my-namespace.servicebus.windows.net.
     * @param apiVersion Api Version.
     */
    public AzureSchemaRegistryImpl(HttpPipeline httpPipeline, String endpoint, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of AzureSchemaRegistry client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The Schema Registry service endpoint, for example my-namespace.servicebus.windows.net.
     * @param apiVersion Api Version.
     */
    public AzureSchemaRegistryImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.schemaGroupsOperations = new SchemaGroupsOperationsImpl(this);
        this.schemas = new SchemasImpl(this);
    }
}
