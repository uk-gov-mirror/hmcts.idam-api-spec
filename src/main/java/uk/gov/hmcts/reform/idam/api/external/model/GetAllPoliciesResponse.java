package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.idam.api.external.model.PolicyResourceSchema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * GetAllPoliciesResponse
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:51.960+01:00")

public class GetAllPoliciesResponse   {
  @JsonProperty("resultCount")
  private Integer resultCount = 0;

  @JsonProperty("result")
  @Valid
  private List<PolicyResourceSchema> result = null;

  public GetAllPoliciesResponse resultCount(Integer resultCount) {
    this.resultCount = resultCount;
    return this;
  }

  /**
   * Count of individual result items
   * @return resultCount
  **/
  @ApiModelProperty(value = "Count of individual result items")


  public Integer getResultCount() {
    return resultCount;
  }

  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }

  public GetAllPoliciesResponse result(List<PolicyResourceSchema> result) {
    this.result = result;
    return this;
  }

  public GetAllPoliciesResponse addResultItem(PolicyResourceSchema resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * Array of matching items
   * @return result
  **/
  @ApiModelProperty(value = "Array of matching items")

  @Valid

  public List<PolicyResourceSchema> getResult() {
    return result;
  }

  public void setResult(List<PolicyResourceSchema> result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllPoliciesResponse getAllPoliciesResponse = (GetAllPoliciesResponse) o;
    return Objects.equals(this.resultCount, getAllPoliciesResponse.resultCount) &&
        Objects.equals(this.result, getAllPoliciesResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCount, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllPoliciesResponse {\n");
    
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

