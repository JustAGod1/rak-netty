/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class NatPunchthroughServerDebugInterface_PacketLogger extends NatPunchthroughServerDebugInterface {
  private transient long swigCPtr;

  protected NatPunchthroughServerDebugInterface_PacketLogger(long cPtr, boolean cMemoryOwn) {
    super(SLikeNetJNI.NatPunchthroughServerDebugInterface_PacketLogger_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NatPunchthroughServerDebugInterface_PacketLogger obj) {
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
        SLikeNetJNI.delete_NatPunchthroughServerDebugInterface_PacketLogger(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setPl(PacketLogger value) {
    SLikeNetJNI.NatPunchthroughServerDebugInterface_PacketLogger_pl_set(swigCPtr, this, PacketLogger.getCPtr(value), value);
  }

  public PacketLogger getPl() {
    long cPtr = SLikeNetJNI.NatPunchthroughServerDebugInterface_PacketLogger_pl_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PacketLogger(cPtr, false);
  }

  public NatPunchthroughServerDebugInterface_PacketLogger() {
    this(SLikeNetJNI.new_NatPunchthroughServerDebugInterface_PacketLogger(), true);
  }

  public void OnServerMessage(String msg) {
    SLikeNetJNI.NatPunchthroughServerDebugInterface_PacketLogger_OnServerMessage(swigCPtr, this, msg);
  }

}
