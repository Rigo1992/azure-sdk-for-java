// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databox.models.CloudError;
import com.azure.resourcemanager.databox.models.JobDeliveryInfo;
import com.azure.resourcemanager.databox.models.JobDeliveryType;
import com.azure.resourcemanager.databox.models.JobDetails;
import com.azure.resourcemanager.databox.models.ResourceIdentity;
import com.azure.resourcemanager.databox.models.Sku;
import com.azure.resourcemanager.databox.models.StageName;
import com.azure.resourcemanager.databox.models.TransferType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Job Resource. */
@Fluent
public final class JobResourceInner extends Resource {
    /*
     * Properties of a job.
     */
    @JsonProperty(value = "properties", required = true)
    private JobProperties innerProperties = new JobProperties();

    /*
     * Name of the object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Id of the object.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Type of the object.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The sku type.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Msi identity of the resource
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /** Creates an instance of JobResourceInner class. */
    public JobResourceInner() {
    }

    /**
     * Get the innerProperties property: Properties of a job.
     *
     * @return the innerProperties value.
     */
    private JobProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Id of the object.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type property: Type of the object.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the sku property: The sku type.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku type.
     *
     * @param sku the sku value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: Msi identity of the resource.
     *
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Msi identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JobResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JobResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the transferType property: Type of the data transfer.
     *
     * @return the transferType value.
     */
    public TransferType transferType() {
        return this.innerProperties() == null ? null : this.innerProperties().transferType();
    }

    /**
     * Set the transferType property: Type of the data transfer.
     *
     * @param transferType the transferType value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withTransferType(TransferType transferType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobProperties();
        }
        this.innerProperties().withTransferType(transferType);
        return this;
    }

    /**
     * Get the isCancellable property: Describes whether the job is cancellable or not.
     *
     * @return the isCancellable value.
     */
    public Boolean isCancellable() {
        return this.innerProperties() == null ? null : this.innerProperties().isCancellable();
    }

    /**
     * Get the isDeletable property: Describes whether the job is deletable or not.
     *
     * @return the isDeletable value.
     */
    public Boolean isDeletable() {
        return this.innerProperties() == null ? null : this.innerProperties().isDeletable();
    }

    /**
     * Get the isShippingAddressEditable property: Describes whether the shipping address is editable or not.
     *
     * @return the isShippingAddressEditable value.
     */
    public Boolean isShippingAddressEditable() {
        return this.innerProperties() == null ? null : this.innerProperties().isShippingAddressEditable();
    }

    /**
     * Get the isPrepareToShipEnabled property: Is Prepare To Ship Enabled on this job.
     *
     * @return the isPrepareToShipEnabled value.
     */
    public Boolean isPrepareToShipEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isPrepareToShipEnabled();
    }

    /**
     * Get the status property: Name of the stage which is in progress.
     *
     * @return the status value.
     */
    public StageName status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the startTime property: Time at which the job was started in UTC ISO 8601 format.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Get the error property: Top level error for the job.
     *
     * @return the error value.
     */
    public CloudError error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Get the details property: Details of a job run. This field will only be sent for expand details filter.
     *
     * @return the details value.
     */
    public JobDetails details() {
        return this.innerProperties() == null ? null : this.innerProperties().details();
    }

    /**
     * Set the details property: Details of a job run. This field will only be sent for expand details filter.
     *
     * @param details the details value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withDetails(JobDetails details) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobProperties();
        }
        this.innerProperties().withDetails(details);
        return this;
    }

    /**
     * Get the cancellationReason property: Reason for cancellation.
     *
     * @return the cancellationReason value.
     */
    public String cancellationReason() {
        return this.innerProperties() == null ? null : this.innerProperties().cancellationReason();
    }

    /**
     * Get the deliveryType property: Delivery type of Job.
     *
     * @return the deliveryType value.
     */
    public JobDeliveryType deliveryType() {
        return this.innerProperties() == null ? null : this.innerProperties().deliveryType();
    }

    /**
     * Set the deliveryType property: Delivery type of Job.
     *
     * @param deliveryType the deliveryType value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withDeliveryType(JobDeliveryType deliveryType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobProperties();
        }
        this.innerProperties().withDeliveryType(deliveryType);
        return this;
    }

    /**
     * Get the deliveryInfo property: Delivery Info of Job.
     *
     * @return the deliveryInfo value.
     */
    public JobDeliveryInfo deliveryInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().deliveryInfo();
    }

    /**
     * Set the deliveryInfo property: Delivery Info of Job.
     *
     * @param deliveryInfo the deliveryInfo value to set.
     * @return the JobResourceInner object itself.
     */
    public JobResourceInner withDeliveryInfo(JobDeliveryInfo deliveryInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobProperties();
        }
        this.innerProperties().withDeliveryInfo(deliveryInfo);
        return this;
    }

    /**
     * Get the isCancellableWithoutFee property: Flag to indicate cancellation of scheduled job.
     *
     * @return the isCancellableWithoutFee value.
     */
    public Boolean isCancellableWithoutFee() {
        return this.innerProperties() == null ? null : this.innerProperties().isCancellableWithoutFee();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model JobResourceInner"));
        } else {
            innerProperties().validate();
        }
        if (sku() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model JobResourceInner"));
        } else {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobResourceInner.class);
}
