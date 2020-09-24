/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class DirectoryDeltaTransfer extends PluginInterface2 {
  private transient long swigCPtr;

  protected DirectoryDeltaTransfer(long cPtr, boolean cMemoryOwn) {
    super(SLikeNetJNI.DirectoryDeltaTransfer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DirectoryDeltaTransfer obj) {
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
        SLikeNetJNI.delete_DirectoryDeltaTransfer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static DirectoryDeltaTransfer GetInstance() {
    long cPtr = SLikeNetJNI.DirectoryDeltaTransfer_GetInstance();
    return (cPtr == 0) ? null : new DirectoryDeltaTransfer(cPtr, false);
  }

  public static void DestroyInstance(DirectoryDeltaTransfer i) {
    SLikeNetJNI.DirectoryDeltaTransfer_DestroyInstance(DirectoryDeltaTransfer.getCPtr(i), i);
  }

  public DirectoryDeltaTransfer() {
    this(SLikeNetJNI.new_DirectoryDeltaTransfer(), true);
  }

  public void SetFileListTransferPlugin(FileListTransfer flt) {
    SLikeNetJNI.DirectoryDeltaTransfer_SetFileListTransferPlugin(swigCPtr, this, FileListTransfer.getCPtr(flt), flt);
  }

  public void SetApplicationDirectory(String pathToApplication) {
    SLikeNetJNI.DirectoryDeltaTransfer_SetApplicationDirectory(swigCPtr, this, pathToApplication);
  }

  public void SetUploadSendParameters(PacketPriority _priority, char _orderingChannel) {
    SLikeNetJNI.DirectoryDeltaTransfer_SetUploadSendParameters(swigCPtr, this, _priority.swigValue(), _orderingChannel);
  }

  public void AddUploadsFromSubdirectory(String subdir) {
    SLikeNetJNI.DirectoryDeltaTransfer_AddUploadsFromSubdirectory(swigCPtr, this, subdir);
  }

  public int DownloadFromSubdirectory(String subdir, String outputSubdir, boolean prependAppDirToOutputSubdir, SystemAddress host, FileListTransferCBInterface onFileCallback, PacketPriority _priority, char _orderingChannel, FileListProgress cb) {
    return SLikeNetJNI.DirectoryDeltaTransfer_DownloadFromSubdirectory__SWIG_0(swigCPtr, this, subdir, outputSubdir, prependAppDirToOutputSubdir, SystemAddress.getCPtr(host), host, FileListTransferCBInterface.getCPtr(onFileCallback), onFileCallback, _priority.swigValue(), _orderingChannel, FileListProgress.getCPtr(cb), cb);
  }

  public int DownloadFromSubdirectory(FileList localFiles, String subdir, String outputSubdir, boolean prependAppDirToOutputSubdir, SystemAddress host, FileListTransferCBInterface onFileCallback, PacketPriority _priority, char _orderingChannel, FileListProgress cb) {
    return SLikeNetJNI.DirectoryDeltaTransfer_DownloadFromSubdirectory__SWIG_1(swigCPtr, this, FileList.getCPtr(localFiles), localFiles, subdir, outputSubdir, prependAppDirToOutputSubdir, SystemAddress.getCPtr(host), host, FileListTransferCBInterface.getCPtr(onFileCallback), onFileCallback, _priority.swigValue(), _orderingChannel, FileListProgress.getCPtr(cb), cb);
  }

  public void GenerateHashes(FileList localFiles, String outputSubdir, boolean prependAppDirToOutputSubdir) {
    SLikeNetJNI.DirectoryDeltaTransfer_GenerateHashes(swigCPtr, this, FileList.getCPtr(localFiles), localFiles, outputSubdir, prependAppDirToOutputSubdir);
  }

  public void ClearUploads() {
    SLikeNetJNI.DirectoryDeltaTransfer_ClearUploads(swigCPtr, this);
  }

  public long GetNumberOfFilesForUpload() {
    return SLikeNetJNI.DirectoryDeltaTransfer_GetNumberOfFilesForUpload(swigCPtr, this);
  }

  public void SetDownloadRequestIncrementalReadInterface(IncrementalReadInterface _incrementalReadInterface, long _chunkSize) {
    SLikeNetJNI.DirectoryDeltaTransfer_SetDownloadRequestIncrementalReadInterface(swigCPtr, this, IncrementalReadInterface.getCPtr(_incrementalReadInterface), _incrementalReadInterface, _chunkSize);
  }

}
