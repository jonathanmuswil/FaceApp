package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class qx
  implements RT<Bw<Qv>>
{
  private final bx a;
  private final bU<Executor> b;
  
  private qx(bx parambx, bU<Executor> parambU)
  {
    this.a = parambx;
    this.b = parambU;
  }
  
  public static qx a(bx parambx, bU<Executor> parambU)
  {
    return new qx(parambx, parambU);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */