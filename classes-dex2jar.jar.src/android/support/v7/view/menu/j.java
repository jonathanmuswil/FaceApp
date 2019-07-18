package android.support.v7.view.menu;

import Md;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class j
  implements v, AdapterView.OnItemClickListener
{
  Context a;
  LayoutInflater b;
  l c;
  ExpandedMenuView d;
  int e;
  int f;
  int g;
  private v.a h;
  a i;
  
  public j(int paramInt1, int paramInt2)
  {
    this.g = paramInt1;
    this.f = paramInt2;
  }
  
  public j(Context paramContext, int paramInt)
  {
    this(paramInt, 0);
    this.a = paramContext;
    this.b = LayoutInflater.from(this.a);
  }
  
  public w a(ViewGroup paramViewGroup)
  {
    if (this.d == null)
    {
      this.d = ((ExpandedMenuView)this.b.inflate(Md.abc_expanded_menu_layout, paramViewGroup, false));
      if (this.i == null) {
        this.i = new a();
      }
      this.d.setAdapter(this.i);
      this.d.setOnItemClickListener(this);
    }
    return this.d;
  }
  
  public void a(Context paramContext, l paraml)
  {
    int j = this.f;
    if (j != 0)
    {
      this.a = new ContextThemeWrapper(paramContext, j);
      this.b = LayoutInflater.from(this.a);
    }
    else if (this.a != null)
    {
      this.a = paramContext;
      if (this.b == null) {
        this.b = LayoutInflater.from(this.a);
      }
    }
    this.c = paraml;
    paramContext = this.i;
    if (paramContext != null) {
      paramContext.notifyDataSetChanged();
    }
  }
  
  public void a(l paraml, boolean paramBoolean)
  {
    v.a locala = this.h;
    if (locala != null) {
      locala.a(paraml, paramBoolean);
    }
  }
  
  public void a(v.a parama)
  {
    this.h = parama;
  }
  
  public void a(boolean paramBoolean)
  {
    a locala = this.i;
    if (locala != null) {
      locala.notifyDataSetChanged();
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public boolean a(D paramD)
  {
    if (!paramD.hasVisibleItems()) {
      return false;
    }
    new m(paramD).a(null);
    v.a locala = this.h;
    if (locala != null) {
      locala.a(paramD);
    }
    return true;
  }
  
  public boolean a(l paraml, p paramp)
  {
    return false;
  }
  
  public ListAdapter b()
  {
    if (this.i == null) {
      this.i = new a();
    }
    return this.i;
  }
  
  public boolean b(l paraml, p paramp)
  {
    return false;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.c.a(this.i.getItem(paramInt), this, 0);
  }
  
  private class a
    extends BaseAdapter
  {
    private int a = -1;
    
    public a()
    {
      a();
    }
    
    void a()
    {
      p localp = j.this.c.f();
      if (localp != null)
      {
        ArrayList localArrayList = j.this.c.j();
        int i = localArrayList.size();
        for (int j = 0; j < i; j++) {
          if ((p)localArrayList.get(j) == localp)
          {
            this.a = j;
            return;
          }
        }
      }
      this.a = -1;
    }
    
    public int getCount()
    {
      int i = j.this.c.j().size() - j.this.e;
      if (this.a < 0) {
        return i;
      }
      return i - 1;
    }
    
    public p getItem(int paramInt)
    {
      ArrayList localArrayList = j.this.c.j();
      int i = paramInt + j.this.e;
      int j = this.a;
      paramInt = i;
      if (j >= 0)
      {
        paramInt = i;
        if (i >= j) {
          paramInt = i + 1;
        }
      }
      return (p)localArrayList.get(paramInt);
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      View localView = paramView;
      if (paramView == null)
      {
        paramView = j.this;
        localView = paramView.b.inflate(paramView.g, paramViewGroup, false);
      }
      ((w.a)localView).a(getItem(paramInt), 0);
      return localView;
    }
    
    public void notifyDataSetChanged()
    {
      a();
      super.notifyDataSetChanged();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */