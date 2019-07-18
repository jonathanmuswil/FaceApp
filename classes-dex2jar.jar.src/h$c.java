import java.util.Map.Entry;

class h$c<K, V>
  implements Map.Entry<K, V>
{
  final K a;
  final V b;
  c<K, V> c;
  c<K, V> d;
  
  h$c(K paramK, V paramV)
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/h$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */