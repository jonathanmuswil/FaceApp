import java.util.AbstractCollection;
import java.util.List;

final class uz<E>
  extends mz<E>
{
  private final sz<E> c;
  
  uz(sz<E> paramsz, int paramInt)
  {
    super(paramsz.size(), paramInt);
    this.c = paramsz;
  }
  
  protected final E a(int paramInt)
  {
    return (E)this.c.get(paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */