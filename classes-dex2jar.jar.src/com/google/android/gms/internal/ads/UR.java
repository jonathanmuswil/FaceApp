package com.google.android.gms.internal.ads;

import Fq;
import Gq;
import Hq;
import Iq;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.k;
import java.util.List;

public final class ur
  extends c
{
  private final Context a;
  private final Yl b;
  private final OE c;
  private final jE<of, NE> d;
  private final TG e;
  private final kC f;
  private boolean g;
  
  ur(Context paramContext, Yl paramYl, OE paramOE, jE<of, NE> paramjE, TG paramTG, kC paramkC)
  {
    this.a = paramContext;
    this.b = paramYl;
    this.c = paramOE;
    this.d = paramjE;
    this.e = paramTG;
    this.f = paramkC;
    this.g = false;
  }
  
  private final String Gb()
  {
    Object localObject;
    if (this.a.getApplicationContext() == null) {
      localObject = this.a;
    } else {
      localObject = this.a.getApplicationContext();
    }
    try
    {
      localObject = Gq.a((Context)localObject).a(((Context)localObject).getPackageName(), 128).metaData;
      return ((Bundle)localObject).getString("com.google.android.gms.ads.APPLICATION_ID");
    }
    catch (NullPointerException localNullPointerException) {}catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    mk.e("Error getting metadata", localNameNotFoundException);
    return "";
  }
  
  public final void M()
  {
    try
    {
      if (this.g)
      {
        Tl.d("Mobile ads is initialized already.");
        return;
      }
      ra.a(this.a);
      k.g().a(this.a, this.b);
      k.i().a(this.a);
      this.g = true;
      this.f.a();
      ga localga = ra._b;
      if (((Boolean)Kea.e().a(localga)).booleanValue()) {
        this.e.a();
      }
      return;
    }
    finally {}
  }
  
  public final List<id> Oa()
    throws RemoteException
  {
    return this.f.b();
  }
  
  public final String Ra()
  {
    return this.b.a;
  }
  
  public final boolean Sa()
  {
    try
    {
      boolean bool = k.h().b();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(float paramFloat)
  {
    try
    {
      k.h().a(paramFloat);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(lf paramlf)
    throws RemoteException
  {
    this.c.a(paramlf);
  }
  
  public final void a(nd paramnd)
    throws RemoteException
  {
    this.f.a(paramnd);
  }
  
  public final void a(String paramString, Hq paramHq)
  {
    Object localObject = ra.bd;
    if (((Boolean)Kea.e().a((ga)localObject)).booleanValue()) {
      localObject = Gb();
    } else {
      localObject = "";
    }
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      paramString = (String)localObject;
    }
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    ra.a(this.a);
    localObject = ra._c;
    boolean bool1 = ((Boolean)Kea.e().a((ga)localObject)).booleanValue();
    localObject = ra._a;
    boolean bool2 = bool1 | ((Boolean)Kea.e().a((ga)localObject)).booleanValue();
    localObject = null;
    ga localga = ra._a;
    if (((Boolean)Kea.e().a(localga)).booleanValue())
    {
      bool2 = true;
      localObject = new vr(this, (Runnable)Iq.J(paramHq));
    }
    if (bool2) {
      k.k().a(this.a, this.b, paramString, (Runnable)localObject);
    }
  }
  
  public final void b(Hq paramHq, String paramString)
  {
    if (paramHq == null)
    {
      Tl.b("Wrapped context is null. Failed to open debug menu.");
      return;
    }
    paramHq = (Context)Iq.J(paramHq);
    if (paramHq == null)
    {
      Tl.b("Context is null. Failed to open debug menu.");
      return;
    }
    paramHq = new Pk(paramHq);
    paramHq.a(paramString);
    paramHq.d(this.b.a);
    paramHq.a();
  }
  
  public final float cb()
  {
    try
    {
      float f1 = k.h().a();
      return f1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void f(boolean paramBoolean)
  {
    try
    {
      k.h().a(paramBoolean);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void l(String paramString)
  {
    this.e.a(paramString);
  }
  
  public final void t(String paramString)
  {
    try
    {
      ra.a(this.a);
      if (!TextUtils.isEmpty(paramString))
      {
        ga localga = ra._c;
        if (((Boolean)Kea.e().a(localga)).booleanValue()) {
          k.k().a(this.a, this.b, paramString, null);
        }
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */