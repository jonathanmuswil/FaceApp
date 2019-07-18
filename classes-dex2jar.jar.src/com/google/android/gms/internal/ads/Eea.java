package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class eea
  extends eT<eea>
{
  public String c = null;
  private Bda[] d = new Bda[0];
  private Tda e = null;
  private Tda f = null;
  private Tda g = null;
  
  public eea()
  {
    this.b = null;
    this.a = -1;
  }
  
  public final void a(cT paramcT)
    throws IOException
  {
    Object localObject = this.c;
    if (localObject != null) {
      paramcT.a(1, (String)localObject);
    }
    localObject = this.d;
    if ((localObject != null) && (localObject.length > 0)) {
      for (int i = 0;; i++)
      {
        localObject = this.d;
        if (i >= localObject.length) {
          break;
        }
        localObject = localObject[i];
        if (localObject != null) {
          paramcT.a(2, (YR)localObject);
        }
      }
    }
    super.a(paramcT);
  }
  
  protected final int c()
  {
    int i = super.c();
    Object localObject = this.c;
    int j = i;
    if (localObject != null) {
      j = i + cT.b(1, (String)localObject);
    }
    localObject = this.d;
    int k = j;
    if (localObject != null)
    {
      k = j;
      if (localObject.length > 0)
      {
        i = 0;
        for (;;)
        {
          localObject = this.d;
          k = j;
          if (i >= localObject.length) {
            break;
          }
          localObject = localObject[i];
          k = j;
          if (localObject != null) {
            k = j + WQ.c(2, (YR)localObject);
          }
          i++;
          j = k;
        }
      }
    }
    return k;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/eea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */