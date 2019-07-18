package io.faceapp.ui.components;

import FVa;
import WOa;
import WOa.d;
import WVa;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import cWa;
import io.faceapp.l;
import oXa;

public final class CropImageView
  extends View
{
  public static final a a = new a(null);
  private final Paint b = new Paint(1);
  private final Rect c = new Rect();
  private final Rect d = new Rect();
  private final Rect e = new Rect();
  private final PointF f = new PointF();
  private final FVa<Rect> g;
  private int h;
  private int i;
  private Drawable j;
  private boolean k;
  
  public CropImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CropImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    FVa localFVa = FVa.t();
    oXa.a(localFVa, "BehaviorSubject.create<Rect>()");
    this.g = localFVa;
    this.h = -1;
    this.i = -1;
    if (paramContext != null) {
      a(paramContext, paramAttributeSet);
    }
  }
  
  private final void a()
  {
    if (this.k)
    {
      if (this.h < 0) {
        this.h = Math.min(getWidth() - this.i * 2, getHeight() - this.i * 2);
      }
      int m = (getWidth() - this.h) / 2;
      int n = getHeight();
      int i1 = this.h;
      n = (n - i1) / 2;
      this.c.set(m, n, m + i1, i1 + n);
      this.g.a(new Rect(this.c));
      Object localObject = this.j;
      if (localObject != null)
      {
        m = ((Drawable)localObject).getIntrinsicHeight();
        localObject = this.j;
        if (localObject != null)
        {
          m = Math.min(m, ((Drawable)localObject).getIntrinsicWidth());
          float f1 = this.h / m;
          localObject = this.j;
          if (localObject != null)
          {
            int i2 = (int)(((Drawable)localObject).getIntrinsicWidth() * f1);
            localObject = this.j;
            if (localObject != null)
            {
              n = (int)(((Drawable)localObject).getIntrinsicHeight() * f1);
              localObject = this.c;
              m = ((Rect)localObject).left + ((Rect)localObject).width() / 2 - i2 / 2;
              localObject = this.c;
              i1 = ((Rect)localObject).top + ((Rect)localObject).height() / 2 - n / 2;
              this.d.set(m, i1, i2 + m, n + i1);
              localObject = this.j;
              if (localObject != null)
              {
                ((Drawable)localObject).setBounds(this.d);
                this.k = false;
              }
              else
              {
                oXa.b("imageDrawable");
                throw null;
              }
            }
            else
            {
              oXa.b("imageDrawable");
              throw null;
            }
          }
          else
          {
            oXa.b("imageDrawable");
            throw null;
          }
        }
        else
        {
          oXa.b("imageDrawable");
          throw null;
        }
      }
      else
      {
        oXa.b("imageDrawable");
        throw null;
      }
    }
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    this.d.set(this.e);
    this.d.offset(paramInt1, paramInt2);
    Rect localRect = this.d;
    paramInt1 = localRect.left;
    paramInt2 = this.c.left;
    if (paramInt1 > paramInt2) {
      localRect.offset(paramInt2 - paramInt1, 0);
    }
    localRect = this.d;
    paramInt1 = localRect.right;
    paramInt2 = this.c.right;
    if (paramInt1 < paramInt2) {
      localRect.offset(paramInt2 - paramInt1, 0);
    }
    localRect = this.d;
    paramInt1 = localRect.top;
    paramInt2 = this.c.top;
    if (paramInt1 > paramInt2) {
      localRect.offset(0, paramInt2 - paramInt1);
    }
    localRect = this.d;
    paramInt2 = localRect.bottom;
    paramInt1 = this.c.bottom;
    if (paramInt2 < paramInt1) {
      localRect.offset(0, paramInt1 - paramInt2);
    }
    invalidate();
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, l.CropImageView, 0, 0);
      try
      {
        this.h = paramContext.getDimensionPixelSize(32, -1);
        this.i = paramContext.getDimensionPixelSize(34, -1);
        this.b.setColor(paramContext.getColor(33, -7829368));
        paramAttributeSet = paramContext.getDrawable(35);
        if (paramAttributeSet != null)
        {
          this.j = paramAttributeSet;
          paramAttributeSet = cWa.a;
        }
      }
      finally
      {
        paramContext.recycle();
      }
    }
    if ((this.h < 0) && (this.i < 0)) {
      throw new IllegalStateException("Either maskSize or overlaySize must be > 0");
    }
    this.k = true;
  }
  
  private final int b(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (m == 1073741824) {
      return paramInt1;
    }
    if (m == Integer.MIN_VALUE) {
      return Math.min(paramInt2, paramInt1);
    }
    return paramInt2;
  }
  
  private final int getDesiredHeight()
  {
    return this.h + this.i * 2;
  }
  
  private final int getDesiredWidth()
  {
    return this.h + this.i * 2;
  }
  
  public final WVa<Float, Float> getImageScrollPercentage()
  {
    int m = this.d.width();
    int n = this.c.width();
    float f1 = 0.0F;
    float f2;
    Rect localRect;
    if (m == n)
    {
      f2 = 0.0F;
    }
    else
    {
      m = this.c.left;
      localRect = this.d;
      f2 = (m - localRect.left) / localRect.width();
    }
    if (this.d.height() != this.c.height())
    {
      m = this.c.top;
      localRect = this.d;
      f1 = (m - localRect.top) / localRect.height();
    }
    return new WVa(Float.valueOf(f2), Float.valueOf(f1));
  }
  
  public final FVa<Rect> getMaskRectSubject()
  {
    return this.g;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    oXa.b(paramCanvas, "canvas");
    super.onDraw(paramCanvas);
    a();
    Drawable localDrawable = this.j;
    if (localDrawable != null)
    {
      localDrawable.setBounds(this.d);
      localDrawable = this.j;
      if (localDrawable != null)
      {
        localDrawable.draw(paramCanvas);
        paramCanvas.clipRect(0, 0, getWidth(), getHeight());
        paramCanvas.clipRect(this.c, Region.Op.DIFFERENCE);
        paramCanvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), this.b);
        return;
      }
      oXa.b("imageDrawable");
      throw null;
    }
    oXa.b("imageDrawable");
    throw null;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(b(paramInt1, getDesiredWidth()), b(paramInt2, getDesiredHeight()));
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    oXa.b(paramMotionEvent, "event");
    int m = paramMotionEvent.getAction();
    if (m != 0)
    {
      if (m == 2)
      {
        float f1 = paramMotionEvent.getX();
        float f2 = this.f.x;
        float f3 = paramMotionEvent.getY();
        float f4 = this.f.y;
        a((int)(f1 - f2), (int)(f3 - f4));
      }
    }
    else
    {
      if (!this.c.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
        return false;
      }
      this.e.set(this.d);
      this.f.set(paramMotionEvent.getX(), paramMotionEvent.getY());
    }
    return true;
  }
  
  public final void setImageURI(Uri paramUri)
  {
    oXa.b(paramUri, "uri");
    paramUri = WOa.a(WOa.e, new WOa.d(paramUri), 0, 0, false, 14, null);
    if (paramUri != null)
    {
      Context localContext = getContext();
      oXa.a(localContext, "context");
      this.j = new BitmapDrawable(localContext.getResources(), paramUri);
      this.k = true;
      invalidate();
      return;
    }
    oXa.a();
    throw null;
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/CropImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */