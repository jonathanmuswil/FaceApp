package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public final class Snackbar$SnackbarLayout
  extends h
{
  public Snackbar$SnackbarLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public Snackbar$SnackbarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = getChildCount();
    int j = getMeasuredWidth();
    int k = getPaddingLeft();
    paramInt2 = getPaddingRight();
    for (paramInt1 = 0; paramInt1 < i; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getLayoutParams().width == -1) {
        localView.measure(View.MeasureSpec.makeMeasureSpec(j - k - paramInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/Snackbar$SnackbarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */