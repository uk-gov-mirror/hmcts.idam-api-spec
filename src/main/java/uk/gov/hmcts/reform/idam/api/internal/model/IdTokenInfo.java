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
 * IdTokenInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class IdTokenInfo   {
  @JsonProperty("sub")
  private String sub = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tokenType")
  private String tokenType = null;

  @JsonProperty("aud")
  private String aud = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  public IdTokenInfo sub(String sub) {
    this.sub = sub;
    return this;
  }

  /**
   * Get sub
   * @return sub
  **/
  @ApiModelProperty(value = "")


  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public IdTokenInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IdTokenInfo tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Get tokenType
   * @return tokenType
  **/
  @ApiModelProperty(value = "")


  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public IdTokenInfo aud(String aud) {
    this.aud = aud;
    return this;
  }

  /**
   * Get aud
   * @return aud
  **/
  @ApiModelProperty(value = "")


  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public IdTokenInfo roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public IdTokenInfo addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")


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
    IdTokenInfo idTokenInfo = (IdTokenInfo) o;
    return Objects.equals(this.sub, idTokenInfo.sub) &&
        Objects.equals(this.name, idTokenInfo.name) &&
        Objects.equals(this.tokenType, idTokenInfo.tokenType) &&
        Objects.equals(this.aud, idTokenInfo.aud) &&
        Objects.equals(this.roles, idTokenInfo.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sub, name, tokenType, aud, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdTokenInfo {\n");
    
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
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

