/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.management.monitor.v2019_11_01.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Microsoft Insights API operation definition.
 */
public class OperationInner {
    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display metadata associated with the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Get operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get display metadata associated with the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set display metadata associated with the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

}
