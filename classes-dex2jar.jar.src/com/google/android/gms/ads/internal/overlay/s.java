package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.yh;

@yh
public final class s
  extends d
{
  public s(Activity paramActivity)
  {
    super(paramActivity);
  }
  
  public final void k(Bundle paramBundle)
  {
    mk.f("AdOverlayParcel is null or does not contain valid overlay type.");
    this.n = 3;
    this.b.finish();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */