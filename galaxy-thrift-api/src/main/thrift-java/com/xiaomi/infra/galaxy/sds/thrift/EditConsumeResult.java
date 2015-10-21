/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-20")
public class EditConsumeResult implements libthrift091.TBase<EditConsumeResult, EditConsumeResult._Fields>, java.io.Serializable, Cloneable, Comparable<EditConsumeResult> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("EditConsumeResult");

  private static final libthrift091.protocol.TField NEXT_CONSUME_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("nextConsumeOffset", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField ROW_EDITS_FIELD_DESC = new libthrift091.protocol.TField("rowEdits", libthrift091.protocol.TType.LIST, (short)2);
  private static final libthrift091.protocol.TField THROTTLED_FIELD_DESC = new libthrift091.protocol.TField("throttled", libthrift091.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EditConsumeResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EditConsumeResultTupleSchemeFactory());
  }

  /**
   * 下一个开始消费的增量数据的偏移，NULL表示达到当前表分片的结束位置
   */
  public long nextConsumeOffset; // optional
  /**
   * 消费的增量数据
   */
  public List<RowEdit> rowEdits; // optional
  /**
   * 是否超过表的qps quota
   */
  public boolean throttled; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 下一个开始消费的增量数据的偏移，NULL表示达到当前表分片的结束位置
     */
    NEXT_CONSUME_OFFSET((short)1, "nextConsumeOffset"),
    /**
     * 消费的增量数据
     */
    ROW_EDITS((short)2, "rowEdits"),
    /**
     * 是否超过表的qps quota
     */
    THROTTLED((short)3, "throttled");

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
        case 1: // NEXT_CONSUME_OFFSET
          return NEXT_CONSUME_OFFSET;
        case 2: // ROW_EDITS
          return ROW_EDITS;
        case 3: // THROTTLED
          return THROTTLED;
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
  private static final int __NEXTCONSUMEOFFSET_ISSET_ID = 0;
  private static final int __THROTTLED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NEXT_CONSUME_OFFSET,_Fields.ROW_EDITS,_Fields.THROTTLED};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NEXT_CONSUME_OFFSET, new libthrift091.meta_data.FieldMetaData("nextConsumeOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.ROW_EDITS, new libthrift091.meta_data.FieldMetaData("rowEdits", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, RowEdit.class))));
    tmpMap.put(_Fields.THROTTLED, new libthrift091.meta_data.FieldMetaData("throttled", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(EditConsumeResult.class, metaDataMap);
  }

  public EditConsumeResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EditConsumeResult(EditConsumeResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.nextConsumeOffset = other.nextConsumeOffset;
    if (other.isSetRowEdits()) {
      List<RowEdit> __this__rowEdits = new ArrayList<RowEdit>(other.rowEdits.size());
      for (RowEdit other_element : other.rowEdits) {
        __this__rowEdits.add(new RowEdit(other_element));
      }
      this.rowEdits = __this__rowEdits;
    }
    this.throttled = other.throttled;
  }

  public EditConsumeResult deepCopy() {
    return new EditConsumeResult(this);
  }

  @Override
  public void clear() {
    setNextConsumeOffsetIsSet(false);
    this.nextConsumeOffset = 0;
    this.rowEdits = null;
    setThrottledIsSet(false);
    this.throttled = false;
  }

  /**
   * 下一个开始消费的增量数据的偏移，NULL表示达到当前表分片的结束位置
   */
  public long getNextConsumeOffset() {
    return this.nextConsumeOffset;
  }

  /**
   * 下一个开始消费的增量数据的偏移，NULL表示达到当前表分片的结束位置
   */
  public EditConsumeResult setNextConsumeOffset(long nextConsumeOffset) {
    this.nextConsumeOffset = nextConsumeOffset;
    setNextConsumeOffsetIsSet(true);
    return this;
  }

  public void unsetNextConsumeOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEXTCONSUMEOFFSET_ISSET_ID);
  }

  /** Returns true if field nextConsumeOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetNextConsumeOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __NEXTCONSUMEOFFSET_ISSET_ID);
  }

  public void setNextConsumeOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEXTCONSUMEOFFSET_ISSET_ID, value);
  }

  public int getRowEditsSize() {
    return (this.rowEdits == null) ? 0 : this.rowEdits.size();
  }

  public java.util.Iterator<RowEdit> getRowEditsIterator() {
    return (this.rowEdits == null) ? null : this.rowEdits.iterator();
  }

  public void addToRowEdits(RowEdit elem) {
    if (this.rowEdits == null) {
      this.rowEdits = new ArrayList<RowEdit>();
    }
    this.rowEdits.add(elem);
  }

  /**
   * 消费的增量数据
   */
  public List<RowEdit> getRowEdits() {
    return this.rowEdits;
  }

  /**
   * 消费的增量数据
   */
  public EditConsumeResult setRowEdits(List<RowEdit> rowEdits) {
    this.rowEdits = rowEdits;
    return this;
  }

  public void unsetRowEdits() {
    this.rowEdits = null;
  }

  /** Returns true if field rowEdits is set (has been assigned a value) and false otherwise */
  public boolean isSetRowEdits() {
    return this.rowEdits != null;
  }

  public void setRowEditsIsSet(boolean value) {
    if (!value) {
      this.rowEdits = null;
    }
  }

  /**
   * 是否超过表的qps quota
   */
  public boolean isThrottled() {
    return this.throttled;
  }

  /**
   * 是否超过表的qps quota
   */
  public EditConsumeResult setThrottled(boolean throttled) {
    this.throttled = throttled;
    setThrottledIsSet(true);
    return this;
  }

  public void unsetThrottled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __THROTTLED_ISSET_ID);
  }

  /** Returns true if field throttled is set (has been assigned a value) and false otherwise */
  public boolean isSetThrottled() {
    return EncodingUtils.testBit(__isset_bitfield, __THROTTLED_ISSET_ID);
  }

  public void setThrottledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __THROTTLED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NEXT_CONSUME_OFFSET:
      if (value == null) {
        unsetNextConsumeOffset();
      } else {
        setNextConsumeOffset((Long)value);
      }
      break;

    case ROW_EDITS:
      if (value == null) {
        unsetRowEdits();
      } else {
        setRowEdits((List<RowEdit>)value);
      }
      break;

    case THROTTLED:
      if (value == null) {
        unsetThrottled();
      } else {
        setThrottled((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NEXT_CONSUME_OFFSET:
      return Long.valueOf(getNextConsumeOffset());

    case ROW_EDITS:
      return getRowEdits();

    case THROTTLED:
      return Boolean.valueOf(isThrottled());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NEXT_CONSUME_OFFSET:
      return isSetNextConsumeOffset();
    case ROW_EDITS:
      return isSetRowEdits();
    case THROTTLED:
      return isSetThrottled();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EditConsumeResult)
      return this.equals((EditConsumeResult)that);
    return false;
  }

  public boolean equals(EditConsumeResult that) {
    if (that == null)
      return false;

    boolean this_present_nextConsumeOffset = true && this.isSetNextConsumeOffset();
    boolean that_present_nextConsumeOffset = true && that.isSetNextConsumeOffset();
    if (this_present_nextConsumeOffset || that_present_nextConsumeOffset) {
      if (!(this_present_nextConsumeOffset && that_present_nextConsumeOffset))
        return false;
      if (this.nextConsumeOffset != that.nextConsumeOffset)
        return false;
    }

    boolean this_present_rowEdits = true && this.isSetRowEdits();
    boolean that_present_rowEdits = true && that.isSetRowEdits();
    if (this_present_rowEdits || that_present_rowEdits) {
      if (!(this_present_rowEdits && that_present_rowEdits))
        return false;
      if (!this.rowEdits.equals(that.rowEdits))
        return false;
    }

    boolean this_present_throttled = true && this.isSetThrottled();
    boolean that_present_throttled = true && that.isSetThrottled();
    if (this_present_throttled || that_present_throttled) {
      if (!(this_present_throttled && that_present_throttled))
        return false;
      if (this.throttled != that.throttled)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nextConsumeOffset = true && (isSetNextConsumeOffset());
    list.add(present_nextConsumeOffset);
    if (present_nextConsumeOffset)
      list.add(nextConsumeOffset);

    boolean present_rowEdits = true && (isSetRowEdits());
    list.add(present_rowEdits);
    if (present_rowEdits)
      list.add(rowEdits);

    boolean present_throttled = true && (isSetThrottled());
    list.add(present_throttled);
    if (present_throttled)
      list.add(throttled);

    return list.hashCode();
  }

  @Override
  public int compareTo(EditConsumeResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNextConsumeOffset()).compareTo(other.isSetNextConsumeOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextConsumeOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.nextConsumeOffset, other.nextConsumeOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowEdits()).compareTo(other.isSetRowEdits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowEdits()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.rowEdits, other.rowEdits);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThrottled()).compareTo(other.isSetThrottled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThrottled()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.throttled, other.throttled);
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
    StringBuilder sb = new StringBuilder("EditConsumeResult(");
    boolean first = true;

    if (isSetNextConsumeOffset()) {
      sb.append("nextConsumeOffset:");
      sb.append(this.nextConsumeOffset);
      first = false;
    }
    if (isSetRowEdits()) {
      if (!first) sb.append(", ");
      sb.append("rowEdits:");
      if (this.rowEdits == null) {
        sb.append("null");
      } else {
        sb.append(this.rowEdits);
      }
      first = false;
    }
    if (isSetThrottled()) {
      if (!first) sb.append(", ");
      sb.append("throttled:");
      sb.append(this.throttled);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EditConsumeResultStandardSchemeFactory implements SchemeFactory {
    public EditConsumeResultStandardScheme getScheme() {
      return new EditConsumeResultStandardScheme();
    }
  }

  private static class EditConsumeResultStandardScheme extends StandardScheme<EditConsumeResult> {

    public void read(libthrift091.protocol.TProtocol iprot, EditConsumeResult struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NEXT_CONSUME_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.nextConsumeOffset = iprot.readI64();
              struct.setNextConsumeOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROW_EDITS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list388 = iprot.readListBegin();
                struct.rowEdits = new ArrayList<RowEdit>(_list388.size);
                RowEdit _elem389;
                for (int _i390 = 0; _i390 < _list388.size; ++_i390)
                {
                  _elem389 = new RowEdit();
                  _elem389.read(iprot);
                  struct.rowEdits.add(_elem389);
                }
                iprot.readListEnd();
              }
              struct.setRowEditsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // THROTTLED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.throttled = iprot.readBool();
              struct.setThrottledIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, EditConsumeResult struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetNextConsumeOffset()) {
        oprot.writeFieldBegin(NEXT_CONSUME_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.nextConsumeOffset);
        oprot.writeFieldEnd();
      }
      if (struct.rowEdits != null) {
        if (struct.isSetRowEdits()) {
          oprot.writeFieldBegin(ROW_EDITS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.rowEdits.size()));
            for (RowEdit _iter391 : struct.rowEdits)
            {
              _iter391.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetThrottled()) {
        oprot.writeFieldBegin(THROTTLED_FIELD_DESC);
        oprot.writeBool(struct.throttled);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EditConsumeResultTupleSchemeFactory implements SchemeFactory {
    public EditConsumeResultTupleScheme getScheme() {
      return new EditConsumeResultTupleScheme();
    }
  }

  private static class EditConsumeResultTupleScheme extends TupleScheme<EditConsumeResult> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, EditConsumeResult struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNextConsumeOffset()) {
        optionals.set(0);
      }
      if (struct.isSetRowEdits()) {
        optionals.set(1);
      }
      if (struct.isSetThrottled()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNextConsumeOffset()) {
        oprot.writeI64(struct.nextConsumeOffset);
      }
      if (struct.isSetRowEdits()) {
        {
          oprot.writeI32(struct.rowEdits.size());
          for (RowEdit _iter392 : struct.rowEdits)
          {
            _iter392.write(oprot);
          }
        }
      }
      if (struct.isSetThrottled()) {
        oprot.writeBool(struct.throttled);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, EditConsumeResult struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.nextConsumeOffset = iprot.readI64();
        struct.setNextConsumeOffsetIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list393 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.rowEdits = new ArrayList<RowEdit>(_list393.size);
          RowEdit _elem394;
          for (int _i395 = 0; _i395 < _list393.size; ++_i395)
          {
            _elem394 = new RowEdit();
            _elem394.read(iprot);
            struct.rowEdits.add(_elem394);
          }
        }
        struct.setRowEditsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.throttled = iprot.readBool();
        struct.setThrottledIsSet(true);
      }
    }
  }

}
