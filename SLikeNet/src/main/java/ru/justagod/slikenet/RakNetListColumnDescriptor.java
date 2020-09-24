/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class RakNetListColumnDescriptor {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RakNetListColumnDescriptor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RakNetListColumnDescriptor obj) {
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
        SLikeNetJNI.delete_RakNetListColumnDescriptor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

   

  public RakNetListColumnDescriptor() {
    this(SLikeNetJNI.new_RakNetListColumnDescriptor__SWIG_0(), true);
  }

  public RakNetListColumnDescriptor(RakNetListColumnDescriptor original_copy) {
    this(SLikeNetJNI.new_RakNetListColumnDescriptor__SWIG_1(RakNetListColumnDescriptor.getCPtr(original_copy), original_copy), true);
  }

  public SWIGTYPE_p_ColumnDescriptor Get(long position) {
    return new SWIGTYPE_p_ColumnDescriptor(SLikeNetJNI.RakNetListColumnDescriptor_Get(swigCPtr, this, position), false);
  }

  public void Push(SWIGTYPE_p_ColumnDescriptor input, String file, long line) {
    SLikeNetJNI.RakNetListColumnDescriptor_Push(swigCPtr, this, SWIGTYPE_p_ColumnDescriptor.getCPtr(input), file, line);
  }

  public SWIGTYPE_p_ColumnDescriptor Pop() {
    return new SWIGTYPE_p_ColumnDescriptor(SLikeNetJNI.RakNetListColumnDescriptor_Pop(swigCPtr, this), false);
  }

  public void Insert(SWIGTYPE_p_ColumnDescriptor input, long position, String file, long line) {
    SLikeNetJNI.RakNetListColumnDescriptor_Insert__SWIG_0(swigCPtr, this, SWIGTYPE_p_ColumnDescriptor.getCPtr(input), position, file, line);
  }

  public void Insert(SWIGTYPE_p_ColumnDescriptor input, String file, long line) {
    SLikeNetJNI.RakNetListColumnDescriptor_Insert__SWIG_1(swigCPtr, this, SWIGTYPE_p_ColumnDescriptor.getCPtr(input), file, line);
  }

  public void Replace(SWIGTYPE_p_ColumnDescriptor input, SWIGTYPE_p_ColumnDescriptor filler, long position, String file, long line) {
    SLikeNetJNI.RakNetListColumnDescriptor_Replace__SWIG_0(swigCPtr, this, SWIGTYPE_p_ColumnDescriptor.getCPtr(input), SWIGTYPE_p_ColumnDescriptor.getCPtr(filler), position, file, line);
  }

  public void Replace(SWIGTYPE_p_ColumnDescriptor input) {
    SLikeNetJNI.RakNetListColumnDescriptor_Replace__SWIG_1(swigCPtr, this, SWIGTYPE_p_ColumnDescriptor.getCPtr(input));
  }

  public void RemoveAtIndex(long position) {
    SLikeNetJNI.RakNetListColumnDescriptor_RemoveAtIndex(swigCPtr, this, position);
  }

  public void RemoveAtIndexFast(long position) {
    SLikeNetJNI.RakNetListColumnDescriptor_RemoveAtIndexFast(swigCPtr, this, position);
  }

  public void RemoveFromEnd(long num) {
    SLikeNetJNI.RakNetListColumnDescriptor_RemoveFromEnd__SWIG_0(swigCPtr, this, num);
  }

  public void RemoveFromEnd() {
    SLikeNetJNI.RakNetListColumnDescriptor_RemoveFromEnd__SWIG_1(swigCPtr, this);
  }

  public long Size() {
    return SLikeNetJNI.RakNetListColumnDescriptor_Size(swigCPtr, this);
  }

  public void Clear(boolean doNotDeallocateSmallBlocks, String file, long line) {
    SLikeNetJNI.RakNetListColumnDescriptor_Clear(swigCPtr, this, doNotDeallocateSmallBlocks, file, line);
  }

  public void Preallocate(long countNeeded, String file, long line) {
    SLikeNetJNI.RakNetListColumnDescriptor_Preallocate(swigCPtr, this, countNeeded, file, line);
  }

  public void Compress(String file, long line) {
    SLikeNetJNI.RakNetListColumnDescriptor_Compress(swigCPtr, this, file, line);
  }

}
