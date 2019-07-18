package android.support.design.widget;

import Ha;
import Y;
import aa;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.y;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import fa;

public class SnackbarContentLayout
  extends LinearLayout
  implements Ha
{
  private TextView a;
  private Button b;
  private int c;
  private int d;
  
  public SnackbarContentLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SnackbarContentLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, fa.SnackbarLayout);
    this.c = paramContext.getDimensionPixelSize(fa.SnackbarLayout_android_maxWidth, -1);
    this.d = paramContext.getDimensionPixelSize(fa.SnackbarLayout_maxActionInlineWidth, -1);
    paramContext.recycle();
  }
  
  private static void a(View paramView, int paramInt1, int paramInt2)
  {
    if (y.D(paramView)) {
      y.a(paramView, y.p(paramView), paramInt1, y.o(paramView), paramInt2);
    } else {
      paramView.setPadding(paramView.getPaddingLeft(), paramInt1, paramView.getPaddingRight(), paramInt2);
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool;
    if (paramInt1 != getOrientation())
    {
      setOrientation(paramInt1);
      bool = true;
    }
    else
    {
      bool = false;
    }
    if ((this.a.getPaddingTop() != paramInt2) || (this.a.getPaddingBottom() != paramInt3))
    {
      a(this.a, paramInt2, paramInt3);
      bool = true;
    }
    return bool;
  }
  
  public Button getActionView()
  {
    return this.b;
  }
  
  public TextView getMessageView()
  {
    return this.a;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(aa.snackbar_text));
    this.b = ((Button)findViewById(aa.snackbar_action));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = paramInt1;
    if (this.c > 0)
    {
      j = getMeasuredWidth();
      k = this.c;
      i = paramInt1;
      if (j > k)
      {
        i = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
        super.onMeasure(i, paramInt2);
      }
    }
    int m = getResources().getDimensionPixelSize(Y.design_snackbar_padding_vertical_2lines);
    int j = getResources().getDimensionPixelSize(Y.design_snackbar_padding_vertical);
    paramInt1 = this.a.getLayout().getLineCount();
    int k = 1;
    if (paramInt1 > 1) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    if ((paramInt1 != 0) && (this.d > 0) && (this.b.getMeasuredWidth() > this.d))
    {
      if (a(1, m, m - j))
      {
        paramInt1 = k;
        break label177;
      }
    }
    else
    {
      if (paramInt1 != 0) {
        paramInt1 = m;
      } else {
        paramInt1 = j;
      }
      if (a(0, paramInt1, paramInt1))
      {
        paramInt1 = k;
        break label177;
      }
    }
    paramInt1 = 0;
    label177:
    if (paramInt1 != 0) {
      super.onMeasure(i, paramInt2);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/SnackbarContentLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */