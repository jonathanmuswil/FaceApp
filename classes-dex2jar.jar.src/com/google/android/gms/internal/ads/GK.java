package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@yh
public final class gk
  implements Bca
{
  private final Object a = new Object();
  private final ok b;
  private final fk c;
  private final dk d;
  private final HashSet<Wj> e = new HashSet();
  private final HashSet<Object> f = new HashSet();
  
  public gk(String paramString, ok paramok)
  {
    this.d = new dk(paramString, paramok);
    this.b = paramok;
    this.c = new fk();
  }
  
  public final Bundle a(Context paramContext, ek paramek)
  {
    HashSet localHashSet = new HashSet();
    synchronized (this.a)
    {
      localHashSet.addAll(this.e);
      this.e.clear();
      ??? = new Bundle();
      ((Bundle)???).putBundle("app", this.d.a(paramContext, this.c.b()));
      Object localObject2 = new Bundle();
      paramContext = this.f.iterator();
      if (!paramContext.hasNext())
      {
        ((Bundle)???).putBundle("slots", (Bundle)localObject2);
        localObject2 = new ArrayList();
        paramContext = localHashSet.iterator();
        while (paramContext.hasNext()) {
          ((ArrayList)localObject2).add(((Wj)paramContext.next()).a());
        }
        ((Bundle)???).putParcelableArrayList("ads", (ArrayList)localObject2);
        paramek.a(localHashSet);
        return (Bundle)???;
      }
      paramContext.next();
      throw new NoSuchMethodError();
    }
  }
  
  public final Wj a(e parame, String paramString)
  {
    return new Wj(parame, this, this.c.a(), paramString);
  }
  
  public final void a()
  {
    synchronized (this.a)
    {
      this.d.a();
      return;
    }
  }
  
  public final void a(Wj paramWj)
  {
    synchronized (this.a)
    {
      this.e.add(paramWj);
      return;
    }
  }
  
  public final void a(sea paramsea, long paramLong)
  {
    synchronized (this.a)
    {
      this.d.a(paramsea, paramLong);
      return;
    }
  }
  
  public final void a(HashSet<Wj> paramHashSet)
  {
    synchronized (this.a)
    {
      this.e.addAll(paramHashSet);
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    long l1 = k.j().a();
    if (paramBoolean)
    {
      long l2 = this.b.g();
      ga localga = ra.eb;
      if (l1 - l2 > ((Long)Kea.e().a(localga)).longValue())
      {
        this.d.d = -1;
        return;
      }
      this.d.d = this.b.e();
      return;
    }
    this.b.a(l1);
    this.b.b(this.d.d);
  }
  
  public final void b()
  {
    synchronized (this.a)
    {
      this.d.b();
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */