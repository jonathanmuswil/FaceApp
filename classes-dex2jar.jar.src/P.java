import java.util.Arrays;
import java.util.HashMap;

public class p
{
  private static int a = 1000;
  public static q b;
  int c = 0;
  private HashMap<String, t> d = null;
  private p.a e;
  private int f = 32;
  private int g;
  m[] h;
  public boolean i;
  private boolean[] j;
  int k;
  int l;
  private int m;
  final n n;
  private t[] o;
  private int p;
  private m[] q;
  private final p.a r;
  
  public p()
  {
    int i1 = this.f;
    this.g = i1;
    this.h = null;
    this.i = false;
    this.j = new boolean[i1];
    this.k = 1;
    this.l = 0;
    this.m = i1;
    this.o = new t[a];
    this.p = 0;
    this.q = new m[i1];
    this.h = new m[i1];
    j();
    this.n = new n();
    this.e = new o(this.n);
    this.r = new m(this.n);
  }
  
  private final int a(p.a parama, boolean paramBoolean)
  {
    Object localObject1 = b;
    if (localObject1 != null) {
      ((q)localObject1).h += 1L;
    }
    for (int i1 = 0; i1 < this.k; i1++) {
      this.j[i1] = false;
    }
    int i2 = 0;
    i1 = 0;
    while (i2 == 0)
    {
      localObject1 = b;
      if (localObject1 != null) {
        ((q)localObject1).i += 1L;
      }
      int i3 = i1 + 1;
      if (i3 >= this.k * 2) {
        return i3;
      }
      if (parama.getKey() != null) {
        this.j[parama.getKey().c] = true;
      }
      localObject1 = parama.a(this, this.j);
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = this.j;
        i1 = ((t)localObject1).c;
        if (localObject2[i1] != 0) {
          return i3;
        }
        localObject2[i1] = 1;
      }
      if (localObject1 != null)
      {
        i1 = 0;
        int i4 = -1;
        float f2;
        for (float f1 = Float.MAX_VALUE; i1 < this.l; f1 = f2)
        {
          localObject2 = this.h[i1];
          int i5;
          if (((m)localObject2).a.h == t.a.a)
          {
            i5 = i4;
            f2 = f1;
          }
          else if (((m)localObject2).e)
          {
            i5 = i4;
            f2 = f1;
          }
          else
          {
            i5 = i4;
            f2 = f1;
            if (((m)localObject2).b((t)localObject1))
            {
              float f3 = ((m)localObject2).d.b((t)localObject1);
              i5 = i4;
              f2 = f1;
              if (f3 < 0.0F)
              {
                f3 = -((m)localObject2).b / f3;
                i5 = i4;
                f2 = f1;
                if (f3 < f1)
                {
                  i5 = i1;
                  f2 = f3;
                }
              }
            }
          }
          i1++;
          i4 = i5;
        }
        if (i4 > -1)
        {
          localObject2 = this.h[i4];
          ((m)localObject2).a.d = -1;
          q localq = b;
          if (localq != null) {
            localq.j += 1L;
          }
          ((m)localObject2).d((t)localObject1);
          localObject1 = ((m)localObject2).a;
          ((t)localObject1).d = i4;
          ((t)localObject1).c((m)localObject2);
          i1 = i3;
          continue;
        }
      }
      i2 = 1;
      i1 = i3;
    }
    return i1;
  }
  
  public static m a(p paramp, t paramt1, t paramt2, t paramt3, float paramFloat, boolean paramBoolean)
  {
    m localm = paramp.b();
    if (paramBoolean) {
      paramp.b(localm);
    }
    localm.a(paramt1, paramt2, paramt3, paramFloat);
    return localm;
  }
  
  private t a(t.a parama, String paramString)
  {
    t localt = (t)this.n.b.a();
    if (localt == null)
    {
      localt = new t(parama, paramString);
      localt.a(parama, paramString);
      parama = localt;
    }
    else
    {
      localt.b();
      localt.a(parama, paramString);
      parama = localt;
    }
    int i1 = this.p;
    int i2 = a;
    if (i1 >= i2)
    {
      a = i2 * 2;
      this.o = ((t[])Arrays.copyOf(this.o, a));
    }
    paramString = this.o;
    i2 = this.p;
    this.p = (i2 + 1);
    paramString[i2] = parama;
    return parama;
  }
  
  private int b(p.a parama)
    throws Exception
  {
    for (int i1 = 0; i1 < this.l; i1++)
    {
      parama = this.h;
      if ((parama[i1].a.h != t.a.a) && (parama[i1].b < 0.0F))
      {
        i1 = 1;
        break label57;
      }
    }
    i1 = 0;
    label57:
    if (i1 != 0)
    {
      int i2 = 0;
      int i4;
      for (i1 = 0;; i1 = i4)
      {
        i3 = i1;
        if (i2 != 0) {
          break;
        }
        parama = b;
        if (parama != null) {
          parama.k += 1L;
        }
        i4 = i1 + 1;
        int i5 = 0;
        int i6 = -1;
        i1 = -1;
        float f1 = Float.MAX_VALUE;
        Object localObject;
        int i9;
        for (i3 = 0; i5 < this.l; i3 = i9)
        {
          localObject = this.h[i5];
          int i7;
          int i8;
          float f2;
          if (((m)localObject).a.h == t.a.a)
          {
            i7 = i6;
            i8 = i1;
            f2 = f1;
            i9 = i3;
          }
          else if (((m)localObject).e)
          {
            i7 = i6;
            i8 = i1;
            f2 = f1;
            i9 = i3;
          }
          else
          {
            i7 = i6;
            i8 = i1;
            f2 = f1;
            i9 = i3;
            if (((m)localObject).b < 0.0F) {
              for (int i10 = 1;; i10++)
              {
                i7 = i6;
                i8 = i1;
                f2 = f1;
                i9 = i3;
                if (i10 >= this.k) {
                  break;
                }
                parama = this.n.c[i10];
                float f3 = ((m)localObject).d.b(parama);
                if (f3 > 0.0F)
                {
                  i7 = i6;
                  i8 = 0;
                  i6 = i1;
                  i1 = i8;
                  while (i1 < 7)
                  {
                    f2 = parama.g[i1] / f3;
                    if ((f2 >= f1) || (i1 != i3))
                    {
                      i8 = i3;
                      if (i1 <= i3) {}
                    }
                    else
                    {
                      i6 = i10;
                      i7 = i5;
                      f1 = f2;
                      i8 = i1;
                    }
                    i1++;
                    i3 = i8;
                  }
                  i1 = i6;
                  i6 = i7;
                }
              }
            }
          }
          i5++;
          i6 = i7;
          i1 = i8;
          f1 = f2;
        }
        if (i6 != -1)
        {
          parama = this.h[i6];
          parama.a.d = -1;
          localObject = b;
          if (localObject != null) {
            ((q)localObject).j += 1L;
          }
          parama.d(this.n.c[i1]);
          localObject = parama.a;
          ((t)localObject).d = i6;
          ((t)localObject).c(parama);
        }
        else
        {
          i2 = 1;
        }
        if (i4 > this.k / 2) {
          i2 = 1;
        }
      }
    }
    int i3 = 0;
    return i3;
  }
  
  private void b(m paramm)
  {
    paramm.a(this, 0);
  }
  
  private final void c(m paramm)
  {
    Object localObject = this.h;
    int i1 = this.l;
    if (localObject[i1] != null) {
      this.n.a.a(localObject[i1]);
    }
    localObject = this.h;
    i1 = this.l;
    localObject[i1] = paramm;
    localObject = paramm.a;
    ((t)localObject).d = i1;
    this.l = (i1 + 1);
    ((t)localObject).c(paramm);
  }
  
  private final void d(m paramm)
  {
    if (this.l > 0)
    {
      paramm.d.a(paramm, this.h);
      if (paramm.d.a == 0) {
        paramm.e = true;
      }
    }
  }
  
  public static q e()
  {
    return b;
  }
  
  private void h()
  {
    for (int i1 = 0; i1 < this.l; i1++)
    {
      m localm = this.h[i1];
      localm.a.f = localm.b;
    }
  }
  
  private void i()
  {
    this.f *= 2;
    this.h = ((m[])Arrays.copyOf(this.h, this.f));
    Object localObject = this.n;
    ((n)localObject).c = ((t[])Arrays.copyOf(((n)localObject).c, this.f));
    int i1 = this.f;
    this.j = new boolean[i1];
    this.g = i1;
    this.m = i1;
    localObject = b;
    if (localObject != null)
    {
      ((q)localObject).d += 1L;
      ((q)localObject).o = Math.max(((q)localObject).o, i1);
      localObject = b;
      ((q)localObject).A = ((q)localObject).o;
    }
  }
  
  private void j()
  {
    for (int i1 = 0;; i1++)
    {
      Object localObject = this.h;
      if (i1 >= localObject.length) {
        break;
      }
      localObject = localObject[i1];
      if (localObject != null) {
        this.n.a.a(localObject);
      }
      this.h[i1] = null;
    }
  }
  
  public m a(t paramt1, t paramt2, int paramInt1, int paramInt2)
  {
    m localm = b();
    localm.a(paramt1, paramt2, paramInt1);
    if (paramInt2 != 6) {
      localm.a(this, paramInt2);
    }
    a(localm);
    return localm;
  }
  
  public t a()
  {
    Object localObject = b;
    if (localObject != null) {
      ((q)localObject).n += 1L;
    }
    if (this.k + 1 >= this.g) {
      i();
    }
    localObject = a(t.a.c, null);
    this.c += 1;
    this.k += 1;
    int i1 = this.c;
    ((t)localObject).c = i1;
    this.n.c[i1] = localObject;
    return (t)localObject;
  }
  
  public t a(int paramInt, String paramString)
  {
    q localq = b;
    if (localq != null) {
      localq.l += 1L;
    }
    if (this.k + 1 >= this.g) {
      i();
    }
    paramString = a(t.a.d, paramString);
    this.c += 1;
    this.k += 1;
    int i1 = this.c;
    paramString.c = i1;
    paramString.e = paramInt;
    this.n.c[i1] = paramString;
    this.e.a(paramString);
    return paramString;
  }
  
  public t a(Object paramObject)
  {
    Object localObject = null;
    if (paramObject == null) {
      return null;
    }
    if (this.k + 1 >= this.g) {
      i();
    }
    if ((paramObject instanceof z))
    {
      z localz = (z)paramObject;
      localObject = localz.e();
      paramObject = localObject;
      if (localObject == null)
      {
        localz.a(this.n);
        paramObject = localz.e();
      }
      int i1 = ((t)paramObject).c;
      if ((i1 != -1) && (i1 <= this.c))
      {
        localObject = paramObject;
        if (this.n.c[i1] != null) {}
      }
      else
      {
        if (((t)paramObject).c != -1) {
          ((t)paramObject).b();
        }
        this.c += 1;
        this.k += 1;
        i1 = this.c;
        ((t)paramObject).c = i1;
        ((t)paramObject).h = t.a.a;
        this.n.c[i1] = paramObject;
        localObject = paramObject;
      }
    }
    return (t)localObject;
  }
  
  public void a(B paramB1, B paramB2, float paramFloat, int paramInt)
  {
    t localt1 = a(paramB1.a(z.c.b));
    t localt2 = a(paramB1.a(z.c.c));
    t localt3 = a(paramB1.a(z.c.d));
    t localt4 = a(paramB1.a(z.c.e));
    paramB1 = a(paramB2.a(z.c.b));
    t localt5 = a(paramB2.a(z.c.c));
    t localt6 = a(paramB2.a(z.c.d));
    paramB2 = a(paramB2.a(z.c.e));
    m localm = b();
    double d1 = paramFloat;
    double d2 = Math.sin(d1);
    double d3 = paramInt;
    localm.b(localt2, localt4, localt5, paramB2, (float)(d2 * d3));
    a(localm);
    paramB2 = b();
    paramB2.b(localt1, localt3, paramB1, localt6, (float)(Math.cos(d1) * d3));
    a(paramB2);
  }
  
  public void a(m paramm)
  {
    if (paramm == null) {
      return;
    }
    Object localObject = b;
    if (localObject != null)
    {
      ((q)localObject).f += 1L;
      if (paramm.e) {
        ((q)localObject).g += 1L;
      }
    }
    if ((this.l + 1 >= this.m) || (this.k + 1 >= this.g)) {
      i();
    }
    int i1 = 0;
    int i2 = 0;
    if (!paramm.e)
    {
      d(paramm);
      if (paramm.c()) {
        return;
      }
      paramm.a();
      i1 = i2;
      if (paramm.a(this))
      {
        localObject = a();
        paramm.a = ((t)localObject);
        c(paramm);
        this.r.a(paramm);
        a(this.r, true);
        if (((t)localObject).d == -1)
        {
          if (paramm.a == localObject)
          {
            t localt = paramm.c((t)localObject);
            if (localt != null)
            {
              localObject = b;
              if (localObject != null) {
                ((q)localObject).j += 1L;
              }
              paramm.d(localt);
            }
          }
          if (!paramm.e) {
            paramm.a.c(paramm);
          }
          this.l -= 1;
        }
        i1 = 1;
      }
      if (!paramm.b()) {
        return;
      }
    }
    if (i1 == 0) {
      c(paramm);
    }
  }
  
  void a(m paramm, int paramInt1, int paramInt2)
  {
    paramm.a(a(paramInt2, null), paramInt1);
  }
  
  void a(p.a parama)
    throws Exception
  {
    q localq = b;
    if (localq != null)
    {
      localq.s += 1L;
      localq.t = Math.max(localq.t, this.k);
      localq = b;
      localq.u = Math.max(localq.u, this.l);
    }
    d((m)parama);
    b(parama);
    a(parama, false);
    h();
  }
  
  public void a(t paramt, int paramInt)
  {
    int i1 = paramt.d;
    m localm;
    if (i1 != -1)
    {
      localm = this.h[i1];
      if (localm.e)
      {
        localm.b = paramInt;
      }
      else if (localm.d.a == 0)
      {
        localm.e = true;
        localm.b = paramInt;
      }
      else
      {
        localm = b();
        localm.c(paramt, paramInt);
        a(localm);
      }
    }
    else
    {
      localm = b();
      localm.b(paramt, paramInt);
      a(localm);
    }
  }
  
  public void a(t paramt1, t paramt2, int paramInt1, float paramFloat, t paramt3, t paramt4, int paramInt2, int paramInt3)
  {
    m localm = b();
    localm.a(paramt1, paramt2, paramInt1, paramFloat, paramt3, paramt4, paramInt2);
    if (paramInt3 != 6) {
      localm.a(this, paramInt3);
    }
    a(localm);
  }
  
  public void a(t paramt1, t paramt2, t paramt3, t paramt4, float paramFloat, int paramInt)
  {
    m localm = b();
    localm.a(paramt1, paramt2, paramt3, paramt4, paramFloat);
    if (paramInt != 6) {
      localm.a(this, paramInt);
    }
    a(localm);
  }
  
  public void a(t paramt1, t paramt2, boolean paramBoolean)
  {
    m localm = b();
    t localt = c();
    localt.e = 0;
    localm.a(paramt1, paramt2, localt, 0);
    if (paramBoolean) {
      a(localm, (int)(localm.d.b(localt) * -1.0F), 1);
    }
    a(localm);
  }
  
  public int b(Object paramObject)
  {
    paramObject = ((z)paramObject).e();
    if (paramObject != null) {
      return (int)(((t)paramObject).f + 0.5F);
    }
    return 0;
  }
  
  public m b()
  {
    m localm = (m)this.n.a.a();
    if (localm == null) {
      localm = new m(this.n);
    } else {
      localm.d();
    }
    t.a();
    return localm;
  }
  
  public void b(t paramt1, t paramt2, int paramInt1, int paramInt2)
  {
    m localm = b();
    t localt = c();
    localt.e = 0;
    localm.a(paramt1, paramt2, localt, paramInt1);
    if (paramInt2 != 6) {
      a(localm, (int)(localm.d.b(localt) * -1.0F), paramInt2);
    }
    a(localm);
  }
  
  public void b(t paramt1, t paramt2, boolean paramBoolean)
  {
    m localm = b();
    t localt = c();
    localt.e = 0;
    localm.b(paramt1, paramt2, localt, 0);
    if (paramBoolean) {
      a(localm, (int)(localm.d.b(localt) * -1.0F), 1);
    }
    a(localm);
  }
  
  public t c()
  {
    Object localObject = b;
    if (localObject != null) {
      ((q)localObject).m += 1L;
    }
    if (this.k + 1 >= this.g) {
      i();
    }
    localObject = a(t.a.c, null);
    this.c += 1;
    this.k += 1;
    int i1 = this.c;
    ((t)localObject).c = i1;
    this.n.c[i1] = localObject;
    return (t)localObject;
  }
  
  public void c(t paramt1, t paramt2, int paramInt1, int paramInt2)
  {
    m localm = b();
    t localt = c();
    localt.e = 0;
    localm.b(paramt1, paramt2, localt, paramInt1);
    if (paramInt2 != 6) {
      a(localm, (int)(localm.d.b(localt) * -1.0F), paramInt2);
    }
    a(localm);
  }
  
  public n d()
  {
    return this.n;
  }
  
  public void f()
    throws Exception
  {
    q localq = b;
    if (localq != null) {
      localq.e += 1L;
    }
    if (this.i)
    {
      localq = b;
      if (localq != null) {
        localq.q += 1L;
      }
      int i1 = 0;
      for (int i2 = 0; i2 < this.l; i2++) {
        if (!this.h[i2].e)
        {
          i2 = i1;
          break label80;
        }
      }
      i2 = 1;
      label80:
      if (i2 == 0)
      {
        a(this.e);
      }
      else
      {
        localq = b;
        if (localq != null) {
          localq.p += 1L;
        }
        h();
      }
    }
    else
    {
      a(this.e);
    }
  }
  
  public void g()
  {
    for (int i1 = 0;; i1++)
    {
      localObject = this.n;
      t[] arrayOft = ((n)localObject).c;
      if (i1 >= arrayOft.length) {
        break;
      }
      localObject = arrayOft[i1];
      if (localObject != null) {
        ((t)localObject).b();
      }
    }
    ((n)localObject).b.a(this.o, this.p);
    this.p = 0;
    Arrays.fill(this.n.c, null);
    Object localObject = this.d;
    if (localObject != null) {
      ((HashMap)localObject).clear();
    }
    this.c = 0;
    this.e.clear();
    this.k = 1;
    for (i1 = 0; i1 < this.l; i1++) {
      this.h[i1].c = false;
    }
    j();
    this.l = 0;
  }
  
  static abstract interface a
  {
    public abstract t a(p paramp, boolean[] paramArrayOfBoolean);
    
    public abstract void a(a parama);
    
    public abstract void a(t paramt);
    
    public abstract void clear();
    
    public abstract t getKey();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */