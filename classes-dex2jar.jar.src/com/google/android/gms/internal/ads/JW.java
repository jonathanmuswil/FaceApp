package com.google.android.gms.internal.ads;

import java.util.Set;

public final class jw
  implements RT<Set<Bw<sv>>>
{
  private final Xv a;
  
  private jw(Xv paramXv)
  {
    this.a = paramXv;
  }
  
  public static jw a(Xv paramXv)
  {
    return new jw(paramXv);
  }
  
  public static Set<Bw<sv>> b(Xv paramXv)
  {
    paramXv = paramXv.b();
    WT.a(paramXv, "Cannot return null from a non-@Nullable @Provides method");
    return (Set)paramXv;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */