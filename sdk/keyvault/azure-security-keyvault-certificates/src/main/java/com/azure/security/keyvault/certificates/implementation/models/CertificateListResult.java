// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.certificates.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/** The certificate list result. */
@Immutable
public final class CertificateListResult implements JsonSerializable<CertificateListResult> {
    /*
     * A response message containing a list of certificates in the key vault along with a link to the next page of
     * certificates.
     */
    private List<CertificateItem> value;

    /*
     * The URL to get the next set of certificates.
     */
    private String nextLink;

    /** Creates an instance of CertificateListResult class. */
    public CertificateListResult() {}

    /**
     * Get the value property: A response message containing a list of certificates in the key vault along with a link
     * to the next page of certificates.
     *
     * @return the value value.
     */
    public List<CertificateItem> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URL to get the next set of certificates.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateListResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateListResult if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificateListResult.
     */
    public static CertificateListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    CertificateListResult deserializedCertificateListResult = new CertificateListResult();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("value".equals(fieldName)) {
                            List<CertificateItem> value =
                                    reader.readArray(reader1 -> CertificateItem.fromJson(reader1));
                            deserializedCertificateListResult.value = value;
                        } else if ("nextLink".equals(fieldName)) {
                            deserializedCertificateListResult.nextLink = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedCertificateListResult;
                });
    }
}
