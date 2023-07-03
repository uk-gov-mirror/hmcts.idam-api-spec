package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.idam.api.external.model.Subject;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Evaluate Request
 */
@ApiModel(description = "Evaluate Request")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:51.960+01:00")

public class EvaluatePoliciesRequest   {
  @JsonProperty("resources")
  @Valid
  private List<String> resources = new ArrayList<>();

  @JsonProperty("application")
  private String application = null;

  @JsonProperty("subject")
  private Subject subject = null;

  @JsonProperty("environment")
  private Object environment = null;

  public EvaluatePoliciesRequest resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public EvaluatePoliciesRequest addResourcesItem(String resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Specifies the list of resources for which to return decisions
   * @return resources
  **/
  @ApiModelProperty(required = true, value = "Specifies the list of resources for which to return decisions")
  @NotNull


  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public EvaluatePoliciesRequest application(String application) {
    this.application = application;
    return this;
  }

  /**
   * String containing the application name, such as \"HmctsPolicySet\"
   * @return application
  **/
  @ApiModelProperty(required = true, value = "String containing the application name, such as \"HmctsPolicySet\"")
  @NotNull


  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public EvaluatePoliciesRequest subject(Subject subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Subject getSubject() {
    return subject;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  public EvaluatePoliciesRequest environment(Object environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Holds a map of keys to lists of values
   * @return environment
  **/
  @ApiModelProperty(value = "Holds a map of keys to lists of values")


  public Object getEnvironment() {
    return environment;
  }

  public void setEnvironment(Object environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluatePoliciesRequest evaluatePoliciesRequest = (EvaluatePoliciesRequest) o;
    return Objects.equals(this.resources, evaluatePoliciesRequest.resources) &&
        Objects.equals(this.application, evaluatePoliciesRequest.application) &&
        Objects.equals(this.subject, evaluatePoliciesRequest.subject) &&
        Objects.equals(this.environment, evaluatePoliciesRequest.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources, application, subject, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatePoliciesRequest {\n");
    
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

