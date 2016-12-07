package com.microsoft.azure.servicebus.messaging;

import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.amqp.messaging.MessageAnnotations;
import org.apache.qpid.proton.amqp.messaging.Section;
import org.apache.qpid.proton.message.Message;

import com.microsoft.azure.servicebus.MessageWithDeliveryTag;
import com.microsoft.azure.servicebus.StringUtil;
import com.microsoft.azure.servicebus.Util;

class MessageConverter
{	
	private static final int LOCKTOKENSIZE = 16;
    private static final String ENQUEUEDTIMEUTCNAME = "x-opt-enqueued-time";
    private static final String SCHEDULEDENQUEUETIMENAME = "x-opt-scheduled-enqueue-time";
    private static final String SEQUENCENUBMERNAME = "x-opt-sequence-number";
    //private static final String LOCKTOKENNAME = "x-opt-lock-token";
    private static final String LOCKEDUNTILNAME = "x-opt-locked-until";
    private static final String PARTITIONKEYNAME = "x-opt-partition-key";
    private static final String DEADLETTERSOURCENAME = "x-opt-deadletter-source";
    private static final UUID ZEROLOCKTOKEN = new UUID(0l, 0l);

	public static Message convertBrokeredMessageToAmqpMessage(BrokeredMessage brokeredMessage)	
	{
		Message amqpMessage = Proton.message();
		if(brokeredMessage.getContent() != null)
		{
			amqpMessage.setBody(new Data(new Binary(brokeredMessage.getContent())));
		}
		
		if(brokeredMessage.getProperties() != null)
		{
			amqpMessage.setApplicationProperties(new ApplicationProperties(brokeredMessage.getProperties()));
		}
		
		if(brokeredMessage.getTimeToLive() != null)
		{
			amqpMessage.setTtl(brokeredMessage.getTimeToLive().toMillis());
		}		
		
		amqpMessage.setMessageId(brokeredMessage.getMessageId());
		amqpMessage.setContentType(brokeredMessage.getContentType());
		amqpMessage.setCorrelationId(brokeredMessage.getCorrelationId());
		amqpMessage.setSubject(brokeredMessage.getLabel());
		amqpMessage.getProperties().setTo(brokeredMessage.getTo());
		amqpMessage.setReplyTo(brokeredMessage.getReplyTo());
		amqpMessage.setReplyToGroupId(brokeredMessage.getReplyToSessionId());
		amqpMessage.setGroupId(brokeredMessage.getSessionId());
		
		Map<Symbol, Object> messageAnnotationsMap = new HashMap<Symbol, Object>();
		if(brokeredMessage.getScheduledEnqueuedTimeUtc() != null)
		{
			messageAnnotationsMap.put(Symbol.valueOf(SCHEDULEDENQUEUETIMENAME), Date.from(brokeredMessage.getScheduledEnqueuedTimeUtc()));
		}
		
		if(StringUtil.isNullOrEmpty(brokeredMessage.getPartitionKey()))
		{
			messageAnnotationsMap.put(Symbol.valueOf(PARTITIONKEYNAME), brokeredMessage.getPartitionKey());
		}
		
		return amqpMessage;
	}	
		
	public static BrokeredMessage convertAmqpMessageToBrokeredMessage(MessageWithDeliveryTag amqpMessageWithDeliveryTag)
	{
		Message amqpMessage = amqpMessageWithDeliveryTag.getMessage();
		byte[] deliveryTag = amqpMessageWithDeliveryTag.getDeliveryTag();
		
		BrokeredMessage brokeredMessage;
		Section body = amqpMessage.getBody();
		if(body != null)
		{
			if(body instanceof Data)
			{
				Binary messageData = ((Data)body).getValue();
				brokeredMessage = new BrokeredMessage(messageData.getArray());
			}
			else
			{
				// TODO: handle other types of message body
				brokeredMessage = new BrokeredMessage();
			}
		}
		else
		{
			brokeredMessage = new BrokeredMessage();
		}
		
		// Application properties
		ApplicationProperties applicationProperties = amqpMessage.getApplicationProperties();
		if(applicationProperties != null)
		{
			brokeredMessage.setProperties(applicationProperties.getValue());
		}		
		
		// Header
		brokeredMessage.setTimeToLive(Duration.ofMillis(amqpMessage.getTtl()));
		brokeredMessage.setDeliveryCount(amqpMessage.getDeliveryCount());
		
		// Properties
		brokeredMessage.setMessageId(amqpMessage.getMessageId().toString());
		brokeredMessage.setContentType(amqpMessage.getContentType());
		Object correlationId = amqpMessage.getCorrelationId();
		if(correlationId != null)
		{
			brokeredMessage.setCorrelationId(amqpMessage.getCorrelationId().toString());
		}		
		brokeredMessage.setLabel(amqpMessage.getSubject());
		brokeredMessage.setTo(amqpMessage.getProperties().getTo());
		brokeredMessage.setReplyTo(amqpMessage.getReplyTo());
		brokeredMessage.setReplyToSessionId(amqpMessage.getReplyToGroupId());
		brokeredMessage.setSessionId(amqpMessage.getGroupId());
		
		// Message Annotations
		MessageAnnotations messageAnnotations = amqpMessage.getMessageAnnotations();
		if(messageAnnotations != null)
		{
			Map<Symbol, Object> messageAnnotationsMap = messageAnnotations.getValue();
			if(messageAnnotationsMap != null)
			{
				for(Map.Entry<Symbol, Object> entry : messageAnnotationsMap.entrySet())
				{
					String entryName = entry.getKey().toString();
					switch(entryName)
					{
						case ENQUEUEDTIMEUTCNAME:
							//brokeredMessage.setEnqueuedTimeUtc(Utils.convertDotNetTicksToInstant((long)entry.getValue()));
							brokeredMessage.setEnqueuedTimeUtc(((Date)entry.getValue()).toInstant());
							break;
						case SCHEDULEDENQUEUETIMENAME:
	                        //brokeredMessage.setScheduledEnqueuedTimeUtc(Utils.convertDotNetTicksToInstant((long)entry.getValue()));
	                        brokeredMessage.setScheduledEnqueuedTimeUtc(((Date)entry.getValue()).toInstant());
	                        break;
	                    case SEQUENCENUBMERNAME:
	                        brokeredMessage.setSequenceNumber((long)entry.getValue());
	                        break;                    
	                    case LOCKEDUNTILNAME:
	                        //brokeredMessage.setLockedUntilUtc(Utils.convertDotNetTicksToInstant((long)entry.getValue()));
	                        brokeredMessage.setLockedUntilUtc(((Date)entry.getValue()).toInstant());
	                        break;                    
	                    case PARTITIONKEYNAME:
	                        brokeredMessage.setPartitionKey((String)entry.getValue());
	                        break;                    
	                    case DEADLETTERSOURCENAME:
	                        brokeredMessage.setDeadLetterSource((String)entry.getValue());
	                        break;
					}				
				}
			}
		}
		
		if(deliveryTag != null && deliveryTag.length == LOCKTOKENSIZE)
		{
			UUID lockToken = Util.convertDotNetBytesToUUID(deliveryTag);
			brokeredMessage.setLockToken(lockToken);
		}
		else
		{
			brokeredMessage.setLockToken(ZEROLOCKTOKEN);
		}
		
		brokeredMessage.setDeliveryTag(deliveryTag);
		
		return brokeredMessage;
	}
}
