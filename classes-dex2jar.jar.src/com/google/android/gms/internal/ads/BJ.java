package com.google.android.gms.internal.ads;

import Fq;
import Gq;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.m;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@yh
public final class bj
  implements nj
{
  private static List<Future<Void>> a = Collections.synchronizedList(new ArrayList());
  private static ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
  private final rT c;
  private final LinkedHashMap<String, xT> d;
  private final List<String> e = new ArrayList();
  private final List<String> f = new ArrayList();
  private final Context g;
  private final pj h;
  private boolean i;
  private final jj j;
  private final qj k;
  private final Object l = new Object();
  private HashSet<String> m = new HashSet();
  private boolean n = false;
  private boolean o = false;
  private boolean p = false;
  
  public bj(Context paramContext, Yl paramYl, jj paramjj, String paramString, pj parampj)
  {
    t.a(paramjj, "SafeBrowsing config is not present.");
    Context localContext = paramContext;
    if (paramContext.getApplicationContext() != null) {
      localContext = paramContext.getApplicationContext();
    }
    this.g = localContext;
    this.d = new LinkedHashMap();
    this.h = parampj;
    this.j = paramjj;
    paramContext = this.j.e.iterator();
    while (paramContext.hasNext())
    {
      paramjj = (String)paramContext.next();
      this.m.add(paramjj.toLowerCase(Locale.ENGLISH));
    }
    this.m.remove("cookie".toLowerCase(Locale.ENGLISH));
    paramContext = new rT();
    paramContext.c = Integer.valueOf(8);
    paramContext.e = paramString;
    paramContext.f = paramString;
    paramContext.h = new sT();
    paramContext.h.c = this.j.a;
    paramjj = new yT();
    paramjj.c = paramYl.a;
    paramjj.e = Boolean.valueOf(Gq.a(this.g).a());
    long l1 = f.a().b(this.g);
    if (l1 > 0L) {
      paramjj.d = Long.valueOf(l1);
    }
    paramContext.r = paramjj;
    this.c = paramContext;
    this.k = new qj(this.g, this.j.h, this);
  }
  
  private final xT e(String paramString)
  {
    synchronized (this.l)
    {
      paramString = (xT)this.d.get(paramString);
      return paramString;
    }
  }
  
  private final xm<Void> f()
  {
    boolean bool = this.i;
    int i1 = 0;
    int i2;
    if (((bool) && (this.j.g)) || ((this.p) && (this.j.f)) || ((!this.i) && (this.j.d))) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if (i2 == 0) {
      return gm.a(null);
    }
    synchronized (this.l)
    {
      this.c.i = new xT[this.d.size()];
      this.d.values().toArray(this.c.i);
      this.c.s = ((String[])this.e.toArray(new String[0]));
      this.c.t = ((String[])this.f.toArray(new String[0]));
      if (mj.a())
      {
        localObject2 = new java/lang/StringBuilder;
        str = this.c.e;
        localObject4 = this.c.j;
        int i3 = String.valueOf(str).length();
        i2 = String.valueOf(localObject4).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i3 + 53 + i2);
        localStringBuilder.append("Sending SB report\n  url: ");
        localStringBuilder.append(str);
        localStringBuilder.append("\n  clickUrl: ");
        localStringBuilder.append((String)localObject4);
        localStringBuilder.append("\n  resources: \n");
        ((StringBuilder)localObject2).<init>(localStringBuilder.toString());
        localObject4 = this.c.i;
        i3 = localObject4.length;
        for (i2 = i1; i2 < i3; i2++)
        {
          str = localObject4[i2];
          ((StringBuilder)localObject2).append("    [");
          ((StringBuilder)localObject2).append(str.l.length);
          ((StringBuilder)localObject2).append("] ");
          ((StringBuilder)localObject2).append(str.e);
        }
        mj.a(((StringBuilder)localObject2).toString());
      }
      Object localObject2 = jT.a(this.c);
      String str = this.j.b;
      Object localObject4 = new com/google/android/gms/internal/ads/hl;
      ((hl)localObject4).<init>(this.g);
      localObject2 = ((hl)localObject4).a(1, str, null, (byte[])localObject2);
      if (mj.a())
      {
        localObject4 = new com/google/android/gms/internal/ads/gj;
        ((gj)localObject4).<init>(this);
        ((xm)localObject2).a((Runnable)localObject4, tk.a);
      }
      localObject2 = gm.a((xm)localObject2, dj.a, Cm.b);
      return (xm<Void>)localObject2;
    }
  }
  
  public final void a()
  {
    synchronized (this.l)
    {
      xm localxm = this.h.a(this.g, this.d.keySet());
      Object localObject3 = new com/google/android/gms/internal/ads/cj;
      ((cj)localObject3).<init>(this);
      localxm = gm.a(localxm, (am)localObject3, Cm.b);
      localObject3 = gm.a(localxm, 10L, TimeUnit.SECONDS, b);
      fj localfj = new com/google/android/gms/internal/ads/fj;
      localfj.<init>(this, (xm)localObject3);
      gm.a(localxm, localfj, Cm.b);
      a.add(localObject3);
      return;
    }
  }
  
  public final void a(View paramView)
  {
    if (!this.j.c) {
      return;
    }
    if (this.o) {
      return;
    }
    k.c();
    paramView = vk.b(paramView);
    if (paramView == null)
    {
      mj.a("Failed to capture the webview bitmap.");
      return;
    }
    this.o = true;
    vk.a(new ej(this, paramView));
  }
  
  public final void a(String paramString)
  {
    synchronized (this.l)
    {
      this.c.j = paramString;
      return;
    }
  }
  
  public final void a(String paramString, Map<String, String> paramMap, int paramInt)
  {
    Object localObject1 = this.l;
    if (paramInt == 3) {}
    try
    {
      this.p = true;
      if (this.d.containsKey(paramString))
      {
        if (paramInt == 3) {
          ((xT)this.d.get(paramString)).k = Integer.valueOf(paramInt);
        }
        return;
      }
      xT localxT = new com/google/android/gms/internal/ads/xT;
      localxT.<init>();
      localxT.k = Integer.valueOf(paramInt);
      localxT.d = Integer.valueOf(this.d.size());
      localxT.e = paramString;
      Object localObject2 = new com/google/android/gms/internal/ads/uT;
      ((uT)localObject2).<init>();
      localxT.f = ((uT)localObject2);
      if ((this.m.size() > 0) && (paramMap != null))
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Iterator localIterator = paramMap.entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (Map.Entry)localIterator.next();
          try
          {
            if (((Map.Entry)localObject2).getKey() != null) {
              paramMap = (String)((Map.Entry)localObject2).getKey();
            } else {
              paramMap = "";
            }
            if (((Map.Entry)localObject2).getValue() != null) {
              localObject2 = (String)((Map.Entry)localObject2).getValue();
            } else {
              localObject2 = "";
            }
            Object localObject3 = paramMap.toLowerCase(Locale.ENGLISH);
            if (this.m.contains(localObject3))
            {
              localObject3 = new com/google/android/gms/internal/ads/tT;
              ((tT)localObject3).<init>();
              ((tT)localObject3).d = paramMap.getBytes("UTF-8");
              ((tT)localObject3).e = ((String)localObject2).getBytes("UTF-8");
              localArrayList.add(localObject3);
            }
          }
          catch (UnsupportedEncodingException paramMap)
          {
            mj.a("Cannot convert string to bytes, skip header.");
          }
        }
        paramMap = new tT[localArrayList.size()];
        localArrayList.toArray(paramMap);
        localxT.f.d = paramMap;
      }
      this.d.put(paramString, localxT);
      return;
    }
    finally {}
  }
  
  public final String[] a(String[] paramArrayOfString)
  {
    return (String[])this.k.a(paramArrayOfString).toArray(new String[0]);
  }
  
  public final void b()
  {
    this.n = true;
  }
  
  final void b(String paramString)
  {
    synchronized (this.l)
    {
      this.e.add(paramString);
      return;
    }
  }
  
  final void c(String paramString)
  {
    synchronized (this.l)
    {
      this.f.add(paramString);
      return;
    }
  }
  
  public final boolean c()
  {
    return (m.f()) && (this.j.c) && (!this.o);
  }
  
  public final jj d()
  {
    return this.j;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */