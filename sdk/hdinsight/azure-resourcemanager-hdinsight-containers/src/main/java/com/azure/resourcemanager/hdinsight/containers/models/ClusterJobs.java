// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterJobInner;

/**
 * Resource collection API of ClusterJobs.
 */
public interface ClusterJobs {
    /**
     * Operations on jobs of HDInsight on AKS cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param clusterJob The Cluster job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster job.
     */
    ClusterJob runJob(String resourceGroupName, String clusterPoolName, String clusterName, ClusterJobInner clusterJob);

    /**
     * Operations on jobs of HDInsight on AKS cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param clusterJob The Cluster job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster job.
     */
    ClusterJob runJob(String resourceGroupName, String clusterPoolName, String clusterName, ClusterJobInner clusterJob,
        Context context);

    /**
     * Get jobs of HDInsight on AKS cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return jobs of HDInsight on AKS cluster as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ClusterJob> list(String resourceGroupName, String clusterPoolName, String clusterName);

    /**
     * Get jobs of HDInsight on AKS cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param filter The system query option to filter job returned in the response. Allowed value is 'jobName eq
     * {jobName}' or 'jarName eq {jarName}'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return jobs of HDInsight on AKS cluster as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ClusterJob> list(String resourceGroupName, String clusterPoolName, String clusterName, String filter,
        Context context);
}
