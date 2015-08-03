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
public class ChangeTopicAttributeRequest implements libthrift091.TBase<ChangeTopicAttributeRequest, ChangeTopicAttributeRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ChangeTopicAttributeRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ChangeTopicAttributeRequest");

  private static final libthrift091.protocol.TField TOPIC_TALOS_RESOURCE_NAME_FIELD_DESC = new libthrift091.protocol.TField("topicTalosResourceName", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField TOPIC_ATTRIBUTE_FIELD_DESC = new libthrift091.protocol.TField("topicAttribute", libthrift091.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChangeTopicAttributeRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ChangeTopicAttributeRequestTupleSchemeFactory());
  }

  /**
   * The topicTalosResourceName is in TopicInfo that returned by CreateTopic,
   * you can also get TopicInfo by describeTopic;
   * 
   */
  public TopicTalosResourceName topicTalosResourceName; // required
  /**
   * Topic attribute;
   * 
   */
  public TopicAttribute topicAttribute; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The topicTalosResourceName is in TopicInfo that returned by CreateTopic,
     * you can also get TopicInfo by describeTopic;
     * 
     */
    TOPIC_TALOS_RESOURCE_NAME((short)1, "topicTalosResourceName"),
    /**
     * Topic attribute;
     * 
     */
    TOPIC_ATTRIBUTE((short)2, "topicAttribute");

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
        case 1: // TOPIC_TALOS_RESOURCE_NAME
          return TOPIC_TALOS_RESOURCE_NAME;
        case 2: // TOPIC_ATTRIBUTE
          return TOPIC_ATTRIBUTE;
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
    tmpMap.put(_Fields.TOPIC_TALOS_RESOURCE_NAME, new libthrift091.meta_data.FieldMetaData("topicTalosResourceName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicTalosResourceName.class)));
    tmpMap.put(_Fields.TOPIC_ATTRIBUTE, new libthrift091.meta_data.FieldMetaData("topicAttribute", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicAttribute.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ChangeTopicAttributeRequest.class, metaDataMap);
  }

  public ChangeTopicAttributeRequest() {
  }

  public ChangeTopicAttributeRequest(
    TopicTalosResourceName topicTalosResourceName,
    TopicAttribute topicAttribute)
  {
    this();
    this.topicTalosResourceName = topicTalosResourceName;
    this.topicAttribute = topicAttribute;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChangeTopicAttributeRequest(ChangeTopicAttributeRequest other) {
    if (other.isSetTopicTalosResourceName()) {
      this.topicTalosResourceName = new TopicTalosResourceName(other.topicTalosResourceName);
    }
    if (other.isSetTopicAttribute()) {
      this.topicAttribute = new TopicAttribute(other.topicAttribute);
    }
  }

  public ChangeTopicAttributeRequest deepCopy() {
    return new ChangeTopicAttributeRequest(this);
  }

  @Override
  public void clear() {
    this.topicTalosResourceName = null;
    this.topicAttribute = null;
  }

  /**
   * The topicTalosResourceName is in TopicInfo that returned by CreateTopic,
   * you can also get TopicInfo by describeTopic;
   * 
   */
  public TopicTalosResourceName getTopicTalosResourceName() {
    return this.topicTalosResourceName;
  }

  /**
   * The topicTalosResourceName is in TopicInfo that returned by CreateTopic,
   * you can also get TopicInfo by describeTopic;
   * 
   */
  public ChangeTopicAttributeRequest setTopicTalosResourceName(TopicTalosResourceName topicTalosResourceName) {
    this.topicTalosResourceName = topicTalosResourceName;
    return this;
  }

  public void unsetTopicTalosResourceName() {
    this.topicTalosResourceName = null;
  }

  /** Returns true if field topicTalosResourceName is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicTalosResourceName() {
    return this.topicTalosResourceName != null;
  }

  public void setTopicTalosResourceNameIsSet(boolean value) {
    if (!value) {
      this.topicTalosResourceName = null;
    }
  }

  /**
   * Topic attribute;
   * 
   */
  public TopicAttribute getTopicAttribute() {
    return this.topicAttribute;
  }

  /**
   * Topic attribute;
   * 
   */
  public ChangeTopicAttributeRequest setTopicAttribute(TopicAttribute topicAttribute) {
    this.topicAttribute = topicAttribute;
    return this;
  }

  public void unsetTopicAttribute() {
    this.topicAttribute = null;
  }

  /** Returns true if field topicAttribute is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAttribute() {
    return this.topicAttribute != null;
  }

  public void setTopicAttributeIsSet(boolean value) {
    if (!value) {
      this.topicAttribute = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_TALOS_RESOURCE_NAME:
      if (value == null) {
        unsetTopicTalosResourceName();
      } else {
        setTopicTalosResourceName((TopicTalosResourceName)value);
      }
      break;

    case TOPIC_ATTRIBUTE:
      if (value == null) {
        unsetTopicAttribute();
      } else {
        setTopicAttribute((TopicAttribute)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_TALOS_RESOURCE_NAME:
      return getTopicTalosResourceName();

    case TOPIC_ATTRIBUTE:
      return getTopicAttribute();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_TALOS_RESOURCE_NAME:
      return isSetTopicTalosResourceName();
    case TOPIC_ATTRIBUTE:
      return isSetTopicAttribute();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChangeTopicAttributeRequest)
      return this.equals((ChangeTopicAttributeRequest)that);
    return false;
  }

  public boolean equals(ChangeTopicAttributeRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicTalosResourceName = true && this.isSetTopicTalosResourceName();
    boolean that_present_topicTalosResourceName = true && that.isSetTopicTalosResourceName();
    if (this_present_topicTalosResourceName || that_present_topicTalosResourceName) {
      if (!(this_present_topicTalosResourceName && that_present_topicTalosResourceName))
        return false;
      if (!this.topicTalosResourceName.equals(that.topicTalosResourceName))
        return false;
    }

    boolean this_present_topicAttribute = true && this.isSetTopicAttribute();
    boolean that_present_topicAttribute = true && that.isSetTopicAttribute();
    if (this_present_topicAttribute || that_present_topicAttribute) {
      if (!(this_present_topicAttribute && that_present_topicAttribute))
        return false;
      if (!this.topicAttribute.equals(that.topicAttribute))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicTalosResourceName = true && (isSetTopicTalosResourceName());
    list.add(present_topicTalosResourceName);
    if (present_topicTalosResourceName)
      list.add(topicTalosResourceName);

    boolean present_topicAttribute = true && (isSetTopicAttribute());
    list.add(present_topicAttribute);
    if (present_topicAttribute)
      list.add(topicAttribute);

    return list.hashCode();
  }

  @Override
  public int compareTo(ChangeTopicAttributeRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicTalosResourceName()).compareTo(other.isSetTopicTalosResourceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicTalosResourceName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicTalosResourceName, other.topicTalosResourceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicAttribute()).compareTo(other.isSetTopicAttribute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAttribute()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAttribute, other.topicAttribute);
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
    StringBuilder sb = new StringBuilder("ChangeTopicAttributeRequest(");
    boolean first = true;

    sb.append("topicTalosResourceName:");
    if (this.topicTalosResourceName == null) {
      sb.append("null");
    } else {
      sb.append(this.topicTalosResourceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topicAttribute:");
    if (this.topicAttribute == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAttribute);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicTalosResourceName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicTalosResourceName' was not present! Struct: " + toString());
    }
    if (topicAttribute == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAttribute' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicTalosResourceName != null) {
      topicTalosResourceName.validate();
    }
    if (topicAttribute != null) {
      topicAttribute.validate();
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

  private static class ChangeTopicAttributeRequestStandardSchemeFactory implements SchemeFactory {
    public ChangeTopicAttributeRequestStandardScheme getScheme() {
      return new ChangeTopicAttributeRequestStandardScheme();
    }
  }

  private static class ChangeTopicAttributeRequestStandardScheme extends StandardScheme<ChangeTopicAttributeRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, ChangeTopicAttributeRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_TALOS_RESOURCE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicTalosResourceName = new TopicTalosResourceName();
              struct.topicTalosResourceName.read(iprot);
              struct.setTopicTalosResourceNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC_ATTRIBUTE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicAttribute = new TopicAttribute();
              struct.topicAttribute.read(iprot);
              struct.setTopicAttributeIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ChangeTopicAttributeRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicTalosResourceName != null) {
        oprot.writeFieldBegin(TOPIC_TALOS_RESOURCE_NAME_FIELD_DESC);
        struct.topicTalosResourceName.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.topicAttribute != null) {
        oprot.writeFieldBegin(TOPIC_ATTRIBUTE_FIELD_DESC);
        struct.topicAttribute.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChangeTopicAttributeRequestTupleSchemeFactory implements SchemeFactory {
    public ChangeTopicAttributeRequestTupleScheme getScheme() {
      return new ChangeTopicAttributeRequestTupleScheme();
    }
  }

  private static class ChangeTopicAttributeRequestTupleScheme extends TupleScheme<ChangeTopicAttributeRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ChangeTopicAttributeRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicTalosResourceName.write(oprot);
      struct.topicAttribute.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ChangeTopicAttributeRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicTalosResourceName = new TopicTalosResourceName();
      struct.topicTalosResourceName.read(iprot);
      struct.setTopicTalosResourceNameIsSet(true);
      struct.topicAttribute = new TopicAttribute();
      struct.topicAttribute.read(iprot);
      struct.setTopicAttributeIsSet(true);
    }
  }

}

