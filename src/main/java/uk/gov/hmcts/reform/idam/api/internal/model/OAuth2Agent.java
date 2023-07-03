package uk.gov.hmcts.reform.idam.api.internal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OAuth2Agent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class OAuth2Agent   {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  @JsonProperty("scopes")
  @Valid
  private List<String> scopes = null;

  @JsonProperty("redirectUris")
  @Valid
  private List<String> redirectUris = new ArrayList<>();

  public OAuth2Agent clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Unique ID if the agent
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "Unique ID if the agent")
  @NotNull


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OAuth2Agent clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * The agent password
   * @return clientSecret
  **/
  @ApiModelProperty(value = "The agent password")


  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OAuth2Agent scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public OAuth2Agent addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * The scopes available to this agent
   * @return scopes
  **/
  @ApiModelProperty(value = "The scopes available to this agent")


  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public OAuth2Agent redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public OAuth2Agent addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * The allowed redirect URIs
   * @return redirectUris
  **/
  @ApiModelProperty(required = true, value = "The allowed redirect URIs")
  @NotNull


  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2Agent oauth2Agent = (OAuth2Agent) o;
    return Objects.equals(this.clientId, oauth2Agent.clientId) &&
        Objects.equals(this.clientSecret, oauth2Agent.clientSecret) &&
        Objects.equals(this.scopes, oauth2Agent.scopes) &&
        Objects.equals(this.redirectUris, oauth2Agent.redirectUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, scopes, redirectUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2Agent {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
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

