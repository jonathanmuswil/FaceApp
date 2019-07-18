import java.io.ObjectStreamException;
import java.io.Serializable;

class hXa$a
  implements Serializable
{
  private static final a a = new a();
  
  private Object readResolve()
    throws ObjectStreamException
  {
    return a;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hXa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */