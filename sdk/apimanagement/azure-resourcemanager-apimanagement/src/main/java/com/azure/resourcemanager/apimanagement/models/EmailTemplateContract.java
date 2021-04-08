// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.EmailTemplateContractInner;
import java.util.List;

/** An immutable client-side representation of EmailTemplateContract. */
public interface EmailTemplateContract {
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
     * Gets the subject property: Subject of the Template.
     *
     * @return the subject value.
     */
    String subject();

    /**
     * Gets the body property: Email Template Body. This should be a valid XDocument.
     *
     * @return the body value.
     */
    String body();

    /**
     * Gets the title property: Title of the Template.
     *
     * @return the title value.
     */
    String title();

    /**
     * Gets the description property: Description of the Email Template.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the isDefault property: Whether the template is the default template provided by Api Management or has been
     * edited.
     *
     * @return the isDefault value.
     */
    Boolean isDefault();

    /**
     * Gets the parameters property: Email Template Parameter values.
     *
     * @return the parameters value.
     */
    List<EmailTemplateParametersContractProperties> parameters();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.EmailTemplateContractInner object.
     *
     * @return the inner object.
     */
    EmailTemplateContractInner innerModel();

    /** The entirety of the EmailTemplateContract definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The EmailTemplateContract definition stages. */
    interface DefinitionStages {
        /** The first stage of the EmailTemplateContract definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the EmailTemplateContract definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param serviceName The name of the API Management service.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String serviceName);
        }
        /**
         * The stage of the EmailTemplateContract definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithSubject,
                DefinitionStages.WithTitle,
                DefinitionStages.WithDescription,
                DefinitionStages.WithBody,
                DefinitionStages.WithParameters,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            EmailTemplateContract create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            EmailTemplateContract create(Context context);
        }
        /** The stage of the EmailTemplateContract definition allowing to specify subject. */
        interface WithSubject {
            /**
             * Specifies the subject property: Subject of the Template..
             *
             * @param subject Subject of the Template.
             * @return the next definition stage.
             */
            WithCreate withSubject(String subject);
        }
        /** The stage of the EmailTemplateContract definition allowing to specify title. */
        interface WithTitle {
            /**
             * Specifies the title property: Title of the Template..
             *
             * @param title Title of the Template.
             * @return the next definition stage.
             */
            WithCreate withTitle(String title);
        }
        /** The stage of the EmailTemplateContract definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of the Email Template..
             *
             * @param description Description of the Email Template.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the EmailTemplateContract definition allowing to specify body. */
        interface WithBody {
            /**
             * Specifies the body property: Email Template Body. This should be a valid XDocument.
             *
             * @param body Email Template Body. This should be a valid XDocument.
             * @return the next definition stage.
             */
            WithCreate withBody(String body);
        }
        /** The stage of the EmailTemplateContract definition allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: Email Template Parameter values..
             *
             * @param parameters Email Template Parameter values.
             * @return the next definition stage.
             */
            WithCreate withParameters(List<EmailTemplateParametersContractProperties> parameters);
        }
        /** The stage of the EmailTemplateContract definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             *
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             *     entity.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the EmailTemplateContract resource.
     *
     * @return the stage of resource update.
     */
    EmailTemplateContract.Update update();

    /** The template for EmailTemplateContract update. */
    interface Update
        extends UpdateStages.WithSubject,
            UpdateStages.WithTitle,
            UpdateStages.WithDescription,
            UpdateStages.WithBody,
            UpdateStages.WithParameters,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        EmailTemplateContract apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        EmailTemplateContract apply(Context context);
    }
    /** The EmailTemplateContract update stages. */
    interface UpdateStages {
        /** The stage of the EmailTemplateContract update allowing to specify subject. */
        interface WithSubject {
            /**
             * Specifies the subject property: Subject of the Template..
             *
             * @param subject Subject of the Template.
             * @return the next definition stage.
             */
            Update withSubject(String subject);
        }
        /** The stage of the EmailTemplateContract update allowing to specify title. */
        interface WithTitle {
            /**
             * Specifies the title property: Title of the Template..
             *
             * @param title Title of the Template.
             * @return the next definition stage.
             */
            Update withTitle(String title);
        }
        /** The stage of the EmailTemplateContract update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of the Email Template..
             *
             * @param description Description of the Email Template.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the EmailTemplateContract update allowing to specify body. */
        interface WithBody {
            /**
             * Specifies the body property: Email Template Body. This should be a valid XDocument.
             *
             * @param body Email Template Body. This should be a valid XDocument.
             * @return the next definition stage.
             */
            Update withBody(String body);
        }
        /** The stage of the EmailTemplateContract update allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: Email Template Parameter values..
             *
             * @param parameters Email Template Parameter values.
             * @return the next definition stage.
             */
            Update withParameters(List<EmailTemplateParametersContractProperties> parameters);
        }
        /** The stage of the EmailTemplateContract update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             *
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             *     the GET request or it should be * for unconditional update.
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
    EmailTemplateContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    EmailTemplateContract refresh(Context context);
}
