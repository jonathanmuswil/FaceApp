package android.support.v7.view.menu;

import Ec;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.e;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import le;

public class q
  extends c<Ec>
  implements MenuItem
{
  private Method e;
  
  q(Context paramContext, Ec paramEc)
  {
    super(paramContext, paramEc);
  }
  
  a a(ActionProvider paramActionProvider)
  {
    return new a(this.b, paramActionProvider);
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      if (this.e == null) {
        this.e = ((Ec)this.a).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { Boolean.TYPE });
      }
      this.e.invoke(this.a, new Object[] { Boolean.valueOf(paramBoolean) });
    }
    catch (Exception localException)
    {
      Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", localException);
    }
  }
  
  public boolean collapseActionView()
  {
    return ((Ec)this.a).collapseActionView();
  }
  
  public boolean expandActionView()
  {
    return ((Ec)this.a).expandActionView();
  }
  
  public ActionProvider getActionProvider()
  {
    e locale = ((Ec)this.a).a();
    if ((locale instanceof a)) {
      return ((a)locale).d;
    }
    return null;
  }
  
  public View getActionView()
  {
    View localView1 = ((Ec)this.a).getActionView();
    View localView2 = localView1;
    if ((localView1 instanceof b)) {
      localView2 = ((b)localView1).a();
    }
    return localView2;
  }
  
  public int getAlphabeticModifiers()
  {
    return ((Ec)this.a).getAlphabeticModifiers();
  }
  
  public char getAlphabeticShortcut()
  {
    return ((Ec)this.a).getAlphabeticShortcut();
  }
  
  public CharSequence getContentDescription()
  {
    return ((Ec)this.a).getContentDescription();
  }
  
  public int getGroupId()
  {
    return ((Ec)this.a).getGroupId();
  }
  
  public Drawable getIcon()
  {
    return ((Ec)this.a).getIcon();
  }
  
  public ColorStateList getIconTintList()
  {
    return ((Ec)this.a).getIconTintList();
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return ((Ec)this.a).getIconTintMode();
  }
  
  public Intent getIntent()
  {
    return ((Ec)this.a).getIntent();
  }
  
  public int getItemId()
  {
    return ((Ec)this.a).getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((Ec)this.a).getMenuInfo();
  }
  
  public int getNumericModifiers()
  {
    return ((Ec)this.a).getNumericModifiers();
  }
  
  public char getNumericShortcut()
  {
    return ((Ec)this.a).getNumericShortcut();
  }
  
  public int getOrder()
  {
    return ((Ec)this.a).getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    return a(((Ec)this.a).getSubMenu());
  }
  
  public CharSequence getTitle()
  {
    return ((Ec)this.a).getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return ((Ec)this.a).getTitleCondensed();
  }
  
  public CharSequence getTooltipText()
  {
    return ((Ec)this.a).getTooltipText();
  }
  
  public boolean hasSubMenu()
  {
    return ((Ec)this.a).hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return ((Ec)this.a).isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return ((Ec)this.a).isCheckable();
  }
  
  public boolean isChecked()
  {
    return ((Ec)this.a).isChecked();
  }
  
  public boolean isEnabled()
  {
    return ((Ec)this.a).isEnabled();
  }
  
  public boolean isVisible()
  {
    return ((Ec)this.a).isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    Ec localEc = (Ec)this.a;
    if (paramActionProvider != null) {
      paramActionProvider = a(paramActionProvider);
    } else {
      paramActionProvider = null;
    }
    localEc.a(paramActionProvider);
    return this;
  }
  
  public MenuItem setActionView(int paramInt)
  {
    ((Ec)this.a).setActionView(paramInt);
    View localView = ((Ec)this.a).getActionView();
    if ((localView instanceof CollapsibleActionView)) {
      ((Ec)this.a).setActionView(new b(localView));
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof CollapsibleActionView)) {
      localObject = new b(paramView);
    }
    ((Ec)this.a).setActionView((View)localObject);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((Ec)this.a).setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    ((Ec)this.a).setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((Ec)this.a).setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    ((Ec)this.a).setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    ((Ec)this.a).setContentDescription(paramCharSequence);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((Ec)this.a).setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    ((Ec)this.a).setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((Ec)this.a).setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    ((Ec)this.a).setIconTintList(paramColorStateList);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    ((Ec)this.a).setIconTintMode(paramMode);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    ((Ec)this.a).setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    ((Ec)this.a).setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    ((Ec)this.a).setNumericShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    Ec localEc = (Ec)this.a;
    if (paramOnActionExpandListener != null) {
      paramOnActionExpandListener = new c(paramOnActionExpandListener);
    } else {
      paramOnActionExpandListener = null;
    }
    localEc.setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    Ec localEc = (Ec)this.a;
    if (paramOnMenuItemClickListener != null) {
      paramOnMenuItemClickListener = new d(paramOnMenuItemClickListener);
    } else {
      paramOnMenuItemClickListener = null;
    }
    localEc.setOnMenuItemClickListener(paramOnMenuItemClickListener);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((Ec)this.a).setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    ((Ec)this.a).setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    ((Ec)this.a).setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((Ec)this.a).setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    ((Ec)this.a).setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((Ec)this.a).setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((Ec)this.a).setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    ((Ec)this.a).setTooltipText(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((Ec)this.a).setVisible(paramBoolean);
  }
  
  class a
    extends e
  {
    final ActionProvider d;
    
    public a(Context paramContext, ActionProvider paramActionProvider)
    {
      super();
      this.d = paramActionProvider;
    }
    
    public void a(SubMenu paramSubMenu)
    {
      this.d.onPrepareSubMenu(q.this.a(paramSubMenu));
    }
    
    public boolean a()
    {
      return this.d.hasSubMenu();
    }
    
    public View c()
    {
      return this.d.onCreateActionView();
    }
    
    public boolean d()
    {
      return this.d.onPerformDefaultAction();
    }
  }
  
  static class b
    extends FrameLayout
    implements le
  {
    final CollapsibleActionView a;
    
    b(View paramView)
    {
      super();
      this.a = ((CollapsibleActionView)paramView);
      addView(paramView);
    }
    
    View a()
    {
      return (View)this.a;
    }
    
    public void onActionViewCollapsed()
    {
      this.a.onActionViewCollapsed();
    }
    
    public void onActionViewExpanded()
    {
      this.a.onActionViewExpanded();
    }
  }
  
  private class c
    extends d<MenuItem.OnActionExpandListener>
    implements MenuItem.OnActionExpandListener
  {
    c(MenuItem.OnActionExpandListener paramOnActionExpandListener)
    {
      super();
    }
    
    public boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)this.a).onMenuItemActionCollapse(q.this.a(paramMenuItem));
    }
    
    public boolean onMenuItemActionExpand(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)this.a).onMenuItemActionExpand(q.this.a(paramMenuItem));
    }
  }
  
  private class d
    extends d<MenuItem.OnMenuItemClickListener>
    implements MenuItem.OnMenuItemClickListener
  {
    d(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
    {
      super();
    }
    
    public boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnMenuItemClickListener)this.a).onMenuItemClick(q.this.a(paramMenuItem));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */