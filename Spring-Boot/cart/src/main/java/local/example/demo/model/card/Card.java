package local.example.demo.model.card;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class Card {

  @JsonProperty("cardNumber")
  private String cardNumber;

  @JsonProperty("expires")
  private String expires;

  @JsonProperty("ccv")
  private String ccv;

  public Card cardNumber(String cardNumber) {
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

  public Card expires(String expires) {
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

  public Card ccv(String ccv) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.cardNumber, card.cardNumber) &&
        Objects.equals(this.expires, card.expires) &&
        Objects.equals(this.ccv, card.ccv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, expires, ccv);
  }

  @Override
  public String toString() {

    return "class Card {\n" +
            "    cardNumber: " + toIndentedString(cardNumber) + "\n" +
            "    expires: " + toIndentedString(expires) + "\n" +
            "    ccv: " + toIndentedString(ccv) + "\n" +
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
