package com.microsoft.azure.servicebus.messaging;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

import com.microsoft.azure.servicebus.ServiceBusException;

public interface IMessageSender extends IMessageEntity{
	void send(IBrokeredMessage message) throws InterruptedException, ServiceBusException;

    void sendBatch(Collection<? extends IBrokeredMessage> message) throws InterruptedException, ServiceBusException;

    CompletableFuture<Void> sendAsync(IBrokeredMessage message);

    CompletableFuture<Void> sendBatchAsync(Collection<? extends IBrokeredMessage> message);
}
