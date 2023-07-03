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
 * ValidateJWT
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class ValidateJWT   {
  @JsonProperty("valid")
  private Boolean valid = null;

  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("realm")
  private String realm = null;

  public ValidateJWT valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Returns if the token is valid?
   * @return valid
  **/
  @ApiModelProperty(value = "Returns if the token is valid?")


  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ValidateJWT uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * user id
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "user id")
  @NotNull


  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public ValidateJWT realm(String realm) {
    this.realm = realm;
    return this;
  }

  /**
   * realm
   * @return realm
  **/
  @ApiModelProperty(value = "realm")


  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateJWT validateJWT = (ValidateJWT) o;
    return Objects.equals(this.valid, validateJWT.valid) &&
        Objects.equals(this.uid, validateJWT.uid) &&
        Objects.equals(this.realm, validateJWT.realm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, uid, realm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateJWT {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
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

