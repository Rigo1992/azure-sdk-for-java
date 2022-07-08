// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.fluent.models.StorageInsightInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of StorageInsight. */
public interface StorageInsight {
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
     * Gets the etag property: The ETag of the storage insight.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the containers property: The names of the blob containers that the workspace should read.
     *
     * @return the containers value.
     */
    List<String> containers();

    /**
     * Gets the tables property: The names of the Azure tables that the workspace should read.
     *
     * @return the tables value.
     */
    List<String> tables();

    /**
     * Gets the storageAccount property: The storage account connection details.
     *
     * @return the storageAccount value.
     */
    StorageAccount storageAccount();

    /**
     * Gets the status property: The status of the storage insight.
     *
     * @return the status value.
     */
    StorageInsightStatus status();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.loganalytics.fluent.models.StorageInsightInner object.
     *
     * @return the inner object.
     */
    StorageInsightInner innerModel();

    /** The entirety of the StorageInsight definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The StorageInsight definition stages. */
    interface DefinitionStages {
        /** The first stage of the StorageInsight definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the StorageInsight definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @return the next definition stage.
             */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /**
         * The stage of the StorageInsight definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithEtag,
                DefinitionStages.WithContainers,
                DefinitionStages.WithTables,
                DefinitionStages.WithStorageAccount {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            StorageInsight create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StorageInsight create(Context context);
        }
        /** The stage of the StorageInsight definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the StorageInsight definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The ETag of the storage insight..
             *
             * @param etag The ETag of the storage insight.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the StorageInsight definition allowing to specify containers. */
        interface WithContainers {
            /**
             * Specifies the containers property: The names of the blob containers that the workspace should read.
             *
             * @param containers The names of the blob containers that the workspace should read.
             * @return the next definition stage.
             */
            WithCreate withContainers(List<String> containers);
        }
        /** The stage of the StorageInsight definition allowing to specify tables. */
        interface WithTables {
            /**
             * Specifies the tables property: The names of the Azure tables that the workspace should read.
             *
             * @param tables The names of the Azure tables that the workspace should read.
             * @return the next definition stage.
             */
            WithCreate withTables(List<String> tables);
        }
        /** The stage of the StorageInsight definition allowing to specify storageAccount. */
        interface WithStorageAccount {
            /**
             * Specifies the storageAccount property: The storage account connection details.
             *
             * @param storageAccount The storage account connection details.
             * @return the next definition stage.
             */
            WithCreate withStorageAccount(StorageAccount storageAccount);
        }
    }
    /**
     * Begins update for the StorageInsight resource.
     *
     * @return the stage of resource update.
     */
    StorageInsight.Update update();

    /** The template for StorageInsight update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithEtag,
            UpdateStages.WithContainers,
            UpdateStages.WithTables,
            UpdateStages.WithStorageAccount {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        StorageInsight apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        StorageInsight apply(Context context);
    }
    /** The StorageInsight update stages. */
    interface UpdateStages {
        /** The stage of the StorageInsight update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the StorageInsight update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The ETag of the storage insight..
             *
             * @param etag The ETag of the storage insight.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
        /** The stage of the StorageInsight update allowing to specify containers. */
        interface WithContainers {
            /**
             * Specifies the containers property: The names of the blob containers that the workspace should read.
             *
             * @param containers The names of the blob containers that the workspace should read.
             * @return the next definition stage.
             */
            Update withContainers(List<String> containers);
        }
        /** The stage of the StorageInsight update allowing to specify tables. */
        interface WithTables {
            /**
             * Specifies the tables property: The names of the Azure tables that the workspace should read.
             *
             * @param tables The names of the Azure tables that the workspace should read.
             * @return the next definition stage.
             */
            Update withTables(List<String> tables);
        }
        /** The stage of the StorageInsight update allowing to specify storageAccount. */
        interface WithStorageAccount {
            /**
             * Specifies the storageAccount property: The storage account connection details.
             *
             * @param storageAccount The storage account connection details.
             * @return the next definition stage.
             */
            Update withStorageAccount(StorageAccount storageAccount);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    StorageInsight refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StorageInsight refresh(Context context);
}
