/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.eventgrid.v2019_06_01.Domain;
import rx.Observable;
import com.microsoft.azure.management.eventgrid.v2019_06_01.DomainProvisioningState;

class DomainImpl extends GroupableResourceCoreImpl<Domain, DomainInner, DomainImpl, EventGridManager> implements Domain, Domain.Definition, Domain.Update {
    DomainImpl(String name, DomainInner inner, EventGridManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<Domain> createResourceAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Domain> updateResourceAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DomainInner> getInnerAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String endpoint() {
        return this.inner().endpoint();
    }

    @Override
    public DomainProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

}
