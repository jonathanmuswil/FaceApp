package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class fea
  extends eT<fea>
{
  public String c = null;
  private Oda d = null;
  private Integer e = null;
  public iea f = null;
  private Integer g = null;
  private Tda h = null;
  private Tda i = null;
  private Tda j = null;
  
  public fea()
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
    localObject = this.f;
    if (localObject != null) {
      paramcT.a(4, (jT)localObject);
    }
    super.a(paramcT);
  }
  
  protected final int c()
  {
    int k = super.c();
    Object localObject = this.c;
    int m = k;
    if (localObject != null) {
      m = k + cT.b(1, (String)localObject);
    }
    localObject = this.f;
    k = m;
    if (localObject != null) {
      k = m + cT.b(4, (jT)localObject);
    }
    return k;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */