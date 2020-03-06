/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.Map;
import org.openapitools.model.Order;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.enums.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Validated
@Tag(name = "store", description = "the store API")
public interface StoreApi {

    default StoreApiDelegate getDelegate() {
        return new StoreApiDelegate() {};
    }

    /**
     * DELETE /store/order/{order_id} : Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted (required)
     * @return Invalid ID supplied (status code 400)
     *         or Order not found (status code 404)
     */
    @Operation(summary = "Delete purchase order by ID", description = "For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors",
     tags={ "store", },
    responses  = { 
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"  ) , 
            @ApiResponse(responseCode = "404", description = "Order not found"  )  })
        @RequestMapping(value = "/store/order/{order_id}",
        method = RequestMethod.DELETE)
    default Mono<ResponseEntity<Void>> deleteOrder(@Parameter(in = ParameterIn.PATH,description = "ID of the order that needs to be deleted", required=true) @PathVariable("order_id") String orderId, ServerWebExchange exchange) {
        return getDelegate().deleteOrder(orderId, exchange);
    }


    /**
     * GET /store/inventory : Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * @return successful operation (status code 200)
     */
    @Operation(summary = "Returns pet inventories by status", description = "Returns a map of status codes to quantities",
     tags={ "store", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content( schema = @Schema(implementation = Map.class) )}  )  })
        @RequestMapping(value = "/store/inventory",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<Map<String, Integer>>> getInventory(ServerWebExchange exchange) {
        return getDelegate().getInventory(exchange);
    }


    /**
     * GET /store/order/{order_id} : Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     * @param orderId ID of pet that needs to be fetched (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Order not found (status code 404)
     */
    @Operation(summary = "Find purchase order by ID", description = "For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions",
     tags={ "store", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = Order.class))  )}  ) , 
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"  ) , 
            @ApiResponse(responseCode = "404", description = "Order not found"  )  })
        @RequestMapping(value = "/store/order/{order_id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<Order>> getOrderById(@Min(1L) @Max(5L) @Parameter(in = ParameterIn.PATH,description = "ID of pet that needs to be fetched", required=true) @PathVariable("order_id") Long orderId, ServerWebExchange exchange) {
        return getDelegate().getOrderById(orderId, exchange);
    }


    /**
     * POST /store/order : Place an order for a pet
     *
     * @param body order placed for purchasing the pet (required)
     * @return successful operation (status code 200)
     *         or Invalid Order (status code 400)
     */
    @Operation(summary = "Place an order for a pet", description = "",
     tags={ "store", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = Order.class))  )}  ) , 
            @ApiResponse(responseCode = "400", description = "Invalid Order"  )  })
        @RequestMapping(value = "/store/order",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    default Mono<ResponseEntity<Order>> placeOrder(@Parameter(description = "order placed for purchasing the pet" ,required=true )  @Valid @RequestBody Mono<Order> body, ServerWebExchange exchange) {
        return getDelegate().placeOrder(body, exchange);
    }

}
