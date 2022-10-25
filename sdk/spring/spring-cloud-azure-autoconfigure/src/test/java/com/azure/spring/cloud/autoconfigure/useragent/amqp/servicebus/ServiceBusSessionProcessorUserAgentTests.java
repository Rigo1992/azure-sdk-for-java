// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.useragent.amqp.servicebus;

import com.azure.core.util.ClientOptions;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.spring.cloud.autoconfigure.context.AzureGlobalProperties;
import com.azure.spring.cloud.autoconfigure.servicebus.AzureServiceBusAutoConfiguration;
import com.azure.spring.cloud.core.implementation.util.AzureSpringIdentifier;
import com.azure.spring.cloud.service.implementation.servicebus.factory.ServiceBusSessionProcessorClientBuilderFactory;
import com.azure.spring.cloud.service.servicebus.consumer.ServiceBusErrorHandler;
import com.azure.spring.cloud.service.servicebus.consumer.ServiceBusRecordMessageListener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static com.azure.spring.cloud.core.implementation.util.ReflectionUtils.getField;
import static org.assertj.core.api.Assertions.assertThat;

class ServiceBusSessionProcessorUserAgentTests {

    @Test
    void shareServiceBusClientBuilderUserAgentTest() {
        userAgentTest(
            "spring.cloud.azure.servicebus.connection-string=Endpoint=sb://sample.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=key",
            "spring.cloud.azure.servicebus.processor.entity-name=sample",
            "spring.cloud.azure.servicebus.processor.entity-type=QUEUE",
            "spring.cloud.azure.servicebus.processor.session-enabled=true"
        );
    }

    @Test
    void notShareServiceBusClientBuilderUserAgentTest() {
        userAgentTest(
            "spring.cloud.azure.servicebus.connection-string=Endpoint=sb://sample.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=key",
            "spring.cloud.azure.servicebus.processor.entity-name=sample",
            "spring.cloud.azure.servicebus.processor.entity-type=QUEUE",
            "spring.cloud.azure.servicebus.processor.session-enabled=true",
            "spring.cloud.azure.servicebus.processor.namespace=sample"
        );
    }

    void userAgentTest(String... propertyValues) {
        new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(AzureServiceBusAutoConfiguration.class))
            .withBean(AzureGlobalProperties.class, AzureGlobalProperties::new)
            .withBean(ServiceBusRecordMessageListener.class, () -> messageContext -> { })
            .withBean(ServiceBusErrorHandler.class, () -> errorContext -> { })
            .withPropertyValues(propertyValues)
            .run(context -> {
                assertThat(context).hasSingleBean(ServiceBusSessionProcessorClientBuilderFactory.class);
                assertThat(context).hasSingleBean(ServiceBusClientBuilder.ServiceBusSessionProcessorClientBuilder.class);

                ServiceBusClientBuilder.ServiceBusSessionProcessorClientBuilder processorClientBuilder = context.getBean(ServiceBusClientBuilder.ServiceBusSessionProcessorClientBuilder.class);
                ServiceBusClientBuilder builder = (ServiceBusClientBuilder) getField(ServiceBusClientBuilder.ServiceBusSessionProcessorClientBuilder.class, "this$0", processorClientBuilder);
                ClientOptions options = (ClientOptions) getField(ServiceBusClientBuilder.class, "clientOptions", builder);
                Assertions.assertNotNull(options);
                Assertions.assertEquals(AzureSpringIdentifier.AZURE_SPRING_SERVICE_BUS, options.getApplicationId());

            });
    }

}
