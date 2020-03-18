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
import io.swagger.client.model.PlateFormat;
import io.swagger.client.model.VendorSample;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VendorPlate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class VendorPlate {

  @SerializedName("clientPlateBarcode")
  private String clientPlateBarcode = null;

  @SerializedName("clientPlateId")
  private String clientPlateId = null;

  @SerializedName("sampleSubmissionFormat")
  private PlateFormat sampleSubmissionFormat = null;

  @SerializedName("samples")
  private List<VendorSample> samples = null;
  public VendorPlate clientPlateBarcode(String clientPlateBarcode) {
    this.clientPlateBarcode = clientPlateBarcode;
    return this;
  }

  

  /**
  * (Optional) The value of the bar code attached to this plate
  * @return clientPlateBarcode
  **/
  @Schema(description = "(Optional) The value of the bar code attached to this plate")
  public String getClientPlateBarcode() {
    return clientPlateBarcode;
  }
  public void setClientPlateBarcode(String clientPlateBarcode) {
    this.clientPlateBarcode = clientPlateBarcode;
  }
  public VendorPlate clientPlateId(String clientPlateId) {
    this.clientPlateId = clientPlateId;
    return this;
  }

  

  /**
  * The ID which uniquely identifies this plate to the client making the request
  * @return clientPlateId
  **/
  @Schema(description = "The ID which uniquely identifies this plate to the client making the request")
  public String getClientPlateId() {
    return clientPlateId;
  }
  public void setClientPlateId(String clientPlateId) {
    this.clientPlateId = clientPlateId;
  }
  public VendorPlate sampleSubmissionFormat(PlateFormat sampleSubmissionFormat) {
    this.sampleSubmissionFormat = sampleSubmissionFormat;
    return this;
  }

  

  /**
  * Get sampleSubmissionFormat
  * @return sampleSubmissionFormat
  **/
  @Schema(description = "")
  public PlateFormat getSampleSubmissionFormat() {
    return sampleSubmissionFormat;
  }
  public void setSampleSubmissionFormat(PlateFormat sampleSubmissionFormat) {
    this.sampleSubmissionFormat = sampleSubmissionFormat;
  }
  public VendorPlate samples(List<VendorSample> samples) {
    this.samples = samples;
    return this;
  }

  public VendorPlate addSamplesItem(VendorSample samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<VendorSample>();
    }
    this.samples.add(samplesItem);
    return this;
  }

  /**
  * Get samples
  * @return samples
  **/
  @Schema(description = "")
  public List<VendorSample> getSamples() {
    return samples;
  }
  public void setSamples(List<VendorSample> samples) {
    this.samples = samples;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorPlate vendorPlate = (VendorPlate) o;
    return Objects.equals(this.clientPlateBarcode, vendorPlate.clientPlateBarcode) &&
        Objects.equals(this.clientPlateId, vendorPlate.clientPlateId) &&
        Objects.equals(this.sampleSubmissionFormat, vendorPlate.sampleSubmissionFormat) &&
        Objects.equals(this.samples, vendorPlate.samples);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(clientPlateBarcode, clientPlateId, sampleSubmissionFormat, samples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorPlate {\n");
    
    sb.append("    clientPlateBarcode: ").append(toIndentedString(clientPlateBarcode)).append("\n");
    sb.append("    clientPlateId: ").append(toIndentedString(clientPlateId)).append("\n");
    sb.append("    sampleSubmissionFormat: ").append(toIndentedString(sampleSubmissionFormat)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
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