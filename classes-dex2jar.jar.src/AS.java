import java.util.Iterator;
import java.util.NoSuchElementException;

final class as
  implements Iterator
{
  private int a = 0;
  private final int b = this.c.size();
  
  as(_r param_r) {}
  
  private final byte nextByte()
  {
    try
    {
      _r local_r = this.c;
      int i = this.a;
      this.a = (i + 1);
      byte b1 = local_r.p(i);
      return b1;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new NoSuchElementException(localIndexOutOfBoundsException.getMessage());
    }
  }
  
  public final boolean hasNext()
  {
    return this.a < this.b;
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */