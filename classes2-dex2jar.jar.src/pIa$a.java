import java.util.NoSuchElementException;

public enum pIa$a
{
  public static final pIa.a.a e = new pIa.a.a(null);
  private final String f;
  
  static
  {
    a locala1 = new a("EDITOR", 0, "fr_image_editor");
    a = locala1;
    a locala2 = new a("FUN", 1, "fr_fun");
    b = locala2;
    a locala3 = new a("LAYOUTS", 2, "fr_layouts");
    c = locala3;
    d = new a[] { locala1, locala2, locala3 };
  }
  
  private pIa$a(String paramString)
  {
    this.f = paramString;
  }
  
  public final String a()
  {
    return this.f;
  }
  
  public static final class a
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */