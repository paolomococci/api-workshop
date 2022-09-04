package local.example.demo.model.item;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "items in shopping cart")
public class Item {

  @JsonProperty("id")
  private String id;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("unitPrice")
  private Double unitPrice;

  public Item id(String id) {
    this.id = id;
    return this;
  }

  /**
   * item identifier
   * @return id
  */
  @ApiModelProperty(value = "item identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Item quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * the item quantity
   * @return quantity
  */
  @ApiModelProperty(value = "the item quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Item unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * the item's price per unit
   * @return unitPrice
  */
  @ApiModelProperty(value = "the item's price per unit")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.quantity, item.quantity) &&
        Objects.equals(this.unitPrice, item.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, unitPrice);
  }

  @Override
  public String toString() {

    return "class Item {\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    quantity: " + toIndentedString(quantity) + "\n" +
            "    unitPrice: " + toIndentedString(unitPrice) + "\n" +
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
