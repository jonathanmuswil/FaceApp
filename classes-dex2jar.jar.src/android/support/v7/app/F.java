package android.support.v7.app;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class f
  implements AbsListView.OnScrollListener
{
  f(AlertController paramAlertController, View paramView1, View paramView2) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AlertController.a(paramAbsListView, this.a, this.b);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */