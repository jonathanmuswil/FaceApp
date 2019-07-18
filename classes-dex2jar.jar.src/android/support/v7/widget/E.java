package android.support.v7.widget;

import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

class e
  implements Runnable
{
  e(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public void run()
  {
    this.a.h();
    ActionBarOverlayLayout localActionBarOverlayLayout = this.a;
    localActionBarOverlayLayout.x = localActionBarOverlayLayout.e.animate().translationY(0.0F).setListener(this.a.y);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */