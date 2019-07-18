package android.support.design.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout
  extends ViewGroup
{
  private int a = -1;
  
  public BaselineLayout(Context paramContext)
  {
    super(paramContext, null, 0);
  }
  
  public BaselineLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public BaselineLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public int getBaseline()
  {
    return this.a;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    int m = getPaddingTop();
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
    {
      View localView = getChildAt(paramInt2);
      if (localView.getVisibility() != 8)
      {
        int n = localView.getMeasuredWidth();
        int i1 = localView.getMeasuredHeight();
        int i2 = (paramInt3 - paramInt1 - k - j - n) / 2 + j;
        if ((this.a != -1) && (localView.getBaseline() != -1)) {
          paramInt4 = this.a + m - localView.getBaseline();
        } else {
          paramInt4 = m;
        }
        localView.layout(i2, paramInt4, n + i2, i1 + paramInt4);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    int j = 0;
    int k = -1;
    int m = -1;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() != 8)
      {
        measureChild(localView, paramInt1, paramInt2);
        int i3 = localView.getBaseline();
        int i4 = k;
        i5 = m;
        if (i3 != -1)
        {
          i4 = Math.max(k, i3);
          i5 = Math.max(m, localView.getMeasuredHeight() - i3);
        }
        i1 = Math.max(i1, localView.getMeasuredWidth());
        n = Math.max(n, localView.getMeasuredHeight());
        i2 = View.combineMeasuredStates(i2, localView.getMeasuredState());
        m = i5;
        k = i4;
      }
      j++;
    }
    int i5 = n;
    if (k != -1)
    {
      i5 = Math.max(n, Math.max(m, getPaddingBottom()) + k);
      this.a = k;
    }
    n = Math.max(i5, getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSizeAndState(Math.max(i1, getSuggestedMinimumWidth()), paramInt1, i2), View.resolveSizeAndState(n, paramInt2, i2 << 16));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/internal/BaselineLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */