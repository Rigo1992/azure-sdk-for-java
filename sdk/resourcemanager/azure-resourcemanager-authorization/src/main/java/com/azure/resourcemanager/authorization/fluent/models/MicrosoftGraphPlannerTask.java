// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** plannerTask. */
@Fluent
public final class MicrosoftGraphPlannerTask extends MicrosoftGraphEntity {
    /*
     * Number of checklist items with value set to false, representing
     * incomplete items.
     */
    @JsonProperty(value = "activeChecklistItemCount")
    private Integer activeChecklistItemCount;

    /*
     * plannerAppliedCategories
     */
    @JsonProperty(value = "appliedCategories")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> appliedCategories;

    /*
     * Hint used to order items of this type in a list view. The format is
     * defined as outlined here.
     */
    @JsonProperty(value = "assigneePriority")
    private String assigneePriority;

    /*
     * plannerAssignments
     */
    @JsonProperty(value = "assignments")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> assignments;

    /*
     * Bucket ID to which the task belongs. The bucket needs to be in the plan
     * that the task is in. It is 28 characters long and case-sensitive. Format
     * validation is done on the service.
     */
    @JsonProperty(value = "bucketId")
    private String bucketId;

    /*
     * Number of checklist items that are present on the task.
     */
    @JsonProperty(value = "checklistItemCount")
    private Integer checklistItemCount;

    /*
     * identitySet
     */
    @JsonProperty(value = "completedBy")
    private MicrosoftGraphIdentitySet completedBy;

    /*
     * Read-only. Date and time at which the 'percentComplete' of the task is
     * set to '100'. The Timestamp type represents date and time information
     * using ISO 8601 format and is always in UTC time. For example, midnight
     * UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "completedDateTime")
    private OffsetDateTime completedDateTime;

    /*
     * Thread ID of the conversation on the task. This is the ID of the
     * conversation thread object created in the group.
     */
    @JsonProperty(value = "conversationThreadId")
    private String conversationThreadId;

    /*
     * identitySet
     */
    @JsonProperty(value = "createdBy")
    private MicrosoftGraphIdentitySet createdBy;

    /*
     * Read-only. Date and time at which the task is created. The Timestamp
     * type represents date and time information using ISO 8601 format and is
     * always in UTC time. For example, midnight UTC on Jan 1, 2014 would look
     * like this: '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * Date and time at which the task is due. The Timestamp type represents
     * date and time information using ISO 8601 format and is always in UTC
     * time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "dueDateTime")
    private OffsetDateTime dueDateTime;

    /*
     * Read-only. Value is true if the details object of the task has a
     * non-empty description and false otherwise.
     */
    @JsonProperty(value = "hasDescription")
    private Boolean hasDescription;

    /*
     * Hint used to order items of this type in a list view. The format is
     * defined as outlined here.
     */
    @JsonProperty(value = "orderHint")
    private String orderHint;

    /*
     * Percentage of task completion. When set to 100, the task is considered
     * completed.
     */
    @JsonProperty(value = "percentComplete")
    private Integer percentComplete;

    /*
     * Plan ID to which the task belongs.
     */
    @JsonProperty(value = "planId")
    private String planId;

    /*
     * plannerPreviewType
     */
    @JsonProperty(value = "previewType")
    private MicrosoftGraphPlannerPreviewType previewType;

    /*
     * Number of external references that exist on the task.
     */
    @JsonProperty(value = "referenceCount")
    private Integer referenceCount;

    /*
     * Date and time at which the task starts. The Timestamp type represents
     * date and time information using ISO 8601 format and is always in UTC
     * time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "startDateTime")
    private OffsetDateTime startDateTime;

    /*
     * Title of the task.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * plannerAssignedToTaskBoardTaskFormat
     */
    @JsonProperty(value = "assignedToTaskBoardFormat")
    private MicrosoftGraphPlannerAssignedToTaskBoardTaskFormat assignedToTaskBoardFormat;

    /*
     * plannerBucketTaskBoardTaskFormat
     */
    @JsonProperty(value = "bucketTaskBoardFormat")
    private MicrosoftGraphPlannerBucketTaskBoardTaskFormat bucketTaskBoardFormat;

    /*
     * plannerTaskDetails
     */
    @JsonProperty(value = "details")
    private MicrosoftGraphPlannerTaskDetails details;

    /*
     * plannerProgressTaskBoardTaskFormat
     */
    @JsonProperty(value = "progressTaskBoardFormat")
    private MicrosoftGraphPlannerProgressTaskBoardTaskFormat progressTaskBoardFormat;

    /*
     * plannerTask
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the activeChecklistItemCount property: Number of checklist items with value set to false, representing
     * incomplete items.
     *
     * @return the activeChecklistItemCount value.
     */
    public Integer activeChecklistItemCount() {
        return this.activeChecklistItemCount;
    }

    /**
     * Set the activeChecklistItemCount property: Number of checklist items with value set to false, representing
     * incomplete items.
     *
     * @param activeChecklistItemCount the activeChecklistItemCount value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withActiveChecklistItemCount(Integer activeChecklistItemCount) {
        this.activeChecklistItemCount = activeChecklistItemCount;
        return this;
    }

    /**
     * Get the appliedCategories property: plannerAppliedCategories.
     *
     * @return the appliedCategories value.
     */
    public Map<String, Object> appliedCategories() {
        return this.appliedCategories;
    }

    /**
     * Set the appliedCategories property: plannerAppliedCategories.
     *
     * @param appliedCategories the appliedCategories value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withAppliedCategories(Map<String, Object> appliedCategories) {
        this.appliedCategories = appliedCategories;
        return this;
    }

    /**
     * Get the assigneePriority property: Hint used to order items of this type in a list view. The format is defined as
     * outlined here.
     *
     * @return the assigneePriority value.
     */
    public String assigneePriority() {
        return this.assigneePriority;
    }

    /**
     * Set the assigneePriority property: Hint used to order items of this type in a list view. The format is defined as
     * outlined here.
     *
     * @param assigneePriority the assigneePriority value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withAssigneePriority(String assigneePriority) {
        this.assigneePriority = assigneePriority;
        return this;
    }

    /**
     * Get the assignments property: plannerAssignments.
     *
     * @return the assignments value.
     */
    public Map<String, Object> assignments() {
        return this.assignments;
    }

    /**
     * Set the assignments property: plannerAssignments.
     *
     * @param assignments the assignments value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withAssignments(Map<String, Object> assignments) {
        this.assignments = assignments;
        return this;
    }

    /**
     * Get the bucketId property: Bucket ID to which the task belongs. The bucket needs to be in the plan that the task
     * is in. It is 28 characters long and case-sensitive. Format validation is done on the service.
     *
     * @return the bucketId value.
     */
    public String bucketId() {
        return this.bucketId;
    }

    /**
     * Set the bucketId property: Bucket ID to which the task belongs. The bucket needs to be in the plan that the task
     * is in. It is 28 characters long and case-sensitive. Format validation is done on the service.
     *
     * @param bucketId the bucketId value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withBucketId(String bucketId) {
        this.bucketId = bucketId;
        return this;
    }

    /**
     * Get the checklistItemCount property: Number of checklist items that are present on the task.
     *
     * @return the checklistItemCount value.
     */
    public Integer checklistItemCount() {
        return this.checklistItemCount;
    }

    /**
     * Set the checklistItemCount property: Number of checklist items that are present on the task.
     *
     * @param checklistItemCount the checklistItemCount value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withChecklistItemCount(Integer checklistItemCount) {
        this.checklistItemCount = checklistItemCount;
        return this;
    }

    /**
     * Get the completedBy property: identitySet.
     *
     * @return the completedBy value.
     */
    public MicrosoftGraphIdentitySet completedBy() {
        return this.completedBy;
    }

    /**
     * Set the completedBy property: identitySet.
     *
     * @param completedBy the completedBy value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withCompletedBy(MicrosoftGraphIdentitySet completedBy) {
        this.completedBy = completedBy;
        return this;
    }

    /**
     * Get the completedDateTime property: Read-only. Date and time at which the 'percentComplete' of the task is set to
     * '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
     * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @return the completedDateTime value.
     */
    public OffsetDateTime completedDateTime() {
        return this.completedDateTime;
    }

    /**
     * Set the completedDateTime property: Read-only. Date and time at which the 'percentComplete' of the task is set to
     * '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
     * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @param completedDateTime the completedDateTime value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withCompletedDateTime(OffsetDateTime completedDateTime) {
        this.completedDateTime = completedDateTime;
        return this;
    }

    /**
     * Get the conversationThreadId property: Thread ID of the conversation on the task. This is the ID of the
     * conversation thread object created in the group.
     *
     * @return the conversationThreadId value.
     */
    public String conversationThreadId() {
        return this.conversationThreadId;
    }

    /**
     * Set the conversationThreadId property: Thread ID of the conversation on the task. This is the ID of the
     * conversation thread object created in the group.
     *
     * @param conversationThreadId the conversationThreadId value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withConversationThreadId(String conversationThreadId) {
        this.conversationThreadId = conversationThreadId;
        return this;
    }

    /**
     * Get the createdBy property: identitySet.
     *
     * @return the createdBy value.
     */
    public MicrosoftGraphIdentitySet createdBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: identitySet.
     *
     * @param createdBy the createdBy value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withCreatedBy(MicrosoftGraphIdentitySet createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the createdDateTime property: Read-only. Date and time at which the task is created. The Timestamp type
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Read-only. Date and time at which the task is created. The Timestamp type
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the dueDateTime property: Date and time at which the task is due. The Timestamp type represents date and time
     * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look
     * like this: '2014-01-01T00:00:00Z'.
     *
     * @return the dueDateTime value.
     */
    public OffsetDateTime dueDateTime() {
        return this.dueDateTime;
    }

    /**
     * Set the dueDateTime property: Date and time at which the task is due. The Timestamp type represents date and time
     * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look
     * like this: '2014-01-01T00:00:00Z'.
     *
     * @param dueDateTime the dueDateTime value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withDueDateTime(OffsetDateTime dueDateTime) {
        this.dueDateTime = dueDateTime;
        return this;
    }

    /**
     * Get the hasDescription property: Read-only. Value is true if the details object of the task has a non-empty
     * description and false otherwise.
     *
     * @return the hasDescription value.
     */
    public Boolean hasDescription() {
        return this.hasDescription;
    }

    /**
     * Set the hasDescription property: Read-only. Value is true if the details object of the task has a non-empty
     * description and false otherwise.
     *
     * @param hasDescription the hasDescription value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withHasDescription(Boolean hasDescription) {
        this.hasDescription = hasDescription;
        return this;
    }

    /**
     * Get the orderHint property: Hint used to order items of this type in a list view. The format is defined as
     * outlined here.
     *
     * @return the orderHint value.
     */
    public String orderHint() {
        return this.orderHint;
    }

    /**
     * Set the orderHint property: Hint used to order items of this type in a list view. The format is defined as
     * outlined here.
     *
     * @param orderHint the orderHint value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withOrderHint(String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    /**
     * Get the percentComplete property: Percentage of task completion. When set to 100, the task is considered
     * completed.
     *
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Set the percentComplete property: Percentage of task completion. When set to 100, the task is considered
     * completed.
     *
     * @param percentComplete the percentComplete value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withPercentComplete(Integer percentComplete) {
        this.percentComplete = percentComplete;
        return this;
    }

    /**
     * Get the planId property: Plan ID to which the task belongs.
     *
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the planId property: Plan ID to which the task belongs.
     *
     * @param planId the planId value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the previewType property: plannerPreviewType.
     *
     * @return the previewType value.
     */
    public MicrosoftGraphPlannerPreviewType previewType() {
        return this.previewType;
    }

    /**
     * Set the previewType property: plannerPreviewType.
     *
     * @param previewType the previewType value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withPreviewType(MicrosoftGraphPlannerPreviewType previewType) {
        this.previewType = previewType;
        return this;
    }

    /**
     * Get the referenceCount property: Number of external references that exist on the task.
     *
     * @return the referenceCount value.
     */
    public Integer referenceCount() {
        return this.referenceCount;
    }

    /**
     * Set the referenceCount property: Number of external references that exist on the task.
     *
     * @param referenceCount the referenceCount value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withReferenceCount(Integer referenceCount) {
        this.referenceCount = referenceCount;
        return this;
    }

    /**
     * Get the startDateTime property: Date and time at which the task starts. The Timestamp type represents date and
     * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
     * look like this: '2014-01-01T00:00:00Z'.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: Date and time at which the task starts. The Timestamp type represents date and
     * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
     * look like this: '2014-01-01T00:00:00Z'.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the title property: Title of the task.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Title of the task.
     *
     * @param title the title value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the assignedToTaskBoardFormat property: plannerAssignedToTaskBoardTaskFormat.
     *
     * @return the assignedToTaskBoardFormat value.
     */
    public MicrosoftGraphPlannerAssignedToTaskBoardTaskFormat assignedToTaskBoardFormat() {
        return this.assignedToTaskBoardFormat;
    }

    /**
     * Set the assignedToTaskBoardFormat property: plannerAssignedToTaskBoardTaskFormat.
     *
     * @param assignedToTaskBoardFormat the assignedToTaskBoardFormat value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withAssignedToTaskBoardFormat(
        MicrosoftGraphPlannerAssignedToTaskBoardTaskFormat assignedToTaskBoardFormat) {
        this.assignedToTaskBoardFormat = assignedToTaskBoardFormat;
        return this;
    }

    /**
     * Get the bucketTaskBoardFormat property: plannerBucketTaskBoardTaskFormat.
     *
     * @return the bucketTaskBoardFormat value.
     */
    public MicrosoftGraphPlannerBucketTaskBoardTaskFormat bucketTaskBoardFormat() {
        return this.bucketTaskBoardFormat;
    }

    /**
     * Set the bucketTaskBoardFormat property: plannerBucketTaskBoardTaskFormat.
     *
     * @param bucketTaskBoardFormat the bucketTaskBoardFormat value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withBucketTaskBoardFormat(
        MicrosoftGraphPlannerBucketTaskBoardTaskFormat bucketTaskBoardFormat) {
        this.bucketTaskBoardFormat = bucketTaskBoardFormat;
        return this;
    }

    /**
     * Get the details property: plannerTaskDetails.
     *
     * @return the details value.
     */
    public MicrosoftGraphPlannerTaskDetails details() {
        return this.details;
    }

    /**
     * Set the details property: plannerTaskDetails.
     *
     * @param details the details value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withDetails(MicrosoftGraphPlannerTaskDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Get the progressTaskBoardFormat property: plannerProgressTaskBoardTaskFormat.
     *
     * @return the progressTaskBoardFormat value.
     */
    public MicrosoftGraphPlannerProgressTaskBoardTaskFormat progressTaskBoardFormat() {
        return this.progressTaskBoardFormat;
    }

    /**
     * Set the progressTaskBoardFormat property: plannerProgressTaskBoardTaskFormat.
     *
     * @param progressTaskBoardFormat the progressTaskBoardFormat value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withProgressTaskBoardFormat(
        MicrosoftGraphPlannerProgressTaskBoardTaskFormat progressTaskBoardFormat) {
        this.progressTaskBoardFormat = progressTaskBoardFormat;
        return this;
    }

    /**
     * Get the additionalProperties property: plannerTask.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: plannerTask.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPlannerTask object itself.
     */
    public MicrosoftGraphPlannerTask withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphPlannerTask withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (completedBy() != null) {
            completedBy().validate();
        }
        if (createdBy() != null) {
            createdBy().validate();
        }
        if (assignedToTaskBoardFormat() != null) {
            assignedToTaskBoardFormat().validate();
        }
        if (bucketTaskBoardFormat() != null) {
            bucketTaskBoardFormat().validate();
        }
        if (details() != null) {
            details().validate();
        }
        if (progressTaskBoardFormat() != null) {
            progressTaskBoardFormat().validate();
        }
    }
}
