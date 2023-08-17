package uk.gov.hmcts.reform.idam.api.internal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Account
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class Account   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("forename")
  private String forename = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("locked")
  private Boolean locked = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  @JsonProperty("ssoId")
  private String ssoId = null;

  @JsonProperty("ssoProvider")
  private String ssoProvider = null;

  @JsonProperty("linkedRoles")
  @Valid
  private List<String> linkedRoles = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  public Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID for the user
   * @return id
  **/
  @ApiModelProperty(value = "Unique ID for the user")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account forename(String forename) {
    this.forename = forename;
    return this;
  }

  /**
   * The first name of the user
   * @return forename
  **/
  @ApiModelProperty(value = "The first name of the user")


  public String getForename() {
    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  public Account surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * The last name of the user
   * @return surname
  **/
  @ApiModelProperty(value = "The last name of the user")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Account email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the user
   * @return email
  **/
  @ApiModelProperty(value = "The email of the user")

@Pattern(regexp="^[^()!&/;%*@\\s]+@[^()!&/;%*@\\s]+\\.[^()!&/;%*@\\s]+$") 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Account active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Flag indicating whether the user is active (false means the user is suspended).
   * @return active
  **/
  @ApiModelProperty(value = "Flag indicating whether the user is active (false means the user is suspended).")


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Account locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Flag indicating whether the user is locked (false means the user is active).
   * @return locked
  **/
  @ApiModelProperty(readOnly = true, value = "Flag indicating whether the user is locked (false means the user is active).")


  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Account roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public Account addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * The list of the roles of the user
   * @return roles
  **/
  @ApiModelProperty(value = "The list of the roles of the user")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public Account ssoId(String ssoId) {
    this.ssoId = ssoId;
    return this;
  }

  /**
   * The ID of the user in the external sso provider system.
   * @return ssoId
  **/
  @ApiModelProperty(value = "The ID of the user in the external sso provider system.")


  public String getSsoId() {
    return ssoId;
  }

  public void setSsoId(String ssoId) {
    this.ssoId = ssoId;
  }

  public Account ssoProvider(String ssoProvider) {
    this.ssoProvider = ssoProvider;
    return this;
  }

  /**
   * Represents the provider this user was federated from.
   * @return ssoProvider
  **/
  @ApiModelProperty(value = "Represents the provider this user was federated from.")


  public String getSsoProvider() {
    return ssoProvider;
  }

  public void setSsoProvider(String ssoProvider) {
    this.ssoProvider = ssoProvider;
  }

  public Account linkedRoles(List<String> linkedRoles) {
    this.linkedRoles = linkedRoles;
    return this;
  }

  public Account addLinkedRolesItem(String linkedRolesItem) {
    if (this.linkedRoles == null) {
      this.linkedRoles = new ArrayList<>();
    }
    this.linkedRoles.add(linkedRolesItem);
    return this;
  }

  /**
   * Extra, usually hidden roles the user may have been granted
   * @return linkedRoles
  **/
  @ApiModelProperty(value = "Extra, usually hidden roles the user may have been granted")


  public List<String> getLinkedRoles() {
    return linkedRoles;
  }

  public void setLinkedRoles(List<String> linkedRoles) {
    this.linkedRoles = linkedRoles;
  }

  public Account lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date and time this user was last modified.
   * @return lastModified
  **/
  @ApiModelProperty(value = "The date and time this user was last modified.")


  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.forename, account.forename) &&
        Objects.equals(this.surname, account.surname) &&
        Objects.equals(this.email, account.email) &&
        Objects.equals(this.active, account.active) &&
        Objects.equals(this.locked, account.locked) &&
        Objects.equals(this.roles, account.roles) &&
        Objects.equals(this.ssoId, account.ssoId) &&
        Objects.equals(this.ssoProvider, account.ssoProvider) &&
        Objects.equals(this.linkedRoles, account.linkedRoles) &&
        Objects.equals(this.lastModified, account.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, forename, surname, email, active, locked, roles, ssoId, ssoProvider, linkedRoles, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    ssoId: ").append(toIndentedString(ssoId)).append("\n");
    sb.append("    ssoProvider: ").append(toIndentedString(ssoProvider)).append("\n");
    sb.append("    linkedRoles: ").append(toIndentedString(linkedRoles)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

