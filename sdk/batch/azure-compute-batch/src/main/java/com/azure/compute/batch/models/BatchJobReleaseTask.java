// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

/**
 * A Job Release Task to run on Job completion on any Compute Node where the Job has run.
 * The Job Release Task runs when the Job ends, because of one of the following:
 * The user calls the Terminate Job API, or the Delete Job API while the Job is
 * still active, the Job's maximum wall clock time constraint is reached, and the
 * Job is still active, or the Job's Job Manager Task completed, and the Job is
 * configured to terminate when the Job Manager completes. The Job Release Task
 * runs on each Node where Tasks of the Job have run and the Job Preparation Task
 * ran and completed. If you reimage a Node after it has run the Job Preparation
 * Task, and the Job ends without any further Tasks of the Job running on that
 * Node (and hence the Job Preparation Task does not re-run), then the Job Release
 * Task does not run on that Compute Node. If a Node reboots while the Job Release
 * Task is still running, the Job Release Task runs again when the Compute Node
 * starts up. The Job is not marked as complete until all Job Release Tasks have
 * completed. The Job Release Task runs in the background. It does not occupy a
 * scheduling slot; that is, it does not count towards the taskSlotsPerNode limit
 * specified on the Pool.
 */
@Fluent
public final class BatchJobReleaseTask implements JsonSerializable<BatchJobReleaseTask> {

    /*
     * A string that uniquely identifies the Job Release Task within the Job. The ID can contain any combination of alphanumeric characters including hyphens and underscores and cannot contain more than 64 characters. If you do not specify this property, the Batch service assigns a default value of 'jobrelease'. No other Task in the Job can have the same ID as the Job Release Task. If you try to submit a Task with the same id, the Batch service rejects the request with error code TaskIdSameAsJobReleaseTask; if you are calling the REST API directly, the HTTP status code is 409 (Conflict).
     */
    @Generated
    private String id;

    /*
     * The command line of the Job Release Task. The command line does not run under a shell, and therefore cannot take advantage of shell features such as environment variable expansion. If you want to take advantage of such features, you should invoke the shell in the command line, for example using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux. If the command line refers to file paths, it should use a relative path (relative to the Task working directory), or use the Batch provided environment variable (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     */
    @Generated
    private final String commandLine;

    /*
     * The settings for the container under which the Job Release Task runs. When this is specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into the container, all Task environment variables are mapped into the container, and the Task command line is executed in the container. Files produced in the container outside of AZ_BATCH_NODE_ROOT_DIR might not be reflected to the host disk, meaning that Batch file APIs will not be able to access those files.
     */
    @Generated
    private BatchTaskContainerSettings containerSettings;

    /*
     * A list of files that the Batch service will download to the Compute Node before running the command line.  There is a maximum size for the list of resource files.  When the max size is exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers. Files listed under this element are located in the Task's working directory.
     */
    @Generated
    private List<ResourceFile> resourceFiles;

    /*
     * A list of environment variable settings for the Job Release Task.
     */
    @Generated
    private List<EnvironmentSetting> environmentSettings;

    /*
     * The maximum elapsed time that the Job Release Task may run on a given Compute Node, measured from the time the Task starts. If the Task does not complete within the time limit, the Batch service terminates it. The default value is 15 minutes. You may not specify a timeout longer than 15 minutes. If you do, the Batch service rejects it with an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     */
    @Generated
    private Duration maxWallClockTime;

    /*
     * The minimum time to retain the Task directory for the Job Release Task on the Compute Node. After this time, the Batch service may delete the Task directory and all its contents. The default is 7 days, i.e. the Task directory will be retained for 7 days unless the Compute Node is removed or the Job is deleted.
     */
    @Generated
    private Duration retentionTime;

    /*
     * The user identity under which the Job Release Task runs. If omitted, the Task runs as a non-administrative user unique to the Task.
     */
    @Generated
    private UserIdentity userIdentity;

    /**
     * Creates an instance of BatchJobReleaseTask class.
     *
     * @param commandLine the commandLine value to set.
     */
    @Generated
    public BatchJobReleaseTask(String commandLine) {
        this.commandLine = commandLine;
    }

    /**
     * Get the id property: A string that uniquely identifies the Job Release Task within the Job. The ID can contain
     * any combination of alphanumeric characters including hyphens and underscores and cannot contain more than 64
     * characters. If you do not specify this property, the Batch service assigns a default value of 'jobrelease'. No
     * other Task in the Job can have the same ID as the Job Release Task. If you try to submit a Task with the same id,
     * the Batch service rejects the request with error code TaskIdSameAsJobReleaseTask; if you are calling the REST API
     * directly, the HTTP status code is 409 (Conflict).
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: A string that uniquely identifies the Job Release Task within the Job. The ID can contain
     * any combination of alphanumeric characters including hyphens and underscores and cannot contain more than 64
     * characters. If you do not specify this property, the Batch service assigns a default value of 'jobrelease'. No
     * other Task in the Job can have the same ID as the Job Release Task. If you try to submit a Task with the same id,
     * the Batch service rejects the request with error code TaskIdSameAsJobReleaseTask; if you are calling the REST API
     * directly, the HTTP status code is 409 (Conflict).
     *
     * @param id the id value to set.
     * @return the BatchJobReleaseTask object itself.
     */
    @Generated
    public BatchJobReleaseTask setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the commandLine property: The command line of the Job Release Task. The command line does not run under a
     * shell, and therefore cannot take advantage of shell features such as environment variable expansion. If you want
     * to take advantage of such features, you should invoke the shell in the command line, for example using "cmd /c
     * MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux. If the command line refers to file paths, it should use
     * a relative path (relative to the Task working directory), or use the Batch provided environment variable
     * (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     *
     * @return the commandLine value.
     */
    @Generated
    public String getCommandLine() {
        return this.commandLine;
    }

    /**
     * Get the containerSettings property: The settings for the container under which the Job Release Task runs. When
     * this is specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch
     * directories on the node) are mapped into the container, all Task environment variables are mapped into the
     * container, and the Task command line is executed in the container. Files produced in the container outside of
     * AZ_BATCH_NODE_ROOT_DIR might not be reflected to the host disk, meaning that Batch file APIs will not be able to
     * access those files.
     *
     * @return the containerSettings value.
     */
    @Generated
    public BatchTaskContainerSettings getContainerSettings() {
        return this.containerSettings;
    }

    /**
     * Set the containerSettings property: The settings for the container under which the Job Release Task runs. When
     * this is specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch
     * directories on the node) are mapped into the container, all Task environment variables are mapped into the
     * container, and the Task command line is executed in the container. Files produced in the container outside of
     * AZ_BATCH_NODE_ROOT_DIR might not be reflected to the host disk, meaning that Batch file APIs will not be able to
     * access those files.
     *
     * @param containerSettings the containerSettings value to set.
     * @return the BatchJobReleaseTask object itself.
     */
    @Generated
    public BatchJobReleaseTask setContainerSettings(BatchTaskContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Get the resourceFiles property: A list of files that the Batch service will download to the Compute Node before
     * running the command line. There is a maximum size for the list of resource files. When the max size is exceeded,
     * the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection
     * of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker
     * Containers. Files listed under this element are located in the Task's working directory.
     *
     * @return the resourceFiles value.
     */
    @Generated
    public List<ResourceFile> getResourceFiles() {
        return this.resourceFiles;
    }

    /**
     * Set the resourceFiles property: A list of files that the Batch service will download to the Compute Node before
     * running the command line. There is a maximum size for the list of resource files. When the max size is exceeded,
     * the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection
     * of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker
     * Containers. Files listed under this element are located in the Task's working directory.
     *
     * @param resourceFiles the resourceFiles value to set.
     * @return the BatchJobReleaseTask object itself.
     */
    @Generated
    public BatchJobReleaseTask setResourceFiles(List<ResourceFile> resourceFiles) {
        this.resourceFiles = resourceFiles;
        return this;
    }

    /**
     * Get the environmentSettings property: A list of environment variable settings for the Job Release Task.
     *
     * @return the environmentSettings value.
     */
    @Generated
    public List<EnvironmentSetting> getEnvironmentSettings() {
        return this.environmentSettings;
    }

    /**
     * Set the environmentSettings property: A list of environment variable settings for the Job Release Task.
     *
     * @param environmentSettings the environmentSettings value to set.
     * @return the BatchJobReleaseTask object itself.
     */
    @Generated
    public BatchJobReleaseTask setEnvironmentSettings(List<EnvironmentSetting> environmentSettings) {
        this.environmentSettings = environmentSettings;
        return this;
    }

    /**
     * Get the maxWallClockTime property: The maximum elapsed time that the Job Release Task may run on a given Compute
     * Node, measured from the time the Task starts. If the Task does not complete within the time limit, the Batch
     * service terminates it. The default value is 15 minutes. You may not specify a timeout longer than 15 minutes. If
     * you do, the Batch service rejects it with an error; if you are calling the REST API directly, the HTTP status
     * code is 400 (Bad Request).
     *
     * @return the maxWallClockTime value.
     */
    @Generated
    public Duration getMaxWallClockTime() {
        return this.maxWallClockTime;
    }

    /**
     * Set the maxWallClockTime property: The maximum elapsed time that the Job Release Task may run on a given Compute
     * Node, measured from the time the Task starts. If the Task does not complete within the time limit, the Batch
     * service terminates it. The default value is 15 minutes. You may not specify a timeout longer than 15 minutes. If
     * you do, the Batch service rejects it with an error; if you are calling the REST API directly, the HTTP status
     * code is 400 (Bad Request).
     *
     * @param maxWallClockTime the maxWallClockTime value to set.
     * @return the BatchJobReleaseTask object itself.
     */
    @Generated
    public BatchJobReleaseTask setMaxWallClockTime(Duration maxWallClockTime) {
        this.maxWallClockTime = maxWallClockTime;
        return this;
    }

    /**
     * Get the retentionTime property: The minimum time to retain the Task directory for the Job Release Task on the
     * Compute Node. After this time, the Batch service may delete the Task directory and all its contents. The default
     * is 7 days, i.e. the Task directory will be retained for 7 days unless the Compute Node is removed or the Job is
     * deleted.
     *
     * @return the retentionTime value.
     */
    @Generated
    public Duration getRetentionTime() {
        return this.retentionTime;
    }

    /**
     * Set the retentionTime property: The minimum time to retain the Task directory for the Job Release Task on the
     * Compute Node. After this time, the Batch service may delete the Task directory and all its contents. The default
     * is 7 days, i.e. the Task directory will be retained for 7 days unless the Compute Node is removed or the Job is
     * deleted.
     *
     * @param retentionTime the retentionTime value to set.
     * @return the BatchJobReleaseTask object itself.
     */
    @Generated
    public BatchJobReleaseTask setRetentionTime(Duration retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    /**
     * Get the userIdentity property: The user identity under which the Job Release Task runs. If omitted, the Task runs
     * as a non-administrative user unique to the Task.
     *
     * @return the userIdentity value.
     */
    @Generated
    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /**
     * Set the userIdentity property: The user identity under which the Job Release Task runs. If omitted, the Task runs
     * as a non-administrative user unique to the Task.
     *
     * @param userIdentity the userIdentity value to set.
     * @return the BatchJobReleaseTask object itself.
     */
    @Generated
    public BatchJobReleaseTask setUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("commandLine", this.commandLine);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("containerSettings", this.containerSettings);
        jsonWriter.writeArrayField("resourceFiles", this.resourceFiles, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("environmentSettings", this.environmentSettings,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("maxWallClockTime", CoreUtils.durationToStringWithDays(this.maxWallClockTime));
        jsonWriter.writeStringField("retentionTime", CoreUtils.durationToStringWithDays(this.retentionTime));
        jsonWriter.writeJsonField("userIdentity", this.userIdentity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchJobReleaseTask from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchJobReleaseTask if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchJobReleaseTask.
     */
    @Generated
    public static BatchJobReleaseTask fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String commandLine = null;
            String id = null;
            BatchTaskContainerSettings containerSettings = null;
            List<ResourceFile> resourceFiles = null;
            List<EnvironmentSetting> environmentSettings = null;
            Duration maxWallClockTime = null;
            Duration retentionTime = null;
            UserIdentity userIdentity = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("commandLine".equals(fieldName)) {
                    commandLine = reader.getString();
                } else if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("containerSettings".equals(fieldName)) {
                    containerSettings = BatchTaskContainerSettings.fromJson(reader);
                } else if ("resourceFiles".equals(fieldName)) {
                    resourceFiles = reader.readArray(reader1 -> ResourceFile.fromJson(reader1));
                } else if ("environmentSettings".equals(fieldName)) {
                    environmentSettings = reader.readArray(reader1 -> EnvironmentSetting.fromJson(reader1));
                } else if ("maxWallClockTime".equals(fieldName)) {
                    maxWallClockTime = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("retentionTime".equals(fieldName)) {
                    retentionTime = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("userIdentity".equals(fieldName)) {
                    userIdentity = UserIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            BatchJobReleaseTask deserializedBatchJobReleaseTask = new BatchJobReleaseTask(commandLine);
            deserializedBatchJobReleaseTask.id = id;
            deserializedBatchJobReleaseTask.containerSettings = containerSettings;
            deserializedBatchJobReleaseTask.resourceFiles = resourceFiles;
            deserializedBatchJobReleaseTask.environmentSettings = environmentSettings;
            deserializedBatchJobReleaseTask.maxWallClockTime = maxWallClockTime;
            deserializedBatchJobReleaseTask.retentionTime = retentionTime;
            deserializedBatchJobReleaseTask.userIdentity = userIdentity;
            return deserializedBatchJobReleaseTask;
        });
    }
}
