package uk.gov.hmcts.reform.idam.api.internal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ActivateRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class ActivateByIdRequest {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("password")
  private String password = null;

  public ActivateByIdRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Unique string provided in the activation email
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Unique string provided in the activation email")
  @NotNull
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ActivateByIdRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password supplied by the user which will be set on his account
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password supplied by the user which will be set on his account")
  @NotNull
  @Size(min=8,max=256)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivateByIdRequest activateRequest = (ActivateByIdRequest) o;
    return Objects.equals(this.code, activateRequest.code) &&
        Objects.equals(this.password, activateRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivateRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
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

