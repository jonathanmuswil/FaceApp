import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

final class u_a$b
{
  private final jab a;
  private final boolean b;
  private int c = Integer.MAX_VALUE;
  private boolean d;
  int e;
  int f;
  t_a[] g = new t_a[8];
  int h = this.g.length - 1;
  int i = 0;
  int j = 0;
  
  u_a$b(int paramInt, boolean paramBoolean, jab paramjab)
  {
    this.e = paramInt;
    this.f = paramInt;
    this.b = paramBoolean;
    this.a = paramjab;
  }
  
  u_a$b(jab paramjab)
  {
    this(4096, true, paramjab);
  }
  
  private void a()
  {
    int k = this.f;
    int m = this.j;
    if (k < m) {
      if (k == 0) {
        b();
      } else {
        b(m - k);
      }
    }
  }
  
  private void a(t_a paramt_a)
  {
    int k = paramt_a.i;
    int m = this.f;
    if (k > m)
    {
      b();
      return;
    }
    b(this.j + k - m);
    m = this.i;
    t_a[] arrayOft_a1 = this.g;
    if (m + 1 > arrayOft_a1.length)
    {
      t_a[] arrayOft_a2 = new t_a[arrayOft_a1.length * 2];
      System.arraycopy(arrayOft_a1, 0, arrayOft_a2, arrayOft_a1.length, arrayOft_a1.length);
      this.h = (this.g.length - 1);
      this.g = arrayOft_a2;
    }
    m = this.h;
    this.h = (m - 1);
    this.g[m] = paramt_a;
    this.i += 1;
    this.j += k;
  }
  
  private int b(int paramInt)
  {
    int k = 0;
    int m = 0;
    if (paramInt > 0)
    {
      k = this.g.length - 1;
      int n = paramInt;
      paramInt = m;
      while ((k >= this.h) && (n > 0))
      {
        arrayOft_a = this.g;
        n -= arrayOft_a[k].i;
        this.j -= arrayOft_a[k].i;
        this.i -= 1;
        paramInt++;
        k--;
      }
      t_a[] arrayOft_a = this.g;
      k = this.h;
      System.arraycopy(arrayOft_a, k + 1, arrayOft_a, k + 1 + paramInt, this.i);
      arrayOft_a = this.g;
      k = this.h;
      Arrays.fill(arrayOft_a, k + 1, k + 1 + paramInt, null);
      this.h += paramInt;
      k = paramInt;
    }
    return k;
  }
  
  private void b()
  {
    Arrays.fill(this.g, null);
    this.h = (this.g.length - 1);
    this.i = 0;
    this.j = 0;
  }
  
  void a(int paramInt)
  {
    this.e = paramInt;
    int k = Math.min(paramInt, 16384);
    paramInt = this.f;
    if (paramInt == k) {
      return;
    }
    if (k < paramInt) {
      this.c = Math.min(this.c, k);
    }
    this.d = true;
    this.f = k;
    a();
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2)
    {
      this.a.writeByte(paramInt1 | paramInt3);
      return;
    }
    this.a.writeByte(paramInt3 | paramInt2);
    paramInt1 -= paramInt2;
    while (paramInt1 >= 128)
    {
      this.a.writeByte(0x80 | paramInt1 & 0x7F);
      paramInt1 >>>= 7;
    }
    this.a.writeByte(paramInt1);
  }
  
  void a(List<t_a> paramList)
    throws IOException
  {
    int k;
    if (this.d)
    {
      k = this.c;
      if (k < this.f) {
        a(k, 31, 32);
      }
      this.d = false;
      this.c = Integer.MAX_VALUE;
      a(this.f, 31, 32);
    }
    int m = paramList.size();
    for (int n = 0; n < m; n++)
    {
      t_a localt_a = (t_a)paramList.get(n);
      mab localmab1 = localt_a.g.f();
      mab localmab2 = localt_a.h;
      Integer localInteger = (Integer)u_a.b.get(localmab1);
      int i1;
      if (localInteger != null)
      {
        i1 = localInteger.intValue() + 1;
        if ((i1 > 1) && (i1 < 8))
        {
          if (Objects.equals(u_a.a[(i1 - 1)].h, localmab2))
          {
            k = i1;
            break label205;
          }
          if (Objects.equals(u_a.a[i1].h, localmab2))
          {
            k = i1;
            i1++;
            break label205;
          }
        }
        k = i1;
        i1 = -1;
      }
      else
      {
        i1 = -1;
        k = -1;
      }
      label205:
      int i2 = i1;
      int i3 = k;
      if (i1 == -1)
      {
        int i4 = this.h + 1;
        int i5 = this.g.length;
        for (;;)
        {
          i2 = i1;
          i3 = k;
          if (i4 >= i5) {
            break;
          }
          i2 = k;
          if (Objects.equals(this.g[i4].g, localmab1))
          {
            if (Objects.equals(this.g[i4].h, localmab2))
            {
              i1 = this.h;
              i2 = u_a.a.length + (i4 - i1);
              i3 = k;
              break;
            }
            i2 = k;
            if (k == -1) {
              i2 = i4 - this.h + u_a.a.length;
            }
          }
          i4++;
          k = i2;
        }
      }
      if (i2 != -1)
      {
        a(i2, 127, 128);
      }
      else if (i3 == -1)
      {
        this.a.writeByte(64);
        a(localmab1);
        a(localmab2);
        a(localt_a);
      }
      else if ((localmab1.b(t_a.a)) && (!t_a.f.equals(localmab1)))
      {
        a(i3, 15, 0);
        a(localmab2);
      }
      else
      {
        a(i3, 63, 64);
        a(localmab2);
        a(localt_a);
      }
    }
  }
  
  void a(mab parammab)
    throws IOException
  {
    if ((this.b) && (L_a.a().a(parammab) < parammab.e()))
    {
      jab localjab = new jab();
      L_a.a().a(parammab, localjab);
      parammab = localjab.d();
      a(parammab.e(), 127, 128);
      this.a.a(parammab);
    }
    else
    {
      a(parammab.e(), 127, 0);
      this.a.a(parammab);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/u_a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */