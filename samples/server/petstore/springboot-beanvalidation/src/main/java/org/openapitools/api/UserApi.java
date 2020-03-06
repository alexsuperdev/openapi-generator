/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.List;
import org.openapitools.model.User;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.enums.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Validated
@Tag(name = "user", description = "the user API")
public interface UserApi {

    /**
     * POST /user : Create user
     * This can only be done by the logged in user.
     *
     * @param body Created user object (required)
     * @return successful operation (status code 200)
     */
    @Operation(summary = "Create user", description = "This can only be done by the logged in user.",
     tags={ "user", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation"  )  })
        @RequestMapping(value = "/user",
        method = RequestMethod.POST)
    ResponseEntity<Void> createUser(@Parameter(description = "Created user object" ,required=true )  @Valid @RequestBody User body);


    /**
     * POST /user/createWithArray : Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return successful operation (status code 200)
     */
    @Operation(summary = "Creates list of users with given input array", description = "",
     tags={ "user", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation"  )  })
        @RequestMapping(value = "/user/createWithArray",
        method = RequestMethod.POST)
    ResponseEntity<Void> createUsersWithArrayInput(@Parameter(description = "List of user object" ,required=true )  @Valid @RequestBody List<User> body);


    /**
     * POST /user/createWithList : Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return successful operation (status code 200)
     */
    @Operation(summary = "Creates list of users with given input array", description = "",
     tags={ "user", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation"  )  })
        @RequestMapping(value = "/user/createWithList",
        method = RequestMethod.POST)
    ResponseEntity<Void> createUsersWithListInput(@Parameter(description = "List of user object" ,required=true )  @Valid @RequestBody List<User> body);


    /**
     * DELETE /user/{username} : Delete user
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(summary = "Delete user", description = "This can only be done by the logged in user.",
     tags={ "user", },
    responses  = { 
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"  ) , 
            @ApiResponse(responseCode = "404", description = "User not found"  )  })
        @RequestMapping(value = "/user/{username}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@Parameter(in = ParameterIn.PATH,description = "The name that needs to be deleted", required=true) @PathVariable("username") String username);


    /**
     * GET /user/{username} : Get user by user name
     *
     * @param username The name that needs to be fetched. Use user1 for testing. (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(summary = "Get user by user name", description = "",
     tags={ "user", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = User.class))  )}  ) , 
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"  ) , 
            @ApiResponse(responseCode = "404", description = "User not found"  )  })
        @RequestMapping(value = "/user/{username}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUserByName(@Parameter(in = ParameterIn.PATH,description = "The name that needs to be fetched. Use user1 for testing.", required=true) @PathVariable("username") String username);


    /**
     * GET /user/login : Logs user into the system
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     */
    @Operation(summary = "Logs user into the system", description = "",
     tags={ "user", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation" , content = { @Content(  array = @ArraySchema(schema = @Schema(implementation = String.class))  )}  ) , 
            @ApiResponse(responseCode = "400", description = "Invalid username/password supplied"  )  })
        @RequestMapping(value = "/user/login",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> loginUser(@NotNull @Parameter(schema = @Schema( description = "The user name for login", required = true)) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @Parameter(schema = @Schema( description = "The password for login in clear text", required = true)) @Valid @RequestParam(value = "password", required = true) String password);


    /**
     * GET /user/logout : Logs out current logged in user session
     *
     * @return successful operation (status code 200)
     */
    @Operation(summary = "Logs out current logged in user session", description = "",
     tags={ "user", },
    responses  = { 
            @ApiResponse(responseCode = "200", description = "successful operation"  )  })
        @RequestMapping(value = "/user/logout",
        method = RequestMethod.GET)
    ResponseEntity<Void> logoutUser();


    /**
     * PUT /user/{username} : Updated user
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param body Updated user object (required)
     * @return Invalid user supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(summary = "Updated user", description = "This can only be done by the logged in user.",
     tags={ "user", },
    responses  = { 
            @ApiResponse(responseCode = "400", description = "Invalid user supplied"  ) , 
            @ApiResponse(responseCode = "404", description = "User not found"  )  })
        @RequestMapping(value = "/user/{username}",
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.PATH,description = "name that need to be deleted", required=true) @PathVariable("username") String username,@Parameter(description = "Updated user object" ,required=true )  @Valid @RequestBody User body);

}
