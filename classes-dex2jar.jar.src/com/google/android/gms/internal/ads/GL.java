package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class gl
{
  private final List<String> a = new ArrayList();
  private final List<Double> b = new ArrayList();
  private final List<Double> c = new ArrayList();
  
  public final dl a()
  {
    return new dl(this, null);
  }
  
  public final gl a(String paramString, double paramDouble1, double paramDouble2)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      double d1 = ((Double)this.c.get(i)).doubleValue();
      double d2 = ((Double)this.b.get(i)).doubleValue();
      if ((paramDouble1 < d1) || ((d1 == paramDouble1) && (paramDouble2 < d2))) {
        break;
      }
    }
    this.a.add(i, paramString);
    this.c.add(i, Double.valueOf(paramDouble1));
    this.b.add(i, Double.valueOf(paramDouble2));
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */