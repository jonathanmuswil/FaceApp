package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class SquareFrameLayout
  extends FrameLayout
{
  public SquareFrameLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public SquareFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/zhihu/matisse/internal/ui/widget/SquareFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */