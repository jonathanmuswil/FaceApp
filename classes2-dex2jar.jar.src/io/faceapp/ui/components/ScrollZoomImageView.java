package io.faceapp.ui.components;

import FVa;
import GVa;
import KOa;
import QQa;
import RPa;
import WOa;
import WOa.d;
import WVa;
import XQa;
import aW;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import eY;
import java.util.concurrent.TimeUnit;
import kRa;
import oXa;

public final class ScrollZoomImageView
  extends AppCompatImageView
{
  public static final a c = new a(null);
  private boolean A;
  private boolean B;
  private boolean C;
  private boolean D;
  private float E;
  private boolean F;
  private final FVa<WVa<Integer, Integer>> G;
  private final FVa<WVa<Integer, Integer>> H;
  private String d = "ScrollZoomImageView";
  private final double e;
  private Matrix f;
  private Matrix g;
  private Matrix h;
  private int i;
  private PointF j;
  private PointF k;
  private long l;
  private boolean m;
  private double n;
  private int o;
  private int p;
  private kRa q;
  private final float[] r;
  private final float[] s;
  private final float[] t;
  private final float[] u;
  private boolean v;
  private final FVa<Matrix> w;
  private final FVa<Matrix> x;
  private final GVa<WVa<Float, Float>> y;
  private final FVa<Boolean> z;
  
  public ScrollZoomImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = KOa.b.a(paramContext, 15.0F);
    this.f = new Matrix();
    this.g = new Matrix();
    this.h = new Matrix();
    this.j = new PointF();
    this.k = new PointF();
    this.n = 1.0D;
    this.o = -1;
    this.p = -1;
    this.r = new float[9];
    this.s = new float[9];
    this.t = new float[9];
    this.u = new float[9];
    paramContext = FVa.t();
    oXa.a(paramContext, "BehaviorSubject.create()");
    this.w = paramContext;
    paramContext = FVa.t();
    oXa.a(paramContext, "BehaviorSubject.create()");
    this.x = paramContext;
    paramContext = GVa.t();
    oXa.a(paramContext, "PublishSubject.create()");
    this.y = paramContext;
    paramContext = FVa.f(Boolean.valueOf(false));
    oXa.a(paramContext, "BehaviorSubject.createDefault(false)");
    this.z = paramContext;
    this.B = true;
    this.C = true;
    this.D = true;
    this.F = true;
    paramContext = FVa.t();
    oXa.a(paramContext, "BehaviorSubject.create()");
    this.G = paramContext;
    paramContext = FVa.t();
    oXa.a(paramContext, "BehaviorSubject.create()");
    this.H = paramContext;
    setScaleType(ImageView.ScaleType.MATRIX);
    paramContext = aW.c(this);
    oXa.a(paramContext, "RxView.layoutChangeEvents(this)");
    eY.a(paramContext, this).a(x.a).e(y.a).e().a(this.G);
    eY.a(this.G, this).c(new A(this));
  }
  
  private final double a(MotionEvent paramMotionEvent)
  {
    double d1 = paramMotionEvent.getX() - this.j.x;
    double d2 = paramMotionEvent.getY() - this.j.y;
    return Math.sqrt(d1 * d1 + d2 * d2);
  }
  
  private final XQa<Matrix> a(Matrix paramMatrix)
  {
    if ((this.H.v()) && (((Number)((WVa)RPa.a(this.H)).c()).intValue() != 0))
    {
      paramMatrix = this.G.c(new WVa(Integer.valueOf(0), Integer.valueOf(0))).d(new B(this, paramMatrix));
      oXa.a(paramMatrix, "viewSize.first(Pair(0, 0…     matrix\n            }");
      return paramMatrix;
    }
    paramMatrix = XQa.a(paramMatrix);
    oXa.a(paramMatrix, "Single.just(matrix)");
    return paramMatrix;
  }
  
  private final void a(PointF paramPointF, MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX(0);
    float f2 = paramMotionEvent.getX(1);
    float f3 = paramMotionEvent.getY(0);
    float f4 = paramMotionEvent.getY(1);
    float f5 = 2;
    paramPointF.set((f1 + f2) / f5, (f3 + f4) / f5);
  }
  
  private final double b(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX(0) - paramMotionEvent.getX(1);
    float f2 = paramMotionEvent.getY(0) - paramMotionEvent.getY(1);
    return Math.sqrt(f1 * f1 + f2 * f2);
  }
  
  private final QQa<Float> getMaxZoom()
  {
    float f1 = this.E;
    QQa localQQa;
    if (f1 == 0.0F) {
      localQQa = QQa.a(this.G, this.H, C.a).d();
    } else {
      localQQa = QQa.d(Float.valueOf(f1));
    }
    return localQQa;
  }
  
  private final QQa<Float> getMinZoom()
  {
    return QQa.a(this.G, this.H, new D(this)).d();
  }
  
  public final void a()
  {
    if ((this.H.v()) && (this.G.v()))
    {
      int i1 = ((Number)((WVa)RPa.a(this.H)).c()).intValue();
      int i2 = ((Number)((WVa)RPa.a(this.H)).d()).intValue();
      int i3 = ((Number)((WVa)RPa.a(this.G)).c()).intValue();
      int i4 = ((Number)((WVa)RPa.a(this.G)).d()).intValue();
      if ((i1 > 0) && (i2 > 0) && (i3 > 0) && (i4 > 0))
      {
        float[] arrayOfFloat = new float[9];
        this.f.getValues(arrayOfFloat);
        arrayOfFloat[0] = Math.min(i3 / i1, i4 / i2);
        arrayOfFloat[4] = arrayOfFloat[0];
        this.f.setValues(arrayOfFloat);
        a(this.f).d(new G(this));
      }
    }
  }
  
  public final GVa<WVa<Float, Float>> getClick()
  {
    return this.y;
  }
  
  public final boolean getImageSet()
  {
    return this.v;
  }
  
  public final FVa<WVa<Integer, Integer>> getImageSize()
  {
    return this.H;
  }
  
  public final FVa<Boolean> getLongPress()
  {
    return this.z;
  }
  
  public final FVa<Matrix> getMatrixChangedByUser()
  {
    return this.x;
  }
  
  public final FVa<Matrix> getMatrixComputed()
  {
    return this.w;
  }
  
  public final float getMaxZoomIn()
  {
    return this.E;
  }
  
  public final boolean getMaxZoomOutEnabled()
  {
    return this.D;
  }
  
  public final boolean getScrollEnabled()
  {
    return this.C;
  }
  
  public final String getTAG()
  {
    return this.d;
  }
  
  public final boolean getTouchEnabled()
  {
    return this.F;
  }
  
  public final boolean getUseSetMatrix()
  {
    return this.A;
  }
  
  public final FVa<WVa<Integer, Integer>> getViewSize()
  {
    return this.G;
  }
  
  public final boolean getZoomEnabled()
  {
    return this.B;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    oXa.b(paramMotionEvent, "event");
    int i1 = getVisibility();
    int i2 = 0;
    Object localObject = Boolean.valueOf(false);
    if ((i1 != 8) && (this.F))
    {
      this.A = false;
      i1 = paramMotionEvent.getAction() & 0xFF;
      if (i1 != 0)
      {
        if (i1 != 1) {
          if (i1 != 2)
          {
            if (i1 != 3)
            {
              if (i1 != 5)
              {
                if (i1 != 6)
                {
                  i1 = i2;
                  break label698;
                }
              }
              else
              {
                this.n = b(paramMotionEvent);
                i1 = i2;
                if (this.n <= 10.0F) {
                  break label698;
                }
                this.g.set(this.f);
                a(this.k, paramMotionEvent);
                this.i = 3;
                i1 = i2;
                break label698;
              }
            }
            else
            {
              paramMotionEvent = this.q;
              if (paramMotionEvent != null) {
                paramMotionEvent.i();
              }
              this.z.a(localObject);
              i1 = i2;
              break label698;
            }
          }
          else
          {
            i1 = i2;
            if (((Boolean)RPa.a(this.z)).booleanValue()) {
              break label698;
            }
            i1 = this.i;
            if (i1 != 1)
            {
              if (i1 != 2)
              {
                if (i1 != 3)
                {
                  i1 = i2;
                  break label698;
                }
                double d1 = b(paramMotionEvent);
                if (this.B)
                {
                  paramMotionEvent = this.q;
                  if (paramMotionEvent != null) {
                    paramMotionEvent.i();
                  }
                }
                i1 = i2;
                if (d1 <= 10.0F) {
                  break label698;
                }
                this.m = true;
                i1 = i2;
                if (!this.B) {
                  break label698;
                }
                this.f.set(this.g);
                d1 /= this.n;
                paramMotionEvent = this.s;
                this.f.getValues(paramMotionEvent);
                d1 = Math.min(Math.max(paramMotionEvent[0] * d1, ((Number)getMinZoom().b()).floatValue()), ((Number)getMaxZoom().b()).floatValue()) / paramMotionEvent[0];
                localObject = this.f;
                float f1 = (float)d1;
                paramMotionEvent = this.k;
                ((Matrix)localObject).postScale(f1, f1, paramMotionEvent.x, paramMotionEvent.y);
              }
              else
              {
                this.f.set(this.g);
                i1 = i2;
                if (!this.C) {
                  break label698;
                }
                this.f.postTranslate(paramMotionEvent.getX() - this.j.x, paramMotionEvent.getY() - this.j.y);
              }
              i1 = 1;
              break label698;
            }
            i1 = i2;
            if (a(paramMotionEvent) <= this.e) {
              break label698;
            }
            this.i = 2;
            this.j.set(paramMotionEvent.getX(), paramMotionEvent.getY());
            paramMotionEvent = this.q;
            if (paramMotionEvent != null) {
              paramMotionEvent.i();
            }
            this.m = true;
            i1 = i2;
            break label698;
          }
        }
        this.i = 0;
        paramMotionEvent = this.q;
        if (paramMotionEvent != null) {
          paramMotionEvent.i();
        }
        this.z.a(localObject);
        i1 = i2;
        if (!this.m)
        {
          i1 = i2;
          if (System.currentTimeMillis() - this.l < 'Ş')
          {
            this.y.a(new WVa(Float.valueOf(this.j.x), Float.valueOf(this.j.y)));
            i1 = i2;
          }
        }
      }
      else
      {
        localObject = getParent();
        if (localObject != null) {
          ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
        }
        this.g.set(this.f);
        this.j.set(paramMotionEvent.getX(), paramMotionEvent.getY());
        this.l = System.currentTimeMillis();
        this.m = false;
        this.i = 1;
        paramMotionEvent = this.q;
        if (paramMotionEvent != null) {
          paramMotionEvent.i();
        }
        this.q = QQa.f(500L, TimeUnit.MILLISECONDS).c(new E(this));
        i1 = i2;
      }
      label698:
      if (i1 != 0) {
        a(this.f).d(new F(this));
      }
      return true;
    }
    return false;
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      Context localContext = getContext();
      oXa.a(localContext, "context");
      paramBitmap = new BitmapDrawable(localContext.getResources(), paramBitmap);
    }
    else
    {
      paramBitmap = null;
    }
    setImageDrawable(paramBitmap);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    if ((paramDrawable != null) && (paramDrawable.getIntrinsicWidth() > 0) && (paramDrawable.getIntrinsicHeight() > 0))
    {
      this.H.a(new WVa(Integer.valueOf(paramDrawable.getIntrinsicWidth()), Integer.valueOf(paramDrawable.getIntrinsicHeight())));
      super.setImageDrawable(paramDrawable);
      a(this.f).d(H.a);
      this.v = true;
      return;
    }
    super.setImageDrawable(paramDrawable);
    this.H.a(new WVa(Integer.valueOf(0), Integer.valueOf(0)));
    this.v = false;
  }
  
  public void setImageMatrix(Matrix paramMatrix)
  {
    oXa.b(paramMatrix, "matrix");
    super.setImageMatrix(paramMatrix);
    this.f.set(paramMatrix);
  }
  
  public final void setImageSet(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public void setImageURI(Uri paramUri)
  {
    Object localObject = null;
    if (paramUri != null) {
      paramUri = WOa.a(WOa.e, new WOa.d(paramUri), 0, 0, false, 14, null);
    } else {
      paramUri = null;
    }
    if (paramUri != null)
    {
      localObject = getContext();
      oXa.a(localObject, "context");
      localObject = new BitmapDrawable(((Context)localObject).getResources(), paramUri);
    }
    setImageDrawable((Drawable)localObject);
  }
  
  public final void setMaxZoomIn(float paramFloat)
  {
    this.E = paramFloat;
  }
  
  public final void setMaxZoomOutEnabled(boolean paramBoolean)
  {
    this.D = paramBoolean;
  }
  
  public final void setScrollEnabled(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }
  
  public final void setTAG(String paramString)
  {
    oXa.b(paramString, "<set-?>");
    this.d = paramString;
  }
  
  public final void setTouchEnabled(boolean paramBoolean)
  {
    this.F = paramBoolean;
    if (!paramBoolean) {
      this.i = 0;
    }
  }
  
  public final void setUseSetMatrix(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  public final void setZoomEnabled(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/ScrollZoomImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */