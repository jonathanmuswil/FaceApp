package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.y;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a
  implements View.OnTouchListener
{
  private static final int a = ;
  final a b = new a();
  private final Interpolator c = new AccelerateInterpolator();
  final View d;
  private Runnable e;
  private float[] f = { 0.0F, 0.0F };
  private float[] g = { Float.MAX_VALUE, Float.MAX_VALUE };
  private int h;
  private int i;
  private float[] j = { 0.0F, 0.0F };
  private float[] k = { 0.0F, 0.0F };
  private float[] l = { Float.MAX_VALUE, Float.MAX_VALUE };
  private boolean m;
  boolean n;
  boolean o;
  boolean p;
  private boolean q;
  private boolean r;
  
  public a(View paramView)
  {
    this.d = paramView;
    float f1 = Resources.getSystem().getDisplayMetrics().density;
    int i1 = (int)(1575.0F * f1 + 0.5F);
    int i2 = (int)(f1 * 315.0F + 0.5F);
    f1 = i1;
    b(f1, f1);
    f1 = i2;
    c(f1, f1);
    d(1);
    a(Float.MAX_VALUE, Float.MAX_VALUE);
    d(0.2F, 0.2F);
    e(1.0F, 1.0F);
    c(a);
    f(500);
    e(500);
  }
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    return paramFloat1;
  }
  
  private float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat3 = a(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    paramFloat1 = f(paramFloat4, paramFloat3);
    paramFloat1 = f(paramFloat2 - paramFloat4, paramFloat3) - paramFloat1;
    if (paramFloat1 < 0.0F)
    {
      paramFloat1 = -this.c.getInterpolation(-paramFloat1);
    }
    else
    {
      if (paramFloat1 <= 0.0F) {
        break label76;
      }
      paramFloat1 = this.c.getInterpolation(paramFloat1);
    }
    return a(paramFloat1, -1.0F, 1.0F);
    label76:
    return 0.0F;
  }
  
  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = a(this.f[paramInt], paramFloat2, this.g[paramInt], paramFloat1);
    boolean bool = f1 < 0.0F;
    if (!bool) {
      return 0.0F;
    }
    float f2 = this.j[paramInt];
    paramFloat1 = this.k[paramInt];
    paramFloat2 = this.l[paramInt];
    paramFloat3 = f2 * paramFloat3;
    if (bool) {
      return a(f1 * paramFloat3, paramFloat1, paramFloat2);
    }
    return -a(-f1 * paramFloat3, paramFloat1, paramFloat2);
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    return paramInt1;
  }
  
  private float f(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {
      return 0.0F;
    }
    int i1 = this.h;
    if ((i1 != 0) && (i1 != 1))
    {
      if ((i1 == 2) && (paramFloat1 < 0.0F)) {
        return paramFloat1 / -paramFloat2;
      }
    }
    else if (paramFloat1 < paramFloat2)
    {
      if (paramFloat1 >= 0.0F) {
        return 1.0F - paramFloat1 / paramFloat2;
      }
      if ((this.p) && (this.h == 1)) {
        return 1.0F;
      }
    }
    return 0.0F;
  }
  
  private void j()
  {
    if (this.n) {
      this.p = false;
    } else {
      this.b.g();
    }
  }
  
  private void k()
  {
    if (this.e == null) {
      this.e = new b();
    }
    this.p = true;
    this.n = true;
    if (!this.m)
    {
      int i1 = this.i;
      if (i1 > 0)
      {
        y.a(this.d, this.e, i1);
        break label70;
      }
    }
    this.e.run();
    label70:
    this.m = true;
  }
  
  public a a(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.g;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public a a(boolean paramBoolean)
  {
    if ((this.q) && (!paramBoolean)) {
      j();
    }
    this.q = paramBoolean;
    return this;
  }
  
  public abstract void a(int paramInt1, int paramInt2);
  
  public abstract boolean a(int paramInt);
  
  public a b(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.l;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public abstract boolean b(int paramInt);
  
  public a c(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.k;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public a c(int paramInt)
  {
    this.i = paramInt;
    return this;
  }
  
  public a d(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.f;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public a d(int paramInt)
  {
    this.h = paramInt;
    return this;
  }
  
  public a e(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.j;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public a e(int paramInt)
  {
    this.b.a(paramInt);
    return this;
  }
  
  public a f(int paramInt)
  {
    this.b.b(paramInt);
    return this;
  }
  
  void h()
  {
    long l1 = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
    this.d.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
  }
  
  boolean i()
  {
    a locala = this.b;
    int i1 = locala.e();
    int i2 = locala.d();
    boolean bool;
    if (((i1 != 0) && (b(i1))) || ((i2 != 0) && (a(i2)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.q;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 != 2) {
          if (i1 != 3) {
            break label140;
          }
        }
      }
      else
      {
        j();
        break label140;
      }
    }
    else
    {
      this.o = true;
      this.m = false;
    }
    float f1 = a(0, paramMotionEvent.getX(), paramView.getWidth(), this.d.getWidth());
    float f2 = a(1, paramMotionEvent.getY(), paramView.getHeight(), this.d.getHeight());
    this.b.a(f1, f2);
    if ((!this.p) && (i())) {
      k();
    }
    label140:
    bool1 = bool2;
    if (this.r)
    {
      bool1 = bool2;
      if (this.p) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private static class a
  {
    private int a;
    private int b;
    private float c;
    private float d;
    private long e = Long.MIN_VALUE;
    private long f = 0L;
    private int g = 0;
    private int h = 0;
    private long i = -1L;
    private float j;
    private int k;
    
    private float a(float paramFloat)
    {
      return -4.0F * paramFloat * paramFloat + paramFloat * 4.0F;
    }
    
    private float a(long paramLong)
    {
      if (paramLong < this.e) {
        return 0.0F;
      }
      long l = this.i;
      if ((l >= 0L) && (paramLong >= l))
      {
        float f1 = this.j;
        return 1.0F - f1 + f1 * a.a((float)(paramLong - l) / this.k, 0.0F, 1.0F);
      }
      return a.a((float)(paramLong - this.e) / this.a, 0.0F, 1.0F) * 0.5F;
    }
    
    public void a()
    {
      if (this.f != 0L)
      {
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        float f1 = a(a(l1));
        long l2 = this.f;
        this.f = l1;
        f1 = (float)(l1 - l2) * f1;
        this.g = ((int)(this.c * f1));
        this.h = ((int)(f1 * this.d));
        return;
      }
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }
    
    public void a(float paramFloat1, float paramFloat2)
    {
      this.c = paramFloat1;
      this.d = paramFloat2;
    }
    
    public void a(int paramInt)
    {
      this.b = paramInt;
    }
    
    public int b()
    {
      return this.g;
    }
    
    public void b(int paramInt)
    {
      this.a = paramInt;
    }
    
    public int c()
    {
      return this.h;
    }
    
    public int d()
    {
      float f1 = this.c;
      return (int)(f1 / Math.abs(f1));
    }
    
    public int e()
    {
      float f1 = this.d;
      return (int)(f1 / Math.abs(f1));
    }
    
    public boolean f()
    {
      boolean bool;
      if ((this.i > 0L) && (AnimationUtils.currentAnimationTimeMillis() > this.i + this.k)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void g()
    {
      long l = AnimationUtils.currentAnimationTimeMillis();
      this.k = a.a((int)(l - this.e), 0, this.b);
      this.j = a(l);
      this.i = l;
    }
    
    public void h()
    {
      this.e = AnimationUtils.currentAnimationTimeMillis();
      this.i = -1L;
      this.f = this.e;
      this.j = 0.5F;
      this.g = 0;
      this.h = 0;
    }
  }
  
  private class b
    implements Runnable
  {
    b() {}
    
    public void run()
    {
      a locala = a.this;
      if (!locala.p) {
        return;
      }
      if (locala.n)
      {
        locala.n = false;
        locala.b.h();
      }
      a.a locala1 = a.this.b;
      if ((!locala1.f()) && (a.this.i()))
      {
        locala = a.this;
        if (locala.o)
        {
          locala.o = false;
          locala.h();
        }
        locala1.a();
        int i = locala1.b();
        int j = locala1.c();
        a.this.a(i, j);
        y.a(a.this.d, this);
        return;
      }
      a.this.p = false;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */