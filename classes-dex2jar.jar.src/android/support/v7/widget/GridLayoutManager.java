package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;
import zd;
import zd.c;

public class GridLayoutManager
  extends LinearLayoutManager
{
  boolean H = false;
  int I = -1;
  int[] J;
  View[] K;
  final SparseIntArray L = new SparseIntArray();
  final SparseIntArray M = new SparseIntArray();
  c N = new a();
  final Rect O = new Rect();
  
  public GridLayoutManager(Context paramContext, int paramInt)
  {
    super(paramContext);
    l(paramInt);
  }
  
  public GridLayoutManager(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, paramInt2, paramBoolean);
    l(paramInt1);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    l(RecyclerView.i.a(paramContext, paramAttributeSet, paramInt1, paramInt2).b);
  }
  
  private void N()
  {
    int i = e();
    for (int j = 0; j < i; j++)
    {
      b localb = (b)d(j).getLayoutParams();
      int k = localb.b();
      this.L.put(k, localb.g());
      this.M.put(k, localb.f());
    }
  }
  
  private void O()
  {
    this.L.clear();
    this.M.clear();
  }
  
  private void P()
  {
    View[] arrayOfView = this.K;
    if ((arrayOfView == null) || (arrayOfView.length != this.I)) {
      this.K = new View[this.I];
    }
  }
  
  private void Q()
  {
    int i;
    int j;
    if (H() == 1)
    {
      i = q() - o();
      j = n();
    }
    else
    {
      i = h() - m();
      j = p();
    }
    m(i - j);
  }
  
  private int a(RecyclerView.p paramp, RecyclerView.u paramu, int paramInt)
  {
    if (!paramu.d()) {
      return this.N.b(paramInt, this.I);
    }
    int i = paramp.a(paramInt);
    if (i == -1)
    {
      paramp = new StringBuilder();
      paramp.append("Cannot find span size for pre layout position. ");
      paramp.append(paramInt);
      Log.w("GridLayoutManager", paramp.toString());
      return 0;
    }
    return this.N.b(i, this.I);
  }
  
  private void a(float paramFloat, int paramInt)
  {
    m(Math.max(Math.round(paramFloat * this.I), paramInt));
  }
  
  private void a(RecyclerView.p paramp, RecyclerView.u paramu, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    paramInt2 = -1;
    int k;
    if (paramBoolean)
    {
      int j = 0;
      k = 1;
      paramInt2 = paramInt1;
      paramInt1 = j;
    }
    else
    {
      paramInt1--;
      k = -1;
    }
    while (paramInt1 != paramInt2)
    {
      View localView = this.K[paramInt1];
      b localb = (b)localView.getLayoutParams();
      localb.f = c(paramp, paramu, l(localView));
      localb.e = i;
      i += localb.f;
      paramInt1 += k;
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    RecyclerView.j localj = (RecyclerView.j)paramView.getLayoutParams();
    if (paramBoolean) {
      paramBoolean = b(paramView, paramInt1, paramInt2, localj);
    } else {
      paramBoolean = a(paramView, paramInt1, paramInt2, localj);
    }
    if (paramBoolean) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  static int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 1;
    int[] arrayOfInt;
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length == paramInt1 + 1))
    {
      arrayOfInt = paramArrayOfInt;
      if (paramArrayOfInt[(paramArrayOfInt.length - 1)] == paramInt2) {}
    }
    else
    {
      arrayOfInt = new int[paramInt1 + 1];
    }
    int j = 0;
    arrayOfInt[0] = 0;
    int k = paramInt2 / paramInt1;
    int m = paramInt2 % paramInt1;
    int n = 0;
    paramInt2 = j;
    while (i <= paramInt1)
    {
      paramInt2 += m;
      if ((paramInt2 > 0) && (paramInt1 - paramInt2 < m))
      {
        j = k + 1;
        paramInt2 -= paramInt1;
      }
      else
      {
        j = k;
      }
      n += j;
      arrayOfInt[i] = n;
      i++;
    }
    return arrayOfInt;
  }
  
  private int b(RecyclerView.p paramp, RecyclerView.u paramu, int paramInt)
  {
    if (!paramu.d()) {
      return this.N.a(paramInt, this.I);
    }
    int i = this.M.get(paramInt, -1);
    if (i != -1) {
      return i;
    }
    i = paramp.a(paramInt);
    if (i == -1)
    {
      paramp = new StringBuilder();
      paramp.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      paramp.append(paramInt);
      Log.w("GridLayoutManager", paramp.toString());
      return 0;
    }
    return this.N.a(i, this.I);
  }
  
  private void b(RecyclerView.p paramp, RecyclerView.u paramu, LinearLayoutManager.a parama, int paramInt)
  {
    if (paramInt == 1) {
      i = 1;
    } else {
      i = 0;
    }
    paramInt = b(paramp, paramu, parama.b);
    if (i != 0) {
      while (paramInt > 0)
      {
        paramInt = parama.b;
        if (paramInt <= 0) {
          break;
        }
        parama.b = (paramInt - 1);
        paramInt = b(paramp, paramu, parama.b);
      }
    }
    int j = paramu.a();
    int i = parama.b;
    while (i < j - 1)
    {
      int k = i + 1;
      int m = b(paramp, paramu, k);
      if (m <= paramInt) {
        break;
      }
      i = k;
      paramInt = m;
    }
    parama.b = i;
  }
  
  private void b(View paramView, int paramInt, boolean paramBoolean)
  {
    b localb = (b)paramView.getLayoutParams();
    Rect localRect = localb.b;
    int i = localRect.top + localRect.bottom + localb.topMargin + localb.bottomMargin;
    int j = localRect.left + localRect.right + localb.leftMargin + localb.rightMargin;
    int k = g(localb.e, localb.f);
    if (this.s == 1)
    {
      j = RecyclerView.i.a(k, paramInt, j, localb.width, false);
      paramInt = RecyclerView.i.a(this.u.g(), i(), i, localb.height, true);
    }
    else
    {
      paramInt = RecyclerView.i.a(k, paramInt, i, localb.height, false);
      j = RecyclerView.i.a(this.u.g(), r(), j, localb.width, true);
    }
    a(paramView, j, paramInt, paramBoolean);
  }
  
  private int c(RecyclerView.p paramp, RecyclerView.u paramu, int paramInt)
  {
    if (!paramu.d()) {
      return this.N.b(paramInt);
    }
    int i = this.L.get(paramInt, -1);
    if (i != -1) {
      return i;
    }
    i = paramp.a(paramInt);
    if (i == -1)
    {
      paramp = new StringBuilder();
      paramp.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      paramp.append(paramInt);
      Log.w("GridLayoutManager", paramp.toString());
      return 1;
    }
    return this.N.b(i);
  }
  
  private void m(int paramInt)
  {
    this.J = a(this.J, this.I, paramInt);
  }
  
  public boolean C()
  {
    boolean bool;
    if ((this.D == null) && (!this.H)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int K()
  {
    return this.I;
  }
  
  public int a(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
  {
    Q();
    P();
    return super.a(paramInt, paramp, paramu);
  }
  
  public int a(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (this.s == 1) {
      return this.I;
    }
    if (paramu.a() < 1) {
      return 0;
    }
    return a(paramp, paramu, paramu.a() - 1) + 1;
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
    Object localObject1 = null;
    Object localObject4;
    for (Object localObject2 = null; paramInt1 != paramInt2; localObject2 = localObject4)
    {
      View localView = d(paramInt1);
      int m = l(localView);
      Object localObject3 = localObject1;
      localObject4 = localObject2;
      if (m >= 0)
      {
        localObject3 = localObject1;
        localObject4 = localObject2;
        if (m < paramInt3) {
          if (b(paramp, paramu, m) != 0)
          {
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
          else if (((RecyclerView.j)localView.getLayoutParams()).d())
          {
            localObject3 = localObject1;
            localObject4 = localObject2;
            if (localObject2 == null)
            {
              localObject4 = localView;
              localObject3 = localObject1;
            }
          }
          else
          {
            if ((this.u.d(localView) < j) && (this.u.a(localView) >= i)) {
              return localView;
            }
            localObject3 = localObject1;
            localObject4 = localObject2;
            if (localObject1 == null)
            {
              localObject3 = localView;
              localObject4 = localObject2;
            }
          }
        }
      }
      paramInt1 += k;
      localObject1 = localObject3;
    }
    if (localObject1 == null) {
      localObject1 = localObject2;
    }
    return (View)localObject1;
  }
  
  public View a(View paramView, int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
  {
    View localView = c(paramView);
    Object localObject1 = null;
    if (localView == null) {
      return null;
    }
    Object localObject2 = (b)localView.getLayoutParams();
    int i = ((b)localObject2).e;
    int j = ((b)localObject2).f + i;
    if (super.a(paramView, paramInt, paramp, paramu) == null) {
      return null;
    }
    int k;
    if (j(paramInt) == 1) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != this.x) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    int m;
    int i1;
    if (paramInt != 0)
    {
      m = e() - 1;
      n = -1;
      i1 = -1;
    }
    else
    {
      n = e();
      m = 0;
      i1 = 1;
    }
    int i2;
    if ((this.s == 1) && (I())) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    int i3 = a(paramp, paramu, m);
    paramView = null;
    int i4 = -1;
    int i5 = 0;
    paramInt = 0;
    int i6 = -1;
    int i7 = n;
    int n = i4;
    i4 = m;
    while (i4 != i7)
    {
      m = a(paramp, paramu, i4);
      localObject2 = d(i4);
      if (localObject2 == localView) {
        break;
      }
      if ((((View)localObject2).hasFocusable()) && (m != i3))
      {
        if (localObject1 != null) {
          break;
        }
      }
      else
      {
        b localb = (b)((View)localObject2).getLayoutParams();
        int i8 = localb.e;
        int i9 = localb.f + i8;
        if ((((View)localObject2).hasFocusable()) && (i8 == i) && (i9 == j)) {
          return (View)localObject2;
        }
        if (((((View)localObject2).hasFocusable()) && (localObject1 == null)) || ((!((View)localObject2).hasFocusable()) && (paramView == null))) {}
        do
        {
          int i10;
          do
          {
            m = 1;
            break label474;
            m = Math.max(i8, i);
            i10 = Math.min(i9, j) - m;
            if (!((View)localObject2).hasFocusable()) {
              break;
            }
          } while (i10 > i5);
          while (i10 == i5)
          {
            if (i8 > n) {
              m = 1;
            } else {
              m = 0;
            }
            if (i2 != m) {
              break;
            }
          }
          if (localObject1 != null) {
            break;
          }
          int i11 = 1;
          m = 1;
          if (!a((View)localObject2, false, true)) {
            break;
          }
          int i12 = paramInt;
          if (i10 > i12)
          {
            m = i11;
            break label474;
          }
          if (i10 != i12) {
            break;
          }
          if (i8 <= i6) {
            m = 0;
          }
        } while (i2 == m);
        m = 0;
        label474:
        if (m != 0) {
          if (((View)localObject2).hasFocusable())
          {
            n = localb.e;
            i5 = Math.min(i9, j) - Math.max(i8, i);
            localObject1 = localObject2;
          }
          else
          {
            i6 = localb.e;
            paramInt = Math.min(i9, j);
            m = Math.max(i8, i);
            paramView = (View)localObject2;
            paramInt -= m;
          }
        }
      }
      i4 += i1;
    }
    if (localObject1 != null) {
      paramView = (View)localObject1;
    }
    return paramView;
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    if (this.J == null) {
      super.a(paramRect, paramInt1, paramInt2);
    }
    int i = n() + o();
    int j = p() + m();
    if (this.s == 1)
    {
      paramInt2 = RecyclerView.i.a(paramInt2, paramRect.height() + j, k());
      paramRect = this.J;
      paramInt1 = RecyclerView.i.a(paramInt1, paramRect[(paramRect.length - 1)] + i, l());
    }
    else
    {
      paramInt1 = RecyclerView.i.a(paramInt1, paramRect.width() + i, l());
      paramRect = this.J;
      paramInt2 = RecyclerView.i.a(paramInt2, paramRect[(paramRect.length - 1)] + j, k());
    }
    c(paramInt1, paramInt2);
  }
  
  public void a(c paramc)
  {
    this.N = paramc;
  }
  
  void a(RecyclerView.p paramp, RecyclerView.u paramu, LinearLayoutManager.a parama, int paramInt)
  {
    super.a(paramp, paramu, parama, paramInt);
    Q();
    if ((paramu.a() > 0) && (!paramu.d())) {
      b(paramp, paramu, parama, paramInt);
    }
    P();
  }
  
  void a(RecyclerView.p paramp, RecyclerView.u paramu, LinearLayoutManager.c paramc, LinearLayoutManager.b paramb)
  {
    int i = this.u.e();
    int j;
    if (i != 1073741824) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if (e() > 0) {
      k = this.J[this.I];
    } else {
      k = 0;
    }
    if (j != 0) {
      Q();
    }
    boolean bool;
    if (paramc.e == 1) {
      bool = true;
    } else {
      bool = false;
    }
    int m = this.I;
    if (!bool) {
      m = b(paramp, paramu, paramc.d) + c(paramp, paramu, paramc.d);
    }
    int n = 0;
    int i1 = 0;
    int i2;
    Object localObject;
    while ((i1 < this.I) && (paramc.a(paramu)) && (m > 0))
    {
      i2 = paramc.d;
      i3 = c(paramp, paramu, i2);
      if (i3 <= this.I)
      {
        m -= i3;
        if (m >= 0)
        {
          localObject = paramc.a(paramp);
          if (localObject != null)
          {
            n += i3;
            this.K[i1] = localObject;
            i1++;
          }
        }
      }
      else
      {
        paramp = new StringBuilder();
        paramp.append("Item at position ");
        paramp.append(i2);
        paramp.append(" requires ");
        paramp.append(i3);
        paramp.append(" spans but GridLayoutManager has only ");
        paramp.append(this.I);
        paramp.append(" spans.");
        throw new IllegalArgumentException(paramp.toString());
      }
    }
    if (i1 == 0)
    {
      paramb.b = true;
      return;
    }
    float f1 = 0.0F;
    a(paramp, paramu, i1, n, bool);
    n = 0;
    m = 0;
    while (n < i1)
    {
      paramp = this.K[n];
      if (paramc.k == null)
      {
        if (bool) {
          b(paramp);
        } else {
          b(paramp, 0);
        }
      }
      else if (bool) {
        a(paramp);
      } else {
        a(paramp, 0);
      }
      a(paramp, this.O);
      b(paramp, i, false);
      i2 = this.u.b(paramp);
      i3 = m;
      if (i2 > m) {
        i3 = i2;
      }
      paramu = (b)paramp.getLayoutParams();
      float f2 = this.u.c(paramp) * 1.0F / paramu.f;
      float f3 = f1;
      if (f2 > f1) {
        f3 = f2;
      }
      n++;
      m = i3;
      f1 = f3;
    }
    n = m;
    if (j != 0)
    {
      a(f1, k);
      j = 0;
      for (m = 0;; m = n)
      {
        n = m;
        if (j >= i1) {
          break;
        }
        paramp = this.K[j];
        b(paramp, 1073741824, true);
        k = this.u.b(paramp);
        n = m;
        if (k > m) {
          n = k;
        }
        j++;
      }
    }
    for (m = 0; m < i1; m++)
    {
      paramp = this.K[m];
      if (this.u.b(paramp) != n)
      {
        localObject = (b)paramp.getLayoutParams();
        paramu = ((RecyclerView.j)localObject).b;
        j = paramu.top + paramu.bottom + ((ViewGroup.MarginLayoutParams)localObject).topMargin + ((ViewGroup.MarginLayoutParams)localObject).bottomMargin;
        k = paramu.left + paramu.right + ((ViewGroup.MarginLayoutParams)localObject).leftMargin + ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
        i3 = g(((b)localObject).e, ((b)localObject).f);
        if (this.s == 1)
        {
          k = RecyclerView.i.a(i3, 1073741824, k, ((ViewGroup.MarginLayoutParams)localObject).width, false);
          j = View.MeasureSpec.makeMeasureSpec(n - j, 1073741824);
        }
        else
        {
          k = View.MeasureSpec.makeMeasureSpec(n - k, 1073741824);
          j = RecyclerView.i.a(i3, 1073741824, j, ((ViewGroup.MarginLayoutParams)localObject).height, false);
        }
        a(paramp, k, j, true);
      }
    }
    int i3 = 0;
    paramb.a = n;
    if (this.s == 1)
    {
      if (paramc.f == -1)
      {
        m = paramc.b;
        j = m;
        m -= n;
        n = j;
      }
      else
      {
        j = paramc.b;
        m = j;
        n += j;
      }
      j = 0;
      k = 0;
    }
    else if (paramc.f == -1)
    {
      j = paramc.b;
      m = 0;
      i2 = 0;
      k = j;
      j -= n;
      n = i2;
    }
    else
    {
      j = paramc.b;
      k = n + j;
      m = 0;
      n = 0;
    }
    while (i3 < i1)
    {
      paramu = this.K[i3];
      paramp = (b)paramu.getLayoutParams();
      if (this.s == 1)
      {
        if (I())
        {
          k = n() + this.J[(this.I - paramp.e)];
          i2 = this.u.c(paramu);
          j = k;
          k -= i2;
          break label1060;
        }
        j = n() + this.J[paramp.e];
        k = this.u.c(paramu) + j;
      }
      else
      {
        m = p() + this.J[paramp.e];
        n = this.u.c(paramu) + m;
      }
      i2 = j;
      j = k;
      k = i2;
      label1060:
      a(paramu, k, m, j, n);
      if ((paramp.d()) || (paramp.c())) {
        paramb.c = true;
      }
      paramb.d |= paramu.hasFocusable();
      i2 = i3 + 1;
      i3 = j;
      j = k;
      k = i3;
      i3 = i2;
    }
    Arrays.fill(this.K, null);
  }
  
  public void a(RecyclerView.p paramp, RecyclerView.u paramu, View paramView, zd paramzd)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof b))
    {
      super.a(paramView, paramzd);
      return;
    }
    paramView = (b)localLayoutParams;
    int i = a(paramp, paramu, paramView.b());
    int j;
    int k;
    boolean bool;
    if (this.s == 0)
    {
      j = paramView.f();
      k = paramView.g();
      if ((this.I > 1) && (paramView.g() == this.I)) {
        bool = true;
      } else {
        bool = false;
      }
      paramzd.b(zd.c.a(j, k, i, 1, bool, false));
    }
    else
    {
      k = paramView.f();
      j = paramView.g();
      if ((this.I > 1) && (paramView.g() == this.I)) {
        bool = true;
      } else {
        bool = false;
      }
      paramzd.b(zd.c.a(i, 1, k, j, bool, false));
    }
  }
  
  void a(RecyclerView.u paramu, LinearLayoutManager.c paramc, RecyclerView.i.a parama)
  {
    int i = this.I;
    for (int j = 0; (j < this.I) && (paramc.a(paramu)) && (i > 0); j++)
    {
      int k = paramc.d;
      parama.a(k, Math.max(0, paramc.g));
      i -= this.N.b(k);
      paramc.d += paramc.e;
    }
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.N.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.N.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    this.N.a();
  }
  
  public boolean a(RecyclerView.j paramj)
  {
    return paramj instanceof b;
  }
  
  public int b(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
  {
    Q();
    P();
    return super.b(paramInt, paramp, paramu);
  }
  
  public int b(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (this.s == 0) {
      return this.I;
    }
    if (paramu.a() < 1) {
      return 0;
    }
    return a(paramp, paramu, paramu.a() - 1) + 1;
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.N.a();
  }
  
  public void b(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      super.b(false);
      return;
    }
    throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
  }
  
  public RecyclerView.j c()
  {
    if (this.s == 0) {
      return new b(-2, -1);
    }
    return new b(-1, -2);
  }
  
  public void d(RecyclerView paramRecyclerView)
  {
    this.N.a();
  }
  
  public void e(RecyclerView.p paramp, RecyclerView.u paramu)
  {
    if (paramu.d()) {
      N();
    }
    super.e(paramp, paramu);
    O();
  }
  
  int g(int paramInt1, int paramInt2)
  {
    if ((this.s == 1) && (I()))
    {
      arrayOfInt = this.J;
      int i = this.I;
      return arrayOfInt[(i - paramInt1)] - arrayOfInt[(i - paramInt1 - paramInt2)];
    }
    int[] arrayOfInt = this.J;
    return arrayOfInt[(paramInt2 + paramInt1)] - arrayOfInt[paramInt1];
  }
  
  public void g(RecyclerView.u paramu)
  {
    super.g(paramu);
    this.H = false;
  }
  
  public void l(int paramInt)
  {
    if (paramInt == this.I) {
      return;
    }
    this.H = true;
    if (paramInt >= 1)
    {
      this.I = paramInt;
      this.N.a();
      y();
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Span count should be at least 1. Provided ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static final class a
    extends GridLayoutManager.c
  {
    public int b(int paramInt)
    {
      return 1;
    }
    
    public int c(int paramInt1, int paramInt2)
    {
      return paramInt1 % paramInt2;
    }
  }
  
  public static class b
    extends RecyclerView.j
  {
    int e = -1;
    int f = 0;
    
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
    
    public int f()
    {
      return this.e;
    }
    
    public int g()
    {
      return this.f;
    }
  }
  
  public static abstract class c
  {
    final SparseIntArray a = new SparseIntArray();
    private boolean b = false;
    
    int a(int paramInt)
    {
      int i = this.a.size() - 1;
      int j = 0;
      while (j <= i)
      {
        int k = j + i >>> 1;
        if (this.a.keyAt(k) < paramInt) {
          j = k + 1;
        } else {
          i = k - 1;
        }
      }
      paramInt = j - 1;
      if ((paramInt >= 0) && (paramInt < this.a.size())) {
        return this.a.keyAt(paramInt);
      }
      return -1;
    }
    
    int a(int paramInt1, int paramInt2)
    {
      if (!this.b) {
        return c(paramInt1, paramInt2);
      }
      int i = this.a.get(paramInt1, -1);
      if (i != -1) {
        return i;
      }
      paramInt2 = c(paramInt1, paramInt2);
      this.a.put(paramInt1, paramInt2);
      return paramInt2;
    }
    
    public void a()
    {
      this.a.clear();
    }
    
    public abstract int b(int paramInt);
    
    public int b(int paramInt1, int paramInt2)
    {
      int i = b(paramInt1);
      int j = 0;
      int k = 0;
      int i2;
      for (int m = 0; j < paramInt1; m = i2)
      {
        int n = b(j);
        int i1 = k + n;
        if (i1 == paramInt2)
        {
          i2 = m + 1;
          k = 0;
        }
        else
        {
          k = i1;
          i2 = m;
          if (i1 > paramInt2)
          {
            i2 = m + 1;
            k = n;
          }
        }
        j++;
      }
      paramInt1 = m;
      if (k + i > paramInt2) {
        paramInt1 = m + 1;
      }
      return paramInt1;
    }
    
    public int c(int paramInt1, int paramInt2)
    {
      int i = b(paramInt1);
      if (i == paramInt2) {
        return 0;
      }
      int j;
      if ((this.b) && (this.a.size() > 0))
      {
        j = a(paramInt1);
        if (j >= 0)
        {
          k = this.a.get(j) + b(j);
          break label128;
        }
      }
      int m = 0;
      int k = 0;
      while (m < paramInt1)
      {
        int n = b(m);
        int i1 = k + n;
        if (i1 == paramInt2)
        {
          k = 0;
          j = m;
        }
        else
        {
          j = m;
          k = i1;
          if (i1 > paramInt2)
          {
            k = n;
            j = m;
          }
        }
        label128:
        m = j + 1;
      }
      if (i + k <= paramInt2) {
        return k;
      }
      return 0;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/GridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */