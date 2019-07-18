package android.support.v7.widget;

import android.view.MenuItem;

class qb
  implements ActionMenuView.e
{
  qb(Toolbar paramToolbar) {}
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Toolbar.c localc = this.a.G;
    if (localc != null) {
      return localc.onMenuItemClick(paramMenuItem);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/qb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */