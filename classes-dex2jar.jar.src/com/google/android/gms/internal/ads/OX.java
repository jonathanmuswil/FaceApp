package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class ox
  implements RT<Bw<Mu>>
{
  private final bx a;
  private final bU<Kx> b;
  private final bU<Executor> c;
  
  private ox(bx parambx, bU<Kx> parambU, bU<Executor> parambU1)
  {
    this.a = parambx;
    this.b = parambU;
    this.c = parambU1;
  }
  
  public static ox a(bx parambx, bU<Kx> parambU, bU<Executor> parambU1)
  {
    return new ox(parambx, parambU, parambU1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */