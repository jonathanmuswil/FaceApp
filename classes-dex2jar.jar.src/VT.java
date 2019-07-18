import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

final class vt<E>
  extends Tr<E>
{
  private static final vt<Object> b;
  private final List<E> c;
  
  static
  {
    vt localvt = new vt();
    b = localvt;
    localvt.ma();
  }
  
  vt()
  {
    this(new ArrayList(10));
  }
  
  private vt(List<E> paramList)
  {
    this.c = paramList;
  }
  
  public static <E> vt<E> n()
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */