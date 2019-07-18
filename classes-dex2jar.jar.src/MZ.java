import java.util.NoSuchElementException;

abstract class mz<E>
  extends hv<E>
{
  private final int a;
  private int b;
  
  protected mz(int paramInt1, int paramInt2)
  {
    dx.b(paramInt2, paramInt1);
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  protected abstract E a(int paramInt);
  
  public final boolean hasNext()
  {
    return this.b < this.a;
  }
  
  public final boolean hasPrevious()
  {
    return this.b > 0;
  }
  
  public final E next()
  {
    if (hasNext())
    {
      int i = this.b;
      this.b = (i + 1);
      return (E)a(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return this.b;
  }
  
  public final E previous()
  {
    if (hasPrevious())
    {
      int i = this.b - 1;
      this.b = i;
      return (E)a(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return this.b - 1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */