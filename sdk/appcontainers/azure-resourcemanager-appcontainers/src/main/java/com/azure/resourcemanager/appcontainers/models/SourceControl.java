// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.SourceControlInner;

/** An immutable client-side representation of SourceControl. */
public interface SourceControl {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the operationState property: Current provisioning State of the operation.
     *
     * @return the operationState value.
     */
    SourceControlOperationState operationState();

    /**
     * Gets the repoUrl property: The repo url which will be integrated to ContainerApp.
     *
     * @return the repoUrl value.
     */
    String repoUrl();

    /**
     * Gets the branch property: The branch which will trigger the auto deployment.
     *
     * @return the branch value.
     */
    String branch();

    /**
     * Gets the githubActionConfiguration property: Container App Revision Template with all possible settings and the
     * defaults if user did not provide them. The defaults are populated as they were at the creation time.
     *
     * @return the githubActionConfiguration value.
     */
    GithubActionConfiguration githubActionConfiguration();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.SourceControlInner object.
     *
     * @return the inner object.
     */
    SourceControlInner innerModel();

    /** The entirety of the SourceControl definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The SourceControl definition stages. */
    interface DefinitionStages {
        /** The first stage of the SourceControl definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SourceControl definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, containerAppName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param containerAppName Name of the Container App.
             * @return the next definition stage.
             */
            WithCreate withExistingContainerApp(String resourceGroupName, String containerAppName);
        }
        /**
         * The stage of the SourceControl definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithRepoUrl,
                DefinitionStages.WithBranch,
                DefinitionStages.WithGithubActionConfiguration {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SourceControl create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SourceControl create(Context context);
        }
        /** The stage of the SourceControl definition allowing to specify repoUrl. */
        interface WithRepoUrl {
            /**
             * Specifies the repoUrl property: The repo url which will be integrated to ContainerApp..
             *
             * @param repoUrl The repo url which will be integrated to ContainerApp.
             * @return the next definition stage.
             */
            WithCreate withRepoUrl(String repoUrl);
        }
        /** The stage of the SourceControl definition allowing to specify branch. */
        interface WithBranch {
            /**
             * Specifies the branch property: The branch which will trigger the auto deployment.
             *
             * @param branch The branch which will trigger the auto deployment.
             * @return the next definition stage.
             */
            WithCreate withBranch(String branch);
        }
        /** The stage of the SourceControl definition allowing to specify githubActionConfiguration. */
        interface WithGithubActionConfiguration {
            /**
             * Specifies the githubActionConfiguration property: Container App Revision Template with all possible
             * settings and the defaults if user did not provide them. The defaults are populated as they were at the
             * creation time.
             *
             * @param githubActionConfiguration Container App Revision Template with all possible settings and the
             *     defaults if user did not provide them. The defaults are populated as they were at the creation time.
             * @return the next definition stage.
             */
            WithCreate withGithubActionConfiguration(GithubActionConfiguration githubActionConfiguration);
        }
    }
    /**
     * Begins update for the SourceControl resource.
     *
     * @return the stage of resource update.
     */
    SourceControl.Update update();

    /** The template for SourceControl update. */
    interface Update
        extends UpdateStages.WithRepoUrl, UpdateStages.WithBranch, UpdateStages.WithGithubActionConfiguration {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SourceControl apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SourceControl apply(Context context);
    }
    /** The SourceControl update stages. */
    interface UpdateStages {
        /** The stage of the SourceControl update allowing to specify repoUrl. */
        interface WithRepoUrl {
            /**
             * Specifies the repoUrl property: The repo url which will be integrated to ContainerApp..
             *
             * @param repoUrl The repo url which will be integrated to ContainerApp.
             * @return the next definition stage.
             */
            Update withRepoUrl(String repoUrl);
        }
        /** The stage of the SourceControl update allowing to specify branch. */
        interface WithBranch {
            /**
             * Specifies the branch property: The branch which will trigger the auto deployment.
             *
             * @param branch The branch which will trigger the auto deployment.
             * @return the next definition stage.
             */
            Update withBranch(String branch);
        }
        /** The stage of the SourceControl update allowing to specify githubActionConfiguration. */
        interface WithGithubActionConfiguration {
            /**
             * Specifies the githubActionConfiguration property: Container App Revision Template with all possible
             * settings and the defaults if user did not provide them. The defaults are populated as they were at the
             * creation time.
             *
             * @param githubActionConfiguration Container App Revision Template with all possible settings and the
             *     defaults if user did not provide them. The defaults are populated as they were at the creation time.
             * @return the next definition stage.
             */
            Update withGithubActionConfiguration(GithubActionConfiguration githubActionConfiguration);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SourceControl refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SourceControl refresh(Context context);
}
