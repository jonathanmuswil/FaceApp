import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public abstract class wz<K, V>
  implements Serializable, Map<K, V>
{
  private static final Map.Entry<?, ?>[] a = new Map.Entry[0];
  private transient yz<Map.Entry<K, V>> b;
  private transient yz<K> c;
  private transient pz<V> d;
  
  public static <K, V> wz<K, V> a()
  {
    return Az.e;
  }
  
  public static <K, V> wz<K, V> a(Map<? extends K, ? extends V> paramMap)
  {
    if (((paramMap instanceof wz)) && (!(paramMap instanceof SortedMap)))
    {
      paramMap = (wz)paramMap;
      paramMap.e();
      return paramMap;
    }
    paramMap = paramMap.entrySet();
    int i;
    if ((paramMap instanceof Collection)) {
      i = paramMap.size();
    } else {
      i = 4;
    }
    xz localxz = new xz(i);
    localxz.a(paramMap);
    return localxz.a();
  }
  
  abstract yz<Map.Entry<K, V>> b();
  
  abstract yz<K> c();
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean containsKey(Object paramObject)
  {
    return get(paramObject) != null;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return ((pz)values()).contains(paramObject);
  }
  
  abstract pz<V> d();
  
  abstract boolean e();
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = (Map)paramObject;
      return entrySet().equals(((Map)paramObject).entrySet());
    }
    return false;
  }
  
  public abstract V get(Object paramObject);
  
  public final V getOrDefault(Object paramObject, V paramV)
  {
    paramObject = get(paramObject);
    if (paramObject != null) {
      return (V)paramObject;
    }
    return paramV;
  }
  
  public int hashCode()
  {
    return fv.a((yz)entrySet());
  }
  
  public boolean isEmpty()
  {
    return size() == 0;
  }
  
  @Deprecated
  public final V put(K paramK, V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final V remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public String toString()
  {
    int i = size();
    nz.a(i, "size");
    StringBuilder localStringBuilder = new StringBuilder((int)Math.min(i << 3, 1073741824L));
    localStringBuilder.append('{');
    Iterator localIterator = entrySet().iterator();
    i = 1;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (i == 0) {
        localStringBuilder.append(", ");
      }
      i = 0;
      localStringBuilder.append(localEntry.getKey());
      localStringBuilder.append('=');
      localStringBuilder.append(localEntry.getValue());
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */