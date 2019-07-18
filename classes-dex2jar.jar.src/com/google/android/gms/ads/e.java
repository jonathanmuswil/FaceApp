package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.ads.Hl;
import com.google.android.gms.internal.ads.Kea;
import com.google.android.gms.internal.ads.xea;

public final class e
{
  public static final e a = new e(320, 50, "320x50_mb");
  public static final e b = new e(468, 60, "468x60_as");
  public static final e c = new e(320, 100, "320x100_as");
  public static final e d = new e(728, 90, "728x90_as");
  public static final e e = new e(300, 250, "300x250_as");
  public static final e f = new e(160, 600, "160x600_as");
  public static final e g = new e(-1, -2, "smart_banner");
  public static final e h = new e(-3, -4, "fluid");
  public static final e i = new e(50, 50, "50x50_mb");
  public static final e j = new e(-3, 0, "search_v2");
  private final int k;
  private final int l;
  private final String m;
  
  public e(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, localStringBuilder.toString());
  }
  
  e(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 < 0) && (paramInt1 != -1) && (paramInt1 != -3))
    {
      paramString = new StringBuilder(37);
      paramString.append("Invalid width for AdSize: ");
      paramString.append(paramInt1);
      throw new IllegalArgumentException(paramString.toString());
    }
    if ((paramInt2 < 0) && (paramInt2 != -2) && (paramInt2 != -4))
    {
      paramString = new StringBuilder(38);
      paramString.append("Invalid height for AdSize: ");
      paramString.append(paramInt2);
      throw new IllegalArgumentException(paramString.toString());
    }
    this.k = paramInt1;
    this.l = paramInt2;
    this.m = paramString;
  }
  
  public final int a()
  {
    return this.l;
  }
  
  public final int a(Context paramContext)
  {
    int n = this.l;
    if ((n != -4) && (n != -3))
    {
      if (n != -2)
      {
        Kea.a();
        return Hl.a(paramContext, this.l);
      }
      return xea.b(paramContext.getResources().getDisplayMetrics());
    }
    return -1;
  }
  
  public final int b()
  {
    return this.k;
  }
  
  public final int b(Context paramContext)
  {
    int n = this.k;
    if ((n != -4) && (n != -3))
    {
      if (n != -1)
      {
        Kea.a();
        return Hl.a(paramContext, this.k);
      }
      return xea.a(paramContext.getResources().getDisplayMetrics());
    }
    return -1;
  }
  
  public final boolean c()
  {
    return this.l == -2;
  }
  
  public final boolean d()
  {
    return (this.k == -3) && (this.l == -4);
  }
  
  public final boolean e()
  {
    return this.k == -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    return (this.k == ((e)paramObject).k) && (this.l == ((e)paramObject).l) && (this.m.equals(((e)paramObject).m));
  }
  
  public final int hashCode()
  {
    return this.m.hashCode();
  }
  
  public final String toString()
  {
    return this.m;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */