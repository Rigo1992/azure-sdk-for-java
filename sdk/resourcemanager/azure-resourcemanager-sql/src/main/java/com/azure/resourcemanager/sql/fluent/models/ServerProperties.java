// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.ExternalGovernanceStatus;
import com.azure.resourcemanager.sql.models.ServerExternalAdministrator;
import com.azure.resourcemanager.sql.models.ServerNetworkAccessFlag;
import com.azure.resourcemanager.sql.models.ServerPrivateEndpointConnection;
import com.azure.resourcemanager.sql.models.ServerPublicNetworkAccessFlag;
import com.azure.resourcemanager.sql.models.ServerWorkspaceFeature;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The properties of a server. */
@Fluent
public final class ServerProperties {
    /*
     * Administrator username for the server. Once created it cannot be changed.
     */
    @JsonProperty(value = "administratorLogin")
    private String administratorLogin;

    /*
     * The administrator login password (required for server creation).
     */
    @JsonProperty(value = "administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * The version of the server.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The state of the server.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * The fully qualified domain name of the server.
     */
    @JsonProperty(value = "fullyQualifiedDomainName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullyQualifiedDomainName;

    /*
     * List of private endpoint connections on a server
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServerPrivateEndpointConnection> privateEndpointConnections;

    /*
     * Minimal TLS version. Allowed values: 'None', '1.0', '1.1', '1.2'
     */
    @JsonProperty(value = "minimalTlsVersion")
    private String minimalTlsVersion;

    /*
     * Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be
     * 'Enabled' or 'Disabled' or 'SecuredByPerimeter'
     */
    @JsonProperty(value = "publicNetworkAccess")
    private ServerPublicNetworkAccessFlag publicNetworkAccess;

    /*
     * Whether or not existing server has a workspace created and if it allows connection from workspace
     */
    @JsonProperty(value = "workspaceFeature", access = JsonProperty.Access.WRITE_ONLY)
    private ServerWorkspaceFeature workspaceFeature;

    /*
     * The resource id of a user assigned identity to be used by default.
     */
    @JsonProperty(value = "primaryUserAssignedIdentityId")
    private String primaryUserAssignedIdentityId;

    /*
     * The Client id used for cross tenant CMK scenario
     */
    @JsonProperty(value = "federatedClientId")
    private UUID federatedClientId;

    /*
     * A CMK URI of the key to use for encryption.
     */
    @JsonProperty(value = "keyId")
    private String keyId;

    /*
     * The Azure Active Directory administrator of the server. This can only be used at server create time. If used for
     * server update, it will be ignored or it will result in an error. For updates individual APIs will need to be
     * used.
     */
    @JsonProperty(value = "administrators")
    private ServerExternalAdministrator administrators;

    /*
     * Whether or not to restrict outbound network access for this server.  Value is optional but if passed in, must be
     * 'Enabled' or 'Disabled'
     */
    @JsonProperty(value = "restrictOutboundNetworkAccess")
    private ServerNetworkAccessFlag restrictOutboundNetworkAccess;

    /*
     * Status of external governance.
     */
    @JsonProperty(value = "externalGovernanceStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ExternalGovernanceStatus externalGovernanceStatus;

    /** Creates an instance of ServerProperties class. */
    public ServerProperties() {
    }

    /**
     * Get the administratorLogin property: Administrator username for the server. Once created it cannot be changed.
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: Administrator username for the server. Once created it cannot be changed.
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The administrator login password (required for server creation).
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The administrator login password (required for server creation).
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the version property: The version of the server.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of the server.
     *
     * @param version the version value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the state property: The state of the server.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the fullyQualifiedDomainName property: The fully qualified domain name of the server.
     *
     * @return the fullyQualifiedDomainName value.
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections on a server.
     *
     * @return the privateEndpointConnections value.
     */
    public List<ServerPrivateEndpointConnection> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the minimalTlsVersion property: Minimal TLS version. Allowed values: 'None', '1.0', '1.1', '1.2'.
     *
     * @return the minimalTlsVersion value.
     */
    public String minimalTlsVersion() {
        return this.minimalTlsVersion;
    }

    /**
     * Set the minimalTlsVersion property: Minimal TLS version. Allowed values: 'None', '1.0', '1.1', '1.2'.
     *
     * @param minimalTlsVersion the minimalTlsVersion value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withMinimalTlsVersion(String minimalTlsVersion) {
        this.minimalTlsVersion = minimalTlsVersion;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public endpoint access is allowed for this server. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled' or 'SecuredByPerimeter'.
     *
     * @return the publicNetworkAccess value.
     */
    public ServerPublicNetworkAccessFlag publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public endpoint access is allowed for this server. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled' or 'SecuredByPerimeter'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withPublicNetworkAccess(ServerPublicNetworkAccessFlag publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the workspaceFeature property: Whether or not existing server has a workspace created and if it allows
     * connection from workspace.
     *
     * @return the workspaceFeature value.
     */
    public ServerWorkspaceFeature workspaceFeature() {
        return this.workspaceFeature;
    }

    /**
     * Get the primaryUserAssignedIdentityId property: The resource id of a user assigned identity to be used by
     * default.
     *
     * @return the primaryUserAssignedIdentityId value.
     */
    public String primaryUserAssignedIdentityId() {
        return this.primaryUserAssignedIdentityId;
    }

    /**
     * Set the primaryUserAssignedIdentityId property: The resource id of a user assigned identity to be used by
     * default.
     *
     * @param primaryUserAssignedIdentityId the primaryUserAssignedIdentityId value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withPrimaryUserAssignedIdentityId(String primaryUserAssignedIdentityId) {
        this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
        return this;
    }

    /**
     * Get the federatedClientId property: The Client id used for cross tenant CMK scenario.
     *
     * @return the federatedClientId value.
     */
    public UUID federatedClientId() {
        return this.federatedClientId;
    }

    /**
     * Set the federatedClientId property: The Client id used for cross tenant CMK scenario.
     *
     * @param federatedClientId the federatedClientId value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withFederatedClientId(UUID federatedClientId) {
        this.federatedClientId = federatedClientId;
        return this;
    }

    /**
     * Get the keyId property: A CMK URI of the key to use for encryption.
     *
     * @return the keyId value.
     */
    public String keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId property: A CMK URI of the key to use for encryption.
     *
     * @param keyId the keyId value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the administrators property: The Azure Active Directory administrator of the server. This can only be used at
     * server create time. If used for server update, it will be ignored or it will result in an error. For updates
     * individual APIs will need to be used.
     *
     * @return the administrators value.
     */
    public ServerExternalAdministrator administrators() {
        return this.administrators;
    }

    /**
     * Set the administrators property: The Azure Active Directory administrator of the server. This can only be used at
     * server create time. If used for server update, it will be ignored or it will result in an error. For updates
     * individual APIs will need to be used.
     *
     * @param administrators the administrators value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAdministrators(ServerExternalAdministrator administrators) {
        this.administrators = administrators;
        return this;
    }

    /**
     * Get the restrictOutboundNetworkAccess property: Whether or not to restrict outbound network access for this
     * server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @return the restrictOutboundNetworkAccess value.
     */
    public ServerNetworkAccessFlag restrictOutboundNetworkAccess() {
        return this.restrictOutboundNetworkAccess;
    }

    /**
     * Set the restrictOutboundNetworkAccess property: Whether or not to restrict outbound network access for this
     * server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @param restrictOutboundNetworkAccess the restrictOutboundNetworkAccess value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withRestrictOutboundNetworkAccess(ServerNetworkAccessFlag restrictOutboundNetworkAccess) {
        this.restrictOutboundNetworkAccess = restrictOutboundNetworkAccess;
        return this;
    }

    /**
     * Get the externalGovernanceStatus property: Status of external governance.
     *
     * @return the externalGovernanceStatus value.
     */
    public ExternalGovernanceStatus externalGovernanceStatus() {
        return this.externalGovernanceStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (administrators() != null) {
            administrators().validate();
        }
    }
}
