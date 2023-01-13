// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.ComputePolicyInner;
import java.util.UUID;

/** An immutable client-side representation of ComputePolicy. */
public interface ComputePolicy {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the objectId property: The AAD object identifier for the entity to create a policy for.
     *
     * @return the objectId value.
     */
    UUID objectId();

    /**
     * Gets the objectType property: The type of AAD object the object identifier refers to.
     *
     * @return the objectType value.
     */
    AadObjectType objectType();

    /**
     * Gets the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs.
     *
     * @return the maxDegreeOfParallelismPerJob value.
     */
    Integer maxDegreeOfParallelismPerJob();

    /**
     * Gets the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs.
     *
     * @return the minPriorityPerJob value.
     */
    Integer minPriorityPerJob();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.datalakeanalytics.fluent.models.ComputePolicyInner object.
     *
     * @return the inner object.
     */
    ComputePolicyInner innerModel();

    /** The entirety of the ComputePolicy definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithObjectId,
            DefinitionStages.WithObjectType,
            DefinitionStages.WithCreate {
    }
    /** The ComputePolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the ComputePolicy definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ComputePolicy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the Azure resource group.
             * @param accountName The name of the Data Lake Analytics account.
             * @return the next definition stage.
             */
            WithObjectId withExistingAccount(String resourceGroupName, String accountName);
        }
        /** The stage of the ComputePolicy definition allowing to specify objectId. */
        interface WithObjectId {
            /**
             * Specifies the objectId property: The AAD object identifier for the entity to create a policy for..
             *
             * @param objectId The AAD object identifier for the entity to create a policy for.
             * @return the next definition stage.
             */
            WithObjectType withObjectId(UUID objectId);
        }
        /** The stage of the ComputePolicy definition allowing to specify objectType. */
        interface WithObjectType {
            /**
             * Specifies the objectType property: The type of AAD object the object identifier refers to..
             *
             * @param objectType The type of AAD object the object identifier refers to.
             * @return the next definition stage.
             */
            WithCreate withObjectType(AadObjectType objectType);
        }
        /**
         * The stage of the ComputePolicy definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithMaxDegreeOfParallelismPerJob, DefinitionStages.WithMinPriorityPerJob {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ComputePolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ComputePolicy create(Context context);
        }
        /** The stage of the ComputePolicy definition allowing to specify maxDegreeOfParallelismPerJob. */
        interface WithMaxDegreeOfParallelismPerJob {
            /**
             * Specifies the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user
             * can use to submit jobs. This property, the min priority per job property, or both must be passed..
             *
             * @param maxDegreeOfParallelismPerJob The maximum degree of parallelism per job this user can use to submit
             *     jobs. This property, the min priority per job property, or both must be passed.
             * @return the next definition stage.
             */
            WithCreate withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob);
        }
        /** The stage of the ComputePolicy definition allowing to specify minPriorityPerJob. */
        interface WithMinPriorityPerJob {
            /**
             * Specifies the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs.
             * This property, the max degree of parallelism per job property, or both must be passed..
             *
             * @param minPriorityPerJob The minimum priority per job this user can use to submit jobs. This property,
             *     the max degree of parallelism per job property, or both must be passed.
             * @return the next definition stage.
             */
            WithCreate withMinPriorityPerJob(Integer minPriorityPerJob);
        }
    }
    /**
     * Begins update for the ComputePolicy resource.
     *
     * @return the stage of resource update.
     */
    ComputePolicy.Update update();

    /** The template for ComputePolicy update. */
    interface Update
        extends UpdateStages.WithObjectId,
            UpdateStages.WithObjectType,
            UpdateStages.WithMaxDegreeOfParallelismPerJob,
            UpdateStages.WithMinPriorityPerJob {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ComputePolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ComputePolicy apply(Context context);
    }
    /** The ComputePolicy update stages. */
    interface UpdateStages {
        /** The stage of the ComputePolicy update allowing to specify objectId. */
        interface WithObjectId {
            /**
             * Specifies the objectId property: The AAD object identifier for the entity to create a policy for..
             *
             * @param objectId The AAD object identifier for the entity to create a policy for.
             * @return the next definition stage.
             */
            Update withObjectId(UUID objectId);
        }
        /** The stage of the ComputePolicy update allowing to specify objectType. */
        interface WithObjectType {
            /**
             * Specifies the objectType property: The type of AAD object the object identifier refers to..
             *
             * @param objectType The type of AAD object the object identifier refers to.
             * @return the next definition stage.
             */
            Update withObjectType(AadObjectType objectType);
        }
        /** The stage of the ComputePolicy update allowing to specify maxDegreeOfParallelismPerJob. */
        interface WithMaxDegreeOfParallelismPerJob {
            /**
             * Specifies the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user
             * can use to submit jobs. This property, the min priority per job property, or both must be passed..
             *
             * @param maxDegreeOfParallelismPerJob The maximum degree of parallelism per job this user can use to submit
             *     jobs. This property, the min priority per job property, or both must be passed.
             * @return the next definition stage.
             */
            Update withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob);
        }
        /** The stage of the ComputePolicy update allowing to specify minPriorityPerJob. */
        interface WithMinPriorityPerJob {
            /**
             * Specifies the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs.
             * This property, the max degree of parallelism per job property, or both must be passed..
             *
             * @param minPriorityPerJob The minimum priority per job this user can use to submit jobs. This property,
             *     the max degree of parallelism per job property, or both must be passed.
             * @return the next definition stage.
             */
            Update withMinPriorityPerJob(Integer minPriorityPerJob);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ComputePolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ComputePolicy refresh(Context context);
}
