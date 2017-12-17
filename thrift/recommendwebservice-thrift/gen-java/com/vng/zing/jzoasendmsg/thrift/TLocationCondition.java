/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vng.zing.jzoasendmsg.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TLocationCondition implements org.apache.thrift.TBase<TLocationCondition, TLocationCondition._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLocationCondition");

  private static final org.apache.thrift.protocol.TField LAT_FIELD_DESC = new org.apache.thrift.protocol.TField("lat", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField LON_FIELD_DESC = new org.apache.thrift.protocol.TField("lon", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField RADIUS_FIELD_DESC = new org.apache.thrift.protocol.TField("radius", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TLocationConditionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TLocationConditionTupleSchemeFactory());
  }

  public double lat; // optional
  public double lon; // optional
  public int radius; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LAT((short)1, "lat"),
    LON((short)2, "lon"),
    RADIUS((short)3, "radius");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LAT
          return LAT;
        case 2: // LON
          return LON;
        case 3: // RADIUS
          return RADIUS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LAT_ISSET_ID = 0;
  private static final int __LON_ISSET_ID = 1;
  private static final int __RADIUS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.LAT,_Fields.LON,_Fields.RADIUS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LAT, new org.apache.thrift.meta_data.FieldMetaData("lat", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.LON, new org.apache.thrift.meta_data.FieldMetaData("lon", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.RADIUS, new org.apache.thrift.meta_data.FieldMetaData("radius", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLocationCondition.class, metaDataMap);
  }

  public TLocationCondition() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLocationCondition(TLocationCondition other) {
    __isset_bitfield = other.__isset_bitfield;
    this.lat = other.lat;
    this.lon = other.lon;
    this.radius = other.radius;
  }

  public TLocationCondition deepCopy() {
    return new TLocationCondition(this);
  }

  @Override
  public void clear() {
    setLatIsSet(false);
    this.lat = 0.0;
    setLonIsSet(false);
    this.lon = 0.0;
    setRadiusIsSet(false);
    this.radius = 0;
  }

  public double getLat() {
    return this.lat;
  }

  public TLocationCondition setLat(double lat) {
    this.lat = lat;
    setLatIsSet(true);
    return this;
  }

  public void unsetLat() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LAT_ISSET_ID);
  }

  /** Returns true if field lat is set (has been assigned a value) and false otherwise */
  public boolean isSetLat() {
    return EncodingUtils.testBit(__isset_bitfield, __LAT_ISSET_ID);
  }

  public void setLatIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LAT_ISSET_ID, value);
  }

  public double getLon() {
    return this.lon;
  }

  public TLocationCondition setLon(double lon) {
    this.lon = lon;
    setLonIsSet(true);
    return this;
  }

  public void unsetLon() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LON_ISSET_ID);
  }

  /** Returns true if field lon is set (has been assigned a value) and false otherwise */
  public boolean isSetLon() {
    return EncodingUtils.testBit(__isset_bitfield, __LON_ISSET_ID);
  }

  public void setLonIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LON_ISSET_ID, value);
  }

  public int getRadius() {
    return this.radius;
  }

  public TLocationCondition setRadius(int radius) {
    this.radius = radius;
    setRadiusIsSet(true);
    return this;
  }

  public void unsetRadius() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RADIUS_ISSET_ID);
  }

  /** Returns true if field radius is set (has been assigned a value) and false otherwise */
  public boolean isSetRadius() {
    return EncodingUtils.testBit(__isset_bitfield, __RADIUS_ISSET_ID);
  }

  public void setRadiusIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RADIUS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LAT:
      if (value == null) {
        unsetLat();
      } else {
        setLat((Double)value);
      }
      break;

    case LON:
      if (value == null) {
        unsetLon();
      } else {
        setLon((Double)value);
      }
      break;

    case RADIUS:
      if (value == null) {
        unsetRadius();
      } else {
        setRadius((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LAT:
      return Double.valueOf(getLat());

    case LON:
      return Double.valueOf(getLon());

    case RADIUS:
      return Integer.valueOf(getRadius());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LAT:
      return isSetLat();
    case LON:
      return isSetLon();
    case RADIUS:
      return isSetRadius();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TLocationCondition)
      return this.equals((TLocationCondition)that);
    return false;
  }

  public boolean equals(TLocationCondition that) {
    if (that == null)
      return false;

    boolean this_present_lat = true && this.isSetLat();
    boolean that_present_lat = true && that.isSetLat();
    if (this_present_lat || that_present_lat) {
      if (!(this_present_lat && that_present_lat))
        return false;
      if (this.lat != that.lat)
        return false;
    }

    boolean this_present_lon = true && this.isSetLon();
    boolean that_present_lon = true && that.isSetLon();
    if (this_present_lon || that_present_lon) {
      if (!(this_present_lon && that_present_lon))
        return false;
      if (this.lon != that.lon)
        return false;
    }

    boolean this_present_radius = true && this.isSetRadius();
    boolean that_present_radius = true && that.isSetRadius();
    if (this_present_radius || that_present_radius) {
      if (!(this_present_radius && that_present_radius))
        return false;
      if (this.radius != that.radius)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TLocationCondition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TLocationCondition typedOther = (TLocationCondition)other;

    lastComparison = Boolean.valueOf(isSetLat()).compareTo(typedOther.isSetLat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lat, typedOther.lat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLon()).compareTo(typedOther.isSetLon());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLon()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lon, typedOther.lon);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRadius()).compareTo(typedOther.isSetRadius());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRadius()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.radius, typedOther.radius);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TLocationCondition(");
    boolean first = true;

    if (isSetLat()) {
      sb.append("lat:");
      sb.append(this.lat);
      first = false;
    }
    if (isSetLon()) {
      if (!first) sb.append(", ");
      sb.append("lon:");
      sb.append(this.lon);
      first = false;
    }
    if (isSetRadius()) {
      if (!first) sb.append(", ");
      sb.append("radius:");
      sb.append(this.radius);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TLocationConditionStandardSchemeFactory implements SchemeFactory {
    public TLocationConditionStandardScheme getScheme() {
      return new TLocationConditionStandardScheme();
    }
  }

  private static class TLocationConditionStandardScheme extends StandardScheme<TLocationCondition> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLocationCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LAT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.lat = iprot.readDouble();
              struct.setLatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LON
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.lon = iprot.readDouble();
              struct.setLonIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RADIUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.radius = iprot.readI32();
              struct.setRadiusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLocationCondition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetLat()) {
        oprot.writeFieldBegin(LAT_FIELD_DESC);
        oprot.writeDouble(struct.lat);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLon()) {
        oprot.writeFieldBegin(LON_FIELD_DESC);
        oprot.writeDouble(struct.lon);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRadius()) {
        oprot.writeFieldBegin(RADIUS_FIELD_DESC);
        oprot.writeI32(struct.radius);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLocationConditionTupleSchemeFactory implements SchemeFactory {
    public TLocationConditionTupleScheme getScheme() {
      return new TLocationConditionTupleScheme();
    }
  }

  private static class TLocationConditionTupleScheme extends TupleScheme<TLocationCondition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLocationCondition struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLat()) {
        optionals.set(0);
      }
      if (struct.isSetLon()) {
        optionals.set(1);
      }
      if (struct.isSetRadius()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetLat()) {
        oprot.writeDouble(struct.lat);
      }
      if (struct.isSetLon()) {
        oprot.writeDouble(struct.lon);
      }
      if (struct.isSetRadius()) {
        oprot.writeI32(struct.radius);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLocationCondition struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.lat = iprot.readDouble();
        struct.setLatIsSet(true);
      }
      if (incoming.get(1)) {
        struct.lon = iprot.readDouble();
        struct.setLonIsSet(true);
      }
      if (incoming.get(2)) {
        struct.radius = iprot.readI32();
        struct.setRadiusIsSet(true);
      }
    }
  }

}
