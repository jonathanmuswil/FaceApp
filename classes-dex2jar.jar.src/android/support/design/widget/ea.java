package android.support.design.widget;

import android.support.v4.view.y;
import android.view.View;

class ea
{
  private final View a;
  private int b;
  private int c;
  private int d;
  private int e;
  
  public ea(View paramView)
  {
    this.a = paramView;
  }
  
  private void d()
  {
    View localView = this.a;
    y.b(localView, this.d - (localView.getTop() - this.b));
    localView = this.a;
    y.a(localView, this.e - (localView.getLeft() - this.c));
  }
  
  public int a()
  {
    return this.b;
  }
  
  public boolean a(int paramInt)
  {
    if (this.e != paramInt)
    {
      this.e = paramInt;
      d();
      return true;
    }
    return false;
  }
  
  public int b()
  {
    return this.d;
  }
  
  public boolean b(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      d();
      return true;
    }
    return false;
  }
  
  public void c()
  {
    this.b = this.a.getTop();
    this.c = this.a.getLeft();
    d();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */