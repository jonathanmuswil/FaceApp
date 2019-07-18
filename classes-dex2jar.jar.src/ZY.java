import java.util.Iterator;
import java.util.NoSuchElementException;

final class zy
  implements Iterator<Object>
{
  public final boolean hasNext()
  {
    return false;
  }
  
  public final Object next()
  {
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */