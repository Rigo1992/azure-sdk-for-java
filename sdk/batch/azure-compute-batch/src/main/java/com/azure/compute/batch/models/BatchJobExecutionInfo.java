// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Contains information about the execution of a Job in the Azure Batch service.
 */
@Immutable
public final class BatchJobExecutionInfo implements JsonSerializable<BatchJobExecutionInfo> {

    /*
     * The start time of the Job. This is the time at which the Job was created.
     */
    @Generated
    private final OffsetDateTime startTime;

    /*
     * The completion time of the Job. This property is set only if the Job is in the completed state.
     */
    @Generated
    private OffsetDateTime endTime;

    /*
     * The ID of the Pool to which this Job is assigned. This element contains the actual Pool where the Job is assigned. When you get Job details from the service, they also contain a poolInfo element, which contains the Pool configuration data from when the Job was added or updated. That poolInfo element may also contain a poolId element. If it does, the two IDs are the same. If it does not, it means the Job ran on an auto Pool, and this property contains the ID of that auto Pool.
     */
    @Generated
    private String poolId;

    /*
     * Details of any error encountered by the service in starting the Job. This property is not set if there was no error starting the Job.
     */
    @Generated
    private BatchJobSchedulingError schedulingError;

    /**
     * Creates an instance of BatchJobExecutionInfo class.
     *
     * @param startTime the startTime value to set.
     */
    @Generated
    private BatchJobExecutionInfo(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Get the startTime property: The start time of the Job. This is the time at which the Job was created.
     *
     * @return the startTime value.
     */
    @Generated
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The completion time of the Job. This property is set only if the Job is in the
     * completed state.
     *
     * @return the endTime value.
     */
    @Generated
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the poolId property: The ID of the Pool to which this Job is assigned. This element contains the actual Pool
     * where the Job is assigned. When you get Job details from the service, they also contain a poolInfo element, which
     * contains the Pool configuration data from when the Job was added or updated. That poolInfo element may also
     * contain a poolId element. If it does, the two IDs are the same. If it does not, it means the Job ran on an auto
     * Pool, and this property contains the ID of that auto Pool.
     *
     * @return the poolId value.
     */
    @Generated
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * Get the schedulingError property: Details of any error encountered by the service in starting the Job. This
     * property is not set if there was no error starting the Job.
     *
     * @return the schedulingError value.
     */
    @Generated
    public BatchJobSchedulingError getSchedulingError() {
        return this.schedulingError;
    }

    /*
     * A string describing the reason the Job ended. This property is set only if the Job is in the completed state. If the Batch service terminates the Job, it sets the reason as follows: JMComplete - the Job Manager Task completed, and killJobOnCompletion was set to true. MaxWallClockTimeExpiry - the Job reached its maxWallClockTime constraint. TerminateJobSchedule - the Job ran as part of a schedule, and the schedule terminated. AllTasksComplete - the Job's onAllTasksComplete attribute is set to terminatejob, and all Tasks in the Job are complete. TaskFailed - the Job's onTaskFailure attribute is set to performExitOptionsJobAction, and a Task in the Job failed with an exit condition that specified a jobAction of terminatejob. Any other string is a user-defined reason specified in a call to the 'Terminate a Job' operation.
     */
    @Generated
    private String terminationReason;

    /**
     * Get the terminationReason property: A string describing the reason the Job ended. This property is set only if
     * the Job is in the completed state. If the Batch service terminates the Job, it sets the reason as follows:
     * JMComplete - the Job Manager Task completed, and killJobOnCompletion was set to true. MaxWallClockTimeExpiry -
     * the Job reached its maxWallClockTime constraint. TerminateJobSchedule - the Job ran as part of a schedule, and
     * the schedule terminated. AllTasksComplete - the Job's onAllTasksComplete attribute is set to terminatejob, and
     * all Tasks in the Job are complete. TaskFailed - the Job's onTaskFailure attribute is set to
     * performExitOptionsJobAction, and a Task in the Job failed with an exit condition that specified a jobAction of
     * terminatejob. Any other string is a user-defined reason specified in a call to the 'Terminate a Job' operation.
     *
     * @return the terminationReason value.
     */
    @Generated
    public String getTerminationReason() {
        return this.terminationReason;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("endTime",
            this.endTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endTime));
        jsonWriter.writeStringField("poolId", this.poolId);
        jsonWriter.writeJsonField("schedulingError", this.schedulingError);
        jsonWriter.writeStringField("terminateReason", this.terminationReason);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchJobExecutionInfo from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchJobExecutionInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchJobExecutionInfo.
     */
    @Generated
    public static BatchJobExecutionInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OffsetDateTime startTime = null;
            OffsetDateTime endTime = null;
            String poolId = null;
            BatchJobSchedulingError schedulingError = null;
            String terminationReason = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("startTime".equals(fieldName)) {
                    startTime = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    endTime = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("poolId".equals(fieldName)) {
                    poolId = reader.getString();
                } else if ("schedulingError".equals(fieldName)) {
                    schedulingError = BatchJobSchedulingError.fromJson(reader);
                } else if ("terminateReason".equals(fieldName)) {
                    terminationReason = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            BatchJobExecutionInfo deserializedBatchJobExecutionInfo = new BatchJobExecutionInfo(startTime);
            deserializedBatchJobExecutionInfo.endTime = endTime;
            deserializedBatchJobExecutionInfo.poolId = poolId;
            deserializedBatchJobExecutionInfo.schedulingError = schedulingError;
            deserializedBatchJobExecutionInfo.terminationReason = terminationReason;
            return deserializedBatchJobExecutionInfo;
        });
    }
}
