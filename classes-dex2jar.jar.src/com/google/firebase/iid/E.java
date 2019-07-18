package com.google.firebase.iid;

import Bq;
import Cz;
import Gz;
import Jz;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import nP;
import oP;

public final class e
{
  private static e a;
  private final Context b;
  private final ScheduledExecutorService c;
  private g d = new g(this, null);
  private int e = 1;
  
  private e(Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.c = paramScheduledExecutorService;
    this.b = paramContext.getApplicationContext();
  }
  
  private final int a()
  {
    try
    {
      int i = this.e;
      this.e = (i + 1);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static e a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        e locale = new com/google/firebase/iid/e;
        Cz localCz = Gz.a();
        Bq localBq = new Bq;
        localBq.<init>("MessengerIpcClient");
        locale.<init>(paramContext, localCz.a(1, localBq, Jz.a));
        a = locale;
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  private final <T> nP<T> a(n<T> paramn)
  {
    try
    {
      Object localObject;
      if (Log.isLoggable("MessengerIpcClient", 3))
      {
        localObject = String.valueOf(paramn);
        int i = String.valueOf(localObject).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 9);
        localStringBuilder.append("Queueing ");
        localStringBuilder.append((String)localObject);
        Log.d("MessengerIpcClient", localStringBuilder.toString());
      }
      if (!this.d.a(paramn))
      {
        localObject = new com/google/firebase/iid/g;
        ((g)localObject).<init>(this, null);
        this.d = ((g)localObject);
        this.d.a(paramn);
      }
      paramn = paramn.b.a();
      return paramn;
    }
    finally {}
  }
  
  public final nP<Void> a(int paramInt, Bundle paramBundle)
  {
    return a(new m(a(), 2, paramBundle));
  }
  
  public final nP<Bundle> b(int paramInt, Bundle paramBundle)
  {
    return a(new p(a(), 1, paramBundle));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */