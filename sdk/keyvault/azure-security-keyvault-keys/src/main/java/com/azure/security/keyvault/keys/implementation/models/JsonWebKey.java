// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.keys.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.security.keyvault.keys.models.KeyCurveName;
import com.azure.security.keyvault.keys.models.KeyOperation;
import com.azure.security.keyvault.keys.models.KeyType;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/** As of http://tools.ietf.org/html/draft-ietf-jose-json-web-key-18. */
@Fluent
public final class JsonWebKey implements JsonSerializable<JsonWebKey> {
    /*
     * Key identifier.
     */
    private String kid;

    /*
     * JsonWebKey Key Type (kty), as defined in https://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-40.
     */
    private KeyType kty;

    /*
     * The key_ops property.
     */
    private List<KeyOperation> keyOps;

    /*
     * RSA modulus.
     */
    private Base64Url n;

    /*
     * RSA public exponent.
     */
    private Base64Url e;

    /*
     * RSA private exponent, or the D component of an EC private key.
     */
    private Base64Url d;

    /*
     * RSA private key parameter.
     */
    private Base64Url dp;

    /*
     * RSA private key parameter.
     */
    private Base64Url dq;

    /*
     * RSA private key parameter.
     */
    private Base64Url qi;

    /*
     * RSA secret prime.
     */
    private Base64Url p;

    /*
     * RSA secret prime, with p < q.
     */
    private Base64Url q;

    /*
     * Symmetric key.
     */
    private Base64Url k;

    /*
     * Protected Key, used with 'Bring Your Own Key'.
     */
    private Base64Url t;

    /*
     * Elliptic curve name.
     */
    private KeyCurveName crv;

    /*
     * X component of an EC public key.
     */
    private Base64Url x;

    /*
     * Y component of an EC public key.
     */
    private Base64Url y;

    /** Creates an instance of JsonWebKey class. */
    public JsonWebKey() {}

    /**
     * Get the kid property: Key identifier.
     *
     * @return the kid value.
     */
    public String getKid() {
        return this.kid;
    }

    /**
     * Set the kid property: Key identifier.
     *
     * @param kid the kid value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get the kty property: JsonWebKey Key Type (kty), as defined in
     * https://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-40.
     *
     * @return the kty value.
     */
    public KeyType getKty() {
        return this.kty;
    }

    /**
     * Set the kty property: JsonWebKey Key Type (kty), as defined in
     * https://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-40.
     *
     * @param kty the kty value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setKty(KeyType kty) {
        this.kty = kty;
        return this;
    }

    /**
     * Get the keyOps property: The key_ops property.
     *
     * @return the keyOps value.
     */
    public List<KeyOperation> getKeyOps() {
        return this.keyOps;
    }

    /**
     * Set the keyOps property: The key_ops property.
     *
     * @param keyOps the keyOps value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setKeyOps(List<KeyOperation> keyOps) {
        this.keyOps = keyOps;
        return this;
    }

    /**
     * Get the n property: RSA modulus.
     *
     * @return the n value.
     */
    public byte[] getN() {
        if (this.n == null) {
            return null;
        }
        return this.n.decodedBytes();
    }

    /**
     * Set the n property: RSA modulus.
     *
     * @param n the n value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setN(byte[] n) {
        if (n == null) {
            this.n = null;
        } else {
            this.n = Base64Url.encode(CoreUtils.clone(n));
        }
        return this;
    }

    /**
     * Get the e property: RSA public exponent.
     *
     * @return the e value.
     */
    public byte[] getE() {
        if (this.e == null) {
            return null;
        }
        return this.e.decodedBytes();
    }

    /**
     * Set the e property: RSA public exponent.
     *
     * @param e the e value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setE(byte[] e) {
        if (e == null) {
            this.e = null;
        } else {
            this.e = Base64Url.encode(CoreUtils.clone(e));
        }
        return this;
    }

    /**
     * Get the d property: RSA private exponent, or the D component of an EC private key.
     *
     * @return the d value.
     */
    public byte[] getD() {
        if (this.d == null) {
            return null;
        }
        return this.d.decodedBytes();
    }

    /**
     * Set the d property: RSA private exponent, or the D component of an EC private key.
     *
     * @param d the d value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setD(byte[] d) {
        if (d == null) {
            this.d = null;
        } else {
            this.d = Base64Url.encode(CoreUtils.clone(d));
        }
        return this;
    }

    /**
     * Get the dp property: RSA private key parameter.
     *
     * @return the dp value.
     */
    public byte[] getDp() {
        if (this.dp == null) {
            return null;
        }
        return this.dp.decodedBytes();
    }

    /**
     * Set the dp property: RSA private key parameter.
     *
     * @param dp the dp value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setDp(byte[] dp) {
        if (dp == null) {
            this.dp = null;
        } else {
            this.dp = Base64Url.encode(CoreUtils.clone(dp));
        }
        return this;
    }

    /**
     * Get the dq property: RSA private key parameter.
     *
     * @return the dq value.
     */
    public byte[] getDq() {
        if (this.dq == null) {
            return null;
        }
        return this.dq.decodedBytes();
    }

    /**
     * Set the dq property: RSA private key parameter.
     *
     * @param dq the dq value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setDq(byte[] dq) {
        if (dq == null) {
            this.dq = null;
        } else {
            this.dq = Base64Url.encode(CoreUtils.clone(dq));
        }
        return this;
    }

    /**
     * Get the qi property: RSA private key parameter.
     *
     * @return the qi value.
     */
    public byte[] getQi() {
        if (this.qi == null) {
            return null;
        }
        return this.qi.decodedBytes();
    }

    /**
     * Set the qi property: RSA private key parameter.
     *
     * @param qi the qi value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setQi(byte[] qi) {
        if (qi == null) {
            this.qi = null;
        } else {
            this.qi = Base64Url.encode(CoreUtils.clone(qi));
        }
        return this;
    }

    /**
     * Get the p property: RSA secret prime.
     *
     * @return the p value.
     */
    public byte[] getP() {
        if (this.p == null) {
            return null;
        }
        return this.p.decodedBytes();
    }

    /**
     * Set the p property: RSA secret prime.
     *
     * @param p the p value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setP(byte[] p) {
        if (p == null) {
            this.p = null;
        } else {
            this.p = Base64Url.encode(CoreUtils.clone(p));
        }
        return this;
    }

    /**
     * Get the q property: RSA secret prime, with p &lt; q.
     *
     * @return the q value.
     */
    public byte[] getQ() {
        if (this.q == null) {
            return null;
        }
        return this.q.decodedBytes();
    }

    /**
     * Set the q property: RSA secret prime, with p &lt; q.
     *
     * @param q the q value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setQ(byte[] q) {
        if (q == null) {
            this.q = null;
        } else {
            this.q = Base64Url.encode(CoreUtils.clone(q));
        }
        return this;
    }

    /**
     * Get the k property: Symmetric key.
     *
     * @return the k value.
     */
    public byte[] getK() {
        if (this.k == null) {
            return null;
        }
        return this.k.decodedBytes();
    }

    /**
     * Set the k property: Symmetric key.
     *
     * @param k the k value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setK(byte[] k) {
        if (k == null) {
            this.k = null;
        } else {
            this.k = Base64Url.encode(CoreUtils.clone(k));
        }
        return this;
    }

    /**
     * Get the t property: Protected Key, used with 'Bring Your Own Key'.
     *
     * @return the t value.
     */
    public byte[] getT() {
        if (this.t == null) {
            return null;
        }
        return this.t.decodedBytes();
    }

    /**
     * Set the t property: Protected Key, used with 'Bring Your Own Key'.
     *
     * @param t the t value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setT(byte[] t) {
        if (t == null) {
            this.t = null;
        } else {
            this.t = Base64Url.encode(CoreUtils.clone(t));
        }
        return this;
    }

    /**
     * Get the crv property: Elliptic curve name.
     *
     * @return the crv value.
     */
    public KeyCurveName getCrv() {
        return this.crv;
    }

    /**
     * Set the crv property: Elliptic curve name.
     *
     * @param crv the crv value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setCrv(KeyCurveName crv) {
        this.crv = crv;
        return this;
    }

    /**
     * Get the x property: X component of an EC public key.
     *
     * @return the x value.
     */
    public byte[] getX() {
        if (this.x == null) {
            return null;
        }
        return this.x.decodedBytes();
    }

    /**
     * Set the x property: X component of an EC public key.
     *
     * @param x the x value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setX(byte[] x) {
        if (x == null) {
            this.x = null;
        } else {
            this.x = Base64Url.encode(CoreUtils.clone(x));
        }
        return this;
    }

    /**
     * Get the y property: Y component of an EC public key.
     *
     * @return the y value.
     */
    public byte[] getY() {
        if (this.y == null) {
            return null;
        }
        return this.y.decodedBytes();
    }

    /**
     * Set the y property: Y component of an EC public key.
     *
     * @param y the y value to set.
     * @return the JsonWebKey object itself.
     */
    public JsonWebKey setY(byte[] y) {
        if (y == null) {
            this.y = null;
        } else {
            this.y = Base64Url.encode(CoreUtils.clone(y));
        }
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kid", this.kid);
        jsonWriter.writeStringField("kty", Objects.toString(this.kty, null));
        jsonWriter.writeArrayField(
                "key_ops", this.keyOps, (writer, element) -> writer.writeString(Objects.toString(element, null)));
        jsonWriter.writeStringField("n", Objects.toString(this.n, null));
        jsonWriter.writeStringField("e", Objects.toString(this.e, null));
        jsonWriter.writeStringField("d", Objects.toString(this.d, null));
        jsonWriter.writeStringField("dp", Objects.toString(this.dp, null));
        jsonWriter.writeStringField("dq", Objects.toString(this.dq, null));
        jsonWriter.writeStringField("qi", Objects.toString(this.qi, null));
        jsonWriter.writeStringField("p", Objects.toString(this.p, null));
        jsonWriter.writeStringField("q", Objects.toString(this.q, null));
        jsonWriter.writeStringField("k", Objects.toString(this.k, null));
        jsonWriter.writeStringField("key_hsm", Objects.toString(this.t, null));
        jsonWriter.writeStringField("crv", Objects.toString(this.crv, null));
        jsonWriter.writeStringField("x", Objects.toString(this.x, null));
        jsonWriter.writeStringField("y", Objects.toString(this.y, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JsonWebKey from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of JsonWebKey if the JsonReader was pointing to an instance of it, or null if it was pointing
     *     to JSON null.
     * @throws IOException If an error occurs while reading the JsonWebKey.
     */
    public static JsonWebKey fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    JsonWebKey deserializedJsonWebKey = new JsonWebKey();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kid".equals(fieldName)) {
                            deserializedJsonWebKey.kid = reader.getString();
                        } else if ("kty".equals(fieldName)) {
                            deserializedJsonWebKey.kty = KeyType.fromString(reader.getString());
                        } else if ("key_ops".equals(fieldName)) {
                            List<KeyOperation> keyOps =
                                    reader.readArray(reader1 -> KeyOperation.fromString(reader1.getString()));
                            deserializedJsonWebKey.keyOps = keyOps;
                        } else if ("n".equals(fieldName)) {
                            deserializedJsonWebKey.n =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("e".equals(fieldName)) {
                            deserializedJsonWebKey.e =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("d".equals(fieldName)) {
                            deserializedJsonWebKey.d =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("dp".equals(fieldName)) {
                            deserializedJsonWebKey.dp =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("dq".equals(fieldName)) {
                            deserializedJsonWebKey.dq =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("qi".equals(fieldName)) {
                            deserializedJsonWebKey.qi =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("p".equals(fieldName)) {
                            deserializedJsonWebKey.p =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("q".equals(fieldName)) {
                            deserializedJsonWebKey.q =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("k".equals(fieldName)) {
                            deserializedJsonWebKey.k =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("key_hsm".equals(fieldName)) {
                            deserializedJsonWebKey.t =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("crv".equals(fieldName)) {
                            deserializedJsonWebKey.crv = KeyCurveName.fromString(reader.getString());
                        } else if ("x".equals(fieldName)) {
                            deserializedJsonWebKey.x =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else if ("y".equals(fieldName)) {
                            deserializedJsonWebKey.y =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedJsonWebKey;
                });
    }
}
