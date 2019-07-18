package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.f.b;
import com.google.android.gms.common.api.f.c;
import com.google.android.gms.common.b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import zr;

public final class i
  implements Handler.Callback
{
  private final a a;
  private final ArrayList<f.b> b = new ArrayList();
  private final ArrayList<f.b> c = new ArrayList();
  private final ArrayList<f.c> d = new ArrayList();
  private volatile boolean e = false;
  private final AtomicInteger f = new AtomicInteger(0);
  private boolean g = false;
  private final Handler h;
  private final Object i = new Object();
  
  public i(Looper paramLooper, a parama)
  {
    this.a = parama;
    this.h = new zr(paramLooper, this);
  }
  
  public final void a()
  {
    this.e = false;
    this.f.incrementAndGet();
  }
  
  public final void a(int paramInt)
  {
    boolean bool;
    if (Looper.myLooper() == this.h.getLooper()) {
      bool = true;
    } else {
      bool = false;
    }
    t.b(bool, "onUnintentionalDisconnection must only be called on the Handler thread");
    this.h.removeMessages(1);
    synchronized (this.i)
    {
      this.g = true;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(this.b);
      int j = this.f.get();
      int k = localArrayList.size();
      int m = 0;
      while (m < k)
      {
        Object localObject3 = localArrayList.get(m);
        int n = m + 1;
        localObject3 = (f.b)localObject3;
        if ((!this.e) || (this.f.get() != j)) {
          break;
        }
        m = n;
        if (this.b.contains(localObject3))
        {
          ((f.b)localObject3).onConnectionSuspended(paramInt);
          m = n;
        }
      }
      this.c.clear();
      this.g = false;
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    Object localObject1 = Looper.myLooper();
    ??? = this.h.getLooper();
    boolean bool1 = true;
    boolean bool2;
    if (localObject1 == ???) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    t.b(bool2, "onConnectionSuccess must only be called on the Handler thread");
    synchronized (this.i)
    {
      if (!this.g) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      t.b(bool2);
      this.h.removeMessages(1);
      this.g = true;
      if (this.c.size() == 0) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      t.b(bool2);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(this.b);
      int j = this.f.get();
      int k = ((ArrayList)localObject1).size();
      int m = 0;
      while (m < k)
      {
        Object localObject3 = ((ArrayList)localObject1).get(m);
        int n = m + 1;
        localObject3 = (f.b)localObject3;
        if ((!this.e) || (!this.a.isConnected()) || (this.f.get() != j)) {
          break;
        }
        m = n;
        if (!this.c.contains(localObject3))
        {
          ((f.b)localObject3).onConnected(paramBundle);
          m = n;
        }
      }
      this.c.clear();
      this.g = false;
      return;
    }
  }
  
  public final void a(f.b paramb)
  {
    t.a(paramb);
    synchronized (this.i)
    {
      if (this.b.contains(paramb))
      {
        String str = String.valueOf(paramb);
        int j = String.valueOf(str).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(j + 62);
        localStringBuilder.append("registerConnectionCallbacks(): listener ");
        localStringBuilder.append(str);
        localStringBuilder.append(" is already registered");
        Log.w("GmsClientEvents", localStringBuilder.toString());
      }
      else
      {
        this.b.add(paramb);
      }
      if (this.a.isConnected())
      {
        ??? = this.h;
        ((Handler)???).sendMessage(((Handler)???).obtainMessage(1, paramb));
      }
      return;
    }
  }
  
  public final void a(f.c paramc)
  {
    t.a(paramc);
    synchronized (this.i)
    {
      if (this.d.contains(paramc))
      {
        paramc = String.valueOf(paramc);
        int j = String.valueOf(paramc).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(j + 67);
        localStringBuilder.append("registerConnectionFailedListener(): listener ");
        localStringBuilder.append(paramc);
        localStringBuilder.append(" is already registered");
        Log.w("GmsClientEvents", localStringBuilder.toString());
      }
      else
      {
        this.d.add(paramc);
      }
      return;
    }
  }
  
  public final void a(b paramb)
  {
    Object localObject1 = Looper.myLooper();
    ??? = this.h.getLooper();
    int j = 0;
    boolean bool;
    if (localObject1 == ???) {
      bool = true;
    } else {
      bool = false;
    }
    t.b(bool, "onConnectionFailure must only be called on the Handler thread");
    this.h.removeMessages(1);
    synchronized (this.i)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(this.d);
      int k = this.f.get();
      int m = ((ArrayList)localObject1).size();
      while (j < m)
      {
        Object localObject3 = ((ArrayList)localObject1).get(j);
        int n = j + 1;
        localObject3 = (f.c)localObject3;
        if ((this.e) && (this.f.get() == k))
        {
          j = n;
          if (this.d.contains(localObject3))
          {
            ((f.c)localObject3).onConnectionFailed(paramb);
            j = n;
          }
        }
        else
        {
          return;
        }
      }
      return;
    }
  }
  
  public final void b()
  {
    this.e = true;
  }
  
  public final boolean handleMessage(Message arg1)
  {
    int j = ???.what;
    if (j == 1)
    {
      f.b localb = (f.b)???.obj;
      synchronized (this.i)
      {
        if ((this.e) && (this.a.isConnected()) && (this.b.contains(localb))) {
          localb.onConnected(this.a.l());
        }
        return true;
      }
    }
    ??? = new StringBuilder(45);
    ???.append("Don't know how to handle message: ");
    ???.append(j);
    Log.wtf("GmsClientEvents", ???.toString(), new Exception());
    return false;
  }
  
  public static abstract interface a
  {
    public abstract boolean isConnected();
    
    public abstract Bundle l();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */