import java.util.NoSuchElementException;

public enum Zma$a$b
{
  public static final Zma.a.b.a f = new Zma.a.b.a(null);
  private final int g;
  
  static
  {
    b localb1 = new b("UNKNOWN", 0, -1);
    a = localb1;
    b localb2 = new b("NO_FACE", 1, 0);
    b = localb2;
    b localb3 = new b("HAS_FACE", 2, 1);
    c = localb3;
    b localb4 = new b("FACEAPP_GENERATED", 3, 2);
    d = localb4;
    e = new b[] { localb1, localb2, localb3, localb4 };
  }
  
  private Zma$a$b(int paramInt)
  {
    this.g = paramInt;
  }
  
  public final int getId()
  {
    return this.g;
  }
  
  public static final class a
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
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Zma$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */