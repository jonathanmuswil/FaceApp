import android.content.Context;
import android.support.v7.view.menu.x;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public class oe
  extends ActionMode
{
  final Context a;
  final ke b;
  
  public oe(Context paramContext, ke paramke)
  {
    this.a = paramContext;
    this.b = paramke;
  }
  
  public void finish()
  {
    this.b.a();
  }
  
  public View getCustomView()
  {
    return this.b.b();
  }
  
  public Menu getMenu()
  {
    return x.a(this.a, (Dc)this.b.c());
  }
  
  public MenuInflater getMenuInflater()
  {
    return this.b.d();
  }
  
  public CharSequence getSubtitle()
  {
    return this.b.e();
  }
  
  public Object getTag()
  {
    return this.b.f();
  }
  
  public CharSequence getTitle()
  {
    return this.b.g();
  }
  
  public boolean getTitleOptionalHint()
  {
    return this.b.h();
  }
  
  public void invalidate()
  {
    this.b.i();
  }
  
  public boolean isTitleOptional()
  {
    return this.b.j();
  }
  
  public void setCustomView(View paramView)
  {
    this.b.a(paramView);
  }
  
  public void setSubtitle(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.b.a(paramCharSequence);
  }
  
  public void setTag(Object paramObject)
  {
    this.b.a(paramObject);
  }
  
  public void setTitle(int paramInt)
  {
    this.b.b(paramInt);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.b.b(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    this.b.a(paramBoolean);
  }
  
  public static class a
    implements ke.a
  {
    final ActionMode.Callback a;
    final Context b;
    final ArrayList<oe> c;
    final ud<Menu, Menu> d;
    
    public a(Context paramContext, ActionMode.Callback paramCallback)
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
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */