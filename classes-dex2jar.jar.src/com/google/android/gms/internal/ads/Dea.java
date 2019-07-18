package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class dea
  extends eT<dea>
{
  public Integer c = null;
  private Tda d = null;
  private Cda e = null;
  public eea f = null;
  private Bda[] g = new Bda[0];
  private Dda h = null;
  private Kda i = null;
  private Ida j = null;
  private Fda k = null;
  private Gda l = null;
  private jea[] m = jea.d();
  
  public dea()
  {
    this.b = null;
    this.a = -1;
  }
  
  public final void a(cT paramcT)
    throws IOException
  {
    Object localObject = this.c;
    if (localObject != null) {
      paramcT.c(7, ((Integer)localObject).intValue());
    }
    localObject = this.f;
    if (localObject != null) {
      paramcT.a(10, (jT)localObject);
    }
    localObject = this.g;
    int n = 0;
    int i1;
    if ((localObject != null) && (localObject.length > 0)) {
      for (i1 = 0;; i1++)
      {
        localObject = this.g;
        if (i1 >= localObject.length) {
          break;
        }
        localObject = localObject[i1];
        if (localObject != null) {
          paramcT.a(11, (YR)localObject);
        }
      }
    }
    localObject = this.m;
    if ((localObject != null) && (localObject.length > 0)) {
      for (i1 = n;; i1++)
      {
        localObject = this.m;
        if (i1 >= localObject.length) {
          break;
        }
        localObject = localObject[i1];
        if (localObject != null) {
          paramcT.a(17, (jT)localObject);
        }
      }
    }
    super.a(paramcT);
  }
  
  protected final int c()
  {
    int n = super.c();
    Object localObject = this.c;
    int i1 = n;
    if (localObject != null) {
      i1 = n + cT.a(7, ((Integer)localObject).intValue());
    }
    localObject = this.f;
    n = i1;
    if (localObject != null) {
      n = i1 + cT.b(10, (jT)localObject);
    }
    localObject = this.g;
    int i2 = 0;
    i1 = n;
    if (localObject != null)
    {
      i1 = n;
      if (localObject.length > 0)
      {
        i1 = n;
        i3 = 0;
        for (;;)
        {
          localObject = this.g;
          if (i3 >= localObject.length) {
            break;
          }
          localObject = localObject[i3];
          n = i1;
          if (localObject != null) {
            n = i1 + WQ.c(11, (YR)localObject);
          }
          i3++;
          i1 = n;
        }
      }
    }
    localObject = this.m;
    int i3 = i1;
    if (localObject != null)
    {
      i3 = i1;
      if (localObject.length > 0)
      {
        n = i2;
        for (;;)
        {
          localObject = this.m;
          i3 = i1;
          if (n >= localObject.length) {
            break;
          }
          localObject = localObject[n];
          i3 = i1;
          if (localObject != null) {
            i3 = i1 + cT.b(17, (jT)localObject);
          }
          n++;
          i1 = i3;
        }
      }
    }
    return i3;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */