import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class pz<E>
  extends AbstractCollection<E>
  implements Serializable
{
  private static final Object[] a = new Object[0];
  
  int a(Object[] paramArrayOfObject, int paramInt)
  {
    gv localgv = (gv)iterator();
    while (localgv.hasNext())
    {
      paramArrayOfObject[paramInt] = localgv.next();
      paramInt++;
    }
    return paramInt;
  }
  
  @Deprecated
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean contains(Object paramObject);
  
  public abstract gv<E> m();
  
  Object[] n()
  {
    return null;
  }
  
  int o()
  {
    throw new UnsupportedOperationException();
  }
  
  int p()
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray()
  {
    return toArray(a);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    dx.a(paramArrayOfT);
    int i = size();
    Object localObject;
    if (paramArrayOfT.length < i)
    {
      localObject = n();
      if (localObject != null) {
        return Arrays.copyOfRange((Object[])localObject, o(), p(), paramArrayOfT.getClass());
      }
      localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i);
    }
    else
    {
      localObject = paramArrayOfT;
      if (paramArrayOfT.length > i)
      {
        paramArrayOfT[i] = null;
        localObject = paramArrayOfT;
      }
    }
    a((Object[])localObject, 0);
    return (T[])localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */