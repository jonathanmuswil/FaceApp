package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

public class p
  extends a
{
  private final ListView s;
  
  public p(ListView paramListView)
  {
    super(paramListView);
    this.s = paramListView;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    q.b(this.s, paramInt2);
  }
  
  public boolean a(int paramInt)
  {
    return false;
  }
  
  public boolean b(int paramInt)
  {
    ListView localListView = this.s;
    int i = localListView.getCount();
    if (i == 0) {
      return false;
    }
    int j = localListView.getChildCount();
    int k = localListView.getFirstVisiblePosition();
    if (paramInt > 0)
    {
      if ((k + j >= i) && (localListView.getChildAt(j - 1).getBottom() <= localListView.getHeight())) {
        return false;
      }
    }
    else
    {
      if (paramInt >= 0) {
        break label85;
      }
      if ((k <= 0) && (localListView.getChildAt(0).getTop() >= 0)) {
        return false;
      }
    }
    return true;
    label85:
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */