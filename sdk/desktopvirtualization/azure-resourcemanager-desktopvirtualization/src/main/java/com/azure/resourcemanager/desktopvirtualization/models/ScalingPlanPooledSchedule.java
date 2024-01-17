// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanPooledScheduleInner;
import java.util.List;

/** An immutable client-side representation of ScalingPlanPooledSchedule. */
public interface ScalingPlanPooledSchedule {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the daysOfWeek property: Set of days of the week on which this schedule is active.
     *
     * @return the daysOfWeek value.
     */
    List<DayOfWeek> daysOfWeek();

    /**
     * Gets the rampUpStartTime property: Starting time for ramp up period.
     *
     * @return the rampUpStartTime value.
     */
    Time rampUpStartTime();

    /**
     * Gets the rampUpLoadBalancingAlgorithm property: Load balancing algorithm for ramp up period.
     *
     * @return the rampUpLoadBalancingAlgorithm value.
     */
    SessionHostLoadBalancingAlgorithm rampUpLoadBalancingAlgorithm();

    /**
     * Gets the rampUpMinimumHostsPct property: Minimum host percentage for ramp up period.
     *
     * @return the rampUpMinimumHostsPct value.
     */
    Integer rampUpMinimumHostsPct();

    /**
     * Gets the rampUpCapacityThresholdPct property: Capacity threshold for ramp up period.
     *
     * @return the rampUpCapacityThresholdPct value.
     */
    Integer rampUpCapacityThresholdPct();

    /**
     * Gets the peakStartTime property: Starting time for peak period.
     *
     * @return the peakStartTime value.
     */
    Time peakStartTime();

    /**
     * Gets the peakLoadBalancingAlgorithm property: Load balancing algorithm for peak period.
     *
     * @return the peakLoadBalancingAlgorithm value.
     */
    SessionHostLoadBalancingAlgorithm peakLoadBalancingAlgorithm();

    /**
     * Gets the rampDownStartTime property: Starting time for ramp down period.
     *
     * @return the rampDownStartTime value.
     */
    Time rampDownStartTime();

    /**
     * Gets the rampDownLoadBalancingAlgorithm property: Load balancing algorithm for ramp down period.
     *
     * @return the rampDownLoadBalancingAlgorithm value.
     */
    SessionHostLoadBalancingAlgorithm rampDownLoadBalancingAlgorithm();

    /**
     * Gets the rampDownMinimumHostsPct property: Minimum host percentage for ramp down period.
     *
     * @return the rampDownMinimumHostsPct value.
     */
    Integer rampDownMinimumHostsPct();

    /**
     * Gets the rampDownCapacityThresholdPct property: Capacity threshold for ramp down period.
     *
     * @return the rampDownCapacityThresholdPct value.
     */
    Integer rampDownCapacityThresholdPct();

    /**
     * Gets the rampDownForceLogoffUsers property: Should users be logged off forcefully from hosts.
     *
     * @return the rampDownForceLogoffUsers value.
     */
    Boolean rampDownForceLogoffUsers();

    /**
     * Gets the rampDownStopHostsWhen property: Specifies when to stop hosts during ramp down period.
     *
     * @return the rampDownStopHostsWhen value.
     */
    StopHostsWhen rampDownStopHostsWhen();

    /**
     * Gets the rampDownWaitTimeMinutes property: Number of minutes to wait to stop hosts during ramp down period.
     *
     * @return the rampDownWaitTimeMinutes value.
     */
    Integer rampDownWaitTimeMinutes();

    /**
     * Gets the rampDownNotificationMessage property: Notification message for users during ramp down period.
     *
     * @return the rampDownNotificationMessage value.
     */
    String rampDownNotificationMessage();

    /**
     * Gets the offPeakStartTime property: Starting time for off-peak period.
     *
     * @return the offPeakStartTime value.
     */
    Time offPeakStartTime();

    /**
     * Gets the offPeakLoadBalancingAlgorithm property: Load balancing algorithm for off-peak period.
     *
     * @return the offPeakLoadBalancingAlgorithm value.
     */
    SessionHostLoadBalancingAlgorithm offPeakLoadBalancingAlgorithm();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanPooledScheduleInner
     * object.
     *
     * @return the inner object.
     */
    ScalingPlanPooledScheduleInner innerModel();

    /** The entirety of the ScalingPlanPooledSchedule definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The ScalingPlanPooledSchedule definition stages. */
    interface DefinitionStages {
        /** The first stage of the ScalingPlanPooledSchedule definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, scalingPlanName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param scalingPlanName The name of the scaling plan.
             * @return the next definition stage.
             */
            WithCreate withExistingScalingPlan(String resourceGroupName, String scalingPlanName);
        }

        /**
         * The stage of the ScalingPlanPooledSchedule definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDaysOfWeek,
                DefinitionStages.WithRampUpStartTime,
                DefinitionStages.WithRampUpLoadBalancingAlgorithm,
                DefinitionStages.WithRampUpMinimumHostsPct,
                DefinitionStages.WithRampUpCapacityThresholdPct,
                DefinitionStages.WithPeakStartTime,
                DefinitionStages.WithPeakLoadBalancingAlgorithm,
                DefinitionStages.WithRampDownStartTime,
                DefinitionStages.WithRampDownLoadBalancingAlgorithm,
                DefinitionStages.WithRampDownMinimumHostsPct,
                DefinitionStages.WithRampDownCapacityThresholdPct,
                DefinitionStages.WithRampDownForceLogoffUsers,
                DefinitionStages.WithRampDownStopHostsWhen,
                DefinitionStages.WithRampDownWaitTimeMinutes,
                DefinitionStages.WithRampDownNotificationMessage,
                DefinitionStages.WithOffPeakStartTime,
                DefinitionStages.WithOffPeakLoadBalancingAlgorithm {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ScalingPlanPooledSchedule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ScalingPlanPooledSchedule create(Context context);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify daysOfWeek. */
        interface WithDaysOfWeek {
            /**
             * Specifies the daysOfWeek property: Set of days of the week on which this schedule is active..
             *
             * @param daysOfWeek Set of days of the week on which this schedule is active.
             * @return the next definition stage.
             */
            WithCreate withDaysOfWeek(List<DayOfWeek> daysOfWeek);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampUpStartTime. */
        interface WithRampUpStartTime {
            /**
             * Specifies the rampUpStartTime property: Starting time for ramp up period..
             *
             * @param rampUpStartTime Starting time for ramp up period.
             * @return the next definition stage.
             */
            WithCreate withRampUpStartTime(Time rampUpStartTime);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampUpLoadBalancingAlgorithm. */
        interface WithRampUpLoadBalancingAlgorithm {
            /**
             * Specifies the rampUpLoadBalancingAlgorithm property: Load balancing algorithm for ramp up period..
             *
             * @param rampUpLoadBalancingAlgorithm Load balancing algorithm for ramp up period.
             * @return the next definition stage.
             */
            WithCreate withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm rampUpLoadBalancingAlgorithm);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampUpMinimumHostsPct. */
        interface WithRampUpMinimumHostsPct {
            /**
             * Specifies the rampUpMinimumHostsPct property: Minimum host percentage for ramp up period..
             *
             * @param rampUpMinimumHostsPct Minimum host percentage for ramp up period.
             * @return the next definition stage.
             */
            WithCreate withRampUpMinimumHostsPct(Integer rampUpMinimumHostsPct);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampUpCapacityThresholdPct. */
        interface WithRampUpCapacityThresholdPct {
            /**
             * Specifies the rampUpCapacityThresholdPct property: Capacity threshold for ramp up period..
             *
             * @param rampUpCapacityThresholdPct Capacity threshold for ramp up period.
             * @return the next definition stage.
             */
            WithCreate withRampUpCapacityThresholdPct(Integer rampUpCapacityThresholdPct);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify peakStartTime. */
        interface WithPeakStartTime {
            /**
             * Specifies the peakStartTime property: Starting time for peak period..
             *
             * @param peakStartTime Starting time for peak period.
             * @return the next definition stage.
             */
            WithCreate withPeakStartTime(Time peakStartTime);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify peakLoadBalancingAlgorithm. */
        interface WithPeakLoadBalancingAlgorithm {
            /**
             * Specifies the peakLoadBalancingAlgorithm property: Load balancing algorithm for peak period..
             *
             * @param peakLoadBalancingAlgorithm Load balancing algorithm for peak period.
             * @return the next definition stage.
             */
            WithCreate withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm peakLoadBalancingAlgorithm);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampDownStartTime. */
        interface WithRampDownStartTime {
            /**
             * Specifies the rampDownStartTime property: Starting time for ramp down period..
             *
             * @param rampDownStartTime Starting time for ramp down period.
             * @return the next definition stage.
             */
            WithCreate withRampDownStartTime(Time rampDownStartTime);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampDownLoadBalancingAlgorithm. */
        interface WithRampDownLoadBalancingAlgorithm {
            /**
             * Specifies the rampDownLoadBalancingAlgorithm property: Load balancing algorithm for ramp down period..
             *
             * @param rampDownLoadBalancingAlgorithm Load balancing algorithm for ramp down period.
             * @return the next definition stage.
             */
            WithCreate withRampDownLoadBalancingAlgorithm(
                SessionHostLoadBalancingAlgorithm rampDownLoadBalancingAlgorithm);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampDownMinimumHostsPct. */
        interface WithRampDownMinimumHostsPct {
            /**
             * Specifies the rampDownMinimumHostsPct property: Minimum host percentage for ramp down period..
             *
             * @param rampDownMinimumHostsPct Minimum host percentage for ramp down period.
             * @return the next definition stage.
             */
            WithCreate withRampDownMinimumHostsPct(Integer rampDownMinimumHostsPct);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampDownCapacityThresholdPct. */
        interface WithRampDownCapacityThresholdPct {
            /**
             * Specifies the rampDownCapacityThresholdPct property: Capacity threshold for ramp down period..
             *
             * @param rampDownCapacityThresholdPct Capacity threshold for ramp down period.
             * @return the next definition stage.
             */
            WithCreate withRampDownCapacityThresholdPct(Integer rampDownCapacityThresholdPct);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampDownForceLogoffUsers. */
        interface WithRampDownForceLogoffUsers {
            /**
             * Specifies the rampDownForceLogoffUsers property: Should users be logged off forcefully from hosts..
             *
             * @param rampDownForceLogoffUsers Should users be logged off forcefully from hosts.
             * @return the next definition stage.
             */
            WithCreate withRampDownForceLogoffUsers(Boolean rampDownForceLogoffUsers);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampDownStopHostsWhen. */
        interface WithRampDownStopHostsWhen {
            /**
             * Specifies the rampDownStopHostsWhen property: Specifies when to stop hosts during ramp down period..
             *
             * @param rampDownStopHostsWhen Specifies when to stop hosts during ramp down period.
             * @return the next definition stage.
             */
            WithCreate withRampDownStopHostsWhen(StopHostsWhen rampDownStopHostsWhen);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampDownWaitTimeMinutes. */
        interface WithRampDownWaitTimeMinutes {
            /**
             * Specifies the rampDownWaitTimeMinutes property: Number of minutes to wait to stop hosts during ramp down
             * period..
             *
             * @param rampDownWaitTimeMinutes Number of minutes to wait to stop hosts during ramp down period.
             * @return the next definition stage.
             */
            WithCreate withRampDownWaitTimeMinutes(Integer rampDownWaitTimeMinutes);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify rampDownNotificationMessage. */
        interface WithRampDownNotificationMessage {
            /**
             * Specifies the rampDownNotificationMessage property: Notification message for users during ramp down
             * period..
             *
             * @param rampDownNotificationMessage Notification message for users during ramp down period.
             * @return the next definition stage.
             */
            WithCreate withRampDownNotificationMessage(String rampDownNotificationMessage);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify offPeakStartTime. */
        interface WithOffPeakStartTime {
            /**
             * Specifies the offPeakStartTime property: Starting time for off-peak period..
             *
             * @param offPeakStartTime Starting time for off-peak period.
             * @return the next definition stage.
             */
            WithCreate withOffPeakStartTime(Time offPeakStartTime);
        }

        /** The stage of the ScalingPlanPooledSchedule definition allowing to specify offPeakLoadBalancingAlgorithm. */
        interface WithOffPeakLoadBalancingAlgorithm {
            /**
             * Specifies the offPeakLoadBalancingAlgorithm property: Load balancing algorithm for off-peak period..
             *
             * @param offPeakLoadBalancingAlgorithm Load balancing algorithm for off-peak period.
             * @return the next definition stage.
             */
            WithCreate withOffPeakLoadBalancingAlgorithm(
                SessionHostLoadBalancingAlgorithm offPeakLoadBalancingAlgorithm);
        }
    }

    /**
     * Begins update for the ScalingPlanPooledSchedule resource.
     *
     * @return the stage of resource update.
     */
    ScalingPlanPooledSchedule.Update update();

    /** The template for ScalingPlanPooledSchedule update. */
    interface Update
        extends UpdateStages.WithDaysOfWeek,
            UpdateStages.WithRampUpStartTime,
            UpdateStages.WithRampUpLoadBalancingAlgorithm,
            UpdateStages.WithRampUpMinimumHostsPct,
            UpdateStages.WithRampUpCapacityThresholdPct,
            UpdateStages.WithPeakStartTime,
            UpdateStages.WithPeakLoadBalancingAlgorithm,
            UpdateStages.WithRampDownStartTime,
            UpdateStages.WithRampDownLoadBalancingAlgorithm,
            UpdateStages.WithRampDownMinimumHostsPct,
            UpdateStages.WithRampDownCapacityThresholdPct,
            UpdateStages.WithRampDownForceLogoffUsers,
            UpdateStages.WithRampDownStopHostsWhen,
            UpdateStages.WithRampDownWaitTimeMinutes,
            UpdateStages.WithRampDownNotificationMessage,
            UpdateStages.WithOffPeakStartTime,
            UpdateStages.WithOffPeakLoadBalancingAlgorithm {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ScalingPlanPooledSchedule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ScalingPlanPooledSchedule apply(Context context);
    }

    /** The ScalingPlanPooledSchedule update stages. */
    interface UpdateStages {
        /** The stage of the ScalingPlanPooledSchedule update allowing to specify daysOfWeek. */
        interface WithDaysOfWeek {
            /**
             * Specifies the daysOfWeek property: Set of days of the week on which this schedule is active..
             *
             * @param daysOfWeek Set of days of the week on which this schedule is active.
             * @return the next definition stage.
             */
            Update withDaysOfWeek(List<DayOfWeek> daysOfWeek);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampUpStartTime. */
        interface WithRampUpStartTime {
            /**
             * Specifies the rampUpStartTime property: Starting time for ramp up period..
             *
             * @param rampUpStartTime Starting time for ramp up period.
             * @return the next definition stage.
             */
            Update withRampUpStartTime(Time rampUpStartTime);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampUpLoadBalancingAlgorithm. */
        interface WithRampUpLoadBalancingAlgorithm {
            /**
             * Specifies the rampUpLoadBalancingAlgorithm property: Load balancing algorithm for ramp up period..
             *
             * @param rampUpLoadBalancingAlgorithm Load balancing algorithm for ramp up period.
             * @return the next definition stage.
             */
            Update withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm rampUpLoadBalancingAlgorithm);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampUpMinimumHostsPct. */
        interface WithRampUpMinimumHostsPct {
            /**
             * Specifies the rampUpMinimumHostsPct property: Minimum host percentage for ramp up period..
             *
             * @param rampUpMinimumHostsPct Minimum host percentage for ramp up period.
             * @return the next definition stage.
             */
            Update withRampUpMinimumHostsPct(Integer rampUpMinimumHostsPct);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampUpCapacityThresholdPct. */
        interface WithRampUpCapacityThresholdPct {
            /**
             * Specifies the rampUpCapacityThresholdPct property: Capacity threshold for ramp up period..
             *
             * @param rampUpCapacityThresholdPct Capacity threshold for ramp up period.
             * @return the next definition stage.
             */
            Update withRampUpCapacityThresholdPct(Integer rampUpCapacityThresholdPct);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify peakStartTime. */
        interface WithPeakStartTime {
            /**
             * Specifies the peakStartTime property: Starting time for peak period..
             *
             * @param peakStartTime Starting time for peak period.
             * @return the next definition stage.
             */
            Update withPeakStartTime(Time peakStartTime);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify peakLoadBalancingAlgorithm. */
        interface WithPeakLoadBalancingAlgorithm {
            /**
             * Specifies the peakLoadBalancingAlgorithm property: Load balancing algorithm for peak period..
             *
             * @param peakLoadBalancingAlgorithm Load balancing algorithm for peak period.
             * @return the next definition stage.
             */
            Update withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm peakLoadBalancingAlgorithm);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampDownStartTime. */
        interface WithRampDownStartTime {
            /**
             * Specifies the rampDownStartTime property: Starting time for ramp down period..
             *
             * @param rampDownStartTime Starting time for ramp down period.
             * @return the next definition stage.
             */
            Update withRampDownStartTime(Time rampDownStartTime);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampDownLoadBalancingAlgorithm. */
        interface WithRampDownLoadBalancingAlgorithm {
            /**
             * Specifies the rampDownLoadBalancingAlgorithm property: Load balancing algorithm for ramp down period..
             *
             * @param rampDownLoadBalancingAlgorithm Load balancing algorithm for ramp down period.
             * @return the next definition stage.
             */
            Update withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm rampDownLoadBalancingAlgorithm);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampDownMinimumHostsPct. */
        interface WithRampDownMinimumHostsPct {
            /**
             * Specifies the rampDownMinimumHostsPct property: Minimum host percentage for ramp down period..
             *
             * @param rampDownMinimumHostsPct Minimum host percentage for ramp down period.
             * @return the next definition stage.
             */
            Update withRampDownMinimumHostsPct(Integer rampDownMinimumHostsPct);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampDownCapacityThresholdPct. */
        interface WithRampDownCapacityThresholdPct {
            /**
             * Specifies the rampDownCapacityThresholdPct property: Capacity threshold for ramp down period..
             *
             * @param rampDownCapacityThresholdPct Capacity threshold for ramp down period.
             * @return the next definition stage.
             */
            Update withRampDownCapacityThresholdPct(Integer rampDownCapacityThresholdPct);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampDownForceLogoffUsers. */
        interface WithRampDownForceLogoffUsers {
            /**
             * Specifies the rampDownForceLogoffUsers property: Should users be logged off forcefully from hosts..
             *
             * @param rampDownForceLogoffUsers Should users be logged off forcefully from hosts.
             * @return the next definition stage.
             */
            Update withRampDownForceLogoffUsers(Boolean rampDownForceLogoffUsers);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampDownStopHostsWhen. */
        interface WithRampDownStopHostsWhen {
            /**
             * Specifies the rampDownStopHostsWhen property: Specifies when to stop hosts during ramp down period..
             *
             * @param rampDownStopHostsWhen Specifies when to stop hosts during ramp down period.
             * @return the next definition stage.
             */
            Update withRampDownStopHostsWhen(StopHostsWhen rampDownStopHostsWhen);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampDownWaitTimeMinutes. */
        interface WithRampDownWaitTimeMinutes {
            /**
             * Specifies the rampDownWaitTimeMinutes property: Number of minutes to wait to stop hosts during ramp down
             * period..
             *
             * @param rampDownWaitTimeMinutes Number of minutes to wait to stop hosts during ramp down period.
             * @return the next definition stage.
             */
            Update withRampDownWaitTimeMinutes(Integer rampDownWaitTimeMinutes);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify rampDownNotificationMessage. */
        interface WithRampDownNotificationMessage {
            /**
             * Specifies the rampDownNotificationMessage property: Notification message for users during ramp down
             * period..
             *
             * @param rampDownNotificationMessage Notification message for users during ramp down period.
             * @return the next definition stage.
             */
            Update withRampDownNotificationMessage(String rampDownNotificationMessage);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify offPeakStartTime. */
        interface WithOffPeakStartTime {
            /**
             * Specifies the offPeakStartTime property: Starting time for off-peak period..
             *
             * @param offPeakStartTime Starting time for off-peak period.
             * @return the next definition stage.
             */
            Update withOffPeakStartTime(Time offPeakStartTime);
        }

        /** The stage of the ScalingPlanPooledSchedule update allowing to specify offPeakLoadBalancingAlgorithm. */
        interface WithOffPeakLoadBalancingAlgorithm {
            /**
             * Specifies the offPeakLoadBalancingAlgorithm property: Load balancing algorithm for off-peak period..
             *
             * @param offPeakLoadBalancingAlgorithm Load balancing algorithm for off-peak period.
             * @return the next definition stage.
             */
            Update withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm offPeakLoadBalancingAlgorithm);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ScalingPlanPooledSchedule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ScalingPlanPooledSchedule refresh(Context context);
}
