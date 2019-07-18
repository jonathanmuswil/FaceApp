import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class uwa
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  uwa(qwa paramqwa, View paramView) {}
  
  public final void onGlobalLayout()
  {
    Rect localRect = new Rect();
    this.b.getWindowVisibleDisplayFrame(localRect);
    Object localObject = this.b.getRootView();
    oXa.a(localObject, "view.rootView");
    int i = ((View)localObject).getHeight();
    int j = localRect.bottom;
    localObject = this.a;
    boolean bool;
    if (i - j > i * 0.15D) {
      bool = true;
    } else {
      bool = false;
    }
    qwa.a((qwa)localObject, bool);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/uwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */