/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servermanagement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters to a PowerShell script execution command.
 */
@JsonFlatten
public class PowerShellCommandParameters {
    /**
     * Script to execute.
     */
    @JsonProperty(value = "properties.command")
    private String command;

    /**
     * Get the command value.
     *
     * @return the command value
     */
    public String command() {
        return this.command;
    }

    /**
     * Set the command value.
     *
     * @param command the command value to set
     * @return the PowerShellCommandParameters object itself.
     */
    public PowerShellCommandParameters withCommand(String command) {
        this.command = command;
        return this;
    }

}
