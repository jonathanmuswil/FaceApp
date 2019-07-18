package com.zhihu.matisse.internal.ui.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.u;
import android.view.View;

public class f
  extends RecyclerView.h
{
  private int a;
  private int b;
  private boolean c;
  
  public f(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramBoolean;
  }
  
  public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.u paramu)
  {
    int i = paramRecyclerView.f(paramView);
    int j = this.a;
    int k = i % j;
    int m;
    if (this.c)
    {
      m = this.b;
      paramRect.left = (m - k * m / j);
      paramRect.right = ((k + 1) * m / j);
      if (i < j) {
        paramRect.top = m;
      }
      paramRect.bottom = this.b;
    }
    else
    {
      m = this.b;
      paramRect.left = (k * m / j);
      paramRect.right = (m - (k + 1) * m / j);
      if (i >= j) {
        paramRect.top = m;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/zhihu/matisse/internal/ui/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */