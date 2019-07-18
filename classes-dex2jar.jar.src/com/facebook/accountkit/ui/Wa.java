package com.facebook.accountkit.ui;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver;

final class wa
{
  private static final int a;
  private boolean b = false;
  private final Rect c = new Rect();
  private final Rect d = new Rect();
  private a e;
  private final Rect f = new Rect();
  
  static
  {
    int i;
    if (Build.VERSION.SDK_INT >= 21) {
      i = 48;
    } else {
      i = 0;
    }
    a = i + 100;
  }
  
  public wa(View paramView)
  {
    a(paramView);
  }
  
  private void a(View paramView)
  {
    if (paramView == null) {
      return;
    }
    View localView = paramView.getRootView();
    if (localView == null) {
      return;
    }
    va localva = new va(this, paramView, localView);
    localView.getViewTreeObserver().addOnGlobalLayoutListener(localva);
    a(paramView, localView);
  }
  
  private void a(View paramView1, View paramView2)
  {
    int i = Ub.a(paramView2.getContext(), a);
    paramView2.getWindowVisibleDisplayFrame(this.f);
    int j = paramView2.getHeight();
    paramView2 = this.f;
    if (j - (paramView2.bottom - paramView2.top) >= i) {
      j = 1;
    } else {
      j = 0;
    }
    if ((j != 0) && (!this.f.equals(this.d)))
    {
      this.d.set(this.f);
      paramView1.getGlobalVisibleRect(this.c);
      this.b = true;
      paramView1 = this.e;
      if (paramView1 != null) {
        paramView1.a(this.c);
      }
    }
  }
  
  public void a(a parama)
  {
    this.e = parama;
    if ((this.b) && (parama != null)) {
      parama.a(this.c);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(Rect paramRect);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/wa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */