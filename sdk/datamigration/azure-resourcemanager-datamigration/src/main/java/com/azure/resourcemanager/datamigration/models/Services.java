// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Services. */
public interface Services {
    /**
     * Get DMS Service Instance
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. The GET method
     * retrieves information about a service instance.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Database Migration Service resource along with {@link Response}.
     */
    Response<DataMigrationService> getByResourceGroupWithResponse(
        String groupName, String serviceName, Context context);

    /**
     * Get DMS Service Instance
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. The GET method
     * retrieves information about a service instance.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Database Migration Service resource.
     */
    DataMigrationService getByResourceGroup(String groupName, String serviceName);

    /**
     * Delete DMS Service Instance
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. The DELETE
     * method deletes a service. Any running tasks will be canceled.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String groupName, String serviceName);

    /**
     * Delete DMS Service Instance
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. The DELETE
     * method deletes a service. Any running tasks will be canceled.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param deleteRunningTasks Delete the resource even if it contains running tasks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String groupName, String serviceName, Boolean deleteRunningTasks, Context context);

    /**
     * Check service health status
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. This action
     * performs a health check and returns the status of the service and virtual machine size.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service health status along with {@link Response}.
     */
    Response<DataMigrationServiceStatusResponse> checkStatusWithResponse(
        String groupName, String serviceName, Context context);

    /**
     * Check service health status
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. This action
     * performs a health check and returns the status of the service and virtual machine size.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service health status.
     */
    DataMigrationServiceStatusResponse checkStatus(String groupName, String serviceName);

    /**
     * Start service
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. This action
     * starts the service and the service can be used for data migration.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String groupName, String serviceName);

    /**
     * Start service
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. This action
     * starts the service and the service can be used for data migration.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String groupName, String serviceName, Context context);

    /**
     * Stop service
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. This action
     * stops the service and the service cannot be used for data migration. The service owner won't be billed when the
     * service is stopped.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String groupName, String serviceName);

    /**
     * Stop service
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. This action
     * stops the service and the service cannot be used for data migration. The service owner won't be billed when the
     * service is stopped.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String groupName, String serviceName, Context context);

    /**
     * Get compatible SKUs
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. The skus
     * action returns the list of SKUs that a service resource can be updated to.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of available SKUs as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailableServiceSku> listSkus(String groupName, String serviceName);

    /**
     * Get compatible SKUs
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. The skus
     * action returns the list of SKUs that a service resource can be updated to.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of available SKUs as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailableServiceSku> listSkus(String groupName, String serviceName, Context context);

    /**
     * Check nested resource name validity and availability
     *
     * <p>This method checks whether a proposed nested resource name is valid and available.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param parameters Requested name to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return indicates whether a proposed resource name is available along with {@link Response}.
     */
    Response<NameAvailabilityResponse> nestedCheckNameAvailabilityWithResponse(
        String groupName, String serviceName, NameAvailabilityRequest parameters, Context context);

    /**
     * Check nested resource name validity and availability
     *
     * <p>This method checks whether a proposed nested resource name is valid and available.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param parameters Requested name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return indicates whether a proposed resource name is available.
     */
    NameAvailabilityResponse nestedCheckNameAvailability(
        String groupName, String serviceName, NameAvailabilityRequest parameters);

    /**
     * Get services in resource group
     *
     * <p>The Services resource is the top-level resource that represents the Database Migration Service. This method
     * returns a list of service resources in a resource group.
     *
     * @param groupName Name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of service objects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataMigrationService> listByResourceGroup(String groupName);

    /**
     * Get services in resource group
     *
     * <p>The Services resource is the top-level resource that represents the Database Migration Service. This method
     * returns a list of service resources in a resource group.
     *
     * @param groupName Name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of service objects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataMigrationService> listByResourceGroup(String groupName, Context context);

    /**
     * Get services in subscription
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. This method
     * returns a list of service resources in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of service objects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataMigrationService> list();

    /**
     * Get services in subscription
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. This method
     * returns a list of service resources in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of service objects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataMigrationService> list(Context context);

    /**
     * Check name validity and availability
     *
     * <p>This method checks whether a proposed top-level resource name is valid and available.
     *
     * @param location The Azure region of the operation.
     * @param parameters Requested name to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return indicates whether a proposed resource name is available along with {@link Response}.
     */
    Response<NameAvailabilityResponse> checkNameAvailabilityWithResponse(
        String location, NameAvailabilityRequest parameters, Context context);

    /**
     * Check name validity and availability
     *
     * <p>This method checks whether a proposed top-level resource name is valid and available.
     *
     * @param location The Azure region of the operation.
     * @param parameters Requested name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return indicates whether a proposed resource name is available.
     */
    NameAvailabilityResponse checkNameAvailability(String location, NameAvailabilityRequest parameters);

    /**
     * Get DMS Service Instance
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. The GET method
     * retrieves information about a service instance.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Database Migration Service resource along with {@link Response}.
     */
    DataMigrationService getById(String id);

    /**
     * Get DMS Service Instance
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. The GET method
     * retrieves information about a service instance.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Database Migration Service resource along with {@link Response}.
     */
    Response<DataMigrationService> getByIdWithResponse(String id, Context context);

    /**
     * Delete DMS Service Instance
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. The DELETE
     * method deletes a service. Any running tasks will be canceled.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete DMS Service Instance
     *
     * <p>The services resource is the top-level resource that represents the Database Migration Service. The DELETE
     * method deletes a service. Any running tasks will be canceled.
     *
     * @param id the resource ID.
     * @param deleteRunningTasks Delete the resource even if it contains running tasks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean deleteRunningTasks, Context context);

    /**
     * Begins definition for a new DataMigrationService resource.
     *
     * @param name resource name.
     * @return the first stage of the new DataMigrationService definition.
     */
    DataMigrationService.DefinitionStages.Blank define(String name);
}
