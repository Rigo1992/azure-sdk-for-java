// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.servicebus.core.producer;

import com.azure.core.util.Configuration;
import com.azure.messaging.servicebus.ServiceBusSenderAsyncClient;
import com.azure.spring.core.AzureSpringIdentifier;
import com.azure.spring.messaging.PropertiesSupplier;
import com.azure.spring.service.implementation.servicebus.factory.ServiceBusSenderClientBuilderFactory;
import com.azure.spring.service.servicebus.properties.ServiceBusEntityType;
import com.azure.spring.servicebus.core.properties.NamespaceProperties;
import com.azure.spring.servicebus.core.properties.ProducerProperties;
import com.azure.spring.servicebus.core.properties.merger.SenderPropertiesParentMerger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The {@link ServiceBusProducerFactory} implementation to produce new {@link ServiceBusSenderAsyncClient} instances
 * for provided {@link NamespaceProperties} and optional producer {@link PropertiesSupplier} on each
 * {@link #createProducer} invocation.
 * <p>
 * {@link ServiceBusSenderAsyncClient} produced by this factory will share the same namespace level configuration, but
 * if a configuration entry is provided at both producer and namespace level, the producer level configuration will
 * take advantage.
 * </p>
 */
public final class DefaultServiceBusNamespaceProducerFactory implements ServiceBusProducerFactory, DisposableBean {

    private final List<Listener> listeners = new ArrayList<>();
    private final NamespaceProperties namespaceProperties;
    private final PropertiesSupplier<String, ProducerProperties> propertiesSupplier;
    private final Map<String, ServiceBusSenderAsyncClient> clients = new ConcurrentHashMap<>();
    private final SenderPropertiesParentMerger parentMerger = new SenderPropertiesParentMerger();
    private final Configuration configuration;
    /**
     * Construct a factory with the provided namespace level configuration.
     * @param namespaceProperties the namespace properties
     */
    public DefaultServiceBusNamespaceProducerFactory(NamespaceProperties namespaceProperties, Configuration configuration) {
        this(namespaceProperties, key -> null, configuration);
    }

    /**
     * Construct a factory with the provided namespace level configuration and producer {@link PropertiesSupplier}.
     * @param namespaceProperties the namespace properties.
     * @param supplier the {@link PropertiesSupplier} to supply {@link ProducerProperties} for each queue/topic entity.
     */
    public DefaultServiceBusNamespaceProducerFactory(NamespaceProperties namespaceProperties,
                                                     PropertiesSupplier<String, ProducerProperties> supplier, Configuration configuration) {
        this.namespaceProperties = namespaceProperties;
        this.propertiesSupplier = supplier == null ? key -> null : supplier;
        this.configuration = configuration;
    }

    @Override
    public ServiceBusSenderAsyncClient createProducer(String name) {
        return createProducer(name, null);
    }

    @Override
    public ServiceBusSenderAsyncClient createProducer(String name, ServiceBusEntityType entityType) {
        ProducerProperties producerProperties = this.propertiesSupplier.getProperties(name) != null
            ? this.propertiesSupplier.getProperties(name) : new ProducerProperties();
        if (entityType != null) {
            producerProperties.setEntityType(entityType);
        }
        return doCreateProducer(name, producerProperties);
    }

    @Override
    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override
    public boolean removeListener(Listener listener) {
        return this.listeners.remove(listener);
    }

    @Override
    public void destroy() {
        clients.forEach((name, producer) -> {
            listeners.forEach(l -> l.producerRemoved(name, producer));
            producer.close();
        });
        this.clients.clear();
        this.listeners.clear();
    }

    private ServiceBusSenderAsyncClient doCreateProducer(String name, @Nullable ProducerProperties properties) {
        return clients.computeIfAbsent(name, entityName -> {
            ProducerProperties producerProperties = parentMerger.mergeParent(properties, this.namespaceProperties);
            producerProperties.setEntityName(entityName);

            //TODO(yiliu6): whether to make the producer client share the same service bus client builder
            ServiceBusSenderClientBuilderFactory factory = new ServiceBusSenderClientBuilderFactory(producerProperties);
            factory.setSpringIdentifier(AzureSpringIdentifier.AZURE_SPRING_INTEGRATION_SERVICE_BUS);
            ServiceBusSenderAsyncClient producerClient = factory.build(configuration).buildAsyncClient();

            this.listeners.forEach(l -> l.producerAdded(entityName, producerClient));
            return producerClient;
        });
    }
}
