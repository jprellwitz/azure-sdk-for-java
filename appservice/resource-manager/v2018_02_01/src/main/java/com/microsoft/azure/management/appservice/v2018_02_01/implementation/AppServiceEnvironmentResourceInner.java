/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.ProvisioningState;
import com.microsoft.azure.management.appservice.v2018_02_01.HostingEnvironmentStatus;
import com.microsoft.azure.management.appservice.v2018_02_01.VirtualNetworkProfile;
import com.microsoft.azure.management.appservice.v2018_02_01.InternalLoadBalancingMode;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.WorkerPool;
import com.microsoft.azure.management.appservice.v2018_02_01.VirtualIPMapping;
import com.microsoft.azure.management.appservice.v2018_02_01.NetworkAccessControlEntry;
import com.microsoft.azure.management.appservice.v2018_02_01.NameValuePair;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * App Service Environment ARM resource.
 */
@JsonFlatten
public class AppServiceEnvironmentResourceInner extends Resource {
    /**
     * Name of the App Service Environment.
     */
    @JsonProperty(value = "properties.name", required = true)
    private String appServiceEnvironmentResourceName;

    /**
     * Location of the App Service Environment, e.g. "West US".
     */
    @JsonProperty(value = "properties.location", required = true)
    private String appServiceEnvironmentResourceLocation;

    /**
     * Provisioning state of the App Service Environment. Possible values
     * include: 'Succeeded', 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Current status of the App Service Environment. Possible values include:
     * 'Preparing', 'Ready', 'Scaling', 'Deleting'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private HostingEnvironmentStatus status;

    /**
     * Name of the Virtual Network for the App Service Environment.
     */
    @JsonProperty(value = "properties.vnetName")
    private String vnetName;

    /**
     * Resource group of the Virtual Network.
     */
    @JsonProperty(value = "properties.vnetResourceGroupName")
    private String vnetResourceGroupName;

    /**
     * Subnet of the Virtual Network.
     */
    @JsonProperty(value = "properties.vnetSubnetName")
    private String vnetSubnetName;

    /**
     * Description of the Virtual Network.
     */
    @JsonProperty(value = "properties.virtualNetwork", required = true)
    private VirtualNetworkProfile virtualNetwork;

    /**
     * Specifies which endpoints to serve internally in the Virtual Network for
     * the App Service Environment. Possible values include: 'None', 'Web',
     * 'Publishing'.
     */
    @JsonProperty(value = "properties.internalLoadBalancingMode")
    private InternalLoadBalancingMode internalLoadBalancingMode;

    /**
     * Front-end VM size, e.g. "Medium", "Large".
     */
    @JsonProperty(value = "properties.multiSize")
    private String multiSize;

    /**
     * Number of front-end instances.
     */
    @JsonProperty(value = "properties.multiRoleCount")
    private Integer multiRoleCount;

    /**
     * Description of worker pools with worker size IDs, VM sizes, and number
     * of workers in each pool.
     */
    @JsonProperty(value = "properties.workerPools", required = true)
    private List<WorkerPool> workerPools;

    /**
     * Number of IP SSL addresses reserved for the App Service Environment.
     */
    @JsonProperty(value = "properties.ipsslAddressCount")
    private Integer ipsslAddressCount;

    /**
     * Edition of the metadata database for the App Service Environment, e.g.
     * "Standard".
     */
    @JsonProperty(value = "properties.databaseEdition", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseEdition;

    /**
     * Service objective of the metadata database for the App Service
     * Environment, e.g. "S0".
     */
    @JsonProperty(value = "properties.databaseServiceObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseServiceObjective;

    /**
     * Number of upgrade domains of the App Service Environment.
     */
    @JsonProperty(value = "properties.upgradeDomains", access = JsonProperty.Access.WRITE_ONLY)
    private Integer upgradeDomains;

    /**
     * Subscription of the App Service Environment.
     */
    @JsonProperty(value = "properties.subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /**
     * DNS suffix of the App Service Environment.
     */
    @JsonProperty(value = "properties.dnsSuffix")
    private String dnsSuffix;

    /**
     * Last deployment action on the App Service Environment.
     */
    @JsonProperty(value = "properties.lastAction", access = JsonProperty.Access.WRITE_ONLY)
    private String lastAction;

    /**
     * Result of the last deployment action on the App Service Environment.
     */
    @JsonProperty(value = "properties.lastActionResult", access = JsonProperty.Access.WRITE_ONLY)
    private String lastActionResult;

    /**
     * List of comma separated strings describing which VM sizes are allowed
     * for front-ends.
     */
    @JsonProperty(value = "properties.allowedMultiSizes", access = JsonProperty.Access.WRITE_ONLY)
    private String allowedMultiSizes;

    /**
     * List of comma separated strings describing which VM sizes are allowed
     * for workers.
     */
    @JsonProperty(value = "properties.allowedWorkerSizes", access = JsonProperty.Access.WRITE_ONLY)
    private String allowedWorkerSizes;

    /**
     * Maximum number of VMs in the App Service Environment.
     */
    @JsonProperty(value = "properties.maximumNumberOfMachines", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maximumNumberOfMachines;

    /**
     * Description of IP SSL mapping for the App Service Environment.
     */
    @JsonProperty(value = "properties.vipMappings", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualIPMapping> vipMappings;

    /**
     * Current total, used, and available worker capacities.
     */
    @JsonProperty(value = "properties.environmentCapacities", access = JsonProperty.Access.WRITE_ONLY)
    private List<StampCapacityInner> environmentCapacities;

    /**
     * Access control list for controlling traffic to the App Service
     * Environment.
     */
    @JsonProperty(value = "properties.networkAccessControlList")
    private List<NetworkAccessControlEntry> networkAccessControlList;

    /**
     * True/false indicating whether the App Service Environment is healthy.
     */
    @JsonProperty(value = "properties.environmentIsHealthy", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean environmentIsHealthy;

    /**
     * Detailed message about with results of the last check of the App Service
     * Environment.
     */
    @JsonProperty(value = "properties.environmentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String environmentStatus;

    /**
     * Resource group of the App Service Environment.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /**
     * Scale factor for front-ends.
     */
    @JsonProperty(value = "properties.frontEndScaleFactor")
    private Integer frontEndScaleFactor;

    /**
     * Default Scale Factor for FrontEnds.
     */
    @JsonProperty(value = "properties.defaultFrontEndScaleFactor", access = JsonProperty.Access.WRITE_ONLY)
    private Integer defaultFrontEndScaleFactor;

    /**
     * API Management Account associated with the App Service Environment.
     */
    @JsonProperty(value = "properties.apiManagementAccountId")
    private String apiManagementAccountId;

    /**
     * &lt;code&gt;true&lt;/code&gt; if the App Service Environment is
     * suspended; otherwise, &lt;code&gt;false&lt;/code&gt;. The environment
     * can be suspended, e.g. when the management endpoint is no longer
     * available
     * (most likely because NSG blocked the incoming traffic).
     */
    @JsonProperty(value = "properties.suspended")
    private Boolean suspended;

    /**
     * True/false indicating whether the App Service Environment is suspended.
     * The environment can be suspended e.g. when the management endpoint is no
     * longer available
     * (most likely because NSG blocked the incoming traffic).
     */
    @JsonProperty(value = "properties.dynamicCacheEnabled")
    private Boolean dynamicCacheEnabled;

    /**
     * Custom settings for changing the behavior of the App Service
     * Environment.
     */
    @JsonProperty(value = "properties.clusterSettings")
    private List<NameValuePair> clusterSettings;

    /**
     * User added ip ranges to whitelist on ASE db.
     */
    @JsonProperty(value = "properties.userWhitelistedIpRanges")
    private List<String> userWhitelistedIpRanges;

    /**
     * Flag that displays whether an ASE has linux workers or not.
     */
    @JsonProperty(value = "properties.hasLinuxWorkers")
    private Boolean hasLinuxWorkers;

    /**
     * Key Vault ID for ILB App Service Environment default SSL certificate.
     */
    @JsonProperty(value = "properties.sslCertKeyVaultId")
    private String sslCertKeyVaultId;

    /**
     * Key Vault Secret Name for ILB App Service Environment default SSL
     * certificate.
     */
    @JsonProperty(value = "properties.sslCertKeyVaultSecretName")
    private String sslCertKeyVaultSecretName;

    /**
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get name of the App Service Environment.
     *
     * @return the appServiceEnvironmentResourceName value
     */
    public String appServiceEnvironmentResourceName() {
        return this.appServiceEnvironmentResourceName;
    }

    /**
     * Set name of the App Service Environment.
     *
     * @param appServiceEnvironmentResourceName the appServiceEnvironmentResourceName value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withAppServiceEnvironmentResourceName(String appServiceEnvironmentResourceName) {
        this.appServiceEnvironmentResourceName = appServiceEnvironmentResourceName;
        return this;
    }

    /**
     * Get location of the App Service Environment, e.g. "West US".
     *
     * @return the appServiceEnvironmentResourceLocation value
     */
    public String appServiceEnvironmentResourceLocation() {
        return this.appServiceEnvironmentResourceLocation;
    }

    /**
     * Set location of the App Service Environment, e.g. "West US".
     *
     * @param appServiceEnvironmentResourceLocation the appServiceEnvironmentResourceLocation value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withAppServiceEnvironmentResourceLocation(String appServiceEnvironmentResourceLocation) {
        this.appServiceEnvironmentResourceLocation = appServiceEnvironmentResourceLocation;
        return this;
    }

    /**
     * Get provisioning state of the App Service Environment. Possible values include: 'Succeeded', 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get current status of the App Service Environment. Possible values include: 'Preparing', 'Ready', 'Scaling', 'Deleting'.
     *
     * @return the status value
     */
    public HostingEnvironmentStatus status() {
        return this.status;
    }

    /**
     * Get name of the Virtual Network for the App Service Environment.
     *
     * @return the vnetName value
     */
    public String vnetName() {
        return this.vnetName;
    }

    /**
     * Set name of the Virtual Network for the App Service Environment.
     *
     * @param vnetName the vnetName value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withVnetName(String vnetName) {
        this.vnetName = vnetName;
        return this;
    }

    /**
     * Get resource group of the Virtual Network.
     *
     * @return the vnetResourceGroupName value
     */
    public String vnetResourceGroupName() {
        return this.vnetResourceGroupName;
    }

    /**
     * Set resource group of the Virtual Network.
     *
     * @param vnetResourceGroupName the vnetResourceGroupName value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withVnetResourceGroupName(String vnetResourceGroupName) {
        this.vnetResourceGroupName = vnetResourceGroupName;
        return this;
    }

    /**
     * Get subnet of the Virtual Network.
     *
     * @return the vnetSubnetName value
     */
    public String vnetSubnetName() {
        return this.vnetSubnetName;
    }

    /**
     * Set subnet of the Virtual Network.
     *
     * @param vnetSubnetName the vnetSubnetName value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withVnetSubnetName(String vnetSubnetName) {
        this.vnetSubnetName = vnetSubnetName;
        return this;
    }

    /**
     * Get description of the Virtual Network.
     *
     * @return the virtualNetwork value
     */
    public VirtualNetworkProfile virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set description of the Virtual Network.
     *
     * @param virtualNetwork the virtualNetwork value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withVirtualNetwork(VirtualNetworkProfile virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Get specifies which endpoints to serve internally in the Virtual Network for the App Service Environment. Possible values include: 'None', 'Web', 'Publishing'.
     *
     * @return the internalLoadBalancingMode value
     */
    public InternalLoadBalancingMode internalLoadBalancingMode() {
        return this.internalLoadBalancingMode;
    }

    /**
     * Set specifies which endpoints to serve internally in the Virtual Network for the App Service Environment. Possible values include: 'None', 'Web', 'Publishing'.
     *
     * @param internalLoadBalancingMode the internalLoadBalancingMode value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withInternalLoadBalancingMode(InternalLoadBalancingMode internalLoadBalancingMode) {
        this.internalLoadBalancingMode = internalLoadBalancingMode;
        return this;
    }

    /**
     * Get front-end VM size, e.g. "Medium", "Large".
     *
     * @return the multiSize value
     */
    public String multiSize() {
        return this.multiSize;
    }

    /**
     * Set front-end VM size, e.g. "Medium", "Large".
     *
     * @param multiSize the multiSize value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withMultiSize(String multiSize) {
        this.multiSize = multiSize;
        return this;
    }

    /**
     * Get number of front-end instances.
     *
     * @return the multiRoleCount value
     */
    public Integer multiRoleCount() {
        return this.multiRoleCount;
    }

    /**
     * Set number of front-end instances.
     *
     * @param multiRoleCount the multiRoleCount value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withMultiRoleCount(Integer multiRoleCount) {
        this.multiRoleCount = multiRoleCount;
        return this;
    }

    /**
     * Get description of worker pools with worker size IDs, VM sizes, and number of workers in each pool.
     *
     * @return the workerPools value
     */
    public List<WorkerPool> workerPools() {
        return this.workerPools;
    }

    /**
     * Set description of worker pools with worker size IDs, VM sizes, and number of workers in each pool.
     *
     * @param workerPools the workerPools value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withWorkerPools(List<WorkerPool> workerPools) {
        this.workerPools = workerPools;
        return this;
    }

    /**
     * Get number of IP SSL addresses reserved for the App Service Environment.
     *
     * @return the ipsslAddressCount value
     */
    public Integer ipsslAddressCount() {
        return this.ipsslAddressCount;
    }

    /**
     * Set number of IP SSL addresses reserved for the App Service Environment.
     *
     * @param ipsslAddressCount the ipsslAddressCount value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withIpsslAddressCount(Integer ipsslAddressCount) {
        this.ipsslAddressCount = ipsslAddressCount;
        return this;
    }

    /**
     * Get edition of the metadata database for the App Service Environment, e.g. "Standard".
     *
     * @return the databaseEdition value
     */
    public String databaseEdition() {
        return this.databaseEdition;
    }

    /**
     * Get service objective of the metadata database for the App Service Environment, e.g. "S0".
     *
     * @return the databaseServiceObjective value
     */
    public String databaseServiceObjective() {
        return this.databaseServiceObjective;
    }

    /**
     * Get number of upgrade domains of the App Service Environment.
     *
     * @return the upgradeDomains value
     */
    public Integer upgradeDomains() {
        return this.upgradeDomains;
    }

    /**
     * Get subscription of the App Service Environment.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get dNS suffix of the App Service Environment.
     *
     * @return the dnsSuffix value
     */
    public String dnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Set dNS suffix of the App Service Environment.
     *
     * @param dnsSuffix the dnsSuffix value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withDnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
        return this;
    }

    /**
     * Get last deployment action on the App Service Environment.
     *
     * @return the lastAction value
     */
    public String lastAction() {
        return this.lastAction;
    }

    /**
     * Get result of the last deployment action on the App Service Environment.
     *
     * @return the lastActionResult value
     */
    public String lastActionResult() {
        return this.lastActionResult;
    }

    /**
     * Get list of comma separated strings describing which VM sizes are allowed for front-ends.
     *
     * @return the allowedMultiSizes value
     */
    public String allowedMultiSizes() {
        return this.allowedMultiSizes;
    }

    /**
     * Get list of comma separated strings describing which VM sizes are allowed for workers.
     *
     * @return the allowedWorkerSizes value
     */
    public String allowedWorkerSizes() {
        return this.allowedWorkerSizes;
    }

    /**
     * Get maximum number of VMs in the App Service Environment.
     *
     * @return the maximumNumberOfMachines value
     */
    public Integer maximumNumberOfMachines() {
        return this.maximumNumberOfMachines;
    }

    /**
     * Get description of IP SSL mapping for the App Service Environment.
     *
     * @return the vipMappings value
     */
    public List<VirtualIPMapping> vipMappings() {
        return this.vipMappings;
    }

    /**
     * Get current total, used, and available worker capacities.
     *
     * @return the environmentCapacities value
     */
    public List<StampCapacityInner> environmentCapacities() {
        return this.environmentCapacities;
    }

    /**
     * Get access control list for controlling traffic to the App Service Environment.
     *
     * @return the networkAccessControlList value
     */
    public List<NetworkAccessControlEntry> networkAccessControlList() {
        return this.networkAccessControlList;
    }

    /**
     * Set access control list for controlling traffic to the App Service Environment.
     *
     * @param networkAccessControlList the networkAccessControlList value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withNetworkAccessControlList(List<NetworkAccessControlEntry> networkAccessControlList) {
        this.networkAccessControlList = networkAccessControlList;
        return this;
    }

    /**
     * Get true/false indicating whether the App Service Environment is healthy.
     *
     * @return the environmentIsHealthy value
     */
    public Boolean environmentIsHealthy() {
        return this.environmentIsHealthy;
    }

    /**
     * Get detailed message about with results of the last check of the App Service Environment.
     *
     * @return the environmentStatus value
     */
    public String environmentStatus() {
        return this.environmentStatus;
    }

    /**
     * Get resource group of the App Service Environment.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get scale factor for front-ends.
     *
     * @return the frontEndScaleFactor value
     */
    public Integer frontEndScaleFactor() {
        return this.frontEndScaleFactor;
    }

    /**
     * Set scale factor for front-ends.
     *
     * @param frontEndScaleFactor the frontEndScaleFactor value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withFrontEndScaleFactor(Integer frontEndScaleFactor) {
        this.frontEndScaleFactor = frontEndScaleFactor;
        return this;
    }

    /**
     * Get default Scale Factor for FrontEnds.
     *
     * @return the defaultFrontEndScaleFactor value
     */
    public Integer defaultFrontEndScaleFactor() {
        return this.defaultFrontEndScaleFactor;
    }

    /**
     * Get aPI Management Account associated with the App Service Environment.
     *
     * @return the apiManagementAccountId value
     */
    public String apiManagementAccountId() {
        return this.apiManagementAccountId;
    }

    /**
     * Set aPI Management Account associated with the App Service Environment.
     *
     * @param apiManagementAccountId the apiManagementAccountId value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withApiManagementAccountId(String apiManagementAccountId) {
        this.apiManagementAccountId = apiManagementAccountId;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if the App Service Environment is suspended; otherwise, &lt;code&gt;false&lt;/code&gt;. The environment can be suspended, e.g. when the management endpoint is no longer available
      (most likely because NSG blocked the incoming traffic).
     *
     * @return the suspended value
     */
    public Boolean suspended() {
        return this.suspended;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if the App Service Environment is suspended; otherwise, &lt;code&gt;false&lt;/code&gt;. The environment can be suspended, e.g. when the management endpoint is no longer available
      (most likely because NSG blocked the incoming traffic).
     *
     * @param suspended the suspended value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withSuspended(Boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    /**
     * Get true/false indicating whether the App Service Environment is suspended. The environment can be suspended e.g. when the management endpoint is no longer available
     (most likely because NSG blocked the incoming traffic).
     *
     * @return the dynamicCacheEnabled value
     */
    public Boolean dynamicCacheEnabled() {
        return this.dynamicCacheEnabled;
    }

    /**
     * Set true/false indicating whether the App Service Environment is suspended. The environment can be suspended e.g. when the management endpoint is no longer available
     (most likely because NSG blocked the incoming traffic).
     *
     * @param dynamicCacheEnabled the dynamicCacheEnabled value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withDynamicCacheEnabled(Boolean dynamicCacheEnabled) {
        this.dynamicCacheEnabled = dynamicCacheEnabled;
        return this;
    }

    /**
     * Get custom settings for changing the behavior of the App Service Environment.
     *
     * @return the clusterSettings value
     */
    public List<NameValuePair> clusterSettings() {
        return this.clusterSettings;
    }

    /**
     * Set custom settings for changing the behavior of the App Service Environment.
     *
     * @param clusterSettings the clusterSettings value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withClusterSettings(List<NameValuePair> clusterSettings) {
        this.clusterSettings = clusterSettings;
        return this;
    }

    /**
     * Get user added ip ranges to whitelist on ASE db.
     *
     * @return the userWhitelistedIpRanges value
     */
    public List<String> userWhitelistedIpRanges() {
        return this.userWhitelistedIpRanges;
    }

    /**
     * Set user added ip ranges to whitelist on ASE db.
     *
     * @param userWhitelistedIpRanges the userWhitelistedIpRanges value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withUserWhitelistedIpRanges(List<String> userWhitelistedIpRanges) {
        this.userWhitelistedIpRanges = userWhitelistedIpRanges;
        return this;
    }

    /**
     * Get flag that displays whether an ASE has linux workers or not.
     *
     * @return the hasLinuxWorkers value
     */
    public Boolean hasLinuxWorkers() {
        return this.hasLinuxWorkers;
    }

    /**
     * Set flag that displays whether an ASE has linux workers or not.
     *
     * @param hasLinuxWorkers the hasLinuxWorkers value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withHasLinuxWorkers(Boolean hasLinuxWorkers) {
        this.hasLinuxWorkers = hasLinuxWorkers;
        return this;
    }

    /**
     * Get key Vault ID for ILB App Service Environment default SSL certificate.
     *
     * @return the sslCertKeyVaultId value
     */
    public String sslCertKeyVaultId() {
        return this.sslCertKeyVaultId;
    }

    /**
     * Set key Vault ID for ILB App Service Environment default SSL certificate.
     *
     * @param sslCertKeyVaultId the sslCertKeyVaultId value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withSslCertKeyVaultId(String sslCertKeyVaultId) {
        this.sslCertKeyVaultId = sslCertKeyVaultId;
        return this;
    }

    /**
     * Get key Vault Secret Name for ILB App Service Environment default SSL certificate.
     *
     * @return the sslCertKeyVaultSecretName value
     */
    public String sslCertKeyVaultSecretName() {
        return this.sslCertKeyVaultSecretName;
    }

    /**
     * Set key Vault Secret Name for ILB App Service Environment default SSL certificate.
     *
     * @param sslCertKeyVaultSecretName the sslCertKeyVaultSecretName value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withSslCertKeyVaultSecretName(String sslCertKeyVaultSecretName) {
        this.sslCertKeyVaultSecretName = sslCertKeyVaultSecretName;
        return this;
    }

    /**
     * Get kind of resource.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set kind of resource.
     *
     * @param kind the kind value to set
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

}
