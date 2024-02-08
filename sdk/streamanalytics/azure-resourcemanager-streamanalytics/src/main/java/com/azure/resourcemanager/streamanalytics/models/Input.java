// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.InputInner;

/**
 * An immutable client-side representation of Input.
 */
public interface Input {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the properties property: The properties that are associated with an input. Required on PUT (CreateOrReplace)
     * requests.
     * 
     * @return the properties value.
     */
    InputProperties properties();

    /**
     * Gets the name property: Resource name.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.streamanalytics.fluent.models.InputInner object.
     * 
     * @return the inner object.
     */
    InputInner innerModel();

    /**
     * The entirety of the Input definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Input definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Input definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Input definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, jobName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param jobName The name of the streaming job.
             * @return the next definition stage.
             */
            WithCreate withExistingStreamingjob(String resourceGroupName, String jobName);
        }

        /**
         * The stage of the Input definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties, DefinitionStages.WithName,
            DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Input create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Input create(Context context);
        }

        /**
         * The stage of the Input definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties that are associated with an input. Required on PUT
             * (CreateOrReplace) requests..
             * 
             * @param properties The properties that are associated with an input. Required on PUT (CreateOrReplace)
             * requests.
             * @return the next definition stage.
             */
            WithCreate withProperties(InputProperties properties);
        }

        /**
         * The stage of the Input definition allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: Resource name.
             * 
             * @param name Resource name.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the Input definition allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the input. Omit this value to always overwrite the current
             * input. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             * 
             * @param ifMatch The ETag of the input. Omit this value to always overwrite the current input. Specify the
             * last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }

        /**
         * The stage of the Input definition allowing to specify ifNoneMatch.
         */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new input to be created, but to prevent
             * updating an existing input. Other values will result in a 412 Pre-condition Failed response..
             * 
             * @param ifNoneMatch Set to '*' to allow a new input to be created, but to prevent updating an existing
             * input. Other values will result in a 412 Pre-condition Failed response.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Begins update for the Input resource.
     * 
     * @return the stage of resource update.
     */
    Input.Update update();

    /**
     * The template for Input update.
     */
    interface Update extends UpdateStages.WithProperties, UpdateStages.WithName, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Input apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Input apply(Context context);
    }

    /**
     * The Input update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Input update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties that are associated with an input. Required on PUT
             * (CreateOrReplace) requests..
             * 
             * @param properties The properties that are associated with an input. Required on PUT (CreateOrReplace)
             * requests.
             * @return the next definition stage.
             */
            Update withProperties(InputProperties properties);
        }

        /**
         * The stage of the Input update allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: Resource name.
             * 
             * @param name Resource name.
             * @return the next definition stage.
             */
            Update withName(String name);
        }

        /**
         * The stage of the Input update allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the input. Omit this value to always overwrite the current
             * input. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             * 
             * @param ifMatch The ETag of the input. Omit this value to always overwrite the current input. Specify the
             * last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Input refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Input refresh(Context context);

    /**
     * Tests whether an input’s datasource is reachable and usable by the Azure Stream Analytics service.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    ResourceTestStatus test();

    /**
     * Tests whether an input’s datasource is reachable and usable by the Azure Stream Analytics service.
     * 
     * @param input If the input specified does not already exist, this parameter must contain the full input definition
     * intended to be tested. If the input specified already exists, this parameter can be left null to test the
     * existing input as is or if specified, the properties specified will overwrite the corresponding properties in the
     * existing input (exactly like a PATCH operation) and the resulting input will be tested.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    ResourceTestStatus test(InputInner input, Context context);
}
