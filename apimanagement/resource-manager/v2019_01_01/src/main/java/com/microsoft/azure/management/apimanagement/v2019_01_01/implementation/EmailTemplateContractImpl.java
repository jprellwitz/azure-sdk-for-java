/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.EmailTemplateContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.EmailTemplateUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.apimanagement.v2019_01_01.TemplateName;
import com.microsoft.azure.management.apimanagement.v2019_01_01.EmailTemplateParametersContractProperties;
import rx.functions.Func1;

class EmailTemplateContractImpl extends CreatableUpdatableImpl<EmailTemplateContract, EmailTemplateContractInner, EmailTemplateContractImpl> implements EmailTemplateContract, EmailTemplateContract.Definition, EmailTemplateContract.Update {
    private String resourceGroupName;
    private String serviceName;
    private TemplateName templateName;
    private String cifMatch;
    private String uifMatch;
    private EmailTemplateUpdateParameters createOrUpdateParameter;
    private final ApiManagementManager manager;

    EmailTemplateContractImpl(String name, ApiManagementManager manager) {
        super(name, new EmailTemplateContractInner());
        this.manager = manager;
        // Set resource name
        this.templateName = TemplateName.fromString(name);
        //
        this.createOrUpdateParameter = new EmailTemplateUpdateParameters();
    }

    EmailTemplateContractImpl(EmailTemplateContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.templateName = TemplateName.fromString(inner.name());
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.templateName = TemplateName.fromString(IdParsingUtils.getValueFromIdByName(inner.id(), "templates"));
        // set other parameters for create and update
        this.createOrUpdateParameter = new EmailTemplateUpdateParameters();
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EmailTemplateContract> createResourceAsync() {
        EmailTemplatesInner client = this.manager().inner().emailTemplates();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.templateName, this.createOrUpdateParameter, this.cifMatch)
            .map(new Func1<EmailTemplateContractInner, EmailTemplateContractInner>() {
               @Override
               public EmailTemplateContractInner call(EmailTemplateContractInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<EmailTemplateContract> updateResourceAsync() {
        EmailTemplatesInner client = this.manager().inner().emailTemplates();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.templateName, this.createOrUpdateParameter, this.uifMatch)
            .map(new Func1<EmailTemplateContractInner, EmailTemplateContractInner>() {
               @Override
               public EmailTemplateContractInner call(EmailTemplateContractInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<EmailTemplateContractInner> getInnerAsync() {
        EmailTemplatesInner client = this.manager().inner().emailTemplates();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new EmailTemplateUpdateParameters();
    }

    @Override
    public String body() {
        return this.inner().body();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isDefault() {
        return this.inner().isDefault();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<EmailTemplateParametersContractProperties> parameters() {
        return this.inner().parameters();
    }

    @Override
    public String subject() {
        return this.inner().subject();
    }

    @Override
    public String title() {
        return this.inner().title();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public EmailTemplateContractImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public EmailTemplateContractImpl withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    @Override
    public EmailTemplateContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public EmailTemplateContractImpl withBody(String body) {
        this.createOrUpdateParameter.withBody(body);
        return this;
    }

    @Override
    public EmailTemplateContractImpl withDescription(String description) {
        this.createOrUpdateParameter.withDescription(description);
        return this;
    }

    @Override
    public EmailTemplateContractImpl withParameters(List<EmailTemplateParametersContractProperties> parameters) {
        this.createOrUpdateParameter.withParameters(parameters);
        return this;
    }

    @Override
    public EmailTemplateContractImpl withSubject(String subject) {
        this.createOrUpdateParameter.withSubject(subject);
        return this;
    }

    @Override
    public EmailTemplateContractImpl withTitle(String title) {
        this.createOrUpdateParameter.withTitle(title);
        return this;
    }

}
