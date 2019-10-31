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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * MarkerSummaryLinkageGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class MarkerSummaryLinkageGroup {

  @SerializedName("location")
  private String location = null;

  @SerializedName("markerDbId")
  private String markerDbId = null;

  @SerializedName("markerName")
  private String markerName = null;
  public MarkerSummaryLinkageGroup location(String location) {
    this.location = location;
    return this;
  }

  

  /**
  * The position of a marker within a linkage group
  * @return location
  **/
  @Schema(description = "The position of a marker within a linkage group")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }
  public MarkerSummaryLinkageGroup markerDbId(String markerDbId) {
    this.markerDbId = markerDbId;
    return this;
  }

  

  /**
  * Internal db identifier
  * @return markerDbId
  **/
  @Schema(description = "Internal db identifier")
  public String getMarkerDbId() {
    return markerDbId;
  }
  public void setMarkerDbId(String markerDbId) {
    this.markerDbId = markerDbId;
  }
  public MarkerSummaryLinkageGroup markerName(String markerName) {
    this.markerName = markerName;
    return this;
  }

  

  /**
  * The human readable name for a marker
  * @return markerName
  **/
  @Schema(description = "The human readable name for a marker")
  public String getMarkerName() {
    return markerName;
  }
  public void setMarkerName(String markerName) {
    this.markerName = markerName;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkerSummaryLinkageGroup markerSummaryLinkageGroup = (MarkerSummaryLinkageGroup) o;
    return Objects.equals(this.location, markerSummaryLinkageGroup.location) &&
        Objects.equals(this.markerDbId, markerSummaryLinkageGroup.markerDbId) &&
        Objects.equals(this.markerName, markerSummaryLinkageGroup.markerName);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(location, markerDbId, markerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkerSummaryLinkageGroup {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    markerDbId: ").append(toIndentedString(markerDbId)).append("\n");
    sb.append("    markerName: ").append(toIndentedString(markerName)).append("\n");
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
