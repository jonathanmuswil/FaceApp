import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class od$c
  implements Set<K>
{
  od$c(od paramod) {}
  
  public boolean add(K paramK)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean addAll(Collection<? extends K> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public void clear()
  {
    this.a.a();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (this.a.a(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsAll(Collection<?> paramCollection)
  {
    return od.a(this.a.b(), paramCollection);
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
      Object localObject = this.a.a(i, 0);
      int k;
      if (localObject == null) {
        k = 0;
      } else {
        k = localObject.hashCode();
      }
      j += k;
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
  
  public Iterator<K> iterator()
  {
    return new od.a(this.a, 0);
  }
  
  public boolean remove(Object paramObject)
  {
    int i = this.a.a(paramObject);
    if (i >= 0)
    {
      this.a.a(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection<?> paramCollection)
  {
    return od.b(this.a.b(), paramCollection);
  }
  
  public boolean retainAll(Collection<?> paramCollection)
  {
    return od.c(this.a.b(), paramCollection);
  }
  
  public int size()
  {
    return this.a.c();
  }
  
  public Object[] toArray()
  {
    return this.a.b(0);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return this.a.a(paramArrayOfT, 0);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/od$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */