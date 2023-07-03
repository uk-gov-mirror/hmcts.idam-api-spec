package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserRegistrationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:51.786+01:00")

public class UserRegistrationRequest   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  public UserRegistrationRequest id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * user unique ID (UID)
   * @return id
  **/
  @ApiModelProperty(value = "user unique ID (UID)")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserRegistrationRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email used for registration
   * @return email
  **/
  @ApiModelProperty(required = true, value = "email used for registration")
  @NotNull

@Pattern(regexp="^[^()!&/;%*@\\s]+@[^()!&/;%*@\\s]+\\.[^()!&/;%*@\\s]+$") 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserRegistrationRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * first name
   * @return firstName
  **/
  @ApiModelProperty(value = "first name")

@Size(min=1) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserRegistrationRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * last name
   * @return lastName
  **/
  @ApiModelProperty(value = "last name")

@Size(min=1) 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserRegistrationRequest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public UserRegistrationRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * The names of the roles to be assigned to the user
   * @return roles
  **/
  @ApiModelProperty(value = "The names of the roles to be assigned to the user")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRegistrationRequest userRegistrationRequest = (UserRegistrationRequest) o;
    return Objects.equals(this.id, userRegistrationRequest.id) &&
        Objects.equals(this.email, userRegistrationRequest.email) &&
        Objects.equals(this.firstName, userRegistrationRequest.firstName) &&
        Objects.equals(this.lastName, userRegistrationRequest.lastName) &&
        Objects.equals(this.roles, userRegistrationRequest.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, firstName, lastName, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRegistrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

