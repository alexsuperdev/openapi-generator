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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Model for testing reserved words
 */
@ApiModel(description = "Model for testing reserved words")
@JsonPropertyOrder({
  ModelReturn.JSON_PROPERTY_RETURN
})
@javax.annotation.concurrent.Immutable

public class ModelReturn {
  public static final String JSON_PROPERTY_RETURN = "return";
  private Integer _return;


  public ModelReturn _return(Integer _return) {
    
    this._return = _return;
    return this;
  }

   /**
   * Get _return
   * @return _return
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReturn() {
    return _return;
  }


  public void setReturn(Integer _return) {
    this._return = _return;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelReturn _return = (ModelReturn) o;
    return Objects.equals(this._return, _return._return);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_return);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelReturn {\n");
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
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

