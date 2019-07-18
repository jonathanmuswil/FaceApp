import java.util.NoSuchElementException;

public final class wwa$c
{
  public final wwa a(int paramInt)
  {
    for (wwa localwwa : )
    {
      int k;
      if (localwwa.getId() == paramInt) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0) {
        return localwwa;
      }
    }
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wwa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */