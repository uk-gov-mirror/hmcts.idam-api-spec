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
 * TokenResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:49.793+01:00")

public class TokenResponse   {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("id_token")
  private String idToken = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  @JsonProperty("expires_in")
  private String expiresIn = null;

  public TokenResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * The access token
   * @return accessToken
  **/
  @ApiModelProperty(value = "The access token")


  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public TokenResponse refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * The refresh token
   * @return refreshToken
  **/
  @ApiModelProperty(value = "The refresh token")


  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public TokenResponse scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scopes of the token
   * @return scope
  **/
  @ApiModelProperty(value = "The scopes of the token")


  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public TokenResponse idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * The ID Token
   * @return idToken
  **/
  @ApiModelProperty(value = "The ID Token")


  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }

  public TokenResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * The type of token eg \"Bearer\"
   * @return tokenType
  **/
  @ApiModelProperty(value = "The type of token eg \"Bearer\"")


  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public TokenResponse expiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * The lifetime in seconds of the access token
   * @return expiresIn
  **/
  @ApiModelProperty(value = "The lifetime in seconds of the access token")


  public String getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenResponse tokenResponse = (TokenResponse) o;
    return Objects.equals(this.accessToken, tokenResponse.accessToken) &&
        Objects.equals(this.refreshToken, tokenResponse.refreshToken) &&
        Objects.equals(this.scope, tokenResponse.scope) &&
        Objects.equals(this.idToken, tokenResponse.idToken) &&
        Objects.equals(this.tokenType, tokenResponse.tokenType) &&
        Objects.equals(this.expiresIn, tokenResponse.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, refreshToken, scope, idToken, tokenType, expiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponse {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

