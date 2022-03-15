// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.ConfigurationState;
import com.azure.resourcemanager.mobilenetwork.models.MobileNetworkResourceId;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.SimPolicyResourceId;
import com.azure.resourcemanager.mobilenetwork.models.SimStaticIpProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Sim properties. */
@Fluent
public final class SimPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SimPropertiesFormat.class);

    /*
     * The provisioning state of the sim resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The configuration state of the sim resource - complete or incomplete.
     */
    @JsonProperty(value = "configurationState", access = JsonProperty.Access.WRITE_ONLY)
    private ConfigurationState configurationState;

    /*
     * The International Mobile Subscriber Identity (IMSI) for the sim.
     */
    @JsonProperty(value = "internationalMobileSubscriberIdentity", required = true)
    private String internationalMobileSubscriberIdentity;

    /*
     * The Integrated Circuit Card ID (ICC Id) for the sim.
     */
    @JsonProperty(value = "integratedCircuitCardIdentifier")
    private String integratedCircuitCardIdentifier;

    /*
     * The ki value for the sim.
     */
    @JsonProperty(value = "authenticationKey")
    private String authenticationKey;

    /*
     * The Opc value for the sim.
     */
    @JsonProperty(value = "operatorKeyCode")
    private String operatorKeyCode;

    /*
     * Mobile network that this sim belongs to
     */
    @JsonProperty(value = "mobileNetwork")
    private MobileNetworkResourceId mobileNetwork;

    /*
     * An optional free-form text field that can be used to record the device
     * type this sim is associated with, for example 'Video camera'. The Azure
     * portal allows Sims to be grouped and filtered based on this value.
     */
    @JsonProperty(value = "deviceType")
    private String deviceType;

    /*
     * The simPolicy used by this sim.
     */
    @JsonProperty(value = "simPolicy")
    private SimPolicyResourceId simPolicy;

    /*
     * A list of static IP addresses assigned to this sim. Each address is
     * assigned at a defined network scope, made up of {attached data network,
     * slice}.
     */
    @JsonProperty(value = "staticIpConfiguration")
    private List<SimStaticIpProperties> staticIpConfiguration;

    /**
     * Get the provisioningState property: The provisioning state of the sim resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the configurationState property: The configuration state of the sim resource - complete or incomplete.
     *
     * @return the configurationState value.
     */
    public ConfigurationState configurationState() {
        return this.configurationState;
    }

    /**
     * Get the internationalMobileSubscriberIdentity property: The International Mobile Subscriber Identity (IMSI) for
     * the sim.
     *
     * @return the internationalMobileSubscriberIdentity value.
     */
    public String internationalMobileSubscriberIdentity() {
        return this.internationalMobileSubscriberIdentity;
    }

    /**
     * Set the internationalMobileSubscriberIdentity property: The International Mobile Subscriber Identity (IMSI) for
     * the sim.
     *
     * @param internationalMobileSubscriberIdentity the internationalMobileSubscriberIdentity value to set.
     * @return the SimPropertiesFormat object itself.
     */
    public SimPropertiesFormat withInternationalMobileSubscriberIdentity(String internationalMobileSubscriberIdentity) {
        this.internationalMobileSubscriberIdentity = internationalMobileSubscriberIdentity;
        return this;
    }

    /**
     * Get the integratedCircuitCardIdentifier property: The Integrated Circuit Card ID (ICC Id) for the sim.
     *
     * @return the integratedCircuitCardIdentifier value.
     */
    public String integratedCircuitCardIdentifier() {
        return this.integratedCircuitCardIdentifier;
    }

    /**
     * Set the integratedCircuitCardIdentifier property: The Integrated Circuit Card ID (ICC Id) for the sim.
     *
     * @param integratedCircuitCardIdentifier the integratedCircuitCardIdentifier value to set.
     * @return the SimPropertiesFormat object itself.
     */
    public SimPropertiesFormat withIntegratedCircuitCardIdentifier(String integratedCircuitCardIdentifier) {
        this.integratedCircuitCardIdentifier = integratedCircuitCardIdentifier;
        return this;
    }

    /**
     * Get the authenticationKey property: The ki value for the sim.
     *
     * @return the authenticationKey value.
     */
    public String authenticationKey() {
        return this.authenticationKey;
    }

    /**
     * Set the authenticationKey property: The ki value for the sim.
     *
     * @param authenticationKey the authenticationKey value to set.
     * @return the SimPropertiesFormat object itself.
     */
    public SimPropertiesFormat withAuthenticationKey(String authenticationKey) {
        this.authenticationKey = authenticationKey;
        return this;
    }

    /**
     * Get the operatorKeyCode property: The Opc value for the sim.
     *
     * @return the operatorKeyCode value.
     */
    public String operatorKeyCode() {
        return this.operatorKeyCode;
    }

    /**
     * Set the operatorKeyCode property: The Opc value for the sim.
     *
     * @param operatorKeyCode the operatorKeyCode value to set.
     * @return the SimPropertiesFormat object itself.
     */
    public SimPropertiesFormat withOperatorKeyCode(String operatorKeyCode) {
        this.operatorKeyCode = operatorKeyCode;
        return this;
    }

    /**
     * Get the mobileNetwork property: Mobile network that this sim belongs to.
     *
     * @return the mobileNetwork value.
     */
    public MobileNetworkResourceId mobileNetwork() {
        return this.mobileNetwork;
    }

    /**
     * Set the mobileNetwork property: Mobile network that this sim belongs to.
     *
     * @param mobileNetwork the mobileNetwork value to set.
     * @return the SimPropertiesFormat object itself.
     */
    public SimPropertiesFormat withMobileNetwork(MobileNetworkResourceId mobileNetwork) {
        this.mobileNetwork = mobileNetwork;
        return this;
    }

    /**
     * Get the deviceType property: An optional free-form text field that can be used to record the device type this sim
     * is associated with, for example 'Video camera'. The Azure portal allows Sims to be grouped and filtered based on
     * this value.
     *
     * @return the deviceType value.
     */
    public String deviceType() {
        return this.deviceType;
    }

    /**
     * Set the deviceType property: An optional free-form text field that can be used to record the device type this sim
     * is associated with, for example 'Video camera'. The Azure portal allows Sims to be grouped and filtered based on
     * this value.
     *
     * @param deviceType the deviceType value to set.
     * @return the SimPropertiesFormat object itself.
     */
    public SimPropertiesFormat withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get the simPolicy property: The simPolicy used by this sim.
     *
     * @return the simPolicy value.
     */
    public SimPolicyResourceId simPolicy() {
        return this.simPolicy;
    }

    /**
     * Set the simPolicy property: The simPolicy used by this sim.
     *
     * @param simPolicy the simPolicy value to set.
     * @return the SimPropertiesFormat object itself.
     */
    public SimPropertiesFormat withSimPolicy(SimPolicyResourceId simPolicy) {
        this.simPolicy = simPolicy;
        return this;
    }

    /**
     * Get the staticIpConfiguration property: A list of static IP addresses assigned to this sim. Each address is
     * assigned at a defined network scope, made up of {attached data network, slice}.
     *
     * @return the staticIpConfiguration value.
     */
    public List<SimStaticIpProperties> staticIpConfiguration() {
        return this.staticIpConfiguration;
    }

    /**
     * Set the staticIpConfiguration property: A list of static IP addresses assigned to this sim. Each address is
     * assigned at a defined network scope, made up of {attached data network, slice}.
     *
     * @param staticIpConfiguration the staticIpConfiguration value to set.
     * @return the SimPropertiesFormat object itself.
     */
    public SimPropertiesFormat withStaticIpConfiguration(List<SimStaticIpProperties> staticIpConfiguration) {
        this.staticIpConfiguration = staticIpConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (internationalMobileSubscriberIdentity() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property internationalMobileSubscriberIdentity in model"
                            + " SimPropertiesFormat"));
        }
        if (mobileNetwork() != null) {
            mobileNetwork().validate();
        }
        if (simPolicy() != null) {
            simPolicy().validate();
        }
        if (staticIpConfiguration() != null) {
            staticIpConfiguration().forEach(e -> e.validate());
        }
    }
}
