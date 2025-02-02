// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.fluent.models.WebTestInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of 0 or more Application Insights web test definitions. */
@Fluent
public final class WebTestListResult {
    /*
     * Set of Application Insights web test definitions.
     */
    @JsonProperty(value = "value", required = true)
    private List<WebTestInner> value;

    /*
     * The link to get the next part of the returned list of web tests, should
     * the return set be too large for a single request. May be null.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Set of Application Insights web test definitions.
     *
     * @return the value value.
     */
    public List<WebTestInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Set of Application Insights web test definitions.
     *
     * @param value the value value to set.
     * @return the WebTestListResult object itself.
     */
    public WebTestListResult withValue(List<WebTestInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to get the next part of the returned list of web tests, should the return set
     * be too large for a single request. May be null.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to get the next part of the returned list of web tests, should the return set
     * be too large for a single request. May be null.
     *
     * @param nextLink the nextLink value to set.
     * @return the WebTestListResult object itself.
     */
    public WebTestListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model WebTestListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebTestListResult.class);
}
