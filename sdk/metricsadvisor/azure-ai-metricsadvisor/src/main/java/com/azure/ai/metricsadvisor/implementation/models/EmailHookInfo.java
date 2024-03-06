// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * The EmailHookInfo model.
 */
@Fluent
public final class EmailHookInfo extends HookInfo {
    /*
     * The hookParameter property.
     */
    private EmailHookParameter hookParameter;

    /**
     * Creates an instance of EmailHookInfo class.
     */
    public EmailHookInfo() {
    }

    /**
     * Get the hookParameter property: The hookParameter property.
     * 
     * @return the hookParameter value.
     */
    public EmailHookParameter getHookParameter() {
        return this.hookParameter;
    }

    /**
     * Set the hookParameter property: The hookParameter property.
     * 
     * @param hookParameter the hookParameter value to set.
     * @return the EmailHookInfo object itself.
     */
    public EmailHookInfo setHookParameter(EmailHookParameter hookParameter) {
        this.hookParameter = hookParameter;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailHookInfo setHookName(String hookName) {
        super.setHookName(hookName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailHookInfo setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailHookInfo setExternalLink(String externalLink) {
        super.setExternalLink(externalLink);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailHookInfo setAdmins(List<String> admins) {
        super.setAdmins(admins);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("hookType", HookType.EMAIL == null ? null : HookType.EMAIL.toString());
        jsonWriter.writeStringField("hookName", getHookName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("externalLink", getExternalLink());
        jsonWriter.writeArrayField("admins", getAdmins(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("hookParameter", this.hookParameter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EmailHookInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EmailHookInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the EmailHookInfo.
     */
    public static EmailHookInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EmailHookInfo deserializedEmailHookInfo = new EmailHookInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hookType".equals(fieldName)) {
                    String hookType = reader.getString();
                    if (!"Email".equals(hookType)) {
                        throw new IllegalStateException(
                            "'hookType' was expected to be non-null and equal to 'Email'. The found 'hookType' was '"
                                + hookType + "'.");
                    }
                } else if ("hookName".equals(fieldName)) {
                    deserializedEmailHookInfo.setHookName(reader.getString());
                } else if ("hookId".equals(fieldName)) {
                    deserializedEmailHookInfo
                        .setHookId(reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString())));
                } else if ("description".equals(fieldName)) {
                    deserializedEmailHookInfo.setDescription(reader.getString());
                } else if ("externalLink".equals(fieldName)) {
                    deserializedEmailHookInfo.setExternalLink(reader.getString());
                } else if ("admins".equals(fieldName)) {
                    List<String> admins = reader.readArray(reader1 -> reader1.getString());
                    deserializedEmailHookInfo.setAdmins(admins);
                } else if ("hookParameter".equals(fieldName)) {
                    deserializedEmailHookInfo.hookParameter = EmailHookParameter.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEmailHookInfo;
        });
    }
}
