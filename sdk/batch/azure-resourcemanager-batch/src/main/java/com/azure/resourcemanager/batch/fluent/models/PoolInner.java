// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.batch.models.AllocationState;
import com.azure.resourcemanager.batch.models.ApplicationPackageReference;
import com.azure.resourcemanager.batch.models.AutoScaleRun;
import com.azure.resourcemanager.batch.models.BatchPoolIdentity;
import com.azure.resourcemanager.batch.models.CertificateReference;
import com.azure.resourcemanager.batch.models.DeploymentConfiguration;
import com.azure.resourcemanager.batch.models.InterNodeCommunicationState;
import com.azure.resourcemanager.batch.models.MetadataItem;
import com.azure.resourcemanager.batch.models.MountConfiguration;
import com.azure.resourcemanager.batch.models.NetworkConfiguration;
import com.azure.resourcemanager.batch.models.NodeCommunicationMode;
import com.azure.resourcemanager.batch.models.PoolProvisioningState;
import com.azure.resourcemanager.batch.models.ResizeOperationStatus;
import com.azure.resourcemanager.batch.models.ScaleSettings;
import com.azure.resourcemanager.batch.models.StartTask;
import com.azure.resourcemanager.batch.models.TaskSchedulingPolicy;
import com.azure.resourcemanager.batch.models.UpgradePolicy;
import com.azure.resourcemanager.batch.models.UserAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Contains information about a pool.
 */
@Fluent
public final class PoolInner extends ProxyResource {
    /*
     * The properties associated with the pool.
     */
    @JsonProperty(value = "properties")
    private PoolProperties innerProperties;

    /*
     * The type of identity used for the Batch Pool.
     */
    @JsonProperty(value = "identity")
    private BatchPoolIdentity identity;

    /*
     * The ETag of the resource, used for concurrency statements.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of PoolInner class.
     */
    public PoolInner() {
    }

    /**
     * Get the innerProperties property: The properties associated with the pool.
     * 
     * @return the innerProperties value.
     */
    private PoolProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The type of identity used for the Batch Pool.
     * 
     * @return the identity value.
     */
    public BatchPoolIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The type of identity used for the Batch Pool.
     * 
     * @param identity the identity value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withIdentity(BatchPoolIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the etag property: The ETag of the resource, used for concurrency statements.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the displayName property: The display name for the pool.
     * 
     * The display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name for the pool.
     * 
     * The display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     * 
     * @param displayName the displayName value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the lastModified property: The last modified time of the pool.
     * 
     * This is the last time at which the pool level data, such as the targetDedicatedNodes or autoScaleSettings,
     * changed. It does not factor in node-level changes such as a compute node changing state.
     * 
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModified();
    }

    /**
     * Get the creationTime property: The creation time of the pool.
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Get the provisioningState property: The current state of the pool.
     * 
     * @return the provisioningState value.
     */
    public PoolProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the provisioningStateTransitionTime property: The time at which the pool entered its current state.
     * 
     * @return the provisioningStateTransitionTime value.
     */
    public OffsetDateTime provisioningStateTransitionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningStateTransitionTime();
    }

    /**
     * Get the allocationState property: Whether the pool is resizing.
     * 
     * @return the allocationState value.
     */
    public AllocationState allocationState() {
        return this.innerProperties() == null ? null : this.innerProperties().allocationState();
    }

    /**
     * Get the allocationStateTransitionTime property: The time at which the pool entered its current allocation state.
     * 
     * @return the allocationStateTransitionTime value.
     */
    public OffsetDateTime allocationStateTransitionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().allocationStateTransitionTime();
    }

    /**
     * Get the vmSize property: The size of virtual machines in the pool. All VMs in a pool are the same size.
     * 
     * For information about available sizes of virtual machines for Cloud Services pools (pools created with
     * cloudServiceConfiguration), see Sizes for Cloud Services
     * (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud
     * Services VM sizes except ExtraSmall. For information about available VM sizes for pools using images from the
     * Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines
     * (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual
     * Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch
     * supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and
     * STANDARD_DSV2 series).
     * 
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.innerProperties() == null ? null : this.innerProperties().vmSize();
    }

    /**
     * Set the vmSize property: The size of virtual machines in the pool. All VMs in a pool are the same size.
     * 
     * For information about available sizes of virtual machines for Cloud Services pools (pools created with
     * cloudServiceConfiguration), see Sizes for Cloud Services
     * (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud
     * Services VM sizes except ExtraSmall. For information about available VM sizes for pools using images from the
     * Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines
     * (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual
     * Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch
     * supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and
     * STANDARD_DSV2 series).
     * 
     * @param vmSize the vmSize value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withVmSize(String vmSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withVmSize(vmSize);
        return this;
    }

    /**
     * Get the deploymentConfiguration property: Deployment configuration properties.
     * 
     * Using CloudServiceConfiguration specifies that the nodes should be creating using Azure Cloud Services (PaaS),
     * while VirtualMachineConfiguration uses Azure Virtual Machines (IaaS).
     * 
     * @return the deploymentConfiguration value.
     */
    public DeploymentConfiguration deploymentConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentConfiguration();
    }

    /**
     * Set the deploymentConfiguration property: Deployment configuration properties.
     * 
     * Using CloudServiceConfiguration specifies that the nodes should be creating using Azure Cloud Services (PaaS),
     * while VirtualMachineConfiguration uses Azure Virtual Machines (IaaS).
     * 
     * @param deploymentConfiguration the deploymentConfiguration value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withDeploymentConfiguration(deploymentConfiguration);
        return this;
    }

    /**
     * Get the currentDedicatedNodes property: The number of dedicated compute nodes currently in the pool.
     * 
     * @return the currentDedicatedNodes value.
     */
    public Integer currentDedicatedNodes() {
        return this.innerProperties() == null ? null : this.innerProperties().currentDedicatedNodes();
    }

    /**
     * Get the currentLowPriorityNodes property: The number of Spot/low-priority compute nodes currently in the pool.
     * 
     * @return the currentLowPriorityNodes value.
     */
    public Integer currentLowPriorityNodes() {
        return this.innerProperties() == null ? null : this.innerProperties().currentLowPriorityNodes();
    }

    /**
     * Get the scaleSettings property: Scale settings for the pool
     * 
     * Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes
     * is specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not
     * specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
     * 
     * @return the scaleSettings value.
     */
    public ScaleSettings scaleSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().scaleSettings();
    }

    /**
     * Set the scaleSettings property: Scale settings for the pool
     * 
     * Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes
     * is specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not
     * specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
     * 
     * @param scaleSettings the scaleSettings value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withScaleSettings(ScaleSettings scaleSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withScaleSettings(scaleSettings);
        return this;
    }

    /**
     * Get the autoScaleRun property: The results and errors from an execution of a pool autoscale formula.
     * 
     * This property is set only if the pool automatically scales, i.e. autoScaleSettings are used.
     * 
     * @return the autoScaleRun value.
     */
    public AutoScaleRun autoScaleRun() {
        return this.innerProperties() == null ? null : this.innerProperties().autoScaleRun();
    }

    /**
     * Get the interNodeCommunication property: Whether the pool permits direct communication between nodes.
     * 
     * This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance
     * of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to
     * 'Disabled'.
     * 
     * @return the interNodeCommunication value.
     */
    public InterNodeCommunicationState interNodeCommunication() {
        return this.innerProperties() == null ? null : this.innerProperties().interNodeCommunication();
    }

    /**
     * Set the interNodeCommunication property: Whether the pool permits direct communication between nodes.
     * 
     * This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance
     * of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to
     * 'Disabled'.
     * 
     * @param interNodeCommunication the interNodeCommunication value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withInterNodeCommunication(InterNodeCommunicationState interNodeCommunication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withInterNodeCommunication(interNodeCommunication);
        return this;
    }

    /**
     * Get the networkConfiguration property: The network configuration for a pool.
     * 
     * @return the networkConfiguration value.
     */
    public NetworkConfiguration networkConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().networkConfiguration();
    }

    /**
     * Set the networkConfiguration property: The network configuration for a pool.
     * 
     * @param networkConfiguration the networkConfiguration value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * Get the taskSlotsPerNode property: The number of task slots that can be used to run concurrent tasks on a single
     * compute node in the pool.
     * 
     * The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the
     * pool or 256.
     * 
     * @return the taskSlotsPerNode value.
     */
    public Integer taskSlotsPerNode() {
        return this.innerProperties() == null ? null : this.innerProperties().taskSlotsPerNode();
    }

    /**
     * Set the taskSlotsPerNode property: The number of task slots that can be used to run concurrent tasks on a single
     * compute node in the pool.
     * 
     * The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the
     * pool or 256.
     * 
     * @param taskSlotsPerNode the taskSlotsPerNode value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withTaskSlotsPerNode(Integer taskSlotsPerNode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withTaskSlotsPerNode(taskSlotsPerNode);
        return this;
    }

    /**
     * Get the taskSchedulingPolicy property: Specifies how tasks should be distributed across compute nodes.
     * 
     * If not specified, the default is spread.
     * 
     * @return the taskSchedulingPolicy value.
     */
    public TaskSchedulingPolicy taskSchedulingPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().taskSchedulingPolicy();
    }

    /**
     * Set the taskSchedulingPolicy property: Specifies how tasks should be distributed across compute nodes.
     * 
     * If not specified, the default is spread.
     * 
     * @param taskSchedulingPolicy the taskSchedulingPolicy value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withTaskSchedulingPolicy(TaskSchedulingPolicy taskSchedulingPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withTaskSchedulingPolicy(taskSchedulingPolicy);
        return this;
    }

    /**
     * Get the userAccounts property: The list of user accounts to be created on each node in the pool.
     * 
     * @return the userAccounts value.
     */
    public List<UserAccount> userAccounts() {
        return this.innerProperties() == null ? null : this.innerProperties().userAccounts();
    }

    /**
     * Set the userAccounts property: The list of user accounts to be created on each node in the pool.
     * 
     * @param userAccounts the userAccounts value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withUserAccounts(List<UserAccount> userAccounts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withUserAccounts(userAccounts);
        return this;
    }

    /**
     * Get the metadata property: A list of name-value pairs associated with the pool as metadata.
     * 
     * The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     * 
     * @return the metadata value.
     */
    public List<MetadataItem> metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: A list of name-value pairs associated with the pool as metadata.
     * 
     * The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     * 
     * @param metadata the metadata value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withMetadata(List<MetadataItem> metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the startTask property: A task which is run when a compute node joins a pool in the Azure Batch service, or
     * when the compute node is rebooted or reimaged.
     * 
     * In an PATCH (update) operation, this property can be set to an empty object to remove the start task from the
     * pool.
     * 
     * @return the startTask value.
     */
    public StartTask startTask() {
        return this.innerProperties() == null ? null : this.innerProperties().startTask();
    }

    /**
     * Set the startTask property: A task which is run when a compute node joins a pool in the Azure Batch service, or
     * when the compute node is rebooted or reimaged.
     * 
     * In an PATCH (update) operation, this property can be set to an empty object to remove the start task from the
     * pool.
     * 
     * @param startTask the startTask value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withStartTask(StartTask startTask) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withStartTask(startTask);
        return this;
    }

    /**
     * Get the certificates property: The list of certificates to be installed on each compute node in the pool.
     * 
     * For Windows compute nodes, the Batch service installs the certificates to the specified certificate store and
     * location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory
     * and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For
     * certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g.,
     * /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     * Warning: This property is deprecated and will be removed after February, 2024. Please use the [Azure KeyVault
     * Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide) instead.
     * 
     * @return the certificates value.
     */
    public List<CertificateReference> certificates() {
        return this.innerProperties() == null ? null : this.innerProperties().certificates();
    }

    /**
     * Set the certificates property: The list of certificates to be installed on each compute node in the pool.
     * 
     * For Windows compute nodes, the Batch service installs the certificates to the specified certificate store and
     * location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory
     * and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For
     * certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g.,
     * /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     * Warning: This property is deprecated and will be removed after February, 2024. Please use the [Azure KeyVault
     * Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide) instead.
     * 
     * @param certificates the certificates value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withCertificates(List<CertificateReference> certificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withCertificates(certificates);
        return this;
    }

    /**
     * Get the applicationPackages property: The list of application packages to be installed on each compute node in
     * the pool.
     * 
     * Changes to application package references affect all new compute nodes joining the pool, but do not affect
     * compute nodes that are already in the pool until they are rebooted or reimaged. There is a maximum of 10
     * application package references on any given pool.
     * 
     * @return the applicationPackages value.
     */
    public List<ApplicationPackageReference> applicationPackages() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationPackages();
    }

    /**
     * Set the applicationPackages property: The list of application packages to be installed on each compute node in
     * the pool.
     * 
     * Changes to application package references affect all new compute nodes joining the pool, but do not affect
     * compute nodes that are already in the pool until they are rebooted or reimaged. There is a maximum of 10
     * application package references on any given pool.
     * 
     * @param applicationPackages the applicationPackages value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withApplicationPackages(List<ApplicationPackageReference> applicationPackages) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withApplicationPackages(applicationPackages);
        return this;
    }

    /**
     * Get the applicationLicenses property: The list of application licenses the Batch service will make available on
     * each compute node in the pool.
     * 
     * The list of application licenses must be a subset of available Batch service application licenses. If a license
     * is requested which is not supported, pool creation will fail.
     * 
     * @return the applicationLicenses value.
     */
    public List<String> applicationLicenses() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationLicenses();
    }

    /**
     * Set the applicationLicenses property: The list of application licenses the Batch service will make available on
     * each compute node in the pool.
     * 
     * The list of application licenses must be a subset of available Batch service application licenses. If a license
     * is requested which is not supported, pool creation will fail.
     * 
     * @param applicationLicenses the applicationLicenses value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withApplicationLicenses(List<String> applicationLicenses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withApplicationLicenses(applicationLicenses);
        return this;
    }

    /**
     * Get the resizeOperationStatus property: Details about the current or last completed resize operation.
     * 
     * Describes either the current operation (if the pool AllocationState is Resizing) or the previously completed
     * operation (if the AllocationState is Steady).
     * 
     * @return the resizeOperationStatus value.
     */
    public ResizeOperationStatus resizeOperationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().resizeOperationStatus();
    }

    /**
     * Get the mountConfiguration property: A list of file systems to mount on each node in the pool.
     * 
     * This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     * 
     * @return the mountConfiguration value.
     */
    public List<MountConfiguration> mountConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().mountConfiguration();
    }

    /**
     * Set the mountConfiguration property: A list of file systems to mount on each node in the pool.
     * 
     * This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     * 
     * @param mountConfiguration the mountConfiguration value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withMountConfiguration(List<MountConfiguration> mountConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withMountConfiguration(mountConfiguration);
        return this;
    }

    /**
     * Get the targetNodeCommunicationMode property: Determines how a pool communicates with the Batch service.
     * 
     * If omitted, the default value is Default.
     * 
     * @return the targetNodeCommunicationMode value.
     */
    public NodeCommunicationMode targetNodeCommunicationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().targetNodeCommunicationMode();
    }

    /**
     * Set the targetNodeCommunicationMode property: Determines how a pool communicates with the Batch service.
     * 
     * If omitted, the default value is Default.
     * 
     * @param targetNodeCommunicationMode the targetNodeCommunicationMode value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withTargetNodeCommunicationMode(NodeCommunicationMode targetNodeCommunicationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withTargetNodeCommunicationMode(targetNodeCommunicationMode);
        return this;
    }

    /**
     * Get the currentNodeCommunicationMode property: Determines how a pool communicates with the Batch service.
     * 
     * @return the currentNodeCommunicationMode value.
     */
    public NodeCommunicationMode currentNodeCommunicationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().currentNodeCommunicationMode();
    }

    /**
     * Get the upgradePolicy property: Describes an upgrade policy - automatic, manual, or rolling.
     * 
     * @return the upgradePolicy value.
     */
    public UpgradePolicy upgradePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradePolicy();
    }

    /**
     * Set the upgradePolicy property: Describes an upgrade policy - automatic, manual, or rolling.
     * 
     * @param upgradePolicy the upgradePolicy value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withUpgradePolicy(UpgradePolicy upgradePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withUpgradePolicy(upgradePolicy);
        return this;
    }

    /**
     * Get the resourceTags property: The user-defined tags to be associated with the Azure Batch Pool. When specified,
     * these tags are propagated to the backing Azure resources associated with the pool. This property can only be
     * specified when the Batch account was created with the poolAllocationMode property set to 'UserSubscription'.
     * 
     * @return the resourceTags value.
     */
    public Map<String, String> resourceTags() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceTags();
    }

    /**
     * Set the resourceTags property: The user-defined tags to be associated with the Azure Batch Pool. When specified,
     * these tags are propagated to the backing Azure resources associated with the pool. This property can only be
     * specified when the Batch account was created with the poolAllocationMode property set to 'UserSubscription'.
     * 
     * @param resourceTags the resourceTags value to set.
     * @return the PoolInner object itself.
     */
    public PoolInner withResourceTags(Map<String, String> resourceTags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withResourceTags(resourceTags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
