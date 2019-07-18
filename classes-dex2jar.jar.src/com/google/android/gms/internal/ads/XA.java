package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@yh
public final class xa
{
  public static void a(va paramva, ua paramua)
  {
    if (paramua.a() != null)
    {
      if (!TextUtils.isEmpty(paramua.b()))
      {
        paramva.a(paramua.a(), paramua.b(), paramua.c(), paramua.d());
        return;
      }
      throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
    }
    throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */