package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.A;

public final class f
  extends g
{
  public f(Context paramContext)
  {
    super(paramContext, 0);
    t.a(paramContext, "Context cannot be null");
  }
  
  public final m getVideoController()
  {
    A localA = this.a;
    if (localA != null) {
      return localA.i();
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */