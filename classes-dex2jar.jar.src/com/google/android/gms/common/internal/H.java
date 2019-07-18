package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.f.b;
import com.google.android.gms.common.api.f.c;
import com.google.android.gms.common.e;
import java.util.Iterator;
import java.util.Set;

public abstract class h<T extends IInterface>
  extends c<T>
  implements a.f, i.a
{
  private final d D;
  private final Set<Scope> E;
  private final Account F;
  
  protected h(Context paramContext, Looper paramLooper, int paramInt, d paramd, f.b paramb, f.c paramc)
  {
    this(paramContext, paramLooper, localj, locale, paramInt, paramd, paramb, (f.c)paramc);
  }
  
  protected h(Context paramContext, Looper paramLooper, j paramj, e parame, int paramInt, d paramd, f.b paramb, f.c paramc)
  {
    super(paramContext, paramLooper, paramj, parame, paramInt, a(paramb), a(paramc), paramd.g());
    this.D = paramd;
    this.F = paramd.a();
    paramContext = paramd.d();
    b(paramContext);
    this.E = paramContext;
  }
  
  private static c.a a(f.b paramb)
  {
    if (paramb == null) {
      return null;
    }
    return new A(paramb);
  }
  
  private static c.b a(f.c paramc)
  {
    if (paramc == null) {
      return null;
    }
    return new B(paramc);
  }
  
  private final Set<Scope> b(Set<Scope> paramSet)
  {
    a(paramSet);
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext()) {
      if (!paramSet.contains((Scope)localIterator.next())) {
        throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
      }
    }
    return paramSet;
  }
  
  protected final d A()
  {
    return this.D;
  }
  
  protected Set<Scope> a(Set<Scope> paramSet)
  {
    return paramSet;
  }
  
  public int g()
  {
    return super.g();
  }
  
  public final Account p()
  {
    return this.F;
  }
  
  protected final Set<Scope> u()
  {
    return this.E;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */