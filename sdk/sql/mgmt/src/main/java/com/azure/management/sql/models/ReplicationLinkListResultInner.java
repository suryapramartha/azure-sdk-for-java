// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ReplicationLinkListResult model.
 */
@Fluent
public final class ReplicationLinkListResultInner {
    /*
     * The list of database replication links housed in the database.
     */
    @JsonProperty(value = "value")
    private List<ReplicationLinkInner> value;

    /**
     * Get the value property: The list of database replication links housed in
     * the database.
     * 
     * @return the value value.
     */
    public List<ReplicationLinkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of database replication links housed in
     * the database.
     * 
     * @param value the value value to set.
     * @return the ReplicationLinkListResultInner object itself.
     */
    public ReplicationLinkListResultInner withValue(List<ReplicationLinkInner> value) {
        this.value = value;
        return this;
    }
}