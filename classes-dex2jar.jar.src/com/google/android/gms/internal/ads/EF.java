package com.google.android.gms.internal.ads;

import Hq;
import Iq;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import oO;

@yh
public final class ef
  extends Aq
{
  private static final AtomicBoolean a = new AtomicBoolean(false);
  private final oO b;
  
  private ef(oO paramoO)
  {
    this.b = paramoO;
  }
  
  public static void a(Context paramContext, String paramString)
  {
    if (!a.compareAndSet(false, true)) {
      return;
    }
    new Thread(new ff(paramContext, paramString)).start();
  }
  
  public final String Ka()
    throws RemoteException
  {
    return this.b.c();
  }
  
  public final long V()
    throws RemoteException
  {
    return this.b.a();
  }
  
  public final String W()
    throws RemoteException
  {
    return this.b.e();
  }
  
  public final String X()
    throws RemoteException
  {
    return this.b.f();
  }
  
  public final String Ya()
    throws RemoteException
  {
    return this.b.b();
  }
  
  public final String Z()
    throws RemoteException
  {
    return this.b.d();
  }
  
  public final Map a(String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException
  {
    return this.b.a(paramString1, paramString2, paramBoolean);
  }
  
  public final void a(String paramString1, String paramString2, Hq paramHq)
    throws RemoteException
  {
    oO localoO = this.b;
    if (paramHq != null) {
      paramHq = Iq.J(paramHq);
    } else {
      paramHq = null;
    }
    localoO.a(paramString1, paramString2, paramHq);
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    this.b.b(paramString1, paramString2, paramBundle);
  }
  
  public final List b(String paramString1, String paramString2)
    throws RemoteException
  {
    return this.b.a(paramString1, paramString2);
  }
  
  public final void b(Hq paramHq, String paramString1, String paramString2)
    throws RemoteException
  {
    oO localoO = this.b;
    if (paramHq != null) {
      paramHq = (Activity)Iq.J(paramHq);
    } else {
      paramHq = null;
    }
    localoO.a(paramHq, paramString1, paramString2);
  }
  
  public final int c(String paramString)
    throws RemoteException
  {
    return this.b.c(paramString);
  }
  
  public final void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    this.b.a(paramString1, paramString2, paramBundle);
  }
  
  public final void e(Bundle paramBundle)
    throws RemoteException
  {
    this.b.c(paramBundle);
  }
  
  public final void f(String paramString)
    throws RemoteException
  {
    this.b.a(paramString);
  }
  
  public final void g(Bundle paramBundle)
    throws RemoteException
  {
    this.b.a(paramBundle);
  }
  
  public final void g(String paramString)
    throws RemoteException
  {
    this.b.b(paramString);
  }
  
  public final Bundle h(Bundle paramBundle)
    throws RemoteException
  {
    return this.b.b(paramBundle);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */