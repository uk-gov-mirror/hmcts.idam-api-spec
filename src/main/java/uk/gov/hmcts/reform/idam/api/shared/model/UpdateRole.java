package uk.gov.hmcts.reform.idam.api.shared.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * UpdateRole
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.592+01:00")

public class UpdateRole   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("assignableRoles")
  @Valid
  private List<String> assignableRoles = new ArrayList<>();

  @JsonProperty("conflictingRoles")
  @Valid
  private List<String> conflictingRoles = new ArrayList<>();

  @JsonProperty("linkedRoles")
  @Valid
  private List<String> linkedRoles = null;

  public UpdateRole description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the role
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the role")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateRole assignableRoles(List<String> assignableRoles) {
    this.assignableRoles = assignableRoles;
    return this;
  }

  public UpdateRole addAssignableRolesItem(String assignableRolesItem) {
    this.assignableRoles.add(assignableRolesItem);
    return this;
  }

  /**
   * An array of roleIds representing assignable roles
   * @return assignableRoles
  **/
  @ApiModelProperty(required = true, value = "An array of roleIds representing assignable roles")
  @NotNull


  public List<String> getAssignableRoles() {
    return assignableRoles;
  }

  public void setAssignableRoles(List<String> assignableRoles) {
    this.assignableRoles = assignableRoles;
  }

  public UpdateRole conflictingRoles(List<String> conflictingRoles) {
    this.conflictingRoles = conflictingRoles;
    return this;
  }

  public UpdateRole addConflictingRolesItem(String conflictingRolesItem) {
    this.conflictingRoles.add(conflictingRolesItem);
    return this;
  }

  /**
   * Get conflictingRoles
   * @return conflictingRoles
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getConflictingRoles() {
    return conflictingRoles;
  }

  public void setConflictingRoles(List<String> conflictingRoles) {
    this.conflictingRoles = conflictingRoles;
  }

  public UpdateRole linkedRoles(List<String> linkedRoles) {
    this.linkedRoles = linkedRoles;
    return this;
  }

  public UpdateRole addLinkedRolesItem(String linkedRolesItem) {
    if (this.linkedRoles == null) {
      this.linkedRoles = new ArrayList<>();
    }
    this.linkedRoles.add(linkedRolesItem);
    return this;
  }

  /**
   * Get linkedRoles
   * @return linkedRoles
  **/
  @ApiModelProperty(value = "")


  public List<String> getLinkedRoles() {
    return linkedRoles;
  }

  public void setLinkedRoles(List<String> linkedRoles) {
    this.linkedRoles = linkedRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRole updateRole = (UpdateRole) o;
    return Objects.equals(this.description, updateRole.description) &&
        Objects.equals(this.assignableRoles, updateRole.assignableRoles) &&
        Objects.equals(this.conflictingRoles, updateRole.conflictingRoles) &&
        Objects.equals(this.linkedRoles, updateRole.linkedRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, assignableRoles, conflictingRoles, linkedRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRole {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assignableRoles: ").append(toIndentedString(assignableRoles)).append("\n");
    sb.append("    conflictingRoles: ").append(toIndentedString(conflictingRoles)).append("\n");
    sb.append("    linkedRoles: ").append(toIndentedString(linkedRoles)).append("\n");
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

