package uk.gov.hmcts.reform.idam.api.internal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * ActivationResult
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class ActivationResult   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("redirectUri")
  private String redirectUri = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("staleUserActivated")
  private Boolean staleUserActivated = false;

  public ActivationResult uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * User's unique identifier
   * @return uuid
  **/
  @ApiModelProperty(value = "User's unique identifier")


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ActivationResult redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * The redirection URI for login
   * @return redirectUri
  **/
  @ApiModelProperty(value = "The redirection URI for login")


  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public ActivationResult clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The client ID used to generate a link to the registration page on the 'expired link' screen
   * @return clientId
  **/
  @ApiModelProperty(value = "The client ID used to generate a link to the registration page on the 'expired link' screen")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ActivationResult staleUserActivated(Boolean staleUserActivated) {
    this.staleUserActivated = staleUserActivated;
    return this;
  }

  /**
   * Indicates if a stale user was activated
   * @return staleUserActivated
  **/
  @ApiModelProperty(value = "Indicates if a stale user was activated")


  public Boolean isStaleUserActivated() {
    return staleUserActivated;
  }

  public void setStaleUserActivated(Boolean staleUserActivated) {
    this.staleUserActivated = staleUserActivated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivationResult activationResult = (ActivationResult) o;
    return Objects.equals(this.uuid, activationResult.uuid) &&
        Objects.equals(this.redirectUri, activationResult.redirectUri) &&
        Objects.equals(this.clientId, activationResult.clientId) &&
        Objects.equals(this.staleUserActivated, activationResult.staleUserActivated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, redirectUri, clientId, staleUserActivated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivationResult {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    staleUserActivated: ").append(toIndentedString(staleUserActivated)).append("\n");
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

