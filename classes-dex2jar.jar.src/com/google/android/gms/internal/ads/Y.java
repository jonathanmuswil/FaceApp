package com.google.android.gms.internal.ads;

import Kp;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.v;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@yh
public final class y
{
  private final Date a;
  private final String b;
  private final int c;
  private final Set<String> d;
  private final Location e;
  private final boolean f;
  private final Bundle g;
  private final Map<Class<? extends v>, v> h;
  private final String i;
  private final String j;
  private final Kp k;
  private final int l;
  private final Set<String> m;
  private final Bundle n;
  private final Set<String> o;
  private final boolean p;
  private final EM q;
  private final int r;
  private final String s;
  
  public y(z paramz)
  {
    this(paramz, null);
  }
  
  public y(z paramz, Kp paramKp)
  {
    this.a = z.a(paramz);
    this.b = z.b(paramz);
    this.c = z.c(paramz);
    this.d = Collections.unmodifiableSet(z.d(paramz));
    this.e = z.e(paramz);
    this.f = z.f(paramz);
    this.g = z.g(paramz);
    this.h = Collections.unmodifiableMap(z.h(paramz));
    this.i = z.i(paramz);
    this.j = z.j(paramz);
    this.k = paramKp;
    this.l = z.k(paramz);
    this.m = Collections.unmodifiableSet(z.l(paramz));
    this.n = z.m(paramz);
    this.o = Collections.unmodifiableSet(z.n(paramz));
    this.p = z.o(paramz);
    this.q = null;
    this.r = z.p(paramz);
    this.s = z.q(paramz);
  }
  
  public final Bundle a(Class<? extends j> paramClass)
  {
    return this.g.getBundle(paramClass.getName());
  }
  
  @Deprecated
  public final Date a()
  {
    return this.a;
  }
  
  public final boolean a(Context paramContext)
  {
    Set localSet = this.m;
    Kea.a();
    return localSet.contains(Hl.a(paramContext));
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final Bundle c()
  {
    return this.n;
  }
  
  @Deprecated
  public final int d()
  {
    return this.c;
  }
  
  public final Set<String> e()
  {
    return this.d;
  }
  
  public final Location f()
  {
    return this.e;
  }
  
  public final boolean g()
  {
    return this.f;
  }
  
  public final String h()
  {
    return this.s;
  }
  
  public final String i()
  {
    return this.i;
  }
  
  @Deprecated
  public final boolean j()
  {
    return this.p;
  }
  
  public final String k()
  {
    return this.j;
  }
  
  public final Kp l()
  {
    return this.k;
  }
  
  public final Map<Class<? extends v>, v> m()
  {
    return this.h;
  }
  
  public final Bundle n()
  {
    return this.g;
  }
  
  public final int o()
  {
    return this.l;
  }
  
  public final Set<String> p()
  {
    return this.o;
  }
  
  public final int q()
  {
    return this.r;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */