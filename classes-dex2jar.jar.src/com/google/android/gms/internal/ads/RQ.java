package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.k;

@yh
class rq
  extends WebView
{
  public rq(Context paramContext)
  {
    super(paramContext);
    setBackgroundColor(0);
    paramContext = getSettings();
    paramContext.setAllowFileAccess(false);
    paramContext.setSavePassword(false);
    paramContext.setSupportMultipleWindows(true);
    paramContext.setJavaScriptCanOpenWindowsAutomatically(true);
    if (Build.VERSION.SDK_INT >= 21) {
      paramContext.setMixedContentMode(2);
    }
    k.e().a(getContext(), paramContext);
    removeJavascriptInterface("accessibility");
    removeJavascriptInterface("accessibilityTraversal");
    try
    {
      getSettings().setJavaScriptEnabled(true);
    }
    catch (NullPointerException paramContext)
    {
      Tl.b("Unable to enable Javascript.", paramContext);
    }
    setLayerType(1, null);
  }
  
  public void a(String paramString)
  {
    xq.a(this, paramString);
  }
  
  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      super.addJavascriptInterface(paramObject, paramString);
      return;
    }
    mk.f("Ignore addJavascriptInterface due to low Android version.");
  }
  
  public void loadUrl(String paramString)
  {
    try
    {
      super.loadUrl(paramString);
      return;
    }
    catch (IncompatibleClassChangeError paramString) {}catch (NoClassDefFoundError paramString) {}catch (Exception paramString) {}
    k.g().a(paramString, "CoreWebView.loadUrl");
    Tl.d("#007 Could not call remote method.", paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */