// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation;

import com.azure.core.amqp.implementation.ConnectionStringProperties;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.ServiceBusServiceVersion;
import com.azure.messaging.servicebus.TestUtils;
import com.azure.messaging.servicebus.administration.implementation.EntitiesImpl;
import com.azure.messaging.servicebus.administration.implementation.EntityHelper;
import com.azure.messaging.servicebus.administration.implementation.ServiceBusManagementClientImpl;
import com.azure.messaging.servicebus.administration.implementation.ServiceBusManagementSerializer;
import com.azure.messaging.servicebus.administration.implementation.models.CreateQueueBodyContentImpl;
import com.azure.messaging.servicebus.administration.implementation.models.CreateQueueBodyImpl;
import com.azure.messaging.servicebus.administration.implementation.models.QueueDescriptionEntryImpl;
import com.azure.messaging.servicebus.administration.implementation.models.QueueDescriptionFeedImpl;
import com.azure.messaging.servicebus.administration.implementation.models.QueueDescriptionImpl;
import com.azure.messaging.servicebus.administration.models.CreateQueueOptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.test.StepVerifier;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Integration tests for {@link ServiceBusManagementClientImpl}.
 */
class ServiceBusAdministrationClientImplIntegrationTests extends TestProxyTestBase {
    private static final ClientLogger LOGGER = new ClientLogger(ServiceBusAdministrationClientImplIntegrationTests.class);
    private static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(30);
    private static final ServiceBusManagementSerializer SERIALIZER = new ServiceBusManagementSerializer();
    private final Duration timeout = Duration.ofSeconds(30);

    /**
     * Verifies we can get queue information.
     */
    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    void getQueueImplementation(HttpClient httpClient) {
        // Arrange
        final ServiceBusManagementClientImpl managementClient = createClient(httpClient);
        final EntitiesImpl entityClient = managementClient.getEntities();
        final String queueName = TestUtils.getEntityName(TestUtils.getQueueBaseName(), 0);

        // Act & Assert
        StepVerifier.create(entityClient.getWithResponseAsync(queueName, true, Context.NONE))
            .assertNext(response -> {
                final QueueDescriptionEntryImpl deserialize = deserialize(response, QueueDescriptionEntryImpl.class);
                assertNotNull(deserialize);
                assertNotNull(deserialize.getContent());

                final QueueDescriptionImpl properties = deserialize.getContent().getQueueDescription();
                assertNotNull(properties);
                assertFalse(properties.getLockDuration().isZero());
            })
            .expectComplete()
            .verify(DEFAULT_TIMEOUT);
    }

    /**
     * Verifies we can create a queue.
     */
    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    void createQueueImplementation(HttpClient httpClient) {
        // Arrange
        final ServiceBusManagementClientImpl managementClient = createClient(httpClient);
        final EntitiesImpl entityClient = managementClient.getEntities();

        final String queueName = testResourceNamer.randomName("test", 7);
        final CreateQueueOptions options = new CreateQueueOptions()
            .setMaxDeliveryCount(15);
        final QueueDescriptionImpl queueProperties = EntityHelper.getQueueDescription(options);
        final CreateQueueBodyImpl createEntity = new CreateQueueBodyImpl();
        final CreateQueueBodyContentImpl content = new CreateQueueBodyContentImpl()
            .setType("application/xml")
            .setQueueDescription(queueProperties);
        createEntity.setContent(content);

        LOGGER.info("Creating queue: {}", queueName);

        // Act & Assert
        StepVerifier.create(entityClient.putWithResponseAsync(queueName, createEntity, null, Context.NONE))
            .assertNext(response -> {
                QueueDescriptionEntryImpl entry = deserialize(response, QueueDescriptionEntryImpl.class);

                assertNotNull(entry);
                assertNotNull(entry.getContent().getQueueDescription());
            })
            .expectComplete()
            .verify(DEFAULT_TIMEOUT);
    }

    /**
     * Verifies we can delete a queue.
     */
    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    void deleteQueueImplementation(HttpClient httpClient) {
        // Arrange
        final ServiceBusManagementClientImpl managementClient = createClient(httpClient);
        final EntitiesImpl entityClient = managementClient.getEntities();

        final String queueName = testResourceNamer.randomName("test", 7);
        final CreateQueueOptions description = new CreateQueueOptions()
            .setMaxDeliveryCount(15);
        final QueueDescriptionImpl queueProperties = EntityHelper.getQueueDescription(description);
        final CreateQueueBodyImpl createEntity = new CreateQueueBodyImpl();
        final CreateQueueBodyContentImpl content = new CreateQueueBodyContentImpl()
            .setType("application/xml")
            .setQueueDescription(queueProperties);
        createEntity.setContent(content);

        LOGGER.info("Creating queue: {}", queueName);

        // This is not part of the scenario. We'll ensure it is created.
        Response<Object> response = entityClient.putWithResponseAsync(queueName, createEntity, null, Context.NONE)
            .block(timeout);
        assertNotNull(response);

        // Act & Assert
        StepVerifier.create(entityClient.deleteWithResponseAsync(queueName, Context.NONE))
            .assertNext(deletedResponse -> assertEquals(200, deletedResponse.getStatusCode()))
            .expectComplete()
            .verify(DEFAULT_TIMEOUT);
    }

    /**
     * Verifies that we can edit properties on an existing queue.
     */
    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    void editQueueImplementation(HttpClient httpClient) {
        // Arrange
        final ServiceBusManagementClientImpl managementClient = createClient(httpClient);
        final EntitiesImpl entityClient = managementClient.getEntities();

        final String queueName = TestUtils.getEntityName(TestUtils.getQueueBaseName(), 5);
        final Response<Object> response = entityClient.getWithResponseAsync(queueName, true, Context.NONE)
            .block(Duration.ofSeconds(30));
        assertNotNull(response);
        final QueueDescriptionEntryImpl deserialize = deserialize(response, QueueDescriptionEntryImpl.class);
        final QueueDescriptionImpl properties = deserialize.getContent().getQueueDescription();

        final int maxDeliveryCount = properties.getMaxDeliveryCount();
        final int newDeliveryCount = maxDeliveryCount + 5;
        final Duration lockDuration = properties.getLockDuration();
        final Duration newLockDuration = lockDuration.plusSeconds(40);
        final Duration autoDeleteOnIdle = Duration.ofDays(5);

        // Set the updated queue properties.
        properties.setMaxDeliveryCount(newDeliveryCount);
        properties.setLockDuration(newLockDuration);
        properties.setAutoDeleteOnIdle(autoDeleteOnIdle);

        CreateQueueBodyImpl updated = new CreateQueueBodyImpl()
            .setContent(new CreateQueueBodyContentImpl()
                .setQueueDescription(properties)
                .setType("application/xml"));

        // Act & Assert
        StepVerifier.create(entityClient.putWithResponseAsync(queueName, updated, "*", Context.NONE))
            .assertNext(update -> {
                final QueueDescriptionEntryImpl updatedProperties = deserialize(update, QueueDescriptionEntryImpl.class);
                assertNotNull(updatedProperties);
            })
            .expectComplete()
            .verify(DEFAULT_TIMEOUT);
    }

    /**
     * Verifies we can list queues.
     */
    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    void listQueuesImplementation(HttpClient httpClient) {
        // Arrange
        final ServiceBusManagementClientImpl managementClient = createClient(httpClient);
        final String entityType = "queues";

        // Act & Assert
        StepVerifier.create(managementClient.listEntitiesWithResponseAsync(entityType, 0, 100, Context.NONE))
            .assertNext(response -> {
                QueueDescriptionFeedImpl deserialize = deserialize(response, QueueDescriptionFeedImpl.class);

                assertNotNull(deserialize);
                assertNotNull(deserialize.getEntry());
                assertTrue(deserialize.getEntry().size() > 2);
            })
            .expectComplete()
            .verify(DEFAULT_TIMEOUT);
    }

    private ServiceBusManagementClientImpl createClient(HttpClient httpClient) {
        final String connectionString = interceptorManager.isPlaybackMode()
            ? "Endpoint=sb://foo" + TestUtils.getEndpoint() + ";SharedAccessKeyName=dummyKey;SharedAccessKey=dummyAccessKey"
            : TestUtils.getConnectionString(false);
        final ConnectionStringProperties properties = new ConnectionStringProperties(connectionString);
        final ServiceBusSharedKeyCredential credential = new ServiceBusSharedKeyCredential(
            properties.getSharedAccessKeyName(), properties.getSharedAccessKey());
        final List<HttpPipelinePolicy> policies = new ArrayList<>();
        policies.add(new UserAgentPolicy());
        policies.add(new ServiceBusTokenCredentialHttpPolicy(credential));
        policies.add(new HttpLoggingPolicy(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS)));

        final HttpClient httpClientToUse;
        if (interceptorManager.isPlaybackMode()) {
            httpClientToUse = interceptorManager.getPlaybackClient();
        } else if (interceptorManager.isLiveMode()) {
            httpClientToUse = httpClient;
        } else {
            httpClientToUse = httpClient;
            policies.add(interceptorManager.getRecordPolicy());
        }

        final HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(httpClientToUse)
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .build();

        return new ServiceBusManagementClientImpl(pipeline, SERIALIZER, properties.getEndpoint().getHost(),
            ServiceBusServiceVersion.getLatest().getVersion());
    }

    private <T> T deserialize(Response<Object> response, Class<T> clazz) {
        final Object body = response.getValue();
        final String contents = String.valueOf(body);
        final T deserialize;
        try {
            deserialize = SERIALIZER.deserialize(contents, clazz);
        } catch (IOException e) {
            throw LOGGER.logExceptionAsError(new RuntimeException(String.format(
                "Exception while deserializing. Body: [%s]. Class: %s", contents, clazz), e));
        }

        if (deserialize == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "'deserialize' should not be null. Body: [%s]. Class: [%s]", contents, clazz)));
        }

        return deserialize;
    }
}
