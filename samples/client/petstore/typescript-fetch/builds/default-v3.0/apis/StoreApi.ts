/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import {
    Order,
    OrderFromJSON,
    OrderToJSON,
} from '../models';

export interface DeleteOrderRequest {
    orderId: string;
}

export interface GetOrderByIdRequest {
    orderId: number;
}

export interface PlaceOrderRequest {
    order: Order;
}

/**
 * 
 */
export class StoreApi extends runtime.BaseAPI {

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors
     * Delete purchase order by ID
     */
    async deleteOrderRaw(requestParameters: DeleteOrderRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.orderId === null || requestParameters.orderId === undefined) {
            throw new runtime.RequiredError('orderId','Required parameter requestParameters.orderId was null or undefined when calling deleteOrder.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/store/order/{order_id}`.replace(`{${"order_id"}}`, encodeURIComponent(String(requestParameters.orderId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors
     * Delete purchase order by ID
     */
    async deleteOrder(requestParameters: DeleteOrderRequest): Promise<void> {
        await this.deleteOrderRaw(requestParameters);
    }

    /**
     * Returns a map of status codes to quantities
     * Returns pet inventories by status
     */
    async getInventoryRaw(): Promise<runtime.ApiResponse<{ [key: string]: number; }>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["api_key"] = this.configuration.apiKey("api_key"); // api_key authentication
        }

        const response = await this.request({
            path: `/store/inventory`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse<any>(response);
    }

    /**
     * Returns a map of status codes to quantities
     * Returns pet inventories by status
     */
    async getInventory(): Promise<{ [key: string]: number; }> {
        const response = await this.getInventoryRaw();
        return await response.value();
    }

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions
     * Find purchase order by ID
     */
    async getOrderByIdRaw(requestParameters: GetOrderByIdRequest): Promise<runtime.ApiResponse<Order>> {
        if (requestParameters.orderId === null || requestParameters.orderId === undefined) {
            throw new runtime.RequiredError('orderId','Required parameter requestParameters.orderId was null or undefined when calling getOrderById.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/store/order/{order_id}`.replace(`{${"order_id"}}`, encodeURIComponent(String(requestParameters.orderId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => OrderFromJSON(jsonValue));
    }

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions
     * Find purchase order by ID
     */
    async getOrderById(requestParameters: GetOrderByIdRequest): Promise<Order> {
        const response = await this.getOrderByIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Place an order for a pet
     */
    async placeOrderRaw(requestParameters: PlaceOrderRequest): Promise<runtime.ApiResponse<Order>> {
        if (requestParameters.order === null || requestParameters.order === undefined) {
            throw new runtime.RequiredError('order','Required parameter requestParameters.order was null or undefined when calling placeOrder.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/store/order`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: OrderToJSON(requestParameters.order),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => OrderFromJSON(jsonValue));
    }

    /**
     * Place an order for a pet
     */
    async placeOrder(requestParameters: PlaceOrderRequest): Promise<Order> {
        const response = await this.placeOrderRaw(requestParameters);
        return await response.value();
    }

}
