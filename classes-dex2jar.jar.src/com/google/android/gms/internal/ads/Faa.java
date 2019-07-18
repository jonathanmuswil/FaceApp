package com.google.android.gms.internal.ads;

public final class faa
  implements Faa
{
  private final Faa[] a;
  
  public faa(Faa[] paramArrayOfFaa)
  {
    this.a = paramArrayOfFaa;
  }
  
  public final long a()
  {
    Faa[] arrayOfFaa = this.a;
    int i = arrayOfFaa.length;
    int j = 0;
    long l3;
    for (long l1 = Long.MAX_VALUE; j < i; l1 = l3)
    {
      long l2 = arrayOfFaa[j].a();
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
    boolean bool1 = false;
    boolean bool2;
    boolean bool3;
    do
    {
      long l = a();
      bool2 = bool1;
      if (l == Long.MIN_VALUE) {
        break;
      }
      Faa[] arrayOfFaa = this.a;
      int i = arrayOfFaa.length;
      int j = 0;
      boolean bool4;
      for (bool3 = false; j < i; bool3 = bool4)
      {
        Faa localFaa = arrayOfFaa[j];
        bool4 = bool3;
        if (localFaa.a() == l) {
          bool4 = bool3 | localFaa.b(paramLong);
        }
        j++;
      }
      bool2 = bool1 | bool3;
      bool1 = bool2;
    } while (bool3);
    return bool2;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/faa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */