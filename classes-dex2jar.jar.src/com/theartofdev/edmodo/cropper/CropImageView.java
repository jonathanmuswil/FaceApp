package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.util.UUID;

public class CropImageView
  extends FrameLayout
{
  private d A;
  private Uri B;
  private int C = 1;
  private float D = 1.0F;
  private float E;
  private float F;
  private RectF G;
  private int H;
  private boolean I;
  private Uri J;
  private WeakReference<b> K;
  private WeakReference<a> L;
  private final ImageView a;
  private final CropOverlayView b;
  private final Matrix c = new Matrix();
  private final Matrix d = new Matrix();
  private final ProgressBar e;
  private final float[] f = new float[8];
  private final float[] g = new float[8];
  private d h;
  private Bitmap i;
  private int j;
  private int k;
  private boolean l;
  private boolean m;
  private int n;
  private int o;
  private int p;
  private j q;
  private boolean r = false;
  private boolean s = true;
  private boolean t = true;
  private boolean u = true;
  private int v;
  private f w;
  private e x;
  private g y;
  private h z;
  
  public CropImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    boolean bool = paramContext instanceof Activity;
    Object localObject1 = null;
    if (bool) {
      localObject2 = ((Activity)paramContext).getIntent();
    } else {
      localObject2 = null;
    }
    Object localObject3 = localObject1;
    if (localObject2 != null)
    {
      localObject2 = ((Intent)localObject2).getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
      localObject3 = localObject1;
      if (localObject2 != null) {
        localObject3 = (f)((Bundle)localObject2).getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
      }
    }
    Object localObject2 = localObject3;
    if (localObject3 == null)
    {
      localObject3 = new f();
      localObject2 = localObject3;
      if (paramAttributeSet != null) {
        paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, n.CropImageView, 0, 0);
      }
    }
    try
    {
      ((f)localObject3).l = paramAttributeSet.getBoolean(n.CropImageView_cropFixAspectRatio, ((f)localObject3).l);
      ((f)localObject3).m = paramAttributeSet.getInteger(n.CropImageView_cropAspectRatioX, ((f)localObject3).m);
      ((f)localObject3).n = paramAttributeSet.getInteger(n.CropImageView_cropAspectRatioY, ((f)localObject3).n);
      ((f)localObject3).e = j.values()[paramAttributeSet.getInt(n.CropImageView_cropScaleType, localObject3.e.ordinal())];
      ((f)localObject3).h = paramAttributeSet.getBoolean(n.CropImageView_cropAutoZoomEnabled, ((f)localObject3).h);
      ((f)localObject3).i = paramAttributeSet.getBoolean(n.CropImageView_cropMultiTouchEnabled, ((f)localObject3).i);
      ((f)localObject3).j = paramAttributeSet.getInteger(n.CropImageView_cropMaxZoom, ((f)localObject3).j);
      ((f)localObject3).a = b.values()[paramAttributeSet.getInt(n.CropImageView_cropShape, localObject3.a.ordinal())];
      ((f)localObject3).d = c.values()[paramAttributeSet.getInt(n.CropImageView_cropGuidelines, localObject3.d.ordinal())];
      ((f)localObject3).b = paramAttributeSet.getDimension(n.CropImageView_cropSnapRadius, ((f)localObject3).b);
      ((f)localObject3).c = paramAttributeSet.getDimension(n.CropImageView_cropTouchRadius, ((f)localObject3).c);
      ((f)localObject3).k = paramAttributeSet.getFloat(n.CropImageView_cropInitialCropWindowPaddingRatio, ((f)localObject3).k);
      ((f)localObject3).o = paramAttributeSet.getDimension(n.CropImageView_cropBorderLineThickness, ((f)localObject3).o);
      ((f)localObject3).p = paramAttributeSet.getInteger(n.CropImageView_cropBorderLineColor, ((f)localObject3).p);
      ((f)localObject3).q = paramAttributeSet.getDimension(n.CropImageView_cropBorderCornerThickness, ((f)localObject3).q);
      ((f)localObject3).r = paramAttributeSet.getDimension(n.CropImageView_cropBorderCornerOffset, ((f)localObject3).r);
      ((f)localObject3).s = paramAttributeSet.getDimension(n.CropImageView_cropBorderCornerLength, ((f)localObject3).s);
      ((f)localObject3).t = paramAttributeSet.getInteger(n.CropImageView_cropBorderCornerColor, ((f)localObject3).t);
      ((f)localObject3).u = paramAttributeSet.getDimension(n.CropImageView_cropGuidelinesThickness, ((f)localObject3).u);
      ((f)localObject3).v = paramAttributeSet.getInteger(n.CropImageView_cropGuidelinesColor, ((f)localObject3).v);
      ((f)localObject3).w = paramAttributeSet.getInteger(n.CropImageView_cropBackgroundColor, ((f)localObject3).w);
      ((f)localObject3).f = paramAttributeSet.getBoolean(n.CropImageView_cropShowCropOverlay, this.s);
      ((f)localObject3).g = paramAttributeSet.getBoolean(n.CropImageView_cropShowProgressBar, this.t);
      ((f)localObject3).q = paramAttributeSet.getDimension(n.CropImageView_cropBorderCornerThickness, ((f)localObject3).q);
      ((f)localObject3).x = ((int)paramAttributeSet.getDimension(n.CropImageView_cropMinCropWindowWidth, ((f)localObject3).x));
      ((f)localObject3).y = ((int)paramAttributeSet.getDimension(n.CropImageView_cropMinCropWindowHeight, ((f)localObject3).y));
      ((f)localObject3).z = ((int)paramAttributeSet.getFloat(n.CropImageView_cropMinCropResultWidthPX, ((f)localObject3).z));
      ((f)localObject3).A = ((int)paramAttributeSet.getFloat(n.CropImageView_cropMinCropResultHeightPX, ((f)localObject3).A));
      ((f)localObject3).B = ((int)paramAttributeSet.getFloat(n.CropImageView_cropMaxCropResultWidthPX, ((f)localObject3).B));
      ((f)localObject3).C = ((int)paramAttributeSet.getFloat(n.CropImageView_cropMaxCropResultHeightPX, ((f)localObject3).C));
      ((f)localObject3).S = paramAttributeSet.getBoolean(n.CropImageView_cropFlipHorizontally, ((f)localObject3).S);
      ((f)localObject3).T = paramAttributeSet.getBoolean(n.CropImageView_cropFlipHorizontally, ((f)localObject3).T);
      this.r = paramAttributeSet.getBoolean(n.CropImageView_cropSaveBitmapToInstanceState, this.r);
      if ((paramAttributeSet.hasValue(n.CropImageView_cropAspectRatioX)) && (paramAttributeSet.hasValue(n.CropImageView_cropAspectRatioX)) && (!paramAttributeSet.hasValue(n.CropImageView_cropFixAspectRatio))) {
        ((f)localObject3).l = true;
      }
      paramAttributeSet.recycle();
      localObject2 = localObject3;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
    this.q = ((f)localObject2).e;
    this.u = ((f)localObject2).h;
    this.v = ((f)localObject2).j;
    this.s = ((f)localObject2).f;
    this.t = ((f)localObject2).g;
    this.l = ((f)localObject2).S;
    this.m = ((f)localObject2).T;
    paramContext = LayoutInflater.from(paramContext).inflate(m.crop_image_view, this, true);
    this.a = ((ImageView)paramContext.findViewById(l.ImageView_image));
    this.a.setScaleType(ImageView.ScaleType.MATRIX);
    this.b = ((CropOverlayView)paramContext.findViewById(l.CropOverlayView));
    this.b.setCropWindowChangeListener(new g(this));
    this.b.setInitialAttributeValues((f)localObject2);
    this.e = ((ProgressBar)paramContext.findViewById(l.CropProgressBar));
    e();
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 != 1073741824) {
      if (paramInt1 == Integer.MIN_VALUE) {
        paramInt2 = Math.min(paramInt3, paramInt2);
      } else {
        paramInt2 = paramInt3;
      }
    }
    return paramInt2;
  }
  
  private void a(float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.i != null)
    {
      float f1 = 0.0F;
      if ((paramFloat1 > 0.0F) && (paramFloat2 > 0.0F))
      {
        this.c.invert(this.d);
        RectF localRectF = this.b.getCropWindowRect();
        this.d.mapRect(localRectF);
        this.c.reset();
        this.c.postTranslate((paramFloat1 - this.i.getWidth()) / 2.0F, (paramFloat2 - this.i.getHeight()) / 2.0F);
        c();
        int i1 = this.k;
        if (i1 > 0)
        {
          this.c.postRotate(i1, c.b(this.f), c.c(this.f));
          c();
        }
        float f2 = Math.min(paramFloat1 / c.h(this.f), paramFloat2 / c.d(this.f));
        j localj = this.q;
        if ((localj == j.a) || ((localj == j.d) && (f2 < 1.0F)) || ((f2 > 1.0F) && (this.u)))
        {
          this.c.postScale(f2, f2, c.b(this.f), c.c(this.f));
          c();
        }
        if (this.l) {
          f2 = -this.D;
        } else {
          f2 = this.D;
        }
        float f3;
        if (this.m) {
          f3 = -this.D;
        } else {
          f3 = this.D;
        }
        this.c.postScale(f2, f3, c.b(this.f), c.c(this.f));
        c();
        this.c.mapRect(localRectF);
        if (paramBoolean1)
        {
          if (paramFloat1 > c.h(this.f)) {
            paramFloat1 = 0.0F;
          } else {
            paramFloat1 = Math.max(Math.min(paramFloat1 / 2.0F - localRectF.centerX(), -c.e(this.f)), getWidth() - c.f(this.f)) / f2;
          }
          this.E = paramFloat1;
          if (paramFloat2 > c.d(this.f)) {
            paramFloat1 = f1;
          } else {
            paramFloat1 = Math.max(Math.min(paramFloat2 / 2.0F - localRectF.centerY(), -c.g(this.f)), getHeight() - c.a(this.f)) / f3;
          }
          this.F = paramFloat1;
        }
        else
        {
          this.E = (Math.min(Math.max(this.E * f2, -localRectF.left), -localRectF.right + paramFloat1) / f2);
          this.F = (Math.min(Math.max(this.F * f3, -localRectF.top), -localRectF.bottom + paramFloat2) / f3);
        }
        this.c.postTranslate(this.E * f2, this.F * f3);
        localRectF.offset(this.E * f2, this.F * f3);
        this.b.setCropWindowRect(localRectF);
        c();
        this.b.invalidate();
        if (paramBoolean2)
        {
          this.h.a(this.f, this.c);
          this.a.startAnimation(this.h);
        }
        else
        {
          this.a.setImageMatrix(this.c);
        }
        a(false);
      }
    }
  }
  
  private void a(Bitmap paramBitmap, int paramInt1, Uri paramUri, int paramInt2, int paramInt3)
  {
    Bitmap localBitmap = this.i;
    if ((localBitmap == null) || (!localBitmap.equals(paramBitmap)))
    {
      this.a.clearAnimation();
      b();
      this.i = paramBitmap;
      this.a.setImageBitmap(this.i);
      this.B = paramUri;
      this.p = paramInt1;
      this.C = paramInt2;
      this.k = paramInt3;
      a(getWidth(), getHeight(), true, false);
      paramBitmap = this.b;
      if (paramBitmap != null)
      {
        paramBitmap.c();
        d();
      }
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if ((this.i != null) && (!paramBoolean))
    {
      float f1 = this.C * 100.0F / c.h(this.g);
      float f2 = this.C * 100.0F / c.d(this.g);
      this.b.a(getWidth(), getHeight(), f1, f2);
    }
    CropOverlayView localCropOverlayView = this.b;
    float[] arrayOfFloat;
    if (paramBoolean) {
      arrayOfFloat = null;
    } else {
      arrayOfFloat = this.f;
    }
    localCropOverlayView.a(arrayOfFloat, getWidth(), getHeight());
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = getWidth();
    int i2 = getHeight();
    if ((this.i != null) && (i1 > 0) && (i2 > 0))
    {
      Object localObject = this.b.getCropWindowRect();
      if (paramBoolean1)
      {
        if ((((RectF)localObject).left < 0.0F) || (((RectF)localObject).top < 0.0F) || (((RectF)localObject).right > i1) || (((RectF)localObject).bottom > i2)) {
          a(i1, i2, false, false);
        }
      }
      else if ((this.u) || (this.D > 1.0F))
      {
        float f1;
        float f3;
        if (this.D < this.v)
        {
          f1 = ((RectF)localObject).width();
          f2 = i1;
          if (f1 < f2 * 0.5F)
          {
            f1 = ((RectF)localObject).height();
            f3 = i2;
            if (f1 < 0.5F * f3)
            {
              f2 = Math.min(this.v, Math.min(f2 / (((RectF)localObject).width() / this.D / 0.64F), f3 / (((RectF)localObject).height() / this.D / 0.64F)));
              break label226;
            }
          }
        }
        float f2 = 0.0F;
        label226:
        if (this.D > 1.0F)
        {
          f3 = ((RectF)localObject).width();
          f1 = i1;
          if ((f3 > f1 * 0.65F) || (((RectF)localObject).height() > i2 * 0.65F)) {
            f2 = Math.max(1.0F, Math.min(f1 / (((RectF)localObject).width() / this.D / 0.51F), i2 / (((RectF)localObject).height() / this.D / 0.51F)));
          }
        }
        if (!this.u) {
          f2 = 1.0F;
        }
        if ((f2 > 0.0F) && (f2 != this.D))
        {
          if (paramBoolean2)
          {
            if (this.h == null) {
              this.h = new d(this.a, this.b);
            }
            this.h.b(this.f, this.c);
          }
          this.D = f2;
          a(i1, i2, true, paramBoolean2);
        }
      }
      localObject = this.y;
      if ((localObject != null) && (!paramBoolean1)) {
        ((g)localObject).a();
      }
    }
  }
  
  private void b()
  {
    if ((this.i != null) && ((this.p > 0) || (this.B != null))) {
      this.i.recycle();
    }
    this.i = null;
    this.p = 0;
    this.B = null;
    this.C = 1;
    this.k = 0;
    this.D = 1.0F;
    this.E = 0.0F;
    this.F = 0.0F;
    this.c.reset();
    this.J = null;
    this.a.setImageBitmap(null);
    d();
  }
  
  private void c()
  {
    float[] arrayOfFloat = this.f;
    arrayOfFloat[0] = 0.0F;
    arrayOfFloat[1] = 0.0F;
    arrayOfFloat[2] = this.i.getWidth();
    arrayOfFloat = this.f;
    arrayOfFloat[3] = 0.0F;
    arrayOfFloat[4] = this.i.getWidth();
    this.f[5] = this.i.getHeight();
    arrayOfFloat = this.f;
    arrayOfFloat[6] = 0.0F;
    arrayOfFloat[7] = this.i.getHeight();
    this.c.mapPoints(this.f);
    arrayOfFloat = this.g;
    arrayOfFloat[0] = 0.0F;
    arrayOfFloat[1] = 0.0F;
    arrayOfFloat[2] = 100.0F;
    arrayOfFloat[3] = 0.0F;
    arrayOfFloat[4] = 100.0F;
    arrayOfFloat[5] = 100.0F;
    arrayOfFloat[6] = 0.0F;
    arrayOfFloat[7] = 100.0F;
    this.c.mapPoints(arrayOfFloat);
  }
  
  private void d()
  {
    CropOverlayView localCropOverlayView = this.b;
    if (localCropOverlayView != null)
    {
      int i1;
      if ((this.s) && (this.i != null)) {
        i1 = 0;
      } else {
        i1 = 4;
      }
      localCropOverlayView.setVisibility(i1);
    }
  }
  
  private void e()
  {
    boolean bool = this.t;
    int i1 = 0;
    int i2;
    if ((bool) && (((this.i == null) && (this.K != null)) || (this.L != null))) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    ProgressBar localProgressBar = this.e;
    if (i2 != 0) {
      i2 = i1;
    } else {
      i2 = 4;
    }
    localProgressBar.setVisibility(i2);
  }
  
  public Bitmap a(int paramInt1, int paramInt2, i parami)
  {
    if (this.i != null)
    {
      this.a.clearAnimation();
      Object localObject = i.a;
      int i1 = 0;
      if (parami == localObject) {
        paramInt1 = 0;
      }
      if (parami != i.a) {
        i1 = paramInt2;
      }
      if ((this.B != null) && ((this.C > 1) || (parami == i.b)))
      {
        paramInt2 = this.i.getWidth();
        int i2 = this.C;
        int i3 = this.i.getHeight();
        int i4 = this.C;
        localObject = c.a(getContext(), this.B, getCropPoints(), this.k, paramInt2 * i2, i3 * i4, this.b.b(), this.b.getAspectRatioX(), this.b.getAspectRatioY(), paramInt1, i1, this.l, this.m).a;
      }
      else
      {
        localObject = c.a(this.i, getCropPoints(), this.k, this.b.b(), this.b.getAspectRatioX(), this.b.getAspectRatioY(), this.l, this.m).a;
      }
      parami = c.a((Bitmap)localObject, paramInt1, i1, parami);
    }
    else
    {
      parami = null;
    }
    return parami;
  }
  
  public void a()
  {
    this.D = 1.0F;
    this.E = 0.0F;
    this.F = 0.0F;
    this.k = this.j;
    this.l = false;
    this.m = false;
    a(getWidth(), getHeight(), false, false);
    this.b.d();
  }
  
  public void a(int paramInt)
  {
    if (this.i != null)
    {
      if (paramInt < 0) {
        paramInt = paramInt % 360 + 360;
      } else {
        paramInt %= 360;
      }
      int i1;
      if ((!this.b.b()) && (((paramInt > 45) && (paramInt < 135)) || ((paramInt > 215) && (paramInt < 305)))) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      c.c.set(this.b.getCropWindowRect());
      if (i1 != 0) {
        f1 = c.c.height();
      } else {
        f1 = c.c.width();
      }
      float f2 = f1 / 2.0F;
      if (i1 != 0) {
        f1 = c.c.width();
      } else {
        f1 = c.c.height();
      }
      float f3 = f1 / 2.0F;
      if (i1 != 0)
      {
        boolean bool = this.l;
        this.l = this.m;
        this.m = bool;
      }
      this.c.invert(this.d);
      c.d[0] = c.c.centerX();
      c.d[1] = c.c.centerY();
      float[] arrayOfFloat = c.d;
      arrayOfFloat[2] = 0.0F;
      arrayOfFloat[3] = 0.0F;
      arrayOfFloat[4] = 1.0F;
      arrayOfFloat[5] = 0.0F;
      this.d.mapPoints(arrayOfFloat);
      this.k = ((this.k + paramInt) % 360);
      a(getWidth(), getHeight(), true, false);
      this.c.mapPoints(c.e, c.d);
      double d1 = this.D;
      arrayOfFloat = c.e;
      double d2 = Math.pow(arrayOfFloat[4] - arrayOfFloat[2], 2.0D);
      arrayOfFloat = c.e;
      this.D = ((float)(d1 / Math.sqrt(d2 + Math.pow(arrayOfFloat[5] - arrayOfFloat[3], 2.0D))));
      this.D = Math.max(this.D, 1.0F);
      a(getWidth(), getHeight(), true, false);
      this.c.mapPoints(c.e, c.d);
      arrayOfFloat = c.e;
      d1 = Math.pow(arrayOfFloat[4] - arrayOfFloat[2], 2.0D);
      arrayOfFloat = c.e;
      d1 = Math.sqrt(d1 + Math.pow(arrayOfFloat[5] - arrayOfFloat[3], 2.0D));
      float f1 = (float)(f2 * d1);
      f2 = (float)(f3 * d1);
      RectF localRectF = c.c;
      arrayOfFloat = c.e;
      localRectF.set(arrayOfFloat[0] - f1, arrayOfFloat[1] - f2, arrayOfFloat[0] + f1, arrayOfFloat[1] + f2);
      this.b.c();
      this.b.setCropWindowRect(c.c);
      a(getWidth(), getHeight(), true, false);
      a(false, false);
      this.b.a();
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.b.setAspectRatioX(paramInt1);
    this.b.setAspectRatioY(paramInt2);
    setFixedAspectRatio(true);
  }
  
  public void a(int paramInt1, int paramInt2, i parami, Uri paramUri, Bitmap.CompressFormat paramCompressFormat, int paramInt3)
  {
    Bitmap localBitmap = this.i;
    if (localBitmap != null)
    {
      this.a.clearAnimation();
      Object localObject = this.L;
      if (localObject != null) {
        localObject = (a)((WeakReference)localObject).get();
      } else {
        localObject = null;
      }
      if (localObject != null) {
        ((AsyncTask)localObject).cancel(true);
      }
      if (parami == i.a) {
        paramInt1 = 0;
      }
      if (parami == i.a) {
        paramInt2 = 0;
      }
      int i1 = localBitmap.getWidth();
      int i2 = this.C;
      int i3 = localBitmap.getHeight();
      int i4 = this.C;
      if ((this.B != null) && ((i4 > 1) || (parami == i.b))) {
        this.L = new WeakReference(new a(this, this.B, getCropPoints(), this.k, i1 * i2, i3 * i4, this.b.b(), this.b.getAspectRatioX(), this.b.getAspectRatioY(), paramInt1, paramInt2, this.l, this.m, parami, paramUri, paramCompressFormat, paramInt3));
      } else {
        this.L = new WeakReference(new a(this, localBitmap, getCropPoints(), this.k, this.b.b(), this.b.getAspectRatioX(), this.b.getAspectRatioY(), paramInt1, paramInt2, this.l, this.m, parami, paramUri, paramCompressFormat, paramInt3));
      }
      ((a)this.L.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
      e();
    }
  }
  
  void a(a.a parama)
  {
    this.L = null;
    e();
    d locald = this.A;
    if (locald != null) {
      locald.a(this, new a(this.i, this.B, parama.a, parama.b, parama.c, getCropPoints(), getCropRect(), getWholeImageRect(), getRotatedDegrees(), parama.e));
    }
  }
  
  void a(b.a parama)
  {
    this.K = null;
    e();
    if (parama.e == null)
    {
      int i1 = parama.d;
      this.j = i1;
      a(parama.b, 0, parama.a, parama.c, i1);
    }
    h localh = this.z;
    if (localh != null) {
      localh.a(this, parama.a, parama.e);
    }
  }
  
  public void b(int paramInt1, int paramInt2, i parami)
  {
    if (this.A != null)
    {
      a(paramInt1, paramInt2, parami, null, null, 0);
      return;
    }
    throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
  }
  
  public Pair<Integer, Integer> getAspectRatio()
  {
    return new Pair(Integer.valueOf(this.b.getAspectRatioX()), Integer.valueOf(this.b.getAspectRatioY()));
  }
  
  public float[] getCropPoints()
  {
    RectF localRectF = this.b.getCropWindowRect();
    float[] arrayOfFloat = new float[8];
    float f1 = localRectF.left;
    int i1 = 0;
    arrayOfFloat[0] = f1;
    float f2 = localRectF.top;
    arrayOfFloat[1] = f2;
    float f3 = localRectF.right;
    arrayOfFloat[2] = f3;
    arrayOfFloat[3] = f2;
    arrayOfFloat[4] = f3;
    f2 = localRectF.bottom;
    arrayOfFloat[5] = f2;
    arrayOfFloat[6] = f1;
    arrayOfFloat[7] = f2;
    this.c.invert(this.d);
    this.d.mapPoints(arrayOfFloat);
    while (i1 < arrayOfFloat.length)
    {
      arrayOfFloat[i1] *= this.C;
      i1++;
    }
    return arrayOfFloat;
  }
  
  public Rect getCropRect()
  {
    int i1 = this.C;
    Bitmap localBitmap = this.i;
    if (localBitmap == null) {
      return null;
    }
    return c.a(getCropPoints(), localBitmap.getWidth() * i1, i1 * localBitmap.getHeight(), this.b.b(), this.b.getAspectRatioX(), this.b.getAspectRatioY());
  }
  
  public b getCropShape()
  {
    return this.b.getCropShape();
  }
  
  public RectF getCropWindowRect()
  {
    CropOverlayView localCropOverlayView = this.b;
    if (localCropOverlayView == null) {
      return null;
    }
    return localCropOverlayView.getCropWindowRect();
  }
  
  public Bitmap getCroppedImage()
  {
    return a(0, 0, i.a);
  }
  
  public void getCroppedImageAsync()
  {
    b(0, 0, i.a);
  }
  
  public c getGuidelines()
  {
    return this.b.getGuidelines();
  }
  
  public int getImageResource()
  {
    return this.p;
  }
  
  public Uri getImageUri()
  {
    return this.B;
  }
  
  public int getMaxZoom()
  {
    return this.v;
  }
  
  public int getRotatedDegrees()
  {
    return this.k;
  }
  
  public j getScaleType()
  {
    return this.q;
  }
  
  public Rect getWholeImageRect()
  {
    int i1 = this.C;
    Bitmap localBitmap = this.i;
    if (localBitmap == null) {
      return null;
    }
    return new Rect(0, 0, localBitmap.getWidth() * i1, localBitmap.getHeight() * i1);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.n > 0) && (this.o > 0))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      localLayoutParams.width = this.n;
      localLayoutParams.height = this.o;
      setLayoutParams(localLayoutParams);
      if (this.i != null)
      {
        float f1 = paramInt3 - paramInt1;
        float f2 = paramInt4 - paramInt2;
        a(f1, f2, true, false);
        if (this.G != null)
        {
          paramInt1 = this.H;
          if (paramInt1 != this.j)
          {
            this.k = paramInt1;
            a(f1, f2, true, false);
          }
          this.c.mapRect(this.G);
          this.b.setCropWindowRect(this.G);
          a(false, false);
          this.b.a();
          this.G = null;
        }
        else if (this.I)
        {
          this.I = false;
          a(false, false);
        }
      }
      else
      {
        a(true);
      }
    }
    else
    {
      a(true);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    Bitmap localBitmap = this.i;
    if (localBitmap != null)
    {
      paramInt1 = paramInt2;
      if (paramInt2 == 0) {
        paramInt1 = localBitmap.getHeight();
      }
      double d1;
      if (i2 < this.i.getWidth()) {
        d1 = i2 / this.i.getWidth();
      } else {
        d1 = Double.POSITIVE_INFINITY;
      }
      double d2;
      if (paramInt1 < this.i.getHeight()) {
        d2 = paramInt1 / this.i.getHeight();
      } else {
        d2 = Double.POSITIVE_INFINITY;
      }
      int i4;
      if ((d1 == Double.POSITIVE_INFINITY) && (d2 == Double.POSITIVE_INFINITY))
      {
        paramInt2 = this.i.getWidth();
        i4 = this.i.getHeight();
      }
      else if (d1 <= d2)
      {
        i4 = (int)(this.i.getHeight() * d1);
        paramInt2 = i2;
      }
      else
      {
        paramInt2 = (int)(this.i.getWidth() * d2);
        i4 = paramInt1;
      }
      paramInt2 = a(i1, i2, paramInt2);
      paramInt1 = a(i3, paramInt1, i4);
      this.n = paramInt2;
      this.o = paramInt1;
      setMeasuredDimension(this.n, this.o);
    }
    else
    {
      setMeasuredDimension(i2, paramInt2);
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof Bundle))
    {
      Bundle localBundle = (Bundle)paramParcelable;
      if ((this.K == null) && (this.B == null) && (this.i == null) && (this.p == 0))
      {
        Uri localUri = (Uri)localBundle.getParcelable("LOADED_IMAGE_URI");
        if (localUri != null)
        {
          paramParcelable = localBundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
          if (paramParcelable != null)
          {
            Pair localPair = c.g;
            if ((localPair != null) && (((String)localPair.first).equals(paramParcelable))) {
              paramParcelable = (Bitmap)((WeakReference)c.g.second).get();
            } else {
              paramParcelable = null;
            }
            c.g = null;
            if ((paramParcelable != null) && (!paramParcelable.isRecycled())) {
              a(paramParcelable, 0, localUri, localBundle.getInt("LOADED_SAMPLE_SIZE"), 0);
            }
          }
          if (this.B == null) {
            setImageUriAsync(localUri);
          }
        }
        else
        {
          i1 = localBundle.getInt("LOADED_IMAGE_RESOURCE");
          if (i1 > 0)
          {
            setImageResource(i1);
          }
          else
          {
            paramParcelable = (Uri)localBundle.getParcelable("LOADING_IMAGE_URI");
            if (paramParcelable != null) {
              setImageUriAsync(paramParcelable);
            }
          }
        }
        int i1 = localBundle.getInt("DEGREES_ROTATED");
        this.H = i1;
        this.k = i1;
        paramParcelable = (Rect)localBundle.getParcelable("INITIAL_CROP_RECT");
        if ((paramParcelable != null) && ((paramParcelable.width() > 0) || (paramParcelable.height() > 0))) {
          this.b.setInitialCropWindowRect(paramParcelable);
        }
        paramParcelable = (RectF)localBundle.getParcelable("CROP_WINDOW_RECT");
        if ((paramParcelable != null) && ((paramParcelable.width() > 0.0F) || (paramParcelable.height() > 0.0F))) {
          this.G = paramParcelable;
        }
        this.b.setCropShape(b.valueOf(localBundle.getString("CROP_SHAPE")));
        this.u = localBundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
        this.v = localBundle.getInt("CROP_MAX_ZOOM");
        this.l = localBundle.getBoolean("CROP_FLIP_HORIZONTALLY");
        this.m = localBundle.getBoolean("CROP_FLIP_VERTICALLY");
      }
      super.onRestoreInstanceState(localBundle.getParcelable("instanceState"));
    }
    else
    {
      super.onRestoreInstanceState(paramParcelable);
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    if ((this.B == null) && (this.i == null) && (this.p < 1)) {
      return super.onSaveInstanceState();
    }
    Bundle localBundle = new Bundle();
    Object localObject1 = this.B;
    Object localObject2 = localObject1;
    if (this.r)
    {
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = localObject1;
        if (this.p < 1)
        {
          localObject2 = c.a(getContext(), this.i, this.J);
          this.J = ((Uri)localObject2);
        }
      }
    }
    if ((localObject2 != null) && (this.i != null))
    {
      localObject1 = UUID.randomUUID().toString();
      c.g = new Pair(localObject1, new WeakReference(this.i));
      localBundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", (String)localObject1);
    }
    localObject1 = this.K;
    if (localObject1 != null)
    {
      localObject1 = (b)((WeakReference)localObject1).get();
      if (localObject1 != null) {
        localBundle.putParcelable("LOADING_IMAGE_URI", ((b)localObject1).a());
      }
    }
    localBundle.putParcelable("instanceState", super.onSaveInstanceState());
    localBundle.putParcelable("LOADED_IMAGE_URI", (Parcelable)localObject2);
    localBundle.putInt("LOADED_IMAGE_RESOURCE", this.p);
    localBundle.putInt("LOADED_SAMPLE_SIZE", this.C);
    localBundle.putInt("DEGREES_ROTATED", this.k);
    localBundle.putParcelable("INITIAL_CROP_RECT", this.b.getInitialCropWindowRect());
    c.c.set(this.b.getCropWindowRect());
    this.c.invert(this.d);
    this.d.mapRect(c.c);
    localBundle.putParcelable("CROP_WINDOW_RECT", c.c);
    localBundle.putString("CROP_SHAPE", this.b.getCropShape().name());
    localBundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.u);
    localBundle.putInt("CROP_MAX_ZOOM", this.v);
    localBundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.l);
    localBundle.putBoolean("CROP_FLIP_VERTICALLY", this.m);
    return localBundle;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    boolean bool;
    if ((paramInt3 > 0) && (paramInt4 > 0)) {
      bool = true;
    } else {
      bool = false;
    }
    this.I = bool;
  }
  
  public void setAutoZoomEnabled(boolean paramBoolean)
  {
    if (this.u != paramBoolean)
    {
      this.u = paramBoolean;
      a(false, false);
      this.b.invalidate();
    }
  }
  
  public void setCropRect(Rect paramRect)
  {
    this.b.setInitialCropWindowRect(paramRect);
  }
  
  public void setCropShape(b paramb)
  {
    this.b.setCropShape(paramb);
  }
  
  public void setFixedAspectRatio(boolean paramBoolean)
  {
    this.b.setFixedAspectRatio(paramBoolean);
  }
  
  public void setFlippedHorizontally(boolean paramBoolean)
  {
    if (this.l != paramBoolean)
    {
      this.l = paramBoolean;
      a(getWidth(), getHeight(), true, false);
    }
  }
  
  public void setFlippedVertically(boolean paramBoolean)
  {
    if (this.m != paramBoolean)
    {
      this.m = paramBoolean;
      a(getWidth(), getHeight(), true, false);
    }
  }
  
  public void setGuidelines(c paramc)
  {
    this.b.setGuidelines(paramc);
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.b.setInitialCropWindowRect(null);
    a(paramBitmap, 0, null, 1, 0);
  }
  
  public void setImageResource(int paramInt)
  {
    if (paramInt != 0)
    {
      this.b.setInitialCropWindowRect(null);
      a(BitmapFactory.decodeResource(getResources(), paramInt), paramInt, null, 1, 0);
    }
  }
  
  public void setImageUriAsync(Uri paramUri)
  {
    if (paramUri != null)
    {
      Object localObject = this.K;
      if (localObject != null) {
        localObject = (b)((WeakReference)localObject).get();
      } else {
        localObject = null;
      }
      if (localObject != null) {
        ((AsyncTask)localObject).cancel(true);
      }
      b();
      this.G = null;
      this.H = 0;
      this.b.setInitialCropWindowRect(null);
      this.K = new WeakReference(new b(this, paramUri));
      ((b)this.K.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
      e();
    }
  }
  
  public void setMaxZoom(int paramInt)
  {
    if ((this.v != paramInt) && (paramInt > 0))
    {
      this.v = paramInt;
      a(false, false);
      this.b.invalidate();
    }
  }
  
  public void setMultiTouchEnabled(boolean paramBoolean)
  {
    if (this.b.a(paramBoolean))
    {
      a(false, false);
      this.b.invalidate();
    }
  }
  
  public void setOnCropImageCompleteListener(d paramd)
  {
    this.A = paramd;
  }
  
  public void setOnCropWindowChangedListener(g paramg)
  {
    this.y = paramg;
  }
  
  public void setOnSetCropOverlayMovedListener(e parame)
  {
    this.x = parame;
  }
  
  public void setOnSetCropOverlayReleasedListener(f paramf)
  {
    this.w = paramf;
  }
  
  public void setOnSetImageUriCompleteListener(h paramh)
  {
    this.z = paramh;
  }
  
  public void setRotatedDegrees(int paramInt)
  {
    int i1 = this.k;
    if (i1 != paramInt) {
      a(paramInt - i1);
    }
  }
  
  public void setSaveBitmapToInstanceState(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  public void setScaleType(j paramj)
  {
    if (paramj != this.q)
    {
      this.q = paramj;
      this.D = 1.0F;
      this.F = 0.0F;
      this.E = 0.0F;
      this.b.c();
      requestLayout();
    }
  }
  
  public void setShowCropOverlay(boolean paramBoolean)
  {
    if (this.s != paramBoolean)
    {
      this.s = paramBoolean;
      d();
    }
  }
  
  public void setShowProgressBar(boolean paramBoolean)
  {
    if (this.t != paramBoolean)
    {
      this.t = paramBoolean;
      e();
    }
  }
  
  public void setSnapRadius(float paramFloat)
  {
    if (paramFloat >= 0.0F) {
      this.b.setSnapRadius(paramFloat);
    }
  }
  
  public static class a
  {
    private final Bitmap a;
    private final Uri b;
    private final Bitmap c;
    private final Uri d;
    private final Exception e;
    private final float[] f;
    private final Rect g;
    private final Rect h;
    private final int i;
    private final int j;
    
    a(Bitmap paramBitmap1, Uri paramUri1, Bitmap paramBitmap2, Uri paramUri2, Exception paramException, float[] paramArrayOfFloat, Rect paramRect1, Rect paramRect2, int paramInt1, int paramInt2)
    {
      this.a = paramBitmap1;
      this.b = paramUri1;
      this.c = paramBitmap2;
      this.d = paramUri2;
      this.e = paramException;
      this.f = paramArrayOfFloat;
      this.g = paramRect1;
      this.h = paramRect2;
      this.i = paramInt1;
      this.j = paramInt2;
    }
  }
  
  public static enum b
  {
    private b() {}
  }
  
  public static enum c
  {
    private c() {}
  }
  
  public static abstract interface d
  {
    public abstract void a(CropImageView paramCropImageView, CropImageView.a parama);
  }
  
  public static abstract interface e
  {
    public abstract void a(Rect paramRect);
  }
  
  public static abstract interface f
  {
    public abstract void a(Rect paramRect);
  }
  
  public static abstract interface g
  {
    public abstract void a();
  }
  
  public static abstract interface h
  {
    public abstract void a(CropImageView paramCropImageView, Uri paramUri, Exception paramException);
  }
  
  public static enum i
  {
    private i() {}
  }
  
  public static enum j
  {
    private j() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/theartofdev/edmodo/cropper/CropImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */