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

public class TOASendGif implements org.apache.thrift.TBase<TOASendGif, TOASendGif._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TOASendGif");

  private static final org.apache.thrift.protocol.TField OA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("oaId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField HREF_FIELD_DESC = new org.apache.thrift.protocol.TField("href", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField THUMB_FIELD_DESC = new org.apache.thrift.protocol.TField("thumb", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField URL_FIELD_DESC = new org.apache.thrift.protocol.TField("url", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField WIDTH_FIELD_DESC = new org.apache.thrift.protocol.TField("width", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField HEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("height", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField IS_OUT_BOX_FIELD_DESC = new org.apache.thrift.protocol.TField("isOutBox", org.apache.thrift.protocol.TType.BOOL, (short)8);
  private static final org.apache.thrift.protocol.TField IS_NOTIFY_FIELD_DESC = new org.apache.thrift.protocol.TField("isNotify", org.apache.thrift.protocol.TType.BOOL, (short)9);
  private static final org.apache.thrift.protocol.TField FILTER_FIELD_DESC = new org.apache.thrift.protocol.TField("filter", org.apache.thrift.protocol.TType.STRUCT, (short)10);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TOASendGifStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TOASendGifTupleSchemeFactory());
  }

  public int oaId; // optional
  public String href; // optional
  public String thumb; // optional
  public String url; // optional
  public String msg; // optional
  public int width; // optional
  public int height; // optional
  public boolean isOutBox; // optional
  public boolean isNotify; // optional
  public TOASendFilter filter; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OA_ID((short)1, "oaId"),
    HREF((short)2, "href"),
    THUMB((short)3, "thumb"),
    URL((short)4, "url"),
    MSG((short)5, "msg"),
    WIDTH((short)6, "width"),
    HEIGHT((short)7, "height"),
    IS_OUT_BOX((short)8, "isOutBox"),
    IS_NOTIFY((short)9, "isNotify"),
    FILTER((short)10, "filter");

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
        case 1: // OA_ID
          return OA_ID;
        case 2: // HREF
          return HREF;
        case 3: // THUMB
          return THUMB;
        case 4: // URL
          return URL;
        case 5: // MSG
          return MSG;
        case 6: // WIDTH
          return WIDTH;
        case 7: // HEIGHT
          return HEIGHT;
        case 8: // IS_OUT_BOX
          return IS_OUT_BOX;
        case 9: // IS_NOTIFY
          return IS_NOTIFY;
        case 10: // FILTER
          return FILTER;
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
  private static final int __OAID_ISSET_ID = 0;
  private static final int __WIDTH_ISSET_ID = 1;
  private static final int __HEIGHT_ISSET_ID = 2;
  private static final int __ISOUTBOX_ISSET_ID = 3;
  private static final int __ISNOTIFY_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.OA_ID,_Fields.HREF,_Fields.THUMB,_Fields.URL,_Fields.MSG,_Fields.WIDTH,_Fields.HEIGHT,_Fields.IS_OUT_BOX,_Fields.IS_NOTIFY,_Fields.FILTER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OA_ID, new org.apache.thrift.meta_data.FieldMetaData("oaId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HREF, new org.apache.thrift.meta_data.FieldMetaData("href", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.THUMB, new org.apache.thrift.meta_data.FieldMetaData("thumb", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.URL, new org.apache.thrift.meta_data.FieldMetaData("url", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WIDTH, new org.apache.thrift.meta_data.FieldMetaData("width", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HEIGHT, new org.apache.thrift.meta_data.FieldMetaData("height", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_OUT_BOX, new org.apache.thrift.meta_data.FieldMetaData("isOutBox", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_NOTIFY, new org.apache.thrift.meta_data.FieldMetaData("isNotify", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FILTER, new org.apache.thrift.meta_data.FieldMetaData("filter", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TOASendFilter.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TOASendGif.class, metaDataMap);
  }

  public TOASendGif() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TOASendGif(TOASendGif other) {
    __isset_bitfield = other.__isset_bitfield;
    this.oaId = other.oaId;
    if (other.isSetHref()) {
      this.href = other.href;
    }
    if (other.isSetThumb()) {
      this.thumb = other.thumb;
    }
    if (other.isSetUrl()) {
      this.url = other.url;
    }
    if (other.isSetMsg()) {
      this.msg = other.msg;
    }
    this.width = other.width;
    this.height = other.height;
    this.isOutBox = other.isOutBox;
    this.isNotify = other.isNotify;
    if (other.isSetFilter()) {
      this.filter = new TOASendFilter(other.filter);
    }
  }

  public TOASendGif deepCopy() {
    return new TOASendGif(this);
  }

  @Override
  public void clear() {
    setOaIdIsSet(false);
    this.oaId = 0;
    this.href = null;
    this.thumb = null;
    this.url = null;
    this.msg = null;
    setWidthIsSet(false);
    this.width = 0;
    setHeightIsSet(false);
    this.height = 0;
    setIsOutBoxIsSet(false);
    this.isOutBox = false;
    setIsNotifyIsSet(false);
    this.isNotify = false;
    this.filter = null;
  }

  public int getOaId() {
    return this.oaId;
  }

  public TOASendGif setOaId(int oaId) {
    this.oaId = oaId;
    setOaIdIsSet(true);
    return this;
  }

  public void unsetOaId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OAID_ISSET_ID);
  }

  /** Returns true if field oaId is set (has been assigned a value) and false otherwise */
  public boolean isSetOaId() {
    return EncodingUtils.testBit(__isset_bitfield, __OAID_ISSET_ID);
  }

  public void setOaIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OAID_ISSET_ID, value);
  }

  public String getHref() {
    return this.href;
  }

  public TOASendGif setHref(String href) {
    this.href = href;
    return this;
  }

  public void unsetHref() {
    this.href = null;
  }

  /** Returns true if field href is set (has been assigned a value) and false otherwise */
  public boolean isSetHref() {
    return this.href != null;
  }

  public void setHrefIsSet(boolean value) {
    if (!value) {
      this.href = null;
    }
  }

  public String getThumb() {
    return this.thumb;
  }

  public TOASendGif setThumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

  public void unsetThumb() {
    this.thumb = null;
  }

  /** Returns true if field thumb is set (has been assigned a value) and false otherwise */
  public boolean isSetThumb() {
    return this.thumb != null;
  }

  public void setThumbIsSet(boolean value) {
    if (!value) {
      this.thumb = null;
    }
  }

  public String getUrl() {
    return this.url;
  }

  public TOASendGif setUrl(String url) {
    this.url = url;
    return this;
  }

  public void unsetUrl() {
    this.url = null;
  }

  /** Returns true if field url is set (has been assigned a value) and false otherwise */
  public boolean isSetUrl() {
    return this.url != null;
  }

  public void setUrlIsSet(boolean value) {
    if (!value) {
      this.url = null;
    }
  }

  public String getMsg() {
    return this.msg;
  }

  public TOASendGif setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  public int getWidth() {
    return this.width;
  }

  public TOASendGif setWidth(int width) {
    this.width = width;
    setWidthIsSet(true);
    return this;
  }

  public void unsetWidth() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WIDTH_ISSET_ID);
  }

  /** Returns true if field width is set (has been assigned a value) and false otherwise */
  public boolean isSetWidth() {
    return EncodingUtils.testBit(__isset_bitfield, __WIDTH_ISSET_ID);
  }

  public void setWidthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WIDTH_ISSET_ID, value);
  }

  public int getHeight() {
    return this.height;
  }

  public TOASendGif setHeight(int height) {
    this.height = height;
    setHeightIsSet(true);
    return this;
  }

  public void unsetHeight() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HEIGHT_ISSET_ID);
  }

  /** Returns true if field height is set (has been assigned a value) and false otherwise */
  public boolean isSetHeight() {
    return EncodingUtils.testBit(__isset_bitfield, __HEIGHT_ISSET_ID);
  }

  public void setHeightIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HEIGHT_ISSET_ID, value);
  }

  public boolean isIsOutBox() {
    return this.isOutBox;
  }

  public TOASendGif setIsOutBox(boolean isOutBox) {
    this.isOutBox = isOutBox;
    setIsOutBoxIsSet(true);
    return this;
  }

  public void unsetIsOutBox() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISOUTBOX_ISSET_ID);
  }

  /** Returns true if field isOutBox is set (has been assigned a value) and false otherwise */
  public boolean isSetIsOutBox() {
    return EncodingUtils.testBit(__isset_bitfield, __ISOUTBOX_ISSET_ID);
  }

  public void setIsOutBoxIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISOUTBOX_ISSET_ID, value);
  }

  public boolean isIsNotify() {
    return this.isNotify;
  }

  public TOASendGif setIsNotify(boolean isNotify) {
    this.isNotify = isNotify;
    setIsNotifyIsSet(true);
    return this;
  }

  public void unsetIsNotify() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISNOTIFY_ISSET_ID);
  }

  /** Returns true if field isNotify is set (has been assigned a value) and false otherwise */
  public boolean isSetIsNotify() {
    return EncodingUtils.testBit(__isset_bitfield, __ISNOTIFY_ISSET_ID);
  }

  public void setIsNotifyIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISNOTIFY_ISSET_ID, value);
  }

  public TOASendFilter getFilter() {
    return this.filter;
  }

  public TOASendGif setFilter(TOASendFilter filter) {
    this.filter = filter;
    return this;
  }

  public void unsetFilter() {
    this.filter = null;
  }

  /** Returns true if field filter is set (has been assigned a value) and false otherwise */
  public boolean isSetFilter() {
    return this.filter != null;
  }

  public void setFilterIsSet(boolean value) {
    if (!value) {
      this.filter = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OA_ID:
      if (value == null) {
        unsetOaId();
      } else {
        setOaId((Integer)value);
      }
      break;

    case HREF:
      if (value == null) {
        unsetHref();
      } else {
        setHref((String)value);
      }
      break;

    case THUMB:
      if (value == null) {
        unsetThumb();
      } else {
        setThumb((String)value);
      }
      break;

    case URL:
      if (value == null) {
        unsetUrl();
      } else {
        setUrl((String)value);
      }
      break;

    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((String)value);
      }
      break;

    case WIDTH:
      if (value == null) {
        unsetWidth();
      } else {
        setWidth((Integer)value);
      }
      break;

    case HEIGHT:
      if (value == null) {
        unsetHeight();
      } else {
        setHeight((Integer)value);
      }
      break;

    case IS_OUT_BOX:
      if (value == null) {
        unsetIsOutBox();
      } else {
        setIsOutBox((Boolean)value);
      }
      break;

    case IS_NOTIFY:
      if (value == null) {
        unsetIsNotify();
      } else {
        setIsNotify((Boolean)value);
      }
      break;

    case FILTER:
      if (value == null) {
        unsetFilter();
      } else {
        setFilter((TOASendFilter)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OA_ID:
      return Integer.valueOf(getOaId());

    case HREF:
      return getHref();

    case THUMB:
      return getThumb();

    case URL:
      return getUrl();

    case MSG:
      return getMsg();

    case WIDTH:
      return Integer.valueOf(getWidth());

    case HEIGHT:
      return Integer.valueOf(getHeight());

    case IS_OUT_BOX:
      return Boolean.valueOf(isIsOutBox());

    case IS_NOTIFY:
      return Boolean.valueOf(isIsNotify());

    case FILTER:
      return getFilter();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OA_ID:
      return isSetOaId();
    case HREF:
      return isSetHref();
    case THUMB:
      return isSetThumb();
    case URL:
      return isSetUrl();
    case MSG:
      return isSetMsg();
    case WIDTH:
      return isSetWidth();
    case HEIGHT:
      return isSetHeight();
    case IS_OUT_BOX:
      return isSetIsOutBox();
    case IS_NOTIFY:
      return isSetIsNotify();
    case FILTER:
      return isSetFilter();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TOASendGif)
      return this.equals((TOASendGif)that);
    return false;
  }

  public boolean equals(TOASendGif that) {
    if (that == null)
      return false;

    boolean this_present_oaId = true && this.isSetOaId();
    boolean that_present_oaId = true && that.isSetOaId();
    if (this_present_oaId || that_present_oaId) {
      if (!(this_present_oaId && that_present_oaId))
        return false;
      if (this.oaId != that.oaId)
        return false;
    }

    boolean this_present_href = true && this.isSetHref();
    boolean that_present_href = true && that.isSetHref();
    if (this_present_href || that_present_href) {
      if (!(this_present_href && that_present_href))
        return false;
      if (!this.href.equals(that.href))
        return false;
    }

    boolean this_present_thumb = true && this.isSetThumb();
    boolean that_present_thumb = true && that.isSetThumb();
    if (this_present_thumb || that_present_thumb) {
      if (!(this_present_thumb && that_present_thumb))
        return false;
      if (!this.thumb.equals(that.thumb))
        return false;
    }

    boolean this_present_url = true && this.isSetUrl();
    boolean that_present_url = true && that.isSetUrl();
    if (this_present_url || that_present_url) {
      if (!(this_present_url && that_present_url))
        return false;
      if (!this.url.equals(that.url))
        return false;
    }

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    boolean this_present_width = true && this.isSetWidth();
    boolean that_present_width = true && that.isSetWidth();
    if (this_present_width || that_present_width) {
      if (!(this_present_width && that_present_width))
        return false;
      if (this.width != that.width)
        return false;
    }

    boolean this_present_height = true && this.isSetHeight();
    boolean that_present_height = true && that.isSetHeight();
    if (this_present_height || that_present_height) {
      if (!(this_present_height && that_present_height))
        return false;
      if (this.height != that.height)
        return false;
    }

    boolean this_present_isOutBox = true && this.isSetIsOutBox();
    boolean that_present_isOutBox = true && that.isSetIsOutBox();
    if (this_present_isOutBox || that_present_isOutBox) {
      if (!(this_present_isOutBox && that_present_isOutBox))
        return false;
      if (this.isOutBox != that.isOutBox)
        return false;
    }

    boolean this_present_isNotify = true && this.isSetIsNotify();
    boolean that_present_isNotify = true && that.isSetIsNotify();
    if (this_present_isNotify || that_present_isNotify) {
      if (!(this_present_isNotify && that_present_isNotify))
        return false;
      if (this.isNotify != that.isNotify)
        return false;
    }

    boolean this_present_filter = true && this.isSetFilter();
    boolean that_present_filter = true && that.isSetFilter();
    if (this_present_filter || that_present_filter) {
      if (!(this_present_filter && that_present_filter))
        return false;
      if (!this.filter.equals(that.filter))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TOASendGif other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TOASendGif typedOther = (TOASendGif)other;

    lastComparison = Boolean.valueOf(isSetOaId()).compareTo(typedOther.isSetOaId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOaId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oaId, typedOther.oaId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHref()).compareTo(typedOther.isSetHref());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHref()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.href, typedOther.href);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThumb()).compareTo(typedOther.isSetThumb());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThumb()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.thumb, typedOther.thumb);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUrl()).compareTo(typedOther.isSetUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.url, typedOther.url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMsg()).compareTo(typedOther.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, typedOther.msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWidth()).compareTo(typedOther.isSetWidth());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWidth()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.width, typedOther.width);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeight()).compareTo(typedOther.isSetHeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.height, typedOther.height);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsOutBox()).compareTo(typedOther.isSetIsOutBox());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsOutBox()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isOutBox, typedOther.isOutBox);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsNotify()).compareTo(typedOther.isSetIsNotify());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsNotify()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isNotify, typedOther.isNotify);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilter()).compareTo(typedOther.isSetFilter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filter, typedOther.filter);
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
    StringBuilder sb = new StringBuilder("TOASendGif(");
    boolean first = true;

    if (isSetOaId()) {
      sb.append("oaId:");
      sb.append(this.oaId);
      first = false;
    }
    if (isSetHref()) {
      if (!first) sb.append(", ");
      sb.append("href:");
      if (this.href == null) {
        sb.append("null");
      } else {
        sb.append(this.href);
      }
      first = false;
    }
    if (isSetThumb()) {
      if (!first) sb.append(", ");
      sb.append("thumb:");
      if (this.thumb == null) {
        sb.append("null");
      } else {
        sb.append(this.thumb);
      }
      first = false;
    }
    if (isSetUrl()) {
      if (!first) sb.append(", ");
      sb.append("url:");
      if (this.url == null) {
        sb.append("null");
      } else {
        sb.append(this.url);
      }
      first = false;
    }
    if (isSetMsg()) {
      if (!first) sb.append(", ");
      sb.append("msg:");
      if (this.msg == null) {
        sb.append("null");
      } else {
        sb.append(this.msg);
      }
      first = false;
    }
    if (isSetWidth()) {
      if (!first) sb.append(", ");
      sb.append("width:");
      sb.append(this.width);
      first = false;
    }
    if (isSetHeight()) {
      if (!first) sb.append(", ");
      sb.append("height:");
      sb.append(this.height);
      first = false;
    }
    if (isSetIsOutBox()) {
      if (!first) sb.append(", ");
      sb.append("isOutBox:");
      sb.append(this.isOutBox);
      first = false;
    }
    if (isSetIsNotify()) {
      if (!first) sb.append(", ");
      sb.append("isNotify:");
      sb.append(this.isNotify);
      first = false;
    }
    if (isSetFilter()) {
      if (!first) sb.append(", ");
      sb.append("filter:");
      if (this.filter == null) {
        sb.append("null");
      } else {
        sb.append(this.filter);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (filter != null) {
      filter.validate();
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

  private static class TOASendGifStandardSchemeFactory implements SchemeFactory {
    public TOASendGifStandardScheme getScheme() {
      return new TOASendGifStandardScheme();
    }
  }

  private static class TOASendGifStandardScheme extends StandardScheme<TOASendGif> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TOASendGif struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.oaId = iprot.readI32();
              struct.setOaIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HREF
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.href = iprot.readString();
              struct.setHrefIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // THUMB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.thumb = iprot.readString();
              struct.setThumbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.url = iprot.readString();
              struct.setUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.setMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // WIDTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.width = iprot.readI32();
              struct.setWidthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // HEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.height = iprot.readI32();
              struct.setHeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // IS_OUT_BOX
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isOutBox = iprot.readBool();
              struct.setIsOutBoxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // IS_NOTIFY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isNotify = iprot.readBool();
              struct.setIsNotifyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // FILTER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.filter = new TOASendFilter();
              struct.filter.read(iprot);
              struct.setFilterIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TOASendGif struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetOaId()) {
        oprot.writeFieldBegin(OA_ID_FIELD_DESC);
        oprot.writeI32(struct.oaId);
        oprot.writeFieldEnd();
      }
      if (struct.href != null) {
        if (struct.isSetHref()) {
          oprot.writeFieldBegin(HREF_FIELD_DESC);
          oprot.writeString(struct.href);
          oprot.writeFieldEnd();
        }
      }
      if (struct.thumb != null) {
        if (struct.isSetThumb()) {
          oprot.writeFieldBegin(THUMB_FIELD_DESC);
          oprot.writeString(struct.thumb);
          oprot.writeFieldEnd();
        }
      }
      if (struct.url != null) {
        if (struct.isSetUrl()) {
          oprot.writeFieldBegin(URL_FIELD_DESC);
          oprot.writeString(struct.url);
          oprot.writeFieldEnd();
        }
      }
      if (struct.msg != null) {
        if (struct.isSetMsg()) {
          oprot.writeFieldBegin(MSG_FIELD_DESC);
          oprot.writeString(struct.msg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetWidth()) {
        oprot.writeFieldBegin(WIDTH_FIELD_DESC);
        oprot.writeI32(struct.width);
        oprot.writeFieldEnd();
      }
      if (struct.isSetHeight()) {
        oprot.writeFieldBegin(HEIGHT_FIELD_DESC);
        oprot.writeI32(struct.height);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsOutBox()) {
        oprot.writeFieldBegin(IS_OUT_BOX_FIELD_DESC);
        oprot.writeBool(struct.isOutBox);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsNotify()) {
        oprot.writeFieldBegin(IS_NOTIFY_FIELD_DESC);
        oprot.writeBool(struct.isNotify);
        oprot.writeFieldEnd();
      }
      if (struct.filter != null) {
        if (struct.isSetFilter()) {
          oprot.writeFieldBegin(FILTER_FIELD_DESC);
          struct.filter.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TOASendGifTupleSchemeFactory implements SchemeFactory {
    public TOASendGifTupleScheme getScheme() {
      return new TOASendGifTupleScheme();
    }
  }

  private static class TOASendGifTupleScheme extends TupleScheme<TOASendGif> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TOASendGif struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOaId()) {
        optionals.set(0);
      }
      if (struct.isSetHref()) {
        optionals.set(1);
      }
      if (struct.isSetThumb()) {
        optionals.set(2);
      }
      if (struct.isSetUrl()) {
        optionals.set(3);
      }
      if (struct.isSetMsg()) {
        optionals.set(4);
      }
      if (struct.isSetWidth()) {
        optionals.set(5);
      }
      if (struct.isSetHeight()) {
        optionals.set(6);
      }
      if (struct.isSetIsOutBox()) {
        optionals.set(7);
      }
      if (struct.isSetIsNotify()) {
        optionals.set(8);
      }
      if (struct.isSetFilter()) {
        optionals.set(9);
      }
      oprot.writeBitSet(optionals, 10);
      if (struct.isSetOaId()) {
        oprot.writeI32(struct.oaId);
      }
      if (struct.isSetHref()) {
        oprot.writeString(struct.href);
      }
      if (struct.isSetThumb()) {
        oprot.writeString(struct.thumb);
      }
      if (struct.isSetUrl()) {
        oprot.writeString(struct.url);
      }
      if (struct.isSetMsg()) {
        oprot.writeString(struct.msg);
      }
      if (struct.isSetWidth()) {
        oprot.writeI32(struct.width);
      }
      if (struct.isSetHeight()) {
        oprot.writeI32(struct.height);
      }
      if (struct.isSetIsOutBox()) {
        oprot.writeBool(struct.isOutBox);
      }
      if (struct.isSetIsNotify()) {
        oprot.writeBool(struct.isNotify);
      }
      if (struct.isSetFilter()) {
        struct.filter.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TOASendGif struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(10);
      if (incoming.get(0)) {
        struct.oaId = iprot.readI32();
        struct.setOaIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.href = iprot.readString();
        struct.setHrefIsSet(true);
      }
      if (incoming.get(2)) {
        struct.thumb = iprot.readString();
        struct.setThumbIsSet(true);
      }
      if (incoming.get(3)) {
        struct.url = iprot.readString();
        struct.setUrlIsSet(true);
      }
      if (incoming.get(4)) {
        struct.msg = iprot.readString();
        struct.setMsgIsSet(true);
      }
      if (incoming.get(5)) {
        struct.width = iprot.readI32();
        struct.setWidthIsSet(true);
      }
      if (incoming.get(6)) {
        struct.height = iprot.readI32();
        struct.setHeightIsSet(true);
      }
      if (incoming.get(7)) {
        struct.isOutBox = iprot.readBool();
        struct.setIsOutBoxIsSet(true);
      }
      if (incoming.get(8)) {
        struct.isNotify = iprot.readBool();
        struct.setIsNotifyIsSet(true);
      }
      if (incoming.get(9)) {
        struct.filter = new TOASendFilter();
        struct.filter.read(iprot);
        struct.setFilterIsSet(true);
      }
    }
  }

}

