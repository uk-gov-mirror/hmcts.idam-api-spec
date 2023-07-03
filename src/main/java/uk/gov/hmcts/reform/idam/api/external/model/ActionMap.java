package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of string action names, each set to a boolean indicating whether the action is allowed. Chosen from the available actions provided by the associated Managing Resource Types resource type
 */
@ApiModel(description = "Set of string action names, each set to a boolean indicating whether the action is allowed. Chosen from the available actions provided by the associated Managing Resource Types resource type")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:51.960+01:00")

public class ActionMap extends HashMap<String, Object>  {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionMap {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

