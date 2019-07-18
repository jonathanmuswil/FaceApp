package com.theartofdev.edmodo.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View;
import android.view.ViewParent;
import java.util.Arrays;

public class CropOverlayView
  extends View
{
  private final Rect A = new Rect();
  private boolean B;
  private Integer C;
  private ScaleGestureDetector a;
  private boolean b;
  private final i c = new i();
  private a d;
  private final RectF e = new RectF();
  private Paint f;
  private Paint g;
  private Paint h;
  private Paint i;
  private Path j = new Path();
  private final float[] k = new float[8];
  private final RectF l = new RectF();
  private int m;
  private int n;
  private float o;
  private float p;
  private float q;
  private float r;
  private float s;
  private k t;
  private boolean u;
  private int v;
  private int w;
  private float x = this.v / this.w;
  private CropImageView.c y;
  private CropImageView.b z;
  
  public CropOverlayView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CropOverlayView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private static Paint a(float paramFloat, int paramInt)
  {
    if (paramFloat > 0.0F)
    {
      Paint localPaint = new Paint();
      localPaint.setColor(paramInt);
      localPaint.setStrokeWidth(paramFloat);
      localPaint.setStyle(Paint.Style.STROKE);
      localPaint.setAntiAlias(true);
      return localPaint;
    }
    return null;
  }
  
  private static Paint a(int paramInt)
  {
    Paint localPaint = new Paint();
    localPaint.setColor(paramInt);
    return localPaint;
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    this.t = this.c.a(paramFloat1, paramFloat2, this.r, this.z);
    if (this.t != null) {
      invalidate();
    }
  }
  
  private void a(Canvas paramCanvas)
  {
    RectF localRectF = this.c.e();
    float f1 = Math.max(c.e(this.k), 0.0F);
    float f2 = Math.max(c.g(this.k), 0.0F);
    float f3 = Math.min(c.f(this.k), getWidth());
    float f4 = Math.min(c.a(this.k), getHeight());
    if (this.z == CropImageView.b.a)
    {
      if ((f()) && (Build.VERSION.SDK_INT > 17))
      {
        this.j.reset();
        Object localObject1 = this.j;
        Object localObject2 = this.k;
        ((Path)localObject1).moveTo(localObject2[0], localObject2[1]);
        localObject2 = this.j;
        localObject1 = this.k;
        ((Path)localObject2).lineTo(localObject1[2], localObject1[3]);
        localObject2 = this.j;
        localObject1 = this.k;
        ((Path)localObject2).lineTo(localObject1[4], localObject1[5]);
        localObject2 = this.j;
        localObject1 = this.k;
        ((Path)localObject2).lineTo(localObject1[6], localObject1[7]);
        this.j.close();
        paramCanvas.save();
        paramCanvas.clipPath(this.j, Region.Op.INTERSECT);
        paramCanvas.clipRect(localRectF, Region.Op.XOR);
        paramCanvas.drawRect(f1, f2, f3, f4, this.i);
        paramCanvas.restore();
      }
      else
      {
        paramCanvas.drawRect(f1, f2, f3, localRectF.top, this.i);
        paramCanvas.drawRect(f1, localRectF.bottom, f3, f4, this.i);
        paramCanvas.drawRect(f1, localRectF.top, localRectF.left, localRectF.bottom, this.i);
        paramCanvas.drawRect(localRectF.right, localRectF.top, f3, localRectF.bottom, this.i);
      }
    }
    else
    {
      this.j.reset();
      if ((Build.VERSION.SDK_INT <= 17) && (this.z == CropImageView.b.b)) {
        this.e.set(localRectF.left + 2.0F, localRectF.top + 2.0F, localRectF.right - 2.0F, localRectF.bottom - 2.0F);
      } else {
        this.e.set(localRectF.left, localRectF.top, localRectF.right, localRectF.bottom);
      }
      this.j.addOval(this.e, Path.Direction.CW);
      paramCanvas.save();
      paramCanvas.clipPath(this.j, Region.Op.XOR);
      paramCanvas.drawRect(f1, f2, f3, f4, this.i);
      paramCanvas.restore();
    }
  }
  
  private boolean a(RectF paramRectF)
  {
    float f1 = c.e(this.k);
    float f2 = c.g(this.k);
    float f3 = c.f(this.k);
    float f4 = c.a(this.k);
    if (!f())
    {
      this.l.set(f1, f2, f3, f4);
      return false;
    }
    float[] arrayOfFloat = this.k;
    float f5 = arrayOfFloat[0];
    float f6 = arrayOfFloat[1];
    float f7 = arrayOfFloat[4];
    float f8 = arrayOfFloat[5];
    float f9 = arrayOfFloat[6];
    float f10 = arrayOfFloat[7];
    if (arrayOfFloat[7] < arrayOfFloat[1])
    {
      if (arrayOfFloat[1] < arrayOfFloat[3])
      {
        f5 = arrayOfFloat[6];
        f6 = arrayOfFloat[7];
        f7 = arrayOfFloat[2];
        f8 = arrayOfFloat[3];
        f9 = arrayOfFloat[4];
        f10 = arrayOfFloat[5];
      }
      else
      {
        f5 = arrayOfFloat[4];
        f6 = arrayOfFloat[5];
        f7 = arrayOfFloat[0];
        f8 = arrayOfFloat[1];
        f9 = arrayOfFloat[2];
        f10 = arrayOfFloat[3];
      }
    }
    else if (arrayOfFloat[1] > arrayOfFloat[3])
    {
      f5 = arrayOfFloat[2];
      f6 = arrayOfFloat[3];
      f7 = arrayOfFloat[6];
      f8 = arrayOfFloat[7];
      f9 = arrayOfFloat[0];
      f10 = arrayOfFloat[1];
    }
    f10 = (f10 - f6) / (f9 - f5);
    f9 = -1.0F / f10;
    float f11 = f6 - f10 * f5;
    float f12 = f6 - f5 * f9;
    f6 = f8 - f10 * f7;
    f8 -= f7 * f9;
    float f13 = paramRectF.centerY();
    float f14 = paramRectF.top;
    f7 = paramRectF.centerX();
    f5 = paramRectF.left;
    float f15 = (f13 - f14) / (f7 - f5);
    float f16 = -f15;
    f13 = paramRectF.top;
    f14 = f13 - f5 * f15;
    f7 = paramRectF.right;
    float f17 = f13 - f16 * f7;
    f13 = f10 - f15;
    f5 = (f14 - f11) / f13;
    if (f5 >= f7) {
      f5 = f1;
    }
    f7 = Math.max(f1, f5);
    f5 = (f14 - f12) / (f9 - f15);
    if (f5 >= paramRectF.right) {
      f5 = f7;
    }
    f7 = Math.max(f7, f5);
    f15 = f9 - f16;
    f5 = (f17 - f8) / f15;
    if (f5 >= paramRectF.right) {
      f5 = f7;
    }
    f1 = Math.max(f7, f5);
    f5 = (f17 - f12) / f15;
    if (f5 <= paramRectF.left) {
      f5 = f3;
    }
    f7 = Math.min(f3, f5);
    f5 = (f17 - f6) / (f10 - f16);
    if (f5 <= paramRectF.left) {
      f5 = f7;
    }
    f7 = Math.min(f7, f5);
    f5 = (f14 - f6) / f13;
    if (f5 <= paramRectF.left) {
      f5 = f7;
    }
    f5 = Math.min(f7, f5);
    f7 = Math.max(f2, Math.max(f10 * f1 + f11, f9 * f5 + f12));
    f6 = Math.min(f4, Math.min(f9 * f1 + f8, f10 * f5 + f6));
    paramRectF = this.l;
    paramRectF.left = f1;
    paramRectF.top = f7;
    paramRectF.right = f5;
    paramRectF.bottom = f6;
    return true;
  }
  
  private void b(float paramFloat1, float paramFloat2)
  {
    if (this.t != null)
    {
      float f1 = this.s;
      RectF localRectF = this.c.e();
      if (a(localRectF)) {
        f1 = 0.0F;
      }
      this.t.a(localRectF, paramFloat1, paramFloat2, this.l, this.m, this.n, f1, this.u, this.x);
      this.c.a(localRectF);
      b(true);
      invalidate();
    }
  }
  
  private void b(Canvas paramCanvas)
  {
    Object localObject = this.f;
    if (localObject != null)
    {
      float f1 = ((Paint)localObject).getStrokeWidth();
      localObject = this.c.e();
      f1 /= 2.0F;
      ((RectF)localObject).inset(f1, f1);
      if (this.z == CropImageView.b.a) {
        paramCanvas.drawRect((RectF)localObject, this.f);
      } else {
        paramCanvas.drawOval((RectF)localObject, this.f);
      }
    }
  }
  
  private void b(RectF paramRectF)
  {
    float f1;
    if (paramRectF.width() < this.c.d())
    {
      f1 = (this.c.d() - paramRectF.width()) / 2.0F;
      paramRectF.left -= f1;
      paramRectF.right += f1;
    }
    if (paramRectF.height() < this.c.c())
    {
      f1 = (this.c.c() - paramRectF.height()) / 2.0F;
      paramRectF.top -= f1;
      paramRectF.bottom += f1;
    }
    if (paramRectF.width() > this.c.b())
    {
      f1 = (paramRectF.width() - this.c.b()) / 2.0F;
      paramRectF.left += f1;
      paramRectF.right -= f1;
    }
    if (paramRectF.height() > this.c.a())
    {
      f1 = (paramRectF.height() - this.c.a()) / 2.0F;
      paramRectF.top += f1;
      paramRectF.bottom -= f1;
    }
    a(paramRectF);
    if ((this.l.width() > 0.0F) && (this.l.height() > 0.0F))
    {
      f1 = Math.max(this.l.left, 0.0F);
      float f2 = Math.max(this.l.top, 0.0F);
      float f3 = Math.min(this.l.right, getWidth());
      float f4 = Math.min(this.l.bottom, getHeight());
      if (paramRectF.left < f1) {
        paramRectF.left = f1;
      }
      if (paramRectF.top < f2) {
        paramRectF.top = f2;
      }
      if (paramRectF.right > f3) {
        paramRectF.right = f3;
      }
      if (paramRectF.bottom > f4) {
        paramRectF.bottom = f4;
      }
    }
    if ((this.u) && (Math.abs(paramRectF.width() - paramRectF.height() * this.x) > 0.1D)) {
      if (paramRectF.width() > paramRectF.height() * this.x)
      {
        f1 = Math.abs(paramRectF.height() * this.x - paramRectF.width()) / 2.0F;
        paramRectF.left += f1;
        paramRectF.right -= f1;
      }
      else
      {
        f1 = Math.abs(paramRectF.width() / this.x - paramRectF.height()) / 2.0F;
        paramRectF.top += f1;
        paramRectF.bottom -= f1;
      }
    }
  }
  
  private void b(boolean paramBoolean)
  {
    try
    {
      if (this.d != null) {
        this.d.a(paramBoolean);
      }
    }
    catch (Exception localException)
    {
      Log.e("AIC", "Exception in crop window changed", localException);
    }
  }
  
  private void c(Canvas paramCanvas)
  {
    if (this.g != null)
    {
      Object localObject = this.f;
      float f1 = 0.0F;
      if (localObject != null) {
        f2 = ((Paint)localObject).getStrokeWidth();
      } else {
        f2 = 0.0F;
      }
      float f3 = this.g.getStrokeWidth();
      float f4 = f3 / 2.0F;
      if (this.z == CropImageView.b.a) {
        f1 = this.o;
      }
      f1 += f4;
      localObject = this.c.e();
      ((RectF)localObject).inset(f1, f1);
      float f2 = (f3 - f2) / 2.0F;
      f1 = f4 + f2;
      f3 = ((RectF)localObject).left;
      f4 = ((RectF)localObject).top;
      paramCanvas.drawLine(f3 - f2, f4 - f1, f3 - f2, f4 + this.p, this.g);
      f3 = ((RectF)localObject).left;
      f4 = ((RectF)localObject).top;
      paramCanvas.drawLine(f3 - f1, f4 - f2, f3 + this.p, f4 - f2, this.g);
      f4 = ((RectF)localObject).right;
      f3 = ((RectF)localObject).top;
      paramCanvas.drawLine(f4 + f2, f3 - f1, f4 + f2, f3 + this.p, this.g);
      f4 = ((RectF)localObject).right;
      f3 = ((RectF)localObject).top;
      paramCanvas.drawLine(f4 + f1, f3 - f2, f4 - this.p, f3 - f2, this.g);
      f4 = ((RectF)localObject).left;
      f3 = ((RectF)localObject).bottom;
      paramCanvas.drawLine(f4 - f2, f3 + f1, f4 - f2, f3 - this.p, this.g);
      f3 = ((RectF)localObject).left;
      f4 = ((RectF)localObject).bottom;
      paramCanvas.drawLine(f3 - f1, f4 + f2, f3 + this.p, f4 + f2, this.g);
      f3 = ((RectF)localObject).right;
      f4 = ((RectF)localObject).bottom;
      paramCanvas.drawLine(f3 + f2, f4 + f1, f3 + f2, f4 - this.p, this.g);
      f4 = ((RectF)localObject).right;
      f3 = ((RectF)localObject).bottom;
      paramCanvas.drawLine(f4 + f1, f3 + f2, f4 - this.p, f3 + f2, this.g);
    }
  }
  
  private void d(Canvas paramCanvas)
  {
    if (this.h != null)
    {
      Object localObject = this.f;
      float f1;
      if (localObject != null) {
        f1 = ((Paint)localObject).getStrokeWidth();
      } else {
        f1 = 0.0F;
      }
      localObject = this.c.e();
      ((RectF)localObject).inset(f1, f1);
      float f2 = ((RectF)localObject).width() / 3.0F;
      float f3 = ((RectF)localObject).height() / 3.0F;
      float f4;
      if (this.z == CropImageView.b.b)
      {
        f4 = ((RectF)localObject).width() / 2.0F - f1;
        f1 = ((RectF)localObject).height() / 2.0F - f1;
        float f5 = ((RectF)localObject).left + f2;
        float f6 = ((RectF)localObject).right - f2;
        f2 = (float)(f1 * Math.sin(Math.acos((f4 - f2) / f4)));
        paramCanvas.drawLine(f5, ((RectF)localObject).top + f1 - f2, f5, ((RectF)localObject).bottom - f1 + f2, this.h);
        paramCanvas.drawLine(f6, ((RectF)localObject).top + f1 - f2, f6, ((RectF)localObject).bottom - f1 + f2, this.h);
        f6 = ((RectF)localObject).top + f3;
        f2 = ((RectF)localObject).bottom - f3;
        f1 = (float)(f4 * Math.cos(Math.asin((f1 - f3) / f1)));
        paramCanvas.drawLine(((RectF)localObject).left + f4 - f1, f6, ((RectF)localObject).right - f4 + f1, f6, this.h);
        paramCanvas.drawLine(((RectF)localObject).left + f4 - f1, f2, ((RectF)localObject).right - f4 + f1, f2, this.h);
      }
      else
      {
        f1 = ((RectF)localObject).left + f2;
        f4 = ((RectF)localObject).right - f2;
        paramCanvas.drawLine(f1, ((RectF)localObject).top, f1, ((RectF)localObject).bottom, this.h);
        paramCanvas.drawLine(f4, ((RectF)localObject).top, f4, ((RectF)localObject).bottom, this.h);
        f1 = ((RectF)localObject).top + f3;
        f3 = ((RectF)localObject).bottom - f3;
        paramCanvas.drawLine(((RectF)localObject).left, f1, ((RectF)localObject).right, f1, this.h);
        paramCanvas.drawLine(((RectF)localObject).left, f3, ((RectF)localObject).right, f3, this.h);
      }
    }
  }
  
  private void e()
  {
    float f1 = Math.max(c.e(this.k), 0.0F);
    float f2 = Math.max(c.g(this.k), 0.0F);
    float f3 = Math.min(c.f(this.k), getWidth());
    float f4 = Math.min(c.a(this.k), getHeight());
    if ((f3 > f1) && (f4 > f2))
    {
      RectF localRectF = new RectF();
      this.B = true;
      float f5 = this.q;
      float f6 = f3 - f1;
      float f7 = f5 * f6;
      float f8 = f4 - f2;
      f5 *= f8;
      if ((this.A.width() > 0) && (this.A.height() > 0))
      {
        localRectF.left = (this.A.left / this.c.g() + f1);
        localRectF.top = (this.A.top / this.c.f() + f2);
        localRectF.right = (localRectF.left + this.A.width() / this.c.g());
        localRectF.bottom = (localRectF.top + this.A.height() / this.c.f());
        localRectF.left = Math.max(f1, localRectF.left);
        localRectF.top = Math.max(f2, localRectF.top);
        localRectF.right = Math.min(f3, localRectF.right);
        localRectF.bottom = Math.min(f4, localRectF.bottom);
      }
      else if ((this.u) && (f3 > f1) && (f4 > f2))
      {
        if (f6 / f8 > this.x)
        {
          localRectF.top = (f2 + f5);
          localRectF.bottom = (f4 - f5);
          f8 = getWidth() / 2.0F;
          this.x = (this.v / this.w);
          f2 = Math.max(this.c.d(), localRectF.height() * this.x) / 2.0F;
          localRectF.left = (f8 - f2);
          localRectF.right = (f8 + f2);
        }
        else
        {
          localRectF.left = (f1 + f7);
          localRectF.right = (f3 - f7);
          f2 = getHeight() / 2.0F;
          f8 = Math.max(this.c.c(), localRectF.width() / this.x) / 2.0F;
          localRectF.top = (f2 - f8);
          localRectF.bottom = (f2 + f8);
        }
      }
      else
      {
        localRectF.left = (f1 + f7);
        localRectF.top = (f2 + f5);
        localRectF.right = (f3 - f7);
        localRectF.bottom = (f4 - f5);
      }
      b(localRectF);
      this.c.a(localRectF);
    }
  }
  
  private boolean f()
  {
    float[] arrayOfFloat = this.k;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (arrayOfFloat[0] != arrayOfFloat[6])
    {
      bool2 = bool1;
      if (arrayOfFloat[1] != arrayOfFloat[7]) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  private void g()
  {
    if (this.t != null)
    {
      this.t = null;
      b(false);
      invalidate();
    }
  }
  
  public void a()
  {
    RectF localRectF = getCropWindowRect();
    b(localRectF);
    this.c.a(localRectF);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.c.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void a(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfFloat == null) || (!Arrays.equals(this.k, paramArrayOfFloat)))
    {
      if (paramArrayOfFloat == null) {
        Arrays.fill(this.k, 0.0F);
      } else {
        System.arraycopy(paramArrayOfFloat, 0, this.k, 0, paramArrayOfFloat.length);
      }
      this.m = paramInt1;
      this.n = paramInt2;
      paramArrayOfFloat = this.c.e();
      if ((paramArrayOfFloat.width() == 0.0F) || (paramArrayOfFloat.height() == 0.0F)) {
        e();
      }
    }
  }
  
  public boolean a(boolean paramBoolean)
  {
    if (this.b != paramBoolean)
    {
      this.b = paramBoolean;
      if ((this.b) && (this.a == null)) {
        this.a = new ScaleGestureDetector(getContext(), new b(null));
      }
      return true;
    }
    return false;
  }
  
  public boolean b()
  {
    return this.u;
  }
  
  public void c()
  {
    if (this.B)
    {
      setCropWindowRect(c.b);
      e();
      invalidate();
    }
  }
  
  public void d()
  {
    if (this.B)
    {
      e();
      invalidate();
      b(false);
    }
  }
  
  public int getAspectRatioX()
  {
    return this.v;
  }
  
  public int getAspectRatioY()
  {
    return this.w;
  }
  
  public CropImageView.b getCropShape()
  {
    return this.z;
  }
  
  public RectF getCropWindowRect()
  {
    return this.c.e();
  }
  
  public CropImageView.c getGuidelines()
  {
    return this.y;
  }
  
  public Rect getInitialCropWindowRect()
  {
    return this.A;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    a(paramCanvas);
    if (this.c.h())
    {
      CropImageView.c localc = this.y;
      if (localc == CropImageView.c.c) {
        d(paramCanvas);
      } else if ((localc == CropImageView.c.b) && (this.t != null)) {
        d(paramCanvas);
      }
    }
    b(paramCanvas);
    c(paramCanvas);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (isEnabled())
    {
      if (this.b) {
        this.a.onTouchEvent(paramMotionEvent);
      }
      int i1 = paramMotionEvent.getAction();
      if (i1 != 0)
      {
        if (i1 != 1) {
          if (i1 != 2)
          {
            if (i1 != 3) {
              return false;
            }
          }
          else
          {
            b(paramMotionEvent.getX(), paramMotionEvent.getY());
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
          }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        g();
        return true;
      }
      a(paramMotionEvent.getX(), paramMotionEvent.getY());
      return true;
    }
    return false;
  }
  
  public void setAspectRatioX(int paramInt)
  {
    if (paramInt > 0)
    {
      if (this.v != paramInt)
      {
        this.v = paramInt;
        this.x = (this.v / this.w);
        if (this.B)
        {
          e();
          invalidate();
        }
      }
      return;
    }
    throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
  }
  
  public void setAspectRatioY(int paramInt)
  {
    if (paramInt > 0)
    {
      if (this.w != paramInt)
      {
        this.w = paramInt;
        this.x = (this.v / this.w);
        if (this.B)
        {
          e();
          invalidate();
        }
      }
      return;
    }
    throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
  }
  
  public void setCropShape(CropImageView.b paramb)
  {
    if (this.z != paramb)
    {
      this.z = paramb;
      if (Build.VERSION.SDK_INT <= 17) {
        if (this.z == CropImageView.b.b)
        {
          this.C = Integer.valueOf(getLayerType());
          if (this.C.intValue() != 1) {
            setLayerType(1, null);
          } else {
            this.C = null;
          }
        }
        else
        {
          paramb = this.C;
          if (paramb != null)
          {
            setLayerType(paramb.intValue(), null);
            this.C = null;
          }
        }
      }
      invalidate();
    }
  }
  
  public void setCropWindowChangeListener(a parama)
  {
    this.d = parama;
  }
  
  public void setCropWindowRect(RectF paramRectF)
  {
    this.c.a(paramRectF);
  }
  
  public void setFixedAspectRatio(boolean paramBoolean)
  {
    if (this.u != paramBoolean)
    {
      this.u = paramBoolean;
      if (this.B)
      {
        e();
        invalidate();
      }
    }
  }
  
  public void setGuidelines(CropImageView.c paramc)
  {
    if (this.y != paramc)
    {
      this.y = paramc;
      if (this.B) {
        invalidate();
      }
    }
  }
  
  public void setInitialAttributeValues(f paramf)
  {
    this.c.a(paramf);
    setCropShape(paramf.a);
    setSnapRadius(paramf.b);
    setGuidelines(paramf.d);
    setFixedAspectRatio(paramf.l);
    setAspectRatioX(paramf.m);
    setAspectRatioY(paramf.n);
    a(paramf.i);
    this.r = paramf.c;
    this.q = paramf.k;
    this.f = a(paramf.o, paramf.p);
    this.o = paramf.r;
    this.p = paramf.s;
    this.g = a(paramf.q, paramf.t);
    this.h = a(paramf.u, paramf.v);
    this.i = a(paramf.w);
  }
  
  public void setInitialCropWindowRect(Rect paramRect)
  {
    Rect localRect = this.A;
    if (paramRect == null) {
      paramRect = c.a;
    }
    localRect.set(paramRect);
    if (this.B)
    {
      e();
      invalidate();
      b(false);
    }
  }
  
  public void setSnapRadius(float paramFloat)
  {
    this.s = paramFloat;
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
  
  private class b
    extends ScaleGestureDetector.SimpleOnScaleGestureListener
  {
    private b() {}
    
    @TargetApi(11)
    public boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
    {
      RectF localRectF = CropOverlayView.a(CropOverlayView.this).e();
      float f1 = paramScaleGestureDetector.getFocusX();
      float f2 = paramScaleGestureDetector.getFocusY();
      float f3 = paramScaleGestureDetector.getCurrentSpanY() / 2.0F;
      float f4 = paramScaleGestureDetector.getCurrentSpanX() / 2.0F;
      float f5 = f2 - f3;
      float f6 = f1 - f4;
      f1 += f4;
      f2 += f3;
      if ((f6 < f1) && (f5 <= f2) && (f6 >= 0.0F) && (f1 <= CropOverlayView.a(CropOverlayView.this).b()) && (f5 >= 0.0F) && (f2 <= CropOverlayView.a(CropOverlayView.this).a()))
      {
        localRectF.set(f6, f5, f1, f2);
        CropOverlayView.a(CropOverlayView.this).a(localRectF);
        CropOverlayView.this.invalidate();
      }
      return true;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/theartofdev/edmodo/cropper/CropOverlayView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */