import java.util.Map.Entry;

class dU$b
  implements Map.Entry<K, V>, Comparable<dU<K, V>.b>
{
  private final K a;
  private V b;
  
  dU$b(K paramK, V paramV)
  {
    this.a = paramV;
    Object localObject;
    this.b = localObject;
  }
  
  dU$b(Map.Entry<K, V> paramEntry)
  {
    this(paramEntry, (Comparable)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
  }
  
  private boolean a(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null)
    {
      if (paramObject2 == null) {
        bool = true;
      } else {
        bool = false;
      }
    }
    else {
      bool = paramObject1.equals(paramObject2);
    }
    return bool;
  }
  
  public int a(dU<K, V>.b paramdU)
  {
    return getKey().compareTo(paramdU.getKey());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    if ((!a(this.a, ((Map.Entry)paramObject).getKey())) || (!a(this.b, ((Map.Entry)paramObject).getValue()))) {
      bool = false;
    }
    return bool;
  }
  
  public K getKey()
  {
    return this.a;
  }
  
  public V getValue()
  {
    return (V)this.b;
  }
  
  public int hashCode()
  {
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = this.b;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  public V setValue(V paramV)
  {
    dU.a(this.c);
    Object localObject = this.b;
    this.b = paramV;
    return (V)localObject;
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dU$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */