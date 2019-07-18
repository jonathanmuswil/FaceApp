import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class od<K, V>
{
  od<K, V>.b a;
  od<K, V>.c b;
  od<K, V>.e c;
  
  public static <K, V> boolean a(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!paramMap.containsKey(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public static <T> boolean a(Set<T> paramSet, Object paramObject)
  {
    boolean bool1 = true;
    if (paramSet == paramObject) {
      return true;
    }
    if ((paramObject instanceof Set)) {
      paramObject = (Set)paramObject;
    }
    try
    {
      if (paramSet.size() == ((Set)paramObject).size())
      {
        boolean bool2 = paramSet.containsAll((Collection)paramObject);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
      return bool1;
    }
    catch (NullPointerException|ClassCastException paramSet)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static <K, V> boolean b(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    int i = paramMap.size();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      paramMap.remove(paramCollection.next());
    }
    boolean bool;
    if (i != paramMap.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static <K, V> boolean c(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext()) {
      if (!paramCollection.contains(localIterator.next())) {
        localIterator.remove();
      }
    }
    boolean bool;
    if (i != paramMap.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected abstract int a(Object paramObject);
  
  protected abstract Object a(int paramInt1, int paramInt2);
  
  protected abstract V a(int paramInt, V paramV);
  
  protected abstract void a();
  
  protected abstract void a(int paramInt);
  
  protected abstract void a(K paramK, V paramV);
  
  public <T> T[] a(T[] paramArrayOfT, int paramInt)
  {
    int i = c();
    Object localObject = paramArrayOfT;
    if (paramArrayOfT.length < i) {
      localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i);
    }
    for (int j = 0; j < i; j++) {
      localObject[j] = a(j, paramInt);
    }
    if (localObject.length > i) {
      localObject[i] = null;
    }
    return (T[])localObject;
  }
  
  protected abstract int b(Object paramObject);
  
  protected abstract Map<K, V> b();
  
  public Object[] b(int paramInt)
  {
    int i = c();
    Object[] arrayOfObject = new Object[i];
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = a(j, paramInt);
    }
    return arrayOfObject;
  }
  
  protected abstract int c();
  
  public Set<Map.Entry<K, V>> d()
  {
    if (this.a == null) {
      this.a = new od.b();
    }
    return this.a;
  }
  
  public Set<K> e()
  {
    if (this.b == null) {
      this.b = new od.c();
    }
    return this.b;
  }
  
  public Collection<V> f()
  {
    if (this.c == null) {
      this.c = new od.e();
    }
    return this.c;
  }
  
  final class a<T>
    implements Iterator<T>
  {
    final int a;
    int b;
    int c;
    boolean d = false;
    
    a(int paramInt)
    {
      this.a = paramInt;
      this.b = od.this.c();
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (this.c < this.b) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public T next()
    {
      if (hasNext())
      {
        Object localObject = od.this.a(this.c, this.a);
        this.c += 1;
        this.d = true;
        return (T)localObject;
      }
      throw new NoSuchElementException();
    }
    
    public void remove()
    {
      if (this.d)
      {
        this.c -= 1;
        this.b -= 1;
        this.d = false;
        od.this.a(this.c);
        return;
      }
      throw new IllegalStateException();
    }
  }
  
  final class b
    implements Set<Map.Entry<K, V>>
  {
    b() {}
    
    public boolean a(Map.Entry<K, V> paramEntry)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
    {
      int i = od.this.c();
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        paramCollection = (Map.Entry)localIterator.next();
        od.this.a(paramCollection.getKey(), paramCollection.getValue());
      }
      boolean bool;
      if (i != od.this.c()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void clear()
    {
      od.this.a();
    }
    
    public boolean contains(Object paramObject)
    {
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      paramObject = (Map.Entry)paramObject;
      int i = od.this.a(((Map.Entry)paramObject).getKey());
      if (i < 0) {
        return false;
      }
      return jd.a(od.this.a(i, 1), ((Map.Entry)paramObject).getValue());
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
      int i = od.this.c() - 1;
      int j = 0;
      while (i >= 0)
      {
        Object localObject1 = od.this.a(i, 0);
        Object localObject2 = od.this.a(i, 1);
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
      if (od.this.c() == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Iterator<Map.Entry<K, V>> iterator()
    {
      return new od.d(od.this);
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
      return od.this.c();
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
  
  final class c
    implements Set<K>
  {
    c() {}
    
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
      od.this.a();
    }
    
    public boolean contains(Object paramObject)
    {
      boolean bool;
      if (od.this.a(paramObject) >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean containsAll(Collection<?> paramCollection)
    {
      return od.a(od.this.b(), paramCollection);
    }
    
    public boolean equals(Object paramObject)
    {
      return od.a(this, paramObject);
    }
    
    public int hashCode()
    {
      int i = od.this.c() - 1;
      int j = 0;
      while (i >= 0)
      {
        Object localObject = od.this.a(i, 0);
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
      if (od.this.c() == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Iterator<K> iterator()
    {
      return new od.a(od.this, 0);
    }
    
    public boolean remove(Object paramObject)
    {
      int i = od.this.a(paramObject);
      if (i >= 0)
      {
        od.this.a(i);
        return true;
      }
      return false;
    }
    
    public boolean removeAll(Collection<?> paramCollection)
    {
      return od.b(od.this.b(), paramCollection);
    }
    
    public boolean retainAll(Collection<?> paramCollection)
    {
      return od.c(od.this.b(), paramCollection);
    }
    
    public int size()
    {
      return od.this.c();
    }
    
    public Object[] toArray()
    {
      return od.this.b(0);
    }
    
    public <T> T[] toArray(T[] paramArrayOfT)
    {
      return od.this.a(paramArrayOfT, 0);
    }
  }
  
  final class d
    implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
  {
    int a = od.this.c() - 1;
    int b = -1;
    boolean c = false;
    
    d() {}
    
    public boolean equals(Object paramObject)
    {
      if (this.c)
      {
        boolean bool1 = paramObject instanceof Map.Entry;
        boolean bool2 = false;
        if (!bool1) {
          return false;
        }
        paramObject = (Map.Entry)paramObject;
        bool1 = bool2;
        if (jd.a(((Map.Entry)paramObject).getKey(), od.this.a(this.b, 0)))
        {
          bool1 = bool2;
          if (jd.a(((Map.Entry)paramObject).getValue(), od.this.a(this.b, 1))) {
            bool1 = true;
          }
        }
        return bool1;
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public K getKey()
    {
      if (this.c) {
        return (K)od.this.a(this.b, 0);
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public V getValue()
    {
      if (this.c) {
        return (V)od.this.a(this.b, 1);
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (this.b < this.a) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      if (this.c)
      {
        Object localObject1 = od.this;
        int i = this.b;
        int j = 0;
        Object localObject2 = ((od)localObject1).a(i, 0);
        localObject1 = od.this.a(this.b, 1);
        if (localObject2 == null) {
          i = 0;
        } else {
          i = localObject2.hashCode();
        }
        if (localObject1 != null) {
          j = localObject1.hashCode();
        }
        return i ^ j;
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public Map.Entry<K, V> next()
    {
      if (hasNext())
      {
        this.b += 1;
        this.c = true;
        return this;
      }
      throw new NoSuchElementException();
    }
    
    public void remove()
    {
      if (this.c)
      {
        od.this.a(this.b);
        this.b -= 1;
        this.a -= 1;
        this.c = false;
        return;
      }
      throw new IllegalStateException();
    }
    
    public V setValue(V paramV)
    {
      if (this.c) {
        return (V)od.this.a(this.b, paramV);
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(getKey());
      localStringBuilder.append("=");
      localStringBuilder.append(getValue());
      return localStringBuilder.toString();
    }
  }
  
  final class e
    implements Collection<V>
  {
    e() {}
    
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
      od.this.a();
    }
    
    public boolean contains(Object paramObject)
    {
      boolean bool;
      if (od.this.b(paramObject) >= 0) {
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
      if (od.this.c() == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Iterator<V> iterator()
    {
      return new od.a(od.this, 1);
    }
    
    public boolean remove(Object paramObject)
    {
      int i = od.this.b(paramObject);
      if (i >= 0)
      {
        od.this.a(i);
        return true;
      }
      return false;
    }
    
    public boolean removeAll(Collection<?> paramCollection)
    {
      int i = od.this.c();
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        int k = i;
        int m = j;
        if (paramCollection.contains(od.this.a(j, 1)))
        {
          od.this.a(j);
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
      int i = od.this.c();
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        int k = i;
        int m = j;
        if (!paramCollection.contains(od.this.a(j, 1)))
        {
          od.this.a(j);
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
      return od.this.c();
    }
    
    public Object[] toArray()
    {
      return od.this.b(1);
    }
    
    public <T> T[] toArray(T[] paramArrayOfT)
    {
      return od.this.a(paramArrayOfT, 1);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/od.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */