package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.j;
import com.google.android.gms.ads.internal.k;

@yh
public final class mq
{
  public static sp a(Context paramContext, gq paramgq, String paramString, boolean paramBoolean1, boolean paramBoolean2, hP paramhP, Yl paramYl, Ga paramGa, j paramj, a parama, sda paramsda)
    throws Cp
  {
    try
    {
      paramGa = new com/google/android/gms/internal/ads/nq;
      paramGa.<init>(paramContext, paramgq, paramString, paramBoolean1, paramBoolean2, paramhP, paramYl, null, paramj, parama, paramsda);
      paramContext = (sp)zl.a(paramGa);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      k.g().a(paramContext, "AdWebViewFactory.newAdWebView2");
      throw new Cp("Webview initialization failed.", paramContext);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */