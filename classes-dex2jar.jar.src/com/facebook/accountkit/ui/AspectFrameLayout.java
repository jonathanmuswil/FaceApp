package com.facebook.accountkit.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.FrameLayout;
import sn;

public final class AspectFrameLayout
  extends FrameLayout
{
  private int a;
  private int b;
  private Point c;
  
  public AspectFrameLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public AspectFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public AspectFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  @TargetApi(21)
  public AspectFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, sn.AspectFrameLayout);
    try
    {
      this.b = paramAttributeSet.getDimensionPixelSize(sn.AspectFrameLayout_com_accountkit_aspect_width, 0);
      this.a = paramAttributeSet.getDimensionPixelSize(sn.AspectFrameLayout_com_accountkit_aspect_height, 0);
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  public float getAspectHeight()
  {
    return this.a;
  }
  
  public float getAspectWidth()
  {
    return this.b;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Point localPoint = new Point();
    ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getSize(localPoint);
    this.c = localPoint;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = this.b;
    if (i != 0)
    {
      int j = this.a;
      if (j != 0)
      {
        Point localPoint = this.c;
        if (localPoint != null)
        {
          int k = localPoint.x;
          paramInt1 = k * j / i;
          paramInt2 = localPoint.y;
          if (paramInt1 > paramInt2)
          {
            paramInt2 = k;
          }
          else
          {
            k = i * paramInt2 / j;
            paramInt1 = paramInt2;
            paramInt2 = k;
          }
          super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824));
          return;
        }
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setAspectHeight(int paramInt)
  {
    if (this.a == paramInt) {
      return;
    }
    this.a = paramInt;
    requestLayout();
  }
  
  public void setAspectWidth(int paramInt)
  {
    if (this.b == paramInt) {
      return;
    }
    this.b = paramInt;
    requestLayout();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/AspectFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */