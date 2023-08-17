package uk.gov.hmcts.reform.idam.api.shared.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * SelfRegisterRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.592+01:00")

public class SelfRegisterRequest   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("redirectUri")
  private String redirectUri = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("state")
  private String state = null;

  public SelfRegisterRequest id(UUID id) {
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

  public SelfRegisterRequest email(String email) {
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

  public SelfRegisterRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * first name
   * @return firstName
  **/
  @ApiModelProperty(value = "first name")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SelfRegisterRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * last name
   * @return lastName
  **/
  @ApiModelProperty(value = "last name")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public SelfRegisterRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Get redirectUri
   * @return redirectUri
  **/
  @ApiModelProperty(value = "")


  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public SelfRegisterRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The service client ID
   * @return clientId
  **/
  @ApiModelProperty(value = "The service client ID")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public SelfRegisterRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Optional state reference that will be added to the redirect URL and be available for the target system after the user is activated
   * @return state
  **/
  @ApiModelProperty(value = "Optional state reference that will be added to the redirect URL and be available for the target system after the user is activated")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfRegisterRequest selfRegisterRequest = (SelfRegisterRequest) o;
    return Objects.equals(this.id, selfRegisterRequest.id) &&
        Objects.equals(this.email, selfRegisterRequest.email) &&
        Objects.equals(this.firstName, selfRegisterRequest.firstName) &&
        Objects.equals(this.lastName, selfRegisterRequest.lastName) &&
        Objects.equals(this.redirectUri, selfRegisterRequest.redirectUri) &&
        Objects.equals(this.clientId, selfRegisterRequest.clientId) &&
        Objects.equals(this.state, selfRegisterRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, firstName, lastName, redirectUri, clientId, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfRegisterRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

