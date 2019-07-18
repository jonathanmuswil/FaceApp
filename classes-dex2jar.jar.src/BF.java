import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class bf
{
  private static final _e.a<?> a = new af();
  private final Map<Class<?>, _e.a<?>> b = new HashMap();
  
  public <T> _e<T> a(T paramT)
  {
    try
    {
      Nj.a(paramT);
      Object localObject1 = (_e.a)this.b.get(paramT.getClass());
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        Iterator localIterator = this.b.values().iterator();
        do
        {
          localObject2 = localObject1;
          if (!localIterator.hasNext()) {
            break;
          }
          localObject2 = (_e.a)localIterator.next();
        } while (!((_e.a)localObject2).a().isAssignableFrom(paramT.getClass()));
      }
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = a;
      }
      paramT = ((_e.a)localObject1).a(paramT);
      return paramT;
    }
    finally {}
  }
  
  public void a(_e.a<?> parama)
  {
    try
    {
      this.b.put(parama.a(), parama);
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  private static final class a
    implements _e<Object>
  {
    private final Object a;
    
    a(Object paramObject)
    {
      this.a = paramObject;
    }
    
    public Object a()
    {
      return this.a;
    }
    
    public void b() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */