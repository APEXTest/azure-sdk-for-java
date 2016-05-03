/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Used for establishing the purchase context of any 3rd Party artifact
 * through MarketPlace.
 */
public class PurchasePlan {
    /**
     * Gets or sets the publisher ID.
     */
    @JsonProperty(required = true)
    private String publisher;

    /**
     * Gets or sets the plan ID.
     */
    @JsonProperty(required = true)
    private String name;

    /**
     * Gets or sets the product ID.
     */
    @JsonProperty(required = true)
    private String product;

    /**
     * Get the publisher value.
     *
     * @return the publisher value
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Set the publisher value.
     *
     * @param publisher the publisher value to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the product value.
     *
     * @return the product value
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * Set the product value.
     *
     * @param product the product value to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

}