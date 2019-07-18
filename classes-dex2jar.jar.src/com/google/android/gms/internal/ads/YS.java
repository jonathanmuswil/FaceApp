package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.concurrent.ScheduledExecutorService;

public final class ys
  implements RT<Dv>
{
  private final bU<ScheduledExecutorService> a;
  private final bU<e> b;
  
  public ys(bU<ScheduledExecutorService> parambU, bU<e> parambU1)
  {
    this.a = parambU;
    this.b = parambU1;
  }
  
  public static Dv a(ScheduledExecutorService paramScheduledExecutorService, e parame)
  {
    paramScheduledExecutorService = new Dv(paramScheduledExecutorService, parame);
    WT.a(paramScheduledExecutorService, "Cannot return null from a non-@Nullable @Provides method");
    return (Dv)paramScheduledExecutorService;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */