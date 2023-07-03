package uk.gov.hmcts.reform.idam.api.internal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class ErrorResponse   {
  /**
   * The error code
   */
  public enum CodeEnum {
    ACCOUNT_LOCKED("ACCOUNT_LOCKED"),
    
    ACCOUNT_SUSPENDED("ACCOUNT_SUSPENDED"),
    
    ACCOUNT_LINKED_TO_EXTERNAL_PROVIDER("ACCOUNT_LINKED_TO_EXTERNAL_PROVIDER"),
    
    PASSWORD_BLACKLISTED("PASSWORD_BLACKLISTED"),
    
    PASSWORD_CONTAINS_PERSONAL_INFO("PASSWORD_CONTAINS_PERSONAL_INFO"),
    
    TOKEN_INVALID("TOKEN_INVALID"),
    
    INCORRECT_OTP("INCORRECT_OTP"),
    
    TOO_MANY_ATTEMPTS_OTP("TOO_MANY_ATTEMPTS_OTP"),
    
    INVALID_OTP_SESSION("INVALID_OTP_SESSION"),
    
    STALE_USER_REGISTRATION_SENT("STALE_USER_REGISTRATION_SENT"),
    
    POLICIES_FAIL("POLICIES_FAIL"),
    
    INVALID_SESSION("INVALID_SESSION"),
    
    ERROR("ERROR");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("code")
  private CodeEnum code = null;

  @JsonProperty("info")
  private String info = null;

  public ErrorResponse code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * The error code
   * @return code
  **/
  @ApiModelProperty(value = "The error code")


  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public ErrorResponse info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Extra information about the error
   * @return info
  **/
  @ApiModelProperty(value = "Extra information about the error")


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
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
    return Objects.equals(this.code, errorResponse.code) &&
        Objects.equals(this.info, errorResponse.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

