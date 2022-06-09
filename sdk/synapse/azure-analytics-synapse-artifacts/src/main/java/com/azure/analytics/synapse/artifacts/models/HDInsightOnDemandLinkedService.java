// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** HDInsight ondemand linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HDInsightOnDemand")
@JsonFlatten
@Fluent
public class HDInsightOnDemandLinkedService extends LinkedService {
    /*
     * Number of worker/data nodes in the cluster. Suggestion value: 4. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterSize", required = true)
    private Object clusterSize;

    /*
     * The allowed idle time for the on-demand HDInsight cluster. Specifies how
     * long the on-demand HDInsight cluster stays alive after completion of an
     * activity run if there are no other active jobs in the cluster. The
     * minimum value is 5 mins. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.timeToLive", required = true)
    private Object timeToLive;

    /*
     * Version of the HDInsight cluster.  Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.version", required = true)
    private Object version;

    /*
     * Azure Storage linked service to be used by the on-demand cluster for
     * storing and processing data.
     */
    @JsonProperty(value = "typeProperties.linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /*
     * The customer’s subscription to host the cluster. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.hostSubscriptionId", required = true)
    private Object hostSubscriptionId;

    /*
     * The service principal id for the hostSubscriptionId. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The key for the service principal id.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The Tenant id/name to which the service principal belongs. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant", required = true)
    private Object tenant;

    /*
     * The resource group where the cluster belongs. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterResourceGroup", required = true)
    private Object clusterResourceGroup;

    /*
     * The prefix of cluster name, postfix will be distinct with timestamp.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterNamePrefix")
    private Object clusterNamePrefix;

    /*
     * The username to access the cluster. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterUserName")
    private Object clusterUserName;

    /*
     * The password to access the cluster.
     */
    @JsonProperty(value = "typeProperties.clusterPassword")
    private SecretBase clusterPassword;

    /*
     * The username to SSH remotely connect to cluster’s node (for Linux).
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterSshUserName")
    private Object clusterSshUserName;

    /*
     * The password to SSH remotely connect cluster’s node (for Linux).
     */
    @JsonProperty(value = "typeProperties.clusterSshPassword")
    private SecretBase clusterSshPassword;

    /*
     * Specifies additional storage accounts for the HDInsight linked service
     * so that the Data Factory service can register them on your behalf.
     */
    @JsonProperty(value = "typeProperties.additionalLinkedServiceNames")
    private List<LinkedServiceReference> additionalLinkedServiceNames;

    /*
     * The name of Azure SQL linked service that point to the HCatalog
     * database. The on-demand HDInsight cluster is created by using the Azure
     * SQL database as the metastore.
     */
    @JsonProperty(value = "typeProperties.hcatalogLinkedServiceName")
    private LinkedServiceReference hcatalogLinkedServiceName;

    /*
     * The cluster type. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterType")
    private Object clusterType;

    /*
     * The version of spark if the cluster type is 'spark'. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.sparkVersion")
    private Object sparkVersion;

    /*
     * Specifies the core configuration parameters (as in core-site.xml) for
     * the HDInsight cluster to be created.
     */
    @JsonProperty(value = "typeProperties.coreConfiguration")
    private Object coreConfiguration;

    /*
     * Specifies the HBase configuration parameters (hbase-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.hBaseConfiguration")
    private Object hBaseConfiguration;

    /*
     * Specifies the HDFS configuration parameters (hdfs-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.hdfsConfiguration")
    private Object hdfsConfiguration;

    /*
     * Specifies the hive configuration parameters (hive-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.hiveConfiguration")
    private Object hiveConfiguration;

    /*
     * Specifies the MapReduce configuration parameters (mapred-site.xml) for
     * the HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.mapReduceConfiguration")
    private Object mapReduceConfiguration;

    /*
     * Specifies the Oozie configuration parameters (oozie-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.oozieConfiguration")
    private Object oozieConfiguration;

    /*
     * Specifies the Storm configuration parameters (storm-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.stormConfiguration")
    private Object stormConfiguration;

    /*
     * Specifies the Yarn configuration parameters (yarn-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.yarnConfiguration")
    private Object yarnConfiguration;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /*
     * Specifies the size of the head node for the HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.headNodeSize")
    private Object headNodeSize;

    /*
     * Specifies the size of the data node for the HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.dataNodeSize")
    private Object dataNodeSize;

    /*
     * Specifies the size of the Zoo Keeper node for the HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.zookeeperNodeSize")
    private Object zookeeperNodeSize;

    /*
     * Custom script actions to run on HDI ondemand cluster once it's up.
     * Please refer to
     * https://docs.microsoft.com/en-us/azure/hdinsight/hdinsight-hadoop-customize-cluster-linux?toc=%2Fen-us%2Fazure%2Fhdinsight%2Fr-server%2FTOC.json&bc=%2Fen-us%2Fazure%2Fbread%2Ftoc.json#understanding-script-actions.
     */
    @JsonProperty(value = "typeProperties.scriptActions")
    private List<ScriptAction> scriptActions;

    /*
     * The ARM resource ID for the vNet to which the cluster should be joined
     * after creation. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.virtualNetworkId")
    private Object virtualNetworkId;

    /*
     * The ARM resource ID for the subnet in the vNet. If virtualNetworkId was
     * specified, then this property is required. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.subnetName")
    private Object subnetName;

    /**
     * Get the clusterSize property: Number of worker/data nodes in the cluster. Suggestion value: 4. Type: string (or
     * Expression with resultType string).
     *
     * @return the clusterSize value.
     */
    public Object getClusterSize() {
        return this.clusterSize;
    }

    /**
     * Set the clusterSize property: Number of worker/data nodes in the cluster. Suggestion value: 4. Type: string (or
     * Expression with resultType string).
     *
     * @param clusterSize the clusterSize value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setClusterSize(Object clusterSize) {
        this.clusterSize = clusterSize;
        return this;
    }

    /**
     * Get the timeToLive property: The allowed idle time for the on-demand HDInsight cluster. Specifies how long the
     * on-demand HDInsight cluster stays alive after completion of an activity run if there are no other active jobs in
     * the cluster. The minimum value is 5 mins. Type: string (or Expression with resultType string).
     *
     * @return the timeToLive value.
     */
    public Object getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * Set the timeToLive property: The allowed idle time for the on-demand HDInsight cluster. Specifies how long the
     * on-demand HDInsight cluster stays alive after completion of an activity run if there are no other active jobs in
     * the cluster. The minimum value is 5 mins. Type: string (or Expression with resultType string).
     *
     * @param timeToLive the timeToLive value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setTimeToLive(Object timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * Get the version property: Version of the HDInsight cluster.  Type: string (or Expression with resultType string).
     *
     * @return the version value.
     */
    public Object getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Version of the HDInsight cluster.  Type: string (or Expression with resultType string).
     *
     * @param version the version value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setVersion(Object version) {
        this.version = version;
        return this;
    }

    /**
     * Get the linkedServiceName property: Azure Storage linked service to be used by the on-demand cluster for storing
     * and processing data.
     *
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: Azure Storage linked service to be used by the on-demand cluster for storing
     * and processing data.
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the hostSubscriptionId property: The customer’s subscription to host the cluster. Type: string (or Expression
     * with resultType string).
     *
     * @return the hostSubscriptionId value.
     */
    public Object getHostSubscriptionId() {
        return this.hostSubscriptionId;
    }

    /**
     * Set the hostSubscriptionId property: The customer’s subscription to host the cluster. Type: string (or Expression
     * with resultType string).
     *
     * @param hostSubscriptionId the hostSubscriptionId value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setHostSubscriptionId(Object hostSubscriptionId) {
        this.hostSubscriptionId = hostSubscriptionId;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The service principal id for the hostSubscriptionId. Type: string (or
     * Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The service principal id for the hostSubscriptionId. Type: string (or
     * Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key for the service principal id.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key for the service principal id.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The Tenant id/name to which the service principal belongs. Type: string (or Expression
     * with resultType string).
     *
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The Tenant id/name to which the service principal belongs. Type: string (or Expression
     * with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the clusterResourceGroup property: The resource group where the cluster belongs. Type: string (or Expression
     * with resultType string).
     *
     * @return the clusterResourceGroup value.
     */
    public Object getClusterResourceGroup() {
        return this.clusterResourceGroup;
    }

    /**
     * Set the clusterResourceGroup property: The resource group where the cluster belongs. Type: string (or Expression
     * with resultType string).
     *
     * @param clusterResourceGroup the clusterResourceGroup value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setClusterResourceGroup(Object clusterResourceGroup) {
        this.clusterResourceGroup = clusterResourceGroup;
        return this;
    }

    /**
     * Get the clusterNamePrefix property: The prefix of cluster name, postfix will be distinct with timestamp. Type:
     * string (or Expression with resultType string).
     *
     * @return the clusterNamePrefix value.
     */
    public Object getClusterNamePrefix() {
        return this.clusterNamePrefix;
    }

    /**
     * Set the clusterNamePrefix property: The prefix of cluster name, postfix will be distinct with timestamp. Type:
     * string (or Expression with resultType string).
     *
     * @param clusterNamePrefix the clusterNamePrefix value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setClusterNamePrefix(Object clusterNamePrefix) {
        this.clusterNamePrefix = clusterNamePrefix;
        return this;
    }

    /**
     * Get the clusterUserName property: The username to access the cluster. Type: string (or Expression with resultType
     * string).
     *
     * @return the clusterUserName value.
     */
    public Object getClusterUserName() {
        return this.clusterUserName;
    }

    /**
     * Set the clusterUserName property: The username to access the cluster. Type: string (or Expression with resultType
     * string).
     *
     * @param clusterUserName the clusterUserName value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setClusterUserName(Object clusterUserName) {
        this.clusterUserName = clusterUserName;
        return this;
    }

    /**
     * Get the clusterPassword property: The password to access the cluster.
     *
     * @return the clusterPassword value.
     */
    public SecretBase getClusterPassword() {
        return this.clusterPassword;
    }

    /**
     * Set the clusterPassword property: The password to access the cluster.
     *
     * @param clusterPassword the clusterPassword value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setClusterPassword(SecretBase clusterPassword) {
        this.clusterPassword = clusterPassword;
        return this;
    }

    /**
     * Get the clusterSshUserName property: The username to SSH remotely connect to cluster’s node (for Linux). Type:
     * string (or Expression with resultType string).
     *
     * @return the clusterSshUserName value.
     */
    public Object getClusterSshUserName() {
        return this.clusterSshUserName;
    }

    /**
     * Set the clusterSshUserName property: The username to SSH remotely connect to cluster’s node (for Linux). Type:
     * string (or Expression with resultType string).
     *
     * @param clusterSshUserName the clusterSshUserName value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setClusterSshUserName(Object clusterSshUserName) {
        this.clusterSshUserName = clusterSshUserName;
        return this;
    }

    /**
     * Get the clusterSshPassword property: The password to SSH remotely connect cluster’s node (for Linux).
     *
     * @return the clusterSshPassword value.
     */
    public SecretBase getClusterSshPassword() {
        return this.clusterSshPassword;
    }

    /**
     * Set the clusterSshPassword property: The password to SSH remotely connect cluster’s node (for Linux).
     *
     * @param clusterSshPassword the clusterSshPassword value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setClusterSshPassword(SecretBase clusterSshPassword) {
        this.clusterSshPassword = clusterSshPassword;
        return this;
    }

    /**
     * Get the additionalLinkedServiceNames property: Specifies additional storage accounts for the HDInsight linked
     * service so that the Data Factory service can register them on your behalf.
     *
     * @return the additionalLinkedServiceNames value.
     */
    public List<LinkedServiceReference> getAdditionalLinkedServiceNames() {
        return this.additionalLinkedServiceNames;
    }

    /**
     * Set the additionalLinkedServiceNames property: Specifies additional storage accounts for the HDInsight linked
     * service so that the Data Factory service can register them on your behalf.
     *
     * @param additionalLinkedServiceNames the additionalLinkedServiceNames value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setAdditionalLinkedServiceNames(
            List<LinkedServiceReference> additionalLinkedServiceNames) {
        this.additionalLinkedServiceNames = additionalLinkedServiceNames;
        return this;
    }

    /**
     * Get the hcatalogLinkedServiceName property: The name of Azure SQL linked service that point to the HCatalog
     * database. The on-demand HDInsight cluster is created by using the Azure SQL database as the metastore.
     *
     * @return the hcatalogLinkedServiceName value.
     */
    public LinkedServiceReference getHcatalogLinkedServiceName() {
        return this.hcatalogLinkedServiceName;
    }

    /**
     * Set the hcatalogLinkedServiceName property: The name of Azure SQL linked service that point to the HCatalog
     * database. The on-demand HDInsight cluster is created by using the Azure SQL database as the metastore.
     *
     * @param hcatalogLinkedServiceName the hcatalogLinkedServiceName value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setHcatalogLinkedServiceName(
            LinkedServiceReference hcatalogLinkedServiceName) {
        this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
        return this;
    }

    /**
     * Get the clusterType property: The cluster type. Type: string (or Expression with resultType string).
     *
     * @return the clusterType value.
     */
    public Object getClusterType() {
        return this.clusterType;
    }

    /**
     * Set the clusterType property: The cluster type. Type: string (or Expression with resultType string).
     *
     * @param clusterType the clusterType value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setClusterType(Object clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * Get the sparkVersion property: The version of spark if the cluster type is 'spark'. Type: string (or Expression
     * with resultType string).
     *
     * @return the sparkVersion value.
     */
    public Object getSparkVersion() {
        return this.sparkVersion;
    }

    /**
     * Set the sparkVersion property: The version of spark if the cluster type is 'spark'. Type: string (or Expression
     * with resultType string).
     *
     * @param sparkVersion the sparkVersion value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setSparkVersion(Object sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }

    /**
     * Get the coreConfiguration property: Specifies the core configuration parameters (as in core-site.xml) for the
     * HDInsight cluster to be created.
     *
     * @return the coreConfiguration value.
     */
    public Object getCoreConfiguration() {
        return this.coreConfiguration;
    }

    /**
     * Set the coreConfiguration property: Specifies the core configuration parameters (as in core-site.xml) for the
     * HDInsight cluster to be created.
     *
     * @param coreConfiguration the coreConfiguration value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setCoreConfiguration(Object coreConfiguration) {
        this.coreConfiguration = coreConfiguration;
        return this;
    }

    /**
     * Get the hBaseConfiguration property: Specifies the HBase configuration parameters (hbase-site.xml) for the
     * HDInsight cluster.
     *
     * @return the hBaseConfiguration value.
     */
    public Object getHBaseConfiguration() {
        return this.hBaseConfiguration;
    }

    /**
     * Set the hBaseConfiguration property: Specifies the HBase configuration parameters (hbase-site.xml) for the
     * HDInsight cluster.
     *
     * @param hBaseConfiguration the hBaseConfiguration value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setHBaseConfiguration(Object hBaseConfiguration) {
        this.hBaseConfiguration = hBaseConfiguration;
        return this;
    }

    /**
     * Get the hdfsConfiguration property: Specifies the HDFS configuration parameters (hdfs-site.xml) for the HDInsight
     * cluster.
     *
     * @return the hdfsConfiguration value.
     */
    public Object getHdfsConfiguration() {
        return this.hdfsConfiguration;
    }

    /**
     * Set the hdfsConfiguration property: Specifies the HDFS configuration parameters (hdfs-site.xml) for the HDInsight
     * cluster.
     *
     * @param hdfsConfiguration the hdfsConfiguration value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setHdfsConfiguration(Object hdfsConfiguration) {
        this.hdfsConfiguration = hdfsConfiguration;
        return this;
    }

    /**
     * Get the hiveConfiguration property: Specifies the hive configuration parameters (hive-site.xml) for the HDInsight
     * cluster.
     *
     * @return the hiveConfiguration value.
     */
    public Object getHiveConfiguration() {
        return this.hiveConfiguration;
    }

    /**
     * Set the hiveConfiguration property: Specifies the hive configuration parameters (hive-site.xml) for the HDInsight
     * cluster.
     *
     * @param hiveConfiguration the hiveConfiguration value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setHiveConfiguration(Object hiveConfiguration) {
        this.hiveConfiguration = hiveConfiguration;
        return this;
    }

    /**
     * Get the mapReduceConfiguration property: Specifies the MapReduce configuration parameters (mapred-site.xml) for
     * the HDInsight cluster.
     *
     * @return the mapReduceConfiguration value.
     */
    public Object getMapReduceConfiguration() {
        return this.mapReduceConfiguration;
    }

    /**
     * Set the mapReduceConfiguration property: Specifies the MapReduce configuration parameters (mapred-site.xml) for
     * the HDInsight cluster.
     *
     * @param mapReduceConfiguration the mapReduceConfiguration value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setMapReduceConfiguration(Object mapReduceConfiguration) {
        this.mapReduceConfiguration = mapReduceConfiguration;
        return this;
    }

    /**
     * Get the oozieConfiguration property: Specifies the Oozie configuration parameters (oozie-site.xml) for the
     * HDInsight cluster.
     *
     * @return the oozieConfiguration value.
     */
    public Object getOozieConfiguration() {
        return this.oozieConfiguration;
    }

    /**
     * Set the oozieConfiguration property: Specifies the Oozie configuration parameters (oozie-site.xml) for the
     * HDInsight cluster.
     *
     * @param oozieConfiguration the oozieConfiguration value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setOozieConfiguration(Object oozieConfiguration) {
        this.oozieConfiguration = oozieConfiguration;
        return this;
    }

    /**
     * Get the stormConfiguration property: Specifies the Storm configuration parameters (storm-site.xml) for the
     * HDInsight cluster.
     *
     * @return the stormConfiguration value.
     */
    public Object getStormConfiguration() {
        return this.stormConfiguration;
    }

    /**
     * Set the stormConfiguration property: Specifies the Storm configuration parameters (storm-site.xml) for the
     * HDInsight cluster.
     *
     * @param stormConfiguration the stormConfiguration value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setStormConfiguration(Object stormConfiguration) {
        this.stormConfiguration = stormConfiguration;
        return this;
    }

    /**
     * Get the yarnConfiguration property: Specifies the Yarn configuration parameters (yarn-site.xml) for the HDInsight
     * cluster.
     *
     * @return the yarnConfiguration value.
     */
    public Object getYarnConfiguration() {
        return this.yarnConfiguration;
    }

    /**
     * Set the yarnConfiguration property: Specifies the Yarn configuration parameters (yarn-site.xml) for the HDInsight
     * cluster.
     *
     * @param yarnConfiguration the yarnConfiguration value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setYarnConfiguration(Object yarnConfiguration) {
        this.yarnConfiguration = yarnConfiguration;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the headNodeSize property: Specifies the size of the head node for the HDInsight cluster.
     *
     * @return the headNodeSize value.
     */
    public Object getHeadNodeSize() {
        return this.headNodeSize;
    }

    /**
     * Set the headNodeSize property: Specifies the size of the head node for the HDInsight cluster.
     *
     * @param headNodeSize the headNodeSize value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setHeadNodeSize(Object headNodeSize) {
        this.headNodeSize = headNodeSize;
        return this;
    }

    /**
     * Get the dataNodeSize property: Specifies the size of the data node for the HDInsight cluster.
     *
     * @return the dataNodeSize value.
     */
    public Object getDataNodeSize() {
        return this.dataNodeSize;
    }

    /**
     * Set the dataNodeSize property: Specifies the size of the data node for the HDInsight cluster.
     *
     * @param dataNodeSize the dataNodeSize value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setDataNodeSize(Object dataNodeSize) {
        this.dataNodeSize = dataNodeSize;
        return this;
    }

    /**
     * Get the zookeeperNodeSize property: Specifies the size of the Zoo Keeper node for the HDInsight cluster.
     *
     * @return the zookeeperNodeSize value.
     */
    public Object getZookeeperNodeSize() {
        return this.zookeeperNodeSize;
    }

    /**
     * Set the zookeeperNodeSize property: Specifies the size of the Zoo Keeper node for the HDInsight cluster.
     *
     * @param zookeeperNodeSize the zookeeperNodeSize value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setZookeeperNodeSize(Object zookeeperNodeSize) {
        this.zookeeperNodeSize = zookeeperNodeSize;
        return this;
    }

    /**
     * Get the scriptActions property: Custom script actions to run on HDI ondemand cluster once it's up. Please refer
     * to
     * https://docs.microsoft.com/en-us/azure/hdinsight/hdinsight-hadoop-customize-cluster-linux?toc=%2Fen-us%2Fazure%2Fhdinsight%2Fr-server%2FTOC.json&amp;bc=%2Fen-us%2Fazure%2Fbread%2Ftoc.json#understanding-script-actions.
     *
     * @return the scriptActions value.
     */
    public List<ScriptAction> getScriptActions() {
        return this.scriptActions;
    }

    /**
     * Set the scriptActions property: Custom script actions to run on HDI ondemand cluster once it's up. Please refer
     * to
     * https://docs.microsoft.com/en-us/azure/hdinsight/hdinsight-hadoop-customize-cluster-linux?toc=%2Fen-us%2Fazure%2Fhdinsight%2Fr-server%2FTOC.json&amp;bc=%2Fen-us%2Fazure%2Fbread%2Ftoc.json#understanding-script-actions.
     *
     * @param scriptActions the scriptActions value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setScriptActions(List<ScriptAction> scriptActions) {
        this.scriptActions = scriptActions;
        return this;
    }

    /**
     * Get the virtualNetworkId property: The ARM resource ID for the vNet to which the cluster should be joined after
     * creation. Type: string (or Expression with resultType string).
     *
     * @return the virtualNetworkId value.
     */
    public Object getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     * Set the virtualNetworkId property: The ARM resource ID for the vNet to which the cluster should be joined after
     * creation. Type: string (or Expression with resultType string).
     *
     * @param virtualNetworkId the virtualNetworkId value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setVirtualNetworkId(Object virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }

    /**
     * Get the subnetName property: The ARM resource ID for the subnet in the vNet. If virtualNetworkId was specified,
     * then this property is required. Type: string (or Expression with resultType string).
     *
     * @return the subnetName value.
     */
    public Object getSubnetName() {
        return this.subnetName;
    }

    /**
     * Set the subnetName property: The ARM resource ID for the subnet in the vNet. If virtualNetworkId was specified,
     * then this property is required. Type: string (or Expression with resultType string).
     *
     * @param subnetName the subnetName value to set.
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService setSubnetName(Object subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightOnDemandLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightOnDemandLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightOnDemandLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightOnDemandLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
