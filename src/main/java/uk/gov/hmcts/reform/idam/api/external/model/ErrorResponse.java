package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:49.793+01:00")

public class ErrorResponse   {
  @JsonProperty("error")
  private String error = null;

  @JsonProperty("error_description")
  private String errorDescription = null;

  public ErrorResponse error(String error) {
    this.error = error;
    return this;
  }

  /**
   * A one word error code
   * @return error
  **/
  @ApiModelProperty(required = true, value = "A one word error code")
  @NotNull


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ErrorResponse errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Human-readable ASCII encoded text description of the error
   * @return errorDescription
  **/
  @ApiModelProperty(value = "Human-readable ASCII encoded text description of the error")


  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.error, errorResponse.error) &&
        Objects.equals(this.errorDescription, errorResponse.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

