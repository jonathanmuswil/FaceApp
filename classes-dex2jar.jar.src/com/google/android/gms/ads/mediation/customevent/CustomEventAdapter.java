package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.u;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.Tl;

@KeepName
public final class CustomEventAdapter
  implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{
  private View a;
  private CustomEventBanner b;
  private CustomEventInterstitial c;
  private CustomEventNative d;
  
  private static <T> T a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return (T)localObject;
    }
    catch (Throwable localThrowable)
    {
      String str = localThrowable.getMessage();
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 46 + String.valueOf(str).length());
      localStringBuilder.append("Could not instantiate custom event adapter: ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(". ");
      localStringBuilder.append(str);
      Tl.d(localStringBuilder.toString());
    }
    return null;
  }
  
  public final View getBannerView()
  {
    return this.a;
  }
  
  public final void onDestroy()
  {
    Object localObject = this.b;
    if (localObject != null) {
      ((a)localObject).onDestroy();
    }
    localObject = this.c;
    if (localObject != null) {
      ((a)localObject).onDestroy();
    }
    localObject = this.d;
    if (localObject != null) {
      ((a)localObject).onDestroy();
    }
  }
  
  public final void onPause()
  {
    Object localObject = this.b;
    if (localObject != null) {
      ((a)localObject).onPause();
    }
    localObject = this.c;
    if (localObject != null) {
      ((a)localObject).onPause();
    }
    localObject = this.d;
    if (localObject != null) {
      ((a)localObject).onPause();
    }
  }
  
  public final void onResume()
  {
    Object localObject = this.b;
    if (localObject != null) {
      ((a)localObject).onResume();
    }
    localObject = this.c;
    if (localObject != null) {
      ((a)localObject).onResume();
    }
    localObject = this.d;
    if (localObject != null) {
      ((a)localObject).onResume();
    }
  }
  
  public final void requestBannerAd(Context paramContext, h paramh, Bundle paramBundle1, com.google.android.gms.ads.e parame, com.google.android.gms.ads.mediation.e parame1, Bundle paramBundle2)
  {
    this.b = ((CustomEventBanner)a(paramBundle1.getString("class_name")));
    if (this.b == null)
    {
      paramh.a(this, 0);
      return;
    }
    if (paramBundle2 == null) {
      paramBundle2 = null;
    } else {
      paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name"));
    }
    this.b.requestBannerAd(paramContext, new a(this, paramh), paramBundle1.getString("parameter"), parame, parame1, paramBundle2);
  }
  
  public final void requestInterstitialAd(Context paramContext, m paramm, Bundle paramBundle1, com.google.android.gms.ads.mediation.e parame, Bundle paramBundle2)
  {
    this.c = ((CustomEventInterstitial)a(paramBundle1.getString("class_name")));
    if (this.c == null)
    {
      paramm.a(this, 0);
      return;
    }
    if (paramBundle2 == null) {
      paramBundle2 = null;
    } else {
      paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name"));
    }
    this.c.requestInterstitialAd(paramContext, new b(this, paramm), paramBundle1.getString("parameter"), parame, paramBundle2);
  }
  
  public final void requestNativeAd(Context paramContext, o paramo, Bundle paramBundle1, u paramu, Bundle paramBundle2)
  {
    this.d = ((CustomEventNative)a(paramBundle1.getString("class_name")));
    if (this.d == null)
    {
      paramo.a(this, 0);
      return;
    }
    if (paramBundle2 == null) {
      paramBundle2 = null;
    } else {
      paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name"));
    }
    this.d.requestNativeAd(paramContext, new c(this, paramo), paramBundle1.getString("parameter"), paramu, paramBundle2);
  }
  
  public final void showInterstitial()
  {
    this.c.showInterstitial();
  }
  
  static final class a
    implements b
  {
    private final CustomEventAdapter a;
    private final h b;
    
    public a(CustomEventAdapter paramCustomEventAdapter, h paramh)
    {
      this.a = paramCustomEventAdapter;
      this.b = paramh;
    }
  }
  
  final class b
    implements d
  {
    private final CustomEventAdapter a;
    private final m b;
    
    public b(CustomEventAdapter paramCustomEventAdapter, m paramm)
    {
      this.a = paramCustomEventAdapter;
      this.b = paramm;
    }
  }
  
  static final class c
    implements f
  {
    private final CustomEventAdapter a;
    private final o b;
    
    public c(CustomEventAdapter paramCustomEventAdapter, o paramo)
    {
      this.a = paramCustomEventAdapter;
      this.b = paramo;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/customevent/CustomEventAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */