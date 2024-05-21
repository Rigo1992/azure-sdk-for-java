// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservicefleet.fluent.models.UpdateRunInner;

/**
 * An immutable client-side representation of UpdateRun.
 */
public interface UpdateRun {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: If eTag is provided in the response body, it may also be provided as a header per the
     * normal etag convention. Entity tags are used for comparing two or more entities from the same requested resource.
     * HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26),
     * and If-Range (section 14.27) header fields.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the UpdateRun resource.
     * 
     * @return the provisioningState value.
     */
    UpdateRunProvisioningState provisioningState();

    /**
     * Gets the updateStrategyId property: The resource id of the FleetUpdateStrategy resource to reference.
     * 
     * When creating a new run, there are three ways to define a strategy for the run:
     * 1. Define a new strategy in place: Set the "strategy" field.
     * 2. Use an existing strategy: Set the "updateStrategyId" field. (since 2023-08-15-preview)
     * 3. Use the default strategy to update all the members one by one: Leave both "updateStrategyId" and "strategy"
     * unset. (since 2023-08-15-preview)
     * 
     * Setting both "updateStrategyId" and "strategy" is invalid.
     * 
     * UpdateRuns created by "updateStrategyId" snapshot the referenced UpdateStrategy at the time of creation and store
     * it in the "strategy" field.
     * Subsequent changes to the referenced FleetUpdateStrategy resource do not propagate.
     * UpdateRunStrategy changes can be made directly on the "strategy" field before launching the UpdateRun.
     * 
     * @return the updateStrategyId value.
     */
    String updateStrategyId();

    /**
     * Gets the strategy property: The strategy defines the order in which the clusters will be updated.
     * If not set, all members will be updated sequentially. The UpdateRun status will show a single UpdateStage and a
     * single UpdateGroup targeting all members.
     * The strategy of the UpdateRun can be modified until the run is started.
     * 
     * @return the strategy value.
     */
    UpdateRunStrategy strategy();

    /**
     * Gets the managedClusterUpdate property: The update to be applied to all clusters in the UpdateRun. The
     * managedClusterUpdate can be modified until the run is started.
     * 
     * @return the managedClusterUpdate value.
     */
    ManagedClusterUpdate managedClusterUpdate();

    /**
     * Gets the status property: The status of the UpdateRun.
     * 
     * @return the status value.
     */
    UpdateRunStatus status();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.containerservicefleet.fluent.models.UpdateRunInner object.
     * 
     * @return the inner object.
     */
    UpdateRunInner innerModel();

    /**
     * The entirety of the UpdateRun definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The UpdateRun definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the UpdateRun definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the UpdateRun definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, fleetName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param fleetName The name of the Fleet resource.
             * @return the next definition stage.
             */
            WithCreate withExistingFleet(String resourceGroupName, String fleetName);
        }

        /**
         * The stage of the UpdateRun definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithUpdateStrategyId, DefinitionStages.WithStrategy,
            DefinitionStages.WithManagedClusterUpdate, DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            UpdateRun create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            UpdateRun create(Context context);
        }

        /**
         * The stage of the UpdateRun definition allowing to specify updateStrategyId.
         */
        interface WithUpdateStrategyId {
            /**
             * Specifies the updateStrategyId property: The resource id of the FleetUpdateStrategy resource to
             * reference.
             * 
             * When creating a new run, there are three ways to define a strategy for the run:
             * 1. Define a new strategy in place: Set the "strategy" field.
             * 2. Use an existing strategy: Set the "updateStrategyId" field. (since 2023-08-15-preview)
             * 3. Use the default strategy to update all the members one by one: Leave both "updateStrategyId" and
             * "strategy" unset. (since 2023-08-15-preview)
             * 
             * Setting both "updateStrategyId" and "strategy" is invalid.
             * 
             * UpdateRuns created by "updateStrategyId" snapshot the referenced UpdateStrategy at the time of creation
             * and store it in the "strategy" field.
             * Subsequent changes to the referenced FleetUpdateStrategy resource do not propagate.
             * UpdateRunStrategy changes can be made directly on the "strategy" field before launching the UpdateRun..
             * 
             * @param updateStrategyId The resource id of the FleetUpdateStrategy resource to reference.
             * 
             * When creating a new run, there are three ways to define a strategy for the run:
             * 1. Define a new strategy in place: Set the "strategy" field.
             * 2. Use an existing strategy: Set the "updateStrategyId" field. (since 2023-08-15-preview)
             * 3. Use the default strategy to update all the members one by one: Leave both "updateStrategyId" and
             * "strategy" unset. (since 2023-08-15-preview)
             * 
             * Setting both "updateStrategyId" and "strategy" is invalid.
             * 
             * UpdateRuns created by "updateStrategyId" snapshot the referenced UpdateStrategy at the time of creation
             * and store it in the "strategy" field.
             * Subsequent changes to the referenced FleetUpdateStrategy resource do not propagate.
             * UpdateRunStrategy changes can be made directly on the "strategy" field before launching the UpdateRun.
             * @return the next definition stage.
             */
            WithCreate withUpdateStrategyId(String updateStrategyId);
        }

        /**
         * The stage of the UpdateRun definition allowing to specify strategy.
         */
        interface WithStrategy {
            /**
             * Specifies the strategy property: The strategy defines the order in which the clusters will be updated.
             * If not set, all members will be updated sequentially. The UpdateRun status will show a single UpdateStage
             * and a single UpdateGroup targeting all members.
             * The strategy of the UpdateRun can be modified until the run is started..
             * 
             * @param strategy The strategy defines the order in which the clusters will be updated.
             * If not set, all members will be updated sequentially. The UpdateRun status will show a single UpdateStage
             * and a single UpdateGroup targeting all members.
             * The strategy of the UpdateRun can be modified until the run is started.
             * @return the next definition stage.
             */
            WithCreate withStrategy(UpdateRunStrategy strategy);
        }

        /**
         * The stage of the UpdateRun definition allowing to specify managedClusterUpdate.
         */
        interface WithManagedClusterUpdate {
            /**
             * Specifies the managedClusterUpdate property: The update to be applied to all clusters in the UpdateRun.
             * The managedClusterUpdate can be modified until the run is started..
             * 
             * @param managedClusterUpdate The update to be applied to all clusters in the UpdateRun. The
             * managedClusterUpdate can be modified until the run is started.
             * @return the next definition stage.
             */
            WithCreate withManagedClusterUpdate(ManagedClusterUpdate managedClusterUpdate);
        }

        /**
         * The stage of the UpdateRun definition allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The request should only proceed if an entity matches this string..
             * 
             * @param ifMatch The request should only proceed if an entity matches this string.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }

        /**
         * The stage of the UpdateRun definition allowing to specify ifNoneMatch.
         */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: The request should only proceed if no entity matches this string..
             * 
             * @param ifNoneMatch The request should only proceed if no entity matches this string.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Begins update for the UpdateRun resource.
     * 
     * @return the stage of resource update.
     */
    UpdateRun.Update update();

    /**
     * The template for UpdateRun update.
     */
    interface Update extends UpdateStages.WithUpdateStrategyId, UpdateStages.WithStrategy,
        UpdateStages.WithManagedClusterUpdate, UpdateStages.WithIfMatch, UpdateStages.WithIfNoneMatch {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        UpdateRun apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        UpdateRun apply(Context context);
    }

    /**
     * The UpdateRun update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the UpdateRun update allowing to specify updateStrategyId.
         */
        interface WithUpdateStrategyId {
            /**
             * Specifies the updateStrategyId property: The resource id of the FleetUpdateStrategy resource to
             * reference.
             * 
             * When creating a new run, there are three ways to define a strategy for the run:
             * 1. Define a new strategy in place: Set the "strategy" field.
             * 2. Use an existing strategy: Set the "updateStrategyId" field. (since 2023-08-15-preview)
             * 3. Use the default strategy to update all the members one by one: Leave both "updateStrategyId" and
             * "strategy" unset. (since 2023-08-15-preview)
             * 
             * Setting both "updateStrategyId" and "strategy" is invalid.
             * 
             * UpdateRuns created by "updateStrategyId" snapshot the referenced UpdateStrategy at the time of creation
             * and store it in the "strategy" field.
             * Subsequent changes to the referenced FleetUpdateStrategy resource do not propagate.
             * UpdateRunStrategy changes can be made directly on the "strategy" field before launching the UpdateRun..
             * 
             * @param updateStrategyId The resource id of the FleetUpdateStrategy resource to reference.
             * 
             * When creating a new run, there are three ways to define a strategy for the run:
             * 1. Define a new strategy in place: Set the "strategy" field.
             * 2. Use an existing strategy: Set the "updateStrategyId" field. (since 2023-08-15-preview)
             * 3. Use the default strategy to update all the members one by one: Leave both "updateStrategyId" and
             * "strategy" unset. (since 2023-08-15-preview)
             * 
             * Setting both "updateStrategyId" and "strategy" is invalid.
             * 
             * UpdateRuns created by "updateStrategyId" snapshot the referenced UpdateStrategy at the time of creation
             * and store it in the "strategy" field.
             * Subsequent changes to the referenced FleetUpdateStrategy resource do not propagate.
             * UpdateRunStrategy changes can be made directly on the "strategy" field before launching the UpdateRun.
             * @return the next definition stage.
             */
            Update withUpdateStrategyId(String updateStrategyId);
        }

        /**
         * The stage of the UpdateRun update allowing to specify strategy.
         */
        interface WithStrategy {
            /**
             * Specifies the strategy property: The strategy defines the order in which the clusters will be updated.
             * If not set, all members will be updated sequentially. The UpdateRun status will show a single UpdateStage
             * and a single UpdateGroup targeting all members.
             * The strategy of the UpdateRun can be modified until the run is started..
             * 
             * @param strategy The strategy defines the order in which the clusters will be updated.
             * If not set, all members will be updated sequentially. The UpdateRun status will show a single UpdateStage
             * and a single UpdateGroup targeting all members.
             * The strategy of the UpdateRun can be modified until the run is started.
             * @return the next definition stage.
             */
            Update withStrategy(UpdateRunStrategy strategy);
        }

        /**
         * The stage of the UpdateRun update allowing to specify managedClusterUpdate.
         */
        interface WithManagedClusterUpdate {
            /**
             * Specifies the managedClusterUpdate property: The update to be applied to all clusters in the UpdateRun.
             * The managedClusterUpdate can be modified until the run is started..
             * 
             * @param managedClusterUpdate The update to be applied to all clusters in the UpdateRun. The
             * managedClusterUpdate can be modified until the run is started.
             * @return the next definition stage.
             */
            Update withManagedClusterUpdate(ManagedClusterUpdate managedClusterUpdate);
        }

        /**
         * The stage of the UpdateRun update allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The request should only proceed if an entity matches this string..
             * 
             * @param ifMatch The request should only proceed if an entity matches this string.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the UpdateRun update allowing to specify ifNoneMatch.
         */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: The request should only proceed if no entity matches this string..
             * 
             * @param ifNoneMatch The request should only proceed if no entity matches this string.
             * @return the next definition stage.
             */
            Update withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    UpdateRun refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    UpdateRun refresh(Context context);

    /**
     * Skips one or a combination of member/group/stage/afterStageWait(s) of an update run.
     * 
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a multi-stage process to perform update operations across members of a Fleet.
     */
    UpdateRun skip(SkipProperties body);

    /**
     * Skips one or a combination of member/group/stage/afterStageWait(s) of an update run.
     * 
     * @param body The content of the action request.
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a multi-stage process to perform update operations across members of a Fleet.
     */
    UpdateRun skip(SkipProperties body, String ifMatch, Context context);

    /**
     * Starts an UpdateRun.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a multi-stage process to perform update operations across members of a Fleet.
     */
    UpdateRun start();

    /**
     * Starts an UpdateRun.
     * 
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a multi-stage process to perform update operations across members of a Fleet.
     */
    UpdateRun start(String ifMatch, Context context);

    /**
     * Stops an UpdateRun.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a multi-stage process to perform update operations across members of a Fleet.
     */
    UpdateRun stop();

    /**
     * Stops an UpdateRun.
     * 
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a multi-stage process to perform update operations across members of a Fleet.
     */
    UpdateRun stop(String ifMatch, Context context);
}
