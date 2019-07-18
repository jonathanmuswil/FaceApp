import java.util.Map.Entry;

final class IR$d<K, V>
  implements Map.Entry<K, V>
{
  d<K, V> a;
  d<K, V> b;
  d<K, V> c;
  d<K, V> d;
  d<K, V> e;
  final K f;
  V g;
  int h;
  
  IR$d()
  {
    this.f = null;
    this.e = this;
    this.d = this;
  }
  
  IR$d(d<K, V> paramd1, K paramK, d<K, V> paramd2, d<K, V> paramd3)
  {
    this.a = paramd1;
    this.f = paramK;
    this.h = 1;
    this.d = paramd2;
    this.e = paramd3;
    paramd3.d = this;
    paramd2.e = this;
  }
  
  public d<K, V> a()
  {
    Object localObject1 = this.b;
    Object localObject2 = this;
    while (localObject1 != null)
    {
      d locald = ((d)localObject1).b;
      localObject2 = localObject1;
      localObject1 = locald;
    }
    return (d<K, V>)localObject2;
  }
  
  public d<K, V> b()
  {
    Object localObject1 = this.c;
    Object localObject2 = this;
    while (localObject1 != null)
    {
      d locald = ((d)localObject1).c;
      localObject2 = localObject1;
      localObject1 = locald;
    }
    return (d<K, V>)localObject2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (Map.Entry)paramObject;
      Object localObject = this.f;
      if (localObject == null)
      {
        bool3 = bool2;
        if (((Map.Entry)paramObject).getKey() != null) {
          break label108;
        }
      }
      else
      {
        bool3 = bool2;
        if (!localObject.equals(((Map.Entry)paramObject).getKey())) {
          break label108;
        }
      }
      localObject = this.g;
      if (localObject == null)
      {
        bool3 = bool2;
        if (((Map.Entry)paramObject).getValue() != null) {
          break label108;
        }
      }
      else
      {
        bool3 = bool2;
        if (!localObject.equals(((Map.Entry)paramObject).getValue())) {
          break label108;
        }
      }
      bool3 = true;
    }
    label108:
    return bool3;
  }
  
  public K getKey()
  {
    return (K)this.f;
  }
  
  public V getValue()
  {
    return (V)this.g;
  }
  
  public int hashCode()
  {
    Object localObject = this.f;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = this.g;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  public V setValue(V paramV)
  {
    Object localObject = this.g;
    this.g = paramV;
    return (V)localObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.f);
    localStringBuilder.append("=");
    localStringBuilder.append(this.g);
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/IR$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */