import java.util.Collection;
import java.util.Iterator;

final class od$e
  implements Collection<V>
{
  od$e(od paramod) {}
  
  public boolean add(V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean addAll(Collection<? extends V> paramCollection)
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
    if (this.a.b(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
  
  public Iterator<V> iterator()
  {
    return new od.a(this.a, 1);
  }
  
  public boolean remove(Object paramObject)
  {
    int i = this.a.b(paramObject);
    if (i >= 0)
    {
      this.a.a(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection<?> paramCollection)
  {
    int i = this.a.c();
    int j = 0;
    boolean bool = false;
    while (j < i)
    {
      int k = i;
      int m = j;
      if (paramCollection.contains(this.a.a(j, 1)))
      {
        this.a.a(j);
        m = j - 1;
        k = i - 1;
        bool = true;
      }
      j = m + 1;
      i = k;
    }
    return bool;
  }
  
  public boolean retainAll(Collection<?> paramCollection)
  {
    int i = this.a.c();
    int j = 0;
    boolean bool = false;
    while (j < i)
    {
      int k = i;
      int m = j;
      if (!paramCollection.contains(this.a.a(j, 1)))
      {
        this.a.a(j);
        m = j - 1;
        k = i - 1;
        bool = true;
      }
      j = m + 1;
      i = k;
    }
    return bool;
  }
  
  public int size()
  {
    return this.a.c();
  }
  
  public Object[] toArray()
  {
    return this.a.b(1);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return this.a.a(paramArrayOfT, 1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/od$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */