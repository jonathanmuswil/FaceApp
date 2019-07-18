package io.faceapp.ui.components;

import _Va;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.j;
import android.support.v7.widget.RecyclerView.u;
import android.view.View;
import android.view.ViewGroup;
import oXa;

public final class n
  extends RecyclerView.h
{
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  
  public n(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.u paramu)
  {
    oXa.b(paramRect, "outRect");
    oXa.b(paramView, "view");
    oXa.b(paramRecyclerView, "parent");
    oXa.b(paramu, "state");
    float f1 = paramRecyclerView.getWidth();
    float f2 = this.a;
    int i = this.b;
    i = (int)((f1 - f2 * (i - 1)) / i);
    int j = paramRecyclerView.getWidth();
    int k = this.b;
    j = Math.max((j / k - i) / (k - 1), 1);
    i = this.b * j;
    paramView = paramView.getLayoutParams();
    if (paramView != null)
    {
      k = ((RecyclerView.j)paramView).a();
      paramView = paramRecyclerView.getAdapter();
      if ((paramView != null) && (k >= this.c) && (k < paramView.a() - this.d))
      {
        int m = k - this.c;
        int n = this.b;
        k = m % n;
        if (m < n) {
          i = 0;
        }
        paramRect.top = i;
        paramRect.bottom = 0;
        paramRect.left = (k * j);
        paramRect.right = ((this.b - 1 - k) * j);
        return;
      }
      paramRect.setEmpty();
      return;
    }
    throw new _Va("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */