// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The source image from which the Image Version is going to be created. */
@Fluent
public final class UserArtifactSource {
    /*
     * Required. The mediaLink of the artifact, must be a readable storage page blob.
     */
    @JsonProperty(value = "mediaLink", required = true)
    private String mediaLink;

    /*
     * Optional. The defaultConfigurationLink of the artifact, must be a readable storage page blob.
     */
    @JsonProperty(value = "defaultConfigurationLink")
    private String defaultConfigurationLink;

    /** Creates an instance of UserArtifactSource class. */
    public UserArtifactSource() {
    }

    /**
     * Get the mediaLink property: Required. The mediaLink of the artifact, must be a readable storage page blob.
     *
     * @return the mediaLink value.
     */
    public String mediaLink() {
        return this.mediaLink;
    }

    /**
     * Set the mediaLink property: Required. The mediaLink of the artifact, must be a readable storage page blob.
     *
     * @param mediaLink the mediaLink value to set.
     * @return the UserArtifactSource object itself.
     */
    public UserArtifactSource withMediaLink(String mediaLink) {
        this.mediaLink = mediaLink;
        return this;
    }

    /**
     * Get the defaultConfigurationLink property: Optional. The defaultConfigurationLink of the artifact, must be a
     * readable storage page blob.
     *
     * @return the defaultConfigurationLink value.
     */
    public String defaultConfigurationLink() {
        return this.defaultConfigurationLink;
    }

    /**
     * Set the defaultConfigurationLink property: Optional. The defaultConfigurationLink of the artifact, must be a
     * readable storage page blob.
     *
     * @param defaultConfigurationLink the defaultConfigurationLink value to set.
     * @return the UserArtifactSource object itself.
     */
    public UserArtifactSource withDefaultConfigurationLink(String defaultConfigurationLink) {
        this.defaultConfigurationLink = defaultConfigurationLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (mediaLink() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property mediaLink in model UserArtifactSource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserArtifactSource.class);
}
