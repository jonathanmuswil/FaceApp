package com.google.android.gms.internal.ads;

@yh
public final class gq
{
  private final int a;
  public final int b;
  public final int c;
  
  private gq(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.c = paramInt2;
    this.b = paramInt3;
  }
  
  public static gq a(int paramInt1, int paramInt2)
  {
    return new gq(1, paramInt1, paramInt2);
  }
  
  public static gq a(xea paramxea)
  {
    if (paramxea.d) {
      return new gq(3, 0, 0);
    }
    if (paramxea.i) {
      return new gq(2, 0, 0);
    }
    if (paramxea.h) {
      return b();
    }
    return a(paramxea.f, paramxea.c);
  }
  
  public static gq b()
  {
    return new gq(0, 0, 0);
  }
  
  public static gq c()
  {
    return new gq(4, 0, 0);
  }
  
  public static gq d()
  {
    return new gq(5, 0, 0);
  }
  
  public final boolean a()
  {
    return this.a == 2;
  }
  
  public final boolean e()
  {
    return this.a == 3;
  }
  
  public final boolean f()
  {
    return this.a == 0;
  }
  
  public final boolean g()
  {
    return this.a == 4;
  }
  
  public final boolean h()
  {
    return this.a == 5;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */