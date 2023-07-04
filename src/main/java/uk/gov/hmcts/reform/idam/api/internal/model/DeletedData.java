package uk.gov.hmcts.reform.idam.api.internal.model;

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
 * DeletedData
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class DeletedData   {
  @JsonProperty("testDataPrefix")
  private String testDataPrefix = null;

  @JsonProperty("userNamesRequested")
  @Valid
  private List<String> userNamesRequested = null;

  @JsonProperty("userNamesFound")
  @Valid
  private List<String> userNamesFound = null;

  @JsonProperty("userNamesDeleted")
  @Valid
  private List<String> userNamesDeleted = null;

  @JsonProperty("userNamesFailed")
  @Valid
  private List<String> userNamesFailed = null;

  @JsonProperty("roleNamesRequested")
  @Valid
  private List<String> roleNamesRequested = null;

  @JsonProperty("roleNamesFound")
  @Valid
  private List<String> roleNamesFound = null;

  @JsonProperty("roleNamesDeleted")
  @Valid
  private List<String> roleNamesDeleted = null;

  @JsonProperty("roleNamesFailed")
  @Valid
  private List<String> roleNamesFailed = null;

  @JsonProperty("serviceNamesRequested")
  @Valid
  private List<String> serviceNamesRequested = null;

  @JsonProperty("serviceNamesFound")
  @Valid
  private List<String> serviceNamesFound = null;

  @JsonProperty("serviceNamesDeleted")
  @Valid
  private List<String> serviceNamesDeleted = null;

  @JsonProperty("serviceNamesFailed")
  @Valid
  private List<String> serviceNamesFailed = null;

  public DeletedData testDataPrefix(String testDataPrefix) {
    this.testDataPrefix = testDataPrefix;
    return this;
  }

  /**
   * Prefix for test data names requested to delete
   * @return testDataPrefix
  **/
  @ApiModelProperty(value = "Prefix for test data names requested to delete")


  public String getTestDataPrefix() {
    return testDataPrefix;
  }

  public void setTestDataPrefix(String testDataPrefix) {
    this.testDataPrefix = testDataPrefix;
  }

  public DeletedData userNamesRequested(List<String> userNamesRequested) {
    this.userNamesRequested = userNamesRequested;
    return this;
  }

  public DeletedData addUserNamesRequestedItem(String userNamesRequestedItem) {
    if (this.userNamesRequested == null) {
      this.userNamesRequested = new ArrayList<>();
    }
    this.userNamesRequested.add(userNamesRequestedItem);
    return this;
  }

  /**
   * Test user names requested to delete
   * @return userNamesRequested
  **/
  @ApiModelProperty(value = "Test user names requested to delete")


  public List<String> getUserNamesRequested() {
    return userNamesRequested;
  }

  public void setUserNamesRequested(List<String> userNamesRequested) {
    this.userNamesRequested = userNamesRequested;
  }

  public DeletedData userNamesFound(List<String> userNamesFound) {
    this.userNamesFound = userNamesFound;
    return this;
  }

  public DeletedData addUserNamesFoundItem(String userNamesFoundItem) {
    if (this.userNamesFound == null) {
      this.userNamesFound = new ArrayList<>();
    }
    this.userNamesFound.add(userNamesFoundItem);
    return this;
  }

  /**
   * Test user names that matched to delete
   * @return userNamesFound
  **/
  @ApiModelProperty(value = "Test user names that matched to delete")


  public List<String> getUserNamesFound() {
    return userNamesFound;
  }

  public void setUserNamesFound(List<String> userNamesFound) {
    this.userNamesFound = userNamesFound;
  }

  public DeletedData userNamesDeleted(List<String> userNamesDeleted) {
    this.userNamesDeleted = userNamesDeleted;
    return this;
  }

  public DeletedData addUserNamesDeletedItem(String userNamesDeletedItem) {
    if (this.userNamesDeleted == null) {
      this.userNamesDeleted = new ArrayList<>();
    }
    this.userNamesDeleted.add(userNamesDeletedItem);
    return this;
  }

  /**
   * Test user names that succeeded to delete
   * @return userNamesDeleted
  **/
  @ApiModelProperty(value = "Test user names that succeeded to delete")


  public List<String> getUserNamesDeleted() {
    return userNamesDeleted;
  }

  public void setUserNamesDeleted(List<String> userNamesDeleted) {
    this.userNamesDeleted = userNamesDeleted;
  }

  public DeletedData userNamesFailed(List<String> userNamesFailed) {
    this.userNamesFailed = userNamesFailed;
    return this;
  }

  public DeletedData addUserNamesFailedItem(String userNamesFailedItem) {
    if (this.userNamesFailed == null) {
      this.userNamesFailed = new ArrayList<>();
    }
    this.userNamesFailed.add(userNamesFailedItem);
    return this;
  }

  /**
   * Test user names that failed to delete
   * @return userNamesFailed
  **/
  @ApiModelProperty(value = "Test user names that failed to delete")


  public List<String> getUserNamesFailed() {
    return userNamesFailed;
  }

  public void setUserNamesFailed(List<String> userNamesFailed) {
    this.userNamesFailed = userNamesFailed;
  }

  public DeletedData roleNamesRequested(List<String> roleNamesRequested) {
    this.roleNamesRequested = roleNamesRequested;
    return this;
  }

  public DeletedData addRoleNamesRequestedItem(String roleNamesRequestedItem) {
    if (this.roleNamesRequested == null) {
      this.roleNamesRequested = new ArrayList<>();
    }
    this.roleNamesRequested.add(roleNamesRequestedItem);
    return this;
  }

  /**
   * Test role names requested to delete
   * @return roleNamesRequested
  **/
  @ApiModelProperty(value = "Test role names requested to delete")


  public List<String> getRoleNamesRequested() {
    return roleNamesRequested;
  }

  public void setRoleNamesRequested(List<String> roleNamesRequested) {
    this.roleNamesRequested = roleNamesRequested;
  }

  public DeletedData roleNamesFound(List<String> roleNamesFound) {
    this.roleNamesFound = roleNamesFound;
    return this;
  }

  public DeletedData addRoleNamesFoundItem(String roleNamesFoundItem) {
    if (this.roleNamesFound == null) {
      this.roleNamesFound = new ArrayList<>();
    }
    this.roleNamesFound.add(roleNamesFoundItem);
    return this;
  }

  /**
   * Test role names that matched to delete
   * @return roleNamesFound
  **/
  @ApiModelProperty(value = "Test role names that matched to delete")


  public List<String> getRoleNamesFound() {
    return roleNamesFound;
  }

  public void setRoleNamesFound(List<String> roleNamesFound) {
    this.roleNamesFound = roleNamesFound;
  }

  public DeletedData roleNamesDeleted(List<String> roleNamesDeleted) {
    this.roleNamesDeleted = roleNamesDeleted;
    return this;
  }

  public DeletedData addRoleNamesDeletedItem(String roleNamesDeletedItem) {
    if (this.roleNamesDeleted == null) {
      this.roleNamesDeleted = new ArrayList<>();
    }
    this.roleNamesDeleted.add(roleNamesDeletedItem);
    return this;
  }

  /**
   * Test role names that succeeded to delete
   * @return roleNamesDeleted
  **/
  @ApiModelProperty(value = "Test role names that succeeded to delete")


  public List<String> getRoleNamesDeleted() {
    return roleNamesDeleted;
  }

  public void setRoleNamesDeleted(List<String> roleNamesDeleted) {
    this.roleNamesDeleted = roleNamesDeleted;
  }

  public DeletedData roleNamesFailed(List<String> roleNamesFailed) {
    this.roleNamesFailed = roleNamesFailed;
    return this;
  }

  public DeletedData addRoleNamesFailedItem(String roleNamesFailedItem) {
    if (this.roleNamesFailed == null) {
      this.roleNamesFailed = new ArrayList<>();
    }
    this.roleNamesFailed.add(roleNamesFailedItem);
    return this;
  }

  /**
   * Test role names that failed to delete
   * @return roleNamesFailed
  **/
  @ApiModelProperty(value = "Test role names that failed to delete")


  public List<String> getRoleNamesFailed() {
    return roleNamesFailed;
  }

  public void setRoleNamesFailed(List<String> roleNamesFailed) {
    this.roleNamesFailed = roleNamesFailed;
  }

  public DeletedData serviceNamesRequested(List<String> serviceNamesRequested) {
    this.serviceNamesRequested = serviceNamesRequested;
    return this;
  }

  public DeletedData addServiceNamesRequestedItem(String serviceNamesRequestedItem) {
    if (this.serviceNamesRequested == null) {
      this.serviceNamesRequested = new ArrayList<>();
    }
    this.serviceNamesRequested.add(serviceNamesRequestedItem);
    return this;
  }

  /**
   * Test service names requested to delete
   * @return serviceNamesRequested
  **/
  @ApiModelProperty(value = "Test service names requested to delete")


  public List<String> getServiceNamesRequested() {
    return serviceNamesRequested;
  }

  public void setServiceNamesRequested(List<String> serviceNamesRequested) {
    this.serviceNamesRequested = serviceNamesRequested;
  }

  public DeletedData serviceNamesFound(List<String> serviceNamesFound) {
    this.serviceNamesFound = serviceNamesFound;
    return this;
  }

  public DeletedData addServiceNamesFoundItem(String serviceNamesFoundItem) {
    if (this.serviceNamesFound == null) {
      this.serviceNamesFound = new ArrayList<>();
    }
    this.serviceNamesFound.add(serviceNamesFoundItem);
    return this;
  }

  /**
   * Test service names that matched to delete
   * @return serviceNamesFound
  **/
  @ApiModelProperty(value = "Test service names that matched to delete")


  public List<String> getServiceNamesFound() {
    return serviceNamesFound;
  }

  public void setServiceNamesFound(List<String> serviceNamesFound) {
    this.serviceNamesFound = serviceNamesFound;
  }

  public DeletedData serviceNamesDeleted(List<String> serviceNamesDeleted) {
    this.serviceNamesDeleted = serviceNamesDeleted;
    return this;
  }

  public DeletedData addServiceNamesDeletedItem(String serviceNamesDeletedItem) {
    if (this.serviceNamesDeleted == null) {
      this.serviceNamesDeleted = new ArrayList<>();
    }
    this.serviceNamesDeleted.add(serviceNamesDeletedItem);
    return this;
  }

  /**
   * Test service names that succeeded to delete
   * @return serviceNamesDeleted
  **/
  @ApiModelProperty(value = "Test service names that succeeded to delete")


  public List<String> getServiceNamesDeleted() {
    return serviceNamesDeleted;
  }

  public void setServiceNamesDeleted(List<String> serviceNamesDeleted) {
    this.serviceNamesDeleted = serviceNamesDeleted;
  }

  public DeletedData serviceNamesFailed(List<String> serviceNamesFailed) {
    this.serviceNamesFailed = serviceNamesFailed;
    return this;
  }

  public DeletedData addServiceNamesFailedItem(String serviceNamesFailedItem) {
    if (this.serviceNamesFailed == null) {
      this.serviceNamesFailed = new ArrayList<>();
    }
    this.serviceNamesFailed.add(serviceNamesFailedItem);
    return this;
  }

  /**
   * Test service names that failed to delete
   * @return serviceNamesFailed
  **/
  @ApiModelProperty(value = "Test service names that failed to delete")


  public List<String> getServiceNamesFailed() {
    return serviceNamesFailed;
  }

  public void setServiceNamesFailed(List<String> serviceNamesFailed) {
    this.serviceNamesFailed = serviceNamesFailed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedData deletedData = (DeletedData) o;
    return Objects.equals(this.testDataPrefix, deletedData.testDataPrefix) &&
        Objects.equals(this.userNamesRequested, deletedData.userNamesRequested) &&
        Objects.equals(this.userNamesFound, deletedData.userNamesFound) &&
        Objects.equals(this.userNamesDeleted, deletedData.userNamesDeleted) &&
        Objects.equals(this.userNamesFailed, deletedData.userNamesFailed) &&
        Objects.equals(this.roleNamesRequested, deletedData.roleNamesRequested) &&
        Objects.equals(this.roleNamesFound, deletedData.roleNamesFound) &&
        Objects.equals(this.roleNamesDeleted, deletedData.roleNamesDeleted) &&
        Objects.equals(this.roleNamesFailed, deletedData.roleNamesFailed) &&
        Objects.equals(this.serviceNamesRequested, deletedData.serviceNamesRequested) &&
        Objects.equals(this.serviceNamesFound, deletedData.serviceNamesFound) &&
        Objects.equals(this.serviceNamesDeleted, deletedData.serviceNamesDeleted) &&
        Objects.equals(this.serviceNamesFailed, deletedData.serviceNamesFailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testDataPrefix, userNamesRequested, userNamesFound, userNamesDeleted, userNamesFailed, roleNamesRequested, roleNamesFound, roleNamesDeleted, roleNamesFailed, serviceNamesRequested, serviceNamesFound, serviceNamesDeleted, serviceNamesFailed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedData {\n");
    
    sb.append("    testDataPrefix: ").append(toIndentedString(testDataPrefix)).append("\n");
    sb.append("    userNamesRequested: ").append(toIndentedString(userNamesRequested)).append("\n");
    sb.append("    userNamesFound: ").append(toIndentedString(userNamesFound)).append("\n");
    sb.append("    userNamesDeleted: ").append(toIndentedString(userNamesDeleted)).append("\n");
    sb.append("    userNamesFailed: ").append(toIndentedString(userNamesFailed)).append("\n");
    sb.append("    roleNamesRequested: ").append(toIndentedString(roleNamesRequested)).append("\n");
    sb.append("    roleNamesFound: ").append(toIndentedString(roleNamesFound)).append("\n");
    sb.append("    roleNamesDeleted: ").append(toIndentedString(roleNamesDeleted)).append("\n");
    sb.append("    roleNamesFailed: ").append(toIndentedString(roleNamesFailed)).append("\n");
    sb.append("    serviceNamesRequested: ").append(toIndentedString(serviceNamesRequested)).append("\n");
    sb.append("    serviceNamesFound: ").append(toIndentedString(serviceNamesFound)).append("\n");
    sb.append("    serviceNamesDeleted: ").append(toIndentedString(serviceNamesDeleted)).append("\n");
    sb.append("    serviceNamesFailed: ").append(toIndentedString(serviceNamesFailed)).append("\n");
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

