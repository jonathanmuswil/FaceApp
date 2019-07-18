package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.e;
import fq;
import hq;

@yh
public final class xea
  extends fq
{
  public static final Parcelable.Creator<xea> CREATOR = new yea();
  public final String a;
  public final int b;
  public final int c;
  public final boolean d;
  public final int e;
  public final int f;
  public final xea[] g;
  public final boolean h;
  public final boolean i;
  public boolean j;
  
  public xea()
  {
    this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
  }
  
  public xea(Context paramContext, e parame)
  {
    this(paramContext, new e[] { parame });
  }
  
  public xea(Context paramContext, e[] paramArrayOfe)
  {
    e locale = paramArrayOfe[0];
    this.d = false;
    this.i = locale.d();
    if (this.i)
    {
      this.e = e.a.b();
      this.b = e.a.a();
    }
    else
    {
      this.e = locale.b();
      this.b = locale.a();
    }
    int k;
    if (this.e == -1) {
      k = 1;
    } else {
      k = 0;
    }
    int m;
    if (this.b == -2) {
      m = 1;
    } else {
      m = 0;
    }
    Object localObject = paramContext.getResources().getDisplayMetrics();
    int n;
    label172:
    int i1;
    if (k != 0)
    {
      Kea.a();
      if (Hl.d(paramContext))
      {
        Kea.a();
        if (Hl.e(paramContext))
        {
          n = ((DisplayMetrics)localObject).widthPixels;
          Kea.a();
          this.f = (n - Hl.f(paramContext));
          break label172;
        }
      }
      this.f = ((DisplayMetrics)localObject).widthPixels;
      double d1 = this.f / ((DisplayMetrics)localObject).density;
      i1 = (int)d1;
      n = i1;
      if (d1 - i1 >= 0.01D) {
        n = i1 + 1;
      }
    }
    else
    {
      n = this.e;
      Kea.a();
      this.f = Hl.a((DisplayMetrics)localObject, this.e);
    }
    if (m != 0) {
      i1 = c((DisplayMetrics)localObject);
    } else {
      i1 = this.b;
    }
    Kea.a();
    this.c = Hl.a((DisplayMetrics)localObject, i1);
    if ((k == 0) && (m == 0))
    {
      if (this.i) {
        this.a = "320x50_mb";
      } else {
        this.a = locale.toString();
      }
    }
    else
    {
      localObject = new StringBuilder(26);
      ((StringBuilder)localObject).append(n);
      ((StringBuilder)localObject).append("x");
      ((StringBuilder)localObject).append(i1);
      ((StringBuilder)localObject).append("_as");
      this.a = ((StringBuilder)localObject).toString();
    }
    if (paramArrayOfe.length > 1)
    {
      this.g = new xea[paramArrayOfe.length];
      for (n = 0; n < paramArrayOfe.length; n++) {
        this.g[n] = new xea(paramContext, paramArrayOfe[n]);
      }
    }
    this.g = null;
    this.h = false;
    this.j = false;
  }
  
  xea(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, int paramInt4, xea[] paramArrayOfxea, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean1;
    this.e = paramInt3;
    this.f = paramInt4;
    this.g = paramArrayOfxea;
    this.h = paramBoolean2;
    this.i = paramBoolean3;
    this.j = paramBoolean4;
  }
  
  public static int a(DisplayMetrics paramDisplayMetrics)
  {
    return paramDisplayMetrics.widthPixels;
  }
  
  public static xea a(Context paramContext)
  {
    return new xea("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
  }
  
  public static int b(DisplayMetrics paramDisplayMetrics)
  {
    return (int)(c(paramDisplayMetrics) * paramDisplayMetrics.density);
  }
  
  private static int c(DisplayMetrics paramDisplayMetrics)
  {
    int k = (int)(paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
    if (k <= 400) {
      return 32;
    }
    if (k <= 720) {
      return 50;
    }
    return 90;
  }
  
  public static xea y()
  {
    return new xea("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int k = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, false);
    hq.a(paramParcel, 3, this.b);
    hq.a(paramParcel, 4, this.c);
    hq.a(paramParcel, 5, this.d);
    hq.a(paramParcel, 6, this.e);
    hq.a(paramParcel, 7, this.f);
    hq.a(paramParcel, 8, this.g, paramInt, false);
    hq.a(paramParcel, 9, this.h);
    hq.a(paramParcel, 10, this.i);
    hq.a(paramParcel, 11, this.j);
    hq.a(paramParcel, k);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */