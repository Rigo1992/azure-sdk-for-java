// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The DependentResource model.
 */
@Immutable
public final class DependentResource {

    /*
     * The md5 property.
     */
    @Generated
    @JsonProperty(value = "md5")
    private String md5;

    /*
     * The responseBodySize property.
     */
    @Generated
    @JsonProperty(value = "responseBodySize")
    private Long responseBodySize;

    /*
     * The firstSeen property.
     */
    @Generated
    @JsonProperty(value = "firstSeen")
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    @JsonProperty(value = "lastSeen")
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    @JsonProperty(value = "count")
    private Long count;

    /*
     * The firstSeenCrawlGuid property.
     */
    @Generated
    @JsonProperty(value = "firstSeenCrawlGuid")
    private String firstSeenCrawlGuid;

    /*
     * The firstSeenPageGuid property.
     */
    @Generated
    @JsonProperty(value = "firstSeenPageGuid")
    private String firstSeenPageGuid;

    /*
     * The firstSeenResourceGuid property.
     */
    @Generated
    @JsonProperty(value = "firstSeenResourceGuid")
    private String firstSeenResourceGuid;

    /*
     * The lastSeenCrawlGuid property.
     */
    @Generated
    @JsonProperty(value = "lastSeenCrawlGuid")
    private String lastSeenCrawlGuid;

    /*
     * The lastSeenPageGuid property.
     */
    @Generated
    @JsonProperty(value = "lastSeenPageGuid")
    private String lastSeenPageGuid;

    /*
     * The lastSeenResourceGuid property.
     */
    @Generated
    @JsonProperty(value = "lastSeenResourceGuid")
    private String lastSeenResourceGuid;

    /*
     * The responseBodyMinhash property.
     */
    @Generated
    @JsonProperty(value = "responseBodyMinhash")
    private List<Integer> responseBodyMinhash;

    /*
     * The contentType property.
     */
    @Generated
    @JsonProperty(value = "contentType")
    private String contentType;

    /*
     * The sha256 property.
     */
    @Generated
    @JsonProperty(value = "sha256")
    private String sha256;

    /*
     * The sha384 property.
     */
    @Generated
    @JsonProperty(value = "sha384")
    private String sha384;

    /*
     * The sha512 property.
     */
    @Generated
    @JsonProperty(value = "sha512")
    private String sha512;

    /*
     * The url property.
     */
    @Generated
    @JsonProperty(value = "url")
    private String url;

    /*
     * The cached property.
     */
    @Generated
    @JsonProperty(value = "cached")
    private Boolean cached;

    /*
     * The sriChecks property.
     */
    @Generated
    @JsonProperty(value = "sriChecks")
    private List<SubResourceIntegrityCheck> sriChecks;

    /*
     * The host property.
     */
    @Generated
    @JsonProperty(value = "host")
    private String host;

    /*
     * The lastObservedViolation property.
     */
    @Generated
    @JsonProperty(value = "lastObservedViolation")
    private OffsetDateTime lastObservedViolation;

    /*
     * The lastObservedValidation property.
     */
    @Generated
    @JsonProperty(value = "lastObservedValidation")
    private OffsetDateTime lastObservedValidation;

    /*
     * The lastObservedActualSriHash property.
     */
    @Generated
    @JsonProperty(value = "lastObservedActualSriHash")
    private String lastObservedActualSriHash;

    /*
     * The lastObservedExpectedSriHash property.
     */
    @Generated
    @JsonProperty(value = "lastObservedExpectedSriHash")
    private String lastObservedExpectedSriHash;

    /**
     * Creates an instance of DependentResource class.
     */
    @Generated
    private DependentResource() {
    }

    /**
     * Get the md5 property: The md5 property.
     *
     * @return the md5 value.
     */
    @Generated
    public String getMd5() {
        return this.md5;
    }

    /**
     * Get the responseBodySize property: The responseBodySize property.
     *
     * @return the responseBodySize value.
     */
    @Generated
    public Long getResponseBodySize() {
        return this.responseBodySize;
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the firstSeenCrawlGuid property: The firstSeenCrawlGuid property.
     *
     * @return the firstSeenCrawlGuid value.
     */
    @Generated
    public String getFirstSeenCrawlGuid() {
        return this.firstSeenCrawlGuid;
    }

    /**
     * Get the firstSeenPageGuid property: The firstSeenPageGuid property.
     *
     * @return the firstSeenPageGuid value.
     */
    @Generated
    public String getFirstSeenPageGuid() {
        return this.firstSeenPageGuid;
    }

    /**
     * Get the firstSeenResourceGuid property: The firstSeenResourceGuid property.
     *
     * @return the firstSeenResourceGuid value.
     */
    @Generated
    public String getFirstSeenResourceGuid() {
        return this.firstSeenResourceGuid;
    }

    /**
     * Get the lastSeenCrawlGuid property: The lastSeenCrawlGuid property.
     *
     * @return the lastSeenCrawlGuid value.
     */
    @Generated
    public String getLastSeenCrawlGuid() {
        return this.lastSeenCrawlGuid;
    }

    /**
     * Get the lastSeenPageGuid property: The lastSeenPageGuid property.
     *
     * @return the lastSeenPageGuid value.
     */
    @Generated
    public String getLastSeenPageGuid() {
        return this.lastSeenPageGuid;
    }

    /**
     * Get the lastSeenResourceGuid property: The lastSeenResourceGuid property.
     *
     * @return the lastSeenResourceGuid value.
     */
    @Generated
    public String getLastSeenResourceGuid() {
        return this.lastSeenResourceGuid;
    }

    /**
     * Get the responseBodyMinhash property: The responseBodyMinhash property.
     *
     * @return the responseBodyMinhash value.
     */
    @Generated
    public List<Integer> getResponseBodyMinhash() {
        return this.responseBodyMinhash;
    }

    /**
     * Get the contentType property: The contentType property.
     *
     * @return the contentType value.
     */
    @Generated
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Get the sha256 property: The sha256 property.
     *
     * @return the sha256 value.
     */
    @Generated
    public String getSha256() {
        return this.sha256;
    }

    /**
     * Get the sha384 property: The sha384 property.
     *
     * @return the sha384 value.
     */
    @Generated
    public String getSha384() {
        return this.sha384;
    }

    /**
     * Get the sha512 property: The sha512 property.
     *
     * @return the sha512 value.
     */
    @Generated
    public String getSha512() {
        return this.sha512;
    }

    /**
     * Get the url property: The url property.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the cached property: The cached property.
     *
     * @return the cached value.
     */
    @Generated
    public Boolean isCached() {
        return this.cached;
    }

    /**
     * Get the sriChecks property: The sriChecks property.
     *
     * @return the sriChecks value.
     */
    @Generated
    public List<SubResourceIntegrityCheck> getSriChecks() {
        return this.sriChecks;
    }

    /**
     * Get the host property: The host property.
     *
     * @return the host value.
     */
    @Generated
    public String getHost() {
        return this.host;
    }

    /**
     * Get the lastObservedViolation property: The lastObservedViolation property.
     *
     * @return the lastObservedViolation value.
     */
    @Generated
    public OffsetDateTime getLastObservedViolation() {
        return this.lastObservedViolation;
    }

    /**
     * Get the lastObservedValidation property: The lastObservedValidation property.
     *
     * @return the lastObservedValidation value.
     */
    @Generated
    public OffsetDateTime getLastObservedValidation() {
        return this.lastObservedValidation;
    }

    /**
     * Get the lastObservedActualSriHash property: The lastObservedActualSriHash property.
     *
     * @return the lastObservedActualSriHash value.
     */
    @Generated
    public String getLastObservedActualSriHash() {
        return this.lastObservedActualSriHash;
    }

    /**
     * Get the lastObservedExpectedSriHash property: The lastObservedExpectedSriHash property.
     *
     * @return the lastObservedExpectedSriHash value.
     */
    @Generated
    public String getLastObservedExpectedSriHash() {
        return this.lastObservedExpectedSriHash;
    }
}
