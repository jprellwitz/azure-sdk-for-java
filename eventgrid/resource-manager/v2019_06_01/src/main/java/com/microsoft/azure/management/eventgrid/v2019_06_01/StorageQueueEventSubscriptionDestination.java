/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Information about the storage queue destination for an event subscription.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("StorageQueue")
@JsonFlatten
public class StorageQueueEventSubscriptionDestination extends EventSubscriptionDestination {
    /**
     * The Azure Resource ID of the storage account that contains the queue
     * that is the destination of an event subscription.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * The name of the Storage queue under a storage account that is the
     * destination of an event subscription.
     */
    @JsonProperty(value = "properties.queueName")
    private String queueName;

    /**
     * Get the Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     *
     * @param resourceId the resourceId value to set
     * @return the StorageQueueEventSubscriptionDestination object itself.
     */
    public StorageQueueEventSubscriptionDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the name of the Storage queue under a storage account that is the destination of an event subscription.
     *
     * @return the queueName value
     */
    public String queueName() {
        return this.queueName;
    }

    /**
     * Set the name of the Storage queue under a storage account that is the destination of an event subscription.
     *
     * @param queueName the queueName value to set
     * @return the StorageQueueEventSubscriptionDestination object itself.
     */
    public StorageQueueEventSubscriptionDestination withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

}
