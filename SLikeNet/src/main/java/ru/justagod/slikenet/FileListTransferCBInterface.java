/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class FileListTransferCBInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FileListTransferCBInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FileListTransferCBInterface obj) {
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
        SLikeNetJNI.delete_FileListTransferCBInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class OnFileStruct {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected OnFileStruct(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(OnFileStruct obj) {
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
          SLikeNetJNI.delete_FileListTransferCBInterface_OnFileStruct(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setFileIndex(long value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_fileIndex_set(swigCPtr, this, value);
    }
  
    public long getFileIndex() {
      return SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_fileIndex_get(swigCPtr, this);
    }
  
    public void setFileName(String value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_fileName_set(swigCPtr, this, value);
    }
  
    public String getFileName() {
      return SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_fileName_get(swigCPtr, this);
    }
  
    public void setFileData(String value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_fileData_set(swigCPtr, this, value);
    }
  
    public String getFileData() {
      return SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_fileData_get(swigCPtr, this);
    }
  
    public void setByteLengthOfThisFile(SWIGTYPE_p_unsigned___int32 value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_byteLengthOfThisFile_set(swigCPtr, this, SWIGTYPE_p_unsigned___int32.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned___int32 getByteLengthOfThisFile() {
      return new SWIGTYPE_p_unsigned___int32(SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_byteLengthOfThisFile_get(swigCPtr, this), true);
    }
  
    public void setBytesDownloadedForThisFile(SWIGTYPE_p_unsigned___int32 value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_bytesDownloadedForThisFile_set(swigCPtr, this, SWIGTYPE_p_unsigned___int32.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned___int32 getBytesDownloadedForThisFile() {
      return new SWIGTYPE_p_unsigned___int32(SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_bytesDownloadedForThisFile_get(swigCPtr, this), true);
    }
  
    public void setSetID(int value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_setID_set(swigCPtr, this, value);
    }
  
    public int getSetID() {
      return SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_setID_get(swigCPtr, this);
    }
  
    public void setNumberOfFilesInThisSet(long value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_numberOfFilesInThisSet_set(swigCPtr, this, value);
    }
  
    public long getNumberOfFilesInThisSet() {
      return SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_numberOfFilesInThisSet_get(swigCPtr, this);
    }
  
    public void setByteLengthOfThisSet(long value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_byteLengthOfThisSet_set(swigCPtr, this, value);
    }
  
    public long getByteLengthOfThisSet() {
      return SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_byteLengthOfThisSet_get(swigCPtr, this);
    }
  
    public void setBytesDownloadedForThisSet(long value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_bytesDownloadedForThisSet_set(swigCPtr, this, value);
    }
  
    public long getBytesDownloadedForThisSet() {
      return SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_bytesDownloadedForThisSet_get(swigCPtr, this);
    }
  
    public void setContext(FileListNodeContext value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_context_set(swigCPtr, this, FileListNodeContext.getCPtr(value), value);
    }
  
    public FileListNodeContext getContext() {
      long cPtr = SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_context_get(swigCPtr, this);
      return (cPtr == 0) ? null : new FileListNodeContext(cPtr, false);
    }
  
    public void setSenderSystemAddress(SystemAddress value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_senderSystemAddress_set(swigCPtr, this, SystemAddress.getCPtr(value), value);
    }
  
    public SystemAddress getSenderSystemAddress() {
      long cPtr = SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_senderSystemAddress_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SystemAddress(cPtr, false);
    }
  
    public void setSenderGuid(RakNetGUID value) {
      SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_senderGuid_set(swigCPtr, this, RakNetGUID.getCPtr(value), value);
    }
  
    public RakNetGUID getSenderGuid() {
      long cPtr = SLikeNetJNI.FileListTransferCBInterface_OnFileStruct_senderGuid_get(swigCPtr, this);
      return (cPtr == 0) ? null : new RakNetGUID(cPtr, false);
    }
  
    public OnFileStruct() {
      this(SLikeNetJNI.new_FileListTransferCBInterface_OnFileStruct(), true);
    }
  
  }

  static public class FileProgressStruct {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected FileProgressStruct(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(FileProgressStruct obj) {
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
          SLikeNetJNI.delete_FileListTransferCBInterface_FileProgressStruct(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setOnFileStruct(FileListTransferCBInterface.OnFileStruct value) {
      SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_onFileStruct_set(swigCPtr, this, FileListTransferCBInterface.OnFileStruct.getCPtr(value), value);
    }
  
    public FileListTransferCBInterface.OnFileStruct getOnFileStruct() {
      long cPtr = SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_onFileStruct_get(swigCPtr, this);
      return (cPtr == 0) ? null : new FileListTransferCBInterface.OnFileStruct(cPtr, false);
    }
  
    public void setPartCount(long value) {
      SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_partCount_set(swigCPtr, this, value);
    }
  
    public long getPartCount() {
      return SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_partCount_get(swigCPtr, this);
    }
  
    public void setPartTotal(long value) {
      SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_partTotal_set(swigCPtr, this, value);
    }
  
    public long getPartTotal() {
      return SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_partTotal_get(swigCPtr, this);
    }
  
    public void setDataChunkLength(long value) {
      SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_dataChunkLength_set(swigCPtr, this, value);
    }
  
    public long getDataChunkLength() {
      return SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_dataChunkLength_get(swigCPtr, this);
    }
  
    public void setFirstDataChunk(String value) {
      SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_firstDataChunk_set(swigCPtr, this, value);
    }
  
    public String getFirstDataChunk() {
      return SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_firstDataChunk_get(swigCPtr, this);
    }
  
    public void setIriDataChunk(String value) {
      SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_iriDataChunk_set(swigCPtr, this, value);
    }
  
    public String getIriDataChunk() {
      return SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_iriDataChunk_get(swigCPtr, this);
    }
  
    public void setIriWriteOffset(long value) {
      SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_iriWriteOffset_set(swigCPtr, this, value);
    }
  
    public long getIriWriteOffset() {
      return SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_iriWriteOffset_get(swigCPtr, this);
    }
  
    public void setSenderSystemAddress(SystemAddress value) {
      SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_senderSystemAddress_set(swigCPtr, this, SystemAddress.getCPtr(value), value);
    }
  
    public SystemAddress getSenderSystemAddress() {
      long cPtr = SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_senderSystemAddress_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SystemAddress(cPtr, false);
    }
  
    public void setSenderGuid(RakNetGUID value) {
      SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_senderGuid_set(swigCPtr, this, RakNetGUID.getCPtr(value), value);
    }
  
    public RakNetGUID getSenderGuid() {
      long cPtr = SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_senderGuid_get(swigCPtr, this);
      return (cPtr == 0) ? null : new RakNetGUID(cPtr, false);
    }
  
    public void setAllocateIrIDataChunkAutomatically(boolean value) {
      SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_allocateIrIDataChunkAutomatically_set(swigCPtr, this, value);
    }
  
    public boolean getAllocateIrIDataChunkAutomatically() {
      return SLikeNetJNI.FileListTransferCBInterface_FileProgressStruct_allocateIrIDataChunkAutomatically_get(swigCPtr, this);
    }
  
    public FileProgressStruct() {
      this(SLikeNetJNI.new_FileListTransferCBInterface_FileProgressStruct(), true);
    }
  
  }

  static public class DownloadCompleteStruct {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected DownloadCompleteStruct(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(DownloadCompleteStruct obj) {
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
          SLikeNetJNI.delete_FileListTransferCBInterface_DownloadCompleteStruct(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setSetID(int value) {
      SLikeNetJNI.FileListTransferCBInterface_DownloadCompleteStruct_setID_set(swigCPtr, this, value);
    }
  
    public int getSetID() {
      return SLikeNetJNI.FileListTransferCBInterface_DownloadCompleteStruct_setID_get(swigCPtr, this);
    }
  
    public void setNumberOfFilesInThisSet(long value) {
      SLikeNetJNI.FileListTransferCBInterface_DownloadCompleteStruct_numberOfFilesInThisSet_set(swigCPtr, this, value);
    }
  
    public long getNumberOfFilesInThisSet() {
      return SLikeNetJNI.FileListTransferCBInterface_DownloadCompleteStruct_numberOfFilesInThisSet_get(swigCPtr, this);
    }
  
    public void setByteLengthOfThisSet(long value) {
      SLikeNetJNI.FileListTransferCBInterface_DownloadCompleteStruct_byteLengthOfThisSet_set(swigCPtr, this, value);
    }
  
    public long getByteLengthOfThisSet() {
      return SLikeNetJNI.FileListTransferCBInterface_DownloadCompleteStruct_byteLengthOfThisSet_get(swigCPtr, this);
    }
  
    public void setSenderSystemAddress(SystemAddress value) {
      SLikeNetJNI.FileListTransferCBInterface_DownloadCompleteStruct_senderSystemAddress_set(swigCPtr, this, SystemAddress.getCPtr(value), value);
    }
  
    public SystemAddress getSenderSystemAddress() {
      long cPtr = SLikeNetJNI.FileListTransferCBInterface_DownloadCompleteStruct_senderSystemAddress_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SystemAddress(cPtr, false);
    }
  
    public void setSenderGuid(RakNetGUID value) {
      SLikeNetJNI.FileListTransferCBInterface_DownloadCompleteStruct_senderGuid_set(swigCPtr, this, RakNetGUID.getCPtr(value), value);
    }
  
    public RakNetGUID getSenderGuid() {
      long cPtr = SLikeNetJNI.FileListTransferCBInterface_DownloadCompleteStruct_senderGuid_get(swigCPtr, this);
      return (cPtr == 0) ? null : new RakNetGUID(cPtr, false);
    }
  
    public DownloadCompleteStruct() {
      this(SLikeNetJNI.new_FileListTransferCBInterface_DownloadCompleteStruct(), true);
    }
  
  }

  public boolean OnFile(FileListTransferCBInterface.OnFileStruct onFileStruct) {
    return SLikeNetJNI.FileListTransferCBInterface_OnFile(swigCPtr, this, FileListTransferCBInterface.OnFileStruct.getCPtr(onFileStruct), onFileStruct);
  }

  public void OnFileProgress(FileListTransferCBInterface.FileProgressStruct fps) {
    SLikeNetJNI.FileListTransferCBInterface_OnFileProgress(swigCPtr, this, FileListTransferCBInterface.FileProgressStruct.getCPtr(fps), fps);
  }

  public boolean Update() {
    return SLikeNetJNI.FileListTransferCBInterface_Update(swigCPtr, this);
  }

  public boolean OnDownloadComplete(FileListTransferCBInterface.DownloadCompleteStruct dcs) {
    return SLikeNetJNI.FileListTransferCBInterface_OnDownloadComplete(swigCPtr, this, FileListTransferCBInterface.DownloadCompleteStruct.getCPtr(dcs), dcs);
  }

  public void OnDereference() {
    SLikeNetJNI.FileListTransferCBInterface_OnDereference(swigCPtr, this);
  }

}