import java.util.NoSuchElementException;

public final class XDa$b$a
{
  public final XDa.b a(String paramString)
  {
    oXa.b(paramString, "targetTag");
    for (XDa.b localb : XDa.b.values()) {
      if (oXa.a(localb.c(), paramString)) {
        return localb;
      }
    }
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/XDa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */