package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class k
  extends BaseAdapter
{
  l a;
  private int b = -1;
  private boolean c;
  private final boolean d;
  private final LayoutInflater e;
  private final int f;
  
  public k(l paraml, LayoutInflater paramLayoutInflater, boolean paramBoolean, int paramInt)
  {
    this.d = paramBoolean;
    this.e = paramLayoutInflater;
    this.a = paraml;
    this.f = paramInt;
    a();
  }
  
  void a()
  {
    p localp = this.a.f();
    if (localp != null)
    {
      ArrayList localArrayList = this.a.j();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++) {
        if ((p)localArrayList.get(j) == localp)
        {
          this.b = j;
          return;
        }
      }
    }
    this.b = -1;
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public l b()
  {
    return this.a;
  }
  
  public int getCount()
  {
    ArrayList localArrayList;
    if (this.d) {
      localArrayList = this.a.j();
    } else {
      localArrayList = this.a.n();
    }
    if (this.b < 0) {
      return localArrayList.size();
    }
    return localArrayList.size() - 1;
  }
  
  public p getItem(int paramInt)
  {
    ArrayList localArrayList;
    if (this.d) {
      localArrayList = this.a.j();
    } else {
      localArrayList = this.a.n();
    }
    int i = this.b;
    int j = paramInt;
    if (i >= 0)
    {
      j = paramInt;
      if (paramInt >= i) {
        j = paramInt + 1;
      }
    }
    return (p)localArrayList.get(j);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramView;
    if (paramView == null) {
      localView = this.e.inflate(this.f, paramViewGroup, false);
    }
    int i = getItem(paramInt).getGroupId();
    int j = paramInt - 1;
    if (j >= 0) {
      j = getItem(j).getGroupId();
    } else {
      j = i;
    }
    paramView = (ListMenuItemView)localView;
    boolean bool;
    if ((this.a.o()) && (i != j)) {
      bool = true;
    } else {
      bool = false;
    }
    paramView.setGroupDividerEnabled(bool);
    paramViewGroup = (w.a)localView;
    if (this.c) {
      paramView.setForceShowIcon(true);
    }
    paramViewGroup.a(getItem(paramInt), 0);
    return localView;
  }
  
  public void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */