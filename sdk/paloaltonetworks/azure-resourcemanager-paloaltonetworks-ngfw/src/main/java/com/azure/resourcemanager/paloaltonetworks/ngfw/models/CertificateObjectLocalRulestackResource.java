// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.CertificateObjectLocalRulestackResourceInner;

/** An immutable client-side representation of CertificateObjectLocalRulestackResource. */
public interface CertificateObjectLocalRulestackResource {
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
     * Gets the certificateSignerResourceId property: Resource Id of certificate signer, to be populated only when
     * certificateSelfSigned is false.
     *
     * @return the certificateSignerResourceId value.
     */
    String certificateSignerResourceId();

    /**
     * Gets the certificateSelfSigned property: use certificate self signed.
     *
     * @return the certificateSelfSigned value.
     */
    BooleanEnum certificateSelfSigned();

    /**
     * Gets the auditComment property: comment for this object.
     *
     * @return the auditComment value.
     */
    String auditComment();

    /**
     * Gets the description property: user description for this object.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the etag property: read only string representing last create or update.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner
     * com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.CertificateObjectLocalRulestackResourceInner
     * object.
     *
     * @return the inner object.
     */
    CertificateObjectLocalRulestackResourceInner innerModel();

    /** The entirety of the CertificateObjectLocalRulestackResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCertificateSelfSigned,
            DefinitionStages.WithCreate {
    }
    /** The CertificateObjectLocalRulestackResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the CertificateObjectLocalRulestackResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CertificateObjectLocalRulestackResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, localRulestackName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param localRulestackName LocalRulestack resource name.
             * @return the next definition stage.
             */
            WithCertificateSelfSigned withExistingLocalRulestack(String resourceGroupName, String localRulestackName);
        }
        /**
         * The stage of the CertificateObjectLocalRulestackResource definition allowing to specify
         * certificateSelfSigned.
         */
        interface WithCertificateSelfSigned {
            /**
             * Specifies the certificateSelfSigned property: use certificate self signed.
             *
             * @param certificateSelfSigned use certificate self signed.
             * @return the next definition stage.
             */
            WithCreate withCertificateSelfSigned(BooleanEnum certificateSelfSigned);
        }
        /**
         * The stage of the CertificateObjectLocalRulestackResource definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithCertificateSignerResourceId,
                DefinitionStages.WithAuditComment,
                DefinitionStages.WithDescription,
                DefinitionStages.WithEtag {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CertificateObjectLocalRulestackResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CertificateObjectLocalRulestackResource create(Context context);
        }
        /**
         * The stage of the CertificateObjectLocalRulestackResource definition allowing to specify
         * certificateSignerResourceId.
         */
        interface WithCertificateSignerResourceId {
            /**
             * Specifies the certificateSignerResourceId property: Resource Id of certificate signer, to be populated
             * only when certificateSelfSigned is false.
             *
             * @param certificateSignerResourceId Resource Id of certificate signer, to be populated only when
             *     certificateSelfSigned is false.
             * @return the next definition stage.
             */
            WithCreate withCertificateSignerResourceId(String certificateSignerResourceId);
        }
        /** The stage of the CertificateObjectLocalRulestackResource definition allowing to specify auditComment. */
        interface WithAuditComment {
            /**
             * Specifies the auditComment property: comment for this object.
             *
             * @param auditComment comment for this object.
             * @return the next definition stage.
             */
            WithCreate withAuditComment(String auditComment);
        }
        /** The stage of the CertificateObjectLocalRulestackResource definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: user description for this object.
             *
             * @param description user description for this object.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the CertificateObjectLocalRulestackResource definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: read only string representing last create or update.
             *
             * @param etag read only string representing last create or update.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
    }
    /**
     * Begins update for the CertificateObjectLocalRulestackResource resource.
     *
     * @return the stage of resource update.
     */
    CertificateObjectLocalRulestackResource.Update update();

    /** The template for CertificateObjectLocalRulestackResource update. */
    interface Update
        extends UpdateStages.WithCertificateSignerResourceId,
            UpdateStages.WithCertificateSelfSigned,
            UpdateStages.WithAuditComment,
            UpdateStages.WithDescription,
            UpdateStages.WithEtag {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CertificateObjectLocalRulestackResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CertificateObjectLocalRulestackResource apply(Context context);
    }
    /** The CertificateObjectLocalRulestackResource update stages. */
    interface UpdateStages {
        /**
         * The stage of the CertificateObjectLocalRulestackResource update allowing to specify
         * certificateSignerResourceId.
         */
        interface WithCertificateSignerResourceId {
            /**
             * Specifies the certificateSignerResourceId property: Resource Id of certificate signer, to be populated
             * only when certificateSelfSigned is false.
             *
             * @param certificateSignerResourceId Resource Id of certificate signer, to be populated only when
             *     certificateSelfSigned is false.
             * @return the next definition stage.
             */
            Update withCertificateSignerResourceId(String certificateSignerResourceId);
        }
        /**
         * The stage of the CertificateObjectLocalRulestackResource update allowing to specify certificateSelfSigned.
         */
        interface WithCertificateSelfSigned {
            /**
             * Specifies the certificateSelfSigned property: use certificate self signed.
             *
             * @param certificateSelfSigned use certificate self signed.
             * @return the next definition stage.
             */
            Update withCertificateSelfSigned(BooleanEnum certificateSelfSigned);
        }
        /** The stage of the CertificateObjectLocalRulestackResource update allowing to specify auditComment. */
        interface WithAuditComment {
            /**
             * Specifies the auditComment property: comment for this object.
             *
             * @param auditComment comment for this object.
             * @return the next definition stage.
             */
            Update withAuditComment(String auditComment);
        }
        /** The stage of the CertificateObjectLocalRulestackResource update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: user description for this object.
             *
             * @param description user description for this object.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the CertificateObjectLocalRulestackResource update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: read only string representing last create or update.
             *
             * @param etag read only string representing last create or update.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CertificateObjectLocalRulestackResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CertificateObjectLocalRulestackResource refresh(Context context);
}
