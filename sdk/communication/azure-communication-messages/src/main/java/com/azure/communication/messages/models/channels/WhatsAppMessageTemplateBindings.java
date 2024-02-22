// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.communication.messages.models.channels;

import com.azure.communication.messages.models.MessageTemplateBindings;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The template bindings for WhatsApp.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("whatsApp")
@Fluent
public final class WhatsAppMessageTemplateBindings extends MessageTemplateBindings {
    /*
     * The header template bindings
     */
    @Generated
    @JsonProperty(value = "header")
    private List<WhatsAppMessageTemplateBindingsComponent> headerProperty;

    /*
     * The body template bindings
     */
    @Generated
    @JsonProperty(value = "body")
    private List<WhatsAppMessageTemplateBindingsComponent> body;

    /*
     * The footer template bindings
     */
    @Generated
    @JsonProperty(value = "footer")
    private List<WhatsAppMessageTemplateBindingsComponent> footer;

    /*
     * The button template bindings
     */
    @Generated
    @JsonProperty(value = "buttons")
    private List<WhatsAppMessageTemplateBindingsButton> buttons;

    /**
     * Creates an instance of WhatsAppMessageTemplateBindings class.
     */
    @Generated
    public WhatsAppMessageTemplateBindings() {
    }

    /**
     * Get the headerProperty property: The header template bindings.
     * 
     * @return the headerProperty value.
     */
    @Generated
    public List<WhatsAppMessageTemplateBindingsComponent> getHeaderProperty() {
        return this.headerProperty;
    }

    /**
     * Set the headerProperty property: The header template bindings.
     * 
     * @param headerProperty the headerProperty value to set.
     * @return the WhatsAppMessageTemplateBindings object itself.
     */
    @Generated
    public WhatsAppMessageTemplateBindings
        setHeaderProperty(List<WhatsAppMessageTemplateBindingsComponent> headerProperty) {
        this.headerProperty = headerProperty;
        return this;
    }

    /**
     * Get the body property: The body template bindings.
     * 
     * @return the body value.
     */
    @Generated
    public List<WhatsAppMessageTemplateBindingsComponent> getBody() {
        return this.body;
    }

    /**
     * Set the body property: The body template bindings.
     * 
     * @param body the body value to set.
     * @return the WhatsAppMessageTemplateBindings object itself.
     */
    @Generated
    public WhatsAppMessageTemplateBindings setBody(List<WhatsAppMessageTemplateBindingsComponent> body) {
        this.body = body;
        return this;
    }

    /**
     * Get the footer property: The footer template bindings.
     * 
     * @return the footer value.
     */
    @Generated
    public List<WhatsAppMessageTemplateBindingsComponent> getFooter() {
        return this.footer;
    }

    /**
     * Set the footer property: The footer template bindings.
     * 
     * @param footer the footer value to set.
     * @return the WhatsAppMessageTemplateBindings object itself.
     */
    @Generated
    public WhatsAppMessageTemplateBindings setFooter(List<WhatsAppMessageTemplateBindingsComponent> footer) {
        this.footer = footer;
        return this;
    }

    /**
     * Get the buttons property: The button template bindings.
     * 
     * @return the buttons value.
     */
    @Generated
    public List<WhatsAppMessageTemplateBindingsButton> getButtons() {
        return this.buttons;
    }

    /**
     * Set the buttons property: The button template bindings.
     * 
     * @param buttons the buttons value to set.
     * @return the WhatsAppMessageTemplateBindings object itself.
     */
    @Generated
    public WhatsAppMessageTemplateBindings setButtons(List<WhatsAppMessageTemplateBindingsButton> buttons) {
        this.buttons = buttons;
        return this;
    }
}
