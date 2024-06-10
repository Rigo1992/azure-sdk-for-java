// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

/**
 * The parameters to list service SAS credentials of a specific resource.
 */
@Fluent
public final class ServiceSasParameters {
    /*
     * The canonical path to the signed resource.
     */
    @JsonProperty(value = "canonicalizedResource", required = true)
    private String canonicalizedResource;

    /*
     * The signed services accessible with the service SAS. Possible values include: Blob (b), Container (c), File (f), Share (s).
     */
    @JsonProperty(value = "signedResource")
    private SignedResource resource;

    /*
     * The signed permissions for the service SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
     */
    @JsonProperty(value = "signedPermission")
    private Permissions permissions;

    /*
     * An IP address or a range of IP addresses from which to accept requests.
     */
    @JsonProperty(value = "signedIp")
    private String ipAddressOrRange;

    /*
     * The protocol permitted for a request made with the account SAS.
     */
    @JsonProperty(value = "signedProtocol")
    private HttpProtocol protocols;

    /*
     * The time at which the SAS becomes valid.
     */
    @JsonProperty(value = "signedStart")
    private OffsetDateTime sharedAccessStartTime;

    /*
     * The time at which the shared access signature becomes invalid.
     */
    @JsonProperty(value = "signedExpiry")
    private OffsetDateTime sharedAccessExpiryTime;

    /*
     * A unique value up to 64 characters in length that correlates to an access policy specified for the container, queue, or table.
     */
    @JsonProperty(value = "signedIdentifier")
    private String identifier;

    /*
     * The start of partition key.
     */
    @JsonProperty(value = "startPk")
    private String partitionKeyStart;

    /*
     * The end of partition key.
     */
    @JsonProperty(value = "endPk")
    private String partitionKeyEnd;

    /*
     * The start of row key.
     */
    @JsonProperty(value = "startRk")
    private String rowKeyStart;

    /*
     * The end of row key.
     */
    @JsonProperty(value = "endRk")
    private String rowKeyEnd;

    /*
     * The key to sign the account SAS token with.
     */
    @JsonProperty(value = "keyToSign")
    private String keyToSign;

    /*
     * The response header override for cache control.
     */
    @JsonProperty(value = "rscc")
    private String cacheControl;

    /*
     * The response header override for content disposition.
     */
    @JsonProperty(value = "rscd")
    private String contentDisposition;

    /*
     * The response header override for content encoding.
     */
    @JsonProperty(value = "rsce")
    private String contentEncoding;

    /*
     * The response header override for content language.
     */
    @JsonProperty(value = "rscl")
    private String contentLanguage;

    /*
     * The response header override for content type.
     */
    @JsonProperty(value = "rsct")
    private String contentType;

    /**
     * Creates an instance of ServiceSasParameters class.
     */
    public ServiceSasParameters() {
    }

    /**
     * Get the canonicalizedResource property: The canonical path to the signed resource.
     *
     * @return the canonicalizedResource value.
     */
    public String canonicalizedResource() {
        return this.canonicalizedResource;
    }

    /**
     * Set the canonicalizedResource property: The canonical path to the signed resource.
     *
     * @param canonicalizedResource the canonicalizedResource value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withCanonicalizedResource(String canonicalizedResource) {
        this.canonicalizedResource = canonicalizedResource;
        return this;
    }

    /**
     * Get the resource property: The signed services accessible with the service SAS. Possible values include: Blob
     * (b), Container (c), File (f), Share (s).
     *
     * @return the resource value.
     */
    public SignedResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The signed services accessible with the service SAS. Possible values include: Blob
     * (b), Container (c), File (f), Share (s).
     *
     * @param resource the resource value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withResource(SignedResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the permissions property: The signed permissions for the service SAS. Possible values include: Read (r),
     * Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
     *
     * @return the permissions value.
     */
    public Permissions permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The signed permissions for the service SAS. Possible values include: Read (r),
     * Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
     *
     * @param permissions the permissions value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withPermissions(Permissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the ipAddressOrRange property: An IP address or a range of IP addresses from which to accept requests.
     *
     * @return the ipAddressOrRange value.
     */
    public String ipAddressOrRange() {
        return this.ipAddressOrRange;
    }

    /**
     * Set the ipAddressOrRange property: An IP address or a range of IP addresses from which to accept requests.
     *
     * @param ipAddressOrRange the ipAddressOrRange value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withIpAddressOrRange(String ipAddressOrRange) {
        this.ipAddressOrRange = ipAddressOrRange;
        return this;
    }

    /**
     * Get the protocols property: The protocol permitted for a request made with the account SAS.
     *
     * @return the protocols value.
     */
    public HttpProtocol protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: The protocol permitted for a request made with the account SAS.
     *
     * @param protocols the protocols value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withProtocols(HttpProtocol protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the sharedAccessStartTime property: The time at which the SAS becomes valid.
     *
     * @return the sharedAccessStartTime value.
     */
    public OffsetDateTime sharedAccessStartTime() {
        return this.sharedAccessStartTime;
    }

    /**
     * Set the sharedAccessStartTime property: The time at which the SAS becomes valid.
     *
     * @param sharedAccessStartTime the sharedAccessStartTime value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withSharedAccessStartTime(OffsetDateTime sharedAccessStartTime) {
        this.sharedAccessStartTime = sharedAccessStartTime;
        return this;
    }

    /**
     * Get the sharedAccessExpiryTime property: The time at which the shared access signature becomes invalid.
     *
     * @return the sharedAccessExpiryTime value.
     */
    public OffsetDateTime sharedAccessExpiryTime() {
        return this.sharedAccessExpiryTime;
    }

    /**
     * Set the sharedAccessExpiryTime property: The time at which the shared access signature becomes invalid.
     *
     * @param sharedAccessExpiryTime the sharedAccessExpiryTime value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withSharedAccessExpiryTime(OffsetDateTime sharedAccessExpiryTime) {
        this.sharedAccessExpiryTime = sharedAccessExpiryTime;
        return this;
    }

    /**
     * Get the identifier property: A unique value up to 64 characters in length that correlates to an access policy
     * specified for the container, queue, or table.
     *
     * @return the identifier value.
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: A unique value up to 64 characters in length that correlates to an access policy
     * specified for the container, queue, or table.
     *
     * @param identifier the identifier value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the partitionKeyStart property: The start of partition key.
     *
     * @return the partitionKeyStart value.
     */
    public String partitionKeyStart() {
        return this.partitionKeyStart;
    }

    /**
     * Set the partitionKeyStart property: The start of partition key.
     *
     * @param partitionKeyStart the partitionKeyStart value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withPartitionKeyStart(String partitionKeyStart) {
        this.partitionKeyStart = partitionKeyStart;
        return this;
    }

    /**
     * Get the partitionKeyEnd property: The end of partition key.
     *
     * @return the partitionKeyEnd value.
     */
    public String partitionKeyEnd() {
        return this.partitionKeyEnd;
    }

    /**
     * Set the partitionKeyEnd property: The end of partition key.
     *
     * @param partitionKeyEnd the partitionKeyEnd value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withPartitionKeyEnd(String partitionKeyEnd) {
        this.partitionKeyEnd = partitionKeyEnd;
        return this;
    }

    /**
     * Get the rowKeyStart property: The start of row key.
     *
     * @return the rowKeyStart value.
     */
    public String rowKeyStart() {
        return this.rowKeyStart;
    }

    /**
     * Set the rowKeyStart property: The start of row key.
     *
     * @param rowKeyStart the rowKeyStart value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withRowKeyStart(String rowKeyStart) {
        this.rowKeyStart = rowKeyStart;
        return this;
    }

    /**
     * Get the rowKeyEnd property: The end of row key.
     *
     * @return the rowKeyEnd value.
     */
    public String rowKeyEnd() {
        return this.rowKeyEnd;
    }

    /**
     * Set the rowKeyEnd property: The end of row key.
     *
     * @param rowKeyEnd the rowKeyEnd value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withRowKeyEnd(String rowKeyEnd) {
        this.rowKeyEnd = rowKeyEnd;
        return this;
    }

    /**
     * Get the keyToSign property: The key to sign the account SAS token with.
     *
     * @return the keyToSign value.
     */
    public String keyToSign() {
        return this.keyToSign;
    }

    /**
     * Set the keyToSign property: The key to sign the account SAS token with.
     *
     * @param keyToSign the keyToSign value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withKeyToSign(String keyToSign) {
        this.keyToSign = keyToSign;
        return this;
    }

    /**
     * Get the cacheControl property: The response header override for cache control.
     *
     * @return the cacheControl value.
     */
    public String cacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: The response header override for cache control.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the contentDisposition property: The response header override for content disposition.
     *
     * @return the contentDisposition value.
     */
    public String contentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: The response header override for content disposition.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentEncoding property: The response header override for content encoding.
     *
     * @return the contentEncoding value.
     */
    public String contentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: The response header override for content encoding.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the contentLanguage property: The response header override for content language.
     *
     * @return the contentLanguage value.
     */
    public String contentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: The response header override for content language.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the contentType property: The response header override for content type.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The response header override for content type.
     *
     * @param contentType the contentType value to set.
     * @return the ServiceSasParameters object itself.
     */
    public ServiceSasParameters withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (canonicalizedResource() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property canonicalizedResource in model ServiceSasParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceSasParameters.class);
}
