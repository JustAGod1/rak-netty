/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class FileListNodeContext {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FileListNodeContext(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FileListNodeContext obj) {
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
        SLikeNetJNI.delete_FileListNodeContext(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FileListNodeContext() {
    this(SLikeNetJNI.new_FileListNodeContext__SWIG_0(), true);
  }

  public FileListNodeContext(short o, SWIGTYPE_p_unsigned___int32 f1, SWIGTYPE_p_unsigned___int32 f2, SWIGTYPE_p_unsigned___int32 f3) {
    this(SLikeNetJNI.new_FileListNodeContext__SWIG_1(o, SWIGTYPE_p_unsigned___int32.getCPtr(f1), SWIGTYPE_p_unsigned___int32.getCPtr(f2), SWIGTYPE_p_unsigned___int32.getCPtr(f3)), true);
  }

  public void setOp(short value) {
    SLikeNetJNI.FileListNodeContext_op_set(swigCPtr, this, value);
  }

  public short getOp() {
    return SLikeNetJNI.FileListNodeContext_op_get(swigCPtr, this);
  }

  public void setFlnc_extraData1(SWIGTYPE_p_unsigned___int32 value) {
    SLikeNetJNI.FileListNodeContext_flnc_extraData1_set(swigCPtr, this, SWIGTYPE_p_unsigned___int32.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned___int32 getFlnc_extraData1() {
    return new SWIGTYPE_p_unsigned___int32(SLikeNetJNI.FileListNodeContext_flnc_extraData1_get(swigCPtr, this), true);
  }

  public void setFlnc_extraData2(SWIGTYPE_p_unsigned___int32 value) {
    SLikeNetJNI.FileListNodeContext_flnc_extraData2_set(swigCPtr, this, SWIGTYPE_p_unsigned___int32.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned___int32 getFlnc_extraData2() {
    return new SWIGTYPE_p_unsigned___int32(SLikeNetJNI.FileListNodeContext_flnc_extraData2_get(swigCPtr, this), true);
  }

  public void setFlnc_extraData3(SWIGTYPE_p_unsigned___int32 value) {
    SLikeNetJNI.FileListNodeContext_flnc_extraData3_set(swigCPtr, this, SWIGTYPE_p_unsigned___int32.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned___int32 getFlnc_extraData3() {
    return new SWIGTYPE_p_unsigned___int32(SLikeNetJNI.FileListNodeContext_flnc_extraData3_get(swigCPtr, this), true);
  }

  public void setDataPtr(SWIGTYPE_p_void value) {
    SLikeNetJNI.FileListNodeContext_dataPtr_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getDataPtr() {
    long cPtr = SLikeNetJNI.FileListNodeContext_dataPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setDataLength(long value) {
    SLikeNetJNI.FileListNodeContext_dataLength_set(swigCPtr, this, value);
  }

  public long getDataLength() {
    return SLikeNetJNI.FileListNodeContext_dataLength_get(swigCPtr, this);
  }

}