public class z
{
  private J a = new J(this);
  final B b;
  final z.c c;
  z d;
  public int e = 0;
  int f = -1;
  private z.b g = z.b.a;
  private z.a h = z.a.a;
  private int i = 0;
  t j;
  
  public z(B paramB, z.c paramc)
  {
    this.b = paramB;
    this.c = paramc;
  }
  
  public int a()
  {
    return this.i;
  }
  
  public void a(n paramn)
  {
    paramn = this.j;
    if (paramn == null) {
      this.j = new t(t.a.a, null);
    } else {
      paramn.b();
    }
  }
  
  public boolean a(z paramz)
  {
    boolean bool1 = false;
    if (paramz == null) {
      return false;
    }
    z.c localc1 = paramz.h();
    z.c localc2 = this.c;
    if (localc1 == localc2) {
      return (localc2 != z.c.f) || ((paramz.c().x()) && (c().x()));
    }
    switch (y.a[localc2.ordinal()])
    {
    default: 
      throw new AssertionError(this.c.name());
    case 6: 
    case 7: 
    case 8: 
    case 9: 
      return false;
    case 4: 
    case 5: 
      if ((localc1 != z.c.c) && (localc1 != z.c.e)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      bool1 = bool2;
      if ((paramz.c() instanceof F)) {
        if ((!bool2) && (localc1 != z.c.i)) {
          bool1 = false;
        } else {
          bool1 = true;
        }
      }
      return bool1;
    case 2: 
    case 3: 
      if ((localc1 != z.c.b) && (localc1 != z.c.d)) {
        bool1 = false;
      } else {
        bool1 = true;
      }
      bool2 = bool1;
      if ((paramz.c() instanceof F)) {
        if ((!bool1) && (localc1 != z.c.h)) {
          bool2 = false;
        } else {
          bool2 = true;
        }
      }
      return bool2;
    }
    boolean bool2 = bool1;
    if (localc1 != z.c.f)
    {
      bool2 = bool1;
      if (localc1 != z.c.h)
      {
        bool2 = bool1;
        if (localc1 != z.c.i) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public boolean a(z paramz, int paramInt1, int paramInt2, z.b paramb, int paramInt3, boolean paramBoolean)
  {
    if (paramz == null)
    {
      this.d = null;
      this.e = 0;
      this.f = -1;
      this.g = z.b.a;
      this.i = 2;
      return true;
    }
    if ((!paramBoolean) && (!a(paramz))) {
      return false;
    }
    this.d = paramz;
    if (paramInt1 > 0) {
      this.e = paramInt1;
    } else {
      this.e = 0;
    }
    this.f = paramInt2;
    this.g = paramb;
    this.i = paramInt3;
    return true;
  }
  
  public boolean a(z paramz, int paramInt1, z.b paramb, int paramInt2)
  {
    return a(paramz, paramInt1, -1, paramb, paramInt2, false);
  }
  
  public int b()
  {
    if (this.b.r() == 8) {
      return 0;
    }
    if (this.f > -1)
    {
      z localz = this.d;
      if ((localz != null) && (localz.b.r() == 8)) {
        return this.f;
      }
    }
    return this.e;
  }
  
  public B c()
  {
    return this.b;
  }
  
  public J d()
  {
    return this.a;
  }
  
  public t e()
  {
    return this.j;
  }
  
  public z.b f()
  {
    return this.g;
  }
  
  public z g()
  {
    return this.d;
  }
  
  public z.c h()
  {
    return this.c;
  }
  
  public boolean i()
  {
    boolean bool;
    if (this.d != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void j()
  {
    this.d = null;
    this.e = 0;
    this.f = -1;
    this.g = z.b.b;
    this.i = 0;
    this.h = z.a.a;
    this.a.d();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b.f());
    localStringBuilder.append(":");
    localStringBuilder.append(this.c.toString());
    return localStringBuilder.toString();
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static enum b
  {
    private b() {}
  }
  
  public static enum c
  {
    private c() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */