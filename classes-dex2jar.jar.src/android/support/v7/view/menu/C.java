package android.support.v7.view.menu;

import Ec;
import Fc;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import gd;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class c<T>
  extends d<T>
{
  final Context b;
  private Map<Ec, MenuItem> c;
  private Map<Fc, SubMenu> d;
  
  c(Context paramContext, T paramT)
  {
    super(paramT);
    this.b = paramContext;
  }
  
  final MenuItem a(MenuItem paramMenuItem)
  {
    MenuItem localMenuItem = paramMenuItem;
    if ((paramMenuItem instanceof Ec))
    {
      Ec localEc = (Ec)paramMenuItem;
      if (this.c == null) {
        this.c = new gd();
      }
      paramMenuItem = (MenuItem)this.c.get(paramMenuItem);
      localMenuItem = paramMenuItem;
      if (paramMenuItem == null)
      {
        localMenuItem = x.a(this.b, localEc);
        this.c.put(localEc, localMenuItem);
      }
    }
    return localMenuItem;
  }
  
  final SubMenu a(SubMenu paramSubMenu)
  {
    if ((paramSubMenu instanceof Fc))
    {
      Fc localFc = (Fc)paramSubMenu;
      if (this.d == null) {
        this.d = new gd();
      }
      SubMenu localSubMenu = (SubMenu)this.d.get(localFc);
      paramSubMenu = localSubMenu;
      if (localSubMenu == null)
      {
        paramSubMenu = x.a(this.b, localFc);
        this.d.put(localFc, paramSubMenu);
      }
      return paramSubMenu;
    }
    return paramSubMenu;
  }
  
  final void a(int paramInt)
  {
    Object localObject = this.c;
    if (localObject == null) {
      return;
    }
    localObject = ((Map)localObject).keySet().iterator();
    while (((Iterator)localObject).hasNext()) {
      if (paramInt == ((MenuItem)((Iterator)localObject).next()).getGroupId()) {
        ((Iterator)localObject).remove();
      }
    }
  }
  
  final void b()
  {
    Map localMap = this.c;
    if (localMap != null) {
      localMap.clear();
    }
    localMap = this.d;
    if (localMap != null) {
      localMap.clear();
    }
  }
  
  final void b(int paramInt)
  {
    Object localObject = this.c;
    if (localObject == null) {
      return;
    }
    localObject = ((Map)localObject).keySet().iterator();
    while (((Iterator)localObject).hasNext()) {
      if (paramInt == ((MenuItem)((Iterator)localObject).next()).getItemId()) {
        ((Iterator)localObject).remove();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */