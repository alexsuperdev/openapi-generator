/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;
import org.springframework.core.io.Resource;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.enums.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Validated
@Tag(name = "Pet", description = "the Pet API")
public interface PetApi {

    /**
     * POST /pet : Add a new pet to the store
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return Invalid input (status code 405)
     */
    @Operation(summary = "Add a new pet to the store", description = "",
     tags={ "pet", },
    responses  = { 
            @ApiResponse(responseCode = "405", description = "Invalid input"  )  })
        @RequestMapping(value = "/pet",
        consumes = "application/json",
        method = RequestMethod.POST)
    CompletableFuture<ResponseEntity<Void>> addPet(@Parameter(description = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body);


    /**
     * DELETE /pet/{petId} : Deletes a pet
     *
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid pet value (status code 400)
     */
    @Operation(summary = "Deletes a pet", description = "",
     tags={ "pet", },
    responses  = { 
            @ApiResponse(responseCode = "400", description = "Invalid pet value"  )  })
        @RequestMapping(value = "/pet/{petId}",
        method = RequestMethod.DELETE)
    CompletableFuture<ResponseEntity<Void>> deletePet(@Parameter(in = ParameterIn.PATH,description = "Pet id to delete", required=true) @PathVariable("petId") Long petId,@Parameter(in = ParameterIn.HEADER, description = ""  ) @RequestHeader(value="api_key", required=false) String apiKey);


    /**
     * GET /pet/findByStatus : Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (required)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     */
    @Operation(summary = "Finds Pets by status", description = "Multiple status values can be provided with comma separated strings",
     tags={ "pet", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content( schema = @Schema(implementation = Pet.class) )}  ) , 
            @ApiResponse(responseCode = "400", description = "Invalid status value"  )  })
        @RequestMapping(value = "/pet/findByStatus",
        produces = "application/json", 
        method = RequestMethod.GET)
    CompletableFuture<ResponseEntity<List<Pet>>> findPetsByStatus(@NotNull @Parameter(schema = @Schema(allowableValues = {"available, pending, sold"}, description = "Status values that need to be considered for filter", required = true)) @Valid @RequestParam(value = "status", required = true) List<String> status);


    /**
     * GET /pet/findByTags : Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (required)
     * @return successful operation (status code 200)
     *         or Invalid tag value (status code 400)
     * @deprecated
     */
    @Operation(summary = "Finds Pets by tags", description = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.",
     tags={ "pet", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content( schema = @Schema(implementation = Pet.class) )}  ) , 
            @ApiResponse(responseCode = "400", description = "Invalid tag value"  )  })
        @RequestMapping(value = "/pet/findByTags",
        produces = "application/json", 
        method = RequestMethod.GET)
    CompletableFuture<ResponseEntity<List<Pet>>> findPetsByTags(@NotNull @Parameter(schema = @Schema( description = "Tags to filter by", required = true)) @Valid @RequestParam(value = "tags", required = true) List<String> tags);


    /**
     * GET /pet/{petId} : Find pet by ID
     * Returns a single pet
     *
     * @param petId ID of pet to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     */
    @Operation(summary = "Find pet by ID", description = "Returns a single pet",
     tags={ "pet", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = Pet.class))  )}  ) , 
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"  ) , 
            @ApiResponse(responseCode = "404", description = "Pet not found"  )  })
        @RequestMapping(value = "/pet/{petId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    CompletableFuture<ResponseEntity<Pet>> getPetById(@Parameter(in = ParameterIn.PATH,description = "ID of pet to return", required=true) @PathVariable("petId") Long petId);


    /**
     * PUT /pet : Update an existing pet
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(summary = "Update an existing pet", description = "",
     tags={ "pet", },
    responses  = { 
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"  ) , 
            @ApiResponse(responseCode = "404", description = "Pet not found"  ) , 
            @ApiResponse(responseCode = "405", description = "Validation exception"  )  })
        @RequestMapping(value = "/pet",
        consumes = "application/json",
        method = RequestMethod.PUT)
    CompletableFuture<ResponseEntity<Void>> updatePet(@Parameter(description = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body);


    /**
     * POST /pet/{petId} : Updates a pet in the store with form data
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return Invalid input (status code 405)
     */
    @Operation(summary = "Updates a pet in the store with form data", description = "",
     tags={ "pet", },
    responses  = { 
            @ApiResponse(responseCode = "405", description = "Invalid input"  )  })
        @RequestMapping(value = "/pet/{petId}",
        consumes = "application/x-www-form-urlencoded",
        method = RequestMethod.POST)
    CompletableFuture<ResponseEntity<Void>> updatePetWithForm(@Parameter(in = ParameterIn.PATH,description = "ID of pet that needs to be updated", required=true) @PathVariable("petId") Long petId,@Parameter( description = "Updated name of the pet" ) @RequestParam(value="name", required=false)  String name,@Parameter( description = "Updated status of the pet" ) @RequestParam(value="status", required=false)  String status);


    /**
     * POST /pet/{petId}/uploadImage : uploads an image
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return successful operation (status code 200)
     */
    @Operation(summary = "uploads an image", description = "",
     tags={ "pet", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = ModelApiResponse.class))  )}  )  })
        @RequestMapping(value = "/pet/{petId}/uploadImage",
        produces = "application/json", 
        consumes = "multipart/form-data",
        method = RequestMethod.POST)
    CompletableFuture<ResponseEntity<ModelApiResponse>> uploadFile(@Parameter(in = ParameterIn.PATH,description = "ID of pet to update", required=true) @PathVariable("petId") Long petId,@Parameter( description = "Additional data to pass to server" ) @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,@Parameter(description = "file to upload") @RequestParam("file") MultipartFile file);

}
