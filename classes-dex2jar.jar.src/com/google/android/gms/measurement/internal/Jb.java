package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import fq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import qK;
import zq;

public final class jb
  extends Db
{
  private final Bb c;
  private n d;
  private volatile Boolean e;
  private final c f;
  private final Sb g;
  private final List<Runnable> h = new ArrayList();
  private final c i;
  
  protected jb(aa paramaa)
  {
    super(paramaa);
    this.g = new Sb(paramaa.b());
    this.c = new Bb(this);
    this.f = new kb(this, paramaa);
    this.i = new tb(this, paramaa);
  }
  
  private final boolean H()
  {
    a();
    return true;
  }
  
  private final void I()
  {
    j();
    this.g.b();
    this.f.a(((Long)m.U.a(null)).longValue());
  }
  
  private final void J()
  {
    j();
    if (!B()) {
      return;
    }
    c().A().a("Inactivity, disconnecting from the service");
    A();
  }
  
  private final void K()
  {
    j();
    c().A().a("Processing queued up service tasks", Integer.valueOf(this.h.size()));
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
    {
      Runnable localRunnable = (Runnable)localIterator.next();
      try
      {
        localRunnable.run();
      }
      catch (Exception localException)
      {
        c().s().a("Task exception while flushing queue", localException);
      }
    }
    this.h.clear();
    this.i.a();
  }
  
  private final pc a(boolean paramBoolean)
  {
    a();
    q localq = p();
    String str;
    if (paramBoolean) {
      str = c().B();
    } else {
      str = null;
    }
    return localq.a(str);
  }
  
  private final void a(ComponentName paramComponentName)
  {
    j();
    if (this.d != null)
    {
      this.d = null;
      c().A().a("Disconnected from device MeasurementService", paramComponentName);
      j();
      F();
    }
  }
  
  private final void a(Runnable paramRunnable)
    throws IllegalStateException
  {
    j();
    if (B())
    {
      paramRunnable.run();
      return;
    }
    if (this.h.size() >= 1000L)
    {
      c().s().a("Discarding data. Max runnable queue size reached");
      return;
    }
    this.h.add(paramRunnable);
    this.i.a(60000L);
    F();
  }
  
  public final void A()
  {
    j();
    v();
    this.c.a();
    try
    {
      zq.a().a(getContext(), this.c);
      this.d = null;
      return;
    }
    catch (IllegalStateException|IllegalArgumentException localIllegalStateException)
    {
      for (;;) {}
    }
  }
  
  public final boolean B()
  {
    j();
    v();
    return this.d != null;
  }
  
  protected final void C()
  {
    j();
    h();
    v();
    pc localpc = a(false);
    if (H()) {
      s().A();
    }
    a(new nb(this, localpc));
  }
  
  protected final void D()
  {
    j();
    v();
    a(new qb(this, a(true)));
  }
  
  protected final void E()
  {
    j();
    v();
    a(new ub(this, a(true)));
  }
  
  final void F()
  {
    j();
    v();
    if (B()) {
      return;
    }
    Object localObject = this.e;
    int j = 0;
    int k;
    if (localObject == null)
    {
      j();
      v();
      localObject = f().u();
      boolean bool1;
      if ((localObject != null) && (((Boolean)localObject).booleanValue()))
      {
        bool1 = true;
      }
      else
      {
        a();
        if (p().E() == 1) {}
        boolean bool2;
        for (;;)
        {
          label164:
          label288:
          for (bool2 = true;; bool2 = false)
          {
            k = 1;
            break label310;
            c().A().a("Checking service availability");
            k = e().a(12451000);
            if (k == 0) {
              break label294;
            }
            if (k != 1)
            {
              if (k != 2) {
                if (k != 3) {
                  if (k != 9) {
                    if (k != 18) {
                      c().v().a("Unexpected service status", Integer.valueOf(k));
                    }
                  }
                }
              }
              for (bool2 = false;; bool2 = true)
              {
                k = 0;
                break label310;
                c().v().a("Service updating");
                break;
                c().v().a("Service invalid");
                break label164;
                c().v().a("Service disabled");
                break label164;
                c().z().a("Service container out of date");
                if (e().v() < 15000) {
                  break label288;
                }
                localObject = f().u();
                if ((localObject != null) && (!((Boolean)localObject).booleanValue())) {
                  break label164;
                }
              }
            }
            c().A().a("Service missing");
          }
          label294:
          c().A().a("Service available");
        }
        label310:
        int m = k;
        if (!bool2)
        {
          m = k;
          if (g().v())
          {
            c().s().a("No way to upload. Consider using the full version of Analytics");
            m = 0;
          }
        }
        bool1 = bool2;
        if (m != 0)
        {
          f().b(bool2);
          bool1 = bool2;
        }
      }
      this.e = Boolean.valueOf(bool1);
    }
    if (this.e.booleanValue())
    {
      this.c.b();
      return;
    }
    if (!g().v())
    {
      a();
      localObject = getContext().getPackageManager().queryIntentServices(new Intent().setClassName(getContext(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
      k = j;
      if (localObject != null)
      {
        k = j;
        if (((List)localObject).size() > 0) {
          k = 1;
        }
      }
      if (k != 0)
      {
        localObject = new Intent("com.google.android.gms.measurement.START");
        Context localContext = getContext();
        a();
        ((Intent)localObject).setComponent(new ComponentName(localContext, "com.google.android.gms.measurement.AppMeasurementService"));
        this.c.a((Intent)localObject);
        return;
      }
      c().s().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
    }
  }
  
  final Boolean G()
  {
    return this.e;
  }
  
  protected final void a(ec paramec)
  {
    j();
    v();
    boolean bool;
    if ((H()) && (s().a(paramec))) {
      bool = true;
    } else {
      bool = false;
    }
    a(new lb(this, bool, paramec, a(true)));
  }
  
  protected final void a(fb paramfb)
  {
    j();
    v();
    a(new rb(this, paramfb));
  }
  
  protected final void a(k paramk, String paramString)
  {
    t.a(paramk);
    j();
    v();
    boolean bool1 = H();
    boolean bool2;
    if ((bool1) && (s().a(paramk))) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a(new vb(this, bool1, bool2, paramk, a(true), paramString));
  }
  
  protected final void a(n paramn)
  {
    j();
    t.a(paramn);
    this.d = paramn;
    I();
    K();
  }
  
  final void a(n paramn, fq paramfq, pc parampc)
  {
    j();
    h();
    v();
    boolean bool = H();
    int j = 0;
    int k = 100;
    while ((j < 1001) && (k == 100))
    {
      ArrayList localArrayList = new ArrayList();
      Object localObject;
      if (bool)
      {
        localObject = s().a(100);
        if (localObject != null)
        {
          localArrayList.addAll((Collection)localObject);
          k = ((List)localObject).size();
          break label95;
        }
      }
      k = 0;
      label95:
      if ((paramfq != null) && (k < 100)) {
        localArrayList.add(paramfq);
      }
      int m = localArrayList.size();
      int n = 0;
      while (n < m)
      {
        localObject = localArrayList.get(n);
        n++;
        localObject = (fq)localObject;
        if ((localObject instanceof k)) {
          try
          {
            paramn.a((k)localObject, parampc);
          }
          catch (RemoteException localRemoteException1)
          {
            c().s().a("Failed to send event to the service", localRemoteException1);
          }
        } else if ((localRemoteException1 instanceof ec)) {
          try
          {
            paramn.a((ec)localRemoteException1, parampc);
          }
          catch (RemoteException localRemoteException2)
          {
            c().s().a("Failed to send attribute to the service", localRemoteException2);
          }
        } else if ((localRemoteException2 instanceof uc)) {
          try
          {
            paramn.a((uc)localRemoteException2, parampc);
          }
          catch (RemoteException localRemoteException3)
          {
            c().s().a("Failed to send conditional property to the service", localRemoteException3);
          }
        } else {
          c().s().a("Discarding data. Unrecognized parcel type.");
        }
      }
      j++;
    }
  }
  
  protected final void a(uc paramuc)
  {
    t.a(paramuc);
    j();
    v();
    a();
    boolean bool;
    if (s().a(paramuc)) {
      bool = true;
    } else {
      bool = false;
    }
    a(new wb(this, true, bool, new uc(paramuc), a(true), paramuc));
  }
  
  public final void a(AtomicReference<String> paramAtomicReference)
  {
    j();
    v();
    a(new ob(this, paramAtomicReference, a(false)));
  }
  
  protected final void a(AtomicReference<List<uc>> paramAtomicReference, String paramString1, String paramString2, String paramString3)
  {
    j();
    v();
    a(new xb(this, paramAtomicReference, paramString1, paramString2, paramString3, a(false)));
  }
  
  protected final void a(AtomicReference<List<ec>> paramAtomicReference, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    j();
    v();
    a(new zb(this, paramAtomicReference, paramString1, paramString2, paramString3, paramBoolean, a(false)));
  }
  
  protected final void a(AtomicReference<List<ec>> paramAtomicReference, boolean paramBoolean)
  {
    j();
    v();
    a(new mb(this, paramAtomicReference, a(false), paramBoolean));
  }
  
  public final void a(qK paramqK)
  {
    j();
    v();
    a(new pb(this, a(false), paramqK));
  }
  
  public final void a(qK paramqK, k paramk, String paramString)
  {
    j();
    v();
    if (e().a(12451000) != 0)
    {
      c().v().a("Not bundling data. Service unavailable or out of date");
      e().a(paramqK, new byte[0]);
      return;
    }
    a(new sb(this, paramk, paramString, paramqK));
  }
  
  protected final void a(qK paramqK, String paramString1, String paramString2)
  {
    j();
    v();
    a(new yb(this, paramString1, paramString2, a(false), paramqK));
  }
  
  protected final void a(qK paramqK, String paramString1, String paramString2, boolean paramBoolean)
  {
    j();
    v();
    a(new Ab(this, paramString1, paramString2, paramBoolean, a(false), paramqK));
  }
  
  protected final boolean y()
  {
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/jb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */