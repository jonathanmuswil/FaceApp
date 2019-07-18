public class sh<T>
  implements Wf<T>
{
  protected final T a;
  
  public sh(T paramT)
  {
    Nj.a(paramT);
    this.a = paramT;
  }
  
  public void a() {}
  
  public final int b()
  {
    return 1;
  }
  
  public Class<T> c()
  {
    return this.a.getClass();
  }
  
  public final T get()
  {
    return (T)this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */