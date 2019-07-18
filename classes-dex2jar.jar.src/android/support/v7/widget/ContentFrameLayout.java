package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout
  extends FrameLayout
{
  private TypedValue a;
  private TypedValue b;
  private TypedValue c;
  private TypedValue d;
  private TypedValue e;
  private TypedValue f;
  private final Rect g = new Rect();
  private a h;
  
  public ContentFrameLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.g.set(paramInt1, paramInt2, paramInt3, paramInt4);
    if (y.B(this)) {
      requestLayout();
    }
  }
  
  public void a(Rect paramRect)
  {
    fitSystemWindows(paramRect);
  }
  
  public TypedValue getFixedHeightMajor()
  {
    if (this.e == null) {
      this.e = new TypedValue();
    }
    return this.e;
  }
  
  public TypedValue getFixedHeightMinor()
  {
    if (this.f == null) {
      this.f = new TypedValue();
    }
    return this.f;
  }
  
  public TypedValue getFixedWidthMajor()
  {
    if (this.c == null) {
      this.c = new TypedValue();
    }
    return this.c;
  }
  
  public TypedValue getFixedWidthMinor()
  {
    if (this.d == null) {
      this.d = new TypedValue();
    }
    return this.d;
  }
  
  public TypedValue getMinWidthMajor()
  {
    if (this.a == null) {
      this.a = new TypedValue();
    }
    return this.a;
  }
  
  public TypedValue getMinWidthMinor()
  {
    if (this.b == null) {
      this.b = new TypedValue();
    }
    return this.b;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a locala = this.h;
    if (locala != null) {
      locala.a();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a locala = this.h;
    if (locala != null) {
      locala.onDetachedFromWindow();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    int i = localDisplayMetrics.widthPixels;
    int j = localDisplayMetrics.heightPixels;
    int k = 1;
    if (i < j) {
      i = 1;
    } else {
      i = 0;
    }
    int m = View.MeasureSpec.getMode(paramInt1);
    int n = View.MeasureSpec.getMode(paramInt2);
    Object localObject;
    float f1;
    if (m == Integer.MIN_VALUE)
    {
      if (i != 0) {
        localObject = this.d;
      } else {
        localObject = this.c;
      }
      if (localObject != null)
      {
        j = ((TypedValue)localObject).type;
        if (j != 0)
        {
          if (j == 5) {}
          for (f1 = ((TypedValue)localObject).getDimension(localDisplayMetrics);; f1 = ((TypedValue)localObject).getFraction(j, j))
          {
            j = (int)f1;
            break label152;
            if (j != 6) {
              break;
            }
            j = localDisplayMetrics.widthPixels;
          }
          j = 0;
          label152:
          if (j > 0)
          {
            localObject = this.g;
            i1 = View.MeasureSpec.makeMeasureSpec(Math.min(j - (((Rect)localObject).left + ((Rect)localObject).right), View.MeasureSpec.getSize(paramInt1)), 1073741824);
            paramInt1 = 1;
            break label201;
          }
        }
      }
    }
    int i1 = paramInt1;
    paramInt1 = 0;
    label201:
    j = paramInt2;
    if (n == Integer.MIN_VALUE)
    {
      if (i != 0) {
        localObject = this.e;
      } else {
        localObject = this.f;
      }
      j = paramInt2;
      if (localObject != null)
      {
        n = ((TypedValue)localObject).type;
        j = paramInt2;
        if (n != 0)
        {
          if (n == 5) {}
          for (f1 = ((TypedValue)localObject).getDimension(localDisplayMetrics);; f1 = ((TypedValue)localObject).getFraction(j, j))
          {
            n = (int)f1;
            break label308;
            if (n != 6) {
              break;
            }
            j = localDisplayMetrics.heightPixels;
          }
          n = 0;
          label308:
          j = paramInt2;
          if (n > 0)
          {
            localObject = this.g;
            j = View.MeasureSpec.makeMeasureSpec(Math.min(n - (((Rect)localObject).top + ((Rect)localObject).bottom), View.MeasureSpec.getSize(paramInt2)), 1073741824);
          }
        }
      }
    }
    super.onMeasure(i1, j);
    n = getMeasuredWidth();
    i1 = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
    if ((paramInt1 == 0) && (m == Integer.MIN_VALUE))
    {
      if (i != 0) {
        localObject = this.b;
      } else {
        localObject = this.a;
      }
      if (localObject != null)
      {
        paramInt1 = ((TypedValue)localObject).type;
        if (paramInt1 != 0)
        {
          if (paramInt1 == 5) {}
          for (f1 = ((TypedValue)localObject).getDimension(localDisplayMetrics);; f1 = ((TypedValue)localObject).getFraction(paramInt1, paramInt1))
          {
            paramInt1 = (int)f1;
            break label466;
            if (paramInt1 != 6) {
              break;
            }
            paramInt1 = localDisplayMetrics.widthPixels;
          }
          paramInt1 = 0;
          label466:
          paramInt2 = paramInt1;
          if (paramInt1 > 0)
          {
            localObject = this.g;
            paramInt2 = paramInt1 - (((Rect)localObject).left + ((Rect)localObject).right);
          }
          if (n < paramInt2)
          {
            paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
            paramInt1 = k;
            break label516;
          }
        }
      }
    }
    paramInt1 = 0;
    paramInt2 = i1;
    label516:
    if (paramInt1 != 0) {
      super.onMeasure(paramInt2, j);
    }
  }
  
  public void setAttachListener(a parama)
  {
    this.h = parama;
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void onDetachedFromWindow();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ContentFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */