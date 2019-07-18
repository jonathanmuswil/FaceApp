package com.google.android.gms.internal.ads;

import Hq;
import Iq;
import Jq;
import Jq.a;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;

@yh
public final class qea
  extends Jq<efa>
{
  public qea()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  public final bfa a(Context paramContext, xea paramxea, String paramString, lf paramlf, int paramInt)
  {
    try
    {
      Hq localHq = Iq.a(paramContext);
      paramContext = ((efa)a(paramContext)).a(localHq, paramxea, paramString, paramlf, 15000000, paramInt);
      if (paramContext == null) {
        return null;
      }
      paramxea = paramContext.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((paramxea instanceof bfa)) {
        return (bfa)paramxea;
      }
      paramContext = new dfa(paramContext);
      return paramContext;
    }
    catch (Jq.a paramContext) {}catch (RemoteException paramContext) {}
    Tl.a("Could not create remote AdManager.", paramContext);
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */