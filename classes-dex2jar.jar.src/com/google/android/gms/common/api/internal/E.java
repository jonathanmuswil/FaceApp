package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.f.b;
import com.google.android.gms.common.api.f.c;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.c.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.r.a;
import com.google.android.gms.common.internal.t;
import fP;
import gd;
import id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import nP;
import oP;
import zr;

public class e
  implements Handler.Callback
{
  public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
  private static final Status b = new Status(4, "The user must be signed in to make this API call.");
  private static final Object c = new Object();
  private static e d;
  private long e = 5000L;
  private long f = 120000L;
  private long g = 10000L;
  private final Context h;
  private final com.google.android.gms.common.e i;
  private final com.google.android.gms.common.internal.l j;
  private final AtomicInteger k = new AtomicInteger(1);
  private final AtomicInteger l = new AtomicInteger(0);
  private final Map<Ga<?>, a<?>> m = new ConcurrentHashMap(5, 0.75F, 1);
  private v n = null;
  private final Set<Ga<?>> o = new id();
  private final Set<Ga<?>> p = new id();
  private final Handler q;
  
  private e(Context paramContext, Looper paramLooper, com.google.android.gms.common.e parame)
  {
    this.h = paramContext;
    this.q = new zr(paramLooper, this);
    this.i = parame;
    this.j = new com.google.android.gms.common.internal.l(parame);
    paramContext = this.q;
    paramContext.sendMessage(paramContext.obtainMessage(6));
  }
  
  public static e a(Context paramContext)
  {
    synchronized (c)
    {
      if (d == null)
      {
        Object localObject2 = new android/os/HandlerThread;
        ((HandlerThread)localObject2).<init>("GoogleApiHandler", 9);
        ((HandlerThread)localObject2).start();
        Looper localLooper = ((HandlerThread)localObject2).getLooper();
        localObject2 = new com/google/android/gms/common/api/internal/e;
        ((e)localObject2).<init>(paramContext.getApplicationContext(), localLooper, com.google.android.gms.common.e.a());
        d = (e)localObject2;
      }
      paramContext = d;
      return paramContext;
    }
  }
  
  public static void b()
  {
    synchronized (c)
    {
      if (d != null)
      {
        e locale = d;
        locale.l.incrementAndGet();
        locale.q.sendMessageAtFrontOfQueue(locale.q.obtainMessage(10));
      }
      return;
    }
  }
  
  private final void b(com.google.android.gms.common.api.e<?> parame)
  {
    Ga localGa = parame.g();
    a locala1 = (a)this.m.get(localGa);
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new a(parame);
      this.m.put(localGa, locala2);
    }
    if (locala2.d()) {
      this.p.add(localGa);
    }
    locala2.a();
  }
  
  public static e c()
  {
    synchronized (c)
    {
      t.a(d, "Must guarantee manager is non-null before using getInstance");
      e locale = d;
      return locale;
    }
  }
  
  final PendingIntent a(Ga<?> paramGa, int paramInt)
  {
    paramGa = (a)this.m.get(paramGa);
    if (paramGa == null) {
      return null;
    }
    paramGa = paramGa.m();
    if (paramGa == null) {
      return null;
    }
    return PendingIntent.getActivity(this.h, paramInt, paramGa.i(), 134217728);
  }
  
  public final nP<Map<Ga<?>, String>> a(Iterable<? extends com.google.android.gms.common.api.e<?>> paramIterable)
  {
    paramIterable = new Ia(paramIterable);
    Handler localHandler = this.q;
    localHandler.sendMessage(localHandler.obtainMessage(2, paramIterable));
    return paramIterable.a();
  }
  
  final void a()
  {
    this.l.incrementAndGet();
    Handler localHandler = this.q;
    localHandler.sendMessage(localHandler.obtainMessage(10));
  }
  
  public final void a(com.google.android.gms.common.api.e<?> parame)
  {
    Handler localHandler = this.q;
    localHandler.sendMessage(localHandler.obtainMessage(7, parame));
  }
  
  public final <O extends a.d> void a(com.google.android.gms.common.api.e<O> parame, int paramInt, c<? extends com.google.android.gms.common.api.l, a.b> paramc)
  {
    Da localDa = new Da(paramInt, paramc);
    paramc = this.q;
    paramc.sendMessage(paramc.obtainMessage(4, new na(localDa, this.l.get(), parame)));
  }
  
  public final <O extends a.d, ResultT> void a(com.google.android.gms.common.api.e<O> parame, int paramInt, o<a.b, ResultT> paramo, oP<ResultT> paramoP, m paramm)
  {
    paramo = new Ea(paramInt, paramo, paramoP, paramm);
    paramoP = this.q;
    paramoP.sendMessage(paramoP.obtainMessage(4, new na(paramo, this.l.get(), parame)));
  }
  
  public final void a(com.google.android.gms.common.b paramb, int paramInt)
  {
    if (!b(paramb, paramInt))
    {
      Handler localHandler = this.q;
      localHandler.sendMessage(localHandler.obtainMessage(5, paramInt, 0, paramb));
    }
  }
  
  final boolean b(com.google.android.gms.common.b paramb, int paramInt)
  {
    return this.i.a(this.h, paramb, paramInt);
  }
  
  public final int d()
  {
    return this.k.getAndIncrement();
  }
  
  public final void g()
  {
    Handler localHandler = this.q;
    localHandler.sendMessage(localHandler.obtainMessage(3));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i1 = paramMessage.what;
    long l1 = 300000L;
    Object localObject1;
    Object localObject2;
    label617:
    Object localObject3;
    switch (i1)
    {
    default: 
      paramMessage = new StringBuilder(31);
      paramMessage.append("Unknown message id: ");
      paramMessage.append(i1);
      Log.w("GoogleApiManager", paramMessage.toString());
      return false;
    case 16: 
      paramMessage = (b)paramMessage.obj;
      if (this.m.containsKey(b.a(paramMessage))) {
        a.b((a)this.m.get(b.a(paramMessage)), paramMessage);
      }
      break;
    case 15: 
      paramMessage = (b)paramMessage.obj;
      if (this.m.containsKey(b.a(paramMessage))) {
        a.a((a)this.m.get(b.a(paramMessage)), paramMessage);
      }
      break;
    case 14: 
      paramMessage = (w)paramMessage.obj;
      localObject1 = paramMessage.b();
      if (!this.m.containsKey(localObject1))
      {
        paramMessage.a().a(Boolean.valueOf(false));
      }
      else
      {
        boolean bool = a.a((a)this.m.get(localObject1), false);
        paramMessage.a().a(Boolean.valueOf(bool));
      }
      break;
    case 12: 
      if (this.m.containsKey(paramMessage.obj)) {
        ((a)this.m.get(paramMessage.obj)).l();
      }
      break;
    case 11: 
      if (this.m.containsKey(paramMessage.obj)) {
        ((a)this.m.get(paramMessage.obj)).g();
      }
      break;
    case 10: 
      paramMessage = this.p.iterator();
      while (paramMessage.hasNext())
      {
        localObject1 = (Ga)paramMessage.next();
        ((a)this.m.remove(localObject1)).h();
      }
      this.p.clear();
      break;
    case 9: 
      if (this.m.containsKey(paramMessage.obj)) {
        ((a)this.m.get(paramMessage.obj)).e();
      }
      break;
    case 7: 
      b((com.google.android.gms.common.api.e)paramMessage.obj);
      break;
    case 6: 
      if ((com.google.android.gms.common.util.m.a()) && ((this.h.getApplicationContext() instanceof Application)))
      {
        b.a((Application)this.h.getApplicationContext());
        b.a().a(new ba(this));
        if (!b.a().a(true)) {
          this.g = 300000L;
        }
      }
      break;
    case 5: 
      i1 = paramMessage.arg1;
      localObject1 = (com.google.android.gms.common.b)paramMessage.obj;
      localObject2 = this.m.values().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramMessage = (a)((Iterator)localObject2).next();
        if (paramMessage.b() == i1) {
          break label617;
        }
      }
      paramMessage = null;
      if (paramMessage != null)
      {
        localObject2 = this.i.b(((com.google.android.gms.common.b)localObject1).y());
        localObject3 = ((com.google.android.gms.common.b)localObject1).z();
        localObject1 = new StringBuilder(String.valueOf(localObject2).length() + 69 + String.valueOf(localObject3).length());
        ((StringBuilder)localObject1).append("Error resolution was canceled by the user, original error message: ");
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(": ");
        ((StringBuilder)localObject1).append((String)localObject3);
        paramMessage.a(new Status(17, ((StringBuilder)localObject1).toString()));
      }
      else
      {
        paramMessage = new StringBuilder(76);
        paramMessage.append("Could not find API instance ");
        paramMessage.append(i1);
        paramMessage.append(" while trying to fail enqueued calls.");
        Log.wtf("GoogleApiManager", paramMessage.toString(), new Exception());
      }
      break;
    case 4: 
    case 8: 
    case 13: 
      localObject2 = (na)paramMessage.obj;
      localObject1 = (a)this.m.get(((na)localObject2).c.g());
      paramMessage = (Message)localObject1;
      if (localObject1 == null)
      {
        b(((na)localObject2).c);
        paramMessage = (a)this.m.get(((na)localObject2).c.g());
      }
      if ((paramMessage.d()) && (this.l.get() != ((na)localObject2).b))
      {
        ((na)localObject2).a.a(a);
        paramMessage.h();
      }
      else
      {
        paramMessage.a(((na)localObject2).a);
      }
      break;
    case 3: 
      localObject1 = this.m.values().iterator();
    case 2: 
    case 1: 
      while (((Iterator)localObject1).hasNext())
      {
        paramMessage = (a)((Iterator)localObject1).next();
        paramMessage.j();
        paramMessage.a();
        continue;
        localObject1 = (Ia)paramMessage.obj;
        localObject2 = ((Ia)localObject1).b().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Ga)((Iterator)localObject2).next();
          paramMessage = (a)this.m.get(localObject3);
          if (paramMessage == null)
          {
            ((Ia)localObject1).a((Ga)localObject3, new com.google.android.gms.common.b(13), null);
          }
          else if (paramMessage.c())
          {
            ((Ia)localObject1).a((Ga)localObject3, com.google.android.gms.common.b.a, paramMessage.f().d());
          }
          else if (paramMessage.k() != null)
          {
            ((Ia)localObject1).a((Ga)localObject3, paramMessage.k(), null);
          }
          else
          {
            paramMessage.a((Ia)localObject1);
            paramMessage.a();
            continue;
            if (((Boolean)paramMessage.obj).booleanValue()) {
              l1 = 10000L;
            }
            this.g = l1;
            this.q.removeMessages(12);
            localObject1 = this.m.keySet().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              paramMessage = (Ga)((Iterator)localObject1).next();
              localObject2 = this.q;
              ((Handler)localObject2).sendMessageDelayed(((Handler)localObject2).obtainMessage(12, paramMessage), this.g);
            }
          }
        }
      }
    }
    return true;
  }
  
  public final class a<O extends a.d>
    implements f.b, f.c, Ma
  {
    private final Queue<S> a = new LinkedList();
    private final a.f b;
    private final a.b c;
    private final Ga<O> d;
    private final s e;
    private final Set<Ia> f = new HashSet();
    private final Map<i.a<?>, oa> g = new HashMap();
    private final int h;
    private final ra i;
    private boolean j;
    private final List<e.b> k = new ArrayList();
    private com.google.android.gms.common.b l = null;
    
    public a()
    {
      Object localObject;
      this.b = ((com.google.android.gms.common.api.e)localObject).a(e.a(e.this).getLooper(), this);
      a.f localf = this.b;
      if ((localf instanceof com.google.android.gms.common.internal.w)) {
        this.c = ((com.google.android.gms.common.internal.w)localf).B();
      } else {
        this.c = localf;
      }
      this.d = ((com.google.android.gms.common.api.e)localObject).g();
      this.e = new s();
      this.h = ((com.google.android.gms.common.api.e)localObject).e();
      if (this.b.j())
      {
        this.i = ((com.google.android.gms.common.api.e)localObject).a(e.b(e.this), e.a(e.this));
        return;
      }
      this.i = null;
    }
    
    private final d a(d[] paramArrayOfd)
    {
      if ((paramArrayOfd != null) && (paramArrayOfd.length != 0))
      {
        Object localObject1 = this.b.h();
        int n = 0;
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new d[0];
        }
        localObject1 = new gd(localObject2.length);
        int i1 = localObject2.length;
        for (int i2 = 0; i2 < i1; i2++)
        {
          Object localObject3 = localObject2[i2];
          ((Map)localObject1).put(((d)localObject3).y(), Long.valueOf(((d)localObject3).z()));
        }
        i1 = paramArrayOfd.length;
        i2 = n;
        while (i2 < i1)
        {
          localObject2 = paramArrayOfd[i2];
          if ((((Map)localObject1).containsKey(((d)localObject2).y())) && (((Long)((Map)localObject1).get(((d)localObject2).y())).longValue() >= ((d)localObject2).z())) {
            i2++;
          } else {
            return (d)localObject2;
          }
        }
      }
      return null;
    }
    
    private final void a(e.b paramb)
    {
      if (!this.k.contains(paramb)) {
        return;
      }
      if (!this.j)
      {
        if (!this.b.isConnected())
        {
          a();
          return;
        }
        p();
      }
    }
    
    private final boolean a(boolean paramBoolean)
    {
      t.a(e.a(e.this));
      if ((this.b.isConnected()) && (this.g.size() == 0))
      {
        if (this.e.a())
        {
          if (paramBoolean) {
            r();
          }
          return false;
        }
        this.b.a();
        return true;
      }
      return false;
    }
    
    private final void b(e.b paramb)
    {
      if (this.k.remove(paramb))
      {
        e.a(e.this).removeMessages(15, paramb);
        e.a(e.this).removeMessages(16, paramb);
        d locald = e.b.b(paramb);
        paramb = new ArrayList(this.a.size());
        Iterator localIterator = this.a.iterator();
        Object localObject;
        while (localIterator.hasNext())
        {
          S localS = (S)localIterator.next();
          if ((localS instanceof pa))
          {
            localObject = ((pa)localS).b(this);
            if ((localObject != null) && (com.google.android.gms.common.util.b.a((Object[])localObject, locald))) {
              paramb.add(localS);
            }
          }
        }
        int n = paramb.size();
        int i1 = 0;
        while (i1 < n)
        {
          localObject = paramb.get(i1);
          i1++;
          localObject = (S)localObject;
          this.a.remove(localObject);
          ((S)localObject).a(new q(locald));
        }
      }
    }
    
    private final boolean b(S paramS)
    {
      if (!(paramS instanceof pa))
      {
        c(paramS);
        return true;
      }
      pa localpa = (pa)paramS;
      d locald = a(localpa.b(this));
      if (locald == null)
      {
        c(paramS);
        return true;
      }
      if (localpa.c(this))
      {
        paramS = new e.b(this.d, locald, null);
        int n = this.k.indexOf(paramS);
        if (n >= 0)
        {
          paramS = (e.b)this.k.get(n);
          e.a(e.this).removeMessages(15, paramS);
          e.a(e.this).sendMessageDelayed(Message.obtain(e.a(e.this), 15, paramS), e.c(e.this));
        }
        else
        {
          this.k.add(paramS);
          e.a(e.this).sendMessageDelayed(Message.obtain(e.a(e.this), 15, paramS), e.c(e.this));
          e.a(e.this).sendMessageDelayed(Message.obtain(e.a(e.this), 16, paramS), e.d(e.this));
          paramS = new com.google.android.gms.common.b(2, null);
          if (!b(paramS)) {
            e.this.b(paramS, this.h);
          }
        }
      }
      else
      {
        localpa.a(new q(locald));
      }
      return false;
    }
    
    private final boolean b(com.google.android.gms.common.b paramb)
    {
      synchronized ()
      {
        if ((e.f(e.this) != null) && (e.g(e.this).contains(this.d)))
        {
          e.f(e.this).a(paramb, this.h);
          return true;
        }
        return false;
      }
    }
    
    private final void c(S paramS)
    {
      paramS.a(this.e, d());
      try
      {
        paramS.a(this);
        return;
      }
      catch (DeadObjectException paramS)
      {
        onConnectionSuspended(1);
        this.b.a();
      }
    }
    
    private final void c(com.google.android.gms.common.b paramb)
    {
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
      {
        Ia localIa = (Ia)localIterator.next();
        String str = null;
        if (r.a(paramb, com.google.android.gms.common.b.a)) {
          str = this.b.d();
        }
        localIa.a(this.d, paramb, str);
      }
      this.f.clear();
    }
    
    private final void n()
    {
      j();
      c(com.google.android.gms.common.b.a);
      q();
      Iterator localIterator = this.g.values().iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          Object localObject = (oa)localIterator.next();
          if (a(((oa)localObject).a.b()) != null)
          {
            localIterator.remove();
            continue;
          }
          try
          {
            k localk = ((oa)localObject).a;
            a.b localb = this.c;
            localObject = new oP;
            ((oP)localObject).<init>();
            localk.a(localb, (oP)localObject);
          }
          catch (RemoteException localRemoteException)
          {
            localIterator.remove();
          }
          catch (DeadObjectException localDeadObjectException)
          {
            onConnectionSuspended(1);
            this.b.a();
          }
        }
      }
      p();
      r();
    }
    
    private final void o()
    {
      j();
      this.j = true;
      this.e.c();
      e.a(e.this).sendMessageDelayed(Message.obtain(e.a(e.this), 9, this.d), e.c(e.this));
      e.a(e.this).sendMessageDelayed(Message.obtain(e.a(e.this), 11, this.d), e.d(e.this));
      e.e(e.this).a();
    }
    
    private final void p()
    {
      ArrayList localArrayList = new ArrayList(this.a);
      int n = localArrayList.size();
      int i1 = 0;
      while (i1 < n)
      {
        Object localObject = localArrayList.get(i1);
        int i2 = i1 + 1;
        localObject = (S)localObject;
        if (!this.b.isConnected()) {
          break;
        }
        i1 = i2;
        if (b((S)localObject))
        {
          this.a.remove(localObject);
          i1 = i2;
        }
      }
    }
    
    private final void q()
    {
      if (this.j)
      {
        e.a(e.this).removeMessages(11, this.d);
        e.a(e.this).removeMessages(9, this.d);
        this.j = false;
      }
    }
    
    private final void r()
    {
      e.a(e.this).removeMessages(12, this.d);
      e.a(e.this).sendMessageDelayed(e.a(e.this).obtainMessage(12, this.d), e.i(e.this));
    }
    
    public final void a()
    {
      t.a(e.a(e.this));
      if ((!this.b.isConnected()) && (!this.b.c()))
      {
        int n = e.e(e.this).a(e.b(e.this), this.b);
        if (n != 0)
        {
          onConnectionFailed(new com.google.android.gms.common.b(n, null));
          return;
        }
        e.c localc = new e.c(e.this, this.b, this.d);
        if (this.b.j()) {
          this.i.a(localc);
        }
        this.b.a(localc);
      }
    }
    
    public final void a(Status paramStatus)
    {
      t.a(e.a(e.this));
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        ((S)localIterator.next()).a(paramStatus);
      }
      this.a.clear();
    }
    
    public final void a(Ia paramIa)
    {
      t.a(e.a(e.this));
      this.f.add(paramIa);
    }
    
    public final void a(S paramS)
    {
      t.a(e.a(e.this));
      if (this.b.isConnected())
      {
        if (b(paramS))
        {
          r();
          return;
        }
        this.a.add(paramS);
        return;
      }
      this.a.add(paramS);
      paramS = this.l;
      if ((paramS != null) && (paramS.B()))
      {
        onConnectionFailed(this.l);
        return;
      }
      a();
    }
    
    public final void a(com.google.android.gms.common.b paramb)
    {
      t.a(e.a(e.this));
      this.b.a();
      onConnectionFailed(paramb);
    }
    
    public final void a(com.google.android.gms.common.b paramb, a<?> parama, boolean paramBoolean)
    {
      if (Looper.myLooper() == e.a(e.this).getLooper())
      {
        onConnectionFailed(paramb);
        return;
      }
      e.a(e.this).post(new ea(this, paramb));
    }
    
    public final int b()
    {
      return this.h;
    }
    
    final boolean c()
    {
      return this.b.isConnected();
    }
    
    public final boolean d()
    {
      return this.b.j();
    }
    
    public final void e()
    {
      t.a(e.a(e.this));
      if (this.j) {
        a();
      }
    }
    
    public final a.f f()
    {
      return this.b;
    }
    
    public final void g()
    {
      t.a(e.a(e.this));
      if (this.j)
      {
        q();
        Status localStatus;
        if (e.h(e.this).c(e.b(e.this)) == 18) {
          localStatus = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
        } else {
          localStatus = new Status(8, "API failed to connect while resuming due to an unknown error.");
        }
        a(localStatus);
        this.b.a();
      }
    }
    
    public final void h()
    {
      t.a(e.a(e.this));
      a(e.a);
      this.e.b();
      i.a[] arrayOfa = (i.a[])this.g.keySet().toArray(new i.a[this.g.size()]);
      int n = arrayOfa.length;
      for (int i1 = 0; i1 < n; i1++) {
        a(new Fa(arrayOfa[i1], new oP()));
      }
      c(new com.google.android.gms.common.b(4));
      if (this.b.isConnected()) {
        this.b.a(new fa(this));
      }
    }
    
    public final Map<i.a<?>, oa> i()
    {
      return this.g;
    }
    
    public final void j()
    {
      t.a(e.a(e.this));
      this.l = null;
    }
    
    public final com.google.android.gms.common.b k()
    {
      t.a(e.a(e.this));
      return this.l;
    }
    
    public final boolean l()
    {
      return a(true);
    }
    
    final fP m()
    {
      ra localra = this.i;
      if (localra == null) {
        return null;
      }
      return localra.a();
    }
    
    public final void onConnected(Bundle paramBundle)
    {
      if (Looper.myLooper() == e.a(e.this).getLooper())
      {
        n();
        return;
      }
      e.a(e.this).post(new ca(this));
    }
    
    public final void onConnectionFailed(com.google.android.gms.common.b paramb)
    {
      t.a(e.a(e.this));
      Object localObject = this.i;
      if (localObject != null) {
        ((ra)localObject).b();
      }
      j();
      e.e(e.this).a();
      c(paramb);
      if (paramb.y() == 4)
      {
        a(e.f());
        return;
      }
      if (this.a.isEmpty())
      {
        this.l = paramb;
        return;
      }
      if (b(paramb)) {
        return;
      }
      if (!e.this.b(paramb, this.h))
      {
        if (paramb.y() == 18) {
          this.j = true;
        }
        if (this.j)
        {
          e.a(e.this).sendMessageDelayed(Message.obtain(e.a(e.this), 9, this.d), e.c(e.this));
          return;
        }
        localObject = this.d.a();
        paramb = new StringBuilder(String.valueOf(localObject).length() + 38);
        paramb.append("API: ");
        paramb.append((String)localObject);
        paramb.append(" is not available on this device.");
        a(new Status(17, paramb.toString()));
      }
    }
    
    public final void onConnectionSuspended(int paramInt)
    {
      if (Looper.myLooper() == e.a(e.this).getLooper())
      {
        o();
        return;
      }
      e.a(e.this).post(new da(this));
    }
  }
  
  private static final class b
  {
    private final Ga<?> a;
    private final d b;
    
    private b(Ga<?> paramGa, d paramd)
    {
      this.a = paramGa;
      this.b = paramd;
    }
    
    public final boolean equals(Object paramObject)
    {
      if ((paramObject != null) && ((paramObject instanceof b)))
      {
        paramObject = (b)paramObject;
        if ((r.a(this.a, ((b)paramObject).a)) && (r.a(this.b, ((b)paramObject).b))) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      return r.a(new Object[] { this.a, this.b });
    }
    
    public final String toString()
    {
      r.a locala = r.a(this);
      locala.a("key", this.a);
      locala.a("feature", this.b);
      return locala.toString();
    }
  }
  
  private final class c
    implements ua, c.c
  {
    private final a.f a;
    private final Ga<?> b;
    private com.google.android.gms.common.internal.m c = null;
    private Set<Scope> d = null;
    private boolean e = false;
    
    public c(Ga<?> paramGa)
    {
      this.a = paramGa;
      Ga localGa;
      this.b = localGa;
    }
    
    private final void a()
    {
      if (this.e)
      {
        com.google.android.gms.common.internal.m localm = this.c;
        if (localm != null) {
          this.a.a(localm, this.d);
        }
      }
    }
    
    public final void a(com.google.android.gms.common.b paramb)
    {
      e.a(e.this).post(new ha(this, paramb));
    }
    
    public final void a(com.google.android.gms.common.internal.m paramm, Set<Scope> paramSet)
    {
      if ((paramm != null) && (paramSet != null))
      {
        this.c = paramm;
        this.d = paramSet;
        a();
        return;
      }
      Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
      b(new com.google.android.gms.common.b(4));
    }
    
    public final void b(com.google.android.gms.common.b paramb)
    {
      ((e.a)e.j(e.this).get(this.b)).a(paramb);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */