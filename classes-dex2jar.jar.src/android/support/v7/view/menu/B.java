package android.support.v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b
  implements v
{
  protected Context a;
  protected Context b;
  protected l c;
  protected LayoutInflater d;
  protected LayoutInflater e;
  private v.a f;
  private int g;
  private int h;
  protected w i;
  private int j;
  
  public b(Context paramContext, int paramInt1, int paramInt2)
  {
    this.a = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.g = paramInt1;
    this.h = paramInt2;
  }
  
  public w.a a(ViewGroup paramViewGroup)
  {
    return (w.a)this.d.inflate(this.h, paramViewGroup, false);
  }
  
  public View a(p paramp, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof w.a)) {
      paramView = (w.a)paramView;
    } else {
      paramView = a(paramViewGroup);
    }
    a(paramp, paramView);
    return (View)paramView;
  }
  
  public void a(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void a(Context paramContext, l paraml)
  {
    this.b = paramContext;
    this.e = LayoutInflater.from(this.b);
    this.c = paraml;
  }
  
  public void a(l paraml, boolean paramBoolean)
  {
    v.a locala = this.f;
    if (locala != null) {
      locala.a(paraml, paramBoolean);
    }
  }
  
  public abstract void a(p paramp, w.a parama);
  
  public void a(v.a parama)
  {
    this.f = parama;
  }
  
  protected void a(View paramView, int paramInt)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    if (localViewGroup != null) {
      localViewGroup.removeView(paramView);
    }
    ((ViewGroup)this.i).addView(paramView, paramInt);
  }
  
  public void a(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)this.i;
    if (localViewGroup == null) {
      return;
    }
    Object localObject = this.c;
    int k = 0;
    if (localObject != null)
    {
      ((l)localObject).b();
      ArrayList localArrayList = this.c.n();
      int m = localArrayList.size();
      int n = 0;
      int i1;
      for (k = 0; n < m; k = i1)
      {
        p localp = (p)localArrayList.get(n);
        i1 = k;
        if (a(k, localp))
        {
          View localView1 = localViewGroup.getChildAt(k);
          if ((localView1 instanceof w.a)) {
            localObject = ((w.a)localView1).getItemData();
          } else {
            localObject = null;
          }
          View localView2 = a(localp, localView1, localViewGroup);
          if (localp != localObject)
          {
            localView2.setPressed(false);
            localView2.jumpDrawablesToCurrentState();
          }
          if (localView2 != localView1) {
            a(localView2, k);
          }
          i1 = k + 1;
        }
        n++;
      }
    }
    while (k < localViewGroup.getChildCount()) {
      if (!a(localViewGroup, k)) {
        k++;
      }
    }
  }
  
  public abstract boolean a(int paramInt, p paramp);
  
  public boolean a(D paramD)
  {
    v.a locala = this.f;
    if (locala != null) {
      return locala.a(paramD);
    }
    return false;
  }
  
  public boolean a(l paraml, p paramp)
  {
    return false;
  }
  
  protected boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public v.a b()
  {
    return this.f;
  }
  
  public w b(ViewGroup paramViewGroup)
  {
    if (this.i == null)
    {
      this.i = ((w)this.d.inflate(this.g, paramViewGroup, false));
      this.i.a(this.c);
      a(true);
    }
    return this.i;
  }
  
  public boolean b(l paraml, p paramp)
  {
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */