// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.ai.formrecognizer.documentanalysis.models.FontStyle;
import com.azure.ai.formrecognizer.documentanalysis.models.FontWeight;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object representing observed text styles. */
@Fluent
public final class DocumentStyle {
    /*
     * Is content handwritten?
     */
    @JsonProperty(value = "isHandwritten")
    private Boolean isHandwritten;

    /*
     * Visually most similar font from among the set of supported font families, with fallback fonts following CSS
     * convention (ex. 'Arial, sans-serif').
     */
    @JsonProperty(value = "similarFontFamily")
    private String similarFontFamily;

    /*
     * Font style.
     */
    @JsonProperty(value = "fontStyle")
    private FontStyle fontStyle;

    /*
     * Font weight.
     */
    @JsonProperty(value = "fontWeight")
    private FontWeight fontWeight;

    /*
     * Foreground color in #rrggbb hexadecimal format.
     */
    @JsonProperty(value = "color")
    private String color;

    /*
     * Background color in #rrggbb hexadecimal format..
     */
    @JsonProperty(value = "backgroundColor")
    private String backgroundColor;

    /*
     * Location of the text elements in the concatenated content the style applies to.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /*
     * Confidence of correctly identifying the style.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /**
     * Creates an instance of DocumentStyle class.
     *
     * @param spans the spans value to set.
     * @param confidence the confidence value to set.
     */
    @JsonCreator
    public DocumentStyle(
            @JsonProperty(value = "spans", required = true) List<DocumentSpan> spans,
            @JsonProperty(value = "confidence", required = true) float confidence) {
        this.spans = spans;
        this.confidence = confidence;
    }

    /**
     * Get the isHandwritten property: Is content handwritten?.
     *
     * @return the isHandwritten value.
     */
    public Boolean isHandwritten() {
        return this.isHandwritten;
    }

    /**
     * Set the isHandwritten property: Is content handwritten?.
     *
     * @param isHandwritten the isHandwritten value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setIsHandwritten(Boolean isHandwritten) {
        this.isHandwritten = isHandwritten;
        return this;
    }

    /**
     * Get the similarFontFamily property: Visually most similar font from among the set of supported font families,
     * with fallback fonts following CSS convention (ex. 'Arial, sans-serif').
     *
     * @return the similarFontFamily value.
     */
    public String getSimilarFontFamily() {
        return this.similarFontFamily;
    }

    /**
     * Set the similarFontFamily property: Visually most similar font from among the set of supported font families,
     * with fallback fonts following CSS convention (ex. 'Arial, sans-serif').
     *
     * @param similarFontFamily the similarFontFamily value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setSimilarFontFamily(String similarFontFamily) {
        this.similarFontFamily = similarFontFamily;
        return this;
    }

    /**
     * Get the fontStyle property: Font style.
     *
     * @return the fontStyle value.
     */
    public FontStyle getFontStyle() {
        return this.fontStyle;
    }

    /**
     * Set the fontStyle property: Font style.
     *
     * @param fontStyle the fontStyle value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setFontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    /**
     * Get the fontWeight property: Font weight.
     *
     * @return the fontWeight value.
     */
    public FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /**
     * Set the fontWeight property: Font weight.
     *
     * @param fontWeight the fontWeight value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    /**
     * Get the color property: Foreground color in #rrggbb hexadecimal format.
     *
     * @return the color value.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Set the color property: Foreground color in #rrggbb hexadecimal format.
     *
     * @param color the color value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Get the backgroundColor property: Background color in #rrggbb hexadecimal format..
     *
     * @return the backgroundColor value.
     */
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * Set the backgroundColor property: Background color in #rrggbb hexadecimal format..
     *
     * @param backgroundColor the backgroundColor value to set.
     * @return the DocumentStyle object itself.
     */
    public DocumentStyle setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * Get the spans property: Location of the text elements in the concatenated content the style applies to.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Get the confidence property: Confidence of correctly identifying the style.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }
}
