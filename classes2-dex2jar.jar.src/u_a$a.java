import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class u_a$a
{
  private final List<t_a> a = new ArrayList();
  private final lab b;
  private final int c;
  private int d;
  t_a[] e = new t_a[8];
  int f = this.e.length - 1;
  int g = 0;
  int h = 0;
  
  u_a$a(int paramInt1, int paramInt2, Eab paramEab)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    this.b = vab.a(paramEab);
  }
  
  u_a$a(int paramInt, Eab paramEab)
  {
    this(paramInt, paramInt, paramEab);
  }
  
  private int a(int paramInt)
  {
    return this.f + 1 + paramInt;
  }
  
  private void a(int paramInt, t_a paramt_a)
  {
    this.a.add(paramt_a);
    int i = paramt_a.i;
    int j = i;
    if (paramInt != -1) {
      j = i - this.e[a(paramInt)].i;
    }
    i = this.d;
    if (j > i)
    {
      e();
      return;
    }
    int k = b(this.h + j - i);
    if (paramInt == -1)
    {
      paramInt = this.g;
      t_a[] arrayOft_a1 = this.e;
      if (paramInt + 1 > arrayOft_a1.length)
      {
        t_a[] arrayOft_a2 = new t_a[arrayOft_a1.length * 2];
        System.arraycopy(arrayOft_a1, 0, arrayOft_a2, arrayOft_a1.length, arrayOft_a1.length);
        this.f = (this.e.length - 1);
        this.e = arrayOft_a2;
      }
      paramInt = this.f;
      this.f = (paramInt - 1);
      this.e[paramInt] = paramt_a;
      this.g += 1;
    }
    else
    {
      i = a(paramInt);
      this.e[(paramInt + (i + k))] = paramt_a;
    }
    this.h += j;
  }
  
  private int b(int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramInt > 0)
    {
      i = this.e.length - 1;
      int k = paramInt;
      paramInt = j;
      while ((i >= this.f) && (k > 0))
      {
        arrayOft_a = this.e;
        k -= arrayOft_a[i].i;
        this.h -= arrayOft_a[i].i;
        this.g -= 1;
        paramInt++;
        i--;
      }
      t_a[] arrayOft_a = this.e;
      i = this.f;
      System.arraycopy(arrayOft_a, i + 1, arrayOft_a, i + 1 + paramInt, this.g);
      this.f += paramInt;
      i = paramInt;
    }
    return i;
  }
  
  private mab c(int paramInt)
    throws IOException
  {
    if (d(paramInt)) {
      return u_a.a[paramInt].g;
    }
    int i = a(paramInt - u_a.a.length);
    if (i >= 0)
    {
      localObject = this.e;
      if (i < localObject.length) {
        return localObject[i].g;
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Header index too large ");
    ((StringBuilder)localObject).append(paramInt + 1);
    throw new IOException(((StringBuilder)localObject).toString());
  }
  
  private void d()
  {
    int i = this.d;
    int j = this.h;
    if (i < j) {
      if (i == 0) {
        e();
      } else {
        b(j - i);
      }
    }
  }
  
  private boolean d(int paramInt)
  {
    boolean bool = true;
    if ((paramInt < 0) || (paramInt > u_a.a.length - 1)) {
      bool = false;
    }
    return bool;
  }
  
  private void e()
  {
    Arrays.fill(this.e, null);
    this.f = (this.e.length - 1);
    this.g = 0;
    this.h = 0;
  }
  
  private void e(int paramInt)
    throws IOException
  {
    if (d(paramInt))
    {
      localObject = u_a.a[paramInt];
      this.a.add(localObject);
    }
    else
    {
      int i = a(paramInt - u_a.a.length);
      if (i < 0) {
        break label68;
      }
      localObject = this.e;
      if (i >= localObject.length) {
        break label68;
      }
      this.a.add(localObject[i]);
    }
    return;
    label68:
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Header index too large ");
    ((StringBuilder)localObject).append(paramInt + 1);
    throw new IOException(((StringBuilder)localObject).toString());
  }
  
  private int f()
    throws IOException
  {
    return this.b.readByte() & 0xFF;
  }
  
  private void f(int paramInt)
    throws IOException
  {
    a(-1, new t_a(c(paramInt), b()));
  }
  
  private void g()
    throws IOException
  {
    mab localmab = b();
    u_a.a(localmab);
    a(-1, new t_a(localmab, b()));
  }
  
  private void g(int paramInt)
    throws IOException
  {
    mab localmab1 = c(paramInt);
    mab localmab2 = b();
    this.a.add(new t_a(localmab1, localmab2));
  }
  
  private void h()
    throws IOException
  {
    mab localmab1 = b();
    u_a.a(localmab1);
    mab localmab2 = b();
    this.a.add(new t_a(localmab1, localmab2));
  }
  
  int a(int paramInt1, int paramInt2)
    throws IOException
  {
    paramInt1 &= paramInt2;
    if (paramInt1 < paramInt2) {
      return paramInt1;
    }
    int i;
    for (paramInt1 = 0;; paramInt1 += 7)
    {
      i = f();
      if ((i & 0x80) == 0) {
        break;
      }
      paramInt2 += ((i & 0x7F) << paramInt1);
    }
    return paramInt2 + (i << paramInt1);
  }
  
  public List<t_a> a()
  {
    ArrayList localArrayList = new ArrayList(this.a);
    this.a.clear();
    return localArrayList;
  }
  
  mab b()
    throws IOException
  {
    int i = f();
    int j;
    if ((i & 0x80) == 128) {
      j = 1;
    } else {
      j = 0;
    }
    i = a(i, 127);
    if (j != 0) {
      return mab.a(L_a.a().a(this.b.e(i)));
    }
    return this.b.b(i);
  }
  
  void c()
    throws IOException
  {
    while (!this.b.p())
    {
      int i = this.b.readByte() & 0xFF;
      if (i != 128)
      {
        if ((i & 0x80) == 128)
        {
          e(a(i, 127) - 1);
        }
        else if (i == 64)
        {
          g();
        }
        else if ((i & 0x40) == 64)
        {
          f(a(i, 63) - 1);
        }
        else if ((i & 0x20) == 32)
        {
          this.d = a(i, 31);
          i = this.d;
          if ((i >= 0) && (i <= this.c))
          {
            d();
          }
          else
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Invalid dynamic table size update ");
            localStringBuilder.append(this.d);
            throw new IOException(localStringBuilder.toString());
          }
        }
        else if ((i != 16) && (i != 0))
        {
          g(a(i, 15) - 1);
        }
        else
        {
          h();
        }
      }
      else {
        throw new IOException("index == 0");
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/u_a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */