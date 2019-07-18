package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@yh
public final class xn
{
  private final Context a;
  private final String b;
  private final Yl c;
  private final Ea d;
  private final Ga e;
  private final dl f;
  private final long[] g;
  private final String[] h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private en n;
  private boolean o;
  private boolean p;
  private long q;
  
  public xn(Context paramContext, Yl paramYl, String paramString, Ga paramGa, Ea paramEa)
  {
    gl localgl = new gl();
    localgl.a("min_1", Double.MIN_VALUE, 1.0D);
    localgl.a("1_5", 1.0D, 5.0D);
    localgl.a("5_10", 5.0D, 10.0D);
    localgl.a("10_20", 10.0D, 20.0D);
    localgl.a("20_30", 20.0D, 30.0D);
    localgl.a("30_max", 30.0D, Double.MAX_VALUE);
    this.f = localgl.a();
    int i1 = 0;
    this.i = false;
    this.j = false;
    this.k = false;
    this.l = false;
    this.q = -1L;
    this.a = paramContext;
    this.c = paramYl;
    this.b = paramString;
    this.e = paramGa;
    this.d = paramEa;
    paramContext = ra.I;
    paramContext = (String)Kea.e().a(paramContext);
    if (paramContext == null)
    {
      this.h = new String[0];
      this.g = new long[0];
      return;
    }
    paramContext = TextUtils.split(paramContext, ",");
    this.h = new String[paramContext.length];
    this.g = new long[paramContext.length];
    while (i1 < paramContext.length)
    {
      try
      {
        this.g[i1] = Long.parseLong(paramContext[i1]);
      }
      catch (NumberFormatException paramYl)
      {
        Tl.c("Unable to parse frame hash target time number.", paramYl);
        this.g[i1] = -1L;
      }
      i1++;
    }
  }
  
  public final void a()
  {
    Object localObject1 = ra.H;
    if ((((Boolean)Kea.e().a((ga)localObject1)).booleanValue()) && (!this.o))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("type", "native-player-metrics");
      localBundle.putString("request", this.b);
      localBundle.putString("player", this.n.e());
      Object localObject2 = this.f.a().iterator();
      Object localObject3;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (fl)((Iterator)localObject2).next();
        localObject1 = String.valueOf(((fl)localObject3).a);
        if (((String)localObject1).length() != 0) {
          localObject1 = "fps_c_".concat((String)localObject1);
        } else {
          localObject1 = new String("fps_c_");
        }
        localBundle.putString((String)localObject1, Integer.toString(((fl)localObject3).e));
        localObject1 = String.valueOf(((fl)localObject3).a);
        if (((String)localObject1).length() != 0) {
          localObject1 = "fps_p_".concat((String)localObject1);
        } else {
          localObject1 = new String("fps_p_");
        }
        localBundle.putString((String)localObject1, Double.toString(((fl)localObject3).d));
      }
      for (int i1 = 0;; i1++)
      {
        localObject2 = this.g;
        if (i1 >= localObject2.length) {
          break;
        }
        localObject1 = this.h[i1];
        if (localObject1 != null)
        {
          localObject3 = String.valueOf(Long.valueOf(localObject2[i1]));
          localObject2 = new StringBuilder(String.valueOf(localObject3).length() + 3);
          ((StringBuilder)localObject2).append("fh_");
          ((StringBuilder)localObject2).append((String)localObject3);
          localBundle.putString(((StringBuilder)localObject2).toString(), (String)localObject1);
        }
      }
      k.c().a(this.a, this.c.a, "gmob-apps", localBundle, true);
      this.o = true;
    }
  }
  
  public final void a(en paramen)
  {
    za.a(this.e, this.d, new String[] { "vpc2" });
    this.i = true;
    Ga localGa = this.e;
    if (localGa != null) {
      localGa.a("vpn", paramen.e());
    }
    this.n = paramen;
  }
  
  public final void b()
  {
    if ((this.i) && (!this.j))
    {
      za.a(this.e, this.d, new String[] { "vfr2" });
      this.j = true;
    }
  }
  
  public final void b(en paramen)
  {
    if ((this.k) && (!this.l))
    {
      if ((mk.a()) && (!this.l)) {
        mk.f("VideoMetricsMixin first frame");
      }
      za.a(this.e, this.d, new String[] { "vff2" });
      this.l = true;
    }
    long l1 = k.j().c();
    if ((this.m) && (this.p) && (this.q != -1L))
    {
      double d1 = TimeUnit.SECONDS.toNanos(1L) / (l1 - this.q);
      this.f.a(d1);
    }
    this.p = this.m;
    this.q = l1;
    Object localObject = ra.J;
    l1 = ((Long)Kea.e().a((ga)localObject)).longValue();
    long l2 = paramen.getCurrentPosition();
    for (int i1 = 0;; i1++)
    {
      localObject = this.h;
      if (i1 >= localObject.length) {
        break;
      }
      if ((localObject[i1] == null) && (l1 > Math.abs(l2 - this.g[i1])))
      {
        localObject = this.h;
        paramen = paramen.getBitmap(8, 8);
        l2 = 63L;
        int i2 = 0;
        l1 = 0L;
        while (i2 < 8)
        {
          long l3 = l2;
          int i3 = 0;
          l2 = l1;
          for (l1 = l3; i3 < 8; l1 -= 1L)
          {
            int i4 = paramen.getPixel(i3, i2);
            if (Color.blue(i4) + Color.red(i4) + Color.green(i4) > 128) {
              l3 = 1L;
            } else {
              l3 = 0L;
            }
            l2 |= l3 << (int)l1;
            i3++;
          }
          i2++;
          l3 = l1;
          l1 = l2;
          l2 = l3;
        }
        localObject[i1] = String.format("%016X", new Object[] { Long.valueOf(l1) });
        return;
      }
    }
  }
  
  public final void c()
  {
    this.m = true;
    if ((this.j) && (!this.k))
    {
      za.a(this.e, this.d, new String[] { "vfp2" });
      this.k = true;
    }
  }
  
  public final void d()
  {
    this.m = false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */