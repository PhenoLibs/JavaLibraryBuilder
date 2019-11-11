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
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Image
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class Image {

  @SerializedName("additionalInfo")
  private Map<String, String> additionalInfo = null;

  @SerializedName("copyright")
  private String copyright = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("descriptiveOntologyTerms")
  private List<String> descriptiveOntologyTerms = null;

  @SerializedName("imageDbId")
  private String imageDbId = null;

  @SerializedName("imageFileName")
  private String imageFileName = null;

  @SerializedName("imageFileSize")
  private Integer imageFileSize = null;

  @SerializedName("imageHeight")
  private Integer imageHeight = null;

  @SerializedName("imageLocation")
  private GeoJSON imageLocation = null;

  @SerializedName("imageName")
  private String imageName = null;

  @SerializedName("imageTimeStamp")
  private OffsetDateTime imageTimeStamp = null;

  @SerializedName("imageURL")
  private String imageURL = null;

  @SerializedName("imageWidth")
  private Integer imageWidth = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("observationDbIds")
  private List<String> observationDbIds = null;

  @SerializedName("observationUnitDbId")
  private String observationUnitDbId = null;
  public Image additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  
  public Image putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = null;
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }
  /**
  * Get additionalInfo
  * @return additionalInfo
  **/
  @Schema(description = "")
  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }
  public Image copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

  

  /**
  * The copyright information of this image. Example &#x27;Copyright 2018 Bob Robertson&#x27;
  * @return copyright
  **/
  @Schema(description = "The copyright information of this image. Example 'Copyright 2018 Bob Robertson'")
  public String getCopyright() {
    return copyright;
  }
  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }
  public Image description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * The human readable description of an image.
  * @return description
  **/
  @Schema(description = "The human readable description of an image.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Image descriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
    this.descriptiveOntologyTerms = descriptiveOntologyTerms;
    return this;
  }

  public Image addDescriptiveOntologyTermsItem(String descriptiveOntologyTermsItem) {
    if (this.descriptiveOntologyTerms == null) {
      this.descriptiveOntologyTerms = new ArrayList<String>();
    }
    this.descriptiveOntologyTerms.add(descriptiveOntologyTermsItem);
    return this;
  }

  /**
  * A list of terms to formally describe the image. Each item could be a simple Tag, an Ontology reference Id, or a full ontology URL.
  * @return descriptiveOntologyTerms
  **/
  @Schema(description = "A list of terms to formally describe the image. Each item could be a simple Tag, an Ontology reference Id, or a full ontology URL.")
  public List<String> getDescriptiveOntologyTerms() {
    return descriptiveOntologyTerms;
  }
  public void setDescriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
    this.descriptiveOntologyTerms = descriptiveOntologyTerms;
  }
  public Image imageDbId(String imageDbId) {
    this.imageDbId = imageDbId;
    return this;
  }

  

  /**
  * The unique identifier of an image
  * @return imageDbId
  **/
  @Schema(description = "The unique identifier of an image")
  public String getImageDbId() {
    return imageDbId;
  }
  public void setImageDbId(String imageDbId) {
    this.imageDbId = imageDbId;
  }
  public Image imageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
    return this;
  }

  

  /**
  * The name of the image file. Might be the same as &#x27;imageName&#x27;, but could be different.
  * @return imageFileName
  **/
  @Schema(description = "The name of the image file. Might be the same as 'imageName', but could be different.")
  public String getImageFileName() {
    return imageFileName;
  }
  public void setImageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
  }
  public Image imageFileSize(Integer imageFileSize) {
    this.imageFileSize = imageFileSize;
    return this;
  }

  

  /**
  * The size of the image in Bytes.
  * @return imageFileSize
  **/
  @Schema(description = "The size of the image in Bytes.")
  public Integer getImageFileSize() {
    return imageFileSize;
  }
  public void setImageFileSize(Integer imageFileSize) {
    this.imageFileSize = imageFileSize;
  }
  public Image imageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
    return this;
  }

  

  /**
  * The height of the image in Pixels.
  * @return imageHeight
  **/
  @Schema(description = "The height of the image in Pixels.")
  public Integer getImageHeight() {
    return imageHeight;
  }
  public void setImageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
  }
  public Image imageLocation(GeoJSON imageLocation) {
    this.imageLocation = imageLocation;
    return this;
  }

  

  /**
  * Get imageLocation
  * @return imageLocation
  **/
  @Schema(description = "")
  public GeoJSON getImageLocation() {
    return imageLocation;
  }
  public void setImageLocation(GeoJSON imageLocation) {
    this.imageLocation = imageLocation;
  }
  public Image imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

  

  /**
  * The human readable name of an image. Might be the same as &#x27;imageFileName&#x27;, but could be different.
  * @return imageName
  **/
  @Schema(description = "The human readable name of an image. Might be the same as 'imageFileName', but could be different.")
  public String getImageName() {
    return imageName;
  }
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }
  public Image imageTimeStamp(OffsetDateTime imageTimeStamp) {
    this.imageTimeStamp = imageTimeStamp;
    return this;
  }

  

  /**
  * The date and time the image was taken
  * @return imageTimeStamp
  **/
  @Schema(description = "The date and time the image was taken")
  public OffsetDateTime getImageTimeStamp() {
    return imageTimeStamp;
  }
  public void setImageTimeStamp(OffsetDateTime imageTimeStamp) {
    this.imageTimeStamp = imageTimeStamp;
  }
  public Image imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

  

  /**
  * The complete, absolute URI path to the image file. Images might be stored on a different host or path than the BrAPI web server.
  * @return imageURL
  **/
  @Schema(description = "The complete, absolute URI path to the image file. Images might be stored on a different host or path than the BrAPI web server.")
  public String getImageURL() {
    return imageURL;
  }
  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }
  public Image imageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
    return this;
  }

  

  /**
  * The width of the image in Pixels.
  * @return imageWidth
  **/
  @Schema(description = "The width of the image in Pixels.")
  public Integer getImageWidth() {
    return imageWidth;
  }
  public void setImageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
  }
  public Image mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  

  /**
  * The file type of the image. Examples &#x27;image/jpeg&#x27;, &#x27;image/png&#x27;, &#x27;image/svg&#x27;, etc
  * @return mimeType
  **/
  @Schema(description = "The file type of the image. Examples 'image/jpeg', 'image/png', 'image/svg', etc")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }
  public Image observationDbIds(List<String> observationDbIds) {
    this.observationDbIds = observationDbIds;
    return this;
  }

  public Image addObservationDbIdsItem(String observationDbIdsItem) {
    if (this.observationDbIds == null) {
      this.observationDbIds = new ArrayList<String>();
    }
    this.observationDbIds.add(observationDbIdsItem);
    return this;
  }

  /**
  * A list of observation Ids this image is associated with, if applicable.
  * @return observationDbIds
  **/
  @Schema(description = "A list of observation Ids this image is associated with, if applicable.")
  public List<String> getObservationDbIds() {
    return observationDbIds;
  }
  public void setObservationDbIds(List<String> observationDbIds) {
    this.observationDbIds = observationDbIds;
  }
  public Image observationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
    return this;
  }

  

  /**
  * The related observation unit identifier, if relevent.
  * @return observationUnitDbId
  **/
  @Schema(description = "The related observation unit identifier, if relevent.")
  public String getObservationUnitDbId() {
    return observationUnitDbId;
  }
  public void setObservationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.additionalInfo, image.additionalInfo) &&
        Objects.equals(this.copyright, image.copyright) &&
        Objects.equals(this.description, image.description) &&
        Objects.equals(this.descriptiveOntologyTerms, image.descriptiveOntologyTerms) &&
        Objects.equals(this.imageDbId, image.imageDbId) &&
        Objects.equals(this.imageFileName, image.imageFileName) &&
        Objects.equals(this.imageFileSize, image.imageFileSize) &&
        Objects.equals(this.imageHeight, image.imageHeight) &&
        Objects.equals(this.imageLocation, image.imageLocation) &&
        Objects.equals(this.imageName, image.imageName) &&
        Objects.equals(this.imageTimeStamp, image.imageTimeStamp) &&
        Objects.equals(this.imageURL, image.imageURL) &&
        Objects.equals(this.imageWidth, image.imageWidth) &&
        Objects.equals(this.mimeType, image.mimeType) &&
        Objects.equals(this.observationDbIds, image.observationDbIds) &&
        Objects.equals(this.observationUnitDbId, image.observationUnitDbId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(additionalInfo, copyright, description, descriptiveOntologyTerms, imageDbId, imageFileName, imageFileSize, imageHeight, imageLocation, imageName, imageTimeStamp, imageURL, imageWidth, mimeType, observationDbIds, observationUnitDbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptiveOntologyTerms: ").append(toIndentedString(descriptiveOntologyTerms)).append("\n");
    sb.append("    imageDbId: ").append(toIndentedString(imageDbId)).append("\n");
    sb.append("    imageFileName: ").append(toIndentedString(imageFileName)).append("\n");
    sb.append("    imageFileSize: ").append(toIndentedString(imageFileSize)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    imageLocation: ").append(toIndentedString(imageLocation)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageTimeStamp: ").append(toIndentedString(imageTimeStamp)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    observationDbIds: ").append(toIndentedString(observationDbIds)).append("\n");
    sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
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
