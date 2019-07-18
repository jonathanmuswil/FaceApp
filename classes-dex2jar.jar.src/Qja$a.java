import java.util.Comparator;
import java.util.NoSuchElementException;

public final class qja$a
{
  public final qja a(String paramString)
  {
    oXa.b(paramString, "sku");
    for (qja localqja : qja.values()) {
      if (oXa.a(localqja.f(), paramString)) {
        return localqja;
      }
    }
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  public final qja[] a()
  {
    return qja.a();
  }
  
  public final Comparator<qja> b()
  {
    return qja.b();
  }
  
  public final qja[] c()
  {
    return qja.c();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qja$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */