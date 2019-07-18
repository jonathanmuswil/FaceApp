import java.util.ListIterator;

public abstract class hv<E>
  extends gv<E>
  implements ListIterator<E>
{
  @Deprecated
  public final void add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void set(E paramE)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */