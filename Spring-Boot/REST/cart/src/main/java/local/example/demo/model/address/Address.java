package local.example.demo.model.address;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class Address {

  @JsonProperty("number")
  private String number;

  @JsonProperty("residency")
  private String residency;

  @JsonProperty("street")
  private String street;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("country")
  private String country;

  @JsonProperty("pincode")
  private String pincode;

  public Address number(String number) {
    this.number = number;
    return this;
  }

  /**
   * house of flat number
   * @return number
  */
  @ApiModelProperty(value = "house of flat number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Address residency(String residency) {
    this.residency = residency;
    return this;
  }

  /**
   * socieity or building name
   * @return residency
  */
  @ApiModelProperty(value = "society or building name")
  public String getResidency() {
    return residency;
  }

  public void setResidency(String residency) {
    this.residency = residency;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

  /**
   * street name
   * @return street
  */
  @ApiModelProperty(value = "street name")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * city name
   * @return city
  */
  @ApiModelProperty(value = "city name")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

  /**
   * state name
   * @return state
  */
  @ApiModelProperty(value = "state name")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * country name
   * @return country
  */
  @ApiModelProperty(value = "country name")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address pincode(String pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * postal code
   * @return pincode
  */
  @ApiModelProperty(value = "postal code")
  public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.number, address.number) &&
        Objects.equals(this.residency, address.residency) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.pincode, address.pincode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, residency, street, city, state, country, pincode);
  }

  @Override
  public String toString() {

    return "class Address {\n" +
            "    number: " + toIndentedString(number) + "\n" +
            "    residency: " + toIndentedString(residency) + "\n" +
            "    street: " + toIndentedString(street) + "\n" +
            "    city: " + toIndentedString(city) + "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    country: " + toIndentedString(country) + "\n" +
            "    pincode: " + toIndentedString(pincode) + "\n" +
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
