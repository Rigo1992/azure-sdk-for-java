// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetInner;
import java.util.Map;

/** An immutable client-side representation of Fleet. */
public interface Fleet {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: If eTag is provided in the response body, it may also be provided as a header per the
     * normal etag convention. Entity tags are used for comparing two or more entities from the same requested resource.
     * HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26),
     * and If-Range (section 14.27) header fields.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The status of the last operation.
     *
     * @return the provisioningState value.
     */
    FleetProvisioningState provisioningState();

    /**
     * Gets the hubProfile property: The FleetHubProfile configures the Fleet's hub.
     *
     * @return the hubProfile value.
     */
    FleetHubProfile hubProfile();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.containerservicefleet.fluent.models.FleetInner object.
     *
     * @return the inner object.
     */
    FleetInner innerModel();

    /** The entirety of the Fleet definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Fleet definition stages. */
    interface DefinitionStages {
        /** The first stage of the Fleet definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Fleet definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Fleet definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Fleet definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithHubProfile,
                DefinitionStages.WithIfMatch,
                DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Fleet create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Fleet create(Context context);
        }
        /** The stage of the Fleet definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Fleet definition allowing to specify hubProfile. */
        interface WithHubProfile {
            /**
             * Specifies the hubProfile property: The FleetHubProfile configures the Fleet's hub..
             *
             * @param hubProfile The FleetHubProfile configures the Fleet's hub.
             * @return the next definition stage.
             */
            WithCreate withHubProfile(FleetHubProfile hubProfile);
        }
        /** The stage of the Fleet definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The request should only proceed if an entity matches this string..
             *
             * @param ifMatch The request should only proceed if an entity matches this string.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
        /** The stage of the Fleet definition allowing to specify ifNoneMatch. */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: The request should only proceed if no entity matches this string..
             *
             * @param ifNoneMatch The request should only proceed if no entity matches this string.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }
    /**
     * Begins update for the Fleet resource.
     *
     * @return the stage of resource update.
     */
    Fleet.Update update();

    /** The template for Fleet update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Fleet apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Fleet apply(Context context);
    }
    /** The Fleet update stages. */
    interface UpdateStages {
        /** The stage of the Fleet update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Fleet update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The request should only proceed if an entity matches this string..
             *
             * @param ifMatch The request should only proceed if an entity matches this string.
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
    Fleet refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Fleet refresh(Context context);

    /**
     * Lists the user credentials of a Fleet.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Credential results response along with {@link Response}.
     */
    Response<FleetCredentialResults> listCredentialsWithResponse(Context context);

    /**
     * Lists the user credentials of a Fleet.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Credential results response.
     */
    FleetCredentialResults listCredentials();
}
