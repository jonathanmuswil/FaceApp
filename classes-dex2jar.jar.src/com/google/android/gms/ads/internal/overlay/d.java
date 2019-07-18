package com.google.android.gms.ads.internal.overlay;

import Hq;
import Iq;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.internal.ads.Bk;
import com.google.android.gms.internal.ads.Dd;
import com.google.android.gms.internal.ads.Kea;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.Yg;
import com.google.android.gms.internal.ads.Yl;
import com.google.android.gms.internal.ads.Zj;
import com.google.android.gms.internal.ads._g;
import com.google.android.gms.internal.ads.bq;
import com.google.android.gms.internal.ads.dh;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.gq;
import com.google.android.gms.internal.ads.hk;
import com.google.android.gms.internal.ads.kea;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.ra;
import com.google.android.gms.internal.ads.sda;
import com.google.android.gms.internal.ads.sp;
import com.google.android.gms.internal.ads.vk;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.yp;
import java.util.Collections;

@yh
public class d
  extends dh
  implements x
{
  private static final int a = Color.argb(0, 0, 0, 0);
  protected final Activity b;
  AdOverlayInfoParcel c;
  sp d;
  private j e;
  private p f;
  private boolean g = false;
  private FrameLayout h;
  private WebChromeClient.CustomViewCallback i;
  private boolean j = false;
  private boolean k = false;
  private i l;
  private boolean m = false;
  int n = 0;
  private final Object o = new Object();
  private Runnable p;
  private boolean q;
  private boolean r;
  private boolean s = false;
  private boolean t = false;
  private boolean u = true;
  
  public d(Activity paramActivity)
  {
    this.b = paramActivity;
  }
  
  private final void Nb()
  {
    if ((this.b.isFinishing()) && (!this.s))
    {
      this.s = true;
      ??? = this.d;
      if (??? != null)
      {
        ((sp)???).c(this.n);
        synchronized (this.o)
        {
          if ((!this.q) && (this.d.b()))
          {
            Object localObject2 = new com/google/android/gms/ads/internal/overlay/f;
            ((f)localObject2).<init>(this);
            this.p = ((Runnable)localObject2);
            localObject2 = vk.a;
            Runnable localRunnable = this.p;
            ga localga = ra.jb;
            ((Handler)localObject2).postDelayed(localRunnable, ((Long)Kea.e().a(localga)).longValue());
            return;
          }
        }
      }
      Jb();
    }
  }
  
  private final void Ob()
  {
    this.d.r();
  }
  
  private static void a(Hq paramHq, View paramView)
  {
    if ((paramHq != null) && (paramView != null)) {
      com.google.android.gms.ads.internal.k.r().a(paramHq, paramView);
    }
  }
  
  private final void a(Configuration paramConfiguration)
  {
    Object localObject = this.c.o;
    int i1 = 1;
    int i2 = 0;
    int i3;
    if ((localObject != null) && (((com.google.android.gms.ads.internal.h)localObject).b)) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    boolean bool = com.google.android.gms.ads.internal.k.e().a(this.b, paramConfiguration);
    int i4;
    int i5;
    if (((!this.k) || (i3 != 0)) && (!bool))
    {
      i4 = i1;
      i5 = i2;
      if (Build.VERSION.SDK_INT >= 19)
      {
        paramConfiguration = this.c.o;
        i4 = i1;
        i5 = i2;
        if (paramConfiguration != null)
        {
          i4 = i1;
          i5 = i2;
          if (paramConfiguration.g)
          {
            i5 = 1;
            i4 = i1;
          }
        }
      }
    }
    else
    {
      i4 = 0;
      i5 = i2;
    }
    localObject = this.b.getWindow();
    paramConfiguration = ra.mb;
    if ((((Boolean)Kea.e().a(paramConfiguration)).booleanValue()) && (Build.VERSION.SDK_INT >= 19))
    {
      paramConfiguration = ((Window)localObject).getDecorView();
      i3 = 256;
      if (i4 != 0)
      {
        i3 = 5380;
        if (i5 != 0) {
          i3 = 5894;
        }
      }
      paramConfiguration.setSystemUiVisibility(i3);
      return;
    }
    if (i4 != 0)
    {
      ((Window)localObject).addFlags(1024);
      ((Window)localObject).clearFlags(2048);
      if ((Build.VERSION.SDK_INT >= 19) && (i5 != 0)) {
        ((Window)localObject).getDecorView().setSystemUiVisibility(4098);
      }
    }
    else
    {
      ((Window)localObject).addFlags(2048);
      ((Window)localObject).clearFlags(1024);
    }
  }
  
  private final void i(boolean paramBoolean)
  {
    Object localObject = ra.Od;
    int i1 = ((Integer)Kea.e().a((ga)localObject)).intValue();
    localObject = new q();
    ((q)localObject).e = 50;
    int i2;
    if (paramBoolean) {
      i2 = i1;
    } else {
      i2 = 0;
    }
    ((q)localObject).a = i2;
    if (paramBoolean) {
      i2 = 0;
    } else {
      i2 = i1;
    }
    ((q)localObject).b = i2;
    ((q)localObject).c = 0;
    ((q)localObject).d = i1;
    this.f = new p(this.b, (q)localObject, this);
    localObject = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject).addRule(10);
    if (paramBoolean) {
      i1 = 11;
    } else {
      i1 = 9;
    }
    ((RelativeLayout.LayoutParams)localObject).addRule(i1);
    a(paramBoolean, this.c.g);
    this.l.addView(this.f, (ViewGroup.LayoutParams)localObject);
  }
  
  private final void j(boolean paramBoolean)
    throws h
  {
    if (!this.r) {
      this.b.requestWindowFeature(1);
    }
    Object localObject1 = this.b.getWindow();
    if (localObject1 != null)
    {
      Object localObject2 = this.c.d;
      Object localObject4 = null;
      if (localObject2 != null) {
        localObject2 = ((sp)localObject2).a();
      } else {
        localObject2 = null;
      }
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3;
      if ((localObject2 != null) && (((bq)localObject2).f())) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      this.m = false;
      if (bool3)
      {
        int i1 = this.c.j;
        com.google.android.gms.ads.internal.k.e();
        if (i1 == 6)
        {
          if (this.b.getResources().getConfiguration().orientation == 1) {
            bool2 = true;
          }
          this.m = bool2;
        }
        else
        {
          i1 = this.c.j;
          com.google.android.gms.ads.internal.k.e();
          if (i1 == 7)
          {
            bool2 = bool1;
            if (this.b.getResources().getConfiguration().orientation == 2) {
              bool2 = true;
            }
            this.m = bool2;
          }
        }
      }
      bool2 = this.m;
      localObject2 = new StringBuilder(46);
      ((StringBuilder)localObject2).append("Delay onShow to next orientation change: ");
      ((StringBuilder)localObject2).append(bool2);
      Tl.a(((StringBuilder)localObject2).toString());
      n(this.c.j);
      com.google.android.gms.ads.internal.k.e();
      ((Window)localObject1).setFlags(16777216, 16777216);
      Tl.a("Hardware acceleration on the AdActivity window enabled.");
      if (!this.k) {
        this.l.setBackgroundColor(-16777216);
      } else {
        this.l.setBackgroundColor(a);
      }
      this.b.setContentView(this.l);
      this.r = true;
      if (paramBoolean) {
        try
        {
          com.google.android.gms.ads.internal.k.d();
          Object localObject5 = this.b;
          if (this.c.d != null) {
            localObject2 = this.c.d.E();
          } else {
            localObject2 = null;
          }
          if (this.c.d != null) {
            localObject1 = this.c.d.c();
          } else {
            localObject1 = null;
          }
          Object localObject6 = this.c.m;
          if (this.c.d != null) {
            localObject7 = this.c.d.e();
          } else {
            localObject7 = null;
          }
          this.d = yp.a((Context)localObject5, (gq)localObject2, (String)localObject1, true, bool3, null, (Yl)localObject6, null, null, (a)localObject7, sda.a());
          Object localObject7 = this.d.a();
          localObject2 = this.c;
          localObject1 = ((AdOverlayInfoParcel)localObject2).p;
          localObject5 = ((AdOverlayInfoParcel)localObject2).e;
          localObject6 = ((AdOverlayInfoParcel)localObject2).i;
          sp localsp = ((AdOverlayInfoParcel)localObject2).d;
          localObject2 = localObject4;
          if (localsp != null) {
            localObject2 = localsp.a().h();
          }
          ((bq)localObject7).a(null, (oc)localObject1, null, (qc)localObject5, (u)localObject6, true, null, (b)localObject2, null, null);
          this.d.a().a(new e(this));
          localObject2 = this.c;
          localObject1 = ((AdOverlayInfoParcel)localObject2).l;
          if (localObject1 != null)
          {
            this.d.loadUrl((String)localObject1);
          }
          else
          {
            localObject1 = ((AdOverlayInfoParcel)localObject2).h;
            if (localObject1 == null) {
              break label620;
            }
            this.d.loadDataWithBaseURL(((AdOverlayInfoParcel)localObject2).f, (String)localObject1, "text/html", "UTF-8", null);
          }
          localObject2 = this.c.d;
          if (localObject2 == null) {
            break label674;
          }
          ((sp)localObject2).a(this);
          break label674;
          label620:
          throw new h("No URL or HTML to display in ad overlay.");
        }
        catch (Exception localException)
        {
          Tl.b("Error obtaining webview.", localException);
          throw new h("Could not obtain webview for the overlay.");
        }
      }
      this.d = this.c.d;
      this.d.a(this.b);
      label674:
      this.d.b(this);
      Object localObject3 = this.c.d;
      if (localObject3 != null) {
        a(((sp)localObject3).q(), this.l);
      }
      localObject3 = this.d.getParent();
      if ((localObject3 != null) && ((localObject3 instanceof ViewGroup))) {
        ((ViewGroup)localObject3).removeView(this.d.getView());
      }
      if (this.k) {
        this.d.u();
      }
      this.l.addView(this.d.getView(), -1, -1);
      if ((!paramBoolean) && (!this.m)) {
        Ob();
      }
      i(bool3);
      if (this.d.g()) {
        a(bool3, true);
      }
      return;
    }
    throw new h("Invalid activity, no window available.");
  }
  
  public final void Eb()
  {
    this.n = 1;
    this.b.finish();
  }
  
  public final void Gb()
  {
    this.n = 2;
    this.b.finish();
  }
  
  public final void Hb()
  {
    Object localObject = this.c;
    if ((localObject != null) && (this.g)) {
      n(((AdOverlayInfoParcel)localObject).j);
    }
    if (this.h != null)
    {
      this.b.setContentView(this.l);
      this.r = true;
      this.h.removeAllViews();
      this.h = null;
    }
    localObject = this.i;
    if (localObject != null)
    {
      ((WebChromeClient.CustomViewCallback)localObject).onCustomViewHidden();
      this.i = null;
    }
    this.g = false;
  }
  
  public final void Ib()
  {
    this.l.removeView(this.f);
    i(true);
  }
  
  public final boolean Ja()
  {
    this.n = 0;
    sp localsp = this.d;
    if (localsp == null) {
      return true;
    }
    boolean bool = localsp.C();
    if (!bool) {
      this.d.a("onbackblocked", Collections.emptyMap());
    }
    return bool;
  }
  
  final void Jb()
  {
    if (this.t) {
      return;
    }
    this.t = true;
    Object localObject = this.d;
    if (localObject != null)
    {
      this.l.removeView(((sp)localObject).getView());
      localObject = this.e;
      if (localObject != null)
      {
        this.d.a(((j)localObject).d);
        this.d.d(false);
        ViewGroup localViewGroup = this.e.c;
        View localView = this.d.getView();
        localObject = this.e;
        localViewGroup.addView(localView, ((j)localObject).a, ((j)localObject).b);
        this.e = null;
      }
      else if (this.b.getApplicationContext() != null)
      {
        this.d.a(this.b.getApplicationContext());
      }
      this.d = null;
    }
    localObject = this.c;
    if (localObject != null)
    {
      localObject = ((AdOverlayInfoParcel)localObject).c;
      if (localObject != null) {
        ((o)localObject).F();
      }
    }
    localObject = this.c;
    if (localObject != null)
    {
      localObject = ((AdOverlayInfoParcel)localObject).d;
      if (localObject != null) {
        a(((sp)localObject).q(), this.c.d.getView());
      }
    }
  }
  
  public final void Kb()
  {
    if (this.m)
    {
      this.m = false;
      Ob();
    }
  }
  
  public final void Lb()
  {
    this.l.b = true;
  }
  
  public final void Mb()
  {
    synchronized (this.o)
    {
      this.q = true;
      if (this.p != null)
      {
        vk.a.removeCallbacks(this.p);
        vk.a.post(this.p);
      }
      return;
    }
  }
  
  public final void Wa()
  {
    this.r = true;
  }
  
  public final void a(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.h = new FrameLayout(this.b);
    this.h.setBackgroundColor(-16777216);
    this.h.addView(paramView, -1, -1);
    this.b.setContentView(this.h);
    this.r = true;
    this.i = paramCustomViewCallback;
    this.g = true;
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = ra.kb;
    boolean bool1 = ((Boolean)Kea.e().a((ga)localObject)).booleanValue();
    boolean bool2 = true;
    if (bool1)
    {
      localObject = this.c;
      if (localObject != null)
      {
        localObject = ((AdOverlayInfoParcel)localObject).o;
        if ((localObject != null) && (((com.google.android.gms.ads.internal.h)localObject).h))
        {
          i1 = 1;
          break label61;
        }
      }
    }
    int i1 = 0;
    label61:
    localObject = ra.lb;
    if (((Boolean)Kea.e().a((ga)localObject)).booleanValue())
    {
      localObject = this.c;
      if (localObject != null)
      {
        localObject = ((AdOverlayInfoParcel)localObject).o;
        if ((localObject != null) && (((com.google.android.gms.ads.internal.h)localObject).i))
        {
          i2 = 1;
          break label115;
        }
      }
    }
    int i2 = 0;
    label115:
    if ((paramBoolean1) && (paramBoolean2) && (i1 != 0) && (i2 == 0)) {
      new Yg(this.d, "useCustomClose").a("Custom close has been disabled for interstitial ads in this ad slot.");
    }
    localObject = this.f;
    if (localObject != null)
    {
      paramBoolean1 = bool2;
      if (i2 == 0) {
        if ((paramBoolean2) && (i1 == 0)) {
          paramBoolean1 = bool2;
        } else {
          paramBoolean1 = false;
        }
      }
      ((p)localObject).a(paramBoolean1);
    }
  }
  
  public final void fa()
  {
    this.n = 0;
  }
  
  public final void i()
  {
    Object localObject = ra.Md;
    if (((Boolean)Kea.e().a((ga)localObject)).booleanValue())
    {
      localObject = this.d;
      if ((localObject != null) && (!((sp)localObject).isDestroyed()))
      {
        com.google.android.gms.ads.internal.k.e();
        Bk.b(this.d);
        return;
      }
      Tl.d("The webview does not exist. Ignoring action.");
    }
  }
  
  public final void i(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.j);
  }
  
  public final void j()
  {
    ga localga = ra.Md;
    if ((((Boolean)Kea.e().a(localga)).booleanValue()) && (this.d != null) && ((!this.b.isFinishing()) || (this.e == null)))
    {
      com.google.android.gms.ads.internal.k.e();
      Bk.a(this.d);
    }
    Nb();
  }
  
  public void k(Bundle paramBundle)
  {
    this.b.requestWindowFeature(1);
    boolean bool;
    if ((paramBundle != null) && (paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false))) {
      bool = true;
    } else {
      bool = false;
    }
    this.j = bool;
    try
    {
      this.c = AdOverlayInfoParcel.a(this.b.getIntent());
      if (this.c != null)
      {
        if (this.c.m.c > 7500000) {
          this.n = 3;
        }
        if (this.b.getIntent() != null) {
          this.u = this.b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (this.c.o != null) {
          this.k = this.c.o.a;
        } else {
          this.k = false;
        }
        if ((this.k) && (this.c.o.f != -1))
        {
          k localk = new com/google/android/gms/ads/internal/overlay/k;
          localk.<init>(this, null);
          localk.b();
        }
        if (paramBundle == null)
        {
          if ((this.c.c != null) && (this.u)) {
            this.c.c.G();
          }
          if ((this.c.k != 1) && (this.c.b != null)) {
            this.c.b.l();
          }
        }
        paramBundle = new com/google/android/gms/ads/internal/overlay/i;
        paramBundle.<init>(this.b, this.c.n, this.c.m.a);
        this.l = paramBundle;
        this.l.setId(1000);
        com.google.android.gms.ads.internal.k.e().a(this.b);
        int i1 = this.c.k;
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 == 3)
            {
              j(true);
              return;
            }
            paramBundle = new com/google/android/gms/ads/internal/overlay/h;
            paramBundle.<init>("Could not determine ad overlay type.");
            throw paramBundle;
          }
          paramBundle = new com/google/android/gms/ads/internal/overlay/j;
          paramBundle.<init>(this.c.d);
          this.e = paramBundle;
          j(false);
          return;
        }
        j(false);
        return;
      }
      paramBundle = new com/google/android/gms/ads/internal/overlay/h;
      paramBundle.<init>("Could not get info for ad overlay.");
      throw paramBundle;
    }
    catch (h paramBundle)
    {
      Tl.d(paramBundle.getMessage());
      this.n = 3;
      this.b.finish();
    }
  }
  
  public final void kb() {}
  
  public final void n(int paramInt)
  {
    int i1 = this.b.getApplicationInfo().targetSdkVersion;
    ga localga = ra.Ie;
    if (i1 >= ((Integer)Kea.e().a(localga)).intValue())
    {
      i1 = this.b.getApplicationInfo().targetSdkVersion;
      localga = ra.Je;
      if (i1 <= ((Integer)Kea.e().a(localga)).intValue())
      {
        i1 = Build.VERSION.SDK_INT;
        localga = ra.Ke;
        if (i1 >= ((Integer)Kea.e().a(localga)).intValue())
        {
          i1 = Build.VERSION.SDK_INT;
          localga = ra.Le;
          if (i1 <= ((Integer)Kea.e().a(localga)).intValue()) {
            return;
          }
        }
      }
    }
    try
    {
      this.b.setRequestedOrientation(paramInt);
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.k.g().b(localThrowable, "AdOverlay.setRequestedOrientation");
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final void onDestroy()
  {
    sp localsp = this.d;
    if (localsp != null) {
      this.l.removeView(localsp.getView());
    }
    Nb();
  }
  
  public final void onPause()
  {
    Hb();
    Object localObject = this.c.c;
    if (localObject != null) {
      ((o)localObject).onPause();
    }
    localObject = ra.Md;
    if ((!((Boolean)Kea.e().a((ga)localObject)).booleanValue()) && (this.d != null) && ((!this.b.isFinishing()) || (this.e == null)))
    {
      com.google.android.gms.ads.internal.k.e();
      Bk.a(this.d);
    }
    Nb();
  }
  
  public final void onResume()
  {
    Object localObject = this.c.c;
    if (localObject != null) {
      ((o)localObject).onResume();
    }
    a(this.b.getResources().getConfiguration());
    localObject = ra.Md;
    if (!((Boolean)Kea.e().a((ga)localObject)).booleanValue())
    {
      localObject = this.d;
      if ((localObject != null) && (!((sp)localObject).isDestroyed()))
      {
        com.google.android.gms.ads.internal.k.e();
        Bk.b(this.d);
        return;
      }
      Tl.d("The webview does not exist. Ignoring action.");
    }
  }
  
  public final void y(Hq paramHq)
  {
    a((Configuration)Iq.J(paramHq));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */