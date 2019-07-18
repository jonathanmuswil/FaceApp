package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.b;
import gd;
import iP;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import nP;

final class r
  implements iP<Map<Ga<?>, String>>
{
  private l a;
  
  r(Sa paramSa, l paraml)
  {
    this.a = paraml;
  }
  
  final void a()
  {
    this.a.a();
  }
  
  public final void a(nP<Map<Ga<?>, String>> paramnP)
  {
    Sa.a(this.b).lock();
    try
    {
      if (!Sa.b(this.b))
      {
        this.a.a();
        return;
      }
      Object localObject1;
      if (paramnP.e())
      {
        localObject1 = this.b;
        paramnP = new gd;
        paramnP.<init>(Sa.m(this.b).size());
        Sa.b((Sa)localObject1, paramnP);
        localObject1 = Sa.m(this.b).values().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramnP = (Ra)((Iterator)localObject1).next();
          Sa.g(this.b).put(paramnP.g(), b.a);
        }
      }
      if ((paramnP.a() instanceof c))
      {
        paramnP = (c)paramnP.a();
        if (Sa.e(this.b))
        {
          Object localObject2 = this.b;
          localObject1 = new gd;
          ((gd)localObject1).<init>(Sa.m(this.b).size());
          Sa.b((Sa)localObject2, (Map)localObject1);
          localObject1 = Sa.m(this.b).values().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            Object localObject3 = (Ra)((Iterator)localObject1).next();
            localObject2 = ((e)localObject3).g();
            Object localObject4 = paramnP.a((e)localObject3);
            if (Sa.a(this.b, (Ra)localObject3, (b)localObject4))
            {
              localObject4 = Sa.g(this.b);
              localObject3 = new com/google/android/gms/common/b;
              ((b)localObject3).<init>(16);
              ((Map)localObject4).put(localObject2, localObject3);
            }
            else
            {
              Sa.g(this.b).put(localObject2, localObject4);
            }
          }
        }
        Sa.b(this.b, paramnP.a());
      }
      else
      {
        Log.e("ConnectionlessGAC", "Unexpected availability exception", paramnP.a());
        Sa.b(this.b, Collections.emptyMap());
      }
      if (this.b.isConnected())
      {
        Sa.d(this.b).putAll(Sa.g(this.b));
        if (Sa.f(this.b) == null)
        {
          Sa.i(this.b);
          Sa.j(this.b);
          Sa.l(this.b).signalAll();
        }
      }
      this.a.a();
      return;
    }
    finally
    {
      Sa.a(this.b).unlock();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */