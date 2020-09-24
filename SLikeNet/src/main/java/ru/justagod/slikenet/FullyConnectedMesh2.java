/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class FullyConnectedMesh2 extends PluginInterface2 {
  private transient long swigCPtr;

  protected FullyConnectedMesh2(long cPtr, boolean cMemoryOwn) {
    super(SLikeNetJNI.FullyConnectedMesh2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FullyConnectedMesh2 obj) {
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
        SLikeNetJNI.delete_FullyConnectedMesh2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static FullyConnectedMesh2 GetInstance() {
    long cPtr = SLikeNetJNI.FullyConnectedMesh2_GetInstance();
    return (cPtr == 0) ? null : new FullyConnectedMesh2(cPtr, false);
  }

  public static void DestroyInstance(FullyConnectedMesh2 i) {
    SLikeNetJNI.FullyConnectedMesh2_DestroyInstance(FullyConnectedMesh2.getCPtr(i), i);
  }

  public FullyConnectedMesh2() {
    this(SLikeNetJNI.new_FullyConnectedMesh2(), true);
  }

  public void SetConnectOnNewRemoteConnection(boolean attemptConnection, RakString pw) {
    SLikeNetJNI.FullyConnectedMesh2_SetConnectOnNewRemoteConnection(swigCPtr, this, attemptConnection, RakString.getCPtr(pw), pw);
  }

  public RakNetGUID GetConnectedHost() {
    return new RakNetGUID(SLikeNetJNI.FullyConnectedMesh2_GetConnectedHost(swigCPtr, this), true);
  }

  public SystemAddress GetConnectedHostAddr() {
    return new SystemAddress(SLikeNetJNI.FullyConnectedMesh2_GetConnectedHostAddr(swigCPtr, this), true);
  }

  public RakNetGUID GetHostSystem() {
    return new RakNetGUID(SLikeNetJNI.FullyConnectedMesh2_GetHostSystem(swigCPtr, this), true);
  }

  public boolean IsHostSystem() {
    return SLikeNetJNI.FullyConnectedMesh2_IsHostSystem(swigCPtr, this);
  }

  public void GetHostOrder(RakNetListRakNetGUID hostList) {
    SLikeNetJNI.FullyConnectedMesh2_GetHostOrder(swigCPtr, this, RakNetListRakNetGUID.getCPtr(hostList), hostList);
  }

  public boolean IsConnectedHost() {
    return SLikeNetJNI.FullyConnectedMesh2_IsConnectedHost(swigCPtr, this);
  }

  public void SetAutoparticipateConnections(boolean b) {
    SLikeNetJNI.FullyConnectedMesh2_SetAutoparticipateConnections(swigCPtr, this, b);
  }

  public void ResetHostCalculation() {
    SLikeNetJNI.FullyConnectedMesh2_ResetHostCalculation(swigCPtr, this);
  }

  public void AddParticipant(RakNetGUID rakNetGuid) {
    SLikeNetJNI.FullyConnectedMesh2_AddParticipant(swigCPtr, this, RakNetGUID.getCPtr(rakNetGuid), rakNetGuid);
  }

  public void GetParticipantList(RakNetListRakNetGUID participantList) {
    SLikeNetJNI.FullyConnectedMesh2_GetParticipantList(swigCPtr, this, RakNetListRakNetGUID.getCPtr(participantList), participantList);
  }

  public boolean HasParticipant(RakNetGUID participantGuid) {
    return SLikeNetJNI.FullyConnectedMesh2_HasParticipant(swigCPtr, this, RakNetGUID.getCPtr(participantGuid), participantGuid);
  }

  public void ConnectToRemoteNewIncomingConnections(Packet packet) {
    SLikeNetJNI.FullyConnectedMesh2_ConnectToRemoteNewIncomingConnections(swigCPtr, this, Packet.getCPtr(packet), packet);
  }

  public void Clear() {
    SLikeNetJNI.FullyConnectedMesh2_Clear(swigCPtr, this);
  }

  public long GetParticipantCount() {
    return SLikeNetJNI.FullyConnectedMesh2_GetParticipantCount__SWIG_0(swigCPtr, this);
  }

  public void GetParticipantCount(SWIGTYPE_p_unsigned_int participantListSize) {
    SLikeNetJNI.FullyConnectedMesh2_GetParticipantCount__SWIG_1(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(participantListSize));
  }

  public void StartVerifiedJoin(RakNetGUID client) {
    SLikeNetJNI.FullyConnectedMesh2_StartVerifiedJoin(swigCPtr, this, RakNetGUID.getCPtr(client), client);
  }

  public void RespondOnVerifiedJoinCapable(Packet packet, boolean accept, BitStream additionalData) {
    SLikeNetJNI.FullyConnectedMesh2_RespondOnVerifiedJoinCapable(swigCPtr, this, Packet.getCPtr(packet), packet, accept, BitStream.getCPtr(additionalData), additionalData);
  }

  public void GetVerifiedJoinRequiredProcessingList(RakNetGUID host, RakNetListSystemAddress addresses, RakNetListRakNetGUID guids, SWIGTYPE_p_DataStructures__ListT_SLNet__BitStream_p_t userData) {
    SLikeNetJNI.FullyConnectedMesh2_GetVerifiedJoinRequiredProcessingList(swigCPtr, this, RakNetGUID.getCPtr(host), host, RakNetListSystemAddress.getCPtr(addresses), addresses, RakNetListRakNetGUID.getCPtr(guids), guids, SWIGTYPE_p_DataStructures__ListT_SLNet__BitStream_p_t.getCPtr(userData));
  }

  public void GetVerifiedJoinAcceptedAdditionalData(Packet packet, SWIGTYPE_p_bool thisSystemAccepted, RakNetListRakNetGUID systemsAccepted, BitStream additionalData) {
    SLikeNetJNI.FullyConnectedMesh2_GetVerifiedJoinAcceptedAdditionalData(swigCPtr, this, Packet.getCPtr(packet), packet, SWIGTYPE_p_bool.getCPtr(thisSystemAccepted), RakNetListRakNetGUID.getCPtr(systemsAccepted), systemsAccepted, BitStream.getCPtr(additionalData), additionalData);
  }

  public void GetVerifiedJoinRejectedAdditionalData(Packet packet, BitStream additionalData) {
    SLikeNetJNI.FullyConnectedMesh2_GetVerifiedJoinRejectedAdditionalData(swigCPtr, this, Packet.getCPtr(packet), packet, BitStream.getCPtr(additionalData), additionalData);
  }

  public void WriteVJCUserData(BitStream bsOut) {
    SLikeNetJNI.FullyConnectedMesh2_WriteVJCUserData(swigCPtr, this, BitStream.getCPtr(bsOut), bsOut);
  }

  public static void SkipToVJCUserData(BitStream bsIn) {
    SLikeNetJNI.FullyConnectedMesh2_SkipToVJCUserData(BitStream.getCPtr(bsIn), bsIn);
  }

  public void WriteVJSUserData(BitStream bsOut, RakNetGUID userGuid) {
    SLikeNetJNI.FullyConnectedMesh2_WriteVJSUserData(swigCPtr, this, BitStream.getCPtr(bsOut), bsOut, RakNetGUID.getCPtr(userGuid), userGuid);
  }

  static public class FCM2Participant {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected FCM2Participant(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(FCM2Participant obj) {
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
          SLikeNetJNI.delete_FullyConnectedMesh2_FCM2Participant(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public FCM2Participant() {
      this(SLikeNetJNI.new_FullyConnectedMesh2_FCM2Participant__SWIG_0(), true);
    }
  
    public FCM2Participant(long _fcm2Guid, RakNetGUID _rakNetGuid) {
      this(SLikeNetJNI.new_FullyConnectedMesh2_FCM2Participant__SWIG_1(_fcm2Guid, RakNetGUID.getCPtr(_rakNetGuid), _rakNetGuid), true);
    }
  
    public void setFcm2Guid(long value) {
      SLikeNetJNI.FullyConnectedMesh2_FCM2Participant_fcm2Guid_set(swigCPtr, this, value);
    }
  
    public long getFcm2Guid() {
      return SLikeNetJNI.FullyConnectedMesh2_FCM2Participant_fcm2Guid_get(swigCPtr, this);
    }
  
    public void setRakNetGuid(RakNetGUID value) {
      SLikeNetJNI.FullyConnectedMesh2_FCM2Participant_rakNetGuid_set(swigCPtr, this, RakNetGUID.getCPtr(value), value);
    }
  
    public RakNetGUID getRakNetGuid() {
      long cPtr = SLikeNetJNI.FullyConnectedMesh2_FCM2Participant_rakNetGuid_get(swigCPtr, this);
      return (cPtr == 0) ? null : new RakNetGUID(cPtr, false);
    }
  
  }

  static public class VerifiedJoinInProgressMember {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected VerifiedJoinInProgressMember(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(VerifiedJoinInProgressMember obj) {
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
          SLikeNetJNI.delete_FullyConnectedMesh2_VerifiedJoinInProgressMember(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setSystemAddress(SystemAddress value) {
      SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgressMember_systemAddress_set(swigCPtr, this, SystemAddress.getCPtr(value), value);
    }
  
    public SystemAddress getSystemAddress() {
      long cPtr = SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgressMember_systemAddress_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SystemAddress(cPtr, false);
    }
  
    public void setGuid(RakNetGUID value) {
      SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgressMember_guid_set(swigCPtr, this, RakNetGUID.getCPtr(value), value);
    }
  
    public RakNetGUID getGuid() {
      long cPtr = SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgressMember_guid_get(swigCPtr, this);
      return (cPtr == 0) ? null : new RakNetGUID(cPtr, false);
    }
  
    public void setJoinInProgressState(FullyConnectedMesh2.JoinInProgressState value) {
      SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgressMember_joinInProgressState_set(swigCPtr, this, value.swigValue());
    }
  
    public FullyConnectedMesh2.JoinInProgressState getJoinInProgressState() {
      return FullyConnectedMesh2.JoinInProgressState.swigToEnum(SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgressMember_joinInProgressState_get(swigCPtr, this));
    }
  
    public void setUserData(BitStream value) {
      SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgressMember_userData_set(swigCPtr, this, BitStream.getCPtr(value), value);
    }
  
    public BitStream getUserData() {
      long cPtr = SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgressMember_userData_get(swigCPtr, this);
      return (cPtr == 0) ? null : new BitStream(cPtr, false);
    }
  
    public void setWorkingFlag(boolean value) {
      SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgressMember_workingFlag_set(swigCPtr, this, value);
    }
  
    public boolean getWorkingFlag() {
      return SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgressMember_workingFlag_get(swigCPtr, this);
    }
  
    public VerifiedJoinInProgressMember() {
      this(SLikeNetJNI.new_FullyConnectedMesh2_VerifiedJoinInProgressMember(), true);
    }
  
  }

  static public class VerifiedJoinInProgress {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected VerifiedJoinInProgress(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(VerifiedJoinInProgress obj) {
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
          SLikeNetJNI.delete_FullyConnectedMesh2_VerifiedJoinInProgress(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setRequester(RakNetGUID value) {
      SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgress_requester_set(swigCPtr, this, RakNetGUID.getCPtr(value), value);
    }
  
    public RakNetGUID getRequester() {
      long cPtr = SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgress_requester_get(swigCPtr, this);
      return (cPtr == 0) ? null : new RakNetGUID(cPtr, false);
    }
  
    public void setVjipMembers(SWIGTYPE_p_DataStructures__ListT_SLNet__FullyConnectedMesh2__VerifiedJoinInProgressMember_t value) {
      SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgress_vjipMembers_set(swigCPtr, this, SWIGTYPE_p_DataStructures__ListT_SLNet__FullyConnectedMesh2__VerifiedJoinInProgressMember_t.getCPtr(value));
    }
  
    public SWIGTYPE_p_DataStructures__ListT_SLNet__FullyConnectedMesh2__VerifiedJoinInProgressMember_t getVjipMembers() {
      long cPtr = SLikeNetJNI.FullyConnectedMesh2_VerifiedJoinInProgress_vjipMembers_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_DataStructures__ListT_SLNet__FullyConnectedMesh2__VerifiedJoinInProgressMember_t(cPtr, false);
    }
  
    public VerifiedJoinInProgress() {
      this(SLikeNetJNI.new_FullyConnectedMesh2_VerifiedJoinInProgress(), true);
    }
  
  }

  public long GetTotalConnectionCount() {
    return SLikeNetJNI.FullyConnectedMesh2_GetTotalConnectionCount(swigCPtr, this);
  }

  public final static class JoinInProgressState {
    public final static FullyConnectedMesh2.JoinInProgressState JIPS_PROCESSING = new FullyConnectedMesh2.JoinInProgressState("JIPS_PROCESSING");
    public final static FullyConnectedMesh2.JoinInProgressState JIPS_FAILED = new FullyConnectedMesh2.JoinInProgressState("JIPS_FAILED");
    public final static FullyConnectedMesh2.JoinInProgressState JIPS_CONNECTED = new FullyConnectedMesh2.JoinInProgressState("JIPS_CONNECTED");
    public final static FullyConnectedMesh2.JoinInProgressState JIPS_UNNECESSARY = new FullyConnectedMesh2.JoinInProgressState("JIPS_UNNECESSARY");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static JoinInProgressState swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + JoinInProgressState.class + " with value " + swigValue);
    }

    private JoinInProgressState(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private JoinInProgressState(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private JoinInProgressState(String swigName, JoinInProgressState swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static JoinInProgressState[] swigValues = { JIPS_PROCESSING, JIPS_FAILED, JIPS_CONNECTED, JIPS_UNNECESSARY };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}