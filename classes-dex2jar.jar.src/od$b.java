import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class od$b
  implements Set<Map.Entry<K, V>>
{
  od$b(od paramod) {}
  
  public boolean a(Map.Entry<K, V> paramEntry)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
  {
    int i = this.a.c();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = (Map.Entry)localIterator.next();
      this.a.a(paramCollection.getKey(), paramCollection.getValue());
    }
    boolean bool;
    if (i != this.a.c()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void clear()
  {
    this.a.a();
  }
  
  public boolean contains(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    int i = this.a.a(((Map.Entry)paramObject).getKey());
    if (i < 0) {
      return false;
    }
    return jd.a(this.a.a(i, 1), ((Map.Entry)paramObject).getValue());
  }
  
  public boolean containsAll(Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    return od.a(this, paramObject);
  }
  
  public int hashCode()
  {
    int i = this.a.c() - 1;
    int j = 0;
    while (i >= 0)
    {
      Object localObject1 = this.a.a(i, 0);
      Object localObject2 = this.a.a(i, 1);
      int k;
      if (localObject1 == null) {
        k = 0;
      } else {
        k = localObject1.hashCode();
      }
      int m;
      if (localObject2 == null) {
        m = 0;
      } else {
        m = localObject2.hashCode();
      }
      j += (k ^ m);
      i--;
    }
    return j;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (this.a.c() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Iterator<Map.Entry<K, V>> iterator()
  {
    return new od.d(this.a);
  }
  
  public boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public int size()
  {
    return this.a.c();
  }
  
  public Object[] toArray()
  {
    throw new UnsupportedOperationException();
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/od$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */