package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import av;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.b;
import com.google.android.gms.common.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<T extends IInterface>
{
  private static final com.google.android.gms.common.d[] a = new com.google.android.gms.common.d[0];
  public static final String[] b = { "service_esmobile", "service_googleme" };
  private boolean A = false;
  private volatile H B = null;
  protected AtomicInteger C = new AtomicInteger(0);
  private int c;
  private long d;
  private long e;
  private int f;
  private long g;
  private N h;
  private final Context i;
  private final Looper j;
  private final j k;
  private final f l;
  final Handler m;
  private final Object n = new Object();
  private final Object o = new Object();
  private q p;
  protected c q;
  private T r;
  private final ArrayList<h<?>> s = new ArrayList();
  private j t;
  private int u = 1;
  private final a v;
  private final b w;
  private final int x;
  private final String y;
  private b z = null;
  
  protected c(Context paramContext, Looper paramLooper, int paramInt, a parama, b paramb, String paramString)
  {
    this(paramContext, paramLooper, localj, localf, paramInt, parama, (b)paramb, paramString);
  }
  
  protected c(Context paramContext, Looper paramLooper, j paramj, f paramf, int paramInt, a parama, b paramb, String paramString)
  {
    t.a(paramContext, "Context must not be null");
    this.i = ((Context)paramContext);
    t.a(paramLooper, "Looper must not be null");
    this.j = ((Looper)paramLooper);
    t.a(paramj, "Supervisor must not be null");
    this.k = ((j)paramj);
    t.a(paramf, "API availability must not be null");
    this.l = ((f)paramf);
    this.m = new g(paramLooper);
    this.x = paramInt;
    this.v = parama;
    this.w = paramb;
    this.y = paramString;
  }
  
  private final String A()
  {
    String str1 = this.y;
    String str2 = str1;
    if (str1 == null) {
      str2 = this.i.getClass().getName();
    }
    return str2;
  }
  
  private final boolean B()
  {
    synchronized (this.n)
    {
      boolean bool;
      if (this.u == 3) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  private final boolean C()
  {
    if (this.A) {
      return false;
    }
    if (TextUtils.isEmpty(w())) {
      return false;
    }
    if (TextUtils.isEmpty(t())) {
      return false;
    }
    try
    {
      Class.forName(w());
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return false;
  }
  
  private final void a(H paramH)
  {
    this.B = paramH;
  }
  
  private final boolean a(int paramInt1, int paramInt2, T paramT)
  {
    synchronized (this.n)
    {
      if (this.u != paramInt1) {
        return false;
      }
      b(paramInt2, paramT);
      return true;
    }
  }
  
  private final void b(int paramInt, T paramT)
  {
    int i1;
    if (paramInt == 4) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int i2;
    if (paramT != null) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    boolean bool;
    if (i1 == i2) {
      bool = true;
    } else {
      bool = false;
    }
    t.a(bool);
    synchronized (this.n)
    {
      this.u = paramInt;
      this.r = paramT;
      a(paramInt, paramT);
      if (paramInt != 1)
      {
        if ((paramInt != 2) && (paramInt != 3))
        {
          if (paramInt == 4) {
            a(paramT);
          }
        }
        else
        {
          if ((this.t != null) && (this.h != null))
          {
            localObject2 = this.h.c();
            localObject3 = this.h.a();
            paramInt = String.valueOf(localObject2).length();
            i1 = String.valueOf(localObject3).length();
            paramT = new java/lang/StringBuilder;
            paramT.<init>(paramInt + 70 + i1);
            paramT.append("Calling connect() while still connected, missing disconnect() for ");
            paramT.append((String)localObject2);
            paramT.append(" on ");
            paramT.append((String)localObject3);
            Log.e("GmsClient", paramT.toString());
            this.k.a(this.h.c(), this.h.a(), this.h.b(), this.t, A());
            this.C.incrementAndGet();
          }
          paramT = new com/google/android/gms/common/internal/c$j;
          paramT.<init>(this, this.C.get());
          this.t = paramT;
          if ((this.u == 3) && (t() != null))
          {
            paramT = new com/google/android/gms/common/internal/N;
            paramT.<init>(r().getPackageName(), t(), true, 129);
          }
          else
          {
            paramT = new N(y(), x(), false, 129);
          }
          this.h = paramT;
          j localj = this.k;
          Object localObject3 = this.h.c();
          String str1 = this.h.a();
          paramInt = this.h.b();
          paramT = this.t;
          String str2 = A();
          Object localObject2 = new com/google/android/gms/common/internal/j$a;
          ((j.a)localObject2).<init>((String)localObject3, str1, paramInt);
          if (!localj.a((j.a)localObject2, paramT, str2))
          {
            paramT = this.h.c();
            localObject2 = this.h.a();
            paramInt = String.valueOf(paramT).length();
            i1 = String.valueOf(localObject2).length();
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>(paramInt + 34 + i1);
            ((StringBuilder)localObject3).append("unable to connect to service: ");
            ((StringBuilder)localObject3).append(paramT);
            ((StringBuilder)localObject3).append(" on ");
            ((StringBuilder)localObject3).append((String)localObject2);
            Log.e("GmsClient", ((StringBuilder)localObject3).toString());
            a(16, null, this.C.get());
          }
        }
      }
      else if (this.t != null)
      {
        this.k.a(this.h.c(), this.h.a(), this.h.b(), this.t, A());
        this.t = null;
      }
      return;
    }
  }
  
  private final void c(int paramInt)
  {
    if (B())
    {
      paramInt = 5;
      this.A = true;
    }
    else
    {
      paramInt = 4;
    }
    Handler localHandler = this.m;
    localHandler.sendMessage(localHandler.obtainMessage(paramInt, this.C.get(), 16));
  }
  
  protected abstract T a(IBinder paramIBinder);
  
  public void a()
  {
    this.C.incrementAndGet();
    synchronized (this.s)
    {
      int i1 = this.s.size();
      for (int i2 = 0; i2 < i1; i2++) {
        ((h)this.s.get(i2)).a();
      }
      this.s.clear();
      synchronized (this.o)
      {
        this.p = null;
        b(1, null);
        return;
      }
    }
  }
  
  protected void a(int paramInt)
  {
    this.c = paramInt;
    this.d = System.currentTimeMillis();
  }
  
  protected final void a(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    paramBundle = this.m;
    paramBundle.sendMessage(paramBundle.obtainMessage(7, paramInt2, -1, new l(paramInt1, null)));
  }
  
  protected void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    Handler localHandler = this.m;
    localHandler.sendMessage(localHandler.obtainMessage(1, paramInt2, -1, new k(paramInt1, paramIBinder, paramBundle)));
  }
  
  void a(int paramInt, T paramT) {}
  
  protected void a(T paramT)
  {
    this.e = System.currentTimeMillis();
  }
  
  protected void a(b paramb)
  {
    this.f = paramb.y();
    this.g = System.currentTimeMillis();
  }
  
  public void a(c paramc)
  {
    t.a(paramc, "Connection progress callbacks cannot be null.");
    this.q = ((c)paramc);
    b(2, null);
  }
  
  protected void a(c paramc, int paramInt, PendingIntent paramPendingIntent)
  {
    t.a(paramc, "Connection progress callbacks cannot be null.");
    this.q = ((c)paramc);
    paramc = this.m;
    paramc.sendMessage(paramc.obtainMessage(3, this.C.get(), paramInt, paramPendingIntent));
  }
  
  public void a(e parame)
  {
    parame.a();
  }
  
  public void a(m arg1, Set<Scope> paramSet)
  {
    Object localObject = s();
    g localg = new g(this.x);
    localg.d = this.i.getPackageName();
    localg.g = ((Bundle)localObject);
    if (paramSet != null) {
      localg.f = ((Scope[])paramSet.toArray(new Scope[paramSet.size()]));
    }
    if (j())
    {
      if (p() != null) {
        paramSet = p();
      } else {
        paramSet = new Account("<<default account>>", "com.google");
      }
      localg.h = paramSet;
      if (??? != null) {
        localg.e = ???.asBinder();
      }
    }
    else if (z())
    {
      localg.h = p();
    }
    localg.i = a;
    localg.j = q();
    try
    {
      try
      {
        synchronized (this.o)
        {
          if (this.p != null)
          {
            localObject = this.p;
            paramSet = new com/google/android/gms/common/internal/c$i;
            paramSet.<init>(this, this.C.get());
            ((q)localObject).a(paramSet, localg);
          }
          else
          {
            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
          }
          return;
        }
        Log.w("GmsClient", "IGmsServiceBroker.getService failed", ???);
      }
      catch (RuntimeException ???) {}catch (RemoteException ???) {}
      a(8, null, null, this.C.get());
      return;
    }
    catch (SecurityException ???)
    {
      throw ???;
    }
    catch (DeadObjectException ???)
    {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", ???);
      b(1);
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] arg4)
  {
    synchronized (this.n)
    {
      int i1 = this.u;
      paramFileDescriptor = this.r;
      synchronized (this.o)
      {
        Object localObject1 = this.p;
        paramPrintWriter.append(paramString).append("mConnectState=");
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3)
            {
              if (i1 != 4)
              {
                if (i1 != 5) {
                  paramPrintWriter.print("UNKNOWN");
                } else {
                  paramPrintWriter.print("DISCONNECTING");
                }
              }
              else {
                paramPrintWriter.print("CONNECTED");
              }
            }
            else {
              paramPrintWriter.print("LOCAL_CONNECTING");
            }
          }
          else {
            paramPrintWriter.print("REMOTE_CONNECTING");
          }
        }
        else {
          paramPrintWriter.print("DISCONNECTED");
        }
        paramPrintWriter.append(" mService=");
        if (paramFileDescriptor == null) {
          paramPrintWriter.append("null");
        } else {
          paramPrintWriter.append(w()).append("@").append(Integer.toHexString(System.identityHashCode(paramFileDescriptor.asBinder())));
        }
        paramPrintWriter.append(" mServiceBroker=");
        if (localObject1 == null) {
          paramPrintWriter.println("null");
        } else {
          paramPrintWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((IInterface)localObject1).asBinder())));
        }
        paramFileDescriptor = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        long l1;
        Object localObject2;
        if (this.e > 0L)
        {
          localObject1 = paramPrintWriter.append(paramString).append("lastConnectedTime=");
          l1 = this.e;
          ??? = paramFileDescriptor.format(new Date(l1));
          localObject2 = new StringBuilder(String.valueOf(???).length() + 21);
          ((StringBuilder)localObject2).append(l1);
          ((StringBuilder)localObject2).append(" ");
          ((StringBuilder)localObject2).append(???);
          ((PrintWriter)localObject1).println(((StringBuilder)localObject2).toString());
        }
        if (this.d > 0L)
        {
          paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          i1 = this.c;
          if (i1 != 1)
          {
            if (i1 != 2) {
              paramPrintWriter.append(String.valueOf(i1));
            } else {
              paramPrintWriter.append("CAUSE_NETWORK_LOST");
            }
          }
          else {
            paramPrintWriter.append("CAUSE_SERVICE_DISCONNECTED");
          }
          localObject2 = paramPrintWriter.append(" lastSuspendedTime=");
          l1 = this.d;
          localObject1 = paramFileDescriptor.format(new Date(l1));
          ??? = new StringBuilder(String.valueOf(localObject1).length() + 21);
          ???.append(l1);
          ???.append(" ");
          ???.append((String)localObject1);
          ((PrintWriter)localObject2).println(???.toString());
        }
        if (this.g > 0L)
        {
          paramPrintWriter.append(paramString).append("lastFailedStatus=").append(com.google.android.gms.common.api.d.a(this.f));
          paramString = paramPrintWriter.append(" lastFailedTime=");
          l1 = this.g;
          paramPrintWriter = paramFileDescriptor.format(new Date(l1));
          paramFileDescriptor = new StringBuilder(String.valueOf(paramPrintWriter).length() + 21);
          paramFileDescriptor.append(l1);
          paramFileDescriptor.append(" ");
          paramFileDescriptor.append(paramPrintWriter);
          paramString.println(paramFileDescriptor.toString());
        }
        return;
      }
    }
  }
  
  public void b(int paramInt)
  {
    Handler localHandler = this.m;
    localHandler.sendMessage(localHandler.obtainMessage(6, this.C.get(), paramInt));
  }
  
  public boolean b()
  {
    return false;
  }
  
  public boolean c()
  {
    synchronized (this.n)
    {
      boolean bool;
      if ((this.u != 2) && (this.u != 3)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
  
  public String d()
  {
    if (isConnected())
    {
      N localN = this.h;
      if (localN != null) {
        return localN.a();
      }
    }
    throw new RuntimeException("Failed to connect when checking package");
  }
  
  public boolean f()
  {
    return true;
  }
  
  public int g()
  {
    return f.a;
  }
  
  public final com.google.android.gms.common.d[] h()
  {
    H localH = this.B;
    if (localH == null) {
      return null;
    }
    return localH.b;
  }
  
  public Intent i()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }
  
  public boolean isConnected()
  {
    synchronized (this.n)
    {
      boolean bool;
      if (this.u == 4) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public boolean j()
  {
    return false;
  }
  
  public IBinder k()
  {
    synchronized (this.o)
    {
      if (this.p == null) {
        return null;
      }
      IBinder localIBinder = this.p.asBinder();
      return localIBinder;
    }
  }
  
  public Bundle l()
  {
    return null;
  }
  
  public void m()
  {
    int i1 = this.l.a(this.i, g());
    if (i1 != 0)
    {
      b(1, null);
      a(new d(), i1, null);
      return;
    }
    a(new d());
  }
  
  protected final void n()
  {
    if (isConnected()) {
      return;
    }
    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }
  
  protected boolean o()
  {
    return false;
  }
  
  public Account p()
  {
    return null;
  }
  
  public com.google.android.gms.common.d[] q()
  {
    return a;
  }
  
  public final Context r()
  {
    return this.i;
  }
  
  protected Bundle s()
  {
    return new Bundle();
  }
  
  protected String t()
  {
    return null;
  }
  
  protected Set<Scope> u()
  {
    return Collections.EMPTY_SET;
  }
  
  public final T v()
    throws DeadObjectException
  {
    synchronized (this.n)
    {
      if (this.u != 5)
      {
        n();
        boolean bool;
        if (this.r != null) {
          bool = true;
        } else {
          bool = false;
        }
        t.b(bool, "Client is connected but service is null");
        localObject2 = this.r;
        return (T)localObject2;
      }
      Object localObject2 = new android/os/DeadObjectException;
      ((DeadObjectException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
  }
  
  protected abstract String w();
  
  protected abstract String x();
  
  protected String y()
  {
    return "com.google.android.gms";
  }
  
  public boolean z()
  {
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void onConnected(Bundle paramBundle);
    
    public abstract void onConnectionSuspended(int paramInt);
  }
  
  public static abstract interface b
  {
    public abstract void onConnectionFailed(b paramb);
  }
  
  public static abstract interface c
  {
    public abstract void a(b paramb);
  }
  
  protected class d
    implements c.c
  {
    public d() {}
    
    public void a(b paramb)
    {
      if (paramb.C())
      {
        paramb = c.this;
        paramb.a(null, paramb.u());
        return;
      }
      if (c.g(c.this) != null) {
        c.g(c.this).onConnectionFailed(paramb);
      }
    }
  }
  
  public static abstract interface e
  {
    public abstract void a();
  }
  
  private abstract class f
    extends c.h<Boolean>
  {
    private final int d;
    private final Bundle e;
    
    protected f(int paramInt, Bundle paramBundle)
    {
      super(Boolean.valueOf(true));
      this.d = paramInt;
      this.e = paramBundle;
    }
    
    protected abstract void a(b paramb);
    
    protected final void c() {}
    
    protected abstract boolean e();
  }
  
  final class g
    extends av
  {
    public g(Looper paramLooper)
    {
      super();
    }
    
    private static void a(Message paramMessage)
    {
      paramMessage = (c.h)paramMessage.obj;
      paramMessage.c();
      paramMessage.b();
    }
    
    private static boolean b(Message paramMessage)
    {
      int i = paramMessage.what;
      return (i == 2) || (i == 1) || (i == 7);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      if (c.this.C.get() != paramMessage.arg1)
      {
        if (b(paramMessage)) {
          a(paramMessage);
        }
        return;
      }
      int i = paramMessage.what;
      if (((i == 1) || (i == 7) || ((i == 4) && (!c.this.o())) || (paramMessage.what == 5)) && (!c.this.c()))
      {
        a(paramMessage);
        return;
      }
      i = paramMessage.what;
      PendingIntent localPendingIntent = null;
      if (i == 4)
      {
        c.a(c.this, new b(paramMessage.arg2));
        if ((c.b(c.this)) && (!c.c(c.this)))
        {
          c.a(c.this, 3, null);
          return;
        }
        if (c.d(c.this) != null) {
          paramMessage = c.d(c.this);
        } else {
          paramMessage = new b(8);
        }
        c.this.q.a(paramMessage);
        c.this.a(paramMessage);
        return;
      }
      if (i == 5)
      {
        if (c.d(c.this) != null) {
          paramMessage = c.d(c.this);
        } else {
          paramMessage = new b(8);
        }
        c.this.q.a(paramMessage);
        c.this.a(paramMessage);
        return;
      }
      if (i == 3)
      {
        Object localObject = paramMessage.obj;
        if ((localObject instanceof PendingIntent)) {
          localPendingIntent = (PendingIntent)localObject;
        }
        paramMessage = new b(paramMessage.arg2, localPendingIntent);
        c.this.q.a(paramMessage);
        c.this.a(paramMessage);
        return;
      }
      if (i == 6)
      {
        c.a(c.this, 5, null);
        if (c.e(c.this) != null) {
          c.e(c.this).onConnectionSuspended(paramMessage.arg2);
        }
        c.this.a(paramMessage.arg2);
        c.a(c.this, 5, 1, null);
        return;
      }
      if ((i == 2) && (!c.this.isConnected()))
      {
        a(paramMessage);
        return;
      }
      if (b(paramMessage))
      {
        ((c.h)paramMessage.obj).d();
        return;
      }
      i = paramMessage.what;
      paramMessage = new StringBuilder(45);
      paramMessage.append("Don't know how to handle message: ");
      paramMessage.append(i);
      Log.wtf("GmsClient", paramMessage.toString(), new Exception());
    }
  }
  
  protected abstract class h<TListener>
  {
    private TListener a;
    private boolean b;
    
    public h()
    {
      Object localObject;
      this.a = localObject;
      this.b = false;
    }
    
    public final void a()
    {
      try
      {
        this.a = null;
        return;
      }
      finally {}
    }
    
    protected abstract void a(TListener paramTListener);
    
    public final void b()
    {
      a();
      synchronized (c.f(c.this))
      {
        c.f(c.this).remove(this);
        return;
      }
    }
    
    protected abstract void c();
    
    /* Error */
    public final void d()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 24	com/google/android/gms/common/internal/c$h:a	Ljava/lang/Object;
      //   6: astore_1
      //   7: aload_0
      //   8: getfield 26	com/google/android/gms/common/internal/c$h:b	Z
      //   11: ifeq +64 -> 75
      //   14: aload_0
      //   15: invokestatic 51	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   18: astore_2
      //   19: aload_2
      //   20: invokestatic 51	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   23: invokevirtual 55	java/lang/String:length	()I
      //   26: istore_3
      //   27: new 57	java/lang/StringBuilder
      //   30: astore 4
      //   32: aload 4
      //   34: iload_3
      //   35: bipush 47
      //   37: iadd
      //   38: invokespecial 60	java/lang/StringBuilder:<init>	(I)V
      //   41: aload 4
      //   43: ldc 62
      //   45: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   48: pop
      //   49: aload 4
      //   51: aload_2
      //   52: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   55: pop
      //   56: aload 4
      //   58: ldc 68
      //   60: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   63: pop
      //   64: ldc 70
      //   66: aload 4
      //   68: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   71: invokestatic 80	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   74: pop
      //   75: aload_0
      //   76: monitorexit
      //   77: aload_1
      //   78: ifnull +20 -> 98
      //   81: aload_0
      //   82: aload_1
      //   83: invokevirtual 82	com/google/android/gms/common/internal/c$h:a	(Ljava/lang/Object;)V
      //   86: goto +16 -> 102
      //   89: astore 4
      //   91: aload_0
      //   92: invokevirtual 84	com/google/android/gms/common/internal/c$h:c	()V
      //   95: aload 4
      //   97: athrow
      //   98: aload_0
      //   99: invokevirtual 84	com/google/android/gms/common/internal/c$h:c	()V
      //   102: aload_0
      //   103: monitorenter
      //   104: aload_0
      //   105: iconst_1
      //   106: putfield 26	com/google/android/gms/common/internal/c$h:b	Z
      //   109: aload_0
      //   110: monitorexit
      //   111: aload_0
      //   112: invokevirtual 86	com/google/android/gms/common/internal/c$h:b	()V
      //   115: return
      //   116: astore 4
      //   118: aload_0
      //   119: monitorexit
      //   120: aload 4
      //   122: athrow
      //   123: astore 4
      //   125: aload_0
      //   126: monitorexit
      //   127: aload 4
      //   129: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	130	0	this	h
      //   6	77	1	localObject1	Object
      //   18	34	2	str	String
      //   26	12	3	i	int
      //   30	37	4	localStringBuilder	StringBuilder
      //   89	7	4	localRuntimeException	RuntimeException
      //   116	5	4	localObject2	Object
      //   123	5	4	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   81	86	89	java/lang/RuntimeException
      //   104	111	116	finally
      //   118	120	116	finally
      //   2	75	123	finally
      //   75	77	123	finally
      //   125	127	123	finally
    }
  }
  
  public static final class i
    extends o.a
  {
    private c a;
    private final int b;
    
    public i(c paramc, int paramInt)
    {
      this.a = paramc;
      this.b = paramInt;
    }
    
    public final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      t.a(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
      this.a.a(paramInt, paramIBinder, paramBundle, this.b);
      this.a = null;
    }
    
    public final void a(int paramInt, IBinder paramIBinder, H paramH)
    {
      t.a(this.a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
      t.a(paramH);
      c.a(this.a, paramH);
      a(paramInt, paramIBinder, paramH.a);
    }
    
    public final void b(int paramInt, Bundle paramBundle)
    {
      Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
  }
  
  public final class j
    implements ServiceConnection
  {
    private final int a;
    
    public j(int paramInt)
    {
      this.a = paramInt;
    }
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      if (paramIBinder == null)
      {
        c.a(c.this, 16);
        return;
      }
      synchronized (c.a(c.this))
      {
        c localc = c.this;
        if (paramIBinder == null)
        {
          paramComponentName = null;
        }
        else
        {
          paramComponentName = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
          if ((paramComponentName != null) && ((paramComponentName instanceof q))) {
            paramComponentName = (q)paramComponentName;
          } else {
            paramComponentName = new p(paramIBinder);
          }
        }
        c.a(localc, paramComponentName);
        c.this.a(0, null, this.a);
        return;
      }
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      synchronized (c.a(c.this))
      {
        c.a(c.this, null);
        paramComponentName = c.this.m;
        paramComponentName.sendMessage(paramComponentName.obtainMessage(6, this.a, 1));
        return;
      }
    }
  }
  
  protected final class k
    extends c.f
  {
    private final IBinder g;
    
    public k(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      super(paramInt, paramBundle);
      this.g = paramIBinder;
    }
    
    protected final void a(b paramb)
    {
      if (c.g(c.this) != null) {
        c.g(c.this).onConnectionFailed(paramb);
      }
      c.this.a(paramb);
    }
    
    protected final boolean e()
    {
      try
      {
        String str1 = this.g.getInterfaceDescriptor();
        if (!c.this.w().equals(str1))
        {
          String str2 = c.this.w();
          localObject = new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(str1).length());
          ((StringBuilder)localObject).append("service descriptor mismatch: ");
          ((StringBuilder)localObject).append(str2);
          ((StringBuilder)localObject).append(" vs. ");
          ((StringBuilder)localObject).append(str1);
          Log.e("GmsClient", ((StringBuilder)localObject).toString());
          return false;
        }
        Object localObject = c.this.a(this.g);
        if ((localObject != null) && ((c.a(c.this, 2, 4, (IInterface)localObject)) || (c.a(c.this, 3, 4, (IInterface)localObject))))
        {
          c.a(c.this, null);
          localObject = c.this.l();
          if (c.e(c.this) != null) {
            c.e(c.this).onConnected((Bundle)localObject);
          }
          return true;
        }
        return false;
      }
      catch (RemoteException localRemoteException)
      {
        Log.w("GmsClient", "service probably died");
      }
      return false;
    }
  }
  
  protected final class l
    extends c.f
  {
    public l(int paramInt, Bundle paramBundle)
    {
      super(paramInt, null);
    }
    
    protected final void a(b paramb)
    {
      if ((c.this.o()) && (c.b(c.this)))
      {
        c.a(c.this, 16);
        return;
      }
      c.this.q.a(paramb);
      c.this.a(paramb);
    }
    
    protected final boolean e()
    {
      c.this.q.a(b.a);
      return true;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */