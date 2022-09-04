package local.example.demo.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

import java.net.URI;
import java.util.Objects;

@ApiModel(description = "contains the new order request information")
public class NewOrder {

  @JsonProperty("customer")
  private URI customer;

  @JsonProperty("address")
  private URI address;

  @JsonProperty("card")
  private URI card;

  @JsonProperty("items")
  private URI items;

  public NewOrder customer(URI customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @ApiModelProperty
  @Valid
  public URI getCustomer() {
    return customer;
  }

  public void setCustomer(URI customer) {
    this.customer = customer;
  }

  public NewOrder address(URI address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty
  @Valid
  public URI getAddress() {
    return address;
  }

  public void setAddress(URI address) {
    this.address = address;
  }

  public NewOrder card(URI card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  */
  @ApiModelProperty
  @Valid
  public URI getCard() {
    return card;
  }

  public void setCard(URI card) {
    this.card = card;
  }

  public NewOrder items(URI items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @ApiModelProperty
  @Valid
  public URI getItems() {
    return items;
  }

  public void setItems(URI items) {
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
    NewOrder newOrder = (NewOrder) o;
    return Objects.equals(this.customer, newOrder.customer) &&
        Objects.equals(this.address, newOrder.address) &&
        Objects.equals(this.card, newOrder.card) &&
        Objects.equals(this.items, newOrder.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, address, card, items);
  }

  @Override
  public String toString() {

    return "class NewOrder {\n" +
            "    customer: " + toIndentedString(customer) + "\n" +
            "    address: " + toIndentedString(address) + "\n" +
            "    card: " + toIndentedString(card) + "\n" +
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
