import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class qs
{
  private static final Class<?> a = ;
  static final qs b = new qs(true);
  private final Map<Object, Object<?, ?>> c;
  
  qs()
  {
    this.c = new HashMap();
  }
  
  private qs(boolean paramBoolean)
  {
    this.c = Collections.emptyMap();
  }
  
  public static qs a()
  {
    return ps.a();
  }
  
  private static Class<?> b()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.Extension");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */