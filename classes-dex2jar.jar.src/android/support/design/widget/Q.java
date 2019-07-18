package android.support.design.widget;

import android.support.v4.view.d;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import zd;

class q
  extends d
{
  q(CheckableImageButton paramCheckableImageButton) {}
  
  public void a(View paramView, zd paramzd)
  {
    super.a(paramView, paramzd);
    paramzd.b(true);
    paramzd.c(this.c.isChecked());
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.b(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setChecked(this.c.isChecked());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */