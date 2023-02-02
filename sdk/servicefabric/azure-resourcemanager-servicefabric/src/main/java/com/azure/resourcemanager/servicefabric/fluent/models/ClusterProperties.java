// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabric.models.AddOnFeatures;
import com.azure.resourcemanager.servicefabric.models.ApplicationTypeVersionsCleanupPolicy;
import com.azure.resourcemanager.servicefabric.models.AzureActiveDirectory;
import com.azure.resourcemanager.servicefabric.models.CertificateDescription;
import com.azure.resourcemanager.servicefabric.models.ClientCertificateCommonName;
import com.azure.resourcemanager.servicefabric.models.ClientCertificateThumbprint;
import com.azure.resourcemanager.servicefabric.models.ClusterState;
import com.azure.resourcemanager.servicefabric.models.ClusterUpgradeCadence;
import com.azure.resourcemanager.servicefabric.models.ClusterUpgradePolicy;
import com.azure.resourcemanager.servicefabric.models.DiagnosticsStorageAccountConfig;
import com.azure.resourcemanager.servicefabric.models.NodeTypeDescription;
import com.azure.resourcemanager.servicefabric.models.Notification;
import com.azure.resourcemanager.servicefabric.models.ProvisioningState;
import com.azure.resourcemanager.servicefabric.models.ReliabilityLevel;
import com.azure.resourcemanager.servicefabric.models.ServerCertificateCommonNames;
import com.azure.resourcemanager.servicefabric.models.SettingsSectionDescription;
import com.azure.resourcemanager.servicefabric.models.SfZonalUpgradeMode;
import com.azure.resourcemanager.servicefabric.models.UpgradeMode;
import com.azure.resourcemanager.servicefabric.models.VmssZonalUpgradeMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Describes the cluster resource properties. */
@Fluent
public final class ClusterProperties {
    /*
     * The list of add-on features to enable in the cluster.
     */
    @JsonProperty(value = "addOnFeatures")
    private List<AddOnFeatures> addOnFeatures;

    /*
     * The Service Fabric runtime versions available for this cluster.
     */
    @JsonProperty(value = "availableClusterVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ClusterVersionDetails> availableClusterVersions;

    /*
     * The AAD authentication settings of the cluster.
     */
    @JsonProperty(value = "azureActiveDirectory")
    private AzureActiveDirectory azureActiveDirectory;

    /*
     * The certificate to use for securing the cluster. The certificate provided will be used for node to node security
     * within the cluster, SSL certificate for cluster management endpoint and default admin client.
     */
    @JsonProperty(value = "certificate")
    private CertificateDescription certificate;

    /*
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     */
    @JsonProperty(value = "certificateCommonNames")
    private ServerCertificateCommonNames certificateCommonNames;

    /*
     * The list of client certificates referenced by common name that are allowed to manage the cluster.
     */
    @JsonProperty(value = "clientCertificateCommonNames")
    private List<ClientCertificateCommonName> clientCertificateCommonNames;

    /*
     * The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     */
    @JsonProperty(value = "clientCertificateThumbprints")
    private List<ClientCertificateThumbprint> clientCertificateThumbprints;

    /*
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode**
     * is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion
     * API](./ClusterVersion.md). To get the list of available version for existing clusters use
     * **availableClusterVersions**.
     */
    @JsonProperty(value = "clusterCodeVersion")
    private String clusterCodeVersion;

    /*
     * The Azure Resource Provider endpoint. A system service in the cluster connects to this  endpoint.
     */
    @JsonProperty(value = "clusterEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterEndpoint;

    /*
     * A service generated unique identifier for the cluster resource.
     */
    @JsonProperty(value = "clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /*
     * The current state of the cluster.
     *
     * - WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for
     * Service Fabric VM extension to boot up and report to it.
     * - Deploying - Indicates that the Service Fabric runtime is being installed on the VMs. Cluster resource will be
     * in this state until the cluster boots up and system services are up.
     * - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version. This upgrade is
     * automatically initiated when the cluster boots up for the first time.
     * - UpdatingUserConfiguration - Indicates that the cluster is being upgraded with the user provided configuration.
     * - UpdatingUserCertificate - Indicates that the cluster is being upgraded with the user provided certificate.
     * - UpdatingInfrastructure - Indicates that the cluster is being upgraded with the latest Service Fabric runtime
     * version. This happens only when the **upgradeMode** is set to 'Automatic'.
     * - EnforcingClusterVersion - Indicates that cluster is on a different version than expected and the cluster is
     * being upgraded to the expected version.
     * - UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource
     * Provider. Clusters in this state cannot be managed by the Resource Provider.
     * - AutoScale - Indicates that the ReliabilityLevel of the cluster is being adjusted.
     * - Ready - Indicates that the cluster is in a stable state.
     *
     */
    @JsonProperty(value = "clusterState", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterState clusterState;

    /*
     * The storage account information for storing Service Fabric diagnostic logs.
     */
    @JsonProperty(value = "diagnosticsStorageAccountConfig")
    private DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig;

    /*
     * Indicates if the event store service is enabled.
     */
    @JsonProperty(value = "eventStoreServiceEnabled")
    private Boolean eventStoreServiceEnabled;

    /*
     * The list of custom fabric settings to configure the cluster.
     */
    @JsonProperty(value = "fabricSettings")
    private List<SettingsSectionDescription> fabricSettings;

    /*
     * The http management endpoint of the cluster.
     */
    @JsonProperty(value = "managementEndpoint", required = true)
    private String managementEndpoint;

    /*
     * The list of node types in the cluster.
     */
    @JsonProperty(value = "nodeTypes", required = true)
    private List<NodeTypeDescription> nodeTypes;

    /*
     * The provisioning state of the cluster resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The reliability level sets the replica set size of system services. Learn about
     * [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * - None - Run the System services with a target replica set count of 1. This should only be used for test
     * clusters.
     * - Bronze - Run the System services with a target replica set count of 3. This should only be used for test
     * clusters.
     * - Silver - Run the System services with a target replica set count of 5.
     * - Gold - Run the System services with a target replica set count of 7.
     * - Platinum - Run the System services with a target replica set count of 9.
     *
     */
    @JsonProperty(value = "reliabilityLevel")
    private ReliabilityLevel reliabilityLevel;

    /*
     * The server certificate used by reverse proxy.
     */
    @JsonProperty(value = "reverseProxyCertificate")
    private CertificateDescription reverseProxyCertificate;

    /*
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     */
    @JsonProperty(value = "reverseProxyCertificateCommonNames")
    private ServerCertificateCommonNames reverseProxyCertificateCommonNames;

    /*
     * The policy to use when upgrading the cluster.
     */
    @JsonProperty(value = "upgradeDescription")
    private ClusterUpgradePolicy upgradeDescription;

    /*
     * The upgrade mode of the cluster when new Service Fabric runtime version is available.
     */
    @JsonProperty(value = "upgradeMode")
    private UpgradeMode upgradeMode;

    /*
     * The policy used to clean up unused versions.
     */
    @JsonProperty(value = "applicationTypeVersionsCleanupPolicy")
    private ApplicationTypeVersionsCleanupPolicy applicationTypeVersionsCleanupPolicy;

    /*
     * The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     */
    @JsonProperty(value = "vmImage")
    private String vmImage;

    /*
     * This property controls the logical grouping of VMs in upgrade domains (UDs). This property can't be modified if
     * a node type with multiple Availability Zones is already present in the cluster.
     */
    @JsonProperty(value = "sfZonalUpgradeMode")
    private SfZonalUpgradeMode sfZonalUpgradeMode;

    /*
     * This property defines the upgrade mode for the virtual machine scale set, it is mandatory if a node type with
     * multiple Availability Zones is added.
     */
    @JsonProperty(value = "vmssZonalUpgradeMode")
    private VmssZonalUpgradeMode vmssZonalUpgradeMode;

    /*
     * Indicates if infrastructure service manager is enabled.
     */
    @JsonProperty(value = "infrastructureServiceManager")
    private Boolean infrastructureServiceManager;

    /*
     * Indicates when new cluster runtime version upgrades will be applied after they are released. By default is
     * Wave0. Only applies when **upgradeMode** is set to 'Automatic'.
     */
    @JsonProperty(value = "upgradeWave")
    private ClusterUpgradeCadence upgradeWave;

    /*
     * Indicates the start date and time to pause automatic runtime version upgrades on the cluster for an specific
     * period of time on the cluster (UTC).
     */
    @JsonProperty(value = "upgradePauseStartTimestampUtc")
    private OffsetDateTime upgradePauseStartTimestampUtc;

    /*
     * Indicates the end date and time to pause automatic runtime version upgrades on the cluster for an specific
     * period of time on the cluster (UTC).
     */
    @JsonProperty(value = "upgradePauseEndTimestampUtc")
    private OffsetDateTime upgradePauseEndTimestampUtc;

    /*
     * Boolean to pause automatic runtime version upgrades to the cluster.
     */
    @JsonProperty(value = "waveUpgradePaused")
    private Boolean waveUpgradePaused;

    /*
     * Indicates a list of notification channels for cluster events.
     */
    @JsonProperty(value = "notifications")
    private List<Notification> notifications;

    /** Creates an instance of ClusterProperties class. */
    public ClusterProperties() {
    }

    /**
     * Get the addOnFeatures property: The list of add-on features to enable in the cluster.
     *
     * @return the addOnFeatures value.
     */
    public List<AddOnFeatures> addOnFeatures() {
        return this.addOnFeatures;
    }

    /**
     * Set the addOnFeatures property: The list of add-on features to enable in the cluster.
     *
     * @param addOnFeatures the addOnFeatures value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withAddOnFeatures(List<AddOnFeatures> addOnFeatures) {
        this.addOnFeatures = addOnFeatures;
        return this;
    }

    /**
     * Get the availableClusterVersions property: The Service Fabric runtime versions available for this cluster.
     *
     * @return the availableClusterVersions value.
     */
    public List<ClusterVersionDetails> availableClusterVersions() {
        return this.availableClusterVersions;
    }

    /**
     * Get the azureActiveDirectory property: The AAD authentication settings of the cluster.
     *
     * @return the azureActiveDirectory value.
     */
    public AzureActiveDirectory azureActiveDirectory() {
        return this.azureActiveDirectory;
    }

    /**
     * Set the azureActiveDirectory property: The AAD authentication settings of the cluster.
     *
     * @param azureActiveDirectory the azureActiveDirectory value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withAzureActiveDirectory(AzureActiveDirectory azureActiveDirectory) {
        this.azureActiveDirectory = azureActiveDirectory;
        return this;
    }

    /**
     * Get the certificate property: The certificate to use for securing the cluster. The certificate provided will be
     * used for node to node security within the cluster, SSL certificate for cluster management endpoint and default
     * admin client.
     *
     * @return the certificate value.
     */
    public CertificateDescription certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: The certificate to use for securing the cluster. The certificate provided will be
     * used for node to node security within the cluster, SSL certificate for cluster management endpoint and default
     * admin client.
     *
     * @param certificate the certificate value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withCertificate(CertificateDescription certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the certificateCommonNames property: Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     *
     * @return the certificateCommonNames value.
     */
    public ServerCertificateCommonNames certificateCommonNames() {
        return this.certificateCommonNames;
    }

    /**
     * Set the certificateCommonNames property: Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     *
     * @param certificateCommonNames the certificateCommonNames value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withCertificateCommonNames(ServerCertificateCommonNames certificateCommonNames) {
        this.certificateCommonNames = certificateCommonNames;
        return this;
    }

    /**
     * Get the clientCertificateCommonNames property: The list of client certificates referenced by common name that are
     * allowed to manage the cluster.
     *
     * @return the clientCertificateCommonNames value.
     */
    public List<ClientCertificateCommonName> clientCertificateCommonNames() {
        return this.clientCertificateCommonNames;
    }

    /**
     * Set the clientCertificateCommonNames property: The list of client certificates referenced by common name that are
     * allowed to manage the cluster.
     *
     * @param clientCertificateCommonNames the clientCertificateCommonNames value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withClientCertificateCommonNames(
        List<ClientCertificateCommonName> clientCertificateCommonNames) {
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        return this;
    }

    /**
     * Get the clientCertificateThumbprints property: The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster.
     *
     * @return the clientCertificateThumbprints value.
     */
    public List<ClientCertificateThumbprint> clientCertificateThumbprints() {
        return this.clientCertificateThumbprints;
    }

    /**
     * Set the clientCertificateThumbprints property: The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster.
     *
     * @param clientCertificateThumbprints the clientCertificateThumbprints value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withClientCertificateThumbprints(
        List<ClientCertificateThumbprint> clientCertificateThumbprints) {
        this.clientCertificateThumbprints = clientCertificateThumbprints;
        return this;
    }

    /**
     * Get the clusterCodeVersion property: The Service Fabric runtime version of the cluster. This property can only by
     * set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new
     * clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing
     * clusters use **availableClusterVersions**.
     *
     * @return the clusterCodeVersion value.
     */
    public String clusterCodeVersion() {
        return this.clusterCodeVersion;
    }

    /**
     * Set the clusterCodeVersion property: The Service Fabric runtime version of the cluster. This property can only by
     * set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new
     * clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing
     * clusters use **availableClusterVersions**.
     *
     * @param clusterCodeVersion the clusterCodeVersion value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withClusterCodeVersion(String clusterCodeVersion) {
        this.clusterCodeVersion = clusterCodeVersion;
        return this;
    }

    /**
     * Get the clusterEndpoint property: The Azure Resource Provider endpoint. A system service in the cluster connects
     * to this endpoint.
     *
     * @return the clusterEndpoint value.
     */
    public String clusterEndpoint() {
        return this.clusterEndpoint;
    }

    /**
     * Get the clusterId property: A service generated unique identifier for the cluster resource.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the clusterState property: The current state of the cluster.
     *
     * <p>- WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for
     * Service Fabric VM extension to boot up and report to it. - Deploying - Indicates that the Service Fabric runtime
     * is being installed on the VMs. Cluster resource will be in this state until the cluster boots up and system
     * services are up. - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version.
     * This upgrade is automatically initiated when the cluster boots up for the first time. - UpdatingUserConfiguration
     * - Indicates that the cluster is being upgraded with the user provided configuration. - UpdatingUserCertificate -
     * Indicates that the cluster is being upgraded with the user provided certificate. - UpdatingInfrastructure -
     * Indicates that the cluster is being upgraded with the latest Service Fabric runtime version. This happens only
     * when the **upgradeMode** is set to 'Automatic'. - EnforcingClusterVersion - Indicates that cluster is on a
     * different version than expected and the cluster is being upgraded to the expected version. -
     * UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource
     * Provider. Clusters in this state cannot be managed by the Resource Provider. - AutoScale - Indicates that the
     * ReliabilityLevel of the cluster is being adjusted. - Ready - Indicates that the cluster is in a stable state.
     *
     * @return the clusterState value.
     */
    public ClusterState clusterState() {
        return this.clusterState;
    }

    /**
     * Get the diagnosticsStorageAccountConfig property: The storage account information for storing Service Fabric
     * diagnostic logs.
     *
     * @return the diagnosticsStorageAccountConfig value.
     */
    public DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig() {
        return this.diagnosticsStorageAccountConfig;
    }

    /**
     * Set the diagnosticsStorageAccountConfig property: The storage account information for storing Service Fabric
     * diagnostic logs.
     *
     * @param diagnosticsStorageAccountConfig the diagnosticsStorageAccountConfig value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withDiagnosticsStorageAccountConfig(
        DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig) {
        this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
        return this;
    }

    /**
     * Get the eventStoreServiceEnabled property: Indicates if the event store service is enabled.
     *
     * @return the eventStoreServiceEnabled value.
     */
    public Boolean eventStoreServiceEnabled() {
        return this.eventStoreServiceEnabled;
    }

    /**
     * Set the eventStoreServiceEnabled property: Indicates if the event store service is enabled.
     *
     * @param eventStoreServiceEnabled the eventStoreServiceEnabled value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withEventStoreServiceEnabled(Boolean eventStoreServiceEnabled) {
        this.eventStoreServiceEnabled = eventStoreServiceEnabled;
        return this;
    }

    /**
     * Get the fabricSettings property: The list of custom fabric settings to configure the cluster.
     *
     * @return the fabricSettings value.
     */
    public List<SettingsSectionDescription> fabricSettings() {
        return this.fabricSettings;
    }

    /**
     * Set the fabricSettings property: The list of custom fabric settings to configure the cluster.
     *
     * @param fabricSettings the fabricSettings value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withFabricSettings(List<SettingsSectionDescription> fabricSettings) {
        this.fabricSettings = fabricSettings;
        return this;
    }

    /**
     * Get the managementEndpoint property: The http management endpoint of the cluster.
     *
     * @return the managementEndpoint value.
     */
    public String managementEndpoint() {
        return this.managementEndpoint;
    }

    /**
     * Set the managementEndpoint property: The http management endpoint of the cluster.
     *
     * @param managementEndpoint the managementEndpoint value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withManagementEndpoint(String managementEndpoint) {
        this.managementEndpoint = managementEndpoint;
        return this;
    }

    /**
     * Get the nodeTypes property: The list of node types in the cluster.
     *
     * @return the nodeTypes value.
     */
    public List<NodeTypeDescription> nodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Set the nodeTypes property: The list of node types in the cluster.
     *
     * @param nodeTypes the nodeTypes value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withNodeTypes(List<NodeTypeDescription> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the cluster resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the reliabilityLevel property: The reliability level sets the replica set size of system services. Learn
     * about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * <p>- None - Run the System services with a target replica set count of 1. This should only be used for test
     * clusters. - Bronze - Run the System services with a target replica set count of 3. This should only be used for
     * test clusters. - Silver - Run the System services with a target replica set count of 5. - Gold - Run the System
     * services with a target replica set count of 7. - Platinum - Run the System services with a target replica set
     * count of 9.
     *
     * @return the reliabilityLevel value.
     */
    public ReliabilityLevel reliabilityLevel() {
        return this.reliabilityLevel;
    }

    /**
     * Set the reliabilityLevel property: The reliability level sets the replica set size of system services. Learn
     * about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * <p>- None - Run the System services with a target replica set count of 1. This should only be used for test
     * clusters. - Bronze - Run the System services with a target replica set count of 3. This should only be used for
     * test clusters. - Silver - Run the System services with a target replica set count of 5. - Gold - Run the System
     * services with a target replica set count of 7. - Platinum - Run the System services with a target replica set
     * count of 9.
     *
     * @param reliabilityLevel the reliabilityLevel value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withReliabilityLevel(ReliabilityLevel reliabilityLevel) {
        this.reliabilityLevel = reliabilityLevel;
        return this;
    }

    /**
     * Get the reverseProxyCertificate property: The server certificate used by reverse proxy.
     *
     * @return the reverseProxyCertificate value.
     */
    public CertificateDescription reverseProxyCertificate() {
        return this.reverseProxyCertificate;
    }

    /**
     * Set the reverseProxyCertificate property: The server certificate used by reverse proxy.
     *
     * @param reverseProxyCertificate the reverseProxyCertificate value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withReverseProxyCertificate(CertificateDescription reverseProxyCertificate) {
        this.reverseProxyCertificate = reverseProxyCertificate;
        return this;
    }

    /**
     * Get the reverseProxyCertificateCommonNames property: Describes a list of server certificates referenced by common
     * name that are used to secure the cluster.
     *
     * @return the reverseProxyCertificateCommonNames value.
     */
    public ServerCertificateCommonNames reverseProxyCertificateCommonNames() {
        return this.reverseProxyCertificateCommonNames;
    }

    /**
     * Set the reverseProxyCertificateCommonNames property: Describes a list of server certificates referenced by common
     * name that are used to secure the cluster.
     *
     * @param reverseProxyCertificateCommonNames the reverseProxyCertificateCommonNames value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withReverseProxyCertificateCommonNames(
        ServerCertificateCommonNames reverseProxyCertificateCommonNames) {
        this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
        return this;
    }

    /**
     * Get the upgradeDescription property: The policy to use when upgrading the cluster.
     *
     * @return the upgradeDescription value.
     */
    public ClusterUpgradePolicy upgradeDescription() {
        return this.upgradeDescription;
    }

    /**
     * Set the upgradeDescription property: The policy to use when upgrading the cluster.
     *
     * @param upgradeDescription the upgradeDescription value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withUpgradeDescription(ClusterUpgradePolicy upgradeDescription) {
        this.upgradeDescription = upgradeDescription;
        return this;
    }

    /**
     * Get the upgradeMode property: The upgrade mode of the cluster when new Service Fabric runtime version is
     * available.
     *
     * @return the upgradeMode value.
     */
    public UpgradeMode upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * Set the upgradeMode property: The upgrade mode of the cluster when new Service Fabric runtime version is
     * available.
     *
     * @param upgradeMode the upgradeMode value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withUpgradeMode(UpgradeMode upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * Get the applicationTypeVersionsCleanupPolicy property: The policy used to clean up unused versions.
     *
     * @return the applicationTypeVersionsCleanupPolicy value.
     */
    public ApplicationTypeVersionsCleanupPolicy applicationTypeVersionsCleanupPolicy() {
        return this.applicationTypeVersionsCleanupPolicy;
    }

    /**
     * Set the applicationTypeVersionsCleanupPolicy property: The policy used to clean up unused versions.
     *
     * @param applicationTypeVersionsCleanupPolicy the applicationTypeVersionsCleanupPolicy value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withApplicationTypeVersionsCleanupPolicy(
        ApplicationTypeVersionsCleanupPolicy applicationTypeVersionsCleanupPolicy) {
        this.applicationTypeVersionsCleanupPolicy = applicationTypeVersionsCleanupPolicy;
        return this;
    }

    /**
     * Get the vmImage property: The VM image VMSS has been configured with. Generic names such as Windows or Linux can
     * be used.
     *
     * @return the vmImage value.
     */
    public String vmImage() {
        return this.vmImage;
    }

    /**
     * Set the vmImage property: The VM image VMSS has been configured with. Generic names such as Windows or Linux can
     * be used.
     *
     * @param vmImage the vmImage value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withVmImage(String vmImage) {
        this.vmImage = vmImage;
        return this;
    }

    /**
     * Get the sfZonalUpgradeMode property: This property controls the logical grouping of VMs in upgrade domains (UDs).
     * This property can't be modified if a node type with multiple Availability Zones is already present in the
     * cluster.
     *
     * @return the sfZonalUpgradeMode value.
     */
    public SfZonalUpgradeMode sfZonalUpgradeMode() {
        return this.sfZonalUpgradeMode;
    }

    /**
     * Set the sfZonalUpgradeMode property: This property controls the logical grouping of VMs in upgrade domains (UDs).
     * This property can't be modified if a node type with multiple Availability Zones is already present in the
     * cluster.
     *
     * @param sfZonalUpgradeMode the sfZonalUpgradeMode value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withSfZonalUpgradeMode(SfZonalUpgradeMode sfZonalUpgradeMode) {
        this.sfZonalUpgradeMode = sfZonalUpgradeMode;
        return this;
    }

    /**
     * Get the vmssZonalUpgradeMode property: This property defines the upgrade mode for the virtual machine scale set,
     * it is mandatory if a node type with multiple Availability Zones is added.
     *
     * @return the vmssZonalUpgradeMode value.
     */
    public VmssZonalUpgradeMode vmssZonalUpgradeMode() {
        return this.vmssZonalUpgradeMode;
    }

    /**
     * Set the vmssZonalUpgradeMode property: This property defines the upgrade mode for the virtual machine scale set,
     * it is mandatory if a node type with multiple Availability Zones is added.
     *
     * @param vmssZonalUpgradeMode the vmssZonalUpgradeMode value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withVmssZonalUpgradeMode(VmssZonalUpgradeMode vmssZonalUpgradeMode) {
        this.vmssZonalUpgradeMode = vmssZonalUpgradeMode;
        return this;
    }

    /**
     * Get the infrastructureServiceManager property: Indicates if infrastructure service manager is enabled.
     *
     * @return the infrastructureServiceManager value.
     */
    public Boolean infrastructureServiceManager() {
        return this.infrastructureServiceManager;
    }

    /**
     * Set the infrastructureServiceManager property: Indicates if infrastructure service manager is enabled.
     *
     * @param infrastructureServiceManager the infrastructureServiceManager value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withInfrastructureServiceManager(Boolean infrastructureServiceManager) {
        this.infrastructureServiceManager = infrastructureServiceManager;
        return this;
    }

    /**
     * Get the upgradeWave property: Indicates when new cluster runtime version upgrades will be applied after they are
     * released. By default is Wave0. Only applies when **upgradeMode** is set to 'Automatic'.
     *
     * @return the upgradeWave value.
     */
    public ClusterUpgradeCadence upgradeWave() {
        return this.upgradeWave;
    }

    /**
     * Set the upgradeWave property: Indicates when new cluster runtime version upgrades will be applied after they are
     * released. By default is Wave0. Only applies when **upgradeMode** is set to 'Automatic'.
     *
     * @param upgradeWave the upgradeWave value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withUpgradeWave(ClusterUpgradeCadence upgradeWave) {
        this.upgradeWave = upgradeWave;
        return this;
    }

    /**
     * Get the upgradePauseStartTimestampUtc property: Indicates the start date and time to pause automatic runtime
     * version upgrades on the cluster for an specific period of time on the cluster (UTC).
     *
     * @return the upgradePauseStartTimestampUtc value.
     */
    public OffsetDateTime upgradePauseStartTimestampUtc() {
        return this.upgradePauseStartTimestampUtc;
    }

    /**
     * Set the upgradePauseStartTimestampUtc property: Indicates the start date and time to pause automatic runtime
     * version upgrades on the cluster for an specific period of time on the cluster (UTC).
     *
     * @param upgradePauseStartTimestampUtc the upgradePauseStartTimestampUtc value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withUpgradePauseStartTimestampUtc(OffsetDateTime upgradePauseStartTimestampUtc) {
        this.upgradePauseStartTimestampUtc = upgradePauseStartTimestampUtc;
        return this;
    }

    /**
     * Get the upgradePauseEndTimestampUtc property: Indicates the end date and time to pause automatic runtime version
     * upgrades on the cluster for an specific period of time on the cluster (UTC).
     *
     * @return the upgradePauseEndTimestampUtc value.
     */
    public OffsetDateTime upgradePauseEndTimestampUtc() {
        return this.upgradePauseEndTimestampUtc;
    }

    /**
     * Set the upgradePauseEndTimestampUtc property: Indicates the end date and time to pause automatic runtime version
     * upgrades on the cluster for an specific period of time on the cluster (UTC).
     *
     * @param upgradePauseEndTimestampUtc the upgradePauseEndTimestampUtc value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withUpgradePauseEndTimestampUtc(OffsetDateTime upgradePauseEndTimestampUtc) {
        this.upgradePauseEndTimestampUtc = upgradePauseEndTimestampUtc;
        return this;
    }

    /**
     * Get the waveUpgradePaused property: Boolean to pause automatic runtime version upgrades to the cluster.
     *
     * @return the waveUpgradePaused value.
     */
    public Boolean waveUpgradePaused() {
        return this.waveUpgradePaused;
    }

    /**
     * Set the waveUpgradePaused property: Boolean to pause automatic runtime version upgrades to the cluster.
     *
     * @param waveUpgradePaused the waveUpgradePaused value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withWaveUpgradePaused(Boolean waveUpgradePaused) {
        this.waveUpgradePaused = waveUpgradePaused;
        return this;
    }

    /**
     * Get the notifications property: Indicates a list of notification channels for cluster events.
     *
     * @return the notifications value.
     */
    public List<Notification> notifications() {
        return this.notifications;
    }

    /**
     * Set the notifications property: Indicates a list of notification channels for cluster events.
     *
     * @param notifications the notifications value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withNotifications(List<Notification> notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availableClusterVersions() != null) {
            availableClusterVersions().forEach(e -> e.validate());
        }
        if (azureActiveDirectory() != null) {
            azureActiveDirectory().validate();
        }
        if (certificate() != null) {
            certificate().validate();
        }
        if (certificateCommonNames() != null) {
            certificateCommonNames().validate();
        }
        if (clientCertificateCommonNames() != null) {
            clientCertificateCommonNames().forEach(e -> e.validate());
        }
        if (clientCertificateThumbprints() != null) {
            clientCertificateThumbprints().forEach(e -> e.validate());
        }
        if (diagnosticsStorageAccountConfig() != null) {
            diagnosticsStorageAccountConfig().validate();
        }
        if (fabricSettings() != null) {
            fabricSettings().forEach(e -> e.validate());
        }
        if (managementEndpoint() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property managementEndpoint in model ClusterProperties"));
        }
        if (nodeTypes() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property nodeTypes in model ClusterProperties"));
        } else {
            nodeTypes().forEach(e -> e.validate());
        }
        if (reverseProxyCertificate() != null) {
            reverseProxyCertificate().validate();
        }
        if (reverseProxyCertificateCommonNames() != null) {
            reverseProxyCertificateCommonNames().validate();
        }
        if (upgradeDescription() != null) {
            upgradeDescription().validate();
        }
        if (applicationTypeVersionsCleanupPolicy() != null) {
            applicationTypeVersionsCleanupPolicy().validate();
        }
        if (notifications() != null) {
            notifications().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterProperties.class);
}
