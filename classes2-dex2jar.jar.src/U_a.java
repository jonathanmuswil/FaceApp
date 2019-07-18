import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

final class u_a
{
  static final t_a[] a = { new t_a(t_a.f, ""), new t_a(t_a.c, "GET"), new t_a(t_a.c, "POST"), new t_a(t_a.d, "/"), new t_a(t_a.d, "/index.html"), new t_a(t_a.e, "http"), new t_a(t_a.e, "https"), new t_a(t_a.b, "200"), new t_a(t_a.b, "204"), new t_a(t_a.b, "206"), new t_a(t_a.b, "304"), new t_a(t_a.b, "400"), new t_a(t_a.b, "404"), new t_a(t_a.b, "500"), new t_a("accept-charset", ""), new t_a("accept-encoding", "gzip, deflate"), new t_a("accept-language", ""), new t_a("accept-ranges", ""), new t_a("accept", ""), new t_a("access-control-allow-origin", ""), new t_a("age", ""), new t_a("allow", ""), new t_a("authorization", ""), new t_a("cache-control", ""), new t_a("content-disposition", ""), new t_a("content-encoding", ""), new t_a("content-language", ""), new t_a("content-length", ""), new t_a("content-location", ""), new t_a("content-range", ""), new t_a("content-type", ""), new t_a("cookie", ""), new t_a("date", ""), new t_a("etag", ""), new t_a("expect", ""), new t_a("expires", ""), new t_a("from", ""), new t_a("host", ""), new t_a("if-match", ""), new t_a("if-modified-since", ""), new t_a("if-none-match", ""), new t_a("if-range", ""), new t_a("if-unmodified-since", ""), new t_a("last-modified", ""), new t_a("link", ""), new t_a("location", ""), new t_a("max-forwards", ""), new t_a("proxy-authenticate", ""), new t_a("proxy-authorization", ""), new t_a("range", ""), new t_a("referer", ""), new t_a("refresh", ""), new t_a("retry-after", ""), new t_a("server", ""), new t_a("set-cookie", ""), new t_a("strict-transport-security", ""), new t_a("transfer-encoding", ""), new t_a("user-agent", ""), new t_a("vary", ""), new t_a("via", ""), new t_a("www-authenticate", "") };
  static final Map<mab, Integer> b = a();
  
  private static Map<mab, Integer> a()
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(a.length);
    for (int i = 0;; i++)
    {
      t_a[] arrayOft_a = a;
      if (i >= arrayOft_a.length) {
        break;
      }
      if (!localLinkedHashMap.containsKey(arrayOft_a[i].g)) {
        localLinkedHashMap.put(a[i].g, Integer.valueOf(i));
      }
    }
    return Collections.unmodifiableMap(localLinkedHashMap);
  }
  
  static mab a(mab parammab)
    throws IOException
  {
    int i = parammab.e();
    for (int j = 0; j < i; j++)
    {
      int k = parammab.a(j);
      if ((k >= 65) && (k <= 90))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("PROTOCOL_ERROR response malformed: mixed case name: ");
        localStringBuilder.append(parammab.h());
        throw new IOException(localStringBuilder.toString());
      }
    }
    return parammab;
  }
  
  static final class a
  {
    private final List<t_a> a = new ArrayList();
    private final lab b;
    private final int c;
    private int d;
    t_a[] e = new t_a[8];
    int f = this.e.length - 1;
    int g = 0;
    int h = 0;
    
    a(int paramInt1, int paramInt2, Eab paramEab)
    {
      this.c = paramInt1;
      this.d = paramInt2;
      this.b = vab.a(paramEab);
    }
    
    a(int paramInt, Eab paramEab)
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
  
  static final class b
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
    
    b(int paramInt, boolean paramBoolean, jab paramjab)
    {
      this.e = paramInt;
      this.f = paramInt;
      this.b = paramBoolean;
      this.a = paramjab;
    }
    
    b(jab paramjab)
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/u_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */