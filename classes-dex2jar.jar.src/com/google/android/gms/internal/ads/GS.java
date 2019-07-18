package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.common.util.e;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class gs
  implements o, Xu, Yu, mca
{
  private final bs a;
  private final es b;
  private final Set<sp> c = new HashSet();
  private final _e<JSONObject, JSONObject> d;
  private final Executor e;
  private final e f;
  private final AtomicBoolean g = new AtomicBoolean(false);
  private final is h = new is();
  private boolean i = false;
  private WeakReference<Object> j = new WeakReference(this);
  
  public gs(Ue paramUe, es parames, Executor paramExecutor, bs parambs, e parame)
  {
    this.a = parambs;
    parambs = Ke.b;
    this.d = paramUe.a("google.afma.activeView.handleUpdate", parambs, parambs);
    this.b = parames;
    this.e = paramExecutor;
    this.f = parame;
  }
  
  private final void H()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      sp localsp = (sp)localIterator.next();
      this.a.b(localsp);
    }
    this.a.a();
  }
  
  public final void F() {}
  
  public final void G() {}
  
  public final void a(lca paramlca)
  {
    try
    {
      this.h.a = paramlca.m;
      this.h.f = paramlca;
      h();
      return;
    }
    finally
    {
      paramlca = finally;
      throw paramlca;
    }
  }
  
  public final void a(sp paramsp)
  {
    try
    {
      this.c.add(paramsp);
      this.a.a(paramsp);
      return;
    }
    finally
    {
      paramsp = finally;
      throw paramsp;
    }
  }
  
  public final void a(Object paramObject)
  {
    this.j = new WeakReference(paramObject);
  }
  
  public final void b(Context paramContext)
  {
    try
    {
      this.h.e = "u";
      h();
      H();
      this.i = true;
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public final void c(Context paramContext)
  {
    try
    {
      this.h.b = false;
      h();
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public final void d(Context paramContext)
  {
    try
    {
      this.h.b = true;
      h();
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public final void h()
  {
    try
    {
      int k;
      if (this.j.get() != null) {
        k = 1;
      } else {
        k = 0;
      }
      if (k == 0)
      {
        l();
        return;
      }
      if (!this.i)
      {
        boolean bool = this.g.get();
        if (bool) {
          try
          {
            this.h.d = this.f.b();
            JSONObject localJSONObject = this.b.a(this.h);
            Iterator localIterator = this.c.iterator();
            while (localIterator.hasNext())
            {
              sp localsp = (sp)localIterator.next();
              Executor localExecutor = this.e;
              hs localhs = new com/google/android/gms/internal/ads/hs;
              localhs.<init>(localsp, localJSONObject);
              localExecutor.execute(localhs);
            }
            dm.b(this.d.b(localJSONObject), "ActiveViewListener.callActiveViewJs");
            return;
          }
          catch (Exception localException)
          {
            mk.e("Failed to call ActiveViewJS", localException);
          }
        }
      }
      return;
    }
    finally {}
  }
  
  public final void k()
  {
    try
    {
      if (this.g.compareAndSet(false, true))
      {
        this.a.a(this);
        h();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void l()
  {
    try
    {
      H();
      this.i = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void onPause()
  {
    try
    {
      this.h.b = true;
      h();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void onResume()
  {
    try
    {
      this.h.b = false;
      h();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */