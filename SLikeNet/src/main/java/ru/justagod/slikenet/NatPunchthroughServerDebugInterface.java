/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class NatPunchthroughServerDebugInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NatPunchthroughServerDebugInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NatPunchthroughServerDebugInterface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        SLikeNetJNI.delete_NatPunchthroughServerDebugInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void OnServerMessage(String msg) {
    SLikeNetJNI.NatPunchthroughServerDebugInterface_OnServerMessage(swigCPtr, this, msg);
  }

}
