// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.security.attestation.implementation.PoliciesImpl;
import com.azure.security.attestation.models.AttestationType;
import com.azure.security.attestation.models.CloudErrorException;
import com.azure.security.attestation.models.PolicyResponse;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous AzureAttestationRestClient type. */
@ServiceClient(builder = AttestationClientBuilder.class, isAsync = true)
public final class PolicyAsyncClient {
    private final PoliciesImpl serviceClient;

    /**
     * Initializes an instance of Policies client.
     *
     * @param serviceClient the service client implementation.
     */
    PolicyAsyncClient(PoliciesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Retrieves the current policy for an attestation type.
     *
     * @param attestationType Specifies the trusted execution environment to be used to validate the evidence.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyResponse>> getWithResponse(AttestationType attestationType) {
        return this.serviceClient.getWithResponseAsync(attestationType)
            .map(response -> Utilities.generateResponseFromModelType(response, PolicyResponse.fromGenerated(response.getValue())));
    }

    /**
     * Retrieves the current policy for an attestation type.
     *
     * @param attestationType Specifies the trusted execution environment to be used to validate the evidence.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PolicyResponse> get(AttestationType attestationType) {
        return serviceClient.getAsync(attestationType)
            .map(PolicyResponse::fromGenerated);

    }

    /**
     * Sets the policy for a given attestation type.
     *
     * @param attestationType Specifies the trusted execution environment to be used to validate the evidence.
     * @param newAttestationPolicy simple string.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyResponse>> setWithResponse(
            AttestationType attestationType, String newAttestationPolicy) {
        return serviceClient.setWithResponseAsync(attestationType, newAttestationPolicy)
            .map(response -> Utilities.generateResponseFromModelType(response, PolicyResponse.fromGenerated(response.getValue())));
    }

    /**
     * Sets the policy for a given attestation type.
     *
     * @param attestationType Specifies the trusted execution environment to be used to validate the evidence.
     * @param newAttestationPolicy simple string.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PolicyResponse> set(AttestationType attestationType, String newAttestationPolicy) {
        return this.serviceClient.setAsync(attestationType, newAttestationPolicy)
            .map(PolicyResponse::fromGenerated);
    }

    /**
     * Resets the attestation policy for the specified tenant and reverts to the default policy.
     *
     * @param attestationType Specifies the trusted execution environment to be used to validate the evidence.
     * @param policyJws simple string.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyResponse>> resetWithResponse(AttestationType attestationType, String policyJws) {
        return this.serviceClient.resetWithResponseAsync(attestationType, policyJws)
            .map(response -> Utilities.generateResponseFromModelType(response, PolicyResponse.fromGenerated(response.getValue())));
    }

    /**
     * Resets the attestation policy for the specified tenant and reverts to the default policy.
     *
     * @param attestationType Specifies the trusted execution environment to be used to validate the evidence.
     * @param policyJws simple string.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PolicyResponse> reset(AttestationType attestationType, String policyJws) {
        return this.serviceClient.resetAsync(attestationType, policyJws)
            .map(PolicyResponse::fromGenerated);
    }
}
