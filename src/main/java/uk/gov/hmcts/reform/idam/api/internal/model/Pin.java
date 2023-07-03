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
 * Pin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class Pin   {
  @JsonProperty("pin")
  private String pin = null;

  @JsonProperty("expiry")
  private String expiry = null;

  @JsonProperty("userId")
  private String userId = null;

  public Pin pin(String pin) {
    this.pin = pin;
    return this;
  }

  /**
   * The PIN
   * @return pin
  **/
  @ApiModelProperty(value = "The PIN")


  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public Pin expiry(String expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * The expiry date
   * @return expiry
  **/
  @ApiModelProperty(required = true, value = "The expiry date")
  @NotNull


  public String getExpiry() {
    return expiry;
  }

  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  public Pin userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * user id of the user
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "user id of the user")
  @NotNull


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pin pin = (Pin) o;
    return Objects.equals(this.pin, pin.pin) &&
        Objects.equals(this.expiry, pin.expiry) &&
        Objects.equals(this.userId, pin.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pin, expiry, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pin {\n");
    
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

