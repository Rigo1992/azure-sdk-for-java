// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machine scale set operating system disk. */
@Fluent
public final class VirtualMachineScaleSetOSDisk {
    /*
     * The disk name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Specifies the caching requirements. <br><br> Possible values are:
     * <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br>
     * Default: **None for Standard storage. ReadOnly for Premium storage**
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     */
    @JsonProperty(value = "writeAcceleratorEnabled")
    private Boolean writeAcceleratorEnabled;

    /*
     * Specifies how the virtual machines in the scale set should be
     * created.<br><br> The only allowed value is: **FromImage** \u2013 This
     * value is used when you are using an image to create the virtual machine.
     * If you are using a platform image, you also use the imageReference
     * element described above. If you are using a marketplace image, you  also
     * use the plan element previously described.
     */
    @JsonProperty(value = "createOption", required = true)
    private DiskCreateOptionTypes createOption;

    /*
     * Specifies the ephemeral disk Settings for the operating system disk used
     * by the virtual machine scale set.
     */
    @JsonProperty(value = "diffDiskSettings")
    private DiffDiskSettings diffDiskSettings;

    /*
     * Specifies the size of the operating system disk in gigabytes. This
     * element can be used to overwrite the size of the disk in a virtual
     * machine image. <br><br> This value cannot be larger than 1023 GB
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * This property allows you to specify the type of the OS that is included
     * in the disk if creating a VM from user-image or a specialized VHD.
     * <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     */
    @JsonProperty(value = "osType")
    private OperatingSystemTypes osType;

    /*
     * Specifies information about the unmanaged user image to base the scale
     * set on.
     */
    @JsonProperty(value = "image")
    private VirtualHardDisk image;

    /*
     * Specifies the container urls that are used to store operating system
     * disks for the scale set.
     */
    @JsonProperty(value = "vhdContainers")
    private List<String> vhdContainers;

    /*
     * The managed disk parameters.
     */
    @JsonProperty(value = "managedDisk")
    private VirtualMachineScaleSetManagedDiskParameters managedDisk;

    /*
     * Specifies whether OS Disk should be deleted or detached upon VMSS Flex
     * deletion (This feature is available for VMSS with Flexible
     * OrchestrationMode only). <br><br> Possible values: <br><br> **Delete**
     * If this value is used, the OS disk is deleted when VMSS Flex VM is
     * deleted.<br><br> **Detach** If this value is used, the OS disk is
     * retained after VMSS Flex VM is deleted. <br><br> The default value is
     * set to **Delete**. For an Ephemeral OS Disk, the default value is set to
     * **Delete**. User cannot change the delete option for Ephemeral OS Disk.
     */
    @JsonProperty(value = "deleteOption")
    private DiskDeleteOptionTypes deleteOption;

    /**
     * Get the name property: The disk name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The disk name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the caching property: Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**.
     *
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**.
     *
     * @param caching the caching value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     *
     * @return the writeAcceleratorEnabled value.
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     *
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get the createOption property: Specifies how the virtual machines in the scale set should be
     * created.&lt;br&gt;&lt;br&gt; The only allowed value is: **FromImage** \u2013 This value is used when you are
     * using an image to create the virtual machine. If you are using a platform image, you also use the imageReference
     * element described above. If you are using a marketplace image, you also use the plan element previously
     * described.
     *
     * @return the createOption value.
     */
    public DiskCreateOptionTypes createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption property: Specifies how the virtual machines in the scale set should be
     * created.&lt;br&gt;&lt;br&gt; The only allowed value is: **FromImage** \u2013 This value is used when you are
     * using an image to create the virtual machine. If you are using a platform image, you also use the imageReference
     * element described above. If you are using a marketplace image, you also use the plan element previously
     * described.
     *
     * @param createOption the createOption value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withCreateOption(DiskCreateOptionTypes createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get the diffDiskSettings property: Specifies the ephemeral disk Settings for the operating system disk used by
     * the virtual machine scale set.
     *
     * @return the diffDiskSettings value.
     */
    public DiffDiskSettings diffDiskSettings() {
        return this.diffDiskSettings;
    }

    /**
     * Set the diffDiskSettings property: Specifies the ephemeral disk Settings for the operating system disk used by
     * the virtual machine scale set.
     *
     * @param diffDiskSettings the diffDiskSettings value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withDiffDiskSettings(DiffDiskSettings diffDiskSettings) {
        this.diffDiskSettings = diffDiskSettings;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of the operating system disk in gigabytes. This element can be
     * used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be
     * larger than 1023 GB.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of the operating system disk in gigabytes. This element can be
     * used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be
     * larger than 1023 GB.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the osType property: This property allows you to specify the type of the OS that is included in the disk if
     * creating a VM from user-image or a specialized VHD. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: This property allows you to specify the type of the OS that is included in the disk if
     * creating a VM from user-image or a specialized VHD. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @param osType the osType value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the image property: Specifies information about the unmanaged user image to base the scale set on.
     *
     * @return the image value.
     */
    public VirtualHardDisk image() {
        return this.image;
    }

    /**
     * Set the image property: Specifies information about the unmanaged user image to base the scale set on.
     *
     * @param image the image value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withImage(VirtualHardDisk image) {
        this.image = image;
        return this;
    }

    /**
     * Get the vhdContainers property: Specifies the container urls that are used to store operating system disks for
     * the scale set.
     *
     * @return the vhdContainers value.
     */
    public List<String> vhdContainers() {
        return this.vhdContainers;
    }

    /**
     * Set the vhdContainers property: Specifies the container urls that are used to store operating system disks for
     * the scale set.
     *
     * @param vhdContainers the vhdContainers value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withVhdContainers(List<String> vhdContainers) {
        this.vhdContainers = vhdContainers;
        return this;
    }

    /**
     * Get the managedDisk property: The managed disk parameters.
     *
     * @return the managedDisk value.
     */
    public VirtualMachineScaleSetManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managed disk parameters.
     *
     * @param managedDisk the managedDisk value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withManagedDisk(VirtualMachineScaleSetManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the deleteOption property: Specifies whether OS Disk should be deleted or detached upon VMSS Flex deletion
     * (This feature is available for VMSS with Flexible OrchestrationMode only). &lt;br&gt;&lt;br&gt; Possible values:
     * &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the OS disk is deleted when VMSS Flex VM is
     * deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the OS disk is retained after VMSS Flex VM is
     * deleted. &lt;br&gt;&lt;br&gt; The default value is set to **Delete**. For an Ephemeral OS Disk, the default value
     * is set to **Delete**. User cannot change the delete option for Ephemeral OS Disk.
     *
     * @return the deleteOption value.
     */
    public DiskDeleteOptionTypes deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specifies whether OS Disk should be deleted or detached upon VMSS Flex deletion
     * (This feature is available for VMSS with Flexible OrchestrationMode only). &lt;br&gt;&lt;br&gt; Possible values:
     * &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the OS disk is deleted when VMSS Flex VM is
     * deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the OS disk is retained after VMSS Flex VM is
     * deleted. &lt;br&gt;&lt;br&gt; The default value is set to **Delete**. For an Ephemeral OS Disk, the default value
     * is set to **Delete**. User cannot change the delete option for Ephemeral OS Disk.
     *
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineScaleSetOSDisk object itself.
     */
    public VirtualMachineScaleSetOSDisk withDeleteOption(DiskDeleteOptionTypes deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (createOption() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property createOption in model VirtualMachineScaleSetOSDisk"));
        }
        if (diffDiskSettings() != null) {
            diffDiskSettings().validate();
        }
        if (image() != null) {
            image().validate();
        }
        if (managedDisk() != null) {
            managedDisk().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetOSDisk.class);
}
