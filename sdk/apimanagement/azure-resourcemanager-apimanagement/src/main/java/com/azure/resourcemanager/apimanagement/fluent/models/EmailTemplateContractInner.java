// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.EmailTemplateParametersContractProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Email Template details. */
@Fluent
public final class EmailTemplateContractInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EmailTemplateContractInner.class);

    /*
     * Email Template entity contract properties.
     */
    @JsonProperty(value = "properties")
    private EmailTemplateContractProperties innerProperties;

    /**
     * Get the innerProperties property: Email Template entity contract properties.
     *
     * @return the innerProperties value.
     */
    private EmailTemplateContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the subject property: Subject of the Template.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.innerProperties() == null ? null : this.innerProperties().subject();
    }

    /**
     * Set the subject property: Subject of the Template.
     *
     * @param subject the subject value to set.
     * @return the EmailTemplateContractInner object itself.
     */
    public EmailTemplateContractInner withSubject(String subject) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EmailTemplateContractProperties();
        }
        this.innerProperties().withSubject(subject);
        return this;
    }

    /**
     * Get the body property: Email Template Body. This should be a valid XDocument.
     *
     * @return the body value.
     */
    public String body() {
        return this.innerProperties() == null ? null : this.innerProperties().body();
    }

    /**
     * Set the body property: Email Template Body. This should be a valid XDocument.
     *
     * @param body the body value to set.
     * @return the EmailTemplateContractInner object itself.
     */
    public EmailTemplateContractInner withBody(String body) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EmailTemplateContractProperties();
        }
        this.innerProperties().withBody(body);
        return this;
    }

    /**
     * Get the title property: Title of the Template.
     *
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: Title of the Template.
     *
     * @param title the title value to set.
     * @return the EmailTemplateContractInner object itself.
     */
    public EmailTemplateContractInner withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EmailTemplateContractProperties();
        }
        this.innerProperties().withTitle(title);
        return this;
    }

    /**
     * Get the description property: Description of the Email Template.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the Email Template.
     *
     * @param description the description value to set.
     * @return the EmailTemplateContractInner object itself.
     */
    public EmailTemplateContractInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EmailTemplateContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the isDefault property: Whether the template is the default template provided by Api Management or has been
     * edited.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.innerProperties() == null ? null : this.innerProperties().isDefault();
    }

    /**
     * Get the parameters property: Email Template Parameter values.
     *
     * @return the parameters value.
     */
    public List<EmailTemplateParametersContractProperties> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: Email Template Parameter values.
     *
     * @param parameters the parameters value to set.
     * @return the EmailTemplateContractInner object itself.
     */
    public EmailTemplateContractInner withParameters(List<EmailTemplateParametersContractProperties> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EmailTemplateContractProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
