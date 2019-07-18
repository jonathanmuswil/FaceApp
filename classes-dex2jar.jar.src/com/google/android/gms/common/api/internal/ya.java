package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.l;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class ya
{
  public static final Status a = new Status(8, "The connection to Google Play services was lost");
  private static final BasePendingResult<?>[] b = new BasePendingResult[0];
  final Set<BasePendingResult<?>> c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
  private final Ba d = new za(this);
  private final Map<a.c<?>, a.f> e;
  
  public ya(Map<a.c<?>, a.f> paramMap)
  {
    this.e = paramMap;
  }
  
  public final void a()
  {
    for (BasePendingResult localBasePendingResult : (BasePendingResult[])this.c.toArray(b))
    {
      localBasePendingResult.a(null);
      if (localBasePendingResult.d() == null)
      {
        if (localBasePendingResult.e()) {
          this.c.remove(localBasePendingResult);
        }
      }
      else
      {
        localBasePendingResult.a(null);
        IBinder localIBinder = ((a.f)this.e.get(((c)localBasePendingResult).h())).k();
        if (localBasePendingResult.c())
        {
          localBasePendingResult.a(new Aa(localBasePendingResult, null, localIBinder, null));
        }
        else if ((localIBinder != null) && (localIBinder.isBinderAlive()))
        {
          Aa localAa = new Aa(localBasePendingResult, null, localIBinder, null);
          localBasePendingResult.a(localAa);
          try
          {
            localIBinder.linkToDeath(localAa, 0);
          }
          catch (RemoteException localRemoteException)
          {
            localBasePendingResult.a();
            localBasePendingResult.d().intValue();
            throw new NullPointerException();
          }
        }
        else
        {
          localBasePendingResult.a(null);
          localBasePendingResult.a();
          localBasePendingResult.d().intValue();
          throw new NullPointerException();
        }
        this.c.remove(localBasePendingResult);
      }
    }
  }
  
  final void a(BasePendingResult<? extends l> paramBasePendingResult)
  {
    this.c.add(paramBasePendingResult);
    paramBasePendingResult.a(this.d);
  }
  
  public final void b()
  {
    BasePendingResult[] arrayOfBasePendingResult = (BasePendingResult[])this.c.toArray(b);
    int i = arrayOfBasePendingResult.length;
    for (int j = 0; j < i; j++) {
      arrayOfBasePendingResult[j].b(a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/ya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */