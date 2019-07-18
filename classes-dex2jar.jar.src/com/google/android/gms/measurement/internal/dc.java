package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.t;

final class dc
{
  private long A;
  private String B;
  private boolean C;
  private long D;
  private long E;
  private final aa a;
  private final String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private long g;
  private long h;
  private long i;
  private String j;
  private long k;
  private String l;
  private long m;
  private long n;
  private boolean o;
  private long p;
  private boolean q;
  private boolean r;
  private String s;
  private Boolean t;
  private long u;
  private long v;
  private long w;
  private long x;
  private long y;
  private long z;
  
  dc(aa paramaa, String paramString)
  {
    t.a(paramaa);
    t.b(paramString);
    this.a = paramaa;
    this.b = paramString;
    this.a.n().j();
  }
  
  public final String A()
  {
    this.a.n().j();
    return this.B;
  }
  
  public final String B()
  {
    this.a.n().j();
    String str = this.B;
    h(null);
    return str;
  }
  
  public final long C()
  {
    this.a.n().j();
    return this.p;
  }
  
  public final boolean D()
  {
    this.a.n().j();
    return this.q;
  }
  
  public final boolean E()
  {
    this.a.n().j();
    return this.r;
  }
  
  public final Boolean F()
  {
    this.a.n().j();
    return this.t;
  }
  
  public final String a()
  {
    this.a.n().j();
    return this.c;
  }
  
  public final void a(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.h != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.h = paramLong;
  }
  
  public final void a(Boolean paramBoolean)
  {
    this.a.n().j();
    this.C = (hc.a(this.t, paramBoolean) ^ true);
    this.t = paramBoolean;
  }
  
  public final void a(String paramString)
  {
    this.a.n().j();
    this.C |= hc.d(this.c, paramString) ^ true;
    this.c = paramString;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.o != paramBoolean) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.o = paramBoolean;
  }
  
  public final String b()
  {
    this.a.n().j();
    return this.f;
  }
  
  public final void b(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.i != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.i = paramLong;
  }
  
  public final void b(String paramString)
  {
    this.a.n().j();
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = null;
    }
    this.C |= hc.d(this.d, str) ^ true;
    this.d = str;
  }
  
  public final void b(boolean paramBoolean)
  {
    this.a.n().j();
    boolean bool;
    if (this.q != paramBoolean) {
      bool = true;
    } else {
      bool = false;
    }
    this.C = bool;
    this.q = paramBoolean;
  }
  
  public final String c()
  {
    this.a.n().j();
    return this.d;
  }
  
  public final void c(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.k != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.k = paramLong;
  }
  
  public final void c(String paramString)
  {
    this.a.n().j();
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = null;
    }
    this.C |= hc.d(this.s, str) ^ true;
    this.s = str;
  }
  
  public final void c(boolean paramBoolean)
  {
    this.a.n().j();
    boolean bool;
    if (this.r != paramBoolean) {
      bool = true;
    } else {
      bool = false;
    }
    this.C = bool;
    this.r = paramBoolean;
  }
  
  public final void d(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.m != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.m = paramLong;
  }
  
  public final void d(String paramString)
  {
    this.a.n().j();
    this.C |= hc.d(this.e, paramString) ^ true;
    this.e = paramString;
  }
  
  public final boolean d()
  {
    this.a.n().j();
    return this.o;
  }
  
  public final void e()
  {
    this.a.n().j();
    this.C = false;
  }
  
  public final void e(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.n != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.n = paramLong;
  }
  
  public final void e(String paramString)
  {
    this.a.n().j();
    this.C |= hc.d(this.f, paramString) ^ true;
    this.f = paramString;
  }
  
  public final String f()
  {
    this.a.n().j();
    return this.b;
  }
  
  public final void f(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.u != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.u = paramLong;
  }
  
  public final void f(String paramString)
  {
    this.a.n().j();
    this.C |= hc.d(this.j, paramString) ^ true;
    this.j = paramString;
  }
  
  public final String g()
  {
    this.a.n().j();
    return this.s;
  }
  
  public final void g(long paramLong)
  {
    boolean bool1 = true;
    if (paramLong >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    t.a(bool2);
    this.a.n().j();
    boolean bool2 = this.C;
    if (this.g == paramLong) {
      bool1 = false;
    }
    this.C = (bool1 | bool2);
    this.g = paramLong;
  }
  
  public final void g(String paramString)
  {
    this.a.n().j();
    this.C |= hc.d(this.l, paramString) ^ true;
    this.l = paramString;
  }
  
  public final String h()
  {
    this.a.n().j();
    return this.e;
  }
  
  public final void h(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.D != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.D = paramLong;
  }
  
  public final void h(String paramString)
  {
    this.a.n().j();
    this.C |= hc.d(this.B, paramString) ^ true;
    this.B = paramString;
  }
  
  public final long i()
  {
    this.a.n().j();
    return this.h;
  }
  
  public final void i(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.E != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.E = paramLong;
  }
  
  public final long j()
  {
    this.a.n().j();
    return this.i;
  }
  
  public final void j(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.v != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.v = paramLong;
  }
  
  public final String k()
  {
    this.a.n().j();
    return this.j;
  }
  
  public final void k(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.w != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.w = paramLong;
  }
  
  public final long l()
  {
    this.a.n().j();
    return this.k;
  }
  
  public final void l(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.x != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.x = paramLong;
  }
  
  public final String m()
  {
    this.a.n().j();
    return this.l;
  }
  
  public final void m(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.y != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.y = paramLong;
  }
  
  public final long n()
  {
    this.a.n().j();
    return this.m;
  }
  
  public final void n(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.A != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.A = paramLong;
  }
  
  public final long o()
  {
    this.a.n().j();
    return this.n;
  }
  
  public final void o(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.z != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.z = paramLong;
  }
  
  public final long p()
  {
    this.a.n().j();
    return this.u;
  }
  
  public final void p(long paramLong)
  {
    this.a.n().j();
    boolean bool1 = this.C;
    boolean bool2;
    if (this.p != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.C = (bool1 | bool2);
    this.p = paramLong;
  }
  
  public final long q()
  {
    this.a.n().j();
    return this.g;
  }
  
  public final long r()
  {
    this.a.n().j();
    return this.D;
  }
  
  public final long s()
  {
    this.a.n().j();
    return this.E;
  }
  
  public final void t()
  {
    this.a.n().j();
    long l1 = this.g + 1L;
    long l2 = l1;
    if (l1 > 2147483647L)
    {
      this.a.c().v().a("Bundle index overflow. appId", v.a(this.b));
      l2 = 0L;
    }
    this.C = true;
    this.g = l2;
  }
  
  public final long u()
  {
    this.a.n().j();
    return this.v;
  }
  
  public final long v()
  {
    this.a.n().j();
    return this.w;
  }
  
  public final long w()
  {
    this.a.n().j();
    return this.x;
  }
  
  public final long x()
  {
    this.a.n().j();
    return this.y;
  }
  
  public final long y()
  {
    this.a.n().j();
    return this.A;
  }
  
  public final long z()
  {
    this.a.n().j();
    return this.z;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */