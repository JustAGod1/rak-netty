/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class UDPProxyServerResultHandler {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected UDPProxyServerResultHandler(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UDPProxyServerResultHandler obj) {
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
        SLikeNetJNI.delete_UDPProxyServerResultHandler(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void OnLoginSuccess(RakString usedPassword, UDPProxyServer proxyServerPlugin) {
    SLikeNetJNI.UDPProxyServerResultHandler_OnLoginSuccess(swigCPtr, this, RakString.getCPtr(usedPassword), usedPassword, UDPProxyServer.getCPtr(proxyServerPlugin), proxyServerPlugin);
  }

  public void OnAlreadyLoggedIn(RakString usedPassword, UDPProxyServer proxyServerPlugin) {
    SLikeNetJNI.UDPProxyServerResultHandler_OnAlreadyLoggedIn(swigCPtr, this, RakString.getCPtr(usedPassword), usedPassword, UDPProxyServer.getCPtr(proxyServerPlugin), proxyServerPlugin);
  }

  public void OnNoPasswordSet(RakString usedPassword, UDPProxyServer proxyServerPlugin) {
    SLikeNetJNI.UDPProxyServerResultHandler_OnNoPasswordSet(swigCPtr, this, RakString.getCPtr(usedPassword), usedPassword, UDPProxyServer.getCPtr(proxyServerPlugin), proxyServerPlugin);
  }

  public void OnWrongPassword(RakString usedPassword, UDPProxyServer proxyServerPlugin) {
    SLikeNetJNI.UDPProxyServerResultHandler_OnWrongPassword(swigCPtr, this, RakString.getCPtr(usedPassword), usedPassword, UDPProxyServer.getCPtr(proxyServerPlugin), proxyServerPlugin);
  }

}
