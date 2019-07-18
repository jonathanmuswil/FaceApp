package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import fa;
import yd;
import yd.a;

public class h
  extends FrameLayout
{
  private final AccessibilityManager a;
  private final yd.a b;
  private f c;
  private e d;
  
  protected h(Context paramContext)
  {
    this(paramContext, null);
  }
  
  protected h(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, fa.SnackbarLayout);
    if (paramAttributeSet.hasValue(fa.SnackbarLayout_elevation)) {
      y.b(this, paramAttributeSet.getDimensionPixelSize(fa.SnackbarLayout_elevation, 0));
    }
    paramAttributeSet.recycle();
    this.a = ((AccessibilityManager)paramContext.getSystemService("accessibility"));
    this.b = new g(this);
    yd.a(this.a, this.b);
    setClickableOrFocusableBasedOnAccessibility(this.a.isTouchExplorationEnabled());
  }
  
  private void setClickableOrFocusableBasedOnAccessibility(boolean paramBoolean)
  {
    setClickable(paramBoolean ^ true);
    setFocusable(paramBoolean);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    e locale = this.d;
    if (locale != null) {
      locale.onViewAttachedToWindow(this);
    }
    y.F(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    e locale = this.d;
    if (locale != null) {
      locale.onViewDetachedFromWindow(this);
    }
    yd.b(this.a, this.b);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    f localf = this.c;
    if (localf != null) {
      localf.a(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  void setOnAttachStateChangeListener(e parame)
  {
    this.d = parame;
  }
  
  void setOnLayoutChangeListener(f paramf)
  {
    this.c = paramf;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */