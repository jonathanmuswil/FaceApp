package com.google.android.gms.internal.ads;

import android.content.Context;

@yh
public final class jk
{
  public static void a(Context paramContext)
  {
    if (!Ll.a(paramContext)) {
      return;
    }
    if (!Ll.c())
    {
      paramContext = new kk(paramContext).b();
      Tl.c("Updating ad debug logging enablement.");
      dm.a(paramContext, "AdDebugLogUpdater.updateEnablement");
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */