package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class th
{
  private final int a;
  private final List<FX> b;
  private final int c;
  private final InputStream d;
  
  public th(int paramInt, List<FX> paramList)
  {
    this(paramInt, paramList, -1, null);
  }
  
  public th(int paramInt1, List<FX> paramList, int paramInt2, InputStream paramInputStream)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramInt2;
    this.d = paramInputStream;
  }
  
  public final InputStream a()
  {
    return this.d;
  }
  
  public final int b()
  {
    return this.c;
  }
  
  public final int c()
  {
    return this.a;
  }
  
  public final List<FX> d()
  {
    return Collections.unmodifiableList(this.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/th.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */