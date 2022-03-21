// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.fluent.models.BatchAccountInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of BatchAccount. */
public interface BatchAccount {
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
     * Gets the identity property: The identity of the Batch account.
     *
     * @return the identity value.
     */
    BatchAccountIdentity identity();

    /**
     * Gets the accountEndpoint property: The account endpoint used to interact with the Batch service.
     *
     * @return the accountEndpoint value.
     */
    String accountEndpoint();

    /**
     * Gets the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the poolAllocationMode property: The allocation mode for creating pools in the Batch account.
     *
     * @return the poolAllocationMode value.
     */
    PoolAllocationMode poolAllocationMode();

    /**
     * Gets the keyVaultReference property: Identifies the Azure key vault associated with a Batch account.
     *
     * @return the keyVaultReference value.
     */
    KeyVaultReference keyVaultReference();

    /**
     * Gets the publicNetworkAccess property: If not specified, the default value is 'enabled'.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccessType publicNetworkAccess();

    /**
     * Gets the privateEndpointConnections property: List of private endpoint connections associated with the Batch
     * account.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the autoStorage property: Contains information about the auto-storage account associated with a Batch
     * account.
     *
     * @return the autoStorage value.
     */
    AutoStorageProperties autoStorage();

    /**
     * Gets the encryption property: Configures how customer data is encrypted inside the Batch account. By default,
     * accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used
     * instead.
     *
     * @return the encryption value.
     */
    EncryptionProperties encryption();

    /**
     * Gets the dedicatedCoreQuota property: The dedicated core quota for the Batch account. For accounts with
     * PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     *
     * @return the dedicatedCoreQuota value.
     */
    Integer dedicatedCoreQuota();

    /**
     * Gets the lowPriorityCoreQuota property: The Spot/low-priority core quota for the Batch account. For accounts with
     * PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     *
     * @return the lowPriorityCoreQuota value.
     */
    Integer lowPriorityCoreQuota();

    /**
     * Gets the dedicatedCoreQuotaPerVMFamily property: A list of the dedicated core quota per Virtual Machine family
     * for the Batch account. For accounts with PoolAllocationMode set to UserSubscription, quota is managed on the
     * subscription so this value is not returned.
     *
     * @return the dedicatedCoreQuotaPerVMFamily value.
     */
    List<VirtualMachineFamilyCoreQuota> dedicatedCoreQuotaPerVMFamily();

    /**
     * Gets the dedicatedCoreQuotaPerVMFamilyEnforced property: A value indicating whether core quotas per Virtual
     * Machine family are enforced for this account Batch is transitioning its core quota system for dedicated cores to
     * be enforced per Virtual Machine family. During this transitional phase, the dedicated core quota per Virtual
     * Machine family may not yet be enforced. If this flag is false, dedicated core quota is enforced via the old
     * dedicatedCoreQuota property on the account and does not consider Virtual Machine family. If this flag is true,
     * dedicated core quota is enforced via the dedicatedCoreQuotaPerVMFamily property on the account, and the old
     * dedicatedCoreQuota does not apply.
     *
     * @return the dedicatedCoreQuotaPerVMFamilyEnforced value.
     */
    Boolean dedicatedCoreQuotaPerVMFamilyEnforced();

    /**
     * Gets the poolQuota property: The pool quota for the Batch account.
     *
     * @return the poolQuota value.
     */
    Integer poolQuota();

    /**
     * Gets the activeJobAndJobScheduleQuota property: The active job and job schedule quota for the Batch account.
     *
     * @return the activeJobAndJobScheduleQuota value.
     */
    Integer activeJobAndJobScheduleQuota();

    /**
     * Gets the allowedAuthenticationModes property: List of allowed authentication modes for the Batch account that can
     * be used to authenticate with the data plane. This does not affect authentication with the control plane.
     *
     * @return the allowedAuthenticationModes value.
     */
    List<AuthenticationMode> allowedAuthenticationModes();

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
     * Gets the inner com.azure.resourcemanager.batch.fluent.models.BatchAccountInner object.
     *
     * @return the inner object.
     */
    BatchAccountInner innerModel();

    /** The entirety of the BatchAccount definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The BatchAccount definition stages. */
    interface DefinitionStages {
        /** The first stage of the BatchAccount definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the BatchAccount definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The region in which to create the account.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The region in which to create the account.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the BatchAccount definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group that contains the Batch account.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the BatchAccount definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithAutoStorage,
                DefinitionStages.WithPoolAllocationMode,
                DefinitionStages.WithKeyVaultReference,
                DefinitionStages.WithPublicNetworkAccess,
                DefinitionStages.WithEncryption,
                DefinitionStages.WithAllowedAuthenticationModes {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BatchAccount create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BatchAccount create(Context context);
        }
        /** The stage of the BatchAccount definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The user-specified tags associated with the account..
             *
             * @param tags The user-specified tags associated with the account.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the BatchAccount definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the Batch account..
             *
             * @param identity The identity of the Batch account.
             * @return the next definition stage.
             */
            WithCreate withIdentity(BatchAccountIdentity identity);
        }
        /** The stage of the BatchAccount definition allowing to specify autoStorage. */
        interface WithAutoStorage {
            /**
             * Specifies the autoStorage property: The properties related to the auto-storage account..
             *
             * @param autoStorage The properties related to the auto-storage account.
             * @return the next definition stage.
             */
            WithCreate withAutoStorage(AutoStorageBaseProperties autoStorage);
        }
        /** The stage of the BatchAccount definition allowing to specify poolAllocationMode. */
        interface WithPoolAllocationMode {
            /**
             * Specifies the poolAllocationMode property: The pool allocation mode also affects how clients may
             * authenticate to the Batch Service API. If the mode is BatchService, clients may authenticate using access
             * keys or Azure Active Directory. If the mode is UserSubscription, clients must use Azure Active Directory.
             * The default is BatchService..
             *
             * @param poolAllocationMode The pool allocation mode also affects how clients may authenticate to the Batch
             *     Service API. If the mode is BatchService, clients may authenticate using access keys or Azure Active
             *     Directory. If the mode is UserSubscription, clients must use Azure Active Directory. The default is
             *     BatchService.
             * @return the next definition stage.
             */
            WithCreate withPoolAllocationMode(PoolAllocationMode poolAllocationMode);
        }
        /** The stage of the BatchAccount definition allowing to specify keyVaultReference. */
        interface WithKeyVaultReference {
            /**
             * Specifies the keyVaultReference property: A reference to the Azure key vault associated with the Batch
             * account..
             *
             * @param keyVaultReference A reference to the Azure key vault associated with the Batch account.
             * @return the next definition stage.
             */
            WithCreate withKeyVaultReference(KeyVaultReference keyVaultReference);
        }
        /** The stage of the BatchAccount definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: If not specified, the default value is 'enabled'..
             *
             * @param publicNetworkAccess If not specified, the default value is 'enabled'.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccessType publicNetworkAccess);
        }
        /** The stage of the BatchAccount definition allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Configures how customer data is encrypted inside the Batch account. By
             * default, accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed
             * key can be used instead..
             *
             * @param encryption Configures how customer data is encrypted inside the Batch account. By default,
             *     accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key
             *     can be used instead.
             * @return the next definition stage.
             */
            WithCreate withEncryption(EncryptionProperties encryption);
        }
        /** The stage of the BatchAccount definition allowing to specify allowedAuthenticationModes. */
        interface WithAllowedAuthenticationModes {
            /**
             * Specifies the allowedAuthenticationModes property: List of allowed authentication modes for the Batch
             * account that can be used to authenticate with the data plane. This does not affect authentication with
             * the control plane..
             *
             * @param allowedAuthenticationModes List of allowed authentication modes for the Batch account that can be
             *     used to authenticate with the data plane. This does not affect authentication with the control plane.
             * @return the next definition stage.
             */
            WithCreate withAllowedAuthenticationModes(List<AuthenticationMode> allowedAuthenticationModes);
        }
    }
    /**
     * Begins update for the BatchAccount resource.
     *
     * @return the stage of resource update.
     */
    BatchAccount.Update update();

    /** The template for BatchAccount update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithAutoStorage,
            UpdateStages.WithEncryption,
            UpdateStages.WithAllowedAuthenticationModes {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BatchAccount apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BatchAccount apply(Context context);
    }
    /** The BatchAccount update stages. */
    interface UpdateStages {
        /** The stage of the BatchAccount update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The user-specified tags associated with the account..
             *
             * @param tags The user-specified tags associated with the account.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the BatchAccount update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the Batch account..
             *
             * @param identity The identity of the Batch account.
             * @return the next definition stage.
             */
            Update withIdentity(BatchAccountIdentity identity);
        }
        /** The stage of the BatchAccount update allowing to specify autoStorage. */
        interface WithAutoStorage {
            /**
             * Specifies the autoStorage property: The properties related to the auto-storage account..
             *
             * @param autoStorage The properties related to the auto-storage account.
             * @return the next definition stage.
             */
            Update withAutoStorage(AutoStorageBaseProperties autoStorage);
        }
        /** The stage of the BatchAccount update allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Configures how customer data is encrypted inside the Batch account. By
             * default, accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed
             * key can be used instead..
             *
             * @param encryption Configures how customer data is encrypted inside the Batch account. By default,
             *     accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key
             *     can be used instead.
             * @return the next definition stage.
             */
            Update withEncryption(EncryptionProperties encryption);
        }
        /** The stage of the BatchAccount update allowing to specify allowedAuthenticationModes. */
        interface WithAllowedAuthenticationModes {
            /**
             * Specifies the allowedAuthenticationModes property: List of allowed authentication modes for the Batch
             * account that can be used to authenticate with the data plane. This does not affect authentication with
             * the control plane..
             *
             * @param allowedAuthenticationModes List of allowed authentication modes for the Batch account that can be
             *     used to authenticate with the data plane. This does not affect authentication with the control plane.
             * @return the next definition stage.
             */
            Update withAllowedAuthenticationModes(List<AuthenticationMode> allowedAuthenticationModes);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BatchAccount refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BatchAccount refresh(Context context);

    /**
     * Synchronizes access keys for the auto-storage account configured for the specified Batch account, only if storage
     * key authentication is being used.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void synchronizeAutoStorageKeys();

    /**
     * Synchronizes access keys for the auto-storage account configured for the specified Batch account, only if storage
     * key authentication is being used.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> synchronizeAutoStorageKeysWithResponse(Context context);

    /**
     * This operation applies only to Batch accounts with allowedAuthenticationModes containing 'SharedKey'. If the
     * Batch account doesn't contain 'SharedKey' in its allowedAuthenticationMode, clients cannot use shared keys to
     * authenticate, and must use another allowedAuthenticationModes instead. In this case, regenerating the keys will
     * fail.
     *
     * @param parameters The type of key to regenerate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a set of Azure Batch account keys.
     */
    BatchAccountKeys regenerateKey(BatchAccountRegenerateKeyParameters parameters);

    /**
     * This operation applies only to Batch accounts with allowedAuthenticationModes containing 'SharedKey'. If the
     * Batch account doesn't contain 'SharedKey' in its allowedAuthenticationMode, clients cannot use shared keys to
     * authenticate, and must use another allowedAuthenticationModes instead. In this case, regenerating the keys will
     * fail.
     *
     * @param parameters The type of key to regenerate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a set of Azure Batch account keys along with {@link Response}.
     */
    Response<BatchAccountKeys> regenerateKeyWithResponse(
        BatchAccountRegenerateKeyParameters parameters, Context context);

    /**
     * This operation applies only to Batch accounts with allowedAuthenticationModes containing 'SharedKey'. If the
     * Batch account doesn't contain 'SharedKey' in its allowedAuthenticationMode, clients cannot use shared keys to
     * authenticate, and must use another allowedAuthenticationModes instead. In this case, getting the keys will fail.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a set of Azure Batch account keys.
     */
    BatchAccountKeys getKeys();

    /**
     * This operation applies only to Batch accounts with allowedAuthenticationModes containing 'SharedKey'. If the
     * Batch account doesn't contain 'SharedKey' in its allowedAuthenticationMode, clients cannot use shared keys to
     * authenticate, and must use another allowedAuthenticationModes instead. In this case, getting the keys will fail.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a set of Azure Batch account keys along with {@link Response}.
     */
    Response<BatchAccountKeys> getKeysWithResponse(Context context);
}
