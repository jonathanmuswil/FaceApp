import android.support.v7.widget.RecyclerView.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class he$b
{
  private final List<he.e> a;
  private final int[] b;
  private final int[] c;
  private final he.a d;
  private final int e;
  private final int f;
  private final boolean g;
  
  he$b(he.a parama, List<he.e> paramList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean)
  {
    this.a = paramList;
    this.b = paramArrayOfInt1;
    this.c = paramArrayOfInt2;
    Arrays.fill(this.b, 0);
    Arrays.fill(this.c, 0);
    this.d = parama;
    this.e = parama.b();
    this.f = parama.a();
    this.g = paramBoolean;
    a();
    b();
  }
  
  private static he.c a(List<he.c> paramList, int paramInt, boolean paramBoolean)
  {
    for (int i = paramList.size() - 1; i >= 0; i--)
    {
      he.c localc1 = (he.c)paramList.get(i);
      if ((localc1.a == paramInt) && (localc1.c == paramBoolean))
      {
        paramList.remove(i);
        while (i < paramList.size())
        {
          he.c localc2 = (he.c)paramList.get(i);
          int j = localc2.b;
          if (paramBoolean) {
            paramInt = 1;
          } else {
            paramInt = -1;
          }
          localc2.b = (j + paramInt);
          i++;
        }
        return localc1;
      }
    }
    return null;
  }
  
  private void a()
  {
    he.e locale;
    if (this.a.isEmpty()) {
      locale = null;
    } else {
      locale = (he.e)this.a.get(0);
    }
    if ((locale == null) || (locale.a != 0) || (locale.b != 0))
    {
      locale = new he.e();
      locale.a = 0;
      locale.b = 0;
      locale.d = false;
      locale.c = 0;
      locale.e = false;
      this.a.add(0, locale);
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.b[(paramInt1 - 1)] != 0) {
      return;
    }
    a(paramInt1, paramInt2, paramInt3, false);
  }
  
  private void a(List<he.c> paramList, ie paramie, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!this.g)
    {
      paramie.b(paramInt1, paramInt2);
      return;
    }
    paramInt2--;
    while (paramInt2 >= 0)
    {
      Object localObject = this.c;
      int i = paramInt3 + paramInt2;
      int j = localObject[i] & 0x1F;
      if (j != 0)
      {
        if ((j != 4) && (j != 8))
        {
          if (j == 16)
          {
            paramList.add(new he.c(i, paramInt1, false));
          }
          else
          {
            paramList = new StringBuilder();
            paramList.append("unknown flag for pos ");
            paramList.append(i);
            paramList.append(" ");
            paramList.append(Long.toBinaryString(j));
            throw new IllegalStateException(paramList.toString());
          }
        }
        else
        {
          int k = this.c[i] >> 5;
          paramie.a(a(paramList, k, true).b, paramInt1);
          if (j == 4) {
            paramie.a(paramInt1, 1, this.d.c(k, i));
          }
        }
      }
      else
      {
        paramie.b(paramInt1, 1);
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          localObject = (he.c)localIterator.next();
          ((he.c)localObject).b += 1;
        }
      }
      paramInt2--;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i;
    int j;
    int k;
    if (paramBoolean)
    {
      i = paramInt2 - 1;
      paramInt2 = paramInt1;
      j = i;
    }
    else
    {
      k = paramInt1 - 1;
      j = k;
      i = paramInt2;
      paramInt2 = k;
    }
    while (paramInt3 >= 0)
    {
      Object localObject = (he.e)this.a.get(paramInt3);
      int m = ((he.e)localObject).a;
      int n = ((he.e)localObject).c;
      int i1 = ((he.e)localObject).b;
      k = 8;
      if (paramBoolean)
      {
        paramInt2--;
        while (paramInt2 >= m + n)
        {
          if (this.d.b(paramInt2, j))
          {
            if (!this.d.a(paramInt2, j)) {
              k = 4;
            }
            this.c[j] = (paramInt2 << 5 | 0x10);
            this.b[paramInt2] = (j << 5 | k);
            return true;
          }
          paramInt2--;
        }
      }
      for (paramInt2 = i - 1; paramInt2 >= i1 + n; paramInt2--) {
        if (this.d.b(j, paramInt2))
        {
          if (!this.d.a(j, paramInt2)) {
            k = 4;
          }
          localObject = this.b;
          paramInt1--;
          localObject[paramInt1] = (paramInt2 << 5 | 0x10);
          this.c[paramInt2] = (paramInt1 << 5 | k);
          return true;
        }
      }
      paramInt2 = ((he.e)localObject).a;
      i = ((he.e)localObject).b;
      paramInt3--;
    }
    return false;
  }
  
  private void b()
  {
    int i = this.e;
    int j = this.f;
    for (int k = this.a.size() - 1; k >= 0; k--)
    {
      he.e locale = (he.e)this.a.get(k);
      int m = locale.a;
      int n = locale.c;
      int i1 = locale.b;
      int i2;
      if (this.g)
      {
        for (;;)
        {
          i2 = j;
          if (i <= m + n) {
            break;
          }
          a(i, j, k);
          i--;
        }
        while (i2 > i1 + n)
        {
          b(i, i2, k);
          i2--;
        }
      }
      for (j = 0; j < locale.c; j++)
      {
        n = locale.a + j;
        i2 = locale.b + j;
        if (this.d.a(n, i2)) {
          i = 1;
        } else {
          i = 2;
        }
        this.b[n] = (i2 << 5 | i);
        this.c[i2] = (n << 5 | i);
      }
      i = locale.a;
      j = locale.b;
    }
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.c[(paramInt2 - 1)] != 0) {
      return;
    }
    a(paramInt1, paramInt2, paramInt3, true);
  }
  
  private void b(List<he.c> paramList, ie paramie, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!this.g)
    {
      paramie.c(paramInt1, paramInt2);
      return;
    }
    paramInt2--;
    while (paramInt2 >= 0)
    {
      Object localObject = this.b;
      int i = paramInt3 + paramInt2;
      int j = localObject[i] & 0x1F;
      if (j != 0)
      {
        if ((j != 4) && (j != 8))
        {
          if (j == 16)
          {
            paramList.add(new he.c(i, paramInt1 + paramInt2, true));
          }
          else
          {
            paramList = new StringBuilder();
            paramList.append("unknown flag for pos ");
            paramList.append(i);
            paramList.append(" ");
            paramList.append(Long.toBinaryString(j));
            throw new IllegalStateException(paramList.toString());
          }
        }
        else
        {
          int k = this.b[i] >> 5;
          localObject = a(paramList, k, false);
          paramie.a(paramInt1 + paramInt2, ((he.c)localObject).b - 1);
          if (j == 4) {
            paramie.a(((he.c)localObject).b - 1, 1, this.d.c(i, k));
          }
        }
      }
      else
      {
        paramie.c(paramInt1 + paramInt2, 1);
        localObject = paramList.iterator();
        while (((Iterator)localObject).hasNext())
        {
          he.c localc = (he.c)((Iterator)localObject).next();
          localc.b -= 1;
        }
      }
      paramInt2--;
    }
  }
  
  public void a(RecyclerView.a parama)
  {
    a(new ee(parama));
  }
  
  public void a(ie paramie)
  {
    if ((paramie instanceof fe)) {
      paramie = (fe)paramie;
    } else {
      paramie = new fe(paramie);
    }
    ArrayList localArrayList = new ArrayList();
    int i = this.e;
    int j = this.f;
    int k = this.a.size();
    k--;
    while (k >= 0)
    {
      he.e locale = (he.e)this.a.get(k);
      int m = locale.c;
      int n = locale.a + m;
      int i1 = locale.b + m;
      if (n < i) {
        b(localArrayList, paramie, n, i - n, n);
      }
      if (i1 < j) {
        a(localArrayList, paramie, n, j - i1, i1);
      }
      for (j = m - 1; j >= 0; j--)
      {
        int[] arrayOfInt = this.b;
        i = locale.a;
        if ((arrayOfInt[(i + j)] & 0x1F) == 2) {
          paramie.a(i + j, 1, this.d.c(i + j, locale.b + j));
        }
      }
      i = locale.a;
      j = locale.b;
      k--;
    }
    paramie.a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/he$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */