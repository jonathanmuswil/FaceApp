package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class da<V extends View>
  extends CoordinatorLayout.b<V>
{
  private ea a;
  private int b = 0;
  private int c = 0;
  
  public da() {}
  
  public da(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean a(int paramInt)
  {
    ea localea = this.a;
    if (localea != null) {
      return localea.b(paramInt);
    }
    this.b = paramInt;
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    b(paramCoordinatorLayout, paramV, paramInt);
    if (this.a == null) {
      this.a = new ea(paramV);
    }
    this.a.c();
    paramInt = this.b;
    if (paramInt != 0)
    {
      this.a.b(paramInt);
      this.b = 0;
    }
    paramInt = this.c;
    if (paramInt != 0)
    {
      this.a.a(paramInt);
      this.c = 0;
    }
    return true;
  }
  
  public int b()
  {
    ea localea = this.a;
    int i;
    if (localea != null) {
      i = localea.b();
    } else {
      i = 0;
    }
    return i;
  }
  
  protected void b(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    paramCoordinatorLayout.c(paramV, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */