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
 * Oauth认证信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-12")
public class OAuthInfo implements libthrift091.TBase<OAuthInfo, OAuthInfo._Fields>, java.io.Serializable, Cloneable, Comparable<OAuthInfo> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("OAuthInfo");

  private static final libthrift091.protocol.TField XIAOMI_APP_ID_FIELD_DESC = new libthrift091.protocol.TField("xiaomiAppId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField APP_USER_AUTH_PROVIDER_FIELD_DESC = new libthrift091.protocol.TField("appUserAuthProvider", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField ACCESS_TOKEN_FIELD_DESC = new libthrift091.protocol.TField("accessToken", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField OPEN_ID_FIELD_DESC = new libthrift091.protocol.TField("openId", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField MAC_KEY_FIELD_DESC = new libthrift091.protocol.TField("macKey", libthrift091.protocol.TType.STRING, (short)5);
  private static final libthrift091.protocol.TField MAC_ALGORITHM_FIELD_DESC = new libthrift091.protocol.TField("macAlgorithm", libthrift091.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OAuthInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OAuthInfoTupleSchemeFactory());
  }

  /**
   * 小米AppId
   */
  public String xiaomiAppId; // required
  /**
   * 第三方身份认证提供方
   * 
   * @see AppUserAuthProvider
   */
  public AppUserAuthProvider appUserAuthProvider; // required
  /**
   * 第三方认证的accessToken
   */
  public String accessToken; // optional
  /**
   * 仅用于微信OAuth认证
   */
  public String openId; // optional
  /**
   * 仅用于小米OAuth认证
   */
  public String macKey; // optional
  /**
   * 仅用于小米OAuth认证
   */
  public String macAlgorithm; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 小米AppId
     */
    XIAOMI_APP_ID((short)1, "xiaomiAppId"),
    /**
     * 第三方身份认证提供方
     * 
     * @see AppUserAuthProvider
     */
    APP_USER_AUTH_PROVIDER((short)2, "appUserAuthProvider"),
    /**
     * 第三方认证的accessToken
     */
    ACCESS_TOKEN((short)3, "accessToken"),
    /**
     * 仅用于微信OAuth认证
     */
    OPEN_ID((short)4, "openId"),
    /**
     * 仅用于小米OAuth认证
     */
    MAC_KEY((short)5, "macKey"),
    /**
     * 仅用于小米OAuth认证
     */
    MAC_ALGORITHM((short)6, "macAlgorithm");

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
        case 1: // XIAOMI_APP_ID
          return XIAOMI_APP_ID;
        case 2: // APP_USER_AUTH_PROVIDER
          return APP_USER_AUTH_PROVIDER;
        case 3: // ACCESS_TOKEN
          return ACCESS_TOKEN;
        case 4: // OPEN_ID
          return OPEN_ID;
        case 5: // MAC_KEY
          return MAC_KEY;
        case 6: // MAC_ALGORITHM
          return MAC_ALGORITHM;
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
  private static final _Fields optionals[] = {_Fields.ACCESS_TOKEN,_Fields.OPEN_ID,_Fields.MAC_KEY,_Fields.MAC_ALGORITHM};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.XIAOMI_APP_ID, new libthrift091.meta_data.FieldMetaData("xiaomiAppId", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.APP_USER_AUTH_PROVIDER, new libthrift091.meta_data.FieldMetaData("appUserAuthProvider", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, AppUserAuthProvider.class)));
    tmpMap.put(_Fields.ACCESS_TOKEN, new libthrift091.meta_data.FieldMetaData("accessToken", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPEN_ID, new libthrift091.meta_data.FieldMetaData("openId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAC_KEY, new libthrift091.meta_data.FieldMetaData("macKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAC_ALGORITHM, new libthrift091.meta_data.FieldMetaData("macAlgorithm", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(OAuthInfo.class, metaDataMap);
  }

  public OAuthInfo() {
  }

  public OAuthInfo(
    String xiaomiAppId,
    AppUserAuthProvider appUserAuthProvider)
  {
    this();
    this.xiaomiAppId = xiaomiAppId;
    this.appUserAuthProvider = appUserAuthProvider;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OAuthInfo(OAuthInfo other) {
    if (other.isSetXiaomiAppId()) {
      this.xiaomiAppId = other.xiaomiAppId;
    }
    if (other.isSetAppUserAuthProvider()) {
      this.appUserAuthProvider = other.appUserAuthProvider;
    }
    if (other.isSetAccessToken()) {
      this.accessToken = other.accessToken;
    }
    if (other.isSetOpenId()) {
      this.openId = other.openId;
    }
    if (other.isSetMacKey()) {
      this.macKey = other.macKey;
    }
    if (other.isSetMacAlgorithm()) {
      this.macAlgorithm = other.macAlgorithm;
    }
  }

  public OAuthInfo deepCopy() {
    return new OAuthInfo(this);
  }

  @Override
  public void clear() {
    this.xiaomiAppId = null;
    this.appUserAuthProvider = null;
    this.accessToken = null;
    this.openId = null;
    this.macKey = null;
    this.macAlgorithm = null;
  }

  /**
   * 小米AppId
   */
  public String getXiaomiAppId() {
    return this.xiaomiAppId;
  }

  /**
   * 小米AppId
   */
  public OAuthInfo setXiaomiAppId(String xiaomiAppId) {
    this.xiaomiAppId = xiaomiAppId;
    return this;
  }

  public void unsetXiaomiAppId() {
    this.xiaomiAppId = null;
  }

  /** Returns true if field xiaomiAppId is set (has been assigned a value) and false otherwise */
  public boolean isSetXiaomiAppId() {
    return this.xiaomiAppId != null;
  }

  public void setXiaomiAppIdIsSet(boolean value) {
    if (!value) {
      this.xiaomiAppId = null;
    }
  }

  /**
   * 第三方身份认证提供方
   * 
   * @see AppUserAuthProvider
   */
  public AppUserAuthProvider getAppUserAuthProvider() {
    return this.appUserAuthProvider;
  }

  /**
   * 第三方身份认证提供方
   * 
   * @see AppUserAuthProvider
   */
  public OAuthInfo setAppUserAuthProvider(AppUserAuthProvider appUserAuthProvider) {
    this.appUserAuthProvider = appUserAuthProvider;
    return this;
  }

  public void unsetAppUserAuthProvider() {
    this.appUserAuthProvider = null;
  }

  /** Returns true if field appUserAuthProvider is set (has been assigned a value) and false otherwise */
  public boolean isSetAppUserAuthProvider() {
    return this.appUserAuthProvider != null;
  }

  public void setAppUserAuthProviderIsSet(boolean value) {
    if (!value) {
      this.appUserAuthProvider = null;
    }
  }

  /**
   * 第三方认证的accessToken
   */
  public String getAccessToken() {
    return this.accessToken;
  }

  /**
   * 第三方认证的accessToken
   */
  public OAuthInfo setAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public void unsetAccessToken() {
    this.accessToken = null;
  }

  /** Returns true if field accessToken is set (has been assigned a value) and false otherwise */
  public boolean isSetAccessToken() {
    return this.accessToken != null;
  }

  public void setAccessTokenIsSet(boolean value) {
    if (!value) {
      this.accessToken = null;
    }
  }

  /**
   * 仅用于微信OAuth认证
   */
  public String getOpenId() {
    return this.openId;
  }

  /**
   * 仅用于微信OAuth认证
   */
  public OAuthInfo setOpenId(String openId) {
    this.openId = openId;
    return this;
  }

  public void unsetOpenId() {
    this.openId = null;
  }

  /** Returns true if field openId is set (has been assigned a value) and false otherwise */
  public boolean isSetOpenId() {
    return this.openId != null;
  }

  public void setOpenIdIsSet(boolean value) {
    if (!value) {
      this.openId = null;
    }
  }

  /**
   * 仅用于小米OAuth认证
   */
  public String getMacKey() {
    return this.macKey;
  }

  /**
   * 仅用于小米OAuth认证
   */
  public OAuthInfo setMacKey(String macKey) {
    this.macKey = macKey;
    return this;
  }

  public void unsetMacKey() {
    this.macKey = null;
  }

  /** Returns true if field macKey is set (has been assigned a value) and false otherwise */
  public boolean isSetMacKey() {
    return this.macKey != null;
  }

  public void setMacKeyIsSet(boolean value) {
    if (!value) {
      this.macKey = null;
    }
  }

  /**
   * 仅用于小米OAuth认证
   */
  public String getMacAlgorithm() {
    return this.macAlgorithm;
  }

  /**
   * 仅用于小米OAuth认证
   */
  public OAuthInfo setMacAlgorithm(String macAlgorithm) {
    this.macAlgorithm = macAlgorithm;
    return this;
  }

  public void unsetMacAlgorithm() {
    this.macAlgorithm = null;
  }

  /** Returns true if field macAlgorithm is set (has been assigned a value) and false otherwise */
  public boolean isSetMacAlgorithm() {
    return this.macAlgorithm != null;
  }

  public void setMacAlgorithmIsSet(boolean value) {
    if (!value) {
      this.macAlgorithm = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case XIAOMI_APP_ID:
      if (value == null) {
        unsetXiaomiAppId();
      } else {
        setXiaomiAppId((String)value);
      }
      break;

    case APP_USER_AUTH_PROVIDER:
      if (value == null) {
        unsetAppUserAuthProvider();
      } else {
        setAppUserAuthProvider((AppUserAuthProvider)value);
      }
      break;

    case ACCESS_TOKEN:
      if (value == null) {
        unsetAccessToken();
      } else {
        setAccessToken((String)value);
      }
      break;

    case OPEN_ID:
      if (value == null) {
        unsetOpenId();
      } else {
        setOpenId((String)value);
      }
      break;

    case MAC_KEY:
      if (value == null) {
        unsetMacKey();
      } else {
        setMacKey((String)value);
      }
      break;

    case MAC_ALGORITHM:
      if (value == null) {
        unsetMacAlgorithm();
      } else {
        setMacAlgorithm((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case XIAOMI_APP_ID:
      return getXiaomiAppId();

    case APP_USER_AUTH_PROVIDER:
      return getAppUserAuthProvider();

    case ACCESS_TOKEN:
      return getAccessToken();

    case OPEN_ID:
      return getOpenId();

    case MAC_KEY:
      return getMacKey();

    case MAC_ALGORITHM:
      return getMacAlgorithm();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case XIAOMI_APP_ID:
      return isSetXiaomiAppId();
    case APP_USER_AUTH_PROVIDER:
      return isSetAppUserAuthProvider();
    case ACCESS_TOKEN:
      return isSetAccessToken();
    case OPEN_ID:
      return isSetOpenId();
    case MAC_KEY:
      return isSetMacKey();
    case MAC_ALGORITHM:
      return isSetMacAlgorithm();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OAuthInfo)
      return this.equals((OAuthInfo)that);
    return false;
  }

  public boolean equals(OAuthInfo that) {
    if (that == null)
      return false;

    boolean this_present_xiaomiAppId = true && this.isSetXiaomiAppId();
    boolean that_present_xiaomiAppId = true && that.isSetXiaomiAppId();
    if (this_present_xiaomiAppId || that_present_xiaomiAppId) {
      if (!(this_present_xiaomiAppId && that_present_xiaomiAppId))
        return false;
      if (!this.xiaomiAppId.equals(that.xiaomiAppId))
        return false;
    }

    boolean this_present_appUserAuthProvider = true && this.isSetAppUserAuthProvider();
    boolean that_present_appUserAuthProvider = true && that.isSetAppUserAuthProvider();
    if (this_present_appUserAuthProvider || that_present_appUserAuthProvider) {
      if (!(this_present_appUserAuthProvider && that_present_appUserAuthProvider))
        return false;
      if (!this.appUserAuthProvider.equals(that.appUserAuthProvider))
        return false;
    }

    boolean this_present_accessToken = true && this.isSetAccessToken();
    boolean that_present_accessToken = true && that.isSetAccessToken();
    if (this_present_accessToken || that_present_accessToken) {
      if (!(this_present_accessToken && that_present_accessToken))
        return false;
      if (!this.accessToken.equals(that.accessToken))
        return false;
    }

    boolean this_present_openId = true && this.isSetOpenId();
    boolean that_present_openId = true && that.isSetOpenId();
    if (this_present_openId || that_present_openId) {
      if (!(this_present_openId && that_present_openId))
        return false;
      if (!this.openId.equals(that.openId))
        return false;
    }

    boolean this_present_macKey = true && this.isSetMacKey();
    boolean that_present_macKey = true && that.isSetMacKey();
    if (this_present_macKey || that_present_macKey) {
      if (!(this_present_macKey && that_present_macKey))
        return false;
      if (!this.macKey.equals(that.macKey))
        return false;
    }

    boolean this_present_macAlgorithm = true && this.isSetMacAlgorithm();
    boolean that_present_macAlgorithm = true && that.isSetMacAlgorithm();
    if (this_present_macAlgorithm || that_present_macAlgorithm) {
      if (!(this_present_macAlgorithm && that_present_macAlgorithm))
        return false;
      if (!this.macAlgorithm.equals(that.macAlgorithm))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_xiaomiAppId = true && (isSetXiaomiAppId());
    list.add(present_xiaomiAppId);
    if (present_xiaomiAppId)
      list.add(xiaomiAppId);

    boolean present_appUserAuthProvider = true && (isSetAppUserAuthProvider());
    list.add(present_appUserAuthProvider);
    if (present_appUserAuthProvider)
      list.add(appUserAuthProvider.getValue());

    boolean present_accessToken = true && (isSetAccessToken());
    list.add(present_accessToken);
    if (present_accessToken)
      list.add(accessToken);

    boolean present_openId = true && (isSetOpenId());
    list.add(present_openId);
    if (present_openId)
      list.add(openId);

    boolean present_macKey = true && (isSetMacKey());
    list.add(present_macKey);
    if (present_macKey)
      list.add(macKey);

    boolean present_macAlgorithm = true && (isSetMacAlgorithm());
    list.add(present_macAlgorithm);
    if (present_macAlgorithm)
      list.add(macAlgorithm);

    return list.hashCode();
  }

  @Override
  public int compareTo(OAuthInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetXiaomiAppId()).compareTo(other.isSetXiaomiAppId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetXiaomiAppId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.xiaomiAppId, other.xiaomiAppId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppUserAuthProvider()).compareTo(other.isSetAppUserAuthProvider());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppUserAuthProvider()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.appUserAuthProvider, other.appUserAuthProvider);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAccessToken()).compareTo(other.isSetAccessToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccessToken()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.accessToken, other.accessToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpenId()).compareTo(other.isSetOpenId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpenId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.openId, other.openId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMacKey()).compareTo(other.isSetMacKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMacKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.macKey, other.macKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMacAlgorithm()).compareTo(other.isSetMacAlgorithm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMacAlgorithm()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.macAlgorithm, other.macAlgorithm);
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
    StringBuilder sb = new StringBuilder("OAuthInfo(");
    boolean first = true;

    sb.append("xiaomiAppId:");
    if (this.xiaomiAppId == null) {
      sb.append("null");
    } else {
      sb.append(this.xiaomiAppId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("appUserAuthProvider:");
    if (this.appUserAuthProvider == null) {
      sb.append("null");
    } else {
      sb.append(this.appUserAuthProvider);
    }
    first = false;
    if (isSetAccessToken()) {
      if (!first) sb.append(", ");
      sb.append("accessToken:");
      if (this.accessToken == null) {
        sb.append("null");
      } else {
        sb.append(this.accessToken);
      }
      first = false;
    }
    if (isSetOpenId()) {
      if (!first) sb.append(", ");
      sb.append("openId:");
      if (this.openId == null) {
        sb.append("null");
      } else {
        sb.append(this.openId);
      }
      first = false;
    }
    if (isSetMacKey()) {
      if (!first) sb.append(", ");
      sb.append("macKey:");
      if (this.macKey == null) {
        sb.append("null");
      } else {
        sb.append(this.macKey);
      }
      first = false;
    }
    if (isSetMacAlgorithm()) {
      if (!first) sb.append(", ");
      sb.append("macAlgorithm:");
      if (this.macAlgorithm == null) {
        sb.append("null");
      } else {
        sb.append(this.macAlgorithm);
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

  private static class OAuthInfoStandardSchemeFactory implements SchemeFactory {
    public OAuthInfoStandardScheme getScheme() {
      return new OAuthInfoStandardScheme();
    }
  }

  private static class OAuthInfoStandardScheme extends StandardScheme<OAuthInfo> {

    public void read(libthrift091.protocol.TProtocol iprot, OAuthInfo struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // XIAOMI_APP_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.xiaomiAppId = iprot.readString();
              struct.setXiaomiAppIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // APP_USER_AUTH_PROVIDER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.appUserAuthProvider = com.xiaomi.infra.galaxy.sds.thrift.AppUserAuthProvider.findByValue(iprot.readI32());
              struct.setAppUserAuthProviderIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACCESS_TOKEN
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.accessToken = iprot.readString();
              struct.setAccessTokenIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OPEN_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.openId = iprot.readString();
              struct.setOpenIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MAC_KEY
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.macKey = iprot.readString();
              struct.setMacKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MAC_ALGORITHM
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.macAlgorithm = iprot.readString();
              struct.setMacAlgorithmIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, OAuthInfo struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.xiaomiAppId != null) {
        oprot.writeFieldBegin(XIAOMI_APP_ID_FIELD_DESC);
        oprot.writeString(struct.xiaomiAppId);
        oprot.writeFieldEnd();
      }
      if (struct.appUserAuthProvider != null) {
        oprot.writeFieldBegin(APP_USER_AUTH_PROVIDER_FIELD_DESC);
        oprot.writeI32(struct.appUserAuthProvider.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.accessToken != null) {
        if (struct.isSetAccessToken()) {
          oprot.writeFieldBegin(ACCESS_TOKEN_FIELD_DESC);
          oprot.writeString(struct.accessToken);
          oprot.writeFieldEnd();
        }
      }
      if (struct.openId != null) {
        if (struct.isSetOpenId()) {
          oprot.writeFieldBegin(OPEN_ID_FIELD_DESC);
          oprot.writeString(struct.openId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.macKey != null) {
        if (struct.isSetMacKey()) {
          oprot.writeFieldBegin(MAC_KEY_FIELD_DESC);
          oprot.writeString(struct.macKey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.macAlgorithm != null) {
        if (struct.isSetMacAlgorithm()) {
          oprot.writeFieldBegin(MAC_ALGORITHM_FIELD_DESC);
          oprot.writeString(struct.macAlgorithm);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OAuthInfoTupleSchemeFactory implements SchemeFactory {
    public OAuthInfoTupleScheme getScheme() {
      return new OAuthInfoTupleScheme();
    }
  }

  private static class OAuthInfoTupleScheme extends TupleScheme<OAuthInfo> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, OAuthInfo struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetXiaomiAppId()) {
        optionals.set(0);
      }
      if (struct.isSetAppUserAuthProvider()) {
        optionals.set(1);
      }
      if (struct.isSetAccessToken()) {
        optionals.set(2);
      }
      if (struct.isSetOpenId()) {
        optionals.set(3);
      }
      if (struct.isSetMacKey()) {
        optionals.set(4);
      }
      if (struct.isSetMacAlgorithm()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetXiaomiAppId()) {
        oprot.writeString(struct.xiaomiAppId);
      }
      if (struct.isSetAppUserAuthProvider()) {
        oprot.writeI32(struct.appUserAuthProvider.getValue());
      }
      if (struct.isSetAccessToken()) {
        oprot.writeString(struct.accessToken);
      }
      if (struct.isSetOpenId()) {
        oprot.writeString(struct.openId);
      }
      if (struct.isSetMacKey()) {
        oprot.writeString(struct.macKey);
      }
      if (struct.isSetMacAlgorithm()) {
        oprot.writeString(struct.macAlgorithm);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, OAuthInfo struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.xiaomiAppId = iprot.readString();
        struct.setXiaomiAppIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.appUserAuthProvider = com.xiaomi.infra.galaxy.sds.thrift.AppUserAuthProvider.findByValue(iprot.readI32());
        struct.setAppUserAuthProviderIsSet(true);
      }
      if (incoming.get(2)) {
        struct.accessToken = iprot.readString();
        struct.setAccessTokenIsSet(true);
      }
      if (incoming.get(3)) {
        struct.openId = iprot.readString();
        struct.setOpenIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.macKey = iprot.readString();
        struct.setMacKeyIsSet(true);
      }
      if (incoming.get(5)) {
        struct.macAlgorithm = iprot.readString();
        struct.setMacAlgorithmIsSet(true);
      }
    }
  }

}

