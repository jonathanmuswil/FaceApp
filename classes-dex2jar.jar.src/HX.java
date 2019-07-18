import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class hx
{
  private static final Class<?> a = ;
  static final hx b = new hx(true);
  private final Map<Object, Object> c;
  
  hx()
  {
    this.c = new HashMap();
  }
  
  private hx(boolean paramBoolean)
  {
    this.c = Collections.emptyMap();
  }
  
  public static hx a()
  {
    return gx.a();
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */