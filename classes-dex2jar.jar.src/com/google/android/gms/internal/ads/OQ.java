package com.google.android.gms.internal.ads;

import Hq;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.j;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.common.util.m;
import com.google.android.gms.common.util.n;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

@yh
final class oq
  extends vq
  implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, Ld, sp
{
  private int A;
  private int B;
  private Ea C;
  private Ea D;
  private Ea E;
  private Fa F;
  private WeakReference<View.OnClickListener> G;
  private d H;
  private Gl I;
  private final AtomicReference<Hq> J = new AtomicReference();
  private int K = -1;
  private int L = -1;
  private int M = -1;
  private int N = -1;
  private Map<String, Lo> O;
  private final WindowManager P;
  private final fq d;
  private final hq e;
  private final hP f;
  private final Yl g;
  private final j h;
  private final a i;
  private final DisplayMetrics j;
  private final sda k;
  private d l;
  private gq m;
  private String n;
  private boolean o;
  private boolean p;
  private boolean q;
  private int r;
  private boolean s = true;
  private boolean t = false;
  private String u = "";
  private Jp v;
  private boolean w;
  private boolean x;
  private Va y;
  private Ta z;
  
  protected oq(fq paramfq, hq paramhq, gq paramgq, String paramString, boolean paramBoolean1, boolean paramBoolean2, hP paramhP, Yl paramYl, Ga paramGa, j paramj, a parama, sda paramsda)
  {
    super(paramfq, paramhq);
    this.d = paramfq;
    this.e = paramhq;
    this.m = paramgq;
    this.n = paramString;
    this.p = paramBoolean1;
    this.r = -1;
    this.f = paramhP;
    this.g = paramYl;
    this.h = paramj;
    this.i = parama;
    this.P = ((WindowManager)getContext().getSystemService("window"));
    k.c();
    this.j = vk.a(this.P);
    this.k = paramsda;
    this.I = new Gl(this.d.b(), this, this, null);
    k.c().a(paramfq, paramYl.a, getSettings());
    setDownloadListener(this);
    P();
    if (m.d()) {
      addJavascriptInterface(Mp.a(this), "googleAdsJsInterface");
    }
    T();
    this.F = new Fa(new Ga(true, "make_wv", this.n));
    this.F.a().a(paramGa);
    this.D = za.a(this.F.a());
    this.F.a("native:view_create", this.D);
    this.E = null;
    this.C = null;
    k.e().b(paramfq);
  }
  
  private final boolean N()
  {
    boolean bool1 = this.e.f();
    boolean bool2 = false;
    if ((!bool1) && (!this.e.j())) {
      return false;
    }
    Kea.a();
    Object localObject = this.j;
    int i1 = Hl.b((DisplayMetrics)localObject, ((DisplayMetrics)localObject).widthPixels);
    Kea.a();
    localObject = this.j;
    int i2 = Hl.b((DisplayMetrics)localObject, ((DisplayMetrics)localObject).heightPixels);
    localObject = this.d.b();
    int i3;
    int i4;
    if ((localObject != null) && (((Activity)localObject).getWindow() != null))
    {
      k.c();
      localObject = vk.a((Activity)localObject);
      Kea.a();
      i3 = Hl.b(this.j, localObject[0]);
      Kea.a();
      i4 = Hl.b(this.j, localObject[1]);
    }
    else
    {
      i3 = i1;
      i4 = i2;
    }
    if ((this.L == i1) && (this.K == i2) && (this.M == i3) && (this.N == i4)) {
      return false;
    }
    if ((this.L != i1) || (this.K != i2)) {
      bool2 = true;
    }
    this.L = i1;
    this.K = i2;
    this.M = i3;
    this.N = i4;
    new Yg(this).a(i1, i2, i3, i4, this.j.density, this.P.getDefaultDisplay().getRotation());
    return bool2;
  }
  
  private final void O()
  {
    za.a(this.F.a(), this.D, new String[] { "aeh2" });
  }
  
  private final void P()
  {
    try
    {
      if ((!this.p) && (!this.m.e()))
      {
        if (Build.VERSION.SDK_INT < 18)
        {
          Tl.a("Disabling hardware acceleration on an AdView.");
          Q();
          return;
        }
        Tl.a("Enabling hardware acceleration on an AdView.");
        R();
        return;
      }
      Tl.a("Enabling hardware acceleration on an overlay.");
      R();
      return;
    }
    finally {}
  }
  
  private final void Q()
  {
    try
    {
      if (!this.q)
      {
        k.e();
        setLayerType(1, null);
      }
      this.q = true;
      return;
    }
    finally {}
  }
  
  private final void R()
  {
    try
    {
      if (this.q)
      {
        k.e();
        setLayerType(0, null);
      }
      this.q = false;
      return;
    }
    finally {}
  }
  
  private final void S()
  {
    try
    {
      if (this.O != null)
      {
        Iterator localIterator = this.O.values().iterator();
        while (localIterator.hasNext()) {
          ((Lo)localIterator.next()).a();
        }
      }
      this.O = null;
      return;
    }
    finally {}
  }
  
  private final void T()
  {
    Object localObject = this.F;
    if (localObject == null) {
      return;
    }
    localObject = ((Fa)localObject).a();
    if ((localObject != null) && (k.g().c() != null)) {
      k.g().c().a((Ga)localObject);
    }
  }
  
  private final void h(boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    String str;
    if (paramBoolean) {
      str = "1";
    } else {
      str = "0";
    }
    localHashMap.put("isVisible", str);
    Md.a(this, "onAdVisibilityChanged", localHashMap);
  }
  
  public final boolean A()
  {
    return false;
  }
  
  public final d B()
  {
    try
    {
      d locald = this.H;
      return locald;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean C()
  {
    try
    {
      boolean bool = this.s;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Fa D()
  {
    return this.F;
  }
  
  public final gq E()
  {
    try
    {
      gq localgq = this.m;
      return localgq;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String F()
  {
    try
    {
      String str = this.u;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void G()
  {
    try
    {
      if (this.z != null) {
        this.z.Fb();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void H()
  {
    d locald = w();
    if (locald != null) {
      locald.Lb();
    }
  }
  
  public final Ea I()
  {
    return this.D;
  }
  
  public final int J()
  {
    return getMeasuredWidth();
  }
  
  public final int K()
  {
    return getMeasuredHeight();
  }
  
  public final mn L()
  {
    return null;
  }
  
  public final void a(Hq paramHq)
  {
    this.J.set(paramHq);
  }
  
  public final void a(Context paramContext)
  {
    this.d.setBaseContext(paramContext);
    this.I.a(this.d.b());
  }
  
  public final void a(c paramc)
  {
    this.e.a(paramc);
  }
  
  public final void a(d paramd)
  {
    try
    {
      this.H = paramd;
      return;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  public final void a(Jp paramJp)
  {
    try
    {
      if (this.v != null)
      {
        Tl.b("Attempt to create multiple AdWebViewVideoControllers.");
        return;
      }
      this.v = paramJp;
      return;
    }
    finally {}
  }
  
  public final void a(Ta paramTa)
  {
    try
    {
      this.z = paramTa;
      return;
    }
    finally
    {
      paramTa = finally;
      throw paramTa;
    }
  }
  
  public final void a(Va paramVa)
  {
    try
    {
      this.y = paramVa;
      return;
    }
    finally
    {
      paramVa = finally;
      throw paramVa;
    }
  }
  
  public final void a(gq paramgq)
  {
    try
    {
      this.m = paramgq;
      requestLayout();
      return;
    }
    finally
    {
      paramgq = finally;
      throw paramgq;
    }
  }
  
  public final void a(lca paramlca)
  {
    try
    {
      this.w = paramlca.m;
      h(paramlca.m);
      return;
    }
    finally {}
  }
  
  public final void a(String paramString)
  {
    try
    {
      if (!isDestroyed())
      {
        super.a(paramString);
        return;
      }
      Tl.d("The webview is destroyed. Ignoring action.");
      return;
    }
    finally {}
  }
  
  public final void a(String paramString, n<Ic<? super sp>> paramn)
  {
    hq localhq = this.e;
    if (localhq != null) {
      localhq.a(paramString, paramn);
    }
  }
  
  public final void a(String paramString, Ic<? super sp> paramIc)
  {
    hq localhq = this.e;
    if (localhq != null) {
      localhq.b(paramString, paramIc);
    }
  }
  
  public final void a(String paramString, Lo paramLo)
  {
    try
    {
      if (this.O == null)
      {
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        this.O = localHashMap;
      }
      this.O.put(paramString, paramLo);
      return;
    }
    finally {}
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Md.a(this, paramString1, paramString2);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      ga localga = ra.Ra;
      String str = paramString2;
      if (((Boolean)Kea.e().a(localga)).booleanValue()) {
        str = Xp.a(paramString2, new String[] { Xp.a() });
      }
      super.loadDataWithBaseURL(paramString1, str, "text/html", "UTF-8", paramString3);
      return;
    }
    finally {}
  }
  
  public final void a(String paramString, Map paramMap)
  {
    Md.a(this, paramString, paramMap);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    Md.b(this, paramString, paramJSONObject);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.e.c(paramBoolean);
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    this.e.a(paramBoolean, paramInt, paramString);
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    this.e.a(paramBoolean, paramInt, paramString1, paramString2);
  }
  
  public final void a(boolean paramBoolean, long paramLong)
  {
    HashMap localHashMap = new HashMap(2);
    String str;
    if (paramBoolean) {
      str = "1";
    } else {
      str = "0";
    }
    localHashMap.put("success", str);
    localHashMap.put("duration", Long.toString(paramLong));
    Md.a(this, "onCacheAccessComplete", localHashMap);
  }
  
  public final boolean a(boolean paramBoolean, int paramInt)
  {
    destroy();
    this.k.a(new pq(paramBoolean, paramInt));
    this.k.a(uda.K);
    return true;
  }
  
  public final Lo b(String paramString)
  {
    try
    {
      Map localMap = this.O;
      if (localMap == null) {
        return null;
      }
      paramString = (Lo)this.O.get(paramString);
      return paramString;
    }
    finally {}
  }
  
  public final void b(d paramd)
  {
    try
    {
      this.l = paramd;
      return;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  public final void b(String paramString, Ic<? super sp> paramIc)
  {
    hq localhq = this.e;
    if (localhq != null) {
      localhq.a(paramString, paramIc);
    }
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    Md.a(this, paramString, paramJSONObject);
  }
  
  public final void b(boolean paramBoolean)
  {
    try
    {
      this.s = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b(boolean paramBoolean, int paramInt)
  {
    this.e.a(paramBoolean, paramInt);
  }
  
  /* Error */
  public final boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 628	com/google/android/gms/internal/ads/oq:A	I
    //   6: istore_1
    //   7: iload_1
    //   8: ifle +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -6 -> 13
    //   22: astore_3
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_3
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	oq
    //   6	2	1	i1	int
    //   12	7	2	bool	boolean
    //   22	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final String c()
  {
    try
    {
      String str = this.n;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void c(int paramInt)
  {
    if (paramInt == 0) {
      za.a(this.F.a(), this.D, new String[] { "aebb2" });
    }
    O();
    if (this.F.a() != null) {
      this.F.a().a("close_type", String.valueOf(paramInt));
    }
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("closetype", String.valueOf(paramInt));
    localHashMap.put("version", this.g.a);
    Md.a(this, "onhide", localHashMap);
  }
  
  public final void c(boolean paramBoolean)
  {
    try
    {
      int i1 = this.A;
      int i2;
      if (paramBoolean) {
        i2 = 1;
      } else {
        i2 = -1;
      }
      this.A = (i1 + i2);
      if ((this.A <= 0) && (this.l != null)) {
        this.l.Mb();
      }
      return;
    }
    finally {}
  }
  
  public final WebViewClient d()
  {
    return this.e;
  }
  
  public final void d(boolean paramBoolean)
  {
    try
    {
      int i1;
      if (paramBoolean != this.p) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      this.p = paramBoolean;
      P();
      if (i1 != 0)
      {
        Yg localYg = new com/google/android/gms/internal/ads/Yg;
        localYg.<init>(this);
        String str;
        if (paramBoolean) {
          str = "expanded";
        } else {
          str = "default";
        }
        localYg.c(str);
      }
      return;
    }
    finally {}
  }
  
  public final a e()
  {
    return this.i;
  }
  
  public final void e(boolean paramBoolean)
  {
    try
    {
      if (this.l != null)
      {
        this.l.a(this.e.f(), paramBoolean);
        return;
      }
      this.o = paramBoolean;
      return;
    }
    finally {}
  }
  
  public final void f()
  {
    this.I.c();
  }
  
  public final void f(boolean paramBoolean)
  {
    this.e.b(paramBoolean);
  }
  
  protected final void g(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    try
    {
      T();
      this.I.d();
      if (this.l != null)
      {
        this.l.Gb();
        this.l.onDestroy();
        this.l = null;
      }
      this.J.set(null);
      this.e.i();
      k.y();
      Ko.a(this);
      S();
      return;
    }
    finally {}
  }
  
  public final boolean g()
  {
    try
    {
      boolean bool = this.o;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final View getView()
  {
    return this;
  }
  
  public final WebView getWebView()
  {
    return this;
  }
  
  public final void h()
  {
    try
    {
      this.t = true;
      if (this.h != null) {
        this.h.h();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Activity i()
  {
    return this.d.b();
  }
  
  public final void j()
  {
    if (this.E == null)
    {
      this.E = za.a(this.F.a());
      this.F.a("native:view_load", this.E);
    }
  }
  
  public final void k()
  {
    try
    {
      this.t = false;
      if (this.h != null) {
        this.h.k();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void m()
  {
    O();
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.g.a);
    Md.a(this, "onhide", localHashMap);
  }
  
  public final hP n()
  {
    return this.f;
  }
  
  public final void o()
  {
    HashMap localHashMap = new HashMap(3);
    localHashMap.put("app_muted", String.valueOf(k.h().b()));
    localHashMap.put("app_volume", String.valueOf(k.h().a()));
    localHashMap.put("device_volume", String.valueOf(Ok.a(getContext())));
    Md.a(this, "volume", localHashMap);
  }
  
  protected final void onAttachedToWindow()
  {
    try
    {
      super.onAttachedToWindow();
      if (!isDestroyed()) {
        this.I.a();
      }
      boolean bool1 = this.w;
      boolean bool2 = bool1;
      if (this.e != null)
      {
        bool2 = bool1;
        if (this.e.j())
        {
          if (!this.x)
          {
            this.e.k();
            this.e.l();
            this.x = true;
          }
          N();
          bool2 = true;
        }
      }
      h(bool2);
      return;
    }
    finally {}
  }
  
  protected final void onDetachedFromWindow()
  {
    try
    {
      if (!isDestroyed()) {
        this.I.b();
      }
      super.onDetachedFromWindow();
      if ((this.x) && (this.e != null) && (this.e.j()) && (getViewTreeObserver() != null) && (getViewTreeObserver().isAlive()))
      {
        this.e.k();
        this.e.l();
        this.x = false;
      }
      h(false);
      return;
    }
    finally {}
  }
  
  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      paramString2 = new android/content/Intent;
      paramString2.<init>("android.intent.action.VIEW");
      paramString2.setDataAndType(Uri.parse(paramString1), paramString4);
      k.c();
      vk.a(getContext(), paramString2);
      return;
    }
    catch (ActivityNotFoundException paramString2)
    {
      paramString2 = new StringBuilder(String.valueOf(paramString1).length() + 51 + String.valueOf(paramString4).length());
      paramString2.append("Couldn't find an Activity to view url/mimetype: ");
      paramString2.append(paramString1);
      paramString2.append(" / ");
      paramString2.append(paramString4);
      Tl.a(paramString2.toString());
    }
  }
  
  @TargetApi(21)
  protected final void onDraw(Canvas paramCanvas)
  {
    if ((Build.VERSION.SDK_INT == 21) && (paramCanvas.isHardwareAccelerated()) && (!isAttachedToWindow())) {
      return;
    }
    super.onDraw(paramCanvas);
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getAxisValue(9);
    float f2 = paramMotionEvent.getAxisValue(10);
    if ((paramMotionEvent.getActionMasked() == 8) && (((f1 > 0.0F) && (!canScrollVertically(-1))) || ((f1 < 0.0F) && (!canScrollVertically(1))) || ((f2 > 0.0F) && (!canScrollHorizontally(-1))) || ((f2 < 0.0F) && (!canScrollHorizontally(1))))) {
      return false;
    }
    return super.onGenericMotionEvent(paramMotionEvent);
  }
  
  public final void onGlobalLayout()
  {
    boolean bool = N();
    d locald = w();
    if ((locald != null) && (bool)) {
      locald.Kb();
    }
  }
  
  @SuppressLint({"DrawAllocation"})
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      if (isDestroyed())
      {
        setMeasuredDimension(0, 0);
        return;
      }
      if ((!isInEditMode()) && (!this.p) && (!this.m.f()))
      {
        if (this.m.h())
        {
          super.onMeasure(paramInt1, paramInt2);
          return;
        }
        if (this.m.g())
        {
          localObject1 = ra.Pc;
          if (((Boolean)Kea.e().a((ga)localObject1)).booleanValue())
          {
            super.onMeasure(paramInt1, paramInt2);
            return;
          }
          localObject1 = t();
          float f1;
          if (localObject1 != null) {
            f1 = ((Jp)localObject1).ja();
          } else {
            f1 = 0.0F;
          }
          if (f1 == 0.0F)
          {
            super.onMeasure(paramInt1, paramInt2);
            return;
          }
          i1 = View.MeasureSpec.getSize(paramInt1);
          int i2 = View.MeasureSpec.getSize(paramInt2);
          i3 = (int)(i2 * f1);
          paramInt2 = (int)(i1 / f1);
          if ((i2 == 0) && (paramInt2 != 0))
          {
            i4 = (int)(paramInt2 * f1);
            paramInt1 = paramInt2;
            i5 = paramInt2;
            i6 = i1;
          }
          else
          {
            i4 = i3;
            i5 = paramInt2;
            i6 = i1;
            paramInt1 = i2;
            if (i1 == 0)
            {
              i4 = i3;
              i5 = paramInt2;
              i6 = i1;
              paramInt1 = i2;
              if (i3 != 0)
              {
                i5 = (int)(i3 / f1);
                i6 = i3;
                paramInt1 = i2;
                i4 = i3;
              }
            }
          }
          setMeasuredDimension(Math.min(i4, i6), Math.min(i5, paramInt1));
          return;
        }
        if (this.m.a())
        {
          localObject1 = ra.Sc;
          if ((!((Boolean)Kea.e().a((ga)localObject1)).booleanValue()) && (m.d()))
          {
            localObject1 = new com/google/android/gms/internal/ads/qq;
            ((qq)localObject1).<init>(this);
            b("/contentHeight", (Ic)localObject1);
            a("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
            i6 = View.MeasureSpec.getSize(paramInt1);
            if (this.B != -1) {
              paramInt1 = (int)(this.B * this.j.density);
            } else {
              paramInt1 = View.MeasureSpec.getSize(paramInt2);
            }
            setMeasuredDimension(i6, paramInt1);
            return;
          }
          super.onMeasure(paramInt1, paramInt2);
          return;
        }
        if (this.m.e())
        {
          setMeasuredDimension(this.j.widthPixels, this.j.heightPixels);
          return;
        }
        int i3 = View.MeasureSpec.getMode(paramInt1);
        int i5 = View.MeasureSpec.getSize(paramInt1);
        paramInt1 = View.MeasureSpec.getMode(paramInt2);
        int i4 = View.MeasureSpec.getSize(paramInt2);
        int i6 = Integer.MAX_VALUE;
        if ((i3 != Integer.MIN_VALUE) && (i3 != 1073741824)) {
          paramInt2 = Integer.MAX_VALUE;
        } else {
          paramInt2 = i5;
        }
        if ((paramInt1 == Integer.MIN_VALUE) || (paramInt1 == 1073741824)) {
          i6 = i4;
        }
        paramInt1 = this.m.c;
        int i1 = 1;
        if ((paramInt1 <= paramInt2) && (this.m.b <= i6)) {
          paramInt1 = 0;
        } else {
          paramInt1 = 1;
        }
        Object localObject1 = ra.je;
        i3 = paramInt1;
        if (((Boolean)Kea.e().a((ga)localObject1)).booleanValue())
        {
          if ((this.m.c / this.j.density <= paramInt2 / this.j.density) && (this.m.b / this.j.density <= i6 / this.j.density)) {
            paramInt2 = i1;
          } else {
            paramInt2 = 0;
          }
          i3 = paramInt1;
          if (paramInt1 != 0) {
            i3 = paramInt2;
          }
        }
        if (i3 != 0)
        {
          paramInt2 = (int)(this.m.c / this.j.density);
          paramInt1 = (int)(this.m.b / this.j.density);
          i6 = (int)(i5 / this.j.density);
          i3 = (int)(i4 / this.j.density);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>(103);
          ((StringBuilder)localObject1).append("Not enough space to show ad. Needs ");
          ((StringBuilder)localObject1).append(paramInt2);
          ((StringBuilder)localObject1).append("x");
          ((StringBuilder)localObject1).append(paramInt1);
          ((StringBuilder)localObject1).append(" dp, but only has ");
          ((StringBuilder)localObject1).append(i6);
          ((StringBuilder)localObject1).append("x");
          ((StringBuilder)localObject1).append(i3);
          ((StringBuilder)localObject1).append(" dp.");
          Tl.d(((StringBuilder)localObject1).toString());
          if (getVisibility() != 8) {
            setVisibility(4);
          }
          setMeasuredDimension(0, 0);
          return;
        }
        if (getVisibility() != 8) {
          setVisibility(0);
        }
        setMeasuredDimension(this.m.c, this.m.b);
        return;
      }
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    finally {}
  }
  
  public final void onPause()
  {
    try
    {
      super.onPause();
      return;
    }
    catch (Exception localException)
    {
      Tl.b("Could not pause webview.", localException);
    }
  }
  
  public final void onResume()
  {
    try
    {
      super.onResume();
      return;
    }
    catch (Exception localException)
    {
      Tl.b("Could not resume webview.", localException);
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.e.j())
    {
      try
      {
        if (this.y != null) {
          this.y.a(paramMotionEvent);
        }
      }
      finally {}
    }
    else
    {
      hP localhP = this.f;
      if (localhP != null) {
        localhP.a(paramMotionEvent);
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final Va p()
  {
    try
    {
      Va localVa = this.y;
      return localVa;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Hq q()
  {
    return (Hq)this.J.get();
  }
  
  public final void r()
  {
    if (this.C == null)
    {
      za.a(this.F.a(), this.D, new String[] { "aes2" });
      this.C = za.a(this.F.a());
      this.F.a("native:view_show", this.C);
    }
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.g.a);
    Md.a(this, "onshow", localHashMap);
  }
  
  public final Context s()
  {
    return this.d.a();
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.G = new WeakReference(paramOnClickListener);
    super.setOnClickListener(paramOnClickListener);
  }
  
  public final void setRequestedOrientation(int paramInt)
  {
    try
    {
      this.r = paramInt;
      if (this.l != null) {
        this.l.n(this.r);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void stopLoading()
  {
    try
    {
      super.stopLoading();
      return;
    }
    catch (Exception localException)
    {
      Tl.b("Could not stop loading webview.", localException);
    }
  }
  
  public final Jp t()
  {
    try
    {
      Jp localJp = this.v;
      return localJp;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void u()
  {
    setBackgroundColor(0);
  }
  
  public final boolean v()
  {
    try
    {
      boolean bool = this.p;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final d w()
  {
    try
    {
      d locald = this.l;
      return locald;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void x()
  {
    mk.f("Cannot add text view to inner AdWebView");
  }
  
  public final void y() {}
  
  public final Yl z()
  {
    return this.g;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */