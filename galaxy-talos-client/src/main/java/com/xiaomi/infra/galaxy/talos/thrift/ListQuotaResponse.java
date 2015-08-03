/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-3")
public class ListQuotaResponse implements libthrift091.TBase<ListQuotaResponse, ListQuotaResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ListQuotaResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ListQuotaResponse");

  private static final libthrift091.protocol.TField QUOTAS_FIELD_DESC = new libthrift091.protocol.TField("quotas", libthrift091.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ListQuotaResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ListQuotaResponseTupleSchemeFactory());
  }

  /**
   * The developer -> UserQuota map;
   * 
   */
  public Map<String,UserQuota> quotas; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The developer -> UserQuota map;
     * 
     */
    QUOTAS((short)1, "quotas");

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
        case 1: // QUOTAS
          return QUOTAS;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUOTAS, new libthrift091.meta_data.FieldMetaData("quotas", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, UserQuota.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ListQuotaResponse.class, metaDataMap);
  }

  public ListQuotaResponse() {
  }

  public ListQuotaResponse(
    Map<String,UserQuota> quotas)
  {
    this();
    this.quotas = quotas;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListQuotaResponse(ListQuotaResponse other) {
    if (other.isSetQuotas()) {
      Map<String,UserQuota> __this__quotas = new HashMap<String,UserQuota>(other.quotas.size());
      for (Map.Entry<String, UserQuota> other_element : other.quotas.entrySet()) {

        String other_element_key = other_element.getKey();
        UserQuota other_element_value = other_element.getValue();

        String __this__quotas_copy_key = other_element_key;

        UserQuota __this__quotas_copy_value = new UserQuota(other_element_value);

        __this__quotas.put(__this__quotas_copy_key, __this__quotas_copy_value);
      }
      this.quotas = __this__quotas;
    }
  }

  public ListQuotaResponse deepCopy() {
    return new ListQuotaResponse(this);
  }

  @Override
  public void clear() {
    this.quotas = null;
  }

  public int getQuotasSize() {
    return (this.quotas == null) ? 0 : this.quotas.size();
  }

  public void putToQuotas(String key, UserQuota val) {
    if (this.quotas == null) {
      this.quotas = new HashMap<String,UserQuota>();
    }
    this.quotas.put(key, val);
  }

  /**
   * The developer -> UserQuota map;
   * 
   */
  public Map<String,UserQuota> getQuotas() {
    return this.quotas;
  }

  /**
   * The developer -> UserQuota map;
   * 
   */
  public ListQuotaResponse setQuotas(Map<String,UserQuota> quotas) {
    this.quotas = quotas;
    return this;
  }

  public void unsetQuotas() {
    this.quotas = null;
  }

  /** Returns true if field quotas is set (has been assigned a value) and false otherwise */
  public boolean isSetQuotas() {
    return this.quotas != null;
  }

  public void setQuotasIsSet(boolean value) {
    if (!value) {
      this.quotas = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUOTAS:
      if (value == null) {
        unsetQuotas();
      } else {
        setQuotas((Map<String,UserQuota>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUOTAS:
      return getQuotas();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUOTAS:
      return isSetQuotas();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListQuotaResponse)
      return this.equals((ListQuotaResponse)that);
    return false;
  }

  public boolean equals(ListQuotaResponse that) {
    if (that == null)
      return false;

    boolean this_present_quotas = true && this.isSetQuotas();
    boolean that_present_quotas = true && that.isSetQuotas();
    if (this_present_quotas || that_present_quotas) {
      if (!(this_present_quotas && that_present_quotas))
        return false;
      if (!this.quotas.equals(that.quotas))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_quotas = true && (isSetQuotas());
    list.add(present_quotas);
    if (present_quotas)
      list.add(quotas);

    return list.hashCode();
  }

  @Override
  public int compareTo(ListQuotaResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQuotas()).compareTo(other.isSetQuotas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuotas()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.quotas, other.quotas);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ListQuotaResponse(");
    boolean first = true;

    sb.append("quotas:");
    if (this.quotas == null) {
      sb.append("null");
    } else {
      sb.append(this.quotas);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (quotas == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'quotas' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ListQuotaResponseStandardSchemeFactory implements SchemeFactory {
    public ListQuotaResponseStandardScheme getScheme() {
      return new ListQuotaResponseStandardScheme();
    }
  }

  private static class ListQuotaResponseStandardScheme extends StandardScheme<ListQuotaResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, ListQuotaResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUOTAS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map0 = iprot.readMapBegin();
                struct.quotas = new HashMap<String,UserQuota>(2*_map0.size);
                String _key1;
                UserQuota _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = new UserQuota();
                  _val2.read(iprot);
                  struct.quotas.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setQuotasIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, ListQuotaResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.quotas != null) {
        oprot.writeFieldBegin(QUOTAS_FIELD_DESC);
        {
          oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.quotas.size()));
          for (Map.Entry<String, UserQuota> _iter4 : struct.quotas.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            _iter4.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ListQuotaResponseTupleSchemeFactory implements SchemeFactory {
    public ListQuotaResponseTupleScheme getScheme() {
      return new ListQuotaResponseTupleScheme();
    }
  }

  private static class ListQuotaResponseTupleScheme extends TupleScheme<ListQuotaResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ListQuotaResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.quotas.size());
        for (Map.Entry<String, UserQuota> _iter5 : struct.quotas.entrySet())
        {
          oprot.writeString(_iter5.getKey());
          _iter5.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ListQuotaResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TMap _map6 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.quotas = new HashMap<String,UserQuota>(2*_map6.size);
        String _key7;
        UserQuota _val8;
        for (int _i9 = 0; _i9 < _map6.size; ++_i9)
        {
          _key7 = iprot.readString();
          _val8 = new UserQuota();
          _val8.read(iprot);
          struct.quotas.put(_key7, _val8);
        }
      }
      struct.setQuotasIsSet(true);
    }
  }

}

