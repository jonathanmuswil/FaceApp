import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class ibb
{
  private final Method a;
  private final List<?> b;
  
  ibb(Method paramMethod, List<?> paramList)
  {
    this.a = paramMethod;
    this.b = Collections.unmodifiableList(paramList);
  }
  
  public String toString()
  {
    return String.format("%s.%s() %s", new Object[] { this.a.getDeclaringClass().getName(), this.a.getName(), this.b });
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ibb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */