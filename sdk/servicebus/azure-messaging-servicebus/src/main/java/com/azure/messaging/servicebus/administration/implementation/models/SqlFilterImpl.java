// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The SqlFilter model.
 */
@Fluent
public class SqlFilterImpl extends RuleFilterImpl {
    private static final String SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT
        = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect";

    private static final String WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE
        = "http://www.w3.org/2001/XMLSchema-instance";

    /*
     * The type property.
     */
    private String type = "SqlFilter";

    /*
     * The sqlExpression property.
     */
    private String sqlExpression;

    /*
     * The compatibilityLevel property.
     */
    private String compatibilityLevel;

    /*
     * The parameters property.
     */
    private List<KeyValueImpl> parameters;

    /*
     * The requiresPreprocessing property.
     */
    private Boolean requiresPreprocessing;

    /**
     * Creates an instance of SqlFilter class.
     */
    public SqlFilterImpl() {
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the sqlExpression property: The sqlExpression property.
     * 
     * @return the sqlExpression value.
     */
    public String getSqlExpression() {
        return this.sqlExpression;
    }

    /**
     * Set the sqlExpression property: The sqlExpression property.
     * 
     * @param sqlExpression the sqlExpression value to set.
     * @return the SqlFilter object itself.
     */
    public SqlFilterImpl setSqlExpression(String sqlExpression) {
        this.sqlExpression = sqlExpression;
        return this;
    }

    /**
     * Get the compatibilityLevel property: The compatibilityLevel property.
     * 
     * @return the compatibilityLevel value.
     */
    public String getCompatibilityLevel() {
        return this.compatibilityLevel;
    }

    /**
     * Set the compatibilityLevel property: The compatibilityLevel property.
     * 
     * @param compatibilityLevel the compatibilityLevel value to set.
     * @return the SqlFilter object itself.
     */
    public SqlFilterImpl setCompatibilityLevel(String compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
        return this;
    }

    /**
     * Get the parameters property: The parameters property.
     * 
     * @return the parameters value.
     */
    public List<KeyValueImpl> getParameters() {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     * 
     * @param parameters the parameters value to set.
     * @return the SqlFilter object itself.
     */
    public SqlFilterImpl setParameters(List<KeyValueImpl> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the requiresPreprocessing property: The requiresPreprocessing property.
     * 
     * @return the requiresPreprocessing value.
     */
    public Boolean isRequiresPreprocessing() {
        return this.requiresPreprocessing;
    }

    /**
     * Set the requiresPreprocessing property: The requiresPreprocessing property.
     * 
     * @param requiresPreprocessing the requiresPreprocessing value to set.
     * @return the SqlFilter object itself.
     */
    public SqlFilterImpl setRequiresPreprocessing(Boolean requiresPreprocessing) {
        this.requiresPreprocessing = requiresPreprocessing;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Filter" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeNamespace(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT);
        xmlWriter.writeNamespace("xsi", WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE);
        xmlWriter.writeStringAttribute(WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE, "type", this.type);
        xmlWriter.writeStringElement(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT, "SqlExpression", this.sqlExpression);
        xmlWriter.writeStringElement(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT, "CompatibilityLevel",
            this.compatibilityLevel);
        if (this.parameters != null) {
            xmlWriter.writeStartElement(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT, "Parameters");
            for (KeyValueImpl element : this.parameters) {
                xmlWriter.writeXml(element, "KeyValueOfstringanyType");
            }
            xmlWriter.writeEndElement();
        }
        xmlWriter.writeBooleanElement(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT, "RequiresPreprocessing",
            this.requiresPreprocessing);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of SqlFilter from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of SqlFilter if the XmlReader was pointing to an instance of it, or null if it was pointing
     * to XML null.
     * @throws XMLStreamException If an error occurs while reading the SqlFilter.
     */
    public static SqlFilterImpl fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of SqlFilter from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of SqlFilter if the XmlReader was pointing to an instance of it, or null if it was pointing
     * to XML null.
     * @throws XMLStreamException If an error occurs while reading the SqlFilter.
     */
    public static SqlFilterImpl fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Filter" : rootElementName;
        return xmlReader.readObject(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT, finalRootElementName, reader -> {
            // Get the XML discriminator attribute.
            String discriminatorValue
                = reader.getStringAttribute(WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE, "type");
            // Use the discriminator value to determine which subtype should be deserialized.
            if ("TrueFilter".equals(discriminatorValue)) {
                return TrueFilterImpl.fromXml(reader, finalRootElementName);
            } else if ("FalseFilter".equals(discriminatorValue)) {
                return FalseFilterImpl.fromXml(reader, finalRootElementName);
            } else {
                return fromXmlInternal(reader, finalRootElementName);
            }
        });
    }

    static SqlFilterImpl fromXmlInternal(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Filter" : rootElementName;
        return xmlReader.readObject(SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT, finalRootElementName, reader -> {
            SqlFilterImpl deserializedSqlFilter = new SqlFilterImpl();
            deserializedSqlFilter.type
                = reader.getStringAttribute(WWW_W3_ORG_TWO_ZERO_ZERO_ONE_XMLSCHEMA_INSTANCE, "type");
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("SqlExpression".equals(elementName.getLocalPart())
                    && SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT.equals(elementName.getNamespaceURI())) {
                    deserializedSqlFilter.sqlExpression = reader.getStringElement();
                } else if ("CompatibilityLevel".equals(elementName.getLocalPart())
                    && SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT.equals(elementName.getNamespaceURI())) {
                    deserializedSqlFilter.compatibilityLevel = reader.getStringElement();
                } else if ("Parameters".equals(elementName.getLocalPart())
                    && SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT.equals(elementName.getNamespaceURI())) {
                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        elementName = reader.getElementName();
                        if ("KeyValueOfstringanyType".equals(elementName.getLocalPart())
                            && SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT.equals(elementName.getNamespaceURI())) {
                            if (deserializedSqlFilter.parameters == null) {
                                deserializedSqlFilter.parameters = new ArrayList<>();
                            }
                            deserializedSqlFilter.parameters
                                .add(KeyValueImpl.fromXml(reader, "KeyValueOfstringanyType"));
                        } else {
                            reader.skipElement();
                        }
                    }
                } else if ("RequiresPreprocessing".equals(elementName.getLocalPart())
                    && SCHEMAS_MICROSOFT_COM_SERVICEBUS_CONNECT.equals(elementName.getNamespaceURI())) {
                    deserializedSqlFilter.requiresPreprocessing = reader.getNullableElement(Boolean::parseBoolean);
                } else {
                    reader.skipElement();
                }
            }

            return deserializedSqlFilter;
        });
    }
}
