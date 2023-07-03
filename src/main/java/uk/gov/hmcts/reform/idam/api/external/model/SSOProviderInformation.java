package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SSOProviderInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:51.893+01:00")

public class SSOProviderInformation   {
  @JsonProperty("ssoProvider")
  private String ssoProvider = null;

  public SSOProviderInformation ssoProvider(String ssoProvider) {
    this.ssoProvider = ssoProvider;
    return this;
  }

  /**
   * A predefined reference to the target SSO Provider
   * @return ssoProvider
  **/
  @ApiModelProperty(required = true, value = "A predefined reference to the target SSO Provider")
  @NotNull

@Size(min=1) 
  public String getSsoProvider() {
    return ssoProvider;
  }

  public void setSsoProvider(String ssoProvider) {
    this.ssoProvider = ssoProvider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSOProviderInformation ssOProviderInformation = (SSOProviderInformation) o;
    return Objects.equals(this.ssoProvider, ssOProviderInformation.ssoProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssoProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSOProviderInformation {\n");
    
    sb.append("    ssoProvider: ").append(toIndentedString(ssoProvider)).append("\n");
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

