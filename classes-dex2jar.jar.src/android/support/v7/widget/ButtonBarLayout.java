package android.support.v7.widget;

import Ld;
import Pd;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ButtonBarLayout
  extends LinearLayout
{
  private boolean a;
  private int b = -1;
  private int c = 0;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Pd.ButtonBarLayout);
    this.a = paramContext.getBoolean(Pd.ButtonBarLayout_allowStacking, true);
    paramContext.recycle();
  }
  
  private int a(int paramInt)
  {
    int i = getChildCount();
    while (paramInt < i)
    {
      if (getChildAt(paramInt).getVisibility() == 0) {
        return paramInt;
      }
      paramInt++;
    }
    return -1;
  }
  
  private boolean a()
  {
    int i = getOrientation();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  private void setStacked(boolean paramBoolean)
  {
    setOrientation(paramBoolean);
    int i;
    if (paramBoolean) {
      i = 5;
    } else {
      i = 80;
    }
    setGravity(i);
    View localView = findViewById(Ld.spacer);
    if (localView != null)
    {
      if (paramBoolean) {
        paramBoolean = true;
      } else {
        paramBoolean = true;
      }
      localView.setVisibility(paramBoolean);
    }
    for (paramBoolean = getChildCount() - 2; !paramBoolean; paramBoolean--) {
      bringChildToFront(getChildAt(paramBoolean));
    }
  }
  
  public int getMinimumHeight()
  {
    return Math.max(this.c, super.getMinimumHeight());
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    boolean bool = this.a;
    int j = 0;
    if (bool)
    {
      if ((i > this.b) && (a())) {
        setStacked(false);
      }
      this.b = i;
    }
    int k;
    if ((!a()) && (View.MeasureSpec.getMode(paramInt1) == 1073741824))
    {
      k = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
      i = 1;
    }
    else
    {
      k = paramInt1;
      i = 0;
    }
    super.onMeasure(k, paramInt2);
    int m = i;
    if (this.a)
    {
      m = i;
      if (!a())
      {
        if ((getMeasuredWidthAndState() & 0xFF000000) == 16777216) {
          k = 1;
        } else {
          k = 0;
        }
        m = i;
        if (k != 0)
        {
          setStacked(true);
          m = 1;
        }
      }
    }
    if (m != 0) {
      super.onMeasure(paramInt1, paramInt2);
    }
    i = a(0);
    paramInt1 = j;
    if (i >= 0)
    {
      View localView = getChildAt(i);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      paramInt2 = getPaddingTop() + localView.getMeasuredHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin + 0;
      if (a())
      {
        i = a(i + 1);
        paramInt1 = paramInt2;
        if (i >= 0) {
          paramInt1 = paramInt2 + (getChildAt(i).getPaddingTop() + (int)(getResources().getDisplayMetrics().density * 16.0F));
        }
      }
      else
      {
        paramInt1 = paramInt2 + getPaddingBottom();
      }
    }
    if (y.m(this) != paramInt1) {
      setMinimumHeight(paramInt1);
    }
  }
  
  public void setAllowStacking(boolean paramBoolean)
  {
    if (this.a != paramBoolean)
    {
      this.a = paramBoolean;
      if ((!this.a) && (getOrientation() == 1)) {
        setStacked(false);
      }
      requestLayout();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ButtonBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */