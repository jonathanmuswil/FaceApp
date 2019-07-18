package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.Executor;

@yh
@TargetApi(16)
public final class bo
  extends en
  implements TextureView.SurfaceTextureListener, Ao
{
  private final wn c;
  private final xn d;
  private final boolean e;
  private final vn f;
  private dn g;
  private Surface h;
  private so i;
  private String j;
  private String[] k;
  private boolean l;
  private int m = 1;
  private un n;
  private final boolean o;
  private boolean p;
  private boolean q;
  private int r;
  private int s;
  private int t;
  private int u;
  private float v;
  
  public bo(Context paramContext, xn paramxn, wn paramwn, boolean paramBoolean1, boolean paramBoolean2, vn paramvn)
  {
    super(paramContext);
    this.e = paramBoolean2;
    this.c = paramwn;
    this.d = paramxn;
    this.o = paramBoolean1;
    this.f = paramvn;
    setSurfaceTextureListener(this);
    this.d.a(this);
  }
  
  private final void a(float paramFloat, boolean paramBoolean)
  {
    so localso = this.i;
    if (localso != null)
    {
      localso.a(paramFloat, paramBoolean);
      return;
    }
    Tl.d("Trying to set volume before player is initalized.");
  }
  
  private final void a(Surface paramSurface, boolean paramBoolean)
  {
    so localso = this.i;
    if (localso != null)
    {
      localso.a(paramSurface, paramBoolean);
      return;
    }
    Tl.d("Trying to set surface before player is initalized.");
  }
  
  private final void c(int paramInt1, int paramInt2)
  {
    float f1;
    if (paramInt2 > 0) {
      f1 = paramInt1 / paramInt2;
    } else {
      f1 = 1.0F;
    }
    if (this.v != f1)
    {
      this.v = f1;
      requestLayout();
    }
  }
  
  private final boolean l()
  {
    return (this.i != null) && (!this.l);
  }
  
  private final boolean m()
  {
    return (l()) && (this.m != 1);
  }
  
  private final void n()
  {
    if (this.p) {
      return;
    }
    this.p = true;
    vk.a.post(new co(this));
    a();
    this.d.b();
    if (this.q) {
      c();
    }
  }
  
  private final so o()
  {
    return new so(this.c.getContext(), this.f);
  }
  
  private final String p()
  {
    return k.c().b(this.c.getContext(), this.c.z().a);
  }
  
  private final void q()
  {
    if (this.i != null) {
      return;
    }
    Object localObject1 = this.j;
    if ((localObject1 != null) && (this.h != null))
    {
      Object localObject2;
      Object localObject3;
      if (((String)localObject1).startsWith("cache:"))
      {
        localObject1 = this.c.b(this.j);
        if ((localObject1 instanceof hp))
        {
          this.i = ((hp)localObject1).c();
        }
        else if ((localObject1 instanceof gp))
        {
          localObject2 = (gp)localObject1;
          localObject1 = p();
          localObject3 = ((gp)localObject2).c();
          boolean bool = ((gp)localObject2).e();
          localObject2 = ((gp)localObject2).d();
          if (localObject2 == null)
          {
            Tl.d("Stream cache URL is null.");
            return;
          }
          this.i = o();
          this.i.a(new Uri[] { Uri.parse((String)localObject2) }, (String)localObject1, (ByteBuffer)localObject3, bool);
        }
        else
        {
          localObject1 = String.valueOf(this.j);
          if (((String)localObject1).length() != 0) {
            localObject1 = "Stream cache miss: ".concat((String)localObject1);
          } else {
            localObject1 = new String("Stream cache miss: ");
          }
          Tl.d((String)localObject1);
        }
      }
      else
      {
        this.i = o();
        localObject3 = p();
        localObject2 = new Uri[this.k.length];
        for (int i1 = 0;; i1++)
        {
          localObject1 = this.k;
          if (i1 >= localObject1.length) {
            break;
          }
          localObject2[i1] = Uri.parse(localObject1[i1]);
        }
        this.i.a((Uri[])localObject2, (String)localObject3);
      }
      this.i.a(this);
      a(this.h, false);
      this.m = this.i.f().C();
      if (this.m == 3) {
        n();
      }
    }
  }
  
  private final void r()
  {
    c(this.r, this.s);
  }
  
  private final void s()
  {
    so localso = this.i;
    if (localso != null) {
      localso.b(true);
    }
  }
  
  private final void t()
  {
    so localso = this.i;
    if (localso != null) {
      localso.b(false);
    }
  }
  
  public final void a()
  {
    a(this.b.a(), false);
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    un localun = this.n;
    if (localun != null) {
      localun.a(paramFloat1, paramFloat2);
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.m != paramInt)
    {
      this.m = paramInt;
      if (paramInt != 3)
      {
        if (paramInt == 4)
        {
          if (this.f.a) {
            t();
          }
          this.d.d();
          this.b.c();
          vk.a.post(new do(this));
        }
      }
      else {
        n();
      }
    }
  }
  
  public final void a(dn paramdn)
  {
    this.g = paramdn;
  }
  
  public final void a(String paramString, Exception paramException)
  {
    String str = paramException.getClass().getCanonicalName();
    paramException = paramException.getMessage();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 2 + String.valueOf(str).length() + String.valueOf(paramException).length());
    localStringBuilder.append(paramString);
    localStringBuilder.append("/");
    localStringBuilder.append(str);
    localStringBuilder.append(":");
    localStringBuilder.append(paramException);
    paramException = localStringBuilder.toString();
    paramString = String.valueOf(paramException);
    if (paramString.length() != 0) {
      paramString = "ExoPlayerAdapter error: ".concat(paramString);
    } else {
      paramString = new String("ExoPlayerAdapter error: ");
    }
    Tl.d(paramString);
    this.l = true;
    if (this.f.a) {
      t();
    }
    vk.a.post(new eo(this, paramException));
  }
  
  public final void a(String paramString, String[] paramArrayOfString)
  {
    if (paramString != null)
    {
      if (paramArrayOfString == null) {
        setVideoPath(paramString);
      }
      this.j = paramString;
      this.k = ((String[])Arrays.copyOf(paramArrayOfString, paramArrayOfString.length));
      q();
    }
  }
  
  public final void a(boolean paramBoolean, long paramLong)
  {
    if (this.c != null) {
      Cm.a.execute(new lo(this, paramBoolean, paramLong));
    }
  }
  
  public final void b()
  {
    if (m())
    {
      if (this.f.a) {
        t();
      }
      this.i.f().a(false);
      this.d.d();
      this.b.c();
      vk.a.post(new go(this));
    }
  }
  
  public final void b(int paramInt)
  {
    if (m()) {
      this.i.f().a(paramInt);
    }
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    this.r = paramInt1;
    this.s = paramInt2;
    r();
  }
  
  public final void c()
  {
    if (m())
    {
      if (this.f.a) {
        s();
      }
      this.i.f().a(true);
      this.d.c();
      this.b.b();
      this.a.a();
      vk.a.post(new fo(this));
      return;
    }
    this.q = true;
  }
  
  public final void c(int paramInt)
  {
    so localso = this.i;
    if (localso != null) {
      localso.g().c(paramInt);
    }
  }
  
  public final void d()
  {
    if (l())
    {
      this.i.f().stop();
      if (this.i != null)
      {
        a(null, true);
        so localso = this.i;
        if (localso != null)
        {
          localso.a(null);
          this.i.c();
          this.i = null;
        }
        this.m = 1;
        this.l = false;
        this.p = false;
        this.q = false;
      }
    }
    this.d.d();
    this.b.c();
    this.d.a();
  }
  
  public final void d(int paramInt)
  {
    so localso = this.i;
    if (localso != null) {
      localso.g().d(paramInt);
    }
  }
  
  public final String e()
  {
    String str;
    if (this.o) {
      str = " spherical";
    } else {
      str = "";
    }
    if (str.length() != 0) {
      return "ExoPlayer/3".concat(str);
    }
    return new String("ExoPlayer/3");
  }
  
  public final void e(int paramInt)
  {
    so localso = this.i;
    if (localso != null) {
      localso.g().a(paramInt);
    }
  }
  
  public final void f(int paramInt)
  {
    so localso = this.i;
    if (localso != null) {
      localso.g().b(paramInt);
    }
  }
  
  public final void g(int paramInt)
  {
    so localso = this.i;
    if (localso != null) {
      localso.a(paramInt);
    }
  }
  
  public final int getCurrentPosition()
  {
    if (m()) {
      return (int)this.i.f().c();
    }
    return 0;
  }
  
  public final int getDuration()
  {
    if (m()) {
      return (int)this.i.f().getDuration();
    }
    return 0;
  }
  
  public final int getVideoHeight()
  {
    return this.s;
  }
  
  public final int getVideoWidth()
  {
    return this.r;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i1 = getMeasuredWidth();
    paramInt1 = getMeasuredHeight();
    float f1 = this.v;
    int i2 = i1;
    paramInt2 = paramInt1;
    if (f1 != 0.0F)
    {
      i2 = i1;
      paramInt2 = paramInt1;
      if (this.n == null)
      {
        float f2 = i1;
        float f3 = f2 / paramInt1;
        if (f1 > f3) {
          paramInt1 = (int)(f2 / f1);
        }
        f2 = this.v;
        i2 = i1;
        paramInt2 = paramInt1;
        if (f2 < f3)
        {
          i2 = (int)(paramInt1 * f2);
          paramInt2 = paramInt1;
        }
      }
    }
    setMeasuredDimension(i2, paramInt2);
    Object localObject = this.n;
    if (localObject != null) {
      ((un)localObject).a(i2, paramInt2);
    }
    if (Build.VERSION.SDK_INT == 16)
    {
      paramInt1 = this.t;
      if ((paramInt1 <= 0) || (paramInt1 == i2))
      {
        paramInt1 = this.u;
        if ((paramInt1 <= 0) || (paramInt1 == paramInt2)) {}
      }
      else if ((this.e) && (l()))
      {
        localObject = this.i.f();
        if ((((AX)localObject).c() > 0L) && (!((AX)localObject).d()))
        {
          a(0.0F, true);
          ((AX)localObject).a(true);
          long l1 = ((AX)localObject).c();
          long l2 = k.j().a();
          while ((l()) && (((AX)localObject).c() == l1) && (k.j().a() - l2 <= 250L)) {}
          ((AX)localObject).a(false);
          a();
        }
      }
      this.t = i2;
      this.u = paramInt2;
    }
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    SurfaceTexture localSurfaceTexture = paramSurfaceTexture;
    if (this.o)
    {
      this.n = new un(getContext());
      this.n.a(paramSurfaceTexture, paramInt1, paramInt2);
      this.n.start();
      localSurfaceTexture = this.n.c();
      if (localSurfaceTexture == null)
      {
        this.n.b();
        this.n = null;
        localSurfaceTexture = paramSurfaceTexture;
      }
    }
    this.h = new Surface(localSurfaceTexture);
    if (this.i == null)
    {
      q();
    }
    else
    {
      a(this.h, true);
      if (!this.f.a) {
        s();
      }
    }
    if ((this.r != 0) && (this.s != 0)) {
      r();
    } else {
      c(paramInt1, paramInt2);
    }
    vk.a.post(new ho(this));
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    b();
    paramSurfaceTexture = this.n;
    if (paramSurfaceTexture != null)
    {
      paramSurfaceTexture.b();
      this.n = null;
    }
    if (this.i != null)
    {
      t();
      paramSurfaceTexture = this.h;
      if (paramSurfaceTexture != null) {
        paramSurfaceTexture.release();
      }
      this.h = null;
      a(null, true);
    }
    vk.a.post(new jo(this));
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    paramSurfaceTexture = this.n;
    if (paramSurfaceTexture != null) {
      paramSurfaceTexture.a(paramInt1, paramInt2);
    }
    vk.a.post(new io(this, paramInt1, paramInt2));
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    this.d.b(this);
    this.a.a(paramSurfaceTexture, this.g);
  }
  
  protected final void onWindowVisibilityChanged(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder(57);
    localStringBuilder.append("AdExoPlayerView3 window visibility changed to ");
    localStringBuilder.append(paramInt);
    mk.f(localStringBuilder.toString());
    vk.a.post(new ko(this, paramInt));
    super.onWindowVisibilityChanged(paramInt);
  }
  
  public final void setVideoPath(String paramString)
  {
    if (paramString != null)
    {
      this.j = paramString;
      this.k = new String[] { paramString };
      q();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */