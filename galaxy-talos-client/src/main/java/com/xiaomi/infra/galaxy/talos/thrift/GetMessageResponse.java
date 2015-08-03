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
public class GetMessageResponse implements libthrift091.TBase<GetMessageResponse, GetMessageResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetMessageResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetMessageResponse");

  private static final libthrift091.protocol.TField MESSAGES_FIELD_DESC = new libthrift091.protocol.TField("messages", libthrift091.protocol.TType.LIST, (short)1);
  private static final libthrift091.protocol.TField UN_HANDLED_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("unHandledMessageNumber", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField SEQUENCE_ID_FIELD_DESC = new libthrift091.protocol.TField("sequenceId", libthrift091.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetMessageResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetMessageResponseTupleSchemeFactory());
  }

  /**
   * The message list that got;
   * 
   */
  public List<Message> messages; // required
  /**
   * This is the diff number that the latest offset in the partition and the last
   * message offset return in the GetMessageResponse;
   * 
   */
  public long unHandledMessageNumber; // optional
  /**
   * The unique identifier for this GutMessageResponse, this should corresponding
   * to the sequenceId in the GutMessageRequest;
   * 
   */
  public String sequenceId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The message list that got;
     * 
     */
    MESSAGES((short)1, "messages"),
    /**
     * This is the diff number that the latest offset in the partition and the last
     * message offset return in the GetMessageResponse;
     * 
     */
    UN_HANDLED_MESSAGE_NUMBER((short)2, "unHandledMessageNumber"),
    /**
     * The unique identifier for this GutMessageResponse, this should corresponding
     * to the sequenceId in the GutMessageRequest;
     * 
     */
    SEQUENCE_ID((short)3, "sequenceId");

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
        case 1: // MESSAGES
          return MESSAGES;
        case 2: // UN_HANDLED_MESSAGE_NUMBER
          return UN_HANDLED_MESSAGE_NUMBER;
        case 3: // SEQUENCE_ID
          return SEQUENCE_ID;
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
  private static final int __UNHANDLEDMESSAGENUMBER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.UN_HANDLED_MESSAGE_NUMBER};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGES, new libthrift091.meta_data.FieldMetaData("messages", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Message.class))));
    tmpMap.put(_Fields.UN_HANDLED_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("unHandledMessageNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.SEQUENCE_ID, new libthrift091.meta_data.FieldMetaData("sequenceId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetMessageResponse.class, metaDataMap);
  }

  public GetMessageResponse() {
  }

  public GetMessageResponse(
    List<Message> messages,
    String sequenceId)
  {
    this();
    this.messages = messages;
    this.sequenceId = sequenceId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetMessageResponse(GetMessageResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMessages()) {
      List<Message> __this__messages = new ArrayList<Message>(other.messages.size());
      for (Message other_element : other.messages) {
        __this__messages.add(new Message(other_element));
      }
      this.messages = __this__messages;
    }
    this.unHandledMessageNumber = other.unHandledMessageNumber;
    if (other.isSetSequenceId()) {
      this.sequenceId = other.sequenceId;
    }
  }

  public GetMessageResponse deepCopy() {
    return new GetMessageResponse(this);
  }

  @Override
  public void clear() {
    this.messages = null;
    setUnHandledMessageNumberIsSet(false);
    this.unHandledMessageNumber = 0;
    this.sequenceId = null;
  }

  public int getMessagesSize() {
    return (this.messages == null) ? 0 : this.messages.size();
  }

  public java.util.Iterator<Message> getMessagesIterator() {
    return (this.messages == null) ? null : this.messages.iterator();
  }

  public void addToMessages(Message elem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Message>();
    }
    this.messages.add(elem);
  }

  /**
   * The message list that got;
   * 
   */
  public List<Message> getMessages() {
    return this.messages;
  }

  /**
   * The message list that got;
   * 
   */
  public GetMessageResponse setMessages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public void unsetMessages() {
    this.messages = null;
  }

  /** Returns true if field messages is set (has been assigned a value) and false otherwise */
  public boolean isSetMessages() {
    return this.messages != null;
  }

  public void setMessagesIsSet(boolean value) {
    if (!value) {
      this.messages = null;
    }
  }

  /**
   * This is the diff number that the latest offset in the partition and the last
   * message offset return in the GetMessageResponse;
   * 
   */
  public long getUnHandledMessageNumber() {
    return this.unHandledMessageNumber;
  }

  /**
   * This is the diff number that the latest offset in the partition and the last
   * message offset return in the GetMessageResponse;
   * 
   */
  public GetMessageResponse setUnHandledMessageNumber(long unHandledMessageNumber) {
    this.unHandledMessageNumber = unHandledMessageNumber;
    setUnHandledMessageNumberIsSet(true);
    return this;
  }

  public void unsetUnHandledMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNHANDLEDMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field unHandledMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetUnHandledMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __UNHANDLEDMESSAGENUMBER_ISSET_ID);
  }

  public void setUnHandledMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNHANDLEDMESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * The unique identifier for this GutMessageResponse, this should corresponding
   * to the sequenceId in the GutMessageRequest;
   * 
   */
  public String getSequenceId() {
    return this.sequenceId;
  }

  /**
   * The unique identifier for this GutMessageResponse, this should corresponding
   * to the sequenceId in the GutMessageRequest;
   * 
   */
  public GetMessageResponse setSequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

  public void unsetSequenceId() {
    this.sequenceId = null;
  }

  /** Returns true if field sequenceId is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceId() {
    return this.sequenceId != null;
  }

  public void setSequenceIdIsSet(boolean value) {
    if (!value) {
      this.sequenceId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MESSAGES:
      if (value == null) {
        unsetMessages();
      } else {
        setMessages((List<Message>)value);
      }
      break;

    case UN_HANDLED_MESSAGE_NUMBER:
      if (value == null) {
        unsetUnHandledMessageNumber();
      } else {
        setUnHandledMessageNumber((Long)value);
      }
      break;

    case SEQUENCE_ID:
      if (value == null) {
        unsetSequenceId();
      } else {
        setSequenceId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGES:
      return getMessages();

    case UN_HANDLED_MESSAGE_NUMBER:
      return Long.valueOf(getUnHandledMessageNumber());

    case SEQUENCE_ID:
      return getSequenceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MESSAGES:
      return isSetMessages();
    case UN_HANDLED_MESSAGE_NUMBER:
      return isSetUnHandledMessageNumber();
    case SEQUENCE_ID:
      return isSetSequenceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetMessageResponse)
      return this.equals((GetMessageResponse)that);
    return false;
  }

  public boolean equals(GetMessageResponse that) {
    if (that == null)
      return false;

    boolean this_present_messages = true && this.isSetMessages();
    boolean that_present_messages = true && that.isSetMessages();
    if (this_present_messages || that_present_messages) {
      if (!(this_present_messages && that_present_messages))
        return false;
      if (!this.messages.equals(that.messages))
        return false;
    }

    boolean this_present_unHandledMessageNumber = true && this.isSetUnHandledMessageNumber();
    boolean that_present_unHandledMessageNumber = true && that.isSetUnHandledMessageNumber();
    if (this_present_unHandledMessageNumber || that_present_unHandledMessageNumber) {
      if (!(this_present_unHandledMessageNumber && that_present_unHandledMessageNumber))
        return false;
      if (this.unHandledMessageNumber != that.unHandledMessageNumber)
        return false;
    }

    boolean this_present_sequenceId = true && this.isSetSequenceId();
    boolean that_present_sequenceId = true && that.isSetSequenceId();
    if (this_present_sequenceId || that_present_sequenceId) {
      if (!(this_present_sequenceId && that_present_sequenceId))
        return false;
      if (!this.sequenceId.equals(that.sequenceId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_messages = true && (isSetMessages());
    list.add(present_messages);
    if (present_messages)
      list.add(messages);

    boolean present_unHandledMessageNumber = true && (isSetUnHandledMessageNumber());
    list.add(present_unHandledMessageNumber);
    if (present_unHandledMessageNumber)
      list.add(unHandledMessageNumber);

    boolean present_sequenceId = true && (isSetSequenceId());
    list.add(present_sequenceId);
    if (present_sequenceId)
      list.add(sequenceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetMessageResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMessages()).compareTo(other.isSetMessages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessages()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messages, other.messages);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnHandledMessageNumber()).compareTo(other.isSetUnHandledMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnHandledMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.unHandledMessageNumber, other.unHandledMessageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSequenceId()).compareTo(other.isSetSequenceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sequenceId, other.sequenceId);
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
    StringBuilder sb = new StringBuilder("GetMessageResponse(");
    boolean first = true;

    sb.append("messages:");
    if (this.messages == null) {
      sb.append("null");
    } else {
      sb.append(this.messages);
    }
    first = false;
    if (isSetUnHandledMessageNumber()) {
      if (!first) sb.append(", ");
      sb.append("unHandledMessageNumber:");
      sb.append(this.unHandledMessageNumber);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("sequenceId:");
    if (this.sequenceId == null) {
      sb.append("null");
    } else {
      sb.append(this.sequenceId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (messages == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'messages' was not present! Struct: " + toString());
    }
    if (sequenceId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'sequenceId' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetMessageResponseStandardSchemeFactory implements SchemeFactory {
    public GetMessageResponseStandardScheme getScheme() {
      return new GetMessageResponseStandardScheme();
    }
  }

  private static class GetMessageResponseStandardScheme extends StandardScheme<GetMessageResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, GetMessageResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list8 = iprot.readListBegin();
                struct.messages = new ArrayList<Message>(_list8.size);
                Message _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new Message();
                  _elem9.read(iprot);
                  struct.messages.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setMessagesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UN_HANDLED_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.unHandledMessageNumber = iprot.readI64();
              struct.setUnHandledMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEQUENCE_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.sequenceId = iprot.readString();
              struct.setSequenceIdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, GetMessageResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.messages != null) {
        oprot.writeFieldBegin(MESSAGES_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.messages.size()));
          for (Message _iter11 : struct.messages)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetUnHandledMessageNumber()) {
        oprot.writeFieldBegin(UN_HANDLED_MESSAGE_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.unHandledMessageNumber);
        oprot.writeFieldEnd();
      }
      if (struct.sequenceId != null) {
        oprot.writeFieldBegin(SEQUENCE_ID_FIELD_DESC);
        oprot.writeString(struct.sequenceId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetMessageResponseTupleSchemeFactory implements SchemeFactory {
    public GetMessageResponseTupleScheme getScheme() {
      return new GetMessageResponseTupleScheme();
    }
  }

  private static class GetMessageResponseTupleScheme extends TupleScheme<GetMessageResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetMessageResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.messages.size());
        for (Message _iter12 : struct.messages)
        {
          _iter12.write(oprot);
        }
      }
      oprot.writeString(struct.sequenceId);
      BitSet optionals = new BitSet();
      if (struct.isSetUnHandledMessageNumber()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetUnHandledMessageNumber()) {
        oprot.writeI64(struct.unHandledMessageNumber);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetMessageResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TList _list13 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.messages = new ArrayList<Message>(_list13.size);
        Message _elem14;
        for (int _i15 = 0; _i15 < _list13.size; ++_i15)
        {
          _elem14 = new Message();
          _elem14.read(iprot);
          struct.messages.add(_elem14);
        }
      }
      struct.setMessagesIsSet(true);
      struct.sequenceId = iprot.readString();
      struct.setSequenceIdIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.unHandledMessageNumber = iprot.readI64();
        struct.setUnHandledMessageNumberIsSet(true);
      }
    }
  }

}

