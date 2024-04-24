// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * Azure Analytics Logging settings.
 */
@Fluent
public final class QueueAnalyticsLogging implements XmlSerializable<QueueAnalyticsLogging> {
    /*
     * The version of Storage Analytics to configure.
     */
    private String version;

    /*
     * Indicates whether all delete requests should be logged.
     */
    private boolean delete;

    /*
     * Indicates whether all read requests should be logged.
     */
    private boolean read;

    /*
     * Indicates whether all write requests should be logged.
     */
    private boolean write;

    /*
     * the retention policy
     */
    private QueueRetentionPolicy retentionPolicy;

    /**
     * Creates an instance of QueueAnalyticsLogging class.
     */
    public QueueAnalyticsLogging() {
    }

    /**
     * Get the version property: The version of Storage Analytics to configure.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of Storage Analytics to configure.
     * 
     * @param version the version value to set.
     * @return the QueueAnalyticsLogging object itself.
     */
    public QueueAnalyticsLogging setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the delete property: Indicates whether all delete requests should be logged.
     * 
     * @return the delete value.
     */
    public boolean isDelete() {
        return this.delete;
    }

    /**
     * Set the delete property: Indicates whether all delete requests should be logged.
     * 
     * @param delete the delete value to set.
     * @return the QueueAnalyticsLogging object itself.
     */
    public QueueAnalyticsLogging setDelete(boolean delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Get the read property: Indicates whether all read requests should be logged.
     * 
     * @return the read value.
     */
    public boolean isRead() {
        return this.read;
    }

    /**
     * Set the read property: Indicates whether all read requests should be logged.
     * 
     * @param read the read value to set.
     * @return the QueueAnalyticsLogging object itself.
     */
    public QueueAnalyticsLogging setRead(boolean read) {
        this.read = read;
        return this;
    }

    /**
     * Get the write property: Indicates whether all write requests should be logged.
     * 
     * @return the write value.
     */
    public boolean isWrite() {
        return this.write;
    }

    /**
     * Set the write property: Indicates whether all write requests should be logged.
     * 
     * @param write the write value to set.
     * @return the QueueAnalyticsLogging object itself.
     */
    public QueueAnalyticsLogging setWrite(boolean write) {
        this.write = write;
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy.
     * 
     * @return the retentionPolicy value.
     */
    public QueueRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: the retention policy.
     * 
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the QueueAnalyticsLogging object itself.
     */
    public QueueAnalyticsLogging setRetentionPolicy(QueueRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "QueueAnalyticsLogging" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("Version", this.version);
        xmlWriter.writeBooleanElement("Delete", this.delete);
        xmlWriter.writeBooleanElement("Read", this.read);
        xmlWriter.writeBooleanElement("Write", this.write);
        xmlWriter.writeXml(this.retentionPolicy, "RetentionPolicy");
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of QueueAnalyticsLogging from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of QueueAnalyticsLogging if the XmlReader was pointing to an instance of it, or null if it
     * was pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the QueueAnalyticsLogging.
     */
    public static QueueAnalyticsLogging fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of QueueAnalyticsLogging from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of QueueAnalyticsLogging if the XmlReader was pointing to an instance of it, or null if it
     * was pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the QueueAnalyticsLogging.
     */
    public static QueueAnalyticsLogging fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName
            = CoreUtils.isNullOrEmpty(rootElementName) ? "QueueAnalyticsLogging" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            QueueAnalyticsLogging deserializedQueueAnalyticsLogging = new QueueAnalyticsLogging();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("Version".equals(elementName.getLocalPart())) {
                    deserializedQueueAnalyticsLogging.version = reader.getStringElement();
                } else if ("Delete".equals(elementName.getLocalPart())) {
                    deserializedQueueAnalyticsLogging.delete = reader.getBooleanElement();
                } else if ("Read".equals(elementName.getLocalPart())) {
                    deserializedQueueAnalyticsLogging.read = reader.getBooleanElement();
                } else if ("Write".equals(elementName.getLocalPart())) {
                    deserializedQueueAnalyticsLogging.write = reader.getBooleanElement();
                } else if ("RetentionPolicy".equals(elementName.getLocalPart())) {
                    deserializedQueueAnalyticsLogging.retentionPolicy
                        = QueueRetentionPolicy.fromXml(reader, "RetentionPolicy");
                } else {
                    reader.skipElement();
                }
            }

            return deserializedQueueAnalyticsLogging;
        });
    }
}
