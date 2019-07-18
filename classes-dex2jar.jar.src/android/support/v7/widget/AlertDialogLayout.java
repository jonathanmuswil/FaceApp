package android.support.v7.widget;

import Ld;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.f;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

public class AlertDialogLayout
  extends pa
{
  public AlertDialogLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public AlertDialogLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt3 + paramInt1, paramInt4 + paramInt2);
  }
  
  private static int c(View paramView)
  {
    int i = y.m(paramView);
    if (i > 0) {
      return i;
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      if (paramView.getChildCount() == 1) {
        return c(paramView.getChildAt(0));
      }
    }
    return 0;
  }
  
  private void e(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (int j = 0; j < paramInt1; j++)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() != 8)
      {
        pa.a locala = (pa.a)localView.getLayoutParams();
        if (locala.width == -1)
        {
          int k = locala.height;
          locala.height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, i, 0, paramInt2, 0);
          locala.height = k;
        }
      }
    }
  }
  
  private boolean f(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    Object localObject1 = null;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    int j = 0;
    Object localObject4 = localObject2;
    while (j < i)
    {
      localObject2 = getChildAt(j);
      if (((View)localObject2).getVisibility() != 8)
      {
        k = ((View)localObject2).getId();
        if (k == Ld.topPanel)
        {
          localObject1 = localObject2;
        }
        else if (k == Ld.buttonPanel)
        {
          localObject4 = localObject2;
        }
        else
        {
          if ((k != Ld.contentPanel) && (k != Ld.customPanel)) {
            return false;
          }
          if (localObject3 != null) {
            return false;
          }
          localObject3 = localObject2;
        }
      }
      j++;
    }
    int m = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt2);
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = getPaddingTop() + getPaddingBottom();
    if (localObject1 != null)
    {
      ((View)localObject1).measure(paramInt1, 0);
      i2 += ((View)localObject1).getMeasuredHeight();
      k = View.combineMeasuredStates(0, ((View)localObject1).getMeasuredState());
    }
    else
    {
      k = 0;
    }
    int i3;
    if (localObject4 != null)
    {
      ((View)localObject4).measure(paramInt1, 0);
      j = c((View)localObject4);
      i3 = ((View)localObject4).getMeasuredHeight() - j;
      i2 += j;
      k = View.combineMeasuredStates(k, ((View)localObject4).getMeasuredState());
    }
    else
    {
      j = 0;
      i3 = 0;
    }
    int i5;
    if (localObject3 != null)
    {
      if (m == 0) {
        i4 = 0;
      } else {
        i4 = View.MeasureSpec.makeMeasureSpec(Math.max(0, n - i2), m);
      }
      ((View)localObject3).measure(paramInt1, i4);
      i5 = ((View)localObject3).getMeasuredHeight();
      i2 += i5;
      k = View.combineMeasuredStates(k, ((View)localObject3).getMeasuredState());
    }
    else
    {
      i5 = 0;
    }
    int i6 = n - i2;
    n = k;
    int i7 = i6;
    int i4 = i2;
    if (localObject4 != null)
    {
      i3 = Math.min(i6, i3);
      n = i6;
      i4 = j;
      if (i3 > 0)
      {
        n = i6 - i3;
        i4 = j + i3;
      }
      ((View)localObject4).measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
      i4 = i2 - j + ((View)localObject4).getMeasuredHeight();
      j = View.combineMeasuredStates(k, ((View)localObject4).getMeasuredState());
      i7 = n;
      n = j;
    }
    int k = n;
    j = i4;
    if (localObject3 != null)
    {
      k = n;
      j = i4;
      if (i7 > 0)
      {
        ((View)localObject3).measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i5 + i7, m));
        j = i4 - i5 + ((View)localObject3).getMeasuredHeight();
        k = View.combineMeasuredStates(n, ((View)localObject3).getMeasuredState());
      }
    }
    i2 = 0;
    for (n = 0; i2 < i; n = i4)
    {
      localObject2 = getChildAt(i2);
      i4 = n;
      if (((View)localObject2).getVisibility() != 8) {
        i4 = Math.max(n, ((View)localObject2).getMeasuredWidth());
      }
      i2++;
    }
    setMeasuredDimension(View.resolveSizeAndState(n + (getPaddingLeft() + getPaddingRight()), paramInt1, k), View.resolveSizeAndState(j, paramInt2, 0));
    if (i1 != 1073741824) {
      e(i, paramInt2);
    }
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int k = getPaddingRight();
    int m = getPaddingRight();
    paramInt3 = getMeasuredHeight();
    int n = getChildCount();
    int i1 = getGravity();
    paramInt1 = i1 & 0x70;
    if (paramInt1 != 16)
    {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - paramInt3;
      }
    }
    else {
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - paramInt3) / 2;
    }
    Object localObject = getDividerDrawable();
    if (localObject == null) {
      paramInt2 = 0;
    } else {
      paramInt2 = ((Drawable)localObject).getIntrinsicHeight();
    }
    paramInt3 = 0;
    while (paramInt3 < n)
    {
      View localView = getChildAt(paramInt3);
      paramInt4 = paramInt1;
      if (localView != null)
      {
        paramInt4 = paramInt1;
        if (localView.getVisibility() != 8)
        {
          int i2 = localView.getMeasuredWidth();
          int i3 = localView.getMeasuredHeight();
          localObject = (pa.a)localView.getLayoutParams();
          int i4 = ((pa.a)localObject).b;
          paramInt4 = i4;
          if (i4 < 0) {
            paramInt4 = i1 & 0x800007;
          }
          paramInt4 = f.a(paramInt4, y.l(this)) & 0x7;
          if (paramInt4 != 1)
          {
            if (paramInt4 != 5)
            {
              paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin + i;
              break label304;
            }
            i4 = j - k - i2;
            paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
          }
          else
          {
            i4 = (j - i - m - i2) / 2 + i + ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
            paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
          }
          paramInt4 = i4 - paramInt4;
          label304:
          i4 = paramInt1;
          if (c(paramInt3)) {
            i4 = paramInt1 + paramInt2;
          }
          paramInt1 = i4 + ((ViewGroup.MarginLayoutParams)localObject).topMargin;
          b(localView, paramInt4, paramInt1, i2, i3);
          paramInt4 = paramInt1 + (i3 + ((ViewGroup.MarginLayoutParams)localObject).bottomMargin);
        }
      }
      paramInt3++;
      paramInt1 = paramInt4;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!f(paramInt1, paramInt2)) {
      super.onMeasure(paramInt1, paramInt2);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/AlertDialogLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */