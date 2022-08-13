// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation;

import com.azure.communication.callautomation.models.CallAutomationErrorException;
import com.azure.communication.callautomation.models.RecordingChannel;
import com.azure.communication.callautomation.models.RecordingContent;
import com.azure.communication.callautomation.models.RecordingFormat;
import com.azure.communication.callautomation.models.RecordingStatus;
import com.azure.communication.callautomation.models.RecordingStatusResult;
import com.azure.communication.callautomation.models.ServerCallLocator;
import com.azure.communication.callautomation.models.StartRecordingOptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Publisher;
import reactor.test.StepVerifier;

import java.net.URI;
import java.security.InvalidParameterException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CallRecordingAsyncUnitTests extends CallRecordingUnitTestBase {
    private CallRecordingAsync callRecording;

    @BeforeEach
    public void setup() {
        CallAutomationAsyncClient callingServerClient = CallAutomationUnitTestBase.getCallAutomationAsyncClient(new ArrayList<>());
        callRecording = callingServerClient.getCallRecordingAsync();
    }

    @Test
    public void startRecordingRelativeUriFails() {
        validateError(InvalidParameterException.class, callRecording.startRecording(
            new ServerCallLocator(SERVER_CALL_ID),
            URI.create("/not/absolute/uri")
        ));
    }

    @Test
    public void startRecordingWithFullParamsFails() {
        StartRecordingOptions startRecordingOptions = new StartRecordingOptions(
            RecordingContent.AUDIO_VIDEO,
            RecordingFormat.MP4,
            RecordingChannel.MIXED
        );

        validateError(InvalidParameterException.class, callRecording.startRecordingWithResponse(
            new ServerCallLocator(SERVER_CALL_ID),
            URI.create("/not/absolute/uri"),
            startRecordingOptions
        ));
    }

    @Test
    public void recordingOperationsTest() {
        CallAutomationAsyncClient callingServerClient = CallAutomationUnitTestBase.getCallAutomationAsyncClient(
            recordingOperationsResponses
        );
        callRecording = callingServerClient.getCallRecordingAsync();

        validateRecordingStatus(
            callRecording.startRecording(new ServerCallLocator(SERVER_CALL_ID), URI.create("https://localhost/")),
            RecordingStatus.ACTIVE
        );

        validateOperationWithRecordingStatus(callRecording.pauseRecording(RECORDING_ID),
            RecordingStatus.INACTIVE
        );

        validateOperationWithRecordingStatus(callRecording.resumeRecording(RECORDING_ID),
            RecordingStatus.ACTIVE);

        validateOperation(callRecording.stopRecording(RECORDING_ID));
        validateError(CallAutomationErrorException.class, callRecording.getRecordingState(RECORDING_ID));
    }

    private void validateRecordingStatus(Publisher<RecordingStatusResult> publisher, RecordingStatus status) {
        StepVerifier.create(publisher)
            .consumeNextWith(recordingStatusResponse -> validateRecording(recordingStatusResponse, status))
            .verifyComplete();
    }

    private void validateOperationWithRecordingStatus(Publisher<Void> operation, RecordingStatus expectedRecordingStatus) {
        validateOperation(operation);
        validateRecordingStatus(
            callRecording.getRecordingState(RECORDING_ID),
            expectedRecordingStatus
        );
    }

    private void validateOperation(Publisher<Void> operation) {
        StepVerifier.create(operation).verifyComplete();
    }

    private <T, U> void validateError(Class<T> exception, Publisher<U> publisher) {
        StepVerifier.create(publisher)
            .consumeErrorWith(error -> assertEquals(error.getClass().toString(),
                exception.toString()))
            .verify();
    }

    private void validateRecording(RecordingStatusResult recordingStatus, RecordingStatus expectedStatus) {
        assertEquals(RECORDING_ID, recordingStatus.getRecordingId());
        assertEquals(expectedStatus, recordingStatus.getRecordingStatus());
    }
}
