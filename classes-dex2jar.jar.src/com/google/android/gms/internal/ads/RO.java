package com.google.android.gms.internal.ads;

@yh
public final class ro
  implements RX
{
  private final hba a = new hba(true, 65536);
  private long b = 15000000L;
  private long c = 30000000L;
  private long d = 2500000L;
  private long e = 5000000L;
  private int f;
  private boolean g;
  
  ro()
  {
    this(15000, 30000, 2500L, 5000L);
  }
  
  private ro(int paramInt1, int paramInt2, long paramLong1, long paramLong2) {}
  
  private final void a(boolean paramBoolean)
  {
    this.f = 0;
    this.g = false;
    if (paramBoolean) {
      this.a.b();
    }
  }
  
  public final bba a()
  {
    return this.a;
  }
  
  public final void a(int paramInt)
  {
    long l = paramInt;
    try
    {
      this.d = (l * 1000L);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(UX[] paramArrayOfUX, Kaa paramKaa, Xaa paramXaa)
  {
    int i = 0;
    this.f = 0;
    while (i < paramArrayOfUX.length)
    {
      if (paramXaa.a(i) != null) {
        this.f += Hba.b(paramArrayOfUX[i].y());
      }
      i++;
    }
    this.a.a(this.f);
  }
  
  public final boolean a(long paramLong)
  {
    try
    {
      long l = this.c;
      boolean bool1 = false;
      int i;
      if (paramLong > l) {
        i = 0;
      } else if (paramLong < this.b) {
        i = 2;
      } else {
        i = 1;
      }
      int j;
      if (this.a.c() >= this.f) {
        j = 1;
      } else {
        j = 0;
      }
      if (i != 2)
      {
        bool2 = bool1;
        if (i == 1)
        {
          bool2 = bool1;
          if (this.g)
          {
            bool2 = bool1;
            if (j != 0) {}
          }
        }
      }
      else
      {
        bool2 = true;
      }
      this.g = bool2;
      boolean bool2 = this.g;
      return bool2;
    }
    finally {}
  }
  
  /* Error */
  public final boolean a(long paramLong, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_3
    //   3: ifeq +12 -> 15
    //   6: aload_0
    //   7: getfield 54	com/google/android/gms/internal/ads/ro:e	J
    //   10: lstore 4
    //   12: goto +9 -> 21
    //   15: aload_0
    //   16: getfield 50	com/google/android/gms/internal/ads/ro:d	J
    //   19: lstore 4
    //   21: lload 4
    //   23: lconst_0
    //   24: lcmp
    //   25: ifle +19 -> 44
    //   28: lload_1
    //   29: lload 4
    //   31: lcmp
    //   32: iflt +6 -> 38
    //   35: goto +9 -> 44
    //   38: iconst_0
    //   39: istore_3
    //   40: aload_0
    //   41: monitorexit
    //   42: iload_3
    //   43: ireturn
    //   44: iconst_1
    //   45: istore_3
    //   46: goto -6 -> 40
    //   49: astore 6
    //   51: aload_0
    //   52: monitorexit
    //   53: aload 6
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	ro
    //   0	56	1	paramLong	long
    //   0	56	3	paramBoolean	boolean
    //   10	20	4	l	long
    //   49	5	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   6	12	49	finally
    //   15	21	49	finally
  }
  
  public final void b()
  {
    a(true);
  }
  
  public final void b(int paramInt)
  {
    long l = paramInt;
    try
    {
      this.e = (l * 1000L);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void c()
  {
    a(true);
  }
  
  public final void c(int paramInt)
  {
    long l = paramInt;
    try
    {
      this.b = (l * 1000L);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void d(int paramInt)
  {
    long l = paramInt;
    try
    {
      this.c = (l * 1000L);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void w()
  {
    a(false);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */