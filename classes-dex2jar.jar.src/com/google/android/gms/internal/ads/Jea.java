package com.google.android.gms.internal.ads;

public final class jea
  extends eT<jea>
{
  private static volatile jea[] c;
  
  public static jea[] d()
  {
    if (c == null) {
      synchronized (iT.c)
      {
        if (c == null) {
          c = new jea[0];
        }
      }
    }
    return c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */