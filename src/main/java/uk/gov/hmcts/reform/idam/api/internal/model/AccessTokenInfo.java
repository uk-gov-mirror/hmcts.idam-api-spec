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
 * AccessTokenInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class AccessTokenInfo   {
  @JsonProperty("sub")
  private String sub = null;

  @JsonProperty("scope")
  @Valid
  private List<String> scope = null;

  public AccessTokenInfo sub(String sub) {
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

  public AccessTokenInfo scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public AccessTokenInfo addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")


  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenInfo accessTokenInfo = (AccessTokenInfo) o;
    return Objects.equals(this.sub, accessTokenInfo.sub) &&
        Objects.equals(this.scope, accessTokenInfo.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sub, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenInfo {\n");
    
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

