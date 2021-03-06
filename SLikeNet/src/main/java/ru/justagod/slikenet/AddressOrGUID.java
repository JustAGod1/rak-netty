/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class AddressOrGUID {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AddressOrGUID(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AddressOrGUID obj) {
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
        SLikeNetJNI.delete_AddressOrGUID(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRakNetGuid(RakNetGUID value) {
    SLikeNetJNI.AddressOrGUID_rakNetGuid_set(swigCPtr, this, RakNetGUID.getCPtr(value), value);
  }

  public RakNetGUID getRakNetGuid() {
    long cPtr = SLikeNetJNI.AddressOrGUID_rakNetGuid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RakNetGUID(cPtr, false);
  }

  public void setSystemAddress(SystemAddress value) {
    SLikeNetJNI.AddressOrGUID_systemAddress_set(swigCPtr, this, SystemAddress.getCPtr(value), value);
  }

  public SystemAddress getSystemAddress() {
    long cPtr = SLikeNetJNI.AddressOrGUID_systemAddress_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SystemAddress(cPtr, false);
  }

  public int GetSystemIndex() {
    return SLikeNetJNI.AddressOrGUID_GetSystemIndex(swigCPtr, this);
  }

  public boolean IsUndefined() {
    return SLikeNetJNI.AddressOrGUID_IsUndefined(swigCPtr, this);
  }

  public void SetUndefined() {
    SLikeNetJNI.AddressOrGUID_SetUndefined(swigCPtr, this);
  }

  public static long ToInteger(AddressOrGUID aog) {
    return SLikeNetJNI.AddressOrGUID_ToInteger(AddressOrGUID.getCPtr(aog), aog);
  }

  public String ToString(boolean writePort) {
    return SLikeNetJNI.AddressOrGUID_ToString__SWIG_0(swigCPtr, this, writePort);
  }

  public void ToString(boolean writePort, String dest, long destLength) {
    SLikeNetJNI.AddressOrGUID_ToString__SWIG_1(swigCPtr, this, writePort, dest, destLength);
  }

  public AddressOrGUID() {
    this(SLikeNetJNI.new_AddressOrGUID__SWIG_0(), true);
  }

  public AddressOrGUID(AddressOrGUID input) {
    this(SLikeNetJNI.new_AddressOrGUID__SWIG_1(AddressOrGUID.getCPtr(input), input), true);
  }

  public AddressOrGUID(SystemAddress input) {
    this(SLikeNetJNI.new_AddressOrGUID__SWIG_2(SystemAddress.getCPtr(input), input), true);
  }

  public AddressOrGUID(Packet packet) {
    this(SLikeNetJNI.new_AddressOrGUID__SWIG_3(Packet.getCPtr(packet), packet), true);
  }

  public AddressOrGUID(RakNetGUID input) {
    this(SLikeNetJNI.new_AddressOrGUID__SWIG_4(RakNetGUID.getCPtr(input), input), true);
  }

}
