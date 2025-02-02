// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FastProvisioningEditionCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServerEditionCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HyperscaleNodeEditionCapability;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Location capabilities. */
@Immutable
public final class CapabilityPropertiesInner {
    /*
     * zone name
     */
    @JsonProperty(value = "zone", access = JsonProperty.Access.WRITE_ONLY)
    private String zone;

    /*
     * Supported high availability mode
     */
    @JsonProperty(value = "supportedHAMode", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> supportedHAMode;

    /*
     * A value indicating whether a new server in this region can have geo-backups to paired region.
     */
    @JsonProperty(value = "geoBackupSupported", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean geoBackupSupported;

    /*
     * A value indicating whether a new server in this region can support multi zone HA.
     */
    @JsonProperty(value = "zoneRedundantHaSupported", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean zoneRedundantHaSupported;

    /*
     * A value indicating whether a new server in this region can have geo-backups to paired region.
     */
    @JsonProperty(value = "zoneRedundantHaAndGeoBackupSupported", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean zoneRedundantHaAndGeoBackupSupported;

    /*
     * The supportedFlexibleServerEditions property.
     */
    @JsonProperty(value = "supportedFlexibleServerEditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<FlexibleServerEditionCapability> supportedFlexibleServerEditions;

    /*
     * The supportedHyperscaleNodeEditions property.
     */
    @JsonProperty(value = "supportedHyperscaleNodeEditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<HyperscaleNodeEditionCapability> supportedHyperscaleNodeEditions;

    /*
     * A value indicating whether fast provisioning is supported in this region.
     */
    @JsonProperty(value = "fastProvisioningSupported", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean fastProvisioningSupported;

    /*
     * The supportedFastProvisioningEditions property.
     */
    @JsonProperty(value = "supportedFastProvisioningEditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<FastProvisioningEditionCapability> supportedFastProvisioningEditions;

    /*
     * The status
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /** Creates an instance of CapabilityPropertiesInner class. */
    public CapabilityPropertiesInner() {
    }

    /**
     * Get the zone property: zone name.
     *
     * @return the zone value.
     */
    public String zone() {
        return this.zone;
    }

    /**
     * Get the supportedHAMode property: Supported high availability mode.
     *
     * @return the supportedHAMode value.
     */
    public List<String> supportedHAMode() {
        return this.supportedHAMode;
    }

    /**
     * Get the geoBackupSupported property: A value indicating whether a new server in this region can have geo-backups
     * to paired region.
     *
     * @return the geoBackupSupported value.
     */
    public Boolean geoBackupSupported() {
        return this.geoBackupSupported;
    }

    /**
     * Get the zoneRedundantHaSupported property: A value indicating whether a new server in this region can support
     * multi zone HA.
     *
     * @return the zoneRedundantHaSupported value.
     */
    public Boolean zoneRedundantHaSupported() {
        return this.zoneRedundantHaSupported;
    }

    /**
     * Get the zoneRedundantHaAndGeoBackupSupported property: A value indicating whether a new server in this region can
     * have geo-backups to paired region.
     *
     * @return the zoneRedundantHaAndGeoBackupSupported value.
     */
    public Boolean zoneRedundantHaAndGeoBackupSupported() {
        return this.zoneRedundantHaAndGeoBackupSupported;
    }

    /**
     * Get the supportedFlexibleServerEditions property: The supportedFlexibleServerEditions property.
     *
     * @return the supportedFlexibleServerEditions value.
     */
    public List<FlexibleServerEditionCapability> supportedFlexibleServerEditions() {
        return this.supportedFlexibleServerEditions;
    }

    /**
     * Get the supportedHyperscaleNodeEditions property: The supportedHyperscaleNodeEditions property.
     *
     * @return the supportedHyperscaleNodeEditions value.
     */
    public List<HyperscaleNodeEditionCapability> supportedHyperscaleNodeEditions() {
        return this.supportedHyperscaleNodeEditions;
    }

    /**
     * Get the fastProvisioningSupported property: A value indicating whether fast provisioning is supported in this
     * region.
     *
     * @return the fastProvisioningSupported value.
     */
    public Boolean fastProvisioningSupported() {
        return this.fastProvisioningSupported;
    }

    /**
     * Get the supportedFastProvisioningEditions property: The supportedFastProvisioningEditions property.
     *
     * @return the supportedFastProvisioningEditions value.
     */
    public List<FastProvisioningEditionCapability> supportedFastProvisioningEditions() {
        return this.supportedFastProvisioningEditions;
    }

    /**
     * Get the status property: The status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedFlexibleServerEditions() != null) {
            supportedFlexibleServerEditions().forEach(e -> e.validate());
        }
        if (supportedHyperscaleNodeEditions() != null) {
            supportedHyperscaleNodeEditions().forEach(e -> e.validate());
        }
        if (supportedFastProvisioningEditions() != null) {
            supportedFastProvisioningEditions().forEach(e -> e.validate());
        }
    }
}
