// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow;

import com.azure.analytics.purview.workflow.implementation.WorkflowsOperationsImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous PurviewWorkflowClient type. */
@ServiceClient(builder = WorkflowClientBuilder.class)
public final class WorkflowClient {
    @Generated private final WorkflowsOperationsImpl serviceClient;

    /**
     * Initializes an instance of WorkflowClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    WorkflowClient(WorkflowsOperationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get a specific workflow.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     triggers (Required): [
     *          (Required){
     *             type: String(when_term_creation_is_requested/when_term_deletion_is_requested/when_term_update_is_requested/when_terms_import_is_requested/when_data_access_grant_is_requested/when_asset_update_is_requested) (Required)
     *             underGlossaryHierarchy: String (Optional)
     *             underCollection: String (Optional)
     *             underGlossary: String (Optional)
     *         }
     *     ]
     *     createdTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastUpdateTime: OffsetDateTime (Optional)
     *     updatedBy: String (Optional)
     *     name: String (Required)
     *     isEnabled: boolean (Required)
     *     description: String (Required)
     *     actionDag: Object (Required)
     * }
     * }</pre>
     *
     * @param workflowId The workflow id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a specific workflow along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String workflowId, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponse(workflowId, requestOptions);
    }

    /**
     * Create or replace a workflow.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     triggers (Required): [
     *          (Required){
     *             type: String(when_term_creation_is_requested/when_term_deletion_is_requested/when_term_update_is_requested/when_terms_import_is_requested/when_data_access_grant_is_requested/when_asset_update_is_requested) (Required)
     *             underGlossaryHierarchy: String (Optional)
     *             underCollection: String (Optional)
     *             underGlossary: String (Optional)
     *         }
     *     ]
     *     name: String (Required)
     *     isEnabled: boolean (Required)
     *     description: String (Required)
     *     actionDag: Object (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     triggers (Required): [
     *          (Required){
     *             type: String(when_term_creation_is_requested/when_term_deletion_is_requested/when_term_update_is_requested/when_terms_import_is_requested/when_data_access_grant_is_requested/when_asset_update_is_requested) (Required)
     *             underGlossaryHierarchy: String (Optional)
     *             underCollection: String (Optional)
     *             underGlossary: String (Optional)
     *         }
     *     ]
     *     createdTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastUpdateTime: OffsetDateTime (Optional)
     *     updatedBy: String (Optional)
     *     name: String (Required)
     *     isEnabled: boolean (Required)
     *     description: String (Required)
     *     actionDag: Object (Required)
     * }
     * }</pre>
     *
     * @param workflowId The workflow id.
     * @param workflowCreateOrUpdateCommand Create or update workflow payload.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the workflow properties along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrReplaceWithResponse(
            String workflowId, BinaryData workflowCreateOrUpdateCommand, RequestOptions requestOptions) {
        return this.serviceClient.createOrReplaceWithResponse(
                workflowId, workflowCreateOrUpdateCommand, requestOptions);
    }

    /**
     * Delete a workflow.
     *
     * @param workflowId The workflow id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String workflowId, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponse(workflowId, requestOptions);
    }

    /**
     * Validate a workflow.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     triggers (Required): [
     *          (Required){
     *             type: String(when_term_creation_is_requested/when_term_deletion_is_requested/when_term_update_is_requested/when_terms_import_is_requested/when_data_access_grant_is_requested/when_asset_update_is_requested) (Required)
     *             underGlossaryHierarchy: String (Optional)
     *             underCollection: String (Optional)
     *             underGlossary: String (Optional)
     *         }
     *     ]
     *     name: String (Required)
     *     isEnabled: boolean (Required)
     *     description: String (Required)
     *     actionDag: Object (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             severity: String(error/warning) (Required)
     *             location (Required): {
     *                 type: String(workflow/action/actionParameter) (Required)
     *                 actionName: String (Optional)
     *                 parameterKey: String (Optional)
     *             }
     *             message: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param workflowId The workflow id.
     * @param workflowValidateQuery Check workflow payload.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> validateWithResponse(
            String workflowId, BinaryData workflowValidateQuery, RequestOptions requestOptions) {
        return this.serviceClient.validateWithResponse(workflowId, workflowValidateQuery, requestOptions);
    }
}
