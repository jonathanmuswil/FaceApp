package androidx.browser.browseractions;

import U;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class BrowserActionsFallbackMenuView
  extends LinearLayout
{
  private final int a = getResources().getDimensionPixelOffset(U.browser_actions_context_menu_min_padding);
  private final int b = getResources().getDimensionPixelOffset(U.browser_actions_context_menu_max_width);
  
  public BrowserActionsFallbackMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - this.a * 2, this.b), 1073741824), paramInt2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/androidx/browser/browseractions/BrowserActionsFallbackMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */