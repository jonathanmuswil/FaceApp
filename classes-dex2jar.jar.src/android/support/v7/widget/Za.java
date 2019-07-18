package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

final class za
  extends Ba
{
  za(RecyclerView.i parami)
  {
    super(parami, null);
  }
  
  public int a()
  {
    return this.a.q();
  }
  
  public int a(View paramView)
  {
    RecyclerView.j localj = (RecyclerView.j)paramView.getLayoutParams();
    return this.a.i(paramView) + localj.rightMargin;
  }
  
  public void a(int paramInt)
  {
    this.a.e(paramInt);
  }
  
  public int b()
  {
    return this.a.q() - this.a.o();
  }
  
  public int b(View paramView)
  {
    RecyclerView.j localj = (RecyclerView.j)paramView.getLayoutParams();
    return this.a.h(paramView) + localj.leftMargin + localj.rightMargin;
  }
  
  public int c()
  {
    return this.a.o();
  }
  
  public int c(View paramView)
  {
    RecyclerView.j localj = (RecyclerView.j)paramView.getLayoutParams();
    return this.a.g(paramView) + localj.topMargin + localj.bottomMargin;
  }
  
  public int d()
  {
    return this.a.r();
  }
  
  public int d(View paramView)
  {
    RecyclerView.j localj = (RecyclerView.j)paramView.getLayoutParams();
    return this.a.f(paramView) - localj.leftMargin;
  }
  
  public int e()
  {
    return this.a.i();
  }
  
  public int e(View paramView)
  {
    this.a.a(paramView, true, this.c);
    return this.c.right;
  }
  
  public int f()
  {
    return this.a.n();
  }
  
  public int f(View paramView)
  {
    this.a.a(paramView, true, this.c);
    return this.c.left;
  }
  
  public int g()
  {
    return this.a.q() - this.a.n() - this.a.o();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */