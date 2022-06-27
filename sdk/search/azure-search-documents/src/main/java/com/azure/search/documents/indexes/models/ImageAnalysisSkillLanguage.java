// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Defines values for ImageAnalysisSkillLanguage. */
public final class ImageAnalysisSkillLanguage extends ExpandableStringEnum<ImageAnalysisSkillLanguage> {
    /** Static value en for ImageAnalysisSkillLanguage. */
    public static final ImageAnalysisSkillLanguage EN = fromString("en");

    /** Static value es for ImageAnalysisSkillLanguage. */
    public static final ImageAnalysisSkillLanguage ES = fromString("es");

    /** Static value ja for ImageAnalysisSkillLanguage. */
    public static final ImageAnalysisSkillLanguage JA = fromString("ja");

    /** Static value pt for ImageAnalysisSkillLanguage. */
    public static final ImageAnalysisSkillLanguage PT = fromString("pt");

    /** Static value zh for ImageAnalysisSkillLanguage. */
    public static final ImageAnalysisSkillLanguage ZH = fromString("zh");

    /**
     * Creates or finds a ImageAnalysisSkillLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageAnalysisSkillLanguage.
     */
    public static ImageAnalysisSkillLanguage fromString(String name) {
        return fromString(name, ImageAnalysisSkillLanguage.class);
    }

    /**
     * Gets known ImageAnalysisSkillLanguage values.
     *
     * @return known ImageAnalysisSkillLanguage values.
     */
    public static Collection<ImageAnalysisSkillLanguage> values() {
        return values(ImageAnalysisSkillLanguage.class);
    }
}
