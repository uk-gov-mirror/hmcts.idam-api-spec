package uk.gov.hmcts.reform.idam.api.external.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BatchResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:52.228+01:00")

public class BatchResponse   {
  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    ACCEPTED("ACCEPTED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    COMPLETE("COMPLETE"),
    
    CANCELLED("CANCELLED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("creationDate")
  private String creationDate = null;

  @JsonProperty("lastModifiedDate")
  private String lastModifiedDate = null;

  @JsonProperty("requestClientId")
  private String requestClientId = null;

  @JsonProperty("requestUserId")
  private String requestUserId = null;

  @JsonProperty("processorId")
  private String processorId = null;

  public BatchResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Batch Unique ID
   * @return id
  **/
  @ApiModelProperty(value = "Batch Unique ID")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BatchResponse state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public BatchResponse creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * DateTime this was created.
   * @return creationDate
  **/
  @ApiModelProperty(value = "DateTime this was created.")


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public BatchResponse lastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * DateTime this was last updated created.
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "DateTime this was last updated created.")


  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public BatchResponse requestClientId(String requestClientId) {
    this.requestClientId = requestClientId;
    return this;
  }

  /**
   * Client ID in the access_token used for the request.
   * @return requestClientId
  **/
  @ApiModelProperty(value = "Client ID in the access_token used for the request.")


  public String getRequestClientId() {
    return requestClientId;
  }

  public void setRequestClientId(String requestClientId) {
    this.requestClientId = requestClientId;
  }

  public BatchResponse requestUserId(String requestUserId) {
    this.requestUserId = requestUserId;
    return this;
  }

  /**
   * User ID of the requestor.
   * @return requestUserId
  **/
  @ApiModelProperty(value = "User ID of the requestor.")


  public String getRequestUserId() {
    return requestUserId;
  }

  public void setRequestUserId(String requestUserId) {
    this.requestUserId = requestUserId;
  }

  public BatchResponse processorId(String processorId) {
    this.processorId = processorId;
    return this;
  }

  /**
   * ID of the batch processor that has picked up the batch for processing.
   * @return processorId
  **/
  @ApiModelProperty(value = "ID of the batch processor that has picked up the batch for processing.")


  public String getProcessorId() {
    return processorId;
  }

  public void setProcessorId(String processorId) {
    this.processorId = processorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponse batchResponse = (BatchResponse) o;
    return Objects.equals(this.id, batchResponse.id) &&
        Objects.equals(this.state, batchResponse.state) &&
        Objects.equals(this.creationDate, batchResponse.creationDate) &&
        Objects.equals(this.lastModifiedDate, batchResponse.lastModifiedDate) &&
        Objects.equals(this.requestClientId, batchResponse.requestClientId) &&
        Objects.equals(this.requestUserId, batchResponse.requestUserId) &&
        Objects.equals(this.processorId, batchResponse.processorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, creationDate, lastModifiedDate, requestClientId, requestUserId, processorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    requestClientId: ").append(toIndentedString(requestClientId)).append("\n");
    sb.append("    requestUserId: ").append(toIndentedString(requestUserId)).append("\n");
    sb.append("    processorId: ").append(toIndentedString(processorId)).append("\n");
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

