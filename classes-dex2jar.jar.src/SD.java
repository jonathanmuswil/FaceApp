public class sd<T>
  extends rd<T>
{
  private final Object c = new Object();
  
  public sd(int paramInt)
  {
    super(paramInt);
  }
  
  public T a()
  {
    synchronized (this.c)
    {
      Object localObject2 = super.a();
      return (T)localObject2;
    }
  }
  
  public boolean a(T paramT)
  {
    synchronized (this.c)
    {
      boolean bool = super.a(paramT);
      return bool;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */