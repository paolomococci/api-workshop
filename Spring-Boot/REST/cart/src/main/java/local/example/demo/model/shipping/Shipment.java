package local.example.demo.model.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;

import java.time.LocalDate;
import java.util.Objects;

public class Shipment {

  @JsonProperty("orderId")
  private String orderId;

  @JsonProperty("carrier")
  private String carrier;

  @JsonProperty("trackingNumber")
  private String trackingNumber;

  @JsonProperty("estDeliveryDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate estDeliveryDate;

  public Shipment orderId(String orderId) {
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

  public Shipment carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * shipping carrier
   * @return carrier
  */
  @ApiModelProperty(value = "shipping carrier")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public Shipment trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  /**
   * shipping tracking number
   * @return trackingNumber
  */
  @ApiModelProperty(value = "shipping tracking number")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public Shipment estDeliveryDate(LocalDate estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
    return this;
  }

  /**
   * estimated delivery date
   * @return estDeliveryDate
  */
  @ApiModelProperty(value = "estimated delivery date")
  @Valid
  public LocalDate getEstDeliveryDate() {
    return estDeliveryDate;
  }

  public void setEstDeliveryDate(LocalDate estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.orderId, shipment.orderId) &&
        Objects.equals(this.carrier, shipment.carrier) &&
        Objects.equals(this.trackingNumber, shipment.trackingNumber) &&
        Objects.equals(this.estDeliveryDate, shipment.estDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, carrier, trackingNumber, estDeliveryDate);
  }

  @Override
  public String toString() {

    return "class Shipment {\n" +
            "    orderId: " + toIndentedString(orderId) + "\n" +
            "    carrier: " + toIndentedString(carrier) + "\n" +
            "    trackingNumber: " + toIndentedString(trackingNumber) + "\n" +
            "    estDeliveryDate: " + toIndentedString(estDeliveryDate) + "\n" +
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
