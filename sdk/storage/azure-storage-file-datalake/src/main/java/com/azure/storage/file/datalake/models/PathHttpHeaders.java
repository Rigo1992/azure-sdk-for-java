// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** Parameter group. */
@JacksonXmlRootElement(localName = "PathHttpHeaders")
@Fluent
public final class PathHttpHeaders {
    /*
     * Optional. Sets the blob's cache control. If specified, this property is
     * stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "cacheControl")
    private String cacheControl;

    /*
     * Optional. Sets the blob's content encoding. If specified, this property
     * is stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "contentEncoding")
    private String contentEncoding;

    /*
     * Optional. Set the blob's content language. If specified, this property
     * is stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "contentLanguage")
    private String contentLanguage;

    /*
     * Optional. Sets the blob's Content-Disposition header.
     */
    @JsonProperty(value = "contentDisposition")
    private String contentDisposition;

    /*
     * Optional. Sets the blob's content type. If specified, this property is
     * stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /*
     * Specify the transactional md5 for the body, to be validated by the
     * service.
     */
    @JsonProperty(value = "contentMd5")
    private byte[] contentMd5;

    /*
     * Specify the transactional md5 for the body, to be validated by the
     * service.
     */
    @JsonProperty(value = "transactionalContentHash")
    private byte[] transactionalContentHash;

    /**
     * Get the cacheControl property: Optional. Sets the blob's cache control. If specified, this property is stored
     * with the blob and returned with a read request.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: Optional. Sets the blob's cache control. If specified, this property is stored
     * with the blob and returned with a read request.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the PathHttpHeaders object itself.
     */
    public PathHttpHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the contentEncoding property: Optional. Sets the blob's content encoding. If specified, this property is
     * stored with the blob and returned with a read request.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: Optional. Sets the blob's content encoding. If specified, this property is
     * stored with the blob and returned with a read request.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the PathHttpHeaders object itself.
     */
    public PathHttpHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the contentLanguage property: Optional. Set the blob's content language. If specified, this property is
     * stored with the blob and returned with a read request.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: Optional. Set the blob's content language. If specified, this property is
     * stored with the blob and returned with a read request.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the PathHttpHeaders object itself.
     */
    public PathHttpHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the contentDisposition property: Optional. Sets the blob's Content-Disposition header.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: Optional. Sets the blob's Content-Disposition header.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the PathHttpHeaders object itself.
     */
    public PathHttpHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentType property: Optional. Sets the blob's content type. If specified, this property is stored with
     * the blob and returned with a read request.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: Optional. Sets the blob's content type. If specified, this property is stored with
     * the blob and returned with a read request.
     *
     * @param contentType the contentType value to set.
     * @return the PathHttpHeaders object itself.
     */
    public PathHttpHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentMd5 property: Specify the transactional md5 for the body, to be validated by the service.
     *
     * @return the contentMd5 value.
     */
    public byte[] getContentMd5() {
        return CoreUtils.clone(this.contentMd5);
    }

    /**
     * Set the contentMd5 property: Specify the transactional md5 for the body, to be validated by the service.
     *
     * @param contentMd5 the contentMd5 value to set.
     * @return the PathHttpHeaders object itself.
     */
    public PathHttpHeaders setContentMd5(byte[] contentMd5) {
        this.contentMd5 = CoreUtils.clone(contentMd5);
        return this;
    }

    /**
     * Get the transactionalContentHash property: Specify the transactional md5 for the body, to be validated by the
     * service.
     *
     * @return the transactionalContentHash value.
     */
    public byte[] getTransactionalContentHash() {
        return CoreUtils.clone(this.transactionalContentHash);
    }

    /**
     * Set the transactionalContentHash property: Specify the transactional md5 for the body, to be validated by the
     * service.
     *
     * @param transactionalContentHash the transactionalContentHash value to set.
     * @return the PathHttpHeaders object itself.
     */
    public PathHttpHeaders setTransactionalContentHash(byte[] transactionalContentHash) {
        this.transactionalContentHash = CoreUtils.clone(transactionalContentHash);
        return this;
    }
}
