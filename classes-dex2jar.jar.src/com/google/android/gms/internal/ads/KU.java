package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class ku
  implements RT<Bw<sv>>
{
  private final bU<_r> a;
  private final bU<Executor> b;
  
  private ku(bU<_r> parambU, bU<Executor> parambU1)
  {
    this.a = parambU;
    this.b = parambU1;
  }
  
  public static Bw<sv> a(_r param_r, Executor paramExecutor)
  {
    param_r = new Bw(param_r, paramExecutor);
    WT.a(param_r, "Cannot return null from a non-@Nullable @Provides method");
    return (Bw)param_r;
  }
  
  public static ku a(bU<_r> parambU, bU<Executor> parambU1)
  {
    return new ku(parambU, parambU1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */