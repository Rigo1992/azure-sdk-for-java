// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.resourcemanager.reservations.models.AppliedScopeType;
import com.azure.resourcemanager.reservations.models.InstanceFlexibility;
import com.azure.resourcemanager.reservations.models.PatchModel;

/** Samples for Reservation Update. */
public final class ReservationUpdateSamples {
    /*
     * x-ms-original-file: specification/reservations/resource-manager/Microsoft.Capacity/stable/2022-11-01/examples/UpdateReservation.json
     */
    /**
     * Sample code: PatchReservation.
     *
     * @param manager Entry point to ReservationsManager.
     */
    public static void patchReservation(com.azure.resourcemanager.reservations.ReservationsManager manager) {
        manager
            .reservations()
            .update(
                "276e7ae4-84d0-4da6-ab4b-d6b94f3557da",
                "6ef59113-3482-40da-8d79-787f823e34bc",
                new PatchModel()
                    .withAppliedScopeType(AppliedScopeType.SHARED)
                    .withInstanceFlexibility(InstanceFlexibility.OFF),
                com.azure.core.util.Context.NONE);
    }
}
