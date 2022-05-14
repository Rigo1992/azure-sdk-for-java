// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** onPremisesProvisioningError. */
@Fluent
public final class MicrosoftGraphOnPremisesProvisioningError {
    /*
     * Category of the provisioning error. Note: Currently, there is only one
     * possible value. Possible value: PropertyConflict - indicates a property
     * value is not unique. Other objects contain the same value for the
     * property.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The date and time at which the error occurred.
     */
    @JsonProperty(value = "occurredDateTime")
    private OffsetDateTime occurredDateTime;

    /*
     * Name of the directory property causing the error. Current possible
     * values: UserPrincipalName or ProxyAddress
     */
    @JsonProperty(value = "propertyCausingError")
    private String propertyCausingError;

    /*
     * Value of the property causing the error.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * onPremisesProvisioningError
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the category property: Category of the provisioning error. Note: Currently, there is only one possible value.
     * Possible value: PropertyConflict - indicates a property value is not unique. Other objects contain the same value
     * for the property.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Category of the provisioning error. Note: Currently, there is only one possible value.
     * Possible value: PropertyConflict - indicates a property value is not unique. Other objects contain the same value
     * for the property.
     *
     * @param category the category value to set.
     * @return the MicrosoftGraphOnPremisesProvisioningError object itself.
     */
    public MicrosoftGraphOnPremisesProvisioningError withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the occurredDateTime property: The date and time at which the error occurred.
     *
     * @return the occurredDateTime value.
     */
    public OffsetDateTime occurredDateTime() {
        return this.occurredDateTime;
    }

    /**
     * Set the occurredDateTime property: The date and time at which the error occurred.
     *
     * @param occurredDateTime the occurredDateTime value to set.
     * @return the MicrosoftGraphOnPremisesProvisioningError object itself.
     */
    public MicrosoftGraphOnPremisesProvisioningError withOccurredDateTime(OffsetDateTime occurredDateTime) {
        this.occurredDateTime = occurredDateTime;
        return this;
    }

    /**
     * Get the propertyCausingError property: Name of the directory property causing the error. Current possible values:
     * UserPrincipalName or ProxyAddress.
     *
     * @return the propertyCausingError value.
     */
    public String propertyCausingError() {
        return this.propertyCausingError;
    }

    /**
     * Set the propertyCausingError property: Name of the directory property causing the error. Current possible values:
     * UserPrincipalName or ProxyAddress.
     *
     * @param propertyCausingError the propertyCausingError value to set.
     * @return the MicrosoftGraphOnPremisesProvisioningError object itself.
     */
    public MicrosoftGraphOnPremisesProvisioningError withPropertyCausingError(String propertyCausingError) {
        this.propertyCausingError = propertyCausingError;
        return this;
    }

    /**
     * Get the value property: Value of the property causing the error.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the property causing the error.
     *
     * @param value the value value to set.
     * @return the MicrosoftGraphOnPremisesProvisioningError object itself.
     */
    public MicrosoftGraphOnPremisesProvisioningError withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the additionalProperties property: onPremisesProvisioningError.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: onPremisesProvisioningError.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOnPremisesProvisioningError object itself.
     */
    public MicrosoftGraphOnPremisesProvisioningError withAdditionalProperties(
        Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
