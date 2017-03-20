/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.metrics.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-3-2")
public class PanelRequest implements libthrift091.TBase<PanelRequest, PanelRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PanelRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("PanelRequest");

  private static final libthrift091.protocol.TField LINE_REQUESTS_FIELD_DESC = new libthrift091.protocol.TField("lineRequests", libthrift091.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PanelRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PanelRequestTupleSchemeFactory());
  }

  public List<LineRequest> lineRequests; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    LINE_REQUESTS((short)1, "lineRequests");

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
        case 1: // LINE_REQUESTS
          return LINE_REQUESTS;
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
  private static final _Fields optionals[] = {_Fields.LINE_REQUESTS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LINE_REQUESTS, new libthrift091.meta_data.FieldMetaData("lineRequests", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, LineRequest.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(PanelRequest.class, metaDataMap);
  }

  public PanelRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PanelRequest(PanelRequest other) {
    if (other.isSetLineRequests()) {
      List<LineRequest> __this__lineRequests = new ArrayList<LineRequest>(other.lineRequests.size());
      for (LineRequest other_element : other.lineRequests) {
        __this__lineRequests.add(new LineRequest(other_element));
      }
      this.lineRequests = __this__lineRequests;
    }
  }

  public PanelRequest deepCopy() {
    return new PanelRequest(this);
  }

  @Override
  public void clear() {
    this.lineRequests = null;
  }

  public int getLineRequestsSize() {
    return (this.lineRequests == null) ? 0 : this.lineRequests.size();
  }

  public java.util.Iterator<LineRequest> getLineRequestsIterator() {
    return (this.lineRequests == null) ? null : this.lineRequests.iterator();
  }

  public void addToLineRequests(LineRequest elem) {
    if (this.lineRequests == null) {
      this.lineRequests = new ArrayList<LineRequest>();
    }
    this.lineRequests.add(elem);
  }

  public List<LineRequest> getLineRequests() {
    return this.lineRequests;
  }

  public PanelRequest setLineRequests(List<LineRequest> lineRequests) {
    this.lineRequests = lineRequests;
    return this;
  }

  public void unsetLineRequests() {
    this.lineRequests = null;
  }

  /** Returns true if field lineRequests is set (has been assigned a value) and false otherwise */
  public boolean isSetLineRequests() {
    return this.lineRequests != null;
  }

  public void setLineRequestsIsSet(boolean value) {
    if (!value) {
      this.lineRequests = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LINE_REQUESTS:
      if (value == null) {
        unsetLineRequests();
      } else {
        setLineRequests((List<LineRequest>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LINE_REQUESTS:
      return getLineRequests();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LINE_REQUESTS:
      return isSetLineRequests();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PanelRequest)
      return this.equals((PanelRequest)that);
    return false;
  }

  public boolean equals(PanelRequest that) {
    if (that == null)
      return false;

    boolean this_present_lineRequests = true && this.isSetLineRequests();
    boolean that_present_lineRequests = true && that.isSetLineRequests();
    if (this_present_lineRequests || that_present_lineRequests) {
      if (!(this_present_lineRequests && that_present_lineRequests))
        return false;
      if (!this.lineRequests.equals(that.lineRequests))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_lineRequests = true && (isSetLineRequests());
    list.add(present_lineRequests);
    if (present_lineRequests)
      list.add(lineRequests);

    return list.hashCode();
  }

  @Override
  public int compareTo(PanelRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLineRequests()).compareTo(other.isSetLineRequests());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLineRequests()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.lineRequests, other.lineRequests);
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
    StringBuilder sb = new StringBuilder("PanelRequest(");
    boolean first = true;

    if (isSetLineRequests()) {
      sb.append("lineRequests:");
      if (this.lineRequests == null) {
        sb.append("null");
      } else {
        sb.append(this.lineRequests);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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

  private static class PanelRequestStandardSchemeFactory implements SchemeFactory {
    public PanelRequestStandardScheme getScheme() {
      return new PanelRequestStandardScheme();
    }
  }

  private static class PanelRequestStandardScheme extends StandardScheme<PanelRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, PanelRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LINE_REQUESTS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list0 = iprot.readListBegin();
                struct.lineRequests = new ArrayList<LineRequest>(_list0.size);
                LineRequest _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new LineRequest();
                  _elem1.read(iprot);
                  struct.lineRequests.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setLineRequestsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, PanelRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.lineRequests != null) {
        if (struct.isSetLineRequests()) {
          oprot.writeFieldBegin(LINE_REQUESTS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.lineRequests.size()));
            for (LineRequest _iter3 : struct.lineRequests)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PanelRequestTupleSchemeFactory implements SchemeFactory {
    public PanelRequestTupleScheme getScheme() {
      return new PanelRequestTupleScheme();
    }
  }

  private static class PanelRequestTupleScheme extends TupleScheme<PanelRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, PanelRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLineRequests()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLineRequests()) {
        {
          oprot.writeI32(struct.lineRequests.size());
          for (LineRequest _iter4 : struct.lineRequests)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, PanelRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list5 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.lineRequests = new ArrayList<LineRequest>(_list5.size);
          LineRequest _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new LineRequest();
            _elem6.read(iprot);
            struct.lineRequests.add(_elem6);
          }
        }
        struct.setLineRequestsIsSet(true);
      }
    }
  }

}
