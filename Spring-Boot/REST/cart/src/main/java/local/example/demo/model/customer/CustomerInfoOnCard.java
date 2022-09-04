package local.example.demo.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "customer information required for payment processing")
public class CustomerInfoOnCard {

  @JsonProperty("name")
  private String name;

  @JsonProperty("surname")
  private String surname;

  public CustomerInfoOnCard name(String name) {
    this.name = name;
    return this;
  }

  /**
   * customer name
   * @return name
  */
  @ApiModelProperty(value = "customer name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerInfoOnCard surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * customer surname
   * @return surname
  */
  @ApiModelProperty(value = "customer surname")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInfoOnCard customerInfoOnCard = (CustomerInfoOnCard) o;
    return Objects.equals(this.name, customerInfoOnCard.name) &&
        Objects.equals(this.surname, customerInfoOnCard.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname);
  }

  @Override
  public String toString() {

    return "class CustomerInfoOnCard {\n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    surname: " + toIndentedString(surname) + "\n" +
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
