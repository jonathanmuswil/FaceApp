package io.faceapp.ui.components;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.c;
import oXa;

public abstract class d
  implements AppBarLayout.c
{
  public void a(AppBarLayout paramAppBarLayout, int paramInt)
  {
    oXa.b(paramAppBarLayout, "appBarLayout");
    a locala;
    if (paramInt == 0) {
      locala = a.a;
    } else if (Math.abs(paramInt) >= paramAppBarLayout.getTotalScrollRange()) {
      locala = a.b;
    } else {
      locala = a.c;
    }
    a(paramAppBarLayout, locala);
  }
  
  public abstract void a(AppBarLayout paramAppBarLayout, a parama);
  
  public static enum a
  {
    static
    {
      a locala1 = new a("EXPANDED", 0);
      a = locala1;
      a locala2 = new a("COLLAPSED", 1);
      b = locala2;
      a locala3 = new a("IDLE", 2);
      c = locala3;
      d = new a[] { locala1, locala2, locala3 };
    }
    
    private a() {}
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */