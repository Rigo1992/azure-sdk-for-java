// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The items in the current page of results. */
@Immutable
public final class DiscoTemplate {
    /*
     * The system generated unique id for the resource.
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The caller provided unique name for the resource.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The name that can be used for display purposes.
     */
    @Generated
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The name of the industry.
     */
    @Generated
    @JsonProperty(value = "industry")
    private String industry;

    /*
     * The name of the region.
     */
    @Generated
    @JsonProperty(value = "region")
    private String region;

    /*
     * The country code.
     */
    @Generated
    @JsonProperty(value = "countryCode")
    private String countryCode;

    /*
     * The state code.
     */
    @Generated
    @JsonProperty(value = "stateCode")
    private String stateCode;

    /*
     * The name of the city.
     */
    @Generated
    @JsonProperty(value = "city")
    private String city;

    /*
     * The list of disco template seeds.
     */
    @Generated
    @JsonProperty(value = "seeds")
    private List<DiscoSource> seeds;

    /*
     * The list of disco template names.
     */
    @Generated
    @JsonProperty(value = "names")
    private List<String> names;

    /** Creates an instance of DiscoTemplate class. */
    @Generated
    private DiscoTemplate() {}

    /**
     * Get the id property: The system generated unique id for the resource.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The caller provided unique name for the resource.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the displayName property: The name that can be used for display purposes.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the industry property: The name of the industry.
     *
     * @return the industry value.
     */
    @Generated
    public String getIndustry() {
        return this.industry;
    }

    /**
     * Get the region property: The name of the region.
     *
     * @return the region value.
     */
    @Generated
    public String getRegion() {
        return this.region;
    }

    /**
     * Get the countryCode property: The country code.
     *
     * @return the countryCode value.
     */
    @Generated
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Get the stateCode property: The state code.
     *
     * @return the stateCode value.
     */
    @Generated
    public String getStateCode() {
        return this.stateCode;
    }

    /**
     * Get the city property: The name of the city.
     *
     * @return the city value.
     */
    @Generated
    public String getCity() {
        return this.city;
    }

    /**
     * Get the seeds property: The list of disco template seeds.
     *
     * @return the seeds value.
     */
    @Generated
    public List<DiscoSource> getSeeds() {
        return this.seeds;
    }

    /**
     * Get the names property: The list of disco template names.
     *
     * @return the names value.
     */
    @Generated
    public List<String> getNames() {
        return this.names;
    }
}
