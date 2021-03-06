/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.justagod.slikenet;

public class SLikeNet implements SLikeNetConstants {
  public static int getMAX_RPC_MAP_SIZE() {
    return SLikeNetJNI.MAX_RPC_MAP_SIZE_get();
  }

  public static int getUNDEFINED_RPC_INDEX() {
    return SLikeNetJNI.UNDEFINED_RPC_INDEX_get();
  }

  public static boolean NonNumericHostString(String host) {
    return SLikeNetJNI.NonNumericHostString(host);
  }

  public static int getUNASSIGNED_PLAYER_INDEX() {
    return SLikeNetJNI.UNASSIGNED_PLAYER_INDEX_get();
  }

  public static java.math.BigInteger getUNASSIGNED_NETWORK_ID() {
    return SLikeNetJNI.UNASSIGNED_NETWORK_ID_get();
  }

  public static int getPING_TIMES_ARRAY_SIZE() {
    return SLikeNetJNI.PING_TIMES_ARRAY_SIZE_get();
  }

  public static long getMAX_UNSIGNED_LONG() {
    return SLikeNetJNI.MAX_UNSIGNED_LONG_get();
  }

  public static java.math.BigInteger GetTime() {
    return SLikeNetJNI.GetTime();
  }

  public static SWIGTYPE_p_unsigned___int32 GetTimeMS() {
    return new SWIGTYPE_p_unsigned___int32(SLikeNetJNI.GetTimeMS(), true);
  }

  public static java.math.BigInteger GetTimeUS() {
    return SLikeNetJNI.GetTimeUS();
  }

  public static boolean GreaterThan(java.math.BigInteger a, java.math.BigInteger b) {
    return SLikeNetJNI.GreaterThan(a, b);
  }

  public static boolean LessThan(java.math.BigInteger a, java.math.BigInteger b) {
    return SLikeNetJNI.LessThan(a, b);
  }

}
