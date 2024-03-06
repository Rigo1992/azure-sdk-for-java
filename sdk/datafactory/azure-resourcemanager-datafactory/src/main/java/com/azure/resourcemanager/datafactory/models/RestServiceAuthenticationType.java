// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of authentication used to connect to the REST service.
 */
public final class RestServiceAuthenticationType extends ExpandableStringEnum<RestServiceAuthenticationType> {
    /**
     * Static value Anonymous for RestServiceAuthenticationType.
     */
    public static final RestServiceAuthenticationType ANONYMOUS = fromString("Anonymous");

    /**
     * Static value Basic for RestServiceAuthenticationType.
     */
    public static final RestServiceAuthenticationType BASIC = fromString("Basic");

    /**
     * Static value AadServicePrincipal for RestServiceAuthenticationType.
     */
    public static final RestServiceAuthenticationType AAD_SERVICE_PRINCIPAL = fromString("AadServicePrincipal");

    /**
     * Static value ManagedServiceIdentity for RestServiceAuthenticationType.
     */
    public static final RestServiceAuthenticationType MANAGED_SERVICE_IDENTITY = fromString("ManagedServiceIdentity");

    /**
     * Static value OAuth2ClientCredential for RestServiceAuthenticationType.
     */
    public static final RestServiceAuthenticationType OAUTH2CLIENT_CREDENTIAL = fromString("OAuth2ClientCredential");

    /**
     * Creates a new instance of RestServiceAuthenticationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RestServiceAuthenticationType() {
    }

    /**
     * Creates or finds a RestServiceAuthenticationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RestServiceAuthenticationType.
     */
    @JsonCreator
    public static RestServiceAuthenticationType fromString(String name) {
        return fromString(name, RestServiceAuthenticationType.class);
    }

    /**
     * Gets known RestServiceAuthenticationType values.
     * 
     * @return known RestServiceAuthenticationType values.
     */
    public static Collection<RestServiceAuthenticationType> values() {
        return values(RestServiceAuthenticationType.class);
    }
}
