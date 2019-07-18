package android.support.v7.view.menu;

import Dc;
import Ec;
import Fc;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public final class x
{
  public static Menu a(Context paramContext, Dc paramDc)
  {
    return new y(paramContext, paramDc);
  }
  
  public static MenuItem a(Context paramContext, Ec paramEc)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return new r(paramContext, paramEc);
    }
    return new q(paramContext, paramEc);
  }
  
  public static SubMenu a(Context paramContext, Fc paramFc)
  {
    return new E(paramContext, paramFc);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */