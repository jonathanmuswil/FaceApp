import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class id<E>
  implements Collection<E>, Set<E>
{
  private static final int[] a = new int[0];
  private static final Object[] b = new Object[0];
  private static Object[] c;
  private static int d;
  private static Object[] e;
  private static int f;
  private int[] g;
  Object[] h;
  int i;
  private od<E, E> j;
  
  public id()
  {
    this(0);
  }
  
  public id(int paramInt)
  {
    if (paramInt == 0)
    {
      this.g = a;
      this.h = b;
    }
    else
    {
      s(paramInt);
    }
    this.i = 0;
  }
  
  public id(Collection<E> paramCollection)
  {
    this();
    if (paramCollection != null) {
      addAll(paramCollection);
    }
  }
  
  private int a(Object paramObject, int paramInt)
  {
    int k = this.i;
    if (k == 0) {
      return -1;
    }
    int m = jd.a(this.g, k, paramInt);
    if (m < 0) {
      return m;
    }
    if (paramObject.equals(this.h[m])) {
      return m;
    }
    for (int n = m + 1; (n < k) && (this.g[n] == paramInt); n++) {
      if (paramObject.equals(this.h[n])) {
        return n;
      }
    }
    m--;
    while ((m >= 0) && (this.g[m] == paramInt))
    {
      if (paramObject.equals(this.h[m])) {
        return m;
      }
      m--;
    }
    return n;
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (f < 10)
        {
          paramArrayOfObject[0] = e;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt--;
          while (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
          }
          e = paramArrayOfObject;
          f += 1;
        }
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {
      try
      {
        if (d < 10)
        {
          paramArrayOfObject[0] = c;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt--;
          while (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
          }
          c = paramArrayOfObject;
          d += 1;
        }
      }
      finally {}
    }
  }
  
  private od<E, E> m()
  {
    if (this.j == null) {
      this.j = new hd(this);
    }
    return this.j;
  }
  
  private int n()
  {
    int k = this.i;
    if (k == 0) {
      return -1;
    }
    int m = jd.a(this.g, k, 0);
    if (m < 0) {
      return m;
    }
    if (this.h[m] == null) {
      return m;
    }
    for (int n = m + 1; (n < k) && (this.g[n] == 0); n++) {
      if (this.h[n] == null) {
        return n;
      }
    }
    for (k = m - 1; (k >= 0) && (this.g[k] == 0); k--) {
      if (this.h[k] == null) {
        return k;
      }
    }
    return n;
  }
  
  private void s(int paramInt)
  {
    if (paramInt == 8) {
      try
      {
        if (e != null)
        {
          Object[] arrayOfObject1 = e;
          this.h = arrayOfObject1;
          e = (Object[])arrayOfObject1[0];
          this.g = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          f -= 1;
          return;
        }
      }
      finally {}
    }
    if (paramInt == 4) {
      try
      {
        if (c != null)
        {
          Object[] arrayOfObject2 = c;
          this.h = arrayOfObject2;
          c = (Object[])arrayOfObject2[0];
          this.g = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          d -= 1;
          return;
        }
      }
      finally {}
    }
    this.g = new int[paramInt];
    this.h = new Object[paramInt];
  }
  
  public boolean add(E paramE)
  {
    int k;
    int m;
    if (paramE == null)
    {
      k = n();
      m = 0;
    }
    else
    {
      m = paramE.hashCode();
      k = a(paramE, m);
    }
    if (k >= 0) {
      return false;
    }
    int n = k;
    int i1 = this.i;
    Object localObject;
    if (i1 >= this.g.length)
    {
      k = 4;
      if (i1 >= 8) {
        k = (i1 >> 1) + i1;
      } else if (i1 >= 4) {
        k = 8;
      }
      int[] arrayOfInt1 = this.g;
      localObject = this.h;
      s(k);
      int[] arrayOfInt2 = this.g;
      if (arrayOfInt2.length > 0)
      {
        System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
        System.arraycopy(localObject, 0, this.h, 0, localObject.length);
      }
      a(arrayOfInt1, (Object[])localObject, this.i);
    }
    i1 = this.i;
    if (n < i1)
    {
      localObject = this.g;
      k = n + 1;
      System.arraycopy(localObject, n, localObject, k, i1 - n);
      localObject = this.h;
      System.arraycopy(localObject, n, localObject, k, this.i - n);
    }
    this.g[n] = m;
    this.h[n] = paramE;
    this.i += 1;
    return true;
  }
  
  public boolean addAll(Collection<? extends E> paramCollection)
  {
    p(this.i + paramCollection.size());
    paramCollection = paramCollection.iterator();
    boolean bool = false;
    while (paramCollection.hasNext()) {
      bool |= add(paramCollection.next());
    }
    return bool;
  }
  
  public void clear()
  {
    int k = this.i;
    if (k != 0)
    {
      a(this.g, this.h, k);
      this.g = a;
      this.h = b;
      this.i = 0;
    }
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (indexOf(paramObject) >= 0) {
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
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    int k;
    if ((paramObject instanceof Set))
    {
      paramObject = (Set)paramObject;
      if (size() != ((Set)paramObject).size()) {
        return false;
      }
      k = 0;
    }
    try
    {
      while (k < this.i)
      {
        boolean bool = ((Set)paramObject).contains(r(k));
        if (!bool) {
          return false;
        }
        k++;
      }
      return true;
    }
    catch (NullPointerException|ClassCastException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.g;
    int k = this.i;
    int m = 0;
    int n = 0;
    while (m < k)
    {
      n += arrayOfInt[m];
      m++;
    }
    return n;
  }
  
  public int indexOf(Object paramObject)
  {
    int k;
    if (paramObject == null) {
      k = n();
    } else {
      k = a(paramObject, paramObject.hashCode());
    }
    return k;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (this.i <= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Iterator<E> iterator()
  {
    return m().e().iterator();
  }
  
  public void p(int paramInt)
  {
    int[] arrayOfInt = this.g;
    if (arrayOfInt.length < paramInt)
    {
      Object[] arrayOfObject = this.h;
      s(paramInt);
      paramInt = this.i;
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.g, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.h, 0, this.i);
      }
      a(arrayOfInt, arrayOfObject, this.i);
    }
  }
  
  public E q(int paramInt)
  {
    Object localObject = this.h;
    E ? = localObject[paramInt];
    int k = this.i;
    if (k <= 1)
    {
      a(this.g, (Object[])localObject, k);
      this.g = a;
      this.h = b;
      this.i = 0;
    }
    else
    {
      localObject = this.g;
      int m = localObject.length;
      int n = 8;
      if ((m > 8) && (k < localObject.length / 3))
      {
        if (k > 8) {
          n = k + (k >> 1);
        }
        int[] arrayOfInt = this.g;
        localObject = this.h;
        s(n);
        this.i -= 1;
        if (paramInt > 0)
        {
          System.arraycopy(arrayOfInt, 0, this.g, 0, paramInt);
          System.arraycopy(localObject, 0, this.h, 0, paramInt);
        }
        k = this.i;
        if (paramInt < k)
        {
          n = paramInt + 1;
          System.arraycopy(arrayOfInt, n, this.g, paramInt, k - paramInt);
          System.arraycopy(localObject, n, this.h, paramInt, this.i - paramInt);
        }
      }
      else
      {
        this.i -= 1;
        k = this.i;
        if (paramInt < k)
        {
          localObject = this.g;
          n = paramInt + 1;
          System.arraycopy(localObject, n, localObject, paramInt, k - paramInt);
          localObject = this.h;
          System.arraycopy(localObject, n, localObject, paramInt, this.i - paramInt);
        }
        this.h[this.i] = null;
      }
    }
    return ?;
  }
  
  public E r(int paramInt)
  {
    return (E)this.h[paramInt];
  }
  
  public boolean remove(Object paramObject)
  {
    int k = indexOf(paramObject);
    if (k >= 0)
    {
      q(k);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    boolean bool = false;
    while (paramCollection.hasNext()) {
      bool |= remove(paramCollection.next());
    }
    return bool;
  }
  
  public boolean retainAll(Collection<?> paramCollection)
  {
    int k = this.i - 1;
    boolean bool = false;
    while (k >= 0)
    {
      if (!paramCollection.contains(this.h[k]))
      {
        q(k);
        bool = true;
      }
      k--;
    }
    return bool;
  }
  
  public int size()
  {
    return this.i;
  }
  
  public Object[] toArray()
  {
    int k = this.i;
    Object[] arrayOfObject = new Object[k];
    System.arraycopy(this.h, 0, arrayOfObject, 0, k);
    return arrayOfObject;
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    Object localObject = paramArrayOfT;
    if (paramArrayOfT.length < this.i) {
      localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.i);
    }
    System.arraycopy(this.h, 0, localObject, 0, this.i);
    int k = localObject.length;
    int m = this.i;
    if (k > m) {
      localObject[m] = null;
    }
    return (T[])localObject;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(this.i * 14);
    localStringBuilder.append('{');
    for (int k = 0; k < this.i; k++)
    {
      if (k > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = r(k);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Set)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/id.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */