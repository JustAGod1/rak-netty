/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public final class PacketPriority {
  public final static PacketPriority IMMEDIATE_PRIORITY = new PacketPriority("IMMEDIATE_PRIORITY");
  public final static PacketPriority HIGH_PRIORITY = new PacketPriority("HIGH_PRIORITY");
  public final static PacketPriority MEDIUM_PRIORITY = new PacketPriority("MEDIUM_PRIORITY");
  public final static PacketPriority LOW_PRIORITY = new PacketPriority("LOW_PRIORITY");
  public final static PacketPriority NUMBER_OF_PRIORITIES = new PacketPriority("NUMBER_OF_PRIORITIES");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static PacketPriority swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + PacketPriority.class + " with value " + swigValue);
  }

  private PacketPriority(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private PacketPriority(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private PacketPriority(String swigName, PacketPriority swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static PacketPriority[] swigValues = { IMMEDIATE_PRIORITY, HIGH_PRIORITY, MEDIUM_PRIORITY, LOW_PRIORITY, NUMBER_OF_PRIORITIES };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

