package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class e
{
  private final Context a;
  private a b;
  private b c;
  
  public e(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public View a(MenuItem paramMenuItem)
  {
    return c();
  }
  
  public void a(a parama)
  {
    this.b = parama;
  }
  
  public void a(b paramb)
  {
    if ((this.c != null) && (paramb != null))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
      localStringBuilder.append(getClass().getSimpleName());
      localStringBuilder.append(" instance while it is still in use somewhere else?");
      Log.w("ActionProvider(support)", localStringBuilder.toString());
    }
    this.c = paramb;
  }
  
  public void a(SubMenu paramSubMenu) {}
  
  public boolean a()
  {
    return false;
  }
  
  public boolean b()
  {
    return true;
  }
  
  public abstract View c();
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public void f()
  {
    this.c = null;
    this.b = null;
  }
  
  public static abstract interface a {}
  
  public static abstract interface b
  {
    public abstract void onActionProviderVisibilityChanged(boolean paramBoolean);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */