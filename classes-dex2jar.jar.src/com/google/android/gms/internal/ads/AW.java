package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class aw
  implements RT<Set<Bw<sv>>>
{
  private final Xv a;
  
  private aw(Xv paramXv)
  {
    this.a = paramXv;
  }
  
  public static aw a(Xv paramXv)
  {
    return new aw(paramXv);
  }
  
  public static Set<Bw<sv>> b(Xv paramXv)
  {
    paramXv = Collections.emptySet();
    WT.a(paramXv, "Cannot return null from a non-@Nullable @Provides method");
    return (Set)paramXv;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */