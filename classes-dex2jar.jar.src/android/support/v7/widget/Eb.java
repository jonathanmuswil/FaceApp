package android.support.v7.widget;

import android.view.View;

public abstract class eb
  extends RecyclerView.f
{
  boolean g = true;
  
  public final void a(RecyclerView.x paramx, boolean paramBoolean)
  {
    c(paramx, paramBoolean);
    c(paramx);
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public abstract boolean a(RecyclerView.x paramx, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean a(RecyclerView.x paramx, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    if ((paramc1 != null) && ((paramc1.a != paramc2.a) || (paramc1.b != paramc2.b))) {
      return a(paramx, paramc1.a, paramc1.b, paramc2.a, paramc2.b);
    }
    return f(paramx);
  }
  
  public abstract boolean a(RecyclerView.x paramx1, RecyclerView.x paramx2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean a(RecyclerView.x paramx1, RecyclerView.x paramx2, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    int i = paramc1.a;
    int j = paramc1.b;
    int k;
    int m;
    if (paramx2.x())
    {
      k = paramc1.a;
      m = paramc1.b;
    }
    else
    {
      k = paramc2.a;
      m = paramc2.b;
    }
    return a(paramx1, paramx2, i, j, k, m);
  }
  
  public final void b(RecyclerView.x paramx, boolean paramBoolean)
  {
    d(paramx, paramBoolean);
  }
  
  public boolean b(RecyclerView.x paramx)
  {
    boolean bool;
    if ((this.g) && (!paramx.n())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean b(RecyclerView.x paramx, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    int i = paramc1.a;
    int j = paramc1.b;
    paramc1 = paramx.b;
    int k;
    if (paramc2 == null) {
      k = paramc1.getLeft();
    } else {
      k = paramc2.a;
    }
    int m;
    if (paramc2 == null) {
      m = paramc1.getTop();
    } else {
      m = paramc2.b;
    }
    if ((!paramx.p()) && ((i != k) || (j != m)))
    {
      paramc1.layout(k, m, paramc1.getWidth() + k, paramc1.getHeight() + m);
      return a(paramx, i, j, k, m);
    }
    return g(paramx);
  }
  
  public void c(RecyclerView.x paramx, boolean paramBoolean) {}
  
  public boolean c(RecyclerView.x paramx, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    if ((paramc1.a == paramc2.a) && (paramc1.b == paramc2.b))
    {
      j(paramx);
      return false;
    }
    return a(paramx, paramc1.a, paramc1.b, paramc2.a, paramc2.b);
  }
  
  public void d(RecyclerView.x paramx, boolean paramBoolean) {}
  
  public abstract boolean f(RecyclerView.x paramx);
  
  public abstract boolean g(RecyclerView.x paramx);
  
  public final void h(RecyclerView.x paramx)
  {
    n(paramx);
    c(paramx);
  }
  
  public final void i(RecyclerView.x paramx)
  {
    o(paramx);
  }
  
  public final void j(RecyclerView.x paramx)
  {
    p(paramx);
    c(paramx);
  }
  
  public final void k(RecyclerView.x paramx)
  {
    q(paramx);
  }
  
  public final void l(RecyclerView.x paramx)
  {
    r(paramx);
    c(paramx);
  }
  
  public final void m(RecyclerView.x paramx)
  {
    s(paramx);
  }
  
  public void n(RecyclerView.x paramx) {}
  
  public void o(RecyclerView.x paramx) {}
  
  public void p(RecyclerView.x paramx) {}
  
  public void q(RecyclerView.x paramx) {}
  
  public void r(RecyclerView.x paramx) {}
  
  public void s(RecyclerView.x paramx) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */