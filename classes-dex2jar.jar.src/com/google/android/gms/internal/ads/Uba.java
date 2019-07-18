package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class uba
{
  private static final byte[] a = { 0, 0, 0, 1 };
  private static final int[] b = { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
  private static final int[] c = { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
  
  private static int a(Bba paramBba)
  {
    int i = paramBba.a(5);
    int j = i;
    if (i == 31) {
      j = paramBba.a(6) + 32;
    }
    return j;
  }
  
  public static Pair<Integer, Integer> a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new Bba(paramArrayOfByte);
    int i = a(paramArrayOfByte);
    int j = b(paramArrayOfByte);
    int k = paramArrayOfByte.a(4);
    if (i != 5)
    {
      m = k;
      if (i != 29) {}
    }
    else
    {
      i = b(paramArrayOfByte);
      j = i;
      m = k;
      if (a(paramArrayOfByte) == 22)
      {
        m = paramArrayOfByte.a(4);
        j = i;
      }
    }
    int m = c[m];
    boolean bool;
    if (m != -1) {
      bool = true;
    } else {
      bool = false;
    }
    tba.a(bool);
    return Pair.create(Integer.valueOf(j), Integer.valueOf(m));
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte1 = a;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramInt2];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte2, a.length, paramInt2);
    return arrayOfByte2;
  }
  
  private static int b(Bba paramBba)
  {
    int i = paramBba.a(4);
    if (i == 15)
    {
      i = paramBba.a(24);
    }
    else
    {
      boolean bool;
      if (i < 13) {
        bool = true;
      } else {
        bool = false;
      }
      tba.a(bool);
      i = b[i];
    }
    return i;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */