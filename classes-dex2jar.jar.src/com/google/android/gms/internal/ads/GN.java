package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

@yh
public final class gn
  extends FrameLayout
  implements dn
{
  private final wn a;
  private final FrameLayout b;
  private final Ga c;
  private final yn d;
  private final long e;
  private en f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private long k;
  private long l;
  private String m;
  private String[] n;
  private Bitmap o;
  private ImageView p;
  private boolean q;
  
  public gn(Context paramContext, wn paramwn, int paramInt, boolean paramBoolean, Ga paramGa, vn paramvn)
  {
    super(paramContext);
    this.a = paramwn;
    this.c = paramGa;
    this.b = new FrameLayout(paramContext);
    addView(this.b, new FrameLayout.LayoutParams(-1, -1));
    t.a(paramwn.e());
    this.f = paramwn.e().b.a(paramContext, paramwn, paramInt, paramBoolean, paramGa, paramvn);
    paramwn = this.f;
    if (paramwn != null)
    {
      this.b.addView(paramwn, new FrameLayout.LayoutParams(-1, -1, 17));
      paramwn = ra.K;
      if (((Boolean)Kea.e().a(paramwn)).booleanValue()) {
        g();
      }
    }
    this.p = new ImageView(paramContext);
    paramContext = ra.O;
    this.e = ((Long)Kea.e().a(paramContext)).longValue();
    paramContext = ra.M;
    this.j = ((Boolean)Kea.e().a(paramContext)).booleanValue();
    paramwn = this.c;
    if (paramwn != null)
    {
      if (this.j) {
        paramContext = "1";
      } else {
        paramContext = "0";
      }
      paramwn.a("spinner_used", paramContext);
    }
    this.d = new yn(this);
    paramContext = this.f;
    if (paramContext != null) {
      paramContext.a(this);
    }
    if (this.f == null) {
      a("AdVideoUnderlay Error", "Allocating player failed.");
    }
  }
  
  public static void a(wn paramwn)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "no_video_view");
    paramwn.a("onVideoEvent", localHashMap);
  }
  
  public static void a(wn paramwn, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "decoderProps");
    localHashMap.put("error", paramString);
    paramwn.a("onVideoEvent", localHashMap);
  }
  
  public static void a(wn paramwn, Map<String, List<Map<String, Object>>> paramMap)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "decoderProps");
    localHashMap.put("mimeTypes", paramMap);
    paramwn.a("onVideoEvent", localHashMap);
  }
  
  private final void b(String paramString, String... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", paramString);
    int i1 = paramVarArgs.length;
    int i2 = 0;
    paramString = null;
    while (i2 < i1)
    {
      String str = paramVarArgs[i2];
      if (paramString == null)
      {
        paramString = str;
      }
      else
      {
        localHashMap.put(paramString, str);
        paramString = null;
      }
      i2++;
    }
    this.a.a("onVideoEvent", localHashMap);
  }
  
  private final boolean i()
  {
    return this.p.getParent() != null;
  }
  
  private final void j()
  {
    if (this.a.i() == null) {
      return;
    }
    if ((this.h) && (!this.i))
    {
      this.a.i().getWindow().clearFlags(128);
      this.h = false;
    }
  }
  
  public final void A()
  {
    if ((this.q) && (this.o != null) && (!i()))
    {
      this.p.setImageBitmap(this.o);
      this.p.invalidate();
      this.b.addView(this.p, new FrameLayout.LayoutParams(-1, -1));
      this.b.bringChildToFront(this.p);
    }
    this.d.a();
    this.l = this.k;
    vk.a.post(new kn(this));
  }
  
  public final void B()
  {
    b("ended", new String[0]);
    j();
  }
  
  public final void C()
  {
    if ((this.a.i() != null) && (!this.h))
    {
      boolean bool;
      if ((this.a.i().getWindow().getAttributes().flags & 0x80) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      this.i = bool;
      if (!this.i)
      {
        this.a.i().getWindow().addFlags(128);
        this.h = true;
      }
    }
    this.g = true;
  }
  
  public final void a()
  {
    this.d.a();
    en localen = this.f;
    if (localen != null) {
      localen.d();
    }
    j();
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    en localen = this.f;
    if (localen != null) {
      localen.a(paramFloat1, paramFloat2);
    }
  }
  
  public final void a(int paramInt)
  {
    en localen = this.f;
    if (localen == null) {
      return;
    }
    localen.b(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (this.j)
    {
      Object localObject = ra.N;
      paramInt1 = Math.max(paramInt1 / ((Integer)Kea.e().a((ga)localObject)).intValue(), 1);
      localObject = ra.N;
      paramInt2 = Math.max(paramInt2 / ((Integer)Kea.e().a((ga)localObject)).intValue(), 1);
      localObject = this.o;
      if ((localObject == null) || (((Bitmap)localObject).getWidth() != paramInt1) || (this.o.getHeight() != paramInt2))
      {
        this.o = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
        this.q = false;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 != 0) && (paramInt4 != 0))
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt3, paramInt4);
      localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
      this.b.setLayoutParams(localLayoutParams);
      requestLayout();
    }
  }
  
  @TargetApi(14)
  public final void a(MotionEvent paramMotionEvent)
  {
    en localen = this.f;
    if (localen == null) {
      return;
    }
    localen.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    b("error", new String[] { "what", paramString1, "extra", paramString2 });
  }
  
  public final void a(String paramString, String[] paramArrayOfString)
  {
    this.m = paramString;
    this.n = paramArrayOfString;
  }
  
  public final void b()
  {
    en localen = this.f;
    if (localen == null) {
      return;
    }
    localen.b();
  }
  
  public final void b(int paramInt)
  {
    this.f.c(paramInt);
  }
  
  public final void c()
  {
    en localen = this.f;
    if (localen == null) {
      return;
    }
    localen.c();
  }
  
  public final void c(int paramInt)
  {
    this.f.d(paramInt);
  }
  
  public final void d()
  {
    if (this.f == null) {
      return;
    }
    if (!TextUtils.isEmpty(this.m))
    {
      this.f.a(this.m, this.n);
      return;
    }
    b("no_src", new String[0]);
  }
  
  public final void d(int paramInt)
  {
    this.f.e(paramInt);
  }
  
  public final void e()
  {
    en localen = this.f;
    if (localen == null) {
      return;
    }
    localen.b.a(true);
    localen.a();
  }
  
  public final void e(int paramInt)
  {
    this.f.f(paramInt);
  }
  
  public final void f()
  {
    en localen = this.f;
    if (localen == null) {
      return;
    }
    localen.b.a(false);
    localen.a();
  }
  
  public final void f(int paramInt)
  {
    this.f.g(paramInt);
  }
  
  public final void finalize()
    throws Throwable
  {
    try
    {
      this.d.a();
      if (this.f != null)
      {
        en localen = this.f;
        Executor localExecutor = Cm.a;
        localen.getClass();
        localExecutor.execute(hn.a(localen));
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  @TargetApi(14)
  public final void g()
  {
    Object localObject = this.f;
    if (localObject == null) {
      return;
    }
    TextView localTextView = new TextView(((TextureView)localObject).getContext());
    localObject = String.valueOf(this.f.e());
    if (((String)localObject).length() != 0) {
      localObject = "AdMob - ".concat((String)localObject);
    } else {
      localObject = new String("AdMob - ");
    }
    localTextView.setText((CharSequence)localObject);
    localTextView.setTextColor(-65536);
    localTextView.setBackgroundColor(65280);
    this.b.addView(localTextView, new FrameLayout.LayoutParams(-2, -2, 17));
    this.b.bringChildToFront(localTextView);
  }
  
  final void h()
  {
    en localen = this.f;
    if (localen == null) {
      return;
    }
    long l1 = localen.getCurrentPosition();
    if ((this.k != l1) && (l1 > 0L))
    {
      b("timeupdate", new String[] { "time", String.valueOf((float)l1 / 1000.0F) });
      this.k = l1;
    }
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean)
    {
      this.d.b();
    }
    else
    {
      this.d.a();
      this.l = this.k;
    }
    vk.a.post(new in(this, paramBoolean));
  }
  
  public final void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    boolean bool;
    if (paramInt == 0)
    {
      this.d.b();
      bool = true;
    }
    else
    {
      this.d.a();
      this.l = this.k;
      bool = false;
    }
    vk.a.post(new ln(this, bool));
  }
  
  public final void setVolume(float paramFloat)
  {
    en localen = this.f;
    if (localen == null) {
      return;
    }
    localen.b.a(paramFloat);
    localen.a();
  }
  
  public final void w()
  {
    en localen = this.f;
    if (localen == null) {
      return;
    }
    if (this.l == 0L) {
      b("canplaythrough", new String[] { "duration", String.valueOf(localen.getDuration() / 1000.0F), "videoWidth", String.valueOf(this.f.getVideoWidth()), "videoHeight", String.valueOf(this.f.getVideoHeight()) });
    }
  }
  
  public final void x()
  {
    this.d.b();
    vk.a.post(new jn(this));
  }
  
  public final void y()
  {
    b("pause", new String[0]);
    j();
    this.g = false;
  }
  
  public final void z()
  {
    if ((this.g) && (i())) {
      this.b.removeView(this.p);
    }
    if (this.o != null)
    {
      long l1 = k.j().b();
      if (this.f.getBitmap(this.o) != null) {
        this.q = true;
      }
      l1 = k.j().b() - l1;
      Object localObject;
      if (mk.a())
      {
        localObject = new StringBuilder(46);
        ((StringBuilder)localObject).append("Spinner frame grab took ");
        ((StringBuilder)localObject).append(l1);
        ((StringBuilder)localObject).append("ms");
        mk.f(((StringBuilder)localObject).toString());
      }
      if (l1 > this.e)
      {
        Tl.d("Spinner frame grab crossed jank threshold! Suspending spinner.");
        this.j = false;
        this.o = null;
        localObject = this.c;
        if (localObject != null) {
          ((Ga)localObject).a("spinner_jank", Long.toString(l1));
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */