package local.example.demo.model.cart;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import local.example.demo.model.item.Item;

import javax.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "shopping cart of the user")
public class Cart {

  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("items")
  @Valid
  private List<Item> items = null;

  public Cart customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * ID of the customer who possesses the cart
   * @return customerId
  */
  @ApiModelProperty(value = "ID of the customer who possesses the cart")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Cart items(List<Item> items) {
    this.items = items;
    return this;
  }

  public Cart addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * collection of items in cart
   * @return items
  */
  @ApiModelProperty(value = "collection of items in cart")
  @Valid
  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cart cart = (Cart) o;
    return Objects.equals(this.customerId, cart.customerId) &&
        Objects.equals(this.items, cart.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, items);
  }

  @Override
  public String toString() {

    return "class Cart {\n" +
            "    customerId: " + toIndentedString(customerId) + "\n" +
            "    items: " + toIndentedString(items) + "\n" +
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
