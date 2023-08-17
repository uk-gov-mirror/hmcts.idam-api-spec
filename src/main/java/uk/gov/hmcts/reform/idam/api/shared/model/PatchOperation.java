package uk.gov.hmcts.reform.idam.api.shared.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Patch Request Object
 */
@ApiModel(description = "Patch Request Object")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.592+01:00")

public class PatchOperation   {
  /**
   * The operation of the patch
   */
  public enum OperationEnum {
    ADD("add"),
    
    REMOVE("remove"),
    
    REPLACE("replace"),
    
    MOVE("move"),
    
    COPY("copy"),
    
    TEST("test");

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

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("value")
  private Object value = null;

  public PatchOperation operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * The operation of the patch
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "The operation of the patch")
  @NotNull


  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public PatchOperation field(String field) {
    this.field = field;
    return this;
  }

  /**
   * field in patch object
   * @return field
  **/
  @ApiModelProperty(required = true, value = "field in patch object")
  @NotNull


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public PatchOperation value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * The value to patch.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value to patch.")
  @NotNull


  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchOperation patchOperation = (PatchOperation) o;
    return Objects.equals(this.operation, patchOperation.operation) &&
        Objects.equals(this.field, patchOperation.field) &&
        Objects.equals(this.value, patchOperation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, field, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchOperation {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

