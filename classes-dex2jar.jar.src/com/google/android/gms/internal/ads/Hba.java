package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class hba
  implements bba
{
  private final boolean a;
  private final int b;
  private final byte[] c;
  private final aba[] d;
  private int e;
  private int f;
  private int g;
  private aba[] h;
  
  public hba(boolean paramBoolean, int paramInt)
  {
    this(true, 65536, 0);
  }
  
  private hba(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    tba.a(true);
    tba.a(true);
    this.a = true;
    this.b = 65536;
    this.g = 0;
    this.h = new aba[100];
    this.c = null;
    this.d = new aba[1];
  }
  
  public final void S()
  {
    try
    {
      int i = Math.max(0, Hba.a(this.e, this.b) - this.f);
      int j = this.g;
      if (i >= j) {
        return;
      }
      Arrays.fill(this.h, i, this.g, null);
      this.g = i;
      return;
    }
    finally {}
  }
  
  public final aba T()
  {
    try
    {
      this.f += 1;
      Object localObject1;
      if (this.g > 0)
      {
        localObject1 = this.h;
        int i = this.g - 1;
        this.g = i;
        localObject1 = localObject1[i];
        this.h[this.g] = null;
      }
      else
      {
        localObject1 = new aba(new byte[this.b], 0);
      }
      return (aba)localObject1;
    }
    finally {}
  }
  
  public final int a()
  {
    return this.b;
  }
  
  public final void a(int paramInt)
  {
    try
    {
      int i;
      if (paramInt < this.e) {
        i = 1;
      } else {
        i = 0;
      }
      this.e = paramInt;
      if (i != 0) {
        S();
      }
      return;
    }
    finally {}
  }
  
  public final void a(aba paramaba)
  {
    try
    {
      this.d[0] = paramaba;
      a(this.d);
      return;
    }
    finally
    {
      paramaba = finally;
      throw paramaba;
    }
  }
  
  public final void a(aba[] paramArrayOfaba)
  {
    try
    {
      if (this.g + paramArrayOfaba.length >= this.h.length) {
        this.h = ((aba[])Arrays.copyOf(this.h, Math.max(this.h.length << 1, this.g + paramArrayOfaba.length)));
      }
      int i = paramArrayOfaba.length;
      for (int j = 0; j < i; j++)
      {
        aba localaba = paramArrayOfaba[j];
        boolean bool;
        if ((localaba.a != null) && (localaba.a.length != this.b)) {
          bool = false;
        } else {
          bool = true;
        }
        tba.a(bool);
        aba[] arrayOfaba = this.h;
        int k = this.g;
        this.g = (k + 1);
        arrayOfaba[k] = localaba;
      }
      this.f -= paramArrayOfaba.length;
      notifyAll();
      return;
    }
    finally {}
  }
  
  public final void b()
  {
    try
    {
      if (this.a) {
        a(0);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int c()
  {
    try
    {
      int i = this.f;
      int j = this.b;
      return i * j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */