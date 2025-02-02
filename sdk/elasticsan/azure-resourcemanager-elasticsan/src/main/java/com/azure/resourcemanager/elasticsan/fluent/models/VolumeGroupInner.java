// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.elasticsan.models.EncryptionType;
import com.azure.resourcemanager.elasticsan.models.NetworkRuleSet;
import com.azure.resourcemanager.elasticsan.models.ProvisioningStates;
import com.azure.resourcemanager.elasticsan.models.StorageTargetType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Response for Volume Group request. */
@Fluent
public final class VolumeGroupInner extends ProxyResource {
    /*
     * Properties of VolumeGroup.
     */
    @JsonProperty(value = "properties")
    private VolumeGroupProperties innerProperties;

    /*
     * Resource metadata required by ARM RPC
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Azure resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of VolumeGroupInner class. */
    public VolumeGroupInner() {
    }

    /**
     * Get the innerProperties property: Properties of VolumeGroup.
     *
     * @return the innerProperties value.
     */
    private VolumeGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Resource metadata required by ARM RPC.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the tags property: Azure resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Azure resource tags.
     *
     * @param tags the tags value to set.
     * @return the VolumeGroupInner object itself.
     */
    public VolumeGroupInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the provisioningState property: State of the operation on the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStates provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the protocolType property: Type of storage target.
     *
     * @return the protocolType value.
     */
    public StorageTargetType protocolType() {
        return this.innerProperties() == null ? null : this.innerProperties().protocolType();
    }

    /**
     * Set the protocolType property: Type of storage target.
     *
     * @param protocolType the protocolType value to set.
     * @return the VolumeGroupInner object itself.
     */
    public VolumeGroupInner withProtocolType(StorageTargetType protocolType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupProperties();
        }
        this.innerProperties().withProtocolType(protocolType);
        return this;
    }

    /**
     * Get the encryption property: Type of encryption.
     *
     * @return the encryption value.
     */
    public EncryptionType encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Type of encryption.
     *
     * @param encryption the encryption value to set.
     * @return the VolumeGroupInner object itself.
     */
    public VolumeGroupInner withEncryption(EncryptionType encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the networkAcls property: A collection of rules governing the accessibility from specific network locations.
     *
     * @return the networkAcls value.
     */
    public NetworkRuleSet networkAcls() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAcls();
    }

    /**
     * Set the networkAcls property: A collection of rules governing the accessibility from specific network locations.
     *
     * @param networkAcls the networkAcls value to set.
     * @return the VolumeGroupInner object itself.
     */
    public VolumeGroupInner withNetworkAcls(NetworkRuleSet networkAcls) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupProperties();
        }
        this.innerProperties().withNetworkAcls(networkAcls);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
