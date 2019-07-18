package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.e;

public abstract interface CustomEventInterstitial
  extends a
{
  public abstract void requestInterstitialAd(Context paramContext, d paramd, String paramString, e parame, Bundle paramBundle);
  
  public abstract void showInterstitial();
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/customevent/CustomEventInterstitial.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */