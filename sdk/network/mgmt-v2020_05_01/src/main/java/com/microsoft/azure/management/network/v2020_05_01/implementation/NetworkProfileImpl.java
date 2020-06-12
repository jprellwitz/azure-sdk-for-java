/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_05_01.NetworkProfile;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_05_01.ContainerNetworkInterface;
import com.microsoft.azure.management.network.v2020_05_01.ContainerNetworkInterfaceConfiguration;
import com.microsoft.azure.management.network.v2020_05_01.ProvisioningState;

class NetworkProfileImpl extends GroupableResourceCoreImpl<NetworkProfile, NetworkProfileInner, NetworkProfileImpl, NetworkManager> implements NetworkProfile, NetworkProfile.Definition, NetworkProfile.Update {
    NetworkProfileImpl(String name, NetworkProfileInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<NetworkProfile> createResourceAsync() {
        NetworkProfilesInner client = this.manager().inner().networkProfiles();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NetworkProfile> updateResourceAsync() {
        NetworkProfilesInner client = this.manager().inner().networkProfiles();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NetworkProfileInner> getInnerAsync() {
        NetworkProfilesInner client = this.manager().inner().networkProfiles();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations() {
        return this.inner().containerNetworkInterfaceConfigurations();
    }

    @Override
    public List<ContainerNetworkInterface> containerNetworkInterfaces() {
        return this.inner().containerNetworkInterfaces();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public NetworkProfileImpl withContainerNetworkInterfaceConfigurations(List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations) {
        this.inner().withContainerNetworkInterfaceConfigurations(containerNetworkInterfaceConfigurations);
        return this;
    }

}
