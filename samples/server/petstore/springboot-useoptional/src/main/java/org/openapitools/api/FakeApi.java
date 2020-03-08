/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import org.openapitools.model.FileSchemaTestClass;
import java.time.LocalDate;
import java.util.Map;
import org.openapitools.model.ModelApiResponse;
import java.time.OffsetDateTime;
import org.openapitools.model.OuterComposite;
import org.springframework.core.io.Resource;
import org.openapitools.model.User;
import org.openapitools.model.XmlItem;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.enums.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
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

@Validated
@Tag(name = "fake", description = "the fake API")
public interface FakeApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /fake/create_xml_item : creates an XmlItem
     * this route creates an XmlItem
     *
     * @param xmlItem XmlItem Body (required)
     * @return successful operation (status code 200)
     */
    @Operation(summary = "creates an XmlItem", operationId = "createXmlItem", description = "this route creates an XmlItem",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation"  )  })
    @RequestMapping(value = "/fake/create_xml_item",
        consumes = { "application/xml", "application/xml; charset=utf-8", "application/xml; charset=utf-16", "text/xml", "text/xml; charset=utf-8", "text/xml; charset=utf-16" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createXmlItem(@Parameter(description = "XmlItem Body" ,required=true )  @Valid @RequestBody XmlItem xmlItem) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/outer/boolean
     * Test serialization of outer boolean types
     *
     * @param body Input boolean as post body (optional)
     * @return Output boolean (status code 200)
     */
    @Operation(summary = "", operationId = "fakeOuterBooleanSerialize", description = "Test serialization of outer boolean types",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "Output boolean" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = Boolean.class))  )}  )  })
    @RequestMapping(value = "/fake/outer/boolean",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Boolean> fakeOuterBooleanSerialize(@Parameter(description = "Input boolean as post body"  )  @Valid @RequestBody(required = false) Boolean body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/outer/composite
     * Test serialization of object with outer number type
     *
     * @param body Input composite as post body (optional)
     * @return Output composite (status code 200)
     */
    @Operation(summary = "", operationId = "fakeOuterCompositeSerialize", description = "Test serialization of object with outer number type",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "Output composite" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = OuterComposite.class))  )}  )  })
    @RequestMapping(value = "/fake/outer/composite",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    default ResponseEntity<OuterComposite> fakeOuterCompositeSerialize(@Parameter(description = "Input composite as post body"  )  @Valid @RequestBody(required = false) OuterComposite body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"my_string\" : \"my_string\", \"my_number\" : 0.8008281904610115, \"my_boolean\" : true }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/outer/number
     * Test serialization of outer number types
     *
     * @param body Input number as post body (optional)
     * @return Output number (status code 200)
     */
    @Operation(summary = "", operationId = "fakeOuterNumberSerialize", description = "Test serialization of outer number types",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "Output number" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = BigDecimal.class))  )}  )  })
    @RequestMapping(value = "/fake/outer/number",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    default ResponseEntity<BigDecimal> fakeOuterNumberSerialize(@Parameter(description = "Input number as post body"  )  @Valid @RequestBody(required = false) BigDecimal body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/outer/string
     * Test serialization of outer string types
     *
     * @param body Input string as post body (optional)
     * @return Output string (status code 200)
     */
    @Operation(summary = "", operationId = "fakeOuterStringSerialize", description = "Test serialization of outer string types",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "Output string" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = String.class))  )}  )  })
    @RequestMapping(value = "/fake/outer/string",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    default ResponseEntity<String> fakeOuterStringSerialize(@Parameter(description = "Input string as post body"  )  @Valid @RequestBody(required = false) String body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /fake/body-with-file-schema
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     *
     * @param body  (required)
     * @return Success (status code 200)
     */
    @Operation(summary = "", operationId = "testBodyWithFileSchema", description = "For this test, the body for this request much reference a schema named `File`.",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "Success"  )  })
    @RequestMapping(value = "/fake/body-with-file-schema",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> testBodyWithFileSchema(@Parameter(description = "" ,required=true )  @Valid @RequestBody FileSchemaTestClass body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /fake/body-with-query-params
     *
     * @param query  (required)
     * @param body  (required)
     * @return Success (status code 200)
     */
    @Operation(summary = "", operationId = "testBodyWithQueryParams", description = "",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "Success"  )  })
    @RequestMapping(value = "/fake/body-with-query-params",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> testBodyWithQueryParams(@NotNull @Parameter(schema = @Schema( description = "", required = true)) @Valid @RequestParam(value = "query", required = true) String query,@Parameter(description = "" ,required=true )  @Valid @RequestBody User body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /fake : To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     *
     * @param body client model (required)
     * @return successful operation (status code 200)
     */
    @Operation(summary = "To test \"client\" model", operationId = "testClientModel", description = "To test \"client\" model",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = Client.class))  )}  )  })
    @RequestMapping(value = "/fake",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<Client> testClientModel(@Parameter(description = "client model" ,required=true )  @Valid @RequestBody Client body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"client\" : \"client\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake : Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     *
     * @param number None (required)
     * @param _double None (required)
     * @param patternWithoutDelimiter None (required)
     * @param _byte None (required)
     * @param integer None (optional)
     * @param int32 None (optional)
     * @param int64 None (optional)
     * @param _float None (optional)
     * @param string None (optional)
     * @param binary None (optional)
     * @param date None (optional)
     * @param dateTime None (optional)
     * @param password None (optional)
     * @param paramCallback None (optional)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(summary = "Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트", operationId = "testEndpointParameters", description = "Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트",
     tags={ "fake", },
      security = @SecurityRequirement(name = "http_basic_test"),
    responses  = { 
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"  ) , 
            @ApiResponse(responseCode = "404", description = "User not found"  )  })
    @RequestMapping(value = "/fake",
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> testEndpointParameters(@Parameter(description = "None",required=true) @RequestPart(value="number", required=true)  BigDecimal number,@Parameter(description = "None",required=true) @RequestPart(value="double", required=true)  Double _double,@Parameter(description = "None",required=true) @RequestPart(value="pattern_without_delimiter", required=true)  String patternWithoutDelimiter,@Parameter(description = "None",required=true) @RequestPart(value="byte", required=true)  byte[] _byte,@Parameter(description = "None") @RequestPart(value="integer", required=false)  Integer integer,@Parameter(description = "None") @RequestPart(value="int32", required=false)  Integer int32,@Parameter(description = "None") @RequestPart(value="int64", required=false)  Long int64,@Parameter(description = "None") @RequestPart(value="float", required=false)  Float _float,@Parameter(description = "None") @RequestPart(value="string", required=false)  String string,@Parameter(description = "None") @Valid @RequestPart(value = "binary") MultipartFile binary,@Parameter(description = "None") @RequestPart(value="date", required=false)  LocalDate date,@Parameter(description = "None") @RequestPart(value="dateTime", required=false)  OffsetDateTime dateTime,@Parameter(description = "None") @RequestPart(value="password", required=false)  String password,@Parameter(description = "None") @RequestPart(value="callback", required=false)  String paramCallback) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /fake : To test enum parameters
     * To test enum parameters
     *
     * @param enumHeaderStringArray Header parameter enum test (string array) (optional, default to new ArrayList&lt;&gt;())
     * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
     * @param enumQueryStringArray Query parameter enum test (string array) (optional, default to new ArrayList&lt;&gt;())
     * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
     * @param enumQueryInteger Query parameter enum test (double) (optional)
     * @param enumQueryDouble Query parameter enum test (double) (optional)
     * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
     * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
     * @return Invalid request (status code 400)
     *         or Not found (status code 404)
     */
    @Operation(summary = "To test enum parameters", operationId = "testEnumParameters", description = "To test enum parameters",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "400", description = "Invalid request"  ) , 
            @ApiResponse(responseCode = "404", description = "Not found"  )  })
    @RequestMapping(value = "/fake",
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    default ResponseEntity<Void> testEnumParameters(@Parameter(in = ParameterIn.HEADER, description = "Header parameter enum test (string array)"  , schema = @Schema(allowableValues={">, $"})) @RequestHeader(value="enum_header_string_array", required=false) Optional<List<String>> enumHeaderStringArray,@Parameter(in = ParameterIn.HEADER, description = "Header parameter enum test (string)"  , schema = @Schema(allowableValues={"_abc, -efg, (xyz)"}, example="-efg")) @RequestHeader(value="enum_header_string", required=false) Optional<String> enumHeaderString,@Parameter(schema = @Schema(allowableValues = {">, $"}, description = "Query parameter enum test (string array)")) @Valid @RequestParam(value = "enum_query_string_array", required = false) Optional<List<String>> enumQueryStringArray,@Parameter(schema = @Schema(allowableValues = {"_abc, -efg, (xyz)"}, description = "Query parameter enum test (string)", example = "-efg")) @Valid @RequestParam(value = "enum_query_string", required = false, defaultValue="-efg") Optional<String> enumQueryString,@Parameter(schema = @Schema(allowableValues = {"1, -2"}, description = "Query parameter enum test (double)")) @Valid @RequestParam(value = "enum_query_integer", required = false) Optional<Integer> enumQueryInteger,@Parameter(schema = @Schema(allowableValues = {"1.1, -1.2"}, description = "Query parameter enum test (double)")) @Valid @RequestParam(value = "enum_query_double", required = false) Optional<Double> enumQueryDouble,@Parameter(description = "Form parameter enum test (string array)",schema = @Schema(allowableValues ={">, $"})) @RequestPart(value="enum_form_string_array", required=false)  List<String> enumFormStringArray,@Parameter(description = "Form parameter enum test (string)",schema = @Schema(allowableValues ={"_abc, -efg, (xyz)"}), example="-efg") @RequestPart(value="enum_form_string", required=false)  String enumFormString) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /fake : Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     *
     * @param requiredStringGroup Required String in group parameters (required)
     * @param requiredBooleanGroup Required Boolean in group parameters (required)
     * @param requiredInt64Group Required Integer in group parameters (required)
     * @param stringGroup String in group parameters (optional)
     * @param booleanGroup Boolean in group parameters (optional)
     * @param int64Group Integer in group parameters (optional)
     * @return Someting wrong (status code 400)
     */
    @Operation(summary = "Fake endpoint to test group parameters (optional)", operationId = "testGroupParameters", description = "Fake endpoint to test group parameters (optional)",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "400", description = "Someting wrong"  )  })
    @RequestMapping(value = "/fake",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> testGroupParameters(@NotNull @Parameter(schema = @Schema( description = "Required String in group parameters", required = true)) @Valid @RequestParam(value = "required_string_group", required = true) Integer requiredStringGroup,@Parameter(in = ParameterIn.HEADER, description = "Required Boolean in group parameters"  ,required=true ) @RequestHeader(value="required_boolean_group", required=true) Boolean requiredBooleanGroup,@NotNull @Parameter(schema = @Schema( description = "Required Integer in group parameters", required = true)) @Valid @RequestParam(value = "required_int64_group", required = true) Long requiredInt64Group,@Parameter(schema = @Schema( description = "String in group parameters")) @Valid @RequestParam(value = "string_group", required = false) Optional<Integer> stringGroup,@Parameter(in = ParameterIn.HEADER, description = "Boolean in group parameters"  ) @RequestHeader(value="boolean_group", required=false) Optional<Boolean> booleanGroup,@Parameter(schema = @Schema( description = "Integer in group parameters")) @Valid @RequestParam(value = "int64_group", required = false) Optional<Long> int64Group) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/inline-additionalProperties : test inline additionalProperties
     *
     * @param param request body (required)
     * @return successful operation (status code 200)
     */
    @Operation(summary = "test inline additionalProperties", operationId = "testInlineAdditionalProperties", description = "",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation"  )  })
    @RequestMapping(value = "/fake/inline-additionalProperties",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> testInlineAdditionalProperties(@Parameter(description = "request body" ,required=true )  @Valid @RequestBody Map<String, String> param) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /fake/jsonFormData : test json serialization of form data
     *
     * @param param field1 (required)
     * @param param2 field2 (required)
     * @return successful operation (status code 200)
     */
    @Operation(summary = "test json serialization of form data", operationId = "testJsonFormData", description = "",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation"  )  })
    @RequestMapping(value = "/fake/jsonFormData",
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    default ResponseEntity<Void> testJsonFormData(@Parameter(description = "field1",required=true) @RequestPart(value="param", required=true)  String param,@Parameter(description = "field2",required=true) @RequestPart(value="param2", required=true)  String param2) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /fake/test-query-paramters
     * To test the collection format in query parameters
     *
     * @param pipe  (required)
     * @param ioutil  (required)
     * @param http  (required)
     * @param url  (required)
     * @param context  (required)
     * @return Success (status code 200)
     */
    @Operation(summary = "", operationId = "testQueryParameterCollectionFormat", description = "To test the collection format in query parameters",
     tags={ "fake", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "Success"  )  })
    @RequestMapping(value = "/fake/test-query-paramters",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> testQueryParameterCollectionFormat(@NotNull @Parameter(schema = @Schema( description = "", required = true)) @Valid @RequestParam(value = "pipe", required = true) List<String> pipe,@NotNull @Parameter(schema = @Schema( description = "", required = true)) @Valid @RequestParam(value = "ioutil", required = true) List<String> ioutil,@NotNull @Parameter(schema = @Schema( description = "", required = true)) @Valid @RequestParam(value = "http", required = true) List<String> http,@NotNull @Parameter(schema = @Schema( description = "", required = true)) @Valid @RequestParam(value = "url", required = true) List<String> url,@NotNull @Parameter(schema = @Schema( description = "", required = true)) @Valid @RequestParam(value = "context", required = true) List<String> context) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/{petId}/uploadImageWithRequiredFile : uploads an image (required)
     *
     * @param petId ID of pet to update (required)
     * @param requiredFile file to upload (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @return successful operation (status code 200)
     */
    @Operation(summary = "uploads an image (required)", operationId = "uploadFileWithRequiredFile", description = "",
     tags={ "pet", },
      security = @SecurityRequirement(name = "petstore_auth", scopes = {
       "write:pets" ,
        "read:pets"  
        }),
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = ModelApiResponse.class))  )}  )  })
    @RequestMapping(value = "/fake/{petId}/uploadImageWithRequiredFile",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    default ResponseEntity<ModelApiResponse> uploadFileWithRequiredFile(@Parameter(in = ParameterIn.PATH,description = "ID of pet to update", required=true) @PathVariable("petId") Long petId,@Parameter(description = "file to upload") @Valid @RequestPart(value = "requiredFile") MultipartFile requiredFile,@Parameter(description = "Additional data to pass to server") @RequestPart(value="additionalMetadata", required=false)  String additionalMetadata) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"type\" : \"type\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
