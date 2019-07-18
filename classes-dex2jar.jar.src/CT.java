import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ct<K, V>
  extends LinkedHashMap<K, V>
{
  private static final ct a;
  private boolean b = true;
  
  static
  {
    ct localct = new ct();
    a = localct;
    localct.b = false;
  }
  
  private ct() {}
  
  private ct(Map<K, V> paramMap)
  {
    super(paramMap);
  }
  
  private static int a(Object paramObject)
  {
    if ((paramObject instanceof byte[])) {
      return Gs.a((byte[])paramObject);
    }
    if (!(paramObject instanceof Hs)) {
      return paramObject.hashCode();
    }
    throw new UnsupportedOperationException();
  }
  
  public static <K, V> ct<K, V> b()
  {
    return a;
  }
  
  private final void e()
  {
    if (this.b) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void a(ct<K, V> paramct)
  {
    e();
    if (!paramct.isEmpty()) {
      putAll(paramct);
    }
  }
  
  public final boolean a()
  {
    return this.b;
  }
  
  public final ct<K, V> c()
  {
    if (isEmpty()) {
      return new ct();
    }
    return new ct(this);
  }
  
  public final void clear()
  {
    e();
    super.clear();
  }
  
  public final void d()
  {
    this.b = false;
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    if (isEmpty()) {
      return Collections.emptySet();
    }
    return super.entrySet();
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Map))
    {
      paramObject = (Map)paramObject;
      if (this != paramObject)
      {
        if (size() != ((Map)paramObject).size()) {}
        for (;;)
        {
          i = 0;
          break label165;
          Iterator localIterator = entrySet().iterator();
          boolean bool;
          do
          {
            if (!localIterator.hasNext()) {
              break label163;
            }
            Object localObject1 = (Map.Entry)localIterator.next();
            if (!((Map)paramObject).containsKey(((Map.Entry)localObject1).getKey())) {
              break;
            }
            Object localObject2 = ((Map.Entry)localObject1).getValue();
            localObject1 = ((Map)paramObject).get(((Map.Entry)localObject1).getKey());
            if (((localObject2 instanceof byte[])) && ((localObject1 instanceof byte[]))) {
              bool = Arrays.equals((byte[])localObject2, (byte[])localObject1);
            } else {
              bool = localObject2.equals(localObject1);
            }
          } while (bool);
        }
      }
      label163:
      int i = 1;
      label165:
      if (i != 0) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int j = a(localEntry.getKey());
      i += (a(localEntry.getValue()) ^ j);
    }
    return i;
  }
  
  public final V put(K paramK, V paramV)
  {
    e();
    Gs.a(paramK);
    Gs.a(paramV);
    return (V)super.put(paramK, paramV);
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    e();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      Gs.a(localObject);
      Gs.a(paramMap.get(localObject));
    }
    super.putAll(paramMap);
  }
  
  public final V remove(Object paramObject)
  {
    e();
    return (V)super.remove(paramObject);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */