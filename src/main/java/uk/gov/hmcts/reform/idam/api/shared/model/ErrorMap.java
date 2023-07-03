package uk.gov.hmcts.reform.idam.api.shared.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorMap
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.592+01:00")

public class ErrorMap   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public ErrorMap code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The error code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The error code")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorMap description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the error
   * @return description
  **/
  @ApiModelProperty(value = "The description of the error")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorMap errorMap = (ErrorMap) o;
    return Objects.equals(this.code, errorMap.code) &&
        Objects.equals(this.description, errorMap.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMap {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

