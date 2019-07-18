import java.io.Serializable;
import java.util.regex.Pattern;

final class xYa$b
  implements Serializable
{
  public static final xYa.b.a a = new xYa.b.a(null);
  private final String b;
  private final int c;
  
  public xYa$b(String paramString, int paramInt)
  {
    this.b = paramString;
    this.c = paramInt;
  }
  
  private final Object readResolve()
  {
    Pattern localPattern = Pattern.compile(this.b, this.c);
    oXa.a(localPattern, "Pattern.compile(pattern, flags)");
    return new xYa(localPattern);
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xYa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */