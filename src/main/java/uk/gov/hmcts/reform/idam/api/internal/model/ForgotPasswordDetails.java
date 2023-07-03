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
 * ForgotPasswordDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class ForgotPasswordDetails   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("redirectUri")
  private String redirectUri = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("scope")
  private String scope = null;

  public ForgotPasswordDetails email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email identifying the user account
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email identifying the user account")
  @NotNull

@Pattern(regexp="^[^()!&/;%*@\\s]+@[^()!&/;%*@\\s]+\\.[^()!&/;%*@\\s]+$") 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ForgotPasswordDetails redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * URI to redirect the user to after password reset is completed. This URL must match one of the registered URLs for the OAuth2 application linked to the service initiating the reset password journey.
   * @return redirectUri
  **/
  @ApiModelProperty(value = "URI to redirect the user to after password reset is completed. This URL must match one of the registered URLs for the OAuth2 application linked to the service initiating the reset password journey.")


  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public ForgotPasswordDetails clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * OAuth2 client id of the service where the reset password journey started
   * @return clientId
  **/
  @ApiModelProperty(value = "OAuth2 client id of the service where the reset password journey started")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ForgotPasswordDetails state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Optional state to be sent back to the initiating service.
   * @return state
  **/
  @ApiModelProperty(value = "Optional state to be sent back to the initiating service.")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ForgotPasswordDetails scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Optional scopes to request.
   * @return scope
  **/
  @ApiModelProperty(value = "Optional scopes to request.")


  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForgotPasswordDetails forgotPasswordDetails = (ForgotPasswordDetails) o;
    return Objects.equals(this.email, forgotPasswordDetails.email) &&
        Objects.equals(this.redirectUri, forgotPasswordDetails.redirectUri) &&
        Objects.equals(this.clientId, forgotPasswordDetails.clientId) &&
        Objects.equals(this.state, forgotPasswordDetails.state) &&
        Objects.equals(this.scope, forgotPasswordDetails.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, redirectUri, clientId, state, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForgotPasswordDetails {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

