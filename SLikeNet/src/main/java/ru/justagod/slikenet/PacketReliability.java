/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public final class PacketReliability {
  public final static PacketReliability UNRELIABLE = new PacketReliability("UNRELIABLE");
  public final static PacketReliability UNRELIABLE_SEQUENCED = new PacketReliability("UNRELIABLE_SEQUENCED");
  public final static PacketReliability RELIABLE = new PacketReliability("RELIABLE");
  public final static PacketReliability RELIABLE_ORDERED = new PacketReliability("RELIABLE_ORDERED");
  public final static PacketReliability RELIABLE_SEQUENCED = new PacketReliability("RELIABLE_SEQUENCED");
  public final static PacketReliability UNRELIABLE_WITH_ACK_RECEIPT = new PacketReliability("UNRELIABLE_WITH_ACK_RECEIPT");
  public final static PacketReliability RELIABLE_WITH_ACK_RECEIPT = new PacketReliability("RELIABLE_WITH_ACK_RECEIPT");
  public final static PacketReliability RELIABLE_ORDERED_WITH_ACK_RECEIPT = new PacketReliability("RELIABLE_ORDERED_WITH_ACK_RECEIPT");
  public final static PacketReliability NUMBER_OF_RELIABILITIES = new PacketReliability("NUMBER_OF_RELIABILITIES");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static PacketReliability swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + PacketReliability.class + " with value " + swigValue);
  }

  private PacketReliability(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private PacketReliability(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private PacketReliability(String swigName, PacketReliability swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static PacketReliability[] swigValues = { UNRELIABLE, UNRELIABLE_SEQUENCED, RELIABLE, RELIABLE_ORDERED, RELIABLE_SEQUENCED, UNRELIABLE_WITH_ACK_RECEIPT, RELIABLE_WITH_ACK_RECEIPT, RELIABLE_ORDERED_WITH_ACK_RECEIPT, NUMBER_OF_RELIABILITIES };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
