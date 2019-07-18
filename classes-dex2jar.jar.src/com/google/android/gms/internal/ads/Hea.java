package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class hea
  extends eT<hea>
{
  private Integer c = null;
  public String d = null;
  private Integer e = null;
  private Tda f = null;
  private iea g = null;
  public long[] h = lT.b;
  public fea i = null;
  private gea j = null;
  private Hda k = null;
  public dea l = null;
  public Jda m = null;
  public Pda n = null;
  
  public hea()
  {
    this.b = null;
    this.a = -1;
  }
  
  public final void a(cT paramcT)
    throws IOException
  {
    Object localObject = this.d;
    if (localObject != null) {
      paramcT.a(10, (String)localObject);
    }
    localObject = this.h;
    if ((localObject != null) && (localObject.length > 0)) {
      for (int i1 = 0;; i1++)
      {
        localObject = this.h;
        if (i1 >= localObject.length) {
          break;
        }
        long l1 = localObject[i1];
        paramcT.b(14, 0);
        paramcT.a(l1);
      }
    }
    localObject = this.i;
    if (localObject != null) {
      paramcT.a(15, (jT)localObject);
    }
    localObject = this.l;
    if (localObject != null) {
      paramcT.a(18, (jT)localObject);
    }
    localObject = this.m;
    if (localObject != null) {
      paramcT.a(19, (YR)localObject);
    }
    localObject = this.n;
    if (localObject != null) {
      paramcT.a(20, (YR)localObject);
    }
    super.a(paramcT);
  }
  
  protected final int c()
  {
    int i1 = super.c();
    Object localObject = this.d;
    int i2 = i1;
    if (localObject != null) {
      i2 = i1 + cT.b(10, (String)localObject);
    }
    localObject = this.h;
    i1 = i2;
    if (localObject != null)
    {
      i1 = i2;
      if (localObject.length > 0)
      {
        i1 = 0;
        int i3 = 0;
        for (;;)
        {
          localObject = this.h;
          if (i1 >= localObject.length) {
            break;
          }
          i3 += cT.b(localObject[i1]);
          i1++;
        }
        i1 = i2 + i3 + localObject.length * 1;
      }
    }
    localObject = this.i;
    i2 = i1;
    if (localObject != null) {
      i2 = i1 + cT.b(15, (jT)localObject);
    }
    localObject = this.l;
    i1 = i2;
    if (localObject != null) {
      i1 = i2 + cT.b(18, (jT)localObject);
    }
    localObject = this.m;
    i2 = i1;
    if (localObject != null) {
      i2 = i1 + WQ.c(19, (YR)localObject);
    }
    localObject = this.n;
    i1 = i2;
    if (localObject != null) {
      i1 = i2 + WQ.c(20, (YR)localObject);
    }
    return i1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */