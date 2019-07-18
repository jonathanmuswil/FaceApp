import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class gd<K, V>
  extends ud<K, V>
  implements Map<K, V>
{
  od<K, V> h;
  
  public gd() {}
  
  public gd(int paramInt)
  {
    super(paramInt);
  }
  
  public gd(ud paramud)
  {
    super(paramud);
  }
  
  private od<K, V> b()
  {
    if (this.h == null) {
      this.h = new fd(this);
    }
    return this.h;
  }
  
  public boolean a(Collection<?> paramCollection)
  {
    return od.c(this, paramCollection);
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    return b().d();
  }
  
  public Set<K> keySet()
  {
    return b().e();
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    a(this.g + paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public Collection<V> values()
  {
    return b().f();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */