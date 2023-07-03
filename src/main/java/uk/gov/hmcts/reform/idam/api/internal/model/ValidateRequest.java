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
 * ValidateRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class ValidateRequest   {
  @JsonProperty("token")
  private String token = null;

  @JsonProperty("code")
  private String code = null;

  public ValidateRequest token(String token) {
    this.token = token;
    return this;
  }

  /**
   * JWT token provided in the activation email
   * @return token
  **/
  @ApiModelProperty(required = true, value = "JWT token provided in the activation email")
  @NotNull


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ValidateRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Unique string provided inthe activation email
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Unique string provided inthe activation email")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateRequest validateRequest = (ValidateRequest) o;
    return Objects.equals(this.token, validateRequest.token) &&
        Objects.equals(this.code, validateRequest.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateRequest {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

