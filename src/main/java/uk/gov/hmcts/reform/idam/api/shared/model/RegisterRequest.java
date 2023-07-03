package uk.gov.hmcts.reform.idam.api.shared.model;

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
 * RegisterRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.592+01:00")

public class RegisterRequest   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("firstname")
  private String firstname = null;

  @JsonProperty("lastname")
  private String lastname = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  @JsonProperty("services")
  @Valid
  private List<String> services = null;

  public RegisterRequest id(UUID id) {
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

  public RegisterRequest email(String email) {
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

  public RegisterRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * password used for login
   * @return password
  **/
  @ApiModelProperty(value = "password used for login")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RegisterRequest firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * first name
   * @return firstname
  **/
  @ApiModelProperty(required = true, value = "first name")
  @NotNull


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public RegisterRequest lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * last name
   * @return lastname
  **/
  @ApiModelProperty(required = true, value = "last name")
  @NotNull


  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public RegisterRequest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public RegisterRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * roles to grant
   * @return roles
  **/
  @ApiModelProperty(value = "roles to grant")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public RegisterRequest services(List<String> services) {
    this.services = services;
    return this;
  }

  public RegisterRequest addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * services to onboard
   * @return services
  **/
  @ApiModelProperty(value = "services to onboard")


  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterRequest registerRequest = (RegisterRequest) o;
    return Objects.equals(this.id, registerRequest.id) &&
        Objects.equals(this.email, registerRequest.email) &&
        Objects.equals(this.password, registerRequest.password) &&
        Objects.equals(this.firstname, registerRequest.firstname) &&
        Objects.equals(this.lastname, registerRequest.lastname) &&
        Objects.equals(this.roles, registerRequest.roles) &&
        Objects.equals(this.services, registerRequest.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, password, firstname, lastname, roles, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

