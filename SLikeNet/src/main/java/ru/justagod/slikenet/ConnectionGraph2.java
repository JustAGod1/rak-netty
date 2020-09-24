/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class ConnectionGraph2 extends PluginInterface2 {
  private transient long swigCPtr;

  protected ConnectionGraph2(long cPtr, boolean cMemoryOwn) {
    super(SLikeNetJNI.ConnectionGraph2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConnectionGraph2 obj) {
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
        SLikeNetJNI.delete_ConnectionGraph2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ConnectionGraph2 GetInstance() {
    long cPtr = SLikeNetJNI.ConnectionGraph2_GetInstance();
    return (cPtr == 0) ? null : new ConnectionGraph2(cPtr, false);
  }

  public static void DestroyInstance(ConnectionGraph2 i) {
    SLikeNetJNI.ConnectionGraph2_DestroyInstance(ConnectionGraph2.getCPtr(i), i);
  }

  public ConnectionGraph2() {
    this(SLikeNetJNI.new_ConnectionGraph2(), true);
  }

  public boolean GetConnectionListForRemoteSystem(RakNetGUID remoteSystemGuid, SystemAddress saOut, RakNetGUID guidOut, SWIGTYPE_p_unsigned_int outLength) {
    return SLikeNetJNI.ConnectionGraph2_GetConnectionListForRemoteSystem(swigCPtr, this, RakNetGUID.getCPtr(remoteSystemGuid), remoteSystemGuid, SystemAddress.getCPtr(saOut), saOut, RakNetGUID.getCPtr(guidOut), guidOut, SWIGTYPE_p_unsigned_int.getCPtr(outLength));
  }

  public boolean ConnectionExists(RakNetGUID g1, RakNetGUID g2) {
    return SLikeNetJNI.ConnectionGraph2_ConnectionExists(swigCPtr, this, RakNetGUID.getCPtr(g1), g1, RakNetGUID.getCPtr(g2), g2);
  }

  public int GetPingBetweenSystems(RakNetGUID g1, RakNetGUID g2) {
    return SLikeNetJNI.ConnectionGraph2_GetPingBetweenSystems(swigCPtr, this, RakNetGUID.getCPtr(g1), g1, RakNetGUID.getCPtr(g2), g2);
  }

  public RakNetGUID GetLowestAveragePingSystem() {
    return new RakNetGUID(SLikeNetJNI.ConnectionGraph2_GetLowestAveragePingSystem(swigCPtr, this), true);
  }

  public void SetAutoProcessNewConnections(boolean b) {
    SLikeNetJNI.ConnectionGraph2_SetAutoProcessNewConnections(swigCPtr, this, b);
  }

  public boolean GetAutoProcessNewConnections() {
    return SLikeNetJNI.ConnectionGraph2_GetAutoProcessNewConnections(swigCPtr, this);
  }

  public void AddParticipant(SystemAddress systemAddress, RakNetGUID rakNetGUID) {
    SLikeNetJNI.ConnectionGraph2_AddParticipant(swigCPtr, this, SystemAddress.getCPtr(systemAddress), systemAddress, RakNetGUID.getCPtr(rakNetGUID), rakNetGUID);
  }

}