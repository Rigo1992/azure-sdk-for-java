// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Splits words into subwords and performs optional transformations on subword groups. This token filter is implemented
 * using Apache Lucene.
 */
@Fluent
public final class WordDelimiterTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    private static final String ODATA_TYPE = "#Microsoft.Azure.Search.WordDelimiterTokenFilter";

    /*
     * A value indicating whether to generate part words. If set, causes parts of words to be generated; for example
     * "AzureSearch" becomes "Azure" "Search". Default is true.
     */
    private Boolean generateWordParts;

    /*
     * A value indicating whether to generate number subwords. Default is true.
     */
    private Boolean generateNumberParts;

    /*
     * A value indicating whether maximum runs of word parts will be catenated. For example, if this is set to true,
     * "Azure-Search" becomes "AzureSearch". Default is false.
     */
    private Boolean wordsCatenated;

    /*
     * A value indicating whether maximum runs of number parts will be catenated. For example, if this is set to true,
     * "1-2" becomes "12". Default is false.
     */
    private Boolean numbersCatenated;

    /*
     * A value indicating whether all subword parts will be catenated. For example, if this is set to true,
     * "Azure-Search-1" becomes "AzureSearch1". Default is false.
     */
    private Boolean catenateAll;

    /*
     * A value indicating whether to split words on caseChange. For example, if this is set to true, "AzureSearch"
     * becomes "Azure" "Search". Default is true.
     */
    private Boolean splitOnCaseChange;

    /*
     * A value indicating whether original words will be preserved and added to the subword list. Default is false.
     */
    private Boolean preserveOriginal;

    /*
     * A value indicating whether to split on numbers. For example, if this is set to true, "Azure1Search" becomes
     * "Azure" "1" "Search". Default is true.
     */
    private Boolean splitOnNumerics;

    /*
     * A value indicating whether to remove trailing "'s" for each subword. Default is true.
     */
    private Boolean stemEnglishPossessive;

    /*
     * A list of tokens to protect from being delimited.
     */
    private List<String> protectedWords;

    /**
     * Creates an instance of WordDelimiterTokenFilter class.
     *
     * @param name the name value to set.
     */
    public WordDelimiterTokenFilter(String name) {
        super(name);
    }

    /**
     * Get the generateWordParts property: A value indicating whether to generate part words. If set, causes parts of
     * words to be generated; for example "AzureSearch" becomes "Azure" "Search". Default is true.
     *
     * @return the generateWordParts value.
     */
    public Boolean generateWordParts() {
        return this.generateWordParts;
    }

    /**
     * Set the generateWordParts property: A value indicating whether to generate part words. If set, causes parts of
     * words to be generated; for example "AzureSearch" becomes "Azure" "Search". Default is true.
     *
     * @param generateWordParts the generateWordParts value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setGenerateWordParts(Boolean generateWordParts) {
        this.generateWordParts = generateWordParts;
        return this;
    }

    /**
     * Get the generateNumberParts property: A value indicating whether to generate number subwords. Default is true.
     *
     * @return the generateNumberParts value.
     */
    public Boolean generateNumberParts() {
        return this.generateNumberParts;
    }

    /**
     * Set the generateNumberParts property: A value indicating whether to generate number subwords. Default is true.
     *
     * @param generateNumberParts the generateNumberParts value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setGenerateNumberParts(Boolean generateNumberParts) {
        this.generateNumberParts = generateNumberParts;
        return this;
    }

    /**
     * Get the wordsCatenated property: A value indicating whether maximum runs of word parts will be catenated. For
     * example, if this is set to true, "Azure-Search" becomes "AzureSearch". Default is false.
     *
     * @return the wordsCatenated value.
     */
    public Boolean areWordsCatenated() {
        return this.wordsCatenated;
    }

    /**
     * Set the wordsCatenated property: A value indicating whether maximum runs of word parts will be catenated. For
     * example, if this is set to true, "Azure-Search" becomes "AzureSearch". Default is false.
     *
     * @param wordsCatenated the wordsCatenated value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setWordsCatenated(Boolean wordsCatenated) {
        this.wordsCatenated = wordsCatenated;
        return this;
    }

    /**
     * Get the numbersCatenated property: A value indicating whether maximum runs of number parts will be catenated. For
     * example, if this is set to true, "1-2" becomes "12". Default is false.
     *
     * @return the numbersCatenated value.
     */
    public Boolean areNumbersCatenated() {
        return this.numbersCatenated;
    }

    /**
     * Set the numbersCatenated property: A value indicating whether maximum runs of number parts will be catenated. For
     * example, if this is set to true, "1-2" becomes "12". Default is false.
     *
     * @param numbersCatenated the numbersCatenated value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setNumbersCatenated(Boolean numbersCatenated) {
        this.numbersCatenated = numbersCatenated;
        return this;
    }

    /**
     * Get the catenateAll property: A value indicating whether all subword parts will be catenated. For example, if
     * this is set to true, "Azure-Search-1" becomes "AzureSearch1". Default is false.
     *
     * @return the catenateAll value.
     */
    public Boolean catenateAll() {
        return this.catenateAll;
    }

    /**
     * Set the catenateAll property: A value indicating whether all subword parts will be catenated. For example, if
     * this is set to true, "Azure-Search-1" becomes "AzureSearch1". Default is false.
     *
     * @param catenateAll the catenateAll value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setCatenateAll(Boolean catenateAll) {
        this.catenateAll = catenateAll;
        return this;
    }

    /**
     * Get the splitOnCaseChange property: A value indicating whether to split words on caseChange. For example, if this
     * is set to true, "AzureSearch" becomes "Azure" "Search". Default is true.
     *
     * @return the splitOnCaseChange value.
     */
    public Boolean splitOnCaseChange() {
        return this.splitOnCaseChange;
    }

    /**
     * Set the splitOnCaseChange property: A value indicating whether to split words on caseChange. For example, if this
     * is set to true, "AzureSearch" becomes "Azure" "Search". Default is true.
     *
     * @param splitOnCaseChange the splitOnCaseChange value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setSplitOnCaseChange(Boolean splitOnCaseChange) {
        this.splitOnCaseChange = splitOnCaseChange;
        return this;
    }

    /**
     * Get the preserveOriginal property: A value indicating whether original words will be preserved and added to the
     * subword list. Default is false.
     *
     * @return the preserveOriginal value.
     */
    public Boolean isPreserveOriginal() {
        return this.preserveOriginal;
    }

    /**
     * Set the preserveOriginal property: A value indicating whether original words will be preserved and added to the
     * subword list. Default is false.
     *
     * @param preserveOriginal the preserveOriginal value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setPreserveOriginal(Boolean preserveOriginal) {
        this.preserveOriginal = preserveOriginal;
        return this;
    }

    /**
     * Get the splitOnNumerics property: A value indicating whether to split on numbers. For example, if this is set to
     * true, "Azure1Search" becomes "Azure" "1" "Search". Default is true.
     *
     * @return the splitOnNumerics value.
     */
    public Boolean splitOnNumerics() {
        return this.splitOnNumerics;
    }

    /**
     * Set the splitOnNumerics property: A value indicating whether to split on numbers. For example, if this is set to
     * true, "Azure1Search" becomes "Azure" "1" "Search". Default is true.
     *
     * @param splitOnNumerics the splitOnNumerics value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setSplitOnNumerics(Boolean splitOnNumerics) {
        this.splitOnNumerics = splitOnNumerics;
        return this;
    }

    /**
     * Get the stemEnglishPossessive property: A value indicating whether to remove trailing "'s" for each subword.
     * Default is true.
     *
     * @return the stemEnglishPossessive value.
     */
    public Boolean isStemEnglishPossessive() {
        return this.stemEnglishPossessive;
    }

    /**
     * Set the stemEnglishPossessive property: A value indicating whether to remove trailing "'s" for each subword.
     * Default is true.
     *
     * @param stemEnglishPossessive the stemEnglishPossessive value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setStemEnglishPossessive(Boolean stemEnglishPossessive) {
        this.stemEnglishPossessive = stemEnglishPossessive;
        return this;
    }

    /**
     * Get the protectedWords property: A list of tokens to protect from being delimited.
     *
     * @return the protectedWords value.
     */
    public List<String> getProtectedWords() {
        return this.protectedWords;
    }

    /**
     * Set the protectedWords property: A list of tokens to protect from being delimited.
     *
     * @param protectedWords the protectedWords value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setProtectedWords(List<String> protectedWords) {
        this.protectedWords = protectedWords;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeBooleanField("generateWordParts", this.generateWordParts);
        jsonWriter.writeBooleanField("generateNumberParts", this.generateNumberParts);
        jsonWriter.writeBooleanField("catenateWords", this.wordsCatenated);
        jsonWriter.writeBooleanField("catenateNumbers", this.numbersCatenated);
        jsonWriter.writeBooleanField("catenateAll", this.catenateAll);
        jsonWriter.writeBooleanField("splitOnCaseChange", this.splitOnCaseChange);
        jsonWriter.writeBooleanField("preserveOriginal", this.preserveOriginal);
        jsonWriter.writeBooleanField("splitOnNumerics", this.splitOnNumerics);
        jsonWriter.writeBooleanField("stemEnglishPossessive", this.stemEnglishPossessive);
        jsonWriter.writeArrayField(
                "protectedWords", this.protectedWords, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WordDelimiterTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of WordDelimiterTokenFilter if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the WordDelimiterTokenFilter.
     */
    public static WordDelimiterTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    Boolean generateWordParts = null;
                    Boolean generateNumberParts = null;
                    Boolean wordsCatenated = null;
                    Boolean numbersCatenated = null;
                    Boolean catenateAll = null;
                    Boolean splitOnCaseChange = null;
                    Boolean preserveOriginal = null;
                    Boolean splitOnNumerics = null;
                    Boolean stemEnglishPossessive = null;
                    List<String> protectedWords = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("generateWordParts".equals(fieldName)) {
                            generateWordParts = reader.getNullable(JsonReader::getBoolean);
                        } else if ("generateNumberParts".equals(fieldName)) {
                            generateNumberParts = reader.getNullable(JsonReader::getBoolean);
                        } else if ("catenateWords".equals(fieldName)) {
                            wordsCatenated = reader.getNullable(JsonReader::getBoolean);
                        } else if ("catenateNumbers".equals(fieldName)) {
                            numbersCatenated = reader.getNullable(JsonReader::getBoolean);
                        } else if ("catenateAll".equals(fieldName)) {
                            catenateAll = reader.getNullable(JsonReader::getBoolean);
                        } else if ("splitOnCaseChange".equals(fieldName)) {
                            splitOnCaseChange = reader.getNullable(JsonReader::getBoolean);
                        } else if ("preserveOriginal".equals(fieldName)) {
                            preserveOriginal = reader.getNullable(JsonReader::getBoolean);
                        } else if ("splitOnNumerics".equals(fieldName)) {
                            splitOnNumerics = reader.getNullable(JsonReader::getBoolean);
                        } else if ("stemEnglishPossessive".equals(fieldName)) {
                            stemEnglishPossessive = reader.getNullable(JsonReader::getBoolean);
                        } else if ("protectedWords".equals(fieldName)) {
                            protectedWords = reader.readArray(reader1 -> reader1.getString());
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        WordDelimiterTokenFilter deserializedWordDelimiterTokenFilter =
                                new WordDelimiterTokenFilter(name);
                        deserializedWordDelimiterTokenFilter.generateWordParts = generateWordParts;
                        deserializedWordDelimiterTokenFilter.generateNumberParts = generateNumberParts;
                        deserializedWordDelimiterTokenFilter.wordsCatenated = wordsCatenated;
                        deserializedWordDelimiterTokenFilter.numbersCatenated = numbersCatenated;
                        deserializedWordDelimiterTokenFilter.catenateAll = catenateAll;
                        deserializedWordDelimiterTokenFilter.splitOnCaseChange = splitOnCaseChange;
                        deserializedWordDelimiterTokenFilter.preserveOriginal = preserveOriginal;
                        deserializedWordDelimiterTokenFilter.splitOnNumerics = splitOnNumerics;
                        deserializedWordDelimiterTokenFilter.stemEnglishPossessive = stemEnglishPossessive;
                        deserializedWordDelimiterTokenFilter.protectedWords = protectedWords;

                        return deserializedWordDelimiterTokenFilter;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }

    /**
     * Set the protectedWords property: A list of tokens to protect from being delimited.
     *
     * @param protectedWords the protectedWords value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setProtectedWords(String... protectedWords) {
        this.protectedWords = (protectedWords == null) ? null : java.util.Arrays.asList(protectedWords);
        return this;
    }
}
