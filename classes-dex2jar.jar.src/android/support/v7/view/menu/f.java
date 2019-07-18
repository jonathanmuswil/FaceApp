package android.support.v7.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

class f
  implements View.OnAttachStateChangeListener
{
  f(i parami) {}
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Object localObject = this.a.z;
    if (localObject != null)
    {
      if (!((ViewTreeObserver)localObject).isAlive()) {
        this.a.z = paramView.getViewTreeObserver();
      }
      localObject = this.a;
      ((i)localObject).z.removeGlobalOnLayoutListener(((i)localObject).k);
    }
    paramView.removeOnAttachStateChangeListener(this);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */