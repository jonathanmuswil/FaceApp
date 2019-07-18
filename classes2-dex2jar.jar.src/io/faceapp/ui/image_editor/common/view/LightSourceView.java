package io.faceapp.ui.image_editor.common.view;

import _Va;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import cWa;
import cXa;
import io.faceapp.l;
import oXa;
import oya;

public final class LightSourceView
  extends View
{
  private final PointF a = new PointF();
  private int b = -1;
  private int c = -1;
  private float d = 1.0F;
  private float e = 100.0F;
  private cXa<? super PointF, cWa> f = h.b;
  private ValueAnimator g;
  private final RectF h = new RectF();
  private final Paint i;
  
  public LightSourceView(Context paramContext)
  {
    super(paramContext);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    this.i = localPaint;
    a(paramContext, null);
  }
  
  public LightSourceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    this.i = localPaint;
    a(paramContext, paramAttributeSet);
  }
  
  public LightSourceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    this.i = localPaint;
    a(paramContext, paramAttributeSet);
  }
  
  private final void a(float paramFloat1, float paramFloat2)
  {
    oya.b(this.a, paramFloat1);
    oya.a(this.a, paramFloat2);
    invalidate();
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    Context localContext = null;
    try
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, l.LightSourceView);
      if (paramContext != null)
      {
        localContext = paramContext;
        this.b = paramContext.getColor(2, -1);
        localContext = paramContext;
        this.c = paramContext.getColor(0, -1);
        localContext = paramContext;
        this.d = paramContext.getDimension(3, 1.0F);
        localContext = paramContext;
        this.e = paramContext.getDimension(1, 100.0F);
      }
      return;
    }
    finally
    {
      if (localContext != null) {
        localContext.recycle();
      }
    }
  }
  
  public final LightSourceView a(cXa<? super PointF, cWa> paramcXa)
  {
    oXa.b(paramcXa, "changedFunc");
    this.f = paramcXa;
    return this;
  }
  
  public final void a(PointF paramPointF, boolean paramBoolean)
  {
    oXa.b(paramPointF, "target");
    ValueAnimator localValueAnimator = this.g;
    if (localValueAnimator != null) {
      localValueAnimator.cancel();
    }
    if (paramBoolean)
    {
      localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      localValueAnimator.addUpdateListener(new a(this.a, paramPointF));
      localValueAnimator.start();
      this.g = localValueAnimator;
    }
    else
    {
      a(oya.b(paramPointF), oya.a(paramPointF));
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    oXa.b(paramCanvas, "canvas");
    super.onDraw(paramCanvas);
    int j = getPaddingLeft() + getPaddingRight();
    int k = getPaddingTop() + getPaddingBottom();
    float f1 = Math.min(getWidth() - j, getHeight() - k) / 2.0F - this.e / 6.0F;
    float f2 = getPaddingLeft();
    float f3 = (getWidth() - j) / 2.0F;
    float f4 = getPaddingTop();
    float f5 = (getHeight() - k) / 2.0F;
    f3 = f2 + f3 - f1 + f1;
    f4 = f4 + f5 - f1 + f1;
    f5 = this.e / 2.0F;
    float f6 = 2;
    f2 = oya.b(this.a);
    float f7 = oya.b(this.a);
    Object localObject = this.h;
    f2 = f5 / (f6 * f2 * f7 + 1.0F);
    ((RectF)localObject).set(f3 - f5, f4 - f2, f5 + f3, f2 + f4);
    paramCanvas.save();
    paramCanvas.rotate(oya.a(this.a), f3, f4);
    paramCanvas.translate(0.0F, f1 * oya.b(this.a));
    localObject = this.i;
    ((Paint)localObject).setColor(this.c);
    ((Paint)localObject).setStyle(Paint.Style.FILL);
    paramCanvas.drawOval(this.h, this.i);
    localObject = this.i;
    ((Paint)localObject).setColor(this.b);
    ((Paint)localObject).setStyle(Paint.Style.STROKE);
    ((Paint)localObject).setStrokeWidth(this.d);
    paramCanvas.drawOval(this.h, this.i);
    paramCanvas.restore();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    oXa.b(paramMotionEvent, "event");
    if (paramMotionEvent.getActionMasked() == 2)
    {
      int j = getPaddingLeft() + getPaddingRight();
      int k = getPaddingTop() + getPaddingBottom();
      float f1 = getPaddingLeft() + (getWidth() - j) / 2.0F;
      float f2 = getPaddingTop() + (getHeight() - k) / 2.0F;
      float f3 = Math.min(getWidth() - j, getHeight() - k) / 2.0F;
      float f4 = Math.min(1.0F, (float)Math.sqrt((paramMotionEvent.getX() - f1) * (paramMotionEvent.getX() - f1) + (paramMotionEvent.getY() - f2) * (paramMotionEvent.getY() - f2)) / f3);
      f3 = paramMotionEvent.getX();
      float f5 = paramMotionEvent.getY();
      a(f4, (float)Math.atan2(f3 - f1, f5 - f2) * -180.0F / (float)3.141592653589793D);
      this.f.a(this.a);
    }
    return true;
  }
  
  public final class a
    implements ValueAnimator.AnimatorUpdateListener
  {
    private final PointF a;
    private final PointF b;
    private final PointF c;
    
    public a(PointF paramPointF)
    {
      this.a = new PointF(paramPointF.x, paramPointF.y);
      this.b = new PointF(((PointF)localObject).x, ((PointF)localObject).y);
      this.c = new PointF();
    }
    
    public void onAnimationUpdate(ValueAnimator paramValueAnimator)
    {
      oXa.b(paramValueAnimator, "animation");
      paramValueAnimator = paramValueAnimator.getAnimatedValue();
      if (paramValueAnimator != null)
      {
        float f1 = ((Float)paramValueAnimator).floatValue();
        PointF localPointF1 = this.c;
        paramValueAnimator = this.a;
        float f2 = paramValueAnimator.x;
        float f3 = 1.0F - f1;
        PointF localPointF2 = this.b;
        localPointF1.x = (f2 * f3 + localPointF2.x * f1);
        localPointF1.y = (paramValueAnimator.y * f3 + localPointF2.y * f1);
        LightSourceView.a(LightSourceView.this, localPointF1.x, localPointF1.y);
        return;
      }
      throw new _Va("null cannot be cast to non-null type kotlin.Float");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/LightSourceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */