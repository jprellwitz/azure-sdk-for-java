/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of an environment deployment.
 */
public class EnvironmentDeploymentPropertiesFragment {
    /**
     * The Azure Resource Manager template's identifier.
     */
    @JsonProperty(value = "armTemplateId")
    private String armTemplateId;

    /**
     * The parameters of the Azure Resource Manager template.
     */
    @JsonProperty(value = "parameters")
    private List<ArmTemplateParameterPropertiesFragment> parameters;

    /**
     * Get the Azure Resource Manager template's identifier.
     *
     * @return the armTemplateId value
     */
    public String armTemplateId() {
        return this.armTemplateId;
    }

    /**
     * Set the Azure Resource Manager template's identifier.
     *
     * @param armTemplateId the armTemplateId value to set
     * @return the EnvironmentDeploymentPropertiesFragment object itself.
     */
    public EnvironmentDeploymentPropertiesFragment withArmTemplateId(String armTemplateId) {
        this.armTemplateId = armTemplateId;
        return this;
    }

    /**
     * Get the parameters of the Azure Resource Manager template.
     *
     * @return the parameters value
     */
    public List<ArmTemplateParameterPropertiesFragment> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters of the Azure Resource Manager template.
     *
     * @param parameters the parameters value to set
     * @return the EnvironmentDeploymentPropertiesFragment object itself.
     */
    public EnvironmentDeploymentPropertiesFragment withParameters(List<ArmTemplateParameterPropertiesFragment> parameters) {
        this.parameters = parameters;
        return this;
    }

}