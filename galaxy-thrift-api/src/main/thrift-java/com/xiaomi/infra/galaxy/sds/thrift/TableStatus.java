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
/**
 * 表状态信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-12")
public class TableStatus implements libthrift091.TBase<TableStatus, TableStatus._Fields>, java.io.Serializable, Cloneable, Comparable<TableStatus> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TableStatus");

  private static final libthrift091.protocol.TField STATE_FIELD_DESC = new libthrift091.protocol.TField("state", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField CREATE_TIME_FIELD_DESC = new libthrift091.protocol.TField("createTime", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField ALTER_TIME_FIELD_DESC = new libthrift091.protocol.TField("alterTime", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField STAT_TIME_FIELD_DESC = new libthrift091.protocol.TField("statTime", libthrift091.protocol.TType.I64, (short)4);
  private static final libthrift091.protocol.TField SIZE_FIELD_DESC = new libthrift091.protocol.TField("size", libthrift091.protocol.TType.I64, (short)5);
  private static final libthrift091.protocol.TField ROW_COUNT_FIELD_DESC = new libthrift091.protocol.TField("rowCount", libthrift091.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableStatusTupleSchemeFactory());
  }

  /**
   * 表状态
   * 
   * @see TableState
   */
  public TableState state; // optional
  /**
   * 创建时间
   */
  public long createTime; // optional
  /**
   * 最近修改时间
   */
  public long alterTime; // optional
  /**
   * 最近统计时间
   */
  public long statTime; // optional
  /**
   * 占用空间统计，单位为字节
   */
  public long size; // optional
  /**
   * 行数统计，非即时精确值
   */
  public long rowCount; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 表状态
     * 
     * @see TableState
     */
    STATE((short)1, "state"),
    /**
     * 创建时间
     */
    CREATE_TIME((short)2, "createTime"),
    /**
     * 最近修改时间
     */
    ALTER_TIME((short)3, "alterTime"),
    /**
     * 最近统计时间
     */
    STAT_TIME((short)4, "statTime"),
    /**
     * 占用空间统计，单位为字节
     */
    SIZE((short)5, "size"),
    /**
     * 行数统计，非即时精确值
     */
    ROW_COUNT((short)6, "rowCount");

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
        case 1: // STATE
          return STATE;
        case 2: // CREATE_TIME
          return CREATE_TIME;
        case 3: // ALTER_TIME
          return ALTER_TIME;
        case 4: // STAT_TIME
          return STAT_TIME;
        case 5: // SIZE
          return SIZE;
        case 6: // ROW_COUNT
          return ROW_COUNT;
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
  private static final int __CREATETIME_ISSET_ID = 0;
  private static final int __ALTERTIME_ISSET_ID = 1;
  private static final int __STATTIME_ISSET_ID = 2;
  private static final int __SIZE_ISSET_ID = 3;
  private static final int __ROWCOUNT_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STATE,_Fields.CREATE_TIME,_Fields.ALTER_TIME,_Fields.STAT_TIME,_Fields.SIZE,_Fields.ROW_COUNT};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE, new libthrift091.meta_data.FieldMetaData("state", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, TableState.class)));
    tmpMap.put(_Fields.CREATE_TIME, new libthrift091.meta_data.FieldMetaData("createTime", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.ALTER_TIME, new libthrift091.meta_data.FieldMetaData("alterTime", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.STAT_TIME, new libthrift091.meta_data.FieldMetaData("statTime", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.SIZE, new libthrift091.meta_data.FieldMetaData("size", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.ROW_COUNT, new libthrift091.meta_data.FieldMetaData("rowCount", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TableStatus.class, metaDataMap);
  }

  public TableStatus() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableStatus(TableStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetState()) {
      this.state = other.state;
    }
    this.createTime = other.createTime;
    this.alterTime = other.alterTime;
    this.statTime = other.statTime;
    this.size = other.size;
    this.rowCount = other.rowCount;
  }

  public TableStatus deepCopy() {
    return new TableStatus(this);
  }

  @Override
  public void clear() {
    this.state = null;
    setCreateTimeIsSet(false);
    this.createTime = 0;
    setAlterTimeIsSet(false);
    this.alterTime = 0;
    setStatTimeIsSet(false);
    this.statTime = 0;
    setSizeIsSet(false);
    this.size = 0;
    setRowCountIsSet(false);
    this.rowCount = 0;
  }

  /**
   * 表状态
   * 
   * @see TableState
   */
  public TableState getState() {
    return this.state;
  }

  /**
   * 表状态
   * 
   * @see TableState
   */
  public TableStatus setState(TableState state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  /**
   * 创建时间
   */
  public long getCreateTime() {
    return this.createTime;
  }

  /**
   * 创建时间
   */
  public TableStatus setCreateTime(long createTime) {
    this.createTime = createTime;
    setCreateTimeIsSet(true);
    return this;
  }

  public void unsetCreateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  /** Returns true if field createTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  public void setCreateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATETIME_ISSET_ID, value);
  }

  /**
   * 最近修改时间
   */
  public long getAlterTime() {
    return this.alterTime;
  }

  /**
   * 最近修改时间
   */
  public TableStatus setAlterTime(long alterTime) {
    this.alterTime = alterTime;
    setAlterTimeIsSet(true);
    return this;
  }

  public void unsetAlterTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ALTERTIME_ISSET_ID);
  }

  /** Returns true if field alterTime is set (has been assigned a value) and false otherwise */
  public boolean isSetAlterTime() {
    return EncodingUtils.testBit(__isset_bitfield, __ALTERTIME_ISSET_ID);
  }

  public void setAlterTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ALTERTIME_ISSET_ID, value);
  }

  /**
   * 最近统计时间
   */
  public long getStatTime() {
    return this.statTime;
  }

  /**
   * 最近统计时间
   */
  public TableStatus setStatTime(long statTime) {
    this.statTime = statTime;
    setStatTimeIsSet(true);
    return this;
  }

  public void unsetStatTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STATTIME_ISSET_ID);
  }

  /** Returns true if field statTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStatTime() {
    return EncodingUtils.testBit(__isset_bitfield, __STATTIME_ISSET_ID);
  }

  public void setStatTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STATTIME_ISSET_ID, value);
  }

  /**
   * 占用空间统计，单位为字节
   */
  public long getSize() {
    return this.size;
  }

  /**
   * 占用空间统计，单位为字节
   */
  public TableStatus setSize(long size) {
    this.size = size;
    setSizeIsSet(true);
    return this;
  }

  public void unsetSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SIZE_ISSET_ID);
  }

  /** Returns true if field size is set (has been assigned a value) and false otherwise */
  public boolean isSetSize() {
    return EncodingUtils.testBit(__isset_bitfield, __SIZE_ISSET_ID);
  }

  public void setSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SIZE_ISSET_ID, value);
  }

  /**
   * 行数统计，非即时精确值
   */
  public long getRowCount() {
    return this.rowCount;
  }

  /**
   * 行数统计，非即时精确值
   */
  public TableStatus setRowCount(long rowCount) {
    this.rowCount = rowCount;
    setRowCountIsSet(true);
    return this;
  }

  public void unsetRowCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROWCOUNT_ISSET_ID);
  }

  /** Returns true if field rowCount is set (has been assigned a value) and false otherwise */
  public boolean isSetRowCount() {
    return EncodingUtils.testBit(__isset_bitfield, __ROWCOUNT_ISSET_ID);
  }

  public void setRowCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROWCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((TableState)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((Long)value);
      }
      break;

    case ALTER_TIME:
      if (value == null) {
        unsetAlterTime();
      } else {
        setAlterTime((Long)value);
      }
      break;

    case STAT_TIME:
      if (value == null) {
        unsetStatTime();
      } else {
        setStatTime((Long)value);
      }
      break;

    case SIZE:
      if (value == null) {
        unsetSize();
      } else {
        setSize((Long)value);
      }
      break;

    case ROW_COUNT:
      if (value == null) {
        unsetRowCount();
      } else {
        setRowCount((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE:
      return getState();

    case CREATE_TIME:
      return Long.valueOf(getCreateTime());

    case ALTER_TIME:
      return Long.valueOf(getAlterTime());

    case STAT_TIME:
      return Long.valueOf(getStatTime());

    case SIZE:
      return Long.valueOf(getSize());

    case ROW_COUNT:
      return Long.valueOf(getRowCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATE:
      return isSetState();
    case CREATE_TIME:
      return isSetCreateTime();
    case ALTER_TIME:
      return isSetAlterTime();
    case STAT_TIME:
      return isSetStatTime();
    case SIZE:
      return isSetSize();
    case ROW_COUNT:
      return isSetRowCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableStatus)
      return this.equals((TableStatus)that);
    return false;
  }

  public boolean equals(TableStatus that) {
    if (that == null)
      return false;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_createTime = true && this.isSetCreateTime();
    boolean that_present_createTime = true && that.isSetCreateTime();
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (this.createTime != that.createTime)
        return false;
    }

    boolean this_present_alterTime = true && this.isSetAlterTime();
    boolean that_present_alterTime = true && that.isSetAlterTime();
    if (this_present_alterTime || that_present_alterTime) {
      if (!(this_present_alterTime && that_present_alterTime))
        return false;
      if (this.alterTime != that.alterTime)
        return false;
    }

    boolean this_present_statTime = true && this.isSetStatTime();
    boolean that_present_statTime = true && that.isSetStatTime();
    if (this_present_statTime || that_present_statTime) {
      if (!(this_present_statTime && that_present_statTime))
        return false;
      if (this.statTime != that.statTime)
        return false;
    }

    boolean this_present_size = true && this.isSetSize();
    boolean that_present_size = true && that.isSetSize();
    if (this_present_size || that_present_size) {
      if (!(this_present_size && that_present_size))
        return false;
      if (this.size != that.size)
        return false;
    }

    boolean this_present_rowCount = true && this.isSetRowCount();
    boolean that_present_rowCount = true && that.isSetRowCount();
    if (this_present_rowCount || that_present_rowCount) {
      if (!(this_present_rowCount && that_present_rowCount))
        return false;
      if (this.rowCount != that.rowCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_state = true && (isSetState());
    list.add(present_state);
    if (present_state)
      list.add(state.getValue());

    boolean present_createTime = true && (isSetCreateTime());
    list.add(present_createTime);
    if (present_createTime)
      list.add(createTime);

    boolean present_alterTime = true && (isSetAlterTime());
    list.add(present_alterTime);
    if (present_alterTime)
      list.add(alterTime);

    boolean present_statTime = true && (isSetStatTime());
    list.add(present_statTime);
    if (present_statTime)
      list.add(statTime);

    boolean present_size = true && (isSetSize());
    list.add(present_size);
    if (present_size)
      list.add(size);

    boolean present_rowCount = true && (isSetRowCount());
    list.add(present_rowCount);
    if (present_rowCount)
      list.add(rowCount);

    return list.hashCode();
  }

  @Override
  public int compareTo(TableStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateTime()).compareTo(other.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.createTime, other.createTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlterTime()).compareTo(other.isSetAlterTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlterTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.alterTime, other.alterTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatTime()).compareTo(other.isSetStatTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.statTime, other.statTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSize()).compareTo(other.isSetSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSize()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.size, other.size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowCount()).compareTo(other.isSetRowCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowCount()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.rowCount, other.rowCount);
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
    StringBuilder sb = new StringBuilder("TableStatus(");
    boolean first = true;

    if (isSetState()) {
      sb.append("state:");
      if (this.state == null) {
        sb.append("null");
      } else {
        sb.append(this.state);
      }
      first = false;
    }
    if (isSetCreateTime()) {
      if (!first) sb.append(", ");
      sb.append("createTime:");
      sb.append(this.createTime);
      first = false;
    }
    if (isSetAlterTime()) {
      if (!first) sb.append(", ");
      sb.append("alterTime:");
      sb.append(this.alterTime);
      first = false;
    }
    if (isSetStatTime()) {
      if (!first) sb.append(", ");
      sb.append("statTime:");
      sb.append(this.statTime);
      first = false;
    }
    if (isSetSize()) {
      if (!first) sb.append(", ");
      sb.append("size:");
      sb.append(this.size);
      first = false;
    }
    if (isSetRowCount()) {
      if (!first) sb.append(", ");
      sb.append("rowCount:");
      sb.append(this.rowCount);
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

  private static class TableStatusStandardSchemeFactory implements SchemeFactory {
    public TableStatusStandardScheme getScheme() {
      return new TableStatusStandardScheme();
    }
  }

  private static class TableStatusStandardScheme extends StandardScheme<TableStatus> {

    public void read(libthrift091.protocol.TProtocol iprot, TableStatus struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.state = com.xiaomi.infra.galaxy.sds.thrift.TableState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATE_TIME
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.createTime = iprot.readI64();
              struct.setCreateTimeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ALTER_TIME
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.alterTime = iprot.readI64();
              struct.setAlterTimeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STAT_TIME
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.statTime = iprot.readI64();
              struct.setStatTimeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SIZE
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.size = iprot.readI64();
              struct.setSizeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ROW_COUNT
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.rowCount = iprot.readI64();
              struct.setRowCountIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TableStatus struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state != null) {
        if (struct.isSetState()) {
          oprot.writeFieldBegin(STATE_FIELD_DESC);
          oprot.writeI32(struct.state.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCreateTime()) {
        oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
        oprot.writeI64(struct.createTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAlterTime()) {
        oprot.writeFieldBegin(ALTER_TIME_FIELD_DESC);
        oprot.writeI64(struct.alterTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStatTime()) {
        oprot.writeFieldBegin(STAT_TIME_FIELD_DESC);
        oprot.writeI64(struct.statTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSize()) {
        oprot.writeFieldBegin(SIZE_FIELD_DESC);
        oprot.writeI64(struct.size);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRowCount()) {
        oprot.writeFieldBegin(ROW_COUNT_FIELD_DESC);
        oprot.writeI64(struct.rowCount);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableStatusTupleSchemeFactory implements SchemeFactory {
    public TableStatusTupleScheme getScheme() {
      return new TableStatusTupleScheme();
    }
  }

  private static class TableStatusTupleScheme extends TupleScheme<TableStatus> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TableStatus struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetState()) {
        optionals.set(0);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(1);
      }
      if (struct.isSetAlterTime()) {
        optionals.set(2);
      }
      if (struct.isSetStatTime()) {
        optionals.set(3);
      }
      if (struct.isSetSize()) {
        optionals.set(4);
      }
      if (struct.isSetRowCount()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetState()) {
        oprot.writeI32(struct.state.getValue());
      }
      if (struct.isSetCreateTime()) {
        oprot.writeI64(struct.createTime);
      }
      if (struct.isSetAlterTime()) {
        oprot.writeI64(struct.alterTime);
      }
      if (struct.isSetStatTime()) {
        oprot.writeI64(struct.statTime);
      }
      if (struct.isSetSize()) {
        oprot.writeI64(struct.size);
      }
      if (struct.isSetRowCount()) {
        oprot.writeI64(struct.rowCount);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TableStatus struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.state = com.xiaomi.infra.galaxy.sds.thrift.TableState.findByValue(iprot.readI32());
        struct.setStateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.createTime = iprot.readI64();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.alterTime = iprot.readI64();
        struct.setAlterTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.statTime = iprot.readI64();
        struct.setStatTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.size = iprot.readI64();
        struct.setSizeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.rowCount = iprot.readI64();
        struct.setRowCountIsSet(true);
      }
    }
  }

}

