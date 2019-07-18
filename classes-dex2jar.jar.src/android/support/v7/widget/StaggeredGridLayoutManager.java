package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import zd;
import zd.c;

public class StaggeredGridLayoutManager
  extends RecyclerView.i
  implements RecyclerView.t.b
{
  boolean A = false;
  private BitSet B;
  int C = -1;
  int D = Integer.MIN_VALUE;
  c E = new c();
  private int F = 2;
  private boolean G;
  private boolean H;
  private d I;
  private int J;
  private final Rect K = new Rect();
  private final a L = new a();
  private boolean M = false;
  private boolean N = true;
  private int[] O;
  private final Runnable P = new fb(this);
  private int s = -1;
  e[] t;
  Ba u;
  Ba v;
  private int w;
  private int x;
  private final oa y;
  boolean z = false;
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = RecyclerView.i.a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    j(paramContext.a);
    k(paramContext.b);
    c(paramContext.c);
    this.y = new oa();
    M();
  }
  
  private void M()
  {
    this.u = Ba.a(this, this.w);
    this.v = Ba.a(this, 1 - this.w);
  }
  
  private void N()
  {
    if (this.v.d() == 1073741824) {
      return;
    }
    int i = e();
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    Object localObject;
    while (k < i)
    {
      localObject = d(k);
      float f2 = this.v.b((View)localObject);
      if (f2 >= f1)
      {
        float f3 = f2;
        if (((b)((View)localObject).getLayoutParams()).g()) {
          f3 = f2 * 1.0F / this.s;
        }
        f1 = Math.max(f1, f3);
      }
      k++;
    }
    int m = this.x;
    int n = Math.round(f1 * this.s);
    k = n;
    if (this.v.d() == Integer.MIN_VALUE) {
      k = Math.min(n, this.v.g());
    }
    l(k);
    k = j;
    if (this.x == m) {
      return;
    }
    while (k < i)
    {
      View localView = d(k);
      localObject = (b)localView.getLayoutParams();
      if (!((b)localObject).f) {
        if ((L()) && (this.w == 1))
        {
          j = this.s;
          n = ((b)localObject).e.e;
          localView.offsetLeftAndRight(-(j - 1 - n) * this.x - -(j - 1 - n) * m);
        }
        else
        {
          n = ((b)localObject).e.e;
          j = this.x * n;
          n *= m;
          if (this.w == 1) {
            localView.offsetLeftAndRight(j - n);
          } else {
            localView.offsetTopAndBottom(j - n);
          }
        }
      }
      k++;
    }
  }
  
  private void O()
  {
    if ((this.w != 1) && (L())) {
      this.A = (this.z ^ true);
    } else {
      this.A = this.z;
    }
  }
  
  private int a(RecyclerView.p paramp, oa paramoa, RecyclerView.u paramu)
  {
    this.B.set(0, this.s, true);
    int i;
    if (this.y.i)
    {
      if (paramoa.e == 1) {
        i = Integer.MAX_VALUE;
      } else {
        i = Integer.MIN_VALUE;
      }
    }
    else if (paramoa.e == 1) {
      i = paramoa.g + paramoa.b;
    } else {
      i = paramoa.f - paramoa.b;
    }
    e(paramoa.e, i);
    if (this.A) {
      j = this.u.b();
    } else {
      j = this.u.f();
    }
    for (int k = 0; (paramoa.a(paramu)) && ((this.y.i) || (!this.B.isEmpty())); k = 1)
    {
      View localView = paramoa.a(paramp);
      b localb = (b)localView.getLayoutParams();
      int m = localb.b();
      k = this.E.d(m);
      int n;
      if (k == -1) {
        n = 1;
      } else {
        n = 0;
      }
      e locale;
      if (n != 0)
      {
        if (localb.f) {
          locale = this.t[0];
        } else {
          locale = a(paramoa);
        }
        this.E.a(m, locale);
      }
      else
      {
        locale = this.t[k];
      }
      localb.e = locale;
      if (paramoa.e == 1) {
        b(localView);
      } else {
        b(localView, 0);
      }
      a(localView, localb, false);
      int i1;
      StaggeredGridLayoutManager.c.a locala;
      int i2;
      if (paramoa.e == 1)
      {
        if (localb.f) {
          k = s(j);
        } else {
          k = locale.a(j);
        }
        i1 = this.u.b(localView);
        if ((n != 0) && (localb.f))
        {
          locala = o(k);
          locala.b = -1;
          locala.a = m;
          this.E.a(locala);
        }
        i2 = i1 + k;
        i1 = k;
      }
      else
      {
        if (localb.f) {
          k = v(j);
        } else {
          k = locale.b(j);
        }
        i1 = k - this.u.b(localView);
        if ((n != 0) && (localb.f))
        {
          locala = p(k);
          locala.b = 1;
          locala.a = m;
          this.E.a(locala);
        }
        i2 = k;
      }
      if ((localb.f) && (paramoa.d == -1)) {
        if (n != 0)
        {
          this.M = true;
        }
        else
        {
          boolean bool;
          if (paramoa.e == 1) {
            bool = D();
          } else {
            bool = E();
          }
          if ((bool ^ true))
          {
            locala = this.E.c(m);
            if (locala != null) {
              locala.d = true;
            }
            this.M = true;
          }
        }
      }
      a(localView, localb, paramoa);
      if ((L()) && (this.w == 1))
      {
        if (localb.f) {
          k = this.v.b();
        } else {
          k = this.v.b() - (this.s - 1 - locale.e) * this.x;
        }
        m = this.v.b(localView);
        n = k;
        m = k - m;
        k = n;
      }
      else
      {
        if (localb.f) {
          k = this.v.f();
        } else {
          k = locale.e * this.x + this.v.f();
        }
        m = this.v.b(localView);
        n = k;
        k = m + k;
        m = n;
      }
      if (this.w == 1) {
        a(localView, m, i1, k, i2);
      } else {
        a(localView, i1, m, i2, k);
      }
      if (localb.f) {
        e(this.y.e, i);
      } else {
        a(locale, this.y.e, i);
      }
      a(paramp, this.y);
      if ((this.y.h) && (localView.hasFocusable())) {
        if (localb.f) {
          this.B.clear();
        } else {
          this.B.set(locale.e, false);
        }
      }
    }
    int j = 0;
    if (k == 0) {
      a(paramp, this.y);
    }
    if (this.y.e == -1)
    {
      i = v(this.u.f());
      i = this.u.f() - i;
    }
    else
    {
      i = s(this.u.b()) - this.u.b();
    }
    k = j;
    if (i > 0) {
      k = Math.min(paramoa.b, i);
    }
    return k;
  }
  
  private e a(oa paramoa)
  {
    boolean bool = w(paramoa.e);
    int i = -1;
    int j;
    int k;
    if (bool)
    {
      j = this.s - 1;
      k = -1;
    }
    else
    {
      j = 0;
      i = this.s;
      k = 1;
    }
    int m = paramoa.e;
    e locale = null;
    paramoa = null;
    int i1;
    if (m == 1)
    {
      m = Integer.MAX_VALUE;
      n = this.u.f();
      while (j != i)
      {
        locale = this.t[j];
        i1 = locale.a(n);
        i2 = m;
        if (i1 < m)
        {
          paramoa = locale;
          i2 = i1;
        }
        j += k;
        m = i2;
      }
      return paramoa;
    }
    m = Integer.MIN_VALUE;
    int n = this.u.b();
    paramoa = locale;
    int i2 = j;
    while (i2 != i)
    {
      locale = this.t[i2];
      i1 = locale.b(n);
      j = m;
      if (i1 > m)
      {
        paramoa = locale;
        j = i1;
      }
      i2 += k;
      m = j;
    }
    return paramoa;
  }
  
  private void a(RecyclerView.p paramp, int paramInt)
  {
    for (int i = e() - 1; i >= 0; i--)
    {
      View localView = d(i);
      if ((this.u.d(localView) < paramInt) || (this.u.f(localView) < paramInt)) {
        break;
      }
      b localb = (b)localView.getLayoutParams();
      if (localb.f)
      {
        int j = 0;
        int m;
        for (int k = 0;; k++)
        {
          m = j;
          if (k >= this.s) {
            break;
          }
          if (this.t[k].a.size() == 1) {
            return;
          }
        }
        while (m < this.s)
        {
          this.t[m].j();
          m++;
        }
      }
      if (localb.e.a.size() == 1) {
        return;
      }
      localb.e.j();
      a(localView, paramp);
    }
  }
  
  private void a(RecyclerView.p paramp, RecyclerView.u paramu, boolean paramBoolean)
  {
    int i = s(Integer.MIN_VALUE);
    if (i == Integer.MIN_VALUE) {
      return;
    }
    i = this.u.b() - i;
    if (i > 0)
    {
      i -= -c(-i, paramp, paramu);
      if ((paramBoolean) && (i > 0)) {
        this.u.a(i);
      }
    }
  }
  
  private void a(RecyclerView.p paramp, oa paramoa)
  {
    if ((paramoa.a) && (!paramoa.i)) {
      if (paramoa.b == 0)
      {
        if (paramoa.e == -1) {
          a(paramp, paramoa.g);
        } else {
          b(paramp, paramoa.f);
        }
      }
      else
      {
        int i;
        if (paramoa.e == -1)
        {
          i = paramoa.f;
          i -= t(i);
          if (i < 0) {
            i = paramoa.g;
          } else {
            i = paramoa.g - Math.min(i, paramoa.b);
          }
          a(paramp, i);
        }
        else
        {
          i = u(paramoa.g) - paramoa.g;
          if (i < 0)
          {
            i = paramoa.f;
          }
          else
          {
            int j = paramoa.f;
            i = Math.min(i, paramoa.b) + j;
          }
          b(paramp, i);
        }
      }
    }
  }
  
  private void a(a parama)
  {
    Object localObject = this.I;
    int i = ((d)localObject).c;
    if (i > 0)
    {
      if (i == this.s) {
        for (i = 0; i < this.s; i++)
        {
          this.t[i].c();
          localObject = this.I;
          int j = localObject.d[i];
          int k = j;
          if (j != Integer.MIN_VALUE)
          {
            if (((d)localObject).i) {
              k = this.u.b();
            } else {
              k = this.u.f();
            }
            k = j + k;
          }
          this.t[i].d(k);
        }
      }
      ((d)localObject).m();
      localObject = this.I;
      ((d)localObject).a = ((d)localObject).b;
    }
    localObject = this.I;
    this.H = ((d)localObject).j;
    c(((d)localObject).h);
    O();
    localObject = this.I;
    i = ((d)localObject).a;
    if (i != -1)
    {
      this.C = i;
      parama.c = ((d)localObject).i;
    }
    else
    {
      parama.c = this.A;
    }
    parama = this.I;
    if (parama.e > 1)
    {
      localObject = this.E;
      ((c)localObject).a = parama.f;
      ((c)localObject).b = parama.g;
    }
  }
  
  private void a(e parame, int paramInt1, int paramInt2)
  {
    int i = parame.f();
    if (paramInt1 == -1)
    {
      if (parame.h() + i <= paramInt2) {
        this.B.set(parame.e, false);
      }
    }
    else if (parame.g() - i >= paramInt2) {
      this.B.set(parame.e, false);
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a(paramView, this.K);
    b localb = (b)paramView.getLayoutParams();
    int i = localb.leftMargin;
    Rect localRect = this.K;
    paramInt1 = d(paramInt1, i + localRect.left, localb.rightMargin + localRect.right);
    i = localb.topMargin;
    localRect = this.K;
    paramInt2 = d(paramInt2, i + localRect.top, localb.bottomMargin + localRect.bottom);
    if (paramBoolean) {
      paramBoolean = b(paramView, paramInt1, paramInt2, localb);
    } else {
      paramBoolean = a(paramView, paramInt1, paramInt2, localb);
    }
    if (paramBoolean) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  private void a(View paramView, b paramb, oa paramoa)
  {
    if (paramoa.e == 1)
    {
      if (paramb.f) {
        p(paramView);
      } else {
        paramb.e.a(paramView);
      }
    }
    else if (paramb.f) {
      q(paramView);
    } else {
      paramb.e.c(paramView);
    }
  }
  
  private void a(View paramView, b paramb, boolean paramBoolean)
  {
    if (paramb.f)
    {
      if (this.w == 1) {
        a(paramView, this.J, RecyclerView.i.a(h(), i(), p() + m(), paramb.height, true), paramBoolean);
      } else {
        a(paramView, RecyclerView.i.a(q(), r(), n() + o(), paramb.width, true), this.J, paramBoolean);
      }
    }
    else if (this.w == 1) {
      a(paramView, RecyclerView.i.a(this.x, r(), 0, paramb.width, false), RecyclerView.i.a(h(), i(), p() + m(), paramb.height, true), paramBoolean);
    } else {
      a(paramView, RecyclerView.i.a(q(), r(), n() + o(), paramb.width, true), RecyclerView.i.a(this.x, i(), 0, paramb.height, false), paramBoolean);
    }
  }
  
  private boolean a(e parame)
  {
    if (this.A)
    {
      if (parame.g() < this.u.b())
      {
        ArrayList localArrayList = parame.a;
        return parame.b((View)localArrayList.get(localArrayList.size() - 1)).f ^ true;
      }
    }
    else if (parame.h() > this.u.f()) {
      return parame.b((View)parame.a.get(0)).f ^ true;
    }
    return false;
  }
  
  private void b(int paramInt, RecyclerView.u paramu)
  {
    oa localoa = this.y;
    boolean bool1 = false;
    localoa.b = 0;
    localoa.c = paramInt;
    if (w())
    {
      i = paramu.b();
      if (i != -1)
      {
        boolean bool2 = this.A;
        if (i < paramInt) {
          bool3 = true;
        } else {
          bool3 = false;
        }
        if (bool2 == bool3)
        {
          paramInt = this.u.g();
          break label92;
        }
        i = this.u.g();
        paramInt = 0;
        break label95;
      }
    }
    paramInt = 0;
    label92:
    int i = 0;
    label95:
    if (f())
    {
      this.y.f = (this.u.f() - i);
      this.y.g = (this.u.b() + paramInt);
    }
    else
    {
      this.y.g = (this.u.a() + paramInt);
      this.y.f = (-i);
    }
    paramu = this.y;
    paramu.h = false;
    paramu.a = true;
    boolean bool3 = bool1;
    if (this.u.d() == 0)
    {
      bool3 = bool1;
      if (this.u.a() == 0) {
        bool3 = true;
      }
    }
    paramu.i = bool3;
  }
  
  private void b(RecyclerView.p paramp, int paramInt)
  {
    while (e() > 0)
    {
      int i = 0;
      View localView = d(0);
      if ((this.u.a(localView) > paramInt) || (this.u.e(localView) > paramInt)) {
        break;
      }
      b localb = (b)localView.getLayoutParams();
      if (localb.f)
      {
        int k;
        for (int j = 0;; j++)
        {
          k = i;
          if (j >= this.s) {
            break;
          }
          if (this.t[j].a.size() == 1) {
            return;
          }
        }
        while (k < this.s)
        {
          this.t[k].k();
          k++;
        }
      }
      if (localb.e.a.size() == 1) {
        return;
      }
      localb.e.k();
      a(localView, paramp);
    }
  }
  
  private void b(RecyclerView.p paramp, RecyclerView.u paramu, boolean paramBoolean)
  {
    int i = v(Integer.MAX_VALUE);
    if (i == Integer.MAX_VALUE) {
      return;
    }
    i -= this.u.f();
    if (i > 0)
    {
      i -= c(i, paramp, paramu);
      if ((paramBoolean) && (i > 0)) {
        this.u.a(-i);
      }
    }
  }
  
  private void c(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if (this.A) {
      i = I();
    } else {
      i = H();
    }
    if (paramInt3 == 8)
    {
      if (paramInt1 < paramInt2)
      {
        j = paramInt2 + 1;
      }
      else
      {
        k = paramInt1 + 1;
        j = paramInt2;
        break label64;
      }
    }
    else {
      j = paramInt1 + paramInt2;
    }
    int k = j;
    int j = paramInt1;
    label64:
    this.E.e(j);
    if (paramInt3 != 1)
    {
      if (paramInt3 != 2)
      {
        if (paramInt3 == 8)
        {
          this.E.b(paramInt1, 1);
          this.E.a(paramInt2, 1);
        }
      }
      else {
        this.E.b(paramInt1, paramInt2);
      }
    }
    else {
      this.E.a(paramInt1, paramInt2);
    }
    if (k <= i) {
      return;
    }
    if (this.A) {
      paramInt1 = H();
    } else {
      paramInt1 = I();
    }
    if (j <= paramInt1) {
      y();
    }
  }
  
  private void c(RecyclerView.p paramp, RecyclerView.u paramu, boolean paramBoolean)
  {
    a locala = this.L;
    if (((this.I != null) || (this.C != -1)) && (paramu.a() == 0))
    {
      b(paramp);
      locala.b();
      return;
    }
    boolean bool = locala.e;
    int i = 1;
    if ((bool) && (this.C == -1) && (this.I == null)) {
      j = 0;
    } else {
      j = 1;
    }
    if (j != 0)
    {
      locala.b();
      if (this.I != null)
      {
        a(locala);
      }
      else
      {
        O();
        locala.c = this.A;
      }
      b(paramu, locala);
      locala.e = true;
    }
    if ((this.I == null) && (this.C == -1) && ((locala.c != this.G) || (L() != this.H)))
    {
      this.E.a();
      locala.d = true;
    }
    Object localObject;
    if (e() > 0)
    {
      localObject = this.I;
      if ((localObject == null) || (((d)localObject).c < 1))
      {
        if (locala.d) {
          for (j = 0; j < this.s; j++)
          {
            this.t[j].c();
            int k = locala.b;
            if (k != Integer.MIN_VALUE) {
              this.t[j].d(k);
            }
          }
        }
        if ((j == 0) && (this.L.f != null)) {
          j = 0;
        }
        while (j < this.s)
        {
          localObject = this.t[j];
          ((e)localObject).c();
          ((e)localObject).d(this.L.f[j]);
          j++;
          continue;
          for (j = 0; j < this.s; j++) {
            this.t[j].a(this.A, locala.b);
          }
          this.L.a(this.t);
        }
      }
    }
    a(paramp);
    this.y.a = false;
    this.M = false;
    l(this.v.g());
    b(locala.a, paramu);
    if (locala.c)
    {
      x(-1);
      a(paramp, this.y, paramu);
      x(1);
      localObject = this.y;
      ((oa)localObject).c = (locala.a + ((oa)localObject).d);
      a(paramp, (oa)localObject, paramu);
    }
    else
    {
      x(1);
      a(paramp, this.y, paramu);
      x(-1);
      localObject = this.y;
      ((oa)localObject).c = (locala.a + ((oa)localObject).d);
      a(paramp, (oa)localObject, paramu);
    }
    N();
    if (e() > 0) {
      if (this.A)
      {
        a(paramp, paramu, true);
        b(paramp, paramu, false);
      }
      else
      {
        b(paramp, paramu, true);
        a(paramp, paramu, false);
      }
    }
    if ((paramBoolean) && (!paramu.d()))
    {
      if ((this.F != 0) && (e() > 0) && ((this.M) || (J() != null))) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        a(this.P);
        if (F())
        {
          j = i;
          break label668;
        }
      }
    }
    int j = 0;
    label668:
    if (paramu.d()) {
      this.L.b();
    }
    this.G = locala.c;
    this.H = L();
    if (j != 0)
    {
      this.L.b();
      c(paramp, paramu, false);
    }
  }
  
  private boolean c(RecyclerView.u paramu, a parama)
  {
    int i;
    if (this.G) {
      i = r(paramu.a());
    } else {
      i = q(paramu.a());
    }
    parama.a = i;
    parama.b = Integer.MIN_VALUE;
    return true;
  }
  
  private int d(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      return paramInt1;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    if ((i != Integer.MIN_VALUE) && (i != 1073741824)) {
      return paramInt1;
    }
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i);
  }
  
  private void e(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.s; i++) {
      if (!this.t[i].a.isEmpty()) {
        a(this.t[i], paramInt1, paramInt2);
      }
    }
  }
  
  private int h(RecyclerView.u paramu)
  {
    if (e() == 0) {
      return 0;
    }
    return Qa.a(paramu, this.u, b(this.N ^ true), a(this.N ^ true), this, this.N);
  }
  
  private int i(RecyclerView.u paramu)
  {
    if (e() == 0) {
      return 0;
    }
    return Qa.a(paramu, this.u, b(this.N ^ true), a(this.N ^ true), this, this.N, this.A);
  }
  
  private int j(RecyclerView.u paramu)
  {
    if (e() == 0) {
      return 0;
    }
    return Qa.b(paramu, this.u, b(this.N ^ true), a(this.N ^ true), this, this.N);
  }
  
  private int m(int paramInt)
  {
    int i = e();
    int j = -1;
    if (i == 0)
    {
      if (this.A) {
        j = 1;
      }
      return j;
    }
    int k;
    if (paramInt < H()) {
      k = 1;
    } else {
      k = 0;
    }
    if (k == this.A) {
      j = 1;
    }
    return j;
  }
  
  private int n(int paramInt)
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
              if (this.w == 1) {
                paramInt = k;
              } else {
                paramInt = Integer.MIN_VALUE;
              }
              return paramInt;
            }
            if (this.w == 0) {
              paramInt = j;
            } else {
              paramInt = Integer.MIN_VALUE;
            }
            return paramInt;
          }
          if (this.w != 1) {
            i = Integer.MIN_VALUE;
          }
          return i;
        }
        if (this.w != 0) {
          i = Integer.MIN_VALUE;
        }
        return i;
      }
      if (this.w == 1) {
        return 1;
      }
      if (L()) {
        return -1;
      }
      return 1;
    }
    if (this.w == 1) {
      return -1;
    }
    if (L()) {
      return 1;
    }
    return -1;
  }
  
  private StaggeredGridLayoutManager.c.a o(int paramInt)
  {
    StaggeredGridLayoutManager.c.a locala = new StaggeredGridLayoutManager.c.a();
    locala.c = new int[this.s];
    for (int i = 0; i < this.s; i++) {
      locala.c[i] = (paramInt - this.t[i].a(paramInt));
    }
    return locala;
  }
  
  private StaggeredGridLayoutManager.c.a p(int paramInt)
  {
    StaggeredGridLayoutManager.c.a locala = new StaggeredGridLayoutManager.c.a();
    locala.c = new int[this.s];
    for (int i = 0; i < this.s; i++) {
      locala.c[i] = (this.t[i].b(paramInt) - paramInt);
    }
    return locala;
  }
  
  private void p(View paramView)
  {
    for (int i = this.s - 1; i >= 0; i--) {
      this.t[i].a(paramView);
    }
  }
  
  private int q(int paramInt)
  {
    int i = e();
    for (int j = 0; j < i; j++)
    {
      int k = l(d(j));
      if ((k >= 0) && (k < paramInt)) {
        return k;
      }
    }
    return 0;
  }
  
  private void q(View paramView)
  {
    for (int i = this.s - 1; i >= 0; i--) {
      this.t[i].c(paramView);
    }
  }
  
  private int r(int paramInt)
  {
    for (int i = e() - 1; i >= 0; i--)
    {
      int j = l(d(i));
      if ((j >= 0) && (j < paramInt)) {
        return j;
      }
    }
    return 0;
  }
  
  private int s(int paramInt)
  {
    int i = this.t[0].a(paramInt);
    int j = 1;
    while (j < this.s)
    {
      int k = this.t[j].a(paramInt);
      int m = i;
      if (k > i) {
        m = k;
      }
      j++;
      i = m;
    }
    return i;
  }
  
  private int t(int paramInt)
  {
    int i = this.t[0].b(paramInt);
    int j = 1;
    while (j < this.s)
    {
      int k = this.t[j].b(paramInt);
      int m = i;
      if (k > i) {
        m = k;
      }
      j++;
      i = m;
    }
    return i;
  }
  
  private int u(int paramInt)
  {
    int i = this.t[0].a(paramInt);
    int j = 1;
    while (j < this.s)
    {
      int k = this.t[j].a(paramInt);
      int m = i;
      if (k < i) {
        m = k;
      }
      j++;
      i = m;
    }
    return i;
  }
  
  private int v(int paramInt)
  {
    int i = this.t[0].b(paramInt);
    int j = 1;
    while (j < this.s)
    {
      int k = this.t[j].b(paramInt);
      int m = i;
      if (k < i) {
        m = k;
      }
      j++;
      i = m;
    }
    return i;
  }
  
  private boolean w(int paramInt)
  {
    int i = this.w;
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3;
    if (i == 0)
    {
      if (paramInt == -1) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      if (bool3 != this.A) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    if (paramInt == -1) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    if (bool3 == this.A) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    if (bool3 == L()) {
      bool3 = bool1;
    } else {
      bool3 = false;
    }
    return bool3;
  }
  
  private void x(int paramInt)
  {
    oa localoa = this.y;
    localoa.e = paramInt;
    boolean bool1 = this.A;
    int i = 1;
    boolean bool2;
    if (paramInt == -1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    if (bool1 == bool2) {
      paramInt = i;
    } else {
      paramInt = -1;
    }
    localoa.d = paramInt;
  }
  
  public boolean C()
  {
    boolean bool;
    if (this.I == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  boolean D()
  {
    int i = this.t[0].a(Integer.MIN_VALUE);
    for (int j = 1; j < this.s; j++) {
      if (this.t[j].a(Integer.MIN_VALUE) != i) {
        return false;
      }
    }
    return true;
  }
  
  boolean E()
  {
    int i = this.t[0].b(Integer.MIN_VALUE);
    for (int j = 1; j < this.s; j++) {
      if (this.t[j].b(Integer.MIN_VALUE) != i) {
        return false;
      }
    }
    return true;
  }
  
  boolean F()
  {
    if ((e() != 0) && (this.F != 0) && (t()))
    {
      int i;
      int j;
      if (this.A)
      {
        i = I();
        j = H();
      }
      else
      {
        i = H();
        j = I();
      }
      if ((i == 0) && (J() != null))
      {
        this.E.a();
        z();
        y();
        return true;
      }
      if (!this.M) {
        return false;
      }
      int k;
      if (this.A) {
        k = -1;
      } else {
        k = 1;
      }
      Object localObject = this.E;
      j++;
      StaggeredGridLayoutManager.c.a locala = ((c)localObject).a(i, j, k, true);
      if (locala == null)
      {
        this.M = false;
        this.E.b(j);
        return false;
      }
      localObject = this.E.a(i, locala.a, k * -1, true);
      if (localObject == null) {
        this.E.b(locala.a);
      } else {
        this.E.b(((StaggeredGridLayoutManager.c.a)localObject).a + 1);
      }
      z();
      y();
      return true;
    }
    return false;
  }
  
  int G()
  {
    View localView;
    if (this.A) {
      localView = a(true);
    } else {
      localView = b(true);
    }
    int i;
    if (localView == null) {
      i = -1;
    } else {
      i = l(localView);
    }
    return i;
  }
  
  int H()
  {
    int i = e();
    int j = 0;
    if (i != 0) {
      j = l(d(0));
    }
    return j;
  }
  
  int I()
  {
    int i = e();
    if (i == 0) {
      i = 0;
    } else {
      i = l(d(i - 1));
    }
    return i;
  }
  
  View J()
  {
    int i = e() - 1;
    BitSet localBitSet = new BitSet(this.s);
    localBitSet.set(0, this.s, true);
    int j = this.w;
    int k = -1;
    if ((j == 1) && (L())) {
      j = 1;
    } else {
      j = -1;
    }
    int m;
    if (this.A)
    {
      m = -1;
    }
    else
    {
      m = i + 1;
      i = 0;
    }
    int n = i;
    if (i < m)
    {
      k = 1;
      n = i;
    }
    while (n != m)
    {
      View localView = d(n);
      b localb = (b)localView.getLayoutParams();
      if (localBitSet.get(localb.e.e))
      {
        if (a(localb.e)) {
          return localView;
        }
        localBitSet.clear(localb.e.e);
      }
      if (!localb.f)
      {
        i = n + k;
        if (i != m)
        {
          Object localObject = d(i);
          int i1;
          if (this.A)
          {
            i1 = this.u.a(localView);
            i = this.u.a((View)localObject);
            if (i1 < i) {
              return localView;
            }
            if (i1 != i) {
              break label275;
            }
          }
          else
          {
            i = this.u.d(localView);
            i1 = this.u.d((View)localObject);
            if (i > i1) {
              return localView;
            }
            if (i != i1) {
              break label275;
            }
          }
          i = 1;
          break label277;
          label275:
          i = 0;
          label277:
          if (i != 0)
          {
            localObject = (b)((View)localObject).getLayoutParams();
            if (localb.e.e - ((b)localObject).e.e < 0) {
              i = 1;
            } else {
              i = 0;
            }
            if (j < 0) {
              i1 = 1;
            } else {
              i1 = 0;
            }
            if (i != i1) {
              return localView;
            }
          }
        }
      }
      n += k;
    }
    return null;
  }
  
  public void K()
  {
    this.E.a();
    y();
  }
  
  boolean L()
  {
    int i = j();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public int a(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
  {
    return c(paramInt, paramp, paramu);
  }
  
  public int a(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (this.w == 1) {
      return this.s;
    }
    return super.a(paramp, paramu);
  }
  
  public int a(RecyclerView.u paramu)
  {
    return h(paramu);
  }
  
  public PointF a(int paramInt)
  {
    paramInt = m(paramInt);
    PointF localPointF = new PointF();
    if (paramInt == 0) {
      return null;
    }
    if (this.w == 0)
    {
      localPointF.x = paramInt;
      localPointF.y = 0.0F;
    }
    else
    {
      localPointF.x = 0.0F;
      localPointF.y = paramInt;
    }
    return localPointF;
  }
  
  public RecyclerView.j a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new b(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.j a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new b((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new b(paramLayoutParams);
  }
  
  public View a(View paramView, int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (e() == 0) {
      return null;
    }
    paramView = c(paramView);
    if (paramView == null) {
      return null;
    }
    O();
    int i = n(paramInt);
    if (i == Integer.MIN_VALUE) {
      return null;
    }
    Object localObject = (b)paramView.getLayoutParams();
    boolean bool1 = ((b)localObject).f;
    localObject = ((b)localObject).e;
    if (i == 1) {
      paramInt = I();
    } else {
      paramInt = H();
    }
    b(paramInt, paramu);
    x(i);
    oa localoa = this.y;
    localoa.c = (localoa.d + paramInt);
    localoa.b = ((int)(this.u.g() * 0.33333334F));
    localoa = this.y;
    localoa.h = true;
    int j = 0;
    localoa.a = false;
    a(paramp, localoa, paramu);
    this.G = this.A;
    if (!bool1)
    {
      paramp = ((e)localObject).a(paramInt, i);
      if ((paramp != null) && (paramp != paramView)) {
        return paramp;
      }
    }
    if (w(i)) {
      for (k = this.s - 1; k >= 0; k--)
      {
        paramp = this.t[k].a(paramInt, i);
        if ((paramp != null) && (paramp != paramView)) {
          return paramp;
        }
      }
    }
    for (int k = 0; k < this.s; k++)
    {
      paramp = this.t[k].a(paramInt, i);
      if ((paramp != null) && (paramp != paramView)) {
        return paramp;
      }
    }
    boolean bool2 = this.z;
    if (i == -1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if ((bool2 ^ true) == paramInt) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (!bool1)
    {
      if (paramInt != 0) {
        k = ((e)localObject).d();
      } else {
        k = ((e)localObject).e();
      }
      paramp = c(k);
      if ((paramp != null) && (paramp != paramView)) {
        return paramp;
      }
    }
    k = j;
    if (w(i)) {
      for (k = this.s - 1; k >= 0; k--) {
        if (k != ((e)localObject).e)
        {
          if (paramInt != 0) {
            j = this.t[k].d();
          } else {
            j = this.t[k].e();
          }
          paramp = c(j);
          if ((paramp != null) && (paramp != paramView)) {
            return paramp;
          }
        }
      }
    }
    while (k < this.s)
    {
      if (paramInt != 0) {
        j = this.t[k].d();
      } else {
        j = this.t[k].e();
      }
      paramp = c(j);
      if ((paramp != null) && (paramp != paramView)) {
        return paramp;
      }
      k++;
    }
    return null;
  }
  
  View a(boolean paramBoolean)
  {
    int i = this.u.f();
    int j = this.u.b();
    int k = e() - 1;
    Object localObject2;
    for (Object localObject1 = null; k >= 0; localObject1 = localObject2)
    {
      View localView = d(k);
      int m = this.u.d(localView);
      int n = this.u.a(localView);
      localObject2 = localObject1;
      if (n > i) {
        if (m >= j)
        {
          localObject2 = localObject1;
        }
        else if ((n > j) && (paramBoolean))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
        else
        {
          return localView;
        }
      }
      k--;
    }
    return (View)localObject1;
  }
  
  public void a(int paramInt1, int paramInt2, RecyclerView.u paramu, RecyclerView.i.a parama)
  {
    if (this.w != 0) {
      paramInt1 = paramInt2;
    }
    if ((e() != 0) && (paramInt1 != 0))
    {
      a(paramInt1, paramu);
      Object localObject = this.O;
      if ((localObject == null) || (localObject.length < this.s)) {
        this.O = new int[this.s];
      }
      int i = 0;
      paramInt2 = 0;
      int k;
      for (paramInt1 = 0; paramInt2 < this.s; paramInt1 = k)
      {
        localObject = this.y;
        int j;
        if (((oa)localObject).d == -1)
        {
          j = ((oa)localObject).f;
          k = this.t[paramInt2].b(j);
        }
        else
        {
          j = this.t[paramInt2].a(((oa)localObject).g);
          k = this.y.g;
        }
        j -= k;
        k = paramInt1;
        if (j >= 0)
        {
          this.O[paramInt1] = j;
          k = paramInt1 + 1;
        }
        paramInt2++;
      }
      Arrays.sort(this.O, 0, paramInt1);
      for (paramInt2 = i; (paramInt2 < paramInt1) && (this.y.a(paramu)); paramInt2++)
      {
        parama.a(this.y.c, this.O[paramInt2]);
        localObject = this.y;
        ((oa)localObject).c += ((oa)localObject).d;
      }
    }
  }
  
  void a(int paramInt, RecyclerView.u paramu)
  {
    int i;
    int j;
    if (paramInt > 0)
    {
      i = I();
      j = 1;
    }
    else
    {
      i = H();
      j = -1;
    }
    this.y.a = true;
    b(i, paramu);
    x(j);
    paramu = this.y;
    paramu.c = (i + paramu.d);
    paramu.b = Math.abs(paramInt);
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = n() + o();
    int j = p() + m();
    if (this.w == 1)
    {
      paramInt2 = RecyclerView.i.a(paramInt2, paramRect.height() + j, k());
      paramInt1 = RecyclerView.i.a(paramInt1, this.x * this.s + i, l());
    }
    else
    {
      paramInt1 = RecyclerView.i.a(paramInt1, paramRect.width() + i, l());
      paramInt2 = RecyclerView.i.a(paramInt2, this.x * this.s + j, k());
    }
    c(paramInt1, paramInt2);
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof d))
    {
      this.I = ((d)paramParcelable);
      y();
    }
  }
  
  public void a(RecyclerView.p paramp, RecyclerView.u paramu, View paramView, zd paramzd)
  {
    paramp = paramView.getLayoutParams();
    if (!(paramp instanceof b))
    {
      super.a(paramView, paramzd);
      return;
    }
    paramp = (b)paramp;
    int i;
    int j;
    if (this.w == 0)
    {
      i = paramp.f();
      if (paramp.f) {
        j = this.s;
      } else {
        j = 1;
      }
      paramzd.b(zd.c.a(i, j, -1, -1, paramp.f, false));
    }
    else
    {
      i = paramp.f();
      if (paramp.f) {
        j = this.s;
      } else {
        j = 1;
      }
      paramzd.b(zd.c.a(-1, -1, i, j, paramp.f, false));
    }
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    c(paramInt1, paramInt2, 1);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    c(paramInt1, paramInt2, 8);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    c(paramInt1, paramInt2, 4);
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
      View localView1 = b(false);
      View localView2 = a(false);
      if ((localView1 != null) && (localView2 != null))
      {
        int i = l(localView1);
        int j = l(localView2);
        if (i < j)
        {
          paramAccessibilityEvent.setFromIndex(i);
          paramAccessibilityEvent.setToIndex(j);
        }
        else
        {
          paramAccessibilityEvent.setFromIndex(j);
          paramAccessibilityEvent.setToIndex(i);
        }
      }
    }
  }
  
  public void a(String paramString)
  {
    if (this.I == null) {
      super.a(paramString);
    }
  }
  
  public boolean a()
  {
    boolean bool;
    if (this.w == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean a(RecyclerView.j paramj)
  {
    return paramj instanceof b;
  }
  
  boolean a(RecyclerView.u paramu, a parama)
  {
    boolean bool1 = paramu.d();
    boolean bool2 = false;
    if (!bool1)
    {
      int i = this.C;
      if (i != -1)
      {
        if ((i >= 0) && (i < paramu.a()))
        {
          paramu = this.I;
          if ((paramu != null) && (paramu.a != -1) && (paramu.c >= 1))
          {
            parama.b = Integer.MIN_VALUE;
            parama.a = this.C;
          }
          else
          {
            paramu = c(this.C);
            if (paramu != null)
            {
              if (this.A) {
                i = I();
              } else {
                i = H();
              }
              parama.a = i;
              if (this.D != Integer.MIN_VALUE)
              {
                if (parama.c) {
                  parama.b = (this.u.b() - this.D - this.u.a(paramu));
                } else {
                  parama.b = (this.u.f() + this.D - this.u.d(paramu));
                }
                return true;
              }
              if (this.u.b(paramu) > this.u.g())
              {
                if (parama.c) {
                  i = this.u.b();
                } else {
                  i = this.u.f();
                }
                parama.b = i;
                return true;
              }
              i = this.u.d(paramu) - this.u.f();
              if (i < 0)
              {
                parama.b = (-i);
                return true;
              }
              i = this.u.b() - this.u.a(paramu);
              if (i < 0)
              {
                parama.b = i;
                return true;
              }
              parama.b = Integer.MIN_VALUE;
            }
            else
            {
              parama.a = this.C;
              i = this.D;
              if (i == Integer.MIN_VALUE)
              {
                if (m(parama.a) == 1) {
                  bool2 = true;
                }
                parama.c = bool2;
                parama.a();
              }
              else
              {
                parama.a(i);
              }
              parama.d = true;
            }
          }
          return true;
        }
        this.C = -1;
        this.D = Integer.MIN_VALUE;
      }
    }
    return false;
  }
  
  public int b(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
  {
    return c(paramInt, paramp, paramu);
  }
  
  public int b(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (this.w == 0) {
      return this.s;
    }
    return super.b(paramp, paramu);
  }
  
  public int b(RecyclerView.u paramu)
  {
    return i(paramu);
  }
  
  View b(boolean paramBoolean)
  {
    int i = this.u.f();
    int j = this.u.b();
    int k = e();
    Object localObject1 = null;
    int m = 0;
    while (m < k)
    {
      View localView = d(m);
      int n = this.u.d(localView);
      Object localObject2 = localObject1;
      if (this.u.a(localView) > i) {
        if (n >= j)
        {
          localObject2 = localObject1;
        }
        else if ((n < i) && (paramBoolean))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
        else
        {
          return localView;
        }
      }
      m++;
      localObject1 = localObject2;
    }
    return (View)localObject1;
  }
  
  void b(RecyclerView.u paramu, a parama)
  {
    if (a(paramu, parama)) {
      return;
    }
    if (c(paramu, parama)) {
      return;
    }
    parama.a();
    parama.a = 0;
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    c(paramInt1, paramInt2, 2);
  }
  
  public void b(RecyclerView paramRecyclerView, RecyclerView.p paramp)
  {
    super.b(paramRecyclerView, paramp);
    a(this.P);
    for (int i = 0; i < this.s; i++) {
      this.t[i].c();
    }
    paramRecyclerView.requestLayout();
  }
  
  public boolean b()
  {
    int i = this.w;
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
      a(paramInt, paramu);
      int i = a(paramp, this.y, paramu);
      if (this.y.b >= i) {
        if (paramInt < 0) {
          paramInt = -i;
        } else {
          paramInt = i;
        }
      }
      this.u.a(-paramInt);
      this.G = this.A;
      paramu = this.y;
      paramu.b = 0;
      a(paramp, paramu);
      return paramInt;
    }
    return 0;
  }
  
  public int c(RecyclerView.u paramu)
  {
    return j(paramu);
  }
  
  public RecyclerView.j c()
  {
    if (this.w == 0) {
      return new b(-2, -1);
    }
    return new b(-1, -2);
  }
  
  public void c(boolean paramBoolean)
  {
    a(null);
    d locald = this.I;
    if ((locald != null) && (locald.h != paramBoolean)) {
      locald.h = paramBoolean;
    }
    this.z = paramBoolean;
    y();
  }
  
  public int d(RecyclerView.u paramu)
  {
    return h(paramu);
  }
  
  public void d(RecyclerView paramRecyclerView)
  {
    this.E.a();
    y();
  }
  
  public int e(RecyclerView.u paramu)
  {
    return i(paramu);
  }
  
  public void e(int paramInt)
  {
    super.e(paramInt);
    for (int i = 0; i < this.s; i++) {
      this.t[i].c(paramInt);
    }
  }
  
  public void e(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    c(paramp, paramu, true);
  }
  
  public int f(RecyclerView.u paramu)
  {
    return j(paramu);
  }
  
  public void f(int paramInt)
  {
    super.f(paramInt);
    for (int i = 0; i < this.s; i++) {
      this.t[i].c(paramInt);
    }
  }
  
  public void g(int paramInt)
  {
    if (paramInt == 0) {
      F();
    }
  }
  
  public void g(RecyclerView.u paramu)
  {
    super.g(paramu);
    this.C = -1;
    this.D = Integer.MIN_VALUE;
    this.I = null;
    this.L.b();
  }
  
  public void i(int paramInt)
  {
    d locald = this.I;
    if ((locald != null) && (locald.a != paramInt)) {
      locald.l();
    }
    this.C = paramInt;
    this.D = Integer.MIN_VALUE;
    y();
  }
  
  public void j(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation.");
    }
    a(null);
    if (paramInt == this.w) {
      return;
    }
    this.w = paramInt;
    Ba localBa = this.u;
    this.u = this.v;
    this.v = localBa;
    y();
  }
  
  public void k(int paramInt)
  {
    a(null);
    if (paramInt != this.s)
    {
      K();
      this.s = paramInt;
      this.B = new BitSet(this.s);
      this.t = new e[this.s];
      for (paramInt = 0; paramInt < this.s; paramInt++) {
        this.t[paramInt] = new e(paramInt);
      }
      y();
    }
  }
  
  void l(int paramInt)
  {
    this.x = (paramInt / this.s);
    this.J = View.MeasureSpec.makeMeasureSpec(paramInt, this.v.d());
  }
  
  public boolean u()
  {
    boolean bool;
    if (this.F != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Parcelable x()
  {
    Object localObject = this.I;
    if (localObject != null) {
      return new d((d)localObject);
    }
    d locald = new d();
    locald.h = this.z;
    locald.i = this.G;
    locald.j = this.H;
    localObject = this.E;
    int i = 0;
    if (localObject != null)
    {
      int[] arrayOfInt = ((c)localObject).a;
      if (arrayOfInt != null)
      {
        locald.f = arrayOfInt;
        locald.e = locald.f.length;
        locald.g = ((c)localObject).b;
        break label103;
      }
    }
    locald.e = 0;
    label103:
    if (e() > 0)
    {
      if (this.G) {
        j = I();
      } else {
        j = H();
      }
      locald.a = j;
      locald.b = G();
      int j = this.s;
      locald.c = j;
      locald.d = new int[j];
      while (i < this.s)
      {
        int k;
        if (this.G)
        {
          k = this.t[i].a(Integer.MIN_VALUE);
          j = k;
          if (k == Integer.MIN_VALUE) {
            break label257;
          }
          j = this.u.b();
        }
        else
        {
          k = this.t[i].b(Integer.MIN_VALUE);
          j = k;
          if (k == Integer.MIN_VALUE) {
            break label257;
          }
          j = this.u.f();
        }
        j = k - j;
        label257:
        locald.d[i] = j;
        i++;
      }
    }
    locald.a = -1;
    locald.b = -1;
    locald.c = 0;
    return locald;
  }
  
  class a
  {
    int a;
    int b;
    boolean c;
    boolean d;
    boolean e;
    int[] f;
    
    a()
    {
      b();
    }
    
    void a()
    {
      int i;
      if (this.c) {
        i = StaggeredGridLayoutManager.this.u.b();
      } else {
        i = StaggeredGridLayoutManager.this.u.f();
      }
      this.b = i;
    }
    
    void a(int paramInt)
    {
      if (this.c) {
        this.b = (StaggeredGridLayoutManager.this.u.b() - paramInt);
      } else {
        this.b = (StaggeredGridLayoutManager.this.u.f() + paramInt);
      }
    }
    
    void a(StaggeredGridLayoutManager.e[] paramArrayOfe)
    {
      int i = paramArrayOfe.length;
      int[] arrayOfInt = this.f;
      if ((arrayOfInt == null) || (arrayOfInt.length < i)) {
        this.f = new int[StaggeredGridLayoutManager.this.t.length];
      }
      for (int j = 0; j < i; j++) {
        this.f[j] = paramArrayOfe[j].b(Integer.MIN_VALUE);
      }
    }
    
    void b()
    {
      this.a = -1;
      this.b = Integer.MIN_VALUE;
      this.c = false;
      this.d = false;
      this.e = false;
      int[] arrayOfInt = this.f;
      if (arrayOfInt != null) {
        Arrays.fill(arrayOfInt, -1);
      }
    }
  }
  
  public static class b
    extends RecyclerView.j
  {
    StaggeredGridLayoutManager.e e;
    boolean f;
    
    public b(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public b(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public b(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public final int f()
    {
      StaggeredGridLayoutManager.e locale = this.e;
      if (locale == null) {
        return -1;
      }
      return locale.e;
    }
    
    public boolean g()
    {
      return this.f;
    }
  }
  
  static class c
  {
    int[] a;
    List<a> b;
    
    private void c(int paramInt1, int paramInt2)
    {
      Object localObject = this.b;
      if (localObject == null) {
        return;
      }
      for (int i = ((List)localObject).size() - 1; i >= 0; i--)
      {
        localObject = (a)this.b.get(i);
        int j = ((a)localObject).a;
        if (j >= paramInt1) {
          ((a)localObject).a = (j + paramInt2);
        }
      }
    }
    
    private void d(int paramInt1, int paramInt2)
    {
      Object localObject = this.b;
      if (localObject == null) {
        return;
      }
      for (int i = ((List)localObject).size() - 1; i >= 0; i--)
      {
        localObject = (a)this.b.get(i);
        int j = ((a)localObject).a;
        if (j >= paramInt1) {
          if (j < paramInt1 + paramInt2) {
            this.b.remove(i);
          } else {
            ((a)localObject).a = (j - paramInt2);
          }
        }
      }
    }
    
    private int g(int paramInt)
    {
      if (this.b == null) {
        return -1;
      }
      a locala = c(paramInt);
      if (locala != null) {
        this.b.remove(locala);
      }
      int i = this.b.size();
      for (int j = 0; j < i; j++) {
        if (((a)this.b.get(j)).a >= paramInt) {
          break label82;
        }
      }
      j = -1;
      label82:
      if (j != -1)
      {
        locala = (a)this.b.get(j);
        this.b.remove(j);
        return locala.a;
      }
      return -1;
    }
    
    public a a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    {
      Object localObject = this.b;
      if (localObject == null) {
        return null;
      }
      int i = ((List)localObject).size();
      for (int j = 0; j < i; j++)
      {
        localObject = (a)this.b.get(j);
        int k = ((a)localObject).a;
        if (k >= paramInt2) {
          return null;
        }
        if ((k >= paramInt1) && ((paramInt3 == 0) || (((a)localObject).b == paramInt3) || ((paramBoolean) && (((a)localObject).d)))) {
          return (a)localObject;
        }
      }
      return null;
    }
    
    void a()
    {
      int[] arrayOfInt = this.a;
      if (arrayOfInt != null) {
        Arrays.fill(arrayOfInt, -1);
      }
      this.b = null;
    }
    
    void a(int paramInt)
    {
      int[] arrayOfInt1 = this.a;
      if (arrayOfInt1 == null)
      {
        this.a = new int[Math.max(paramInt, 10) + 1];
        Arrays.fill(this.a, -1);
      }
      else if (paramInt >= arrayOfInt1.length)
      {
        this.a = new int[f(paramInt)];
        System.arraycopy(arrayOfInt1, 0, this.a, 0, arrayOfInt1.length);
        int[] arrayOfInt2 = this.a;
        Arrays.fill(arrayOfInt2, arrayOfInt1.length, arrayOfInt2.length, -1);
      }
    }
    
    void a(int paramInt1, int paramInt2)
    {
      int[] arrayOfInt = this.a;
      if ((arrayOfInt != null) && (paramInt1 < arrayOfInt.length))
      {
        int i = paramInt1 + paramInt2;
        a(i);
        arrayOfInt = this.a;
        System.arraycopy(arrayOfInt, paramInt1, arrayOfInt, i, arrayOfInt.length - paramInt1 - paramInt2);
        Arrays.fill(this.a, paramInt1, i, -1);
        c(paramInt1, paramInt2);
      }
    }
    
    void a(int paramInt, StaggeredGridLayoutManager.e parame)
    {
      a(paramInt);
      this.a[paramInt] = parame.e;
    }
    
    public void a(a parama)
    {
      if (this.b == null) {
        this.b = new ArrayList();
      }
      int i = this.b.size();
      for (int j = 0; j < i; j++)
      {
        a locala = (a)this.b.get(j);
        if (locala.a == parama.a) {
          this.b.remove(j);
        }
        if (locala.a >= parama.a)
        {
          this.b.add(j, parama);
          return;
        }
      }
      this.b.add(parama);
    }
    
    int b(int paramInt)
    {
      List localList = this.b;
      if (localList != null) {
        for (int i = localList.size() - 1; i >= 0; i--) {
          if (((a)this.b.get(i)).a >= paramInt) {
            this.b.remove(i);
          }
        }
      }
      return e(paramInt);
    }
    
    void b(int paramInt1, int paramInt2)
    {
      int[] arrayOfInt = this.a;
      if ((arrayOfInt != null) && (paramInt1 < arrayOfInt.length))
      {
        int i = paramInt1 + paramInt2;
        a(i);
        arrayOfInt = this.a;
        System.arraycopy(arrayOfInt, i, arrayOfInt, paramInt1, arrayOfInt.length - paramInt1 - paramInt2);
        arrayOfInt = this.a;
        Arrays.fill(arrayOfInt, arrayOfInt.length - paramInt2, arrayOfInt.length, -1);
        d(paramInt1, paramInt2);
      }
    }
    
    public a c(int paramInt)
    {
      Object localObject = this.b;
      if (localObject == null) {
        return null;
      }
      for (int i = ((List)localObject).size() - 1; i >= 0; i--)
      {
        localObject = (a)this.b.get(i);
        if (((a)localObject).a == paramInt) {
          return (a)localObject;
        }
      }
      return null;
    }
    
    int d(int paramInt)
    {
      int[] arrayOfInt = this.a;
      if ((arrayOfInt != null) && (paramInt < arrayOfInt.length)) {
        return arrayOfInt[paramInt];
      }
      return -1;
    }
    
    int e(int paramInt)
    {
      int[] arrayOfInt = this.a;
      if (arrayOfInt == null) {
        return -1;
      }
      if (paramInt >= arrayOfInt.length) {
        return -1;
      }
      int i = g(paramInt);
      if (i == -1)
      {
        arrayOfInt = this.a;
        Arrays.fill(arrayOfInt, paramInt, arrayOfInt.length, -1);
        return this.a.length;
      }
      arrayOfInt = this.a;
      i++;
      Arrays.fill(arrayOfInt, paramInt, i, -1);
      return i;
    }
    
    int f(int paramInt)
    {
      int i = this.a.length;
      while (i <= paramInt) {
        i *= 2;
      }
      return i;
    }
    
    static class a
      implements Parcelable
    {
      public static final Parcelable.Creator<a> CREATOR = new gb();
      int a;
      int b;
      int[] c;
      boolean d;
      
      a() {}
      
      a(Parcel paramParcel)
      {
        this.a = paramParcel.readInt();
        this.b = paramParcel.readInt();
        int i = paramParcel.readInt();
        boolean bool = true;
        if (i != 1) {
          bool = false;
        }
        this.d = bool;
        i = paramParcel.readInt();
        if (i > 0)
        {
          this.c = new int[i];
          paramParcel.readIntArray(this.c);
        }
      }
      
      int b(int paramInt)
      {
        int[] arrayOfInt = this.c;
        if (arrayOfInt == null) {
          paramInt = 0;
        } else {
          paramInt = arrayOfInt[paramInt];
        }
        return paramInt;
      }
      
      public int describeContents()
      {
        return 0;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("FullSpanItem{mPosition=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", mGapDir=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(", mHasUnwantedGapAfter=");
        localStringBuilder.append(this.d);
        localStringBuilder.append(", mGapPerSpan=");
        localStringBuilder.append(Arrays.toString(this.c));
        localStringBuilder.append('}');
        return localStringBuilder.toString();
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(this.a);
        paramParcel.writeInt(this.b);
        paramParcel.writeInt(this.d);
        int[] arrayOfInt = this.c;
        if ((arrayOfInt != null) && (arrayOfInt.length > 0))
        {
          paramParcel.writeInt(arrayOfInt.length);
          paramParcel.writeIntArray(this.c);
        }
        else
        {
          paramParcel.writeInt(0);
        }
      }
    }
  }
  
  public static class d
    implements Parcelable
  {
    public static final Parcelable.Creator<d> CREATOR = new hb();
    int a;
    int b;
    int c;
    int[] d;
    int e;
    int[] f;
    List<StaggeredGridLayoutManager.c.a> g;
    boolean h;
    boolean i;
    boolean j;
    
    public d() {}
    
    d(Parcel paramParcel)
    {
      this.a = paramParcel.readInt();
      this.b = paramParcel.readInt();
      this.c = paramParcel.readInt();
      int k = this.c;
      if (k > 0)
      {
        this.d = new int[k];
        paramParcel.readIntArray(this.d);
      }
      this.e = paramParcel.readInt();
      k = this.e;
      if (k > 0)
      {
        this.f = new int[k];
        paramParcel.readIntArray(this.f);
      }
      k = paramParcel.readInt();
      boolean bool1 = false;
      if (k == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      this.h = bool2;
      if (paramParcel.readInt() == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      this.i = bool2;
      boolean bool2 = bool1;
      if (paramParcel.readInt() == 1) {
        bool2 = true;
      }
      this.j = bool2;
      this.g = paramParcel.readArrayList(StaggeredGridLayoutManager.c.a.class.getClassLoader());
    }
    
    public d(d paramd)
    {
      this.c = paramd.c;
      this.a = paramd.a;
      this.b = paramd.b;
      this.d = paramd.d;
      this.e = paramd.e;
      this.f = paramd.f;
      this.h = paramd.h;
      this.i = paramd.i;
      this.j = paramd.j;
      this.g = paramd.g;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    void l()
    {
      this.d = null;
      this.c = 0;
      this.a = -1;
      this.b = -1;
    }
    
    void m()
    {
      this.d = null;
      this.c = 0;
      this.e = 0;
      this.f = null;
      this.g = null;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.a);
      paramParcel.writeInt(this.b);
      paramParcel.writeInt(this.c);
      if (this.c > 0) {
        paramParcel.writeIntArray(this.d);
      }
      paramParcel.writeInt(this.e);
      if (this.e > 0) {
        paramParcel.writeIntArray(this.f);
      }
      paramParcel.writeInt(this.h);
      paramParcel.writeInt(this.i);
      paramParcel.writeInt(this.j);
      paramParcel.writeList(this.g);
    }
  }
  
  class e
  {
    ArrayList<View> a = new ArrayList();
    int b = Integer.MIN_VALUE;
    int c = Integer.MIN_VALUE;
    int d = 0;
    final int e;
    
    e(int paramInt)
    {
      this.e = paramInt;
    }
    
    int a(int paramInt)
    {
      int i = this.c;
      if (i != Integer.MIN_VALUE) {
        return i;
      }
      if (this.a.size() == 0) {
        return paramInt;
      }
      a();
      return this.c;
    }
    
    int a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      return a(paramInt1, paramInt2, false, false, paramBoolean);
    }
    
    int a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      int i = StaggeredGridLayoutManager.this.u.f();
      int j = StaggeredGridLayoutManager.this.u.b();
      int k;
      if (paramInt2 > paramInt1) {
        k = 1;
      } else {
        k = -1;
      }
      while (paramInt1 != paramInt2)
      {
        View localView = (View)this.a.get(paramInt1);
        int m = StaggeredGridLayoutManager.this.u.d(localView);
        int n = StaggeredGridLayoutManager.this.u.a(localView);
        int i1 = 0;
        int i2;
        if (paramBoolean3 ? m <= j : m < j) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if (paramBoolean3 ? n >= i : n > i) {
          i1 = 1;
        }
        if ((i2 != 0) && (i1 != 0)) {
          if ((paramBoolean1) && (paramBoolean2))
          {
            if ((m >= i) && (n <= j)) {
              return StaggeredGridLayoutManager.this.l(localView);
            }
          }
          else
          {
            if (paramBoolean2) {
              return StaggeredGridLayoutManager.this.l(localView);
            }
            if ((m < i) || (n > j)) {
              return StaggeredGridLayoutManager.this.l(localView);
            }
          }
        }
        paramInt1 += k;
      }
      return -1;
    }
    
    public View a(int paramInt1, int paramInt2)
    {
      Object localObject1 = null;
      Object localObject2 = null;
      View localView;
      StaggeredGridLayoutManager localStaggeredGridLayoutManager;
      if (paramInt2 == -1)
      {
        int i = this.a.size();
        paramInt2 = 0;
        for (;;)
        {
          localObject1 = localObject2;
          if (paramInt2 >= i) {
            break;
          }
          localView = (View)this.a.get(paramInt2);
          localStaggeredGridLayoutManager = StaggeredGridLayoutManager.this;
          if (localStaggeredGridLayoutManager.z)
          {
            localObject1 = localObject2;
            if (localStaggeredGridLayoutManager.l(localView) <= paramInt1) {
              break;
            }
          }
          localObject1 = StaggeredGridLayoutManager.this;
          if ((!((StaggeredGridLayoutManager)localObject1).z) && (((RecyclerView.i)localObject1).l(localView) >= paramInt1))
          {
            localObject1 = localObject2;
            break;
          }
          localObject1 = localObject2;
          if (!localView.hasFocusable()) {
            break;
          }
          paramInt2++;
          localObject2 = localView;
        }
      }
      paramInt2 = this.a.size() - 1;
      for (localObject2 = localObject1;; localObject2 = localView)
      {
        localObject1 = localObject2;
        if (paramInt2 < 0) {
          break;
        }
        localView = (View)this.a.get(paramInt2);
        localStaggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        if (localStaggeredGridLayoutManager.z)
        {
          localObject1 = localObject2;
          if (localStaggeredGridLayoutManager.l(localView) >= paramInt1) {
            break;
          }
        }
        localObject1 = StaggeredGridLayoutManager.this;
        if ((!((StaggeredGridLayoutManager)localObject1).z) && (((RecyclerView.i)localObject1).l(localView) <= paramInt1))
        {
          localObject1 = localObject2;
          break;
        }
        localObject1 = localObject2;
        if (!localView.hasFocusable()) {
          break;
        }
        paramInt2--;
      }
      return (View)localObject1;
    }
    
    void a()
    {
      Object localObject = this.a;
      localObject = (View)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
      StaggeredGridLayoutManager.b localb = b((View)localObject);
      this.c = StaggeredGridLayoutManager.this.u.a((View)localObject);
      if (localb.f)
      {
        localObject = StaggeredGridLayoutManager.this.E.c(localb.b());
        if ((localObject != null) && (((StaggeredGridLayoutManager.c.a)localObject).b == 1)) {
          this.c += ((StaggeredGridLayoutManager.c.a)localObject).b(this.e);
        }
      }
    }
    
    void a(View paramView)
    {
      StaggeredGridLayoutManager.b localb = b(paramView);
      localb.e = this;
      this.a.add(paramView);
      this.c = Integer.MIN_VALUE;
      if (this.a.size() == 1) {
        this.b = Integer.MIN_VALUE;
      }
      if ((localb.d()) || (localb.c())) {
        this.d += StaggeredGridLayoutManager.this.u.b(paramView);
      }
    }
    
    void a(boolean paramBoolean, int paramInt)
    {
      int i;
      if (paramBoolean) {
        i = a(Integer.MIN_VALUE);
      } else {
        i = b(Integer.MIN_VALUE);
      }
      c();
      if (i == Integer.MIN_VALUE) {
        return;
      }
      if (((paramBoolean) && (i < StaggeredGridLayoutManager.this.u.b())) || ((!paramBoolean) && (i > StaggeredGridLayoutManager.this.u.f()))) {
        return;
      }
      int j = i;
      if (paramInt != Integer.MIN_VALUE) {
        j = i + paramInt;
      }
      this.c = j;
      this.b = j;
    }
    
    int b(int paramInt)
    {
      int i = this.b;
      if (i != Integer.MIN_VALUE) {
        return i;
      }
      if (this.a.size() == 0) {
        return paramInt;
      }
      b();
      return this.b;
    }
    
    StaggeredGridLayoutManager.b b(View paramView)
    {
      return (StaggeredGridLayoutManager.b)paramView.getLayoutParams();
    }
    
    void b()
    {
      View localView = (View)this.a.get(0);
      Object localObject = b(localView);
      this.b = StaggeredGridLayoutManager.this.u.d(localView);
      if (((StaggeredGridLayoutManager.b)localObject).f)
      {
        localObject = StaggeredGridLayoutManager.this.E.c(((RecyclerView.j)localObject).b());
        if ((localObject != null) && (((StaggeredGridLayoutManager.c.a)localObject).b == -1)) {
          this.b -= ((StaggeredGridLayoutManager.c.a)localObject).b(this.e);
        }
      }
    }
    
    void c()
    {
      this.a.clear();
      i();
      this.d = 0;
    }
    
    void c(int paramInt)
    {
      int i = this.b;
      if (i != Integer.MIN_VALUE) {
        this.b = (i + paramInt);
      }
      i = this.c;
      if (i != Integer.MIN_VALUE) {
        this.c = (i + paramInt);
      }
    }
    
    void c(View paramView)
    {
      StaggeredGridLayoutManager.b localb = b(paramView);
      localb.e = this;
      this.a.add(0, paramView);
      this.b = Integer.MIN_VALUE;
      if (this.a.size() == 1) {
        this.c = Integer.MIN_VALUE;
      }
      if ((localb.d()) || (localb.c())) {
        this.d += StaggeredGridLayoutManager.this.u.b(paramView);
      }
    }
    
    public int d()
    {
      int i;
      if (StaggeredGridLayoutManager.this.z) {
        i = a(this.a.size() - 1, -1, true);
      } else {
        i = a(0, this.a.size(), true);
      }
      return i;
    }
    
    void d(int paramInt)
    {
      this.b = paramInt;
      this.c = paramInt;
    }
    
    public int e()
    {
      int i;
      if (StaggeredGridLayoutManager.this.z) {
        i = a(0, this.a.size(), true);
      } else {
        i = a(this.a.size() - 1, -1, true);
      }
      return i;
    }
    
    public int f()
    {
      return this.d;
    }
    
    int g()
    {
      int i = this.c;
      if (i != Integer.MIN_VALUE) {
        return i;
      }
      a();
      return this.c;
    }
    
    int h()
    {
      int i = this.b;
      if (i != Integer.MIN_VALUE) {
        return i;
      }
      b();
      return this.b;
    }
    
    void i()
    {
      this.b = Integer.MIN_VALUE;
      this.c = Integer.MIN_VALUE;
    }
    
    void j()
    {
      int i = this.a.size();
      View localView = (View)this.a.remove(i - 1);
      StaggeredGridLayoutManager.b localb = b(localView);
      localb.e = null;
      if ((localb.d()) || (localb.c())) {
        this.d -= StaggeredGridLayoutManager.this.u.b(localView);
      }
      if (i == 1) {
        this.b = Integer.MIN_VALUE;
      }
      this.c = Integer.MIN_VALUE;
    }
    
    void k()
    {
      View localView = (View)this.a.remove(0);
      StaggeredGridLayoutManager.b localb = b(localView);
      localb.e = null;
      if (this.a.size() == 0) {
        this.c = Integer.MIN_VALUE;
      }
      if ((localb.d()) || (localb.c())) {
        this.d -= StaggeredGridLayoutManager.this.u.b(localView);
      }
      this.b = Integer.MIN_VALUE;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/StaggeredGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */