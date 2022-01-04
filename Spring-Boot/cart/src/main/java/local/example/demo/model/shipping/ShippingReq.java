package local.example.demo.model.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import local.example.demo.model.address.Address;

import javax.validation.Valid;

import java.util.Objects;

@ApiModel(description = "contains information required for Shipping request")
public class ShippingReq {

  @JsonProperty("orderId")
  private String orderId;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("itemCount")
  private Integer itemCount;

  public ShippingReq orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * order identifier
   * @return orderId
  */
  @ApiModelProperty(value = "order identifier")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public ShippingReq address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty
  @Valid
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ShippingReq itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * the number of items in the order
   * @return itemCount
  */
  @ApiModelProperty(value = "the number of items in the order")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingReq shippingReq = (ShippingReq) o;
    return Objects.equals(this.orderId, shippingReq.orderId) &&
        Objects.equals(this.address, shippingReq.address) &&
        Objects.equals(this.itemCount, shippingReq.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, address, itemCount);
  }

  @Override
  public String toString() {

    return "class ShippingReq {\n" +
            "    orderId: " + toIndentedString(orderId) + "\n" +
            "    address: " + toIndentedString(address) + "\n" +
            "    itemCount: " + toIndentedString(itemCount) + "\n" +
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
