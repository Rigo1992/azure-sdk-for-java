// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Web activity authentication properties. */
@Fluent
public final class WebActivityAuthentication {
    /*
     * Web activity authentication (Basic/ClientCertificate/MSI)
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * Base64-encoded contents of a PFX file.
     */
    @JsonProperty(value = "pfx")
    private SecretBase pfx;

    /*
     * Web activity authentication user name for basic authentication.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * Password for the PFX file or basic authentication.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * Resource for which Azure Auth token will be requested when using MSI Authentication.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /** Creates an instance of WebActivityAuthentication class. */
    public WebActivityAuthentication() {}

    /**
     * Get the type property: Web activity authentication (Basic/ClientCertificate/MSI).
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Web activity authentication (Basic/ClientCertificate/MSI).
     *
     * @param type the type value to set.
     * @return the WebActivityAuthentication object itself.
     */
    public WebActivityAuthentication setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the pfx property: Base64-encoded contents of a PFX file.
     *
     * @return the pfx value.
     */
    public SecretBase getPfx() {
        return this.pfx;
    }

    /**
     * Set the pfx property: Base64-encoded contents of a PFX file.
     *
     * @param pfx the pfx value to set.
     * @return the WebActivityAuthentication object itself.
     */
    public WebActivityAuthentication setPfx(SecretBase pfx) {
        this.pfx = pfx;
        return this;
    }

    /**
     * Get the username property: Web activity authentication user name for basic authentication.
     *
     * @return the username value.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Set the username property: Web activity authentication user name for basic authentication.
     *
     * @param username the username value to set.
     * @return the WebActivityAuthentication object itself.
     */
    public WebActivityAuthentication setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for the PFX file or basic authentication.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password for the PFX file or basic authentication.
     *
     * @param password the password value to set.
     * @return the WebActivityAuthentication object itself.
     */
    public WebActivityAuthentication setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the resource property: Resource for which Azure Auth token will be requested when using MSI Authentication.
     *
     * @return the resource value.
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource for which Azure Auth token will be requested when using MSI Authentication.
     *
     * @param resource the resource value to set.
     * @return the WebActivityAuthentication object itself.
     */
    public WebActivityAuthentication setResource(String resource) {
        this.resource = resource;
        return this;
    }
}
