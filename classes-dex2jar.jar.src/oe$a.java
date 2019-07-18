import android.content.Context;
import android.support.v7.view.menu.x;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public class oe$a
  implements ke.a
{
  final ActionMode.Callback a;
  final Context b;
  final ArrayList<oe> c;
  final ud<Menu, Menu> d;
  
  public oe$a(Context paramContext, ActionMode.Callback paramCallback)
  {
    this.b = paramContext;
    this.a = paramCallback;
    this.c = new ArrayList();
    this.d = new ud();
  }
  
  private Menu a(Menu paramMenu)
  {
    Menu localMenu1 = (Menu)this.d.get(paramMenu);
    Menu localMenu2 = localMenu1;
    if (localMenu1 == null)
    {
      localMenu2 = x.a(this.b, (Dc)paramMenu);
      this.d.put(paramMenu, localMenu2);
    }
    return localMenu2;
  }
  
  public void a(ke paramke)
  {
    this.a.onDestroyActionMode(b(paramke));
  }
  
  public boolean a(ke paramke, Menu paramMenu)
  {
    return this.a.onCreateActionMode(b(paramke), a(paramMenu));
  }
  
  public boolean a(ke paramke, MenuItem paramMenuItem)
  {
    return this.a.onActionItemClicked(b(paramke), x.a(this.b, (Ec)paramMenuItem));
  }
  
  public ActionMode b(ke paramke)
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      oe localoe = (oe)this.c.get(j);
      if ((localoe != null) && (localoe.b == paramke)) {
        return localoe;
      }
    }
    paramke = new oe(this.b, paramke);
    this.c.add(paramke);
    return paramke;
  }
  
  public boolean b(ke paramke, Menu paramMenu)
  {
    return this.a.onPrepareActionMode(b(paramke), a(paramMenu));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oe$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */