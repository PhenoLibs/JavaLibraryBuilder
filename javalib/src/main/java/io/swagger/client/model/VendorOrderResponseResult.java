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
import io.swagger.client.model.VendorOrderResponseResultShipmentForms;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Response to an order request
 */
@Schema(description = "Response to an order request")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class VendorOrderResponseResult {

  @SerializedName("orderId")
  private String orderId = null;

  @SerializedName("shipmentForms")
  private List<VendorOrderResponseResultShipmentForms> shipmentForms = null;
  public VendorOrderResponseResult orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  

  /**
  * A unique, alpha-numeric ID which identifies the order .
  * @return orderId
  **/
  @Schema(description = "A unique, alpha-numeric ID which identifies the order .")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }
  public VendorOrderResponseResult shipmentForms(List<VendorOrderResponseResultShipmentForms> shipmentForms) {
    this.shipmentForms = shipmentForms;
    return this;
  }

  public VendorOrderResponseResult addShipmentFormsItem(VendorOrderResponseResultShipmentForms shipmentFormsItem) {
    if (this.shipmentForms == null) {
      this.shipmentForms = new ArrayList<VendorOrderResponseResultShipmentForms>();
    }
    this.shipmentForms.add(shipmentFormsItem);
    return this;
  }

  /**
  * Array of paper forms which need to be printed and included with the physical shipment
  * @return shipmentForms
  **/
  @Schema(description = "Array of paper forms which need to be printed and included with the physical shipment")
  public List<VendorOrderResponseResultShipmentForms> getShipmentForms() {
    return shipmentForms;
  }
  public void setShipmentForms(List<VendorOrderResponseResultShipmentForms> shipmentForms) {
    this.shipmentForms = shipmentForms;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorOrderResponseResult vendorOrderResponseResult = (VendorOrderResponseResult) o;
    return Objects.equals(this.orderId, vendorOrderResponseResult.orderId) &&
        Objects.equals(this.shipmentForms, vendorOrderResponseResult.shipmentForms);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(orderId, shipmentForms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorOrderResponseResult {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    shipmentForms: ").append(toIndentedString(shipmentForms)).append("\n");
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
