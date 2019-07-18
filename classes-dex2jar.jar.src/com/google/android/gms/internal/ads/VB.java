package com.google.android.gms.internal.ads;

import Hq;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rp.a;
import rp.b;
import vp;

@yh
public final class vb
  extends vp
{
  private final sb a;
  private final List<rp.b> b = new ArrayList();
  private final jb c;
  private final m d = new m();
  private final rp.a e;
  
  public vb(sb paramsb)
  {
    this.a = paramsb;
    Object localObject1 = null;
    try
    {
      paramsb = this.a.z();
      Object localObject2;
      if (paramsb != null)
      {
        localObject2 = paramsb.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          paramsb = ((Iterator)localObject2).next();
          Object localObject3;
          if ((paramsb instanceof IBinder))
          {
            localObject3 = (IBinder)paramsb;
            if (localObject3 != null)
            {
              paramsb = ((IBinder)localObject3).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
              if ((paramsb instanceof gb))
              {
                paramsb = (gb)paramsb;
                break label128;
              }
              paramsb = new ib((IBinder)localObject3);
              break label128;
            }
          }
          paramsb = null;
          label128:
          if (paramsb != null)
          {
            localObject3 = this.b;
            jb localjb = new com/google/android/gms/internal/ads/jb;
            localjb.<init>(paramsb);
            ((List)localObject3).add(localjb);
          }
        }
      }
      return;
    }
    catch (RemoteException paramsb)
    {
      Tl.b("", paramsb);
      try
      {
        localObject2 = this.a.E();
        if (localObject2 != null)
        {
          paramsb = new com/google/android/gms/internal/ads/jb;
          paramsb.<init>((gb)localObject2);
        }
      }
      catch (RemoteException paramsb)
      {
        Tl.b("", paramsb);
        paramsb = null;
      }
      this.c = paramsb;
      paramsb = (sb)localObject1;
      try
      {
        if (this.a.t() != null)
        {
          paramsb = new com/google/android/gms/internal/ads/bb;
          paramsb.<init>(this.a.t());
        }
      }
      catch (RemoteException paramsb)
      {
        Tl.b("", paramsb);
        paramsb = (sb)localObject1;
      }
      this.e = paramsb;
    }
  }
  
  private final Hq k()
  {
    try
    {
      Hq localHq = this.a.G();
      return localHq;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence b()
  {
    try
    {
      String str = this.a.x();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence c()
  {
    try
    {
      String str = this.a.v();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence d()
  {
    try
    {
      String str = this.a.u();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final rp.b e()
  {
    return this.c;
  }
  
  public final List<rp.b> f()
  {
    return this.b;
  }
  
  public final CharSequence g()
  {
    try
    {
      String str = this.a.F();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final Double h()
  {
    try
    {
      double d1 = this.a.J();
      if (d1 == -1.0D) {
        return null;
      }
      return Double.valueOf(d1);
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence i()
  {
    try
    {
      String str = this.a.O();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final m j()
  {
    try
    {
      if (this.a.getVideoController() != null) {
        this.d.a(this.a.getVideoController());
      }
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("Exception occurred while getting video controller", localRemoteException);
    }
    return this.d;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */