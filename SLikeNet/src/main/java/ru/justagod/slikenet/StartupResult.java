/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public final class StartupResult {
  public final static StartupResult RAKNET_STARTED = new StartupResult("RAKNET_STARTED");
  public final static StartupResult RAKNET_ALREADY_STARTED = new StartupResult("RAKNET_ALREADY_STARTED");
  public final static StartupResult INVALID_SOCKET_DESCRIPTORS = new StartupResult("INVALID_SOCKET_DESCRIPTORS");
  public final static StartupResult INVALID_MAX_CONNECTIONS = new StartupResult("INVALID_MAX_CONNECTIONS");
  public final static StartupResult SOCKET_FAMILY_NOT_SUPPORTED = new StartupResult("SOCKET_FAMILY_NOT_SUPPORTED");
  public final static StartupResult SOCKET_PORT_ALREADY_IN_USE = new StartupResult("SOCKET_PORT_ALREADY_IN_USE");
  public final static StartupResult SOCKET_FAILED_TO_BIND = new StartupResult("SOCKET_FAILED_TO_BIND");
  public final static StartupResult SOCKET_FAILED_TEST_SEND = new StartupResult("SOCKET_FAILED_TEST_SEND");
  public final static StartupResult PORT_CANNOT_BE_ZERO = new StartupResult("PORT_CANNOT_BE_ZERO");
  public final static StartupResult FAILED_TO_CREATE_NETWORK_THREAD = new StartupResult("FAILED_TO_CREATE_NETWORK_THREAD");
  public final static StartupResult COULD_NOT_GENERATE_GUID = new StartupResult("COULD_NOT_GENERATE_GUID");
  public final static StartupResult STARTUP_OTHER_FAILURE = new StartupResult("STARTUP_OTHER_FAILURE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static StartupResult swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + StartupResult.class + " with value " + swigValue);
  }

  private StartupResult(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private StartupResult(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private StartupResult(String swigName, StartupResult swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static StartupResult[] swigValues = { RAKNET_STARTED, RAKNET_ALREADY_STARTED, INVALID_SOCKET_DESCRIPTORS, INVALID_MAX_CONNECTIONS, SOCKET_FAMILY_NOT_SUPPORTED, SOCKET_PORT_ALREADY_IN_USE, SOCKET_FAILED_TO_BIND, SOCKET_FAILED_TEST_SEND, PORT_CANNOT_BE_ZERO, FAILED_TO_CREATE_NETWORK_THREAD, COULD_NOT_GENERATE_GUID, STARTUP_OTHER_FAILURE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
