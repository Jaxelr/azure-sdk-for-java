// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The definition of data present in the forecast. */
@Fluent
public final class ForecastDataset {
    /*
     * The granularity of rows in the forecast.
     */
    @JsonProperty(value = "granularity")
    private GranularityType granularity;

    /*
     * Has configuration information for the data in the export. The configuration will be ignored if aggregation and
     * grouping are provided.
     */
    @JsonProperty(value = "configuration")
    private QueryDatasetConfiguration configuration;

    /*
     * Dictionary of aggregation expression to use in the forecast. The key of each item in the dictionary is the alias
     * for the aggregated column. forecast can have up to 2 aggregation clauses.
     */
    @JsonProperty(value = "aggregation")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, QueryAggregation> aggregation;

    /*
     * Has filter expression to use in the forecast.
     */
    @JsonProperty(value = "filter")
    private QueryFilter filter;

    /** Creates an instance of ForecastDataset class. */
    public ForecastDataset() {
    }

    /**
     * Get the granularity property: The granularity of rows in the forecast.
     *
     * @return the granularity value.
     */
    public GranularityType granularity() {
        return this.granularity;
    }

    /**
     * Set the granularity property: The granularity of rows in the forecast.
     *
     * @param granularity the granularity value to set.
     * @return the ForecastDataset object itself.
     */
    public ForecastDataset withGranularity(GranularityType granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * Get the configuration property: Has configuration information for the data in the export. The configuration will
     * be ignored if aggregation and grouping are provided.
     *
     * @return the configuration value.
     */
    public QueryDatasetConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Has configuration information for the data in the export. The configuration will
     * be ignored if aggregation and grouping are provided.
     *
     * @param configuration the configuration value to set.
     * @return the ForecastDataset object itself.
     */
    public ForecastDataset withConfiguration(QueryDatasetConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the aggregation property: Dictionary of aggregation expression to use in the forecast. The key of each item
     * in the dictionary is the alias for the aggregated column. forecast can have up to 2 aggregation clauses.
     *
     * @return the aggregation value.
     */
    public Map<String, QueryAggregation> aggregation() {
        return this.aggregation;
    }

    /**
     * Set the aggregation property: Dictionary of aggregation expression to use in the forecast. The key of each item
     * in the dictionary is the alias for the aggregated column. forecast can have up to 2 aggregation clauses.
     *
     * @param aggregation the aggregation value to set.
     * @return the ForecastDataset object itself.
     */
    public ForecastDataset withAggregation(Map<String, QueryAggregation> aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    /**
     * Get the filter property: Has filter expression to use in the forecast.
     *
     * @return the filter value.
     */
    public QueryFilter filter() {
        return this.filter;
    }

    /**
     * Set the filter property: Has filter expression to use in the forecast.
     *
     * @param filter the filter value to set.
     * @return the ForecastDataset object itself.
     */
    public ForecastDataset withFilter(QueryFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
        if (aggregation() != null) {
            aggregation()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (filter() != null) {
            filter().validate();
        }
    }
}