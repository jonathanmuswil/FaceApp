package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.r.a;

public final class fl
{
  public final String a;
  private final double b;
  private final double c;
  public final double d;
  public final int e;
  
  public fl(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
  {
    this.a = paramString;
    this.c = paramDouble1;
    this.b = paramDouble2;
    this.d = paramDouble3;
    this.e = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fl)) {
      return false;
    }
    paramObject = (fl)paramObject;
    return (r.a(this.a, ((fl)paramObject).a)) && (this.b == ((fl)paramObject).b) && (this.c == ((fl)paramObject).c) && (this.e == ((fl)paramObject).e) && (Double.compare(this.d, ((fl)paramObject).d) == 0);
  }
  
  public final int hashCode()
  {
    return r.a(new Object[] { this.a, Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e) });
  }
  
  public final String toString()
  {
    r.a locala = r.a(this);
    locala.a("name", this.a);
    locala.a("minBound", Double.valueOf(this.c));
    locala.a("maxBound", Double.valueOf(this.b));
    locala.a("percent", Double.valueOf(this.d));
    locala.a("count", Integer.valueOf(this.e));
    return locala.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */