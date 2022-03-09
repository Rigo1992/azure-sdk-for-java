// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters to be applied to the cluster-autoscaler when enabled. */
@Fluent
public final class ManagedClusterPropertiesAutoScalerProfile {
    /*
     * Detects similar node pools and balances the number of nodes between
     * them. Valid values are 'true' and 'false'
     */
    @JsonProperty(value = "balance-similar-node-groups")
    private String balanceSimilarNodeGroups;

    /*
     * The expander to use when scaling up If not specified, the default is
     * 'random'. See
     * [expanders](https://github.com/kubernetes/autoscaler/blob/master/cluster-autoscaler/FAQ.md#what-are-expanders)
     * for more information.
     */
    @JsonProperty(value = "expander")
    private Expander expander;

    /*
     * The maximum number of empty nodes that can be deleted at the same time.
     * This must be a positive integer. The default is 10.
     */
    @JsonProperty(value = "max-empty-bulk-delete")
    private String maxEmptyBulkDelete;

    /*
     * The maximum number of seconds the cluster autoscaler waits for pod
     * termination when trying to scale down a node. The default is 600.
     */
    @JsonProperty(value = "max-graceful-termination-sec")
    private String maxGracefulTerminationSec;

    /*
     * The maximum time the autoscaler waits for a node to be provisioned. The
     * default is '15m'. Values must be an integer followed by an 'm'. No unit
     * of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "max-node-provision-time")
    private String maxNodeProvisionTime;

    /*
     * The maximum percentage of unready nodes in the cluster. After this
     * percentage is exceeded, cluster autoscaler halts operations. The default
     * is 45. The maximum is 100 and the minimum is 0.
     */
    @JsonProperty(value = "max-total-unready-percentage")
    private String maxTotalUnreadyPercentage;

    /*
     * Ignore unscheduled pods before they're a certain age. For scenarios like
     * burst/batch scale where you don't want CA to act before the kubernetes
     * scheduler could schedule all the pods, you can tell CA to ignore
     * unscheduled pods before they're a certain age. The default is '0s'.
     * Values must be an integer followed by a unit ('s' for seconds, 'm' for
     * minutes, 'h' for hours, etc).
     */
    @JsonProperty(value = "new-pod-scale-up-delay")
    private String newPodScaleUpDelay;

    /*
     * The number of allowed unready nodes, irrespective of
     * max-total-unready-percentage. This must be an integer. The default is 3.
     */
    @JsonProperty(value = "ok-total-unready-count")
    private String okTotalUnreadyCount;

    /*
     * How often cluster is reevaluated for scale up or down. The default is
     * '10'. Values must be an integer number of seconds.
     */
    @JsonProperty(value = "scan-interval")
    private String scanInterval;

    /*
     * How long after scale up that scale down evaluation resumes The default
     * is '10m'. Values must be an integer followed by an 'm'. No unit of time
     * other than minutes (m) is supported.
     */
    @JsonProperty(value = "scale-down-delay-after-add")
    private String scaleDownDelayAfterAdd;

    /*
     * How long after node deletion that scale down evaluation resumes. The
     * default is the scan-interval. Values must be an integer followed by an
     * 'm'. No unit of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "scale-down-delay-after-delete")
    private String scaleDownDelayAfterDelete;

    /*
     * How long after scale down failure that scale down evaluation resumes.
     * The default is '3m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "scale-down-delay-after-failure")
    private String scaleDownDelayAfterFailure;

    /*
     * How long a node should be unneeded before it is eligible for scale down.
     * The default is '10m'. Values must be an integer followed by an 'm'. No
     * unit of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "scale-down-unneeded-time")
    private String scaleDownUnneededTime;

    /*
     * How long an unready node should be unneeded before it is eligible for
     * scale down The default is '20m'. Values must be an integer followed by
     * an 'm'. No unit of time other than minutes (m) is supported.
     */
    @JsonProperty(value = "scale-down-unready-time")
    private String scaleDownUnreadyTime;

    /*
     * Node utilization level, defined as sum of requested resources divided by
     * capacity, below which a node can be considered for scale down. The
     * default is '0.5'.
     */
    @JsonProperty(value = "scale-down-utilization-threshold")
    private String scaleDownUtilizationThreshold;

    /*
     * If cluster autoscaler will skip deleting nodes with pods with local
     * storage, for example, EmptyDir or HostPath. The default is true.
     */
    @JsonProperty(value = "skip-nodes-with-local-storage")
    private String skipNodesWithLocalStorage;

    /*
     * If cluster autoscaler will skip deleting nodes with pods from
     * kube-system (except for DaemonSet or mirror pods) The default is true.
     */
    @JsonProperty(value = "skip-nodes-with-system-pods")
    private String skipNodesWithSystemPods;

    /**
     * Get the balanceSimilarNodeGroups property: Detects similar node pools and balances the number of nodes between
     * them. Valid values are 'true' and 'false'.
     *
     * @return the balanceSimilarNodeGroups value.
     */
    public String balanceSimilarNodeGroups() {
        return this.balanceSimilarNodeGroups;
    }

    /**
     * Set the balanceSimilarNodeGroups property: Detects similar node pools and balances the number of nodes between
     * them. Valid values are 'true' and 'false'.
     *
     * @param balanceSimilarNodeGroups the balanceSimilarNodeGroups value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withBalanceSimilarNodeGroups(String balanceSimilarNodeGroups) {
        this.balanceSimilarNodeGroups = balanceSimilarNodeGroups;
        return this;
    }

    /**
     * Get the expander property: The expander to use when scaling up If not specified, the default is 'random'. See
     * [expanders](https://github.com/kubernetes/autoscaler/blob/master/cluster-autoscaler/FAQ.md#what-are-expanders)
     * for more information.
     *
     * @return the expander value.
     */
    public Expander expander() {
        return this.expander;
    }

    /**
     * Set the expander property: The expander to use when scaling up If not specified, the default is 'random'. See
     * [expanders](https://github.com/kubernetes/autoscaler/blob/master/cluster-autoscaler/FAQ.md#what-are-expanders)
     * for more information.
     *
     * @param expander the expander value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withExpander(Expander expander) {
        this.expander = expander;
        return this;
    }

    /**
     * Get the maxEmptyBulkDelete property: The maximum number of empty nodes that can be deleted at the same time. This
     * must be a positive integer. The default is 10.
     *
     * @return the maxEmptyBulkDelete value.
     */
    public String maxEmptyBulkDelete() {
        return this.maxEmptyBulkDelete;
    }

    /**
     * Set the maxEmptyBulkDelete property: The maximum number of empty nodes that can be deleted at the same time. This
     * must be a positive integer. The default is 10.
     *
     * @param maxEmptyBulkDelete the maxEmptyBulkDelete value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxEmptyBulkDelete(String maxEmptyBulkDelete) {
        this.maxEmptyBulkDelete = maxEmptyBulkDelete;
        return this;
    }

    /**
     * Get the maxGracefulTerminationSec property: The maximum number of seconds the cluster autoscaler waits for pod
     * termination when trying to scale down a node. The default is 600.
     *
     * @return the maxGracefulTerminationSec value.
     */
    public String maxGracefulTerminationSec() {
        return this.maxGracefulTerminationSec;
    }

    /**
     * Set the maxGracefulTerminationSec property: The maximum number of seconds the cluster autoscaler waits for pod
     * termination when trying to scale down a node. The default is 600.
     *
     * @param maxGracefulTerminationSec the maxGracefulTerminationSec value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxGracefulTerminationSec(String maxGracefulTerminationSec) {
        this.maxGracefulTerminationSec = maxGracefulTerminationSec;
        return this;
    }

    /**
     * Get the maxNodeProvisionTime property: The maximum time the autoscaler waits for a node to be provisioned. The
     * default is '15m'. Values must be an integer followed by an 'm'. No unit of time other than minutes (m) is
     * supported.
     *
     * @return the maxNodeProvisionTime value.
     */
    public String maxNodeProvisionTime() {
        return this.maxNodeProvisionTime;
    }

    /**
     * Set the maxNodeProvisionTime property: The maximum time the autoscaler waits for a node to be provisioned. The
     * default is '15m'. Values must be an integer followed by an 'm'. No unit of time other than minutes (m) is
     * supported.
     *
     * @param maxNodeProvisionTime the maxNodeProvisionTime value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxNodeProvisionTime(String maxNodeProvisionTime) {
        this.maxNodeProvisionTime = maxNodeProvisionTime;
        return this;
    }

    /**
     * Get the maxTotalUnreadyPercentage property: The maximum percentage of unready nodes in the cluster. After this
     * percentage is exceeded, cluster autoscaler halts operations. The default is 45. The maximum is 100 and the
     * minimum is 0.
     *
     * @return the maxTotalUnreadyPercentage value.
     */
    public String maxTotalUnreadyPercentage() {
        return this.maxTotalUnreadyPercentage;
    }

    /**
     * Set the maxTotalUnreadyPercentage property: The maximum percentage of unready nodes in the cluster. After this
     * percentage is exceeded, cluster autoscaler halts operations. The default is 45. The maximum is 100 and the
     * minimum is 0.
     *
     * @param maxTotalUnreadyPercentage the maxTotalUnreadyPercentage value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxTotalUnreadyPercentage(String maxTotalUnreadyPercentage) {
        this.maxTotalUnreadyPercentage = maxTotalUnreadyPercentage;
        return this;
    }

    /**
     * Get the newPodScaleUpDelay property: Ignore unscheduled pods before they're a certain age. For scenarios like
     * burst/batch scale where you don't want CA to act before the kubernetes scheduler could schedule all the pods, you
     * can tell CA to ignore unscheduled pods before they're a certain age. The default is '0s'. Values must be an
     * integer followed by a unit ('s' for seconds, 'm' for minutes, 'h' for hours, etc).
     *
     * @return the newPodScaleUpDelay value.
     */
    public String newPodScaleUpDelay() {
        return this.newPodScaleUpDelay;
    }

    /**
     * Set the newPodScaleUpDelay property: Ignore unscheduled pods before they're a certain age. For scenarios like
     * burst/batch scale where you don't want CA to act before the kubernetes scheduler could schedule all the pods, you
     * can tell CA to ignore unscheduled pods before they're a certain age. The default is '0s'. Values must be an
     * integer followed by a unit ('s' for seconds, 'm' for minutes, 'h' for hours, etc).
     *
     * @param newPodScaleUpDelay the newPodScaleUpDelay value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withNewPodScaleUpDelay(String newPodScaleUpDelay) {
        this.newPodScaleUpDelay = newPodScaleUpDelay;
        return this;
    }

    /**
     * Get the okTotalUnreadyCount property: The number of allowed unready nodes, irrespective of
     * max-total-unready-percentage. This must be an integer. The default is 3.
     *
     * @return the okTotalUnreadyCount value.
     */
    public String okTotalUnreadyCount() {
        return this.okTotalUnreadyCount;
    }

    /**
     * Set the okTotalUnreadyCount property: The number of allowed unready nodes, irrespective of
     * max-total-unready-percentage. This must be an integer. The default is 3.
     *
     * @param okTotalUnreadyCount the okTotalUnreadyCount value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withOkTotalUnreadyCount(String okTotalUnreadyCount) {
        this.okTotalUnreadyCount = okTotalUnreadyCount;
        return this;
    }

    /**
     * Get the scanInterval property: How often cluster is reevaluated for scale up or down. The default is '10'. Values
     * must be an integer number of seconds.
     *
     * @return the scanInterval value.
     */
    public String scanInterval() {
        return this.scanInterval;
    }

    /**
     * Set the scanInterval property: How often cluster is reevaluated for scale up or down. The default is '10'. Values
     * must be an integer number of seconds.
     *
     * @param scanInterval the scanInterval value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScanInterval(String scanInterval) {
        this.scanInterval = scanInterval;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterAdd property: How long after scale up that scale down evaluation resumes The default
     * is '10m'. Values must be an integer followed by an 'm'. No unit of time other than minutes (m) is supported.
     *
     * @return the scaleDownDelayAfterAdd value.
     */
    public String scaleDownDelayAfterAdd() {
        return this.scaleDownDelayAfterAdd;
    }

    /**
     * Set the scaleDownDelayAfterAdd property: How long after scale up that scale down evaluation resumes The default
     * is '10m'. Values must be an integer followed by an 'm'. No unit of time other than minutes (m) is supported.
     *
     * @param scaleDownDelayAfterAdd the scaleDownDelayAfterAdd value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterAdd(String scaleDownDelayAfterAdd) {
        this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterDelete property: How long after node deletion that scale down evaluation resumes. The
     * default is the scan-interval. Values must be an integer followed by an 'm'. No unit of time other than minutes
     * (m) is supported.
     *
     * @return the scaleDownDelayAfterDelete value.
     */
    public String scaleDownDelayAfterDelete() {
        return this.scaleDownDelayAfterDelete;
    }

    /**
     * Set the scaleDownDelayAfterDelete property: How long after node deletion that scale down evaluation resumes. The
     * default is the scan-interval. Values must be an integer followed by an 'm'. No unit of time other than minutes
     * (m) is supported.
     *
     * @param scaleDownDelayAfterDelete the scaleDownDelayAfterDelete value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterDelete(String scaleDownDelayAfterDelete) {
        this.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterFailure property: How long after scale down failure that scale down evaluation
     * resumes. The default is '3m'. Values must be an integer followed by an 'm'. No unit of time other than minutes
     * (m) is supported.
     *
     * @return the scaleDownDelayAfterFailure value.
     */
    public String scaleDownDelayAfterFailure() {
        return this.scaleDownDelayAfterFailure;
    }

    /**
     * Set the scaleDownDelayAfterFailure property: How long after scale down failure that scale down evaluation
     * resumes. The default is '3m'. Values must be an integer followed by an 'm'. No unit of time other than minutes
     * (m) is supported.
     *
     * @param scaleDownDelayAfterFailure the scaleDownDelayAfterFailure value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterFailure(String scaleDownDelayAfterFailure) {
        this.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
        return this;
    }

    /**
     * Get the scaleDownUnneededTime property: How long a node should be unneeded before it is eligible for scale down.
     * The default is '10m'. Values must be an integer followed by an 'm'. No unit of time other than minutes (m) is
     * supported.
     *
     * @return the scaleDownUnneededTime value.
     */
    public String scaleDownUnneededTime() {
        return this.scaleDownUnneededTime;
    }

    /**
     * Set the scaleDownUnneededTime property: How long a node should be unneeded before it is eligible for scale down.
     * The default is '10m'. Values must be an integer followed by an 'm'. No unit of time other than minutes (m) is
     * supported.
     *
     * @param scaleDownUnneededTime the scaleDownUnneededTime value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUnneededTime(String scaleDownUnneededTime) {
        this.scaleDownUnneededTime = scaleDownUnneededTime;
        return this;
    }

    /**
     * Get the scaleDownUnreadyTime property: How long an unready node should be unneeded before it is eligible for
     * scale down The default is '20m'. Values must be an integer followed by an 'm'. No unit of time other than minutes
     * (m) is supported.
     *
     * @return the scaleDownUnreadyTime value.
     */
    public String scaleDownUnreadyTime() {
        return this.scaleDownUnreadyTime;
    }

    /**
     * Set the scaleDownUnreadyTime property: How long an unready node should be unneeded before it is eligible for
     * scale down The default is '20m'. Values must be an integer followed by an 'm'. No unit of time other than minutes
     * (m) is supported.
     *
     * @param scaleDownUnreadyTime the scaleDownUnreadyTime value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUnreadyTime(String scaleDownUnreadyTime) {
        this.scaleDownUnreadyTime = scaleDownUnreadyTime;
        return this;
    }

    /**
     * Get the scaleDownUtilizationThreshold property: Node utilization level, defined as sum of requested resources
     * divided by capacity, below which a node can be considered for scale down. The default is '0.5'.
     *
     * @return the scaleDownUtilizationThreshold value.
     */
    public String scaleDownUtilizationThreshold() {
        return this.scaleDownUtilizationThreshold;
    }

    /**
     * Set the scaleDownUtilizationThreshold property: Node utilization level, defined as sum of requested resources
     * divided by capacity, below which a node can be considered for scale down. The default is '0.5'.
     *
     * @param scaleDownUtilizationThreshold the scaleDownUtilizationThreshold value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUtilizationThreshold(
        String scaleDownUtilizationThreshold) {
        this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        return this;
    }

    /**
     * Get the skipNodesWithLocalStorage property: If cluster autoscaler will skip deleting nodes with pods with local
     * storage, for example, EmptyDir or HostPath. The default is true.
     *
     * @return the skipNodesWithLocalStorage value.
     */
    public String skipNodesWithLocalStorage() {
        return this.skipNodesWithLocalStorage;
    }

    /**
     * Set the skipNodesWithLocalStorage property: If cluster autoscaler will skip deleting nodes with pods with local
     * storage, for example, EmptyDir or HostPath. The default is true.
     *
     * @param skipNodesWithLocalStorage the skipNodesWithLocalStorage value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withSkipNodesWithLocalStorage(String skipNodesWithLocalStorage) {
        this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
        return this;
    }

    /**
     * Get the skipNodesWithSystemPods property: If cluster autoscaler will skip deleting nodes with pods from
     * kube-system (except for DaemonSet or mirror pods) The default is true.
     *
     * @return the skipNodesWithSystemPods value.
     */
    public String skipNodesWithSystemPods() {
        return this.skipNodesWithSystemPods;
    }

    /**
     * Set the skipNodesWithSystemPods property: If cluster autoscaler will skip deleting nodes with pods from
     * kube-system (except for DaemonSet or mirror pods) The default is true.
     *
     * @param skipNodesWithSystemPods the skipNodesWithSystemPods value to set.
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withSkipNodesWithSystemPods(String skipNodesWithSystemPods) {
        this.skipNodesWithSystemPods = skipNodesWithSystemPods;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
