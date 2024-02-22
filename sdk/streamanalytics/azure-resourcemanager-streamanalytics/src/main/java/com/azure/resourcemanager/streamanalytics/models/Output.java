// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.OutputInner;
import java.util.List;

/**
 * An immutable client-side representation of Output.
 */
public interface Output {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

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
     * Gets the datasource property: Describes the data source that output will be written to. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the datasource value.
     */
    OutputDataSource datasource();

    /**
     * Gets the timeWindow property: The time frame for filtering Stream Analytics job outputs.
     * 
     * @return the timeWindow value.
     */
    String timeWindow();

    /**
     * Gets the sizeWindow property: The size window to constrain a Stream Analytics output to.
     * 
     * @return the sizeWindow value.
     */
    Integer sizeWindow();

    /**
     * Gets the serialization property: Describes how data from an input is serialized or how data is serialized when
     * written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the serialization value.
     */
    Serialization serialization();

    /**
     * Gets the diagnostics property: Describes conditions applicable to the Input, Output, or the job overall, that
     * warrant customer attention.
     * 
     * @return the diagnostics value.
     */
    Diagnostics diagnostics();

    /**
     * Gets the etag property: The current entity tag for the output. This is an opaque string. You can use it to detect
     * whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers
     * for write operations for optimistic concurrency.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the lastOutputEventTimestamps property: A list of the last output event times for each output partition. The
     * index of the array corresponds to the partition number.
     * 
     * @return the lastOutputEventTimestamps value.
     */
    List<LastOutputEventTimestamp> lastOutputEventTimestamps();

    /**
     * Gets the watermarkSettings property: Settings which determine whether to send watermarks to downstream.
     * 
     * @return the watermarkSettings value.
     */
    OutputWatermarkProperties watermarkSettings();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.streamanalytics.fluent.models.OutputInner object.
     * 
     * @return the inner object.
     */
    OutputInner innerModel();

    /**
     * The entirety of the Output definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Output definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Output definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Output definition allowing to specify parent resource.
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
         * The stage of the Output definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithName, DefinitionStages.WithDatasource,
            DefinitionStages.WithTimeWindow, DefinitionStages.WithSizeWindow, DefinitionStages.WithSerialization,
            DefinitionStages.WithWatermarkSettings, DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Output create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Output create(Context context);
        }

        /**
         * The stage of the Output definition allowing to specify name.
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
         * The stage of the Output definition allowing to specify datasource.
         */
        interface WithDatasource {
            /**
             * Specifies the datasource property: Describes the data source that output will be written to. Required on
             * PUT (CreateOrReplace) requests..
             * 
             * @param datasource Describes the data source that output will be written to. Required on PUT
             * (CreateOrReplace) requests.
             * @return the next definition stage.
             */
            WithCreate withDatasource(OutputDataSource datasource);
        }

        /**
         * The stage of the Output definition allowing to specify timeWindow.
         */
        interface WithTimeWindow {
            /**
             * Specifies the timeWindow property: The time frame for filtering Stream Analytics job outputs..
             * 
             * @param timeWindow The time frame for filtering Stream Analytics job outputs.
             * @return the next definition stage.
             */
            WithCreate withTimeWindow(String timeWindow);
        }

        /**
         * The stage of the Output definition allowing to specify sizeWindow.
         */
        interface WithSizeWindow {
            /**
             * Specifies the sizeWindow property: The size window to constrain a Stream Analytics output to..
             * 
             * @param sizeWindow The size window to constrain a Stream Analytics output to.
             * @return the next definition stage.
             */
            WithCreate withSizeWindow(Integer sizeWindow);
        }

        /**
         * The stage of the Output definition allowing to specify serialization.
         */
        interface WithSerialization {
            /**
             * Specifies the serialization property: Describes how data from an input is serialized or how data is
             * serialized when written to an output. Required on PUT (CreateOrReplace) requests..
             * 
             * @param serialization Describes how data from an input is serialized or how data is serialized when
             * written to an output. Required on PUT (CreateOrReplace) requests.
             * @return the next definition stage.
             */
            WithCreate withSerialization(Serialization serialization);
        }

        /**
         * The stage of the Output definition allowing to specify watermarkSettings.
         */
        interface WithWatermarkSettings {
            /**
             * Specifies the watermarkSettings property: Settings which determine whether to send watermarks to
             * downstream..
             * 
             * @param watermarkSettings Settings which determine whether to send watermarks to downstream.
             * @return the next definition stage.
             */
            WithCreate withWatermarkSettings(OutputWatermarkProperties watermarkSettings);
        }

        /**
         * The stage of the Output definition allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the output. Omit this value to always overwrite the current
             * output. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             * 
             * @param ifMatch The ETag of the output. Omit this value to always overwrite the current output. Specify
             * the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }

        /**
         * The stage of the Output definition allowing to specify ifNoneMatch.
         */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new output to be created, but to prevent
             * updating an existing output. Other values will result in a 412 Pre-condition Failed response..
             * 
             * @param ifNoneMatch Set to '*' to allow a new output to be created, but to prevent updating an existing
             * output. Other values will result in a 412 Pre-condition Failed response.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Begins update for the Output resource.
     * 
     * @return the stage of resource update.
     */
    Output.Update update();

    /**
     * The template for Output update.
     */
    interface Update extends UpdateStages.WithName, UpdateStages.WithDatasource, UpdateStages.WithTimeWindow,
        UpdateStages.WithSizeWindow, UpdateStages.WithSerialization, UpdateStages.WithWatermarkSettings,
        UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Output apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Output apply(Context context);
    }

    /**
     * The Output update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Output update allowing to specify name.
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
         * The stage of the Output update allowing to specify datasource.
         */
        interface WithDatasource {
            /**
             * Specifies the datasource property: Describes the data source that output will be written to. Required on
             * PUT (CreateOrReplace) requests..
             * 
             * @param datasource Describes the data source that output will be written to. Required on PUT
             * (CreateOrReplace) requests.
             * @return the next definition stage.
             */
            Update withDatasource(OutputDataSource datasource);
        }

        /**
         * The stage of the Output update allowing to specify timeWindow.
         */
        interface WithTimeWindow {
            /**
             * Specifies the timeWindow property: The time frame for filtering Stream Analytics job outputs..
             * 
             * @param timeWindow The time frame for filtering Stream Analytics job outputs.
             * @return the next definition stage.
             */
            Update withTimeWindow(String timeWindow);
        }

        /**
         * The stage of the Output update allowing to specify sizeWindow.
         */
        interface WithSizeWindow {
            /**
             * Specifies the sizeWindow property: The size window to constrain a Stream Analytics output to..
             * 
             * @param sizeWindow The size window to constrain a Stream Analytics output to.
             * @return the next definition stage.
             */
            Update withSizeWindow(Integer sizeWindow);
        }

        /**
         * The stage of the Output update allowing to specify serialization.
         */
        interface WithSerialization {
            /**
             * Specifies the serialization property: Describes how data from an input is serialized or how data is
             * serialized when written to an output. Required on PUT (CreateOrReplace) requests..
             * 
             * @param serialization Describes how data from an input is serialized or how data is serialized when
             * written to an output. Required on PUT (CreateOrReplace) requests.
             * @return the next definition stage.
             */
            Update withSerialization(Serialization serialization);
        }

        /**
         * The stage of the Output update allowing to specify watermarkSettings.
         */
        interface WithWatermarkSettings {
            /**
             * Specifies the watermarkSettings property: Settings which determine whether to send watermarks to
             * downstream..
             * 
             * @param watermarkSettings Settings which determine whether to send watermarks to downstream.
             * @return the next definition stage.
             */
            Update withWatermarkSettings(OutputWatermarkProperties watermarkSettings);
        }

        /**
         * The stage of the Output update allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the output. Omit this value to always overwrite the current
             * output. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             * 
             * @param ifMatch The ETag of the output. Omit this value to always overwrite the current output. Specify
             * the last-seen ETag value to prevent accidentally overwriting concurrent changes.
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
    Output refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Output refresh(Context context);

    /**
     * Tests whether an output’s datasource is reachable and usable by the Azure Stream Analytics service.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    ResourceTestStatus test();

    /**
     * Tests whether an output’s datasource is reachable and usable by the Azure Stream Analytics service.
     * 
     * @param output If the output specified does not already exist, this parameter must contain the full output
     * definition intended to be tested. If the output specified already exists, this parameter can be left null to test
     * the existing output as is or if specified, the properties specified will overwrite the corresponding properties
     * in the existing output (exactly like a PATCH operation) and the resulting output will be tested.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    ResourceTestStatus test(OutputInner output, Context context);
}
