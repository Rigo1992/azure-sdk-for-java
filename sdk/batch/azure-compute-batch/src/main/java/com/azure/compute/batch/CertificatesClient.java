// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch;

import com.azure.compute.batch.models.Certificate;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous BatchServiceClient type. */
@ServiceClient(builder = BatchServiceClientBuilder.class)
public final class CertificatesClient {
    @Generated private final CertificatesAsyncClient client;

    /**
     * Initializes an instance of CertificatesClient class.
     *
     * @param client the async client.
     */
    @Generated
    CertificatesClient(CertificatesAsyncClient client) {
        this.client = client;
    }

    /**
     * Adds a Certificate to the specified Account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>client-request-id</td><td>String</td><td>No</td><td>The caller-generated request identity, in the form of a GUID with no decoration
     * such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.</td></tr>
     *     <tr><td>return-client-request-id</td><td>Boolean</td><td>No</td><td>Whether the server should return the client-request-id in the response.</td></tr>
     *     <tr><td>ocp-date</td><td>String</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     thumbprint: String (Optional)
     *     thumbprintAlgorithm: String (Optional)
     *     url: String (Optional)
     *     state: String(active/deleting/deletefailed) (Optional)
     *     stateTransitionTime: OffsetDateTime (Optional)
     *     previousState: String(active/deleting/deletefailed) (Optional)
     *     previousStateTransitionTime: OffsetDateTime (Optional)
     *     publicData: String (Optional)
     *     deleteCertificateError (Optional): {
     *         code: String (Optional)
     *         message: String (Optional)
     *         values (Optional): [
     *              (Optional){
     *                 name: String (Optional)
     *                 value: String (Optional)
     *             }
     *         ]
     *     }
     *     data: String (Optional)
     *     certificateFormat: String(pfx/cer) (Optional)
     *     password: String (Optional)
     * }
     * }</pre>
     *
     * @param certificate The Certificate to be added.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> addWithResponse(BinaryData certificate, RequestOptions requestOptions) {
        return this.client.addWithResponse(certificate, requestOptions).block();
    }

    /**
     * Lists all of the Certificates that have been added to the specified Account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>maxresults</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     *     <tr><td>$filter</td><td>String</td><td>No</td><td>An OData $filter clause. For more information on constructing this filter, see
     * https://docs.microsoft.com/en-us/rest/api/batchservice/odata-filters-in-batch#list-certificates.</td></tr>
     *     <tr><td>$select</td><td>String</td><td>No</td><td>An OData $select clause.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ocp-date</td><td>String</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     *     <tr><td>client-request-id</td><td>String</td><td>No</td><td>The caller-generated request identity, in the form of a GUID with no decoration
     * such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.</td></tr>
     *     <tr><td>return-client-request-id</td><td>Boolean</td><td>No</td><td>Whether the server should return the client-request-id in the response.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     thumbprint: String (Optional)
     *     thumbprintAlgorithm: String (Optional)
     *     url: String (Optional)
     *     state: String(active/deleting/deletefailed) (Optional)
     *     stateTransitionTime: OffsetDateTime (Optional)
     *     previousState: String(active/deleting/deletefailed) (Optional)
     *     previousStateTransitionTime: OffsetDateTime (Optional)
     *     publicData: String (Optional)
     *     deleteCertificateError (Optional): {
     *         code: String (Optional)
     *         message: String (Optional)
     *         values (Optional): [
     *              (Optional){
     *                 name: String (Optional)
     *                 value: String (Optional)
     *             }
     *         ]
     *     }
     *     data: String (Optional)
     *     certificateFormat: String(pfx/cer) (Optional)
     *     password: String (Optional)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of listing the Certificates in the Account as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.list(requestOptions));
    }

    /**
     * Cancels a failed deletion of a Certificate from the specified Account.
     *
     * <p>If you try to delete a Certificate that is being used by a Pool or Compute Node, the status of the Certificate
     * changes to deleteFailed. If you decide that you want to continue using the Certificate, you can use this
     * operation to set the status of the Certificate back to active. If you intend to delete the Certificate, you do
     * not need to run this operation after the deletion failed. You must make sure that the Certificate is not being
     * used by any resources, and then you can try again to delete the Certificate.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>client-request-id</td><td>String</td><td>No</td><td>The caller-generated request identity, in the form of a GUID with no decoration
     * such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.</td></tr>
     *     <tr><td>return-client-request-id</td><td>Boolean</td><td>No</td><td>Whether the server should return the client-request-id in the response.</td></tr>
     *     <tr><td>ocp-date</td><td>String</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the Certificate being deleted.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> cancelDeletionWithResponse(
            String thumbprintAlgorithm, String thumbprint, RequestOptions requestOptions) {
        return this.client.cancelDeletionWithResponse(thumbprintAlgorithm, thumbprint, requestOptions).block();
    }

    /**
     * Deletes a Certificate from the specified Account.
     *
     * <p>You cannot delete a Certificate if a resource (Pool or Compute Node) is using it. Before you can delete a
     * Certificate, you must therefore make sure that the Certificate is not associated with any existing Pools, the
     * Certificate is not installed on any Nodes (even if you remove a Certificate from a Pool, it is not removed from
     * existing Compute Nodes in that Pool until they restart), and no running Tasks depend on the Certificate. If you
     * try to delete a Certificate that is in use, the deletion fails. The Certificate status changes to deleteFailed.
     * You can use Cancel Delete Certificate to set the status back to active if you decide that you want to continue
     * using the Certificate.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>client-request-id</td><td>String</td><td>No</td><td>The caller-generated request identity, in the form of a GUID with no decoration
     * such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.</td></tr>
     *     <tr><td>return-client-request-id</td><td>Boolean</td><td>No</td><td>Whether the server should return the client-request-id in the response.</td></tr>
     *     <tr><td>ocp-date</td><td>String</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the Certificate to be deleted.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
            String thumbprintAlgorithm, String thumbprint, RequestOptions requestOptions) {
        return this.client.deleteWithResponse(thumbprintAlgorithm, thumbprint, requestOptions).block();
    }

    /**
     * Gets information about the specified Certificate.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     *     <tr><td>$select</td><td>String</td><td>No</td><td>An OData $select clause.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>client-request-id</td><td>String</td><td>No</td><td>The caller-generated request identity, in the form of a GUID with no decoration
     * such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.</td></tr>
     *     <tr><td>return-client-request-id</td><td>Boolean</td><td>No</td><td>Whether the server should return the client-request-id in the response.</td></tr>
     *     <tr><td>ocp-date</td><td>String</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     thumbprint: String (Optional)
     *     thumbprintAlgorithm: String (Optional)
     *     url: String (Optional)
     *     state: String(active/deleting/deletefailed) (Optional)
     *     stateTransitionTime: OffsetDateTime (Optional)
     *     previousState: String(active/deleting/deletefailed) (Optional)
     *     previousStateTransitionTime: OffsetDateTime (Optional)
     *     publicData: String (Optional)
     *     deleteCertificateError (Optional): {
     *         code: String (Optional)
     *         message: String (Optional)
     *         values (Optional): [
     *              (Optional){
     *                 name: String (Optional)
     *                 value: String (Optional)
     *             }
     *         ]
     *     }
     *     data: String (Optional)
     *     certificateFormat: String(pfx/cer) (Optional)
     *     password: String (Optional)
     * }
     * }</pre>
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the Certificate to get.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return information about the specified Certificate along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String thumbprintAlgorithm, String thumbprint, RequestOptions requestOptions) {
        return this.client.getWithResponse(thumbprintAlgorithm, thumbprint, requestOptions).block();
    }

    /**
     * Adds a Certificate to the specified Account.
     *
     * @param certificate The Certificate to be added.
     * @param timeOut The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param clientRequestId The caller-generated request identity, in the form of a GUID with no decoration such as
     *     curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     * @param returnClientRequestId Whether the server should return the client-request-id in the response.
     * @param ocpDate The time the request was issued. Client libraries typically set this to the current system clock
     *     time; set it explicitly if you are calling the REST API directly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void add(
            Certificate certificate,
            Integer timeOut,
            String clientRequestId,
            Boolean returnClientRequestId,
            String ocpDate) {
        // Generated convenience method for addWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (timeOut != null) {
            requestOptions.addQueryParam("timeOut", String.valueOf(timeOut), false);
        }
        if (clientRequestId != null) {
            requestOptions.setHeader("client-request-id", clientRequestId);
        }
        if (returnClientRequestId != null) {
            requestOptions.setHeader("return-client-request-id", String.valueOf(returnClientRequestId));
        }
        if (ocpDate != null) {
            requestOptions.setHeader("ocp-date", ocpDate);
        }
        addWithResponse(BinaryData.fromObject(certificate), requestOptions).getValue();
    }

    /**
     * Adds a Certificate to the specified Account.
     *
     * @param certificate The Certificate to be added.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void add(Certificate certificate) {
        // Generated convenience method for addWithResponse
        RequestOptions requestOptions = new RequestOptions();
        addWithResponse(BinaryData.fromObject(certificate), requestOptions).getValue();
    }

    /**
     * Lists all of the Certificates that have been added to the specified Account.
     *
     * @param maxresults The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param ocpDate The time the request was issued. Client libraries typically set this to the current system clock
     *     time; set it explicitly if you are calling the REST API directly.
     * @param timeOut The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param clientRequestId The caller-generated request identity, in the form of a GUID with no decoration such as
     *     curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     * @param returnClientRequestId Whether the server should return the client-request-id in the response.
     * @param filter An OData $filter clause. For more information on constructing this filter, see
     *     https://docs.microsoft.com/en-us/rest/api/batchservice/odata-filters-in-batch#list-certificates.
     * @param select An OData $select clause.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of listing the Certificates in the Account as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Certificate> list(
            Integer maxresults,
            String ocpDate,
            Integer timeOut,
            String clientRequestId,
            Boolean returnClientRequestId,
            String filter,
            String select) {
        // Generated convenience method for list
        return new PagedIterable<>(
                client.list(maxresults, ocpDate, timeOut, clientRequestId, returnClientRequestId, filter, select));
    }

    /**
     * Lists all of the Certificates that have been added to the specified Account.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of listing the Certificates in the Account as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Certificate> list() {
        // Generated convenience method for list
        return new PagedIterable<>(client.list());
    }

    /**
     * Cancels a failed deletion of a Certificate from the specified Account.
     *
     * <p>If you try to delete a Certificate that is being used by a Pool or Compute Node, the status of the Certificate
     * changes to deleteFailed. If you decide that you want to continue using the Certificate, you can use this
     * operation to set the status of the Certificate back to active. If you intend to delete the Certificate, you do
     * not need to run this operation after the deletion failed. You must make sure that the Certificate is not being
     * used by any resources, and then you can try again to delete the Certificate.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the Certificate being deleted.
     * @param timeOut The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param clientRequestId The caller-generated request identity, in the form of a GUID with no decoration such as
     *     curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     * @param returnClientRequestId Whether the server should return the client-request-id in the response.
     * @param ocpDate The time the request was issued. Client libraries typically set this to the current system clock
     *     time; set it explicitly if you are calling the REST API directly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancelDeletion(
            String thumbprintAlgorithm,
            String thumbprint,
            Integer timeOut,
            String clientRequestId,
            Boolean returnClientRequestId,
            String ocpDate) {
        // Generated convenience method for cancelDeletionWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (timeOut != null) {
            requestOptions.addQueryParam("timeOut", String.valueOf(timeOut), false);
        }
        if (clientRequestId != null) {
            requestOptions.setHeader("client-request-id", clientRequestId);
        }
        if (returnClientRequestId != null) {
            requestOptions.setHeader("return-client-request-id", String.valueOf(returnClientRequestId));
        }
        if (ocpDate != null) {
            requestOptions.setHeader("ocp-date", ocpDate);
        }
        cancelDeletionWithResponse(thumbprintAlgorithm, thumbprint, requestOptions).getValue();
    }

    /**
     * Cancels a failed deletion of a Certificate from the specified Account.
     *
     * <p>If you try to delete a Certificate that is being used by a Pool or Compute Node, the status of the Certificate
     * changes to deleteFailed. If you decide that you want to continue using the Certificate, you can use this
     * operation to set the status of the Certificate back to active. If you intend to delete the Certificate, you do
     * not need to run this operation after the deletion failed. You must make sure that the Certificate is not being
     * used by any resources, and then you can try again to delete the Certificate.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the Certificate being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancelDeletion(String thumbprintAlgorithm, String thumbprint) {
        // Generated convenience method for cancelDeletionWithResponse
        RequestOptions requestOptions = new RequestOptions();
        cancelDeletionWithResponse(thumbprintAlgorithm, thumbprint, requestOptions).getValue();
    }

    /**
     * Deletes a Certificate from the specified Account.
     *
     * <p>You cannot delete a Certificate if a resource (Pool or Compute Node) is using it. Before you can delete a
     * Certificate, you must therefore make sure that the Certificate is not associated with any existing Pools, the
     * Certificate is not installed on any Nodes (even if you remove a Certificate from a Pool, it is not removed from
     * existing Compute Nodes in that Pool until they restart), and no running Tasks depend on the Certificate. If you
     * try to delete a Certificate that is in use, the deletion fails. The Certificate status changes to deleteFailed.
     * You can use Cancel Delete Certificate to set the status back to active if you decide that you want to continue
     * using the Certificate.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the Certificate to be deleted.
     * @param timeOut The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param clientRequestId The caller-generated request identity, in the form of a GUID with no decoration such as
     *     curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     * @param returnClientRequestId Whether the server should return the client-request-id in the response.
     * @param ocpDate The time the request was issued. Client libraries typically set this to the current system clock
     *     time; set it explicitly if you are calling the REST API directly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(
            String thumbprintAlgorithm,
            String thumbprint,
            Integer timeOut,
            String clientRequestId,
            Boolean returnClientRequestId,
            String ocpDate) {
        // Generated convenience method for deleteWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (timeOut != null) {
            requestOptions.addQueryParam("timeOut", String.valueOf(timeOut), false);
        }
        if (clientRequestId != null) {
            requestOptions.setHeader("client-request-id", clientRequestId);
        }
        if (returnClientRequestId != null) {
            requestOptions.setHeader("return-client-request-id", String.valueOf(returnClientRequestId));
        }
        if (ocpDate != null) {
            requestOptions.setHeader("ocp-date", ocpDate);
        }
        deleteWithResponse(thumbprintAlgorithm, thumbprint, requestOptions).getValue();
    }

    /**
     * Deletes a Certificate from the specified Account.
     *
     * <p>You cannot delete a Certificate if a resource (Pool or Compute Node) is using it. Before you can delete a
     * Certificate, you must therefore make sure that the Certificate is not associated with any existing Pools, the
     * Certificate is not installed on any Nodes (even if you remove a Certificate from a Pool, it is not removed from
     * existing Compute Nodes in that Pool until they restart), and no running Tasks depend on the Certificate. If you
     * try to delete a Certificate that is in use, the deletion fails. The Certificate status changes to deleteFailed.
     * You can use Cancel Delete Certificate to set the status back to active if you decide that you want to continue
     * using the Certificate.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the Certificate to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String thumbprintAlgorithm, String thumbprint) {
        // Generated convenience method for deleteWithResponse
        RequestOptions requestOptions = new RequestOptions();
        deleteWithResponse(thumbprintAlgorithm, thumbprint, requestOptions).getValue();
    }

    /**
     * Gets information about the specified Certificate.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the Certificate to get.
     * @param timeOut The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param clientRequestId The caller-generated request identity, in the form of a GUID with no decoration such as
     *     curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     * @param returnClientRequestId Whether the server should return the client-request-id in the response.
     * @param ocpDate The time the request was issued. Client libraries typically set this to the current system clock
     *     time; set it explicitly if you are calling the REST API directly.
     * @param select An OData $select clause.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified Certificate.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Certificate get(
            String thumbprintAlgorithm,
            String thumbprint,
            Integer timeOut,
            String clientRequestId,
            Boolean returnClientRequestId,
            String ocpDate,
            String select) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (timeOut != null) {
            requestOptions.addQueryParam("timeOut", String.valueOf(timeOut), false);
        }
        if (clientRequestId != null) {
            requestOptions.setHeader("client-request-id", clientRequestId);
        }
        if (returnClientRequestId != null) {
            requestOptions.setHeader("return-client-request-id", String.valueOf(returnClientRequestId));
        }
        if (ocpDate != null) {
            requestOptions.setHeader("ocp-date", ocpDate);
        }
        if (select != null) {
            requestOptions.addQueryParam("$select", select, false);
        }
        return getWithResponse(thumbprintAlgorithm, thumbprint, requestOptions).getValue().toObject(Certificate.class);
    }

    /**
     * Gets information about the specified Certificate.
     *
     * @param thumbprintAlgorithm The algorithm used to derive the thumbprint parameter. This must be sha1.
     * @param thumbprint The thumbprint of the Certificate to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified Certificate.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Certificate get(String thumbprintAlgorithm, String thumbprint) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(thumbprintAlgorithm, thumbprint, requestOptions).getValue().toObject(Certificate.class);
    }
}
