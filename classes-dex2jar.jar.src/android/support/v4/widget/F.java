package android.support.v4.widget;

import Dd;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import td;

public class f
  extends Drawable
  implements Animatable
{
  private static final Interpolator a = new LinearInterpolator();
  private static final Interpolator b = new Dd();
  private static final int[] c = { -16777216 };
  private final a d;
  private float e;
  private Resources f;
  private Animator g;
  float h;
  boolean i;
  
  public f(Context paramContext)
  {
    td.a(paramContext);
    this.f = ((Context)paramContext).getResources();
    this.d = new a();
    this.d.a(c);
    c(2.5F);
    a();
  }
  
  private int a(float paramFloat, int paramInt1, int paramInt2)
  {
    int j = paramInt1 >> 24 & 0xFF;
    int k = paramInt1 >> 16 & 0xFF;
    int m = paramInt1 >> 8 & 0xFF;
    paramInt1 &= 0xFF;
    return j + (int)(((paramInt2 >> 24 & 0xFF) - j) * paramFloat) << 24 | k + (int)(((paramInt2 >> 16 & 0xFF) - k) * paramFloat) << 16 | m + (int)(((paramInt2 >> 8 & 0xFF) - m) * paramFloat) << 8 | paramInt1 + (int)(paramFloat * ((paramInt2 & 0xFF) - paramInt1));
  }
  
  private void a()
  {
    a locala = this.d;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    localValueAnimator.addUpdateListener(new d(this, locala));
    localValueAnimator.setRepeatCount(-1);
    localValueAnimator.setRepeatMode(1);
    localValueAnimator.setInterpolator(a);
    localValueAnimator.addListener(new e(this, locala));
    this.g = localValueAnimator;
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a locala = this.d;
    float f1 = this.f.getDisplayMetrics().density;
    locala.f(paramFloat2 * f1);
    locala.b(paramFloat1 * f1);
    locala.c(0);
    locala.a(paramFloat3 * f1, paramFloat4 * f1);
  }
  
  private void b(float paramFloat, a parama)
  {
    a(paramFloat, parama);
    float f1 = (float)(Math.floor(parama.h() / 0.8F) + 1.0D);
    parama.e(parama.i() + (parama.g() - 0.01F - parama.i()) * paramFloat);
    parama.c(parama.g());
    parama.d(parama.h() + (f1 - parama.h()) * paramFloat);
  }
  
  private void d(float paramFloat)
  {
    this.e = paramFloat;
  }
  
  public void a(float paramFloat)
  {
    this.d.a(paramFloat);
    invalidateSelf();
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.d.e(paramFloat1);
    this.d.c(paramFloat2);
    invalidateSelf();
  }
  
  void a(float paramFloat, a parama)
  {
    if (paramFloat > 0.75F) {
      parama.b(a((paramFloat - 0.75F) / 0.25F, parama.f(), parama.c()));
    } else {
      parama.b(parama.f());
    }
  }
  
  void a(float paramFloat, a parama, boolean paramBoolean)
  {
    if (this.i)
    {
      b(paramFloat, parama);
    }
    else if ((paramFloat != 1.0F) || (paramBoolean))
    {
      float f1 = parama.h();
      float f2;
      float f3;
      if (paramFloat < 0.5F)
      {
        f2 = paramFloat / 0.5F;
        f3 = parama.i();
        f2 = b.getInterpolation(f2) * 0.79F + 0.01F + f3;
      }
      else
      {
        f3 = (paramFloat - 0.5F) / 0.5F;
        f2 = parama.i() + 0.79F;
        f3 = f2 - ((1.0F - b.getInterpolation(f3)) * 0.79F + 0.01F);
      }
      float f4 = this.h;
      parama.e(f3);
      parama.c(f2);
      parama.d(f1 + 0.20999998F * paramFloat);
      d((paramFloat + f4) * 216.0F);
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0) {
      a(11.0F, 3.0F, 12.0F, 6.0F);
    } else {
      a(7.5F, 2.5F, 10.0F, 5.0F);
    }
    invalidateSelf();
  }
  
  public void a(boolean paramBoolean)
  {
    this.d.a(paramBoolean);
    invalidateSelf();
  }
  
  public void a(int... paramVarArgs)
  {
    this.d.a(paramVarArgs);
    this.d.c(0);
    invalidateSelf();
  }
  
  public void b(float paramFloat)
  {
    this.d.d(paramFloat);
    invalidateSelf();
  }
  
  public void c(float paramFloat)
  {
    this.d.f(paramFloat);
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    paramCanvas.save();
    paramCanvas.rotate(this.e, localRect.exactCenterX(), localRect.exactCenterY());
    this.d.a(paramCanvas, localRect);
    paramCanvas.restore();
  }
  
  public int getAlpha()
  {
    return this.d.a();
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean isRunning()
  {
    return this.g.isRunning();
  }
  
  public void setAlpha(int paramInt)
  {
    this.d.a(paramInt);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.d.a(paramColorFilter);
    invalidateSelf();
  }
  
  public void start()
  {
    this.g.cancel();
    this.d.l();
    if (this.d.b() != this.d.e())
    {
      this.i = true;
      this.g.setDuration(666L);
      this.g.start();
    }
    else
    {
      this.d.c(0);
      this.d.k();
      this.g.setDuration(1332L);
      this.g.start();
    }
  }
  
  public void stop()
  {
    this.g.cancel();
    d(0.0F);
    this.d.a(false);
    this.d.c(0);
    this.d.k();
    invalidateSelf();
  }
  
  private static class a
  {
    final RectF a = new RectF();
    final Paint b = new Paint();
    final Paint c = new Paint();
    final Paint d = new Paint();
    float e = 0.0F;
    float f = 0.0F;
    float g = 0.0F;
    float h = 5.0F;
    int[] i;
    int j;
    float k;
    float l;
    float m;
    boolean n;
    Path o;
    float p = 1.0F;
    float q;
    int r;
    int s;
    int t = 255;
    int u;
    
    a()
    {
      this.b.setStrokeCap(Paint.Cap.SQUARE);
      this.b.setAntiAlias(true);
      this.b.setStyle(Paint.Style.STROKE);
      this.c.setStyle(Paint.Style.FILL);
      this.c.setAntiAlias(true);
      this.d.setColor(0);
    }
    
    int a()
    {
      return this.t;
    }
    
    void a(float paramFloat)
    {
      if (paramFloat != this.p) {
        this.p = paramFloat;
      }
    }
    
    void a(float paramFloat1, float paramFloat2)
    {
      this.r = ((int)paramFloat1);
      this.s = ((int)paramFloat2);
    }
    
    void a(int paramInt)
    {
      this.t = paramInt;
    }
    
    void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, RectF paramRectF)
    {
      if (this.n)
      {
        Path localPath = this.o;
        if (localPath == null)
        {
          this.o = new Path();
          this.o.setFillType(Path.FillType.EVEN_ODD);
        }
        else
        {
          localPath.reset();
        }
        float f1 = Math.min(paramRectF.width(), paramRectF.height()) / 2.0F;
        float f2 = this.r * this.p / 2.0F;
        this.o.moveTo(0.0F, 0.0F);
        this.o.lineTo(this.r * this.p, 0.0F);
        localPath = this.o;
        float f3 = this.r;
        float f4 = this.p;
        localPath.lineTo(f3 * f4 / 2.0F, this.s * f4);
        this.o.offset(f1 + paramRectF.centerX() - f2, paramRectF.centerY() + this.h / 2.0F);
        this.o.close();
        this.c.setColor(this.u);
        this.c.setAlpha(this.t);
        paramCanvas.save();
        paramCanvas.rotate(paramFloat1 + paramFloat2, paramRectF.centerX(), paramRectF.centerY());
        paramCanvas.drawPath(this.o, this.c);
        paramCanvas.restore();
      }
    }
    
    void a(Canvas paramCanvas, Rect paramRect)
    {
      RectF localRectF = this.a;
      float f1 = this.q;
      float f2 = this.h / 2.0F + f1;
      if (f1 <= 0.0F) {
        f2 = Math.min(paramRect.width(), paramRect.height()) / 2.0F - Math.max(this.r * this.p / 2.0F, this.h / 2.0F);
      }
      localRectF.set(paramRect.centerX() - f2, paramRect.centerY() - f2, paramRect.centerX() + f2, paramRect.centerY() + f2);
      f2 = this.e;
      f1 = this.g;
      f2 = (f2 + f1) * 360.0F;
      f1 = (this.f + f1) * 360.0F - f2;
      this.b.setColor(this.u);
      this.b.setAlpha(this.t);
      float f3 = this.h / 2.0F;
      localRectF.inset(f3, f3);
      paramCanvas.drawCircle(localRectF.centerX(), localRectF.centerY(), localRectF.width() / 2.0F, this.d);
      f3 = -f3;
      localRectF.inset(f3, f3);
      paramCanvas.drawArc(localRectF, f2, f1, false, this.b);
      a(paramCanvas, f2, f1, localRectF);
    }
    
    void a(ColorFilter paramColorFilter)
    {
      this.b.setColorFilter(paramColorFilter);
    }
    
    void a(boolean paramBoolean)
    {
      if (this.n != paramBoolean) {
        this.n = paramBoolean;
      }
    }
    
    void a(int[] paramArrayOfInt)
    {
      this.i = paramArrayOfInt;
      c(0);
    }
    
    float b()
    {
      return this.f;
    }
    
    void b(float paramFloat)
    {
      this.q = paramFloat;
    }
    
    void b(int paramInt)
    {
      this.u = paramInt;
    }
    
    int c()
    {
      return this.i[d()];
    }
    
    void c(float paramFloat)
    {
      this.f = paramFloat;
    }
    
    void c(int paramInt)
    {
      this.j = paramInt;
      this.u = this.i[this.j];
    }
    
    int d()
    {
      return (this.j + 1) % this.i.length;
    }
    
    void d(float paramFloat)
    {
      this.g = paramFloat;
    }
    
    float e()
    {
      return this.e;
    }
    
    void e(float paramFloat)
    {
      this.e = paramFloat;
    }
    
    int f()
    {
      return this.i[this.j];
    }
    
    void f(float paramFloat)
    {
      this.h = paramFloat;
      this.b.setStrokeWidth(paramFloat);
    }
    
    float g()
    {
      return this.l;
    }
    
    float h()
    {
      return this.m;
    }
    
    float i()
    {
      return this.k;
    }
    
    void j()
    {
      c(d());
    }
    
    void k()
    {
      this.k = 0.0F;
      this.l = 0.0F;
      this.m = 0.0F;
      e(0.0F);
      c(0.0F);
      d(0.0F);
    }
    
    void l()
    {
      this.k = this.e;
      this.l = this.f;
      this.m = this.g;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */