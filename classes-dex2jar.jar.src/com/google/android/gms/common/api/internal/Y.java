package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class y
  implements W
{
  private final X a;
  private boolean b = false;
  
  public y(X paramX)
  {
    this.a = paramX;
  }
  
  public final <A extends a.b, T extends c<? extends l, A>> T a(T paramT)
  {
    try
    {
      this.a.n.y.a(paramT);
      Object localObject1 = this.a.n;
      Object localObject2 = paramT.h();
      localObject1 = (a.f)((N)localObject1).p.get(localObject2);
      t.a(localObject1, "Appropriate Api was not requested.");
      if ((!((a.f)localObject1).isConnected()) && (this.a.g.containsKey(paramT.h())))
      {
        localObject2 = new com/google/android/gms/common/api/Status;
        ((Status)localObject2).<init>(17);
        paramT.c((Status)localObject2);
      }
      else
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof w)) {
          localObject2 = ((w)localObject1).B();
        }
        paramT.b((a.b)localObject2);
      }
    }
    catch (DeadObjectException localDeadObjectException)
    {
      this.a.a(new z(this, this));
    }
    return paramT;
  }
  
  public final void a(b paramb, a<?> parama, boolean paramBoolean) {}
  
  public final boolean a()
  {
    if (this.b) {
      return false;
    }
    if (this.a.n.m())
    {
      this.b = true;
      Iterator localIterator = this.a.n.x.iterator();
      while (localIterator.hasNext()) {
        ((va)localIterator.next()).a();
      }
      return false;
    }
    this.a.a(null);
    return true;
  }
  
  public final <A extends a.b, R extends l, T extends c<R, A>> T b(T paramT)
  {
    a(paramT);
    return paramT;
  }
  
  public final void b() {}
  
  final void c()
  {
    if (this.b)
    {
      this.b = false;
      this.a.n.y.a();
      a();
    }
  }
  
  public final void connect()
  {
    if (this.b)
    {
      this.b = false;
      this.a.a(new A(this, this));
    }
  }
  
  public final void onConnected(Bundle paramBundle) {}
  
  public final void onConnectionSuspended(int paramInt)
  {
    this.a.a(null);
    this.a.o.a(paramInt, this.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */