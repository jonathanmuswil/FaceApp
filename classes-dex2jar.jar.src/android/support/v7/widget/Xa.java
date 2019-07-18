package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.p;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class xa
  extends va
  implements wa
{
  private static Method K;
  private wa L;
  
  static
  {
    try
    {
      K = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[] { Boolean.TYPE });
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
    }
  }
  
  public xa(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  ga a(Context paramContext, boolean paramBoolean)
  {
    paramContext = new a(paramContext, paramBoolean);
    paramContext.setHoverListener(this);
    return paramContext;
  }
  
  public void a(l paraml, MenuItem paramMenuItem)
  {
    wa localwa = this.L;
    if (localwa != null) {
      localwa.a(paraml, paramMenuItem);
    }
  }
  
  public void a(wa paramwa)
  {
    this.L = paramwa;
  }
  
  public void a(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      this.J.setEnterTransition((Transition)paramObject);
    }
  }
  
  public void b(l paraml, MenuItem paramMenuItem)
  {
    wa localwa = this.L;
    if (localwa != null) {
      localwa.b(paraml, paramMenuItem);
    }
  }
  
  public void b(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      this.J.setExitTransition((Transition)paramObject);
    }
  }
  
  public void c(boolean paramBoolean)
  {
    Method localMethod = K;
    if (localMethod != null) {
      try
      {
        localMethod.invoke(this.J, new Object[] { Boolean.valueOf(paramBoolean) });
      }
      catch (Exception localException)
      {
        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
      }
    }
  }
  
  public static class a
    extends ga
  {
    final int o;
    final int p;
    private wa q;
    private MenuItem r;
    
    public a(Context paramContext, boolean paramBoolean)
    {
      super(paramBoolean);
      paramContext = paramContext.getResources().getConfiguration();
      if ((Build.VERSION.SDK_INT >= 17) && (1 == paramContext.getLayoutDirection()))
      {
        this.o = 21;
        this.p = 22;
      }
      else
      {
        this.o = 22;
        this.p = 21;
      }
    }
    
    public boolean onHoverEvent(MotionEvent paramMotionEvent)
    {
      if (this.q != null)
      {
        Object localObject1 = getAdapter();
        int i;
        if ((localObject1 instanceof HeaderViewListAdapter))
        {
          localObject1 = (HeaderViewListAdapter)localObject1;
          i = ((HeaderViewListAdapter)localObject1).getHeadersCount();
          localObject1 = (k)((HeaderViewListAdapter)localObject1).getWrappedAdapter();
        }
        else
        {
          i = 0;
          localObject1 = (k)localObject1;
        }
        MenuItem localMenuItem = null;
        Object localObject2 = localMenuItem;
        if (paramMotionEvent.getAction() != 10)
        {
          int j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
          localObject2 = localMenuItem;
          if (j != -1)
          {
            i = j - i;
            localObject2 = localMenuItem;
            if (i >= 0)
            {
              localObject2 = localMenuItem;
              if (i < ((k)localObject1).getCount()) {
                localObject2 = ((k)localObject1).getItem(i);
              }
            }
          }
        }
        localMenuItem = this.r;
        if (localMenuItem != localObject2)
        {
          localObject1 = ((k)localObject1).b();
          if (localMenuItem != null) {
            this.q.b((l)localObject1, localMenuItem);
          }
          this.r = ((MenuItem)localObject2);
          if (localObject2 != null) {
            this.q.a((l)localObject1, (MenuItem)localObject2);
          }
        }
      }
      return super.onHoverEvent(paramMotionEvent);
    }
    
    public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
    {
      ListMenuItemView localListMenuItemView = (ListMenuItemView)getSelectedView();
      if ((localListMenuItemView != null) && (paramInt == this.o))
      {
        if ((localListMenuItemView.isEnabled()) && (localListMenuItemView.getItemData().hasSubMenu())) {
          performItemClick(localListMenuItemView, getSelectedItemPosition(), getSelectedItemId());
        }
        return true;
      }
      if ((localListMenuItemView != null) && (paramInt == this.p))
      {
        setSelection(-1);
        ((k)getAdapter()).b().a(false);
        return true;
      }
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    
    public void setHoverListener(wa paramwa)
    {
      this.q = paramwa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/xa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */