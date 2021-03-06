/**
 * DataErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

public class DataErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DataErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_CREATE_TABLE_ENTRY = "CANNOT_CREATE_TABLE_ENTRY";
    public static final java.lang.String _NO_TABLE_ENTRY_CLASS_FOR_VIEW_TYPE = "NO_TABLE_ENTRY_CLASS_FOR_VIEW_TYPE";
    public static final java.lang.String _TABLE_SERVICE_ERROR = "TABLE_SERVICE_ERROR";
    public static final DataErrorReason CANNOT_CREATE_TABLE_ENTRY = new DataErrorReason(_CANNOT_CREATE_TABLE_ENTRY);
    public static final DataErrorReason NO_TABLE_ENTRY_CLASS_FOR_VIEW_TYPE = new DataErrorReason(_NO_TABLE_ENTRY_CLASS_FOR_VIEW_TYPE);
    public static final DataErrorReason TABLE_SERVICE_ERROR = new DataErrorReason(_TABLE_SERVICE_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static DataErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DataErrorReason enumeration = (DataErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DataErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DataError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
