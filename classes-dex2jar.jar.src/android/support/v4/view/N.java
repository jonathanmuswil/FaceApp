package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public class n
{
  private ViewParent a;
  private ViewParent b;
  private final View c;
  private boolean d;
  private int[] e;
  
  public n(View paramView)
  {
    this.c = paramView;
  }
  
  private void a(int paramInt, ViewParent paramViewParent)
  {
    if (paramInt != 0)
    {
      if (paramInt == 1) {
        this.b = paramViewParent;
      }
    }
    else {
      this.a = paramViewParent;
    }
  }
  
  private ViewParent d(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        return null;
      }
      return this.b;
    }
    return this.a;
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.d) {
      y.G(this.c);
    }
    this.d = paramBoolean;
  }
  
  public boolean a()
  {
    return a(0);
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    if (b())
    {
      ViewParent localViewParent = d(0);
      if (localViewParent != null) {
        return G.a(localViewParent, this.c, paramFloat1, paramFloat2);
      }
    }
    return false;
  }
  
  public boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (b())
    {
      ViewParent localViewParent = d(0);
      if (localViewParent != null) {
        return G.a(localViewParent, this.c, paramFloat1, paramFloat2, paramBoolean);
      }
    }
    return false;
  }
  
  public boolean a(int paramInt)
  {
    boolean bool;
    if (d(paramInt) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    if (a(paramInt2)) {
      return true;
    }
    if (b())
    {
      ViewParent localViewParent = this.c.getParent();
      View localView = this.c;
      while (localViewParent != null)
      {
        if (G.b(localViewParent, localView, this.c, paramInt1, paramInt2))
        {
          a(paramInt2, localViewParent);
          G.a(localViewParent, localView, this.c, paramInt1, paramInt2);
          return true;
        }
        if ((localViewParent instanceof View)) {
          localView = (View)localViewParent;
        }
        localViewParent = localViewParent.getParent();
      }
    }
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0);
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    if (b())
    {
      ViewParent localViewParent = d(paramInt5);
      if (localViewParent == null) {
        return false;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0))
      {
        if (paramArrayOfInt != null)
        {
          paramArrayOfInt[0] = 0;
          paramArrayOfInt[1] = 0;
        }
      }
      else
      {
        int i;
        int j;
        if (paramArrayOfInt != null)
        {
          this.c.getLocationInWindow(paramArrayOfInt);
          i = paramArrayOfInt[0];
          j = paramArrayOfInt[1];
        }
        else
        {
          i = 0;
          j = 0;
        }
        G.a(localViewParent, this.c, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
        if (paramArrayOfInt != null)
        {
          this.c.getLocationInWindow(paramArrayOfInt);
          paramArrayOfInt[0] -= i;
          paramArrayOfInt[1] -= j;
        }
        return true;
      }
    }
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    if (b())
    {
      ViewParent localViewParent = d(paramInt3);
      if (localViewParent == null) {
        return false;
      }
      boolean bool1 = true;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramArrayOfInt2 != null)
        {
          paramArrayOfInt2[0] = 0;
          paramArrayOfInt2[1] = 0;
        }
      }
      else
      {
        int i;
        int j;
        if (paramArrayOfInt2 != null)
        {
          this.c.getLocationInWindow(paramArrayOfInt2);
          i = paramArrayOfInt2[0];
          j = paramArrayOfInt2[1];
        }
        else
        {
          i = 0;
          j = 0;
        }
        int[] arrayOfInt = paramArrayOfInt1;
        if (paramArrayOfInt1 == null)
        {
          if (this.e == null) {
            this.e = new int[2];
          }
          arrayOfInt = this.e;
        }
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        G.a(localViewParent, this.c, paramInt1, paramInt2, arrayOfInt, paramInt3);
        if (paramArrayOfInt2 != null)
        {
          this.c.getLocationInWindow(paramArrayOfInt2);
          paramArrayOfInt2[0] -= i;
          paramArrayOfInt2[1] -= j;
        }
        boolean bool2 = bool1;
        if (arrayOfInt[0] == 0) {
          if (arrayOfInt[1] != 0) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
        }
        return bool2;
      }
    }
    return false;
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  public boolean b(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  public void c()
  {
    c(0);
  }
  
  public void c(int paramInt)
  {
    ViewParent localViewParent = d(paramInt);
    if (localViewParent != null)
    {
      G.a(localViewParent, this.c, paramInt);
      a(paramInt, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */