// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.fluent.models.ApplicationPackageInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of ApplicationPackage. */
public interface ApplicationPackage {
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
     * Gets the etag property: The ETag of the resource, used for concurrency statements.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the state property: The current state of the application package.
     *
     * @return the state value.
     */
    PackageState state();

    /**
     * Gets the format property: The format of the application package, if the package is active.
     *
     * @return the format value.
     */
    String format();

    /**
     * Gets the storageUrl property: The URL for the application package in Azure Storage.
     *
     * @return the storageUrl value.
     */
    String storageUrl();

    /**
     * Gets the storageUrlExpiry property: The UTC time at which the Azure Storage URL will expire.
     *
     * @return the storageUrlExpiry value.
     */
    OffsetDateTime storageUrlExpiry();

    /**
     * Gets the lastActivationTime property: The time at which the package was last activated, if the package is active.
     *
     * @return the lastActivationTime value.
     */
    OffsetDateTime lastActivationTime();

    /**
     * Gets the inner com.azure.resourcemanager.batch.fluent.models.ApplicationPackageInner object.
     *
     * @return the inner object.
     */
    ApplicationPackageInner innerModel();

    /** The entirety of the ApplicationPackage definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ApplicationPackage definition stages. */
    interface DefinitionStages {
        /** The first stage of the ApplicationPackage definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ApplicationPackage definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName, applicationName.
             *
             * @param resourceGroupName The name of the resource group that contains the Batch account.
             * @param accountName The name of the Batch account.
             * @param applicationName The name of the application. This must be unique within the account.
             * @return the next definition stage.
             */
            WithCreate withExistingApplication(String resourceGroupName, String accountName, String applicationName);
        }
        /**
         * The stage of the ApplicationPackage definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ApplicationPackage create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ApplicationPackage create(Context context);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ApplicationPackage refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ApplicationPackage refresh(Context context);

    /**
     * Activates the specified application package. This should be done after the `ApplicationPackage` was created and
     * uploaded. This needs to be done before an `ApplicationPackage` can be used on Pools or Tasks.
     *
     * @param parameters The parameters for the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application package which represents a particular version of an application.
     */
    ApplicationPackage activate(ActivateApplicationPackageParameters parameters);

    /**
     * Activates the specified application package. This should be done after the `ApplicationPackage` was created and
     * uploaded. This needs to be done before an `ApplicationPackage` can be used on Pools or Tasks.
     *
     * @param parameters The parameters for the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application package which represents a particular version of an application along with {@link
     *     Response}.
     */
    Response<ApplicationPackage> activateWithResponse(ActivateApplicationPackageParameters parameters, Context context);
}
