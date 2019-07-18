public class rd<T>
  implements qd<T>
{
  private final Object[] a;
  private int b;
  
  public rd(int paramInt)
  {
    if (paramInt > 0)
    {
      this.a = new Object[paramInt];
      return;
    }
    throw new IllegalArgumentException("The max pool size must be > 0");
  }
  
  private boolean b(T paramT)
  {
    for (int i = 0; i < this.b; i++) {
      if (this.a[i] == paramT) {
        return true;
      }
    }
    return false;
  }
  
  public T a()
  {
    int i = this.b;
    if (i > 0)
    {
      int j = i - 1;
      Object[] arrayOfObject = this.a;
      Object localObject = arrayOfObject[j];
      arrayOfObject[j] = null;
      this.b = (i - 1);
      return (T)localObject;
    }
    return null;
  }
  
  public boolean a(T paramT)
  {
    if (!b(paramT))
    {
      int i = this.b;
      Object[] arrayOfObject = this.a;
      if (i < arrayOfObject.length)
      {
        arrayOfObject[i] = paramT;
        this.b = (i + 1);
        return true;
      }
      return false;
    }
    throw new IllegalStateException("Already in the pool!");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */