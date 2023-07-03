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
 * ServiceUpdate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class ServiceUpdate   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("allowedRoles")
  @Valid
  private List<String> allowedRoles = new ArrayList<>();

  @JsonProperty("onboardingEndpoint")
  private String onboardingEndpoint = null;

  @JsonProperty("onboardingRoles")
  @Valid
  private List<String> onboardingRoles = null;

  @JsonProperty("oauth2ClientId")
  private String oauth2ClientId = null;

  @JsonProperty("oauth2ClientSecret")
  private String oauth2ClientSecret = null;

  @JsonProperty("oauth2RedirectUris")
  @Valid
  private List<String> oauth2RedirectUris = null;

  @JsonProperty("oauth2Scope")
  private String oauth2Scope = null;

  @JsonProperty("activationRedirectUrl")
  private String activationRedirectUrl = null;

  @JsonProperty("selfRegistrationAllowed")
  private Boolean selfRegistrationAllowed = null;

  @JsonProperty("ssoProviders")
  @Valid
  private List<String> ssoProviders = null;

  public ServiceUpdate label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Short Identifier for the Service
   * @return label
  **/
  @ApiModelProperty(required = true, value = "Short Identifier for the Service")
  @NotNull


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ServiceUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the service
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the service")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServiceUpdate allowedRoles(List<String> allowedRoles) {
    this.allowedRoles = allowedRoles;
    return this;
  }

  public ServiceUpdate addAllowedRolesItem(String allowedRolesItem) {
    this.allowedRoles.add(allowedRolesItem);
    return this;
  }

  /**
   * Get allowedRoles
   * @return allowedRoles
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getAllowedRoles() {
    return allowedRoles;
  }

  public void setAllowedRoles(List<String> allowedRoles) {
    this.allowedRoles = allowedRoles;
  }

  public ServiceUpdate onboardingEndpoint(String onboardingEndpoint) {
    this.onboardingEndpoint = onboardingEndpoint;
    return this;
  }

  /**
   * The endpoint used to notify the service about users on-boarding
   * @return onboardingEndpoint
  **/
  @ApiModelProperty(value = "The endpoint used to notify the service about users on-boarding")


  public String getOnboardingEndpoint() {
    return onboardingEndpoint;
  }

  public void setOnboardingEndpoint(String onboardingEndpoint) {
    this.onboardingEndpoint = onboardingEndpoint;
  }

  public ServiceUpdate onboardingRoles(List<String> onboardingRoles) {
    this.onboardingRoles = onboardingRoles;
    return this;
  }

  public ServiceUpdate addOnboardingRolesItem(String onboardingRolesItem) {
    if (this.onboardingRoles == null) {
      this.onboardingRoles = new ArrayList<>();
    }
    this.onboardingRoles.add(onboardingRolesItem);
    return this;
  }

  /**
   * Get onboardingRoles
   * @return onboardingRoles
  **/
  @ApiModelProperty(value = "")


  public List<String> getOnboardingRoles() {
    return onboardingRoles;
  }

  public void setOnboardingRoles(List<String> onboardingRoles) {
    this.onboardingRoles = onboardingRoles;
  }

  public ServiceUpdate oauth2ClientId(String oauth2ClientId) {
    this.oauth2ClientId = oauth2ClientId;
    return this;
  }

  /**
   * The Oauth2 Client Id
   * @return oauth2ClientId
  **/
  @ApiModelProperty(value = "The Oauth2 Client Id")


  public String getOauth2ClientId() {
    return oauth2ClientId;
  }

  public void setOauth2ClientId(String oauth2ClientId) {
    this.oauth2ClientId = oauth2ClientId;
  }

  public ServiceUpdate oauth2ClientSecret(String oauth2ClientSecret) {
    this.oauth2ClientSecret = oauth2ClientSecret;
    return this;
  }

  /**
   * The Oauth2 Client secret
   * @return oauth2ClientSecret
  **/
  @ApiModelProperty(value = "The Oauth2 Client secret")


  public String getOauth2ClientSecret() {
    return oauth2ClientSecret;
  }

  public void setOauth2ClientSecret(String oauth2ClientSecret) {
    this.oauth2ClientSecret = oauth2ClientSecret;
  }

  public ServiceUpdate oauth2RedirectUris(List<String> oauth2RedirectUris) {
    this.oauth2RedirectUris = oauth2RedirectUris;
    return this;
  }

  public ServiceUpdate addOauth2RedirectUrisItem(String oauth2RedirectUrisItem) {
    if (this.oauth2RedirectUris == null) {
      this.oauth2RedirectUris = new ArrayList<>();
    }
    this.oauth2RedirectUris.add(oauth2RedirectUrisItem);
    return this;
  }

  /**
   * Get oauth2RedirectUris
   * @return oauth2RedirectUris
  **/
  @ApiModelProperty(value = "")


  public List<String> getOauth2RedirectUris() {
    return oauth2RedirectUris;
  }

  public void setOauth2RedirectUris(List<String> oauth2RedirectUris) {
    this.oauth2RedirectUris = oauth2RedirectUris;
  }

  public ServiceUpdate oauth2Scope(String oauth2Scope) {
    this.oauth2Scope = oauth2Scope;
    return this;
  }

  /**
   * Get oauth2Scope
   * @return oauth2Scope
  **/
  @ApiModelProperty(value = "")


  public String getOauth2Scope() {
    return oauth2Scope;
  }

  public void setOauth2Scope(String oauth2Scope) {
    this.oauth2Scope = oauth2Scope;
  }

  public ServiceUpdate activationRedirectUrl(String activationRedirectUrl) {
    this.activationRedirectUrl = activationRedirectUrl;
    return this;
  }

  /**
   * The url to take a user to after their account is activated.
   * @return activationRedirectUrl
  **/
  @ApiModelProperty(value = "The url to take a user to after their account is activated.")


  public String getActivationRedirectUrl() {
    return activationRedirectUrl;
  }

  public void setActivationRedirectUrl(String activationRedirectUrl) {
    this.activationRedirectUrl = activationRedirectUrl;
  }

  public ServiceUpdate selfRegistrationAllowed(Boolean selfRegistrationAllowed) {
    this.selfRegistrationAllowed = selfRegistrationAllowed;
    return this;
  }

  /**
   * Flag indicating whether Self-service registration is enabled for this service. If omitted, defaults to false.
   * @return selfRegistrationAllowed
  **/
  @ApiModelProperty(value = "Flag indicating whether Self-service registration is enabled for this service. If omitted, defaults to false.")


  public Boolean isSelfRegistrationAllowed() {
    return selfRegistrationAllowed;
  }

  public void setSelfRegistrationAllowed(Boolean selfRegistrationAllowed) {
    this.selfRegistrationAllowed = selfRegistrationAllowed;
  }

  public ServiceUpdate ssoProviders(List<String> ssoProviders) {
    this.ssoProviders = ssoProviders;
    return this;
  }

  public ServiceUpdate addSsoProvidersItem(String ssoProvidersItem) {
    if (this.ssoProviders == null) {
      this.ssoProviders = new ArrayList<>();
    }
    this.ssoProviders.add(ssoProvidersItem);
    return this;
  }

  /**
   * A list of external SSO Providers to federate identities with for this service
   * @return ssoProviders
  **/
  @ApiModelProperty(value = "A list of external SSO Providers to federate identities with for this service")


  public List<String> getSsoProviders() {
    return ssoProviders;
  }

  public void setSsoProviders(List<String> ssoProviders) {
    this.ssoProviders = ssoProviders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceUpdate serviceUpdate = (ServiceUpdate) o;
    return Objects.equals(this.label, serviceUpdate.label) &&
        Objects.equals(this.description, serviceUpdate.description) &&
        Objects.equals(this.allowedRoles, serviceUpdate.allowedRoles) &&
        Objects.equals(this.onboardingEndpoint, serviceUpdate.onboardingEndpoint) &&
        Objects.equals(this.onboardingRoles, serviceUpdate.onboardingRoles) &&
        Objects.equals(this.oauth2ClientId, serviceUpdate.oauth2ClientId) &&
        Objects.equals(this.oauth2ClientSecret, serviceUpdate.oauth2ClientSecret) &&
        Objects.equals(this.oauth2RedirectUris, serviceUpdate.oauth2RedirectUris) &&
        Objects.equals(this.oauth2Scope, serviceUpdate.oauth2Scope) &&
        Objects.equals(this.activationRedirectUrl, serviceUpdate.activationRedirectUrl) &&
        Objects.equals(this.selfRegistrationAllowed, serviceUpdate.selfRegistrationAllowed) &&
        Objects.equals(this.ssoProviders, serviceUpdate.ssoProviders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, description, allowedRoles, onboardingEndpoint, onboardingRoles, oauth2ClientId, oauth2ClientSecret, oauth2RedirectUris, oauth2Scope, activationRedirectUrl, selfRegistrationAllowed, ssoProviders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceUpdate {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    allowedRoles: ").append(toIndentedString(allowedRoles)).append("\n");
    sb.append("    onboardingEndpoint: ").append(toIndentedString(onboardingEndpoint)).append("\n");
    sb.append("    onboardingRoles: ").append(toIndentedString(onboardingRoles)).append("\n");
    sb.append("    oauth2ClientId: ").append(toIndentedString(oauth2ClientId)).append("\n");
    sb.append("    oauth2ClientSecret: ").append(toIndentedString(oauth2ClientSecret)).append("\n");
    sb.append("    oauth2RedirectUris: ").append(toIndentedString(oauth2RedirectUris)).append("\n");
    sb.append("    oauth2Scope: ").append(toIndentedString(oauth2Scope)).append("\n");
    sb.append("    activationRedirectUrl: ").append(toIndentedString(activationRedirectUrl)).append("\n");
    sb.append("    selfRegistrationAllowed: ").append(toIndentedString(selfRegistrationAllowed)).append("\n");
    sb.append("    ssoProviders: ").append(toIndentedString(ssoProviders)).append("\n");
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

