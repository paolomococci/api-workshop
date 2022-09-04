package local.example.demo.model.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import local.example.demo.model.address.Address;
import local.example.demo.model.card.Card;
import local.example.demo.model.customer.CustomerInfoOnCard;

import javax.validation.Valid;

@ApiModel(description = "contains the payment request information")
public class PaymentReq {

  @JsonProperty("orderId")
  private String orderId;

  @JsonProperty("customer")
  private CustomerInfoOnCard customer;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("card")
  private Card card;

  @JsonProperty("amount")
  private Double amount;

  public PaymentReq orderId(String orderId) {
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

  public PaymentReq customer(CustomerInfoOnCard customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @ApiModelProperty
  @Valid
  public CustomerInfoOnCard getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerInfoOnCard customer) {
    this.customer = customer;
  }

  public PaymentReq address(Address address) {
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

  public PaymentReq card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  */
  @ApiModelProperty
  @Valid
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public PaymentReq amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * payment amount
   * @return amount
  */
  @ApiModelProperty(value = "payment amount")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentReq paymentReq = (PaymentReq) o;
    return Objects.equals(this.orderId, paymentReq.orderId) &&
        Objects.equals(this.customer, paymentReq.customer) &&
        Objects.equals(this.address, paymentReq.address) &&
        Objects.equals(this.card, paymentReq.card) &&
        Objects.equals(this.amount, paymentReq.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, customer, address, card, amount);
  }

  @Override
  public String toString() {

    return "class PaymentReq {\n" +
            "    orderId: " + toIndentedString(orderId) + "\n" +
            "    customer: " + toIndentedString(customer) + "\n" +
            "    address: " + toIndentedString(address) + "\n" +
            "    card: " + toIndentedString(card) + "\n" +
            "    amount: " + toIndentedString(amount) + "\n" +
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
