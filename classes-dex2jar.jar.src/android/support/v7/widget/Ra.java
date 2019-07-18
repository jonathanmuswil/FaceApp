package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class ra
  extends RecyclerView.t
{
  protected final LinearInterpolator i = new LinearInterpolator();
  protected final DecelerateInterpolator j = new DecelerateInterpolator();
  protected PointF k;
  private final float l = a(paramContext.getResources().getDisplayMetrics());
  protected int m = 0;
  protected int n = 0;
  
  public ra(Context paramContext) {}
  
  private int b(int paramInt1, int paramInt2)
  {
    paramInt2 = paramInt1 - paramInt2;
    if (paramInt1 * paramInt2 <= 0) {
      return 0;
    }
    return paramInt2;
  }
  
  protected float a(DisplayMetrics paramDisplayMetrics)
  {
    return 25.0F / paramDisplayMetrics.densityDpi;
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 != -1)
    {
      if (paramInt5 != 0)
      {
        if (paramInt5 == 1) {
          return paramInt4 - paramInt2;
        }
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
      }
      paramInt1 = paramInt3 - paramInt1;
      if (paramInt1 > 0) {
        return paramInt1;
      }
      paramInt1 = paramInt4 - paramInt2;
      if (paramInt1 < 0) {
        return paramInt1;
      }
      return 0;
    }
    return paramInt3 - paramInt1;
  }
  
  public int a(View paramView, int paramInt)
  {
    RecyclerView.i locali = b();
    if ((locali != null) && (locali.a()))
    {
      RecyclerView.j localj = (RecyclerView.j)paramView.getLayoutParams();
      return a(locali.f(paramView) - localj.leftMargin, locali.i(paramView) + localj.rightMargin, locali.n(), locali.q() - locali.o(), paramInt);
    }
    return 0;
  }
  
  protected void a(int paramInt1, int paramInt2, RecyclerView.u paramu, RecyclerView.t.a parama)
  {
    if (a() == 0)
    {
      h();
      return;
    }
    this.m = b(this.m, paramInt1);
    this.n = b(this.n, paramInt2);
    if ((this.m == 0) && (this.n == 0)) {
      a(parama);
    }
  }
  
  protected void a(RecyclerView.t.a parama)
  {
    PointF localPointF = a(c());
    if ((localPointF != null) && ((localPointF.x != 0.0F) || (localPointF.y != 0.0F)))
    {
      a(localPointF);
      this.k = localPointF;
      this.m = ((int)(localPointF.x * 10000.0F));
      this.n = ((int)(localPointF.y * 10000.0F));
      int i1 = e(10000);
      parama.a((int)(this.m * 1.2F), (int)(this.n * 1.2F), (int)(i1 * 1.2F), this.i);
      return;
    }
    parama.a(c());
    h();
  }
  
  protected void a(View paramView, RecyclerView.u paramu, RecyclerView.t.a parama)
  {
    int i1 = a(paramView, i());
    int i2 = b(paramView, j());
    int i3 = d((int)Math.sqrt(i1 * i1 + i2 * i2));
    if (i3 > 0) {
      parama.a(-i1, -i2, i3, this.j);
    }
  }
  
  public int b(View paramView, int paramInt)
  {
    RecyclerView.i locali = b();
    if ((locali != null) && (locali.b()))
    {
      RecyclerView.j localj = (RecyclerView.j)paramView.getLayoutParams();
      return a(locali.j(paramView) - localj.topMargin, locali.e(paramView) + localj.bottomMargin, locali.p(), locali.h() - locali.m(), paramInt);
    }
    return 0;
  }
  
  protected int d(int paramInt)
  {
    return (int)Math.ceil(e(paramInt) / 0.3356D);
  }
  
  protected int e(int paramInt)
  {
    return (int)Math.ceil(Math.abs(paramInt) * this.l);
  }
  
  protected void f() {}
  
  protected void g()
  {
    this.n = 0;
    this.m = 0;
    this.k = null;
  }
  
  protected int i()
  {
    PointF localPointF = this.k;
    if (localPointF != null)
    {
      float f = localPointF.x;
      if (f != 0.0F)
      {
        if (f > 0.0F) {
          return 1;
        }
        return -1;
      }
    }
    int i1 = 0;
    return i1;
  }
  
  protected int j()
  {
    PointF localPointF = this.k;
    if (localPointF != null)
    {
      float f = localPointF.y;
      if (f != 0.0F)
      {
        if (f > 0.0F) {
          return 1;
        }
        return -1;
      }
    }
    int i1 = 0;
    return i1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */