final class BSa$a<T, K>
  extends cVa<T, T>
{
  final DRa<? super T, K> f;
  final xRa<? super K, ? super K> g;
  K h;
  boolean i;
  
  BSa$a(PRa<? super T> paramPRa, DRa<? super T, K> paramDRa, xRa<? super K, ? super K> paramxRa)
  {
    super(paramPRa);
    this.f = paramDRa;
    this.g = paramxRa;
  }
  
  public int a(int paramInt)
  {
    return b(paramInt);
  }
  
  public void a(T paramT)
  {
    if (!c(paramT)) {
      this.b.a(1L);
    }
  }
  
  public boolean c(T paramT)
  {
    if (this.d) {
      return false;
    }
    if (this.e != 0) {
      return this.a.c(paramT);
    }
    try
    {
      Object localObject = this.f.apply(paramT);
      if (this.i)
      {
        boolean bool = this.g.test(this.h, localObject);
        this.h = localObject;
        if (bool) {
          return false;
        }
      }
      else
      {
        this.i = true;
        this.h = localObject;
      }
      this.a.a(paramT);
      return true;
    }
    catch (Throwable paramT)
    {
      b(paramT);
    }
    return true;
  }
  
  public T poll()
    throws Exception
  {
    for (;;)
    {
      Object localObject1 = this.c.poll();
      if (localObject1 == null) {
        return null;
      }
      Object localObject2 = this.f.apply(localObject1);
      if (!this.i)
      {
        this.i = true;
        this.h = localObject2;
        return (T)localObject1;
      }
      if (!this.g.test(this.h, localObject2))
      {
        this.h = localObject2;
        return (T)localObject1;
      }
      this.h = localObject2;
      if (this.e != 1) {
        this.b.a(1L);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/BSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */