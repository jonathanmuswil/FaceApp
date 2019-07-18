package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.view.y;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.ads.internal.overlay.u;
import com.google.android.gms.common.util.n;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

@yh
public final class hq
  extends tq
  implements bq
{
  private View.OnAttachStateChangeListener A;
  protected sp d;
  private final Pd<sp> e = new Pd();
  private final Object f = new Object();
  private kea g;
  private o h;
  private cq i;
  private dq j;
  private oc k;
  private qc l;
  private eq m;
  private boolean n = false;
  private volatile boolean o;
  private boolean p;
  private boolean q;
  private u r;
  private Xg s;
  private b t;
  private Ng u;
  private nj v;
  private boolean w;
  private boolean x;
  private int y;
  private boolean z;
  
  private final void a(View paramView, nj paramnj, int paramInt)
  {
    if ((paramnj.c()) && (paramInt > 0))
    {
      paramnj.a(paramView);
      if (paramnj.c()) {
        vk.a.postDelayed(new jq(this, paramView, paramnj, paramInt), 100L);
      }
    }
  }
  
  private final void a(AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    Object localObject = this.u;
    boolean bool1 = false;
    boolean bool2;
    if (localObject != null) {
      bool2 = ((Ng)localObject).a();
    } else {
      bool2 = false;
    }
    k.b();
    localObject = this.d.getContext();
    if (!bool2) {
      bool1 = true;
    }
    m.a((Context)localObject, paramAdOverlayInfoParcel, bool1);
    if (this.v != null)
    {
      String str = paramAdOverlayInfoParcel.l;
      localObject = str;
      if (str == null)
      {
        paramAdOverlayInfoParcel = paramAdOverlayInfoParcel.a;
        localObject = str;
        if (paramAdOverlayInfoParcel != null) {
          localObject = paramAdOverlayInfoParcel.b;
        }
      }
      this.v.a((String)localObject);
    }
  }
  
  private final WebResourceResponse e(uq paramuq)
    throws IOException
  {
    Object localObject1 = new URL(paramuq.a);
    int i1 = 0;
    Object localObject4;
    for (;;)
    {
      i1++;
      if (i1 > 20) {
        break label393;
      }
      Object localObject2 = ((URL)localObject1).openConnection();
      ((URLConnection)localObject2).setConnectTimeout(10000);
      ((URLConnection)localObject2).setReadTimeout(10000);
      Object localObject3 = paramuq.d.entrySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (Map.Entry)((Iterator)localObject3).next();
        ((URLConnection)localObject2).addRequestProperty((String)((Map.Entry)localObject4).getKey(), (String)((Map.Entry)localObject4).getValue());
      }
      if (!(localObject2 instanceof HttpURLConnection)) {
        break label382;
      }
      localObject4 = (HttpURLConnection)localObject2;
      k.c().a(this.d.getContext(), this.d.z().a, false, (HttpURLConnection)localObject4);
      localObject3 = new Ll();
      ((Ll)localObject3).a((HttpURLConnection)localObject4, null);
      int i2 = ((HttpURLConnection)localObject4).getResponseCode();
      ((Ll)localObject3).a((HttpURLConnection)localObject4, i2);
      if ((i2 < 300) || (i2 >= 400)) {
        break label372;
      }
      localObject2 = ((HttpURLConnection)localObject4).getHeaderField("Location");
      if (localObject2 == null) {
        break;
      }
      localObject3 = new URL((URL)localObject1, (String)localObject2);
      localObject1 = ((URL)localObject3).getProtocol();
      if (localObject1 == null)
      {
        Tl.d("Protocol is null");
        return o();
      }
      if ((!((String)localObject1).equals("http")) && (!((String)localObject1).equals("https")))
      {
        paramuq = String.valueOf(localObject1);
        if (paramuq.length() != 0) {
          paramuq = "Unsupported scheme: ".concat(paramuq);
        } else {
          paramuq = new String("Unsupported scheme: ");
        }
        Tl.d(paramuq);
        return o();
      }
      localObject1 = String.valueOf(localObject2);
      if (((String)localObject1).length() != 0) {
        localObject1 = "Redirecting to ".concat((String)localObject1);
      } else {
        localObject1 = new String("Redirecting to ");
      }
      Tl.a((String)localObject1);
      ((HttpURLConnection)localObject4).disconnect();
      localObject1 = localObject3;
    }
    throw new IOException("Missing Location header in redirect");
    label372:
    k.c();
    return vk.a((HttpURLConnection)localObject4);
    label382:
    throw new IOException("Invalid protocol.");
    label393:
    paramuq = new StringBuilder(32);
    paramuq.append("Too many redirects (20)");
    throw new IOException(paramuq.toString());
  }
  
  private final void m()
  {
    if (this.A == null) {
      return;
    }
    this.d.getView().removeOnAttachStateChangeListener(this.A);
  }
  
  private final void n()
  {
    if ((this.i != null) && (((this.w) && (this.y <= 0)) || (this.x)))
    {
      this.i.a(this.x ^ true);
      this.i = null;
    }
    this.d.j();
  }
  
  private static WebResourceResponse o()
  {
    ga localga = ra.Ta;
    if (((Boolean)Kea.e().a(localga)).booleanValue()) {
      return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
    }
    return null;
  }
  
  public final void a()
  {
    synchronized (this.f)
    {
      this.n = false;
      this.o = true;
      Executor localExecutor = Cm.a;
      iq localiq = new com/google/android/gms/internal/ads/iq;
      localiq.<init>(this);
      localExecutor.execute(localiq);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    Ng localNg = this.u;
    if (localNg != null) {
      localNg.a(paramInt1, paramInt2);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.s.a(paramInt1, paramInt2);
    Ng localNg = this.u;
    if (localNg != null) {
      localNg.a(paramInt1, paramInt2, false);
    }
  }
  
  public final void a(Uri paramUri)
  {
    this.e.b(paramUri);
  }
  
  public final void a(c paramc)
  {
    boolean bool = this.d.v();
    kea localkea;
    if ((bool) && (!this.d.E().e())) {
      localkea = null;
    } else {
      localkea = this.g;
    }
    o localo;
    if (bool) {
      localo = null;
    } else {
      localo = this.h;
    }
    a(new AdOverlayInfoParcel(paramc, localkea, localo, this.r, this.d.z()));
  }
  
  public final void a(cq paramcq)
  {
    this.i = paramcq;
  }
  
  public final void a(dq paramdq)
  {
    this.j = paramdq;
  }
  
  public final void a(kea paramkea, oc paramoc, o paramo, qc paramqc, u paramu, boolean paramBoolean, Jc paramJc, b paramb, Zg paramZg, nj paramnj)
  {
    paramJc = paramb;
    if (paramb == null) {
      paramJc = new b(this.d.getContext(), paramnj, null);
    }
    this.u = new Ng(this.d, paramZg);
    this.v = paramnj;
    paramb = ra.bb;
    if (((Boolean)Kea.e().a(paramb)).booleanValue()) {
      a("/adMetadata", new nc(paramoc));
    }
    a("/appEvent", new pc(paramqc));
    a("/backButton", sc.j);
    a("/refresh", sc.k);
    a("/canOpenURLs", sc.a);
    a("/canOpenIntents", sc.b);
    a("/click", sc.c);
    a("/close", sc.d);
    a("/customClose", sc.e);
    a("/instrument", sc.n);
    a("/delayPageLoaded", sc.p);
    a("/delayPageClosed", sc.q);
    a("/getLocationInfo", sc.r);
    a("/httpTrack", sc.f);
    a("/log", sc.g);
    a("/mraid", new Lc(paramJc, this.u, paramZg));
    a("/mraidLoaded", this.s);
    a("/open", new Mc(paramJc, this.u));
    a("/precache", new Vo());
    a("/touch", sc.i);
    a("/video", sc.l);
    a("/videoMeta", sc.m);
    if (k.A().f(this.d.getContext())) {
      a("/logScionEvent", new Kc(this.d.getContext()));
    }
    this.g = paramkea;
    this.h = paramo;
    this.k = paramoc;
    this.l = paramqc;
    this.r = paramu;
    this.t = paramJc;
    this.n = paramBoolean;
  }
  
  final void a(sp paramsp, boolean paramBoolean)
  {
    Xg localXg = new Xg(paramsp, paramsp.s(), new ca(paramsp.getContext()));
    this.d = paramsp;
    this.o = paramBoolean;
    this.s = localXg;
    this.u = null;
    this.e.a(paramsp);
  }
  
  public final void a(uq paramuq)
  {
    this.w = true;
    paramuq = this.j;
    if (paramuq != null)
    {
      paramuq.a();
      this.j = null;
    }
    n();
  }
  
  public final void a(String paramString, n<Ic<? super sp>> paramn)
  {
    this.e.a(paramString, paramn);
  }
  
  public final void a(String paramString, Ic<? super sp> paramIc)
  {
    this.e.b(paramString, paramIc);
  }
  
  public final void a(boolean paramBoolean)
  {
    synchronized (this.f)
    {
      this.p = true;
      return;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    kea localkea;
    if ((this.d.v()) && (!this.d.E().e())) {
      localkea = null;
    } else {
      localkea = this.g;
    }
    o localo = this.h;
    u localu = this.r;
    sp localsp = this.d;
    a(new AdOverlayInfoParcel(localkea, localo, localu, localsp, paramBoolean, paramInt, localsp.z()));
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    boolean bool = this.d.v();
    kea localkea;
    if ((bool) && (!this.d.E().e())) {
      localkea = null;
    } else {
      localkea = this.g;
    }
    lq locallq;
    if (bool) {
      locallq = null;
    } else {
      locallq = new lq(this.d, this.h);
    }
    oc localoc = this.k;
    qc localqc = this.l;
    u localu = this.r;
    sp localsp = this.d;
    a(new AdOverlayInfoParcel(localkea, locallq, localoc, localqc, localu, localsp, paramBoolean, paramInt, paramString, localsp.z()));
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = this.d.v();
    kea localkea;
    if ((bool) && (!this.d.E().e())) {
      localkea = null;
    } else {
      localkea = this.g;
    }
    lq locallq;
    if (bool) {
      locallq = null;
    } else {
      locallq = new lq(this.d, this.h);
    }
    oc localoc = this.k;
    qc localqc = this.l;
    u localu = this.r;
    sp localsp = this.d;
    a(new AdOverlayInfoParcel(localkea, locallq, localoc, localqc, localu, localsp, paramBoolean, paramInt, paramString1, paramString2, localsp.z()));
  }
  
  public final void b()
  {
    nj localnj = this.v;
    if (localnj != null)
    {
      WebView localWebView = this.d.getWebView();
      if (y.A(localWebView))
      {
        a(localWebView, localnj, 10);
        return;
      }
      m();
      this.A = new kq(this, localnj);
      this.d.getView().addOnAttachStateChangeListener(this.A);
    }
  }
  
  public final void b(uq paramuq)
  {
    this.e.a(paramuq.b);
  }
  
  public final void b(String paramString, Ic<? super sp> paramIc)
  {
    this.e.a(paramString, paramIc);
  }
  
  public final void b(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public final void c()
  {
    synchronized (this.f)
    {
      this.q = true;
      this.y += 1;
      n();
      return;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }
  
  public final boolean c(uq paramuq)
  {
    Object localObject1 = String.valueOf(paramuq.a);
    if (((String)localObject1).length() != 0) {
      localObject1 = "AdWebView shouldOverrideUrlLoading: ".concat((String)localObject1);
    } else {
      localObject1 = new String("AdWebView shouldOverrideUrlLoading: ");
    }
    mk.f((String)localObject1);
    Object localObject3 = paramuq.b;
    if (this.e.a((Uri)localObject3)) {
      return true;
    }
    if (this.n)
    {
      localObject1 = ((Uri)localObject3).getScheme();
      int i1;
      if ((!"http".equalsIgnoreCase((String)localObject1)) && (!"https".equalsIgnoreCase((String)localObject1))) {
        i1 = 0;
      } else {
        i1 = 1;
      }
      if (i1 != 0)
      {
        localObject1 = this.g;
        if (localObject1 != null)
        {
          ((kea)localObject1).l();
          localObject1 = this.v;
          if (localObject1 != null) {
            ((nj)localObject1).a(paramuq.a);
          }
          this.g = null;
        }
        return false;
      }
    }
    if (!this.d.getWebView().willNotDraw())
    {
      Object localObject2;
      try
      {
        hP localhP = this.d.n();
        localObject1 = localObject3;
        if (localhP != null)
        {
          localObject1 = localObject3;
          if (localhP.a((Uri)localObject3)) {
            localObject1 = localhP.a((Uri)localObject3, this.d.getContext(), this.d.getView(), this.d.i());
          }
        }
      }
      catch (xP localxP)
      {
        localObject2 = String.valueOf(paramuq.a);
        if (((String)localObject2).length() != 0) {
          localObject2 = "Unable to append parameter to URL: ".concat((String)localObject2);
        } else {
          localObject2 = new String("Unable to append parameter to URL: ");
        }
        Tl.d((String)localObject2);
        localObject2 = localObject3;
      }
      localObject3 = this.t;
      if ((localObject3 != null) && (!((b)localObject3).b())) {
        this.t.a(paramuq.a);
      } else {
        a(new c("android.intent.action.VIEW", ((Uri)localObject2).toString(), null, null, null, null, null));
      }
    }
    else
    {
      paramuq = String.valueOf(paramuq.a);
      if (paramuq.length() != 0) {
        paramuq = "AdWebView unable to handle URL: ".concat(paramuq);
      } else {
        paramuq = new String("AdWebView unable to handle URL: ");
      }
      Tl.d(paramuq);
    }
    return true;
  }
  
  public final WebResourceResponse d(uq paramuq)
  {
    Object localObject = this.v;
    if (localObject != null) {
      ((nj)localObject).a(paramuq.a, paramuq.d, 1);
    }
    if (!"mraid.js".equalsIgnoreCase(new File(paramuq.a).getName()))
    {
      localObject = null;
    }
    else
    {
      a();
      if (this.d.E().e())
      {
        localObject = ra.ba;
        localObject = (String)Kea.e().a((ga)localObject);
      }
      else if (this.d.v())
      {
        localObject = ra.aa;
        localObject = (String)Kea.e().a((ga)localObject);
      }
      else
      {
        localObject = ra.Z;
        localObject = (String)Kea.e().a((ga)localObject);
      }
      k.c();
      localObject = vk.c(this.d.getContext(), this.d.z().a, (String)localObject);
    }
    if (localObject != null) {
      return (WebResourceResponse)localObject;
    }
    try
    {
      if (!Jj.a(paramuq.a, this.d.getContext(), this.z).equals(paramuq.a)) {
        return e(paramuq);
      }
      localObject = dda.b(paramuq.a);
      if (localObject != null)
      {
        localObject = k.i().a((dda)localObject);
        if ((localObject != null) && (((ada)localObject).wa())) {
          return new WebResourceResponse("", "", ((ada)localObject).y());
        }
      }
      if (Ll.a())
      {
        localObject = ra.Ib;
        if (((Boolean)Kea.e().a((ga)localObject)).booleanValue())
        {
          paramuq = e(paramuq);
          return paramuq;
        }
      }
      return null;
    }
    catch (NoClassDefFoundError paramuq) {}catch (Exception paramuq) {}
    k.g().a(paramuq, "AdWebViewClient.interceptRequest");
    return o();
  }
  
  public final void d()
  {
    this.y -= 1;
    n();
  }
  
  public final void e()
  {
    this.x = true;
    n();
  }
  
  public final boolean f()
  {
    return this.o;
  }
  
  public final nj g()
  {
    return this.v;
  }
  
  public final b h()
  {
    return this.t;
  }
  
  public final void i()
  {
    nj localnj = this.v;
    if (localnj != null)
    {
      localnj.a();
      this.v = null;
    }
    m();
    this.e.a();
    this.e.a(null);
    synchronized (this.f)
    {
      this.g = null;
      this.h = null;
      this.i = null;
      this.j = null;
      this.k = null;
      this.l = null;
      this.r = null;
      this.m = null;
      if (this.u != null)
      {
        this.u.a(true);
        this.u = null;
      }
      return;
    }
  }
  
  public final boolean j()
  {
    synchronized (this.f)
    {
      boolean bool = this.p;
      return bool;
    }
  }
  
  public final ViewTreeObserver.OnGlobalLayoutListener k()
  {
    synchronized (this.f)
    {
      return null;
    }
  }
  
  public final ViewTreeObserver.OnScrollChangedListener l()
  {
    synchronized (this.f)
    {
      return null;
    }
  }
  
  @TargetApi(26)
  public final boolean onRenderProcessGone(WebView paramWebView, RenderProcessGoneDetail paramRenderProcessGoneDetail)
  {
    return this.d.a(paramRenderProcessGoneDetail.didCrash(), paramRenderProcessGoneDetail.rendererPriorityAtExit());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */