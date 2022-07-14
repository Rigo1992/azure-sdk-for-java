// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/** Represents a search index definition, which describes the fields and search behavior of an index. */
@Fluent
public final class SearchIndex implements JsonSerializable<SearchIndex> {
    /*
     * The name of the index.
     */
    private final String name;

    /*
     * The fields of the index.
     */
    private List<SearchField> fields;

    /*
     * The scoring profiles for the index.
     */
    private List<ScoringProfile> scoringProfiles;

    /*
     * The name of the scoring profile to use if none is specified in the query. If this property is not set and no
     * scoring profile is specified in the query, then default scoring (tf-idf) will be used.
     */
    private String defaultScoringProfile;

    /*
     * Options to control Cross-Origin Resource Sharing (CORS) for the index.
     */
    private CorsOptions corsOptions;

    /*
     * The suggesters for the index.
     */
    private List<SearchSuggester> suggesters;

    /*
     * The analyzers for the index.
     */
    private List<LexicalAnalyzer> analyzers;

    /*
     * The tokenizers for the index.
     */
    private List<LexicalTokenizer> tokenizers;

    /*
     * The token filters for the index.
     */
    private List<TokenFilter> tokenFilters;

    /*
     * The character filters for the index.
     */
    private List<CharFilter> charFilters;

    /*
     * The normalizers for the index.
     */
    private List<LexicalNormalizer> normalizers;

    /*
     * A description of an encryption key that you create in Azure Key Vault. This key is used to provide an additional
     * level of encryption-at-rest for your data when you want full assurance that no one, not even Microsoft, can
     * decrypt your data in Azure Cognitive Search. Once you have encrypted your data, it will always remain encrypted.
     * Azure Cognitive Search will ignore attempts to set this property to null. You can change this property as needed
     * if you want to rotate your encryption key; Your data will be unaffected. Encryption with customer-managed keys
     * is not available for free search services, and is only available for paid services created on or after January
     * 1, 2019.
     */
    private SearchResourceEncryptionKey encryptionKey;

    /*
     * The type of similarity algorithm to be used when scoring and ranking the documents matching a search query. The
     * similarity algorithm can only be defined at index creation time and cannot be modified on existing indexes. If
     * null, the ClassicSimilarity algorithm is used.
     */
    private SimilarityAlgorithm similarity;

    /*
     * Defines parameters for a search index that influence semantic capabilities.
     */
    private SemanticSettings semanticSettings;

    /*
     * The ETag of the index.
     */
    private String eTag;

    /**
     * Creates an instance of SearchIndex class.
     *
     * @param name the name value to set.
     */
    public SearchIndex(String name) {
        this.name = name;
    }

    /**
     * Constructor of {@link SearchIndex}.
     *
     * @param name The name of the index.
     * @param fields The fields of the index.
     */
    public SearchIndex(String name, List<SearchField> fields) {
        this.name = name;
        this.fields = fields;
    }

    /**
     * Get the name property: The name of the index.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the fields property: The fields of the index.
     *
     * @return the fields value.
     */
    public List<SearchField> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: The fields of the index.
     *
     * @param fields the fields value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setFields(List<SearchField> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get the scoringProfiles property: The scoring profiles for the index.
     *
     * @return the scoringProfiles value.
     */
    public List<ScoringProfile> getScoringProfiles() {
        return this.scoringProfiles;
    }

    /**
     * Set the scoringProfiles property: The scoring profiles for the index.
     *
     * @param scoringProfiles the scoringProfiles value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setScoringProfiles(List<ScoringProfile> scoringProfiles) {
        this.scoringProfiles = scoringProfiles;
        return this;
    }

    /**
     * Get the defaultScoringProfile property: The name of the scoring profile to use if none is specified in the query.
     * If this property is not set and no scoring profile is specified in the query, then default scoring (tf-idf) will
     * be used.
     *
     * @return the defaultScoringProfile value.
     */
    public String getDefaultScoringProfile() {
        return this.defaultScoringProfile;
    }

    /**
     * Set the defaultScoringProfile property: The name of the scoring profile to use if none is specified in the query.
     * If this property is not set and no scoring profile is specified in the query, then default scoring (tf-idf) will
     * be used.
     *
     * @param defaultScoringProfile the defaultScoringProfile value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setDefaultScoringProfile(String defaultScoringProfile) {
        this.defaultScoringProfile = defaultScoringProfile;
        return this;
    }

    /**
     * Get the corsOptions property: Options to control Cross-Origin Resource Sharing (CORS) for the index.
     *
     * @return the corsOptions value.
     */
    public CorsOptions getCorsOptions() {
        return this.corsOptions;
    }

    /**
     * Set the corsOptions property: Options to control Cross-Origin Resource Sharing (CORS) for the index.
     *
     * @param corsOptions the corsOptions value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setCorsOptions(CorsOptions corsOptions) {
        this.corsOptions = corsOptions;
        return this;
    }

    /**
     * Get the suggesters property: The suggesters for the index.
     *
     * @return the suggesters value.
     */
    public List<SearchSuggester> getSuggesters() {
        return this.suggesters;
    }

    /**
     * Set the suggesters property: The suggesters for the index.
     *
     * @param suggesters the suggesters value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setSuggesters(List<SearchSuggester> suggesters) {
        this.suggesters = suggesters;
        return this;
    }

    /**
     * Get the analyzers property: The analyzers for the index.
     *
     * @return the analyzers value.
     */
    public List<LexicalAnalyzer> getAnalyzers() {
        return this.analyzers;
    }

    /**
     * Set the analyzers property: The analyzers for the index.
     *
     * @param analyzers the analyzers value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setAnalyzers(List<LexicalAnalyzer> analyzers) {
        this.analyzers = analyzers;
        return this;
    }

    /**
     * Get the tokenizers property: The tokenizers for the index.
     *
     * @return the tokenizers value.
     */
    public List<LexicalTokenizer> getTokenizers() {
        return this.tokenizers;
    }

    /**
     * Set the tokenizers property: The tokenizers for the index.
     *
     * @param tokenizers the tokenizers value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setTokenizers(List<LexicalTokenizer> tokenizers) {
        this.tokenizers = tokenizers;
        return this;
    }

    /**
     * Get the tokenFilters property: The token filters for the index.
     *
     * @return the tokenFilters value.
     */
    public List<TokenFilter> getTokenFilters() {
        return this.tokenFilters;
    }

    /**
     * Set the tokenFilters property: The token filters for the index.
     *
     * @param tokenFilters the tokenFilters value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setTokenFilters(List<TokenFilter> tokenFilters) {
        this.tokenFilters = tokenFilters;
        return this;
    }

    /**
     * Get the charFilters property: The character filters for the index.
     *
     * @return the charFilters value.
     */
    public List<CharFilter> getCharFilters() {
        return this.charFilters;
    }

    /**
     * Set the charFilters property: The character filters for the index.
     *
     * @param charFilters the charFilters value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setCharFilters(List<CharFilter> charFilters) {
        this.charFilters = charFilters;
        return this;
    }

    /**
     * Get the normalizers property: The normalizers for the index.
     *
     * @return the normalizers value.
     */
    public List<LexicalNormalizer> getNormalizers() {
        return this.normalizers;
    }

    /**
     * Set the normalizers property: The normalizers for the index.
     *
     * @param normalizers the normalizers value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setNormalizers(List<LexicalNormalizer> normalizers) {
        this.normalizers = normalizers;
        return this;
    }

    /**
     * Get the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your data when you want full assurance that no
     * one, not even Microsoft, can decrypt your data in Azure Cognitive Search. Once you have encrypted your data, it
     * will always remain encrypted. Azure Cognitive Search will ignore attempts to set this property to null. You can
     * change this property as needed if you want to rotate your encryption key; Your data will be unaffected.
     * Encryption with customer-managed keys is not available for free search services, and is only available for paid
     * services created on or after January 1, 2019.
     *
     * @return the encryptionKey value.
     */
    public SearchResourceEncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your data when you want full assurance that no
     * one, not even Microsoft, can decrypt your data in Azure Cognitive Search. Once you have encrypted your data, it
     * will always remain encrypted. Azure Cognitive Search will ignore attempts to set this property to null. You can
     * change this property as needed if you want to rotate your encryption key; Your data will be unaffected.
     * Encryption with customer-managed keys is not available for free search services, and is only available for paid
     * services created on or after January 1, 2019.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setEncryptionKey(SearchResourceEncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * Get the similarity property: The type of similarity algorithm to be used when scoring and ranking the documents
     * matching a search query. The similarity algorithm can only be defined at index creation time and cannot be
     * modified on existing indexes. If null, the ClassicSimilarity algorithm is used.
     *
     * @return the similarity value.
     */
    public SimilarityAlgorithm getSimilarity() {
        return this.similarity;
    }

    /**
     * Set the similarity property: The type of similarity algorithm to be used when scoring and ranking the documents
     * matching a search query. The similarity algorithm can only be defined at index creation time and cannot be
     * modified on existing indexes. If null, the ClassicSimilarity algorithm is used.
     *
     * @param similarity the similarity value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setSimilarity(SimilarityAlgorithm similarity) {
        this.similarity = similarity;
        return this;
    }

    /**
     * Get the semanticSettings property: Defines parameters for a search index that influence semantic capabilities.
     *
     * @return the semanticSettings value.
     */
    public SemanticSettings getSemanticSettings() {
        return this.semanticSettings;
    }

    /**
     * Set the semanticSettings property: Defines parameters for a search index that influence semantic capabilities.
     *
     * @param semanticSettings the semanticSettings value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setSemanticSettings(SemanticSettings semanticSettings) {
        this.semanticSettings = semanticSettings;
        return this;
    }

    /**
     * Get the eTag property: The ETag of the index.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag of the index.
     *
     * @param eTag the eTag value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name, false);
        jsonWriter.writeArrayField("fields", this.fields, false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField(
                "scoringProfiles", this.scoringProfiles, false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("defaultScoringProfile", this.defaultScoringProfile, false);
        jsonWriter.writeJsonField("corsOptions", this.corsOptions, false);
        jsonWriter.writeArrayField(
                "suggesters", this.suggesters, false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("analyzers", this.analyzers, false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField(
                "tokenizers", this.tokenizers, false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField(
                "tokenFilters", this.tokenFilters, false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField(
                "charFilters", this.charFilters, false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField(
                "normalizers", this.normalizers, false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("encryptionKey", this.encryptionKey, false);
        jsonWriter.writeJsonField("similarity", this.similarity, false);
        jsonWriter.writeJsonField("semantic", this.semanticSettings, false);
        jsonWriter.writeStringField("@odata.etag", this.eTag, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of SearchIndex from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndex if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static SearchIndex fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    List<SearchField> fields = null;
                    List<ScoringProfile> scoringProfiles = null;
                    String defaultScoringProfile = null;
                    CorsOptions corsOptions = null;
                    List<SearchSuggester> suggesters = null;
                    List<LexicalAnalyzer> analyzers = null;
                    List<LexicalTokenizer> tokenizers = null;
                    List<TokenFilter> tokenFilters = null;
                    List<CharFilter> charFilters = null;
                    List<LexicalNormalizer> normalizers = null;
                    SearchResourceEncryptionKey encryptionKey = null;
                    SimilarityAlgorithm similarity = null;
                    SemanticSettings semanticSettings = null;
                    String eTag = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                            nameFound = true;
                        } else if ("fields".equals(fieldName)) {
                            fields = reader.readArray(reader1 -> SearchField.fromJson(reader1));
                        } else if ("scoringProfiles".equals(fieldName)) {
                            scoringProfiles = reader.readArray(reader1 -> ScoringProfile.fromJson(reader1));
                        } else if ("defaultScoringProfile".equals(fieldName)) {
                            defaultScoringProfile = reader.getStringValue();
                        } else if ("corsOptions".equals(fieldName)) {
                            corsOptions = CorsOptions.fromJson(reader);
                        } else if ("suggesters".equals(fieldName)) {
                            suggesters = reader.readArray(reader1 -> SearchSuggester.fromJson(reader1));
                        } else if ("analyzers".equals(fieldName)) {
                            analyzers = reader.readArray(reader1 -> LexicalAnalyzer.fromJson(reader1));
                        } else if ("tokenizers".equals(fieldName)) {
                            tokenizers = reader.readArray(reader1 -> LexicalTokenizer.fromJson(reader1));
                        } else if ("tokenFilters".equals(fieldName)) {
                            tokenFilters = reader.readArray(reader1 -> TokenFilter.fromJson(reader1));
                        } else if ("charFilters".equals(fieldName)) {
                            charFilters = reader.readArray(reader1 -> CharFilter.fromJson(reader1));
                        } else if ("normalizers".equals(fieldName)) {
                            normalizers = reader.readArray(reader1 -> LexicalNormalizer.fromJson(reader1));
                        } else if ("encryptionKey".equals(fieldName)) {
                            encryptionKey = SearchResourceEncryptionKey.fromJson(reader);
                        } else if ("similarity".equals(fieldName)) {
                            similarity = SimilarityAlgorithm.fromJson(reader);
                        } else if ("semantic".equals(fieldName)) {
                            semanticSettings = SemanticSettings.fromJson(reader);
                        } else if ("@odata.etag".equals(fieldName)) {
                            eTag = reader.getStringValue();
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    SearchIndex deserializedValue = new SearchIndex(name);
                    deserializedValue.fields = fields;
                    deserializedValue.scoringProfiles = scoringProfiles;
                    deserializedValue.defaultScoringProfile = defaultScoringProfile;
                    deserializedValue.corsOptions = corsOptions;
                    deserializedValue.suggesters = suggesters;
                    deserializedValue.analyzers = analyzers;
                    deserializedValue.tokenizers = tokenizers;
                    deserializedValue.tokenFilters = tokenFilters;
                    deserializedValue.charFilters = charFilters;
                    deserializedValue.normalizers = normalizers;
                    deserializedValue.encryptionKey = encryptionKey;
                    deserializedValue.similarity = similarity;
                    deserializedValue.semanticSettings = semanticSettings;
                    deserializedValue.eTag = eTag;

                    return deserializedValue;
                });
    }

    /**
     * Set the fields property: The fields of the index.
     *
     * @param fields the fields value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setFields(SearchField... fields) {
        this.fields = (fields == null) ? null : java.util.Arrays.asList(fields);
        return this;
    }

    /**
     * Set the scoringProfiles property: The scoring profiles for the index.
     *
     * @param scoringProfiles the scoringProfiles value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setScoringProfiles(ScoringProfile... scoringProfiles) {
        this.scoringProfiles = (scoringProfiles == null) ? null : java.util.Arrays.asList(scoringProfiles);
        return this;
    }

    /**
     * Set the suggesters property: The suggesters for the index.
     *
     * @param suggesters the suggesters value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setSuggesters(SearchSuggester... suggesters) {
        this.suggesters = (suggesters == null) ? null : java.util.Arrays.asList(suggesters);
        return this;
    }

    /**
     * Set the analyzers property: The analyzers for the index.
     *
     * @param analyzers the analyzers value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setAnalyzers(LexicalAnalyzer... analyzers) {
        this.analyzers = (analyzers == null) ? null : java.util.Arrays.asList(analyzers);
        return this;
    }

    /**
     * Set the tokenizers property: The tokenizers for the index.
     *
     * @param tokenizers the tokenizers value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setTokenizers(LexicalTokenizer... tokenizers) {
        this.tokenizers = (tokenizers == null) ? null : java.util.Arrays.asList(tokenizers);
        return this;
    }

    /**
     * Set the tokenFilters property: The token filters for the index.
     *
     * @param tokenFilters the tokenFilters value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setTokenFilters(TokenFilter... tokenFilters) {
        this.tokenFilters = (tokenFilters == null) ? null : java.util.Arrays.asList(tokenFilters);
        return this;
    }

    /**
     * Set the charFilters property: The character filters for the index.
     *
     * @param charFilters the charFilters value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setCharFilters(CharFilter... charFilters) {
        this.charFilters = (charFilters == null) ? null : java.util.Arrays.asList(charFilters);
        return this;
    }

    /**
     * Set the normalizers property: The normalizers for the index.
     *
     * @param normalizers the normalizers value to set.
     * @return the SearchIndex object itself.
     */
    public SearchIndex setNormalizers(LexicalNormalizer... normalizers) {
        this.normalizers = (normalizers == null) ? null : java.util.Arrays.asList(normalizers);
        return this;
    }
}
