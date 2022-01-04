package local.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class Growing {

  @JsonProperty("name")
  private String name;

  @JsonProperty("definition")
  private String definition;

  public Growing name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Growing definition(String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
  */
  @ApiModelProperty
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Growing growing = (Growing) o;
    return Objects.equals(this.name, growing.name) &&
        Objects.equals(this.definition, growing.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, definition);
  }

  @Override
  public String toString() {

    return "class Growing {\n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    definition: " + toIndentedString(definition) + "\n" +
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
