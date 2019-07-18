package com.google.android.gms.internal.ads;

import Iq;
import android.content.Context;
import android.os.RemoteException;

@yh
public final class wda
{
  _U a;
  boolean b;
  
  public wda() {}
  
  public wda(Context paramContext)
  {
    ra.a(paramContext);
    ga localga = ra.Pd;
    if (((Boolean)Kea.e().a(localga)).booleanValue()) {
      try
      {
        this.a = ((_U)Ul.a(paramContext, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", yda.a));
        Iq.a(paramContext);
        this.a.a(Iq.a(paramContext), "GMA_SDK");
        this.b = true;
        return;
      }
      catch (Wl|RemoteException|NullPointerException paramContext)
      {
        Tl.a("Cannot dynamite load clearcut");
      }
    }
  }
  
  public wda(Context paramContext, String paramString1, String paramString2)
  {
    ra.a(paramContext);
    try
    {
      this.a = ((_U)Ul.a(paramContext, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", xda.a));
      Iq.a(paramContext);
      this.a.a(Iq.a(paramContext), paramString1, null);
      this.b = true;
      return;
    }
    catch (Wl|RemoteException|NullPointerException paramContext)
    {
      Tl.a("Cannot dynamite load clearcut");
    }
  }
  
  public final Ada a(byte[] paramArrayOfByte)
  {
    return new Ada(this, paramArrayOfByte, null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */