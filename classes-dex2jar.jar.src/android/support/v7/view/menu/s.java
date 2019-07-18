package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class s
  implements z, v, AdapterView.OnItemClickListener
{
  private Rect a;
  
  protected static int a(ListAdapter paramListAdapter, ViewGroup paramViewGroup, Context paramContext, int paramInt)
  {
    int i = 0;
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = paramListAdapter.getCount();
    Object localObject1 = paramViewGroup;
    paramViewGroup = null;
    int n = 0;
    int i1 = 0;
    while (i < m)
    {
      int i2 = paramListAdapter.getItemViewType(i);
      int i3 = i1;
      if (i2 != i1)
      {
        paramViewGroup = null;
        i3 = i2;
      }
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new FrameLayout(paramContext);
      }
      paramViewGroup = paramListAdapter.getView(i, paramViewGroup, (ViewGroup)localObject2);
      paramViewGroup.measure(j, k);
      i1 = paramViewGroup.getMeasuredWidth();
      if (i1 >= paramInt) {
        return paramInt;
      }
      i2 = n;
      if (i1 > n) {
        i2 = i1;
      }
      i++;
      i1 = i3;
      localObject1 = localObject2;
      n = i2;
    }
    return n;
  }
  
  protected static k a(ListAdapter paramListAdapter)
  {
    if ((paramListAdapter instanceof HeaderViewListAdapter)) {
      return (k)((HeaderViewListAdapter)paramListAdapter).getWrappedAdapter();
    }
    return (k)paramListAdapter;
  }
  
  protected static boolean b(l paraml)
  {
    int i = paraml.size();
    boolean bool1 = false;
    boolean bool2;
    for (int j = 0;; j++)
    {
      bool2 = bool1;
      if (j >= i) {
        break;
      }
      MenuItem localMenuItem = paraml.getItem(j);
      if ((localMenuItem.isVisible()) && (localMenuItem.getIcon() != null))
      {
        bool2 = true;
        break;
      }
    }
    return bool2;
  }
  
  public abstract void a(int paramInt);
  
  public void a(Context paramContext, l paraml) {}
  
  public void a(Rect paramRect)
  {
    this.a = paramRect;
  }
  
  public abstract void a(l paraml);
  
  public abstract void a(View paramView);
  
  public abstract void a(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public boolean a(l paraml, p paramp)
  {
    return false;
  }
  
  public abstract void b(int paramInt);
  
  public abstract void b(boolean paramBoolean);
  
  protected boolean b()
  {
    return true;
  }
  
  public boolean b(l paraml, p paramp)
  {
    return false;
  }
  
  public Rect c()
  {
    return this.a;
  }
  
  public abstract void c(int paramInt);
  
  public abstract void c(boolean paramBoolean);
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramView = (ListAdapter)paramAdapterView.getAdapter();
    paramAdapterView = a(paramView).a;
    paramView = (MenuItem)paramView.getItem(paramInt);
    if (b()) {
      paramInt = 0;
    } else {
      paramInt = 4;
    }
    paramAdapterView.a(paramView, this, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */