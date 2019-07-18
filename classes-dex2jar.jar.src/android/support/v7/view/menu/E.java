package android.support.v7.view.menu;

import android.support.v7.widget.va;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Iterator;
import java.util.List;

class e
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  e(i parami) {}
  
  public void onGlobalLayout()
  {
    if ((this.a.L()) && (this.a.j.size() > 0) && (!((i.a)this.a.j.get(0)).a.h()))
    {
      Object localObject = this.a.q;
      if ((localObject != null) && (((View)localObject).isShown())) {
        localObject = this.a.j.iterator();
      }
      while (((Iterator)localObject).hasNext())
      {
        ((i.a)((Iterator)localObject).next()).a.K();
        continue;
        this.a.dismiss();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */