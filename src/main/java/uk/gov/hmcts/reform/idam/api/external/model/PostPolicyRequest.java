package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.idam.api.external.model.ActionMap;
import uk.gov.hmcts.reform.idam.api.external.model.ConditionMap;
import uk.gov.hmcts.reform.idam.api.external.model.SubjectMap;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Json schema for the policy resource
 */
@ApiModel(description = "Json schema for the policy resource")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:51.960+01:00")

public class PostPolicyRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("applicationName")
  private String applicationName = null;

  @JsonProperty("actionValues")
  private ActionMap actionValues = null;

  @JsonProperty("resources")
  @Valid
  private List<String> resources = null;

  @JsonProperty("subject")
  private SubjectMap subject = null;

  @JsonProperty("condition")
  private ConditionMap condition = null;

  @JsonProperty("resourceTypeUuid")
  private String resourceTypeUuid = null;

  @JsonProperty("resourceAttributes")
  @Valid
  private List<Object> resourceAttributes = null;

  @JsonProperty("lastModifiedBy")
  private String lastModifiedBy = null;

  @JsonProperty("lastModifiedDate")
  private String lastModifiedDate = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("creationDate")
  private String creationDate = null;

  public PostPolicyRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * String matching the name of the application
   * @return name
  **/
  @ApiModelProperty(value = "String matching the name of the application")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostPolicyRequest active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Boolean indicating whether OpenAM considers the policy active for evaluation purposes, defaults to false
   * @return active
  **/
  @ApiModelProperty(value = "Boolean indicating whether OpenAM considers the policy active for evaluation purposes, defaults to false")


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public PostPolicyRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * String describing the policy
   * @return description
  **/
  @ApiModelProperty(value = "String describing the policy")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostPolicyRequest applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  /**
   * String containing the application name, such as \"HmctsPolicySet\"
   * @return applicationName
  **/
  @ApiModelProperty(value = "String containing the application name, such as \"HmctsPolicySet\"")


  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public PostPolicyRequest actionValues(ActionMap actionValues) {
    this.actionValues = actionValues;
    return this;
  }

  /**
   * Get actionValues
   * @return actionValues
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ActionMap getActionValues() {
    return actionValues;
  }

  public void setActionValues(ActionMap actionValues) {
    this.actionValues = actionValues;
  }

  public PostPolicyRequest resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public PostPolicyRequest addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * List of the resource name pattern strings to which the policy applies. Must conform to the pattern templates provided by the associated Managing Resource Types resource type
   * @return resources
  **/
  @ApiModelProperty(value = "List of the resource name pattern strings to which the policy applies. Must conform to the pattern templates provided by the associated Managing Resource Types resource type")


  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public PostPolicyRequest subject(SubjectMap subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SubjectMap getSubject() {
    return subject;
  }

  public void setSubject(SubjectMap subject) {
    this.subject = subject;
  }

  public PostPolicyRequest condition(ConditionMap condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConditionMap getCondition() {
    return condition;
  }

  public void setCondition(ConditionMap condition) {
    this.condition = condition;
  }

  public PostPolicyRequest resourceTypeUuid(String resourceTypeUuid) {
    this.resourceTypeUuid = resourceTypeUuid;
    return this;
  }

  /**
   * The UUIDs of the resource type associated with the policy
   * @return resourceTypeUuid
  **/
  @ApiModelProperty(value = "The UUIDs of the resource type associated with the policy")


  public String getResourceTypeUuid() {
    return resourceTypeUuid;
  }

  public void setResourceTypeUuid(String resourceTypeUuid) {
    this.resourceTypeUuid = resourceTypeUuid;
  }

  public PostPolicyRequest resourceAttributes(List<Object> resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }

  public PostPolicyRequest addResourceAttributesItem(Object resourceAttributesItem) {
    if (this.resourceAttributes == null) {
      this.resourceAttributes = new ArrayList<>();
    }
    this.resourceAttributes.add(resourceAttributesItem);
    return this;
  }

  /**
   * List of attributes to return with decisions. These attributes are known as response attributes
   * @return resourceAttributes
  **/
  @ApiModelProperty(value = "List of attributes to return with decisions. These attributes are known as response attributes")


  public List<Object> getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(List<Object> resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }

  public PostPolicyRequest lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * A string containing the universal identifier DN of the subject that most recently updated the policy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "A string containing the universal identifier DN of the subject that most recently updated the policy")


  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public PostPolicyRequest lastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * An integer containing the last modified date and time, in number of seconds
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "An integer containing the last modified date and time, in number of seconds")


  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public PostPolicyRequest createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * A string containing the universal identifier DN of the subject that created the policy
   * @return createdBy
  **/
  @ApiModelProperty(value = "A string containing the universal identifier DN of the subject that created the policy")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public PostPolicyRequest creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * An integer containing the creation date and time, in number of seconds
   * @return creationDate
  **/
  @ApiModelProperty(value = "An integer containing the creation date and time, in number of seconds")


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPolicyRequest postPolicyRequest = (PostPolicyRequest) o;
    return Objects.equals(this.name, postPolicyRequest.name) &&
        Objects.equals(this.active, postPolicyRequest.active) &&
        Objects.equals(this.description, postPolicyRequest.description) &&
        Objects.equals(this.applicationName, postPolicyRequest.applicationName) &&
        Objects.equals(this.actionValues, postPolicyRequest.actionValues) &&
        Objects.equals(this.resources, postPolicyRequest.resources) &&
        Objects.equals(this.subject, postPolicyRequest.subject) &&
        Objects.equals(this.condition, postPolicyRequest.condition) &&
        Objects.equals(this.resourceTypeUuid, postPolicyRequest.resourceTypeUuid) &&
        Objects.equals(this.resourceAttributes, postPolicyRequest.resourceAttributes) &&
        Objects.equals(this.lastModifiedBy, postPolicyRequest.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, postPolicyRequest.lastModifiedDate) &&
        Objects.equals(this.createdBy, postPolicyRequest.createdBy) &&
        Objects.equals(this.creationDate, postPolicyRequest.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, active, description, applicationName, actionValues, resources, subject, condition, resourceTypeUuid, resourceAttributes, lastModifiedBy, lastModifiedDate, createdBy, creationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPolicyRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    actionValues: ").append(toIndentedString(actionValues)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    resourceTypeUuid: ").append(toIndentedString(resourceTypeUuid)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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

