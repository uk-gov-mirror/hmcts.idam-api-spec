package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.idam.api.external.model.BatchRequestResponseItem;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BatchStatusResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:52.228+01:00")

public class BatchStatusResponse   {
  @JsonProperty("createdAt")
  private String createdAt = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACCEPTED("ACCEPTED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    COMPLETE("COMPLETE"),
    
    CANCELLED("CANCELLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("totalRequests")
  private Integer totalRequests = null;

  @JsonProperty("success")
  private Integer success = null;

  @JsonProperty("failed")
  private Integer failed = null;

  @JsonProperty("response")
  @Valid
  private List<BatchRequestResponseItem> response = null;

  public BatchStatusResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * A timestamp of the created datetime of the batch process
   * @return createdAt
  **/
  @ApiModelProperty(value = "A timestamp of the created datetime of the batch process")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public BatchStatusResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BatchStatusResponse totalRequests(Integer totalRequests) {
    this.totalRequests = totalRequests;
    return this;
  }

  /**
   * Total number of requested operations
   * @return totalRequests
  **/
  @ApiModelProperty(value = "Total number of requested operations")


  public Integer getTotalRequests() {
    return totalRequests;
  }

  public void setTotalRequests(Integer totalRequests) {
    this.totalRequests = totalRequests;
  }

  public BatchStatusResponse success(Integer success) {
    this.success = success;
    return this;
  }

  /**
   * Total number of successful requested operations processed
   * @return success
  **/
  @ApiModelProperty(value = "Total number of successful requested operations processed")


  public Integer getSuccess() {
    return success;
  }

  public void setSuccess(Integer success) {
    this.success = success;
  }

  public BatchStatusResponse failed(Integer failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Total number of failed requested operations processed
   * @return failed
  **/
  @ApiModelProperty(value = "Total number of failed requested operations processed")


  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public BatchStatusResponse response(List<BatchRequestResponseItem> response) {
    this.response = response;
    return this;
  }

  public BatchStatusResponse addResponseItem(BatchRequestResponseItem responseItem) {
    if (this.response == null) {
      this.response = new ArrayList<>();
    }
    this.response.add(responseItem);
    return this;
  }

  /**
   * The names of the roles to be assigned to the user
   * @return response
  **/
  @ApiModelProperty(value = "The names of the roles to be assigned to the user")

  @Valid

  public List<BatchRequestResponseItem> getResponse() {
    return response;
  }

  public void setResponse(List<BatchRequestResponseItem> response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchStatusResponse batchStatusResponse = (BatchStatusResponse) o;
    return Objects.equals(this.createdAt, batchStatusResponse.createdAt) &&
        Objects.equals(this.status, batchStatusResponse.status) &&
        Objects.equals(this.totalRequests, batchStatusResponse.totalRequests) &&
        Objects.equals(this.success, batchStatusResponse.success) &&
        Objects.equals(this.failed, batchStatusResponse.failed) &&
        Objects.equals(this.response, batchStatusResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, status, totalRequests, success, failed, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchStatusResponse {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalRequests: ").append(toIndentedString(totalRequests)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

