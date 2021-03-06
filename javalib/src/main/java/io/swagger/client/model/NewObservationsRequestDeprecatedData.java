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
import io.swagger.client.model.NewObservationsRequestObservations;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * NewObservationsRequestDeprecatedData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class NewObservationsRequestDeprecatedData {

  @SerializedName("observationUnitDbId")
  private String observationUnitDbId = null;

  @SerializedName("observations")
  private List<NewObservationsRequestObservations> observations = null;

  @SerializedName("studyDbId")
  private BigDecimal studyDbId = null;
  public NewObservationsRequestDeprecatedData observationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
    return this;
  }

  

  /**
  * Get observationUnitDbId
  * @return observationUnitDbId
  **/
  @Schema(description = "")
  public String getObservationUnitDbId() {
    return observationUnitDbId;
  }
  public void setObservationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
  }
  public NewObservationsRequestDeprecatedData observations(List<NewObservationsRequestObservations> observations) {
    this.observations = observations;
    return this;
  }

  public NewObservationsRequestDeprecatedData addObservationsItem(NewObservationsRequestObservations observationsItem) {
    if (this.observations == null) {
      this.observations = new ArrayList<NewObservationsRequestObservations>();
    }
    this.observations.add(observationsItem);
    return this;
  }

  /**
  * Get observations
  * @return observations
  **/
  @Schema(description = "")
  public List<NewObservationsRequestObservations> getObservations() {
    return observations;
  }
  public void setObservations(List<NewObservationsRequestObservations> observations) {
    this.observations = observations;
  }
  public NewObservationsRequestDeprecatedData studyDbId(BigDecimal studyDbId) {
    this.studyDbId = studyDbId;
    return this;
  }

  

  /**
  * Get studyDbId
  * @return studyDbId
  **/
  @Schema(description = "")
  public BigDecimal getStudyDbId() {
    return studyDbId;
  }
  public void setStudyDbId(BigDecimal studyDbId) {
    this.studyDbId = studyDbId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewObservationsRequestDeprecatedData newObservationsRequestDeprecatedData = (NewObservationsRequestDeprecatedData) o;
    return Objects.equals(this.observationUnitDbId, newObservationsRequestDeprecatedData.observationUnitDbId) &&
        Objects.equals(this.observations, newObservationsRequestDeprecatedData.observations) &&
        Objects.equals(this.studyDbId, newObservationsRequestDeprecatedData.studyDbId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(observationUnitDbId, observations, studyDbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewObservationsRequestDeprecatedData {\n");
    
    sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
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
