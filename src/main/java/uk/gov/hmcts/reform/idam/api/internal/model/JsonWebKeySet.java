package uk.gov.hmcts.reform.idam.api.internal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.idam.api.internal.model.JsonWebKey;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JsonWebKeySet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class JsonWebKeySet   {
  @JsonProperty("keys")
  @Valid
  private List<JsonWebKey> keys = null;

  public JsonWebKeySet keys(List<JsonWebKey> keys) {
    this.keys = keys;
    return this;
  }

  public JsonWebKeySet addKeysItem(JsonWebKey keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

  /**
   * The value of the \"keys\" parameter is an array of JWK values.
   * @return keys
  **/
  @ApiModelProperty(value = "The value of the \"keys\" parameter is an array of JWK values.")

  @Valid

  public List<JsonWebKey> getKeys() {
    return keys;
  }

  public void setKeys(List<JsonWebKey> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonWebKeySet jsonWebKeySet = (JsonWebKeySet) o;
    return Objects.equals(this.keys, jsonWebKeySet.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonWebKeySet {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

