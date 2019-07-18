package com.google.android.gms.internal.ads;

import android.content.Context;

public final class gx
  implements RT<Bw<sv>>
{
  private final bx a;
  private final bU<Context> b;
  private final bU<Yl> c;
  private final bU<dL> d;
  private final bU<mL> e;
  
  private gx(bx parambx, bU<Context> parambU, bU<Yl> parambU1, bU<dL> parambU2, bU<mL> parambU3)
  {
    this.a = parambx;
    this.b = parambU;
    this.c = parambU1;
    this.d = parambU2;
    this.e = parambU3;
  }
  
  public static gx a(bx parambx, bU<Context> parambU, bU<Yl> parambU1, bU<dL> parambU2, bU<mL> parambU3)
  {
    return new gx(parambx, parambU, parambU1, parambU2, parambU3);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */