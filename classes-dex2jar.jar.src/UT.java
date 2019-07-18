import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class ut
{
  private static final ut a = new ut();
  private final At b;
  private final ConcurrentMap<Class<?>, zt<?>> c = new ConcurrentHashMap();
  
  private ut()
  {
    Object localObject1 = null;
    int i = 0;
    while (i <= 0)
    {
      localObject2 = a(new String[] { "com.google.protobuf.AndroidProto3SchemaFactory" }[0]);
      localObject1 = localObject2;
      if (localObject2 != null) {
        break;
      }
      i++;
      localObject1 = localObject2;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new Zs();
    }
    this.b = ((At)localObject2);
  }
  
  private static At a(String paramString)
  {
    try
    {
      paramString = (At)Class.forName(paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      return paramString;
    }
    catch (Throwable paramString) {}
    return null;
  }
  
  public static ut a()
  {
    return a;
  }
  
  public final <T> zt<T> a(Class<T> paramClass)
  {
    Gs.a(paramClass, "messageType");
    zt localzt = (zt)this.c.get(paramClass);
    Object localObject = localzt;
    if (localzt == null)
    {
      localObject = this.b.c(paramClass);
      Gs.a(paramClass, "messageType");
      Gs.a(localObject, "schema");
      paramClass = (zt)this.c.putIfAbsent(paramClass, localObject);
      if (paramClass != null) {
        localObject = paramClass;
      }
    }
    return (zt<T>)localObject;
  }
  
  public final <T> zt<T> a(T paramT)
  {
    return a(paramT.getClass());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */