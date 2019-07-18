package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;
import qd;
import rd;

class i
  implements ya.a
{
  private qd<b> a = new rd(30);
  final ArrayList<b> b = new ArrayList();
  final ArrayList<b> c = new ArrayList();
  final a d;
  Runnable e;
  final boolean f;
  final ya g;
  private int h = 0;
  
  i(a parama)
  {
    this(parama, false);
  }
  
  i(a parama, boolean paramBoolean)
  {
    this.d = parama;
    this.f = paramBoolean;
    this.g = new ya(this);
  }
  
  private void b(b paramb)
  {
    g(paramb);
  }
  
  private void c(b paramb)
  {
    g(paramb);
  }
  
  private int d(int paramInt1, int paramInt2)
  {
    int i = this.c.size() - 1;
    b localb;
    for (int j = paramInt1; i >= 0; j = paramInt1)
    {
      localb = (b)this.c.get(i);
      int k = localb.a;
      int m;
      if (k == 8)
      {
        k = localb.b;
        paramInt1 = localb.d;
        if (k >= paramInt1)
        {
          m = paramInt1;
          paramInt1 = k;
          k = m;
        }
        if ((j >= k) && (j <= paramInt1))
        {
          paramInt1 = localb.b;
          if (k == paramInt1)
          {
            if (paramInt2 == 1) {
              localb.d += 1;
            } else if (paramInt2 == 2) {
              localb.d -= 1;
            }
            paramInt1 = j + 1;
          }
          else
          {
            if (paramInt2 == 1) {
              localb.b = (paramInt1 + 1);
            } else if (paramInt2 == 2) {
              localb.b = (paramInt1 - 1);
            }
            paramInt1 = j - 1;
          }
        }
        else
        {
          k = localb.b;
          paramInt1 = j;
          if (j < k) {
            if (paramInt2 == 1)
            {
              localb.b = (k + 1);
              localb.d += 1;
              paramInt1 = j;
            }
            else
            {
              paramInt1 = j;
              if (paramInt2 == 2)
              {
                localb.b = (k - 1);
                localb.d -= 1;
                paramInt1 = j;
              }
            }
          }
        }
      }
      else
      {
        m = localb.b;
        if (m <= j)
        {
          if (k == 1)
          {
            paramInt1 = j - localb.d;
          }
          else
          {
            paramInt1 = j;
            if (k == 2) {
              paramInt1 = j + localb.d;
            }
          }
        }
        else if (paramInt2 == 1)
        {
          localb.b = (m + 1);
          paramInt1 = j;
        }
        else
        {
          paramInt1 = j;
          if (paramInt2 == 2)
          {
            localb.b = (m - 1);
            paramInt1 = j;
          }
        }
      }
      i--;
    }
    for (paramInt1 = this.c.size() - 1; paramInt1 >= 0; paramInt1--)
    {
      localb = (b)this.c.get(paramInt1);
      if (localb.a == 8)
      {
        paramInt2 = localb.d;
        if ((paramInt2 == localb.b) || (paramInt2 < 0))
        {
          this.c.remove(paramInt1);
          a(localb);
        }
      }
      else if (localb.d <= 0)
      {
        this.c.remove(paramInt1);
        a(localb);
      }
    }
    return j;
  }
  
  private void d(b paramb)
  {
    int i = paramb.b;
    int j = paramb.d + i;
    int k = 0;
    int m = -1;
    int n = i;
    while (n < j)
    {
      int i2;
      if ((this.d.a(n) == null) && (!d(n)))
      {
        if (m == 1)
        {
          g(a(2, i, k, null));
          m = 1;
        }
        else
        {
          m = 0;
        }
        int i1 = 0;
        i2 = m;
        m = i1;
      }
      else
      {
        if (m == 0)
        {
          f(a(2, i, k, null));
          i2 = 1;
        }
        else
        {
          i2 = 0;
        }
        m = 1;
      }
      if (i2 != 0)
      {
        n -= k;
        j -= k;
        i2 = 1;
      }
      else
      {
        i2 = k + 1;
      }
      n++;
      k = i2;
    }
    b localb = paramb;
    if (k != paramb.d)
    {
      a(paramb);
      localb = a(2, i, k, null);
    }
    if (m == 0) {
      f(localb);
    } else {
      g(localb);
    }
  }
  
  private boolean d(int paramInt)
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      b localb = (b)this.c.get(j);
      int k = localb.a;
      if (k == 8)
      {
        if (a(localb.d, j + 1) == paramInt) {
          return true;
        }
      }
      else if (k == 1)
      {
        int m = localb.b;
        int n = localb.d;
        for (k = m; k < n + m; k++) {
          if (a(k, j + 1) == paramInt) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private void e(b paramb)
  {
    int i = paramb.b;
    int j = paramb.d;
    int k = i;
    int m = 0;
    int n = -1;
    int i1 = i;
    while (i1 < j + i)
    {
      int i2;
      int i3;
      if ((this.d.a(i1) == null) && (!d(i1)))
      {
        i2 = m;
        i3 = k;
        if (n == 1)
        {
          g(a(4, k, m, paramb.c));
          i3 = i1;
          i2 = 0;
        }
        m = 0;
        k = i3;
        i3 = m;
      }
      else
      {
        i2 = m;
        int i4 = k;
        if (n == 0)
        {
          f(a(4, k, m, paramb.c));
          i4 = i1;
          i2 = 0;
        }
        i3 = 1;
        k = i4;
      }
      m = i2 + 1;
      i1++;
      n = i3;
    }
    Object localObject = paramb;
    if (m != paramb.d)
    {
      localObject = paramb.c;
      a(paramb);
      localObject = a(4, k, m, localObject);
    }
    if (n == 0) {
      f((b)localObject);
    } else {
      g((b)localObject);
    }
  }
  
  private void f(b paramb)
  {
    int i = paramb.a;
    if ((i != 1) && (i != 8))
    {
      int j = d(paramb.b, i);
      i = paramb.b;
      int k = paramb.a;
      int m;
      if (k != 2)
      {
        if (k == 4)
        {
          m = 1;
        }
        else
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("op should be remove or update.");
          ((StringBuilder)localObject).append(paramb);
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      else {
        m = 0;
      }
      int n = 1;
      for (int i1 = 1; n < paramb.d; i1 = k)
      {
        int i2 = d(paramb.b + m * n, paramb.a);
        k = paramb.a;
        if (k != 2)
        {
          if (k != 4) {}
          while (i2 != j + 1)
          {
            k = 0;
            break;
          }
        }
        for (;;)
        {
          k = 1;
          break label177;
          if (i2 != j) {
            break;
          }
        }
        label177:
        if (k != 0)
        {
          k = i1 + 1;
        }
        else
        {
          localObject = a(paramb.a, j, i1, paramb.c);
          a((b)localObject, i);
          a((b)localObject);
          k = i;
          if (paramb.a == 4) {
            k = i + i1;
          }
          j = i2;
          i1 = 1;
          i = k;
          k = i1;
        }
        n++;
      }
      Object localObject = paramb.c;
      a(paramb);
      if (i1 > 0)
      {
        paramb = a(paramb.a, j, i1, localObject);
        a(paramb, i);
        a(paramb);
      }
      return;
    }
    throw new IllegalArgumentException("should not dispatch add or move for pre layout");
  }
  
  private void g(b paramb)
  {
    this.c.add(paramb);
    int i = paramb.a;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 4)
        {
          if (i == 8)
          {
            this.d.a(paramb.b, paramb.d);
          }
          else
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Unknown update op type for ");
            localStringBuilder.append(paramb);
            throw new IllegalArgumentException(localStringBuilder.toString());
          }
        }
        else {
          this.d.a(paramb.b, paramb.d, paramb.c);
        }
      }
      else {
        this.d.b(paramb.b, paramb.d);
      }
    }
    else {
      this.d.c(paramb.b, paramb.d);
    }
  }
  
  public int a(int paramInt)
  {
    int i = this.b.size();
    int j = 0;
    for (int k = paramInt; j < i; k = paramInt)
    {
      b localb = (b)this.b.get(j);
      paramInt = localb.a;
      if (paramInt != 1)
      {
        int m;
        if (paramInt != 2)
        {
          if (paramInt != 8)
          {
            paramInt = k;
          }
          else
          {
            paramInt = localb.b;
            if (paramInt == k)
            {
              paramInt = localb.d;
            }
            else
            {
              m = k;
              if (paramInt < k) {
                m = k - 1;
              }
              paramInt = m;
              if (localb.d <= m) {
                paramInt = m + 1;
              }
            }
          }
        }
        else
        {
          m = localb.b;
          paramInt = k;
          if (m <= k)
          {
            paramInt = localb.d;
            if (m + paramInt > k) {
              return -1;
            }
            paramInt = k - paramInt;
          }
        }
      }
      else
      {
        paramInt = k;
        if (localb.b <= k) {
          paramInt = k + localb.d;
        }
      }
      j++;
    }
    return k;
  }
  
  int a(int paramInt1, int paramInt2)
  {
    int i = this.c.size();
    int j = paramInt2;
    for (paramInt2 = paramInt1; j < i; paramInt2 = paramInt1)
    {
      b localb = (b)this.c.get(j);
      int k = localb.a;
      int m;
      if (k == 8)
      {
        paramInt1 = localb.b;
        if (paramInt1 == paramInt2)
        {
          paramInt1 = localb.d;
        }
        else
        {
          m = paramInt2;
          if (paramInt1 < paramInt2) {
            m = paramInt2 - 1;
          }
          paramInt1 = m;
          if (localb.d <= m) {
            paramInt1 = m + 1;
          }
        }
      }
      else
      {
        m = localb.b;
        paramInt1 = paramInt2;
        if (m <= paramInt2) {
          if (k == 2)
          {
            paramInt1 = localb.d;
            if (paramInt2 < m + paramInt1) {
              return -1;
            }
            paramInt1 = paramInt2 - paramInt1;
          }
          else
          {
            paramInt1 = paramInt2;
            if (k == 1) {
              paramInt1 = paramInt2 + localb.d;
            }
          }
        }
      }
      j++;
    }
    return paramInt2;
  }
  
  public b a(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    b localb = (b)this.a.a();
    if (localb == null)
    {
      paramObject = new b(paramInt1, paramInt2, paramInt3, paramObject);
    }
    else
    {
      localb.a = paramInt1;
      localb.b = paramInt2;
      localb.d = paramInt3;
      localb.c = paramObject;
      paramObject = localb;
    }
    return (b)paramObject;
  }
  
  void a()
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++) {
      this.d.b((b)this.c.get(j));
    }
    a(this.c);
    this.h = 0;
  }
  
  public void a(b paramb)
  {
    if (!this.f)
    {
      paramb.c = null;
      this.a.a(paramb);
    }
  }
  
  void a(b paramb, int paramInt)
  {
    this.d.a(paramb);
    int i = paramb.a;
    if (i != 2)
    {
      if (i == 4) {
        this.d.a(paramInt, paramb.d, paramb.c);
      } else {
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
      }
    }
    else {
      this.d.d(paramInt, paramb.d);
    }
  }
  
  void a(List<b> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      a((b)paramList.get(j));
    }
    paramList.clear();
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    if (paramInt1 == paramInt2) {
      return false;
    }
    if (paramInt3 == 1)
    {
      this.b.add(a(8, paramInt1, paramInt2, null));
      this.h |= 0x8;
      if (this.b.size() == 1) {
        bool = true;
      }
      return bool;
    }
    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
  }
  
  boolean a(int paramInt1, int paramInt2, Object paramObject)
  {
    boolean bool = false;
    if (paramInt2 < 1) {
      return false;
    }
    this.b.add(a(4, paramInt1, paramInt2, paramObject));
    this.h |= 0x4;
    if (this.b.size() == 1) {
      bool = true;
    }
    return bool;
  }
  
  int b(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  void b()
  {
    a();
    int i = this.b.size();
    for (int j = 0; j < i; j++)
    {
      Object localObject = (b)this.b.get(j);
      int k = ((b)localObject).a;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 4)
          {
            if (k == 8)
            {
              this.d.b((b)localObject);
              this.d.a(((b)localObject).b, ((b)localObject).d);
            }
          }
          else
          {
            this.d.b((b)localObject);
            this.d.a(((b)localObject).b, ((b)localObject).d, ((b)localObject).c);
          }
        }
        else
        {
          this.d.b((b)localObject);
          this.d.d(((b)localObject).b, ((b)localObject).d);
        }
      }
      else
      {
        this.d.b((b)localObject);
        this.d.c(((b)localObject).b, ((b)localObject).d);
      }
      localObject = this.e;
      if (localObject != null) {
        ((Runnable)localObject).run();
      }
    }
    a(this.b);
    this.h = 0;
  }
  
  boolean b(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    if (paramInt2 < 1) {
      return false;
    }
    this.b.add(a(1, paramInt1, paramInt2, null));
    this.h |= 0x1;
    if (this.b.size() == 1) {
      bool = true;
    }
    return bool;
  }
  
  boolean c()
  {
    boolean bool;
    if (this.b.size() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  boolean c(int paramInt)
  {
    boolean bool;
    if ((paramInt & this.h) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  boolean c(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    if (paramInt2 < 1) {
      return false;
    }
    this.b.add(a(2, paramInt1, paramInt2, null));
    this.h |= 0x2;
    if (this.b.size() == 1) {
      bool = true;
    }
    return bool;
  }
  
  boolean d()
  {
    boolean bool;
    if ((!this.c.isEmpty()) && (!this.b.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  void e()
  {
    this.g.a(this.b);
    int i = this.b.size();
    for (int j = 0; j < i; j++)
    {
      Object localObject = (b)this.b.get(j);
      int k = ((b)localObject).a;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 4)
          {
            if (k == 8) {
              c((b)localObject);
            }
          }
          else {
            e((b)localObject);
          }
        }
        else {
          d((b)localObject);
        }
      }
      else {
        b((b)localObject);
      }
      localObject = this.e;
      if (localObject != null) {
        ((Runnable)localObject).run();
      }
    }
    this.b.clear();
  }
  
  void f()
  {
    a(this.b);
    a(this.c);
    this.h = 0;
  }
  
  static abstract interface a
  {
    public abstract RecyclerView.x a(int paramInt);
    
    public abstract void a(int paramInt1, int paramInt2);
    
    public abstract void a(int paramInt1, int paramInt2, Object paramObject);
    
    public abstract void a(i.b paramb);
    
    public abstract void b(int paramInt1, int paramInt2);
    
    public abstract void b(i.b paramb);
    
    public abstract void c(int paramInt1, int paramInt2);
    
    public abstract void d(int paramInt1, int paramInt2);
  }
  
  static class b
  {
    int a;
    int b;
    Object c;
    int d;
    
    b(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.d = paramInt3;
      this.c = paramObject;
    }
    
    String a()
    {
      int i = this.a;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 4)
          {
            if (i != 8) {
              return "??";
            }
            return "mv";
          }
          return "up";
        }
        return "rm";
      }
      return "add";
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (b.class == paramObject.getClass()))
      {
        b localb = (b)paramObject;
        int i = this.a;
        if (i != localb.a) {
          return false;
        }
        if ((i == 8) && (Math.abs(this.d - this.b) == 1) && (this.d == localb.b) && (this.b == localb.d)) {
          return true;
        }
        if (this.d != localb.d) {
          return false;
        }
        if (this.b != localb.b) {
          return false;
        }
        paramObject = this.c;
        if (paramObject != null)
        {
          if (!paramObject.equals(localb.c)) {
            return false;
          }
        }
        else if (localb.c != null) {
          return false;
        }
        return true;
      }
      return false;
    }
    
    public int hashCode()
    {
      return (this.a * 31 + this.b) * 31 + this.d;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append("[");
      localStringBuilder.append(a());
      localStringBuilder.append(",s:");
      localStringBuilder.append(this.b);
      localStringBuilder.append("c:");
      localStringBuilder.append(this.d);
      localStringBuilder.append(",p:");
      localStringBuilder.append(this.c);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */