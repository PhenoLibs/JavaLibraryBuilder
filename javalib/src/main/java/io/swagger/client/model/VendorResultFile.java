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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VendorResultFile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class VendorResultFile {

  @SerializedName("additionalInfo")
  private Map<String, String> additionalInfo = null;

  @SerializedName("clientSampleIds")
  private List<String> clientSampleIds = new ArrayList<String>();

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("fileType")
  private String fileType = null;

  @SerializedName("fileURL")
  private String fileURL = null;

  @SerializedName("md5sum")
  private String md5sum = null;
  public VendorResultFile additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  
  public VendorResultFile putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = null;
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }
  /**
  * Additional arbitrary info
  * @return additionalInfo
  **/
  @Schema(description = "Additional arbitrary info")
  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }
  public VendorResultFile clientSampleIds(List<String> clientSampleIds) {
    this.clientSampleIds = clientSampleIds;
    return this;
  }

  public VendorResultFile addClientSampleIdsItem(String clientSampleIdsItem) {
    this.clientSampleIds.add(clientSampleIdsItem);
    return this;
  }

  /**
  * The list of sampleDbIds included in the file
  * @return clientSampleIds
  **/
  @Schema(required = true, description = "The list of sampleDbIds included in the file")
  public List<String> getClientSampleIds() {
    return clientSampleIds;
  }
  public void setClientSampleIds(List<String> clientSampleIds) {
    this.clientSampleIds = clientSampleIds;
  }
  public VendorResultFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  

  /**
  * Name of the file
  * @return fileName
  **/
  @Schema(required = true, description = "Name of the file")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
  public VendorResultFile fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

  

  /**
  * Format of the file
  * @return fileType
  **/
  @Schema(required = true, description = "Format of the file")
  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }
  public VendorResultFile fileURL(String fileURL) {
    this.fileURL = fileURL;
    return this;
  }

  

  /**
  * The URL to a file with the results of a vendor analysis
  * @return fileURL
  **/
  @Schema(required = true, description = "The URL to a file with the results of a vendor analysis")
  public String getFileURL() {
    return fileURL;
  }
  public void setFileURL(String fileURL) {
    this.fileURL = fileURL;
  }
  public VendorResultFile md5sum(String md5sum) {
    this.md5sum = md5sum;
    return this;
  }

  

  /**
  * MD5 Hash Check Sum for the file to confirm download without error
  * @return md5sum
  **/
  @Schema(description = "MD5 Hash Check Sum for the file to confirm download without error")
  public String getMd5sum() {
    return md5sum;
  }
  public void setMd5sum(String md5sum) {
    this.md5sum = md5sum;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorResultFile vendorResultFile = (VendorResultFile) o;
    return Objects.equals(this.additionalInfo, vendorResultFile.additionalInfo) &&
        Objects.equals(this.clientSampleIds, vendorResultFile.clientSampleIds) &&
        Objects.equals(this.fileName, vendorResultFile.fileName) &&
        Objects.equals(this.fileType, vendorResultFile.fileType) &&
        Objects.equals(this.fileURL, vendorResultFile.fileURL) &&
        Objects.equals(this.md5sum, vendorResultFile.md5sum);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(additionalInfo, clientSampleIds, fileName, fileType, fileURL, md5sum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorResultFile {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    clientSampleIds: ").append(toIndentedString(clientSampleIds)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    fileURL: ").append(toIndentedString(fileURL)).append("\n");
    sb.append("    md5sum: ").append(toIndentedString(md5sum)).append("\n");
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
