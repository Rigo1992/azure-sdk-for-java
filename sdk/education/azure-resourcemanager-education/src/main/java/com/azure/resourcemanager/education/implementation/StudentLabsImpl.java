// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.education.fluent.StudentLabsClient;
import com.azure.resourcemanager.education.fluent.models.StudentLabDetailsInner;
import com.azure.resourcemanager.education.models.StudentLabDetails;
import com.azure.resourcemanager.education.models.StudentLabs;

public final class StudentLabsImpl implements StudentLabs {
    private static final ClientLogger LOGGER = new ClientLogger(StudentLabsImpl.class);

    private final StudentLabsClient innerClient;

    private final com.azure.resourcemanager.education.EducationManager serviceManager;

    public StudentLabsImpl(
        StudentLabsClient innerClient, com.azure.resourcemanager.education.EducationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StudentLabDetails> listAll() {
        PagedIterable<StudentLabDetailsInner> inner = this.serviceClient().listAll();
        return Utils.mapPage(inner, inner1 -> new StudentLabDetailsImpl(inner1, this.manager()));
    }

    public PagedIterable<StudentLabDetails> listAll(Context context) {
        PagedIterable<StudentLabDetailsInner> inner = this.serviceClient().listAll(context);
        return Utils.mapPage(inner, inner1 -> new StudentLabDetailsImpl(inner1, this.manager()));
    }

    public StudentLabDetails get(String studentLabName) {
        StudentLabDetailsInner inner = this.serviceClient().get(studentLabName);
        if (inner != null) {
            return new StudentLabDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StudentLabDetails> getWithResponse(String studentLabName, Context context) {
        Response<StudentLabDetailsInner> inner = this.serviceClient().getWithResponse(studentLabName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StudentLabDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private StudentLabsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.education.EducationManager manager() {
        return this.serviceManager;
    }
}
