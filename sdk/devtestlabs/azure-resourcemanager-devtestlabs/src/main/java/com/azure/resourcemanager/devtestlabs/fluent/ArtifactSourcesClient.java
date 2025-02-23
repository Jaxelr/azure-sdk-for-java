// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArtifactSourceInner;
import com.azure.resourcemanager.devtestlabs.models.ArtifactSourceFragment;

/**
 * An instance of this class provides access to all the operations defined in ArtifactSourcesClient.
 */
public interface ArtifactSourcesClient {
    /**
     * List artifact sources in a given lab.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ArtifactSourceInner> list(String resourceGroupName, String labName);

    /**
     * List artifact sources in a given lab.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param expand Specify the $expand query. Example: 'properties($select=displayName)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ArtifactSourceInner> list(String resourceGroupName, String labName, String expand, String filter,
        Integer top, String orderby, Context context);

    /**
     * Get artifact source.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the artifact source.
     * @param expand Specify the $expand query. Example: 'properties($select=displayName)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return artifact source along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ArtifactSourceInner> getWithResponse(String resourceGroupName, String labName, String name, String expand,
        Context context);

    /**
     * Get artifact source.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return artifact source.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ArtifactSourceInner get(String resourceGroupName, String labName, String name);

    /**
     * Create or replace an existing artifact source.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the artifact source.
     * @param artifactSource Properties of an artifact source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an artifact source along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ArtifactSourceInner> createOrUpdateWithResponse(String resourceGroupName, String labName, String name,
        ArtifactSourceInner artifactSource, Context context);

    /**
     * Create or replace an existing artifact source.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the artifact source.
     * @param artifactSource Properties of an artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an artifact source.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ArtifactSourceInner createOrUpdate(String resourceGroupName, String labName, String name,
        ArtifactSourceInner artifactSource);

    /**
     * Delete artifact source.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the artifact source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String labName, String name, Context context);

    /**
     * Delete artifact source.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labName, String name);

    /**
     * Allows modifying tags of artifact sources. All other properties will be ignored.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the artifact source.
     * @param artifactSource Properties of an artifact source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an artifact source along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ArtifactSourceInner> updateWithResponse(String resourceGroupName, String labName, String name,
        ArtifactSourceFragment artifactSource, Context context);

    /**
     * Allows modifying tags of artifact sources. All other properties will be ignored.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the artifact source.
     * @param artifactSource Properties of an artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an artifact source.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ArtifactSourceInner update(String resourceGroupName, String labName, String name,
        ArtifactSourceFragment artifactSource);
}
