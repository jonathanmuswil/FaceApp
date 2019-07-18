import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

final class py<E>
  extends Lw<E>
{
  private static final py<Object> b;
  private final List<E> c;
  
  static
  {
    py localpy = new py(new ArrayList(0));
    b = localpy;
    localpy.c();
  }
  
  private py(List<E> paramList)
  {
    this.c = paramList;
  }
  
  public static <E> py<E> n()
  {
    return b;
  }
  
  public final void add(int paramInt, E paramE)
  {
    m();
    this.c.add(paramInt, paramE);
    this.modCount += 1;
  }
  
  public final E get(int paramInt)
  {
    return (E)this.c.get(paramInt);
  }
  
  public final E remove(int paramInt)
  {
    m();
    Object localObject = this.c.remove(paramInt);
    this.modCount += 1;
    return (E)localObject;
  }
  
  public final E set(int paramInt, E paramE)
  {
    m();
    paramE = this.c.set(paramInt, paramE);
    this.modCount += 1;
    return paramE;
  }
  
  public final int size()
  {
    return this.c.size();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/py.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */