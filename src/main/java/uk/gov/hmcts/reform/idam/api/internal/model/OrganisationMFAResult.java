package uk.gov.hmcts.reform.idam.api.internal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * OrganisationMFAResult
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class OrganisationMFAResult   {
  @JsonProperty("mfa")
  private String mfa = null;

  public OrganisationMFAResult mfa(String mfa) {
    this.mfa = mfa;
    return this;
  }

  /**
   * Organisation MFA type
   * @return mfa
  **/
  @ApiModelProperty(value = "Organisation MFA type")


  public String getMfa() {
    return mfa;
  }

  public void setMfa(String mfa) {
    this.mfa = mfa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationMFAResult organisationMFAResult = (OrganisationMFAResult) o;
    return Objects.equals(this.mfa, organisationMFAResult.mfa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mfa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationMFAResult {\n");
    
    sb.append("    mfa: ").append(toIndentedString(mfa)).append("\n");
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

