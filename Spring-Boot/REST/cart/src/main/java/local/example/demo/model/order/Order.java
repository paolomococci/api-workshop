package local.example.demo.model.order;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import local.example.demo.model.address.Address;
import local.example.demo.model.card.Card;
import local.example.demo.model.item.Item;
import local.example.demo.model.payment.Payment;
import local.example.demo.model.shipping.Shipment;
import local.example.demo.model.user.User;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "represents an order")
public class Order {
  
  @JsonProperty("id")
  private String id;

  @JsonProperty("customer")
  private User customer;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("card")
  private Card card;

  @JsonProperty("date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime date;

  @JsonProperty("items")
  @Valid
  private List<Item> items = null;

  @JsonProperty("total")
  private Double total;

  @JsonProperty("payment")
  private Payment payment;

  @JsonProperty("shipment")
  private Shipment shipment;

  /**
   * order status
   */
  public enum StatusEnum {
    CREATED("CREATED"),
    
    PAID("PAID"),
    
    SHIPPED("SHIPPED"),
    
    PAYMENT_FAILED("PAYMENT_FAILED"),
    
    SHIPMENT_FAILED("SHIPMENT_FAILED"),
    
    COMPLETED("COMPLETED");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public Order id(String id) {
    this.id = id;
    return this;
  }

  /**
   * order identifier
   * @return id
  */
  @ApiModelProperty(value = "order identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order customer(User customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @ApiModelProperty
  @Valid
  public User getCustomer() {
    return customer;
  }

  public void setCustomer(User customer) {
    this.customer = customer;
  }

  public Order address(Address address) {
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

  public Order card(Card card) {
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

  public Order date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * order's data and time details
   * @return date
  */
  @ApiModelProperty(value = "order's data and time details")
  @Valid
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Order items(List<Item> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * collection of order items
   * @return items
  */
  @ApiModelProperty(value = "collection of order items")
  @Valid
  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public Order total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * order total
   * @return total
  */
  @ApiModelProperty(value = "order total")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public Order payment(Payment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @ApiModelProperty
  @Valid
  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public Order shipment(Shipment shipment) {
    this.shipment = shipment;
    return this;
  }

  /**
   * Get shipment
   * @return shipment
  */
  @ApiModelProperty
  @Valid
  public Shipment getShipment() {
    return shipment;
  }

  public void setShipment(Shipment shipment) {
    this.shipment = shipment;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * order status
   * @return status
  */
  @ApiModelProperty(value = "order status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.customer, order.customer) &&
        Objects.equals(this.address, order.address) &&
        Objects.equals(this.card, order.card) &&
        Objects.equals(this.date, order.date) &&
        Objects.equals(this.items, order.items) &&
        Objects.equals(this.total, order.total) &&
        Objects.equals(this.payment, order.payment) &&
        Objects.equals(this.shipment, order.shipment) &&
        Objects.equals(this.status, order.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, address, card, date, items, total, payment, shipment, status);
  }

  @Override
  public String toString() {

    return "class Order {\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    customer: " + toIndentedString(customer) + "\n" +
            "    address: " + toIndentedString(address) + "\n" +
            "    card: " + toIndentedString(card) + "\n" +
            "    date: " + toIndentedString(date) + "\n" +
            "    items: " + toIndentedString(items) + "\n" +
            "    total: " + toIndentedString(total) + "\n" +
            "    payment: " + toIndentedString(payment) + "\n" +
            "    shipment: " + toIndentedString(shipment) + "\n" +
            "    status: " + toIndentedString(status) + "\n" +
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
