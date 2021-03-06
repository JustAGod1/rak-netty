/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class CommandParserInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CommandParserInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CommandParserInterface obj) {
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
        SLikeNetJNI.delete_CommandParserInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String GetName() {
    return SLikeNetJNI.CommandParserInterface_GetName(swigCPtr, this);
  }

  public void OnNewIncomingConnection(SystemAddress systemAddress, TransportInterface transport) {
    SLikeNetJNI.CommandParserInterface_OnNewIncomingConnection(swigCPtr, this, SystemAddress.getCPtr(systemAddress), systemAddress, TransportInterface.getCPtr(transport), transport);
  }

  public void OnConnectionLost(SystemAddress systemAddress, TransportInterface transport) {
    SLikeNetJNI.CommandParserInterface_OnConnectionLost(swigCPtr, this, SystemAddress.getCPtr(systemAddress), systemAddress, TransportInterface.getCPtr(transport), transport);
  }

  public void SendHelp(TransportInterface transport, SystemAddress systemAddress) {
    SLikeNetJNI.CommandParserInterface_SendHelp(swigCPtr, this, TransportInterface.getCPtr(transport), transport, SystemAddress.getCPtr(systemAddress), systemAddress);
  }

  public boolean OnCommand(String command, long numParameters, SWIGTYPE_p_p_char parameterList, TransportInterface transport, SystemAddress systemAddress, String originalString) {
    return SLikeNetJNI.CommandParserInterface_OnCommand(swigCPtr, this, command, numParameters, SWIGTYPE_p_p_char.getCPtr(parameterList), TransportInterface.getCPtr(transport), transport, SystemAddress.getCPtr(systemAddress), systemAddress, originalString);
  }

  public void OnTransportChange(TransportInterface transport) {
    SLikeNetJNI.CommandParserInterface_OnTransportChange(swigCPtr, this, TransportInterface.getCPtr(transport), transport);
  }

  public void SendCommandList(TransportInterface transport, SystemAddress systemAddress) {
    SLikeNetJNI.CommandParserInterface_SendCommandList(swigCPtr, this, TransportInterface.getCPtr(transport), transport, SystemAddress.getCPtr(systemAddress), systemAddress);
  }

  public static short getVARIABLE_NUMBER_OF_PARAMETERS() {
    return SLikeNetJNI.CommandParserInterface_VARIABLE_NUMBER_OF_PARAMETERS_get();
  }

  public void RegisterCommand(short parameterCount, String command, String commandHelp) {
    SLikeNetJNI.CommandParserInterface_RegisterCommand(swigCPtr, this, parameterCount, command, commandHelp);
  }

  public void ReturnResult(boolean res, String command, TransportInterface transport, SystemAddress systemAddress) {
    SLikeNetJNI.CommandParserInterface_ReturnResult__SWIG_0(swigCPtr, this, res, command, TransportInterface.getCPtr(transport), transport, SystemAddress.getCPtr(systemAddress), systemAddress);
  }

  public void ReturnResult(String res, String command, TransportInterface transport, SystemAddress systemAddress) {
    SLikeNetJNI.CommandParserInterface_ReturnResult__SWIG_1(swigCPtr, this, res, command, TransportInterface.getCPtr(transport), transport, SystemAddress.getCPtr(systemAddress), systemAddress);
  }

  public void ReturnResult(SystemAddress res, String command, TransportInterface transport, SystemAddress systemAddress) {
    SLikeNetJNI.CommandParserInterface_ReturnResult__SWIG_2(swigCPtr, this, SystemAddress.getCPtr(res), res, command, TransportInterface.getCPtr(transport), transport, SystemAddress.getCPtr(systemAddress), systemAddress);
  }

  public void ReturnResult(int res, String command, TransportInterface transport, SystemAddress systemAddress) {
    SLikeNetJNI.CommandParserInterface_ReturnResult__SWIG_3(swigCPtr, this, res, command, TransportInterface.getCPtr(transport), transport, SystemAddress.getCPtr(systemAddress), systemAddress);
  }

  public void ReturnResult(String command, TransportInterface transport, SystemAddress systemAddress) {
    SLikeNetJNI.CommandParserInterface_ReturnResult__SWIG_4(swigCPtr, this, command, TransportInterface.getCPtr(transport), transport, SystemAddress.getCPtr(systemAddress), systemAddress);
  }

}
