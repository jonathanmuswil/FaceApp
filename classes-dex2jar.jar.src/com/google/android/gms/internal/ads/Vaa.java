package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

final class vaa
  implements raa, saa
{
  public final raa[] a;
  private final IdentityHashMap<Eaa, Integer> b;
  private saa c;
  private int d;
  private Kaa e;
  private raa[] f;
  private Faa g;
  
  public vaa(raa... paramVarArgs)
  {
    this.a = paramVarArgs;
    this.b = new IdentityHashMap();
  }
  
  public final long a()
  {
    return this.g.a();
  }
  
  public final long a(long paramLong)
  {
    paramLong = this.f[0].a(paramLong);
    for (int i = 1;; i++)
    {
      raa[] arrayOfraa = this.f;
      if (i >= arrayOfraa.length) {
        return paramLong;
      }
      if (arrayOfraa[i].a(paramLong) != paramLong) {
        break;
      }
    }
    throw new IllegalStateException("Children seeked to different positions");
    return paramLong;
  }
  
  public final long a(Vaa[] paramArrayOfVaa, boolean[] paramArrayOfBoolean1, Eaa[] paramArrayOfEaa, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int[] arrayOfInt1 = new int[paramArrayOfVaa.length];
    int[] arrayOfInt2 = new int[paramArrayOfVaa.length];
    int j;
    for (int i = 0; i < paramArrayOfVaa.length; i++)
    {
      if (paramArrayOfEaa[i] == null) {
        j = -1;
      } else {
        j = ((Integer)this.b.get(paramArrayOfEaa[i])).intValue();
      }
      arrayOfInt1[i] = j;
      arrayOfInt2[i] = -1;
      if (paramArrayOfVaa[i] != null)
      {
        localObject1 = paramArrayOfVaa[i].a();
        for (j = 0;; j++)
        {
          localObject2 = this.a;
          if (j >= localObject2.length) {
            break;
          }
          if (localObject2[j].f().a((Jaa)localObject1) != -1)
          {
            arrayOfInt2[i] = j;
            break;
          }
        }
      }
    }
    this.b.clear();
    Eaa[] arrayOfEaa1 = new Eaa[paramArrayOfVaa.length];
    Eaa[] arrayOfEaa2 = new Eaa[paramArrayOfVaa.length];
    Object localObject1 = new Vaa[paramArrayOfVaa.length];
    Object localObject2 = new ArrayList(this.a.length);
    i = 0;
    while (i < this.a.length)
    {
      for (j = 0; j < paramArrayOfVaa.length; j++)
      {
        k = arrayOfInt1[j];
        Object localObject3 = null;
        if (k == i) {
          localObject4 = paramArrayOfEaa[j];
        } else {
          localObject4 = null;
        }
        arrayOfEaa2[j] = localObject4;
        Object localObject4 = localObject3;
        if (arrayOfInt2[j] == i) {
          localObject4 = paramArrayOfVaa[j];
        }
        localObject1[j] = localObject4;
      }
      long l = this.a[i].a((Vaa[])localObject1, paramArrayOfBoolean1, arrayOfEaa2, paramArrayOfBoolean2, paramLong);
      if (i == 0) {
        paramLong = l;
      } else {
        if (l != paramLong) {
          break label477;
        }
      }
      j = 0;
      int m;
      for (int k = 0; j < paramArrayOfVaa.length; k = m)
      {
        m = arrayOfInt2[j];
        boolean bool = true;
        if (m == i)
        {
          if (arrayOfEaa2[j] != null) {
            bool = true;
          } else {
            bool = false;
          }
          tba.b(bool);
          arrayOfEaa1[j] = arrayOfEaa2[j];
          this.b.put(arrayOfEaa2[j], Integer.valueOf(i));
          m = 1;
        }
        else
        {
          m = k;
          if (arrayOfInt1[j] == i)
          {
            if (arrayOfEaa2[j] != null) {
              bool = false;
            }
            tba.b(bool);
            m = k;
          }
        }
        j++;
      }
      if (k != 0) {
        ((ArrayList)localObject2).add(this.a[i]);
      }
      i++;
      continue;
      label477:
      throw new IllegalStateException("Children enabled at different positions");
    }
    System.arraycopy(arrayOfEaa1, 0, paramArrayOfEaa, 0, arrayOfEaa1.length);
    this.f = new raa[((ArrayList)localObject2).size()];
    ((ArrayList)localObject2).toArray(this.f);
    this.g = new faa(this.f);
    return paramLong;
  }
  
  public final void a(raa paramraa)
  {
    int i = this.d - 1;
    this.d = i;
    if (i > 0) {
      return;
    }
    paramraa = this.a;
    int j = paramraa.length;
    int k = 0;
    i = 0;
    while (k < j)
    {
      i += paramraa[k].f().b;
      k++;
    }
    Jaa[] arrayOfJaa = new Jaa[i];
    raa[] arrayOfraa = this.a;
    int m = arrayOfraa.length;
    k = 0;
    i = 0;
    while (k < m)
    {
      paramraa = arrayOfraa[k].f();
      int n = paramraa.b;
      j = 0;
      while (j < n)
      {
        arrayOfJaa[i] = paramraa.a(j);
        j++;
        i++;
      }
      k++;
    }
    this.e = new Kaa(arrayOfJaa);
    this.c.a(this);
  }
  
  public final void a(saa paramsaa, long paramLong)
  {
    this.c = paramsaa;
    paramsaa = this.a;
    this.d = paramsaa.length;
    int i = paramsaa.length;
    for (int j = 0; j < i; j++) {
      paramsaa[j].a(this, paramLong);
    }
  }
  
  public final long b()
  {
    raa[] arrayOfraa = this.f;
    int i = arrayOfraa.length;
    int j = 0;
    long l3;
    for (long l1 = Long.MAX_VALUE; j < i; l1 = l3)
    {
      long l2 = arrayOfraa[j].b();
      l3 = l1;
      if (l2 != Long.MIN_VALUE) {
        l3 = Math.min(l1, l2);
      }
      j++;
    }
    if (l1 == Long.MAX_VALUE) {
      return Long.MIN_VALUE;
    }
    return l1;
  }
  
  public final boolean b(long paramLong)
  {
    return this.g.b(paramLong);
  }
  
  public final long c()
  {
    long l = this.a[0].c();
    raa[] arrayOfraa1;
    for (int i = 1;; i++)
    {
      arrayOfraa1 = this.a;
      if (i >= arrayOfraa1.length) {
        break label59;
      }
      if (arrayOfraa1[i].c() != -9223372036854775807L) {
        break;
      }
    }
    throw new IllegalStateException("Child reported discontinuity");
    label59:
    if (l != -9223372036854775807L) {
      for (arrayOfraa1 : this.f) {
        if ((arrayOfraa1 != this.a[0]) && (arrayOfraa1.a(l) != l)) {
          throw new IllegalStateException("Children seeked to different positions");
        }
      }
    }
    return l;
  }
  
  public final void c(long paramLong)
  {
    raa[] arrayOfraa = this.f;
    int i = arrayOfraa.length;
    for (int j = 0; j < i; j++) {
      arrayOfraa[j].c(paramLong);
    }
  }
  
  public final void e()
    throws IOException
  {
    raa[] arrayOfraa = this.a;
    int i = arrayOfraa.length;
    for (int j = 0; j < i; j++) {
      arrayOfraa[j].e();
    }
  }
  
  public final Kaa f()
  {
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */