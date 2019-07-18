package android.support.v7.widget;

import Pd;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.s;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

class v
  extends PopupWindow
{
  private static final boolean a;
  private boolean b;
  
  static
  {
    boolean bool;
    if (Build.VERSION.SDK_INT < 21) {
      bool = true;
    } else {
      bool = false;
    }
    a = bool;
  }
  
  public v(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = pb.a(paramContext, paramAttributeSet, Pd.PopupWindow, paramInt1, paramInt2);
    if (paramContext.g(Pd.PopupWindow_overlapAnchor)) {
      a(paramContext.a(Pd.PopupWindow_overlapAnchor, false));
    }
    setBackgroundDrawable(paramContext.b(Pd.PopupWindow_android_popupBackground));
    paramContext.a();
  }
  
  private void a(boolean paramBoolean)
  {
    if (a) {
      this.b = paramBoolean;
    } else {
      s.a(this, paramBoolean);
    }
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (a)
    {
      i = paramInt2;
      if (this.b) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (a)
    {
      i = paramInt2;
      if (this.b) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt2;
    if (a)
    {
      i = paramInt2;
      if (this.b) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.update(paramView, paramInt1, i, paramInt3, paramInt4);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */