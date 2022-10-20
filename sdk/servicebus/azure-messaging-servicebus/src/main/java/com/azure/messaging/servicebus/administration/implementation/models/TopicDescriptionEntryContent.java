// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The TopicDescriptionEntryContent model. */
@JacksonXmlRootElement(localName = "null", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class TopicDescriptionEntryContent {
    /*
     * Type of content in topic response
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    /*
     * Description of a Service Bus topic resource.
     */
    @JacksonXmlProperty(
            localName = "TopicDescription",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private TopicDescription topicDescription;

    /**
     * Get the type property: Type of content in topic response.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of content in topic response.
     *
     * @param type the type value to set.
     * @return the TopicDescriptionEntryContent object itself.
     */
    public TopicDescriptionEntryContent setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the topicDescription property: Description of a Service Bus topic resource.
     *
     * @return the topicDescription value.
     */
    public TopicDescription getTopicDescription() {
        return this.topicDescription;
    }

    /**
     * Set the topicDescription property: Description of a Service Bus topic resource.
     *
     * @param topicDescription the topicDescription value to set.
     * @return the TopicDescriptionEntryContent object itself.
     */
    public TopicDescriptionEntryContent setTopicDescription(TopicDescription topicDescription) {
        this.topicDescription = topicDescription;
        return this;
    }
}