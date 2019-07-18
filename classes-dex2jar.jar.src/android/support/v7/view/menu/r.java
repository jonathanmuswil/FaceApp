package android.support.v7.view.menu;

import Ec;
import android.content.Context;
import android.support.v4.view.e.b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

class r
  extends q
{
  r(Context paramContext, Ec paramEc)
  {
    super(paramContext, paramEc);
  }
  
  q.a a(ActionProvider paramActionProvider)
  {
    return new a(this.b, paramActionProvider);
  }
  
  class a
    extends q.a
    implements ActionProvider.VisibilityListener
  {
    e.b f;
    
    public a(Context paramContext, ActionProvider paramActionProvider)
    {
      super(paramContext, paramActionProvider);
    }
    
    public View a(MenuItem paramMenuItem)
    {
      return this.d.onCreateActionView(paramMenuItem);
    }
    
    public void a(e.b paramb)
    {
      this.f = paramb;
      ActionProvider localActionProvider = this.d;
      if (paramb != null) {
        paramb = this;
      } else {
        paramb = null;
      }
      localActionProvider.setVisibilityListener(paramb);
    }
    
    public boolean b()
    {
      return this.d.isVisible();
    }
    
    public boolean e()
    {
      return this.d.overridesItemVisibility();
    }
    
    public void onActionProviderVisibilityChanged(boolean paramBoolean)
    {
      e.b localb = this.f;
      if (localb != null) {
        localb.onActionProviderVisibilityChanged(paramBoolean);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */