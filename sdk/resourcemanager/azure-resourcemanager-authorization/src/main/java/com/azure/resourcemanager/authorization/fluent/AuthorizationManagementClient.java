// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AuthorizationManagementClient class. */
public interface AuthorizationManagementClient {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ClassicAdministratorsClient object to access its operations.
     *
     * @return the ClassicAdministratorsClient object.
     */
    ClassicAdministratorsClient getClassicAdministrators();

    /**
     * Gets the GlobalAdministratorsClient object to access its operations.
     *
     * @return the GlobalAdministratorsClient object.
     */
    GlobalAdministratorsClient getGlobalAdministrators();

    /**
     * Gets the DenyAssignmentsClient object to access its operations.
     *
     * @return the DenyAssignmentsClient object.
     */
    DenyAssignmentsClient getDenyAssignments();

    /**
     * Gets the ProviderOperationsMetadatasClient object to access its operations.
     *
     * @return the ProviderOperationsMetadatasClient object.
     */
    ProviderOperationsMetadatasClient getProviderOperationsMetadatas();

    /**
     * Gets the RoleAssignmentsClient object to access its operations.
     *
     * @return the RoleAssignmentsClient object.
     */
    RoleAssignmentsClient getRoleAssignments();

    /**
     * Gets the PermissionsClient object to access its operations.
     *
     * @return the PermissionsClient object.
     */
    PermissionsClient getPermissions();

    /**
     * Gets the RoleDefinitionsClient object to access its operations.
     *
     * @return the RoleDefinitionsClient object.
     */
    RoleDefinitionsClient getRoleDefinitions();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the AccessReviewHistoryDefinitionsClient object to access its operations.
     *
     * @return the AccessReviewHistoryDefinitionsClient object.
     */
    AccessReviewHistoryDefinitionsClient getAccessReviewHistoryDefinitions();

    /**
     * Gets the AccessReviewHistoryDefinitionOperationsClient object to access its operations.
     *
     * @return the AccessReviewHistoryDefinitionOperationsClient object.
     */
    AccessReviewHistoryDefinitionOperationsClient getAccessReviewHistoryDefinitionOperations();

    /**
     * Gets the AccessReviewHistoryDefinitionInstancesClient object to access its operations.
     *
     * @return the AccessReviewHistoryDefinitionInstancesClient object.
     */
    AccessReviewHistoryDefinitionInstancesClient getAccessReviewHistoryDefinitionInstances();

    /**
     * Gets the AccessReviewHistoryDefinitionInstancesOperationsClient object to access its operations.
     *
     * @return the AccessReviewHistoryDefinitionInstancesOperationsClient object.
     */
    AccessReviewHistoryDefinitionInstancesOperationsClient getAccessReviewHistoryDefinitionInstancesOperations();

    /**
     * Gets the AccessReviewScheduleDefinitionsClient object to access its operations.
     *
     * @return the AccessReviewScheduleDefinitionsClient object.
     */
    AccessReviewScheduleDefinitionsClient getAccessReviewScheduleDefinitions();

    /**
     * Gets the AccessReviewInstancesClient object to access its operations.
     *
     * @return the AccessReviewInstancesClient object.
     */
    AccessReviewInstancesClient getAccessReviewInstances();

    /**
     * Gets the AccessReviewInstanceOperationsClient object to access its operations.
     *
     * @return the AccessReviewInstanceOperationsClient object.
     */
    AccessReviewInstanceOperationsClient getAccessReviewInstanceOperations();

    /**
     * Gets the AccessReviewInstanceDecisionsClient object to access its operations.
     *
     * @return the AccessReviewInstanceDecisionsClient object.
     */
    AccessReviewInstanceDecisionsClient getAccessReviewInstanceDecisions();

    /**
     * Gets the AccessReviewInstanceContactedReviewersClient object to access its operations.
     *
     * @return the AccessReviewInstanceContactedReviewersClient object.
     */
    AccessReviewInstanceContactedReviewersClient getAccessReviewInstanceContactedReviewers();

    /**
     * Gets the AccessReviewDefaultSettingsOperationsClient object to access its operations.
     *
     * @return the AccessReviewDefaultSettingsOperationsClient object.
     */
    AccessReviewDefaultSettingsOperationsClient getAccessReviewDefaultSettingsOperations();

    /**
     * Gets the ScopeAccessReviewHistoryDefinitionsClient object to access its operations.
     *
     * @return the ScopeAccessReviewHistoryDefinitionsClient object.
     */
    ScopeAccessReviewHistoryDefinitionsClient getScopeAccessReviewHistoryDefinitions();

    /**
     * Gets the ScopeAccessReviewHistoryDefinitionOperationsClient object to access its operations.
     *
     * @return the ScopeAccessReviewHistoryDefinitionOperationsClient object.
     */
    ScopeAccessReviewHistoryDefinitionOperationsClient getScopeAccessReviewHistoryDefinitionOperations();

    /**
     * Gets the ScopeAccessReviewHistoryDefinitionInstancesClient object to access its operations.
     *
     * @return the ScopeAccessReviewHistoryDefinitionInstancesClient object.
     */
    ScopeAccessReviewHistoryDefinitionInstancesClient getScopeAccessReviewHistoryDefinitionInstances();

    /**
     * Gets the ScopeAccessReviewHistoryDefinitionInstancesOperationsClient object to access its operations.
     *
     * @return the ScopeAccessReviewHistoryDefinitionInstancesOperationsClient object.
     */
    ScopeAccessReviewHistoryDefinitionInstancesOperationsClient
        getScopeAccessReviewHistoryDefinitionInstancesOperations();

    /**
     * Gets the ScopeAccessReviewScheduleDefinitionsClient object to access its operations.
     *
     * @return the ScopeAccessReviewScheduleDefinitionsClient object.
     */
    ScopeAccessReviewScheduleDefinitionsClient getScopeAccessReviewScheduleDefinitions();

    /**
     * Gets the ScopeAccessReviewInstancesClient object to access its operations.
     *
     * @return the ScopeAccessReviewInstancesClient object.
     */
    ScopeAccessReviewInstancesClient getScopeAccessReviewInstances();

    /**
     * Gets the ScopeAccessReviewInstanceOperationsClient object to access its operations.
     *
     * @return the ScopeAccessReviewInstanceOperationsClient object.
     */
    ScopeAccessReviewInstanceOperationsClient getScopeAccessReviewInstanceOperations();

    /**
     * Gets the ScopeAccessReviewInstanceDecisionsClient object to access its operations.
     *
     * @return the ScopeAccessReviewInstanceDecisionsClient object.
     */
    ScopeAccessReviewInstanceDecisionsClient getScopeAccessReviewInstanceDecisions();

    /**
     * Gets the ScopeAccessReviewInstanceContactedReviewersClient object to access its operations.
     *
     * @return the ScopeAccessReviewInstanceContactedReviewersClient object.
     */
    ScopeAccessReviewInstanceContactedReviewersClient getScopeAccessReviewInstanceContactedReviewers();

    /**
     * Gets the ScopeAccessReviewDefaultSettingsClient object to access its operations.
     *
     * @return the ScopeAccessReviewDefaultSettingsClient object.
     */
    ScopeAccessReviewDefaultSettingsClient getScopeAccessReviewDefaultSettings();

    /**
     * Gets the AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient object to access its operations.
     *
     * @return the AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient object.
     */
    AccessReviewScheduleDefinitionsAssignedForMyApprovalsClient
        getAccessReviewScheduleDefinitionsAssignedForMyApprovals();

    /**
     * Gets the AccessReviewInstancesAssignedForMyApprovalsClient object to access its operations.
     *
     * @return the AccessReviewInstancesAssignedForMyApprovalsClient object.
     */
    AccessReviewInstancesAssignedForMyApprovalsClient getAccessReviewInstancesAssignedForMyApprovals();

    /**
     * Gets the AccessReviewInstanceMyDecisionsClient object to access its operations.
     *
     * @return the AccessReviewInstanceMyDecisionsClient object.
     */
    AccessReviewInstanceMyDecisionsClient getAccessReviewInstanceMyDecisions();

    /**
     * Gets the TenantLevelAccessReviewInstanceContactedReviewersClient object to access its operations.
     *
     * @return the TenantLevelAccessReviewInstanceContactedReviewersClient object.
     */
    TenantLevelAccessReviewInstanceContactedReviewersClient getTenantLevelAccessReviewInstanceContactedReviewers();

    /**
     * Gets the EligibleChildResourcesClient object to access its operations.
     *
     * @return the EligibleChildResourcesClient object.
     */
    EligibleChildResourcesClient getEligibleChildResources();

    /**
     * Gets the RoleAssignmentSchedulesClient object to access its operations.
     *
     * @return the RoleAssignmentSchedulesClient object.
     */
    RoleAssignmentSchedulesClient getRoleAssignmentSchedules();

    /**
     * Gets the RoleAssignmentScheduleInstancesClient object to access its operations.
     *
     * @return the RoleAssignmentScheduleInstancesClient object.
     */
    RoleAssignmentScheduleInstancesClient getRoleAssignmentScheduleInstances();

    /**
     * Gets the RoleAssignmentScheduleRequestsClient object to access its operations.
     *
     * @return the RoleAssignmentScheduleRequestsClient object.
     */
    RoleAssignmentScheduleRequestsClient getRoleAssignmentScheduleRequests();

    /**
     * Gets the RoleEligibilitySchedulesClient object to access its operations.
     *
     * @return the RoleEligibilitySchedulesClient object.
     */
    RoleEligibilitySchedulesClient getRoleEligibilitySchedules();

    /**
     * Gets the RoleEligibilityScheduleInstancesClient object to access its operations.
     *
     * @return the RoleEligibilityScheduleInstancesClient object.
     */
    RoleEligibilityScheduleInstancesClient getRoleEligibilityScheduleInstances();

    /**
     * Gets the RoleEligibilityScheduleRequestsClient object to access its operations.
     *
     * @return the RoleEligibilityScheduleRequestsClient object.
     */
    RoleEligibilityScheduleRequestsClient getRoleEligibilityScheduleRequests();

    /**
     * Gets the RoleManagementPoliciesClient object to access its operations.
     *
     * @return the RoleManagementPoliciesClient object.
     */
    RoleManagementPoliciesClient getRoleManagementPolicies();

    /**
     * Gets the RoleManagementPolicyAssignmentsClient object to access its operations.
     *
     * @return the RoleManagementPolicyAssignmentsClient object.
     */
    RoleManagementPolicyAssignmentsClient getRoleManagementPolicyAssignments();

    /**
     * Gets the AlertsClient object to access its operations.
     *
     * @return the AlertsClient object.
     */
    AlertsClient getAlerts();

    /**
     * Gets the AlertConfigurationsClient object to access its operations.
     *
     * @return the AlertConfigurationsClient object.
     */
    AlertConfigurationsClient getAlertConfigurations();

    /**
     * Gets the AlertDefinitionsClient object to access its operations.
     *
     * @return the AlertDefinitionsClient object.
     */
    AlertDefinitionsClient getAlertDefinitions();

    /**
     * Gets the AlertIncidentsClient object to access its operations.
     *
     * @return the AlertIncidentsClient object.
     */
    AlertIncidentsClient getAlertIncidents();

    /**
     * Gets the AlertOperationsClient object to access its operations.
     *
     * @return the AlertOperationsClient object.
     */
    AlertOperationsClient getAlertOperations();
}
