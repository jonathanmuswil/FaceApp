import android.support.v7.widget.RecyclerView.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class he
{
  private static final Comparator<he.e> a = new ge();
  
  public static he.b a(he.a parama)
  {
    return a(parama, true);
  }
  
  public static he.b a(he.a parama, boolean paramBoolean)
  {
    int i = parama.b();
    int j = parama.a();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    localArrayList2.add(new he.d(0, i, 0, j));
    i = Math.abs(i - j) + (i + j);
    j = i * 2;
    int[] arrayOfInt1 = new int[j];
    int[] arrayOfInt2 = new int[j];
    ArrayList localArrayList3 = new ArrayList();
    while (!localArrayList2.isEmpty())
    {
      he.d locald1 = (he.d)localArrayList2.remove(localArrayList2.size() - 1);
      he.e locale = a(parama, locald1.a, locald1.b, locald1.c, locald1.d, arrayOfInt1, arrayOfInt2, i);
      if (locale != null)
      {
        if (locale.c > 0) {
          localArrayList1.add(locale);
        }
        locale.a += locald1.a;
        locale.b += locald1.c;
        he.d locald2;
        if (localArrayList3.isEmpty()) {
          locald2 = new he.d();
        } else {
          locald2 = (he.d)localArrayList3.remove(localArrayList3.size() - 1);
        }
        locald2.a = locald1.a;
        locald2.c = locald1.c;
        if (locale.e)
        {
          locald2.b = locale.a;
          locald2.d = locale.b;
        }
        else if (locale.d)
        {
          locald2.b = (locale.a - 1);
          locald2.d = locale.b;
        }
        else
        {
          locald2.b = locale.a;
          locald2.d = (locale.b - 1);
        }
        localArrayList2.add(locald2);
        int k;
        if (locale.e)
        {
          if (locale.d)
          {
            j = locale.a;
            k = locale.c;
            locald1.a = (j + k + 1);
            locald1.c = (locale.b + k);
          }
          else
          {
            k = locale.a;
            j = locale.c;
            locald1.a = (k + j);
            locald1.c = (locale.b + j + 1);
          }
        }
        else
        {
          k = locale.a;
          j = locale.c;
          locald1.a = (k + j);
          locald1.c = (locale.b + j);
        }
        localArrayList2.add(locald1);
      }
      else
      {
        localArrayList3.add(locald1);
      }
    }
    Collections.sort(localArrayList1, a);
    return new he.b(parama, localArrayList1, arrayOfInt1, arrayOfInt2, paramBoolean);
  }
  
  private static he.e a(he.a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt5)
  {
    paramInt2 -= paramInt1;
    int i = paramInt4 - paramInt3;
    if ((paramInt2 >= 1) && (i >= 1))
    {
      int j = paramInt2 - i;
      int k = (paramInt2 + i + 1) / 2;
      paramInt4 = paramInt5 - k - 1;
      int m = paramInt5 + k + 1;
      Arrays.fill(paramArrayOfInt1, paramInt4, m, 0);
      Arrays.fill(paramArrayOfInt2, paramInt4 + j, m + j, paramInt2);
      if (j % 2 != 0) {
        m = 1;
      } else {
        m = 0;
      }
      for (int n = 0; n <= k; n++)
      {
        int i1 = -n;
        boolean bool;
        label202:
        int i3;
        for (int i2 = i1; i2 <= n; i2 += 2)
        {
          if (i2 != i1) {
            if (i2 != n)
            {
              paramInt4 = paramInt5 + i2;
              if (paramArrayOfInt1[(paramInt4 - 1)] < paramArrayOfInt1[(paramInt4 + 1)]) {}
            }
            else
            {
              paramInt4 = paramArrayOfInt1[(paramInt5 + i2 - 1)] + 1;
              bool = true;
              break label202;
            }
          }
          paramInt4 = paramArrayOfInt1[(paramInt5 + i2 + 1)];
          bool = false;
          for (i3 = paramInt4 - i2; (paramInt4 < paramInt2) && (i3 < i) && (parama.b(paramInt1 + paramInt4, paramInt3 + i3)); i3++) {
            paramInt4++;
          }
          i3 = paramInt5 + i2;
          paramArrayOfInt1[i3] = paramInt4;
          if ((m != 0) && (i2 >= j - n + 1) && (i2 <= j + n - 1) && (paramArrayOfInt1[i3] >= paramArrayOfInt2[i3]))
          {
            parama = new he.e();
            parama.a = paramArrayOfInt2[i3];
            parama.b = (parama.a - i2);
            parama.c = (paramArrayOfInt1[i3] - paramArrayOfInt2[i3]);
            parama.d = bool;
            parama.e = false;
            return parama;
          }
        }
        for (i2 = i1; i2 <= n; i2 += 2)
        {
          int i4 = i2 + j;
          if (i4 != n + j) {
            if (i4 != i1 + j)
            {
              paramInt4 = paramInt5 + i4;
              if (paramArrayOfInt2[(paramInt4 - 1)] < paramArrayOfInt2[(paramInt4 + 1)]) {}
            }
            else
            {
              paramInt4 = paramArrayOfInt2[(paramInt5 + i4 + 1)] - 1;
              bool = true;
              break label464;
            }
          }
          paramInt4 = paramArrayOfInt2[(paramInt5 + i4 - 1)];
          bool = false;
          label464:
          for (i3 = paramInt4 - i4; (paramInt4 > 0) && (i3 > 0) && (parama.b(paramInt1 + paramInt4 - 1, paramInt3 + i3 - 1)); i3--) {
            paramInt4--;
          }
          i3 = paramInt5 + i4;
          paramArrayOfInt2[i3] = paramInt4;
          if ((m == 0) && (i4 >= i1) && (i4 <= n) && (paramArrayOfInt1[i3] >= paramArrayOfInt2[i3]))
          {
            parama = new he.e();
            parama.a = paramArrayOfInt2[i3];
            parama.b = (parama.a - i4);
            parama.c = (paramArrayOfInt1[i3] - paramArrayOfInt2[i3]);
            parama.d = bool;
            parama.e = true;
            return parama;
          }
        }
      }
      throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
    }
    return null;
  }
  
  public static abstract class a
  {
    public abstract int a();
    
    public abstract boolean a(int paramInt1, int paramInt2);
    
    public abstract int b();
    
    public abstract boolean b(int paramInt1, int paramInt2);
    
    public Object c(int paramInt1, int paramInt2)
    {
      return null;
    }
  }
  
  public static class b
  {
    private final List<he.e> a;
    private final int[] b;
    private final int[] c;
    private final he.a d;
    private final int e;
    private final int f;
    private final boolean g;
    
    b(he.a parama, List<he.e> paramList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean)
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
  
  private static class c
  {
    int a;
    int b;
    boolean c;
    
    public c(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramBoolean;
    }
  }
  
  static class d
  {
    int a;
    int b;
    int c;
    int d;
    
    public d() {}
    
    public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramInt3;
      this.d = paramInt4;
    }
  }
  
  static class e
  {
    int a;
    int b;
    int c;
    boolean d;
    boolean e;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/he.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */