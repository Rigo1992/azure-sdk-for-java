// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Schedules. */
public interface Schedules {
    /**
     * Returns a list of all schedules for a lab.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab account. Used in resource
     *     URIs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of schedules.
     */
    PagedIterable<Schedule> listByLab(String resourceGroupName, String labName);

    /**
     * Returns a list of all schedules for a lab.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab account. Used in resource
     *     URIs.
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of schedules.
     */
    PagedIterable<Schedule> listByLab(String resourceGroupName, String labName, String filter, Context context);

    /**
     * Returns the properties of a lab Schedule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab account. Used in resource
     *     URIs.
     * @param scheduleName The name of the schedule that uniquely identifies it within containing lab. Used in resource
     *     URIs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedule for automatically turning virtual machines in a lab on and off at specified times.
     */
    Schedule get(String resourceGroupName, String labName, String scheduleName);

    /**
     * Returns the properties of a lab Schedule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab account. Used in resource
     *     URIs.
     * @param scheduleName The name of the schedule that uniquely identifies it within containing lab. Used in resource
     *     URIs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedule for automatically turning virtual machines in a lab on and off at specified times along with
     *     {@link Response}.
     */
    Response<Schedule> getWithResponse(String resourceGroupName, String labName, String scheduleName, Context context);

    /**
     * Operation to delete a schedule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab account. Used in resource
     *     URIs.
     * @param scheduleName The name of the schedule that uniquely identifies it within containing lab. Used in resource
     *     URIs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labName, String scheduleName);

    /**
     * Operation to delete a schedule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param labName The name of the lab that uniquely identifies it within containing lab account. Used in resource
     *     URIs.
     * @param scheduleName The name of the schedule that uniquely identifies it within containing lab. Used in resource
     *     URIs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labName, String scheduleName, Context context);

    /**
     * Returns the properties of a lab Schedule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedule for automatically turning virtual machines in a lab on and off at specified times along with
     *     {@link Response}.
     */
    Schedule getById(String id);

    /**
     * Returns the properties of a lab Schedule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedule for automatically turning virtual machines in a lab on and off at specified times along with
     *     {@link Response}.
     */
    Response<Schedule> getByIdWithResponse(String id, Context context);

    /**
     * Operation to delete a schedule resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Operation to delete a schedule resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Schedule resource.
     *
     * @param name resource name.
     * @return the first stage of the new Schedule definition.
     */
    Schedule.DefinitionStages.Blank define(String name);
}
