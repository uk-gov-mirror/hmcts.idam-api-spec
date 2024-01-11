package uk.gov.hmcts.reform.idam.api.shared.model;

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
 * User
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.592+01:00")

public class User   {
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

  @JsonProperty("pending")
  private Boolean pending = null;

  @JsonProperty("stale")
  private Boolean stale = null;

  @JsonProperty("pwdAccountLockedTime")
  private String pwdAccountLockedTime = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  @JsonProperty("ssoProvider")
  private String ssoProvider = null;

  @JsonProperty("ssoId")
  private String ssoId = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("createDate")
  private String createDate = null;

  public User id(String id) {
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

  public User forename(String forename) {
    this.forename = forename;
    return this;
  }

  /**
   * The first name of the user
   * @return forename
  **/
  @ApiModelProperty(value = "The first name of the user")

  @Size(min=1)
  @NotNull
  public String getForename() {
    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  public User surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * The last name of the user
   * @return surname
  **/
  @ApiModelProperty(value = "The last name of the user")

  @Size(min=1)
  @NotNull
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public User email(String email) {
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

  public User active(Boolean active) {
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

  public User locked(Boolean locked) {
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

  public User pending(Boolean pending) {
    this.pending = pending;
    return this;
  }

  /**
   * Flag indicating whether the user is pending, i.e. registered but not activated yet.
   * @return pending
  **/
  @ApiModelProperty(value = "Flag indicating whether the user is pending, i.e. registered but not activated yet.")


  public Boolean isPending() {
    return pending;
  }

  public void setPending(Boolean pending) {
    this.pending = pending;
  }

  public User stale(Boolean stale) {
    this.stale = stale;
    return this;
  }

  /**
   * Flag indicating whether the user is a stale user.
   * @return stale
  **/
  @ApiModelProperty(value = "Flag indicating whether the user is a stale user.")


  public Boolean isStale() {
    return stale;
  }

  public void setStale(Boolean stale) {
    this.stale = stale;
  }

  public User pwdAccountLockedTime(String pwdAccountLockedTime) {
    this.pwdAccountLockedTime = pwdAccountLockedTime;
    return this;
  }

  /**
   * Time the user's account is locked.
   * @return pwdAccountLockedTime
  **/
  @ApiModelProperty(value = "Time the user's account is locked.")


  public String getPwdAccountLockedTime() {
    return pwdAccountLockedTime;
  }

  public void setPwdAccountLockedTime(String pwdAccountLockedTime) {
    this.pwdAccountLockedTime = pwdAccountLockedTime;
  }

  public User roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(String rolesItem) {
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

  public User ssoProvider(String ssoProvider) {
    this.ssoProvider = ssoProvider;
    return this;
  }

  /**
   * The name of the SSO Provider the account was federated from.
   * @return ssoProvider
  **/
  @ApiModelProperty(value = "The name of the SSO Provider the account was federated from.")


  public String getSsoProvider() {
    return ssoProvider;
  }

  public void setSsoProvider(String ssoProvider) {
    this.ssoProvider = ssoProvider;
  }

  public User ssoId(String ssoId) {
    this.ssoId = ssoId;
    return this;
  }

  /**
   * The ID of the account within the SSO Provider the account was federated from.
   * @return ssoId
  **/
  @ApiModelProperty(value = "The ID of the account within the SSO Provider the account was federated from.")


  public String getSsoId() {
    return ssoId;
  }

  public void setSsoId(String ssoId) {
    this.ssoId = ssoId;
  }

  public User lastModified(String lastModified) {
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

  public User createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * The date and time this user was created.
   * @return createDate
  **/
  @ApiModelProperty(value = "The date and time this user was created.")


  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.forename, user.forename) &&
        Objects.equals(this.surname, user.surname) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.active, user.active) &&
        Objects.equals(this.locked, user.locked) &&
        Objects.equals(this.pending, user.pending) &&
        Objects.equals(this.stale, user.stale) &&
        Objects.equals(this.pwdAccountLockedTime, user.pwdAccountLockedTime) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.ssoProvider, user.ssoProvider) &&
        Objects.equals(this.ssoId, user.ssoId) &&
        Objects.equals(this.lastModified, user.lastModified) &&
        Objects.equals(this.createDate, user.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, forename, surname, email, active, locked, pending, stale, pwdAccountLockedTime, roles, ssoProvider, ssoId, lastModified, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    stale: ").append(toIndentedString(stale)).append("\n");
    sb.append("    pwdAccountLockedTime: ").append(toIndentedString(pwdAccountLockedTime)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    ssoProvider: ").append(toIndentedString(ssoProvider)).append("\n");
    sb.append("    ssoId: ").append(toIndentedString(ssoId)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

