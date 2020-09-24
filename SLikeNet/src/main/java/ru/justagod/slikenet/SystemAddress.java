/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class SystemAddress {
  public transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SystemAddress(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SystemAddress obj) {
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
        SLikeNetJNI.delete_SystemAddress(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SystemAddress() {
    this(SLikeNetJNI.new_SystemAddress__SWIG_0(), true);
  }

  public SystemAddress(String str) {
    this(SLikeNetJNI.new_SystemAddress__SWIG_1(str), true);
  }

  public SystemAddress(String str, int port) {
    this(SLikeNetJNI.new_SystemAddress__SWIG_2(str, port), true);
  }

  public void setDebugPort(int value) {
    SLikeNetJNI.SystemAddress_debugPort_set(swigCPtr, this, value);
  }

  public int getDebugPort() {
    return SLikeNetJNI.SystemAddress_debugPort_get(swigCPtr, this);
  }

  public static int size() {
    return SLikeNetJNI.SystemAddress_size();
  }

  public static long ToInteger(SystemAddress sa) {
    return SLikeNetJNI.SystemAddress_ToInteger(SystemAddress.getCPtr(sa), sa);
  }

  public short GetIPVersion() {
    return SLikeNetJNI.SystemAddress_GetIPVersion(swigCPtr, this);
  }

  public long GetIPPROTO() {
    return SLikeNetJNI.SystemAddress_GetIPPROTO(swigCPtr, this);
  }

  public void SetToLoopback() {
    SLikeNetJNI.SystemAddress_SetToLoopback__SWIG_0(swigCPtr, this);
  }

  public void SetToLoopback(short ipVersion) {
    SLikeNetJNI.SystemAddress_SetToLoopback__SWIG_1(swigCPtr, this, ipVersion);
  }

  public boolean IsLoopback() {
    return SLikeNetJNI.SystemAddress_IsLoopback(swigCPtr, this);
  }

  public String ToString(boolean writePort, char portDelineator) {
    return SLikeNetJNI.SystemAddress_ToString__SWIG_0(swigCPtr, this, writePort, portDelineator);
  }

  public String ToString(boolean writePort) {
    return SLikeNetJNI.SystemAddress_ToString__SWIG_1(swigCPtr, this, writePort);
  }

  public void ToString(boolean writePort, String dest, char portDelineator) {
    SLikeNetJNI.SystemAddress_ToString__SWIG_2(swigCPtr, this, writePort, dest, portDelineator);
  }

  public void ToString(boolean writePort, String dest, long destLength, char portDelineator) {
    SLikeNetJNI.SystemAddress_ToString__SWIG_3(swigCPtr, this, writePort, dest, destLength, portDelineator);
  }

  public void ToString(boolean writePort, String dest, long destLength) {
    SLikeNetJNI.SystemAddress_ToString__SWIG_4(swigCPtr, this, writePort, dest, destLength);
  }

  public boolean FromString(String str, char portDelineator, int ipVersion) {
    return SLikeNetJNI.SystemAddress_FromString__SWIG_0(swigCPtr, this, str, portDelineator, ipVersion);
  }

  public boolean FromString(String str, char portDelineator) {
    return SLikeNetJNI.SystemAddress_FromString__SWIG_1(swigCPtr, this, str, portDelineator);
  }

  public boolean FromString(String str) {
    return SLikeNetJNI.SystemAddress_FromString__SWIG_2(swigCPtr, this, str);
  }

  public boolean FromStringExplicitPort(String str, int port, int ipVersion) {
    return SLikeNetJNI.SystemAddress_FromStringExplicitPort__SWIG_0(swigCPtr, this, str, port, ipVersion);
  }

  public boolean FromStringExplicitPort(String str, int port) {
    return SLikeNetJNI.SystemAddress_FromStringExplicitPort__SWIG_1(swigCPtr, this, str, port);
  }

  public void CopyPort(SystemAddress right) {
    SLikeNetJNI.SystemAddress_CopyPort(swigCPtr, this, SystemAddress.getCPtr(right), right);
  }

  public boolean EqualsExcludingPort(SystemAddress right) {
    return SLikeNetJNI.SystemAddress_EqualsExcludingPort(swigCPtr, this, SystemAddress.getCPtr(right), right);
  }

  public int GetPort() {
    return SLikeNetJNI.SystemAddress_GetPort(swigCPtr, this);
  }

  public int GetPortNetworkOrder() {
    return SLikeNetJNI.SystemAddress_GetPortNetworkOrder(swigCPtr, this);
  }

  public void SetPortHostOrder(int s) {
    SLikeNetJNI.SystemAddress_SetPortHostOrder(swigCPtr, this, s);
  }

  public void SetPortNetworkOrder(int s) {
    SLikeNetJNI.SystemAddress_SetPortNetworkOrder(swigCPtr, this, s);
  }

  public boolean SetBinaryAddress(String str, char portDelineator) {
    return SLikeNetJNI.SystemAddress_SetBinaryAddress__SWIG_0(swigCPtr, this, str, portDelineator);
  }

  public boolean SetBinaryAddress(String str) {
    return SLikeNetJNI.SystemAddress_SetBinaryAddress__SWIG_1(swigCPtr, this, str);
  }

  public void ToString_Old(boolean writePort, String dest, char portDelineator) {
    SLikeNetJNI.SystemAddress_ToString_Old__SWIG_0(swigCPtr, this, writePort, dest, portDelineator);
  }

  public void ToString_Old(boolean writePort, String dest) {
    SLikeNetJNI.SystemAddress_ToString_Old__SWIG_1(swigCPtr, this, writePort, dest);
  }

  public void ToString_Old(boolean writePort, String dest, long destLength, char portDelineator) {
    SLikeNetJNI.SystemAddress_ToString_Old__SWIG_2(swigCPtr, this, writePort, dest, destLength, portDelineator);
  }

  public void ToString_Old(boolean writePort, String dest, long destLength) {
    SLikeNetJNI.SystemAddress_ToString_Old__SWIG_3(swigCPtr, this, writePort, dest, destLength);
  }

  public void FixForIPVersion(SystemAddress boundAddressToSocket) {
    SLikeNetJNI.SystemAddress_FixForIPVersion(swigCPtr, this, SystemAddress.getCPtr(boundAddressToSocket), boundAddressToSocket);
  }

  public boolean IsLANAddress() {
    return SLikeNetJNI.SystemAddress_IsLANAddress(swigCPtr, this);
  }

  public void setSystemIndex(int value) {
    SLikeNetJNI.SystemAddress_systemIndex_set(swigCPtr, this, value);
  }

  public int getSystemIndex() {
    return SLikeNetJNI.SystemAddress_systemIndex_get(swigCPtr, this);
  }

  public SOCKADDR_IN GetAddr4() {
    long cPtr = SLikeNetJNI.SystemAddress_GetAddr4(swigCPtr, this);
    return (cPtr == 0) ? null : new SOCKADDR_IN(cPtr, false);
  }

}
