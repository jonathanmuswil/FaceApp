import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class h<K, V>
  implements Iterable<Map.Entry<K, V>>
{
  private h.c<K, V> a;
  private h.c<K, V> b;
  private WeakHashMap<h.f<K, V>, Boolean> c = new WeakHashMap();
  private int d = 0;
  
  protected h.c<K, V> a(K paramK)
  {
    for (h.c localc = this.a; (localc != null) && (!localc.a.equals(paramK)); localc = localc.c) {}
    return localc;
  }
  
  protected h.c<K, V> a(K paramK, V paramV)
  {
    paramK = new h.c(paramK, paramV);
    this.d += 1;
    paramV = this.b;
    if (paramV == null)
    {
      this.a = paramK;
      this.b = this.a;
      return paramK;
    }
    paramV.c = paramK;
    paramK.d = paramV;
    this.b = paramK;
    return paramK;
  }
  
  public V b(K paramK, V paramV)
  {
    h.c localc = a(paramK);
    if (localc != null) {
      return (V)localc.b;
    }
    a(paramK, paramV);
    return null;
  }
  
  public Iterator<Map.Entry<K, V>> descendingIterator()
  {
    h.b localb = new h.b(this.b, this.a);
    this.c.put(localb, Boolean.valueOf(false));
    return localb;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    Object localObject = (h)paramObject;
    if (size() != ((h)localObject).size()) {
      return false;
    }
    paramObject = iterator();
    Iterator localIterator = ((h)localObject).iterator();
    while ((((Iterator)paramObject).hasNext()) && (localIterator.hasNext()))
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)paramObject).next();
      localObject = localIterator.next();
      if (((localEntry == null) && (localObject != null)) || ((localEntry != null) && (!localEntry.equals(localObject)))) {
        return false;
      }
    }
    if ((((Iterator)paramObject).hasNext()) || (localIterator.hasNext())) {
      bool = false;
    }
    return bool;
  }
  
  public Iterator<Map.Entry<K, V>> iterator()
  {
    h.a locala = new h.a(this.a, this.b);
    this.c.put(locala, Boolean.valueOf(false));
    return locala;
  }
  
  public Map.Entry<K, V> m()
  {
    return this.a;
  }
  
  public h<K, V>.d n()
  {
    h.d locald = new h.d(null);
    this.c.put(locald, Boolean.valueOf(false));
    return locald;
  }
  
  public Map.Entry<K, V> o()
  {
    return this.b;
  }
  
  public V remove(K paramK)
  {
    paramK = a(paramK);
    if (paramK == null) {
      return null;
    }
    this.d -= 1;
    if (!this.c.isEmpty())
    {
      localObject = this.c.keySet().iterator();
      while (((Iterator)localObject).hasNext()) {
        ((h.f)((Iterator)localObject).next()).a(paramK);
      }
    }
    Object localObject = paramK.d;
    if (localObject != null) {
      ((h.c)localObject).c = paramK.c;
    } else {
      this.a = paramK.c;
    }
    localObject = paramK.c;
    if (localObject != null) {
      ((h.c)localObject).d = paramK.d;
    } else {
      this.b = paramK.d;
    }
    paramK.c = null;
    paramK.d = null;
    return (V)paramK.b;
  }
  
  public int size()
  {
    return this.d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append(((Map.Entry)localIterator.next()).toString());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  static class a<K, V>
    extends h.e<K, V>
  {
    a(h.c<K, V> paramc1, h.c<K, V> paramc2)
    {
      super(paramc2);
    }
    
    h.c<K, V> b(h.c<K, V> paramc)
    {
      return paramc.d;
    }
    
    h.c<K, V> c(h.c<K, V> paramc)
    {
      return paramc.c;
    }
  }
  
  private static class b<K, V>
    extends h.e<K, V>
  {
    b(h.c<K, V> paramc1, h.c<K, V> paramc2)
    {
      super(paramc2);
    }
    
    h.c<K, V> b(h.c<K, V> paramc)
    {
      return paramc.c;
    }
    
    h.c<K, V> c(h.c<K, V> paramc)
    {
      return paramc.d;
    }
  }
  
  static class c<K, V>
    implements Map.Entry<K, V>
  {
    final K a;
    final V b;
    c<K, V> c;
    c<K, V> d;
    
    c(K paramK, V paramV)
    {
      this.a = paramK;
      this.b = paramV;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof c)) {
        return false;
      }
      paramObject = (c)paramObject;
      if ((!this.a.equals(((c)paramObject).a)) || (!this.b.equals(((c)paramObject).b))) {
        bool = false;
      }
      return bool;
    }
    
    public K getKey()
    {
      return (K)this.a;
    }
    
    public V getValue()
    {
      return (V)this.b;
    }
    
    public V setValue(V paramV)
    {
      throw new UnsupportedOperationException("An entry modification is not supported");
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.a);
      localStringBuilder.append("=");
      localStringBuilder.append(this.b);
      return localStringBuilder.toString();
    }
  }
  
  private class d
    implements Iterator<Map.Entry<K, V>>, h.f<K, V>
  {
    private h.c<K, V> a;
    private boolean b = true;
    
    private d() {}
    
    public void a(h.c<K, V> paramc)
    {
      h.c localc = this.a;
      if (paramc == localc)
      {
        this.a = localc.d;
        boolean bool;
        if (this.a == null) {
          bool = true;
        } else {
          bool = false;
        }
        this.b = bool;
      }
    }
    
    public boolean hasNext()
    {
      boolean bool1 = this.b;
      boolean bool2 = true;
      boolean bool3 = true;
      if (bool1)
      {
        if (h.a(h.this) == null) {
          bool3 = false;
        }
        return bool3;
      }
      h.c localc = this.a;
      if ((localc != null) && (localc.c != null)) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    
    public Map.Entry<K, V> next()
    {
      if (this.b)
      {
        this.b = false;
        this.a = h.a(h.this);
      }
      else
      {
        h.c localc = this.a;
        if (localc != null) {
          localc = localc.c;
        } else {
          localc = null;
        }
        this.a = localc;
      }
      return this.a;
    }
  }
  
  private static abstract class e<K, V>
    implements Iterator<Map.Entry<K, V>>, h.f<K, V>
  {
    h.c<K, V> a;
    h.c<K, V> b;
    
    e(h.c<K, V> paramc1, h.c<K, V> paramc2)
    {
      this.a = paramc2;
      this.b = paramc1;
    }
    
    private h.c<K, V> a()
    {
      h.c localc1 = this.b;
      h.c localc2 = this.a;
      if ((localc1 != localc2) && (localc2 != null)) {
        return c(localc1);
      }
      return null;
    }
    
    public void a(h.c<K, V> paramc)
    {
      if ((this.a == paramc) && (paramc == this.b))
      {
        this.b = null;
        this.a = null;
      }
      h.c localc = this.a;
      if (localc == paramc) {
        this.a = b(localc);
      }
      if (this.b == paramc) {
        this.b = a();
      }
    }
    
    abstract h.c<K, V> b(h.c<K, V> paramc);
    
    abstract h.c<K, V> c(h.c<K, V> paramc);
    
    public boolean hasNext()
    {
      boolean bool;
      if (this.b != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Map.Entry<K, V> next()
    {
      h.c localc = this.b;
      this.b = a();
      return localc;
    }
  }
  
  static abstract interface f<K, V>
  {
    public abstract void a(h.c<K, V> paramc);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */