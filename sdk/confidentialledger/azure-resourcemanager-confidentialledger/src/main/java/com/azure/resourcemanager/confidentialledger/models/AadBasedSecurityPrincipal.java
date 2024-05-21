// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AAD based security principal with associated Ledger RoleName.
 */
@Fluent
public final class AadBasedSecurityPrincipal {
    /*
     * UUID/GUID based Principal Id of the Security Principal
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * UUID/GUID based Tenant Id of the Security Principal
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * LedgerRole associated with the Security Principal of Ledger
     */
    @JsonProperty(value = "ledgerRoleName")
    private LedgerRoleName ledgerRoleName;

    /**
     * Creates an instance of AadBasedSecurityPrincipal class.
     */
    public AadBasedSecurityPrincipal() {
    }

    /**
     * Get the principalId property: UUID/GUID based Principal Id of the Security Principal.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: UUID/GUID based Principal Id of the Security Principal.
     * 
     * @param principalId the principalId value to set.
     * @return the AadBasedSecurityPrincipal object itself.
     */
    public AadBasedSecurityPrincipal withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the tenantId property: UUID/GUID based Tenant Id of the Security Principal.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: UUID/GUID based Tenant Id of the Security Principal.
     * 
     * @param tenantId the tenantId value to set.
     * @return the AadBasedSecurityPrincipal object itself.
     */
    public AadBasedSecurityPrincipal withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the ledgerRoleName property: LedgerRole associated with the Security Principal of Ledger.
     * 
     * @return the ledgerRoleName value.
     */
    public LedgerRoleName ledgerRoleName() {
        return this.ledgerRoleName;
    }

    /**
     * Set the ledgerRoleName property: LedgerRole associated with the Security Principal of Ledger.
     * 
     * @param ledgerRoleName the ledgerRoleName value to set.
     * @return the AadBasedSecurityPrincipal object itself.
     */
    public AadBasedSecurityPrincipal withLedgerRoleName(LedgerRoleName ledgerRoleName) {
        this.ledgerRoleName = ledgerRoleName;
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
