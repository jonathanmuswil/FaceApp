package android.support.v7.widget;

import java.util.List;

class ya
{
  final a a;
  
  ya(a parama)
  {
    this.a = parama;
  }
  
  private void a(List<i.b> paramList, int paramInt1, int paramInt2)
  {
    i.b localb1 = (i.b)paramList.get(paramInt1);
    i.b localb2 = (i.b)paramList.get(paramInt2);
    int i = localb2.a;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 4) {
          b(paramList, paramInt1, localb1, paramInt2, localb2);
        }
      }
      else {
        a(paramList, paramInt1, localb1, paramInt2, localb2);
      }
    }
    else {
      c(paramList, paramInt1, localb1, paramInt2, localb2);
    }
  }
  
  private int b(List<i.b> paramList)
  {
    int i = paramList.size() - 1;
    int k;
    for (int j = 0; i >= 0; j = k)
    {
      if (((i.b)paramList.get(i)).a == 8)
      {
        k = j;
        if (j != 0) {
          return i;
        }
      }
      else
      {
        k = 1;
      }
      i--;
    }
    return -1;
  }
  
  private void c(List<i.b> paramList, int paramInt1, i.b paramb1, int paramInt2, i.b paramb2)
  {
    if (paramb1.d < paramb2.b) {
      i = -1;
    } else {
      i = 0;
    }
    int j = i;
    if (paramb1.b < paramb2.b) {
      j = i + 1;
    }
    int i = paramb2.b;
    int k = paramb1.b;
    if (i <= k) {
      paramb1.b = (k + paramb2.d);
    }
    i = paramb2.b;
    k = paramb1.d;
    if (i <= k) {
      paramb1.d = (k + paramb2.d);
    }
    paramb2.b += j;
    paramList.set(paramInt1, paramb2);
    paramList.set(paramInt2, paramb1);
  }
  
  void a(List<i.b> paramList)
  {
    for (;;)
    {
      int i = b(paramList);
      if (i == -1) {
        break;
      }
      a(paramList, i, i + 1);
    }
  }
  
  void a(List<i.b> paramList, int paramInt1, i.b paramb1, int paramInt2, i.b paramb2)
  {
    int i = paramb1.b;
    int j = paramb1.d;
    int k = 0;
    if (i < j)
    {
      if ((paramb2.b == i) && (paramb2.d == j - i))
      {
        i = 0;
      }
      else
      {
        i = 0;
        break label94;
      }
    }
    else
    {
      if ((paramb2.b != j + 1) || (paramb2.d != i - j)) {
        break label91;
      }
      i = 1;
    }
    k = 1;
    break label94;
    label91:
    i = 1;
    label94:
    j = paramb1.d;
    int m = paramb2.b;
    if (j < m)
    {
      paramb2.b = (m - 1);
    }
    else
    {
      n = paramb2.d;
      if (j < m + n)
      {
        paramb2.d = (n - 1);
        paramb1.a = 2;
        paramb1.d = 1;
        if (paramb2.d == 0)
        {
          paramList.remove(paramInt2);
          this.a.a(paramb2);
        }
        return;
      }
    }
    j = paramb1.b;
    int n = paramb2.b;
    i.b localb = null;
    if (j <= n)
    {
      paramb2.b = (n + 1);
    }
    else
    {
      m = paramb2.d;
      if (j < n + m)
      {
        localb = this.a.a(2, j + 1, n + m - j, null);
        paramb2.d = (paramb1.b - paramb2.b);
      }
    }
    if (k != 0)
    {
      paramList.set(paramInt1, paramb2);
      paramList.remove(paramInt2);
      this.a.a(paramb1);
      return;
    }
    if (i != 0)
    {
      if (localb != null)
      {
        i = paramb1.b;
        if (i > localb.b) {
          paramb1.b = (i - localb.d);
        }
        i = paramb1.d;
        if (i > localb.b) {
          paramb1.d = (i - localb.d);
        }
      }
      i = paramb1.b;
      if (i > paramb2.b) {
        paramb1.b = (i - paramb2.d);
      }
      i = paramb1.d;
      if (i > paramb2.b) {
        paramb1.d = (i - paramb2.d);
      }
    }
    else
    {
      if (localb != null)
      {
        i = paramb1.b;
        if (i >= localb.b) {
          paramb1.b = (i - localb.d);
        }
        i = paramb1.d;
        if (i >= localb.b) {
          paramb1.d = (i - localb.d);
        }
      }
      i = paramb1.b;
      if (i >= paramb2.b) {
        paramb1.b = (i - paramb2.d);
      }
      i = paramb1.d;
      if (i >= paramb2.b) {
        paramb1.d = (i - paramb2.d);
      }
    }
    paramList.set(paramInt1, paramb2);
    if (paramb1.b != paramb1.d) {
      paramList.set(paramInt2, paramb1);
    } else {
      paramList.remove(paramInt2);
    }
    if (localb != null) {
      paramList.add(paramInt1, localb);
    }
  }
  
  void b(List<i.b> paramList, int paramInt1, i.b paramb1, int paramInt2, i.b paramb2)
  {
    int i = paramb1.d;
    int j = paramb2.b;
    i.b localb1 = null;
    if (i < j)
    {
      paramb2.b = (j - 1);
    }
    else
    {
      k = paramb2.d;
      if (i < j + k)
      {
        paramb2.d = (k - 1);
        localb2 = this.a.a(4, paramb1.b, 1, paramb2.c);
        break label89;
      }
    }
    i.b localb2 = null;
    label89:
    int k = paramb1.b;
    i = paramb2.b;
    if (k <= i)
    {
      paramb2.b = (i + 1);
    }
    else
    {
      j = paramb2.d;
      if (k < i + j)
      {
        j = i + j - k;
        localb1 = this.a.a(4, k + 1, j, paramb2.c);
        paramb2.d -= j;
      }
    }
    paramList.set(paramInt2, paramb1);
    if (paramb2.d > 0)
    {
      paramList.set(paramInt1, paramb2);
    }
    else
    {
      paramList.remove(paramInt1);
      this.a.a(paramb2);
    }
    if (localb2 != null) {
      paramList.add(paramInt1, localb2);
    }
    if (localb1 != null) {
      paramList.add(paramInt1, localb1);
    }
  }
  
  static abstract interface a
  {
    public abstract i.b a(int paramInt1, int paramInt2, int paramInt3, Object paramObject);
    
    public abstract void a(i.b paramb);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */