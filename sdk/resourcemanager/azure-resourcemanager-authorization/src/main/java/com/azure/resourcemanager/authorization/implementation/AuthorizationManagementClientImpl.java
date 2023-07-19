// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.authorization.fluent.AccessReviewDefaultSettingsOperationsClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewHistoryDefinitionInstancesClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewHistoryDefinitionInstancesOperationsClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewHistoryDefinitionOperationsClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewHistoryDefinitionsClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewInstanceContactedReviewersClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewInstanceDecisionsClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewInstanceMyDecisionsClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewInstanceOperationsClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewInstancesAssignedForMyApprovalsClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewInstancesClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient;
import com.azure.resourcemanager.authorization.fluent.AccessReviewScheduleDefinitionsClient;
import com.azure.resourcemanager.authorization.fluent.AlertConfigurationsClient;
import com.azure.resourcemanager.authorization.fluent.AlertDefinitionsClient;
import com.azure.resourcemanager.authorization.fluent.AlertIncidentsClient;
import com.azure.resourcemanager.authorization.fluent.AlertOperationsClient;
import com.azure.resourcemanager.authorization.fluent.AlertsClient;
import com.azure.resourcemanager.authorization.fluent.AuthorizationManagementClient;
import com.azure.resourcemanager.authorization.fluent.ClassicAdministratorsClient;
import com.azure.resourcemanager.authorization.fluent.DenyAssignmentsClient;
import com.azure.resourcemanager.authorization.fluent.EligibleChildResourcesClient;
import com.azure.resourcemanager.authorization.fluent.GlobalAdministratorsClient;
import com.azure.resourcemanager.authorization.fluent.OperationsClient;
import com.azure.resourcemanager.authorization.fluent.PermissionsClient;
import com.azure.resourcemanager.authorization.fluent.ProviderOperationsMetadatasClient;
import com.azure.resourcemanager.authorization.fluent.RoleAssignmentScheduleInstancesClient;
import com.azure.resourcemanager.authorization.fluent.RoleAssignmentScheduleRequestsClient;
import com.azure.resourcemanager.authorization.fluent.RoleAssignmentSchedulesClient;
import com.azure.resourcemanager.authorization.fluent.RoleAssignmentsClient;
import com.azure.resourcemanager.authorization.fluent.RoleDefinitionsClient;
import com.azure.resourcemanager.authorization.fluent.RoleEligibilityScheduleInstancesClient;
import com.azure.resourcemanager.authorization.fluent.RoleEligibilityScheduleRequestsClient;
import com.azure.resourcemanager.authorization.fluent.RoleEligibilitySchedulesClient;
import com.azure.resourcemanager.authorization.fluent.RoleManagementPoliciesClient;
import com.azure.resourcemanager.authorization.fluent.RoleManagementPolicyAssignmentsClient;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewDefaultSettingsClient;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewHistoryDefinitionInstancesClient;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewHistoryDefinitionInstancesOperationsClient;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewHistoryDefinitionOperationsClient;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewHistoryDefinitionsClient;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewInstanceContactedReviewersClient;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewInstanceDecisionsClient;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewInstanceOperationsClient;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewInstancesClient;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewScheduleDefinitionsClient;
import com.azure.resourcemanager.authorization.fluent.TenantLevelAccessReviewInstanceContactedReviewersClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the AuthorizationManagementClientImpl type. */
@ServiceClient(builder = AuthorizationManagementClientBuilder.class)
public final class AuthorizationManagementClientImpl extends AzureServiceClient
    implements AuthorizationManagementClient {
    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The ClassicAdministratorsClient object to access its operations. */
    private final ClassicAdministratorsClient classicAdministrators;

    /**
     * Gets the ClassicAdministratorsClient object to access its operations.
     *
     * @return the ClassicAdministratorsClient object.
     */
    public ClassicAdministratorsClient getClassicAdministrators() {
        return this.classicAdministrators;
    }

    /** The GlobalAdministratorsClient object to access its operations. */
    private final GlobalAdministratorsClient globalAdministrators;

    /**
     * Gets the GlobalAdministratorsClient object to access its operations.
     *
     * @return the GlobalAdministratorsClient object.
     */
    public GlobalAdministratorsClient getGlobalAdministrators() {
        return this.globalAdministrators;
    }

    /** The DenyAssignmentsClient object to access its operations. */
    private final DenyAssignmentsClient denyAssignments;

    /**
     * Gets the DenyAssignmentsClient object to access its operations.
     *
     * @return the DenyAssignmentsClient object.
     */
    public DenyAssignmentsClient getDenyAssignments() {
        return this.denyAssignments;
    }

    /** The ProviderOperationsMetadatasClient object to access its operations. */
    private final ProviderOperationsMetadatasClient providerOperationsMetadatas;

    /**
     * Gets the ProviderOperationsMetadatasClient object to access its operations.
     *
     * @return the ProviderOperationsMetadatasClient object.
     */
    public ProviderOperationsMetadatasClient getProviderOperationsMetadatas() {
        return this.providerOperationsMetadatas;
    }

    /** The RoleAssignmentsClient object to access its operations. */
    private final RoleAssignmentsClient roleAssignments;

    /**
     * Gets the RoleAssignmentsClient object to access its operations.
     *
     * @return the RoleAssignmentsClient object.
     */
    public RoleAssignmentsClient getRoleAssignments() {
        return this.roleAssignments;
    }

    /** The PermissionsClient object to access its operations. */
    private final PermissionsClient permissions;

    /**
     * Gets the PermissionsClient object to access its operations.
     *
     * @return the PermissionsClient object.
     */
    public PermissionsClient getPermissions() {
        return this.permissions;
    }

    /** The RoleDefinitionsClient object to access its operations. */
    private final RoleDefinitionsClient roleDefinitions;

    /**
     * Gets the RoleDefinitionsClient object to access its operations.
     *
     * @return the RoleDefinitionsClient object.
     */
    public RoleDefinitionsClient getRoleDefinitions() {
        return this.roleDefinitions;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The AccessReviewHistoryDefinitionsClient object to access its operations. */
    private final AccessReviewHistoryDefinitionsClient accessReviewHistoryDefinitions;

    /**
     * Gets the AccessReviewHistoryDefinitionsClient object to access its operations.
     *
     * @return the AccessReviewHistoryDefinitionsClient object.
     */
    public AccessReviewHistoryDefinitionsClient getAccessReviewHistoryDefinitions() {
        return this.accessReviewHistoryDefinitions;
    }

    /** The AccessReviewHistoryDefinitionOperationsClient object to access its operations. */
    private final AccessReviewHistoryDefinitionOperationsClient accessReviewHistoryDefinitionOperations;

    /**
     * Gets the AccessReviewHistoryDefinitionOperationsClient object to access its operations.
     *
     * @return the AccessReviewHistoryDefinitionOperationsClient object.
     */
    public AccessReviewHistoryDefinitionOperationsClient getAccessReviewHistoryDefinitionOperations() {
        return this.accessReviewHistoryDefinitionOperations;
    }

    /** The AccessReviewHistoryDefinitionInstancesClient object to access its operations. */
    private final AccessReviewHistoryDefinitionInstancesClient accessReviewHistoryDefinitionInstances;

    /**
     * Gets the AccessReviewHistoryDefinitionInstancesClient object to access its operations.
     *
     * @return the AccessReviewHistoryDefinitionInstancesClient object.
     */
    public AccessReviewHistoryDefinitionInstancesClient getAccessReviewHistoryDefinitionInstances() {
        return this.accessReviewHistoryDefinitionInstances;
    }

    /** The AccessReviewHistoryDefinitionInstancesOperationsClient object to access its operations. */
    private final AccessReviewHistoryDefinitionInstancesOperationsClient
        accessReviewHistoryDefinitionInstancesOperations;

    /**
     * Gets the AccessReviewHistoryDefinitionInstancesOperationsClient object to access its operations.
     *
     * @return the AccessReviewHistoryDefinitionInstancesOperationsClient object.
     */
    public AccessReviewHistoryDefinitionInstancesOperationsClient
        getAccessReviewHistoryDefinitionInstancesOperations() {
        return this.accessReviewHistoryDefinitionInstancesOperations;
    }

    /** The AccessReviewScheduleDefinitionsClient object to access its operations. */
    private final AccessReviewScheduleDefinitionsClient accessReviewScheduleDefinitions;

    /**
     * Gets the AccessReviewScheduleDefinitionsClient object to access its operations.
     *
     * @return the AccessReviewScheduleDefinitionsClient object.
     */
    public AccessReviewScheduleDefinitionsClient getAccessReviewScheduleDefinitions() {
        return this.accessReviewScheduleDefinitions;
    }

    /** The AccessReviewInstancesClient object to access its operations. */
    private final AccessReviewInstancesClient accessReviewInstances;

    /**
     * Gets the AccessReviewInstancesClient object to access its operations.
     *
     * @return the AccessReviewInstancesClient object.
     */
    public AccessReviewInstancesClient getAccessReviewInstances() {
        return this.accessReviewInstances;
    }

    /** The AccessReviewInstanceOperationsClient object to access its operations. */
    private final AccessReviewInstanceOperationsClient accessReviewInstanceOperations;

    /**
     * Gets the AccessReviewInstanceOperationsClient object to access its operations.
     *
     * @return the AccessReviewInstanceOperationsClient object.
     */
    public AccessReviewInstanceOperationsClient getAccessReviewInstanceOperations() {
        return this.accessReviewInstanceOperations;
    }

    /** The AccessReviewInstanceDecisionsClient object to access its operations. */
    private final AccessReviewInstanceDecisionsClient accessReviewInstanceDecisions;

    /**
     * Gets the AccessReviewInstanceDecisionsClient object to access its operations.
     *
     * @return the AccessReviewInstanceDecisionsClient object.
     */
    public AccessReviewInstanceDecisionsClient getAccessReviewInstanceDecisions() {
        return this.accessReviewInstanceDecisions;
    }

    /** The AccessReviewInstanceContactedReviewersClient object to access its operations. */
    private final AccessReviewInstanceContactedReviewersClient accessReviewInstanceContactedReviewers;

    /**
     * Gets the AccessReviewInstanceContactedReviewersClient object to access its operations.
     *
     * @return the AccessReviewInstanceContactedReviewersClient object.
     */
    public AccessReviewInstanceContactedReviewersClient getAccessReviewInstanceContactedReviewers() {
        return this.accessReviewInstanceContactedReviewers;
    }

    /** The AccessReviewDefaultSettingsOperationsClient object to access its operations. */
    private final AccessReviewDefaultSettingsOperationsClient accessReviewDefaultSettingsOperations;

    /**
     * Gets the AccessReviewDefaultSettingsOperationsClient object to access its operations.
     *
     * @return the AccessReviewDefaultSettingsOperationsClient object.
     */
    public AccessReviewDefaultSettingsOperationsClient getAccessReviewDefaultSettingsOperations() {
        return this.accessReviewDefaultSettingsOperations;
    }

    /** The ScopeAccessReviewHistoryDefinitionsClient object to access its operations. */
    private final ScopeAccessReviewHistoryDefinitionsClient scopeAccessReviewHistoryDefinitions;

    /**
     * Gets the ScopeAccessReviewHistoryDefinitionsClient object to access its operations.
     *
     * @return the ScopeAccessReviewHistoryDefinitionsClient object.
     */
    public ScopeAccessReviewHistoryDefinitionsClient getScopeAccessReviewHistoryDefinitions() {
        return this.scopeAccessReviewHistoryDefinitions;
    }

    /** The ScopeAccessReviewHistoryDefinitionOperationsClient object to access its operations. */
    private final ScopeAccessReviewHistoryDefinitionOperationsClient scopeAccessReviewHistoryDefinitionOperations;

    /**
     * Gets the ScopeAccessReviewHistoryDefinitionOperationsClient object to access its operations.
     *
     * @return the ScopeAccessReviewHistoryDefinitionOperationsClient object.
     */
    public ScopeAccessReviewHistoryDefinitionOperationsClient getScopeAccessReviewHistoryDefinitionOperations() {
        return this.scopeAccessReviewHistoryDefinitionOperations;
    }

    /** The ScopeAccessReviewHistoryDefinitionInstancesClient object to access its operations. */
    private final ScopeAccessReviewHistoryDefinitionInstancesClient scopeAccessReviewHistoryDefinitionInstances;

    /**
     * Gets the ScopeAccessReviewHistoryDefinitionInstancesClient object to access its operations.
     *
     * @return the ScopeAccessReviewHistoryDefinitionInstancesClient object.
     */
    public ScopeAccessReviewHistoryDefinitionInstancesClient getScopeAccessReviewHistoryDefinitionInstances() {
        return this.scopeAccessReviewHistoryDefinitionInstances;
    }

    /** The ScopeAccessReviewHistoryDefinitionInstancesOperationsClient object to access its operations. */
    private final ScopeAccessReviewHistoryDefinitionInstancesOperationsClient
        scopeAccessReviewHistoryDefinitionInstancesOperations;

    /**
     * Gets the ScopeAccessReviewHistoryDefinitionInstancesOperationsClient object to access its operations.
     *
     * @return the ScopeAccessReviewHistoryDefinitionInstancesOperationsClient object.
     */
    public ScopeAccessReviewHistoryDefinitionInstancesOperationsClient
        getScopeAccessReviewHistoryDefinitionInstancesOperations() {
        return this.scopeAccessReviewHistoryDefinitionInstancesOperations;
    }

    /** The ScopeAccessReviewScheduleDefinitionsClient object to access its operations. */
    private final ScopeAccessReviewScheduleDefinitionsClient scopeAccessReviewScheduleDefinitions;

    /**
     * Gets the ScopeAccessReviewScheduleDefinitionsClient object to access its operations.
     *
     * @return the ScopeAccessReviewScheduleDefinitionsClient object.
     */
    public ScopeAccessReviewScheduleDefinitionsClient getScopeAccessReviewScheduleDefinitions() {
        return this.scopeAccessReviewScheduleDefinitions;
    }

    /** The ScopeAccessReviewInstancesClient object to access its operations. */
    private final ScopeAccessReviewInstancesClient scopeAccessReviewInstances;

    /**
     * Gets the ScopeAccessReviewInstancesClient object to access its operations.
     *
     * @return the ScopeAccessReviewInstancesClient object.
     */
    public ScopeAccessReviewInstancesClient getScopeAccessReviewInstances() {
        return this.scopeAccessReviewInstances;
    }

    /** The ScopeAccessReviewInstanceOperationsClient object to access its operations. */
    private final ScopeAccessReviewInstanceOperationsClient scopeAccessReviewInstanceOperations;

    /**
     * Gets the ScopeAccessReviewInstanceOperationsClient object to access its operations.
     *
     * @return the ScopeAccessReviewInstanceOperationsClient object.
     */
    public ScopeAccessReviewInstanceOperationsClient getScopeAccessReviewInstanceOperations() {
        return this.scopeAccessReviewInstanceOperations;
    }

    /** The ScopeAccessReviewInstanceDecisionsClient object to access its operations. */
    private final ScopeAccessReviewInstanceDecisionsClient scopeAccessReviewInstanceDecisions;

    /**
     * Gets the ScopeAccessReviewInstanceDecisionsClient object to access its operations.
     *
     * @return the ScopeAccessReviewInstanceDecisionsClient object.
     */
    public ScopeAccessReviewInstanceDecisionsClient getScopeAccessReviewInstanceDecisions() {
        return this.scopeAccessReviewInstanceDecisions;
    }

    /** The ScopeAccessReviewInstanceContactedReviewersClient object to access its operations. */
    private final ScopeAccessReviewInstanceContactedReviewersClient scopeAccessReviewInstanceContactedReviewers;

    /**
     * Gets the ScopeAccessReviewInstanceContactedReviewersClient object to access its operations.
     *
     * @return the ScopeAccessReviewInstanceContactedReviewersClient object.
     */
    public ScopeAccessReviewInstanceContactedReviewersClient getScopeAccessReviewInstanceContactedReviewers() {
        return this.scopeAccessReviewInstanceContactedReviewers;
    }

    /** The ScopeAccessReviewDefaultSettingsClient object to access its operations. */
    private final ScopeAccessReviewDefaultSettingsClient scopeAccessReviewDefaultSettings;

    /**
     * Gets the ScopeAccessReviewDefaultSettingsClient object to access its operations.
     *
     * @return the ScopeAccessReviewDefaultSettingsClient object.
     */
    public ScopeAccessReviewDefaultSettingsClient getScopeAccessReviewDefaultSettings() {
        return this.scopeAccessReviewDefaultSettings;
    }

    /** The AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient object to access its operations. */
    private final AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient
        accessReviewScheduleDefinitionsAssignedForMyApprovals;

    /**
     * Gets the AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient object to access its operations.
     *
     * @return the AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient object.
     */
    public AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient
        getAccessReviewScheduleDefinitionsAssignedForMyApprovals() {
        return this.accessReviewScheduleDefinitionsAssignedForMyApprovals;
    }

    /** The AccessReviewInstancesAssignedForMyApprovalsClient object to access its operations. */
    private final AccessReviewInstancesAssignedForMyApprovalsClient accessReviewInstancesAssignedForMyApprovals;

    /**
     * Gets the AccessReviewInstancesAssignedForMyApprovalsClient object to access its operations.
     *
     * @return the AccessReviewInstancesAssignedForMyApprovalsClient object.
     */
    public AccessReviewInstancesAssignedForMyApprovalsClient getAccessReviewInstancesAssignedForMyApprovals() {
        return this.accessReviewInstancesAssignedForMyApprovals;
    }

    /** The AccessReviewInstanceMyDecisionsClient object to access its operations. */
    private final AccessReviewInstanceMyDecisionsClient accessReviewInstanceMyDecisions;

    /**
     * Gets the AccessReviewInstanceMyDecisionsClient object to access its operations.
     *
     * @return the AccessReviewInstanceMyDecisionsClient object.
     */
    public AccessReviewInstanceMyDecisionsClient getAccessReviewInstanceMyDecisions() {
        return this.accessReviewInstanceMyDecisions;
    }

    /** The TenantLevelAccessReviewInstanceContactedReviewersClient object to access its operations. */
    private final TenantLevelAccessReviewInstanceContactedReviewersClient
        tenantLevelAccessReviewInstanceContactedReviewers;

    /**
     * Gets the TenantLevelAccessReviewInstanceContactedReviewersClient object to access its operations.
     *
     * @return the TenantLevelAccessReviewInstanceContactedReviewersClient object.
     */
    public TenantLevelAccessReviewInstanceContactedReviewersClient
        getTenantLevelAccessReviewInstanceContactedReviewers() {
        return this.tenantLevelAccessReviewInstanceContactedReviewers;
    }

    /** The EligibleChildResourcesClient object to access its operations. */
    private final EligibleChildResourcesClient eligibleChildResources;

    /**
     * Gets the EligibleChildResourcesClient object to access its operations.
     *
     * @return the EligibleChildResourcesClient object.
     */
    public EligibleChildResourcesClient getEligibleChildResources() {
        return this.eligibleChildResources;
    }

    /** The RoleAssignmentSchedulesClient object to access its operations. */
    private final RoleAssignmentSchedulesClient roleAssignmentSchedules;

    /**
     * Gets the RoleAssignmentSchedulesClient object to access its operations.
     *
     * @return the RoleAssignmentSchedulesClient object.
     */
    public RoleAssignmentSchedulesClient getRoleAssignmentSchedules() {
        return this.roleAssignmentSchedules;
    }

    /** The RoleAssignmentScheduleInstancesClient object to access its operations. */
    private final RoleAssignmentScheduleInstancesClient roleAssignmentScheduleInstances;

    /**
     * Gets the RoleAssignmentScheduleInstancesClient object to access its operations.
     *
     * @return the RoleAssignmentScheduleInstancesClient object.
     */
    public RoleAssignmentScheduleInstancesClient getRoleAssignmentScheduleInstances() {
        return this.roleAssignmentScheduleInstances;
    }

    /** The RoleAssignmentScheduleRequestsClient object to access its operations. */
    private final RoleAssignmentScheduleRequestsClient roleAssignmentScheduleRequests;

    /**
     * Gets the RoleAssignmentScheduleRequestsClient object to access its operations.
     *
     * @return the RoleAssignmentScheduleRequestsClient object.
     */
    public RoleAssignmentScheduleRequestsClient getRoleAssignmentScheduleRequests() {
        return this.roleAssignmentScheduleRequests;
    }

    /** The RoleEligibilitySchedulesClient object to access its operations. */
    private final RoleEligibilitySchedulesClient roleEligibilitySchedules;

    /**
     * Gets the RoleEligibilitySchedulesClient object to access its operations.
     *
     * @return the RoleEligibilitySchedulesClient object.
     */
    public RoleEligibilitySchedulesClient getRoleEligibilitySchedules() {
        return this.roleEligibilitySchedules;
    }

    /** The RoleEligibilityScheduleInstancesClient object to access its operations. */
    private final RoleEligibilityScheduleInstancesClient roleEligibilityScheduleInstances;

    /**
     * Gets the RoleEligibilityScheduleInstancesClient object to access its operations.
     *
     * @return the RoleEligibilityScheduleInstancesClient object.
     */
    public RoleEligibilityScheduleInstancesClient getRoleEligibilityScheduleInstances() {
        return this.roleEligibilityScheduleInstances;
    }

    /** The RoleEligibilityScheduleRequestsClient object to access its operations. */
    private final RoleEligibilityScheduleRequestsClient roleEligibilityScheduleRequests;

    /**
     * Gets the RoleEligibilityScheduleRequestsClient object to access its operations.
     *
     * @return the RoleEligibilityScheduleRequestsClient object.
     */
    public RoleEligibilityScheduleRequestsClient getRoleEligibilityScheduleRequests() {
        return this.roleEligibilityScheduleRequests;
    }

    /** The RoleManagementPoliciesClient object to access its operations. */
    private final RoleManagementPoliciesClient roleManagementPolicies;

    /**
     * Gets the RoleManagementPoliciesClient object to access its operations.
     *
     * @return the RoleManagementPoliciesClient object.
     */
    public RoleManagementPoliciesClient getRoleManagementPolicies() {
        return this.roleManagementPolicies;
    }

    /** The RoleManagementPolicyAssignmentsClient object to access its operations. */
    private final RoleManagementPolicyAssignmentsClient roleManagementPolicyAssignments;

    /**
     * Gets the RoleManagementPolicyAssignmentsClient object to access its operations.
     *
     * @return the RoleManagementPolicyAssignmentsClient object.
     */
    public RoleManagementPolicyAssignmentsClient getRoleManagementPolicyAssignments() {
        return this.roleManagementPolicyAssignments;
    }

    /** The AlertsClient object to access its operations. */
    private final AlertsClient alerts;

    /**
     * Gets the AlertsClient object to access its operations.
     *
     * @return the AlertsClient object.
     */
    public AlertsClient getAlerts() {
        return this.alerts;
    }

    /** The AlertConfigurationsClient object to access its operations. */
    private final AlertConfigurationsClient alertConfigurations;

    /**
     * Gets the AlertConfigurationsClient object to access its operations.
     *
     * @return the AlertConfigurationsClient object.
     */
    public AlertConfigurationsClient getAlertConfigurations() {
        return this.alertConfigurations;
    }

    /** The AlertDefinitionsClient object to access its operations. */
    private final AlertDefinitionsClient alertDefinitions;

    /**
     * Gets the AlertDefinitionsClient object to access its operations.
     *
     * @return the AlertDefinitionsClient object.
     */
    public AlertDefinitionsClient getAlertDefinitions() {
        return this.alertDefinitions;
    }

    /** The AlertIncidentsClient object to access its operations. */
    private final AlertIncidentsClient alertIncidents;

    /**
     * Gets the AlertIncidentsClient object to access its operations.
     *
     * @return the AlertIncidentsClient object.
     */
    public AlertIncidentsClient getAlertIncidents() {
        return this.alertIncidents;
    }

    /** The AlertOperationsClient object to access its operations. */
    private final AlertOperationsClient alertOperations;

    /**
     * Gets the AlertOperationsClient object to access its operations.
     *
     * @return the AlertOperationsClient object.
     */
    public AlertOperationsClient getAlertOperations() {
        return this.alertOperations;
    }

    /**
     * Initializes an instance of AuthorizationManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    AuthorizationManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.classicAdministrators = new ClassicAdministratorsClientImpl(this);
        this.globalAdministrators = new GlobalAdministratorsClientImpl(this);
        this.denyAssignments = new DenyAssignmentsClientImpl(this);
        this.providerOperationsMetadatas = new ProviderOperationsMetadatasClientImpl(this);
        this.roleAssignments = new RoleAssignmentsClientImpl(this);
        this.permissions = new PermissionsClientImpl(this);
        this.roleDefinitions = new RoleDefinitionsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.accessReviewHistoryDefinitions = new AccessReviewHistoryDefinitionsClientImpl(this);
        this.accessReviewHistoryDefinitionOperations = new AccessReviewHistoryDefinitionOperationsClientImpl(this);
        this.accessReviewHistoryDefinitionInstances = new AccessReviewHistoryDefinitionInstancesClientImpl(this);
        this.accessReviewHistoryDefinitionInstancesOperations =
            new AccessReviewHistoryDefinitionInstancesOperationsClientImpl(this);
        this.accessReviewScheduleDefinitions = new AccessReviewScheduleDefinitionsClientImpl(this);
        this.accessReviewInstances = new AccessReviewInstancesClientImpl(this);
        this.accessReviewInstanceOperations = new AccessReviewInstanceOperationsClientImpl(this);
        this.accessReviewInstanceDecisions = new AccessReviewInstanceDecisionsClientImpl(this);
        this.accessReviewInstanceContactedReviewers = new AccessReviewInstanceContactedReviewersClientImpl(this);
        this.accessReviewDefaultSettingsOperations = new AccessReviewDefaultSettingsOperationsClientImpl(this);
        this.scopeAccessReviewHistoryDefinitions = new ScopeAccessReviewHistoryDefinitionsClientImpl(this);
        this.scopeAccessReviewHistoryDefinitionOperations =
            new ScopeAccessReviewHistoryDefinitionOperationsClientImpl(this);
        this.scopeAccessReviewHistoryDefinitionInstances =
            new ScopeAccessReviewHistoryDefinitionInstancesClientImpl(this);
        this.scopeAccessReviewHistoryDefinitionInstancesOperations =
            new ScopeAccessReviewHistoryDefinitionInstancesOperationsClientImpl(this);
        this.scopeAccessReviewScheduleDefinitions = new ScopeAccessReviewScheduleDefinitionsClientImpl(this);
        this.scopeAccessReviewInstances = new ScopeAccessReviewInstancesClientImpl(this);
        this.scopeAccessReviewInstanceOperations = new ScopeAccessReviewInstanceOperationsClientImpl(this);
        this.scopeAccessReviewInstanceDecisions = new ScopeAccessReviewInstanceDecisionsClientImpl(this);
        this.scopeAccessReviewInstanceContactedReviewers =
            new ScopeAccessReviewInstanceContactedReviewersClientImpl(this);
        this.scopeAccessReviewDefaultSettings = new ScopeAccessReviewDefaultSettingsClientImpl(this);
        this.accessReviewScheduleDefinitionsAssignedForMyApprovals =
            new AccessReviewScheduleDefinitionsAssignedForMyApprovalsClientImpl(this);
        this.accessReviewInstancesAssignedForMyApprovals =
            new AccessReviewInstancesAssignedForMyApprovalsClientImpl(this);
        this.accessReviewInstanceMyDecisions = new AccessReviewInstanceMyDecisionsClientImpl(this);
        this.tenantLevelAccessReviewInstanceContactedReviewers =
            new TenantLevelAccessReviewInstanceContactedReviewersClientImpl(this);
        this.eligibleChildResources = new EligibleChildResourcesClientImpl(this);
        this.roleAssignmentSchedules = new RoleAssignmentSchedulesClientImpl(this);
        this.roleAssignmentScheduleInstances = new RoleAssignmentScheduleInstancesClientImpl(this);
        this.roleAssignmentScheduleRequests = new RoleAssignmentScheduleRequestsClientImpl(this);
        this.roleEligibilitySchedules = new RoleEligibilitySchedulesClientImpl(this);
        this.roleEligibilityScheduleInstances = new RoleEligibilityScheduleInstancesClientImpl(this);
        this.roleEligibilityScheduleRequests = new RoleEligibilityScheduleRequestsClientImpl(this);
        this.roleManagementPolicies = new RoleManagementPoliciesClientImpl(this);
        this.roleManagementPolicyAssignments = new RoleManagementPolicyAssignmentsClientImpl(this);
        this.alerts = new AlertsClientImpl(this);
        this.alertConfigurations = new AlertConfigurationsClientImpl(this);
        this.alertDefinitions = new AlertDefinitionsClientImpl(this);
        this.alertIncidents = new AlertIncidentsClientImpl(this);
        this.alertOperations = new AlertOperationsClientImpl(this);
    }
}
