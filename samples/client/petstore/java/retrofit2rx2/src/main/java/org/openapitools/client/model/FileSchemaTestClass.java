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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FileSchemaTestClass
 */

public class FileSchemaTestClass {
  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private java.io.File file;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<java.io.File> files = null;


  public FileSchemaTestClass file(java.io.File file) {
    
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @javax.annotation.Nullable
  @Schema(description = "")

  public java.io.File getFile() {
    return file;
  }


  public void setFile(java.io.File file) {
    this.file = file;
  }


  public FileSchemaTestClass files(List<java.io.File> files) {
    
    this.files = files;
    return this;
  }

  public FileSchemaTestClass addFilesItem(java.io.File filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<java.io.File>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @Schema(description = "")

  public List<java.io.File> getFiles() {
    return files;
  }


  public void setFiles(List<java.io.File> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSchemaTestClass fileSchemaTestClass = (FileSchemaTestClass) o;
    return Objects.equals(this.file, fileSchemaTestClass.file) &&
        Objects.equals(this.files, fileSchemaTestClass.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSchemaTestClass {\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

