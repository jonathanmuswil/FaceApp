import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class et
  implements dt
{
  public final int a(int paramInt, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (ct)paramObject1;
    if (((LinkedHashMap)paramObject1).isEmpty()) {
      return 0;
    }
    paramObject1 = ((ct)paramObject1).entrySet().iterator();
    if (!((Iterator)paramObject1).hasNext()) {
      return 0;
    }
    paramObject1 = (Map.Entry)((Iterator)paramObject1).next();
    ((Map.Entry)paramObject1).getKey();
    ((Map.Entry)paramObject1).getValue();
    throw new NoSuchMethodError();
  }
  
  public final Object a(Object paramObject1, Object paramObject2)
  {
    ct localct = (ct)paramObject1;
    paramObject2 = (ct)paramObject2;
    paramObject1 = localct;
    if (!((LinkedHashMap)paramObject2).isEmpty())
    {
      paramObject1 = localct;
      if (!localct.a()) {
        paramObject1 = localct.c();
      }
      ((ct)paramObject1).a((ct)paramObject2);
    }
    return paramObject1;
  }
  
  public final boolean a(Object paramObject)
  {
    return !((ct)paramObject).a();
  }
  
  public final Object b(Object paramObject)
  {
    return ct.b().c();
  }
  
  public final Map<?, ?> c(Object paramObject)
  {
    return (ct)paramObject;
  }
  
  public final Object d(Object paramObject)
  {
    ((ct)paramObject).d();
    return paramObject;
  }
  
  public final bt<?, ?> e(Object paramObject)
  {
    throw new NoSuchMethodError();
  }
  
  public final Map<?, ?> f(Object paramObject)
  {
    return (ct)paramObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/et.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */