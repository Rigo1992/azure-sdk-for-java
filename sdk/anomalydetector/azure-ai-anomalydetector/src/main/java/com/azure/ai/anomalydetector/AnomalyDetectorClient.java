// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector;

import com.azure.ai.anomalydetector.implementation.AnomalyDetectorClientImpl;
import com.azure.ai.anomalydetector.models.AnomalyDetectorErrorException;
import com.azure.ai.anomalydetector.models.ChangePointDetectRequest;
import com.azure.ai.anomalydetector.models.ChangePointDetectResponse;
import com.azure.ai.anomalydetector.models.DetectAnomalyResponse;
import com.azure.ai.anomalydetector.models.DetectRequest;
import com.azure.ai.anomalydetector.models.DetectionRequest;
import com.azure.ai.anomalydetector.models.DetectionResult;
import com.azure.ai.anomalydetector.models.EntireDetectResponse;
import com.azure.ai.anomalydetector.models.ErrorResponseException;
import com.azure.ai.anomalydetector.models.LastDetectResponse;
import com.azure.ai.anomalydetector.models.LastDetectionRequest;
import com.azure.ai.anomalydetector.models.LastDetectionResult;
import com.azure.ai.anomalydetector.models.Model;
import com.azure.ai.anomalydetector.models.ModelInfo;
import com.azure.ai.anomalydetector.models.ModelSnapshot;
import com.azure.ai.anomalydetector.models.TrainMultivariateModelResponse;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.util.Context;
import java.io.InputStream;
import java.util.UUID;

/** Initializes a new instance of the synchronous AnomalyDetectorClient type. */
@ServiceClient(builder = AnomalyDetectorClientBuilder.class)
public final class AnomalyDetectorClient {
    private final AnomalyDetectorClientImpl serviceClient;

    /**
     * Initializes an instance of AnomalyDetectorClient client.
     *
     * @param serviceClient the service client implementation.
     */
    AnomalyDetectorClient(AnomalyDetectorClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * This operation generates a model with an entire series, each point is detected with the same model. With this
     * method, points before and after a certain point are used to determine whether it is an anomaly. The entire
     * detection can give user an overall status of the time series.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnomalyDetectorErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of entire anomaly detection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EntireDetectResponse detectEntireSeries(DetectRequest body) {
        return this.serviceClient.detectEntireSeries(body);
    }

    /**
     * This operation generates a model with an entire series, each point is detected with the same model. With this
     * method, points before and after a certain point are used to determine whether it is an anomaly. The entire
     * detection can give user an overall status of the time series.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnomalyDetectorErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of entire anomaly detection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<EntireDetectResponse> detectEntireSeriesWithResponse(DetectRequest body, Context context) {
        return this.serviceClient.detectEntireSeriesWithResponse(body, context);
    }

    /**
     * This operation generates a model using the data points that you sent to the API, and based on all data 
     * to determine whether the last point is anomalous. The latest point detecting operation matches the
     * scenario of real-time monitoring of business metrics.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnomalyDetectorErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of last anomaly detection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LastDetectResponse detectLastPoint(DetectRequest body) {
        return this.serviceClient.detectLastPoint(body);
    }

    /**
     * This operation generates a model using the data points that you sent to the API, and based on all data 
     * to determine whether the last point is anomalous. The latest point detecting operation matches the
     * scenario of real-time monitoring of business metrics.
     *
     * @param body Time series points and period if needed. Advanced model parameters can also be set in the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnomalyDetectorErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of last anomaly detection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LastDetectResponse> detectLastPointWithResponse(DetectRequest body, Context context) {
        return this.serviceClient.detectLastPointWithResponse(body, context);
    }

    /**
     * Evaluate change point score of every series point.
     *
     * @param body Time series points and granularity is needed. Advanced model parameters can also be set in the
     *     request if needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnomalyDetectorErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of change point detection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ChangePointDetectResponse detectChangePoint(ChangePointDetectRequest body) {
        return this.serviceClient.detectChangePoint(body);
    }

    /**
     * Evaluate change point score of every series point.
     *
     * @param body Time series points and granularity is needed. Advanced model parameters can also be set in the
     *     request if needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnomalyDetectorErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of change point detection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ChangePointDetectResponse> detectChangePointWithResponse(
            ChangePointDetectRequest body, Context context) {
        return this.serviceClient.detectChangePointWithResponse(body, context);
    }

    /**
     * Create and train a multivariate anomaly detection model. The request must include a source parameter to indicate
     * an externally accessible Azure storage Uri (preferably a Shared Access Signature Uri). All time-series used in
     * generate the model must be zipped into one single file. Each time-series will be in a single CSV file in which
     * the first column is timestamp and the second column is value.
     *
     * @param body Training request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void trainMultivariateModel(ModelInfo body) {
        this.serviceClient.trainMultivariateModel(body);
    }

    /**
     * Create and train a multivariate anomaly detection model. The request must include a source parameter to indicate
     * an externally accessible Azure storage Uri (preferably a Shared Access Signature Uri). All time-series used in
     * generate the model must be zipped into one single file. Each time-series will be in a single CSV file in which
     * the first column is timestamp and the second column is value.
     *
     * @param body Training request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TrainMultivariateModelResponse trainMultivariateModelWithResponse(ModelInfo body, Context context) {
        return this.serviceClient.trainMultivariateModelWithResponse(body, context);
    }

    /**
     * List models of a subscription.
     *
     * @param skip $skip indicates how many models will be skipped.
     * @param top $top indicates how many models will be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of listing models.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ModelSnapshot> listMultivariateModel(Integer skip, Integer top) {
        return this.serviceClient.listMultivariateModel(skip, top);
    }

    /**
     * List models of a subscription.
     *
     * @param skip $skip indicates how many models will be skipped.
     * @param top $top indicates how many models will be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of listing models.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ModelSnapshot> listMultivariateModel(Integer skip, Integer top, Context context) {
        return this.serviceClient.listMultivariateModel(skip, top, context);
    }

    /**
     * Get detailed information of multivariate model, including the training status and variables used in the model.
     *
     * @param modelId Model identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detailed information of multivariate model, including the training status and variables used in the
     *     model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Model getMultivariateModel(UUID modelId) {
        return this.serviceClient.getMultivariateModel(modelId);
    }

    /**
     * Get detailed information of multivariate model, including the training status and variables used in the model.
     *
     * @param modelId Model identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detailed information of multivariate model, including the training status and variables used in the
     *     model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Model> getMultivariateModelWithResponse(UUID modelId, Context context) {
        return this.serviceClient.getMultivariateModelWithResponse(modelId, context);
    }

    /**
     * Delete an existing multivariate model according to the modelId.
     *
     * @param modelId Model identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteMultivariateModel(UUID modelId) {
        this.serviceClient.deleteMultivariateModel(modelId);
    }

    /**
     * Delete an existing multivariate model according to the modelId.
     *
     * @param modelId Model identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteMultivariateModelWithResponse(UUID modelId, Context context) {
        return this.serviceClient.deleteMultivariateModelWithResponse(modelId, context);
    }

    /**
     * Submit detection multivariate anomaly task with the trained model of modelId, the input schema should be the same
     * with the training request. Thus request will be complete asynchronously and will return a resultId for querying
     * the detection result.The request should be a source link to indicate an externally accessible Azure storage Uri
     * (preferably a Shared Access Signature Uri). All time-series used in generate the model must be zipped into one
     * single file. Each time-series will be as follows: the first column is timestamp and the second column is value.
     *
     * @param modelId Model identifier.
     * @param body Detect anomaly request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void detectAnomaly(UUID modelId, DetectionRequest body) {
        this.serviceClient.detectAnomaly(modelId, body);
    }

    /**
     * Submit detection multivariate anomaly task with the trained model of modelId, the input schema should be the same
     * with the training request. Thus request will be complete asynchronously and will return a resultId for querying
     * the detection result.The request should be a source link to indicate an externally accessible Azure storage Uri
     * (preferably a Shared Access Signature Uri). All time-series used in generate the model must be zipped into one
     * single file. Each time-series will be as follows: the first column is timestamp and the second column is value.
     *
     * @param modelId Model identifier.
     * @param body Detect anomaly request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DetectAnomalyResponse detectAnomalyWithResponse(UUID modelId, DetectionRequest body, Context context) {
        return this.serviceClient.detectAnomalyWithResponse(modelId, body, context);
    }

    /**
     * Get multivariate anomaly detection result based on resultId returned by the DetectAnomalyAsync api.
     *
     * @param resultId Result identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return multivariate anomaly detection result based on resultId returned by the DetectAnomalyAsync api.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DetectionResult getDetectionResult(UUID resultId) {
        return this.serviceClient.getDetectionResult(resultId);
    }

    /**
     * Get multivariate anomaly detection result based on resultId returned by the DetectAnomalyAsync api.
     *
     * @param resultId Result identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return multivariate anomaly detection result based on resultId returned by the DetectAnomalyAsync api.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DetectionResult> getDetectionResultWithResponse(UUID resultId, Context context) {
        return this.serviceClient.getDetectionResultWithResponse(resultId, context);
    }

    /**
     * Export multivariate anomaly detection model based on modelId.
     *
     * @param modelId Model identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InputStream exportModel(UUID modelId) {
        return this.serviceClient.exportModel(modelId);
    }

    /**
     * Export multivariate anomaly detection model based on modelId.
     *
     * @param modelId Model identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StreamResponse exportModelWithResponse(UUID modelId, Context context) {
        return this.serviceClient.exportModelWithResponse(modelId, context);
    }

    /**
     * Synchronized API for anomaly detection.
     *
     * @param modelId Model identifier.
     * @param body Request for last detection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LastDetectionResult lastDetectAnomaly(UUID modelId, LastDetectionRequest body) {
        return this.serviceClient.lastDetectAnomaly(modelId, body);
    }

    /**
     * Synchronized API for anomaly detection.
     *
     * @param modelId Model identifier.
     * @param body Request for last detection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LastDetectionResult> lastDetectAnomalyWithResponse(
            UUID modelId, LastDetectionRequest body, Context context) {
        return this.serviceClient.lastDetectAnomalyWithResponse(modelId, body, context);
    }
}
