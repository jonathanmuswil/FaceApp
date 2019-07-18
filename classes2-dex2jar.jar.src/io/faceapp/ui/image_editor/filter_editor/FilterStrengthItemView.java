package io.faceapp.ui.image_editor.filter_editor;

import BXa;
import CWa;
import NXa;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import io.faceapp.l;
import java.util.Iterator;
import oXa;
import oya;

public final class FilterStrengthItemView
  extends View
{
  private Bitmap a;
  private Bitmap b;
  private int c = -1;
  private int d = -1;
  private int e = -12303292;
  private int f = -12303292;
  private float g;
  private float h;
  private float i;
  private float j;
  private float k;
  private float l;
  private float m;
  private float n;
  private int o = 3;
  private int p = 4;
  private float q;
  private ValueAnimator r;
  private final Paint s;
  private final Paint t;
  
  public FilterStrengthItemView(Context paramContext)
  {
    super(paramContext);
    Paint localPaint = new Paint();
    localPaint.setFilterBitmap(true);
    this.s = localPaint;
    localPaint = new Paint();
    localPaint.setAntiAlias(true);
    this.t = localPaint;
    a(paramContext, null);
  }
  
  public FilterStrengthItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Paint localPaint = new Paint();
    localPaint.setFilterBitmap(true);
    this.s = localPaint;
    localPaint = new Paint();
    localPaint.setAntiAlias(true);
    this.t = localPaint;
    a(paramContext, paramAttributeSet);
  }
  
  public FilterStrengthItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Paint localPaint = new Paint();
    localPaint.setFilterBitmap(true);
    this.s = localPaint;
    localPaint = new Paint();
    localPaint.setAntiAlias(true);
    this.t = localPaint;
    a(paramContext, paramAttributeSet);
  }
  
  private final float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return paramFloat1 + (paramFloat2 - paramFloat1) * paramFloat3;
  }
  
  private final int a(int paramInt1, int paramInt2, float paramFloat)
  {
    return Color.argb(b(Color.alpha(paramInt1), Color.alpha(paramInt2), paramFloat), b(Color.red(paramInt1), Color.red(paramInt2), paramFloat), b(Color.green(paramInt1), Color.green(paramInt2), paramFloat), b(Color.blue(paramInt1), Color.blue(paramInt2), paramFloat));
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    Object localObject1 = null;
    try
    {
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, l.FilterVariantView);
      if (paramAttributeSet != null) {
        try
        {
          this.g = paramAttributeSet.getDimension(13, 0.0F);
          Object localObject2 = paramAttributeSet.getDrawable(12);
          paramContext = (Context)localObject2;
          if (!(localObject2 instanceof BitmapDrawable)) {
            paramContext = null;
          }
          paramContext = (BitmapDrawable)paramContext;
          if (paramContext != null) {
            paramContext = paramContext.getBitmap();
          } else {
            paramContext = null;
          }
          this.a = paramContext;
          localObject2 = paramAttributeSet.getDrawable(11);
          paramContext = (Context)localObject2;
          if (!(localObject2 instanceof BitmapDrawable)) {
            paramContext = null;
          }
          localObject2 = (BitmapDrawable)paramContext;
          paramContext = (Context)localObject1;
          if (localObject2 != null) {
            paramContext = ((BitmapDrawable)localObject2).getBitmap();
          }
          this.b = paramContext;
          this.c = paramAttributeSet.getColor(1, -1);
          this.d = paramAttributeSet.getColor(0, -1);
          this.e = paramAttributeSet.getColor(3, -12303292);
          this.f = paramAttributeSet.getColor(2, -12303292);
          this.h = paramAttributeSet.getDimension(6, 0.0F);
          this.i = paramAttributeSet.getDimension(5, 0.0F);
          this.j = paramAttributeSet.getDimension(8, 0.0F);
          this.k = paramAttributeSet.getDimension(7, 0.0F);
          this.l = paramAttributeSet.getDimension(10, 0.0F);
          this.m = paramAttributeSet.getDimension(9, 0.0F);
          this.n = paramAttributeSet.getDimension(4, 0.0F);
        }
        finally
        {
          break label252;
        }
      }
      if (paramAttributeSet != null) {
        paramAttributeSet.recycle();
      }
      return;
    }
    finally
    {
      paramAttributeSet = null;
      label252:
      if (paramAttributeSet != null) {
        paramAttributeSet.recycle();
      }
    }
  }
  
  private final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    int i1 = (int)('ÿ' * this.q);
    RectF localRectF = new RectF(0.0F, 0.0F, paramFloat1, paramFloat2);
    Bitmap localBitmap = this.b;
    int i2 = 0;
    Object localObject1;
    Object localObject2;
    if (localBitmap != null)
    {
      if (this.q < 1.0F) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      if (i3 == 0) {
        localBitmap = null;
      }
      if (localBitmap != null)
      {
        localObject1 = oya.a(localBitmap);
        localObject2 = this.s;
        ((Paint)localObject2).setAlpha(255);
        paramCanvas.drawBitmap(localBitmap, (Rect)localObject1, localRectF, (Paint)localObject2);
      }
    }
    localBitmap = this.a;
    if (localBitmap != null)
    {
      i3 = i2;
      if (this.q > 0.0F) {
        i3 = 1;
      }
      if (i3 == 0) {
        localBitmap = null;
      }
      if (localBitmap != null)
      {
        localObject2 = oya.a(localBitmap);
        localObject1 = this.s;
        ((Paint)localObject1).setAlpha(i1);
        paramCanvas.drawBitmap(localBitmap, (Rect)localObject2, localRectF, (Paint)localObject1);
      }
    }
    float f1 = a(this.m, this.l, this.q);
    float f2 = a(this.k, this.j, this.q);
    int i3 = Math.max(3, this.p);
    float f3 = i3;
    float f4 = i3 - 1;
    float f5 = this.i;
    float f6 = 2;
    paramCanvas.translate((paramFloat1 - (f3 * f1 + f4 * f2)) / f6, (paramFloat2 - f5) / f6);
    a(paramCanvas, f5, f1, f2, i3);
  }
  
  private final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    paramCanvas = new u(this, paramFloat2, paramFloat3, paramFloat1, paramCanvas);
    int i1 = this.o;
    int i2 = i1;
    if (i1 == this.p) {
      i2 = paramInt;
    }
    Iterator localIterator = NXa.d(1, paramInt + 1).iterator();
    while (localIterator.hasNext())
    {
      i1 = ((CWa)localIterator).nextInt();
      boolean bool;
      if (i2 >= i1) {
        bool = true;
      } else {
        bool = false;
      }
      paramCanvas.a(i1, paramInt, bool);
    }
  }
  
  private final int b(int paramInt1, int paramInt2, float paramFloat)
  {
    return paramInt1 + BXa.a((paramInt2 - paramInt1) * paramFloat);
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.o = paramInt1;
    this.p = paramInt2;
    ValueAnimator localValueAnimator = this.r;
    if (localValueAnimator != null) {
      localValueAnimator.cancel();
    }
    float f1;
    if (paramBoolean) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    float f2 = this.q;
    if (f1 != f2)
    {
      localValueAnimator = ValueAnimator.ofFloat(new float[] { f2, f1 });
      localValueAnimator.addUpdateListener(new t(this));
      localValueAnimator.setDuration(150L);
      localValueAnimator.start();
      this.r = localValueAnimator;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    oXa.b(paramCanvas, "canvas");
    float f1 = a(this.g, 0.0F, this.q);
    float f2 = getWidth() - getPaddingStart() - getPaddingEnd();
    float f3 = getHeight() - getPaddingTop() - getPaddingBottom();
    float f4 = getPaddingStart();
    float f5 = f1 / 2;
    paramCanvas.translate(f4 + f5, getPaddingTop() + f5);
    a(paramCanvas, f2 - f1, f3 - f1);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/FilterStrengthItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */