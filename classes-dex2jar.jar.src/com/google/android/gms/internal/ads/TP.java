package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.y;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.ads.internal.overlay.u;
import com.google.android.gms.common.util.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

@yh
public class tp
  extends WebViewClient
  implements bq
{
  private static final String[] a = { "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS" };
  private static final String[] b = { "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID" };
  private View.OnAttachStateChangeListener A;
  protected sp c;
  private final sda d;
  private final HashMap<String, List<Ic<? super sp>>> e = new HashMap();
  private final Object f = new Object();
  private kea g;
  private o h;
  private cq i;
  private dq j;
  private oc k;
  private qc l;
  private eq m;
  private boolean n = false;
  private boolean o;
  private boolean p;
  private boolean q;
  private u r;
  private final Xg s;
  private b t;
  private Ng u;
  protected nj v;
  private boolean w;
  private boolean x;
  private int y;
  private boolean z;
  
  public tp(sp paramsp, sda paramsda, boolean paramBoolean)
  {
    this(paramsp, paramsda, paramBoolean, new Xg(paramsp, paramsp.s(), new ca(paramsp.getContext())), null);
  }
  
  private tp(sp paramsp, sda paramsda, boolean paramBoolean, Xg paramXg, Ng paramNg)
  {
    this.d = paramsda;
    this.c = paramsp;
    this.o = paramBoolean;
    this.s = paramXg;
    this.u = null;
  }
  
  private final void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Object localObject = ra.Ub;
    if (!((Boolean)Kea.e().a((ga)localObject)).booleanValue()) {
      return;
    }
    localObject = new Bundle();
    ((Bundle)localObject).putString("err", paramString1);
    ((Bundle)localObject).putString("code", paramString2);
    if (!TextUtils.isEmpty(paramString3))
    {
      paramString1 = Uri.parse(paramString3);
      if (paramString1.getHost() != null)
      {
        paramString1 = paramString1.getHost();
        break label80;
      }
    }
    paramString1 = "";
    label80:
    ((Bundle)localObject).putString("host", paramString1);
    k.c().a(paramContext, this.c.z().a, "gmob-apps", (Bundle)localObject, true);
  }
  
  private final void a(View paramView, nj paramnj, int paramInt)
  {
    if ((paramnj.c()) && (paramInt > 0))
    {
      paramnj.a(paramView);
      if (paramnj.c()) {
        vk.a.postDelayed(new vp(this, paramView, paramnj, paramInt), 100L);
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
    localObject = this.c.getContext();
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
  
  private final WebResourceResponse b(String paramString, Map<String, String> paramMap)
    throws IOException
  {
    paramString = new URL(paramString);
    int i1 = 0;
    Object localObject1;
    for (;;)
    {
      i1++;
      if (i1 > 20) {
        break label390;
      }
      localObject1 = paramString.openConnection();
      ((URLConnection)localObject1).setConnectTimeout(10000);
      ((URLConnection)localObject1).setReadTimeout(10000);
      Object localObject2 = paramMap.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        ((URLConnection)localObject1).addRequestProperty((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
      }
      if (!(localObject1 instanceof HttpURLConnection)) {
        break label379;
      }
      localObject1 = (HttpURLConnection)localObject1;
      k.c().a(this.c.getContext(), this.c.z().a, false, (HttpURLConnection)localObject1);
      localObject2 = new Ll();
      ((Ll)localObject2).a((HttpURLConnection)localObject1, null);
      int i2 = ((HttpURLConnection)localObject1).getResponseCode();
      ((Ll)localObject2).a((HttpURLConnection)localObject1, i2);
      if ((i2 < 300) || (i2 >= 400)) {
        break label369;
      }
      Object localObject3 = ((HttpURLConnection)localObject1).getHeaderField("Location");
      if (localObject3 == null) {
        break;
      }
      localObject2 = new URL(paramString, (String)localObject3);
      paramString = ((URL)localObject2).getProtocol();
      if (paramString == null)
      {
        Tl.d("Protocol is null");
        return o();
      }
      if ((!paramString.equals("http")) && (!paramString.equals("https")))
      {
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0) {
          paramString = "Unsupported scheme: ".concat(paramString);
        } else {
          paramString = new String("Unsupported scheme: ");
        }
        Tl.d(paramString);
        return o();
      }
      paramString = String.valueOf(localObject3);
      if (paramString.length() != 0) {
        paramString = "Redirecting to ".concat(paramString);
      } else {
        paramString = new String("Redirecting to ");
      }
      Tl.a(paramString);
      ((HttpURLConnection)localObject1).disconnect();
      paramString = (String)localObject2;
    }
    throw new IOException("Missing Location header in redirect");
    label369:
    k.c();
    return vk.a((HttpURLConnection)localObject1);
    label379:
    throw new IOException("Invalid protocol.");
    label390:
    paramString = new StringBuilder(32);
    paramString.append("Too many redirects (20)");
    throw new IOException(paramString.toString());
  }
  
  private final void m()
  {
    if (this.A == null) {
      return;
    }
    this.c.getView().removeOnAttachStateChangeListener(this.A);
  }
  
  private final void n()
  {
    if ((this.i != null) && (((this.w) && (this.y <= 0)) || (this.x)))
    {
      this.i.a(this.x ^ true);
      this.i = null;
    }
    this.c.j();
  }
  
  private static WebResourceResponse o()
  {
    ga localga = ra.Ta;
    if (((Boolean)Kea.e().a(localga)).booleanValue()) {
      return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
    }
    return null;
  }
  
  protected final WebResourceResponse a(String paramString, Map<String, String> paramMap)
  {
    try
    {
      Object localObject = Jj.a(paramString, this.c.getContext(), this.z);
      if (!((String)localObject).equals(paramString)) {
        return b((String)localObject, paramMap);
      }
      localObject = dda.b(paramString);
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
          paramString = b(paramString, paramMap);
          return paramString;
        }
      }
      return null;
    }
    catch (NoClassDefFoundError paramString) {}catch (Exception paramString) {}
    k.g().a(paramString, "AdWebViewClient.interceptRequest");
    return o();
  }
  
  public final void a()
  {
    synchronized (this.f)
    {
      this.n = false;
      this.o = true;
      Executor localExecutor = Cm.a;
      up localup = new com/google/android/gms/internal/ads/up;
      localup.<init>(this);
      localExecutor.execute(localup);
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
    Object localObject1 = paramUri.getPath();
    List localList = (List)this.e.get(localObject1);
    if (localList != null)
    {
      k.c();
      localObject2 = vk.a(paramUri);
      if (Tl.a(2))
      {
        paramUri = String.valueOf(localObject1);
        if (paramUri.length() != 0) {
          paramUri = "Received GMSG: ".concat(paramUri);
        } else {
          paramUri = new String("Received GMSG: ");
        }
        mk.f(paramUri);
        paramUri = ((Map)localObject2).keySet().iterator();
        while (paramUri.hasNext())
        {
          String str1 = (String)paramUri.next();
          String str2 = (String)((Map)localObject2).get(str1);
          localObject1 = new StringBuilder(String.valueOf(str1).length() + 4 + String.valueOf(str2).length());
          ((StringBuilder)localObject1).append("  ");
          ((StringBuilder)localObject1).append(str1);
          ((StringBuilder)localObject1).append(": ");
          ((StringBuilder)localObject1).append(str2);
          mk.f(((StringBuilder)localObject1).toString());
        }
      }
      paramUri = localList.iterator();
      while (paramUri.hasNext()) {
        ((Ic)paramUri.next()).a(this.c, (Map)localObject2);
      }
      return;
    }
    Object localObject2 = String.valueOf(paramUri);
    paramUri = new StringBuilder(String.valueOf(localObject2).length() + 32);
    paramUri.append("No GMSG handler found for GMSG: ");
    paramUri.append((String)localObject2);
    mk.f(paramUri.toString());
  }
  
  public final void a(c paramc)
  {
    boolean bool = this.c.v();
    kea localkea;
    if ((bool) && (!this.c.E().e())) {
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
    a(new AdOverlayInfoParcel(paramc, localkea, localo, this.r, this.c.z()));
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
      paramJc = new b(this.c.getContext(), paramnj, null);
    }
    this.u = new Ng(this.c, paramZg);
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
    if (k.A().f(this.c.getContext())) {
      a("/logScionEvent", new Kc(this.c.getContext()));
    }
    this.g = paramkea;
    this.h = paramo;
    this.k = paramoc;
    this.l = paramqc;
    this.r = paramu;
    this.t = paramJc;
    this.n = paramBoolean;
  }
  
  public final void a(String paramString, n<Ic<? super sp>> paramn)
  {
    synchronized (this.f)
    {
      List localList = (List)this.e.get(paramString);
      if (localList == null) {
        return;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      paramString = localList.iterator();
      while (paramString.hasNext())
      {
        Ic localIc = (Ic)paramString.next();
        if (paramn.apply(localIc)) {
          localArrayList.add(localIc);
        }
      }
      localList.removeAll(localArrayList);
      return;
    }
  }
  
  public final void a(String paramString, Ic<? super sp> paramIc)
  {
    synchronized (this.f)
    {
      List localList = (List)this.e.get(paramString);
      Object localObject2 = localList;
      if (localList == null)
      {
        localObject2 = new java/util/concurrent/CopyOnWriteArrayList;
        ((CopyOnWriteArrayList)localObject2).<init>();
        this.e.put(paramString, localObject2);
      }
      ((List)localObject2).add(paramIc);
      return;
    }
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
    if ((this.c.v()) && (!this.c.E().e())) {
      localkea = null;
    } else {
      localkea = this.g;
    }
    o localo = this.h;
    u localu = this.r;
    sp localsp = this.c;
    a(new AdOverlayInfoParcel(localkea, localo, localu, localsp, paramBoolean, paramInt, localsp.z()));
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    boolean bool = this.c.v();
    kea localkea;
    if ((bool) && (!this.c.E().e())) {
      localkea = null;
    } else {
      localkea = this.g;
    }
    xp localxp;
    if (bool) {
      localxp = null;
    } else {
      localxp = new xp(this.c, this.h);
    }
    oc localoc = this.k;
    qc localqc = this.l;
    u localu = this.r;
    sp localsp = this.c;
    a(new AdOverlayInfoParcel(localkea, localxp, localoc, localqc, localu, localsp, paramBoolean, paramInt, paramString, localsp.z()));
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = this.c.v();
    kea localkea;
    if ((bool) && (!this.c.E().e())) {
      localkea = null;
    } else {
      localkea = this.g;
    }
    xp localxp;
    if (bool) {
      localxp = null;
    } else {
      localxp = new xp(this.c, this.h);
    }
    oc localoc = this.k;
    qc localqc = this.l;
    u localu = this.r;
    sp localsp = this.c;
    a(new AdOverlayInfoParcel(localkea, localxp, localoc, localqc, localu, localsp, paramBoolean, paramInt, paramString1, paramString2, localsp.z()));
  }
  
  public final void b()
  {
    nj localnj = this.v;
    if (localnj != null)
    {
      WebView localWebView = this.c.getWebView();
      if (y.A(localWebView))
      {
        a(localWebView, localnj, 10);
        return;
      }
      m();
      this.A = new wp(this, localnj);
      this.c.getView().addOnAttachStateChangeListener(this.A);
    }
  }
  
  public final void b(String paramString, Ic<? super sp> paramIc)
  {
    synchronized (this.f)
    {
      paramString = (List)this.e.get(paramString);
      if (paramString == null) {
        return;
      }
      paramString.remove(paramIc);
      return;
    }
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
    synchronized (this.f)
    {
      boolean bool = this.o;
      return bool;
    }
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
    ??? = this.v;
    if (??? != null)
    {
      ((nj)???).a();
      this.v = null;
    }
    m();
    synchronized (this.f)
    {
      this.e.clear();
      this.g = null;
      this.h = null;
      this.i = null;
      this.j = null;
      this.k = null;
      this.l = null;
      this.n = false;
      this.o = false;
      this.p = false;
      this.q = false;
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
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    paramWebView = String.valueOf(paramString);
    if (paramWebView.length() != 0) {
      paramWebView = "Loading resource: ".concat(paramWebView);
    } else {
      paramWebView = new String("Loading resource: ");
    }
    mk.f(paramWebView);
    paramWebView = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(paramWebView.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(paramWebView.getHost()))) {
      a(paramWebView);
    }
  }
  
  public final void onPageFinished(WebView arg1, String paramString)
  {
    synchronized (this.f)
    {
      if (this.c.isDestroyed())
      {
        mk.f("Blank page loaded, 1...");
        this.c.y();
        return;
      }
      this.w = true;
      ??? = this.j;
      if (??? != null)
      {
        ???.a();
        this.j = null;
      }
      n();
      return;
    }
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    if (paramInt < 0)
    {
      int i1 = -paramInt - 1;
      localObject = a;
      if (i1 < localObject.length)
      {
        localObject = localObject[i1];
        break label39;
      }
    }
    Object localObject = String.valueOf(paramInt);
    label39:
    a(this.c.getContext(), "http_err", (String)localObject, paramString2);
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    if (paramSslError != null)
    {
      int i1 = paramSslError.getPrimaryError();
      if (i1 >= 0)
      {
        localObject = b;
        if (i1 < localObject.length)
        {
          localObject = localObject[i1];
          break label45;
        }
      }
      Object localObject = String.valueOf(i1);
      label45:
      Context localContext = this.c.getContext();
      k.e();
      a(localContext, "ssl_err", (String)localObject, paramSslError.getUrl());
    }
    super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
  }
  
  @TargetApi(26)
  public boolean onRenderProcessGone(WebView paramWebView, RenderProcessGoneDetail paramRenderProcessGoneDetail)
  {
    return this.c.a(paramRenderProcessGoneDetail.didCrash(), paramRenderProcessGoneDetail.rendererPriorityAtExit());
  }
  
  @TargetApi(11)
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    return a(paramString, Collections.emptyMap());
  }
  
  public boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    int i1 = paramKeyEvent.getKeyCode();
    if ((i1 != 79) && (i1 != 222)) {
      switch (i1)
      {
      default: 
        switch (i1)
        {
        default: 
          return false;
        }
        break;
      }
    }
    return true;
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Object localObject1 = String.valueOf(paramString);
    if (((String)localObject1).length() != 0) {
      localObject1 = "AdWebView shouldOverrideUrlLoading: ".concat((String)localObject1);
    } else {
      localObject1 = new String("AdWebView shouldOverrideUrlLoading: ");
    }
    mk.f((String)localObject1);
    localObject1 = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(((Uri)localObject1).getScheme())) && ("mobileads.google.com".equalsIgnoreCase(((Uri)localObject1).getHost())))
    {
      a((Uri)localObject1);
    }
    else
    {
      Object localObject2;
      if ((this.n) && (paramWebView == this.c.getWebView()))
      {
        localObject2 = ((Uri)localObject1).getScheme();
        int i1;
        if ((!"http".equalsIgnoreCase((String)localObject2)) && (!"https".equalsIgnoreCase((String)localObject2))) {
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
              ((nj)localObject1).a(paramString);
            }
            this.g = null;
          }
          return super.shouldOverrideUrlLoading(paramWebView, paramString);
        }
      }
      if (!this.c.getWebView().willNotDraw())
      {
        try
        {
          localObject2 = this.c.n();
          paramWebView = (WebView)localObject1;
          if (localObject2 != null)
          {
            paramWebView = (WebView)localObject1;
            if (((hP)localObject2).a((Uri)localObject1)) {
              paramWebView = ((hP)localObject2).a((Uri)localObject1, this.c.getContext(), this.c.getView(), this.c.i());
            }
          }
        }
        catch (xP paramWebView)
        {
          paramWebView = String.valueOf(paramString);
          if (paramWebView.length() != 0) {
            paramWebView = "Unable to append parameter to URL: ".concat(paramWebView);
          } else {
            paramWebView = new String("Unable to append parameter to URL: ");
          }
          Tl.d(paramWebView);
          paramWebView = (WebView)localObject1;
        }
        localObject1 = this.t;
        if ((localObject1 != null) && (!((b)localObject1).b())) {
          this.t.a(paramString);
        } else {
          a(new c("android.intent.action.VIEW", paramWebView.toString(), null, null, null, null, null));
        }
      }
      else
      {
        paramWebView = String.valueOf(paramString);
        if (paramWebView.length() != 0) {
          paramWebView = "AdWebView unable to handle URL: ".concat(paramWebView);
        } else {
          paramWebView = new String("AdWebView unable to handle URL: ");
        }
        Tl.d(paramWebView);
      }
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */