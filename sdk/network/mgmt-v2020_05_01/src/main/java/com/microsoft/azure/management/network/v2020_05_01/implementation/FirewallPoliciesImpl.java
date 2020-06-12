/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_05_01.FirewallPolicies;
import com.microsoft.azure.management.network.v2020_05_01.FirewallPolicy;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class FirewallPoliciesImpl extends GroupableResourcesCoreImpl<FirewallPolicy, FirewallPolicyImpl, FirewallPolicyInner, FirewallPoliciesInner, NetworkManager>  implements FirewallPolicies {
    protected FirewallPoliciesImpl(NetworkManager manager) {
        super(manager.inner().firewallPolicies(), manager);
    }

    @Override
    protected Observable<FirewallPolicyInner> getInnerAsync(String resourceGroupName, String name) {
        FirewallPoliciesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        FirewallPoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<FirewallPolicy> listByResourceGroup(String resourceGroupName) {
        FirewallPoliciesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<FirewallPolicy> listByResourceGroupAsync(String resourceGroupName) {
        FirewallPoliciesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<FirewallPolicyInner>, Iterable<FirewallPolicyInner>>() {
            @Override
            public Iterable<FirewallPolicyInner> call(Page<FirewallPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FirewallPolicyInner, FirewallPolicy>() {
            @Override
            public FirewallPolicy call(FirewallPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<FirewallPolicy> list() {
        FirewallPoliciesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<FirewallPolicy> listAsync() {
        FirewallPoliciesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<FirewallPolicyInner>, Iterable<FirewallPolicyInner>>() {
            @Override
            public Iterable<FirewallPolicyInner> call(Page<FirewallPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FirewallPolicyInner, FirewallPolicy>() {
            @Override
            public FirewallPolicy call(FirewallPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public FirewallPolicyImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected FirewallPolicyImpl wrapModel(FirewallPolicyInner inner) {
        return  new FirewallPolicyImpl(inner.name(), inner, manager());
    }

    @Override
    protected FirewallPolicyImpl wrapModel(String name) {
        return new FirewallPolicyImpl(name, new FirewallPolicyInner(), this.manager());
    }

}
