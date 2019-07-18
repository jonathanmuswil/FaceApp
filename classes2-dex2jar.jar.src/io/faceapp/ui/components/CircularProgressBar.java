package io.faceapp.ui.components;

import GVa;
import QQa;
import XQa;
import _Va;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import io.faceapp.l;
import oXa;
import xQa;

public final class CircularProgressBar
  extends View
{
  public static final a a = new a(null);
  private final f b = new f();
  private final RectF c = new RectF();
  private final ValueAnimator d = new ValueAnimator();
  private final ValueAnimator e = new ValueAnimator();
  private final ValueAnimator f = new ValueAnimator();
  private final Paint g = new Paint(1);
  private final Paint h = new Paint(1);
  private int i;
  private float j;
  private float k;
  private float l;
  private float m;
  private float n;
  private float o;
  private float p;
  private float q;
  private boolean r;
  private boolean s;
  private boolean t;
  private boolean u;
  private boolean v;
  private float w;
  private final GVa<Object> x;
  
  public CircularProgressBar(Context paramContext)
  {
    super(paramContext);
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create<Any>()");
    this.x = localGVa;
    a(paramContext, null, 0, 0);
  }
  
  public CircularProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create<Any>()");
    this.x = localGVa;
    a(paramContext, paramAttributeSet, 0, 0);
  }
  
  public CircularProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create<Any>()");
    this.x = localGVa;
    a(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public CircularProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create<Any>()");
    this.x = localGVa;
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    float f1;
    if (this.t) {
      f1 = Math.max(this.g.getStrokeWidth(), this.h.getStrokeWidth());
    } else {
      f1 = this.g.getStrokeWidth();
    }
    float f2;
    RectF localRectF;
    if (paramInt1 > paramInt2)
    {
      f2 = (paramInt1 - paramInt2) / 2.0F;
      localRectF = this.c;
      f1 /= 2.0F;
      localRectF.set(f2 + f1 + 1.0F, f1 + 1.0F, paramInt1 - f2 - f1 - 1.0F, paramInt2 - f1 - 1.0F);
    }
    else if (paramInt1 < paramInt2)
    {
      f2 = (paramInt2 - paramInt1) / 2.0F;
      localRectF = this.c;
      f1 /= 2.0F;
      localRectF.set(f1 + 1.0F, f2 + f1 + 1.0F, paramInt1 - f1 - 1.0F, paramInt2 - f2 - f1 - 1.0F);
    }
    else
    {
      localRectF = this.c;
      f1 /= 2.0F;
      f2 = f1 + 1.0F;
      localRectF.set(f2, f2, paramInt1 - f1 - 1.0F, paramInt2 - f1 - 1.0F);
    }
    d();
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.g.setStyle(Paint.Style.STROKE);
    this.h.setStyle(Paint.Style.STROKE);
    Object localObject = paramContext.getResources();
    oXa.a(localObject, "context.resources");
    localObject = ((Resources)localObject).getDisplayMetrics();
    this.i = Math.round(((DisplayMetrics)localObject).density * 48.0F);
    if (paramAttributeSet == null)
    {
      this.j = 100.0F;
      this.k = 0.0F;
      this.l = 270.0F;
      this.p = 60.0F;
      this.d.setDuration(100);
      this.r = false;
      this.s = true;
      this.t = false;
      this.g.setColor(-16776961);
      this.g.setStrokeWidth(Math.round(((DisplayMetrics)localObject).density * 3.0F));
      this.g.setStrokeCap(a.a(a, 0));
      this.h.setColor(-16777216);
      this.h.setStrokeWidth(Math.round(((DisplayMetrics)localObject).density * 1.0F));
      this.e.setDuration('Ұ');
      this.f.setDuration('ɘ');
    }
    try
    {
      paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, l.CircularProgressBar, paramInt1, paramInt2);
      if (paramAttributeSet != null) {
        try
        {
          this.j = paramAttributeSet.getFloat(11, 100.0F);
          this.k = paramAttributeSet.getFloat(12, 0.0F);
          float f1 = paramAttributeSet.getFloat(14, 270.0F);
          a.b(a, f1);
          this.l = f1;
          f1 = paramAttributeSet.getFloat(8, 60.0F);
          a.a(a, f1);
          this.p = f1;
          long l1 = paramAttributeSet.getInteger(13, 100);
          a.a(a, l1);
          this.d.setDuration(l1);
          l1 = paramAttributeSet.getInteger(9, 1200);
          a.a(a, l1);
          this.e.setDuration(l1);
          l1 = paramAttributeSet.getInteger(10, 600);
          a.a(a, l1);
          this.f.setDuration(l1);
          this.g.setColor(paramAttributeSet.getColor(5, -16776961));
          this.h.setColor(paramAttributeSet.getColor(1, -16777216));
          f1 = paramAttributeSet.getDimension(6, Math.round(((DisplayMetrics)localObject).density * 3.0F));
          a.c(a, f1);
          this.g.setStrokeWidth(f1);
          this.g.setStrokeCap(a.a(a, paramAttributeSet.getInt(4, 0)));
          f1 = paramAttributeSet.getDimension(2, Math.round(((DisplayMetrics)localObject).density * 1.0F));
          a.c(a, f1);
          this.h.setStrokeWidth(f1);
          this.s = paramAttributeSet.getBoolean(0, true);
          this.t = paramAttributeSet.getBoolean(3, false);
          this.r = paramAttributeSet.getBoolean(7, false);
          paramAttributeSet.recycle();
          this.d.setInterpolator(new DecelerateInterpolator());
          this.d.addUpdateListener(new c());
          this.d.addListener(new b());
          this.e.setFloatValues(new float[] { 360.0F });
          this.e.setRepeatMode(1);
          this.e.setRepeatCount(-1);
          this.e.setInterpolator(new LinearInterpolator());
          this.e.addUpdateListener(new d());
          this.f.setFloatValues(new float[] { 360.0F - this.p * 2.0F });
          this.f.setInterpolator(new DecelerateInterpolator());
          this.f.addUpdateListener(new g());
          this.f.addListener(new e());
          return;
        }
        finally
        {
          break label722;
        }
      }
      oXa.a();
      throw null;
    }
    finally
    {
      paramAttributeSet = null;
      label722:
      if (paramAttributeSet != null) {
        paramAttributeSet.recycle();
      }
    }
  }
  
  private final void c()
  {
    int i1 = getWidth();
    int i2 = getHeight();
    if ((i1 > 0) && (i2 > 0)) {
      a(i1, i2);
    }
  }
  
  private final void d()
  {
    Paint.Cap localCap = this.g.getStrokeCap();
    if (localCap == null)
    {
      this.q = 0.0F;
      return;
    }
    int i1 = g.a[localCap.ordinal()];
    if ((i1 != 1) && (i1 != 2))
    {
      if (i1 != 3) {
        this.q = 0.0F;
      } else {
        this.q = 0.0F;
      }
    }
    else
    {
      float f1 = this.c.width() / 2.0F;
      if (f1 != 0.0F) {
        this.q = (this.g.getStrokeWidth() * 90.0F / (float)3.141592653589793D / f1);
      } else {
        this.q = 0.0F;
      }
    }
  }
  
  private final void e()
  {
    if (!this.e.isRunning()) {
      this.e.start();
    }
    if (!this.f.isRunning()) {
      this.f.start();
    }
  }
  
  private final void f()
  {
    if (this.e.isRunning()) {
      this.e.cancel();
    }
    if (this.f.isRunning()) {
      this.f.cancel();
    }
  }
  
  private final void g()
  {
    if (this.d.isRunning()) {
      this.d.cancel();
    }
  }
  
  private final void setProgressAnimated(float paramFloat)
  {
    this.d.setFloatValues(new float[] { this.k, paramFloat });
    this.d.start();
  }
  
  private final void setProgressInternal(float paramFloat)
  {
    this.k = paramFloat;
    invalidate();
  }
  
  public final xQa a()
  {
    xQa localxQa;
    if (!this.d.isRunning())
    {
      localxQa = xQa.e();
      oXa.a(localxQa, "Completable.complete()");
    }
    else
    {
      localxQa = this.x.h().f();
      oXa.a(localxQa, "mAnimationEndSubject.fir…OrError().toCompletable()");
    }
    return localxQa;
  }
  
  public final void b()
  {
    boolean bool = this.s;
    setAnimateProgress(false);
    setProgress(0.0F);
    setAnimateProgress(bool);
  }
  
  public final float getAfterAnimProgress()
  {
    return this.w;
  }
  
  public final float getMaximum()
  {
    return this.j;
  }
  
  public final float getProgress()
  {
    return this.k;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.v = true;
    if (this.r) {
      e();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.v = false;
    f();
    g();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    oXa.b(paramCanvas, "canvas");
    if (this.t) {
      paramCanvas.drawOval(this.c, this.h);
    }
    float f3;
    float f4;
    if (this.r)
    {
      f1 = this.m;
      f2 = this.n;
      f3 = this.o;
      f4 = this.p;
      if (this.u)
      {
        f3 = f1 - f3;
        f4 = f2 + f4;
      }
      else
      {
        f3 = f1 + f2 - f3;
        f4 = 360.0F - f2 - f4;
      }
    }
    else
    {
      f2 = this.j;
      f4 = this.k;
      f3 = this.l;
      if (Math.abs(f4) < Math.abs(f2)) {
        f4 = f4 / f2 * 360.0F;
      } else {
        f4 = 360.0F;
      }
    }
    float f5 = this.q;
    float f1 = f3;
    float f2 = f4;
    if (f5 != 0.0F)
    {
      f1 = f3;
      f2 = f4;
      if (Math.abs(f4) != 360.0F)
      {
        float f6 = 0;
        if (f4 > f6)
        {
          f1 = f3 + f5;
          f2 = f4 - f5 * 2.0F;
        }
        else
        {
          f1 = f3;
          f2 = f4;
          if (f4 < f6)
          {
            f1 = f3 - f5;
            f2 = f4 + f5 * 2.0F;
          }
        }
      }
    }
    paramCanvas.drawArc(this.c, f1, f2, false, this.g);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    int i3 = this.i;
    int i4 = Math.max(getSuggestedMinimumWidth(), i3);
    i3 = Math.max(getSuggestedMinimumHeight(), i3);
    if (i1 != Integer.MIN_VALUE)
    {
      if ((i1 == 0) || (i1 != 1073741824)) {
        paramInt1 = i4;
      }
    }
    else {
      paramInt1 = Math.min(i4, paramInt1);
    }
    if (i2 != Integer.MIN_VALUE)
    {
      if ((i2 == 0) || (i2 != 1073741824)) {
        paramInt2 = i3;
      }
    }
    else {
      paramInt2 = Math.min(i3, paramInt2);
    }
    setMeasuredDimension(paramInt1, paramInt2);
    a(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramInt1, paramInt2);
  }
  
  public void onVisibilityAggregated(boolean paramBoolean)
  {
    super.onVisibilityAggregated(paramBoolean);
    this.v = paramBoolean;
    if (this.r) {
      if (paramBoolean) {
        e();
      } else {
        f();
      }
    }
  }
  
  public final void setAnimateProgress(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }
  
  public final void setBackgroundStrokeColor(int paramInt)
  {
    this.g.setColor(paramInt);
    invalidate();
  }
  
  public final void setBackgroundStrokeWidth(float paramFloat)
  {
    a.c(a, paramFloat);
    this.h.setStrokeWidth(paramFloat);
    c();
    invalidate();
  }
  
  public final void setDrawBackgroundStroke(boolean paramBoolean)
  {
    this.t = paramBoolean;
    c();
    invalidate();
  }
  
  public final void setForegroundStrokeCap(Paint.Cap paramCap)
  {
    oXa.b(paramCap, "cap");
    this.g.setStrokeCap(paramCap);
    d();
    invalidate();
  }
  
  public final void setForegroundStrokeColor(int paramInt)
  {
    this.g.setColor(paramInt);
    invalidate();
  }
  
  public final void setForegroundStrokeWidth(float paramFloat)
  {
    a.c(a, paramFloat);
    this.g.setStrokeWidth(paramFloat);
    c();
    invalidate();
  }
  
  public final void setIndeterminate(boolean paramBoolean)
  {
    f();
    this.r = paramBoolean;
    invalidate();
    if ((this.v) && (paramBoolean)) {
      e();
    }
  }
  
  public final void setIndeterminateMinimumAngle(float paramFloat)
  {
    a.a(a, paramFloat);
    f();
    this.p = paramFloat;
    this.f.setFloatValues(new float[] { 360.0F - paramFloat * 2.0F });
    invalidate();
    if ((this.v) && (this.r)) {
      e();
    }
  }
  
  public final void setIndeterminateRotationAnimationDuration(long paramLong)
  {
    a.a(a, paramLong);
    f();
    this.e.setDuration(paramLong);
    invalidate();
    if ((this.v) && (this.r)) {
      e();
    }
  }
  
  public final void setIndeterminateSweepAnimationDuration(long paramLong)
  {
    a.a(a, paramLong);
    f();
    this.f.setDuration(paramLong);
    invalidate();
    if ((this.v) && (this.r)) {
      e();
    }
  }
  
  public final void setMaximum(float paramFloat)
  {
    this.j = paramFloat;
    invalidate();
  }
  
  public final void setProgress(float paramFloat)
  {
    this.w = paramFloat;
    if (this.r)
    {
      this.k = paramFloat;
    }
    else
    {
      g();
      if ((this.v) && (this.s)) {
        setProgressAnimated(paramFloat);
      } else {
        setProgressInternal(paramFloat);
      }
    }
  }
  
  public final void setProgressAnimationDuration(long paramLong)
  {
    a.a(a, paramLong);
    if ((this.v) && (this.d.isRunning())) {
      this.d.end();
    }
    this.d.setDuration(paramLong);
  }
  
  public final void setStartAngle(float paramFloat)
  {
    a.b(a, paramFloat);
    this.l = paramFloat;
    invalidate();
  }
  
  public static final class a
  {
    private final Paint.Cap a(int paramInt)
    {
      Paint.Cap localCap;
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2) {
            localCap = Paint.Cap.BUTT;
          } else {
            localCap = Paint.Cap.SQUARE;
          }
        }
        else {
          localCap = Paint.Cap.ROUND;
        }
      }
      else {
        localCap = Paint.Cap.BUTT;
      }
      return localCap;
    }
    
    private final void a(float paramFloat)
    {
      if ((paramFloat >= 0.0F) && (paramFloat <= 180.0F)) {
        return;
      }
      throw new IllegalArgumentException("Indeterminate minimum angle value should be between 0 and 180 degrees (inclusive)");
    }
    
    private final void a(long paramLong)
    {
      if (paramLong >= 0L) {
        return;
      }
      throw new IllegalArgumentException("Animation duration can't be negative");
    }
    
    private final void b(float paramFloat)
    {
      if ((paramFloat >= -360.0F) && (paramFloat <= 360.0F)) {
        return;
      }
      throw new IllegalArgumentException("Start angle value should be between -360 and 360 degrees (inclusive)");
    }
    
    private final void c(float paramFloat)
    {
      if (paramFloat >= 0.0F) {
        return;
      }
      throw new IllegalArgumentException("Width can't be negative");
    }
  }
  
  private final class b
    implements Animator.AnimatorListener
  {
    public void onAnimationCancel(Animator paramAnimator) {}
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      CircularProgressBar.a(this.a).a(new Object());
    }
    
    public void onAnimationRepeat(Animator paramAnimator) {}
    
    public void onAnimationStart(Animator paramAnimator) {}
  }
  
  private final class c
    implements ValueAnimator.AnimatorUpdateListener
  {
    public void onAnimationUpdate(ValueAnimator paramValueAnimator)
    {
      oXa.b(paramValueAnimator, "animation");
      CircularProgressBar localCircularProgressBar = this.a;
      paramValueAnimator = paramValueAnimator.getAnimatedValue();
      if (paramValueAnimator != null)
      {
        CircularProgressBar.d(localCircularProgressBar, ((Float)paramValueAnimator).floatValue());
        return;
      }
      throw new _Va("null cannot be cast to non-null type kotlin.Float");
    }
  }
  
  private final class d
    implements ValueAnimator.AnimatorUpdateListener
  {
    public void onAnimationUpdate(ValueAnimator paramValueAnimator)
    {
      oXa.b(paramValueAnimator, "animation");
      CircularProgressBar localCircularProgressBar = this.a;
      paramValueAnimator = paramValueAnimator.getAnimatedValue();
      if (paramValueAnimator != null)
      {
        CircularProgressBar.b(localCircularProgressBar, ((Float)paramValueAnimator).floatValue());
        this.a.invalidate();
        return;
      }
      throw new _Va("null cannot be cast to non-null type kotlin.Float");
    }
  }
  
  private final class e
    implements Animator.AnimatorListener
  {
    private boolean a;
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      oXa.b(paramAnimator, "animation");
      this.a = true;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      oXa.b(paramAnimator, "animation");
      if (!this.a)
      {
        paramAnimator = this.b;
        paramAnimator.post(CircularProgressBar.f(paramAnimator));
      }
    }
    
    public void onAnimationRepeat(Animator paramAnimator)
    {
      oXa.b(paramAnimator, "animation");
    }
    
    public void onAnimationStart(Animator paramAnimator)
    {
      oXa.b(paramAnimator, "animation");
      this.a = false;
    }
  }
  
  private final class f
    implements Runnable
  {
    public void run()
    {
      CircularProgressBar localCircularProgressBar = this.a;
      CircularProgressBar.a(localCircularProgressBar, CircularProgressBar.b(localCircularProgressBar) ^ true);
      if (CircularProgressBar.b(this.a))
      {
        localCircularProgressBar = this.a;
        CircularProgressBar.a(localCircularProgressBar, (CircularProgressBar.d(localCircularProgressBar) + CircularProgressBar.c(this.a) * 2.0F) % 360.0F);
      }
      if (CircularProgressBar.e(this.a).isRunning()) {
        CircularProgressBar.e(this.a).cancel();
      }
      if (CircularProgressBar.g(this.a)) {
        CircularProgressBar.e(this.a).start();
      }
    }
  }
  
  private final class g
    implements ValueAnimator.AnimatorUpdateListener
  {
    public void onAnimationUpdate(ValueAnimator paramValueAnimator)
    {
      oXa.b(paramValueAnimator, "animation");
      CircularProgressBar localCircularProgressBar = this.a;
      paramValueAnimator = paramValueAnimator.getAnimatedValue();
      if (paramValueAnimator != null)
      {
        CircularProgressBar.c(localCircularProgressBar, ((Float)paramValueAnimator).floatValue());
        return;
      }
      throw new _Va("null cannot be cast to non-null type kotlin.Float");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/CircularProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */