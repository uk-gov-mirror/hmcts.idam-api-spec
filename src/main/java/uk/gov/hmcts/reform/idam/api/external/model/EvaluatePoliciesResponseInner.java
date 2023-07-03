package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.gov.hmcts.reform.idam.api.external.model.ActionMap;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluatePoliciesResponseInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:51.960+01:00")

public class EvaluatePoliciesResponseInner   {
  @JsonProperty("resource")
  private String resource = null;

  @JsonProperty("actions")
  private ActionMap actions = null;

  @JsonProperty("attributes")
  private Object attributes = null;

  @JsonProperty("advices")
  private Object advices = null;

  public EvaluatePoliciesResponseInner resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Specifies the root resource for the decisions to return
   * @return resource
  **/
  @ApiModelProperty(value = "Specifies the root resource for the decisions to return")


  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public EvaluatePoliciesResponseInner actions(ActionMap actions) {
    this.actions = actions;
    return this;
  }

  /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ActionMap getActions() {
    return actions;
  }

  public void setActions(ActionMap actions) {
    this.actions = actions;
  }

  public EvaluatePoliciesResponseInner attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * A map of attribute names to their values, if any response attributes are returned according to applicable policies
   * @return attributes
  **/
  @ApiModelProperty(value = "A map of attribute names to their values, if any response attributes are returned according to applicable policies")


  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public EvaluatePoliciesResponseInner advices(Object advices) {
    this.advices = advices;
    return this;
  }

  /**
   * A map of advice names to their values, if any advice is returned according to applicable policies
   * @return advices
  **/
  @ApiModelProperty(value = "A map of advice names to their values, if any advice is returned according to applicable policies")


  public Object getAdvices() {
    return advices;
  }

  public void setAdvices(Object advices) {
    this.advices = advices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluatePoliciesResponseInner evaluatePoliciesResponseInner = (EvaluatePoliciesResponseInner) o;
    return Objects.equals(this.resource, evaluatePoliciesResponseInner.resource) &&
        Objects.equals(this.actions, evaluatePoliciesResponseInner.actions) &&
        Objects.equals(this.attributes, evaluatePoliciesResponseInner.attributes) &&
        Objects.equals(this.advices, evaluatePoliciesResponseInner.advices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, actions, attributes, advices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatePoliciesResponseInner {\n");
    
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    advices: ").append(toIndentedString(advices)).append("\n");
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

