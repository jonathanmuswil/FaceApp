import java.util.HashMap;
import java.util.Map.Entry;

public class f<K, V>
  extends h<K, V>
{
  private HashMap<K, h.c<K, V>> e = new HashMap();
  
  protected h.c<K, V> a(K paramK)
  {
    return (h.c)this.e.get(paramK);
  }
  
  public V b(K paramK, V paramV)
  {
    h.c localc = a(paramK);
    if (localc != null) {
      return (V)localc.b;
    }
    this.e.put(paramK, a(paramK, paramV));
    return null;
  }
  
  public Map.Entry<K, V> b(K paramK)
  {
    if (contains(paramK)) {
      return ((h.c)this.e.get(paramK)).d;
    }
    return null;
  }
  
  public boolean contains(K paramK)
  {
    return this.e.containsKey(paramK);
  }
  
  public V remove(K paramK)
  {
    Object localObject = super.remove(paramK);
    this.e.remove(paramK);
    return (V)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */