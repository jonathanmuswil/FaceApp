package com.google.android.gms.common.util;

import android.util.Base64;

public final class c
{
  public static String a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return Base64.encodeToString(paramArrayOfByte, 0);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */