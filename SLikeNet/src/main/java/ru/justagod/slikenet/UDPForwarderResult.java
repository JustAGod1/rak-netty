/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public final class UDPForwarderResult {
  public final static UDPForwarderResult UDPFORWARDER_FORWARDING_ALREADY_EXISTS = new UDPForwarderResult("UDPFORWARDER_FORWARDING_ALREADY_EXISTS");
  public final static UDPForwarderResult UDPFORWARDER_NO_SOCKETS = new UDPForwarderResult("UDPFORWARDER_NO_SOCKETS");
  public final static UDPForwarderResult UDPFORWARDER_BIND_FAILED = new UDPForwarderResult("UDPFORWARDER_BIND_FAILED");
  public final static UDPForwarderResult UDPFORWARDER_INVALID_PARAMETERS = new UDPForwarderResult("UDPFORWARDER_INVALID_PARAMETERS");
  public final static UDPForwarderResult UDPFORWARDER_NOT_RUNNING = new UDPForwarderResult("UDPFORWARDER_NOT_RUNNING");
  public final static UDPForwarderResult UDPFORWARDER_SUCCESS = new UDPForwarderResult("UDPFORWARDER_SUCCESS");
  public final static UDPForwarderResult UDPFORWARDER_RESULT_COUNT = new UDPForwarderResult("UDPFORWARDER_RESULT_COUNT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static UDPForwarderResult swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + UDPForwarderResult.class + " with value " + swigValue);
  }

  private UDPForwarderResult(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private UDPForwarderResult(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private UDPForwarderResult(String swigName, UDPForwarderResult swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static UDPForwarderResult[] swigValues = { UDPFORWARDER_FORWARDING_ALREADY_EXISTS, UDPFORWARDER_NO_SOCKETS, UDPFORWARDER_BIND_FAILED, UDPFORWARDER_INVALID_PARAMETERS, UDPFORWARDER_NOT_RUNNING, UDPFORWARDER_SUCCESS, UDPFORWARDER_RESULT_COUNT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
