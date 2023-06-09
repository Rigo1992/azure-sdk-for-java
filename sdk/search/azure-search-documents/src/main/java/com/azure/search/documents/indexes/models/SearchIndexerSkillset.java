// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/** A list of skills. */
@Fluent
public final class SearchIndexerSkillset {
    /*
     * The name of the skillset.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The description of the skillset.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A list of skills in the skillset.
     */
    @JsonProperty(value = "skills", required = true)
    private List<SearchIndexerSkill> skills;

    /*
     * Details about cognitive services to be used when running skills.
     */
    @JsonProperty(value = "cognitiveServices")
    private CognitiveServicesAccount cognitiveServicesAccount;

    /*
     * Definition of additional projections to azure blob, table, or files, of enriched data.
     */
    @JsonProperty(value = "knowledgeStore")
    private SearchIndexerKnowledgeStore knowledgeStore;

    /*
     * The ETag of the skillset.
     */
    @JsonProperty(value = "@odata.etag")
    private String eTag;

    /*
     * A description of an encryption key that you create in Azure Key Vault. This key is used to provide an additional
     * level of encryption-at-rest for your skillset definition when you want full assurance that no one, not even
     * Microsoft, can decrypt your skillset definition in Azure Cognitive Search. Once you have encrypted your skillset
     * definition, it will always remain encrypted. Azure Cognitive Search will ignore attempts to set this property to
     * null. You can change this property as needed if you want to rotate your encryption key; Your skillset definition
     * will be unaffected. Encryption with customer-managed keys is not available for free search services, and is only
     * available for paid services created on or after January 1, 2019.
     */
    @JsonProperty(value = "encryptionKey")
    private SearchResourceEncryptionKey encryptionKey;

    /**
     * Creates an instance of SearchIndexerSkillset class.
     *
     * @param name the name value to set.
     * @param skills the skills value to set.
     */
    @JsonCreator
    public SearchIndexerSkillset(
            @JsonProperty(value = "name") String name,
            @JsonProperty(value = "skills") List<SearchIndexerSkill> skills) {
        this.name = name;
        this.skills = skills;
    }

    /**
     * Creates an instance of SearchIndexerSkillset class.
     *
     * @param name the name value to set.
     */
    public SearchIndexerSkillset(String name) {
        this(name, null);
    }

    /**
     * Get the name property: The name of the skillset.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the description property: The description of the skillset.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the skillset.
     *
     * @param description the description value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the skills property: A list of skills in the skillset.
     *
     * @return the skills value.
     */
    public List<SearchIndexerSkill> getSkills() {
        return this.skills;
    }

    /**
     * Get the cognitiveServicesAccount property: Details about cognitive services to be used when running skills.
     *
     * @return the cognitiveServicesAccount value.
     */
    public CognitiveServicesAccount getCognitiveServicesAccount() {
        return this.cognitiveServicesAccount;
    }

    /**
     * Set the cognitiveServicesAccount property: Details about cognitive services to be used when running skills.
     *
     * @param cognitiveServicesAccount the cognitiveServicesAccount value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setCognitiveServicesAccount(CognitiveServicesAccount cognitiveServicesAccount) {
        this.cognitiveServicesAccount = cognitiveServicesAccount;
        return this;
    }

    /**
     * Get the knowledgeStore property: Definition of additional projections to azure blob, table, or files, of enriched
     * data.
     *
     * @return the knowledgeStore value.
     */
    public SearchIndexerKnowledgeStore getKnowledgeStore() {
        return this.knowledgeStore;
    }

    /**
     * Set the knowledgeStore property: Definition of additional projections to azure blob, table, or files, of enriched
     * data.
     *
     * @param knowledgeStore the knowledgeStore value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setKnowledgeStore(SearchIndexerKnowledgeStore knowledgeStore) {
        this.knowledgeStore = knowledgeStore;
        return this;
    }

    /**
     * Get the eTag property: The ETag of the skillset.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag of the skillset.
     *
     * @param eTag the eTag value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your skillset definition when you want full
     * assurance that no one, not even Microsoft, can decrypt your skillset definition in Azure Cognitive Search. Once
     * you have encrypted your skillset definition, it will always remain encrypted. Azure Cognitive Search will ignore
     * attempts to set this property to null. You can change this property as needed if you want to rotate your
     * encryption key; Your skillset definition will be unaffected. Encryption with customer-managed keys is not
     * available for free search services, and is only available for paid services created on or after January 1, 2019.
     *
     * @return the encryptionKey value.
     */
    public SearchResourceEncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your skillset definition when you want full
     * assurance that no one, not even Microsoft, can decrypt your skillset definition in Azure Cognitive Search. Once
     * you have encrypted your skillset definition, it will always remain encrypted. Azure Cognitive Search will ignore
     * attempts to set this property to null. You can change this property as needed if you want to rotate your
     * encryption key; Your skillset definition will be unaffected. Encryption with customer-managed keys is not
     * available for free search services, and is only available for paid services created on or after January 1, 2019.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setEncryptionKey(SearchResourceEncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * Sets the skills property: A list of skills in the skillset.
     *
     * @param skills the skills value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    @JsonSetter
    public SearchIndexerSkillset setSkills(List<SearchIndexerSkill> skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Sets the skills property: A list of skills in the skillset.
     *
     * @param skills the skills value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setSkills(SearchIndexerSkill... skills) {
        this.skills = (skills == null) ? null : java.util.Arrays.asList(skills);
        return this;
    }
}
