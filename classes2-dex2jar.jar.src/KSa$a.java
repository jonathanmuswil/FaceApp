final class KSa$a<T, U>
  extends cVa<T, U>
{
  final DRa<? super T, ? extends U> f;
  
  KSa$a(PRa<? super U> paramPRa, DRa<? super T, ? extends U> paramDRa)
  {
    super(paramPRa);
    this.f = paramDRa;
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
      this.a.a(null);
      return;
    }
    try
    {
      paramT = this.f.apply(paramT);
      ORa.a(paramT, "The mapper function returned a null value.");
      this.a.a(paramT);
      return;
    }
    catch (Throwable paramT)
    {
      b(paramT);
    }
  }
  
  public boolean c(T paramT)
  {
    if (this.d) {
      return false;
    }
    try
    {
      paramT = this.f.apply(paramT);
      ORa.a(paramT, "The mapper function returned a null value.");
      return this.a.c(paramT);
    }
    catch (Throwable paramT)
    {
      b(paramT);
    }
    return true;
  }
  
  public U poll()
    throws Exception
  {
    Object localObject = this.c.poll();
    if (localObject != null)
    {
      localObject = this.f.apply(localObject);
      ORa.a(localObject, "The mapper function returned a null value.");
    }
    else
    {
      localObject = null;
    }
    return (U)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */