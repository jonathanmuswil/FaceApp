final class lz<T>
  implements ey<T>
{
  private volatile ey<T> a;
  private volatile boolean b;
  private T c;
  
  lz(ey<T> paramey)
  {
    dx.a(paramey);
    this.a = ((ey)paramey);
  }
  
  public final T get()
  {
    if (!this.b) {
      try
      {
        if (!this.b)
        {
          Object localObject1 = this.a.get();
          this.c = localObject1;
          this.b = true;
          this.a = null;
          return (T)localObject1;
        }
      }
      finally {}
    }
    return (T)this.c;
  }
  
  public final String toString()
  {
    Object localObject1 = this.a;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = String.valueOf(this.c);
      localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 25);
      ((StringBuilder)localObject2).append("<supplier that returned ");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(">");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = String.valueOf(localObject2);
    localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 19);
    ((StringBuilder)localObject2).append("Suppliers.memoize(");
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(")");
    return ((StringBuilder)localObject2).toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */