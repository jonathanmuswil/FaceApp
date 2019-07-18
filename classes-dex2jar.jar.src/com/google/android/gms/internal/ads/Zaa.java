package com.google.android.gms.internal.ads;

final class zaa
{
  private int a = 1000;
  private int[] b;
  private long[] c;
  private int[] d;
  private int[] e;
  private long[] f;
  private dZ[] g;
  private NX[] h;
  private int i;
  private int j;
  private int k;
  private int l;
  private long m;
  private long n;
  private boolean o;
  private boolean p;
  private NX q;
  
  public zaa()
  {
    int i1 = this.a;
    this.b = new int[i1];
    this.c = new long[i1];
    this.f = new long[i1];
    this.e = new int[i1];
    this.d = new int[i1];
    this.g = new dZ[i1];
    this.h = new NX[i1];
    this.m = Long.MIN_VALUE;
    this.n = Long.MIN_VALUE;
    this.p = true;
    this.o = true;
  }
  
  public final int a(PX paramPX, KY paramKY, boolean paramBoolean1, boolean paramBoolean2, NX paramNX, Aaa paramAaa)
  {
    try
    {
      if (!e())
      {
        if (paramBoolean2)
        {
          paramKY.a(4);
          return -4;
        }
        if ((this.q != null) && ((paramBoolean1) || (this.q != paramNX)))
        {
          paramPX.a = this.q;
          return -5;
        }
        return -3;
      }
      if ((!paramBoolean1) && (this.h[this.k] == paramNX))
      {
        paramPX = paramKY.c;
        int i1;
        if (paramPX == null) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0) {
          return -3;
        }
        paramKY.d = this.f[this.k];
        paramKY.a(this.e[this.k]);
        paramAaa.a = this.d[this.k];
        paramAaa.b = this.c[this.k];
        paramAaa.d = this.g[this.k];
        this.m = Math.max(this.m, paramKY.d);
        this.i -= 1;
        this.k += 1;
        this.j += 1;
        if (this.k == this.a) {
          this.k = 0;
        }
        long l1;
        if (this.i > 0) {
          l1 = this.c[this.k];
        } else {
          l1 = paramAaa.b + paramAaa.a;
        }
        paramAaa.c = l1;
        return -4;
      }
      paramPX.a = this.h[this.k];
      return -5;
    }
    finally {}
  }
  
  public final long a()
  {
    try
    {
      long l1 = Math.max(this.m, this.n);
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long a(long paramLong, boolean paramBoolean)
  {
    try
    {
      if ((e()) && (paramLong >= this.f[this.k]))
      {
        long l1 = this.n;
        if ((paramLong > l1) && (!paramBoolean)) {
          return -1L;
        }
        int i1 = this.k;
        int i2 = -1;
        for (int i3 = 0; (i1 != this.l) && (this.f[i1] <= paramLong); i3++)
        {
          if ((this.e[i1] & 0x1) != 0) {
            i2 = i3;
          }
          i1 = (i1 + 1) % this.a;
        }
        if (i2 == -1) {
          return -1L;
        }
        this.k = ((this.k + i2) % this.a);
        this.j += i2;
        this.i -= i2;
        paramLong = this.c[this.k];
        return paramLong;
      }
      return -1L;
    }
    finally {}
  }
  
  public final void a(long paramLong)
  {
    try
    {
      this.n = Math.max(this.n, paramLong);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(long paramLong1, int paramInt1, long paramLong2, int paramInt2, dZ paramdZ)
  {
    try
    {
      boolean bool = this.o;
      if (bool)
      {
        if ((paramInt1 & 0x1) == 0) {
          return;
        }
        this.o = false;
      }
      if (!this.p) {
        bool = true;
      } else {
        bool = false;
      }
      tba.b(bool);
      a(paramLong1);
      this.f[this.l] = paramLong1;
      this.c[this.l] = paramLong2;
      this.d[this.l] = paramInt2;
      this.e[this.l] = paramInt1;
      this.g[this.l] = paramdZ;
      this.h[this.l] = this.q;
      this.b[this.l] = 0;
      this.i += 1;
      if (this.i == this.a)
      {
        paramInt1 = this.a + 1000;
        int[] arrayOfInt1 = new int[paramInt1];
        long[] arrayOfLong = new long[paramInt1];
        paramdZ = new long[paramInt1];
        int[] arrayOfInt2 = new int[paramInt1];
        int[] arrayOfInt3 = new int[paramInt1];
        dZ[] arrayOfdZ = new dZ[paramInt1];
        NX[] arrayOfNX = new NX[paramInt1];
        int i1 = this.a - this.k;
        System.arraycopy(this.c, this.k, arrayOfLong, 0, i1);
        System.arraycopy(this.f, this.k, paramdZ, 0, i1);
        System.arraycopy(this.e, this.k, arrayOfInt2, 0, i1);
        System.arraycopy(this.d, this.k, arrayOfInt3, 0, i1);
        System.arraycopy(this.g, this.k, arrayOfdZ, 0, i1);
        System.arraycopy(this.h, this.k, arrayOfNX, 0, i1);
        System.arraycopy(this.b, this.k, arrayOfInt1, 0, i1);
        paramInt2 = this.k;
        System.arraycopy(this.c, 0, arrayOfLong, i1, paramInt2);
        System.arraycopy(this.f, 0, paramdZ, i1, paramInt2);
        System.arraycopy(this.e, 0, arrayOfInt2, i1, paramInt2);
        System.arraycopy(this.d, 0, arrayOfInt3, i1, paramInt2);
        System.arraycopy(this.g, 0, arrayOfdZ, i1, paramInt2);
        System.arraycopy(this.h, 0, arrayOfNX, i1, paramInt2);
        System.arraycopy(this.b, 0, arrayOfInt1, i1, paramInt2);
        this.c = arrayOfLong;
        this.f = paramdZ;
        this.e = arrayOfInt2;
        this.d = arrayOfInt3;
        this.g = arrayOfdZ;
        this.h = arrayOfNX;
        this.b = arrayOfInt1;
        this.k = 0;
        this.l = this.a;
        this.i = this.a;
        this.a = paramInt1;
        return;
      }
      this.l += 1;
      if (this.l == this.a) {
        this.l = 0;
      }
      return;
    }
    finally {}
  }
  
  public final boolean a(NX paramNX)
  {
    if (paramNX == null) {}
    try
    {
      this.p = true;
      return false;
    }
    finally {}
    this.p = false;
    boolean bool = Hba.a(paramNX, this.q);
    if (bool) {
      return false;
    }
    this.q = paramNX;
    return true;
  }
  
  public final void b()
  {
    this.j = 0;
    this.k = 0;
    this.l = 0;
    this.i = 0;
    this.o = true;
  }
  
  public final void c()
  {
    this.m = Long.MIN_VALUE;
    this.n = Long.MIN_VALUE;
  }
  
  public final int d()
  {
    return this.j + this.i;
  }
  
  /* Error */
  public final boolean e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 104	com/google/android/gms/internal/ads/zaa:i	I
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -6 -> 13
    //   22: astore_3
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_3
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	zaa
    //   6	2	1	i1	int
    //   12	7	2	bool	boolean
    //   22	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final NX f()
  {
    try
    {
      boolean bool = this.p;
      if (bool) {
        return null;
      }
      NX localNX = this.q;
      return localNX;
    }
    finally {}
  }
  
  public final long g()
  {
    try
    {
      boolean bool = e();
      if (!bool) {
        return -1L;
      }
      int i1 = (this.k + this.i - 1) % this.a;
      this.k = ((this.k + this.i) % this.a);
      this.j += this.i;
      this.i = 0;
      long l1 = this.c[i1];
      i1 = this.d[i1];
      long l2 = i1;
      return l1 + l2;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */