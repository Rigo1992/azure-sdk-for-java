// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Delimited text dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DelimitedText")
@JsonFlatten
@Fluent
public class DelimitedTextDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DelimitedTextDataset.class);

    /*
     * The location of the delimited text storage.
     */
    @JsonProperty(value = "typeProperties.location")
    private DatasetLocation location;

    /*
     * The column delimiter. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.columnDelimiter")
    private Object columnDelimiter;

    /*
     * The row delimiter. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.rowDelimiter")
    private Object rowDelimiter;

    /*
     * The code page name of the preferred encoding. If miss, the default value
     * is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name
     * column of the table in the following link to set supported values:
     * https://msdn.microsoft.com/library/system.text.encoding.aspx. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encodingName")
    private Object encodingName;

    /*
     * The data compressionCodec. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.compressionCodec")
    private Object compressionCodec;

    /*
     * The data compression method used for DelimitedText.
     */
    @JsonProperty(value = "typeProperties.compressionLevel")
    private Object compressionLevel;

    /*
     * The quote character. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.quoteChar")
    private Object quoteChar;

    /*
     * The escape character. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.escapeChar")
    private Object escapeChar;

    /*
     * When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The
     * default value is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "typeProperties.firstRowAsHeader")
    private Object firstRowAsHeader;

    /*
     * The null value string. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.nullValue")
    private Object nullValue;

    /**
     * Get the location property: The location of the delimited text storage.
     *
     * @return the location value.
     */
    public DatasetLocation location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the delimited text storage.
     *
     * @param location the location value to set.
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the columnDelimiter property: The column delimiter. Type: string (or Expression with resultType string).
     *
     * @return the columnDelimiter value.
     */
    public Object columnDelimiter() {
        return this.columnDelimiter;
    }

    /**
     * Set the columnDelimiter property: The column delimiter. Type: string (or Expression with resultType string).
     *
     * @param columnDelimiter the columnDelimiter value to set.
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withColumnDelimiter(Object columnDelimiter) {
        this.columnDelimiter = columnDelimiter;
        return this;
    }

    /**
     * Get the rowDelimiter property: The row delimiter. Type: string (or Expression with resultType string).
     *
     * @return the rowDelimiter value.
     */
    public Object rowDelimiter() {
        return this.rowDelimiter;
    }

    /**
     * Set the rowDelimiter property: The row delimiter. Type: string (or Expression with resultType string).
     *
     * @param rowDelimiter the rowDelimiter value to set.
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withRowDelimiter(Object rowDelimiter) {
        this.rowDelimiter = rowDelimiter;
        return this;
    }

    /**
     * Get the encodingName property: The code page name of the preferred encoding. If miss, the default value is UTF-8,
     * unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set
     * supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with
     * resultType string).
     *
     * @return the encodingName value.
     */
    public Object encodingName() {
        return this.encodingName;
    }

    /**
     * Set the encodingName property: The code page name of the preferred encoding. If miss, the default value is UTF-8,
     * unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set
     * supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with
     * resultType string).
     *
     * @param encodingName the encodingName value to set.
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withEncodingName(Object encodingName) {
        this.encodingName = encodingName;
        return this;
    }

    /**
     * Get the compressionCodec property: The data compressionCodec. Type: string (or Expression with resultType
     * string).
     *
     * @return the compressionCodec value.
     */
    public Object compressionCodec() {
        return this.compressionCodec;
    }

    /**
     * Set the compressionCodec property: The data compressionCodec. Type: string (or Expression with resultType
     * string).
     *
     * @param compressionCodec the compressionCodec value to set.
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withCompressionCodec(Object compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }

    /**
     * Get the compressionLevel property: The data compression method used for DelimitedText.
     *
     * @return the compressionLevel value.
     */
    public Object compressionLevel() {
        return this.compressionLevel;
    }

    /**
     * Set the compressionLevel property: The data compression method used for DelimitedText.
     *
     * @param compressionLevel the compressionLevel value to set.
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withCompressionLevel(Object compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }

    /**
     * Get the quoteChar property: The quote character. Type: string (or Expression with resultType string).
     *
     * @return the quoteChar value.
     */
    public Object quoteChar() {
        return this.quoteChar;
    }

    /**
     * Set the quoteChar property: The quote character. Type: string (or Expression with resultType string).
     *
     * @param quoteChar the quoteChar value to set.
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withQuoteChar(Object quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }

    /**
     * Get the escapeChar property: The escape character. Type: string (or Expression with resultType string).
     *
     * @return the escapeChar value.
     */
    public Object escapeChar() {
        return this.escapeChar;
    }

    /**
     * Set the escapeChar property: The escape character. Type: string (or Expression with resultType string).
     *
     * @param escapeChar the escapeChar value to set.
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withEscapeChar(Object escapeChar) {
        this.escapeChar = escapeChar;
        return this;
    }

    /**
     * Get the firstRowAsHeader property: When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the firstRowAsHeader value.
     */
    public Object firstRowAsHeader() {
        return this.firstRowAsHeader;
    }

    /**
     * Set the firstRowAsHeader property: When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param firstRowAsHeader the firstRowAsHeader value to set.
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withFirstRowAsHeader(Object firstRowAsHeader) {
        this.firstRowAsHeader = firstRowAsHeader;
        return this;
    }

    /**
     * Get the nullValue property: The null value string. Type: string (or Expression with resultType string).
     *
     * @return the nullValue value.
     */
    public Object nullValue() {
        return this.nullValue;
    }

    /**
     * Set the nullValue property: The null value string. Type: string (or Expression with resultType string).
     *
     * @param nullValue the nullValue value to set.
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withNullValue(Object nullValue) {
        this.nullValue = nullValue;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (location() != null) {
            location().validate();
        }
    }
}
