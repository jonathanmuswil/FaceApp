package com.google.android.gms.internal.ads;

import Hq;
import Iq;
import Jq;
import Jq.a;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;

@yh
public final class pea
  extends Jq<_ea>
{
  public pea()
  {
    super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
  }
  
  public final Xea a(Context paramContext, String paramString, lf paramlf)
  {
    try
    {
      Hq localHq = Iq.a(paramContext);
      paramString = ((_ea)a(paramContext)).c(localHq, paramString, paramlf, 15000000);
      if (paramString == null) {
        return null;
      }
      paramContext = paramString.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if ((paramContext instanceof Xea)) {
        return (Xea)paramContext;
      }
      paramContext = new Zea(paramString);
      return paramContext;
    }
    catch (Jq.a paramContext) {}catch (RemoteException paramContext) {}
    Tl.c("Could not create remote builder for AdLoader.", paramContext);
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */