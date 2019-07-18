import java.util.NoSuchElementException;

public final class Zma$a$b$a
{
  public final Zma.a.b a(int paramInt)
  {
    for (Zma.a.b localb : )
    {
      int k;
      if (localb.getId() == paramInt) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0) {
        return localb;
      }
    }
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Zma$a$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */