package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

public final class qu
{
  public static <T> xm<T> a(lM paramlM, xm<lL> paramxm, Lr paramLr, JF<T> paramJF)
  {
    ga localga = ra.pe;
    if (((Boolean)Kea.e().a(localga)).booleanValue()) {
      return paramlM.a(kM.d, paramxm).a(paramLr).a(paramJF).a();
    }
    paramxm = paramlM.a(kM.d, paramxm).a(paramLr).a(paramJF);
    paramlM = ra.qe;
    return paramxm.a(((Integer)Kea.e().a(paramlM)).intValue(), TimeUnit.SECONDS).a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */