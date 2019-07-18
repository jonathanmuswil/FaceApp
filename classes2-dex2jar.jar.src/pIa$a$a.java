import java.util.NoSuchElementException;

public final class pIa$a$a
{
  public final pIa.a a(String paramString)
  {
    oXa.b(paramString, "tag");
    for (pIa.a locala : pIa.a.values()) {
      if (oXa.a(locala.a(), paramString)) {
        return locala;
      }
    }
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */