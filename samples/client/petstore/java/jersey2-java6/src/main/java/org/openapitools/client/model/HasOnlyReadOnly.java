/*
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


package org.openapitools.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.commons.lang3.ObjectUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * HasOnlyReadOnly
 */
@JsonPropertyOrder({
  HasOnlyReadOnly.JSON_PROPERTY_BAR,
  HasOnlyReadOnly.JSON_PROPERTY_FOO
})

public class HasOnlyReadOnly {
  public static final String JSON_PROPERTY_BAR = "bar";
  private String bar;

  public static final String JSON_PROPERTY_FOO = "foo";
  private String foo;


   /**
   * Get bar
   * @return bar
  **/
  @javax.annotation.Nullable
  @Schema(description = "")
  @JsonProperty(JSON_PROPERTY_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBar() {
    return bar;
  }




   /**
   * Get foo
   * @return foo
  **/
  @javax.annotation.Nullable
  @Schema(description = "")
  @JsonProperty(JSON_PROPERTY_FOO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFoo() {
    return foo;
  }




  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    HasOnlyReadOnly hasOnlyReadOnly = (HasOnlyReadOnly) o;
    return ObjectUtils.equals(this.bar, hasOnlyReadOnly.bar) &&
    ObjectUtils.equals(this.foo, hasOnlyReadOnly.foo);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(bar, foo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HasOnlyReadOnly {\n");
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

