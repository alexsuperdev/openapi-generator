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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Category;
import org.openapitools.client.model.Tag;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Pet
 */

public class Pet implements Parcelable {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private Category category;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHOTO_URLS = "photoUrls";
  @SerializedName(SERIALIZED_NAME_PHOTO_URLS)
  private List<String> photoUrls = new ArrayList<String>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;

  /**
   * pet status in the store
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AVAILABLE("available"),
    
    PENDING("pending"),
    
    SOLD("sold");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public Pet() {
  }

  public Pet id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Pet category(Category category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Category getCategory() {
    return category;
  }


  public void setCategory(Category category) {
    this.category = category;
  }


  public Pet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "doggie", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Pet photoUrls(List<String> photoUrls) {
    
    this.photoUrls = photoUrls;
    return this;
  }

  public Pet addPhotoUrlsItem(String photoUrlsItem) {
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

   /**
   * Get photoUrls
   * @return photoUrls
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getPhotoUrls() {
    return photoUrls;
  }


  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }


  public Pet tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public Pet addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Tag> getTags() {
    return tags;
  }


  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  public Pet status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * pet status in the store
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "pet status in the store")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pet pet = (Pet) o;
    return Objects.equals(this.id, pet.id) &&
        Objects.equals(this.category, pet.category) &&
        Objects.equals(this.name, pet.name) &&
        Objects.equals(this.photoUrls, pet.photoUrls) &&
        Objects.equals(this.tags, pet.tags) &&
        Objects.equals(this.status, pet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, name, photoUrls, tags, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(id);
    out.writeValue(category);
    out.writeValue(name);
    out.writeValue(photoUrls);
    out.writeValue(tags);
    out.writeValue(status);
  }

  Pet(Parcel in) {
    id = (Long)in.readValue(null);
    category = (Category)in.readValue(Category.class.getClassLoader());
    name = (String)in.readValue(null);
    photoUrls = (List<String>)in.readValue(null);
    tags = (List<Tag>)in.readValue(Tag.class.getClassLoader());
    status = (StatusEnum)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Pet> CREATOR = new Parcelable.Creator<Pet>() {
    public Pet createFromParcel(Parcel in) {
      return new Pet(in);
    }
    public Pet[] newArray(int size) {
      return new Pet[size];
    }
  };
}

