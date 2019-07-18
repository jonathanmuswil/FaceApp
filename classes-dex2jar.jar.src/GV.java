import java.util.Iterator;

public abstract class gv<E>
  implements Iterator<E>
{
  @Deprecated
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */