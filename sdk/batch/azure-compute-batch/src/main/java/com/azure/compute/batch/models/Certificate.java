// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A Certificate that can be installed on Compute Nodes and can be used to authenticate operations on the machine. */
@Fluent
public final class Certificate {
    /*
     * The X.509 thumbprint of the Certificate. This is a sequence of up to 40 hex
     * digits.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * The algorithm used to derive the thumbprint.
     */
    @JsonProperty(value = "thumbprintAlgorithm")
    private String thumbprintAlgorithm;

    /*
     * The URL of the Certificate.
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * The state of the Certificate.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateState state;

    /*
     * The time at which the Certificate entered its current state.
     */
    @JsonProperty(value = "stateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime stateTransitionTime;

    /*
     * This property is not set if the Certificate is in its initial active state.
     */
    @JsonProperty(value = "previousState", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateState previousState;

    /*
     * This property is not set if the Certificate is in its initial Active state.
     */
    @JsonProperty(value = "previousStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime previousStateTransitionTime;

    /*
     * The public part of the Certificate as a base-64 encoded .cer file.
     */
    @JsonProperty(value = "publicData", access = JsonProperty.Access.WRITE_ONLY)
    private String publicData;

    /*
     * This property is set only if the Certificate is in the DeleteFailed state.
     */
    @JsonProperty(value = "deleteCertificateError", access = JsonProperty.Access.WRITE_ONLY)
    private DeleteCertificateError deleteCertificateError;

    /*
     * The base64-encoded contents of the Certificate. The maximum size is 10KB.
     */
    @JsonProperty(value = "data")
    private String data;

    /*
     * The format of the Certificate data.
     */
    @JsonProperty(value = "certificateFormat")
    private CertificateFormat certificateFormat;

    /*
     * This must be omitted if the Certificate format is cer.
     */
    @JsonProperty(value = "password")
    private String password;

    /** Creates an instance of Certificate class. */
    public Certificate() {}

    /**
     * Get the thumbprint property: The X.509 thumbprint of the Certificate. This is a sequence of up to 40 hex digits.
     *
     * @return the thumbprint value.
     */
    public String getThumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The X.509 thumbprint of the Certificate. This is a sequence of up to 40 hex digits.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the Certificate object itself.
     */
    public Certificate setThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the thumbprintAlgorithm property: The algorithm used to derive the thumbprint.
     *
     * @return the thumbprintAlgorithm value.
     */
    public String getThumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    /**
     * Set the thumbprintAlgorithm property: The algorithm used to derive the thumbprint.
     *
     * @param thumbprintAlgorithm the thumbprintAlgorithm value to set.
     * @return the Certificate object itself.
     */
    public Certificate setThumbprintAlgorithm(String thumbprintAlgorithm) {
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        return this;
    }

    /**
     * Get the url property: The URL of the Certificate.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the state property: The state of the Certificate.
     *
     * @return the state value.
     */
    public CertificateState getState() {
        return this.state;
    }

    /**
     * Get the stateTransitionTime property: The time at which the Certificate entered its current state.
     *
     * @return the stateTransitionTime value.
     */
    public OffsetDateTime getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Get the previousState property: This property is not set if the Certificate is in its initial active state.
     *
     * @return the previousState value.
     */
    public CertificateState getPreviousState() {
        return this.previousState;
    }

    /**
     * Get the previousStateTransitionTime property: This property is not set if the Certificate is in its initial
     * Active state.
     *
     * @return the previousStateTransitionTime value.
     */
    public OffsetDateTime getPreviousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Get the publicData property: The public part of the Certificate as a base-64 encoded .cer file.
     *
     * @return the publicData value.
     */
    public String getPublicData() {
        return this.publicData;
    }

    /**
     * Get the deleteCertificateError property: This property is set only if the Certificate is in the DeleteFailed
     * state.
     *
     * @return the deleteCertificateError value.
     */
    public DeleteCertificateError getDeleteCertificateError() {
        return this.deleteCertificateError;
    }

    /**
     * Get the data property: The base64-encoded contents of the Certificate. The maximum size is 10KB.
     *
     * @return the data value.
     */
    public String getData() {
        return this.data;
    }

    /**
     * Set the data property: The base64-encoded contents of the Certificate. The maximum size is 10KB.
     *
     * @param data the data value to set.
     * @return the Certificate object itself.
     */
    public Certificate setData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the certificateFormat property: The format of the Certificate data.
     *
     * @return the certificateFormat value.
     */
    public CertificateFormat getCertificateFormat() {
        return this.certificateFormat;
    }

    /**
     * Set the certificateFormat property: The format of the Certificate data.
     *
     * @param certificateFormat the certificateFormat value to set.
     * @return the Certificate object itself.
     */
    public Certificate setCertificateFormat(CertificateFormat certificateFormat) {
        this.certificateFormat = certificateFormat;
        return this;
    }

    /**
     * Get the password property: This must be omitted if the Certificate format is cer.
     *
     * @return the password value.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: This must be omitted if the Certificate format is cer.
     *
     * @param password the password value to set.
     * @return the Certificate object itself.
     */
    public Certificate setPassword(String password) {
        this.password = password;
        return this;
    }
}
