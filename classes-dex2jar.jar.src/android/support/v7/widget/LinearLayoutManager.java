package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import te;

public class LinearLayoutManager
  extends RecyclerView.i
  implements te, RecyclerView.t.b
{
  int A = -1;
  int B = Integer.MIN_VALUE;
  private boolean C;
  d D = null;
  final a E = new a();
  private final b F = new b();
  private int G = 2;
  int s = 1;
  private c t;
  Ba u;
  private boolean v;
  private boolean w = false;
  boolean x = false;
  private boolean y = false;
  private boolean z = true;
  
  public LinearLayoutManager(Context paramContext)
  {
    this(paramContext, 1, false);
  }
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean)
  {
    k(paramInt);
    a(paramBoolean);
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = RecyclerView.i.a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    k(paramContext.a);
    a(paramContext.c);
    b(paramContext.d);
  }
  
  private View K()
  {
    int i;
    if (this.x) {
      i = 0;
    } else {
      i = e() - 1;
    }
    return d(i);
  }
  
  private View L()
  {
    int i;
    if (this.x) {
      i = e() - 1;
    } else {
      i = 0;
    }
    return d(i);
  }
  
  private void M()
  {
    if ((this.s != 1) && (I())) {
      this.x = (this.w ^ true);
    } else {
      this.x = this.w;
    }
  }
  
  private int a(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu, boolean paramBoolean)
  {
    int i = this.u.b() - paramInt;
    if (i > 0)
    {
      i = -c(-i, paramp, paramu);
      if (paramBoolean)
      {
        paramInt = this.u.b() - (paramInt + i);
        if (paramInt > 0)
        {
          this.u.a(paramInt);
          return paramInt + i;
        }
      }
      return i;
    }
    return 0;
  }
  
  private View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.x) {
      return a(0, e(), paramBoolean1, paramBoolean2);
    }
    return a(e() - 1, -1, paramBoolean1, paramBoolean2);
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, RecyclerView.u paramu)
  {
    this.t.l = J();
    this.t.h = h(paramu);
    paramu = this.t;
    paramu.f = paramInt1;
    int i = -1;
    c localc1;
    c localc2;
    if (paramInt1 == 1)
    {
      paramu.h += this.u.c();
      paramu = K();
      localc1 = this.t;
      if (!this.x) {
        i = 1;
      }
      localc1.e = i;
      localc1 = this.t;
      paramInt1 = l(paramu);
      localc2 = this.t;
      localc1.d = (paramInt1 + localc2.e);
      localc2.b = this.u.a(paramu);
      paramInt1 = this.u.a(paramu) - this.u.b();
    }
    else
    {
      paramu = L();
      localc1 = this.t;
      localc1.h += this.u.f();
      localc1 = this.t;
      if (this.x) {
        i = 1;
      }
      localc1.e = i;
      localc1 = this.t;
      paramInt1 = l(paramu);
      localc2 = this.t;
      localc1.d = (paramInt1 + localc2.e);
      localc2.b = this.u.d(paramu);
      paramInt1 = -this.u.d(paramu) + this.u.f();
    }
    paramu = this.t;
    paramu.c = paramInt2;
    if (paramBoolean) {
      paramu.c -= paramInt1;
    }
    this.t.g = paramInt1;
  }
  
  private void a(a parama)
  {
    g(parama.b, parama.c);
  }
  
  private void a(RecyclerView.p paramp, int paramInt)
  {
    int i = e();
    if (paramInt < 0) {
      return;
    }
    int j = this.u.a() - paramInt;
    View localView;
    if (this.x)
    {
      for (paramInt = 0;; paramInt++)
      {
        if (paramInt >= i) {
          return;
        }
        localView = d(paramInt);
        if ((this.u.d(localView) < j) || (this.u.f(localView) < j)) {
          break;
        }
      }
      a(paramp, 0, paramInt);
      return;
    }
    i--;
    paramInt = i;
    while (paramInt >= 0)
    {
      localView = d(paramInt);
      if ((this.u.d(localView) >= j) && (this.u.f(localView) >= j)) {
        paramInt--;
      } else {
        a(paramp, i, paramInt);
      }
    }
  }
  
  private void a(RecyclerView.p paramp, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    int i = paramInt1;
    if (paramInt2 > paramInt1)
    {
      paramInt2--;
      while (paramInt2 >= paramInt1)
      {
        a(paramInt2, paramp);
        paramInt2--;
      }
    }
    while (i > paramInt2)
    {
      a(i, paramp);
      i--;
    }
  }
  
  private void a(RecyclerView.p paramp, c paramc)
  {
    if ((paramc.a) && (!paramc.l)) {
      if (paramc.f == -1) {
        a(paramp, paramc.g);
      } else {
        b(paramp, paramc.g);
      }
    }
  }
  
  private boolean a(RecyclerView.p paramp, RecyclerView.u paramu, a parama)
  {
    int i = e();
    int j = 0;
    if (i == 0) {
      return false;
    }
    View localView = g();
    if ((localView != null) && (parama.a(localView, paramu)))
    {
      parama.b(localView, l(localView));
      return true;
    }
    if (this.v != this.y) {
      return false;
    }
    if (parama.d) {
      paramp = l(paramp, paramu);
    } else {
      paramp = m(paramp, paramu);
    }
    if (paramp != null)
    {
      parama.a(paramp, l(paramp));
      if ((!paramu.d()) && (C()))
      {
        if ((this.u.d(paramp) >= this.u.b()) || (this.u.a(paramp) < this.u.f())) {
          j = 1;
        }
        if (j != 0)
        {
          if (parama.d) {
            j = this.u.b();
          } else {
            j = this.u.f();
          }
          parama.c = j;
        }
      }
      return true;
    }
    return false;
  }
  
  private boolean a(RecyclerView.u paramu, a parama)
  {
    boolean bool1 = paramu.d();
    boolean bool2 = false;
    if (!bool1)
    {
      int i = this.A;
      if (i != -1)
      {
        if ((i >= 0) && (i < paramu.a()))
        {
          parama.b = this.A;
          paramu = this.D;
          if ((paramu != null) && (paramu.l()))
          {
            parama.d = this.D.c;
            if (parama.d) {
              parama.c = (this.u.b() - this.D.b);
            } else {
              parama.c = (this.u.f() + this.D.b);
            }
            return true;
          }
          if (this.B == Integer.MIN_VALUE)
          {
            paramu = c(this.A);
            if (paramu != null)
            {
              if (this.u.b(paramu) > this.u.g())
              {
                parama.a();
                return true;
              }
              if (this.u.d(paramu) - this.u.f() < 0)
              {
                parama.c = this.u.f();
                parama.d = false;
                return true;
              }
              if (this.u.b() - this.u.a(paramu) < 0)
              {
                parama.c = this.u.b();
                parama.d = true;
                return true;
              }
              if (parama.d) {
                i = this.u.a(paramu) + this.u.h();
              } else {
                i = this.u.d(paramu);
              }
              parama.c = i;
            }
            else
            {
              if (e() > 0)
              {
                i = l(d(0));
                if (this.A < i) {
                  bool1 = true;
                } else {
                  bool1 = false;
                }
                if (bool1 == this.x) {
                  bool2 = true;
                }
                parama.d = bool2;
              }
              parama.a();
            }
            return true;
          }
          bool1 = this.x;
          parama.d = bool1;
          if (bool1) {
            parama.c = (this.u.b() - this.B);
          } else {
            parama.c = (this.u.f() + this.B);
          }
          return true;
        }
        this.A = -1;
        this.B = Integer.MIN_VALUE;
      }
    }
    return false;
  }
  
  private int b(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu, boolean paramBoolean)
  {
    int i = paramInt - this.u.f();
    if (i > 0)
    {
      int j = -c(i, paramp, paramu);
      i = j;
      if (paramBoolean)
      {
        paramInt = paramInt + j - this.u.f();
        i = j;
        if (paramInt > 0)
        {
          this.u.a(-paramInt);
          i = j - paramInt;
        }
      }
      return i;
    }
    return 0;
  }
  
  private View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.x) {
      return a(e() - 1, -1, paramBoolean1, paramBoolean2);
    }
    return a(0, e(), paramBoolean1, paramBoolean2);
  }
  
  private void b(a parama)
  {
    h(parama.b, parama.c);
  }
  
  private void b(RecyclerView.p paramp, int paramInt)
  {
    if (paramInt < 0) {
      return;
    }
    int i = e();
    View localView;
    if (this.x)
    {
      i--;
      for (j = i;; j--)
      {
        if (j < 0) {
          return;
        }
        localView = d(j);
        if ((this.u.a(localView) > paramInt) || (this.u.e(localView) > paramInt)) {
          break;
        }
      }
      a(paramp, i, j);
      return;
    }
    int j = 0;
    while (j < i)
    {
      localView = d(j);
      if ((this.u.a(localView) <= paramInt) && (this.u.e(localView) <= paramInt)) {
        j++;
      } else {
        a(paramp, 0, j);
      }
    }
  }
  
  private void b(RecyclerView.p paramp, RecyclerView.u paramu, int paramInt1, int paramInt2)
  {
    if ((paramu.e()) && (e() != 0) && (!paramu.d()) && (C()))
    {
      List localList = paramp.f();
      int i = localList.size();
      int j = l(d(0));
      int k = 0;
      int m = 0;
      int n = 0;
      Object localObject;
      while (k < i)
      {
        localObject = (RecyclerView.x)localList.get(k);
        if (!((RecyclerView.x)localObject).p())
        {
          int i1 = ((RecyclerView.x)localObject).i();
          int i2 = 1;
          int i3;
          if (i1 < j) {
            i3 = 1;
          } else {
            i3 = 0;
          }
          if (i3 != this.x) {
            i2 = -1;
          }
          if (i2 == -1) {
            m += this.u.b(((RecyclerView.x)localObject).b);
          } else {
            n += this.u.b(((RecyclerView.x)localObject).b);
          }
        }
        k++;
      }
      this.t.k = localList;
      if (m > 0)
      {
        h(l(L()), paramInt1);
        localObject = this.t;
        ((c)localObject).h = m;
        ((c)localObject).c = 0;
        ((c)localObject).a();
        a(paramp, this.t, paramu, false);
      }
      if (n > 0)
      {
        g(l(K()), paramInt2);
        localObject = this.t;
        ((c)localObject).h = n;
        ((c)localObject).c = 0;
        ((c)localObject).a();
        a(paramp, this.t, paramu, false);
      }
      this.t.k = null;
    }
  }
  
  private void b(RecyclerView.p paramp, RecyclerView.u paramu, a parama)
  {
    if (a(paramu, parama)) {
      return;
    }
    if (a(paramp, paramu, parama)) {
      return;
    }
    parama.a();
    int i;
    if (this.y) {
      i = paramu.a() - 1;
    } else {
      i = 0;
    }
    parama.b = i;
  }
  
  private View f(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    return e(0, e());
  }
  
  private View g(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    return a(paramp, paramu, 0, e(), paramu.a());
  }
  
  private void g(int paramInt1, int paramInt2)
  {
    this.t.c = (this.u.b() - paramInt2);
    c localc = this.t;
    int i;
    if (this.x) {
      i = -1;
    } else {
      i = 1;
    }
    localc.e = i;
    localc = this.t;
    localc.d = paramInt1;
    localc.f = 1;
    localc.b = paramInt2;
    localc.g = Integer.MIN_VALUE;
  }
  
  private View h(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    return e(e() - 1, -1);
  }
  
  private void h(int paramInt1, int paramInt2)
  {
    this.t.c = (paramInt2 - this.u.f());
    c localc = this.t;
    localc.d = paramInt1;
    if (this.x) {
      paramInt1 = 1;
    } else {
      paramInt1 = -1;
    }
    localc.e = paramInt1;
    localc = this.t;
    localc.f = -1;
    localc.b = paramInt2;
    localc.g = Integer.MIN_VALUE;
  }
  
  private int i(RecyclerView.u paramu)
  {
    if (e() == 0) {
      return 0;
    }
    E();
    return Qa.a(paramu, this.u, b(this.z ^ true, true), a(this.z ^ true, true), this, this.z);
  }
  
  private View i(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    return a(paramp, paramu, e() - 1, -1, paramu.a());
  }
  
  private int j(RecyclerView.u paramu)
  {
    if (e() == 0) {
      return 0;
    }
    E();
    return Qa.a(paramu, this.u, b(this.z ^ true, true), a(this.z ^ true, true), this, this.z, this.x);
  }
  
  private View j(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (this.x) {
      paramp = f(paramp, paramu);
    } else {
      paramp = h(paramp, paramu);
    }
    return paramp;
  }
  
  private int k(RecyclerView.u paramu)
  {
    if (e() == 0) {
      return 0;
    }
    E();
    return Qa.b(paramu, this.u, b(this.z ^ true, true), a(this.z ^ true, true), this, this.z);
  }
  
  private View k(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (this.x) {
      paramp = h(paramp, paramu);
    } else {
      paramp = f(paramp, paramu);
    }
    return paramp;
  }
  
  private View l(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (this.x) {
      paramp = g(paramp, paramu);
    } else {
      paramp = i(paramp, paramu);
    }
    return paramp;
  }
  
  private View m(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (this.x) {
      paramp = i(paramp, paramu);
    } else {
      paramp = g(paramp, paramu);
    }
    return paramp;
  }
  
  boolean A()
  {
    boolean bool;
    if ((i() != 1073741824) && (r() != 1073741824) && (s())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean C()
  {
    boolean bool;
    if ((this.D == null) && (this.v == this.y)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  c D()
  {
    return new c();
  }
  
  void E()
  {
    if (this.t == null) {
      this.t = D();
    }
  }
  
  public int F()
  {
    View localView = a(0, e(), false, true);
    int i;
    if (localView == null) {
      i = -1;
    } else {
      i = l(localView);
    }
    return i;
  }
  
  public int G()
  {
    int i = e();
    int j = -1;
    View localView = a(i - 1, -1, false, true);
    if (localView != null) {
      j = l(localView);
    }
    return j;
  }
  
  public int H()
  {
    return this.s;
  }
  
  protected boolean I()
  {
    int i = j();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  boolean J()
  {
    boolean bool;
    if ((this.u.d() == 0) && (this.u.a() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int a(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (this.s == 1) {
      return 0;
    }
    return c(paramInt, paramp, paramu);
  }
  
  int a(RecyclerView.p paramp, c paramc, RecyclerView.u paramu, boolean paramBoolean)
  {
    int i = paramc.c;
    int j = paramc.g;
    if (j != Integer.MIN_VALUE)
    {
      if (i < 0) {
        paramc.g = (j + i);
      }
      a(paramp, paramc);
    }
    j = paramc.c + paramc.h;
    b localb = this.F;
    do
    {
      int k;
      do
      {
        if (((!paramc.l) && (j <= 0)) || (!paramc.a(paramu))) {
          break;
        }
        localb.a();
        a(paramp, paramu, paramc, localb);
        if (localb.b) {
          break;
        }
        paramc.b += localb.a * paramc.f;
        if ((localb.c) && (this.t.k == null))
        {
          k = j;
          if (paramu.d()) {}
        }
        else
        {
          int m = paramc.c;
          k = localb.a;
          paramc.c = (m - k);
          k = j - k;
        }
        j = paramc.g;
        if (j != Integer.MIN_VALUE)
        {
          paramc.g = (j + localb.a);
          j = paramc.c;
          if (j < 0) {
            paramc.g += j;
          }
          a(paramp, paramc);
        }
        j = k;
      } while (!paramBoolean);
      j = k;
    } while (!localb.d);
    return i - paramc.c;
  }
  
  public int a(RecyclerView.u paramu)
  {
    return i(paramu);
  }
  
  public PointF a(int paramInt)
  {
    if (e() == 0) {
      return null;
    }
    int i = 0;
    int j = l(d(0));
    int k = 1;
    if (paramInt < j) {
      i = 1;
    }
    paramInt = k;
    if (i != this.x) {
      paramInt = -1;
    }
    if (this.s == 0) {
      return new PointF(paramInt, 0.0F);
    }
    return new PointF(0.0F, paramInt);
  }
  
  View a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    E();
    int i = 320;
    int j;
    if (paramBoolean1) {
      j = 24579;
    } else {
      j = 320;
    }
    if (!paramBoolean2) {
      i = 0;
    }
    View localView;
    if (this.s == 0) {
      localView = this.e.a(paramInt1, paramInt2, j, i);
    } else {
      localView = this.f.a(paramInt1, paramInt2, j, i);
    }
    return localView;
  }
  
  View a(RecyclerView.p paramp, RecyclerView.u paramu, int paramInt1, int paramInt2, int paramInt3)
  {
    E();
    int i = this.u.f();
    int j = this.u.b();
    int k;
    if (paramInt2 > paramInt1) {
      k = 1;
    } else {
      k = -1;
    }
    paramu = null;
    Object localObject2;
    for (paramp = null; paramInt1 != paramInt2; paramp = (RecyclerView.p)localObject2)
    {
      View localView = d(paramInt1);
      int m = l(localView);
      Object localObject1 = paramu;
      localObject2 = paramp;
      if (m >= 0)
      {
        localObject1 = paramu;
        localObject2 = paramp;
        if (m < paramInt3) {
          if (((RecyclerView.j)localView.getLayoutParams()).d())
          {
            localObject1 = paramu;
            localObject2 = paramp;
            if (paramp == null)
            {
              localObject2 = localView;
              localObject1 = paramu;
            }
          }
          else
          {
            if ((this.u.d(localView) < j) && (this.u.a(localView) >= i)) {
              return localView;
            }
            localObject1 = paramu;
            localObject2 = paramp;
            if (paramu == null)
            {
              localObject1 = localView;
              localObject2 = paramp;
            }
          }
        }
      }
      paramInt1 += k;
      paramu = (RecyclerView.u)localObject1;
    }
    if (paramu != null) {
      paramp = paramu;
    }
    return paramp;
  }
  
  public View a(View paramView, int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
  {
    M();
    if (e() == 0) {
      return null;
    }
    paramInt = j(paramInt);
    if (paramInt == Integer.MIN_VALUE) {
      return null;
    }
    E();
    E();
    a(paramInt, (int)(this.u.g() * 0.33333334F), false, paramu);
    paramView = this.t;
    paramView.g = Integer.MIN_VALUE;
    paramView.a = false;
    a(paramp, paramView, paramu, true);
    if (paramInt == -1) {
      paramView = k(paramp, paramu);
    } else {
      paramView = j(paramp, paramu);
    }
    if (paramInt == -1) {
      paramp = L();
    } else {
      paramp = K();
    }
    if (paramp.hasFocusable())
    {
      if (paramView == null) {
        return null;
      }
      return paramp;
    }
    return paramView;
  }
  
  public void a(int paramInt1, int paramInt2, RecyclerView.u paramu, RecyclerView.i.a parama)
  {
    if (this.s != 0) {
      paramInt1 = paramInt2;
    }
    if ((e() != 0) && (paramInt1 != 0))
    {
      E();
      if (paramInt1 > 0) {
        paramInt2 = 1;
      } else {
        paramInt2 = -1;
      }
      a(paramInt2, Math.abs(paramInt1), true, paramu);
      a(paramu, this.t, parama);
    }
  }
  
  public void a(int paramInt, RecyclerView.i.a parama)
  {
    d locald = this.D;
    int i = -1;
    boolean bool1;
    int j;
    if ((locald != null) && (locald.l()))
    {
      locald = this.D;
      bool1 = locald.c;
      j = locald.a;
    }
    else
    {
      M();
      boolean bool2 = this.x;
      k = this.A;
      j = k;
      bool1 = bool2;
      if (k == -1) {
        if (bool2)
        {
          j = paramInt - 1;
          bool1 = bool2;
        }
        else
        {
          j = 0;
          bool1 = bool2;
        }
      }
    }
    if (!bool1) {
      i = 1;
    }
    for (int k = 0; (k < this.G) && (j >= 0) && (j < paramInt); k++)
    {
      parama.a(j, 0);
      j += i;
    }
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof d))
    {
      this.D = ((d)paramParcelable);
      y();
    }
  }
  
  void a(RecyclerView.p paramp, RecyclerView.u paramu, a parama, int paramInt) {}
  
  void a(RecyclerView.p paramp, RecyclerView.u paramu, c paramc, b paramb)
  {
    paramp = paramc.a(paramp);
    if (paramp == null)
    {
      paramb.b = true;
      return;
    }
    paramu = (RecyclerView.j)paramp.getLayoutParams();
    boolean bool1;
    boolean bool2;
    if (paramc.k == null)
    {
      bool1 = this.x;
      if (paramc.f == -1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if (bool1 == bool2) {
        b(paramp);
      } else {
        b(paramp, 0);
      }
    }
    else
    {
      bool1 = this.x;
      if (paramc.f == -1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if (bool1 == bool2) {
        a(paramp);
      } else {
        a(paramp, 0);
      }
    }
    a(paramp, 0, 0);
    paramb.a = this.u.b(paramp);
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    if (this.s == 1)
    {
      if (I())
      {
        i = q() - o();
        j = i - this.u.c(paramp);
      }
      else
      {
        j = n();
        i = this.u.c(paramp) + j;
      }
      if (paramc.f == -1)
      {
        k = paramc.b;
        m = paramb.a;
        n = k;
        i1 = i;
        i = k - m;
      }
      else
      {
        k = paramc.b;
        m = paramb.a;
        n = k;
        i1 = i;
        k = m + k;
        i = n;
        n = k;
      }
    }
    else
    {
      j = p();
      i = this.u.c(paramp) + j;
      if (paramc.f == -1)
      {
        m = paramc.b;
        int i2 = paramb.a;
        i1 = m;
        k = j;
        n = i;
        j = m - i2;
        i = k;
      }
      else
      {
        k = paramc.b;
        i1 = paramb.a;
        i1 += k;
        n = i;
        i = j;
        j = k;
      }
    }
    a(paramp, j, i, i1, n);
    if ((paramu.d()) || (paramu.c())) {
      paramb.c = true;
    }
    paramb.d = paramp.hasFocusable();
  }
  
  void a(RecyclerView.u paramu, c paramc, RecyclerView.i.a parama)
  {
    int i = paramc.d;
    if ((i >= 0) && (i < paramu.a())) {
      parama.a(i, Math.max(0, paramc.g));
    }
  }
  
  public void a(RecyclerView paramRecyclerView, RecyclerView.u paramu, int paramInt)
  {
    paramRecyclerView = new ra(paramRecyclerView.getContext());
    paramRecyclerView.c(paramInt);
    b(paramRecyclerView);
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    if (e() > 0)
    {
      paramAccessibilityEvent.setFromIndex(F());
      paramAccessibilityEvent.setToIndex(G());
    }
  }
  
  public void a(String paramString)
  {
    if (this.D == null) {
      super.a(paramString);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    a(null);
    if (paramBoolean == this.w) {
      return;
    }
    this.w = paramBoolean;
    y();
  }
  
  public boolean a()
  {
    boolean bool;
    if (this.s == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int b(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (this.s == 0) {
      return 0;
    }
    return c(paramInt, paramp, paramu);
  }
  
  public int b(RecyclerView.u paramu)
  {
    return j(paramu);
  }
  
  public void b(RecyclerView paramRecyclerView, RecyclerView.p paramp)
  {
    super.b(paramRecyclerView, paramp);
    if (this.C)
    {
      b(paramp);
      paramp.a();
    }
  }
  
  public void b(boolean paramBoolean)
  {
    a(null);
    if (this.y == paramBoolean) {
      return;
    }
    this.y = paramBoolean;
    y();
  }
  
  public boolean b()
  {
    int i = this.s;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  int c(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if ((e() != 0) && (paramInt != 0))
    {
      this.t.a = true;
      E();
      int i;
      if (paramInt > 0) {
        i = 1;
      } else {
        i = -1;
      }
      int j = Math.abs(paramInt);
      a(i, j, true, paramu);
      c localc = this.t;
      int k = localc.g + a(paramp, localc, paramu, false);
      if (k < 0) {
        return 0;
      }
      if (j > k) {
        paramInt = i * k;
      }
      this.u.a(-paramInt);
      this.t.j = paramInt;
      return paramInt;
    }
    return 0;
  }
  
  public int c(RecyclerView.u paramu)
  {
    return k(paramu);
  }
  
  public RecyclerView.j c()
  {
    return new RecyclerView.j(-2, -2);
  }
  
  public View c(int paramInt)
  {
    int i = e();
    if (i == 0) {
      return null;
    }
    int j = paramInt - l(d(0));
    if ((j >= 0) && (j < i))
    {
      View localView = d(j);
      if (l(localView) == paramInt) {
        return localView;
      }
    }
    return super.c(paramInt);
  }
  
  public int d(RecyclerView.u paramu)
  {
    return i(paramu);
  }
  
  public int e(RecyclerView.u paramu)
  {
    return j(paramu);
  }
  
  View e(int paramInt1, int paramInt2)
  {
    E();
    int i;
    if (paramInt2 > paramInt1) {
      i = 1;
    } else if (paramInt2 < paramInt1) {
      i = -1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return d(paramInt1);
    }
    int j;
    if (this.u.d(d(paramInt1)) < this.u.f())
    {
      j = 16644;
      i = 16388;
    }
    else
    {
      j = 4161;
      i = 4097;
    }
    View localView;
    if (this.s == 0) {
      localView = this.e.a(paramInt1, paramInt2, j, i);
    } else {
      localView = this.f.a(paramInt1, paramInt2, j, i);
    }
    return localView;
  }
  
  public void e(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    Object localObject = this.D;
    int i = -1;
    if (((localObject != null) || (this.A != -1)) && (paramu.a() == 0))
    {
      b(paramp);
      return;
    }
    localObject = this.D;
    if ((localObject != null) && (((d)localObject).l())) {
      this.A = this.D.a;
    }
    E();
    this.t.a = false;
    M();
    localObject = g();
    if ((this.E.e) && (this.A == -1) && (this.D == null))
    {
      if ((localObject != null) && ((this.u.d((View)localObject) >= this.u.b()) || (this.u.a((View)localObject) <= this.u.f()))) {
        this.E.b((View)localObject, l((View)localObject));
      }
    }
    else
    {
      this.E.b();
      localObject = this.E;
      ((a)localObject).d = (this.x ^ this.y);
      b(paramp, paramu, (a)localObject);
      this.E.e = true;
    }
    int j = h(paramu);
    if (this.t.j >= 0)
    {
      k = j;
      j = 0;
    }
    else
    {
      k = 0;
    }
    int m = j + this.u.f();
    int n = k + this.u.c();
    int k = m;
    j = n;
    int i1;
    if (paramu.d())
    {
      i1 = this.A;
      k = m;
      j = n;
      if (i1 != -1)
      {
        k = m;
        j = n;
        if (this.B != Integer.MIN_VALUE)
        {
          localObject = c(i1);
          k = m;
          j = n;
          if (localObject != null)
          {
            if (this.x)
            {
              k = this.u.b() - this.u.a((View)localObject);
              j = this.B;
            }
            else
            {
              j = this.u.d((View)localObject) - this.u.f();
              k = this.B;
            }
            k -= j;
            if (k > 0)
            {
              k = m + k;
              j = n;
            }
            else
            {
              j = n - k;
              k = m;
            }
          }
        }
      }
    }
    if (this.E.d)
    {
      if (!this.x) {}
    }
    else {
      while (!this.x)
      {
        i = 1;
        break;
      }
    }
    a(paramp, paramu, this.E, i);
    a(paramp);
    this.t.l = J();
    this.t.i = paramu.d();
    localObject = this.E;
    if (((a)localObject).d)
    {
      b((a)localObject);
      localObject = this.t;
      ((c)localObject).h = k;
      a(paramp, (c)localObject, paramu, false);
      localObject = this.t;
      i = ((c)localObject).b;
      n = ((c)localObject).d;
      m = ((c)localObject).c;
      k = j;
      if (m > 0) {
        k = j + m;
      }
      a(this.E);
      localObject = this.t;
      ((c)localObject).h = k;
      ((c)localObject).d += ((c)localObject).e;
      a(paramp, (c)localObject, paramu, false);
      localObject = this.t;
      m = ((c)localObject).b;
      i1 = ((c)localObject).c;
      j = i;
      k = m;
      if (i1 > 0)
      {
        h(n, i);
        localObject = this.t;
        ((c)localObject).h = i1;
        a(paramp, (c)localObject, paramu, false);
        j = this.t.b;
        k = m;
      }
    }
    else
    {
      a((a)localObject);
      localObject = this.t;
      ((c)localObject).h = j;
      a(paramp, (c)localObject, paramu, false);
      localObject = this.t;
      i = ((c)localObject).b;
      n = ((c)localObject).d;
      m = ((c)localObject).c;
      j = k;
      if (m > 0) {
        j = k + m;
      }
      b(this.E);
      localObject = this.t;
      ((c)localObject).h = j;
      ((c)localObject).d += ((c)localObject).e;
      a(paramp, (c)localObject, paramu, false);
      localObject = this.t;
      m = ((c)localObject).b;
      i1 = ((c)localObject).c;
      j = m;
      k = i;
      if (i1 > 0)
      {
        g(n, i);
        localObject = this.t;
        ((c)localObject).h = i1;
        a(paramp, (c)localObject, paramu, false);
        k = this.t.b;
        j = m;
      }
    }
    m = j;
    i = k;
    if (e() > 0)
    {
      if ((this.x ^ this.y))
      {
        m = a(k, paramp, paramu, true);
        i = j + m;
        k += m;
        j = b(i, paramp, paramu, false);
      }
      else
      {
        m = b(j, paramp, paramu, true);
        i = j + m;
        k += m;
        j = a(k, paramp, paramu, false);
      }
      m = i + j;
      i = k + j;
    }
    b(paramp, paramu, m, i);
    if (!paramu.d()) {
      this.u.i();
    } else {
      this.E.b();
    }
    this.v = this.y;
  }
  
  public int f(RecyclerView.u paramu)
  {
    return k(paramu);
  }
  
  public void f(int paramInt1, int paramInt2)
  {
    this.A = paramInt1;
    this.B = paramInt2;
    d locald = this.D;
    if (locald != null) {
      locald.m();
    }
    y();
  }
  
  public void g(RecyclerView.u paramu)
  {
    super.g(paramu);
    this.D = null;
    this.A = -1;
    this.B = Integer.MIN_VALUE;
    this.E.b();
  }
  
  protected int h(RecyclerView.u paramu)
  {
    if (paramu.c()) {
      return this.u.g();
    }
    return 0;
  }
  
  public void i(int paramInt)
  {
    this.A = paramInt;
    this.B = Integer.MIN_VALUE;
    d locald = this.D;
    if (locald != null) {
      locald.m();
    }
    y();
  }
  
  int j(int paramInt)
  {
    int i = -1;
    int j = 1;
    int k = 1;
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 17)
        {
          if (paramInt != 33)
          {
            if (paramInt != 66)
            {
              if (paramInt != 130) {
                return Integer.MIN_VALUE;
              }
              if (this.s == 1) {
                paramInt = k;
              } else {
                paramInt = Integer.MIN_VALUE;
              }
              return paramInt;
            }
            if (this.s == 0) {
              paramInt = j;
            } else {
              paramInt = Integer.MIN_VALUE;
            }
            return paramInt;
          }
          if (this.s != 1) {
            i = Integer.MIN_VALUE;
          }
          return i;
        }
        if (this.s != 0) {
          i = Integer.MIN_VALUE;
        }
        return i;
      }
      if (this.s == 1) {
        return 1;
      }
      if (I()) {
        return -1;
      }
      return 1;
    }
    if (this.s == 1) {
      return -1;
    }
    if (I()) {
      return 1;
    }
    return -1;
  }
  
  public void k(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("invalid orientation:");
      localStringBuilder.append(paramInt);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    a(null);
    if ((paramInt != this.s) || (this.u == null))
    {
      this.u = Ba.a(this, paramInt);
      this.E.a = this.u;
      this.s = paramInt;
      y();
    }
  }
  
  public boolean u()
  {
    return true;
  }
  
  public Parcelable x()
  {
    d locald = this.D;
    if (locald != null) {
      return new d(locald);
    }
    locald = new d();
    if (e() > 0)
    {
      E();
      boolean bool = this.v ^ this.x;
      locald.c = bool;
      View localView;
      if (bool)
      {
        localView = K();
        locald.b = (this.u.b() - this.u.a(localView));
        locald.a = l(localView);
      }
      else
      {
        localView = L();
        locald.a = l(localView);
        locald.b = (this.u.d(localView) - this.u.f());
      }
    }
    else
    {
      locald.m();
    }
    return locald;
  }
  
  static class a
  {
    Ba a;
    int b;
    int c;
    boolean d;
    boolean e;
    
    a()
    {
      b();
    }
    
    void a()
    {
      int i;
      if (this.d) {
        i = this.a.b();
      } else {
        i = this.a.f();
      }
      this.c = i;
    }
    
    public void a(View paramView, int paramInt)
    {
      if (this.d) {
        this.c = (this.a.a(paramView) + this.a.h());
      } else {
        this.c = this.a.d(paramView);
      }
      this.b = paramInt;
    }
    
    boolean a(View paramView, RecyclerView.u paramu)
    {
      paramView = (RecyclerView.j)paramView.getLayoutParams();
      boolean bool;
      if ((!paramView.d()) && (paramView.b() >= 0) && (paramView.b() < paramu.a())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    void b()
    {
      this.b = -1;
      this.c = Integer.MIN_VALUE;
      this.d = false;
      this.e = false;
    }
    
    public void b(View paramView, int paramInt)
    {
      int i = this.a.h();
      if (i >= 0)
      {
        a(paramView, paramInt);
        return;
      }
      this.b = paramInt;
      int j;
      int k;
      if (this.d)
      {
        paramInt = this.a.b() - i - this.a.a(paramView);
        this.c = (this.a.b() - paramInt);
        if (paramInt > 0)
        {
          j = this.a.b(paramView);
          i = this.c;
          k = this.a.f();
          i = i - j - (k + Math.min(this.a.d(paramView) - k, 0));
          if (i < 0) {
            this.c += Math.min(paramInt, -i);
          }
        }
      }
      else
      {
        int m = this.a.d(paramView);
        paramInt = m - this.a.f();
        this.c = m;
        if (paramInt > 0)
        {
          int n = this.a.b(paramView);
          j = this.a.b();
          k = this.a.a(paramView);
          i = this.a.b() - Math.min(0, j - i - k) - (m + n);
          if (i < 0) {
            this.c -= Math.min(paramInt, -i);
          }
        }
      }
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AnchorInfo{mPosition=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", mCoordinate=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", mLayoutFromEnd=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", mValid=");
      localStringBuilder.append(this.e);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  protected static class b
  {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    
    void a()
    {
      this.a = 0;
      this.b = false;
      this.c = false;
      this.d = false;
    }
  }
  
  static class c
  {
    boolean a = true;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h = 0;
    boolean i = false;
    int j;
    List<RecyclerView.x> k = null;
    boolean l;
    
    private View b()
    {
      int m = this.k.size();
      for (int n = 0; n < m; n++)
      {
        View localView = ((RecyclerView.x)this.k.get(n)).b;
        RecyclerView.j localj = (RecyclerView.j)localView.getLayoutParams();
        if ((!localj.d()) && (this.d == localj.b()))
        {
          a(localView);
          return localView;
        }
      }
      return null;
    }
    
    View a(RecyclerView.p paramp)
    {
      if (this.k != null) {
        return b();
      }
      paramp = paramp.d(this.d);
      this.d += this.e;
      return paramp;
    }
    
    public void a()
    {
      a(null);
    }
    
    public void a(View paramView)
    {
      paramView = b(paramView);
      if (paramView == null) {
        this.d = -1;
      } else {
        this.d = ((RecyclerView.j)paramView.getLayoutParams()).b();
      }
    }
    
    boolean a(RecyclerView.u paramu)
    {
      int m = this.d;
      boolean bool;
      if ((m >= 0) && (m < paramu.a())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public View b(View paramView)
    {
      int m = this.k.size();
      Object localObject1 = null;
      int n = Integer.MAX_VALUE;
      int i1 = 0;
      Object localObject2;
      for (;;)
      {
        localObject2 = localObject1;
        if (i1 >= m) {
          break;
        }
        View localView = ((RecyclerView.x)this.k.get(i1)).b;
        RecyclerView.j localj = (RecyclerView.j)localView.getLayoutParams();
        localObject2 = localObject1;
        int i2 = n;
        if (localView != paramView) {
          if (localj.d())
          {
            localObject2 = localObject1;
            i2 = n;
          }
          else
          {
            int i3 = (localj.b() - this.d) * this.e;
            if (i3 < 0)
            {
              localObject2 = localObject1;
              i2 = n;
            }
            else
            {
              localObject2 = localObject1;
              i2 = n;
              if (i3 < n)
              {
                if (i3 == 0)
                {
                  localObject2 = localView;
                  break;
                }
                localObject2 = localView;
                i2 = i3;
              }
            }
          }
        }
        i1++;
        localObject1 = localObject2;
        n = i2;
      }
      return (View)localObject2;
    }
  }
  
  public static class d
    implements Parcelable
  {
    public static final Parcelable.Creator<d> CREATOR = new qa();
    int a;
    int b;
    boolean c;
    
    public d() {}
    
    d(Parcel paramParcel)
    {
      this.a = paramParcel.readInt();
      this.b = paramParcel.readInt();
      int i = paramParcel.readInt();
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      this.c = bool;
    }
    
    public d(d paramd)
    {
      this.a = paramd.a;
      this.b = paramd.b;
      this.c = paramd.c;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    boolean l()
    {
      boolean bool;
      if (this.a >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    void m()
    {
      this.a = -1;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.a);
      paramParcel.writeInt(this.b);
      paramParcel.writeInt(this.c);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/LinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */