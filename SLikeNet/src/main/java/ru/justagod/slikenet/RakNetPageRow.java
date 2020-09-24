/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class RakNetPageRow {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RakNetPageRow(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RakNetPageRow obj) {
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
        SLikeNetJNI.delete_RakNetPageRow(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIsLeaf(boolean value) {
    SLikeNetJNI.RakNetPageRow_isLeaf_set(swigCPtr, this, value);
  }

  public boolean getIsLeaf() {
    return SLikeNetJNI.RakNetPageRow_isLeaf_get(swigCPtr, this);
  }

  public void setSize(int value) {
    SLikeNetJNI.RakNetPageRow_size_set(swigCPtr, this, value);
  }

  public int getSize() {
    return SLikeNetJNI.RakNetPageRow_size_get(swigCPtr, this);
  }

  public void setNext(RakNetPageRow value) {
    SLikeNetJNI.RakNetPageRow_next_set(swigCPtr, this, RakNetPageRow.getCPtr(value), value);
  }

  public RakNetPageRow getNext() {
    long cPtr = SLikeNetJNI.RakNetPageRow_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RakNetPageRow(cPtr, false);
  }

  public void setPrevious(RakNetPageRow value) {
    SLikeNetJNI.RakNetPageRow_previous_set(swigCPtr, this, RakNetPageRow.getCPtr(value), value);
  }

  public RakNetPageRow getPrevious() {
    long cPtr = SLikeNetJNI.RakNetPageRow_previous_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RakNetPageRow(cPtr, false);
  }

  public RakNetPageRow() {
    this(SLikeNetJNI.new_RakNetPageRow(), true);
  }

}