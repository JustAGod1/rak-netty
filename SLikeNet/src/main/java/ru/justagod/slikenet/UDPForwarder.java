/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class UDPForwarder {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected UDPForwarder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UDPForwarder obj) {
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
        SLikeNetJNI.delete_UDPForwarder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UDPForwarder() {
    this(SLikeNetJNI.new_UDPForwarder(), true);
  }

  public void Startup() {
    SLikeNetJNI.UDPForwarder_Startup(swigCPtr, this);
  }

  public void Shutdown() {
    SLikeNetJNI.UDPForwarder_Shutdown(swigCPtr, this);
  }

  public void SetMaxForwardEntries(int maxEntries) {
    SLikeNetJNI.UDPForwarder_SetMaxForwardEntries(swigCPtr, this, maxEntries);
  }

  public int GetMaxForwardEntries() {
    return SLikeNetJNI.UDPForwarder_GetMaxForwardEntries(swigCPtr, this);
  }

  public int GetUsedForwardEntries() {
    return SLikeNetJNI.UDPForwarder_GetUsedForwardEntries(swigCPtr, this);
  }

  public UDPForwarderResult StartForwarding(SystemAddress source, SystemAddress destination, SWIGTYPE_p_unsigned___int32 timeoutOnNoDataMS, String forceHostAddress, int socketFamily, SWIGTYPE_p_unsigned_short forwardingPort, SWIGTYPE_p_int forwardingSocket) {
    return UDPForwarderResult.swigToEnum(SLikeNetJNI.UDPForwarder_StartForwarding(swigCPtr, this, SystemAddress.getCPtr(source), source, SystemAddress.getCPtr(destination), destination, SWIGTYPE_p_unsigned___int32.getCPtr(timeoutOnNoDataMS), forceHostAddress, socketFamily, SWIGTYPE_p_unsigned_short.getCPtr(forwardingPort), SWIGTYPE_p_int.getCPtr(forwardingSocket)));
  }

  public void StopForwarding(SystemAddress source, SystemAddress destination) {
    SLikeNetJNI.UDPForwarder_StopForwarding(swigCPtr, this, SystemAddress.getCPtr(source), source, SystemAddress.getCPtr(destination), destination);
  }

  static public class ForwardEntry {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected ForwardEntry(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ForwardEntry obj) {
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
          SLikeNetJNI.delete_UDPForwarder_ForwardEntry(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public ForwardEntry() {
      this(SLikeNetJNI.new_UDPForwarder_ForwardEntry(), true);
    }
  
    public void setAddr1Unconfirmed(SystemAddress value) {
      SLikeNetJNI.UDPForwarder_ForwardEntry_addr1Unconfirmed_set(swigCPtr, this, SystemAddress.getCPtr(value), value);
    }
  
    public SystemAddress getAddr1Unconfirmed() {
      long cPtr = SLikeNetJNI.UDPForwarder_ForwardEntry_addr1Unconfirmed_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SystemAddress(cPtr, false);
    }
  
    public void setAddr2Unconfirmed(SystemAddress value) {
      SLikeNetJNI.UDPForwarder_ForwardEntry_addr2Unconfirmed_set(swigCPtr, this, SystemAddress.getCPtr(value), value);
    }
  
    public SystemAddress getAddr2Unconfirmed() {
      long cPtr = SLikeNetJNI.UDPForwarder_ForwardEntry_addr2Unconfirmed_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SystemAddress(cPtr, false);
    }
  
    public void setAddr1Confirmed(SystemAddress value) {
      SLikeNetJNI.UDPForwarder_ForwardEntry_addr1Confirmed_set(swigCPtr, this, SystemAddress.getCPtr(value), value);
    }
  
    public SystemAddress getAddr1Confirmed() {
      long cPtr = SLikeNetJNI.UDPForwarder_ForwardEntry_addr1Confirmed_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SystemAddress(cPtr, false);
    }
  
    public void setAddr2Confirmed(SystemAddress value) {
      SLikeNetJNI.UDPForwarder_ForwardEntry_addr2Confirmed_set(swigCPtr, this, SystemAddress.getCPtr(value), value);
    }
  
    public SystemAddress getAddr2Confirmed() {
      long cPtr = SLikeNetJNI.UDPForwarder_ForwardEntry_addr2Confirmed_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SystemAddress(cPtr, false);
    }
  
    public void setTimeLastDatagramForwarded(SWIGTYPE_p_unsigned___int32 value) {
      SLikeNetJNI.UDPForwarder_ForwardEntry_timeLastDatagramForwarded_set(swigCPtr, this, SWIGTYPE_p_unsigned___int32.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned___int32 getTimeLastDatagramForwarded() {
      return new SWIGTYPE_p_unsigned___int32(SLikeNetJNI.UDPForwarder_ForwardEntry_timeLastDatagramForwarded_get(swigCPtr, this), true);
    }
  
    public void setSocket(int value) {
      SLikeNetJNI.UDPForwarder_ForwardEntry_socket_set(swigCPtr, this, value);
    }
  
    public int getSocket() {
      return SLikeNetJNI.UDPForwarder_ForwardEntry_socket_get(swigCPtr, this);
    }
  
    public void setTimeoutOnNoDataMS(SWIGTYPE_p_unsigned___int32 value) {
      SLikeNetJNI.UDPForwarder_ForwardEntry_timeoutOnNoDataMS_set(swigCPtr, this, SWIGTYPE_p_unsigned___int32.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned___int32 getTimeoutOnNoDataMS() {
      return new SWIGTYPE_p_unsigned___int32(SLikeNetJNI.UDPForwarder_ForwardEntry_timeoutOnNoDataMS_get(swigCPtr, this), true);
    }
  
    public void setSocketFamily(short value) {
      SLikeNetJNI.UDPForwarder_ForwardEntry_socketFamily_set(swigCPtr, this, value);
    }
  
    public short getSocketFamily() {
      return SLikeNetJNI.UDPForwarder_ForwardEntry_socketFamily_get(swigCPtr, this);
    }
  
  }

}
