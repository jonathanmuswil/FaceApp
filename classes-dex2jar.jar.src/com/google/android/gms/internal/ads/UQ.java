package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

@yh
public final class uq
{
  public final String a;
  public final Uri b;
  private final String c;
  public final Map<String, String> d;
  
  @TargetApi(21)
  public uq(WebResourceRequest paramWebResourceRequest)
  {
    this(paramWebResourceRequest.getUrl().toString(), paramWebResourceRequest.getUrl(), paramWebResourceRequest.getMethod(), paramWebResourceRequest.getRequestHeaders());
  }
  
  public uq(String paramString)
  {
    this(paramString, Uri.parse(paramString), null, null);
  }
  
  private uq(String paramString1, Uri paramUri, String paramString2, Map<String, String> paramMap)
  {
    this.a = paramString1;
    this.b = paramUri;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "GET";
    }
    this.c = paramString1;
    paramString1 = paramMap;
    if (paramMap == null) {
      paramString1 = Collections.emptyMap();
    }
    this.d = paramString1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */