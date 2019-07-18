package com.google.android.gms.internal.ads;

import Hq;
import Iq;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;
import ud;

public final class xy
{
  private int a;
  private q b;
  private Ya c;
  private View d;
  private List<Ua> e;
  private List<J> f = Collections.emptyList();
  private J g;
  private Bundle h;
  private sp i;
  private sp j;
  private Hq k;
  private View l;
  private Hq m;
  private double n;
  private gb o;
  private gb p;
  private String q;
  private ud<String, Ua> r = new ud();
  private ud<String, String> s = new ud();
  private float t;
  
  public static xy a(Af paramAf)
  {
    try
    {
      q localq = paramAf.getVideoController();
      Ya localYa = paramAf.t();
      View localView1 = (View)b(paramAf.da());
      String str1 = paramAf.u();
      List localList = paramAf.z();
      String str2 = paramAf.x();
      Bundle localBundle = paramAf.getExtras();
      String str3 = paramAf.v();
      View localView2 = (View)b(paramAf.aa());
      Hq localHq = paramAf.y();
      String str4 = paramAf.N();
      gb localgb = paramAf.sa();
      paramAf = new com/google/android/gms/internal/ads/xy;
      paramAf.<init>();
      paramAf.a = 1;
      paramAf.b = localq;
      paramAf.c = localYa;
      paramAf.d = localView1;
      paramAf.a("headline", str1);
      paramAf.e = localList;
      paramAf.a("body", str2);
      paramAf.h = localBundle;
      paramAf.a("call_to_action", str3);
      paramAf.l = localView2;
      paramAf.m = localHq;
      paramAf.a("advertiser", str4);
      paramAf.p = localgb;
      return paramAf;
    }
    catch (RemoteException paramAf)
    {
      Tl.c("Failed to get native ad from content ad mapper", paramAf);
    }
    return null;
  }
  
  public static xy a(Df paramDf)
  {
    try
    {
      paramDf = a(paramDf.getVideoController(), paramDf.t(), (View)b(paramDf.da()), paramDf.u(), paramDf.z(), paramDf.x(), paramDf.getExtras(), paramDf.v(), (View)b(paramDf.aa()), paramDf.y(), paramDf.O(), paramDf.F(), paramDf.J(), paramDf.E(), paramDf.N(), paramDf.Va());
      return paramDf;
    }
    catch (RemoteException paramDf)
    {
      Tl.c("Failed to get native ad assets from unified ad mapper", paramDf);
    }
    return null;
  }
  
  private static xy a(q paramq, Ya paramYa, View paramView1, String paramString1, List paramList, String paramString2, Bundle paramBundle, String paramString3, View paramView2, Hq paramHq, String paramString4, String paramString5, double paramDouble, gb paramgb, String paramString6, float paramFloat)
  {
    xy localxy = new xy();
    localxy.a = 6;
    localxy.b = paramq;
    localxy.c = paramYa;
    localxy.d = paramView1;
    localxy.a("headline", paramString1);
    localxy.e = paramList;
    localxy.a("body", paramString2);
    localxy.h = paramBundle;
    localxy.a("call_to_action", paramString3);
    localxy.l = paramView2;
    localxy.m = paramHq;
    localxy.a("store", paramString4);
    localxy.a("price", paramString5);
    localxy.n = paramDouble;
    localxy.o = paramgb;
    localxy.a("advertiser", paramString6);
    localxy.a(paramFloat);
    return localxy;
  }
  
  public static xy a(xf paramxf)
  {
    try
    {
      q localq = paramxf.getVideoController();
      Ya localYa = paramxf.t();
      View localView1 = (View)b(paramxf.da());
      String str1 = paramxf.u();
      List localList = paramxf.z();
      String str2 = paramxf.x();
      Bundle localBundle = paramxf.getExtras();
      String str3 = paramxf.v();
      View localView2 = (View)b(paramxf.aa());
      Hq localHq = paramxf.y();
      String str4 = paramxf.O();
      String str5 = paramxf.F();
      double d1 = paramxf.J();
      gb localgb = paramxf.E();
      paramxf = new com/google/android/gms/internal/ads/xy;
      paramxf.<init>();
      paramxf.a = 2;
      paramxf.b = localq;
      paramxf.c = localYa;
      paramxf.d = localView1;
      paramxf.a("headline", str1);
      paramxf.e = localList;
      paramxf.a("body", str2);
      paramxf.h = localBundle;
      paramxf.a("call_to_action", str3);
      paramxf.l = localView2;
      paramxf.m = localHq;
      paramxf.a("store", str4);
      paramxf.a("price", str5);
      paramxf.n = d1;
      paramxf.o = localgb;
      return paramxf;
    }
    catch (RemoteException paramxf)
    {
      Tl.c("Failed to get native ad from app install ad mapper", paramxf);
    }
    return null;
  }
  
  private final void a(float paramFloat)
  {
    try
    {
      this.t = paramFloat;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static xy b(Af paramAf)
  {
    try
    {
      paramAf = a(paramAf.getVideoController(), paramAf.t(), (View)b(paramAf.da()), paramAf.u(), paramAf.z(), paramAf.x(), paramAf.getExtras(), paramAf.v(), (View)b(paramAf.aa()), paramAf.y(), null, null, -1.0D, paramAf.sa(), paramAf.N(), 0.0F);
      return paramAf;
    }
    catch (RemoteException paramAf)
    {
      Tl.c("Failed to get native ad assets from content ad mapper", paramAf);
    }
    return null;
  }
  
  public static xy b(xf paramxf)
  {
    try
    {
      paramxf = a(paramxf.getVideoController(), paramxf.t(), (View)b(paramxf.da()), paramxf.u(), paramxf.z(), paramxf.x(), paramxf.getExtras(), paramxf.v(), (View)b(paramxf.aa()), paramxf.y(), paramxf.O(), paramxf.F(), paramxf.J(), paramxf.E(), null, 0.0F);
      return paramxf;
    }
    catch (RemoteException paramxf)
    {
      Tl.c("Failed to get native ad assets from app install ad mapper", paramxf);
    }
    return null;
  }
  
  private static <T> T b(Hq paramHq)
  {
    if (paramHq == null) {
      return null;
    }
    return (T)Iq.J(paramHq);
  }
  
  private final String b(String paramString)
  {
    try
    {
      paramString = (String)this.s.get(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final float A()
  {
    try
    {
      float f1 = this.t;
      return f1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a()
  {
    try
    {
      if (this.i != null)
      {
        this.i.destroy();
        this.i = null;
      }
      if (this.j != null)
      {
        this.j.destroy();
        this.j = null;
      }
      this.k = null;
      this.r.clear();
      this.s.clear();
      this.b = null;
      this.c = null;
      this.d = null;
      this.e = null;
      this.h = null;
      this.l = null;
      this.m = null;
      this.o = null;
      this.p = null;
      this.q = null;
      return;
    }
    finally {}
  }
  
  public final void a(double paramDouble)
  {
    try
    {
      this.n = paramDouble;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(int paramInt)
  {
    try
    {
      this.a = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(Hq paramHq)
  {
    try
    {
      this.k = paramHq;
      return;
    }
    finally
    {
      paramHq = finally;
      throw paramHq;
    }
  }
  
  public final void a(View paramView)
  {
    try
    {
      this.l = paramView;
      return;
    }
    finally
    {
      paramView = finally;
      throw paramView;
    }
  }
  
  public final void a(J paramJ)
  {
    try
    {
      this.g = paramJ;
      return;
    }
    finally
    {
      paramJ = finally;
      throw paramJ;
    }
  }
  
  public final void a(Ya paramYa)
  {
    try
    {
      this.c = paramYa;
      return;
    }
    finally
    {
      paramYa = finally;
      throw paramYa;
    }
  }
  
  public final void a(gb paramgb)
  {
    try
    {
      this.o = paramgb;
      return;
    }
    finally
    {
      paramgb = finally;
      throw paramgb;
    }
  }
  
  public final void a(q paramq)
  {
    try
    {
      this.b = paramq;
      return;
    }
    finally
    {
      paramq = finally;
      throw paramq;
    }
  }
  
  public final void a(sp paramsp)
  {
    try
    {
      this.i = paramsp;
      return;
    }
    finally
    {
      paramsp = finally;
      throw paramsp;
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      this.q = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void a(String paramString, Ua paramUa)
  {
    if (paramUa == null) {}
    try
    {
      this.r.remove(paramString);
      return;
    }
    finally {}
    this.r.put(paramString, paramUa);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if (paramString2 == null) {}
    try
    {
      this.s.remove(paramString1);
      return;
    }
    finally {}
    this.s.put(paramString1, paramString2);
  }
  
  public final void a(List<Ua> paramList)
  {
    try
    {
      this.e = paramList;
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public final String b()
  {
    try
    {
      String str = b("advertiser");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b(gb paramgb)
  {
    try
    {
      this.p = paramgb;
      return;
    }
    finally
    {
      paramgb = finally;
      throw paramgb;
    }
  }
  
  public final void b(sp paramsp)
  {
    try
    {
      this.j = paramsp;
      return;
    }
    finally
    {
      paramsp = finally;
      throw paramsp;
    }
  }
  
  public final void b(List<J> paramList)
  {
    try
    {
      this.f = paramList;
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public final String c()
  {
    try
    {
      String str = b("body");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String d()
  {
    try
    {
      String str = b("call_to_action");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String e()
  {
    try
    {
      String str = this.q;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Bundle f()
  {
    try
    {
      if (this.h == null)
      {
        localBundle = new android/os/Bundle;
        localBundle.<init>();
        this.h = localBundle;
      }
      Bundle localBundle = this.h;
      return localBundle;
    }
    finally {}
  }
  
  public final String g()
  {
    try
    {
      String str = b("headline");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final List<Ua> h()
  {
    try
    {
      List localList = this.e;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final List<J> i()
  {
    try
    {
      List localList = this.f;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String j()
  {
    try
    {
      String str = b("price");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final double k()
  {
    try
    {
      double d1 = this.n;
      return d1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String l()
  {
    try
    {
      String str = b("store");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final q m()
  {
    try
    {
      q localq = this.b;
      return localq;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int n()
  {
    try
    {
      int i1 = this.a;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final View o()
  {
    try
    {
      View localView = this.d;
      return localView;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final J p()
  {
    try
    {
      J localJ = this.g;
      return localJ;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final View q()
  {
    try
    {
      View localView = this.l;
      return localView;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final sp r()
  {
    try
    {
      sp localsp = this.i;
      return localsp;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final sp s()
  {
    try
    {
      sp localsp = this.j;
      return localsp;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Hq t()
  {
    try
    {
      Hq localHq = this.k;
      return localHq;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final ud<String, Ua> u()
  {
    try
    {
      ud localud = this.r;
      return localud;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final ud<String, String> v()
  {
    try
    {
      ud localud = this.s;
      return localud;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final gb w()
  {
    try
    {
      gb localgb = this.o;
      return localgb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Ya x()
  {
    try
    {
      Ya localYa = this.c;
      return localYa;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Hq y()
  {
    try
    {
      Hq localHq = this.m;
      return localHq;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final gb z()
  {
    try
    {
      gb localgb = this.p;
      return localgb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */