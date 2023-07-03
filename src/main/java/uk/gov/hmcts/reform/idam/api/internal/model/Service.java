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
 * Service
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class Service   {
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

  @JsonProperty("oauth2Scope")
  private String oauth2Scope = null;

  @JsonProperty("activationRedirectUrl")
  private String activationRedirectUrl = null;

  @JsonProperty("selfRegistrationAllowed")
  private Boolean selfRegistrationAllowed = null;

  @JsonProperty("ssoProviders")
  @Valid
  private List<String> ssoProviders = null;

  public Service label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Unique Identifier for the Service
   * @return label
  **/
  @ApiModelProperty(required = true, value = "Unique Identifier for the Service")
  @NotNull


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Service description(String description) {
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

  public Service allowedRoles(List<String> allowedRoles) {
    this.allowedRoles = allowedRoles;
    return this;
  }

  public Service addAllowedRolesItem(String allowedRolesItem) {
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

  public Service onboardingEndpoint(String onboardingEndpoint) {
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

  public Service onboardingRoles(List<String> onboardingRoles) {
    this.onboardingRoles = onboardingRoles;
    return this;
  }

  public Service addOnboardingRolesItem(String onboardingRolesItem) {
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

  public Service oauth2ClientId(String oauth2ClientId) {
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

  public Service oauth2Scope(String oauth2Scope) {
    this.oauth2Scope = oauth2Scope;
    return this;
  }

  /**
   * The Oauth2 Client scope
   * @return oauth2Scope
  **/
  @ApiModelProperty(value = "The Oauth2 Client scope")


  public String getOauth2Scope() {
    return oauth2Scope;
  }

  public void setOauth2Scope(String oauth2Scope) {
    this.oauth2Scope = oauth2Scope;
  }

  public Service activationRedirectUrl(String activationRedirectUrl) {
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

  public Service selfRegistrationAllowed(Boolean selfRegistrationAllowed) {
    this.selfRegistrationAllowed = selfRegistrationAllowed;
    return this;
  }

  /**
   * Flag indicating whether Self-service registration is enabled for this service.
   * @return selfRegistrationAllowed
  **/
  @ApiModelProperty(value = "Flag indicating whether Self-service registration is enabled for this service.")


  public Boolean isSelfRegistrationAllowed() {
    return selfRegistrationAllowed;
  }

  public void setSelfRegistrationAllowed(Boolean selfRegistrationAllowed) {
    this.selfRegistrationAllowed = selfRegistrationAllowed;
  }

  public Service ssoProviders(List<String> ssoProviders) {
    this.ssoProviders = ssoProviders;
    return this;
  }

  public Service addSsoProvidersItem(String ssoProvidersItem) {
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
    Service service = (Service) o;
    return Objects.equals(this.label, service.label) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.allowedRoles, service.allowedRoles) &&
        Objects.equals(this.onboardingEndpoint, service.onboardingEndpoint) &&
        Objects.equals(this.onboardingRoles, service.onboardingRoles) &&
        Objects.equals(this.oauth2ClientId, service.oauth2ClientId) &&
        Objects.equals(this.oauth2Scope, service.oauth2Scope) &&
        Objects.equals(this.activationRedirectUrl, service.activationRedirectUrl) &&
        Objects.equals(this.selfRegistrationAllowed, service.selfRegistrationAllowed) &&
        Objects.equals(this.ssoProviders, service.ssoProviders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, description, allowedRoles, onboardingEndpoint, onboardingRoles, oauth2ClientId, oauth2Scope, activationRedirectUrl, selfRegistrationAllowed, ssoProviders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    allowedRoles: ").append(toIndentedString(allowedRoles)).append("\n");
    sb.append("    onboardingEndpoint: ").append(toIndentedString(onboardingEndpoint)).append("\n");
    sb.append("    onboardingRoles: ").append(toIndentedString(onboardingRoles)).append("\n");
    sb.append("    oauth2ClientId: ").append(toIndentedString(oauth2ClientId)).append("\n");
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

