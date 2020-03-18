/*
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.MetadataPagination;
import io.swagger.client.model.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class Metadata {

  @SerializedName("datafiles")
  private List<String> datafiles = null;

  @SerializedName("pagination")
  private MetadataPagination pagination = null;

  @SerializedName("status")
  private List<Status> status = null;
  public Metadata datafiles(List<String> datafiles) {
    this.datafiles = datafiles;
    return this;
  }

  public Metadata addDatafilesItem(String datafilesItem) {
    if (this.datafiles == null) {
      this.datafiles = new ArrayList<String>();
    }
    this.datafiles.add(datafilesItem);
    return this;
  }

  /**
  * The datafiles key contains a list of file paths, which can be relative or complete URLs. These files contain additional information related to the returned object and can be retrieved by a subsequent call. The empty list should be returned if no additional data files are present.
  * @return datafiles
  **/
  @Schema(description = "The datafiles key contains a list of file paths, which can be relative or complete URLs. These files contain additional information related to the returned object and can be retrieved by a subsequent call. The empty list should be returned if no additional data files are present.")
  public List<String> getDatafiles() {
    return datafiles;
  }
  public void setDatafiles(List<String> datafiles) {
    this.datafiles = datafiles;
  }
  public Metadata pagination(MetadataPagination pagination) {
    this.pagination = pagination;
    return this;
  }

  

  /**
  * Get pagination
  * @return pagination
  **/
  @Schema(description = "")
  public MetadataPagination getPagination() {
    return pagination;
  }
  public void setPagination(MetadataPagination pagination) {
    this.pagination = pagination;
  }
  public Metadata status(List<Status> status) {
    this.status = status;
    return this;
  }

  public Metadata addStatusItem(Status statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<Status>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
  * The status field contains a list of informational status messages from the server. If no status is reported, an empty list should be returned. See Error Reporting for more information.
  * @return status
  **/
  @Schema(description = "The status field contains a list of informational status messages from the server. If no status is reported, an empty list should be returned. See Error Reporting for more information.")
  public List<Status> getStatus() {
    return status;
  }
  public void setStatus(List<Status> status) {
    this.status = status;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.datafiles, metadata.datafiles) &&
        Objects.equals(this.pagination, metadata.pagination) &&
        Objects.equals(this.status, metadata.status);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(datafiles, pagination, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    datafiles: ").append(toIndentedString(datafiles)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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