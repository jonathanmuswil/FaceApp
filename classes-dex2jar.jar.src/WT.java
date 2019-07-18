final class wt
  implements gt
{
  private final it a;
  private final String b;
  private final xt c;
  
  wt(it paramit, String paramString, Object[] paramArrayOfObject)
  {
    this.a = paramit;
    this.b = paramString;
    this.c = new xt(paramit.getClass(), paramString, paramArrayOfObject);
  }
  
  public final int a()
  {
    return xt.d(this.c);
  }
  
  final xt b()
  {
    return this.c;
  }
  
  public final int c()
  {
    return xt.b(this.c);
  }
  
  public final it d()
  {
    return this.a;
  }
  
  public final int e()
  {
    if ((xt.a(this.c) & 0x1) == 1) {
      return Es.e.i;
    }
    return Es.e.j;
  }
  
  public final boolean f()
  {
    return (xt.a(this.c) & 0x2) == 2;
  }
  
  public final int g()
  {
    return xt.c(this.c);
  }
  
  public final int h()
  {
    return xt.e(this.c);
  }
  
  public final int i()
  {
    return xt.f(this.c);
  }
  
  final int[] j()
  {
    return xt.g(this.c);
  }
  
  public final int k()
  {
    return xt.h(this.c);
  }
  
  public final int l()
  {
    return xt.i(this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */