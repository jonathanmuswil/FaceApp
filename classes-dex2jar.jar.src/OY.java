import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class oy
{
  private static final oy a = new oy();
  private final sy b = new Rx();
  private final ConcurrentMap<Class<?>, ry<?>> c = new ConcurrentHashMap();
  
  public static oy a()
  {
    return a;
  }
  
  public final <T> ry<T> a(Class<T> paramClass)
  {
    ux.a(paramClass, "messageType");
    ry localry = (ry)this.c.get(paramClass);
    Object localObject = localry;
    if (localry == null)
    {
      localObject = this.b.c(paramClass);
      ux.a(paramClass, "messageType");
      ux.a(localObject, "schema");
      paramClass = (ry)this.c.putIfAbsent(paramClass, localObject);
      if (paramClass != null) {
        localObject = paramClass;
      }
    }
    return (ry<T>)localObject;
  }
  
  public final <T> ry<T> a(T paramT)
  {
    return a(paramT.getClass());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */