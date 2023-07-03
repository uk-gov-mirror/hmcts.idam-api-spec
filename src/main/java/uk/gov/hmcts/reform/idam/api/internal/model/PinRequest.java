package uk.gov.hmcts.reform.idam.api.internal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PinRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class PinRequest   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  public PinRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name to be linked to the newly generated PIN
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "First name to be linked to the newly generated PIN")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PinRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name to be linked to the newly generated PIN
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Last name to be linked to the newly generated PIN")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinRequest pinRequest = (PinRequest) o;
    return Objects.equals(this.firstName, pinRequest.firstName) &&
        Objects.equals(this.lastName, pinRequest.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinRequest {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

