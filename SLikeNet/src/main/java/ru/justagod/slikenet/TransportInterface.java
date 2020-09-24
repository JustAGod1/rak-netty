/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class TransportInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TransportInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TransportInterface obj) {
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
        SLikeNetJNI.delete_TransportInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean Start(int port, boolean serverMode) {
    return SLikeNetJNI.TransportInterface_Start(swigCPtr, this, port, serverMode);
  }

  public void Stop() {
    SLikeNetJNI.TransportInterface_Stop(swigCPtr, this);
  }

  public void CloseConnection(SystemAddress systemAddress) {
    SLikeNetJNI.TransportInterface_CloseConnection(swigCPtr, this, SystemAddress.getCPtr(systemAddress), systemAddress);
  }

  public Packet Receive() {
    long cPtr = SLikeNetJNI.TransportInterface_Receive(swigCPtr, this);
    return (cPtr == 0) ? null : new Packet(cPtr, false);
  }

  public void DeallocatePacket(Packet packet) {
    SLikeNetJNI.TransportInterface_DeallocatePacket(swigCPtr, this, Packet.getCPtr(packet), packet);
  }

  public SystemAddress HasNewIncomingConnection() {
    return new SystemAddress(SLikeNetJNI.TransportInterface_HasNewIncomingConnection(swigCPtr, this), true);
  }

  public SystemAddress HasLostConnection() {
    return new SystemAddress(SLikeNetJNI.TransportInterface_HasLostConnection(swigCPtr, this), true);
  }

  public CommandParserInterface GetCommandParser() {
    long cPtr = SLikeNetJNI.TransportInterface_GetCommandParser(swigCPtr, this);
    return (cPtr == 0) ? null : new CommandParserInterface(cPtr, false);
  }

}