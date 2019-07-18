package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@yh
public class tq
  extends WebViewClient
{
  private static final String[] a = { "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS" };
  private static final String[] b = { "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID" };
  private yq c;
  
  public void a(uq paramuq)
  {
    throw null;
  }
  
  final void a(yq paramyq)
  {
    this.c = paramyq;
  }
  
  public void b(uq paramuq)
  {
    throw null;
  }
  
  public boolean c(uq paramuq)
  {
    throw null;
  }
  
  public WebResourceResponse d(uq paramuq)
  {
    return null;
  }
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    if (paramString == null) {
      return;
    }
    paramWebView = String.valueOf(paramString);
    if (paramWebView.length() != 0) {
      paramWebView = "Loading resource: ".concat(paramWebView);
    } else {
      paramWebView = new String("Loading resource: ");
    }
    mk.f(paramWebView);
    b(new uq(paramString));
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (paramString == null) {
      return;
    }
    paramString = new uq(paramString);
    paramWebView = this.c;
    if (paramWebView != null)
    {
      paramWebView.a(paramString);
      return;
    }
    a(paramString);
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    if ((paramInt < 0) && (-paramInt - 1 >= a.length)) {}
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    if (paramSslError == null) {
      return;
    }
    int i = paramSslError.getPrimaryError();
    if ((i >= 0) && (i >= b.length)) {}
    paramSslError.getUrl();
  }
  
  @TargetApi(24)
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    if ((paramWebResourceRequest != null) && (paramWebResourceRequest.getUrl() != null)) {
      return d(new uq(paramWebResourceRequest));
    }
    return null;
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return d(new uq(paramString));
  }
  
  public final boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    if ((i != 79) && (i != 222)) {
      switch (i)
      {
      default: 
        switch (i)
        {
        default: 
          return false;
        }
        break;
      }
    }
    return true;
  }
  
  @TargetApi(24)
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    if ((paramWebResourceRequest != null) && (paramWebResourceRequest.getUrl() != null)) {
      return c(new uq(paramWebResourceRequest));
    }
    return false;
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return c(new uq(paramString));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */