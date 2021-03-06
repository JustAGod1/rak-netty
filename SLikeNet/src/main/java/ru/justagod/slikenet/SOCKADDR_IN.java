/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class SOCKADDR_IN {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SOCKADDR_IN(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SOCKADDR_IN obj) {
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
        SLikeNetJNI.delete_SOCKADDR_IN(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSin_family(short value) {
    SLikeNetJNI.SOCKADDR_IN_sin_family_set(swigCPtr, this, value);
  }

  public short getSin_family() {
    return SLikeNetJNI.SOCKADDR_IN_sin_family_get(swigCPtr, this);
  }

  public void setSin_port(SWIGTYPE_p_USHORT value) {
    SLikeNetJNI.SOCKADDR_IN_sin_port_set(swigCPtr, this, SWIGTYPE_p_USHORT.getCPtr(value));
  }

  public SWIGTYPE_p_USHORT getSin_port() {
    return new SWIGTYPE_p_USHORT(SLikeNetJNI.SOCKADDR_IN_sin_port_get(swigCPtr, this), true);
  }

  public void setSin_addr(SWIGTYPE_p_IN_ADDR value) {
    SLikeNetJNI.SOCKADDR_IN_sin_addr_set(swigCPtr, this, SWIGTYPE_p_IN_ADDR.getCPtr(value));
  }

  public SWIGTYPE_p_IN_ADDR getSin_addr() {
    return new SWIGTYPE_p_IN_ADDR(SLikeNetJNI.SOCKADDR_IN_sin_addr_get(swigCPtr, this), true);
  }

  public void setSin_zero(SWIGTYPE_p_CHAR value) {
    SLikeNetJNI.SOCKADDR_IN_sin_zero_set(swigCPtr, this, SWIGTYPE_p_CHAR.getCPtr(value));
  }

  public SWIGTYPE_p_CHAR getSin_zero() {
    long cPtr = SLikeNetJNI.SOCKADDR_IN_sin_zero_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_CHAR(cPtr, false);
  }

  public SOCKADDR_IN() {
    this(SLikeNetJNI.new_SOCKADDR_IN(), true);
  }

}
