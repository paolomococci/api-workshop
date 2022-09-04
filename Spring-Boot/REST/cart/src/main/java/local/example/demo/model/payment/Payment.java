package local.example.demo.model.payment;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Payment {

  @JsonProperty("authorized")
  private Boolean authorized;

  @JsonProperty("message")
  private String message;

  public Payment authorized(Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

  /**
   * flag that specified whether payment is authorized or not
   * @return authorized
  */
  @ApiModelProperty(value = "flag that specified whether payment is authorized or not")
  public Boolean getAuthorized() {
    return authorized;
  }

  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  public Payment message(String message) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.authorized, payment.authorized) &&
        Objects.equals(this.message, payment.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorized, message);
  }

  @Override
  public String toString() {

    return "class Payment {\n" +
            "    authorized: " + toIndentedString(authorized) + "\n" +
            "    message: " + toIndentedString(message) + "\n" +
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
