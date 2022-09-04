package local.example.demo.model.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;

import java.time.OffsetDateTime;
import java.util.Objects;

public class Authorization {

  @JsonProperty("orderId")
  private String orderId;

  @JsonProperty("time")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  @JsonProperty("authorized")
  private Boolean authorized;

  @JsonProperty("message")
  private String message;

  @JsonProperty("error")
  private String error;

  public Authorization orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * order identification
   * @return orderId
  */
  @ApiModelProperty(value = "order identification")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Authorization time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * timestamp when this authorization was created
   * @return time
  */
  @ApiModelProperty(value = "timestamp when this authorization was created")
  @Valid
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public Authorization authorized(Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

  /**
   * flat that specify whether the payment is authorized
   * @return authorized
  */
  @ApiModelProperty(value = "flat that specify whether the payment is authorized")
  public Boolean getAuthorized() {
    return authorized;
  }

  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  public Authorization message(String message) {
    this.message = message;
    return this;
  }

  /**
   * approval or rejection message
   * @return message
  */
  @ApiModelProperty(value = "approval or rejection message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Authorization error(String error) {
    this.error = error;
    return this;
  }

  /**
   * processing error description
   * @return error
  */
  @ApiModelProperty(value = "processing error description")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorization authorization = (Authorization) o;
    return Objects.equals(this.orderId, authorization.orderId) &&
        Objects.equals(this.time, authorization.time) &&
        Objects.equals(this.authorized, authorization.authorized) &&
        Objects.equals(this.message, authorization.message) &&
        Objects.equals(this.error, authorization.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, time, authorized, message, error);
  }

  @Override
  public String toString() {

    return "class Authorization {\n" +
            "    orderId: " + toIndentedString(orderId) + "\n" +
            "    time: " + toIndentedString(time) + "\n" +
            "    authorized: " + toIndentedString(authorized) + "\n" +
            "    message: " + toIndentedString(message) + "\n" +
            "    error: " + toIndentedString(error) + "\n" +
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
