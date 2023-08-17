package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * BulkRolesRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:52.183+01:00")

public class BulkRolesRequest   {
  @JsonProperty("id")
  private UUID id = null;

  /**
   * The operation type for this update
   */
  public enum OperationEnum {
    ADD("ADD"),
    
    REMOVE("REMOVE"),
    
    REPLACE("REPLACE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = new ArrayList<>();

  public BulkRolesRequest id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * user unique ID (UID)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "user unique ID (UID)")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public BulkRolesRequest operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * The operation type for this update
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "The operation type for this update")
  @NotNull


  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public BulkRolesRequest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public BulkRolesRequest addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * The names of the roles to be modified for the user
   * @return roles
  **/
  @ApiModelProperty(required = true, value = "The names of the roles to be modified for the user")
  @NotNull


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
    BulkRolesRequest bulkRolesRequest = (BulkRolesRequest) o;
    return Objects.equals(this.id, bulkRolesRequest.id) &&
        Objects.equals(this.operation, bulkRolesRequest.operation) &&
        Objects.equals(this.roles, bulkRolesRequest.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operation, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRolesRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

