// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning;

import com.azure.analytics.purview.scanning.implementation.ScanResultsImpl;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous PurviewScanningClient type. */
@ServiceClient(builder = PurviewScanningClientBuilder.class, isAsync = true)
public final class ScanResultAsyncClient {
    private final ScanResultsImpl serviceClient;

    /**
     * Initializes an instance of ScanResults client.
     *
     * @param serviceClient the service client implementation.
     */
    ScanResultAsyncClient(ScanResultsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Runs the scan.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scanLevel</td><td>String</td><td>No</td><td>The scanLevel parameter</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     scanResultId: String
     *     startTime: String
     *     endTime: String
     *     status: String(Accepted/InProgress/TransientFailure/Succeeded/Failed/Canceled)
     *     error: {
     *         code: String
     *         message: String
     *         target: String
     *         details: [
     *             {
     *                 code: String
     *                 message: String
     *                 target: String
     *                 details: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param scanName The scanName parameter.
     * @param runId The runId parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> runScanWithResponse(
            String dataSourceName, String scanName, String runId, RequestOptions requestOptions) {
        return this.serviceClient.runScanWithResponseAsync(dataSourceName, scanName, runId, requestOptions);
    }

    /**
     * Cancels a scan.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     scanResultId: String
     *     startTime: String
     *     endTime: String
     *     status: String(Accepted/InProgress/TransientFailure/Succeeded/Failed/Canceled)
     *     error: {
     *         code: String
     *         message: String
     *         target: String
     *         details: [
     *             {
     *                 code: String
     *                 message: String
     *                 target: String
     *                 details: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param scanName The scanName parameter.
     * @param runId The runId parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> cancelScanWithResponse(
            String dataSourceName, String scanName, String runId, RequestOptions requestOptions) {
        return this.serviceClient.cancelScanWithResponseAsync(dataSourceName, scanName, runId, requestOptions);
    }

    /**
     * Lists the scan history of a scan.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             parentId: String
     *             id: String
     *             resourceId: String
     *             status: String
     *             assetsDiscovered: Long
     *             assetsClassified: Long
     *             diagnostics: {
     *                 notifications: [
     *                     {
     *                         message: String
     *                         code: Integer
     *                     }
     *                 ]
     *                 exceptionCountMap: {
     *                     String: int
     *                 }
     *             }
     *             startTime: String
     *             queuedTime: String
     *             pipelineStartTime: String
     *             endTime: String
     *             scanRulesetVersion: Integer
     *             scanRulesetType: String(Custom/System)
     *             scanLevelType: String(Full/Incremental)
     *             errorMessage: String
     *             error: {
     *                 code: String
     *                 message: String
     *                 target: String
     *                 details: [
     *                     {
     *                         code: String
     *                         message: String
     *                         target: String
     *                         details: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                 ]
     *             }
     *             runType: String
     *             dataSourceType: String(None/AzureSubscription/AzureResourceGroup/AzureSynapseWorkspace/AzureSynapse/AdlsGen1/AdlsGen2/AmazonAccount/AmazonS3/AmazonSql/AzureCosmosDb/AzureDataExplorer/AzureFileService/AzureSqlDatabase/AmazonPostgreSql/AzurePostgreSql/SqlServerDatabase/AzureSqlDatabaseManagedInstance/AzureSqlDataWarehouse/AzureMySql/AzureStorage/Teradata/Oracle/SapS4Hana/SapEcc/PowerBI)
     *         }
     *     ]
     *     nextLink: String
     *     count: Long
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param scanName The scanName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listScanHistory(
            String dataSourceName, String scanName, RequestOptions requestOptions) {
        return this.serviceClient.listScanHistoryAsync(dataSourceName, scanName, requestOptions);
    }
}
