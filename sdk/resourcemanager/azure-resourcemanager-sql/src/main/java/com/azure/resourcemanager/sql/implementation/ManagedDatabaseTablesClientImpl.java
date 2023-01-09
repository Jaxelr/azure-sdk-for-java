// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.sql.fluent.ManagedDatabaseTablesClient;
import com.azure.resourcemanager.sql.fluent.models.DatabaseTableInner;
import com.azure.resourcemanager.sql.models.DatabaseTableListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ManagedDatabaseTablesClient. */
public final class ManagedDatabaseTablesClientImpl implements ManagedDatabaseTablesClient {
    /** The proxy service used to perform REST calls. */
    private final ManagedDatabaseTablesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedDatabaseTablesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ManagedDatabaseTablesClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(ManagedDatabaseTablesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientManagedDatabaseTables to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientM")
    private interface ManagedDatabaseTablesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/databases/{databaseName}/schemas/{schemaName}/tables")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseTableListResult>> listBySchema(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("databaseName") String databaseName,
            @PathParam("schemaName") String schemaName,
            @QueryParam("$filter") String filter,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/databases/{databaseName}/schemas/{schemaName}/tables"
                + "/{tableName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseTableInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("databaseName") String databaseName,
            @PathParam("schemaName") String schemaName,
            @PathParam("tableName") String tableName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseTableListResult>> listBySchemaNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List managed database tables.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database tables along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DatabaseTableInner>> listBySchemaSinglePageAsync(
        String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (schemaName == null) {
            return Mono.error(new IllegalArgumentException("Parameter schemaName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listBySchema(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            managedInstanceName,
                            databaseName,
                            schemaName,
                            filter,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<DatabaseTableInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List managed database tables.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database tables along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DatabaseTableInner>> listBySchemaSinglePageAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String filter,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (schemaName == null) {
            return Mono.error(new IllegalArgumentException("Parameter schemaName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listBySchema(
                this.client.getEndpoint(),
                resourceGroupName,
                managedInstanceName,
                databaseName,
                schemaName,
                filter,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * List managed database tables.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database tables as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DatabaseTableInner> listBySchemaAsync(
        String resourceGroupName, String managedInstanceName, String databaseName, String schemaName, String filter) {
        return new PagedFlux<>(
            () -> listBySchemaSinglePageAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, filter),
            nextLink -> listBySchemaNextSinglePageAsync(nextLink));
    }

    /**
     * List managed database tables.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database tables as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DatabaseTableInner> listBySchemaAsync(
        String resourceGroupName, String managedInstanceName, String databaseName, String schemaName) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listBySchemaSinglePageAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, filter),
            nextLink -> listBySchemaNextSinglePageAsync(nextLink));
    }

    /**
     * List managed database tables.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database tables as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DatabaseTableInner> listBySchemaAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String filter,
        Context context) {
        return new PagedFlux<>(
            () ->
                listBySchemaSinglePageAsync(
                    resourceGroupName, managedInstanceName, databaseName, schemaName, filter, context),
            nextLink -> listBySchemaNextSinglePageAsync(nextLink, context));
    }

    /**
     * List managed database tables.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database tables as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DatabaseTableInner> listBySchema(
        String resourceGroupName, String managedInstanceName, String databaseName, String schemaName) {
        final String filter = null;
        return new PagedIterable<>(
            listBySchemaAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, filter));
    }

    /**
     * List managed database tables.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database tables as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DatabaseTableInner> listBySchema(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String filter,
        Context context) {
        return new PagedIterable<>(
            listBySchemaAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, filter, context));
    }

    /**
     * Get managed database table.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database table along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatabaseTableInner>> getWithResponseAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (schemaName == null) {
            return Mono.error(new IllegalArgumentException("Parameter schemaName is required and cannot be null."));
        }
        if (tableName == null) {
            return Mono.error(new IllegalArgumentException("Parameter tableName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            managedInstanceName,
                            databaseName,
                            schemaName,
                            tableName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get managed database table.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database table along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DatabaseTableInner>> getWithResponseAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (schemaName == null) {
            return Mono.error(new IllegalArgumentException("Parameter schemaName is required and cannot be null."));
        }
        if (tableName == null) {
            return Mono.error(new IllegalArgumentException("Parameter tableName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                managedInstanceName,
                databaseName,
                schemaName,
                tableName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Get managed database table.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database table on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseTableInner> getAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get managed database table.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database table along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DatabaseTableInner> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        Context context) {
        return getWithResponseAsync(
                resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, context)
            .block();
    }

    /**
     * Get managed database table.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseTableInner get(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName) {
        return getWithResponse(
                resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, Context.NONE)
            .getValue();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database tables along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DatabaseTableInner>> listBySchemaNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listBySchemaNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DatabaseTableInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database tables along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DatabaseTableInner>> listBySchemaNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listBySchemaNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}