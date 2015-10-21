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
 * 增量操作
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-3")
public class Edit implements libthrift091.TBase<Edit, Edit._Fields>, java.io.Serializable, Cloneable, Comparable<Edit> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Edit");

  private static final libthrift091.protocol.TField EDIT_TYPE_FIELD_DESC = new libthrift091.protocol.TField("editType", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField DATUM_FIELD_DESC = new libthrift091.protocol.TField("datum", libthrift091.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EditStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EditTupleSchemeFactory());
  }

  /**
   * 
   * @see EditType
   */
  public EditType editType; // optional
  public Datum datum; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 
     * @see EditType
     */
    EDIT_TYPE((short)1, "editType"),
    DATUM((short)2, "datum");

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
        case 1: // EDIT_TYPE
          return EDIT_TYPE;
        case 2: // DATUM
          return DATUM;
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
  private static final _Fields optionals[] = {_Fields.EDIT_TYPE,_Fields.DATUM};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EDIT_TYPE, new libthrift091.meta_data.FieldMetaData("editType", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, EditType.class)));
    tmpMap.put(_Fields.DATUM, new libthrift091.meta_data.FieldMetaData("datum", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Datum.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Edit.class, metaDataMap);
  }

  public Edit() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Edit(Edit other) {
    if (other.isSetEditType()) {
      this.editType = other.editType;
    }
    if (other.isSetDatum()) {
      this.datum = new Datum(other.datum);
    }
  }

  public Edit deepCopy() {
    return new Edit(this);
  }

  @Override
  public void clear() {
    this.editType = null;
    this.datum = null;
  }

  /**
   * 
   * @see EditType
   */
  public EditType getEditType() {
    return this.editType;
  }

  /**
   * 
   * @see EditType
   */
  public Edit setEditType(EditType editType) {
    this.editType = editType;
    return this;
  }

  public void unsetEditType() {
    this.editType = null;
  }

  /** Returns true if field editType is set (has been assigned a value) and false otherwise */
  public boolean isSetEditType() {
    return this.editType != null;
  }

  public void setEditTypeIsSet(boolean value) {
    if (!value) {
      this.editType = null;
    }
  }

  public Datum getDatum() {
    return this.datum;
  }

  public Edit setDatum(Datum datum) {
    this.datum = datum;
    return this;
  }

  public void unsetDatum() {
    this.datum = null;
  }

  /** Returns true if field datum is set (has been assigned a value) and false otherwise */
  public boolean isSetDatum() {
    return this.datum != null;
  }

  public void setDatumIsSet(boolean value) {
    if (!value) {
      this.datum = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EDIT_TYPE:
      if (value == null) {
        unsetEditType();
      } else {
        setEditType((EditType)value);
      }
      break;

    case DATUM:
      if (value == null) {
        unsetDatum();
      } else {
        setDatum((Datum)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EDIT_TYPE:
      return getEditType();

    case DATUM:
      return getDatum();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EDIT_TYPE:
      return isSetEditType();
    case DATUM:
      return isSetDatum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Edit)
      return this.equals((Edit)that);
    return false;
  }

  public boolean equals(Edit that) {
    if (that == null)
      return false;

    boolean this_present_editType = true && this.isSetEditType();
    boolean that_present_editType = true && that.isSetEditType();
    if (this_present_editType || that_present_editType) {
      if (!(this_present_editType && that_present_editType))
        return false;
      if (!this.editType.equals(that.editType))
        return false;
    }

    boolean this_present_datum = true && this.isSetDatum();
    boolean that_present_datum = true && that.isSetDatum();
    if (this_present_datum || that_present_datum) {
      if (!(this_present_datum && that_present_datum))
        return false;
      if (!this.datum.equals(that.datum))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_editType = true && (isSetEditType());
    list.add(present_editType);
    if (present_editType)
      list.add(editType.getValue());

    boolean present_datum = true && (isSetDatum());
    list.add(present_datum);
    if (present_datum)
      list.add(datum);

    return list.hashCode();
  }

  @Override
  public int compareTo(Edit other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEditType()).compareTo(other.isSetEditType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEditType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.editType, other.editType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDatum()).compareTo(other.isSetDatum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatum()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.datum, other.datum);
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
    StringBuilder sb = new StringBuilder("Edit(");
    boolean first = true;

    if (isSetEditType()) {
      sb.append("editType:");
      if (this.editType == null) {
        sb.append("null");
      } else {
        sb.append(this.editType);
      }
      first = false;
    }
    if (isSetDatum()) {
      if (!first) sb.append(", ");
      sb.append("datum:");
      if (this.datum == null) {
        sb.append("null");
      } else {
        sb.append(this.datum);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (datum != null) {
      datum.validate();
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

  private static class EditStandardSchemeFactory implements SchemeFactory {
    public EditStandardScheme getScheme() {
      return new EditStandardScheme();
    }
  }

  private static class EditStandardScheme extends StandardScheme<Edit> {

    public void read(libthrift091.protocol.TProtocol iprot, Edit struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EDIT_TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.editType = com.xiaomi.infra.galaxy.sds.thrift.EditType.findByValue(iprot.readI32());
              struct.setEditTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATUM
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.datum = new Datum();
              struct.datum.read(iprot);
              struct.setDatumIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Edit struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.editType != null) {
        if (struct.isSetEditType()) {
          oprot.writeFieldBegin(EDIT_TYPE_FIELD_DESC);
          oprot.writeI32(struct.editType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.datum != null) {
        if (struct.isSetDatum()) {
          oprot.writeFieldBegin(DATUM_FIELD_DESC);
          struct.datum.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EditTupleSchemeFactory implements SchemeFactory {
    public EditTupleScheme getScheme() {
      return new EditTupleScheme();
    }
  }

  private static class EditTupleScheme extends TupleScheme<Edit> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Edit struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEditType()) {
        optionals.set(0);
      }
      if (struct.isSetDatum()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetEditType()) {
        oprot.writeI32(struct.editType.getValue());
      }
      if (struct.isSetDatum()) {
        struct.datum.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Edit struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.editType = com.xiaomi.infra.galaxy.sds.thrift.EditType.findByValue(iprot.readI32());
        struct.setEditTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.datum = new Datum();
        struct.datum.read(iprot);
        struct.setDatumIsSet(true);
      }
    }
  }

}
