package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.Tl;

@KeepName
public final class CustomEventAdapter
  implements MediationBannerAdapter<c, CustomEventServerParameters>, MediationInterstitialAdapter<c, CustomEventServerParameters>
{
  private View a;
  private CustomEventBanner b;
  private CustomEventInterstitial c;
  
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
  
  private final void a(View paramView)
  {
    this.a = paramView;
  }
  
  public final void destroy()
  {
    Object localObject = this.b;
    if (localObject != null) {
      ((CustomEvent)localObject).destroy();
    }
    localObject = this.c;
    if (localObject != null) {
      ((CustomEvent)localObject).destroy();
    }
  }
  
  public final Class<c> getAdditionalParametersType()
  {
    return c.class;
  }
  
  public final View getBannerView()
  {
    return this.a;
  }
  
  public final Class<CustomEventServerParameters> getServerParametersType()
  {
    return CustomEventServerParameters.class;
  }
  
  public final void requestBannerAd(MediationBannerListener paramMediationBannerListener, Activity paramActivity, CustomEventServerParameters paramCustomEventServerParameters, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, c paramc)
  {
    this.b = ((CustomEventBanner)a(paramCustomEventServerParameters.className));
    if (this.b == null)
    {
      paramMediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    if (paramc == null) {
      paramc = null;
    } else {
      paramc = paramc.a(paramCustomEventServerParameters.label);
    }
    this.b.requestBannerAd(new a(this, paramMediationBannerListener), paramActivity, paramCustomEventServerParameters.label, paramCustomEventServerParameters.parameter, paramAdSize, paramMediationAdRequest, paramc);
  }
  
  public final void requestInterstitialAd(MediationInterstitialListener paramMediationInterstitialListener, Activity paramActivity, CustomEventServerParameters paramCustomEventServerParameters, MediationAdRequest paramMediationAdRequest, c paramc)
  {
    this.c = ((CustomEventInterstitial)a(paramCustomEventServerParameters.className));
    if (this.c == null)
    {
      paramMediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    if (paramc == null) {
      paramc = null;
    } else {
      paramc = paramc.a(paramCustomEventServerParameters.label);
    }
    this.c.requestInterstitialAd(new b(this, paramMediationInterstitialListener), paramActivity, paramCustomEventServerParameters.label, paramCustomEventServerParameters.parameter, paramMediationAdRequest, paramc);
  }
  
  public final void showInterstitial()
  {
    this.c.showInterstitial();
  }
  
  static final class a
    implements CustomEventBannerListener
  {
    private final CustomEventAdapter a;
    private final MediationBannerListener b;
    
    public a(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
    {
      this.a = paramCustomEventAdapter;
      this.b = paramMediationBannerListener;
    }
    
    public final void onClick()
    {
      Tl.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.onClick(this.a);
    }
    
    public final void onDismissScreen()
    {
      Tl.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.onDismissScreen(this.a);
    }
    
    public final void onFailedToReceiveAd()
    {
      Tl.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.onFailedToReceiveAd(this.a, AdRequest.ErrorCode.NO_FILL);
    }
    
    public final void onLeaveApplication()
    {
      Tl.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.onLeaveApplication(this.a);
    }
    
    public final void onPresentScreen()
    {
      Tl.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.onPresentScreen(this.a);
    }
    
    public final void onReceivedAd(View paramView)
    {
      Tl.a("Custom event adapter called onReceivedAd.");
      CustomEventAdapter.a(this.a, paramView);
      this.b.onReceivedAd(this.a);
    }
  }
  
  final class b
    implements CustomEventInterstitialListener
  {
    private final CustomEventAdapter a;
    private final MediationInterstitialListener b;
    
    public b(CustomEventAdapter paramCustomEventAdapter, MediationInterstitialListener paramMediationInterstitialListener)
    {
      this.a = paramCustomEventAdapter;
      this.b = paramMediationInterstitialListener;
    }
    
    public final void onDismissScreen()
    {
      Tl.a("Custom event adapter called onDismissScreen.");
      this.b.onDismissScreen(this.a);
    }
    
    public final void onFailedToReceiveAd()
    {
      Tl.a("Custom event adapter called onFailedToReceiveAd.");
      this.b.onFailedToReceiveAd(this.a, AdRequest.ErrorCode.NO_FILL);
    }
    
    public final void onLeaveApplication()
    {
      Tl.a("Custom event adapter called onLeaveApplication.");
      this.b.onLeaveApplication(this.a);
    }
    
    public final void onPresentScreen()
    {
      Tl.a("Custom event adapter called onPresentScreen.");
      this.b.onPresentScreen(this.a);
    }
    
    public final void onReceivedAd()
    {
      Tl.a("Custom event adapter called onReceivedAd.");
      this.b.onReceivedAd(CustomEventAdapter.this);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/ads/mediation/customevent/CustomEventAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */