package com.google.android.gms.ads.mediation;

import android.content.Context;
import java.util.List;

public abstract class a
  implements j
{
  public abstract z getSDKVersionInfo();
  
  public abstract z getVersionInfo();
  
  public abstract void initialize(Context paramContext, b paramb, List<i> paramList);
  
  public void loadBannerAd(g paramg, d<Object, Object> paramd)
  {
    paramd.b(String.valueOf(getClass().getSimpleName()).concat(" does not support banner ads."));
  }
  
  public void loadInterstitialAd(l paraml, d<k, Object> paramd)
  {
    paramd.b(String.valueOf(getClass().getSimpleName()).concat(" does not support interstitial ads."));
  }
  
  public void loadNativeAd(n paramn, d<y, Object> paramd)
  {
    paramd.b(String.valueOf(getClass().getSimpleName()).concat(" does not support native ads."));
  }
  
  public void loadRewardedAd(q paramq, d<p, Object> paramd)
  {
    paramd.b(String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded ads."));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */