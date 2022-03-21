// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * This method gets all the operations that are exposed for customer.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of REST API operations supported by an Azure Resource Provider.
     */
    PagedIterable<Operation> listOperations();

    /**
     * This method gets all the operations that are exposed for customer.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of REST API operations supported by an Azure Resource Provider.
     */
    PagedIterable<Operation> listOperations(Context context);

    /**
     * Lists all the addresses available under the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return address Resource Collection.
     */
    PagedIterable<AddressResource> list();

    /**
     * Lists all the addresses available under the subscription.
     *
     * @param filter $filter is supported to filter based on shipping address properties. Filter supports only equals
     *     operation.
     * @param skipToken $skipToken is supported on Get list of addresses, which provides the next page in the list of
     *     addresses.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return address Resource Collection.
     */
    PagedIterable<AddressResource> list(String filter, String skipToken, Context context);

    /**
     * This method provides the list of product families for the given subscription.
     *
     * @param productFamiliesRequest Filters for showing the product families.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of product families.
     */
    PagedIterable<ProductFamily> listProductFamilies(ProductFamiliesRequest productFamiliesRequest);

    /**
     * This method provides the list of product families for the given subscription.
     *
     * @param productFamiliesRequest Filters for showing the product families.
     * @param expand $expand is supported on configurations parameter for product, which provides details on the
     *     configurations for the product.
     * @param skipToken $skipToken is supported on list of product families, which provides the next page in the list of
     *     product families.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of product families.
     */
    PagedIterable<ProductFamily> listProductFamilies(
        ProductFamiliesRequest productFamiliesRequest, String expand, String skipToken, Context context);

    /**
     * This method provides the list of configurations for the given product family, product line and product under
     * subscription.
     *
     * @param configurationsRequest Filters for showing the configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of configurations.
     */
    PagedIterable<Configuration> listConfigurations(ConfigurationsRequest configurationsRequest);

    /**
     * This method provides the list of configurations for the given product family, product line and product under
     * subscription.
     *
     * @param configurationsRequest Filters for showing the configurations.
     * @param skipToken $skipToken is supported on list of configurations, which provides the next page in the list of
     *     configurations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of configurations.
     */
    PagedIterable<Configuration> listConfigurations(
        ConfigurationsRequest configurationsRequest, String skipToken, Context context);

    /**
     * This method provides the list of product families metadata for the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return holds details about product family metadata.
     */
    PagedIterable<ProductFamiliesMetadataDetails> listProductFamiliesMetadata();

    /**
     * This method provides the list of product families metadata for the given subscription.
     *
     * @param skipToken $skipToken is supported on list of product families metadata, which provides the next page in
     *     the list of product families metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return holds details about product family metadata.
     */
    PagedIterable<ProductFamiliesMetadataDetails> listProductFamiliesMetadata(String skipToken, Context context);

    /**
     * Lists order at subscription level.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of orders.
     */
    PagedIterable<OrderResource> listOrderAtSubscriptionLevel();

    /**
     * Lists order at subscription level.
     *
     * @param skipToken $skipToken is supported on Get list of order, which provides the next page in the list of order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of orders.
     */
    PagedIterable<OrderResource> listOrderAtSubscriptionLevel(String skipToken, Context context);

    /**
     * Lists order item at subscription level.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of orderItems.
     */
    PagedIterable<OrderItemResource> listOrderItemsAtSubscriptionLevel();

    /**
     * Lists order item at subscription level.
     *
     * @param filter $filter is supported to filter based on order id. Filter supports only equals operation.
     * @param expand $expand is supported on device details, forward shipping details and reverse shipping details
     *     parameters. Each of these can be provided as a comma separated list. Device Details for order item provides
     *     details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse
     *     shipping details respectively.
     * @param skipToken $skipToken is supported on Get list of order items, which provides the next page in the list of
     *     order items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of orderItems.
     */
    PagedIterable<OrderItemResource> listOrderItemsAtSubscriptionLevel(
        String filter, String expand, String skipToken, Context context);

    /**
     * Lists all the addresses available under the given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return address Resource Collection.
     */
    PagedIterable<AddressResource> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the addresses available under the given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filter $filter is supported to filter based on shipping address properties. Filter supports only equals
     *     operation.
     * @param skipToken $skipToken is supported on Get list of addresses, which provides the next page in the list of
     *     address.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return address Resource Collection.
     */
    PagedIterable<AddressResource> listByResourceGroup(
        String resourceGroupName, String filter, String skipToken, Context context);

    /**
     * Gets information about the specified address.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param addressName The name of the address Resource within the specified resource group. address names must be
     *     between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified address.
     */
    AddressResource getByResourceGroup(String resourceGroupName, String addressName);

    /**
     * Gets information about the specified address.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param addressName The name of the address Resource within the specified resource group. address names must be
     *     between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified address.
     */
    Response<AddressResource> getByResourceGroupWithResponse(
        String resourceGroupName, String addressName, Context context);

    /**
     * Deletes an address.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param addressName The name of the address Resource within the specified resource group. address names must be
     *     between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String addressName);

    /**
     * Deletes an address.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param addressName The name of the address Resource within the specified resource group. address names must be
     *     between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String addressName, Context context);

    /**
     * Lists order at resource group level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of orders.
     */
    PagedIterable<OrderResource> listOrderAtResourceGroupLevel(String resourceGroupName);

    /**
     * Lists order at resource group level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param skipToken $skipToken is supported on Get list of order, which provides the next page in the list of order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of orders.
     */
    PagedIterable<OrderResource> listOrderAtResourceGroupLevel(
        String resourceGroupName, String skipToken, Context context);

    /**
     * Gets an order.
     *
     * @param orderName The name of the order.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an order.
     */
    OrderResource getOrderByName(String orderName, String resourceGroupName, String location);

    /**
     * Gets an order.
     *
     * @param orderName The name of the order.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an order.
     */
    Response<OrderResource> getOrderByNameWithResponse(
        String orderName, String resourceGroupName, String location, Context context);

    /**
     * Lists order item at resource group level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of orderItems.
     */
    PagedIterable<OrderItemResource> listOrderItemsAtResourceGroupLevel(String resourceGroupName);

    /**
     * Lists order item at resource group level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filter $filter is supported to filter based on order id. Filter supports only equals operation.
     * @param expand $expand is supported on device details, forward shipping details and reverse shipping details
     *     parameters. Each of these can be provided as a comma separated list. Device Details for order item provides
     *     details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse
     *     shipping details respectively.
     * @param skipToken $skipToken is supported on Get list of order items, which provides the next page in the list of
     *     order items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of orderItems.
     */
    PagedIterable<OrderItemResource> listOrderItemsAtResourceGroupLevel(
        String resourceGroupName, String filter, String expand, String skipToken, Context context);

    /**
     * Gets an order item.
     *
     * @param orderItemName The name of the order item.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an order item.
     */
    OrderItemResource getOrderItemByName(String orderItemName, String resourceGroupName);

    /**
     * Gets an order item.
     *
     * @param orderItemName The name of the order item.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param expand $expand is supported on device details, forward shipping details and reverse shipping details
     *     parameters. Each of these can be provided as a comma separated list. Device Details for order item provides
     *     details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse
     *     shipping details respectively.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an order item.
     */
    Response<OrderItemResource> getOrderItemByNameWithResponse(
        String orderItemName, String resourceGroupName, String expand, Context context);

    /**
     * Deletes an order item.
     *
     * @param orderItemName The name of the order item.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteOrderItemByName(String orderItemName, String resourceGroupName);

    /**
     * Deletes an order item.
     *
     * @param orderItemName The name of the order item.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteOrderItemByName(String orderItemName, String resourceGroupName, Context context);

    /**
     * Cancel order item.
     *
     * @param orderItemName The name of the order item.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cancellationReason Reason for cancellation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancelOrderItem(String orderItemName, String resourceGroupName, CancellationReason cancellationReason);

    /**
     * Cancel order item.
     *
     * @param orderItemName The name of the order item.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cancellationReason Reason for cancellation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> cancelOrderItemWithResponse(
        String orderItemName, String resourceGroupName, CancellationReason cancellationReason, Context context);

    /**
     * Return order item.
     *
     * @param orderItemName The name of the order item.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param returnOrderItemDetails Return order item CurrentStatus.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void returnOrderItem(String orderItemName, String resourceGroupName, ReturnOrderItemDetails returnOrderItemDetails);

    /**
     * Return order item.
     *
     * @param orderItemName The name of the order item.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param returnOrderItemDetails Return order item CurrentStatus.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void returnOrderItem(
        String orderItemName, String resourceGroupName, ReturnOrderItemDetails returnOrderItemDetails, Context context);

    /**
     * Gets information about the specified address.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified address.
     */
    AddressResource getById(String id);

    /**
     * Gets information about the specified address.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified address.
     */
    Response<AddressResource> getByIdWithResponse(String id, Context context);

    /**
     * Gets an order item.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an order item.
     */
    OrderItemResource getOrderItemById(String id);

    /**
     * Gets an order item.
     *
     * @param id the resource ID.
     * @param expand $expand is supported on device details, forward shipping details and reverse shipping details
     *     parameters. Each of these can be provided as a comma separated list. Device Details for order item provides
     *     details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse
     *     shipping details respectively.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an order item.
     */
    Response<OrderItemResource> getOrderItemByIdWithResponse(String id, String expand, Context context);

    /**
     * Deletes an address.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an address.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Deletes an order item.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteOrderItemById(String id);

    /**
     * Deletes an order item.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteOrderItemByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AddressResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new AddressResource definition.
     */
    AddressResource.DefinitionStages.Blank defineAddress(String name);

    /**
     * Begins definition for a new OrderItemResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new OrderItemResource definition.
     */
    OrderItemResource.DefinitionStages.Blank defineOrderItem(String name);
}
