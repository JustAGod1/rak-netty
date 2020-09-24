/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class RakWString {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RakWString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RakWString obj) {
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
        SLikeNetJNI.delete_RakWString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RakWString() {
    this(SLikeNetJNI.new_RakWString__SWIG_0(), true);
  }

  public RakWString(RakString right) {
    this(SLikeNetJNI.new_RakWString__SWIG_1(RakString.getCPtr(right), right), true);
  }

  public RakWString(SWIGTYPE_p_wchar_t input) {
    this(SLikeNetJNI.new_RakWString__SWIG_2(SWIGTYPE_p_wchar_t.getCPtr(input)), true);
  }

  public RakWString(RakWString right) {
    this(SLikeNetJNI.new_RakWString__SWIG_3(RakWString.getCPtr(right), right), true);
  }

  public RakWString(String input) {
    this(SLikeNetJNI.new_RakWString__SWIG_4(input), true);
  }

  public SWIGTYPE_p_wchar_t C_String() {
    long cPtr = SLikeNetJNI.RakWString_C_String(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
  }

  public void Set(SWIGTYPE_p_wchar_t str) {
    SLikeNetJNI.RakWString_Set(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(str));
  }

  public boolean IsEmpty() {
    return SLikeNetJNI.RakWString_IsEmpty(swigCPtr, this);
  }

  public long GetLength() {
    return SLikeNetJNI.RakWString_GetLength(swigCPtr, this);
  }

  public static long ToInteger(RakWString rs) {
    return SLikeNetJNI.RakWString_ToInteger(RakWString.getCPtr(rs), rs);
  }

  public int StrCmp(RakWString right) {
    return SLikeNetJNI.RakWString_StrCmp(swigCPtr, this, RakWString.getCPtr(right), right);
  }

  public int StrICmp(RakWString right) {
    return SLikeNetJNI.RakWString_StrICmp(swigCPtr, this, RakWString.getCPtr(right), right);
  }

  public void Clear() {
    SLikeNetJNI.RakWString_Clear(swigCPtr, this);
  }

  public void Printf() {
    SLikeNetJNI.RakWString_Printf(swigCPtr, this);
  }

  public void FPrintf(SWIGTYPE_p_FILE fp) {
    SLikeNetJNI.RakWString_FPrintf(swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(fp));
  }

  public void Serialize(BitStream bs) {
    SLikeNetJNI.RakWString_Serialize__SWIG_0(swigCPtr, this, BitStream.getCPtr(bs), bs);
  }

  public static void Serialize(SWIGTYPE_p_wchar_t str, BitStream bs) {
    SLikeNetJNI.RakWString_Serialize__SWIG_1(SWIGTYPE_p_wchar_t.getCPtr(str), BitStream.getCPtr(bs), bs);
  }

  public boolean Deserialize(BitStream bs) {
    return SLikeNetJNI.RakWString_Deserialize__SWIG_0(swigCPtr, this, BitStream.getCPtr(bs), bs);
  }

  public static boolean Deserialize(SWIGTYPE_p_wchar_t str, BitStream bs) {
    return SLikeNetJNI.RakWString_Deserialize__SWIG_1(SWIGTYPE_p_wchar_t.getCPtr(str), BitStream.getCPtr(bs), bs);
  }

  public static boolean Deserialize(SWIGTYPE_p_wchar_t str, long strLength, BitStream bs) {
    return SLikeNetJNI.RakWString_Deserialize__SWIG_2(SWIGTYPE_p_wchar_t.getCPtr(str), strLength, BitStream.getCPtr(bs), bs);
  }

}