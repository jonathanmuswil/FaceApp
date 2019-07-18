package com.google.android.gms.common.api;

import QO;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import cP;
import com.google.android.gms.common.api.internal.Ha;
import com.google.android.gms.common.api.internal.La;
import com.google.android.gms.common.api.internal.N;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.va;
import com.google.android.gms.common.b;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.d.b;
import com.google.android.gms.common.internal.t;
import fP;
import gd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

public abstract class f
{
  private static final Set<f> a = Collections.newSetFromMap(new WeakHashMap());
  
  public static Set<f> e()
  {
    synchronized (a)
    {
      Set localSet2 = a;
      return localSet2;
    }
  }
  
  public <C extends a.f> C a(a.c<C> paramc)
  {
    throw new UnsupportedOperationException();
  }
  
  public <A extends a.b, R extends l, T extends c<R, A>> T a(T paramT)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract b a();
  
  public void a(va paramva)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean a(com.google.android.gms.common.api.internal.l paraml)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract g<Status> b();
  
  public <A extends a.b, T extends c<? extends l, A>> T b(T paramT)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void c();
  
  public abstract void d();
  
  public Context f()
  {
    throw new UnsupportedOperationException();
  }
  
  public Looper g()
  {
    throw new UnsupportedOperationException();
  }
  
  public void h()
  {
    throw new UnsupportedOperationException();
  }
  
  public static final class a
  {
    private Account a;
    private final Set<Scope> b = new HashSet();
    private final Set<Scope> c = new HashSet();
    private int d;
    private View e;
    private String f;
    private String g;
    private final Map<a<?>, d.b> h = new gd();
    private final Context i;
    private final Map<a<?>, a.d> j = new gd();
    private com.google.android.gms.common.api.internal.g k;
    private int l = -1;
    private Looper m;
    private e n = e.a();
    private a.a<? extends fP, QO> o = cP.c;
    private final ArrayList<f.b> p = new ArrayList();
    private final ArrayList<f.c> q = new ArrayList();
    private boolean r = false;
    
    public a(Context paramContext)
    {
      this.i = paramContext;
      this.m = paramContext.getMainLooper();
      this.f = paramContext.getPackageName();
      this.g = paramContext.getClass().getName();
    }
    
    public final a a(Handler paramHandler)
    {
      t.a(paramHandler, "Handler must not be null");
      this.m = paramHandler.getLooper();
      return this;
    }
    
    public final a a(a<? extends a.d.d> parama)
    {
      t.a(parama, "Api must not be null");
      this.j.put(parama, null);
      parama = parama.c().a(null);
      this.c.addAll(parama);
      this.b.addAll(parama);
      return this;
    }
    
    public final <O extends a.d.c> a a(a<O> parama, O paramO)
    {
      t.a(parama, "Api must not be null");
      t.a(paramO, "Null options are not permitted for this Api");
      this.j.put(parama, paramO);
      parama = parama.c().a(paramO);
      this.c.addAll(parama);
      this.b.addAll(parama);
      return this;
    }
    
    public final a a(f.b paramb)
    {
      t.a(paramb, "Listener must not be null");
      this.p.add(paramb);
      return this;
    }
    
    public final a a(f.c paramc)
    {
      t.a(paramc, "Listener must not be null");
      this.q.add(paramc);
      return this;
    }
    
    public final f a()
    {
      t.a(this.j.isEmpty() ^ true, "must call addApi() to add at least one API");
      d locald = b();
      Map localMap = locald.f();
      Object localObject1 = new gd();
      gd localgd = new gd();
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.j.keySet().iterator();
      ??? = null;
      int i1 = 0;
      boolean bool;
      while (localIterator.hasNext())
      {
        localObject3 = (a)localIterator.next();
        Object localObject5 = this.j.get(localObject3);
        if (localMap.get(localObject3) != null) {
          bool = true;
        } else {
          bool = false;
        }
        ((Map)localObject1).put(localObject3, Boolean.valueOf(bool));
        Object localObject6 = new La((a)localObject3, bool);
        localArrayList.add(localObject6);
        a.a locala = ((a)localObject3).d();
        localObject6 = locala.a(this.i, this.m, locald, localObject5, (f.b)localObject6, (f.c)localObject6);
        localgd.put(((a)localObject3).a(), localObject6);
        int i2 = i1;
        if (locala.a() == 1)
        {
          if (localObject5 != null) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          i2 = i1;
        }
        i1 = i2;
        if (((a.f)localObject6).b()) {
          if (??? == null)
          {
            ??? = localObject3;
            i1 = i2;
          }
          else
          {
            localObject3 = ((a)localObject3).b();
            ??? = ((a)???).b();
            localObject1 = new StringBuilder(String.valueOf(localObject3).length() + 21 + String.valueOf(???).length());
            ((StringBuilder)localObject1).append((String)localObject3);
            ((StringBuilder)localObject1).append(" cannot be used with ");
            ((StringBuilder)localObject1).append((String)???);
            throw new IllegalStateException(((StringBuilder)localObject1).toString());
          }
        }
      }
      if (??? != null) {
        if (i1 == 0)
        {
          if (this.a == null) {
            bool = true;
          } else {
            bool = false;
          }
          t.b(bool, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[] { ((a)???).b() });
          t.b(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] { ((a)???).b() });
        }
        else
        {
          ??? = ((a)???).b();
          localObject3 = new StringBuilder(String.valueOf(???).length() + 82);
          ((StringBuilder)localObject3).append("With using ");
          ((StringBuilder)localObject3).append((String)???);
          ((StringBuilder)localObject3).append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
          throw new IllegalStateException(((StringBuilder)localObject3).toString());
        }
      }
      i1 = N.a(localgd.values(), true);
      Object localObject3 = new N(this.i, new ReentrantLock(), this.m, locald, this.n, this.o, (Map)localObject1, this.p, this.q, localgd, this.l, i1, localArrayList, false);
      synchronized (f.i())
      {
        f.i().add(localObject3);
        if (this.l < 0) {
          return (f)localObject3;
        }
        Ha.b(this.k);
        throw null;
      }
    }
    
    public final d b()
    {
      QO localQO = QO.a;
      if (this.j.containsKey(cP.g)) {
        localQO = (QO)this.j.get(cP.g);
      }
      return new d(this.a, this.b, this.h, this.d, this.e, this.f, this.g, localQO);
    }
  }
  
  public static abstract interface b
  {
    public abstract void onConnected(Bundle paramBundle);
    
    public abstract void onConnectionSuspended(int paramInt);
  }
  
  public static abstract interface c
  {
    public abstract void onConnectionFailed(b paramb);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */