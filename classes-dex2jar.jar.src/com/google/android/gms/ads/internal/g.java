package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.Hl;
import com.google.android.gms.internal.ads.Kea;
import com.google.android.gms.internal.ads.LO;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.Yl;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.rN;
import com.google.android.gms.internal.ads.ra;
import com.google.android.gms.internal.ads.tk;
import com.google.android.gms.internal.ads.yh;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@yh
public final class g
  implements rN, Runnable
{
  private final List<Object[]> a = new Vector();
  private final AtomicReference<rN> b = new AtomicReference();
  private Context c;
  private Yl d;
  private CountDownLatch e = new CountDownLatch(1);
  
  public g(Context paramContext, Yl paramYl)
  {
    this.c = paramContext;
    this.d = paramYl;
    Kea.a();
    if (Hl.b())
    {
      tk.a(this);
      return;
    }
    run();
  }
  
  private final boolean a()
  {
    try
    {
      this.e.await();
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      Tl.c("Interrupted during GADSignals creation.", localInterruptedException);
    }
    return false;
  }
  
  private static Context b(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext == null) {
      return paramContext;
    }
    return localContext;
  }
  
  private final void b()
  {
    if (this.a.isEmpty()) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      Object[] arrayOfObject = (Object[])localIterator.next();
      if (arrayOfObject.length == 1) {
        ((rN)this.b.get()).a((MotionEvent)arrayOfObject[0]);
      } else if (arrayOfObject.length == 3) {
        ((rN)this.b.get()).a(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue());
      }
    }
    this.a.clear();
  }
  
  public final String a(Context paramContext)
  {
    if (a())
    {
      rN localrN = (rN)this.b.get();
      if (localrN != null)
      {
        b();
        return localrN.a(b(paramContext));
      }
    }
    return "";
  }
  
  public final String a(Context paramContext, String paramString, View paramView)
  {
    return a(paramContext, paramString, paramView, null);
  }
  
  public final String a(Context paramContext, String paramString, View paramView, Activity paramActivity)
  {
    if (a())
    {
      rN localrN = (rN)this.b.get();
      if (localrN != null)
      {
        b();
        return localrN.a(b(paramContext), paramString, paramView, paramActivity);
      }
    }
    return "";
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    rN localrN = (rN)this.b.get();
    if (localrN != null)
    {
      b();
      localrN.a(paramInt1, paramInt2, paramInt3);
      return;
    }
    this.a.add(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    rN localrN = (rN)this.b.get();
    if (localrN != null)
    {
      b();
      localrN.a(paramMotionEvent);
      return;
    }
    this.a.add(new Object[] { paramMotionEvent });
  }
  
  public final void a(View paramView)
  {
    rN localrN = (rN)this.b.get();
    if (localrN != null) {
      localrN.a(paramView);
    }
  }
  
  public final void run()
  {
    boolean bool1 = false;
    try
    {
      boolean bool2 = this.d.d;
      Object localObject1 = ra.hb;
      boolean bool3 = bool1;
      if (!((Boolean)Kea.e().a((ga)localObject1)).booleanValue())
      {
        bool3 = bool1;
        if (bool2) {
          bool3 = true;
        }
      }
      localObject1 = LO.a(this.d.a, b(this.c), bool3);
      this.b.set(localObject1);
      return;
    }
    finally
    {
      this.e.countDown();
      this.c = null;
      this.d = null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */