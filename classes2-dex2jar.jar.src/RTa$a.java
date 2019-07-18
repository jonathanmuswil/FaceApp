final class rTa$a<T, K>
  extends aSa<T, T>
{
  final DRa<? super T, K> f;
  final xRa<? super K, ? super K> g;
  K h;
  boolean i;
  
  rTa$a(VQa<? super T> paramVQa, DRa<? super T, K> paramDRa, xRa<? super K, ? super K> paramxRa)
  {
    super(paramVQa);
    this.f = paramDRa;
    this.g = paramxRa;
  }
  
  public int a(int paramInt)
  {
    return b(paramInt);
  }
  
  public void a(T paramT)
  {
    if (this.d) {
      return;
    }
    if (this.e != 0)
    {
      this.a.a(paramT);
      return;
    }
    try
    {
      Object localObject = this.f.apply(paramT);
      if (this.i)
      {
        boolean bool = this.g.test(this.h, localObject);
        this.h = localObject;
        if (!bool) {}
      }
      else
      {
        this.i = true;
        this.h = localObject;
      }
      this.a.a(paramT);
      return;
    }
    catch (Throwable paramT)
    {
      b(paramT);
    }
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
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */