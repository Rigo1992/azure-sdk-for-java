// Copyright (c) Microsoft Corporation. All rights reserved.
//// Licensed under the MIT License.

package com.azure.cosmos.models;

import com.azure.cosmos.implementation.ClientEncryptionKey;
import com.azure.cosmos.implementation.Resource;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Details of an encryption key for use with the Azure Cosmos DB service.
 */
public final class CosmosClientEncryptionKeyProperties {
    private ClientEncryptionKey clientEncryptionKey;

    /**
     * Initialize a ClientEncryptionKey object from json string.
     *
     * @param jsonNode the json node that represents the database clientEncryptionKey.
     */
    CosmosClientEncryptionKeyProperties(ObjectNode jsonNode) {
        this.clientEncryptionKey = new ClientEncryptionKey(jsonNode);
    }

    CosmosClientEncryptionKeyProperties(ClientEncryptionKey clientEncryptionKey) {
        this.clientEncryptionKey = clientEncryptionKey;
    }

    /**
     * Constructor.
     *
     * @param id Unique identifier for the client encryption key.
     * @param encryptionAlgorithm Encryption algorithm that will be used along with this client encryption key to encrypt/decrypt data.
     * @param wrappedDataEncryptionKey Wrapped (encrypted) form of the client encryption key.
     * @param encryptionKeyWrapMetadata Metadata used by the configured key wrapping provider in order to unwrap the key.
     */
    public CosmosClientEncryptionKeyProperties(String id,
                                        String encryptionAlgorithm,
                                        byte[] wrappedDataEncryptionKey,
                                        EncryptionKeyWrapMetadata encryptionKeyWrapMetadata) {
        this.clientEncryptionKey = new ClientEncryptionKey();
        this.clientEncryptionKey.setId(id);
        this.clientEncryptionKey.setEncryptionAlgorithm(encryptionAlgorithm);
        this.clientEncryptionKey.setWrappedDataEncryptionKey(wrappedDataEncryptionKey);
        this.clientEncryptionKey.setEncryptionKeyWrapMetadata(encryptionKeyWrapMetadata);
    }

    /**
     * Gets the  encryption algorithm that will be used along with this client encryption key to encrypt/decrypt data.
     * @return encryptionAlgorithm
     */
    public String getEncryptionAlgorithm() {
        return this.clientEncryptionKey.getEncryptionAlgorithm();
    }

    /**
     * Sets the  encryption algorithm that will be used along with this client encryption key to encrypt/decrypt data.
     * @param encryptionAlgorithm the  encryption algorithm that will be used along with this client encryption key to encrypt/decrypt data.
     * @return CosmosClientEncryptionKeyProperties
     */
    public CosmosClientEncryptionKeyProperties setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.clientEncryptionKey.setEncryptionAlgorithm(encryptionAlgorithm);
        return this;
    }

    /**
     * Gets the wrapped form of the client encryption key.
     * @return wrappedDataEncryptionKey
     */
    public byte[] getWrappedDataEncryptionKey() {
        return this.clientEncryptionKey.getWrappedDataEncryptionKey();
    }

    /**
     * Sets the wrapped form of the client encryption key.
     * @param wrappedDataEncryptionKey the wrapped form of the client encryption key.
     * @return CosmosClientEncryptionKeyProperties
     */
    public CosmosClientEncryptionKeyProperties setWrappedDataEncryptionKey(byte[] wrappedDataEncryptionKey) {
        this.clientEncryptionKey.setWrappedDataEncryptionKey(wrappedDataEncryptionKey);
        return this;
    }

    /**
     * Gets the metadata for the wrapping provider that can be used to unwrap the wrapped client encryption key.
     * @return encryptionKeyWrapMetadata
     */
    public EncryptionKeyWrapMetadata getEncryptionKeyWrapMetadata() {
        return this.clientEncryptionKey.getEncryptionKeyWrapMetadata();
    }

    /**
     * Sets the  metadata for the wrapping provider that can be used to unwrap the wrapped client encryption key.
     * @param encryptionKeyWrapMetadata the  metadata for the wrapping provider that can be used to unwrap the wrapped client encryption key.
     * @return CosmosClientEncryptionKeyProperties
     */
    public CosmosClientEncryptionKeyProperties setEncryptionKeyWrapMetadata(EncryptionKeyWrapMetadata encryptionKeyWrapMetadata) {
        this.clientEncryptionKey.setEncryptionKeyWrapMetadata(encryptionKeyWrapMetadata);
        return this;
    }

    /**
     * Gets the name of the resource.
     *
     * @return the name of the resource.
     */
    public String getId() {
        return this.clientEncryptionKey.getId();
    }

    /**
     * Sets the name of the resource.
     *
     * @param id the name of the resource.
     * @return the current instance of {@link CosmosContainerProperties}.
     */
    public CosmosClientEncryptionKeyProperties setId(String id) {
        this.clientEncryptionKey.setId(id);
        return this;
    }

    /**
     * Gets the ID associated with the resource.
     *
     * @return the ID associated with the resource.
     */
    String getResourceId() {
        return this.clientEncryptionKey.getResourceId();
    }

    /**
     * Get the last modified timestamp associated with the resource.
     * This is only relevant when getting response from the server.
     *
     * @return the timestamp.
     */
    public Instant getTimestamp() {
        return this.clientEncryptionKey.getTimestamp();
    }

    /**
     * Get the entity tag associated with the resource.
     * This is only relevant when getting response from the server.
     *
     * @return the e tag.
     */
    public String getETag() {
        return this.clientEncryptionKey.getETag();
    }

    Resource getResource() {
        return this.clientEncryptionKey;
    }

    ClientEncryptionKey getClientEncryptionKey() {
        return new ClientEncryptionKey(this.clientEncryptionKey.getPropertyBag());
    }

    static List<CosmosClientEncryptionKeyProperties> getClientEncryptionKeys(List<ClientEncryptionKey> results) {
        return results.stream().map(CosmosClientEncryptionKeyProperties::new).collect(Collectors.toList());
    }
}
