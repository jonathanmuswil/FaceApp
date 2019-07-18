package android.support.v7.widget;

import Pc;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class na
  implements Runnable
{
  static final ThreadLocal<na> a = new ThreadLocal();
  static Comparator<b> b = new ma();
  ArrayList<RecyclerView> c = new ArrayList();
  long d;
  long e;
  private ArrayList<b> f = new ArrayList();
  
  private RecyclerView.x a(RecyclerView paramRecyclerView, int paramInt, long paramLong)
  {
    if (a(paramRecyclerView, paramInt)) {
      return null;
    }
    RecyclerView.p localp = paramRecyclerView.l;
    try
    {
      paramRecyclerView.r();
      RecyclerView.x localx = localp.a(paramInt, false, paramLong);
      if (localx != null) {
        if ((localx.m()) && (!localx.n())) {
          localp.b(localx.b);
        } else {
          localp.a(localx, false);
        }
      }
      return localx;
    }
    finally
    {
      paramRecyclerView.a(false);
    }
  }
  
  private void a()
  {
    int i = this.c.size();
    int j = 0;
    Object localObject;
    for (int k = 0; j < i; k = m)
    {
      localObject = (RecyclerView)this.c.get(j);
      m = k;
      if (((ViewGroup)localObject).getWindowVisibility() == 0)
      {
        ((RecyclerView)localObject).qa.a((RecyclerView)localObject, false);
        m = k + ((RecyclerView)localObject).qa.d;
      }
      j++;
    }
    this.f.ensureCapacity(k);
    k = 0;
    int m = 0;
    while (k < i)
    {
      RecyclerView localRecyclerView = (RecyclerView)this.c.get(k);
      if (localRecyclerView.getWindowVisibility() == 0)
      {
        a locala = localRecyclerView.qa;
        int n = Math.abs(locala.a) + Math.abs(locala.b);
        for (j = 0; j < locala.d * 2; j += 2)
        {
          if (m >= this.f.size())
          {
            localObject = new b();
            this.f.add(localObject);
          }
          else
          {
            localObject = (b)this.f.get(m);
          }
          int i1 = locala.c[(j + 1)];
          boolean bool;
          if (i1 <= n) {
            bool = true;
          } else {
            bool = false;
          }
          ((b)localObject).a = bool;
          ((b)localObject).b = n;
          ((b)localObject).c = i1;
          ((b)localObject).d = localRecyclerView;
          ((b)localObject).e = locala.c[j];
          m++;
        }
      }
      k++;
    }
    Collections.sort(this.f, b);
  }
  
  private void a(RecyclerView paramRecyclerView, long paramLong)
  {
    if (paramRecyclerView == null) {
      return;
    }
    if ((paramRecyclerView.N) && (paramRecyclerView.o.b() != 0)) {
      paramRecyclerView.u();
    }
    a locala = paramRecyclerView.qa;
    locala.a(paramRecyclerView, true);
    if (locala.d != 0) {
      try
      {
        Pc.a("RV Nested Prefetch");
        paramRecyclerView.ra.a(paramRecyclerView.v);
        for (int i = 0; i < locala.d * 2; i += 2) {
          a(paramRecyclerView, locala.c[i], paramLong);
        }
      }
      finally
      {
        Pc.a();
      }
    }
  }
  
  private void a(b paramb, long paramLong)
  {
    long l;
    if (paramb.a) {
      l = Long.MAX_VALUE;
    } else {
      l = paramLong;
    }
    paramb = a(paramb.d, paramb.e, l);
    if ((paramb != null) && (paramb.c != null) && (paramb.m()) && (!paramb.n())) {
      a((RecyclerView)paramb.c.get(), paramLong);
    }
  }
  
  static boolean a(RecyclerView paramRecyclerView, int paramInt)
  {
    int i = paramRecyclerView.o.b();
    for (int j = 0; j < i; j++)
    {
      RecyclerView.x localx = RecyclerView.i(paramRecyclerView.o.d(j));
      if ((localx.d == paramInt) && (!localx.n())) {
        return true;
      }
    }
    return false;
  }
  
  private void b(long paramLong)
  {
    for (int i = 0; i < this.f.size(); i++)
    {
      b localb = (b)this.f.get(i);
      if (localb.d == null) {
        break;
      }
      a(localb, paramLong);
      localb.a();
    }
  }
  
  void a(long paramLong)
  {
    a();
    b(paramLong);
  }
  
  public void a(RecyclerView paramRecyclerView)
  {
    this.c.add(paramRecyclerView);
  }
  
  void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if ((paramRecyclerView.isAttachedToWindow()) && (this.d == 0L))
    {
      this.d = paramRecyclerView.getNanoTime();
      paramRecyclerView.post(this);
    }
    paramRecyclerView.qa.b(paramInt1, paramInt2);
  }
  
  public void b(RecyclerView paramRecyclerView)
  {
    this.c.remove(paramRecyclerView);
  }
  
  public void run()
  {
    try
    {
      Pc.a("RV Prefetch");
      boolean bool = this.c.isEmpty();
      if (bool) {}
      long l1;
      do
      {
        return;
        int i = this.c.size();
        int j = 0;
        long l2;
        for (l1 = 0L; j < i; l1 = l2)
        {
          RecyclerView localRecyclerView = (RecyclerView)this.c.get(j);
          l2 = l1;
          if (localRecyclerView.getWindowVisibility() == 0) {
            l2 = Math.max(localRecyclerView.getDrawingTime(), l1);
          }
          j++;
        }
      } while (l1 == 0L);
      a(TimeUnit.MILLISECONDS.toNanos(l1) + this.e);
      return;
    }
    finally
    {
      this.d = 0L;
      Pc.a();
    }
  }
  
  static class a
    implements RecyclerView.i.a
  {
    int a;
    int b;
    int[] c;
    int d;
    
    void a()
    {
      int[] arrayOfInt = this.c;
      if (arrayOfInt != null) {
        Arrays.fill(arrayOfInt, -1);
      }
      this.d = 0;
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 >= 0)
        {
          int i = this.d * 2;
          int[] arrayOfInt = this.c;
          if (arrayOfInt == null)
          {
            this.c = new int[4];
            Arrays.fill(this.c, -1);
          }
          else if (i >= arrayOfInt.length)
          {
            this.c = new int[i * 2];
            System.arraycopy(arrayOfInt, 0, this.c, 0, arrayOfInt.length);
          }
          arrayOfInt = this.c;
          arrayOfInt[i] = paramInt1;
          arrayOfInt[(i + 1)] = paramInt2;
          this.d += 1;
          return;
        }
        throw new IllegalArgumentException("Pixel distance must be non-negative");
      }
      throw new IllegalArgumentException("Layout positions must be non-negative");
    }
    
    void a(RecyclerView paramRecyclerView, boolean paramBoolean)
    {
      this.d = 0;
      Object localObject = this.c;
      if (localObject != null) {
        Arrays.fill((int[])localObject, -1);
      }
      localObject = paramRecyclerView.w;
      if ((paramRecyclerView.v != null) && (localObject != null) && (((RecyclerView.i)localObject).v()))
      {
        if (paramBoolean)
        {
          if (!paramRecyclerView.n.c()) {
            ((RecyclerView.i)localObject).a(paramRecyclerView.v.a(), this);
          }
        }
        else if (!paramRecyclerView.k()) {
          ((RecyclerView.i)localObject).a(this.a, this.b, paramRecyclerView.ra, this);
        }
        int i = this.d;
        if (i > ((RecyclerView.i)localObject).m)
        {
          ((RecyclerView.i)localObject).m = i;
          ((RecyclerView.i)localObject).n = paramBoolean;
          paramRecyclerView.l.j();
        }
      }
    }
    
    boolean a(int paramInt)
    {
      if (this.c != null)
      {
        int i = this.d;
        for (int j = 0; j < i * 2; j += 2) {
          if (this.c[j] == paramInt) {
            return true;
          }
        }
      }
      return false;
    }
    
    void b(int paramInt1, int paramInt2)
    {
      this.a = paramInt1;
      this.b = paramInt2;
    }
  }
  
  static class b
  {
    public boolean a;
    public int b;
    public int c;
    public RecyclerView d;
    public int e;
    
    public void a()
    {
      this.a = false;
      this.b = 0;
      this.c = 0;
      this.d = null;
      this.e = 0;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/na.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */