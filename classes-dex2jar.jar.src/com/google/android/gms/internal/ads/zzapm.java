package com.google.android.gms.internal.ads;

import S;
import S.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.e;

@yh
public final class zzapm
  implements MediationInterstitialAdapter
{
  private Activity a;
  private com.google.android.gms.ads.mediation.m b;
  private Uri c;
  
  public final void onDestroy()
  {
    Tl.a("Destroying AdMobCustomTabsAdapter adapter.");
  }
  
  public final void onPause()
  {
    Tl.a("Pausing AdMobCustomTabsAdapter adapter.");
  }
  
  public final void onResume()
  {
    Tl.a("Resuming AdMobCustomTabsAdapter adapter.");
  }
  
  public final void requestInterstitialAd(Context paramContext, com.google.android.gms.ads.mediation.m paramm, Bundle paramBundle1, e parame, Bundle paramBundle2)
  {
    this.b = paramm;
    if (this.b == null)
    {
      Tl.d("Listener not set for mediation. Returning.");
      return;
    }
    if (!(paramContext instanceof Activity))
    {
      Tl.d("AdMobCustomTabs can only work with Activity context. Bailing out.");
      this.b.a(this, 0);
      return;
    }
    int i;
    if ((com.google.android.gms.common.util.m.b()) && (Qa.a(paramContext))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      Tl.d("Default browser does not support custom tabs. Bailing out.");
      this.b.a(this, 0);
      return;
    }
    paramm = paramBundle1.getString("tab_url");
    if (TextUtils.isEmpty(paramm))
    {
      Tl.d("The tab_url retrieved from mediation metadata is empty. Bailing out.");
      this.b.a(this, 0);
      return;
    }
    this.a = ((Activity)paramContext);
    this.c = Uri.parse(paramm);
    this.b.c(this);
  }
  
  public final void showInterstitial()
  {
    Object localObject = new S.a().a();
    ((S)localObject).a.setData(this.c);
    localObject = new AdOverlayInfoParcel(new c(((S)localObject).a), null, new Ig(this), null, new Yl(0, 0, false));
    vk.a.post(new Jg(this, (AdOverlayInfoParcel)localObject));
    k.g().e();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzapm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */