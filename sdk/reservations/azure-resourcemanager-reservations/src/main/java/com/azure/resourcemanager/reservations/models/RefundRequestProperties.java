// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties needed for refund request including the session id from calculate refund, the scope, the reservation to be
 * returned and the return reason.
 */
@Fluent
public final class RefundRequestProperties {
    /*
     * SessionId that was returned by CalculateRefund API.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /*
     * The scope of the refund, e.g. Reservation
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * Reservation to return
     */
    @JsonProperty(value = "reservationToReturn")
    private ReservationToReturn reservationToReturn;

    /*
     * The reason of returning the reservation
     */
    @JsonProperty(value = "returnReason")
    private String returnReason;

    /** Creates an instance of RefundRequestProperties class. */
    public RefundRequestProperties() {
    }

    /**
     * Get the sessionId property: SessionId that was returned by CalculateRefund API.
     *
     * @return the sessionId value.
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: SessionId that was returned by CalculateRefund API.
     *
     * @param sessionId the sessionId value to set.
     * @return the RefundRequestProperties object itself.
     */
    public RefundRequestProperties withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the scope property: The scope of the refund, e.g. Reservation.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of the refund, e.g. Reservation.
     *
     * @param scope the scope value to set.
     * @return the RefundRequestProperties object itself.
     */
    public RefundRequestProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the reservationToReturn property: Reservation to return.
     *
     * @return the reservationToReturn value.
     */
    public ReservationToReturn reservationToReturn() {
        return this.reservationToReturn;
    }

    /**
     * Set the reservationToReturn property: Reservation to return.
     *
     * @param reservationToReturn the reservationToReturn value to set.
     * @return the RefundRequestProperties object itself.
     */
    public RefundRequestProperties withReservationToReturn(ReservationToReturn reservationToReturn) {
        this.reservationToReturn = reservationToReturn;
        return this;
    }

    /**
     * Get the returnReason property: The reason of returning the reservation.
     *
     * @return the returnReason value.
     */
    public String returnReason() {
        return this.returnReason;
    }

    /**
     * Set the returnReason property: The reason of returning the reservation.
     *
     * @param returnReason the returnReason value to set.
     * @return the RefundRequestProperties object itself.
     */
    public RefundRequestProperties withReturnReason(String returnReason) {
        this.returnReason = returnReason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (reservationToReturn() != null) {
            reservationToReturn().validate();
        }
    }
}
