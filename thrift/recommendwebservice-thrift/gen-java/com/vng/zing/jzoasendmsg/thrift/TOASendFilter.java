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

public class TOASendFilter implements org.apache.thrift.TBase<TOASendFilter, TOASendFilter._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TOASendFilter");

  private static final org.apache.thrift.protocol.TField GENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("gender", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField FROM_AGE_FIELD_DESC = new org.apache.thrift.protocol.TField("fromAge", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TO_AGE_FIELD_DESC = new org.apache.thrift.protocol.TField("toAge", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField LOCATE_FIELD_DESC = new org.apache.thrift.protocol.TField("locate", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TOASendFilterStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TOASendFilterTupleSchemeFactory());
  }

  public boolean gender; // optional
  public int fromAge; // optional
  public int toAge; // optional
  public TLocationCondition locate; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GENDER((short)1, "gender"),
    FROM_AGE((short)2, "fromAge"),
    TO_AGE((short)3, "toAge"),
    LOCATE((short)4, "locate");

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
        case 1: // GENDER
          return GENDER;
        case 2: // FROM_AGE
          return FROM_AGE;
        case 3: // TO_AGE
          return TO_AGE;
        case 4: // LOCATE
          return LOCATE;
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
  private static final int __GENDER_ISSET_ID = 0;
  private static final int __FROMAGE_ISSET_ID = 1;
  private static final int __TOAGE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.GENDER,_Fields.FROM_AGE,_Fields.TO_AGE,_Fields.LOCATE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GENDER, new org.apache.thrift.meta_data.FieldMetaData("gender", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FROM_AGE, new org.apache.thrift.meta_data.FieldMetaData("fromAge", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TO_AGE, new org.apache.thrift.meta_data.FieldMetaData("toAge", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LOCATE, new org.apache.thrift.meta_data.FieldMetaData("locate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TLocationCondition.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TOASendFilter.class, metaDataMap);
  }

  public TOASendFilter() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TOASendFilter(TOASendFilter other) {
    __isset_bitfield = other.__isset_bitfield;
    this.gender = other.gender;
    this.fromAge = other.fromAge;
    this.toAge = other.toAge;
    if (other.isSetLocate()) {
      this.locate = new TLocationCondition(other.locate);
    }
  }

  public TOASendFilter deepCopy() {
    return new TOASendFilter(this);
  }

  @Override
  public void clear() {
    setGenderIsSet(false);
    this.gender = false;
    setFromAgeIsSet(false);
    this.fromAge = 0;
    setToAgeIsSet(false);
    this.toAge = 0;
    this.locate = null;
  }

  public boolean isGender() {
    return this.gender;
  }

  public TOASendFilter setGender(boolean gender) {
    this.gender = gender;
    setGenderIsSet(true);
    return this;
  }

  public void unsetGender() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GENDER_ISSET_ID);
  }

  /** Returns true if field gender is set (has been assigned a value) and false otherwise */
  public boolean isSetGender() {
    return EncodingUtils.testBit(__isset_bitfield, __GENDER_ISSET_ID);
  }

  public void setGenderIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GENDER_ISSET_ID, value);
  }

  public int getFromAge() {
    return this.fromAge;
  }

  public TOASendFilter setFromAge(int fromAge) {
    this.fromAge = fromAge;
    setFromAgeIsSet(true);
    return this;
  }

  public void unsetFromAge() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FROMAGE_ISSET_ID);
  }

  /** Returns true if field fromAge is set (has been assigned a value) and false otherwise */
  public boolean isSetFromAge() {
    return EncodingUtils.testBit(__isset_bitfield, __FROMAGE_ISSET_ID);
  }

  public void setFromAgeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FROMAGE_ISSET_ID, value);
  }

  public int getToAge() {
    return this.toAge;
  }

  public TOASendFilter setToAge(int toAge) {
    this.toAge = toAge;
    setToAgeIsSet(true);
    return this;
  }

  public void unsetToAge() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOAGE_ISSET_ID);
  }

  /** Returns true if field toAge is set (has been assigned a value) and false otherwise */
  public boolean isSetToAge() {
    return EncodingUtils.testBit(__isset_bitfield, __TOAGE_ISSET_ID);
  }

  public void setToAgeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOAGE_ISSET_ID, value);
  }

  public TLocationCondition getLocate() {
    return this.locate;
  }

  public TOASendFilter setLocate(TLocationCondition locate) {
    this.locate = locate;
    return this;
  }

  public void unsetLocate() {
    this.locate = null;
  }

  /** Returns true if field locate is set (has been assigned a value) and false otherwise */
  public boolean isSetLocate() {
    return this.locate != null;
  }

  public void setLocateIsSet(boolean value) {
    if (!value) {
      this.locate = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GENDER:
      if (value == null) {
        unsetGender();
      } else {
        setGender((Boolean)value);
      }
      break;

    case FROM_AGE:
      if (value == null) {
        unsetFromAge();
      } else {
        setFromAge((Integer)value);
      }
      break;

    case TO_AGE:
      if (value == null) {
        unsetToAge();
      } else {
        setToAge((Integer)value);
      }
      break;

    case LOCATE:
      if (value == null) {
        unsetLocate();
      } else {
        setLocate((TLocationCondition)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GENDER:
      return Boolean.valueOf(isGender());

    case FROM_AGE:
      return Integer.valueOf(getFromAge());

    case TO_AGE:
      return Integer.valueOf(getToAge());

    case LOCATE:
      return getLocate();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GENDER:
      return isSetGender();
    case FROM_AGE:
      return isSetFromAge();
    case TO_AGE:
      return isSetToAge();
    case LOCATE:
      return isSetLocate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TOASendFilter)
      return this.equals((TOASendFilter)that);
    return false;
  }

  public boolean equals(TOASendFilter that) {
    if (that == null)
      return false;

    boolean this_present_gender = true && this.isSetGender();
    boolean that_present_gender = true && that.isSetGender();
    if (this_present_gender || that_present_gender) {
      if (!(this_present_gender && that_present_gender))
        return false;
      if (this.gender != that.gender)
        return false;
    }

    boolean this_present_fromAge = true && this.isSetFromAge();
    boolean that_present_fromAge = true && that.isSetFromAge();
    if (this_present_fromAge || that_present_fromAge) {
      if (!(this_present_fromAge && that_present_fromAge))
        return false;
      if (this.fromAge != that.fromAge)
        return false;
    }

    boolean this_present_toAge = true && this.isSetToAge();
    boolean that_present_toAge = true && that.isSetToAge();
    if (this_present_toAge || that_present_toAge) {
      if (!(this_present_toAge && that_present_toAge))
        return false;
      if (this.toAge != that.toAge)
        return false;
    }

    boolean this_present_locate = true && this.isSetLocate();
    boolean that_present_locate = true && that.isSetLocate();
    if (this_present_locate || that_present_locate) {
      if (!(this_present_locate && that_present_locate))
        return false;
      if (!this.locate.equals(that.locate))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TOASendFilter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TOASendFilter typedOther = (TOASendFilter)other;

    lastComparison = Boolean.valueOf(isSetGender()).compareTo(typedOther.isSetGender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gender, typedOther.gender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFromAge()).compareTo(typedOther.isSetFromAge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromAge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fromAge, typedOther.fromAge);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToAge()).compareTo(typedOther.isSetToAge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToAge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toAge, typedOther.toAge);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocate()).compareTo(typedOther.isSetLocate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locate, typedOther.locate);
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
    StringBuilder sb = new StringBuilder("TOASendFilter(");
    boolean first = true;

    if (isSetGender()) {
      sb.append("gender:");
      sb.append(this.gender);
      first = false;
    }
    if (isSetFromAge()) {
      if (!first) sb.append(", ");
      sb.append("fromAge:");
      sb.append(this.fromAge);
      first = false;
    }
    if (isSetToAge()) {
      if (!first) sb.append(", ");
      sb.append("toAge:");
      sb.append(this.toAge);
      first = false;
    }
    if (isSetLocate()) {
      if (!first) sb.append(", ");
      sb.append("locate:");
      if (this.locate == null) {
        sb.append("null");
      } else {
        sb.append(this.locate);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (locate != null) {
      locate.validate();
    }
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

  private static class TOASendFilterStandardSchemeFactory implements SchemeFactory {
    public TOASendFilterStandardScheme getScheme() {
      return new TOASendFilterStandardScheme();
    }
  }

  private static class TOASendFilterStandardScheme extends StandardScheme<TOASendFilter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TOASendFilter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.gender = iprot.readBool();
              struct.setGenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FROM_AGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fromAge = iprot.readI32();
              struct.setFromAgeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TO_AGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.toAge = iprot.readI32();
              struct.setToAgeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOCATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.locate = new TLocationCondition();
              struct.locate.read(iprot);
              struct.setLocateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TOASendFilter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetGender()) {
        oprot.writeFieldBegin(GENDER_FIELD_DESC);
        oprot.writeBool(struct.gender);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFromAge()) {
        oprot.writeFieldBegin(FROM_AGE_FIELD_DESC);
        oprot.writeI32(struct.fromAge);
        oprot.writeFieldEnd();
      }
      if (struct.isSetToAge()) {
        oprot.writeFieldBegin(TO_AGE_FIELD_DESC);
        oprot.writeI32(struct.toAge);
        oprot.writeFieldEnd();
      }
      if (struct.locate != null) {
        if (struct.isSetLocate()) {
          oprot.writeFieldBegin(LOCATE_FIELD_DESC);
          struct.locate.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TOASendFilterTupleSchemeFactory implements SchemeFactory {
    public TOASendFilterTupleScheme getScheme() {
      return new TOASendFilterTupleScheme();
    }
  }

  private static class TOASendFilterTupleScheme extends TupleScheme<TOASendFilter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TOASendFilter struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGender()) {
        optionals.set(0);
      }
      if (struct.isSetFromAge()) {
        optionals.set(1);
      }
      if (struct.isSetToAge()) {
        optionals.set(2);
      }
      if (struct.isSetLocate()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetGender()) {
        oprot.writeBool(struct.gender);
      }
      if (struct.isSetFromAge()) {
        oprot.writeI32(struct.fromAge);
      }
      if (struct.isSetToAge()) {
        oprot.writeI32(struct.toAge);
      }
      if (struct.isSetLocate()) {
        struct.locate.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TOASendFilter struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.gender = iprot.readBool();
        struct.setGenderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.fromAge = iprot.readI32();
        struct.setFromAgeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.toAge = iprot.readI32();
        struct.setToAgeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.locate = new TLocationCondition();
        struct.locate.read(iprot);
        struct.setLocateIsSet(true);
      }
    }
  }

}

