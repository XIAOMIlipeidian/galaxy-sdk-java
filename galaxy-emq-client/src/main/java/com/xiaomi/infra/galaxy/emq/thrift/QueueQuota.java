/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-7-2")
public class QueueQuota implements libthrift091.TBase<QueueQuota, QueueQuota._Fields>, java.io.Serializable, Cloneable, Comparable<QueueQuota> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("QueueQuota");

  private static final libthrift091.protocol.TField THROUGHPUT_FIELD_DESC = new libthrift091.protocol.TField("throughput", libthrift091.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueueQuotaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueueQuotaTupleSchemeFactory());
  }

  /**
   * Queue read and qps;
   * 
   */
  public Throughput throughput; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue read and qps;
     * 
     */
    THROUGHPUT((short)2, "throughput");

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
        case 2: // THROUGHPUT
          return THROUGHPUT;
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
  private static final _Fields optionals[] = {_Fields.THROUGHPUT};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.THROUGHPUT, new libthrift091.meta_data.FieldMetaData("throughput", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Throughput.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(QueueQuota.class, metaDataMap);
  }

  public QueueQuota() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueueQuota(QueueQuota other) {
    if (other.isSetThroughput()) {
      this.throughput = new Throughput(other.throughput);
    }
  }

  public QueueQuota deepCopy() {
    return new QueueQuota(this);
  }

  @Override
  public void clear() {
    this.throughput = null;
  }

  /**
   * Queue read and qps;
   * 
   */
  public Throughput getThroughput() {
    return this.throughput;
  }

  /**
   * Queue read and qps;
   * 
   */
  public QueueQuota setThroughput(Throughput throughput) {
    this.throughput = throughput;
    return this;
  }

  public void unsetThroughput() {
    this.throughput = null;
  }

  /** Returns true if field throughput is set (has been assigned a value) and false otherwise */
  public boolean isSetThroughput() {
    return this.throughput != null;
  }

  public void setThroughputIsSet(boolean value) {
    if (!value) {
      this.throughput = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case THROUGHPUT:
      if (value == null) {
        unsetThroughput();
      } else {
        setThroughput((Throughput)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case THROUGHPUT:
      return getThroughput();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case THROUGHPUT:
      return isSetThroughput();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueueQuota)
      return this.equals((QueueQuota)that);
    return false;
  }

  public boolean equals(QueueQuota that) {
    if (that == null)
      return false;

    boolean this_present_throughput = true && this.isSetThroughput();
    boolean that_present_throughput = true && that.isSetThroughput();
    if (this_present_throughput || that_present_throughput) {
      if (!(this_present_throughput && that_present_throughput))
        return false;
      if (!this.throughput.equals(that.throughput))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_throughput = true && (isSetThroughput());
    list.add(present_throughput);
    if (present_throughput)
      list.add(throughput);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueueQuota other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetThroughput()).compareTo(other.isSetThroughput());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThroughput()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.throughput, other.throughput);
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
    StringBuilder sb = new StringBuilder("QueueQuota(");
    boolean first = true;

    if (isSetThroughput()) {
      sb.append("throughput:");
      if (this.throughput == null) {
        sb.append("null");
      } else {
        sb.append(this.throughput);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (throughput != null) {
      throughput.validate();
    }
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

  private static class QueueQuotaStandardSchemeFactory implements SchemeFactory {
    public QueueQuotaStandardScheme getScheme() {
      return new QueueQuotaStandardScheme();
    }
  }

  private static class QueueQuotaStandardScheme extends StandardScheme<QueueQuota> {

    public void read(libthrift091.protocol.TProtocol iprot, QueueQuota struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // THROUGHPUT
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.throughput = new Throughput();
              struct.throughput.read(iprot);
              struct.setThroughputIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, QueueQuota struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.throughput != null) {
        if (struct.isSetThroughput()) {
          oprot.writeFieldBegin(THROUGHPUT_FIELD_DESC);
          struct.throughput.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueueQuotaTupleSchemeFactory implements SchemeFactory {
    public QueueQuotaTupleScheme getScheme() {
      return new QueueQuotaTupleScheme();
    }
  }

  private static class QueueQuotaTupleScheme extends TupleScheme<QueueQuota> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, QueueQuota struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetThroughput()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetThroughput()) {
        struct.throughput.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, QueueQuota struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.throughput = new Throughput();
        struct.throughput.read(iprot);
        struct.setThroughputIsSet(true);
      }
    }
  }

}

