// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Currency and amount that customer will be charged in customer's local currency. Tax is not included. */
@Fluent
public final class CalculatePriceResponsePropertiesBillingCurrencyTotal {
    /*
     * The ISO 4217 3-letter currency code for the currency used by this purchase record.
     */
    @JsonProperty(value = "currencyCode")
    private String currencyCode;

    /*
     * Amount in pricing currency. Tax is not included.
     */
    @JsonProperty(value = "amount")
    private Double amount;

    /** Creates an instance of CalculatePriceResponsePropertiesBillingCurrencyTotal class. */
    public CalculatePriceResponsePropertiesBillingCurrencyTotal() {
    }

    /**
     * Get the currencyCode property: The ISO 4217 3-letter currency code for the currency used by this purchase record.
     *
     * @return the currencyCode value.
     */
    public String currencyCode() {
        return this.currencyCode;
    }

    /**
     * Set the currencyCode property: The ISO 4217 3-letter currency code for the currency used by this purchase record.
     *
     * @param currencyCode the currencyCode value to set.
     * @return the CalculatePriceResponsePropertiesBillingCurrencyTotal object itself.
     */
    public CalculatePriceResponsePropertiesBillingCurrencyTotal withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Get the amount property: Amount in pricing currency. Tax is not included.
     *
     * @return the amount value.
     */
    public Double amount() {
        return this.amount;
    }

    /**
     * Set the amount property: Amount in pricing currency. Tax is not included.
     *
     * @param amount the amount value to set.
     * @return the CalculatePriceResponsePropertiesBillingCurrencyTotal object itself.
     */
    public CalculatePriceResponsePropertiesBillingCurrencyTotal withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
