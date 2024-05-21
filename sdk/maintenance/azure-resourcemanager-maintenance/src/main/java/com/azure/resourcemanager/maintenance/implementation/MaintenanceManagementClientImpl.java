// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.maintenance.fluent.ApplyUpdateForResourceGroupsClient;
import com.azure.resourcemanager.maintenance.fluent.ApplyUpdatesClient;
import com.azure.resourcemanager.maintenance.fluent.ConfigurationAssignmentsClient;
import com.azure.resourcemanager.maintenance.fluent.ConfigurationAssignmentsForResourceGroupsClient;
import com.azure.resourcemanager.maintenance.fluent.ConfigurationAssignmentsForSubscriptionsClient;
import com.azure.resourcemanager.maintenance.fluent.ConfigurationAssignmentsWithinSubscriptionsClient;
import com.azure.resourcemanager.maintenance.fluent.MaintenanceConfigurationsClient;
import com.azure.resourcemanager.maintenance.fluent.MaintenanceConfigurationsForResourceGroupsClient;
import com.azure.resourcemanager.maintenance.fluent.MaintenanceManagementClient;
import com.azure.resourcemanager.maintenance.fluent.OperationsClient;
import com.azure.resourcemanager.maintenance.fluent.PublicMaintenanceConfigurationsClient;
import com.azure.resourcemanager.maintenance.fluent.ScheduledEventsClient;
import com.azure.resourcemanager.maintenance.fluent.UpdatesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the MaintenanceManagementClientImpl type.
 */
@ServiceClient(builder = MaintenanceManagementClientBuilder.class)
public final class MaintenanceManagementClientImpl implements MaintenanceManagementClient {
    /**
     * The ID of the target subscription. The value must be an UUID.
     */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
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
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The ScheduledEventsClient object to access its operations.
     */
    private final ScheduledEventsClient scheduledEvents;

    /**
     * Gets the ScheduledEventsClient object to access its operations.
     * 
     * @return the ScheduledEventsClient object.
     */
    public ScheduledEventsClient getScheduledEvents() {
        return this.scheduledEvents;
    }

    /**
     * The PublicMaintenanceConfigurationsClient object to access its operations.
     */
    private final PublicMaintenanceConfigurationsClient publicMaintenanceConfigurations;

    /**
     * Gets the PublicMaintenanceConfigurationsClient object to access its operations.
     * 
     * @return the PublicMaintenanceConfigurationsClient object.
     */
    public PublicMaintenanceConfigurationsClient getPublicMaintenanceConfigurations() {
        return this.publicMaintenanceConfigurations;
    }

    /**
     * The ApplyUpdatesClient object to access its operations.
     */
    private final ApplyUpdatesClient applyUpdates;

    /**
     * Gets the ApplyUpdatesClient object to access its operations.
     * 
     * @return the ApplyUpdatesClient object.
     */
    public ApplyUpdatesClient getApplyUpdates() {
        return this.applyUpdates;
    }

    /**
     * The ConfigurationAssignmentsClient object to access its operations.
     */
    private final ConfigurationAssignmentsClient configurationAssignments;

    /**
     * Gets the ConfigurationAssignmentsClient object to access its operations.
     * 
     * @return the ConfigurationAssignmentsClient object.
     */
    public ConfigurationAssignmentsClient getConfigurationAssignments() {
        return this.configurationAssignments;
    }

    /**
     * The MaintenanceConfigurationsClient object to access its operations.
     */
    private final MaintenanceConfigurationsClient maintenanceConfigurations;

    /**
     * Gets the MaintenanceConfigurationsClient object to access its operations.
     * 
     * @return the MaintenanceConfigurationsClient object.
     */
    public MaintenanceConfigurationsClient getMaintenanceConfigurations() {
        return this.maintenanceConfigurations;
    }

    /**
     * The MaintenanceConfigurationsForResourceGroupsClient object to access its operations.
     */
    private final MaintenanceConfigurationsForResourceGroupsClient maintenanceConfigurationsForResourceGroups;

    /**
     * Gets the MaintenanceConfigurationsForResourceGroupsClient object to access its operations.
     * 
     * @return the MaintenanceConfigurationsForResourceGroupsClient object.
     */
    public MaintenanceConfigurationsForResourceGroupsClient getMaintenanceConfigurationsForResourceGroups() {
        return this.maintenanceConfigurationsForResourceGroups;
    }

    /**
     * The ApplyUpdateForResourceGroupsClient object to access its operations.
     */
    private final ApplyUpdateForResourceGroupsClient applyUpdateForResourceGroups;

    /**
     * Gets the ApplyUpdateForResourceGroupsClient object to access its operations.
     * 
     * @return the ApplyUpdateForResourceGroupsClient object.
     */
    public ApplyUpdateForResourceGroupsClient getApplyUpdateForResourceGroups() {
        return this.applyUpdateForResourceGroups;
    }

    /**
     * The ConfigurationAssignmentsWithinSubscriptionsClient object to access its operations.
     */
    private final ConfigurationAssignmentsWithinSubscriptionsClient configurationAssignmentsWithinSubscriptions;

    /**
     * Gets the ConfigurationAssignmentsWithinSubscriptionsClient object to access its operations.
     * 
     * @return the ConfigurationAssignmentsWithinSubscriptionsClient object.
     */
    public ConfigurationAssignmentsWithinSubscriptionsClient getConfigurationAssignmentsWithinSubscriptions() {
        return this.configurationAssignmentsWithinSubscriptions;
    }

    /**
     * The ConfigurationAssignmentsForSubscriptionsClient object to access its operations.
     */
    private final ConfigurationAssignmentsForSubscriptionsClient configurationAssignmentsForSubscriptions;

    /**
     * Gets the ConfigurationAssignmentsForSubscriptionsClient object to access its operations.
     * 
     * @return the ConfigurationAssignmentsForSubscriptionsClient object.
     */
    public ConfigurationAssignmentsForSubscriptionsClient getConfigurationAssignmentsForSubscriptions() {
        return this.configurationAssignmentsForSubscriptions;
    }

    /**
     * The ConfigurationAssignmentsForResourceGroupsClient object to access its operations.
     */
    private final ConfigurationAssignmentsForResourceGroupsClient configurationAssignmentsForResourceGroups;

    /**
     * Gets the ConfigurationAssignmentsForResourceGroupsClient object to access its operations.
     * 
     * @return the ConfigurationAssignmentsForResourceGroupsClient object.
     */
    public ConfigurationAssignmentsForResourceGroupsClient getConfigurationAssignmentsForResourceGroups() {
        return this.configurationAssignmentsForResourceGroups;
    }

    /**
     * The OperationsClient object to access its operations.
     */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * The UpdatesClient object to access its operations.
     */
    private final UpdatesClient updates;

    /**
     * Gets the UpdatesClient object to access its operations.
     * 
     * @return the UpdatesClient object.
     */
    public UpdatesClient getUpdates() {
        return this.updates;
    }

    /**
     * Initializes an instance of MaintenanceManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription. The value must be an UUID.
     * @param endpoint server parameter.
     */
    MaintenanceManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2023-10-01-preview";
        this.scheduledEvents = new ScheduledEventsClientImpl(this);
        this.publicMaintenanceConfigurations = new PublicMaintenanceConfigurationsClientImpl(this);
        this.applyUpdates = new ApplyUpdatesClientImpl(this);
        this.configurationAssignments = new ConfigurationAssignmentsClientImpl(this);
        this.maintenanceConfigurations = new MaintenanceConfigurationsClientImpl(this);
        this.maintenanceConfigurationsForResourceGroups
            = new MaintenanceConfigurationsForResourceGroupsClientImpl(this);
        this.applyUpdateForResourceGroups = new ApplyUpdateForResourceGroupsClientImpl(this);
        this.configurationAssignmentsWithinSubscriptions
            = new ConfigurationAssignmentsWithinSubscriptionsClientImpl(this);
        this.configurationAssignmentsForSubscriptions = new ConfigurationAssignmentsForSubscriptionsClientImpl(this);
        this.configurationAssignmentsForResourceGroups = new ConfigurationAssignmentsForResourceGroupsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.updates = new UpdatesClientImpl(this);
    }

    /**
     * Gets default client context.
     * 
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     * 
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     * 
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline, Type pollResultType, Type finalResultType, Context context) {
        return PollerFactory.create(serializerAdapter, httpPipeline, pollResultType, finalResultType,
            defaultPollInterval, activationResponse, context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     * 
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse = new HttpResponseImpl(lroError.getResponseStatusCode(), lroError.getResponseHeaders(),
                    lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError = this.getSerializerAdapter()
                            .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(HttpHeaderName.fromString(s));
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MaintenanceManagementClientImpl.class);
}
