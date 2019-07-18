package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;

@yh
public final class za
{
  public static Ea a(Ga paramGa)
  {
    if (paramGa == null) {
      return null;
    }
    return paramGa.a(k.j().b());
  }
  
  public static boolean a(Ga paramGa, Ea paramEa, String... paramVarArgs)
  {
    if ((paramGa != null) && (paramEa != null) && (paramGa.a) && (paramEa != null)) {
      return paramGa.a(paramEa, k.j().b(), paramVarArgs);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */