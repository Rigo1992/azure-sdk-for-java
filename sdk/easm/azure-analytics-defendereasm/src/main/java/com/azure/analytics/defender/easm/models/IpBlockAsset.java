// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The IpBlockAsset model. */
@Immutable
public final class IpBlockAsset extends InventoryAsset {
    /*
     * The ipBlock property.
     */
    @Generated
    @JsonProperty(value = "ipBlock")
    private String ipBlock;

    /*
     * The asns property.
     */
    @Generated
    @JsonProperty(value = "asns")
    private List<ObservedLong> asns;

    /*
     * The bgpPrefixes property.
     */
    @Generated
    @JsonProperty(value = "bgpPrefixes")
    private List<ObservedString> bgpPrefixes;

    /*
     * The netNames property.
     */
    @Generated
    @JsonProperty(value = "netNames")
    private List<ObservedString> netNames;

    /*
     * The registrantContacts property.
     */
    @Generated
    @JsonProperty(value = "registrantContacts")
    private List<ObservedString> registrantContacts;

    /*
     * The registrantOrgs property.
     */
    @Generated
    @JsonProperty(value = "registrantOrgs")
    private List<ObservedString> registrantOrgs;

    /*
     * The adminContacts property.
     */
    @Generated
    @JsonProperty(value = "adminContacts")
    private List<ObservedString> adminContacts;

    /*
     * The technicalContacts property.
     */
    @Generated
    @JsonProperty(value = "technicalContacts")
    private List<ObservedString> technicalContacts;

    /*
     * The registrarCreatedAt property.
     */
    @Generated
    @JsonProperty(value = "registrarCreatedAt")
    private List<ObservedLong> registrarCreatedAt;

    /*
     * The registrarUpdatedAt property.
     */
    @Generated
    @JsonProperty(value = "registrarUpdatedAt")
    private List<ObservedLong> registrarUpdatedAt;

    /*
     * The netRanges property.
     */
    @Generated
    @JsonProperty(value = "netRanges")
    private List<ObservedString> netRanges;

    /*
     * The startIp property.
     */
    @Generated
    @JsonProperty(value = "startIp")
    private String startIp;

    /*
     * The endIp property.
     */
    @Generated
    @JsonProperty(value = "endIp")
    private String endIp;

    /*
     * The reputations property.
     */
    @Generated
    @JsonProperty(value = "reputations")
    private List<Reputation> reputations;

    /*
     * The detailedFromWhoisAt property.
     */
    @Generated
    @JsonProperty(value = "detailedFromWhoisAt")
    private OffsetDateTime detailedFromWhoisAt;

    /*
     * The sources property.
     */
    @Generated
    @JsonProperty(value = "sources")
    private List<Source> sources;

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
     * The location property.
     */
    @Generated
    @JsonProperty(value = "location")
    private List<ObservedLocation> location;

    /*
     * The registrarExpiresAt property.
     */
    @Generated
    @JsonProperty(value = "registrarExpiresAt")
    private List<ObservedLong> registrarExpiresAt;

    /*
     * The registrantNames property.
     */
    @Generated
    @JsonProperty(value = "registrantNames")
    private List<ObservedString> registrantNames;

    /*
     * The adminNames property.
     */
    @Generated
    @JsonProperty(value = "adminNames")
    private List<ObservedString> adminNames;

    /*
     * The technicalNames property.
     */
    @Generated
    @JsonProperty(value = "technicalNames")
    private List<ObservedString> technicalNames;

    /*
     * The adminOrgs property.
     */
    @Generated
    @JsonProperty(value = "adminOrgs")
    private List<ObservedString> adminOrgs;

    /*
     * The technicalOrgs property.
     */
    @Generated
    @JsonProperty(value = "technicalOrgs")
    private List<ObservedString> technicalOrgs;

    /*
     * The registrantPhones property.
     */
    @Generated
    @JsonProperty(value = "registrantPhones")
    private List<ObservedString> registrantPhones;

    /*
     * The adminPhones property.
     */
    @Generated
    @JsonProperty(value = "adminPhones")
    private List<ObservedString> adminPhones;

    /*
     * The technicalPhones property.
     */
    @Generated
    @JsonProperty(value = "technicalPhones")
    private List<ObservedString> technicalPhones;

    /*
     * The ipv4 property.
     */
    @Generated
    @JsonProperty(value = "ipv4")
    private Boolean ipv4;

    /*
     * The ipv6 property.
     */
    @Generated
    @JsonProperty(value = "ipv6")
    private Boolean ipv6;

    /** Creates an instance of IpBlockAsset class. */
    @Generated
    private IpBlockAsset() {}

    /**
     * Get the ipBlock property: The ipBlock property.
     *
     * @return the ipBlock value.
     */
    @Generated
    public String getIpBlock() {
        return this.ipBlock;
    }

    /**
     * Get the asns property: The asns property.
     *
     * @return the asns value.
     */
    @Generated
    public List<ObservedLong> getAsns() {
        return this.asns;
    }

    /**
     * Get the bgpPrefixes property: The bgpPrefixes property.
     *
     * @return the bgpPrefixes value.
     */
    @Generated
    public List<ObservedString> getBgpPrefixes() {
        return this.bgpPrefixes;
    }

    /**
     * Get the netNames property: The netNames property.
     *
     * @return the netNames value.
     */
    @Generated
    public List<ObservedString> getNetNames() {
        return this.netNames;
    }

    /**
     * Get the registrantContacts property: The registrantContacts property.
     *
     * @return the registrantContacts value.
     */
    @Generated
    public List<ObservedString> getRegistrantContacts() {
        return this.registrantContacts;
    }

    /**
     * Get the registrantOrgs property: The registrantOrgs property.
     *
     * @return the registrantOrgs value.
     */
    @Generated
    public List<ObservedString> getRegistrantOrgs() {
        return this.registrantOrgs;
    }

    /**
     * Get the adminContacts property: The adminContacts property.
     *
     * @return the adminContacts value.
     */
    @Generated
    public List<ObservedString> getAdminContacts() {
        return this.adminContacts;
    }

    /**
     * Get the technicalContacts property: The technicalContacts property.
     *
     * @return the technicalContacts value.
     */
    @Generated
    public List<ObservedString> getTechnicalContacts() {
        return this.technicalContacts;
    }

    /**
     * Get the registrarCreatedAt property: The registrarCreatedAt property.
     *
     * @return the registrarCreatedAt value.
     */
    @Generated
    public List<ObservedLong> getRegistrarCreatedAt() {
        return this.registrarCreatedAt;
    }

    /**
     * Get the registrarUpdatedAt property: The registrarUpdatedAt property.
     *
     * @return the registrarUpdatedAt value.
     */
    @Generated
    public List<ObservedLong> getRegistrarUpdatedAt() {
        return this.registrarUpdatedAt;
    }

    /**
     * Get the netRanges property: The netRanges property.
     *
     * @return the netRanges value.
     */
    @Generated
    public List<ObservedString> getNetRanges() {
        return this.netRanges;
    }

    /**
     * Get the startIp property: The startIp property.
     *
     * @return the startIp value.
     */
    @Generated
    public String getStartIp() {
        return this.startIp;
    }

    /**
     * Get the endIp property: The endIp property.
     *
     * @return the endIp value.
     */
    @Generated
    public String getEndIp() {
        return this.endIp;
    }

    /**
     * Get the reputations property: The reputations property.
     *
     * @return the reputations value.
     */
    @Generated
    public List<Reputation> getReputations() {
        return this.reputations;
    }

    /**
     * Get the detailedFromWhoisAt property: The detailedFromWhoisAt property.
     *
     * @return the detailedFromWhoisAt value.
     */
    @Generated
    public OffsetDateTime getDetailedFromWhoisAt() {
        return this.detailedFromWhoisAt;
    }

    /**
     * Get the sources property: The sources property.
     *
     * @return the sources value.
     */
    @Generated
    public List<Source> getSources() {
        return this.sources;
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
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    @Generated
    public List<ObservedLocation> getLocation() {
        return this.location;
    }

    /**
     * Get the registrarExpiresAt property: The registrarExpiresAt property.
     *
     * @return the registrarExpiresAt value.
     */
    @Generated
    public List<ObservedLong> getRegistrarExpiresAt() {
        return this.registrarExpiresAt;
    }

    /**
     * Get the registrantNames property: The registrantNames property.
     *
     * @return the registrantNames value.
     */
    @Generated
    public List<ObservedString> getRegistrantNames() {
        return this.registrantNames;
    }

    /**
     * Get the adminNames property: The adminNames property.
     *
     * @return the adminNames value.
     */
    @Generated
    public List<ObservedString> getAdminNames() {
        return this.adminNames;
    }

    /**
     * Get the technicalNames property: The technicalNames property.
     *
     * @return the technicalNames value.
     */
    @Generated
    public List<ObservedString> getTechnicalNames() {
        return this.technicalNames;
    }

    /**
     * Get the adminOrgs property: The adminOrgs property.
     *
     * @return the adminOrgs value.
     */
    @Generated
    public List<ObservedString> getAdminOrgs() {
        return this.adminOrgs;
    }

    /**
     * Get the technicalOrgs property: The technicalOrgs property.
     *
     * @return the technicalOrgs value.
     */
    @Generated
    public List<ObservedString> getTechnicalOrgs() {
        return this.technicalOrgs;
    }

    /**
     * Get the registrantPhones property: The registrantPhones property.
     *
     * @return the registrantPhones value.
     */
    @Generated
    public List<ObservedString> getRegistrantPhones() {
        return this.registrantPhones;
    }

    /**
     * Get the adminPhones property: The adminPhones property.
     *
     * @return the adminPhones value.
     */
    @Generated
    public List<ObservedString> getAdminPhones() {
        return this.adminPhones;
    }

    /**
     * Get the technicalPhones property: The technicalPhones property.
     *
     * @return the technicalPhones value.
     */
    @Generated
    public List<ObservedString> getTechnicalPhones() {
        return this.technicalPhones;
    }

    /**
     * Get the ipv4 property: The ipv4 property.
     *
     * @return the ipv4 value.
     */
    @Generated
    public Boolean isIpv4() {
        return this.ipv4;
    }

    /**
     * Get the ipv6 property: The ipv6 property.
     *
     * @return the ipv6 value.
     */
    @Generated
    public Boolean isIpv6() {
        return this.ipv6;
    }
}
