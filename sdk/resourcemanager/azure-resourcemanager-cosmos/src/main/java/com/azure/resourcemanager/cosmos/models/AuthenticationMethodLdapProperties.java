// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Ldap authentication method properties. This feature is in preview.
 */
@Fluent
public final class AuthenticationMethodLdapProperties {
    /*
     * Hostname of the LDAP server.
     */
    @JsonProperty(value = "serverHostname")
    private String serverHostname;

    /*
     * Port of the LDAP server.
     */
    @JsonProperty(value = "serverPort")
    private Integer serverPort;

    /*
     * Distinguished name of the look up user account, who can look up user details on authentication.
     */
    @JsonProperty(value = "serviceUserDistinguishedName")
    private String serviceUserDistinguishedName;

    /*
     * Password of the look up user.
     */
    @JsonProperty(value = "serviceUserPassword")
    private String serviceUserPassword;

    /*
     * Distinguished name of the object to start the recursive search of users from.
     */
    @JsonProperty(value = "searchBaseDistinguishedName")
    private String searchBaseDistinguishedName;

    /*
     * Template to use for searching. Defaults to (cn=%s) where %s will be replaced by the username used to login.
     */
    @JsonProperty(value = "searchFilterTemplate")
    private String searchFilterTemplate;

    /*
     * The serverCertificates property.
     */
    @JsonProperty(value = "serverCertificates")
    private List<Certificate> serverCertificates;

    /*
     * Timeout for connecting to the LDAP server in miliseconds. The default is 5000 ms.
     */
    @JsonProperty(value = "connectionTimeoutInMs")
    private Integer connectionTimeoutInMs;

    /**
     * Creates an instance of AuthenticationMethodLdapProperties class.
     */
    public AuthenticationMethodLdapProperties() {
    }

    /**
     * Get the serverHostname property: Hostname of the LDAP server.
     * 
     * @return the serverHostname value.
     */
    public String serverHostname() {
        return this.serverHostname;
    }

    /**
     * Set the serverHostname property: Hostname of the LDAP server.
     * 
     * @param serverHostname the serverHostname value to set.
     * @return the AuthenticationMethodLdapProperties object itself.
     */
    public AuthenticationMethodLdapProperties withServerHostname(String serverHostname) {
        this.serverHostname = serverHostname;
        return this;
    }

    /**
     * Get the serverPort property: Port of the LDAP server.
     * 
     * @return the serverPort value.
     */
    public Integer serverPort() {
        return this.serverPort;
    }

    /**
     * Set the serverPort property: Port of the LDAP server.
     * 
     * @param serverPort the serverPort value to set.
     * @return the AuthenticationMethodLdapProperties object itself.
     */
    public AuthenticationMethodLdapProperties withServerPort(Integer serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    /**
     * Get the serviceUserDistinguishedName property: Distinguished name of the look up user account, who can look up
     * user details on authentication.
     * 
     * @return the serviceUserDistinguishedName value.
     */
    public String serviceUserDistinguishedName() {
        return this.serviceUserDistinguishedName;
    }

    /**
     * Set the serviceUserDistinguishedName property: Distinguished name of the look up user account, who can look up
     * user details on authentication.
     * 
     * @param serviceUserDistinguishedName the serviceUserDistinguishedName value to set.
     * @return the AuthenticationMethodLdapProperties object itself.
     */
    public AuthenticationMethodLdapProperties withServiceUserDistinguishedName(String serviceUserDistinguishedName) {
        this.serviceUserDistinguishedName = serviceUserDistinguishedName;
        return this;
    }

    /**
     * Get the serviceUserPassword property: Password of the look up user.
     * 
     * @return the serviceUserPassword value.
     */
    public String serviceUserPassword() {
        return this.serviceUserPassword;
    }

    /**
     * Set the serviceUserPassword property: Password of the look up user.
     * 
     * @param serviceUserPassword the serviceUserPassword value to set.
     * @return the AuthenticationMethodLdapProperties object itself.
     */
    public AuthenticationMethodLdapProperties withServiceUserPassword(String serviceUserPassword) {
        this.serviceUserPassword = serviceUserPassword;
        return this;
    }

    /**
     * Get the searchBaseDistinguishedName property: Distinguished name of the object to start the recursive search of
     * users from.
     * 
     * @return the searchBaseDistinguishedName value.
     */
    public String searchBaseDistinguishedName() {
        return this.searchBaseDistinguishedName;
    }

    /**
     * Set the searchBaseDistinguishedName property: Distinguished name of the object to start the recursive search of
     * users from.
     * 
     * @param searchBaseDistinguishedName the searchBaseDistinguishedName value to set.
     * @return the AuthenticationMethodLdapProperties object itself.
     */
    public AuthenticationMethodLdapProperties withSearchBaseDistinguishedName(String searchBaseDistinguishedName) {
        this.searchBaseDistinguishedName = searchBaseDistinguishedName;
        return this;
    }

    /**
     * Get the searchFilterTemplate property: Template to use for searching. Defaults to (cn=%s) where %s will be
     * replaced by the username used to login.
     * 
     * @return the searchFilterTemplate value.
     */
    public String searchFilterTemplate() {
        return this.searchFilterTemplate;
    }

    /**
     * Set the searchFilterTemplate property: Template to use for searching. Defaults to (cn=%s) where %s will be
     * replaced by the username used to login.
     * 
     * @param searchFilterTemplate the searchFilterTemplate value to set.
     * @return the AuthenticationMethodLdapProperties object itself.
     */
    public AuthenticationMethodLdapProperties withSearchFilterTemplate(String searchFilterTemplate) {
        this.searchFilterTemplate = searchFilterTemplate;
        return this;
    }

    /**
     * Get the serverCertificates property: The serverCertificates property.
     * 
     * @return the serverCertificates value.
     */
    public List<Certificate> serverCertificates() {
        return this.serverCertificates;
    }

    /**
     * Set the serverCertificates property: The serverCertificates property.
     * 
     * @param serverCertificates the serverCertificates value to set.
     * @return the AuthenticationMethodLdapProperties object itself.
     */
    public AuthenticationMethodLdapProperties withServerCertificates(List<Certificate> serverCertificates) {
        this.serverCertificates = serverCertificates;
        return this;
    }

    /**
     * Get the connectionTimeoutInMs property: Timeout for connecting to the LDAP server in miliseconds. The default is
     * 5000 ms.
     * 
     * @return the connectionTimeoutInMs value.
     */
    public Integer connectionTimeoutInMs() {
        return this.connectionTimeoutInMs;
    }

    /**
     * Set the connectionTimeoutInMs property: Timeout for connecting to the LDAP server in miliseconds. The default is
     * 5000 ms.
     * 
     * @param connectionTimeoutInMs the connectionTimeoutInMs value to set.
     * @return the AuthenticationMethodLdapProperties object itself.
     */
    public AuthenticationMethodLdapProperties withConnectionTimeoutInMs(Integer connectionTimeoutInMs) {
        this.connectionTimeoutInMs = connectionTimeoutInMs;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serverCertificates() != null) {
            serverCertificates().forEach(e -> e.validate());
        }
    }
}
