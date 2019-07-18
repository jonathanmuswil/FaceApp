package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.j;

@yh
public final class yp
{
  public static sp a(Context paramContext, gq paramgq, String paramString, boolean paramBoolean1, boolean paramBoolean2, hP paramhP, Yl paramYl, Ga paramGa, j paramj, a parama, sda paramsda)
    throws Cp
  {
    ra.a(paramContext);
    paramGa = ra.Pa;
    if (((Boolean)Kea.e().a(paramGa)).booleanValue()) {
      return mq.a(paramContext, paramgq, paramString, paramBoolean1, paramBoolean2, paramhP, paramYl, null, paramj, parama, paramsda);
    }
    try
    {
      paramGa = new com/google/android/gms/internal/ads/Ap;
      paramGa.<init>(paramContext, paramgq, paramString, paramBoolean1, paramBoolean2, paramhP, paramYl, null, paramj, parama, paramsda);
      paramContext = (sp)zl.a(paramGa);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      throw new Cp("Webview initialization failed.", paramContext);
    }
  }
  
  public static xm<sp> a(Context paramContext, Yl paramYl, String paramString, hP paramhP, a parama)
  {
    return gm.a(gm.a(null), new zp(paramContext, paramhP, paramYl, parama, paramString), Cm.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */