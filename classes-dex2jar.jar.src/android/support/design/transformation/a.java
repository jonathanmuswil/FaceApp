package android.support.design.transformation;

import Ba;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

class a
  implements ViewTreeObserver.OnPreDrawListener
{
  a(ExpandableBehavior paramExpandableBehavior, View paramView, int paramInt, Ba paramBa) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (ExpandableBehavior.a(this.d) == this.b)
    {
      ExpandableBehavior localExpandableBehavior = this.d;
      Ba localBa = this.c;
      localExpandableBehavior.a((View)localBa, this.a, localBa.a(), false);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */