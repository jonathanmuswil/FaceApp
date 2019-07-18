package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.google.android.gms.common.util.m;

@yh
final class xq
{
  private static Boolean a;
  
  @TargetApi(19)
  static void a(WebView paramWebView, String paramString)
  {
    if ((m.f()) && (a(paramWebView)))
    {
      paramWebView.evaluateJavascript(paramString, null);
      return;
    }
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "javascript:".concat(paramString);
    } else {
      paramString = new String("javascript:");
    }
    paramWebView.loadUrl(paramString);
  }
  
  @TargetApi(19)
  private static boolean a(WebView paramWebView)
  {
    try
    {
      Boolean localBoolean = a;
      if (localBoolean == null) {
        try
        {
          paramWebView.evaluateJavascript("(function(){})()", null);
          a = Boolean.valueOf(true);
        }
        catch (IllegalStateException paramWebView)
        {
          a = Boolean.valueOf(false);
        }
      }
      boolean bool = a.booleanValue();
      return bool;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */