/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public final class PluginReceiveResult {
  public final static PluginReceiveResult RR_STOP_PROCESSING_AND_DEALLOCATE = new PluginReceiveResult("RR_STOP_PROCESSING_AND_DEALLOCATE", SLikeNetJNI.RR_STOP_PROCESSING_AND_DEALLOCATE_get());
  public final static PluginReceiveResult RR_CONTINUE_PROCESSING = new PluginReceiveResult("RR_CONTINUE_PROCESSING");
  public final static PluginReceiveResult RR_STOP_PROCESSING = new PluginReceiveResult("RR_STOP_PROCESSING");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static PluginReceiveResult swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + PluginReceiveResult.class + " with value " + swigValue);
  }

  private PluginReceiveResult(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private PluginReceiveResult(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private PluginReceiveResult(String swigName, PluginReceiveResult swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static PluginReceiveResult[] swigValues = { RR_STOP_PROCESSING_AND_DEALLOCATE, RR_CONTINUE_PROCESSING, RR_STOP_PROCESSING };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

