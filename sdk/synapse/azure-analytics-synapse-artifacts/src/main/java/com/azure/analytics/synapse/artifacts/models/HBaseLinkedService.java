// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** HBase server linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HBase")
@JsonFlatten
@Fluent
public class HBaseLinkedService extends LinkedService {
    /*
     * The IP address or host name of the HBase server. (i.e. 192.168.222.160)
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /*
     * The TCP port that the HBase instance uses to listen for client
     * connections. The default value is 9090.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * The partial URL corresponding to the HBase server. (i.e.
     * /gateway/sandbox/hbase/version)
     */
    @JsonProperty(value = "typeProperties.httpPath")
    private Object httpPath;

    /*
     * The authentication mechanism to use to connect to the HBase server.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private HBaseAuthenticationType authenticationType;

    /*
     * The user name used to connect to the HBase instance.
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * The password corresponding to the user name.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * Specifies whether the connections to the server are encrypted using SSL.
     * The default value is false.
     */
    @JsonProperty(value = "typeProperties.enableSsl")
    private Object enableSsl;

    /*
     * The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be
     * set when using SSL on self-hosted IR. The default value is the
     * cacerts.pem file installed with the IR.
     */
    @JsonProperty(value = "typeProperties.trustedCertPath")
    private Object trustedCertPath;

    /*
     * Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value
     * is false.
     */
    @JsonProperty(value = "typeProperties.allowHostNameCNMismatch")
    private Object allowHostNameCNMismatch;

    /*
     * Specifies whether to allow self-signed certificates from the server. The
     * default value is false.
     */
    @JsonProperty(value = "typeProperties.allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the host property: The IP address or host name of the HBase server. (i.e. 192.168.222.160).
     *
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: The IP address or host name of the HBase server. (i.e. 192.168.222.160).
     *
     * @param host the host value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port that the HBase instance uses to listen for client connections. The default
     * value is 9090.
     *
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port that the HBase instance uses to listen for client connections. The default
     * value is 9090.
     *
     * @param port the port value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the httpPath property: The partial URL corresponding to the HBase server. (i.e.
     * /gateway/sandbox/hbase/version).
     *
     * @return the httpPath value.
     */
    public Object getHttpPath() {
        return this.httpPath;
    }

    /**
     * Set the httpPath property: The partial URL corresponding to the HBase server. (i.e.
     * /gateway/sandbox/hbase/version).
     *
     * @param httpPath the httpPath value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setHttpPath(Object httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication mechanism to use to connect to the HBase server.
     *
     * @return the authenticationType value.
     */
    public HBaseAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication mechanism to use to connect to the HBase server.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setAuthenticationType(HBaseAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: The user name used to connect to the HBase instance.
     *
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The user name used to connect to the HBase instance.
     *
     * @param username the username value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name.
     *
     * @param password the password value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     *
     * @return the enableSsl value.
     */
    public Object getEnableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     *
     * @param enableSsl the enableSsl value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value.
     */
    public Object getTrustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the allowHostNameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     *
     * @return the allowHostNameCNMismatch value.
     */
    public Object getAllowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch;
    }

    /**
     * Set the allowHostNameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     *
     * @param allowHostNameCNMismatch the allowHostNameCNMismatch value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setAllowHostNameCNMismatch(Object allowHostNameCNMismatch) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     *
     * @return the allowSelfSignedServerCert value.
     */
    public Object getAllowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
