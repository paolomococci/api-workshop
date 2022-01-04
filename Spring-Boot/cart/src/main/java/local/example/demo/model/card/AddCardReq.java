package local.example.demo.model.card;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "request object for new card registration")
public class AddCardReq {

  @JsonProperty("cardNumber")
  private String cardNumber;

  @JsonProperty("expires")
  private String expires;

  @JsonProperty("ccv")
  private String ccv;

  @JsonProperty("userId")
  private Object userId;

  public AddCardReq cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * card number
   * @return cardNumber
  */
  @ApiModelProperty(value = "card number")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public AddCardReq expires(String expires) {
    this.expires = expires;
    return this;
  }

  /**
   * expiration date
   * @return expires
  */
  @ApiModelProperty(value = "expiration date")
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public AddCardReq ccv(String ccv) {
    this.ccv = ccv;
    return this;
  }

  /**
   * ccv code
   * @return ccv
  */
  @ApiModelProperty(value = "ccv code")
  public String getCcv() {
    return ccv;
  }

  public void setCcv(String ccv) {
    this.ccv = ccv;
  }

  public AddCardReq userId(Object userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty
  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCardReq addCardReq = (AddCardReq) o;
    return Objects.equals(this.cardNumber, addCardReq.cardNumber) &&
        Objects.equals(this.expires, addCardReq.expires) &&
        Objects.equals(this.ccv, addCardReq.ccv) &&
        Objects.equals(this.userId, addCardReq.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, expires, ccv, userId);
  }

  @Override
  public String toString() {

    return "class AddCardReq {\n" +
            "    cardNumber: " + toIndentedString(cardNumber) + "\n" +
            "    expires: " + toIndentedString(expires) + "\n" +
            "    ccv: " + toIndentedString(ccv) + "\n" +
            "    userId: " + toIndentedString(userId) + "\n" +
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
