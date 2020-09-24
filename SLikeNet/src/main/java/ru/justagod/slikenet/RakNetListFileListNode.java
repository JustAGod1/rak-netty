/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class RakNetListFileListNode {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RakNetListFileListNode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RakNetListFileListNode obj) {
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
        SLikeNetJNI.delete_RakNetListFileListNode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

   

  public RakNetListFileListNode() {
    this(SLikeNetJNI.new_RakNetListFileListNode__SWIG_0(), true);
  }

  public RakNetListFileListNode(RakNetListFileListNode original_copy) {
    this(SLikeNetJNI.new_RakNetListFileListNode__SWIG_1(RakNetListFileListNode.getCPtr(original_copy), original_copy), true);
  }

  public FileListNode Get(long position) {
    return new FileListNode(SLikeNetJNI.RakNetListFileListNode_Get(swigCPtr, this, position), false);
  }

  public void Push(FileListNode input, String file, long line) {
    SLikeNetJNI.RakNetListFileListNode_Push(swigCPtr, this, FileListNode.getCPtr(input), input, file, line);
  }

  public FileListNode Pop() {
    return new FileListNode(SLikeNetJNI.RakNetListFileListNode_Pop(swigCPtr, this), false);
  }

  public void Insert(FileListNode input, long position, String file, long line) {
    SLikeNetJNI.RakNetListFileListNode_Insert__SWIG_0(swigCPtr, this, FileListNode.getCPtr(input), input, position, file, line);
  }

  public void Insert(FileListNode input, String file, long line) {
    SLikeNetJNI.RakNetListFileListNode_Insert__SWIG_1(swigCPtr, this, FileListNode.getCPtr(input), input, file, line);
  }

  public void Replace(FileListNode input, FileListNode filler, long position, String file, long line) {
    SLikeNetJNI.RakNetListFileListNode_Replace__SWIG_0(swigCPtr, this, FileListNode.getCPtr(input), input, FileListNode.getCPtr(filler), filler, position, file, line);
  }

  public void Replace(FileListNode input) {
    SLikeNetJNI.RakNetListFileListNode_Replace__SWIG_1(swigCPtr, this, FileListNode.getCPtr(input), input);
  }

  public void RemoveAtIndex(long position) {
    SLikeNetJNI.RakNetListFileListNode_RemoveAtIndex(swigCPtr, this, position);
  }

  public void RemoveAtIndexFast(long position) {
    SLikeNetJNI.RakNetListFileListNode_RemoveAtIndexFast(swigCPtr, this, position);
  }

  public void RemoveFromEnd(long num) {
    SLikeNetJNI.RakNetListFileListNode_RemoveFromEnd__SWIG_0(swigCPtr, this, num);
  }

  public void RemoveFromEnd() {
    SLikeNetJNI.RakNetListFileListNode_RemoveFromEnd__SWIG_1(swigCPtr, this);
  }

  public long Size() {
    return SLikeNetJNI.RakNetListFileListNode_Size(swigCPtr, this);
  }

  public void Clear(boolean doNotDeallocateSmallBlocks, String file, long line) {
    SLikeNetJNI.RakNetListFileListNode_Clear(swigCPtr, this, doNotDeallocateSmallBlocks, file, line);
  }

  public void Preallocate(long countNeeded, String file, long line) {
    SLikeNetJNI.RakNetListFileListNode_Preallocate(swigCPtr, this, countNeeded, file, line);
  }

  public void Compress(String file, long line) {
    SLikeNetJNI.RakNetListFileListNode_Compress(swigCPtr, this, file, line);
  }

}
