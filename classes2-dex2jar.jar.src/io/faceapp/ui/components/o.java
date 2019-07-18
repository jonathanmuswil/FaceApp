package io.faceapp.ui.components;

import _Va;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.j;
import android.support.v7.widget.RecyclerView.u;
import android.view.View;
import oXa;

public final class o
  extends RecyclerView.h
{
  private final int a;
  private final int b;
  
  public o(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.u paramu)
  {
    oXa.b(paramRect, "outRect");
    oXa.b(paramView, "view");
    oXa.b(paramRecyclerView, "parent");
    oXa.b(paramu, "state");
    paramView = paramView.getLayoutParams();
    if (paramView != null)
    {
      int i;
      if (((RecyclerView.j)paramView).a() < this.b) {
        i = this.a;
      } else {
        i = 0;
      }
      paramRect.top = i;
      paramRect.bottom = this.a;
      paramRect.left = 0;
      paramRect.right = 0;
      return;
    }
    throw new _Va("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */