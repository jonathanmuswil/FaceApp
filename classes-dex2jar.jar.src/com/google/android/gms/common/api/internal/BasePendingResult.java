package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import zr;

@KeepName
public abstract class BasePendingResult<R extends l>
  extends g<R>
{
  static final ThreadLocal<Boolean> a = new Ka();
  private final Object b = new Object();
  private final a<R> c;
  private final WeakReference<f> d;
  private final CountDownLatch e = new CountDownLatch(1);
  private final ArrayList<g.a> f = new ArrayList();
  private m<? super R> g;
  private final AtomicReference<Ba> h = new AtomicReference();
  private R i;
  private Status j;
  private volatile boolean k;
  private boolean l;
  private boolean m;
  @KeepName
  private b mResultGuardian;
  private n n;
  private volatile va<R> o;
  private boolean p = false;
  
  @Deprecated
  BasePendingResult()
  {
    this.c = new a(Looper.getMainLooper());
    this.d = new WeakReference(null);
  }
  
  protected BasePendingResult(f paramf)
  {
    Looper localLooper;
    if (paramf != null) {
      localLooper = paramf.g();
    } else {
      localLooper = Looper.getMainLooper();
    }
    this.c = new a(localLooper);
    this.d = new WeakReference(paramf);
  }
  
  public static void b(l paraml)
  {
    if ((paraml instanceof i)) {
      try
      {
        ((i)paraml).a();
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        String str = String.valueOf(paraml);
        paraml = new StringBuilder(String.valueOf(str).length() + 18);
        paraml.append("Unable to release ");
        paraml.append(str);
        Log.w("BasePendingResult", paraml.toString(), localRuntimeException);
      }
    }
  }
  
  private final void c(R paramR)
  {
    this.i = paramR;
    this.n = null;
    this.e.countDown();
    this.j = this.i.w();
    if (this.l)
    {
      this.g = null;
    }
    else if (this.g == null)
    {
      if ((this.i instanceof i)) {
        this.mResultGuardian = new b(null);
      }
    }
    else
    {
      this.c.removeMessages(2);
      this.c.a(this.g, g());
    }
    ArrayList localArrayList = this.f;
    int i1 = localArrayList.size();
    int i2 = 0;
    while (i2 < i1)
    {
      paramR = localArrayList.get(i2);
      i2++;
      ((g.a)paramR).a(this.j);
    }
    this.f.clear();
  }
  
  private final R g()
  {
    synchronized (this.b)
    {
      boolean bool;
      if (!this.k) {
        bool = true;
      } else {
        bool = false;
      }
      t.b(bool, "Result has already been consumed.");
      t.b(c(), "Result is not ready.");
      l locall = this.i;
      this.i = null;
      this.g = null;
      this.k = true;
      ??? = (Ba)this.h.getAndSet(null);
      if (??? != null) {
        ((Ba)???).a(this);
      }
      return locall;
    }
  }
  
  public final R a(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong > 0L) {
      t.c("await must not be called on the UI thread when time is greater than zero.");
    }
    boolean bool1 = this.k;
    boolean bool2 = true;
    t.b(bool1 ^ true, "Result has already been consumed.");
    if (this.o != null) {
      bool2 = false;
    }
    t.b(bool2, "Cannot await if then() has been called.");
    try
    {
      if (!this.e.await(paramLong, paramTimeUnit)) {
        b(Status.d);
      }
    }
    catch (InterruptedException paramTimeUnit)
    {
      b(Status.b);
    }
    t.b(c(), "Result is not ready.");
    return g();
  }
  
  protected abstract R a(Status paramStatus);
  
  public void a()
  {
    synchronized (this.b)
    {
      if ((!this.l) && (!this.k))
      {
        n localn = this.n;
        if (localn == null) {}
      }
    }
    try
    {
      this.n.cancel();
      b(this.i);
      this.l = true;
      c(a(Status.e));
      return;
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final void a(g.a parama)
  {
    boolean bool;
    if (parama != null) {
      bool = true;
    } else {
      bool = false;
    }
    t.a(bool, "Callback cannot be null.");
    synchronized (this.b)
    {
      if (c()) {
        parama.a(this.j);
      } else {
        this.f.add(parama);
      }
      return;
    }
  }
  
  public final void a(Ba paramBa)
  {
    this.h.set(paramBa);
  }
  
  public final void a(R paramR)
  {
    synchronized (this.b)
    {
      if ((!this.m) && (!this.l))
      {
        c();
        boolean bool1 = c();
        boolean bool2 = true;
        if (!bool1) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        t.b(bool1, "Results have already been set");
        if (!this.k) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
        t.b(bool1, "Result has already been consumed");
        c(paramR);
        return;
      }
      b(paramR);
      return;
    }
  }
  
  public final void a(m<? super R> paramm)
  {
    localObject = this.b;
    if (paramm == null) {}
    try
    {
      this.g = null;
      return;
    }
    finally {}
    boolean bool1 = this.k;
    boolean bool2 = true;
    if (!bool1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    t.b(bool1, "Result has already been consumed.");
    if (this.o == null) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    t.b(bool1, "Cannot set callbacks if then() has been called.");
    if (b()) {
      return;
    }
    if (c()) {
      this.c.a(paramm, g());
    } else {
      this.g = paramm;
    }
  }
  
  public final void b(Status paramStatus)
  {
    synchronized (this.b)
    {
      if (!c())
      {
        a(a(paramStatus));
        this.m = true;
      }
      return;
    }
  }
  
  public boolean b()
  {
    synchronized (this.b)
    {
      boolean bool = this.l;
      return bool;
    }
  }
  
  public final boolean c()
  {
    return this.e.getCount() == 0L;
  }
  
  public final Integer d()
  {
    return null;
  }
  
  public final boolean e()
  {
    synchronized (this.b)
    {
      if (((f)this.d.get() == null) || (!this.p)) {
        a();
      }
      boolean bool = b();
      return bool;
    }
  }
  
  public final void f()
  {
    boolean bool;
    if ((!this.p) && (!((Boolean)a.get()).booleanValue())) {
      bool = false;
    } else {
      bool = true;
    }
    this.p = bool;
  }
  
  public static class a<R extends l>
    extends zr
  {
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void a(m<? super R> paramm, R paramR)
    {
      sendMessage(obtainMessage(1, new Pair(paramm, paramR)));
    }
    
    public void handleMessage(Message paramMessage)
    {
      int i = paramMessage.what;
      if (i != 1)
      {
        if (i != 2)
        {
          paramMessage = new StringBuilder(45);
          paramMessage.append("Don't know how to handle message: ");
          paramMessage.append(i);
          Log.wtf("BasePendingResult", paramMessage.toString(), new Exception());
          return;
        }
        ((BasePendingResult)paramMessage.obj).b(Status.d);
        return;
      }
      paramMessage = (Pair)paramMessage.obj;
      m localm = (m)paramMessage.first;
      paramMessage = (l)paramMessage.second;
      try
      {
        localm.a(paramMessage);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        BasePendingResult.b(paramMessage);
        throw localRuntimeException;
      }
    }
  }
  
  private final class b
  {
    private b() {}
    
    protected final void finalize()
      throws Throwable
    {
      BasePendingResult.b(BasePendingResult.a(BasePendingResult.this));
      super.finalize();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/BasePendingResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */