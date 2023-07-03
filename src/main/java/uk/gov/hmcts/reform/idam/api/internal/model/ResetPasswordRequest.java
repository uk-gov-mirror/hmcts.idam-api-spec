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
 * ResetPasswordRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class ResetPasswordRequest   {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("code")
  private String code = null;

  public ResetPasswordRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * New password for the user
   * @return password
  **/
  @ApiModelProperty(value = "New password for the user")

@Size(min=8,max=256) 
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ResetPasswordRequest token(String token) {
    this.token = token;
    return this;
  }

  /**
   * JWT from the validation email
   * @return token
  **/
  @ApiModelProperty(value = "JWT from the validation email")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ResetPasswordRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code from the validation email
   * @return code
  **/
  @ApiModelProperty(value = "Code from the validation email")


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
    ResetPasswordRequest resetPasswordRequest = (ResetPasswordRequest) o;
    return Objects.equals(this.password, resetPasswordRequest.password) &&
        Objects.equals(this.token, resetPasswordRequest.token) &&
        Objects.equals(this.code, resetPasswordRequest.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, token, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordRequest {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

