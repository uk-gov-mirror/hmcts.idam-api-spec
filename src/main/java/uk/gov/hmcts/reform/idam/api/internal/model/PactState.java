package uk.gov.hmcts.reform.idam.api.internal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * PactState
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class PactState   {
  @JsonProperty("state")
  private String state = null;

  @JsonProperty("params")
  @Valid
  private Map<String, Object> params = null;

  public PactState state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The name of the pact state eg. \"Given A pact state\", where \"A pact state is\" the name
   * @return state
  **/
  @ApiModelProperty(value = "The name of the pact state eg. \"Given A pact state\", where \"A pact state is\" the name")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PactState params(Map<String, Object> params) {
    this.params = params;
    return this;
  }

  public PactState putParamsItem(String key, Object paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

  /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")


  public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PactState pactState = (PactState) o;
    return Objects.equals(this.state, pactState.state) &&
        Objects.equals(this.params, pactState.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PactState {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

