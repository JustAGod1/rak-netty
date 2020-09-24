/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public final class ConnectionAttemptResult {
  public final static ConnectionAttemptResult CONNECTION_ATTEMPT_STARTED = new ConnectionAttemptResult("CONNECTION_ATTEMPT_STARTED");
  public final static ConnectionAttemptResult INVALID_PARAMETER = new ConnectionAttemptResult("INVALID_PARAMETER");
  public final static ConnectionAttemptResult CANNOT_RESOLVE_DOMAIN_NAME = new ConnectionAttemptResult("CANNOT_RESOLVE_DOMAIN_NAME");
  public final static ConnectionAttemptResult ALREADY_CONNECTED_TO_ENDPOINT = new ConnectionAttemptResult("ALREADY_CONNECTED_TO_ENDPOINT");
  public final static ConnectionAttemptResult CONNECTION_ATTEMPT_ALREADY_IN_PROGRESS = new ConnectionAttemptResult("CONNECTION_ATTEMPT_ALREADY_IN_PROGRESS");
  public final static ConnectionAttemptResult SECURITY_INITIALIZATION_FAILED = new ConnectionAttemptResult("SECURITY_INITIALIZATION_FAILED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ConnectionAttemptResult swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ConnectionAttemptResult.class + " with value " + swigValue);
  }

  private ConnectionAttemptResult(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ConnectionAttemptResult(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ConnectionAttemptResult(String swigName, ConnectionAttemptResult swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ConnectionAttemptResult[] swigValues = { CONNECTION_ATTEMPT_STARTED, INVALID_PARAMETER, CANNOT_RESOLVE_DOMAIN_NAME, ALREADY_CONNECTED_TO_ENDPOINT, CONNECTION_ATTEMPT_ALREADY_IN_PROGRESS, SECURITY_INITIALIZATION_FAILED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
