package com.google.firebase.iid;

import Kz;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.t;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import zq;

final class g
  implements ServiceConnection
{
  int a = 0;
  final Messenger b = new Messenger(new Kz(Looper.getMainLooper(), new h(this)));
  l c;
  final Queue<n<?>> d = new ArrayDeque();
  final SparseArray<n<?>> e = new SparseArray();
  
  private g(e parame) {}
  
  private final void c()
  {
    e.b(this.f).execute(new j(this));
  }
  
  final void a()
  {
    try
    {
      if (this.a == 1) {
        a(1, "Timed out while binding");
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final void a(int paramInt)
  {
    try
    {
      n localn = (n)this.e.get(paramInt);
      if (localn != null)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(31);
        ((StringBuilder)localObject2).append("Timing out request: ");
        ((StringBuilder)localObject2).append(paramInt);
        Log.w("MessengerIpcClient", ((StringBuilder)localObject2).toString());
        this.e.remove(paramInt);
        localObject2 = new com/google/firebase/iid/o;
        ((o)localObject2).<init>(3, "Timed out waiting for response");
        localn.a((o)localObject2);
        b();
      }
      return;
    }
    finally {}
  }
  
  final void a(int paramInt, String paramString)
  {
    try
    {
      Object localObject;
      if (Log.isLoggable("MessengerIpcClient", 3))
      {
        localObject = String.valueOf(paramString);
        if (((String)localObject).length() != 0) {
          localObject = "Disconnected: ".concat((String)localObject);
        } else {
          localObject = new String("Disconnected: ");
        }
        Log.d("MessengerIpcClient", (String)localObject);
      }
      int i = this.a;
      if (i != 0)
      {
        if ((i != 1) && (i != 2))
        {
          if (i != 3)
          {
            if (i == 4) {
              return;
            }
            localObject = new java/lang/IllegalStateException;
            paramInt = this.a;
            paramString = new java/lang/StringBuilder;
            paramString.<init>(26);
            paramString.append("Unknown state: ");
            paramString.append(paramInt);
            ((IllegalStateException)localObject).<init>(paramString.toString());
            throw ((Throwable)localObject);
          }
          this.a = 4;
          return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
          Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.a = 4;
        zq.a().a(e.a(this.f), this);
        localObject = new com/google/firebase/iid/o;
        ((o)localObject).<init>(paramInt, paramString);
        paramString = this.d.iterator();
        while (paramString.hasNext()) {
          ((n)paramString.next()).a((o)localObject);
        }
        this.d.clear();
        for (paramInt = 0; paramInt < this.e.size(); paramInt++) {
          ((n)this.e.valueAt(paramInt)).a((o)localObject);
        }
        this.e.clear();
        return;
      }
      paramString = new java/lang/IllegalStateException;
      paramString.<init>();
      throw paramString;
    }
    finally {}
  }
  
  final boolean a(Message paramMessage)
  {
    int i = paramMessage.arg1;
    Object localObject;
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      localObject = new StringBuilder(41);
      ((StringBuilder)localObject).append("Received response to request: ");
      ((StringBuilder)localObject).append(i);
      Log.d("MessengerIpcClient", ((StringBuilder)localObject).toString());
    }
    try
    {
      localObject = (n)this.e.get(i);
      if (localObject == null)
      {
        paramMessage = new java/lang/StringBuilder;
        paramMessage.<init>(50);
        paramMessage.append("Received response for unknown request: ");
        paramMessage.append(i);
        Log.w("MessengerIpcClient", paramMessage.toString());
        return true;
      }
      this.e.remove(i);
      b();
      paramMessage = paramMessage.getData();
      if (paramMessage.getBoolean("unsupported", false)) {
        ((n)localObject).a(new o(4, "Not supported by GmsCore"));
      } else {
        ((n)localObject).a(paramMessage);
      }
      return true;
    }
    finally {}
  }
  
  final boolean a(n paramn)
  {
    try
    {
      int i = this.a;
      Object localObject;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if ((i != 3) && (i != 4))
            {
              localObject = new java/lang/IllegalStateException;
              i = this.a;
              paramn = new java/lang/StringBuilder;
              paramn.<init>(26);
              paramn.append("Unknown state: ");
              paramn.append(i);
              ((IllegalStateException)localObject).<init>(paramn.toString());
              throw ((Throwable)localObject);
            }
            return false;
          }
          this.d.add(paramn);
          c();
          return true;
        }
        this.d.add(paramn);
        return true;
      }
      this.d.add(paramn);
      boolean bool;
      if (this.a == 0) {
        bool = true;
      } else {
        bool = false;
      }
      t.b(bool);
      if (Log.isLoggable("MessengerIpcClient", 2)) {
        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
      }
      this.a = 1;
      paramn = new android/content/Intent;
      paramn.<init>("com.google.android.c2dm.intent.REGISTER");
      paramn.setPackage("com.google.android.gms");
      if (!zq.a().a(e.a(this.f), paramn, this, 1))
      {
        a(0, "Unable to bind to service");
      }
      else
      {
        localObject = e.b(this.f);
        paramn = new com/google/firebase/iid/i;
        paramn.<init>(this);
        ((ScheduledExecutorService)localObject).schedule(paramn, 30L, TimeUnit.SECONDS);
      }
      return true;
    }
    finally {}
  }
  
  final void b()
  {
    try
    {
      if ((this.a == 2) && (this.d.isEmpty()) && (this.e.size() == 0))
      {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
          Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
        }
        this.a = 3;
        zq.a().a(e.a(this.f), this);
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 107
    //   4: iconst_2
    //   5: invokestatic 135	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   8: ifeq +12 -> 20
    //   11: ldc 107
    //   13: ldc_w 287
    //   16: invokestatic 166	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   19: pop
    //   20: aload_2
    //   21: ifnonnull +14 -> 35
    //   24: aload_0
    //   25: iconst_0
    //   26: ldc_w 289
    //   29: invokevirtual 85	com/google/firebase/iid/g:a	(ILjava/lang/String;)V
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: new 291	com/google/firebase/iid/l
    //   38: astore_1
    //   39: aload_1
    //   40: aload_2
    //   41: invokespecial 294	com/google/firebase/iid/l:<init>	(Landroid/os/IBinder;)V
    //   44: aload_0
    //   45: aload_1
    //   46: putfield 296	com/google/firebase/iid/g:c	Lcom/google/firebase/iid/l;
    //   49: aload_0
    //   50: iconst_2
    //   51: putfield 29	com/google/firebase/iid/g:a	I
    //   54: aload_0
    //   55: invokespecial 238	com/google/firebase/iid/g:c	()V
    //   58: aload_0
    //   59: monitorexit
    //   60: return
    //   61: astore_1
    //   62: aload_0
    //   63: iconst_0
    //   64: aload_1
    //   65: invokevirtual 299	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   68: invokevirtual 85	com/google/firebase/iid/g:a	(ILjava/lang/String;)V
    //   71: aload_0
    //   72: monitorexit
    //   73: return
    //   74: astore_1
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	g
    //   0	79	1	paramComponentName	ComponentName
    //   0	79	2	paramIBinder	android.os.IBinder
    // Exception table:
    //   from	to	target	type
    //   35	49	61	android/os/RemoteException
    //   2	20	74	finally
    //   24	32	74	finally
    //   35	49	74	finally
    //   49	58	74	finally
    //   62	71	74	finally
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    try
    {
      if (Log.isLoggable("MessengerIpcClient", 2)) {
        Log.v("MessengerIpcClient", "Service disconnected");
      }
      a(2, "Service disconnected");
      return;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */