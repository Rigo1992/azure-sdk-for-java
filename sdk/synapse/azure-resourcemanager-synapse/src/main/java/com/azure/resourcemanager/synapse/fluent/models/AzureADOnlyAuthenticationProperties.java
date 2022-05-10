// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.models.StateValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of a active directory only authentication. */
@Fluent
public final class AzureADOnlyAuthenticationProperties {
    /*
     * Azure Active Directory only Authentication enabled.
     */
    @JsonProperty(value = "azureADOnlyAuthentication", required = true)
    private boolean azureADOnlyAuthentication;

    /*
     * property configuration state
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private StateValue state;

    /*
     * property configuration date
     */
    @JsonProperty(value = "creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /**
     * Get the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @return the azureADOnlyAuthentication value.
     */
    public boolean azureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }

    /**
     * Set the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @param azureADOnlyAuthentication the azureADOnlyAuthentication value to set.
     * @return the AzureADOnlyAuthenticationProperties object itself.
     */
    public AzureADOnlyAuthenticationProperties withAzureADOnlyAuthentication(boolean azureADOnlyAuthentication) {
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        return this;
    }

    /**
     * Get the state property: property configuration state.
     *
     * @return the state value.
     */
    public StateValue state() {
        return this.state;
    }

    /**
     * Get the creationDate property: property configuration date.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
