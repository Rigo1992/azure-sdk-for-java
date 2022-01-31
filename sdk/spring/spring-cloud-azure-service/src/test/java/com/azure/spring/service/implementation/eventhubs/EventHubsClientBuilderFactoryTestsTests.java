// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.service.implementation.eventhubs;

import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.util.Configuration;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.messaging.eventhubs.EventHubConsumerClient;
import com.azure.spring.service.implementation.AzureServiceClientBuilderFactoryBaseTests;
import com.azure.spring.service.implementation.eventhubs.factory.EventHubClientBuilderFactory;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class EventHubsClientBuilderFactoryTestsTests extends AzureServiceClientBuilderFactoryBaseTests<EventHubClientBuilder,
    TestAzureEventHubsProperties, EventHubClientBuilderFactory> {

    private static final Configuration NOOP = new Configuration();
    @Override
    protected TestAzureEventHubsProperties createMinimalServiceProperties() {
        return new TestAzureEventHubsProperties();
    }

    @Test
    void testRetryOptionsConfigured() {
        TestAzureEventHubsProperties properties = createMinimalServiceProperties();
        final EventHubClientBuilderFactoryExt builderFactory = new EventHubClientBuilderFactoryExt(properties);
        final EventHubClientBuilder builder = builderFactory.build(NOOP);
        final EventHubConsumerClient client = builder.buildConsumerClient();
        verify(builder, times(1)).retry(any(AmqpRetryOptions.class));
    }

    static class EventHubClientBuilderFactoryExt extends EventHubClientBuilderFactory {

        EventHubClientBuilderFactoryExt(TestAzureEventHubsProperties properties) {
            super(properties);
        }

        @Override
        public EventHubClientBuilder createBuilderInstance() {
            return mock(EventHubClientBuilder.class);
        }
    }
}
