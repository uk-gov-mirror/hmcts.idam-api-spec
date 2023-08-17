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
 * TestUserRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class TestUserRequest   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("forename")
  private String forename = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("ssoId")
  private String ssoId = null;

  @JsonProperty("ssoProvider")
  private String ssoProvider = null;

  @JsonProperty("roles")
  @Valid
  private List<uk.gov.hmcts.reform.idam.api.shared.model.RoleDetail> roles = null;

  @JsonProperty("userGroup")
  private uk.gov.hmcts.reform.idam.api.shared.model.RoleDetail userGroup = null;

  public TestUserRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The user id
   * @return id
  **/
  @ApiModelProperty(value = "The user id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TestUserRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The user email address
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The user email address")
  @NotNull

@Pattern(regexp="^[^()!&/;%*@\\s]+@[^()!&/;%*@\\s]+\\.[^()!&/;%*@\\s]+$") 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TestUserRequest forename(String forename) {
    this.forename = forename;
    return this;
  }

  /**
   * The user forename
   * @return forename
  **/
  @ApiModelProperty(value = "The user forename")


  public String getForename() {
    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  public TestUserRequest surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * The user surname
   * @return surname
  **/
  @ApiModelProperty(required = true, value = "The user surname")
  @NotNull


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public TestUserRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The user password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "The user password")
  @NotNull


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public TestUserRequest ssoId(String ssoId) {
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

  public TestUserRequest ssoProvider(String ssoProvider) {
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

  public TestUserRequest roles(List<uk.gov.hmcts.reform.idam.api.shared.model.RoleDetail> roles) {
    this.roles = roles;
    return this;
  }

  public TestUserRequest addRolesItem(uk.gov.hmcts.reform.idam.api.shared.model.RoleDetail rolesItem) {
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

  @Valid

  public List<uk.gov.hmcts.reform.idam.api.shared.model.RoleDetail> getRoles() {
    return roles;
  }

  public void setRoles(List<uk.gov.hmcts.reform.idam.api.shared.model.RoleDetail> roles) {
    this.roles = roles;
  }

  public TestUserRequest userGroup(uk.gov.hmcts.reform.idam.api.shared.model.RoleDetail userGroup) {
    this.userGroup = userGroup;
    return this;
  }

  /**
   * The user group
   * @return userGroup
  **/
  @ApiModelProperty(value = "The user group")

  @Valid

  public uk.gov.hmcts.reform.idam.api.shared.model.RoleDetail getUserGroup() {
    return userGroup;
  }

  public void setUserGroup(uk.gov.hmcts.reform.idam.api.shared.model.RoleDetail userGroup) {
    this.userGroup = userGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestUserRequest testUserRequest = (TestUserRequest) o;
    return Objects.equals(this.id, testUserRequest.id) &&
        Objects.equals(this.email, testUserRequest.email) &&
        Objects.equals(this.forename, testUserRequest.forename) &&
        Objects.equals(this.surname, testUserRequest.surname) &&
        Objects.equals(this.password, testUserRequest.password) &&
        Objects.equals(this.ssoId, testUserRequest.ssoId) &&
        Objects.equals(this.ssoProvider, testUserRequest.ssoProvider) &&
        Objects.equals(this.roles, testUserRequest.roles) &&
        Objects.equals(this.userGroup, testUserRequest.userGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, forename, surname, password, ssoId, ssoProvider, roles, userGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestUserRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    ssoId: ").append(toIndentedString(ssoId)).append("\n");
    sb.append("    ssoProvider: ").append(toIndentedString(ssoProvider)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
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

