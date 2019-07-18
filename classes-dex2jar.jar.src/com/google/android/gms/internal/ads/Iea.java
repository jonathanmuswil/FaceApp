package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class iea
  extends eT<iea>
{
  public Integer c = null;
  public Integer d = null;
  public Integer e = null;
  
  public iea()
  {
    this.b = null;
    this.a = -1;
  }
  
  public final void a(cT paramcT)
    throws IOException
  {
    Integer localInteger = this.c;
    if (localInteger != null) {
      paramcT.c(1, localInteger.intValue());
    }
    localInteger = this.d;
    if (localInteger != null) {
      paramcT.c(2, localInteger.intValue());
    }
    localInteger = this.e;
    if (localInteger != null) {
      paramcT.c(3, localInteger.intValue());
    }
    super.a(paramcT);
  }
  
  protected final int c()
  {
    int i = super.c();
    Integer localInteger = this.c;
    int j = i;
    if (localInteger != null) {
      j = i + cT.a(1, localInteger.intValue());
    }
    localInteger = this.d;
    i = j;
    if (localInteger != null) {
      i = j + cT.a(2, localInteger.intValue());
    }
    localInteger = this.e;
    j = i;
    if (localInteger != null) {
      j = i + cT.a(3, localInteger.intValue());
    }
    return j;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/iea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */