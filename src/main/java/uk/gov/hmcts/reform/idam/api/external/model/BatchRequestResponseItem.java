package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BatchRequestResponseItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:52.228+01:00")

public class BatchRequestResponseItem   {
  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("errorMessages")
  @Valid
  private List<String> errorMessages = null;

  public BatchRequestResponseItem statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status code response for the processed request.
   * @return statusCode
  **/
  @ApiModelProperty(value = "The status code response for the processed request.")


  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public BatchRequestResponseItem status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status response message of the processed request.
   * @return status
  **/
  @ApiModelProperty(value = "The status response message of the processed request.")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BatchRequestResponseItem path(String path) {
    this.path = path;
    return this;
  }

  /**
   * A location where the processed item may be retrieved.
   * @return path
  **/
  @ApiModelProperty(value = "A location where the processed item may be retrieved.")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public BatchRequestResponseItem errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public BatchRequestResponseItem addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<>();
    }
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

  /**
   * An array of reasons as to why the request failed
   * @return errorMessages
  **/
  @ApiModelProperty(value = "An array of reasons as to why the request failed")


  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestResponseItem batchRequestResponseItem = (BatchRequestResponseItem) o;
    return Objects.equals(this.statusCode, batchRequestResponseItem.statusCode) &&
        Objects.equals(this.status, batchRequestResponseItem.status) &&
        Objects.equals(this.path, batchRequestResponseItem.path) &&
        Objects.equals(this.errorMessages, batchRequestResponseItem.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, status, path, errorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestResponseItem {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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

