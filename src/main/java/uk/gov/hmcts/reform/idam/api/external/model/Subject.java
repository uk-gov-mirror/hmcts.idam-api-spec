package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Holds an object that represents the subject. You can specify one or more of the following keys. If you specify multiple keys, the subject can have multiple associated principals, and you can use subject conditions corresponding to any type in the request
 */
@ApiModel(description = "Holds an object that represents the subject. You can specify one or more of the following keys. If you specify multiple keys, the subject can have multiple associated principals, and you can use subject conditions corresponding to any type in the request")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:51.960+01:00")

public class Subject   {
  @JsonProperty("ssoToken")
  private String ssoToken = null;

  @JsonProperty("jwt")
  private String jwt = null;

  @JsonProperty("claims")
  private Object claims = null;

  public Subject ssoToken(String ssoToken) {
    this.ssoToken = ssoToken;
    return this;
  }

  /**
   * The value is the SSO token ID string for the subject
   * @return ssoToken
  **/
  @ApiModelProperty(value = "The value is the SSO token ID string for the subject")


  public String getSsoToken() {
    return ssoToken;
  }

  public void setSsoToken(String ssoToken) {
    this.ssoToken = ssoToken;
  }

  public Subject jwt(String jwt) {
    this.jwt = jwt;
    return this;
  }

  /**
   * The value is a JWT string
   * @return jwt
  **/
  @ApiModelProperty(value = "The value is a JWT string")


  public String getJwt() {
    return jwt;
  }

  public void setJwt(String jwt) {
    this.jwt = jwt;
  }

  public Subject claims(Object claims) {
    this.claims = claims;
    return this;
  }

  /**
   * The value is an object (map) of JWT claims to their values.
   * @return claims
  **/
  @ApiModelProperty(value = "The value is an object (map) of JWT claims to their values.")


  public Object getClaims() {
    return claims;
  }

  public void setClaims(Object claims) {
    this.claims = claims;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subject subject = (Subject) o;
    return Objects.equals(this.ssoToken, subject.ssoToken) &&
        Objects.equals(this.jwt, subject.jwt) &&
        Objects.equals(this.claims, subject.claims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssoToken, jwt, claims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subject {\n");
    
    sb.append("    ssoToken: ").append(toIndentedString(ssoToken)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
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

