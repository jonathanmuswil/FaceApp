package com.google.android.gms.internal.ads;

import Hq;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

public final class ry
  extends Ct
{
  private final Executor f;
  private final xy g;
  private final Gy h;
  private final Qy i;
  private final By j;
  private final Hy k;
  private final NT<iA> l;
  private final NT<fA> m;
  private final NT<nA> n;
  private final NT<cA> o;
  private final NT<kA> p;
  private hz q;
  private boolean r;
  private final rj s;
  private final hP t;
  private final Yl u;
  private final Context v;
  
  public ry(Executor paramExecutor, xy paramxy, Gy paramGy, Qy paramQy, By paramBy, Hy paramHy, NT<iA> paramNT, NT<fA> paramNT1, NT<nA> paramNT2, NT<cA> paramNT3, NT<kA> paramNT4, rj paramrj, hP paramhP, Yl paramYl, Context paramContext)
  {
    this.f = paramExecutor;
    this.g = paramxy;
    this.h = paramGy;
    this.i = paramQy;
    this.j = paramBy;
    this.k = paramHy;
    this.l = paramNT;
    this.m = paramNT1;
    this.n = paramNT2;
    this.o = paramNT3;
    this.p = paramNT4;
    this.s = paramrj;
    this.t = paramhP;
    this.u = paramYl;
    this.v = paramContext;
  }
  
  private final void b(String paramString)
  {
    if (!this.j.d()) {
      return;
    }
    Object localObject1 = this.g.s();
    sp localsp = this.g.r();
    if ((localObject1 == null) && (localsp == null)) {
      return;
    }
    int i1 = 1;
    int i2;
    if (localObject1 != null) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if (localsp == null) {
      i1 = 0;
    }
    Object localObject2 = null;
    if (i2 == 0)
    {
      while (i1 != 0)
      {
        localObject2 = "javascript";
        localObject1 = localsp;
      }
      localObject1 = null;
      localObject2 = localObject1;
    }
    if (((sp)localObject1).getWebView() == null) {
      return;
    }
    if (k.r().b(this.v))
    {
      Object localObject3 = this.u;
      i2 = ((Yl)localObject3).b;
      int i3 = ((Yl)localObject3).c;
      localObject3 = new StringBuilder(23);
      ((StringBuilder)localObject3).append(i2);
      ((StringBuilder)localObject3).append(".");
      ((StringBuilder)localObject3).append(i3);
      localObject3 = ((StringBuilder)localObject3).toString();
      paramString = k.r().a((String)localObject3, ((sp)localObject1).getWebView(), "", "javascript", (String)localObject2, paramString);
      if (paramString == null) {
        return;
      }
      this.g.a(paramString);
      ((sp)localObject1).a(paramString);
      if (i1 != 0)
      {
        localObject1 = localsp.getView();
        if (localObject1 != null) {
          k.r().a(paramString, (View)localObject1);
        }
      }
      k.r().a(paramString);
    }
  }
  
  public static boolean b(View paramView)
  {
    return (paramView.isShown()) && (paramView.getGlobalVisibleRect(new Rect(), null));
  }
  
  public final void a()
  {
    try
    {
      Executor localExecutor = this.f;
      uy localuy = new com/google/android/gms/internal/ads/uy;
      localuy.<init>(this);
      localExecutor.execute(localuy);
      super.a();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    try
    {
      this.h.b(paramBundle);
      return;
    }
    finally
    {
      paramBundle = finally;
      throw paramBundle;
    }
  }
  
  public final void a(View paramView)
  {
    try
    {
      this.h.a(paramView);
      return;
    }
    finally
    {
      paramView = finally;
      throw paramView;
    }
  }
  
  public final void a(View paramView1, MotionEvent paramMotionEvent, View paramView2)
  {
    try
    {
      this.h.a(paramView1, paramMotionEvent, paramView2);
      return;
    }
    finally
    {
      paramView1 = finally;
      throw paramView1;
    }
  }
  
  public final void a(View paramView1, View paramView2, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean)
  {
    try
    {
      ga localga = ra.Se;
      if (((Boolean)Kea.e().a(localga)).booleanValue()) {
        this.i.b(this.q);
      }
      this.h.a(paramView1, paramView2, paramMap1, paramMap2, paramBoolean);
      return;
    }
    finally {}
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean)
  {
    try
    {
      boolean bool = this.r;
      if (bool) {
        return;
      }
      if (paramBoolean)
      {
        this.h.a(paramView, paramMap1, paramMap2);
        this.r = true;
        return;
      }
      if (!paramBoolean)
      {
        Object localObject = ra.Qc;
        if ((((Boolean)Kea.e().a((ga)localObject)).booleanValue()) && (paramMap1 != null))
        {
          Iterator localIterator = paramMap1.entrySet().iterator();
          while (localIterator.hasNext())
          {
            localObject = (View)((WeakReference)((Map.Entry)localIterator.next()).getValue()).get();
            if ((localObject != null) && (b((View)localObject)))
            {
              this.h.a(paramView, paramMap1, paramMap2);
              this.r = true;
              return;
            }
          }
        }
      }
      return;
    }
    finally {}
  }
  
  public final void a(ac paramac)
  {
    try
    {
      this.h.a(paramac);
      return;
    }
    finally
    {
      paramac = finally;
      throw paramac;
    }
  }
  
  public final void a(g paramg)
  {
    try
    {
      this.h.a(paramg);
      return;
    }
    finally
    {
      paramg = finally;
      throw paramg;
    }
  }
  
  public final void a(hz paramhz)
  {
    try
    {
      this.q = paramhz;
      this.i.a(paramhz);
      this.h.a(paramhz.a(), paramhz.d(), paramhz.f(), paramhz, paramhz);
      Object localObject = ra.lc;
      if (((Boolean)Kea.e().a((ga)localObject)).booleanValue())
      {
        localObject = this.t.a();
        if (localObject != null) {
          ((rN)localObject).a(paramhz.a());
        }
      }
      if (paramhz.c() != null) {
        paramhz.c().a(this.s);
      }
      return;
    }
    finally {}
  }
  
  public final void a(j paramj)
  {
    try
    {
      this.h.a(paramj);
      return;
    }
    finally
    {
      paramj = finally;
      throw paramj;
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      this.h.a(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    try
    {
      this.h.a(paramBundle);
      return;
    }
    finally
    {
      paramBundle = finally;
      throw paramBundle;
    }
  }
  
  public final void b(hz paramhz)
  {
    try
    {
      this.h.a(paramhz.a(), paramhz.e());
      if (paramhz.b() != null)
      {
        paramhz.b().setClickable(false);
        paramhz.b().removeAllViews();
      }
      if (paramhz.c() != null) {
        paramhz.c().b(this.s);
      }
      this.q = null;
      return;
    }
    finally {}
  }
  
  public final void c()
  {
    this.f.execute(new sy(this));
    if (this.g.n() != 7)
    {
      Executor localExecutor = this.f;
      Gy localGy = this.h;
      localGy.getClass();
      localExecutor.execute(ty.a(localGy));
    }
    super.c();
  }
  
  public final void c(View paramView)
  {
    Hq localHq = this.g.t();
    int i1;
    if (this.g.s() != null) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if ((this.j.d()) && (localHq != null) && (i1 != 0) && (paramView != null)) {
      k.r().a(localHq, paramView);
    }
  }
  
  public final boolean c(Bundle paramBundle)
  {
    try
    {
      boolean bool = this.r;
      if (bool) {
        return true;
      }
      bool = this.h.c(paramBundle);
      this.r = bool;
      return bool;
    }
    finally {}
  }
  
  public final void f()
  {
    try
    {
      this.h.D();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void g()
  {
    try
    {
      if (this.q == null)
      {
        Tl.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        return;
      }
      boolean bool = this.q instanceof Ny;
      Executor localExecutor = this.f;
      vy localvy = new com/google/android/gms/internal/ads/vy;
      localvy.<init>(this, bool);
      localExecutor.execute(localvy);
      return;
    }
    finally {}
  }
  
  public final void h()
  {
    try
    {
      boolean bool = this.r;
      if (bool) {
        return;
      }
      this.h.b();
      return;
    }
    finally {}
  }
  
  public final boolean i()
  {
    return this.j.b();
  }
  
  public final void l()
  {
    try
    {
      this.h.H();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final cb m()
  {
    return new qy(this.g);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */