import java.io.Serializable;

final class fz<T>
  implements ey<T>, Serializable
{
  private final ey<T> a;
  private volatile transient boolean b;
  private transient T c;
  
  fz(ey<T> paramey)
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
          return (T)localObject1;
        }
      }
      finally {}
    }
    return (T)this.c;
  }
  
  public final String toString()
  {
    if (this.b)
    {
      localObject1 = String.valueOf(this.c);
      localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 25);
      ((StringBuilder)localObject2).append("<supplier that returned ");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(">");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    else
    {
      localObject2 = this.a;
    }
    Object localObject2 = String.valueOf(localObject2);
    Object localObject1 = new StringBuilder(String.valueOf(localObject2).length() + 19);
    ((StringBuilder)localObject1).append("Suppliers.memoize(");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(")");
    return ((StringBuilder)localObject1).toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */