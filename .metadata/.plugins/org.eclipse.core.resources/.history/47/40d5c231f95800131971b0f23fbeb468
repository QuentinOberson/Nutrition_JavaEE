/**
 * IsRegisteredResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package model.business.service;

public class IsRegisteredResponse  implements java.io.Serializable {
    private boolean isRegisteredReturn;

    public IsRegisteredResponse() {
    }

    public IsRegisteredResponse(
           boolean isRegisteredReturn) {
           this.isRegisteredReturn = isRegisteredReturn;
    }


    /**
     * Gets the isRegisteredReturn value for this IsRegisteredResponse.
     * 
     * @return isRegisteredReturn
     */
    public boolean isIsRegisteredReturn() {
        return isRegisteredReturn;
    }


    /**
     * Sets the isRegisteredReturn value for this IsRegisteredResponse.
     * 
     * @param isRegisteredReturn
     */
    public void setIsRegisteredReturn(boolean isRegisteredReturn) {
        this.isRegisteredReturn = isRegisteredReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsRegisteredResponse)) return false;
        IsRegisteredResponse other = (IsRegisteredResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.isRegisteredReturn == other.isIsRegisteredReturn();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isIsRegisteredReturn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsRegisteredResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.business.model", ">isRegisteredResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRegisteredReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.business.model", "isRegisteredReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
