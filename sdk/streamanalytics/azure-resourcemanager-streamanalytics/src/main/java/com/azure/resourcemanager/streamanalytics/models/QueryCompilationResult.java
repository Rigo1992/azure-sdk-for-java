// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.resourcemanager.streamanalytics.fluent.models.QueryCompilationResultInner;
import java.util.List;

/**
 * An immutable client-side representation of QueryCompilationResult.
 */
public interface QueryCompilationResult {
    /**
     * Gets the errors property: Error messages produced by the compiler.
     * 
     * @return the errors value.
     */
    List<QueryCompilationError> errors();

    /**
     * Gets the warnings property: Warning messages produced by the compiler.
     * 
     * @return the warnings value.
     */
    List<String> warnings();

    /**
     * Gets the inputs property: All input names used by the query.
     * 
     * @return the inputs value.
     */
    List<String> inputs();

    /**
     * Gets the outputs property: All output names used by the query.
     * 
     * @return the outputs value.
     */
    List<String> outputs();

    /**
     * Gets the functions property: All function names used by the query.
     * 
     * @return the functions value.
     */
    List<String> functions();

    /**
     * Gets the inner com.azure.resourcemanager.streamanalytics.fluent.models.QueryCompilationResultInner object.
     * 
     * @return the inner object.
     */
    QueryCompilationResultInner innerModel();
}
