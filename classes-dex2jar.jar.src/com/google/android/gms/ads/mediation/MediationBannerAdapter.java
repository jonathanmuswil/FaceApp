package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract interface MediationBannerAdapter
  extends f
{
  public abstract View getBannerView();
  
  public abstract void requestBannerAd(Context paramContext, h paramh, Bundle paramBundle1, com.google.android.gms.ads.e parame, e parame1, Bundle paramBundle2);
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/MediationBannerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */