// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models.events;

import com.azure.communication.callingserver.implementation.converters.ResultDetailsConverter;
import com.azure.communication.callingserver.implementation.models.PlayAudioResultEventInternal;
import com.azure.communication.callingserver.models.CallingOperationResultDetails;
import com.azure.communication.callingserver.models.CallingOperationStatus;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.BinaryData;

/** The play audio result event. */
@Immutable
public final class PlayAudioResultEvent extends CallingServerEventBase {
    /*
     * The result details.
     */
    private final CallingOperationResultDetails resultDetails;

    /*
     * The operation context.
     */
    private final String operationContext;

    /*
     * The status of the operation
     */
    private final CallingOperationStatus status;

    /**
     * Get the resultDetails property: The result details.
     *
     * @return the resultDetails value.
     */
    public CallingOperationResultDetails getResultDetails() {
        return resultDetails;
    }

    /**
     * Get the operationContext property: The operation context.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return operationContext;
    }

    /**
     * Get the status property: Gets the status of the operation.
     *
     * @return the status value.
     */
    public CallingOperationStatus getStatus() {
        return status;
    }

    /**
     * Initializes a new instance of PlayAudioResultEvent.
     *
     * @param resultDetails the resultDetails value.
     * @param operationContext The value to identify context of the operation. This is used to co-relate other
     *                         communications related to this operation
     * @param status the status value.
     */
    PlayAudioResultEvent(CallingOperationResultDetails resultDetails, String operationContext, CallingOperationStatus status) {
        this.resultDetails = resultDetails;
        this.operationContext = operationContext;
        this.status = status;
    }

    /**
     * Deserialize {@link PlayAudioResultEvent} event.
     *
     * @param eventData binary data for event
     * @return {@link PlayAudioResultEvent} event.
     */
    public static PlayAudioResultEvent deserialize(BinaryData eventData) {
        if (eventData == null) {
            return null;
        }
        PlayAudioResultEventInternal playAudioResultEventInternal =
            eventData.toObject(PlayAudioResultEventInternal.class);

        return new PlayAudioResultEvent(
            ResultDetailsConverter.convert(playAudioResultEventInternal.getResultDetails()),
            playAudioResultEventInternal.getOperationContext(),
            playAudioResultEventInternal.getStatus());
    }
}
