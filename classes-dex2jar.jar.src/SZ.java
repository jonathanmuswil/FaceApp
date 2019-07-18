import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class sz<E>
  extends pz<E>
  implements List<E>, RandomAccess
{
  private static final hv<Object> b = new uz(zz.c, 0);
  
  static <E> sz<E> a(Object[] paramArrayOfObject)
  {
    return b(paramArrayOfObject, paramArrayOfObject.length);
  }
  
  static <E> sz<E> b(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return zz.c;
    }
    return new zz(paramArrayOfObject, paramInt);
  }
  
  public static <E> tz<E> q()
  {
    return new tz();
  }
  
  int a(Object[] paramArrayOfObject, int paramInt)
  {
    int i = size();
    for (int j = 0; j < i; j++) {
      paramArrayOfObject[(paramInt + j)] = get(j);
    }
    return paramInt + i;
  }
  
  public sz<E> a(int paramInt1, int paramInt2)
  {
    dx.a(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    if (paramInt2 == size()) {
      return this;
    }
    if (paramInt2 == 0) {
      return zz.c;
    }
    return new vz(this, paramInt1, paramInt2);
  }
  
  @Deprecated
  public final void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean contains(Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }
  
  public boolean equals(Object paramObject)
  {
    dx.a(this);
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof List))
    {
      paramObject = (List)paramObject;
      int i = size();
      if (i == ((List)paramObject).size())
      {
        if ((paramObject instanceof RandomAccess))
        {
          for (j = 0; j < i; j++) {
            if (!Dw.a(get(j), ((List)paramObject).get(j))) {
              break label151;
            }
          }
          return true;
        }
        i = size();
        paramObject = ((List)paramObject).iterator();
        int j = 0;
        while (j < i)
        {
          if (!((Iterator)paramObject).hasNext()) {
            break label151;
          }
          Object localObject = get(j);
          j++;
          if (!Dw.a(localObject, ((Iterator)paramObject).next())) {
            break label151;
          }
        }
        if (!((Iterator)paramObject).hasNext()) {
          return true;
        }
      }
    }
    label151:
    return false;
  }
  
  public int hashCode()
  {
    int i = size();
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = j * 31 + get(k).hashCode();
    }
    return j;
  }
  
  public int indexOf(Object paramObject)
  {
    if (paramObject == null) {
      return -1;
    }
    int i = size();
    int j = 0;
    int k = 0;
    if (paramObject == null) {
      for (j = k; j < i; j++) {
        if (get(j) == null) {
          return j;
        }
      }
    }
    while (j < i)
    {
      if (paramObject.equals(get(j))) {
        return j;
      }
      j++;
    }
    return -1;
  }
  
  public int lastIndexOf(Object paramObject)
  {
    if (paramObject == null) {
      return -1;
    }
    if (paramObject == null) {
      for (i = size() - 1; i >= 0; i--) {
        if (get(i) == null) {
          return i;
        }
      }
    }
    for (int i = size() - 1; i >= 0; i--) {
      if (paramObject.equals(get(i))) {
        return i;
      }
    }
    return -1;
  }
  
  public final gv<E> m()
  {
    return (hv)listIterator();
  }
  
  @Deprecated
  public final E remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */