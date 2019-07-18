package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;

public abstract interface MediationRewardedVideoAdAdapter
  extends f
{
  public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
  
  public abstract void initialize(Context paramContext, e parame, String paramString, a parama, Bundle paramBundle1, Bundle paramBundle2);
  
  public abstract boolean isInitialized();
  
  public abstract void loadAd(e parame, Bundle paramBundle1, Bundle paramBundle2);
  
  public abstract void showVideo();
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */