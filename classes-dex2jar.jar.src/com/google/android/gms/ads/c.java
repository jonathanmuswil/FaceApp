package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.Bea;
import com.google.android.gms.internal.ads.Kea;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.Uea;
import com.google.android.gms.internal.ads.Wa;
import com.google.android.gms.internal.ads.Xea;
import com.google.android.gms.internal.ads.ic;
import com.google.android.gms.internal.ads.jc;
import com.google.android.gms.internal.ads.kc;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.lc;
import com.google.android.gms.internal.ads.mc;
import com.google.android.gms.internal.ads.oea;
import com.google.android.gms.internal.ads.wea;
import com.google.android.gms.internal.ads.y;
import sp;
import vp.a;
import wp.a;
import xp.a;
import xp.b;
import zp.a;

public class c
{
  private final wea a;
  private final Context b;
  private final Uea c;
  
  c(Context paramContext, Uea paramUea)
  {
    this(paramContext, paramUea, wea.a);
  }
  
  private c(Context paramContext, Uea paramUea, wea paramwea)
  {
    this.b = paramContext;
    this.c = paramUea;
    this.a = paramwea;
  }
  
  private final void a(y paramy)
  {
    try
    {
      this.c.a(wea.a(this.b, paramy));
      return;
    }
    catch (RemoteException paramy)
    {
      Tl.b("Failed to load ad.", paramy);
    }
  }
  
  public void a(d paramd)
  {
    a(paramd.a());
  }
  
  public static class a
  {
    private final Context a;
    private final Xea b;
    
    private a(Context paramContext, Xea paramXea)
    {
      this.a = paramContext;
      this.b = paramXea;
    }
    
    public a(Context paramContext, String paramString)
    {
      this((Context)paramContext, Kea.b().a(paramContext, paramString, new kf()));
    }
    
    public a a(b paramb)
    {
      try
      {
        Xea localXea = this.b;
        oea localoea = new com/google/android/gms/internal/ads/oea;
        localoea.<init>(paramb);
        localXea.b(localoea);
      }
      catch (RemoteException paramb)
      {
        Tl.c("Failed to set AdListener.", paramb);
      }
      return this;
    }
    
    public a a(String paramString, xp.b paramb, xp.a parama)
    {
      try
      {
        Xea localXea = this.b;
        lc locallc = new com/google/android/gms/internal/ads/lc;
        locallc.<init>(paramb);
        if (parama == null) {
          paramb = null;
        } else {
          paramb = new kc(parama);
        }
        localXea.a(paramString, locallc, paramb);
      }
      catch (RemoteException paramString)
      {
        Tl.c("Failed to add custom template ad listener", paramString);
      }
      return this;
    }
    
    public a a(sp paramsp)
    {
      try
      {
        Xea localXea = this.b;
        Wa localWa = new com/google/android/gms/internal/ads/Wa;
        localWa.<init>(paramsp);
        localXea.a(localWa);
      }
      catch (RemoteException paramsp)
      {
        Tl.c("Failed to specify native ad options", paramsp);
      }
      return this;
    }
    
    @Deprecated
    public a a(vp.a parama)
    {
      try
      {
        Xea localXea = this.b;
        ic localic = new com/google/android/gms/internal/ads/ic;
        localic.<init>(parama);
        localXea.a(localic);
      }
      catch (RemoteException parama)
      {
        Tl.c("Failed to add app install ad listener", parama);
      }
      return this;
    }
    
    @Deprecated
    public a a(wp.a parama)
    {
      try
      {
        Xea localXea = this.b;
        jc localjc = new com/google/android/gms/internal/ads/jc;
        localjc.<init>(parama);
        localXea.a(localjc);
      }
      catch (RemoteException parama)
      {
        Tl.c("Failed to add content ad listener", parama);
      }
      return this;
    }
    
    public a a(zp.a parama)
    {
      try
      {
        Xea localXea = this.b;
        mc localmc = new com/google/android/gms/internal/ads/mc;
        localmc.<init>(parama);
        localXea.a(localmc);
      }
      catch (RemoteException parama)
      {
        Tl.c("Failed to add google native ad listener", parama);
      }
      return this;
    }
    
    public c a()
    {
      try
      {
        c localc = new c(this.a, this.b.Da());
        return localc;
      }
      catch (RemoteException localRemoteException)
      {
        Tl.b("Failed to build AdLoader.", localRemoteException);
      }
      return null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */