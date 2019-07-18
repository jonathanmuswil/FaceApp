package com.facebook.accountkit.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import sn;

public final class ConstrainedLinearLayout
  extends LinearLayout
{
  private int a = -1;
  private int b = -1;
  private int c = -1;
  
  public ConstrainedLinearLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public ConstrainedLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public ConstrainedLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  @TargetApi(21)
  public ConstrainedLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if ((paramAttributeSet != null) && (!isInEditMode()))
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, sn.ConstrainedLinearLayout);
      try
      {
        this.a = paramContext.getDimensionPixelSize(sn.ConstrainedLinearLayout_com_accountkit_max_height, this.a);
        this.b = paramContext.getDimensionPixelSize(sn.ConstrainedLinearLayout_com_accountkit_max_width, this.b);
        this.c = paramContext.getDimensionPixelSize(sn.ConstrainedLinearLayout_com_accountkit_min_height, this.c);
        return;
      }
      finally
      {
        paramContext.recycle();
      }
    }
  }
  
  public int getMinHeight()
  {
    return this.c;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = getMeasuredWidth();
    int j = getMeasuredHeight();
    int k = this.b;
    int m;
    if ((k >= 0) && (i > k))
    {
      m = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
      k = 1;
    }
    else
    {
      k = 0;
      m = paramInt1;
    }
    int n = this.a;
    i = k;
    paramInt1 = paramInt2;
    if (n >= 0)
    {
      i = k;
      paramInt1 = paramInt2;
      if (j > n)
      {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
        i = 1;
      }
    }
    n = this.c;
    k = i;
    paramInt2 = paramInt1;
    if (n >= 0)
    {
      k = i;
      paramInt2 = paramInt1;
      if (j < n)
      {
        paramInt2 = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
        k = 1;
      }
    }
    if (k != 0) {
      super.onMeasure(m, paramInt2);
    }
  }
  
  public void setMinHeight(int paramInt)
  {
    this.c = paramInt;
    requestLayout();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ConstrainedLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */