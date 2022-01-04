package local.example.demo.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@ApiModel(description = "product information")
public class Product {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("imageUrl")
  private String imageUrl;

  @JsonProperty("price")
  private Double price;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("tag")
  @Valid
  private Set<String> tag = null;

  public Product id(String id) {
    this.id = id;
    return this;
  }

  /**
   * product identifier
   * @return id
  */
  @ApiModelProperty(value = "product identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * product Name
   * @return name
  */
  @ApiModelProperty(value = "product Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

  /**
   * prodcut's description
   * @return description
  */
  @ApiModelProperty(value = "product's description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * product image's URL
   * @return imageUrl
  */
  @ApiModelProperty(value = "product image's URL")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Product price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * product price
   * @return price
  */
  @ApiModelProperty(value = "product price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Product count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * product count
   * @return count
  */
  @ApiModelProperty(value = "product count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Product tag(Set<String> tag) {
    this.tag = tag;
    return this;
  }

  public Product addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new LinkedHashSet<>();
    }
    this.tag.add(tagItem);
    return this;
  }

  /**
   * tags associated with the product
   * @return tag
  */
  @ApiModelProperty(value = "tags associated with the product")


  public Set<String> getTag() {
    return tag;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setTag(Set<String> tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.imageUrl, product.imageUrl) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.count, product.count) &&
        Objects.equals(this.tag, product.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, imageUrl, price, count, tag);
  }

  @Override
  public String toString() {

    return "class Product {\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    description: " + toIndentedString(description) + "\n" +
            "    imageUrl: " + toIndentedString(imageUrl) + "\n" +
            "    price: " + toIndentedString(price) + "\n" +
            "    count: " + toIndentedString(count) + "\n" +
            "    tag: " + toIndentedString(tag) + "\n" +
            "}";
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
