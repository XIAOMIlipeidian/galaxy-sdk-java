/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

public enum TopicStatus implements libthrift091.TEnum {
  CREATING(0),
  ACTIVE(1),
  DELETING(2),
  DELETED(3);

  private final int value;

  private TopicStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TopicStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return CREATING;
      case 1:
        return ACTIVE;
      case 2:
        return DELETING;
      case 3:
        return DELETED;
      default:
        return null;
    }
  }
}
