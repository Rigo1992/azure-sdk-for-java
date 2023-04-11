// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.resourcemanager.reservations.fluent.models.AppliedReservationsInner;

/** An immutable client-side representation of AppliedReservations. */
public interface AppliedReservations {
    /**
     * Gets the id property: Identifier of the applied reservations.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Type of resource. "Microsoft.Capacity/AppliedReservations".
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the reservationOrderIds property: Paginated list of applied reservations.
     *
     * @return the reservationOrderIds value.
     */
    AppliedReservationList reservationOrderIds();

    /**
     * Gets the inner com.azure.resourcemanager.reservations.fluent.models.AppliedReservationsInner object.
     *
     * @return the inner object.
     */
    AppliedReservationsInner innerModel();
}
