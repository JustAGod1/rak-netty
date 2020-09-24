/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class RakNetListCellPointer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RakNetListCellPointer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RakNetListCellPointer obj) {
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
        SLikeNetJNI.delete_RakNetListCellPointer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

   


  public RakNetListCellPointer() {
    this(SLikeNetJNI.new_RakNetListCellPointer__SWIG_0(), true);
  }

  public RakNetListCellPointer(RakNetListCellPointer original_copy) {
    this(SLikeNetJNI.new_RakNetListCellPointer__SWIG_1(RakNetListCellPointer.getCPtr(original_copy), original_copy), true);
  }

  public void Push(SWIGTYPE_p_Cell input, String file, long line) {
    SLikeNetJNI.RakNetListCellPointer_Push(swigCPtr, this, SWIGTYPE_p_Cell.getCPtr(input), file, line);
  }

  public void Insert(SWIGTYPE_p_Cell input, long position, String file, long line) {
    SLikeNetJNI.RakNetListCellPointer_Insert__SWIG_0(swigCPtr, this, SWIGTYPE_p_Cell.getCPtr(input), position, file, line);
  }

  public void Insert(SWIGTYPE_p_Cell input, String file, long line) {
    SLikeNetJNI.RakNetListCellPointer_Insert__SWIG_1(swigCPtr, this, SWIGTYPE_p_Cell.getCPtr(input), file, line);
  }

  public void Replace(SWIGTYPE_p_Cell input, SWIGTYPE_p_Cell filler, long position, String file, long line) {
    SLikeNetJNI.RakNetListCellPointer_Replace__SWIG_0(swigCPtr, this, SWIGTYPE_p_Cell.getCPtr(input), SWIGTYPE_p_Cell.getCPtr(filler), position, file, line);
  }

  public void Replace(SWIGTYPE_p_Cell input) {
    SLikeNetJNI.RakNetListCellPointer_Replace__SWIG_1(swigCPtr, this, SWIGTYPE_p_Cell.getCPtr(input));
  }

  public void RemoveAtIndex(long position) {
    SLikeNetJNI.RakNetListCellPointer_RemoveAtIndex(swigCPtr, this, position);
  }

  public void RemoveAtIndexFast(long position) {
    SLikeNetJNI.RakNetListCellPointer_RemoveAtIndexFast(swigCPtr, this, position);
  }

  public void RemoveFromEnd(long num) {
    SLikeNetJNI.RakNetListCellPointer_RemoveFromEnd__SWIG_0(swigCPtr, this, num);
  }

  public void RemoveFromEnd() {
    SLikeNetJNI.RakNetListCellPointer_RemoveFromEnd__SWIG_1(swigCPtr, this);
  }

  public long GetIndexOf(SWIGTYPE_p_Cell input) {
    return SLikeNetJNI.RakNetListCellPointer_GetIndexOf(swigCPtr, this, SWIGTYPE_p_Cell.getCPtr(input));
  }

  public long Size() {
    return SLikeNetJNI.RakNetListCellPointer_Size(swigCPtr, this);
  }

  public void Clear(boolean doNotDeallocateSmallBlocks, String file, long line) {
    SLikeNetJNI.RakNetListCellPointer_Clear(swigCPtr, this, doNotDeallocateSmallBlocks, file, line);
  }

  public void Preallocate(long countNeeded, String file, long line) {
    SLikeNetJNI.RakNetListCellPointer_Preallocate(swigCPtr, this, countNeeded, file, line);
  }

  public void Compress(String file, long line) {
    SLikeNetJNI.RakNetListCellPointer_Compress(swigCPtr, this, file, line);
  }

  public SWIGTYPE_p_Cell GetHelper(long position) {
    long cPtr = SLikeNetJNI.RakNetListCellPointer_GetHelper(swigCPtr, this, position);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Cell(cPtr, false);
  }

  public SWIGTYPE_p_Cell PopHelper() {
    long cPtr = SLikeNetJNI.RakNetListCellPointer_PopHelper(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Cell(cPtr, false);
  }

}
