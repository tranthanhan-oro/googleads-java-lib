/**
 * DraftStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.cm;

public class DraftStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DraftStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _PROPOSED = "PROPOSED";
    public static final java.lang.String _PROMOTED = "PROMOTED";
    public static final java.lang.String _PROMOTING = "PROMOTING";
    public static final java.lang.String _ARCHIVED = "ARCHIVED";
    public static final java.lang.String _PROMOTE_FAILED = "PROMOTE_FAILED";
    public static final DraftStatus UNKNOWN = new DraftStatus(_UNKNOWN);
    public static final DraftStatus PROPOSED = new DraftStatus(_PROPOSED);
    public static final DraftStatus PROMOTED = new DraftStatus(_PROMOTED);
    public static final DraftStatus PROMOTING = new DraftStatus(_PROMOTING);
    public static final DraftStatus ARCHIVED = new DraftStatus(_ARCHIVED);
    public static final DraftStatus PROMOTE_FAILED = new DraftStatus(_PROMOTE_FAILED);
    public java.lang.String getValue() { return _value_;}
    public static DraftStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DraftStatus enumeration = (DraftStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DraftStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DraftStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "DraftStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
