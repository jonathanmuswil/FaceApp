package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.widget.pb;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class ExpandedMenuView
  extends ListView
  implements l.b, w, AdapterView.OnItemClickListener
{
  private static final int[] a = { 16842964, 16843049 };
  private l b;
  private int c;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    paramContext = pb.a(paramContext, paramAttributeSet, a, paramInt, 0);
    if (paramContext.g(0)) {
      setBackgroundDrawable(paramContext.b(0));
    }
    if (paramContext.g(1)) {
      setDivider(paramContext.b(1));
    }
    paramContext.a();
  }
  
  public void a(l paraml)
  {
    this.b = paraml;
  }
  
  public boolean a(p paramp)
  {
    return this.b.a(paramp, 0);
  }
  
  public int getWindowAnimations()
  {
    return this.c;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a((p)getAdapter().getItem(paramInt));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/ExpandedMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */