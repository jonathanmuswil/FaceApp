package android.support.v7.view.menu;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.wa;
import android.view.MenuItem;
import java.util.List;

class h
  implements wa
{
  h(i parami) {}
  
  public void a(l paraml, MenuItem paramMenuItem)
  {
    Handler localHandler = this.a.h;
    i.a locala = null;
    localHandler.removeCallbacksAndMessages(null);
    int i = this.a.j.size();
    for (int j = 0; j < i; j++) {
      if (paraml == ((i.a)this.a.j.get(j)).b) {
        break label76;
      }
    }
    j = -1;
    label76:
    if (j == -1) {
      return;
    }
    j++;
    if (j < this.a.j.size()) {
      locala = (i.a)this.a.j.get(j);
    }
    paramMenuItem = new g(this, locala, paramMenuItem, paraml);
    long l = SystemClock.uptimeMillis();
    this.a.h.postAtTime(paramMenuItem, paraml, l + 200L);
  }
  
  public void b(l paraml, MenuItem paramMenuItem)
  {
    this.a.h.removeCallbacksAndMessages(paraml);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */