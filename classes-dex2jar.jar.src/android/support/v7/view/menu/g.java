package android.support.v7.view.menu;

import android.view.MenuItem;

class g
  implements Runnable
{
  g(h paramh, i.a parama, MenuItem paramMenuItem, l paraml) {}
  
  public void run()
  {
    i.a locala = this.a;
    if (locala != null)
    {
      this.d.a.B = true;
      locala.b.a(false);
      this.d.a.B = false;
    }
    if ((this.b.isEnabled()) && (this.b.hasSubMenu())) {
      this.c.a(this.b, 4);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */