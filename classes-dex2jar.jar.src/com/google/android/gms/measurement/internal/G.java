package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.t;

final class g
{
  final String a;
  final String b;
  final long c;
  final long d;
  final long e;
  final long f;
  final Long g;
  final Long h;
  final Long i;
  final Boolean j;
  
  g(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, Long paramLong5, Long paramLong6, Long paramLong7, Boolean paramBoolean)
  {
    t.b(paramString1);
    t.b(paramString2);
    boolean bool1 = true;
    boolean bool2;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    t.a(bool2);
    if (paramLong2 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    t.a(bool2);
    if (paramLong4 >= 0L) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    t.a(bool2);
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramLong3;
    this.f = paramLong4;
    this.g = paramLong5;
    this.h = paramLong6;
    this.i = paramLong7;
    this.j = paramBoolean;
  }
  
  final g a(long paramLong)
  {
    return new g(this.a, this.b, this.c, this.d, paramLong, this.f, this.g, this.h, this.i, this.j);
  }
  
  final g a(long paramLong1, long paramLong2)
  {
    return new g(this.a, this.b, this.c, this.d, this.e, paramLong1, Long.valueOf(paramLong2), this.h, this.i, this.j);
  }
  
  final g a(Long paramLong1, Long paramLong2, Boolean paramBoolean)
  {
    if ((paramBoolean != null) && (!paramBoolean.booleanValue())) {
      paramBoolean = null;
    }
    return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, paramLong1, paramLong2, paramBoolean);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */